package GROUP.RP_AF;

import java.io.*;
import java.util.ArrayList;
import java.util.Collection;

public class ListOfTeacherSkill {
    Collection<String> skills = new ArrayList<>();

    //    Add data
    public void addSkills(String data) {
        skills.add(data);
    }

    //    Get data
    public Collection<String> getSkills() {
        return skills;
    }

    //    Write data to the file
    public void rewrite() {
        try {
            BufferedWriter out = new BufferedWriter(
                    new FileWriter("./src/GROUP/RP_AF/teacher_skills.txt"));
            for (String i : skills) {
                out.write(i + "\n");
            }
            out.close();
            System.out.println("Successfully write");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    //    Read data from the file
    public ListOfTeacherSkill() {
        try {
            BufferedReader in = new BufferedReader(new FileReader("./src/GROUP/RP_AF/teacher_skills.txt"));
            String str;
            while ((str = in.readLine()) != null) {
                skills.add(str);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
