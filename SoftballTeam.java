import java.util.Scanner;
import java.io.File;
import java.io.IOException;
import java.util.Arrays;
import java.text.DecimalFormat;  
/**
* class represents team of softball players 
* and includes special methods.
*/
public class SoftballTeam {
   private String teamName = "";
   private SoftballPlayer[] roster = new SoftballPlayer[24];
   private int playerCount = 0;
   private String[] excludedRecords = new String[30];
   private int excludedCount = 0;
   private int ignoredCount = 0;
   private static int teamCount = 0;
   
   /** Sets Maximum number of players per team. **/
   public static final int MAX_PLAYERS = 24;
   /** Sets Maximum number of players that can fit on 
   the excluded list. **/
   public static final int MAX_EXCLUDED = 30;
   
   /**
   * Serves as Contructor for SoftballTeam class.
   */
   public SoftballTeam() {
      teamCount++;
   }
   
   /**
   * @return String representing the team name.
   */
   public String getTeamName() {
      return teamName;
   }
   
   /**
   * @param teamNameIn String representing inputed team name.
   */
   public void setTeamName(String teamNameIn) {
      teamName = teamNameIn;
   }
   
   /**
   * @return SoftballPlayer array associated with the roster.
   */
   public SoftballPlayer[] getRoster() {
      return roster;
   }
   
   /**
   * @param sftBallArrayIn SoftballPlayer array representing team roster.
   */
   public void setRoster(SoftballPlayer[] sftBallArrayIn) {
      roster = sftBallArrayIn;
   }
   
   /**
   * @return current value of playerCount.
   */
   public int getPlayerCount() {
      return playerCount;
   }
   
   /**
   * @param pCountIn int representing playerCount for the roster.
   */
   public void setPlayerCount(int pCountIn) {
      playerCount = pCountIn;
   }
   
   /**
   * @return String array representing excluded results.
   */
   public String[] getExcludedRecords() {
      return excludedRecords;
   }
   
   /**
   * @param excludedRecordsIn String[] representing excludedRecords.
   */
   public void setExcludedRecords(String[] excludedRecordsIn) {
      excludedRecords = excludedRecordsIn;
   }
   
   /**
   * @return int representing current count of excluded records.
   */
   public int getExcludedCount() {
      return excludedCount;
   }
   
   /**
   * @param excludedNum int representing number of excluded records.
   * Cannot be greater than 30.
   */
   public void setExcludedCount(int excludedNum) {
      excludedCount = excludedNum;
   }
   
   /**
   * @return int representing ignoredCount.
   */
   public int getIgnoredCount() {
      return ignoredCount;
   }
   
   /**
   * @param ignoreCountIn int representing number of ignored records.
   */
   public void setIgnoredCount(int ignoreCountIn) {
      ignoredCount = ignoreCountIn;
   }
   
   /**
   * @return current value of teamCount.
   */
   public static int getTeamCount() {
      return teamCount;
   }
   
   /**
   * Sets teamCount to 0.
   */
   public static void resetTeamCount() {
      teamCount = 0;
   }
   
