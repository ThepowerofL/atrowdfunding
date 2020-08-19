package com.imnu.crowd.controller;

import com.imnu.crowd.bean.Admin;
import com.imnu.crowd.service.AdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

@Controller
public class Test {
    @Autowired
    private AdminService adminService;

    @RequestMapping("/test")
    public String testSsm(ModelMap modelMap, HttpServletRequest request) {

        /*boolean judgeResult = CrowdUtil.judgeRequestType(request);

        logger.info("judgeResult="+judgeResult);*/

        List<Admin> adminList = adminService.getAll();

        modelMap.addAttribute("adminList", adminList);

        /*String a = null;

        System.out.println(a.length());*/

        return "target";
    }

}
