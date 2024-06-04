import org.junit.Assert;
// import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;
import java.io.IOException;

/**
* Serves as the JUnit test for the SoftballTeam class.
*/
public class SoftballTeamTest {


   /** Fixture initialization (common initialization
    *  for all tests). **/
   @Before public void setUp() {
   }


   
   /** Tests getTeamName Method. **/
   @Test public void getTeamNameTest() {
      SoftballTeam team = new SoftballTeam();
      Assert.assertEquals("", team.getTeamName());
      team.resetTeamCount();
   
   }
   
   /** Tests setTeamName Method. **/
   @Test public void setTeamNameTest() {
      SoftballTeam team = new SoftballTeam();
      team.setTeamName("Tigers");
      Assert.assertEquals("Tigers", team.getTeamName());
      team.resetTeamCount();
   
   }
   
   /** Tests setRoster and getRoster Method. **/
   @Test public void setRosterTest() {
      SoftballTeam team = new SoftballTeam();
      SoftballPlayer[] roster1 = new SoftballPlayer[5];
      team.setRoster(roster1);
      Assert.assertArrayEquals(roster1, team.getRoster());
      team.resetTeamCount();
   
   }
   
   /** Tests getPlayerCount and setPlayerCount methods. **/
   @Test public void setPlayerCountTest() {
      SoftballTeam team = new SoftballTeam();
      team.setPlayerCount(4);
      Assert.assertEquals(4, team.getPlayerCount());
      team.resetTeamCount();
   
   }
   
   /** Tests getExcludedRecords and setExcludedRecords methods. **/
   @Test public void setExcludedRecordsTest() {
      SoftballTeam team = new SoftballTeam();
      String[] excludedRecords = new String[30];
      excludedRecords[0] = "word";
      team.setExcludedRecords(excludedRecords);
      Assert.assertArrayEquals(excludedRecords, team.getExcludedRecords());
      team.resetTeamCount();
   
   }
   
   /** Tests getIgnoredCount and setIgnoredCount methods. **/
   @Test public void setIgnoredCount() {
      SoftballTeam team = new SoftballTeam();
      team.setIgnoredCount(12);
      Assert.assertEquals(12, team.getIgnoredCount());
      team.resetTeamCount();
   
   }
   
   /** Tests getExcludedCount and setExcludedCount methods. **/
   @Test public void setExcludedCountTest() {
      SoftballTeam team = new SoftballTeam();
      team.setExcludedCount(14);
      Assert.assertEquals(14, team.getExcludedCount());
      team.resetTeamCount();
   }
   
   /** Tests getTeamCount and resetTeamCount methods. **/
   @Test public void getTeamCount() {
      SoftballTeam team = new SoftballTeam();
      Assert.assertEquals(1, team.getTeamCount());
      team.resetTeamCount();
      Assert.assertEquals(0, team.getTeamCount());
   }
   
   /** Tests generateReport method. **/
   @Test public void generateReportTest() {
      SoftballTeam team = new SoftballTeam();
      SoftballPlayer player1 
         = new Pitcher("01", "Jenny Harper", "RHP", 1.0, .375, 12, 4, 1.25);
      SoftballPlayer player2 
         = new Outfielder("02", "Kaylee Jones", "LF", 1.0, .375, .950);
      SoftballPlayer[] roster1 = {player1, player2};
      team.setPlayerCount(2);
      team.setTeamName("Team1");
      team.setRoster(roster1);
      Assert.assertEquals("\n---------------------------------------"
         + "\nTeam Report for Team1\n" 
         + "---------------------------------------\n\n"
         + "01 Jenny Harper (RHP) 12 wins, 4 losses, 1.25 ERA"
         + "\nSpecialization Factor: 1.0 (class Pitcher) Rating: 1.422\n\n"
         + "02 Kaylee Jones (LF) .375"
         + "\nSpecialization Factor: 1.0 (class Outfielder) "
         + "Rating: 3.562\n\n",
         team.generateReport());
      team.resetTeamCount();
   
         
   }
   
   /** Tests generateReportByName method. **/
   @Test public void reportByNameTest() {
      SoftballTeam team = new SoftballTeam();
      SoftballPlayer player1 
         = new Pitcher("01", "Jenny Harper", "RHP", 1.0, .375, 12, 4, 1.25);
      SoftballPlayer player2 
         = new Outfielder("02", "Kaylee Jones", "LF", 1.0, .375, .950);
      SoftballPlayer[] roster1 = {player1, player2};
      team.setPlayerCount(2);
      team.setTeamName("Team1");
      team.setRoster(roster1);
      Assert.assertEquals("\n---------------------------------------"
         + "\nTeam Report for Team1 (by Name)\n" 
         + "---------------------------------------\n"
         + "01 Jenny Harper RHP 12 wins, 4 losses, 1.25 ERA\n"
         + "02 Kaylee Jones LF .375\n", team.generateReportByName());
      team.resetTeamCount();
   
   }
   