   /**
   * Reads file and creates a team.
   * @param file String representing file name.
   * @throws IOException if file does not exist.
   */
   public void readPlayerFile(String file) throws IOException {
      String nameOfTeam = "";
      String playerNumber = "";
      String playerName = "";
      String playerPosition = "";
      String playerCategory = ""; // based on O, I, P, RP.
      double playerSpec = 0.0;
      double playerBatting = 0.0;
      int pitcherWins = 0;
      int pitcherLosses = 0;
      double pitcherERA = 0.0;
      double playerOutfielding = 0.0;
      double playerInfielding = 0.0;
      int pitcherSaves = 0;
      
      Scanner theFile = new Scanner(new File(file));
      teamName = theFile.nextLine();
      
      while (theFile.hasNext()) {
         String player = theFile.nextLine();
         try {
            
         
         //if (playerCount < MAX_PLAYERS) {
            Scanner playerLine = new Scanner(player).useDelimiter(",");
         // use Delimiter?
         
            playerCategory = playerLine.next().toUpperCase();
            playerNumber = playerLine.next();
            playerName = playerLine.next();
            playerPosition = playerLine.next().toUpperCase();
            playerSpec = Double.parseDouble(playerLine.next());
            playerBatting = Double.parseDouble(playerLine.next());
         
            if (playerCategory.equals("O")) { // Outfielder
               playerOutfielding = Double.parseDouble(playerLine.next());
               SoftballPlayer sp = new Outfielder(playerNumber, 
                     playerName, playerPosition, 
                     playerSpec, playerBatting, playerOutfielding);
                     
               if (playerCount < MAX_PLAYERS) {
                  roster[playerCount] = sp;
                  playerCount++;
               }
               else if (excludedCount < MAX_EXCLUDED) {
                  excludedRecords[excludedCount] = "Maximum player "
                     + "count of 24 exceeded for: " + player;
                  excludedCount++; 
               }
               else {
                  ignoredCount++;
               }
            }
               
            else if (playerCategory.equals("I")) { // Infielder
               playerInfielding = Double.parseDouble(playerLine.next());
               SoftballPlayer ip = new Infielder(playerNumber, 
                     playerName, playerPosition, playerSpec, 
                     playerBatting, playerInfielding);
               if (playerCount < MAX_PLAYERS) {
                  roster[playerCount] = ip;
                  playerCount++;
               }
               else if (excludedCount < MAX_EXCLUDED) {
                  excludedRecords[excludedCount] = "Maximum player count"
                     + " of 24 exceeded for: " + player;
                  excludedCount++; 
               }
               else {
                  ignoredCount++;
               }
            }
                  
            else if (playerCategory.equals("P")) { // Pitcher
               pitcherWins = playerLine.nextInt();
               pitcherLosses = playerLine.nextInt();
               pitcherERA = Double.parseDouble(playerLine.next());
               SoftballPlayer p = new Pitcher(playerNumber, 
                     playerName, playerPosition, playerSpec, 
                     playerBatting, pitcherWins, pitcherLosses, pitcherERA);
               
               if (playerCount < MAX_PLAYERS) {
                  roster[playerCount] = p;
                  playerCount++;
               }
               else if (excludedCount < MAX_EXCLUDED) {
                  excludedRecords[excludedCount] = "Maximum player "
                     + "count of 24 exceeded for: " + player;
                  excludedCount++; 
               }
               else {
                  ignoredCount++;
               }
            }
                  
            else if (playerCategory.equals("R")) { // Relief Pitcher
               pitcherWins = playerLine.nextInt();
               pitcherLosses = playerLine.nextInt();
               pitcherERA = Double.parseDouble(playerLine.next());
               pitcherSaves = playerLine.nextInt();
               SoftballPlayer rp = new ReliefPitcher(playerNumber, 
                     playerName, playerPosition, playerSpec, 
                     playerBatting, pitcherWins, pitcherLosses, pitcherERA,
                     pitcherSaves); 
               if (playerCount < MAX_PLAYERS) {
                  roster[playerCount] = rp;
                  playerCount++;
               }
               else if (excludedCount < MAX_EXCLUDED) {
                  excludedRecords[excludedCount] = "Maximum player "
                     + "count of 24 exceeded for: " + player;
                  excludedCount++; 
               }
               else {
                  ignoredCount++;
               }
            }
            else {
               throw new InvalidCategoryException(playerCategory);
            }
         }
         catch (InvalidCategoryException e) { // Invalid Code
            
            if (excludedCount < MAX_EXCLUDED) {
               excludedRecords[excludedCount] 
                     = e + " in: " + player;
               excludedCount++;
            }
            else {
               ignoredCount++;
            }
         }
         catch (NumberFormatException e) {
            if (excludedCount < MAX_EXCLUDED) {
               excludedRecords[excludedCount] 
                     = e + " in: " + player;
               excludedCount++;
            }
            else {
               ignoredCount++;
            }
         }
      }
   }
   
   /**
   * Processes roster array using original order.
   * @return String representing Team Report.
   */
   public String generateReport() {
      SoftballPlayer[] report 
         = Arrays.copyOf(roster, playerCount);
      String output = "\n---------------------------------------"
         + "\nTeam Report for " + teamName + "\n" 
         + "---------------------------------------\n\n";
      for (int i = 0; i < playerCount; i++) {
         output += report[i].toString() + "\n\n";
      }
      return output;
   }
   
   /**
   * @return String representing Team Report by player number
   */
   public String generateReportByNumber() {
      SoftballPlayer[] numberReport 
            = Arrays.copyOf(roster, playerCount);
      Arrays.sort(numberReport);
      String report = "\n---------------------------------------"
         + "\nTeam Report for " + teamName + " (by Number)\n"
         + "---------------------------------------\n";
      for (int k = 0; k < playerCount; k++) {
         report += numberReport[k].getNumber() 
            + " " + numberReport[k].getName() 
            + " " + numberReport[k].getPosition()
            + " " + numberReport[k].stats() + "\n";
      }
      return report;
   }
   
   /**
   * @return String representing Team Report by name.
   */
   public String generateReportByName() {
      SoftballPlayer[] nameReport 
            = Arrays.copyOf(roster, playerCount);
      Arrays.sort(nameReport, new NameComparator());
      String report = "\n---------------------------------------"
         + "\nTeam Report for " + teamName + " (by Name)\n"
         + "---------------------------------------\n";
      for (int k = 0; k < playerCount; k++) {
         report += nameReport[k].getNumber() 
            + " " + nameReport[k].getName() + " " + nameReport[k].getPosition()
            + " " + nameReport[k].stats() + "\n";
      }
      return report;
   }
   
   /**
   * @return String representing Team Report by rating.
   */
   public String generateReportByRating() {
      DecimalFormat df = new DecimalFormat("0.000");
      SoftballPlayer[] ratingReport 
            = Arrays.copyOf(roster, playerCount);
      Arrays.sort(ratingReport, new RatingComparator());
      String report = "\n---------------------------------------"
         + "\nTeam Report for " + teamName + " (by Rating)\n"
         + "---------------------------------------\n";
      for (int k = 0; k < playerCount; k++) {
         report += df.format(ratingReport[k].rating()) 
            + " " + ratingReport[k].getNumber() 
            + " " + ratingReport[k].getName() 
            + " " + ratingReport[k].getPosition()
            + " " + ratingReport[k].stats() + "\n";
      }
      return report;
   }
   
   /**
   * @return String representing excluded records report.
   */
   public String generateExcludedRecordsReport() {
      String output = "\n---------------------------------------"
         + "\nExcluded Records Report\n--------------"
         + "-------------------------\n";
      for (int i = 0; i < excludedCount; i++) {
         output += excludedRecords[i] + "\n";
      }
      output += "Number of ignored records from file: " + ignoredCount + "\n";
      return output;
      
   }
}
