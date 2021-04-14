package persistence;

import java.io.*;

public class writer {
    private static PrintWriter printwriter;

    //initializes a writer
    public Writer(File file) throws FileNotFoundException, UnsupportedEncodingException {
        printWriter = new PrintWriter(file, "UTF-8");
    }

    //writes the saveable file to the file
    public void write(Saveable toBeSaved){
        toBeSaved.save(printWriter);
    }

    //prevent memory leaks by closing the printer
    public void close() {
        printWriter.close();
    }
}
