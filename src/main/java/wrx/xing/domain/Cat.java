package wrx.xing.domain;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Component;

/**
 * 请填写类的描述
 *
 * @author wangruxing
 * @date 2019-03-05 09:31
 */
@Component
public class Cat implements ApplicationContextAware , InitializingBean{

	public Cat() {
		System.out.println("cat construct ....");
	}

	public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
		Person bean = applicationContext.getBean(Person.class);
		System.out.println("cat setApplicationContext person bean ...");
		System.out.println("cat setApplicationContext ...");
	}

	public void afterPropertiesSet() throws Exception {
		System.out.println("cat init method ...");
	}
}
