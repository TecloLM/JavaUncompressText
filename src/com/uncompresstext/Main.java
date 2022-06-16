package com.uncompresstext;

/*
Escriba un metodo uncompressText(text) que devuelva la versión
descomprimida de un texto de la forma "a3bc4", donde 'a' sería uno de los
caracteres comprimidos y el número a su derecha la cantidad de veces que se
repite. En el caso de aparecer una sola vez, el texto no debería tener un 1 a
su derecha, sino el caracter solo. La versión descomprimida del ejemplo anterior
sería: "aaabcccc".
*/
public class Main {
    public static void main(String[] args) {

        PrintResult(StringUtils.uncompressText("a"),"a");
        PrintResult(StringUtils.uncompressText("ab"),"ab");
        PrintResult(StringUtils.uncompressText("a3bc4"),"aaabcccc");

        PrintResult(StringUtils.uncompressText("a3bc4"),"aaabcccc");
        PrintResult(StringUtils.uncompressText("az5bj8"), "azzzzzbjjjjjjjj");

    }

    public static void PrintResult(String returnResult, String expectedResult) {
        System.out.println("Resultado obtenido:");
        System.out.println(returnResult);
        System.out.println("Resultado esperado:");
        System.out.println(expectedResult);

        System.out.println(returnResult.equals(expectedResult) ? "OK!\n":"not OK!\n");
    }
}
