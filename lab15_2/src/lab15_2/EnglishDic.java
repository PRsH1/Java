package lab15_2;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;


public class EnglishDic {
    public static void main(String[] args) {
          Map<String, Integer> st = new HashMap<String, Integer>();

          st.put("kim", 90);
          st.put("park", 80);
          st.put("lee", 100);
          

          Scanner sc = new Scanner(System.in);
          do {
              System.out.print("이름 입력:");
              String key = sc.next();
              if( key.equals("quit") ) break;
              System.out.println("성적  = " + st.get(key));
          } while(true);
          System.out.println(st);
    }
}