package com.example.uploadimages;

import com.example.uploadimages.service.FilesStorageService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import javax.annotation.Resource;

@SpringBootApplication
public class UploadImagesApplication {

    public static void main(String[] args) {
        SpringApplication.run(UploadImagesApplication.class, args);
    }
}
