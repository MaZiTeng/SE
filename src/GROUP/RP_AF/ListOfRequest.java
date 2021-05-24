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

    //    Get data
    public Collection<String> getRequest() {
        return request;
    }

    //    Write data to the file
    //    Update here and replace it with database for future development
    public void rewrite() {
        try {
            BufferedWriter out = new BufferedWriter(
                    new FileWriter("./src/GROUP/RP_AF/Request.txt"));
            for (String i : request) {
                out.write(i + "\n");
            }
            out.close();
            System.out.println("Successfully write to Request.txt");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    //    Read data from the file
    //    Update here and replace it with database for future development
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
