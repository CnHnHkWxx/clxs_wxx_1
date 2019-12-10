package com.clxs.service.impl;

import com.clxs.dao.WorkDao;
import com.clxs.pojo.WorkPojo;
import com.clxs.service.WorkService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

//内容的业务层的接口的实现
@Service
public class WorkServiceimpl implements WorkService {

//    引入内容的持久层的接口
    @Autowired
    private WorkDao workDao;

//    根据导航栏的内容ID查询对应的内容
    @Override
    public List<WorkPojo> SelectByWorkId(Integer id) {
        return workDao.SelectByWorkId(id);
    }

//    根据搜索栏的内容对名称和介绍进行模糊查询
    @Override
    public List<WorkPojo> SelectByAll(String string){
        return workDao.SelectByAll(string);
    }

}
