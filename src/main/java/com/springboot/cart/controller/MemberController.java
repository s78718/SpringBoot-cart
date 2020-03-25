package com.springboot.cart.controller;
import com.springboot.cart.model.MemberAccount;
import com.springboot.cart.service.MemberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@Controller
public class MemberController {

    //透過 @RequestMapping 指定從/add會被對應到此add()方法
    @Autowired
    MemberAccount memberAccount;
    @Autowired
    MemberService memberService;


    //新建一個model然後寫入資料(model需先設定bean geter seter) 呼叫service (處理controller & model之間傳輸 )
    @GetMapping("/add")
    public String add(){
        memberAccount = new MemberAccount();
        memberAccount.setPassword("12345678");
        memberAccount.setEmail("test@gmail.com");
        memberAccount.setCellphone("0912345789");
        memberAccount.setAddress("高雄市東帝士大樓");
        memberService.addMember(memberAccount);
        return "mik";
    }

}
