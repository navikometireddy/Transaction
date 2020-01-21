package co.analysis;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class TransactionMain {

    public static void main(String[] args) {
        String fromDate = "20/08/2018 14:07:10";
        String toDate = "20/08/2018 14:07:10";
        String merchent = "Maclaren";
        String inputFilePath = "C:\\navi\\Test\\source\\csv3.csv";
        List<String> list = new ArrayList<>();

        // reading csv file into stream, try-with-resources
        try (Stream<String> stream = Files.lines(Paths.get(inputFilePath))) {

            // 1 filtered flight numbers BA-731 and VA-421
            // 2. then only map filtered result to there airport names only
            // 3. store result into a List
            list = stream.filter(line -> line.contains("BA-731") || line.contains("VA-421")).map(line -> {
                String[] str = line.split(",");
                return str[2];
            }).collect(Collectors.toList());

            // 4. print result list
            list.forEach(System.out::println);

        } catch (IOException ioe) {
            ioe.printStackTrace();
        }
    }
}
