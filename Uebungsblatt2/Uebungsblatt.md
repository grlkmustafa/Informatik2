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

Aufgabe 8

