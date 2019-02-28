package com.solutions;

import com.dto.Image;
import com.dto.Presentation;
import com.dto.Slide;
import com.files.MyWriter;
import com.google.common.collect.Sets;

import java.util.*;

/**
 * Created by vladyslav on 28.02.19.
 */
public class BasicSolution {
    public static void solve(Image path_to_file, String fileName) {
        Presentation result = new Presentation();
//        MyWriter.write(result, fileName);
    }

    public static long calculateScore(List<Slide> slides) {
        long result = 0;
        ListIterator<Slide> iterator = slides.listIterator();
        while (iterator.hasNext()) {

            String[] firstSlideArray = iterator.next().getCommonTags();
            String[] secondSlideArray;
            if (iterator.hasNext()) {
                secondSlideArray = iterator.next().getCommonTags();
                long currentDiff = calculateCommon(firstSlideArray, secondSlideArray);
                result += currentDiff;
                if(iterator.hasPrevious())
                    iterator.previous();
            }

        }
        return result;
    }

    public static long calculateCommon(String[] tags1, String[] tags2) {
        Set<String> s1 = new HashSet<>(Arrays.asList(tags1));
        Set<String> s2 = new HashSet<>(Arrays.asList(tags2));
        s1.retainAll(s2);

        return s1.size();
    }

    public static long calculateDiff(String[] tags1, String[] tags2) {
        HashSet<String> first = new HashSet<>(Arrays.asList(tags1));
        HashSet<String> second = new HashSet<>(Arrays.asList(tags2));
        return Sets.symmetricDifference(first, second).size();
    }
}
