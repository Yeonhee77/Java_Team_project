package grade;

import character.Monster;

public class Junior extends Sophomore{
	
	{
		
	ER[0] = new Monster("서평",1,1,5,1,100 );
	ER[1] = new Monster("중간고사",1,1,5,1,100 );
	ER[2] = new Monster("기말고사",1,1,5,1,100 );
	}
	
	
	{
	MR[0] = new Monster("코딩과제",1,1,5,1,100 );
	MR[1] = new Monster("중간고사",1,1,5,1,100 );
	MR[2] = new Monster("기말고사",1,1,5,1,100 );
	}

	public Junior(String major1, String major2, String education1, String eucation2) {
		super(major1, major2, education1, eucation2);
		skill[4].setOpen(true);
	}
	
	
}
