package FanControl;

/*
 * Ceiling fan Direction state
 */

interface Direction {
    void pull(CeilingFanDirection wrapper);
}

/*
 * Changing ceiling fan direction
 * */

class CeilingFanDirection {
	 private Direction currentDirection;
	 
	 public CeilingFanDirection() {
		 	// default FORDward direction
		 	currentDirection = new FORWARD();
	    }
	 public void set_dir(Direction d) {
			currentDirection = d;
		}

	public void pull() {
			currentDirection.pull(this);
		}
}

/*
 *  Change ceiling fan to BACKword direction
 */
class FORWARD implements Direction {
    public void pull(CeilingFanDirection wrapper) {
        wrapper.set_dir(new BACKWARD());
        System.out.println("Backward Direction");
    }
}
/*
 *  Change Change ceiling fan to FORDward direction
 */
class BACKWARD implements Direction {
    public void pull(CeilingFanDirection wrapper) {
        wrapper.set_dir(new FORWARD());
        System.out.println("Forward Direction");
    }
}
