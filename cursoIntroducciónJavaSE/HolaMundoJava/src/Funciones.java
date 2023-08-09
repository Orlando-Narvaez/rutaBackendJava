public class Funciones
{
    public static void main(String[] args)
    {
        double x = 2.1;
        double y = 3;

        //Area de un circulo
        //pi * r2
        double area = circleArea(y);
        System.out.println(area);

        //Area de una esfera
        //4*PI*r2
        double areaEsfera = sphereArea(y);
        System.out.println(areaEsfera);

        //Volumen de una esfera
        //(4/3)*pi * r3
        double valumenEsfera = 2;
    }

    public static double circleArea(double r)
    {
        return Math.PI * Math.pow(r,2);
    }

    public static double sphereArea(double r)
    {
        return 4 * Math.PI * Math.pow(r,2);
    }

    public static double sphereVolumen(double r)
    {
        return (4/3) * Math.PI * Math.pow(y,3);
    }
}