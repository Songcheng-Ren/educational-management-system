package com.scu.springboot.demo.vo;

import lombok.Data;

import java.util.List;

/**
 * ClassName: MenuVo
 * Description:
 * date: 2022/7/14 10:07
 *
 * @author 肖鸿亮
 * @since JDK 1.8
 */
@Data
public class MenuVo {
    private String id;
    private String path;
    private String icon;
    private String title;
    private List<MenuVo> children;
}
