package com.ruanyinkeji.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Administrator on 2017/8/10 0010.
 */
@RestController
@RequestMapping("error")
public class ErrorController {
    @RequestMapping("index")
    public  String index(){
        return  "error world";
    }
}
