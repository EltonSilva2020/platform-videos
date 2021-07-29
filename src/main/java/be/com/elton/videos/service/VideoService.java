package be.com.elton.videos.service;

import java.util.ArrayList;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import be.com.elton.videos.orm.VideoProduction;
import be.com.elton.videos.repository.VideoRepository;

@Service
public class VideoService {
    
	@Autowired
	VideoRepository videoRepository;

	// getting all videos record
	public List<VideoProduction> getAllVideoProduction() {

		List<VideoProduction> videos = new ArrayList<VideoProduction>();
		videoRepository.findAll().forEach(video -> videos.add(video));

		return videos;
	}

	//
	public VideoProduction getVideoProdutionById(int id) {

		return videoRepository.findById(id).get();
	}

	public void saveOrUpdate(VideoProduction videoProduction) {

		videoRepository.save(videoProduction);

	}
    //delete specifc record
	
	public void delete(int id) {

		videoRepository.deleteById(id);
	}
}
