package com.airtribe.meditrack.util;

import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

public class CSV {
    public static void writeToCSV (String file, List<String> data)
             throws IOException{
        try (FileWriter fw = new FileWriter(file) ){
            for (String line : data)
                fw.write(line + "\n");
        }
    }
}
