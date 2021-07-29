package be.com.elton.videos.repository;

import org.springframework.data.repository.CrudRepository;

import be.com.elton.videos.orm.VideoProduction;

public interface VideoRepository extends CrudRepository<VideoProduction, Integer> {

}
