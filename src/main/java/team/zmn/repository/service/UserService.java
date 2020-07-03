package team.zmn.repository.service;

import team.zmn.repository.pojo.Result;
import team.zmn.repository.pojo.User;

import java.util.List;

/**
 * Created by IntelliJ IDEA.
 *
 * @author: ZhengCheng.Wen
 * Date: 2020/7/2
 * Time: 14:19
 */

public interface  UserService {

    /**
     *
     * 查询用户表所有用户以及角色表的用户权限
     * @return list
     */
    Result selectAll();
}
