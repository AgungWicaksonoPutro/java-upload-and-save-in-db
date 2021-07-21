package com.example.uploadimages;

import com.example.uploadimages.property.FileStorageProperties;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

@SpringBootApplication
@EnableConfigurationProperties({
        FileStorageProperties.class
})
public class UploadImagesApplication {
    public static void main(String[] args) {
        SpringApplication.run(UploadImagesApplication.class, args);
    }
}
