package com.app.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.app.model.Song;

@Repository
public interface RepositoryInterface extends CrudRepository<Song, Integer>{
	
	public Song findAllBySid(int id);
	

}
