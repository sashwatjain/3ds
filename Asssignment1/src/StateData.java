class State {
	private String name;
	private String chiefMinister;
	private int seat;
	

	State(String name,String chiefMinister,int seat) {
		this.name = name;
		this.chiefMinister = chiefMinister;
		this.seat = seat;
	}
	
	State(String name) {
		this.name = name;
	}

    public void printState() {
    	System.out.println("Name: " +this.name);
    	System.out.println("Chief Minister: " +this.chiefMinister);
    	System.out.println("seats: " +this.seat);
	}
    
    public void changeCM(String name) {
        System.out.println("Changing name");
        this.chiefMinister = name;
    }
    
    public int getSeat() {
		return seat;
	}
    public float winPercentSeat(int win_seat) {
    	return (win_seat*1.0f/seat*1.0f)*100.0f;
    }
    
    public float winPercentSeat(float win_seat) {
    	return (win_seat/seat*1.0f)*100.0f;
    }
    public double winPercentSeat(double win_seat) {
    	return (win_seat/seat)*100.0;
    }
    public float winPercentSeat(int win_seat , int win_seat2) {
    	System.out.println("using integer and intetger");
    	return ((win_seat+win_seat2)*1.0f/seat*1.0f)*100.0f;
    }
    public float winPercentSeat(float win_seat , int win_seat2) {
    	 System.out.println("using float and intetger");
    	 return ((win_seat+win_seat2)*1.0f/seat*1.0f)*100.0f;
    }
    public float winPercentSeat(int win_seat , float win_seat2) {
   	 System.out.println("using integer and float");
   	 return ((win_seat+win_seat2)*1.0f/seat*1.0f)*100.0f;
   }
    
    
    
    
	
}
public class StateData {
	public static void main(String[] args) {
      State state1 = new State("MadhyaPradesh","Shivraj Singh Chouhan",29);
      State state2 = new State("Assam");
      state1.printState();
      state2.printState();
      //integer
      System.out.println("Current CM was Won by " + state1.winPercentSeat(20)); 
      //double
      System.out.println("Current CM was Won by " + state1.winPercentSeat(20.0)); 
      //float
      System.out.println("Current CM was Won by " + state1.winPercentSeat(20.0f));
      //integer,integer
      System.out.println("Current CM was Won by " + state1.winPercentSeat(20,10));
      //float,integer
      System.out.println("Current CM was Won by " + state1.winPercentSeat(20.0f,10));
      //integer,float
      System.out.println("Current CM was Won by " + state1.winPercentSeat(20,10.0f));
      state1.changeCM("Kamal Nath");
      state1.printState();
    }
	
}


