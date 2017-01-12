package com.hehaha.config.security.dao;

import com.hehaha.config.security.entity.SysUser;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

/**
 * SysUser
 *
 * @author wu
 * @create 2017-01-12 14:02
 */
@Repository
public interface SysUserDao extends PagingAndSortingRepository<SysUser, String> {

    SysUser findByName (String name);
}
