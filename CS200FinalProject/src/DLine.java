/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author hans8
 */
public class DLine extends Defense {
    
    // Attribute instantiation of Player Data 
    public DLine(int number_,String name_, String position_, int height_, int weight_,int age_, int experience_, String college_){
       
        super(number_, name_, position_, height_, weight_, age_, experience_, college_);
    }
    // Attribute instantiation of Player_Stats
    public DLine(String name, int tackles_, int ast, int sacks_, int ydsl, int tloss, int pd, int intercept, int yds, int longest_, int pick, int ff, int rec, int ff_td, int bk  ){
        
        super(name, tackles_, ast, sacks_, ydsl, tloss, pd, intercept, yds, longest_, pick, ff, rec, ff_td, bk);
    }
    
    //PRINT INFO 
    public void printInfo(){
        super.printPlayerInfo();
    }
    
    @Override
    public void printHeader(){
        
        System.out.print("\n");
        System.out.format(player_title_position_format, "Defensive Line" );
        System.out.print("\n");
        System.out.format(player_stats_header, "Name", "SOLO", "AST", "TOT", "SACK", "YDSL", "TLOSS", "PD", "INT", "YDS", "LONG", "TD", "FF", "REC", "TD", "BK");
    }
    
    @Override
    public void printPlayerStats(){
        super.printPlayerStats();
    }
    
    
    
    
    
}
