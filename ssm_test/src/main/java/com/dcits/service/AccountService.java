package com.dcits.service;

import com.dcits.domain.Account;

import java.util.List;

/**
 * @Description: 账户的业务层接口
 * @Author: liuyong
 **/
public interface AccountService {
    //查询所有账户信息
    public List<Account> findAll();
    //保存账户信息
    public void saveAccount(Account account);
}
