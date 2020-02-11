// Wind Chill Project: Calculate Wind Chill, 1/29/20, Kian Afkhami

import java.util.Scanner;

public class WindChill {

public static void main(String[] args) {
Scanner input = new Scanner(System.in);
final double NUM1 = 35.74, NUM2 = 0.6215, NUM3 = 35.75, NUM4 = 0.4275;
final double TEMP_MIN = -45, TEMP_MAX = 40, WIND_MIN = 5, WIND_MAX = 60;
double windSpeed, windChill;
double temp;


System.out.println("Wind Chill Calculator\n");
System.out.print("Enter the temperature in Fahrenheit (must be >= -45 and <= 40): ");
temp = input.nextDouble();

if (!(temp >= TEMP_MIN && temp <= TEMP_MAX))
	input.close();

System.out.print("Enter the wind speed (must be >= 5 and <= 60): ");
windSpeed = input.nextDouble();

if(!(windSpeed >= WIND_MIN && windSpeed <= WIND_MAX))
	input.close();

windChill = NUM1 + NUM2 * temp - NUM3* Math.pow(windSpeed, 0.16) + NUM4 * temp * Math.pow(windSpeed, 0.16);

System.out.println("\nWind chill temperature: " + windChill + " degrees Fahrenheit\n");

System.out.println("Programmer: Kian Afkhami");
input.close();


}

}
