package testalg;

import java.util.Scanner;

/**
 *
 * @author Zack Bastos
 */
public class TestAlg {
    public static void main(String[] args) {
        int mat, idade, sCivil, idadeViuvas=0, mViuvas =32, velhaId=80, novaMat=5555, 
            cont = 1000, quantCasados = 328, quantSolteiras =456, quantViuvas = 159,
            quantDesquit=57;
        
        float porcCasados, porcSolteiros, porcViuvas, porcDesquit;
        Scanner entrada = new Scanner(System.in);
        
        do {
            System.out.print("Digite a Matricula ENTRAR ou Nºnegativo [-5] pra SAIR: ");
            mat = entrada.nextInt();
            if (mat >= 0) {
                cont = cont + 1;
            System.out.print("Idade: ");
            idade = entrada.nextInt();
            System.out.println("--status civil--");
            System.out.println("[1]Casado | [2]Solteiro | [3]Viúvo | [4]Desquitado");
            sCivil = entrada.nextInt();
            switch(sCivil){
                case 1:
                    quantCasados = quantCasados + 1;
                    break;
                case 2:
                    if (idade >= 20 && idade <=30) {
                       quantSolteiras =  quantSolteiras + 1;
                    }
                    break;
                case 3: 
                    quantViuvas = quantViuvas + 1;
                    idadeViuvas = idadeViuvas + idade;
                    mViuvas = idadeViuvas / quantViuvas;
                    break;
                case 4:
                    quantDesquit = quantDesquit + 1;
                    break;
            }
            
            if (idade > velhaId) {
               velhaId =  idade;
            }
            if (idade < velhaId){
                //novaId = idade;
                novaMat = mat;
            }
            }
        } while (mat >= 0);
        
        porcCasados = (float) (quantCasados*100)/cont;
        porcSolteiros = (float) (quantSolteiras*100)/cont;
        porcViuvas = (float) (quantViuvas*100)/cont;
        porcDesquit = (float) (quantDesquit*100)/cont;
        
        System.out.println("+------------+-------+--------+");
        System.out.println("| FUNCION..  | QUAN..| PORC.. |");
        System.out.println("+------------+-------+--------+");
        System.out.printf("| CASADOS    | %d %s %.1f %s \n",quantCasados,"  |",porcCasados,"% |");
        System.out.println("+------------+-------+--------+");
        System.out.printf("| SOLTEIROS  | %d %s %.1f %s \n",quantSolteiras,"  |",porcSolteiros,"% |");
        System.out.println("+------------+-------+--------+");
        System.out.printf("| VIUVOS     | %d %s %.1f %s \n",quantViuvas,"  |",porcViuvas,"% |");
        System.out.println("+------------+-------+--------+");
        System.out.printf("| DISQUITADO | %d %s %.1f %s \n",quantDesquit,"   |",porcDesquit,"%  |");
        System.out.println("+------------+-------+--------+");
        
        System.out.println("==============================");
        System.out.println("Total de Funcionarios:  "+ cont);
        System.out.println("Total funCasado(a)s: " + quantCasados);
        System.out.println("Total entre 20 e 30 anos solteiro(a)s: " + quantSolteiras);
        System.out.println("Funcionarios Viuvos " + quantViuvas + " Media de idade: " + mViuvas);
        System.out.println("Porcetagem de pessoas desquitadas: "+ porcDesquit);
        System.out.println("Funcionario mais velho tem: " + velhaId);
        System.out.println("Matricula Funcionario mais Novo: " + novaMat);
    }
    
}
