public class UpdatingVariable
{
    public static void main(String[] args)
    {
        int salary = 1000;
        System.out.println(salary);

        //bono: $200
        salary += 200;
        System.out.println(salary);

        //pension: $50 descuento
        salary -= 50;
        System.out.println(salary);

        //2 horas extra $30 c/u
        //Comida: $45
        salary = salary + (30*2) - 45;
        System.out.println(salary);

        //Actualizando cadenas de texto
        String employeeName = "Orlando Narvaez";
        employeeName = employeeName + " Baracaldo";
        System.out.println(employeeName);

        employeeName = "Chacho = " + employeeName;
        System.out.println(employeeName);
    }
}
