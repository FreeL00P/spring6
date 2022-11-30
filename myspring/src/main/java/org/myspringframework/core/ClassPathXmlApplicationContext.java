package org.myspringframework.core;

import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.Element;
import org.dom4j.Node;
import org.dom4j.io.SAXReader;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.InputStream;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * ClassPathXmlApplicationContext
 *
 * @author fj
 * @date 2022/11/29 17:28
 */
public class ClassPathXmlApplicationContext implements ApplicationContext{

    private static final Logger log = LoggerFactory.getLogger(ClassPathXmlApplicationContext.class);

    private Map<String,Object> singletonObject=new HashMap<String,Object>();

    /**
     * 解析configLocation配置文件 然后初始化所有的Bean对象
     * @param configLocation
     */
    public ClassPathXmlApplicationContext(String configLocation) {
        try {
            //解析配置文件，然后实例化bean，将Bean放入singletonObject
            //使用dom4j解析XML对象
            SAXReader reader=new SAXReader();
            //获取一个输出流
            InputStream in = ClassLoader.getSystemClassLoader().getResourceAsStream(configLocation);
            Document document = reader.read(in);
            //获取所有bean标签
            List<Node> nodes = document.selectNodes("//bean");
            //遍历nodes
            for (Node node : nodes) {

                try {
                    //向下转型的目的是为了使用Element接口更丰富的方法
                    Element beanElt =(Element) node;
                    //获取id
                    String id = beanElt.attributeValue("id");
                    String className = beanElt.attributeValue("class");
                    log.info("BeanName="+id);
                    log.info("ClassName="+className);
                    //通过反射机制创建对象，将其放到Map集合中，提前曝光
                    Class<?> aClass=Class.forName(className);
                    //调用无参构造方法
                    Constructor<?> defaultCon = aClass.getDeclaredConstructor();
                    Object bean = defaultCon.newInstance();
                    //将bean曝光，加入Map集合
                    singletonObject.put(id,bean);
                    log.info(singletonObject.toString());
                } catch (Exception e) {
                    throw new RuntimeException(e);
                }
            }
            //再次遍历nodes，给对象属性赋值
            for (Node node : nodes) {

                try {
                    //向下转型的目的是为了使用Element接口更丰富的方法
                    Element beanElt =(Element) node;
                    //获取id
                    String id = beanElt.attributeValue("id");
                    String className = beanElt.attributeValue("class");
                    //通过反射机制创建对象，将其放到Map集合中，提前曝光
                    Class<?> aClass=Class.forName(className);
                    List<Element> propertys = beanElt.elements("property");
                    propertys.forEach(property ->{
                        try{
                            //获取属性名字
                            String name = property.attributeValue("name");
                            //获取属性类型
                            Field field = aClass.getDeclaredField(name);
                             //获取set方法
                            String setMethodName="set" + name.toUpperCase().charAt(0)+name.substring(1);
                            //获取class
                            Method setMethod = aClass.getDeclaredMethod(setMethodName, field.getType());
                            //获取属性值
                            String value = property.attributeValue("value");
                            Object actualValue = null;
                            //获取属性值
                            String ref = property.attributeValue("ref");
                            if (value != null) {
                                //简单类型
                                //value可能是不同类型
                                //获取属性类型
                                String propertyTypeSimpleName = field.getType().getSimpleName();
                                switch (propertyTypeSimpleName) {
                                    case "byte" -> actualValue = Byte.parseByte(value);
                                    case "short" -> actualValue = Short.parseShort(value);
                                    case "int" -> actualValue = Integer.parseInt(value);
                                    case "long" -> actualValue = Long.parseLong(value);
                                    case "float" -> actualValue = Float.parseFloat(value);
                                    case "double" -> actualValue = Double.parseDouble(value);
                                    case "boolean" -> actualValue = Boolean.parseBoolean(value);
                                    case "char" -> actualValue = value.charAt(0);
                                    case "Byte" -> actualValue = Byte.valueOf(value);
                                    case "Short" -> actualValue = Short.valueOf(value);
                                    case "Integer" -> actualValue = Integer.valueOf(value);
                                    case "Long" -> actualValue = Long.valueOf(value);
                                    case "Float" -> actualValue = Float.valueOf(value);
                                    case "Double" -> actualValue = Double.valueOf(value);
                                    case "Boolean" -> actualValue = Boolean.valueOf(value);
                                    case "Character" -> actualValue = value.charAt(0);
                                    case "String" -> actualValue = value;
                                }
                                setMethod.invoke(singletonObject.get(id),actualValue);
                            }
                            if (ref != null) {
                                //非简单类型
                                setMethod.invoke(singletonObject.get(id),singletonObject.get(ref));
                            }

                        }catch(Exception e){
                            e.printStackTrace();
                        }

                    });

                } catch (Exception e) {
                    throw new RuntimeException(e);
                }
            }
        } catch (DocumentException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public Object getBean(String name) {
        //从singletonObject中获取bean
        return singletonObject.get(name);
    }
}
