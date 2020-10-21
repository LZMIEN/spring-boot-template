package com.github.shepherdviolet.webdemo.demo.aspectj.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

/**
 * bean()示例, 匹配Bean
 */
@Component//这个必须
@Aspect//这个必须
//@Order(0)//同一个方法被多次切面时, 优先度越高(数字越小)的切面越先执行(越外层), 默认优先度最低(Integer.MAX_VALUE)
public class BeanAspect {

    private static final Logger logger = LoggerFactory.getLogger(BeanAspect.class);

    /**
     * 调用前
     * 所有名称为*AJService的Bean
     */
    @Before(value = "bean(*AJService)")
    public void allBeanWithAJService(JoinPoint joinPoint){
        logger.info("all bean named *AJService, " + joinPoint.getArgs()[0]);
    }

}
