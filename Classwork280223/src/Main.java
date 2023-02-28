import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        Cat cat = new Cat(5, "Tom");

        String path = "C:\\Users\\mkgeorgieva19\\list.txt";

        ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream(path));
        objectOutputStream.writeObject(cat);

        ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream(path));
        Cat myDeserializedCat = (Cat) objectInputStream.readObject();
        System.out.println(myDeserializedCat.age);
        System.out.println(myDeserializedCat.name);

        // List<Integer> ints = new ArrayList<>();
        //ints.add(1);
        //ints.add(12);
        //ints.add(25);
        //ints.add(40);
//
        //String path = "C:\\Users\\mkgeorgieva19\\list.txt";
//
        //ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream(path));
        //objectOutputStream.writeObject(ints);
//
        //FileInputStream fileInputStream = new FileInputStream(path);
        //ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
        //List<Integer> deserializedList = (List<Integer>) objectInputStream.readObject();
//
        //for (int i = 0; i < deserializedList.size(); i++) {
        //    System.out.println(deserializedList.get(i));
//
        //}
    }
}