import java.util.Scanner;
public class TaskTwo{
  public static void main(String[] args){
    Scanner input= new Scanner(System.in);
    
int count=0;
int total=0;
for (int number =1; number <=10; number++){
System.out.print("Enter a Score: ");
int score= input.nextInt();
 count+=1;
total+= score;

}
 double average= total / count;
 System.out.println("The average is: " +average);
  }
}
