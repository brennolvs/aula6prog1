package Main;

import java.util.Scanner;
import modelo.Cliente;
public class MainCliente {

	/**
	 * apresentação do menu
	 * @author Bee Alves
	 */
	public static void menu() {
		System.out.println("\n¨¨¨¨¨¨¨¨¨¨¨¨CADASTRO UMA OPÇÃO¨¨¨¨¨¨¨¨¨¨¨¨\n");
		System.out.println("\n1- Cadastrar Cliente");
		System.out.println("\n2- Buscar Cliente");
		System.out.println("\n3- Exibir Dados do Cliente");
		System.out.println("\n4- Sair");
		System.out.println("\nEscolha Uma Opção:\n");

	}
	/**
	 * uso de parametros e metodos do programa
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		Cliente[] clientes=new Cliente[50];
		int op=0, quantidade=0, i=0;
		do {
			menu();
			op=sc.nextInt();
			switch (op) {
			case 1:{
					if(quantidade<49) {
						clientes[i]= new Cliente();
						clientes[i].setCod(i+1);
						sc.nextLine();
						System.out.println("\nInsira seu Nome: ");
						clientes[i].setNome(sc.next());
						System.out.println("\nInforme seu CPF:");
						clientes[i].setCpf(sc.nextInt());
						System.out.println("\nInsira seu Telefone: ");
						clientes[i].setTelefone(sc.next());
						i++;
						quantidade++;
					}else {
						System.out.println("Limite de Clientes Atingido");
					}
					break;
				}
			case 2:{
				if(quantidade>0) {
				sc.nextLine();
				String nome;
				System.out.println("Digite o Nome do cliente deseja busca-lo");
				nome=sc.nextLine();
					for(int j=0;j<i;j++) {
						if(clientes[j].verificarNome(nome)==true);
							System.out.println(clientes[j]);
							break;
					}
					if(j==0) {
						System.out.println("Cliente não encontrado");
					}
					}
					break;
			}
			case 3:{
				if(quantidade>0){
				 for (int j=0;j<i;j++) {
					System.out.println(clientes[j]);
				 }
				}
				else {
					System.out.println("Não há registros");
				}
					break;
			}
			case 4:{
				System.out.println("Programa Finalizado com Sucesso");
					break;
			}
			default:{
				System.out.println("OPÇÃO INVALIDA");
			}
		}
		}while(op!=4);
		
		
	}

}


/*Escolha uma opção:
1- Cadastrar Cliente
2- Buscar Cliente
3- Exibir dados do cliente
4-Sair */