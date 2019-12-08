package com.w.service;

import java.util.List;

import com.w.domain.Favourable;

public interface FavourableService {
	
	int addFavourable(Favourable favourable) throws Exception;

    int deleteFavourable(int favourableID) throws Exception;

    int updateFavourable(Favourable favourable) throws Exception;

    List<Favourable> findAllFavourable() throws Exception;

    Favourable findOneByID(int favourableId) throws Exception;

}
