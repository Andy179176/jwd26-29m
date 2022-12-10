import org.testng.annotations.Test;

import java.lang.annotation.Annotation;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class Main {
    public static void main(String[] args) {
        Class<Person> c1 = Person.class;
        System.out.println(c1.getName());
        Person p1= new Person("Jack",30);
        qwe(p1);

        System.out.println("------------------------------------------------");
        qwe(new Main());


    }

    public static void qwe(Object obj){
        Class<?> cl = obj.getClass();
        System.out.println("obj is=" + cl.getName());
        Constructor<?>[] constructors = cl.getConstructors();
        for(Constructor<?> c: constructors){
            System.out.println("Constructor: "+c);
        }
        Method[] methods = cl.getMethods();
        for (Method m:methods){
            System.out.println("Methods: "+m);
            Annotation[] declaredAnnotations = m.getDeclaredAnnotations();
            for (Annotation a:declaredAnnotations) {
                //System.out.println("          анотация:" + a);
                System.out.println("    @"+a.annotationType().getName());
                if(a.equals("@org.testng.annotations.Test")){
                    try {
                        m.invoke(new Main());
                    } catch (IllegalAccessException e) {
                        throw new RuntimeException(e);
                    } catch (InvocationTargetException e) {
                        throw new RuntimeException(e);
                    }
                }
            }
        }
        Field[] fields = cl.getDeclaredFields();
        for(Field f:fields){
            System.out.println("Поле: "+f);
        }
    }


    @Test
    public  void tttt(){
        System.err.println("qwertyu");
    }



}
@FunctionalInterface
interface Temp{
    void tempMethod();
}
