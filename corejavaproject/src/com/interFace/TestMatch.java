package com.interFace;
//interface me member variablle public static final declare ho jaate apne aap
//member functions abstract public static ho jaate apne aap
interface cricket{
	int totalplayers=11;
	public void displayTeamMembers();
}
class Game implements cricket{
	public void displayTeamMembers() {
		System.out.println("Total Number of players="+totalplayers);
	}
}
public class TestMatch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Game g= new Game();
		g.displayTeamMembers();
	}

}
