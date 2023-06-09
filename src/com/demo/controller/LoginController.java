package com.demo.controller;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.demo.service.UserService;

/**
 * 登录
 * 用户管理
 * controller层
 * @author keney
 *
 */
@Controller
@ResponseBody
public class LoginController {

	@Resource
	private UserService userService;
	
	/**
	 * 登录
	 * @param email  邮箱
	 * @param password 密码
	 * @return
	 */
	@RequestMapping("/login")
	public Object login(String email,String password) {
		return userService.login(email, password);
	}
	
	/**
	 *修改密码
	 * @param userId 用户id
	 * @param password 密码
	 * @return 
	 */
	@RequestMapping("/updatePassword")
	public Object updatePassword(String userId,String password) {
		return userService.updatePassword(userId, password);
	}
	
	/**
	 * 用户查询
	 * @param roleId  角色id
	 * @param startPage 起始页
	 * @param pageSize 每页显示条数
	 * @param name 姓名  （进行模糊查询）
	 * @return
	 */
	@RequestMapping("/userList")
	public Object userList(String roleId,String name,String startPage,String pageSize) {
		return userService.userList(roleId, name,startPage, pageSize);
	}
}
