package com.app.service;

import java.util.List;

import com.app.model.Song;

public interface ServiceInterface {
	
	public void register(Song s);
	
	public List<Song> viewAll();
	
	public Song single(int id);

}
