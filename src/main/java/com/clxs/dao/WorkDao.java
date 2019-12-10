package com.clxs.dao;

import com.clxs.pojo.WorkPojo;

import java.util.List;

//内容的持久层的接口
public interface WorkDao {

//    根据导航栏的内容ID查询对应内容
    public List<WorkPojo> SelectByWorkId(Integer id);

//    根据搜索栏的内容对名称和介绍进行模糊查询
    public List<WorkPojo> SelectByAll(String name);

}
