package chap05;

import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;

public class Problem0503 {
  public static void main(String [] args) {
    try (var writer = Files.newBufferedWriter(
      Paths.get("/workspaces/self-learn-java/src/chap05/data.dat"),
      Charset.forName("Windows-31J"),
      StandardOpenOption.APPEND)
    ) {
      writer.write(String.join(",", args));
      writer.newLine();
    } catch (IOException e) {
      e.printStackTrace();
    }
  }
}
