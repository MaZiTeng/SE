package GROUP.RP_AF;

import java.io.*;
import java.util.ArrayList;
import java.util.Collection;

public class ListOfRequest {
    Collection<String> request = new ArrayList<>();

    //    Add data
    public void addRequest(String data) {
        request.add(data);
    }

    //    get data
    public Collection<String> getRequest() {
        return request;
    }

    //    Write data to the file
    //    修改这里可以一键替换数据库
    public void rewrite() {
        try {
            BufferedWriter out = new BufferedWriter(
                    new FileWriter("./src/GROUP/RP_AF/Request.txt"));
            for (String i : request) {
                out.write(i + "\n");
            }
            out.close();
            System.out.println("Successfully write");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    //    Read data from the file
    //    修改这里可以一键替换数据库
    public ListOfRequest() {
        try {
            BufferedReader in = new BufferedReader(new FileReader("./src/GROUP/RP_AF/Request.txt"));
            String str;
            while ((str = in.readLine()) != null) {
                request.add(str);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
