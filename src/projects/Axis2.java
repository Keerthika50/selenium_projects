package projects;

import projects.CalculatorStub.Add;
import projects.CalculatorStub.AddResponse;
import projects.CalculatorStub.Divide;
import projects.CalculatorStub.DivideResponse;
import projects.CalculatorStub.Multiply;
import projects.CalculatorStub.MultiplyResponse;
import projects.CalculatorStub.Subtract;
import projects.CalculatorStub.SubtractResponse;




public class Axis2 {

	/**
	 * Program on calculator
	 * @throws Exception 
	 */
	public static void main(String[] args) throws Exception {
		CalculatorStub cr=new CalculatorStub("http://www.dneonline.com/calculator.asmx?WSDL");
		
		//Add req and res..
		
		Add a=new Add();
		a.setIntA(90);
		a.setIntB(76);
		AddResponse ar=cr.add(a);
		System.out.println(ar.getAddResult());
		
		//subtract req and res..
		
		Subtract s=new Subtract();
		s.setIntA(76);
		s.setIntB(43);
		SubtractResponse sr=cr.subtract(s);
		System.out.println(sr.getSubtractResult());
		
		//Multiply req and res..
		
		Multiply m=new Multiply();
		m.setIntA(80);
		m.setIntB(23);
		MultiplyResponse mr=cr.multiply(m);
		System.out.println(mr.getMultiplyResult());
		
		//Divide req and res..
		
		Divide d=new Divide();
		d.setIntA(76);
		d.setIntB(23);
		DivideResponse dr=cr.divide(d);
		System.out.println(dr.getDivideResult());
		
	}
}