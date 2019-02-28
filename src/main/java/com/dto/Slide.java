package com.dto;

import lombok.Data;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

@Data
public class Slide {

    public Image[] images;

    public String[] getCommonTags() {
        Set<String> commonTags = new HashSet<>();
        for (Image image : images) {
            commonTags.addAll(Arrays.asList(image.tags));
        }
        return (String[])commonTags.toArray();
    }
}
