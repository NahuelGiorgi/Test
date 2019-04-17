package ar.edu.unlam.pb2.dado;

public class dado {
	Integer numeroDeCara; 
	
	public Integer lanzarDado() {
		numeroDeCara =(int) (Math.random()*7);
		if(numeroDeCara == 0) {
			numeroDeCara = 1;
		}
		return numeroDeCara;
	}
	

	}

