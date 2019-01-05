package com.java.code.study.spring06;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository("userDao")
public class UserDaoImpl implements UserDao {

    @Autowired
    private JdbcTemplate jdbcTemplate;
    @Override
    @Transactional
    public int addUser(User user) {
        String sql = "INSERT INTO `user`(NAME,age) VALUES(?,?)";
        return jdbcTemplate.update(sql,user.getName(),user.getAge());
    }
}
