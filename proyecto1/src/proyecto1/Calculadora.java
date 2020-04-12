/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto1;

/**
 *
 * @author NURIA
 */
public class Calculadora {

private int num1;
private int num2;
/* Comentario para el Ejercicio 5
*/
public Calculadora (int a, int b){
num1=a;
num2=b;
}

public int suma(){
int result=num1+num2;
return result;
}

public int resta(){
int result= num1-num2;
return result;
}

public int multiplicar(){
int result= num1*num2;
return result;
}

public int division(){
int result= num1/num2;
return result;
}
}

