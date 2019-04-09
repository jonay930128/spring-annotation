package wrx.xing.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import wrx.xing.domain.Person;

/**
 * 请填写类的描述
 *
 * @author wangruxing
 * @date 2018-09-02 14:42
 */
@Configuration
@ComponentScan("wrx.xing.domain")
public class Config {

    @Bean
    public Person person(){
        Person person = new Person();
        person.setAge(24);
        person.setHometown("HaErBin");
        person.setName("Nina");
        return person;
    }
}
