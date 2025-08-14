import java.util.*;
public class first{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            int n=sc.nextInt();
            int[] a=new int[n];
            for(int i=0;i<n;i++){
                a[i]=sc.nextInt();
            }
            boolean flag=false;
            for(int i=0;i<n;i++){
                    if(a[i]==a[i+1]){
                        flag=true;
                        break;
                    }
                }
                if(flag==true){
                    System.out.println("YES");
                }
                else{
                    System.out.println("NO");
                }
            }
        }
    }