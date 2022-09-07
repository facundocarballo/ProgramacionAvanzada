
import java.util.GregorianCalendar;
import java.util.Calendar;

public class ArchivoProfe {
	
	public static long metodo1(long n){
		if(n<3) return -1;
		for(long i=2; i<=n; i++){
			long sumaIzq=0;
			for (long j=1; j<i;j++)
				sumaIzq+=j;
			long sumaDer=0;
			for (long k=i+1; k<=n;k++)
				sumaDer+=k;
			if(sumaDer==sumaIzq)return i;
		}
		return -1;

	}

	public static long metodo2(long n){
		if(n<3) return -1;

		for(long i=1; i<=n; i++){
			long sumaIzq=i*(i-1)/2;
			long sumaDer=(n*(n+1)/2-i*(i+1)/2);
			if(sumaDer==sumaIzq)return i;

		}
		return -1;

	}

	public static long metodo3(long n){
		if(n<3) return -1;

		double i= Math.sqrt((Math.pow(n, 2)+n)/2);
		long entera=(long)i;
		if((i-entera) == 0) return (long) i;

		return -1;

	}



	public static void main(String[] args) {
		
//	      6         8
//	      35        49
//	     204       288
//	    1189      1681
//	    6930      9800
//	   40391     57121
//	  235416    332928
//	 1372105   1940449
//	 7997214  11309768
//	46611179  65918161
		
		//long n= 57121;
		long n= 332928;
		//long n= 1940449;
		
		Calendar tIni = new GregorianCalendar();
		System.out.println(metodo3(n));
		Calendar tFin = new GregorianCalendar();
		long diff = tFin.getTimeInMillis()-tIni.getTimeInMillis();
		System.out.println("Tiempo de ejecución del metodo 3  "+diff);
		System.out.println("-----------------------------------------");

		tIni = new GregorianCalendar();
		System.out.println(metodo2(n));
		tFin = new GregorianCalendar();
		diff = tFin.getTimeInMillis()-tIni.getTimeInMillis();
		System.out.println("Tiempo de ejecución del metodo2  "+diff);
		System.out.println("-----------------------------------------");

		tIni = new GregorianCalendar();
		System.out.println(metodo1(n));
		tFin = new GregorianCalendar();
		diff = tFin.getTimeInMillis()-tIni.getTimeInMillis();
		System.out.println("Tiempo de ejecución del metodo 1  "+diff);
				
	}

}

//1+2+3+4+5+6+7+8=36 == 8*9/2
//1+2+3+4+5+6=21 == 6*7/2
//1+2+3+4+5=15 36-21=15
