import java.io.File;
public class ListMethod {
    public static void main(String[] args) {
        File f=new File("C:\\Users\\Lenovo\\OneDrive\\Desktop\\CoreJava");
        String[]str=f.list();
        int n=str.length;
        for(String s:str){
            System.out.println(s);
        }
        System.out.println("Total no of files and directories is "+n);
    }
}
