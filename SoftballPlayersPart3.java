import java.io.IOException;
/**
* Contains main method for the program.
*/
public class SoftballPlayersPart3 {
/**
* Serves as main function for SoftballTeam class.
* @param args command list used for string [0] must be 
* a file else throws exception.
* @throws IOException if file does not exist.
*/
   public static void main(String[] args) {
      
      
         
      if (args.length == 0) {
         System.out.println("File name expected "
               +  "as command line argument.");
         System.out.println("Program ending.");
      }
      else {
         try { 
            String file = args[0];
            SoftballTeam team = new SoftballTeam();
         
            team.readPlayerFile(file);
            System.out.println(team.generateReport()
               + team.generateReportByNumber()
               + team.generateReportByName()
               + team.generateReportByRating()
               + team.generateExcludedRecordsReport());
         }
         catch (IOException e) {
            String file = args[0];
            System.out.println("Attempted to read file: " + file 
               + " (No such file or directory)\nProgram ending.");
            SoftballTeam.resetTeamCount();
         }
      }
   
   }
}