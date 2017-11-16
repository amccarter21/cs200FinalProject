
public class Defense {
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
    
}
