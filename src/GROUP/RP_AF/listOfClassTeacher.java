package GROUP.RP_AF;

import java.io.*;
import java.util.ArrayList;
import java.util.Collection;

public class listOfClassTeacher {
    Collection<String> classes = new ArrayList<>();

    //    Add data
    public void addclasses(String data) {
        classes.add(data);
    }

    //    Get data
    public Collection<String> getClassess() {
        return classes;
    }

    //    Write data to the file
    public void rewrite() {
        try {
            BufferedWriter out = new BufferedWriter(
                    new FileWriter("./src/GROUP/RP_AF/Class_teacher.txt"));
            for (String i : classes) {
                out.write(i + "\n");
            }
            out.close();
            System.out.println("Successfully write");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    //    read data from the file
    public listOfClassTeacher() {
        try {
            BufferedReader in = new BufferedReader(new FileReader("./src/GROUP/RP_AF/Class_teacher.txt"));
            String str;
            while ((str = in.readLine()) != null) {
                classes.add(str);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
