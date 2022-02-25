package com.cjcwecha.cjcwecha.service;


import com.cjcwecha.cjcwecha.dao.AccountDao;
import com.cjcwecha.cjcwecha.entity.AccountEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;


@Service
public class AccountService {

    @Autowired(required=false)
    private AccountDao accountDao;

    public AccountEntity getById(Integer id){

        return accountDao.getById(id);
    }


}
