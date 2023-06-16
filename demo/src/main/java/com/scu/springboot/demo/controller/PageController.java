package com.scu.springboot.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * ClassName: PageController
 * Description:
 * date: 2022/7/14 8:55
 *
 * @author 肖鸿亮
 * @since JDK 1.8
 */
@Controller
public class PageController {
    /**
     * @description:跳转登录页面
     * @author: 肖鸿亮
     * @time: 2022/7/14 8:56
     * @param:
     * @return:
     */    
    @GetMapping("login.html")
    public String login(){
        return "studentLogin";
    }

    /**
     * @description:跳转主页面
     * @author: 肖鸿亮
     * @time: 2022/7/14 8:56
     * @param:
     * @return:
     */
    @GetMapping("index.html")
    public String index(){
        return "index";
    }

    /**
     * @description:跳转文档页面
     * @author: 肖鸿亮
     * @time: 2022/7/14 8:56
     * @param:
     * @return:
     */
    @GetMapping("doc.html")
    public String doc(){
        return "doc";
    }

    /**
     * @description:跳转类型页面
     * @author: 肖鸿亮
     * @time: 2022/7/14 8:56
     * @param:
     * @return:
     */
    @GetMapping("category.html")
    public String category(){
        return "category";
    }

    /**
     * @description:跳转用户页面
     * @author: 肖鸿亮
     * @time: 2022/7/14 8:56
     * @param:
     * @return:
     */
    @GetMapping("user.html")
    public String user(){
        return "user";
    }

    @GetMapping("pay.html")
    public String pay() {return "pay";}

    @GetMapping("studentLogin.html")
    public String studentLogin(){
        return "studentLogin";
    }

    @GetMapping("student.html")
    public String student() {return "student";}

    @GetMapping("class_schedule.html")
    public String class_schedule() {return "class_schedule";}

    @GetMapping("mygrade.html")
    public String mygrade() {return "mygrade";}

    @GetMapping("personal_info.html")
    public String personal_info() {return "personal_info";}

    @GetMapping("card.html")
    public String card() {return "card";}

    @GetMapping("work_plan.html")
    public String work_plan() {return "work_plan";}

    @GetMapping("backlog.html")
    public String backlog() {return "backlog";}

    @GetMapping("login_stu.html")
    public String login_stu() {return "login_stu";}

    @GetMapping("login_tea.html")
    public String login_tea() {return "login_tea";}

    @GetMapping("login_leader.html")
    public String login_leader() {return "login_leader";}

    @GetMapping("teaching_evaluation.html")
    public String teaching_evaluation(){
        return "teaching_evaluation";
    }


    @GetMapping("address_book.html")
    public String address_book(){
        return "address_book";
    }

    @GetMapping("teacher_evaluation.html")
    public String teacher_evaluation(){
        return "teacher_evaluation";
    }

    @GetMapping("single_evaluation.html")
    public String single_evaluation(){
        return "single_evaluation";
    }
    @GetMapping("leader.html")
    public String leader(){return "leader";}

    @GetMapping("origin.html")
    public String origin(){
        return "origin";
    }
    @GetMapping("exam_schedule.html")
    public String exam_schedule(){
        return "exam_schedule";
    }

    @GetMapping("teacher_info.html")
    public String teacher_info(){
        return "teacher_info";
    }
    @GetMapping("teacher.html")
    public String teacher(){
        return "teacher";
    }
    @GetMapping("personal_teacher.html")
    public String personal_teacher(){
        return "personal_teacher";
    }
    @GetMapping("specialty_instruction.html")
    public String specialty_instruction(){
        return "specialty_instruction";
    }
    @GetMapping("teacher_information.html")
    public String teacher_information(){
        return "teacher_information";
    }

    @GetMapping("exam_arrangement.html")
    public String exam_arrangement(){
        return "exam_arrangement";
    }
    @GetMapping("timetable.html")
    public String timetable(){
        return "timetable";
    }
    @GetMapping("class_list.html")
    public String class_list(){
        return "class_list";
    }
}
