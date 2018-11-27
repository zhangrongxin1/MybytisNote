package com.example.demo.service;

import com.alibaba.fastjson.JSON;
import com.example.demo.mapper.UserDao;
import com.example.demo.pojo.UserJob;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import jdk.nashorn.internal.objects.NativeJSON;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {
    @Autowired

    private UserDao ud;//连接bean
    public String getall(int jid){
       List<UserJob>get= ud.getall( jid);


        return JSON.toJSONString(get);
    }
    public String add(UserJob uj){
        return ud.add(uj);
    }
    public int del(int jid){

  return ud.del(jid);
  }
    public String update(UserJob uj){
            int dd=ud.updat(uj);
        return JSON.toJSONString(dd);
    }

    /**
     * 分页查询
     * @param page 当前页数
     * @param pageSize 每页个数
     * @return
     */
public PageInfo<UserJob>findall(int page, int pageSize){
    PageHelper.startPage(page,pageSize);
    List<UserJob>all =ud.findAll();
    PageInfo<UserJob>info =new PageInfo<>(all);
    return info;

}

}
