package com.solutions;

import com.dto.Image;
import com.dto.Orientation;
import com.dto.Slide;

import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * Created by vladyslav on 28.02.19.
 */
public class HorizontalOnlySolution {

    public List<String> solve(List<Image> slides){

        long finalScore=-1;
        LinkedList<Image> resultListFinal = new LinkedList<>();

        for (Image image : slides) {
            LinkedList<Image> resultList = new LinkedList<>(resultListFinal);
            int initSize = resultList.size();
            for (int i = 0; i <= initSize; i++) {
                LinkedList<Image> imagesArranged = new LinkedList<>(resultList);
                imagesArranged.add(i, image);
                final List<Slide> slidesResult = imagesArranged.stream().map(image1 -> {
                    final Slide slide = new Slide();
                    slide.images[0] = image;
                    return slide;
                }).collect(Collectors.toList());
                final long currentScore = BasicSolution.calculateScore(slidesResult);
                if (finalScore <= currentScore) {
                    resultListFinal = imagesArranged;
                    finalScore = currentScore;
                }
            }
            System.out.println(resultList.size());
        }

        System.out.println(resultListFinal.size());
        return resultListFinal.stream().map(i->String.valueOf(i.getId())).collect(Collectors.toList());
    }
}
