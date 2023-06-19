package jogo_velha;

import java.util.Scanner;

public class Front_end {

	public static void main(String[] args)
		{
			Scanner scan = new Scanner(System.in);	
			int sair=0;
					
//MENU 			
			
			while(sair!=2)
			{	
				Back_end usuario = new Back_end();
				
				System.out.println("===========SEJA BEM VINDO AO JOGO===========");
				System.out.println("DECIDA QUEM IRA SER X ou O"); //não conseguir pensar em nenhum outro metodo para que o programa decida aleatoriamente talvez exista alguma outra função que eu não saiba, fiz esse programa pensando no modo casual local de game
				System.out.println("LEMBRANDO QUE O X COMEÇA PRIMEIRO");
				System.out.println("(SUGESTÃO TIRAR IMPAR OU PAR)");
								
				
				//chamando as funçoes
						usuario.capita(usuario.getVelha());	
						int pega=usuario.jogadores(usuario.getVelha());
						usuario.empate(pega);
				
				System.out.print("\n");
				System.out.println("1-NOVA PARTIDA");
				System.out.println("2-SAIR");
				
				sair=scan.nextInt();
				
				switch(sair)
						{
							case 1: ;break;
							case 2: ;break;
							default: 
								System.out.println("ERRO OPÇÃO VÁLIDA");						   
						}	
				
			}			
		}
					
}

//depois desse programa realmente entendi os memes de back_end e front_end kkkkk
