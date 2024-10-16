package karthik_java_project;

public class Switch_statement {

	public static void main(String[] args)
	{     // METHOD 1
		// TODO Auto-generated method stub
		String s="tuesday";
		switch(s) {
		case "monday":
			System.out.println("monday");
		    break;
		case "tuesday":
			System.out.println("tuesday");
			break;
		case "wednesday":
			System.out.println("wednesday");
			break;
		case "thursday":
		    System.out.println("thursday");
		    break;
		   default:
			   System.out.println("no choice");
			   }
	/**---------------------------------------------------------------------------------------------------------------------	
	METHOD 2
		String k = "tuesday";
		switch(k)
		{
		case "monday"->System.out.println("monday");//"->" using for without break statement to execute program
		case "tuesday"->System.out.println("tuesday");
		case "wednesday"->System.out.println("wednesday");
		case "thursday"->System.out.println("thursday");
		case "friday"->System.out.println("friday");
		default->System.out.println("no choice");
		}
	}*/	
	/*------------------------------------------------------------------------------------------------------------------------
	 METHOD 3
	String i="monday";-
	String result="";  
	result = switch(i){
	case "sunday":yield"sun";
	case "monday": yield"mon";
	case "tuesday": yield "tues";
	case "wednesday": yield"wednes";
	case "thursday":yield"thurs";
	default :yield"no choice";
	}*/
	
}

}
