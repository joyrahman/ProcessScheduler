
public class Helper {

	String t_algorithm	="FIFO";
	int t_quantum   	= 0;
	String t_input 		= "input.txt";

	Helper(String[] args){
		
		/*setting default values*/

		
		/*If the input has less elements*/
		if(args.length<1)
		{
			System.out.println("prog -alg [FIFO|SJF|PR|RR] [-quantum [integer(ms)]] -input [file name]");
		}
		/*If the input has alg,quantum and input file name*/
		else if (args.length>=6){
			if(!args[1].equals("")) {	this.t_algorithm 	=args [1];}
			
			try{
				if(!args[3].equals("")) 
					{	
						this.t_quantum 		=Integer.parseInt(args [3]);
					}
				}
			catch(NumberFormatException e) 
				{
					System.out.println("Invalid Input");
				}
			
			
			if(!args[5].equals("")) {	this.t_input 		=args [5];}
		}
		
		/*If the input has only alg and input file Name*/
		else if (args.length==4){
			if(!args[1].equals("")) {	this.t_algorithm 	=args [1];}		
			if(!args[3].equals("")) {	this.t_input 		=args [3];}
			
		}
		
	}
	
	public String getValue(String param)
	{
		String returnVal="";
		/*If the input has less elements*/
//		if(t_args.length<1)
//		{
//			System.out.println("prog -alg [FIFO|SJF|PR|RR] [-quantum [integer(ms)]] -input [file name]");
//		}
//		else if (t_args.length>=6){
//			if(!t_args[1].equals("")) algorithm 	=args [1];
//			if(!args[3].equals("")) quantum 	=Integer.parseInt(args [3]);		
//			if(!args[5].equals("")) input 		=args [5];
//		}
//		else if (args.length==4){
//			if(!args[1].equals("")) algorithm 	=args [1];		
//			if(!args[3].equals("")) input 		=args [3];
//			
//		}
		
//		/*Stroe the value for debug*/
//		this.t_algorithm 	= algorithm;
//		this.t_quantum	  	= quantum;
//		this.t_input 		= input;	

		switch(param)
		{
		case "alg":
			returnVal =  this.t_algorithm;
			break;
//		case "quantum":
//			returnVal =  this.t_quantum;
//			break;
		case "input":
			returnVal = this.t_input;
			break;
		}
		
		return returnVal;
	}
	
	public int getQuantum()
	{
		
		return this.t_quantum;
		
	}
	
	public void debugInput()
	{
		//System.out.println(args.length);
		System.out.println("Input File Name		: "+this.t_input);
		System.out.println("CPU Scheduling Alg	: "+this.t_algorithm);
		System.out.println("CPU Quantum			: "+this.t_quantum);
	}
//	public void debugInput(String algorithm, int quantum,String input)
//	{
//		//System.out.println(args.length);
//		System.out.println("Input File Name		: "+input);
//		System.out.println("CPU Scheduling Alg	: "+algorithm);
//		System.out.println("CPU Quantum			: "+quantum);
//	}
	
	
	
		
}
