package com.scu.springboot.demo.aop;

import com.scu.springboot.demo.utils.DataResult;
import com.scu.springboot.demo.utils.code.Code;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import javax.servlet.http.HttpSession;

@Aspect
@Component
public class AroundCut {
    public static final String POINT_CUT = "execution(* com.scu.springboot.demo.controller.BillController.*(..)) || " +
            "execution(* com.scu.springboot.demo.controller.ExamScoreController.*(..)) || " +
            "execution(* com.scu.springboot.demo.controller.FeeController.*(..)) || " +
            "execution(* com.scu.springboot.demo.controller.StudentController.*(..))";


    public static final String POINT_CUT_LEADER = "";
    @Around(AroundCut.POINT_CUT)
    public DataResult checkSession(ProceedingJoinPoint pjp) throws Throwable {
        //获取session
        HttpSession session = ((ServletRequestAttributes) RequestContextHolder.getRequestAttributes()).getRequest().getSession();
        Object studentInfo = session.getAttribute("userInfo");
        if(null == studentInfo){//session不存在, 返回登录失效
            return DataResult.errByErrCode(Code.LOGIN_OUT);
        }
        return (DataResult) pjp.proceed();
    }
}
