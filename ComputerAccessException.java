package Curency;

public class ComputerAccessException extends Exception {
	
	public ComputerAccessException(Throwable e) { 
        initCause(e); 
    } 

}
