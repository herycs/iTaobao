package com.w.service;

import java.util.List;

import com.w.domain.Favourable;

public interface FavourableService {
	
	int addFavourable(Favourable favourable);

    int deleteFavourable(int favourableID);

    int updateFavourable(Favourable favourable);

    List<Favourable> findAllFavourable();

    Favourable findOneByID(int favourableId);

}
