package com.company;

public class LimitException extends  Exception {
    private  double RemainingEmaot;

    public double getRemainingEmaot() {
        return RemainingEmaot;
    }

    public LimitException(String message, double remainingEmaot) {
        super(message);
        RemainingEmaot = remainingEmaot;
    }
}
