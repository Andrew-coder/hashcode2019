package com;

import com.dto.Image;
import com.files.MyReader;
import com.solutions.BasicSolution;

import java.io.FileReader;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
//        BasicSolution.solve(MyReader.read("PATH_TO_FILE"));
        List<Image> images = MyReader.read("e_shiny_selfies.txt");
        System.out.println();
    }
}
