package customExceptions;

public class StudentNotExistException extends Exception{
	
	private String id;
	
	public StudentNotExistException(String identification) {
		
		id=identification;
		
	}
	
	public String getMessage() {
		
		String mensaje = "";
		
		if(id==null) {
			mensaje = "El Estudiante no existe. "; 
		}
		
		return mensaje;
				
	}

}
