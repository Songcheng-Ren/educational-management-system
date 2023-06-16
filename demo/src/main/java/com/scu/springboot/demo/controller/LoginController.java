package com.scu.springboot.demo.controller;

import com.scu.springboot.demo.entity.Administrator;
import com.scu.springboot.demo.entity.Instructor;
import com.scu.springboot.demo.entity.Student;
import com.scu.springboot.demo.service.AdministratorService;
import com.scu.springboot.demo.service.AuthorityService;
import com.scu.springboot.demo.service.InstructorService;
import com.scu.springboot.demo.service.StudentService;
import com.scu.springboot.demo.utils.DataResult;
import com.scu.springboot.demo.utils.VerifyUtil;
import com.scu.springboot.demo.utils.code.Code;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpSession;

/**
 * ClassName: LoginController
 * Description:
 * date: 2022/7/14 9:09
 *
 * @author 肖鸿亮
 * @since JDK 1.8
 */
@RestController
public class LoginController {

    //@Autowired
    //UserService userService;

    @Autowired
    AuthorityService authorityService;
    @Autowired
    StudentService studentService;

    @Autowired
    AdministratorService administratorService;

    @Autowired
    InstructorService instructorService;

//    @PostMapping("/userLogin")
//    public DataResult userLogin(User user, HttpSession session){
//        //判断数据是否完整
//        if(VerifyUtil.isNull(user.getUserAccount()) || VerifyUtil.isNull(user.getUserPassword())){
//            return DataResult.errByErrCode(Code.ERROR);
//        }
//        //1.判断是否登录成功
//        User userLogin = userService.userLogin(user);
//        if(null == userLogin){
//            return DataResult.errByErrCode(Code.LOGIN_NOT_EXIST);
//        }
//        //2.封装返回的数据
//        LoginUserVo loginUserVo = new LoginUserVo();
//        loginUserVo.setUserAccount(userLogin.getUserAccount());
//        //查询用户类型名称
//        Authority authority = authorityService.queryById(userLogin.getAuthorityId());
//        loginUserVo.setAuthorityName(authority.getAuthorityName());
//        //3.根据用户类型,查找菜单
//        loginUserVo.setMenuVos(MenuVoUtil.getMenuVo(userLogin.getAuthorityId()));
//        //4.将user放入session
//        session.setMaxInactiveInterval(30 * 60);//过期时间单位/秒
//        session.setAttribute("userInfo", userLogin);
//        return DataResult.successByData(loginUserVo);
//    }
    @PostMapping("/studentLogin")
    public DataResult studentLogin(Student student, HttpSession session){
        if(VerifyUtil.isNull(student.getSid()) || VerifyUtil.isNull(student.getPassword())){
            System.out.println("失败！！！");
            return DataResult.errByErrCode(Code.ERROR);
        }
        //1.判断是否登录成功
        Student studentLogin = studentService.studentLogin(student);

        if(null == studentLogin){
            return DataResult.errByErrCode(Code.LOGIN_NOT_EXIST);
        }
        session.setMaxInactiveInterval(30 * 60);//过期时间单位/秒
        session.setAttribute("userInfo", studentLogin);
        return DataResult.successByData(studentLogin);
    }

    @PostMapping("/leaderLogin")
    public DataResult leaderLogin(Administrator administrator, HttpSession session){
        if(VerifyUtil.isNull(administrator.getAdminid()) || VerifyUtil.isNull(administrator.getPassword())){
            System.out.println("失败！！！");
            return DataResult.errByErrCode(Code.ERROR);
        }
        //1.判断是否登录成功
        Administrator leaderLogin = administratorService.leaderLogin(administrator);

        if(null == leaderLogin){
            return DataResult.errByErrCode(Code.LOGIN_NOT_EXIST);
        }
        session.setMaxInactiveInterval(30 * 60);//过期时间单位/秒
        session.setAttribute("userInfo", leaderLogin);
        return DataResult.successByData(leaderLogin);
    }
    @PostMapping("/teacherLogin")
    public DataResult teacherLogin(Instructor instructor, HttpSession session){
        if(VerifyUtil.isNull(instructor.getTid()) || VerifyUtil.isNull(instructor.getPassword())){
            System.out.println("失败！！！");
            return DataResult.errByErrCode(Code.ERROR);
        }
        //1.判断是否登录成功
        Instructor teacherLogin = instructorService.teacherLogin(instructor);

        if(null == teacherLogin){
            return DataResult.errByErrCode(Code.LOGIN_NOT_EXIST);
        }
        session.setMaxInactiveInterval(30 * 60);//过期时间单位/秒
        session.setAttribute("userInfo", teacherLogin);
        return DataResult.successByData(teacherLogin);
    }
    /**
     * @description: 用户登出
     * @author: 肖鸿亮
     * @time: 2022/7/14 9:54
     * @param:
     * @return:
     */    
    @GetMapping("loginOut")
    public DataResult loginOut(HttpSession session){
        //1.清除session里面的userInfo
        session.removeAttribute("userInfo");
        //2.返回
        return DataResult.errByErrCode(Code.LOGIN_OUT);
    }
    @GetMapping("studentLoginOut")
    public DataResult studentLoginOut(HttpSession session){
        session.removeAttribute("userInfo");
        return DataResult.errByErrCode(Code.LOGIN_OUT);
    }
    @GetMapping("leaderLoginOut")
    public DataResult leaderLoginOut(HttpSession session){
        session.removeAttribute("userInfo");
        return DataResult.errByErrCode(Code.LOGIN_OUT);
    }
    @GetMapping("teacherLoginOut")
    public DataResult teacherLoginOut(HttpSession session){
        session.removeAttribute("userInfo");
        return DataResult.errByErrCode(Code.LOGIN_OUT);
    }

}
