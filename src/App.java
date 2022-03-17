import java.util.Scanner;

public class App {

    public App(){

        Scanner s = new Scanner(System.in);

        System.out.println("Insira o texto aqui:\n");
        String a = s.next();
        char b[] = a.toCharArray();

        System.out.println("Quantas vezes quer que escreva?");
        int c = s.nextInt();

        s.close();

        String str = "";

        for(int i = 0; i<c ;i++){

            if(c > 0){

                for(int o = 0; o<b.length ; o++){
                    str+= b[o];
                    System.out.println(str);
                }
        
                for(int o = str.length(); o > 0 ; o--){
                    str = str.substring(0, str.length()-1);
                    if(str.length() > 0){
                        System.out.println(str);
                    } 
                }
            }
        }
    }
    public static void main(String[] args) {

        new App();
        
    }
}
