//import java.sql.Date;
import java.util.LinkedList;
import java.util.Date;
//import java.util.EnumSet;
//
//enum Status{
//	private int value;
//	READY(0),RUNNING(1),WAITING(2);
//	private Status(final int value)
//	{
//		this.value = value;
//		
//	}
//	public int getStaus()
//	{
//		
//		return this.value;
//	}
//} 


public class Process {
	int id;
	int status; 							//{ 0 : ready | 1 : running | 2 : waiting }
	int priority;
	LinkedList<Burst> BurstHistory;
	int cpuWait;
	int ioWait;
	int startTime;
	int endTime;
	int responseTime;
	int queueEntryTime;
	
	Process(String s)
	{
		// S has the format proc 1 10 20 10 50 20 40 10
		String[] parts = s.split(" ");
		BurstHistory = new LinkedList<Burst>();
		this.priority = Integer.parseInt(parts[0]); 
		for (int i=1;i<parts.length;i++)
		{
			int v = Integer.parseInt(parts[i]);
			int t = 1;
			if(i%2==0)	{ t = 2;}
			Burst t_burst = new Burst(v,t);
			BurstHistory.add(t_burst);
			
			
		}
		this.status = 0;
		Date date = new Date();
		this.id =  (int) (date.getTime()/100000);

		cpuWait			=0;
		ioWait			=0;
		startTime		=0;
		endTime			=0;
		responseTime	=0;
		queueEntryTime	=0;

		//BurstHistory.add(burst);
		
		
	}

}
