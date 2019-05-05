package wrx.xing;

import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import wrx.xing.aop.MathCalculator;
import wrx.xing.config.MainConfigOfAOP;


public class IOCTest_AOP {
	
	@Test
	public void test01(){
		AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(MainConfigOfAOP.class);
		
		//1、不要自己创建对象
//		MathCalculator mathCalculator = new MathCalculator();
//		mathCalculator.div(1, 1);
		MathCalculator mathCalculator = applicationContext.getBean(MathCalculator.class);
		
		mathCalculator.div(1, 1);
		
		applicationContext.close();
	}

}
