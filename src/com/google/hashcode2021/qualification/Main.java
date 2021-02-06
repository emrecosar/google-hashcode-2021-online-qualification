package com.google.hashcode2021.qualification;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class Main {

    // global variables;

    public static void main(String[] args) throws IOException {
        System.out.println("- - - - - - - - - - - - - - - - - - - - - - - - - - ");
        System.out.println("GOOGLE HASHCODE 2021 ONLINE QUALIFICATION STATEMENT ");
        System.out.println("- - - - - - - - - - - - - - - - - - - - - - - - - - ");

        List<String> files = collectFiles();

        for (String file : files) {

            String input = readFile(file);

            fillObjects(input);

            // TODO a lot of magic will happen here!

            String[] outputs = prepareOutput();

            writeToFile(outputs, file);
        }
        System.out.println("- - - - - - - - - - - - - - - - - - - - - - - - - - ");
    }

    private static List<String> collectFiles() {
        List<String> files = new ArrayList<>();
        /*
            Insert all input file names under root's "input" director!
            files.add("{INPUT FILE}");
         */
        return files;
    }

    private static void fillObjects(String input) {
        String[] lines = input.split("\\n");
        String[] mainParts = lines[0].split(" ");
        // TODO
    }

    private static String readFile(String file) {
        StringBuilder contentBuilder = new StringBuilder();
        try (Stream<String> stream = Files.lines(Paths.get("input/" + file), StandardCharsets.UTF_8)) {
            stream.forEach(s -> contentBuilder.append(s).append("\n"));
        } catch (IOException e) {
            e.printStackTrace();
        }
        return contentBuilder.toString();
    }

    private static void writeToFile(String[] input, String file) throws IOException {

        File fout = new File("output/" + file);
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
        // TODO
        return result.split("\\n");
    }

}