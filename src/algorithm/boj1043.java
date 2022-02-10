package algorithm;

import java.util.*;

public class boj1043 {
    public static void main(String[] args) {
      Scanner scanner = new Scanner(System.in);
      //사람의 수
      int playerNum = scanner.nextInt();
      List<Boolean> knownPeople = new ArrayList<>();
      for (int i = 0; i < playerNum; i++) {
        knownPeople.add(false);
      }

      //파티의 수
      int partyNum = scanner.nextInt();
      //진실을 아는사람 수
      int known = scanner.nextInt();
      //진실을 아는사람 번호 리스트
      Set<Integer> knownId = new HashSet<>(known);
//      ArrayList<Integer> knownId = new ArrayList<>(known);
      for (int i=0; i < known; i++) {
        knownId.add(scanner.nextInt());
      }

      
      for (int i = 0; i < partyNum; i++) {
        //해당 파티 참석 인원
        int partyPlayerNum = scanner.nextInt();
        List<Integer> partyPlayerIdList = new ArrayList<>();
        for (int j = 0; j < partyPlayerNum; j++) {
          partyPlayerIdList.add(scanner.nextInt());
        }

      }


    }
  }