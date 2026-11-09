package com.google.android.material.color.utilities;

import androidx.annotation.RestrictTo;

/* JADX INFO: loaded from: classes2.dex */
@RestrictTo({p192n.c.f39801b})
public final class Hct {
    private int argb;
    private double chroma;
    private double hue;
    private double tone;

    private Hct(int i7) {
        setInternalState(i7);
    }

    public static Hct from(double d2, double d10, double d11) {
        return new Hct(HctSolver.solveToInt(d2, d10, d11));
    }

    public static Hct fromInt(int i7) {
        return new Hct(i7);
    }

    private void setInternalState(int i7) {
        this.argb = i7;
        Cam16 cam16FromInt = Cam16.fromInt(i7);
        this.hue = cam16FromInt.getHue();
        this.chroma = cam16FromInt.getChroma();
        this.tone = ColorUtils.lstarFromArgb(i7);
    }

    public double getChroma() {
        return this.chroma;
    }

    public double getHue() {
        return this.hue;
    }

    public double getTone() {
        return this.tone;
    }

    public Hct inViewingConditions(ViewingConditions viewingConditions) {
        double[] dArrXyzInViewingConditions = Cam16.fromInt(toInt()).xyzInViewingConditions(viewingConditions, null);
        Cam16 cam16FromXyzInViewingConditions = Cam16.fromXyzInViewingConditions(dArrXyzInViewingConditions[0], dArrXyzInViewingConditions[1], dArrXyzInViewingConditions[2], ViewingConditions.DEFAULT);
        return from(cam16FromXyzInViewingConditions.getHue(), cam16FromXyzInViewingConditions.getChroma(), ColorUtils.lstarFromY(dArrXyzInViewingConditions[1]));
    }

    public void setChroma(double d2) {
        setInternalState(HctSolver.solveToInt(this.hue, d2, this.tone));
    }

    public void setHue(double d2) {
        setInternalState(HctSolver.solveToInt(d2, this.chroma, this.tone));
    }

    public void setTone(double d2) {
        setInternalState(HctSolver.solveToInt(this.hue, this.chroma, d2));
    }

    public int toInt() {
        return this.argb;
    }
}
