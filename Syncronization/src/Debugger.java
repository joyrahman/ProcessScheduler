
public class Debugger {
	
	
	public void print(String s)
	{
		System.out.println("[Debug#] "+s);
		
	}
	public void print(int s)
	{
		System.out.println("[Debug#] "+s);
		
	}
	public void print(Process p)
	{
		System.out.println("[Debug#] Trace a Process");
		
		System.out.println("id			:"+p.id);
		System.out.println("status			:"+p.status);
		System.out.println("priority		:"+p.priority);
		System.out.print("Burst History		:");
		for ( Burst b : p.BurstHistory)
		{
			System.out.print("["+b.value+"/"+b.type+"]");
			//System.out.println("[Debug#	Type] 	"+b.type);
		}
		System.out.println();
		System.out.println("cpuWait			:" + p.cpuWait		);	
		System.out.println("ioWait			:" + p.ioWait		);
		System.out.println("startTime		:" + p.startTime	);
		System.out.println("endTime			:" + p.endTime		);	
		System.out.println("responseTime		:" + p.responseTime	);
		System.out.println("queueEntryTime		:" + p.queueEntryTime );
		

		
		
	}

}
