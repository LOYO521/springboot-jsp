package www.wuluyang.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import www.wuluyang.entity.User;
import www.wuluyang.mapper.UserMapper;
import www.wuluyang.service.UserService;

@Controller
public class IndexController1 {
	@Autowired
	private UserMapper userMapper;
	@Autowired
	private UserService userSevice;
	
	@RequestMapping("/index")
	public String index(){
		return "index";
		
	}
	@ResponseBody
	@RequestMapping("/getUserName")
	public User getUserName(String username){
		return userMapper.findName(username);
		
	}
	@ResponseBody
	@RequestMapping("/insertUser")
	public String insertUser(String username,String sex,String userId,String password){
		userSevice.addUser(username, sex, userId, password);
		return username;
		
	}

}
