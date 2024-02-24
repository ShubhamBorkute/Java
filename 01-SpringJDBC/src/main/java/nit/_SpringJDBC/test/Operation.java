package nit._SpringJDBC.test;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

@Component
public class Operation {
@Autowired
private JdbcTemplate tem;

public void createTable() {
	String create="create table tf1(sno int,sname varchar2(9))";
	tem.execute(create);
	System.out.println("table created");
}
public void insertOps() {
	String s="insert into tf1 values(2,'raghuuu')";
	//String s="update t5 set sname='miller' where sno=1";
	//String s="delete from t where sno=2";
	tem.update(s);
	System.out.println("done");
}
}
