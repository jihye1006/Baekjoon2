
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine()); // 출전한 학생의 수이자 깃발의 갯수
        int count = 1; // 뒤집힌 깃발의 개수 (1일 때 count 1)
        for (int i=2; i<=n; i++){ 
            if(i*i > n) break;
            count ++;
        }
        System.out.print(count);

    }
}
