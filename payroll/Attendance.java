package project.payroll;

public class Attendance {
	   int leave = (int) (Math.random() * 9); 
	   
	   public int empleave() {
		   int random = leave;
               System.out.println("Took "+ random +" days off this month");
		   if (random == 0) {
			   System.out.println("Are you sure you're not secretly a superhero? Because this dedication is superhuman!");
		   }else {
		       System.out.println("When you skip work like it’s your day off, but your paycheck hits harder than Monday morning!");
		   }
		return random;
	   }    
	 
}
