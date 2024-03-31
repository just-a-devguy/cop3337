import java.io.*;

/**
 * Excep
 */
class Delete extends Exception {
  public Delete() {
    System.out.println("One");
  }

  public static void main(String[] args) throws Delete {
    try {
      throw new Delete();
    } catch (Delete e) {
      System.out.println("only here");
      System.out.println("Excep: " + e);// TODO: handle exception
      System.exit(0);
    } finally {
      System.out.println("Done");
      System.out.println("not here");
    }
  }

}

// class Delete {
// private PrintWriter w;

// public void writing(int x) {
// File file = new File("Sample.txt");

// try {
// FileOutputStream fs = new FileOutputStream(file, 0 > 1);
// w = new PrintWriter(fs);
// while (x >= 0) {
// w.println("Hello " + x);
// x--;

// }
// } catch (FileNotFoundException e) {
// System.out.println("File No Found");
// }
// w.close();
// }

// public static void main(String[] args) {
// Delete e = new Delete();
// e.writing(3);
// e.writing(2);
// }
// }
