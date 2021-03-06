package com.clxs.controller;

import com.clxs.pojo.BannerPojo;
import com.clxs.pojo.GuidePojo;
import com.clxs.pojo.MessagePojo;
import com.clxs.pojo.WorkPojo;
import com.clxs.service.BannerService;
import com.clxs.service.GuideService;
import com.clxs.service.MessageService;
import com.clxs.service.WorkService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.*;

//控制层的接口和接口实现
@Controller
public class FrontController {

//    引入轮播的业务层的接口
    @Autowired
    private BannerService bannerService;

//    引入导航的业务层的接口
    @Autowired
    private GuideService guideService;

//    引入内容的业务层的接口
    @Autowired
    private WorkService workService;

//    引入留言的业务层的接口
    @Autowired
    private MessageService messageService;

//    查询上架或下架的轮播图
    @ResponseBody
    @RequestMapping(value = "/Banner" , method = RequestMethod.GET)
    public List<BannerPojo> SelectByBanner(@RequestParam Integer rightNow){
        List<BannerPojo> list = bannerService.SelectByNow(rightNow);
        return list;
    }

//    查询上架或下架的导航栏的内容
    @ResponseBody
    @RequestMapping(value = "/Guide" , method = RequestMethod.GET)
    public List<GuidePojo> SelectByIndex(@RequestParam Integer rightNow){
        List<GuidePojo> list = guideService.SelectByNow(rightNow);
        return list;
    }

//    模糊查询内容的名称和介绍
    @ResponseBody
    @RequestMapping(value = "/All" , method = RequestMethod.GET)
    public List<WorkPojo> SelectByAll(@RequestParam String name){
        List<WorkPojo> list = workService.SelectByAll(name);
        return list;
    }


//    根据导航栏的内容ID查询对应内容和对应内容的留言
    @ResponseBody
    @RequestMapping(value = "/Work" , method = RequestMethod.GET)
    public Map<String,List> SelectByWork(@RequestParam Integer workId){
        Map<String,List> map = new HashMap<>();
        List A = new ArrayList<>();
        List B = new ArrayList<>();
        if (map !=null){
            List AA = workService.SelectByWorkId(workId);
            A.addAll(AA);
            List BB = messageService.SelectByWorkId(workId);
            B.addAll(BB);
        }
        map.put("Work",A);
        map.put("Message",B);
        return map;
    }

//    游客增加留言
    @ResponseBody
    @RequestMapping(value = "/Message" , method = RequestMethod.POST)
    public boolean InsertByMessage(MessagePojo message){

        MessagePojo messagePojo = new MessagePojo();
        messagePojo.setWorkId(message.getWorkId());
        messagePojo.setRightNow(message.getRightNow());
//        插入自己生成的时间，不需要前端生成，数据传输的安全性考虑。
        messagePojo.setNewTime(System.currentTimeMillis());
//        插入自己生成的名称，不需要前端生成，数据传输的安全性考虑。
        messagePojo.setNewName(getUUID());
        messagePojo.setUpdateTime(message.getUpdateTime());
        messagePojo.setUpdateId(message.getWorkId());
        messagePojo.setContent(message.getContent());

        boolean list = messageService.InsertByMessage(messagePojo);
        return list;
    }

//    官方提供的随机生成名称的工具
    public static String getUUID(){
        UUID uuid= UUID.randomUUID();
        String str = uuid.toString();
        String uuidStr=str.replace("-", "");
        return uuidStr;
    }

}
