
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;


public class Main {
    public static void main(String [] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine()); //n개 입력 받기

        Map<String, Integer> map = new HashMap<>(); //책이름, 책 개수
        int max = 0;
        for(int i=0; i<n; i++){
            String book = br.readLine();
            if(!map.containsKey(book)){ //map에 같은 이름의 책이 없다면
                map.put(book,1); // 개수(value값)에 1 넣어주기
            }
            else{ // 같은 이름의 책이 있다면
                map.put(book, map.get(book)+1); // 원래 있는 개수에 1더해주기
            }
            max = Math.max(max, map.get(book)); // 최댓값 갱신
        }
        List<String> list = new ArrayList<>();
        //entrySet()을 사용하여 Map의 모든 key와 value 값을 꺼낸다
        for(Map.Entry<String, Integer> entry : map.entrySet()){
            if(entry.getValue() == max) { //value 값이 max와 같다면
                list.add(entry.getKey()); //list에 책 이름 추가
            }
        }
        Collections.sort(list); //사전순으로 정렬
        System.out.println(list.get(0)); // 가장 첫번째 값 출력
    }
}
