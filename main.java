import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
		Engineer e[]=new Engineer[3];
		
		for(int i=0;i<3;i++){
		    e[i]=new Engineer();
    		e[i].getDetails();
		}
		
		for(int i=0;i<3;i++){
		    e[i].putDetails();
		}
    		
		Doctor d[]=new Doctor[3];
		
		for(int i=0;i<3;i++){
		    d[i]=new Doctor();
    		d[i].getDetails();
		}
		
		for(int i=0;i<3;i++){
		    d[i].putDetails();
		}

        
        Pilot p[]=new Pilot[3];
        
        for(int i=0;i<3;i++){
		    p[i]=new Pilot();
    		p[i].getDetails();
		}
		
		for(int i=0;i<3;i++){
		    p[i].putDetails();
		}
        
	}
}