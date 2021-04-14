package persistence;

import java.io.*;
import java.nio.*;
import java.util.*;

HashMap<String,HashMap<string,value>> replies = new HashMap<String,HashMap<string,value>();



public class reader{
    public static final String DELIMITER = ",";
    public static final String ENDOFBUCKET = ".";
    public static final String ENDOFMAP = "<";


    //returns a hashmap of replies from a .txt file
    public HashMap readReplies(File file) throws IOException {
        List<String> fileContent = readFile(file);
        return parseContent(fileContent);
    }

    //calls java.io.File and its nested command readAllLines
    private List<String> readFile(file file) throws IOException{
        return Files.readAllLines(file.toPath());
    }

    //takes the list from readFile(file) and parses the text file into







}