package com.rentvideo.controller;

import com.rentvideo.model.User;
import com.rentvideo.model.Video;
import com.rentvideo.repository.VideoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/admin/videos")
public class AdminVideoController {

    @Autowired
    private VideoRepository videoRepository;

    @PostMapping
    public ResponseEntity<Video> addVideo(@RequestBody Video video) {
        return ResponseEntity.ok(videoRepository.save(video));
    }

    @PutMapping("/{id}")
    public ResponseEntity<Video> updateVideo(@PathVariable Long id, @RequestBody Video updatedVideo) {
        Video video = videoRepository.findById(id).orElseThrow();
        video.setTitle(updatedVideo.getTitle());
        video.setDescription(updatedVideo.getDescription());
        video.setAvailable(updatedVideo.isAvailable());
        return ResponseEntity.ok(videoRepository.save(video));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteVideo(@PathVariable Long id) {
        videoRepository.deleteById(id);
        return ResponseEntity.noContent().build();
    }
}
