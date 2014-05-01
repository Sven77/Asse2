import javax.swing.JOptionPane;


public class Service {

	
	public Service() 
	{
		
	}
	
	public void ServiceDue(double kilometers, int TotalServices) {
	
		if (kilometers >=1)
		{
			JOptionPane.showMessageDialog(null,"This vehicle has travelled " + kilometers + "kilometers");
		}
		else
		{
			JOptionPane.showMessageDialog(null, "No travel has been recorded yet.");
		}
		if (TotalServices>=1)
		{
			JOptionPane.showMessageDialog(null,"The vehicle was last serviced at " + kilometers + "kilometers");
		}
		
		
		
		
		
		
		
	}

}
