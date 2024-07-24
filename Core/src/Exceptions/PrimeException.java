package Exceptions;

public class PrimeException extends Exception{

	String s;
	public PrimeException(String s)
	{
		this.s=s;
	}
	@Override
	public String toString() {
		return "PrimeException " + s + "";
	}
	

}
