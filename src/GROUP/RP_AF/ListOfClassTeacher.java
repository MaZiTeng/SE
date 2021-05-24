package GROUP.RP_AF;

import java.io.*;
import java.util.ArrayList;
import java.util.Collection;

public class ListOfClassTeacher {
    Collection<String> classes = new ArrayList<>();

    //    Add data
    public void addclasses(String data) {
        classes.add(data);
    }

    //    Get data
    public Collection<String> getClasses() {
        return classes;
    }

    //    Write data to the file
    //    Update here and replace it with database for future development
    public void rewrite() {
        try {
            BufferedWriter out = new BufferedWriter(
                    new FileWriter("./src/GROUP/RP_AF/Class_teacher.txt"));
            for (String i : classes) {
                out.write(i + "\n");
            }
            out.close();
            System.out.println("Successfully write to Class_teacher.txt");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    //    read data from the file
    //    Update here and replace it with database for future development
    public ListOfClassTeacher() {
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
