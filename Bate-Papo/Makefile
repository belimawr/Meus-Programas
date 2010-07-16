all: Servidor.jar Cliente.jar
	@rm *.class

Fila.class: Fila.java
	javac Fila.java

Mensagem.class: Mensagem.java
	javac Mensagem.java

Conecxao_Cliente.class: Conecxao_Cliente.java Mensagem.class Fila.class
	javac Conecxao_Cliente.java

Servidor.class: Servidor.java Conecxao_Cliente.class Fila.class Mensagem.class Consumidor.class
	javac Servidor.java

Consumidor.class: Consumidor.java Fila.class Mensagem.class Conecxao_Cliente.class 

Server_chat.class: Servidor.class Server_chat.java
	javac Server_chat.java

Escrevedor.class: Escrevedor.java
	javac Escrevedor.java

Cliente.class: Cliente.java Escrevedor.class
	javac Cliente.java

Servidor.jar: Mensagem.class Conecxao_Cliente.class Servidor.class Consumidor.class Server_chat.class 
	@jar -cvfm Servidor.jar main-servidor Fila.class Mensagem.class Conecxao_Cliente.class Servidor.class Consumidor.class Server_chat.class *.java Makefile main-servidor

Cliente.jar: Cliente.class Escrevedor.class 
	@jar -cvfm Cliente.jar main-cliente Cliente.class Escrevedor.class Makefile *.java main-cliente

clean:
	@rm -vf *.class

