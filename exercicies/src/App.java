import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        program();
    }

    public static void program(){
        Scanner sc = new Scanner(System.in);

        System.out.println("SEQUÊNCIA DE FIBONACCI");

        try{
            System.out.print("Digite um número para analisarmos se o mesmo encontra-se na sequência ou não: ");

            Integer x = sc.nextInt();

            Fibonacci f = new Fibonacci(x);

            if(f.sequence(f.getX()) == true){
                System.out.println("Está na sequência!");

                for(Integer n : f.getList()){
                    System.out.print(n + "  ");
                }
            }
            else{
                System.out.println("Não está na sequência!");
                for(Integer n : f.getList()){
                    System.out.print(n + "  ");
                }
            }
        }
        catch(Exception e){
            e.printStackTrace();
            program();
        }

        sc.close();
    }
}
