import java.util.Scanner;

/**
 *
 * @author 
 */
public class first {

    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        int case_no = 0;
        while(t-->0){
        	case_no += 1;
            double p = sc.nextDouble()/100;
            double x = sc.nextDouble();
            double y = sc.nextDouble();
            int z = (int)((x-50)*(x-50)+(y-50)*(y-50)-2500);
            if(z>0 || (p == 0.0)){
                System.out.println("Case #" + case_no + ": white");
            }
            else{
                double o = p*360;
                //System.out.println(o);
                double m1 = (y-50)/(x-50);
                if(x>=50 && y >=50){
                    double o1 = 90-Math.toDegrees(Math.atan(m1));
                   // System.out.println(o1);
                    if(o1 > o){
                        System.out.println("Case #" + case_no +  ": white");
                    }
                    else{
                        System.out.println("Case #" + case_no + ": black");
                    }
                }
                else if(x>=50 && y <50){
                    double o2 =90- Math.toDegrees(Math.atan(m1));
                    if(o2 > o)
                        System.out.println("Case #" + case_no  +": white");
                    else
                        System.out.println("Case #" + case_no  +": black");
                        
                }
                else if(x <50 && y <50){
                    double o3 =270- Math.toDegrees(Math.atan(m1));
                    if(o3 > o)
                        System.out.println("Case #" + case_no +": white");
                    else
                        System.out.println("Case #" + case_no  +": black");
                }
                else{
                    double o4 = 270-Math.toDegrees(Math.atan(m1));
                    if(o4 > o)
                        System.out.println("Case #" + case_no + ": white");
                    else
                        System.out.println("Case #" + case_no +": black");
                }
            }
        }
    }
    
}