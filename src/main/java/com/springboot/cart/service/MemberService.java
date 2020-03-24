package com.springboot.cart.service;

import com.springboot.cart.model.MemberAccount;
import com.springboot.cart.dao.MemberDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MemberService {

    @Autowired
    MemberDao memberDao;

    //service呼叫dao執行寫入
    public void addMember(MemberAccount memberAccount){
        memberDao.addMember(memberAccount);
    }

}
