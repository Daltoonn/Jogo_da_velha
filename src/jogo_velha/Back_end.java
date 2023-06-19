package jogo_velha;

import java.util.Scanner;

public class Back_end {

	private char velha[][]= new char [3][3];
	
	public Back_end()
	{
		for(int i=0; i<3; i++)
		{
			for(int j=0; j<3; j++)
			{
				this.velha[i][j]=' ';
			}
		}
	}
	
	public void capita(char velha[][]) 
	{
		System.out.print("\n");
		System.out.println("INTRUÇÕES");
		System.out.println("ATENÇÃO");
		System.out.println("CADA NUMERO CORRESPONDE A UM LOCAL A QUAL VOCE DESEJA PREENCHER\n(VOCE PODE CONSULTAR O SEU TELCADO EM CASO DE DUVIDA OU ANOTAR AS POSIÇÕES)\n");
		System.out.println("_1_|_2_|_3_");
		System.out.println("_4_|_5_|_6_");
		System.out.println(" 7 | 8 | 9 ");
		System.out.print("\n");
	}

//SETS E GETS DO PROGRAMA===============================================================================================================================================================
	
	
	public void setVelha(char velha[][])
	{
		this.velha = velha;
	}
	
	public char[][] getVelha()
	{
		return this.velha;
	}
	
//FUNÇÃO PARA DISPONIBILIZAR MATRIZES PARA USO NO PROGRAMA===============================================================================================================================================================

	
	public void preenche(char velha[][])
	{
		System.out.println("_"+velha[0][0] + "_|_"+velha[0][1] +"_|_"+velha[0][2] +"_");
		System.out.println("_"+velha[1][0] + "_|_"+velha[1][1] +"_|_"+velha[1][2] +"_");
		System.out.println(" "+velha[2][0] + " | "+velha[2][1] +" | "+velha[2][2] +" ");
	}
	
	
//FUNÇÃO PARA USUARIOS GAMEPLAY===============================================================================================================================================================
	
	
	public int jogadores(char velha[][])
	{
		Scanner scan = new Scanner(System.in);
		int posicao=0, recebe=0, cont=0, res=0;
		
		while(cont!=9){
			
			do {
				System.out.println("JOGADOR 1");
				System.out.println("DIGITE A POSIÇÃO:");
				posicao = scan.nextInt();
				System.out.println();
				switch (posicao) {
				
				case 1:
					
								if (velha[0][0] == ' ') {
									velha[0][0] = 'X';
									recebe = 1;
								} 
								else {
									System.out.println("ESCOLHA OUTRA OPÇÃO");
									recebe = 0;
								}
								break;
					
				case 2:
								if (velha[0][1] == ' ') {
									velha[0][1] = 'X';
									recebe = 1;
								} 
								else {
									System.out.println("ESCOLHA OUTRA OPÇÃO");
									recebe = 0;
								}
								break;
					
				case 3:
								if (velha[0][2] == ' ') {
									velha[0][2] = 'X';
									recebe = 1;
								} 
								else {
									System.out.println("ESCOLHA OUTRA OPÇÃO");
									recebe = 0;
								}					
								break;
					
				case 4:
								if (velha[1][0] == ' ') {
									velha[1][0] = 'X';
									recebe = 1;
								} 
								else {
									System.out.println("ESCOLHA OUTRA OPÇÃO");
									recebe = 0;
								}				
								break;
					
				case 5:
								if (velha[1][1] == ' ') {
									velha[1][1] = 'X';
									recebe = 1;
								} 
								else {
									System.out.println("ESCOLHA OUTRA OPÇÃO");
									recebe = 0;
								}				
								break;
					
				case 6:
								if (velha[1][2] == ' ') {
									velha[1][2] = 'X';
									recebe = 1;
								} 
								else {
									System.out.println("ESCOLHA OUTRA OPÇÃO");
									recebe = 0;
								}					
								break;
					
				case 7:
								if (velha[2][0] == ' ') {
									velha[2][0] = 'X';
									recebe = 1;
								} 
								else {
									System.out.println("ESCOLHA OUTRA OPÇÃO");
									recebe = 0;
								}					
								break;
					
				case 8:
								if (velha[2][1] == ' ') {
									velha[2][1] = 'X';
									recebe = 1;
								} 
								else {
									System.out.println("ESCOLHA OUTRA OPÇÃO");
									recebe = 0;
								}					
								break;
					
				case 9:
								if (velha[2][2] == ' ') {
									velha[2][2] = 'X';
									recebe = 1;
								}
								else {
									System.out.println("ESCOLHA OUTRA OPÇÃO");
									recebe = 0;
								}					
								break;
					
				default:
					System.out.println("DIGITE UMA POSIÇÃO VÁLIDA");
					break;
					
				}
				
				preenche(velha); //CHAMA PARA PREENCHER
				
				res = campeao(velha); //gambiarra para achar o vencendor 
					if (res == 10)
					{ //caso de vitoria pega vai ser 10   
						return 1;
					}			
			}
			
			while (recebe != 1);
			cont++;
			if(cont==9) {
				return 8; //caso de empate j vai ser 8
				        }
		
			else {
			        recebe = 2;
			
			//JOGADOR 2                
			do {
				System.out.println("JOGADOR 2");
				System.out.println("DIGITE A POSIÇÃO:");
				posicao = scan.nextInt();
				System.out.println();
				switch (posicao) {
				
				case 1:
										if (velha[0][0] == ' ') {
											velha[0][0] = 'O';
											recebe = 1;
										} 
										else {
											System.out.println("ESCOLHA OUTRA OPÇÃO");
											recebe = 0;
										}					
										break;
					
				case 2:
										if (velha[0][1] == ' ') {
											velha[0][1] = 'O';
											recebe = 1;
										} 
										else {
											System.out.println("ESCOLHA OUTRA OPÇÃO");
											recebe = 0;
										}					
										break;
					
				case 3:
										if (velha[0][2] == ' ') {
											velha[0][2] = 'O';
											recebe = 1;
										}
										else {
											System.out.println("ESCOLHA OUTRA OPÇÃO");
											recebe = 0;
										}					
										break;
					
				case 4:
										if (velha[1][0] == ' ') {
											velha[1][0] = 'O';
											recebe = 1;
										}
										else {
											System.out.println("ESCOLHA OUTRA OPÇÃO");
											recebe = 0;
										}					
										break;
					
				case 5:
										if (velha[1][1] == ' ') {
											velha[1][1] = 'O';
											recebe = 1;
										} 
										else {
											System.out.println("ESCOLHA OUTRA OPÇÃO");
											recebe = 0;
										}					
										break;
					
				case 6:
										if (velha[1][2] == ' ') {
											velha[1][2] = 'O';
											recebe = 1;
										} 
										else {
											System.out.println("ESCOLHA OUTRA OPÇÃO");
											recebe = 0;
										}					
										break;
					
				case 7:
										if (velha[2][0] == ' ') {
											velha[2][0] = 'O';
											recebe = 1;
										}
										else {
											System.out.println("ESCOLHA OUTRA OPÇÃO");
											recebe = 0;
										}					
										break;
					
				case 8:
										if (velha[2][1] == ' ') {
											velha[2][1] = 'O';
											recebe = 1;
										} 
										else {
											System.out.println("ESCOLHA OUTRA OPÇÃO");
											recebe = 0;
										}					
										break;
					
				case 9:
										if (velha[2][2] == ' ') {
											velha[2][2] = 'O';
											recebe = 1;
										} 
										else {
											System.out.println("ESCOLHA OUTRA OPÇÃO");
											recebe = 0;
										}					
										break;
					
				default:
					System.out.println("DIGITE UMA POSIÇÃO VÁLIDA");
					break;
				}
				
				preenche(velha);
				
				res = campeao(velha); //gambiarra para achar o vencendor 
				if (res == 10) { //caso de vitoria pega vai ser 10 
					return 1;}
				
			}//fim DO
			
			while (recebe != 1);
			
			}//fim do else
			cont++;
		}//while 
		
		return 8;  //caso de empate j vai ser 8
	}

	
	
//FUNÇÃO CAMPEÃO===============================================================================================================================================================
	
	
	public int campeao(char velha[][])
	{
		for(int i=0; i<3; i++) 
		{
	//CASO A VITORIA SEJA POR COLUNAS OU LINHAS
			
			if(((velha[i][0]=='X')&&(velha[i][1]=='X')&&(velha[i][2]=='X'))||((velha[0][i]=='X')&&(velha[1][i]=='X')&&(velha[2][i]=='X')))
			{
				System.out.println("JOGADOR 1 É O VENCEDOR");
				return 10;
			}
			else if(((velha[i][0]=='O')&&(velha[i][1]=='O')&&(velha[i][2]=='O'))||((velha[0][i]=='O')&&(velha[1][i]=='O')&&(velha[2][i]=='O')))
			{
				System.out.println("JOGADOR 2 É O VENCEDOR");
				return 10;
			}
		}
		
	//CASO A VITORIA SEJA PELAS DIAGONAIS
		
		if(((velha[0][0]=='X')&&(velha[1][1]=='X')&&(velha[2][2]=='X'))||((velha[2][0]=='X')&&(velha[1][1]=='X')&&(velha[0][2]=='X')))
		{
			System.out.println("JOGADOR 1 É O VENCEDOR");
			return 10;
		}
		else if(((velha[0][0]=='O')&&(velha[1][1]=='O')&&(velha[2][2]=='O'))||((velha[2][0]=='O')&&(velha[1][1]=='O')&&(velha[0][2]=='O')))
		{
			System.out.println("JOGADOR 2 É O VENCEDOR");
			return 10;
		}	
		
		return 2;
	}
	
//FUNÇÃO EMPATE===============================================================================================================================================================
	
	public void empate(int pega) 
	{
		if (pega == 8) {
			System.out.println("EMPATE");
		}
		
	}
	
	
}
