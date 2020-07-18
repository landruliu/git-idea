package com.dcits.service.impl;

import com.dcits.dao.AccountDao;
import com.dcits.domain.Account;
import com.dcits.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Description:
 * @Author: liuyong
 **/
@Service("accountService")
public class AccountServiceImpl implements AccountService {
    @Autowired
    private AccountDao dao;

    @Override
    public List<Account> findAll() {
        System.out.println("业务层查询所有账户信息...");
        return dao.findAll();
    }

    @Override
    public void saveAccount(Account account) {
        System.out.println("保存账户信息...");
        dao.saveAccount(account);
    }
}
