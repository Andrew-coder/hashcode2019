package com.solutions;

import com.dto.Image;
import com.dto.Presentation;
import com.files.MyWriter;

/**
 * Created by vladyslav on 28.02.19.
 */
public class BasicSolution {
    public static void solve(Image path_to_file, String fileName) {
        Presentation result = new Presentation();
        MyWriter.write(result, fileName);
    }
}
