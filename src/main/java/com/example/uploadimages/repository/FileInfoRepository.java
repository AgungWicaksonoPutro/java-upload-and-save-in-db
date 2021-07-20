package com.example.uploadimages.repository;

import com.example.uploadimages.model.FileInfo;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FileInfoRepository extends JpaRepository<FileInfo, String> {
}
