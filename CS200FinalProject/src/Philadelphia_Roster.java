
public class Philadelphia_Roster extends Offense {
// This is a tester
   
  
   public void runPhiladelphiaRoster(){
       
       Offense j = new Offense();
       
       // Input for Offense Player Data
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
       
       // Input for Offense Player Stats
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
       
    // PRINT INFO FOR PLAYER STATS
       
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
       
       wrp_stats.printWRHeader();
       wrp_stats.printPlayerStats();
       wrp2_stats.printPlayerStats();
       
       tackle_stats.printOlineHeader();
       tackle_stats.printPlayerStats();
       tackle2_stats.printPlayerStats();
       guard_stats.printPlayerStats();
       guard2_stats.printPlayerStats();
       center_stats.printPlayerStats();
               
   }
}
