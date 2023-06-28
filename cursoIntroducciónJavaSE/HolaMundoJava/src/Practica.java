public class Practica
{
    public static void main(String[] args)
    {
        /*
        Ejercicio 1.
        Ponte creativo y preséntanos a tu familia con variables, utiliza todos los tipos
        y cantidad de variables que puedas, no olvides las convenciones de nombres Camel Case.
         */
        String MY_NAME = "Orlando";
        String MOM_NAME = "Alba";
        String FATHER_NAME = "Diego";
        String Brother_NAME = "Diego Junior";
        String GRANDMOTHER_NAME = "Emma";

        int myAge = 23;
        int momAge = 42;
        int fatherAge = 45;
        int brotherAge = 13;
        int grandmotherAge = 82;

        //Aqui imprimo
        System.out.println("Hola les presento a mi familia");
        System.out.println("Esta soy yo:"+ MY_NAME + "y tengo " +  myAge);
        System.out.println("Ella es mi madre" + MOM_NAME + "y tiene" + momAge);
        System.out.println("El es mi padre" + FATHER_NAME + "y tiene"+ fatherAge);
        System.out.println("El es mi hermano" + Brother_NAME + "y tiene" + brotherAge);
        System.out.println("Ella es mi abuela" + GRANDMOTHER_NAME + "y tiene" + grandmotherAge);

        /*
        Ejercicio 2

        Usando los dos tipos de casting que aprendiste (implícito y explícito), resuelve los
        siguientes casteos indicando qué tipo es y si se está calculando estimación o exactitud.
         */
        char c = 'z'; //Convierto a int
        int i1 = 250; //Convierto a Long y luego de Long a short
        double d1 = 301.067; //Convierto a Long
        int i2 = 100; //Sumo 5000.66 y convierto a float
        int i3 = 737; // Multiplico por 100 y convierto a bytes
        double d2 = 298.638; //Divido entre 25 y lo convierto a long

        //Conversion
        int cI = (int) c; //#1

        //int>> short >> long
        short iS = (short)i1;
        long iL = iS; //#2

        long dL = (long)d1; //#3

        float iF = (float)i2; //#4 //+5000.66;

        byte iB = (byte)i3; //#5 //*100

        long d2L = (long) d2 / 25;

        //out

        System.out.println(cI);
        System.out.println(iS);
        System.out.println(iL);
        System.out.println(iL);
        System.out.println(dL);
        System.out.println(iF+5000.66);
        System.out.println(iB*100);
        System.out.println(d2L);
    }
}