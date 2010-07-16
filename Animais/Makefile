.PHONY: clean exec

all: Animais.jar

Animais.class: Animais.java
	@javac Animais.java

Ave.class: Ave.java
	@javac Ave.java

Mamifero.class: Mamifero.java
	@javac Mamifero.java

Reptil.class: Reptil.java
	@javac Reptil.java

Zologico.class: Zologico.java Animais.class Ave.class Mamifero.class Reptil.class
	@javac Zologico.java

Animais.jar: Zologico.class
	@jar -cvfm Animais.jar main-class *.class *.java Makefile
	@rm -f *.class

clean:
	@rm -vf *.class *.jar

exec:
	@java -jar Animais.jar
