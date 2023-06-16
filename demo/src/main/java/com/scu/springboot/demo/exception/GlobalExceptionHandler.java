package com.scu.springboot.demo.exception;

import com.scu.springboot.demo.utils.DataResult;
import com.scu.springboot.demo.utils.code.Code;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.transaction.interceptor.TransactionAspectSupport;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * ClassName: GlobalExceptionHandler
 * Description:
 * date: 2022/7/13 15:17
 *
 * @author 肖鸿亮
 * @since JDK 1.8
 */
@ControllerAdvice("com.scu.springboot.demo")
public class GlobalExceptionHandler {
    /**
     * 出现异常返回错误提示, 并且回滚事务
     * @param e
     * @return
     */
    @Transactional(rollbackFor = Exception.class)
    @ExceptionHandler(Exception.class)
    @ResponseBody
    public DataResult exceptionHandler(Exception e){
        e.printStackTrace();
        System.out.println("抓到异常");
        //手动事务回滚
        TransactionAspectSupport.currentTransactionStatus().setRollbackOnly();
        return DataResult.errByErrCode(Code.ERROR);
    }
}
