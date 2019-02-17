package com.demo1;

import com.demo1.service.impl.UserServiceImpl;
import com.demo1.service.IUserService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * 测试IOC
 */
public class Demo1 {
    /**
     * 原来的方式，控制权在demo1这个类
     */
    @Test
    public void run1() {
        IUserService iUserService = new UserServiceImpl();
        iUserService.sayHello("run1");
    }

    /**
     * 使用Spring框架的方式
     */
    @Test
    public void run2() {
        // 创建工厂，加载核心文件
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        // 从工厂中获取对象,传id值
        IUserService iUserService = (IUserService) context.getBean("iUserService");
        // 调用对象的方法执行
        iUserService.sayHello("run2");
    }
}
