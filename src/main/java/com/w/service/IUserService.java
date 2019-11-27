package com.w.service;

import java.util.List;

import com.w.domain.IUser;

public interface IUserService {
	
	int addIUser(IUser iUser);

    int deleteIUser(IUser iUser);

    int updateIUser(IUser iUser);

    List<IUser> findAllIUser();

    IUser findOneByUser(IUser iUser);

}
