package cn.jack.interfaces;

import cn.jack.domain.User;

import java.util.List;

/**
 * Created by Administrator on 2016/7/25.
 */
public interface IUser {
    public List<User> getUsersById(int id);
}
