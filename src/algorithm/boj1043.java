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
      List<Integer> knownId = new ArrayList<>(known);
//      ArrayList<Integer> knownId = new ArrayList<>(known);
      for (int i=0; i < known; i++) {
        knownId.add(scanner.nextInt());
      }

      List<List<Integer>> totalPartyPeopleList = new ArrayList<>();
      for (int i = 0; i < partyNum; i++) {
        int aPartyPeopleCount = scanner.nextInt();
        List<Integer> partyPeopleList = new ArrayList<>();
        for (int j = 0; j < aPartyPeopleCount; j++) {
          partyPeopleList.add(scanner.nextInt());
        }
        totalPartyPeopleList.add(partyPeopleList);
      }
      System.out.println(totalPartyPeopleList);
      System.out.println(knownId);
      int counter = 0;
      for (Integer a : knownId) {
        for (List<Integer> s : totalPartyPeopleList){
          if(s.contains(a)){
            counter++;
          }
        }
      }
      System.out.println(totalPartyPeopleList.size()-counter);

    }
  }