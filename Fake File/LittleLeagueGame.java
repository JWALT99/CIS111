public class LittleLeagueGame
{

   //data
   private String teamHome;
   private String teamAway;
   private int scoreHome;
   private int scoreAway;
   private boolean warm;
   private Name[] homeRoster = new Name[10];
   private Name[] awayRoster = new Name[10];
   
   //constructors
   public LittleLeagueGame(String teamHome, String teamAway, int scoreHome, int scoreAway, boolean warm, Name[] homeRoster, Name[] awayRoster)
   {
      this.teamHome = teamHome;
      this.teamAway = teamAway;
      this.scoreHome = scoreHome;
      this.scoreAway = scoreAway;
      this.warm = warm;
      this.homeRoster = homeRoster;
      this.awayRoster = awayRoster;
   }
   
   public int ErrorCount()
   {
      int NumOfErrors = 0;
      
      if(warm==true)
      {
         NumOfErrors = Math.abs(scoreHome - scoreAway);
      } else {
         NumOfErrors = Math.abs(scoreHome - scoreAway)*7;
      }
      
      return NumOfErrors;     
      
   }
   
   //toString
   public String toString()
   {
      
      String answer = "";
      answer = "Game day for " + teamAway + " vs " + teamHome;
      answer += ". On this " + warm + " day, the final score was " + scoreAway + " to " + scoreHome;
      
      answer += "The lineup for the away team was ";
      
      for (int i = 0; i < awayRoster.length; i++)
      {
         answer += awayRoster[i].lastFirst();
         answer += "/n";
      }   
      
      if(warm == true)
         answer += "Hot day the final score was ";
      else
         answer += "Chilly day the final score was ";   
      
      
      
      return answer;   
   
   
   
   }     
   
}     
