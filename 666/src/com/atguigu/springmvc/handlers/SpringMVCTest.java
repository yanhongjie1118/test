package com.atguigu.springmvc.handlers;

import com.atguigu.springmvc.entities.user;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.servlet.ModelAndView;

import java.io.IOException;
import java.io.Writer;
import java.util.Arrays;
import java.util.Date;
import java.util.Map;

/**
 * Created by hp on 2017/3/24.
 * 使用method属性来指定请求方式
 */
@SessionAttributes(value = {"user"},types={String.class})
@RequestMapping("/springmvc")
@Controller
public class SpringMVCTest {
    private static final String SUCCESS = "success";


@RequestMapping("/testSessionAttributes")
    public String testSessionAttributes(Map<String,Object>map)
    {
        //@SessionAttributes除了可以通过属性名指定需要放到会话中的属性外（实际上使用的是value属性值）
        //还可以通过模型属性的对象类型指定哪些模型属性需要放到会话中（实际上使用的是types属性值）
        //注意：该注解只能放在类的上面，而不能修饰修饰方法
        user user = new user("Tom","123456","tom@guigu.com",15);
        map.put("user",user);
        map.put("school","atguigu");
        return SUCCESS;
    }


    @RequestMapping("/testMap")
    public String testMap(Map<String,Object>map)
    {
        //目标方法可以添加Map类型（实际上也可以是Model类型或ModelMap类型）
        System.out.println(map.getClass().getName());
        map.put("names", Arrays.asList("Tom","Jerry","Mike"));
        return SUCCESS;
    }


@RequestMapping("/testModelAndView")
public ModelAndView testModelAndView()
{
    String viewName=SUCCESS;
    ModelAndView modelAndView = new ModelAndView(viewName);
    //添加数据类型到ModelAndView
     modelAndView.addObject("time", new Date());
    return modelAndView;
}



    @RequestMapping("/testPojo")
public String testPojo(user user)
{
    System.out.println("testPojo:"+user);
    return  SUCCESS;
}


    @RequestMapping("/testServletAPI")
    public String testServletAPI(HttpServletRequest request, HttpServletResponse response , Writer out)throws IOException {
        System.out.println("testServletAPI," + request + "," + response);
        out.write("hello springmvc");
        return SUCCESS;
    }

    @RequestMapping(value ="/testMethod",method = RequestMethod.POST)
    public  String testMethod() {
        System.out.println("testMethod");
        return SUCCESS;
    }

@RequestMapping("/testRequestMapping")
    public String testRequestMapping(){
        System .out.println("testRequestMapping");
        return SUCCESS;
    }
}
