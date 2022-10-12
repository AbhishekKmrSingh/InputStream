import java.io.InputStream;
import java.io.FileInputStream;

public class Main {

  public static void main(String args[]) {

    try {

      // file input.txt is loaded as input stream
      // input.txt file contains:
      // This is a content of the file input.txt
      InputStream input = new FileInputStream("input.txt");

      System.out.println("Data in the file: ");

    }
  }
}
