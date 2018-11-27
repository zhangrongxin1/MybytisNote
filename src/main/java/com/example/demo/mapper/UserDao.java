package com.example.demo.mapper;

import com.example.demo.pojo.UserJob;
import org.apache.ibatis.annotations.*;

import java.util.List;
//@mapper 将userdao 声明为 一个mapper接口
//@Results 是结果映射列表  @Result 中 property是属性明 , column是 数据库字段明
//@Select 是代表执行真实的SQL
@Mapper
public interface UserDao {
    @Results({
            @Result(property = "jid", column = "jid"), //2
            @Result(property = "jname",column = "jname")
    })

    @Select("SELECT * FROM userjob WHERE jid = #{jid}") //3
    List<UserJob> getall(int jid);
    @Insert("insert into userjob values (#{jid},#{jname} )")
        String add(UserJob uj);
    @Delete("delete from userjob where jid=#{jid}")
    int del(int jid);

    @Update("update userjob set jname=#{jname} where jid =#{jid}")
    int updat(UserJob uj);
    @Select("SELECT * from userjob")
    List<UserJob>findAll();


}
