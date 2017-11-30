
public class Defense implements DefensivePlays{
    int number;
    String name;
    String position;
    String team;
    int height;
    int weight;
    int age;
    int experience;
    String college;
    int touchdowns;
    int yards;
    
    int tackles;
    int assisted_tackles;
    int sacks;
    int sack_yards_lost;
    int tackle_for_loss;
    int passes_defended;
    int interceptions;
    int int_yds_returned;
    int longest;
    int pick_six;
    int forced_fumbles;
    int fumbles_recoverd;
    int fumbles_for_td;
    int blocked_kicks;
    
    public Defense(){
        
    }
    // instantiates attributes of the player data
    public Defense(int number_,String name_, String position_, int height_, int weight_,int age_, int experience_, String college_){
        this.number = number_;
        this.name = name_;
        this.position = position_;
        this.height = height_;
        this.weight = weight_;
        this.age = age_;
        this.experience = experience_;
        this.college = college_;
    }
    // Instantiates attributes for the defense player stats.
    public Defense(String name, int tackles_, int ast, int sacks_, int ydsl, int tloss, int pd, int intercept, int yds, int longest_, int pick, int ff, int rec, int ff_td, int bk  ){
        this.name = name;
        this.tackles = tackles_;
        this.assisted_tackles = ast;
        this.sacks = sacks_;
        this.sack_yards_lost = ydsl;
        this.tackle_for_loss = tloss;
        this.passes_defended = pd;
        this.interceptions = intercept;
        this.yards = yds;
        this.longest = longest_;
        this.pick_six = pick;
        this.forced_fumbles = ff;
        this.fumbles_recoverd = rec;
        this.fumbles_for_td = ff_td;
        this.blocked_kicks = bk;
        
    }
    
    // GET SET DATA FOR ALL ATTRIBUTES OF DEFENSE
        // GET SET DATA FOR PLAYER DATA
     public int getNumber(){
        return number;
    }
    public int setNumber(int num_){
        return this.number = num_;
        
    }
    
    public String getName(){
        return name;
    }
    public String setName(String name_){
        return this.name = name_;
        
    }
    
    public String getPosition(){
        return position;
    }
    public String setPosition(String position_){
        return this.position = position_;
        
    }
      
    public String getTeam(){
        return team;
    }
    public String setTeam(String team_){
        return this.team = team_;
        
    }
    
    public int getHeight (){
        return height;
    }
    public int setHeight (int h){
        return this.height = h;
        
    }
    
    public int getWeight (){
        return weight;
    }
    public int setWeight (int w){
        return this.weight = w;
        
    }
    
    public int getAge(){
        return age;
    }
    public int setAge( int a){
        return this.age = a;
        
    }
    
    public int getExperience(){
        return experience;
    }
    public int setExperience(int exp){
        return this.experience = exp;
        
    }
    
    public String getCollege(){
        return college;
    }
    public String setCollege(String college_){
        return this.college = college_;
        
    }
    
        // GET SET DATA FOR PLAYER STATS
    public int getTackles(){
        return tackles;
    }
    public int setTackles(int t){
        return this.tackles = t;
    }
    
    public int getATackles(){
        return assisted_tackles;
    }
    public int setATackles(int at){
        return this.assisted_tackles = at;
    }
    
    public int getSacks(){
        return sacks;
    }
    public int setSackes( int s){
        return this.tackles = s;
    }
    
    public int getYDSL(){
        return sack_yards_lost;
    }
    public int setYDSL( int sl){
        return this.sack_yards_lost = sl;
    }
    
    public int getTloss(){
        return tackle_for_loss;
    }
    public int setTloss( int tl){
        return this.tackle_for_loss = tl;
    }
    
    public int getPassDefended(){
        return passes_defended;
    }
    public int setPassDefended(int pd){
        return this.passes_defended = pd;
    }
    
    public int getInterceptions(){
        return this.interceptions;
    }
    public int setInterceptions( int i){
        return this.interceptions = i;
    }
    
    public int getIntYds(){
        return int_yds_returned;
    }
    public int setIntYds( int iy){
        return this.int_yds_returned = iy;
    }
    
    public int getLongest(){
        return longest;
    }
    public int setLongest(int l){
        return this.longest = l;
    }
    
    public int getPickSix(){
        return pick_six;
    }
    public int setPickSix(int ps){
        return this.pick_six = ps;
    }
    
    public int getForcedFumbles(){
        return forced_fumbles;
    }
    public int setForcdFumbles( int ff){
        return this.forced_fumbles = ff;
    }
    
    public int getFumblesRecovered(){
        return fumbles_recoverd;
    }
    public int setFumblesRecovered(int ff_r){
        return this.fumbles_recoverd = ff_r;
    }
    
    public int getFumblesForTD(){
        return this.fumbles_for_td;
    }
    public int setFumblesForTD( int fftd){
        return this.fumbles_for_td = fftd;
    }
    
    public int getBlockedKicks(){
        return blocked_kicks;
    }
    public int setBlockedKicks( int bk){
        return this.blocked_kicks = bk;
    }
    public void blitz() {
    	Game.yardsGained = Game.yardsGained -5;
    }
    public void passDefense() {
    	Game.yardsGained = Game.yardsGained -10;
    }
    
    String header_title_format = "%90s %n ";
    String player_title_position_format = "%30s %n";
    String player_stats_header = "%23s, %10s %10s %10s %10s %10s %10s %10s %10s %10s %10s %10s %10s %10s %10s %n";
    String player_data_format  = "%10s %23s %15s %15s %15s %10s %15s %20s \n";
    
    // This included the header that prints once at the beginning of running the roster
    public void printHeader(){
        System.out.print("\n");
        System.out.format(header_title_format,"Dallas Cowboys 2017 Defense");
        System.out.print("\n");
        System.out.format(player_data_format, "Number", "Name", "Position", "Height", "Weight", "Age", "Seasons", "College" );
    }
    
    public void printPhillyHeader(){
        System.out.print("\n \n");
        System.out.format(header_title_format,"Philadelphia Eagles 2017 Defense");
        System.out.print("\n");
        System.out.format(player_data_format, "Number", "Name", "Position", "Height", "Weight", "Age", "Seasons", "College" );
    }
    
     public void printPlayerInfo(){
        System.out.format(player_data_format, this.number, this.name, this.position, this.height, this.weight, this.age, this.experience, this.college );

    }
     public void printPlayerStatsHeader(){
         
         System.out.format(player_stats_header, "Name", "SOLO", "AST", "TOT", "SACK", "YDSL", "TLOSS", "PD", "INT", "YDS", "LONG", "TD", "FF", "REC", "TD", "BK");
     }
     
     public void printPlayerStats(){
         
         System.out.format(player_stats_header, this.name,
        this.tackles, 
        this.assisted_tackles, 
        this.sacks, 
        this.sack_yards_lost,
        this.tackle_for_loss ,
        this.passes_defended ,
        this.interceptions ,
        this.yards ,
        this.longest ,
        this.pick_six ,
        this.forced_fumbles ,
        this.fumbles_recoverd,
        this.fumbles_for_td ,
        this.blocked_kicks );
     }
}
