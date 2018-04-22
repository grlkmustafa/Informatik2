Übungsblatt 2
==============

Aufgabe 5

```java
import java.io.*;
import java.lang.*;

public class aufgabe5a {
  public static void main(String[] args) {
    if(args.length == 2 && args[0].equals("-o") && Character.isDigit(args[1].charAt(0))) {
      System.out.println("ok");
      } else {
      System.out.println("Ergebnis: nicht ok");
    }
  }
}

```
```java
public class aufgabe5b {
  public static void main(String[] args) {
    StringBuilder s = new StringBuilder();
    for(int i = 0; i < args.length; i++){
      s.append(args[i]);
    }
    System.out.println(s.length());
  }
}
```

Aufgabe 6

Aufgabe 7

- ai)
      - Attribut 'name' mit Datenstrukturinvariante String

      - Attribut 'priority' mit Datenstrukturinvariante Integer

- aii)

  ```java
  package blatt02;

  import java.util.zip.DataFormatException;

  public class Hobby {

      private String name;
      private int priority;
      public static void main(String[] args) {
        /*
        ** Wie müssen die Methoden gestartet werden?
        */
      }

      public Hobby(String name) throws DataFormatException {
    setName("Lesen");
      }

      public int getPriority() {
    return this.priority + 1;
      }

      public void setPriority(int priority) throws DataFormatException {
    if (!checkPriority(priority))
        throw new DataFormatException("Priority invalid");
    this.priority = priority;
      }

      private static boolean checkPriority(int priority) {
    return (priority > 0 && priority < 6);
      }

      public void setName(String name) throws DataFormatException {
    if (!checkName(name))
        throw new DataFormatException("Name invalid");
    this.name = name;
      }

      private static boolean checkName(String name) {
    return (name.length() > 1 && name.length() < 21);
      }
  }
  ```

- bi)
      - Attribut 'rowDimension' mit Datenstrukturinvariante Integer

      - Attribut 'columnDimension' mit Datenstrukturinvariante Integer

      - Attribut 'values' mit Datenstrukturinvariante 2-Dimensionales Integerfeld

- bii)






Aufgabe 8
