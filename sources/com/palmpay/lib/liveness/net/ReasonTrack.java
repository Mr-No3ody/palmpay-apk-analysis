package com.palmpay.lib.liveness.net;

import androidx.annotation.Keep;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Keep
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u000f\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0006\u0010\u0004\u001a\u00020\u0015J\u0006\u0010\u0010\u001a\u00020\u0015J\u0006\u0010\u0006\u001a\u00020\u0015J\u0006\u0010\u0007\u001a\u00020\u0015J\u0006\u0010\b\u001a\u00020\u0015J\u0006\u0010\t\u001a\u00020\u0015J\u0006\u0010\n\u001a\u00020\u0015J\u0006\u0010\u000b\u001a\u00020\u0015J\u0006\u0010\f\u001a\u00020\u0015J\u0006\u0010\r\u001a\u00020\u0015J\u0006\u0010\u000e\u001a\u00020\u0015J\u000e\u0010\u000f\u001a\u00020\u00152\u0006\u0010\u0010\u001a\u00020\u0005J\u0006\u0010\u0012\u001a\u00020\u0015J\u0006\u0010\u0013\u001a\u00020\u0015J\u0006\u0010\u0014\u001a\u00020\u0015J\u0006\u0010\u0016\u001a\u00020\u0015J\u0006\u0010\u0017\u001a\u00020\u0015R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0005X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0005X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0005X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0005X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0005X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u0005X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u0005X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0005X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0005X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0005X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0005X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0005X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0005X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0018"}, d2 = {"Lcom/palmpay/lib/liveness/net/ReasonTrack;", "", "<init>", "()V", "ensureFaceInFrame", "", "ensureOnlyOneFace", "moveCloser", "moveAway", "smile", "blink", "headNod", "headShake", "mouthOpen", "holdOn", "holdOnTimeOut", "timeOut", "livenessCount", "bitmapEmpty", "detectError", "recordVideoError", "", "collectLiveness", "reset", "lib_liveness_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class ReasonTrack {
    private int bitmapEmpty;
    private int blink;
    private int detectError;
    private int ensureFaceInFrame;
    private int ensureOnlyOneFace;
    private int headNod;
    private int headShake;
    private int holdOn;
    private int holdOnTimeOut;
    private int livenessCount;
    private int mouthOpen;
    private int moveAway;
    private int moveCloser;
    private int recordVideoError;
    private int smile;
    private int timeOut;

    public final void bitmapEmpty() {
        this.bitmapEmpty++;
    }

    public final void blink() {
        this.blink++;
    }

    public final void collectLiveness() {
        this.livenessCount++;
    }

    public final void detectError() {
        this.detectError++;
    }

    public final void ensureFaceInFrame() {
        this.ensureFaceInFrame++;
    }

    public final void ensureOnlyOneFace() {
        this.ensureOnlyOneFace++;
    }

    public final void headNod() {
        this.headNod++;
    }

    public final void headShake() {
        this.headShake++;
    }

    public final void holdOn() {
        this.holdOn++;
    }

    public final void holdOnTimeOut(int timeOut) {
        this.holdOnTimeOut = timeOut;
    }

    public final void mouthOpen() {
        this.mouthOpen++;
    }

    public final void moveAway() {
        this.moveAway++;
    }

    public final void moveCloser() {
        this.moveCloser++;
    }

    public final void recordVideoError() {
        this.recordVideoError++;
    }

    public final void reset() {
        this.ensureFaceInFrame = 0;
        this.ensureOnlyOneFace = 0;
        this.moveCloser = 0;
        this.moveAway = 0;
        this.smile = 0;
        this.blink = 0;
        this.headNod = 0;
        this.headShake = 0;
        this.mouthOpen = 0;
        this.holdOn = 0;
        this.holdOnTimeOut = 0;
        this.timeOut = 0;
        this.livenessCount = 0;
        this.bitmapEmpty = 0;
        this.detectError = 0;
        this.recordVideoError = 0;
    }

    public final void smile() {
        this.smile++;
    }

    public final void timeOut() {
        this.timeOut++;
    }
}
