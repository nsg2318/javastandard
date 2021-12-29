package chap14;

import java.io.File;
import java.util.stream.Stream;

public class StreamEx2 {
  public static void main(String[] args) {
    File[] fileArr = { new File("Ex1.java"), new File("Ex1.bak")
        , new File("Ex2.java"), new File("Ex1"), new File("Ex1.txt")};

    Stream<File> fileStream = Stream.of(fileArr);

    //map()으로 Stream<File>을 Stream<String>으로 변환
    Stream<String> stringStream = fileStream.map(File::getName);
    stringStream.forEach(System.out::println);

    fileStream = Stream.of(fileArr); //한 번 썼으니 다시 생성
    fileStream.map(File::getName).peek(i -> System.out.println(i));
  }
}
