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
    Defense d = new Defense();
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
    
    // THis is the Defense player stats
    Secondary cb = new Secondary(30, "Anthony Brown", "CB", 71, 196, 23, 2, "Purdue");
       Secondary cb_stats = new Secondary ("Anthony Brown", 32, 6, 0, 0, 2, 4, 1, 0, 0, 0, 0, 0, 0, 0);
       Secondary s = new Secondary (31, "Byron Jones", "S", 72, 205, 25, 3, "Connecticut");
       Secondary s_stats = new Secondary ("Byron Jones", 34, 16, 0, 0, 4, 4, 1, 21, 21, 1, 0, 0, 0, 0 );
       Secondary s1 = new Secondary (38, "Jeff Heath", "S", 73, 212, 26, 5, "Saginaw Valley");
       Secondary s1_stats = new Secondary ("Jeff Heath", 35, 5, 0, 0, 1, 2, 1, 3, 3, 0, 2, 0, 0, 0 );
       Secondary cb1 = new Secondary(32, "Orlando Scandrick", "CB", 70, 196, 30, 10, "Boise State");
       Secondary cb1_stats = new Secondary("Orlando Scandrick", 25, 5, 0, 0, 2, 3, 0, 0, 0, 0, 0, 0, 0, 0);
       
       Linebackers lb = new Linebackers(50, "Sean Lee", "LB", 74, 245, 31, 8, "Penn State");
       Linebackers lb_stats = new Linebackers("Sean Lee", 41, 11, 0, 0, 7, 0, 0, 0, 0, 0, 0, 0, 0, 0 );
       Linebackers de = new Linebackers (97, "Taco Charlton", "DE", 77, 270, 23, 0, "Michigan");
       Linebackers de_stats = new Linebackers ("Taco Charlton", 5, 2, 1, 3, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0 );
       Linebackers lb1 = new Linebackers(54, "Jaylon Smith", "LB", 74, 245, 22, 1, "Notre Dame");
       Linebackers lb1_stats = new Linebackers("Jaylon Smith", 30, 24, 1, 13, 1, 1, 0, 0, 0, 0, 2, 0, 0, 0);
       
       DLine de1 = new DLine(98, "Tyrone Crawford", "DE", 76, 290, 27, 6, "Boise State");
       DLine de1_stats = new DLine("Tyrone Crawford", 10, 5, 4, 27, 1, 0, 0, 0, 0, 0, 1, 1, 0, 1 );
       DLine dt = new DLine(95, "David Irving", "DT", 79, 290, 24, 3, "Iowa State");
       DLine dt_stats = new DLine("David Irving", 12, 7, 6, 43, 3, 4, 0, 0, 0, 0, 1, 0, 0, 0);
       DLine de2 = new DLine (90, "DeMarcus Lawrence", "DE", 75, 265, 25, 4, "Boise State");
       DLine de2_stats = new DLine("DeMarcus Lawrence", 22, 15, 11, 126, 2, 0, 0, 0, 0, 0, 3, 2, 0, 0);
       DLine dt1 =new DLine (96, "Maliek Collins", "DT", 74, 308, 22, 2, "Nebraska");
       DLine dt1_stats = new DLine("Maliek Collins",8, 7, 3, 15, 2, 0, 0, 0, 0, 0, 0, 1, 0, 0);
    
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
    
    
    d.printHeader();
    cb.printInfo();
    cb1.printInfo();
    s.printInfo();
    s1.printInfo();
    lb.printInfo();
    lb1.printInfo();
    de.printInfo();
    de1.printInfo();
    de2.printInfo();
    dt.printInfo();
    dt1.printInfo();
    
    cb_stats.printHeader();
    cb_stats.printPlayerStats();
    cb1_stats.printPlayerStats();
    s_stats.printPlayerStats();
    s1_stats.printPlayerStats();
    lb_stats.printHeader();
    lb_stats.printPlayerStats();
    lb_stats.printPlayerStats();
    lb1_stats.printPlayerStats();
    de_stats.printPlayerStats();
    de1_stats.printHeader();
    de1.printPlayerStats();
    de1_stats.printPlayerStats();
    de2_stats.printPlayerStats();
    dt_stats.printPlayerStats();
    dt1_stats.printPlayerStats();
    
    
        }
    
    }
