public class Solution {
    /*
      Utilizamo sel método static sayHi() para declarar una metodo que pertenece a la clase Solution
      y utilizamos la palabra void para indicar que el método no va a devolver nada
    */
    static void sayHi (String hi){
        System.out.println(hi);
    }

    public static void main(String[] args){
        sayHi("Hello World!");
    }
}
