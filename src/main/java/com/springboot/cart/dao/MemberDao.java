package com.springboot.cart.dao;

import com.springboot.cart.model.MemberAccount;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class MemberDao {
    @Autowired
    private JdbcTemplate jdbcTemplate;

    //寫入資料庫
    public void addMember(MemberAccount memberAccount){
        System.out.println("EXCUTE INSERT MEMBER");
        jdbcTemplate.update("INSERT INTO member_account(PASSWORD, EMAIL, ADDRESS,CELLPHONE,CREATE_DATE) "
                        + "VALUES (?,?,?,?,NOW())",
                        memberAccount.getPassword(),
                        memberAccount.getEmail(),
                        memberAccount.getAddress(),
                        memberAccount.getCellphone());
    }
}
