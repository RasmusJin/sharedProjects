import java.util.Scanner; 
public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("tjek dit boomer ego: indtast alder: ");
        Scanner input=new Scanner(System.in);
        int alder=input.nextInt();  
        if(alder<30){
            System.out.println("du har desværre et boomer ego, der skal strokes.");

        }
        else{
            System.out.println("du har ikke et boomer ego, tillykke!");
        }
        input.close(); 
    }
}
