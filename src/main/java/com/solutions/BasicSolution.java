package com.solutions;

import com.dto.DataRepresentation;
import com.dto.ResultRepresentation;
import com.files.MyWriter;

/**
 * Created by vladyslav on 28.02.19.
 */
public class BasicSolution {
    public static void solve(DataRepresentation path_to_file, String fileName) {
        ResultRepresentation result = new ResultRepresentation();
        MyWriter.write(result, fileName);
    }
}
