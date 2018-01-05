
public class Room {
	Person occupant;
	int xLoc,yLoc;
	boolean discovered = false;
	int n = 0 ; 
	
	public Room(int x, int y)
	{
		xLoc = x;
		yLoc = y;
	}
	
	public String display (Person x) {
		if ((x.getxLoc() == this.xLoc) && (x.getyLoc() == this.yLoc)) {
			discovered = true;
			if (x.getName().equals("")){ 
				return ("["+n+"]");
			} else {
				return ("["+ x.getName().charAt(0) + "]");
			}
		}
		else if (discovered == true) {
			return ("["+(n+1)+"]");
		} else
			return ("[?]");
	}
	
	public void enterRoom(Person x)
	{
		System.out.println("You enter a plain old room");
		occupant = x;
		x.setxLoc(this.xLoc);
		x.setyLoc(this.yLoc);
		n++ ; 
		occupant.health -= n  ;
		discovered = true;		
	}
	
	
	public void leaveRoom(Person x)
	
	{
		occupant = null;
	}
	
	public boolean canPrint() {
		return discovered;
	}
}