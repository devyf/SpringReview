package com.fengye.test;

import com.fengye.domain.Account;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:applicationContext.xml")
public class SpringJdbcTemplateTest {
    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Test
    public void queryCountTest(){
        Integer count = jdbcTemplate.queryForObject("select count(*) from account",
                Integer.class);
        System.out.println(count);
    }

    @Test
    public void queryOneTest(){
        Account query = jdbcTemplate.queryForObject("select * from account where name = ?",
                new BeanPropertyRowMapper<Account>(Account.class), "lihua");
        System.out.println(query);
    }

    @Test
    public void queryAllTest(){
        List<Account> accountList = jdbcTemplate.query("select * from account", new BeanPropertyRowMapper<Account>(Account.class));
        System.out.println(accountList);
    }

    @Test
    public void updateTest(){
        int update = jdbcTemplate.update("update account set money = ? where name =?", 300, "lihua");
        System.out.println(update);
    }

    @Test
    public void insertTest(){
        int insert = jdbcTemplate.update("insert into account(name, money) values ('lisi', 8700)");
        System.out.println(insert);
    }

    @Test
    public void deleteTest(){
        int delete = jdbcTemplate.update("delete from account where id = ?", 4);
        System.out.println(delete);
    }
}
