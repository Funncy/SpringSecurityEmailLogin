package com.lnf.demo.Service;

import com.lnf.demo.Data.User;
import com.lnf.demo.Data.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

public interface UserService  {
    public User findUserByEmail(String email);
    public void saveUser(User user);
}
