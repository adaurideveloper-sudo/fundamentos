package basico.tiposdedados;

import static java.lang.System.*;

public class DadosPrimitivos {


   public static void main(String[] args) {
       /*
       Dados Primitivos - int, double, float, char, booleam, short
       Objetivo da aula: criar um ninja - Naruto -
       */

       int idade = 16;
       double altura = 1.65;
       char inicial = 'N';
       boolean vivoOuMorto =true;
       Long saldoBancario = 99999999999L;

       out.println("A idade do personagem é: " + idade + "anos.");
       out.println("A altura do personagem é: " + altura + "metros.");
       out.println("A primeira letra do nome do personagem é: " + inicial);
       out.println("O personagem esta vivo: " + vivoOuMorto);
       out.println("O personagem esta saldo: " + saldoBancario);
   }


}
