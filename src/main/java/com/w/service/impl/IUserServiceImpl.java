package com.w.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.w.dao.IUserDao;
import com.w.domain.IUser;
import com.w.service.IUserService;

/**
 * @ClassName IUserServiceImpl
 * @Description
 * @Author ANGLE0
 * @Date2019/11/17 21:04
 * @Version V1.0
 **/
@Service("iUserService")
public class IUserServiceImpl implements IUserService {

	@Autowired
	private IUserDao iUserDao;
	
	@Override
	public int addIUser(IUser iUser) throws Exception{
		System.out.println(iUser.getBirthday());
		int result = iUserDao.save(iUser);
		return result;
	}

	@Override
	public int deleteIUser(int userID) throws Exception{
		int result = iUserDao.deleteUser(userID);
		return result;
	}

	@Override
	public int updateIUser(IUser iUser) throws Exception{
		int result = iUserDao.updateUser(iUser);
		return result;
	}

	@Override
	public List<IUser> findAllIUser() throws Exception{
		return iUserDao.findAll();
	}

	@Override
	public IUser findOneByUser(IUser iUser) throws Exception{
		return iUserDao.findUser(iUser);
	}

}
