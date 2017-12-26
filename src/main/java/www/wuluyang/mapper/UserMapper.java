package www.wuluyang.mapper;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import www.wuluyang.entity.User;

public interface UserMapper {
	@Select("select * from user where username=#{username}")
	User findName(@Param("username") String username);
	
	@Insert("insert into user values(null,#{username},#{sex},#{userId},#{password})")
	int insertUser(@Param ("name")String username,String sex,String userId,String password);
}
