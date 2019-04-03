package aop;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class Audience {
	
	// 声明切点
    @Pointcut("execution(* aop.Performer.perform(..))")
    public void performance(){
    	System.out.println("111");
    }
    @Before("performance()")
    public void takeSeats(){
    	System.out.println("观众入座");
    }
    // 表演之前
    @Before("performance()")
    public void turnOffCellPhones(){
    	System.out.println("关闭手机");
    }
    // 表演之后
    @AfterReturning("performance()")
    public void applaud(){
    	System.out.println("啪啪啪啪啪");
    }
    // 表演失败后
    @AfterThrowing("performance()")
    public void failure(){
    	System.out.println("坑爹，退钱！");
    }
    @Around("performance()")
    public void watch(ProceedingJoinPoint joinpoint){
        try{
            System.out.println("观众入座");
            System.out.println("关闭手机");
            long start=System.currentTimeMillis();
            // 执行被通知的方法！
            joinpoint.proceed();
            joinpoint.proceed();
            joinpoint.proceed();
            long end=System.currentTimeMillis();
            System.out.println("啪啪啪啪啪");
            System.out.println("表演耗时："+(end-start)+"milliseconds");
        }catch(Throwable t){
            System.out.println("坑爹，退钱！");
        }
    }
}
