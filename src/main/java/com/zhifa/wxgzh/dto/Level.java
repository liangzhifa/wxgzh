package com.zhifa.wxgzh.dto;

public class Level {

    private int current_level;
    private int current_min;
    private int next_exp;
    private int current_exp;

    public int getCurrent_level() {
        return current_level;
    }

    public void setCurrent_level(int current_level) {
        this.current_level = current_level;
    }

    public int getCurrent_min() {
        return current_min;
    }

    public void setCurrent_min(int current_min) {
        this.current_min = current_min;
    }

    public int getNext_exp() {
        return next_exp;
    }

    public void setNext_exp(int next_exp) {
        this.next_exp = next_exp;
    }

    public int getCurrent_exp() {
        return current_exp;
    }

    public void setCurrent_exp(int current_exp) {
        this.current_exp = current_exp;
    }
}
