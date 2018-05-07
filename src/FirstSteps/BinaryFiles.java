package FirstSteps;

import java.io.*;

public class BinaryFiles {
    public static void main(String[] args) {
        String name = "Patryk";
        int year = 2018;
        double result = 50.0/4;

        String file = "materials/binaryData.txt";

        try{
            DataOutputStream dataOutputStream = new DataOutputStream(new FileOutputStream(file));

            dataOutputStream.writeUTF(name);
            dataOutputStream.writeInt(year);
            dataOutputStream.writeDouble(result);

            dataOutputStream.close();
        } catch(FileNotFoundException e) {
            System.out.println("File not found. Error: " + e);
        } catch(IOException e){
            System.out.println("IO error. Error: " + e);
        }

        try{
            DataInputStream dataInputStream = new DataInputStream(new FileInputStream(file));

            System.out.println(dataInputStream.readUTF());
            System.out.println(dataInputStream.readInt());
            System.out.println(dataInputStream.readDouble());

            dataInputStream.close();
        } catch(FileNotFoundException e) {
            System.out.println("File not found. Error: " + e);
        } catch(IOException e){
            System.out.println("IO error. Error: " + e);
        }
    }
}
