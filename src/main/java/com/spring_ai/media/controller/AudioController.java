package com.spring_ai.media.controller;

import com.spring_ai.media.services.AudioService;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.io.Resource;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;


@RestController
@RequestMapping("/api/v1/audio")
public class AudioController {

    private final AudioService audioService;

    public AudioController(AudioService audioService) {
        this.audioService = audioService;

    }

    @PostMapping("/text")
    public ResponseEntity<String> speechToText(
            @RequestParam("audioFile")MultipartFile audioFile
            ) {

        String responseText = audioService.convertAudioToText(audioFile.getResource());
        return ResponseEntity.ok(responseText);
    }

    @PostMapping("/transcript")
    public ResponseEntity<String> transcriptAudio(
            @Value("${classpath:sample1.mp3}") Resource inputAudio
    ) {

        String responseText = audioService.convertAudioToText(inputAudio);
        return ResponseEntity.ok(responseText);
    }

    @PostMapping("/transcript-with-options")
    public ResponseEntity<String> transcriptAudioWithOptions(
            @Value("${classpath:sample2.mp3}") Resource inputAudio
    ) {

        String responseText = audioService.convertAudioToTextWithOptions(inputAudio);
        return ResponseEntity.ok(responseText);
    }
}