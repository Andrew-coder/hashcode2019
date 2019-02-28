package com.files;

import com.dto.ResultRepresentation;

import java.io.FileNotFoundException;
import java.io.FilterWriter;
import java.io.PrintWriter;

/**
 * Created by vladyslav on 28.02.19.
 */
public class MyWriter {
    public static void write(ResultRepresentation result, String fileName) throws FileNotFoundException {
        PrintWriter out = new PrintWriter(fileName);
        out.write(result.toString());
    }
}
