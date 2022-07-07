package FanControl;
/*
 * Ceiling Fan Speed state
 * The Speed state on Ceiling fan
 * @author Tuan Hoang
 * 
 */

interface State {
    void pull(CeilingFanSpeed wrapper);
}

/*
 * Ceiling pull chain
 */

class CeilingFanSpeed {
    private State currentState;

    public CeilingFanSpeed() {
        currentState = new Off(); 
    }

    public void set_state(State s) {
        currentState = s;
    }

    public void pull() {
        currentState.pull(this);
    }
}

/*
 *  Off Speed State  to low speed state
 */
class Off implements State {
    public void pull(CeilingFanSpeed wrapper) {
        wrapper.set_state(new Low());
        System.out.println("low speed");
    }
}

/*
 *  Low Speed State  to low medium state
 */
class Low implements State {
    public void pull(CeilingFanSpeed wrapper) {
        wrapper.set_state(new Medium());
        System.out.println("medium speed");
    }
}

/*
 *  Medium Speed State  to low high state
 */

class Medium implements State {
    public void pull(CeilingFanSpeed wrapper) {
        wrapper.set_state(new High());
        System.out.println("high speed");
    }
}

/*
 *  high Speed State  to Off state
 */
class High implements State {
    public void pull(CeilingFanSpeed wrapper) {
        wrapper.set_state(new Off());
        System.out.println("turning off");
    }
}