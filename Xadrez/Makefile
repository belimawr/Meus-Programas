all:  Xadrez.jar

Cavalo.class: Cavalo.java
	javac Cavalo.java

Jogadas.class: Jogadas.java
	javac Jogadas.java

Peca.class: Peca.java
	javac Peca.java

Rei.class: Rei.java
	javac Rei.java

Tabuleiro.class: Tabuleiro.java Jogada_invalida.class
	javac Tabuleiro.java

Jogo.class: Jogo.java Cavalo.class Jogadas.class Peca.class Rei.class Tabuleiro.class
	javac Jogo.java

Jogada_invalida.class : Jogada_invalida.java
	javac Jogada_invalida.java

Xadrez.jar: Jogo.class
	@jar -cvfm Xadrez.jar main-class *.class *.java Makefile
	@rm -f *.class

clean:
	rm -vf *.class


