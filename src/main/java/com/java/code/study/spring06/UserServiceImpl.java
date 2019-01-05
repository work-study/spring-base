package com.java.code.study.spring06;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service("userService")
public class UserServiceImpl implements UserService{
    @Autowired
    private UserDao userDao;
    @Transactional(propagation= Propagation.REQUIRES_NEW,
                    isolation = Isolation.READ_COMMITTED,
                    rollbackFor ={Exception.class},noRollbackFor = {RuntimeException.class},
                    readOnly = false,
                    timeout = 3)
    @Override
    public int bathAddUser(List<User> users) {
        for (User user : users) {
            userDao.addUser(user);
        }
        //int i=1/0;
        return 1;
    }
}
