// The director / engineer class creates a Robot using the
// builder interface that is defined (OldRobotBuilder)

public class RobotEngineer {
	
	private RobotBuilder robotBuilder;
//	(kinda like a factory)
	
	// OldRobotBuilder specification is sent to the engineer
	
	public RobotEngineer(RobotBuilder robotBuilder){

//		poly		
		this.robotBuilder = robotBuilder;
		
	}
	
	// Return the Robot made from the OldRobotBuilder spec
	
	public Robot getRobot(){
		
		return this.robotBuilder.getRobot();
		
	}
	
	// Execute the methods specific to the RobotBuilder 
	// that implements RobotBuilder (OldRobotBuilder)
	
	public void makeRobot() {
		
		this.robotBuilder.buildRobotHead();
		this.robotBuilder.buildRobotTorso();
		this.robotBuilder.buildRobotArms();
		this.robotBuilder.buildRobotLegs();
		
	}
	
}

/*
Robot Built
Robot Head Type: Tin Head
Robot Torso Type: Tin Torso
Robot Arm Type: Blowtorch Arms
Robot Leg Type: Rollar Skates
*/