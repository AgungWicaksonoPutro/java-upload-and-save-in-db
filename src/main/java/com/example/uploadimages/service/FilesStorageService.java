package com.example.uploadimages.service;

import com.example.uploadimages.model.FileInfo;
import org.springframework.core.io.Resource;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.nio.file.Path;
import java.util.stream.Stream;

public interface FilesStorageService {
    public FileInfo store(MultipartFile file) throws IOException;
    public FileInfo getFile(String id);
    public Stream<FileInfo> getAllFiles();
}