   /** Tests generateReportByNumber method. **/
   @Test public void reportByNumberTest() {
      SoftballTeam team = new SoftballTeam();
      SoftballPlayer player1 
         = new Pitcher("01", "Jenny Harper", "RHP", 1.0, .375, 12, 4, 1.25);
      SoftballPlayer player2 
         = new Outfielder("02", "Kaylee Jones", "LF", 1.0, .375, .950);
      SoftballPlayer[] roster1 = {player1, player2};
      team.setPlayerCount(2);
      team.setTeamName("Team1");
      team.setRoster(roster1);
      Assert.assertEquals("\n---------------------------------------"
         + "\nTeam Report for Team1 (by Number)\n" 
         + "---------------------------------------\n"
         + "01 Jenny Harper RHP 12 wins, 4 losses, 1.25 ERA\n"
         + "02 Kaylee Jones LF .375\n", team.generateReportByNumber());
      team.resetTeamCount();
   
   }
   
   /** Tests generateReportByRating method. **/
   @Test public void reportByRatingTest() {
      SoftballTeam team = new SoftballTeam();
      SoftballPlayer player1 
         = new Pitcher("01", "Jenny Harper", "RHP", 1.0, .375, 12, 4, 1.25);
      SoftballPlayer player2 
         = new Outfielder("02", "Kaylee Jones", "LF", 1.0, .375, .950);
      SoftballPlayer[] roster1 = {player1, player2};
      team.setPlayerCount(2);
      team.setTeamName("Team1");
      team.setRoster(roster1);
      Assert.assertEquals("\n---------------------------------------"
         + "\nTeam Report for Team1 (by Rating)\n" 
         + "---------------------------------------\n"
         + "3.562 02 Kaylee Jones LF .375\n"
         + "1.422 01 Jenny Harper RHP 12 wins, 4 losses, 1.25 ERA\n",
         team.generateReportByRating());
      team.resetTeamCount();
   
   }
   
   /** Tests generateExcludedRecordsReports method. **/
   @Test public void generateExcludedReportsTest() {
      SoftballTeam team = new SoftballTeam();
      String player1 
         = "01, Jenny Harper, RHP, 1.0, .375, 12, 4, 1.25";
      String player2 
         = "02, Kaylee Jones, LF, 1.0, .375, .950";
      String[] roster1 = {player1, player2};
      team.setExcludedCount(2);
      team.setTeamName("Team1");
      team.setExcludedRecords(roster1);
      Assert.assertEquals("\n---------------------------------------"
         + "\nExcluded Records Report\n" 
         + "---------------------------------------\n"
         + "01, Jenny Harper, RHP, 1.0, .375, 12, 4, 1.25\n"
         + "02, Kaylee Jones, LF, 1.0, .375, .950\n"
         + "Number of ignored records from file: 0\n", 
         team.generateExcludedRecordsReport());
      team.resetTeamCount();
   }
   
   /** Tests readPlayerFile method for data1 included. 
   * @throws IOException if file is not found. **/
   @Test public void readPlayerFileTestO1() throws IOException {
      SoftballTeam team = new SoftballTeam();
      team.resetTeamCount();
      team.readPlayerFile("softball_player_data_part3a.csv");
      Assert.assertEquals(2, team.getExcludedCount());
      Assert.assertEquals(4, team.getPlayerCount());
      Assert.assertEquals("Auburn Stars", team.getTeamName());
      Assert.assertEquals(0, team.getIgnoredCount());
   }
   
   /** Tests readPlayerFile for data set 2. 
   * @throws IOException if file is not found. **/
   @Test public void readPlayerFileTest02() throws IOException {
      SoftballTeam team = new SoftballTeam();
      team.resetTeamCount();
      team.readPlayerFile("softball_player_data_part3b.csv");
      Assert.assertEquals(4, team.getExcludedCount());
      Assert.assertEquals(23, team.getPlayerCount());
      Assert.assertEquals("My Bigger Team", team.getTeamName());
      Assert.assertEquals(0, team.getIgnoredCount());
      
   }
   
   /** Tests readPlayerFile for large set of data. 
   * @throws IOException for files not found. **/
   @Test public void readPlayerFileTest03() throws IOException {
      SoftballTeam team = new SoftballTeam();
      team.resetTeamCount();
      team.readPlayerFile("softball_player_data_part3c.csv");
      Assert.assertEquals(30, team.getExcludedCount());
      Assert.assertEquals(24, team.getPlayerCount());
      Assert.assertEquals("My Biggest Team File", team.getTeamName());
      Assert.assertEquals(5, team.getIgnoredCount());
   }
}
