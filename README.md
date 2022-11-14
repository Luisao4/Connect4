# Connect4


---Guia de execução---

Versões de compiladores/OS/Linguagem:
Javac 1.8.0_292
Openjdk 11.0.11 2021-04-20
Ubuntu 20.04 LTS
Linguagem Utilizada: Java

---------------------||-------------||--------------
Encontram-se 3 pastas, cada uma com o seu objetivo

-->AIvAI possui programas que põem dois AIs a jogarem um contra o outro, com os diversos algoritmos
	-Para executar os programas que utilizam Min-Max ou Alpha-Beta: "java Connect4AIvAIMinMax [Argumento Opcional]"
	ou "java Connect4AIvAIAlphaBeta [Argumento Opcional]".
	No local [Argumento Opcional] pode ser introduzido um inteiro, para definir o limite de profundidade dos algoritmos.
	Se omitir este argumento, o programa irá utilizar a profundidade default de 6

	-Para executar o programa que utiliza Monte Carlo Search: "java Connect4AIvAIMonteCarlo [Argumento Opcional]".
	No local de [Argumento Opcional] pode ser introduzido um inteiro, para definir o tempo limite de execução do algoritmo, em segundos.
	Se omitir este argumento, o programa irá utilizar o tempo default de 2 segundos.

-->SinglePlayer possui programas que utilizam os AIs como oponentes do utilizador
	-Para executar os programas que utilizam Min-Max ou Alpha-Beta: "java Connect4SinglePlayerMinMax [Argumento Opcional]"
	ou "java Connect4SinglePlayerAlphaBeta [Argumento opcional]".
	No local [Argumento Opcional] pode ser introduzido um inteiro, para definir o limite de profundidade dos algoritmos.
	Se omitir este argumento, o programa irá utilizar a profundidade default de 6

	-Para executar o programa que utiliza Monte Carlo Search: "java Connect4SinglePlayerMonteCarlo [Argumento Opcional]".
	No local de [Argumento Opcional] pode ser introduzido um inteiro, para definir o tempo limite de execução do algoritmo, em segundos.
	Se omitir este argumento, o programa irá utilizar o tempo default de 2 segundos.

	\--Colocação de Peças--/
	-Para selecionar a coluna onde pretende colocar a sua peça, basta introduzir um número de 1 a 7. Se a jogada for válida, será introduzida.
	Após a sua jogada, o algoritmo do programa respetivo irá atuar.
	Este ciclo irá repetir-se até o tabuleiro estiver cheio sem vencedores, ou até um dos jogadores vencer, o utilizador ou o AI.


-->TwoPlayer possui um programa que possibilita dois utilizadores jogarem um contra o outro
	-Para executar: "java Connect4TwoPlayer"
