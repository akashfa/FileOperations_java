import java.io.File;
import java.io.IOException;
import java.io.FileReader;
public class FileReaderMethod {
    public static void main(String[] args) throws IOException {
        //create file object
        File f=new File("abc.txt");
        //Create FileReader Object
        FileReader fr=new FileReader(f);
        //this is a frist approch
        int i=fr.read();
        while(i!=-1){
            System.out.println((char)i);
            i=fr.read();
        }
      //second approch 
      char[]ch=new char[(int)f.length()];
      System.out.println("length of the file::"+f.length());
      int nofochar=fr.read(ch);
      System.out.println("No of character::"+nofochar);
      for(char data:ch){
        System.out.println(data);
      }
      fr.close();
    }
}
