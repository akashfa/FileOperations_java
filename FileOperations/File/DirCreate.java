import java.io.File;
import java.io.IOException;

public class DirCreate {
    public static void main(String[] args) throws IOException{
        File f=new File("akas");
        f.mkdir();
        System.out.println(f.exists());//true
        File f1=new File(f,"ak.txt");
        f1.createNewFile();
        System.out.println(f.exists());//true

    }
}
