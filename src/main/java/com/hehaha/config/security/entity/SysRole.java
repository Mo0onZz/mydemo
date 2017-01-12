package com.hehaha.config.security.entity;


import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
/**
 * SysRole
 *角色表
 * @author wu
 * @create 2017-01-12 11:37
 */
@Entity
@Table(name="s_role")
public class SysRole {
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    @Column (name="id",length=10)
    private int id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "uid", nullable = false)
    private SysUser SUser;//角色对应的用户实体

    @Column(name="name",length=100)
    private String name;//角色名称

    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public SysUser getSUser() {
        return SUser;
    }
    public void setSUser(SysUser sUser) {
        SUser = sUser;
    }


}