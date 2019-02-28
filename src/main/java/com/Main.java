package com;

import com.dto.Image;
import com.files.MyReader;
import com.solutions.HorizontalOnlySolution;

import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

public class Main {
    static HorizontalOnlySolution solution = new HorizontalOnlySolution();
    public static void main(String[] args) throws IOException {
//        BasicSolution.solve(MyReader.read("PATH_TO_FILE"));
        List<Image> images = MyReader.read("a_example.txt");
        System.out.println(images);
        final List<String> result = solution.solve(images);
        System.out.println("result");
        System.out.println(result);
        FileWriter writer = new FileWriter("output.txt");
        writer.write(String.valueOf(result.size()));
        writer.write("\n");
        for(String str: result) {
            writer.write(str);
            writer.write("\n");
        }
        writer.close();

    }
}
