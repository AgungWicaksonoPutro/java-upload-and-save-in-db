package com.example.uploadimages.message;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter(AccessLevel.PUBLIC)
@Setter(AccessLevel.PUBLIC)
@AllArgsConstructor
public class ResponseFile {
    private String name;
    private String url;
    private String type;
    private Integer size;
}
