package controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @description
 * @author: yanghz
 * @create: 2019-06-09 20:49
 **/
@Controller
public class HelloController {
    @RequestMapping(value = "/test",method = RequestMethod.GET,produces = "application/json;charset=utf-8")
    @ResponseBody
    public String toTest(){
        return "hello+你好";
    }
    @RequestMapping(value = "/index",method = RequestMethod.GET)
    public String index(){
        return "index";
    }
}
