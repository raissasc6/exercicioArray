package exercicio;

import java.util.Scanner;

//Implementar uma Classe que se deverá manter um Array, por essa classe eu posso:
//Adicionar um elemento
//	Remover um elemento
//	Recuperar um elemento
//Sua classe deve ter 3 implementações :
//Ao adicionar um elemento e já estiver no limite, o array deverá dobrar de tamanho
//	Ao adicionar um elemento e já estiver no limite, o array deverá aumentar em 50%
//	Ao adicionar um elemento e já estiver no limite, o array não deverá permitir
public class Main {

    public static void main (String[] args) {
        Implements Implement1 = new Implements(5);
        Implements implement2 = new Implements(5);
        Implements implement3 = new Implements(5);
        Scanner scan = new Scanner(System.in);
        //System.out.println("ElementsByInd");
        //implement1.getElementsByInd(0);
       /// System.out.println("Deletar elemento");
        //implement1.delElement(0);


        System.out.println("====== Teste 1 =====");
        System.out.println("|Ao adicionar um elemento e já estiver no limite, o array deverá dobrar de tamanho");

        int num;
        do{
            System.out.println("|Digite 00 para sair do Teste 1\n| ou \n| Digite um número diferente para continuar:");
            num = scan.nextInt();
            if(num != 00){
                Implement1.addElementAndFold2(num);
            }
        }while(num != 00);
        System.out.println("====== Teste 2 =====");
        System.out.println("|Ao adicionar um elemento e já estiver no limite, o array deverá aumentar em 50%");

        do{
            System.out.println("|Digite 00 para sair do Teste 2\n| ou \n| Digite um número diferente para continuar:");
            num = scan.nextInt();
            if(num != 00){
                implement2.addElementAndFoldHalf(num);
            }
        }while(num != 00);

        System.out.println("====== Teste 3 =====");
        System.out.println("|Ao adicionar um elemento e já estiver no limite, o array não deverá permitir");

        do{
            System.out.println("|Digite 00 para sair do Teste 3\n| ou \n| Digite um número diferente para continuar:");
            num = scan.nextInt();
            if(num != 00){
                implement3.addElementWithLimit(num);
            }
        }while(num != 00);

    }
}
