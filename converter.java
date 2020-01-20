public class Converter {
//Your names go here:
/*
* @Author: Long Tran
* Name of the second student
* Abid Al Labib
*
*/
private double celsiusToFahrenheit(double C){
return ((C* 9/5) + 32);
}
private double fahrenheitToCelsius(double F){
 return ((5/9) x (F-32));
}
    public static void main(String[] args) {
        Converter myObject= new Converter();
        double fahrenheit=myObject.celsiusToFahrenheit(180);
        System.out.println(fahrenheit);
        double celsius=myObject.fahrenheitToCelsius(250);
        System.out.println(celsius);
    }
}

