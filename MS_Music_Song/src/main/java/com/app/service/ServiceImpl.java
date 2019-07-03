package com.app.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.model.Song;
import com.app.repository.RepositoryInterface;
@Service
public class ServiceImpl implements ServiceInterface{

	@Autowired
	RepositoryInterface ri;
	
	
	@Override
	public void register(Song s) {
		ri.save(s);
	}


	@Override
	public List<Song> viewAll() {
		return (List<Song>) ri.findAll();
	}


	@Override
	public Song single(int id) {
		
		Song s=ri.findAllBySid(id);
		return s;
	}

}
