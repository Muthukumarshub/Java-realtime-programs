import java.util.*;
import java.io.*;
public class Main
{
	public static void main(String[] args) {
		Scanner scan=new  Scanner(System.in);
		 int count =0,n,hour;
    int  vehi_num;
    System.out.println("Welcome to MKCE car and bike parking!");
		try{
	ArrayList<Integer> vehicle_number=new ArrayList<>();
		while(true){
		       System.out.println("There are only "+(20-count)+"bike parking place are available ");
System.out.println("\n");
		     
		       System.out.println("Enter ONE(1) for parking vehicle:");
		       System.out.println("Enter TWO(2) for takeoff the vehicle:");
		       System.out.println("Enter THREE(3) for exit:");
		       System.out.println("Hello sir, how can I help you?");

		       int num=scan.nextInt();
		    switch(num){
		        case 1:
		            {
		                if(count<=20){
		                System.out.println("Enter the vehicle number :");
		                vehi_num=scan.nextInt();
		                System.out.println("How many hour did you need to park?");
		                hour=scan.nextInt();
		                vehicle_number.add(vehi_num);
		                count++;
		                System.out.println("\n");
		                System.out.println("Successfully parked ");
		                System.out.println("Your payment for "+hour+" is "+(hour*10)+"Rupees only");
		                System.out.println("\n");
		                break;
		            }
		            else{
		                System.out.println("parking area is over flow\n");
		                break;
		            }}
		       case 2:
		           {
		               System.out.println("Enter the number to pop the vehicle:");
		               int delete_vehi=scan.nextInt();
		               if(count!=0){
		                 if( vehicle_number.contains(delete_vehi)){
		                     vehicle_number.remove(Integer.valueOf(delete_vehi));
		                     count--;
		                     System.out.println("\n");
		                     System.out.println("Safe journey!\n");
		                     break;
		                 }
		                 else{
		                     System.out.println("\n");
		                     System.out.println("Your vehicle not found in our parking....");
		                     break;
		                 }
		                 }
		                 else{
		                     System.out.println("\n");
		                     System.out.println("Our parking area is empty\n");
		                 }
		               
		           }
		           case 3:{
		              System.exit(0);
		           }
		           default:
		           {
		               System.out.println("\n");
		               System.out.println("Enter the right choice\n");
		               break;
		           }
		    }
		}  
		}
		catch(Exception e){
		    System.out.println(e);
		}
	}
}
