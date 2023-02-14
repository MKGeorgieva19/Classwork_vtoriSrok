import java.io.FileNotFoundException;
import java.io.FileReader;

public class Main {
    public static void main(String[] args) {
        try{
            methodB();
        }catch (FileNotFoundException e){
            System.out.println(e.getMessage());
        }
        System.out.println("test");

    }

    private static void methodB() throws FileNotFoundException{
       methodC();
       System.out.println("Method B");
    }

    private static void methodC() throws FileNotFoundException{
        int i = 12;
        int j = 0;
        FileReader reader = new FileReader("123456");

        System.out.println(i / j);
        System.out.println("Method C");
    }
}