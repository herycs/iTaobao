package com.w.service;

import java.util.List;

import com.w.domain.IUser;

public interface IUserService {
	
	int addIUser(IUser iUser) throws Exception;

    int deleteIUser(int userID) throws Exception;

    int updateIUser(IUser iUser) throws Exception;

    List<IUser> findAllIUser() throws Exception;

    IUser findOneByUser(IUser iUser) throws Exception;

}
