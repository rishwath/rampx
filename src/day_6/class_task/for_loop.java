package Day_6;

public class for_loop {
    public static void main(String[] args) {
        for(int i =1; i<=5; i++){
            for(int j =5; j>0; j--){
                System.out.print(j);
            }
            System.out.println();
        }
        System.out.println("Exited from the loop");
    }
}