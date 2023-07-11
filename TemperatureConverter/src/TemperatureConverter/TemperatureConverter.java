package TemperatureConverter;
import java.util.Scanner;

public class TemperatureConverter {
	public static void main(String[] args) {

		TemperatureConverters temperatureConverter=new TemperatureConverters();
		System.out.printf("%.2f", temperatureConverter.convertFahrenheitToCelsius(68.0));

		}

}

