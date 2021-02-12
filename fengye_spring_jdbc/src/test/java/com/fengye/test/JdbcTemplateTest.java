package com.fengye.test;

import com.mchange.v2.c3p0.ComboPooledDataSource;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;
import java.beans.PropertyVetoException;

public class JdbcTemplateTest {
    //测试Spring产生jdbcTemplate对象
    @Test
    public void createTemplateTest(){
        ClassPathXmlApplicationContext app = new ClassPathXmlApplicationContext("applicationContext.xml");
        JdbcTemplate template = app.getBean(JdbcTemplate.class);
        System.out.println(template);
    }

    //基础测试：测试连接数据库源操作
    @Test
   public void dataSourceConnTest() throws PropertyVetoException {
        //1.创建数据源对象
        ComboPooledDataSource dataSource = new ComboPooledDataSource();
        dataSource.setDriverClass("com.mysql.jdbc.Driver");
        dataSource.setJdbcUrl("jdbc:mysql://localhost:3306/springjdbc_0210");
        dataSource.setUser("root");
        dataSource.setPassword("admin");
        //2.创建JdbcTemplate对象
        JdbcTemplate template = new JdbcTemplate();
        //3.设置数据源给JdbcTemplate
        template.setDataSource(dataSource);
        //4.执行数据库操作
        template.update("insert into account(name, money) values ('lihua', 7320.5)");
    }
}
