package com.cjcwecha.cjcwecha.controller;

import com.cjcwecha.cjcwecha.entity.AccountEntity;
import com.cjcwecha.cjcwecha.service.AccountService;
import com.cjcwecha.cjcwecha.util.ReadExcel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.io.File;
import java.util.List;

@Controller
@RequestMapping("/basic/")
public class BasicController {

    @Autowired
    private AccountService accountService;

    

    @RequestMapping("/test")
    public ModelAndView test(){

        ModelAndView modelAndView = new ModelAndView();

        modelAndView.setViewName("/main/index");



        //modelAndView.addObject("key", accountService.getById(1));
        return modelAndView;
    }

    @RequestMapping("/getUser/{id}")
    public String GetUser(@PathVariable int id){

        System.out.print("**************************"+id);

        return  accountService.getById(id).toString();
    }


    @RequestMapping("/read")
    public void  readExcle(){
        ReadExcel readExcel=new ReadExcel();
        File file = new File("C:/Users/Administrator/Desktop/wanlian.xls");
        List excelList = readExcel.readExcel(file);



        String first="";
        String next="";

        int n=1;
        for (int i = 0; i < excelList.size(); i++) {
            List list = (List) excelList.get(i);
            String word="";


            for (int j = 0; j < list.size(); j++) {
                word=list.get(j).toString();
            }


            if (i% 2 != 0 ){
                next=word;




                n++;
            }else{
                first=word;
            }



        }

    }

}
