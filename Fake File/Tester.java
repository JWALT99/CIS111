public class Tester
{
	public static void main(String[] args)
	{

		Name[] TurtleLineup = new Name[10];
		Name[] FishLineup = new Name[10];
		String report;
		int NumOfErrors;
	
		// and starting on the field today are ...
		TurtleLineup[0] = new Name("Pete", "Smith");
		TurtleLineup[1] = new Name("sallly", "Smith");
		TurtleLineup[2] = new Name("joe", "Smith");
		FishLineup[0] = new Name("alfie", "Smith");
		FishLineup[1] = new Name("dick", "Smith");
		FishLineup[2] = new Name("ann", "Smith");


		//oops, sorry! forgot that Smith got married. Name change here ! 
		FishLineup[1].gotModernMarried("Martin");
	
		

		LittleLeagueGame OpeningDay = new LittleLeagueGame("Turtles" ,"Fish", 6, 5, false, TurtleLineup, FishLineup);

		System.out.println("oh it was a great game! There were only " + OpeningDay.ErrorCount() +" errors in the game today.\n\n\n");

	
		// print report to the screen 
		report = OpeningDay.toString();

		System.out.println(report);

		}

}