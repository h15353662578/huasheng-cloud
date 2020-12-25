package com.hs.userservice.mapper;

import com.hs.entity.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import java.util.List;
/**
 * @author 华生
 * 2020/12/26
 */

@Mapper
public interface UserMapper {

    /***
     * 查询全部用户
     * @return
     */
    @Select("select * from user")
    public List<User> findAllUser();

}
