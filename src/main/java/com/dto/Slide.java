package com.dto;

import lombok.Data;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

@Data
public class Slide {

    public Image[] images = new Image[2];

    public String[] getCommonTags() {
        Set<String> commonTags = new HashSet<>();
        for (Image image : images) {
            if (image != null)
                commonTags.addAll(Arrays.asList(image.tags));
        }
        return commonTags.toArray(new String[commonTags.size()]);
    }
}
