import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        String path = "C:\\Users\\mkgeorgieva19\\zad.txt";
        String outputPath = "C:\\Users\\mkgeorgieva19\\outputASCI.txt";
        FileReader fileReader = null;
        BufferedReader reader = null;

        FileWriter fileWriter = null;
        BufferedWriter writer = null;

        try{
            fileReader = new FileReader(path);
            reader = new BufferedReader(fileReader);

            fileWriter = new FileWriter(outputPath);
            writer = new BufferedWriter(fileWriter);

            String currentLine = reader.readLine();

            int vowels = 0;
            int consonants = 0;
            int punctuation = 0;

            while (currentLine != null){
                for(int i  = 0; i < currentLine.length(); i++) {
                    char currentChar = currentLine.toLowerCase().charAt(i);
                    if (currentChar == 'a' || currentChar == 'e' || currentChar == 'i'
                    || currentChar == 'o' || currentChar == 'u'){
                        vowels++;
                    }
                    else if (currentChar == '!' || currentChar == ',' || currentChar == '.'
                        || currentChar == '?') {
                        punctuation++;
                    }
                    else {
                        consonants++;
                    }

                }
                currentLine = reader.readLine();
            }
            writer.write(String.format("Vowels: %d", vowels));
            writer.newLine();
            writer.write(String.format("Consonants: %d", consonants));
            writer.newLine();
            writer.write(String.format("Punctuation: %d", punctuation));
            writer.newLine();

        } catch (FileNotFoundException e){
            throw new RuntimeException(e);
        } catch (IOException e){
            throw  new RuntimeException(e);
        } finally {
            reader.close();
            writer.close();
        }
    }
}