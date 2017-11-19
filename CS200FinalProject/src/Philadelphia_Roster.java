

public class Philadelphia_Roster {
// This is a tester
   
  
   public void runPhiladelphiaRoster(){
       
      Offense j = new Offense();
      Defense d = new Defense();
       
       // INPUT FOR OFFENSE PLAYER DATA
       Quarterback qbp = new Quarterback(11,"Carson Wentz","QB",77, 237, 24, 2, "North Dakota");
       RunningBack rbp = new RunningBack(29,"LeGarrette Blount", "RB", 72, 250, 30, 8, "Oregon");
       RunningBack rbp2 = new RunningBack (38, "Kenjon Barner", "RB", 69, 195, 27, 4, "Oregon");
       TightEnd tep = new TightEnd(86, "Zach Ertz", "TE", 77, 250, 27, 5, "Stanford");
       WideReceiver wrp = new WideReceiver(13, "Nelson Agholor", "WR", 72, 198, 24, 3, "USC");
       WideReceiver wrp2 = new WideReceiver(10, "Mack Hollins", "WR", 74, 221, 24, 0, "North Carolina");
       OLine guard = new OLine ( 79, "Brandon Brooks", "G", 77, 335, 28, 6, "Miami");
       OLine guard2 = new OLine ( 73, "Isaac Seumalo","G",76, 303, 24, 2, "Oregon State");
       OLine tackle = new OLine (65, "Lane Johnson", "T", 78, 317, 27, 5, "Oklahoma");
       OLine tackle2 = new OLine (72, "Halapoulivaati Vaitai","T", 78, 320, 24, 2, "TCU");
       OLine center = new OLine (62, "Jason Kelce", "C", 75, 295, 30, 7, "Cincinnati");
       
       // INPUT FOR OFFENSE PLAYER STATS
       Quarterback qbp_stats = new Quarterback("Carson Wentz", 15, 27, 199, 55.6, 7.37, 32, 4, 0, 118.7);
       RunningBack rbp_stats = new RunningBack("LeGarrette Blount", 109, 504, 4.6, 68, 2);
       RunningBack rbp2_stats = new RunningBack("Kenjon Barner", 12, 34, 2.8, 16, 0);
       TightEnd tep_stats = new TightEnd("Zach Ertz", 43, 64, 528, 12.3, 53, 6, 29, 1, 1 );
       WideReceiver wrp_stats = new WideReceiver("Mack Hollins", 9, 10, 172, 19.1, 64, 1);
       WideReceiver wrp2_stats = new WideReceiver("Nelson Agholor", 29, 42, 428, 14.8, 72, 5 );
       OLine tackle_stats = new OLine("Lane Johnson", 4, 24, 4, 20, 2, 2);
       OLine tackle2_stats = new OLine("Halapoulivaati Vaitai", 2, 15, 2, 8, 1, 1);
       OLine guard_stats = new OLine("Brandon Brooks", 1, 10, 2, 7, 0, 1);
       OLine guard2_stats = new OLine("Isaac Seumalo", 1, 5, 5, 36, 1, 0);
       OLine center_stats = new OLine("Jason Kelce", 1, 9, 0, 4, 0, 1);
       
       // PLAYER DATA FOR THE DEFENSE
      Secondary p_c = new Secondary(41,"Ronald Darby", "CB", 23, 71, 193, 3, "Florida State");
      Secondary p_c1 = new Secondary(32, "Rasul Douglas", "CB", 23, 74, 209, 0, "West Virginia");
      Secondary p_s = new Secondary (37, " Randall Goforth", " S", 23, 70, 190, 0, "UCLA");
      Secondary p_s1 = new Secondary(24, "Corey Graham", "S", 32, 72, 196, 11, "New Hampshire");
      Linebackers p_lb = new Linebackers(57, "Dannell Ellerbe","LB", 31, 73, 245, 9, "Georgia");
      Linebackers p1lb = new Linebackers(47, "Nathan Gerry", "LB", 22, 74, 218, 0, "Nebraska");
      Linebackers p_de = new Linebackers (96, "Derek Barnett", "DE", 21, 75, 259, 0, "Tennessee");
      DLine p1_de = new DLine (75, "Vinny Curry", "DE", 29, 75, 279, 6, "Marshall");
      DLine p2_de = new DLine (55, "Brandon Graham", "DE", 29, 74, 265, 8, "Michigan");
      DLine p_dt = new DLine (94, "Beau Allen", "DT", 26, 75, 327, 4, "Wisonsin");
      DLine p_dt1 = new DLine (91, "Fletcher Cox", "DT", 26, 76, 310, 6, "Mississippi");
      
      // PRINT DEFENSE PLAYER STATS
      Secondary p_c_stats = new Secondary ("Ronald Darby", 1, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0);
      Secondary p_c1_stats = new Secondary ("Rasul Douglas", 17, 1, 0, 0, 0, 9, 2, 7, 7, 0, 0, 0, 0, 0);
      Secondary p_s_stats = new Secondary ("Randall Goforth", 42, 5, 1, 8, 1, 5, 0, 0, 0, 0, 0, 0, 0, 0);
      Secondary p_s1_stats = new Secondary ("Corey Graham", 15, 2, 0, 0, 0, 3, 1, 14, 14, 0, 0, 0, 0, 0 );
      Linebackers p_lb_stats = new Linebackers ("Dannell Ellerbe", 8, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0);
      Linebackers p1lb_stats = new Linebackers(" Nathan Getty", 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0);
      Linebackers p_de_stats = new Linebackers ("Derek Barnett", 12, 2, 3, 24, 4, 0, 0, 0, 0, 0, 0, 1, 0, 1);
      DLine p1_de_stats = new DLine ("Vinny Curry", 18, 8, 3, 25, 5, 0, 0, 0, 0, 0, 0, 0, 0, 0);
      DLine p2_de_stats = new DLine ("Brandon Graham", 16, 9, 5, 39, 5, 2, 0, 0, 0, 0, 1, 0, 0, 0);
      DLine p_dt_stats = new DLine ("Beau Allen", 7, 4, 1, 5, 3, 0, 0, 0, 0, 0, 0, 0, 0, 0);
      DLine p_dt1_stats = new DLine("Fletcher Cox", 8, 3, 5, 36, 1, 2, 0, 0, 0, 0, 1, 1, 1, 0 );
      
  
    // PRINT INFO FOR PLAYER DATA
       j.printPhillyHeader();
       qbp.printInfo();
       rbp.printInfo();
       rbp2.printInfo();
       tep.printInfo();
       wrp.printInfo();
       wrp2.printInfo();
       guard.printInfo();
       guard2.printInfo();
       tackle.printInfo();
       tackle2.printInfo();
       center.printInfo();
    
    // PRINT INFO FOR OFFENSE PLAYER STATS
       
        // QuarterBack Stats
       qbp_stats.printPlayerHeader();
       qbp_stats.printPlayerStats();
       //RunningBack Stats
       rbp_stats.printRBHeader();
       rbp_stats.printPlayerStats();
       rbp2_stats.printPlayerStats();
       //OLine Stats
       tep_stats.printTEHeader();
       tep_stats.printPlayerStats();
       // Widereceiver Stats
       wrp_stats.printWRHeader();
       wrp_stats.printPlayerStats();
       wrp2_stats.printPlayerStats();
       // Tackle Stats
       tackle_stats.printOlineHeader();
       tackle_stats.printPlayerStats();
       tackle2_stats.printPlayerStats();
       guard_stats.printPlayerStats();
       guard2_stats.printPlayerStats();
       center_stats.printPlayerStats();
       
       // PRINT DEFENSE PLAYER DATA
       d.printPhillyHeader();
       p_c.printInfo();
       p_c1.printInfo();
       p_s.printInfo();
       p_s1.printInfo();
       p_lb.printInfo();
       p1lb.printInfo();
       p_de.printInfo();
       p1_de.printInfo();
       p2_de.printInfo();
       p_dt.printInfo();
       p_dt1.printInfo();
       
       // PRINT INFO FOR DEFENSE PLAYER STATS.
       // Secondary
      p_c_stats.printHeader();
      p_c_stats.printPlayerStats();
      p_c1_stats.printPlayerStats();
      p_s_stats.printPlayerStats();
      p_s1_stats.printPlayerStats();
      //Linebackers
      p_lb_stats.printHeader();
      p_lb_stats.printPlayerStats();
      p1lb_stats.printPlayerStats();
      p_de_stats.printPlayerStats();
      // DLine
      p1_de_stats.printHeader();
      p1_de_stats.printPlayerStats();
      p2_de_stats.printPlayerStats();
      p_dt_stats.printPlayerStats();
      p_dt1_stats.printPlayerStats();
      
      
   }
}
