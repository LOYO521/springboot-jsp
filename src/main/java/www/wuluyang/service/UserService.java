package www.wuluyang.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import www.wuluyang.mapper.UserMapper;

@Service
public class UserService {
	@Autowired
	private UserMapper userMapper;
	
	@Transactional
	public int addUser(String username,String sex,String userId,String password){
		return userMapper.insertUser(username, sex, userId, password);
		
	}
}
