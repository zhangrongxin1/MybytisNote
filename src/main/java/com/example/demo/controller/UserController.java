package com.example.demo.controller;

import com.example.demo.pojo.UserJob;
import com.example.demo.service.UserService;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;



@RestController
public class UserController {
    @Autowired
    private UserService uss;//连接service 的bean

    @RequestMapping("/ss")
    public String cll(){
        return "sjdhs";
    }
@RequestMapping("/getid")
    public String getall(int jid){

        return  uss.getall(jid);
    }
   @RequestMapping("/add")
   public String add(UserJob uj){

        return uss.add(uj);
   }
    @RequestMapping("/del")
    public int add(int jid){
        return uss.del(jid);

    }
@RequestMapping("/up")
    public String upp(UserJob uj){

        return uss.update(uj);
}
@RequestMapping("/page")
    public PageInfo<UserJob>finall(int page, int pageSize){

        return uss.findall(page,pageSize);
    }

}
