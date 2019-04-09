package wrx.xing;

import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import wrx.xing.config.Config;
import wrx.xing.domain.Person;

/**
 * 请填写类的描述
 *
 * @author wangruxing
 * @date 2018-09-02 14:35
 */
public class BeanTest {

    @Test
    public void testOldBean(){
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("bean.xml");
        Person person = (Person) context.getBean("person");
        System.out.println(person);
    }

    @Test
    public void testAnnotationBean(){
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(Config.class);
        Person person = context.getBean(Person.class);
        System.out.println(person);
    }

    @Test
    public void printAllBean(){
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(Config.class);
        String[] beanDefinitionNames = context.getBeanDefinitionNames();
        for (String name : beanDefinitionNames) {
            System.out.println(name);
        }
    }
}
