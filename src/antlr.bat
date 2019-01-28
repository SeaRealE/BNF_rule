java -jar antlr-4.7-complete.jar BnfGm.g4
javac -cp .;antlr-4.7-complete.jar *.java
java -cp .;antlr-4.7-complete.jar org.antlr.v4.gui.TestRig BnfGm prog -gui input.txt
pause