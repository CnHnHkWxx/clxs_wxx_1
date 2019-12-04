package com.clxs.service;

import com.clxs.pojo.WorkPojo;
import org.springframework.stereotype.Service;

import java.util.List;

//内容的业务层的接口
@Service
public interface WorkService {

//    根据导航栏的内容ID查询对应内容
    public List<WorkPojo> SelectByWorkId(Integer integer);

//    根据搜索栏的内容对名称和介绍进行模糊查询
    public List<WorkPojo> SelectByAll(String string);

}
