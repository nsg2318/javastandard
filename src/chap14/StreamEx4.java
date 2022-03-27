package chap14;

import java.util.Arrays;
import java.util.stream.Stream;

public class StreamEx4 {
  public static void main(String[] args) {
    Stream<String[]> stream = Stream.of(
        new String[]{"abc", "def", "jkl"},
        new String[]{"ABC", "DEF", "JKL"}
    );
//    Stream<Stream<String>> map = stream.map(Arrays::stream);
    Stream<String> flatMap = stream.flatMap(Arrays::stream);

    flatMap.map( string -> string+"+" )
        .distinct()
        .map(String::toLowerCase)
        .forEach( string -> System.out.println(string));

  }
}
