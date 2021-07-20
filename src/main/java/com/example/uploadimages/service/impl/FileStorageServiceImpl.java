package com.example.uploadimages.service.impl;

import com.example.uploadimages.model.FileInfo;
import com.example.uploadimages.repository.FileInfoRepository;
import com.example.uploadimages.service.FilesStorageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.Resource;
import org.springframework.core.io.UrlResource;
import org.springframework.stereotype.Service;
import org.springframework.util.FileSystemUtils;
import org.springframework.util.StringUtils;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.net.MalformedURLException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.stream.Stream;

@Service
public class FileStorageServiceImpl implements FilesStorageService {

    @Autowired
    private FileInfoRepository fileInfoRepository;

    @Override
    public FileInfo store(MultipartFile file) throws IOException {
        String fileName = StringUtils.cleanPath(file.getOriginalFilename());
        FileInfo fileInfo = new FileInfo(fileName, file.getContentType(), file.getBytes());
        return fileInfoRepository.save(fileInfo);
    }

    @Override
    public FileInfo getFile(String id) {
        return fileInfoRepository.findById(id).get();
    }

    @Override
    public Stream<FileInfo> getAllFiles() {
        return fileInfoRepository.findAll().stream();
    }
}
