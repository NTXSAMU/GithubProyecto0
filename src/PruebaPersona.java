public class PruebaPersona {
    public static void main(String[]args){
        Persona p1 = new Persona("Samuel","Luque",18,185,"luquemartincastanosamuel@gmail.com", "34895378V");
        Persona p2 = new Persona("Miguel","Recio",18,185,"ntxsamu86@gmail.com", "34895378V");


        if (p1.equals(p2)){
            System.out.println("Las personas tienen el mismo dni");
        }else {
            System.out.println("las personas son distintas");
        }
    }
}
