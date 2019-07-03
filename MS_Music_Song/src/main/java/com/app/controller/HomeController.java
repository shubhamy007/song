package com.app.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.app.model.Song;
import com.app.service.ServiceImpl;

@CrossOrigin("*")
@RestController
public class HomeController {

	@Autowired
	RestTemplate restTemplate;

	@Autowired
	ServiceImpl si;

	@RequestMapping(value = "/song", method = RequestMethod.POST)
	public Song register(@RequestBody Song s) {
		System.out.println(s.getSid());
		System.out.println(s.getSname());
		System.out.println(s.getSalbum());

		si.register(s);
		System.out.println("Registration Successfully !!!");

		return s;

	}

	@RequestMapping(value = "/login", method = RequestMethod.GET, produces = "application/json")
	public List<Song> view() {

		List<Song> list = si.viewAll();
		System.out.println(list);
		return list;

	}

	@RequestMapping(value = "/getsong/{id}")
	public Song getsong(@PathVariable int id) {
		Song s = si.single(id);

		return s;

	}

	@RequestMapping(value = "/songhistory", method = RequestMethod.GET, produces = "application/json")
	public List<Song> songhistory() {

		List<Song> list1 = si.viewAll();

		return list1;

	}

	@RequestMapping(value = "/songcount", method = RequestMethod.GET, produces = "application/json")
	public List<Integer> songcount() {

		List<Song> list1 = si.viewAll();
		System.out.println(list1);

		List<Integer> li = new ArrayList<>();

		for (Song song : list1) {

			System.out.println(song.getSid());

			String url1 = "http://localhost:8089/count/" + song.getSid();
			int i = restTemplate.getForObject(url1, Integer.class);

			li.add(i);
		}
		return li;
	}

	@RequestMapping(value = "/downloadcount", method = RequestMethod.GET, produces = "application/json")
	public List<Integer> downloadcount() {

		List<Song> list1 = si.viewAll();
		System.out.println(list1);

		List<Integer> li = new ArrayList<>();

		for (Song song : list1) {

			System.out.println(song.getSid());

			String url1 = "http://localhost:8089/downloadcount/" + song.getSid();
			int i = restTemplate.getForObject(url1, Integer.class);

			li.add(i);
		}
		return li;
	}

	@RequestMapping(value = "/listencount", method = RequestMethod.GET, produces = "application/json")
	public List<Integer> listencount() {

		List<Song> list1 = si.viewAll();
		System.out.println(list1);

		List<Integer> li = new ArrayList<>();

		for (Song song : list1) {

			System.out.println(song.getSid());

			String url1 = "http://localhost:8089/listencount/" + song.getSid();
			int i = restTemplate.getForObject(url1, Integer.class);

			li.add(i);
		}
		return li;
	}

}
