package com.dto;

import lombok.Data;

public enum Orientation {

    H("H"),
    V("V");

    private String value;

    Orientation(String value) {
        this.value = value;
    }
}
