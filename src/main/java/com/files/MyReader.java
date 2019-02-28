package com.files;

import com.dto.Image;
import com.dto.Orientation;

import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Created by vladyslav on 28.02.19.
 */
public class MyReader {

    public static final String PATH = "/home/andrii/javaProjects/hashcode2019/src/main/resources/";

    public static List<Image> read(String fileName) {
        List<Image> images = new ArrayList<>();
        try (FileReader fileReader = new FileReader(PATH + fileName)) {
            Scanner in = new Scanner(fileReader);
            String count = in.nextLine();
            long imageCount = Long.valueOf(count);
            int counter = 0;
            while (in.hasNextLine()) {
                String[] line = in.nextLine().split(" ");
                Orientation orientation = Orientation.valueOf(line[0]);
                int tagsCount = Integer.valueOf(line[1]);
                String[] tags = new String[tagsCount];
                for (int i = 0; i < tagsCount; ++i) {
                    String tag = line[i + 2];
                    tags[i] = tag;
                }
                Image image = new Image();
                image.id = counter;
                image.tags = tags;
                image.orientation = orientation;
                images.add(image);
                counter++;
            }
        } catch (Exception ex) {
            System.out.println(ex);
        }
        return images;
    }
}
