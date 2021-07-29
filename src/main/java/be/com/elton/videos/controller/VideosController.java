package be.com.elton.videos.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import be.com.elton.videos.orm.VideoProduction;
import be.com.elton.videos.service.VideoService;

@RestController
public class VideosController {

	@Autowired
	VideoService videoService;

	// creating a get mapping that retrieves all detail from the database
	@GetMapping("/videos")
	private List<VideoProduction> getAllVideoProduction() {

		return videoService.getAllVideoProduction();

	}

	// creating a get mapping that retrieves the detail of a specific video
	@GetMapping("/videos/{id}")
	private VideoProduction getVideoProduction(@PathVariable("id") int id) {

		return videoService.getVideoProdutionById(id);

	}

	// creating a delete mapping that deletes a specific video
	@DeleteMapping("/videos/{id}")
	public void deleteVideoProduction(@PathVariable("id") int id) {

		videoService.delete(id);
 
	}
	//creating post mapping that post the video detail in the database
    @PostMapping("/videos")
	private int saveVideoProduction(@RequestBody VideoProduction videoProduction) {

		videoService.saveOrUpdate(videoProduction);
		return videoProduction.getId();

	}

}
