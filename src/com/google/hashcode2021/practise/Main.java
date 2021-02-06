package com.google.hashcode2021.practise;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.time.LocalDateTime;
import java.time.ZoneOffset;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.stream.Stream;

public class Main {

    // global variables;
    static long totalTimeInMilliSeconds;

    public static void main(String[] args) throws IOException {
        System.out.println("- - - - - - - - - - - - - - - - - - - - - - - - - - ");
        System.out.println("       GOOGLE HASHCODE 2021 PRACTISE STATEMENT      ");
        System.out.println("- - - - - - - - - - - - - - - - - - - - - - - - - - ");
        System.out.println("   SCORE |                         FILE |   TIME(ms)");
        System.out.println("- - - - - - - - - - - - - - - - - - - - - - - - - - ");

        List<String> files = collectFiles();

        for (String file : files) {
            String input = readFile(file);
            System.out.println(input);

            // TODO a lot of stuff will happen here!

            writeToFile(new String[0], file);
        }
        System.out.println("- - - - - - - - - - - - - - - - - - - - - - - - - - ");
    }

    private static List<String> collectFiles() {
        List<String> files = new ArrayList<>();
        files.add("a_example");
        files.add("b_little_bit_of_everything.in");
        files.add("c_many_ingredients.in");
        files.add("d_many_pizzas.in");
        files.add("e_many_teams.in");
        return files;
    }

    private static void fillObjects(String input) {
        String[] lines = input.split("\\n");
        String[] mainParts = lines[0].split(" ");

        // TODO a lot of stuff will happen here!
    }

    private static String readFile(String fileName) {
        StringBuilder contentBuilder = new StringBuilder();
        try (Stream<String> stream = Files.lines(Paths.get("practise/input/" + fileName), StandardCharsets.UTF_8)) {
            stream.forEach(s -> contentBuilder.append(s).append("\n"));
        } catch (IOException e) {
            e.printStackTrace();
        }
        return contentBuilder.toString();
    }

    private static void writeToFile(String[] input, String fileName) throws IOException {

        File fout = new File("practise/output/" + fileName);
        FileOutputStream fos = new FileOutputStream(fout);

        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(fos));

        for (int i = 0; i < input.length; i++) {
            bw.write(input[i]);
            bw.newLine();
        }

        bw.close();
    }

    private static String[] prepareOutput() {
        String result = "";
        // TODO a lot of stuff will happen here!
        return result.split("\\n");
    }

}