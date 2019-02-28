package com.dto;

import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Created by vladyslav on 28.02.19.
 */

@Data
@NoArgsConstructor
public class Image {

    public long id;
    public String[] tags;
    public Orientation orientation;
}
