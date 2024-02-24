package nit._SpringJDBC.test;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.stereotype.Component;
@Component
public class ClassAAA {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext ctx=new AnnotationConfigApplicationContext();
		ctx.scan("nit.*");
		ctx.refresh();
		Operation bean = ctx.getBean(Operation.class);
		bean.insertOps();
		//bean.createTable();
		((AbstractApplicationContext) ctx).close();

	}

}
