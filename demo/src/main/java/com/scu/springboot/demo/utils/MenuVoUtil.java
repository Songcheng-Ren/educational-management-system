package com.scu.springboot.demo.utils;

import com.scu.springboot.demo.vo.MenuVo;

import java.util.ArrayList;
import java.util.List;

/**
 * ClassName: MenuVoUtil
 * Description:
 * date: 2022/7/14 10:09
 *
 * @author 肖鸿亮
 * @since JDK 1.8
 */
public class MenuVoUtil {
    //根据用户类型返回菜单
    public static List<MenuVo> getMenuVo(Long authorityId){
        ArrayList<MenuVo> MenuVos = new ArrayList<>();
        //文档管理组
        MenuVo docGroup = new MenuVo();
        MenuVos.add(docGroup);//添加文档管理组菜单
        docGroup.setId("0");
        docGroup.setPath("");
        docGroup.setTitle("文档管理组");
        docGroup.setIcon("layui-icon-tabs");
        ArrayList<MenuVo> docChild = new ArrayList<>();
        docGroup.setChildren(docChild);
        MenuVo docManager = new MenuVo();
        docManager.setId("1");
        docManager.setPath("doc.html");
        docManager.setTitle("文档管理");
        docManager.setIcon("layui-icon-form");
        docChild.add(docManager);
        //管理员菜单
        if(authorityId == 2){
            //类型管理
            MenuVo categoryManager = new MenuVo();
            categoryManager.setId("2");
            categoryManager.setPath("category.html");
            categoryManager.setTitle("类型管理");
            categoryManager.setIcon("layui-icon-file");
            docChild.add(categoryManager);

            //用户管理
            MenuVo userMenu = new MenuVo();
            MenuVos.add(userMenu);//添加文档管理组菜单
            userMenu.setId("3");
            userMenu.setPath("user.html");
            userMenu.setTitle("用户管理");
            userMenu.setIcon("layui-icon-user");
        }
        return MenuVos;
    }
}
