package com.msgassama.courseadmin.dao;

import com.msgassama.courseadmin.entity.Role;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author MS GASSAMA
 */
public interface RoleDao extends JpaRepository<Role, Long> {

    Role findByName(String name);
}
