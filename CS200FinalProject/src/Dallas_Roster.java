/*
                   ENTIRE DALLAS ROSTER CLASS                                                        
 
 This class contains all of the hardcoded player data for
 both the offense and defense of the Dallas Cowboys.
 This also has the logic for printing all player data through 
 runDallasRoster method
 */
public class Dallas_Roster {
    
    //public static void main(String[] args){
    public Dallas_Roster(){
    
    }
    
    public void runDallasRoster(){
    
    Offense o = new Offense();
    
    // This is the offense player data
    Quarterback qb = new Quarterback(4, "Dak Prescott", "QB", 74, 238, 24, 2, "Mississippi State");
    RunningBack rb = new RunningBack(21, "Ezekiel Elliot", "RB", 72, 228, 22, 2, "Ohio State");
    RunningBack fb = new RunningBack(41, "Keith Smith", "FB",  72, 248, 25, 4, "San Jose State");
    WideReceiver wr1 = new WideReceiver(88, "Dez Bryant", "WR",  74, 220, 29, 8, "Oklahoma State" );
    WideReceiver wr2 = new WideReceiver(83, "Terrence Williams", "WR",  74, 210, 28, 5, "Baylor");
    TightEnd te = new TightEnd(82, "Jason Witten", "TE",  78, 263, 35, 15, "Tennessee");
    OLine rt = new OLine (71, "La'el Collins", "RT",  74, 320, 24, 3, "LSU");
    OLine lt = new OLine (77, "Tyron Smith", "LT", 77, 320, 26, 7, "USC");
    OLine rg = new OLine (70, "Zach Martin", "RG",  74, 315, 26, 4, "Notre Dame");
    OLine lg = new OLine (79, "Chaz Green", "LG",  75, 318, 25, 3, "Florida");
    OLine c = new OLine(72, "Travis Frederick", "C",  74, 320, 26, 5, "Wisconsin");
    
    // This is offense player stats
    Quarterback qb_stats = new Quarterback("Dak Prescott", 183, 289, 1994, 63.3, 6.9, 16, 72, 4, 77.2);
    WideReceiver wr1_stats = new WideReceiver("Dez Bryant", 42, 84, 478, 11.4, 36, 4);
    WideReceiver wr2_stats = new WideReceiver("Terrance Williams", 31, 44, 366, 11.8, 56, 0);
    RunningBack rb_stats = new RunningBack("Ezekiel Elliot", 191, 783, 4.1, 30, 7);
    TightEnd te_stats = new TightEnd("Jason Witten", 42, 55, 378, 9, 38, 3, 19, 1, 1);
    OLine t_stats = new OLine("T.Smith", 7, 52, 2, 15, 3, 4);
    OLine t2_stats = new OLine("L Collins", 3, 25, 3, 9, 1, 2);
    OLine g_stats = new OLine ("J Cooper", 3, 30, 0, 0, 0, 3);
    OLine g2_stats = new OLine("Z Martin", 0, 0, 1, 7, 0, 0);
    OLine c_stats = new OLine ("T Frederick", 2, 20, 0, 0, 0, 2);
    
// THis is the print Info for the Offense Player Data
    o.printHeader();
    qb.printInfo();
    rb.printInfo();
    fb.printInfo();
    wr1.printInfo();
    wr2.printInfo();
    te.printInfo();
    rt.printInfo();
    lt.printInfo();
    rg.printInfo();
    lg.printInfo();
    c.printInfo();
    
// This is the print Info for the Offense Player Stats
// Quarterback
    qb_stats.printPlayerHeader();
    qb_stats.printPlayerStats();
// Wide Receiver
    wr1.printWRHeader();
    wr1_stats.printPlayerStats();
    wr2_stats.printPlayerStats();
// Running Back
    rb_stats.printRBHeader();
    rb_stats.printPlayerStats();
// Tight End
    te_stats.printTEHeader();
    te_stats.printPlayerStats();
// Offensive Line
    t_stats.printOlineHeader();
    t_stats.printPlayerStats();
    t2_stats.printPlayerStats();
    g_stats.printPlayerStats();
    g2_stats.printPlayerStats();
    c_stats.printPlayerStats();
        }
    
    }
