package com.example.application.views.webdriver;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class ConstantUtils {

    public static List<String> words = new ArrayList<>();

    static {
        try {
            words.addAll(Files.lines(new File("src/main/resources/library.txt").toPath()).collect(Collectors.toList()));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
