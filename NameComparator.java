import java.util.Comparator;
/**
* Implements Comparator interface based on name.
*/
public class NameComparator implements Comparator<SoftballPlayer> {
/**
   * @param p1 Any SoftballPlayer with a defined name.
   * @param p2 Any SoftballPlayer with a defined name.
   * @return integer representing a positive, negative, or equal to comparison.
   */
   public int compare(SoftballPlayer p1, SoftballPlayer p2) {
      String p1Name = p1.getName().toUpperCase();
      String p1NameFirst
               = p1Name.substring(0, p1Name.indexOf(" "));
      String p1NameLast 
               = p1Name.substring(p1Name.indexOf(" "), p1Name.length());
      String p2Name = p2.getName().toUpperCase();
      String p2NameFirst
               = p2Name.substring(0, p2Name.indexOf(" "));
      String p2NameLast 
               = p2Name.substring(p2Name.indexOf(" "), p2Name.length());
      String p1ChangedName = p1NameLast + p1NameFirst;
      String p2ChangedName = p2NameLast + p2NameFirst;
      return p1ChangedName.compareTo(p2ChangedName);
      
   }
}