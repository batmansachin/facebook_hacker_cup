import java.util.Collections;
import java.util.LinkedList;
import java.util.Scanner;

public class second {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        int case_no = 0;
        while(t-->0){
        	case_no += 1;
            int n = sc.nextInt();
            LinkedList<Integer> al = new LinkedList<Integer>();
            for(int i=0;i<n;i++){
                al.add(sc.nextInt());
            }
            Collections.sort(al);
            
            int sum = 0;
            int count =0;
            while(!al.isEmpty()){
                
                int p = al.removeLast();
                sum = p;
                if(sum >= 50 ){
                    count++;
                    sum =0;
                    continue;
                }
                while(sum < 50 && al.isEmpty()==false){
                    sum += p;
                    al.removeFirst();
                    
                    
                }
                if(sum >= 50 ){
                    count++;
                    sum =0;
                    continue;
                }
            }
           
            System.out.println("Case #" + case_no + ": " + count);
        }
    }
    
}