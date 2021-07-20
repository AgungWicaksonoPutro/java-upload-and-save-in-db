package com.example.uploadimages.model;

import lombok.*;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;

@Getter(AccessLevel.PUBLIC)
@Setter(AccessLevel.PUBLIC)
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "files")
public class FileInfo {
    @Id
    @GeneratedValue(generator = "system-uuid")
    @GenericGenerator(name= "system-uuid", strategy = "uuid")
    private String id;
    private String name;
    private String type;
    @Lob
    private byte[] data;

    public FileInfo(String name, String type, byte[] data) {
        this.name = name;
        this.type = type;
        this.data = data;
    }
}
