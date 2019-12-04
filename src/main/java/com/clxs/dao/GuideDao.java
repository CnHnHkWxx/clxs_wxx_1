package com.clxs.dao;

import com.clxs.pojo.GuidePojo;

import java.util.List;

//导航的持久层的接口
public interface GuideDao {

    //    查询上架或下架的导航栏的内容
    public List<GuidePojo> SelectByNow(Integer integer);

}
