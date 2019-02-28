package com.files;

import com.dto.Presentation;

import java.io.FileNotFoundException;
import java.io.PrintWriter;

/**
 * Created by vladyslav on 28.02.19.
 */
public class MyWriter {
    public static void write(Presentation result, String fileName) throws FileNotFoundException {
        PrintWriter out = new PrintWriter(fileName);
        out.write(result.toString());
    }
}
