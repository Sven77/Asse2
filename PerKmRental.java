
public class PerKmRental {
	
int costperday = 1;
Journey km = new Journey();
double kilometers = km.getKilometers();

	
public double getPrice(double kilometers)
{		
	return kilometers * costperday;					
}

}
	
		
	