package com.github.mikephil.charting.components;

import android.graphics.Color;

/**
 * Smarttrace
 * smarttrace
 * Created by beou on 26/07/2016.
 */
public class PlotBand extends ComponentBase{
    int color;
    int alpha;
    float from;
    float to;

    public PlotBand() {
        this.color = Color.LTGRAY;
        this.alpha = 128;
        this.from = 0f;
        this.to = 0;
    }

    public PlotBand(float from, float to) {
        this.color = Color.LTGRAY;
        this.alpha = 128;
        this.from = from;
        this.to = to;
    }

    public PlotBand(int color, float from, float to) {
        this.color = color;
        this.alpha = 128;
        this.from = from;
        this.to = to;
    }

    public int getColor() {
        return color;
    }

    public void setColor(int color) {
        this.color = color;
    }

    public int getAlpha() {
        return alpha;
    }

    public void setAlpha(int alpha) {
        this.alpha = alpha;
    }

    public float getFrom() {
        return from;
    }

    public void setFrom(float from) {
        this.from = from;
    }

    public float getTo() {
        return to;
    }

    public void setTo(float to) {
        this.to = to;
    }
}
