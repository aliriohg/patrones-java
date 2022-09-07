package com.ali.behavioral.state;

public class MobileAlertStateContext {
    private MobileAlertState currentState;

    public MobileAlertStateContext() {
        this.currentState = new Sound();
    }
    public void setState(MobileAlertState state){
        this.currentState=state;
    }

    public void alert(){
       this.currentState.alert(this);
    }
}
