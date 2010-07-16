all: SMS.jar

Comsumidor_SMS.class: Comsumidor_SMS.java FilaPC.class Mensagem.class
	javac Comsumidor_SMS.java

Fila.class: Fila.java
	javac Fila.java

FilaPC.class: FilaPC.java Fila.class
	javac FilaPC.java

Mensagem.class: Mensagem.java
	javac Mensagem.java

Produtor_SMS.class: Produtor_SMS.java FilaPC.class Mensagem.class
	javac Produtor_SMS.java

CentralSMS.class: CentralSMS.java Produtor_SMS.class Comsumidor_SMS.class
	javac CentralSMS.java

Testes_SMS.class: Testes_SMS.java CentralSMS.class
	javac Testes_SMS.java

SMS.jar: Testes_SMS.class
	@jar -cvfm SMS.jar main-class *.class *.java Makefile main-class
	@rm -f *.class

clean: 
	@rm -vf *.class
