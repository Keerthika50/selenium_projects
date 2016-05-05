package projects;



import projects.TempConvertStub.CelsiusToFahrenheit;
import projects.TempConvertStub.CelsiusToFahrenheitResponse;
import projects.TempConvertStub.FahrenheitToCelsius;
import projects.TempConvertStub.FahrenheitToCelsiusResponse;

public class Axis2ontemp {

	/**
	 * Axis2 program to convet temperature...
	 * @throws Exception 
	 */
	public static void main(String[] args) throws Exception {
		TempConvertStub tr=new TempConvertStub("http://www.w3schools.com/xml/tempconvert.asmx?WSDL");
		
		//convert Fahrenheit To Celsius
		
		FahrenheitToCelsius fc=new FahrenheitToCelsius();
		fc.setFahrenheit("100");
		FahrenheitToCelsiusResponse fcr=tr.fahrenheitToCelsius(fc);
		System.out.println(fcr.getFahrenheitToCelsiusResult());
		
		//convert Celsius To Fahrenheit
		
		CelsiusToFahrenheit cr=new CelsiusToFahrenheit();
		cr.setCelsius("35");
		CelsiusToFahrenheitResponse ccr=tr.celsiusToFahrenheit(cr);
		System.out.println(ccr.getCelsiusToFahrenheitResult());
		
		
		

	}

}
