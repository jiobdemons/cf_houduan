package com.cf_houduan.cf_houduan.service;


import com.cf_houduan.cf_houduan.dao.AccountDao;
import com.cf_houduan.cf_houduan.entity.AccountEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class AccountService {

    @Autowired(required=false)
    private AccountDao accountDao;

    public AccountEntity getById(Integer id){

        return accountDao.getById(id);
    }


}
