package com.msgassama.courseadmin.dao;

import com.msgassama.courseadmin.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author MS GASSAMA
 */
public interface UserDao extends JpaRepository<User, Long> {

    User findUserByEmail(String email);
}
