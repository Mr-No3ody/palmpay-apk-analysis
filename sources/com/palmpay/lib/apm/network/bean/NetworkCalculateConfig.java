package com.palmpay.lib.apm.network.bean;

import kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u0006\n\u0002\b\u001d\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002R\u001a\u0010\u0003\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001a\u0010\t\u001a\u00020\nX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u001a\u0010\u000f\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0006\"\u0004\b\u0011\u0010\bR\u001a\u0010\u0012\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0006\"\u0004\b\u0014\u0010\bR\u001a\u0010\u0015\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u0006\"\u0004\b\u0017\u0010\bR\u001a\u0010\u0018\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u0006\"\u0004\b\u001a\u0010\bR\u001a\u0010\u001b\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001c\u0010\u0006\"\u0004\b\u001d\u0010\bR\u001a\u0010\u001e\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001f\u0010\u0006\"\u0004\b \u0010\bR\u001a\u0010!\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\"\u0010\u0006\"\u0004\b#\u0010\bR\u001a\u0010$\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b%\u0010\u0006\"\u0004\b&\u0010\b¨\u0006'"}, d2 = {"Lcom/palmpay/lib/apm/network/bean/NetworkCalculateConfig;", "", "()V", "decayPeriod", "", "getDecayPeriod", "()I", "setDecayPeriod", "(I)V", "decayRate", "", "getDecayRate", "()D", "setDecayRate", "(D)V", "firstWindowTime", "getFirstWindowTime", "setFirstWindowTime", "maxWindowSize", "getMaxWindowSize", "setMaxWindowSize", "maxWindowTime", "getMaxWindowTime", "setMaxWindowTime", "minWindowSize", "getMinWindowSize", "setMinWindowSize", "rttMaxThreshold", "getRttMaxThreshold", "setRttMaxThreshold", "rttMinThreshold", "getRttMinThreshold", "setRttMinThreshold", "updateNetworkDataCount", "getUpdateNetworkDataCount", "setUpdateNetworkDataCount", "updateNetworkPeriod", "getUpdateNetworkPeriod", "setUpdateNetworkPeriod", "apm_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class NetworkCalculateConfig {
    private int rttMinThreshold = 10;
    private int rttMaxThreshold = 300000;
    private int firstWindowTime = 20;
    private int minWindowSize = 10;
    private int maxWindowSize = 50;
    private int maxWindowTime = 300000;
    private double decayRate = 0.5d;
    private int decayPeriod = 60;
    private int updateNetworkDataCount = 5;
    private int updateNetworkPeriod = 60000;

    public final int getDecayPeriod() {
        return this.decayPeriod;
    }

    public final double getDecayRate() {
        return this.decayRate;
    }

    public final int getFirstWindowTime() {
        return this.firstWindowTime;
    }

    public final int getMaxWindowSize() {
        return this.maxWindowSize;
    }

    public final int getMaxWindowTime() {
        return this.maxWindowTime;
    }

    public final int getMinWindowSize() {
        return this.minWindowSize;
    }

    public final int getRttMaxThreshold() {
        return this.rttMaxThreshold;
    }

    public final int getRttMinThreshold() {
        return this.rttMinThreshold;
    }

    public final int getUpdateNetworkDataCount() {
        return this.updateNetworkDataCount;
    }

    public final int getUpdateNetworkPeriod() {
        return this.updateNetworkPeriod;
    }

    public final void setDecayPeriod(int i7) {
        this.decayPeriod = i7;
    }

    public final void setDecayRate(double d2) {
        this.decayRate = d2;
    }

    public final void setFirstWindowTime(int i7) {
        this.firstWindowTime = i7;
    }

    public final void setMaxWindowSize(int i7) {
        this.maxWindowSize = i7;
    }

    public final void setMaxWindowTime(int i7) {
        this.maxWindowTime = i7;
    }

    public final void setMinWindowSize(int i7) {
        this.minWindowSize = i7;
    }

    public final void setRttMaxThreshold(int i7) {
        this.rttMaxThreshold = i7;
    }

    public final void setRttMinThreshold(int i7) {
        this.rttMinThreshold = i7;
    }

    public final void setUpdateNetworkDataCount(int i7) {
        this.updateNetworkDataCount = i7;
    }

    public final void setUpdateNetworkPeriod(int i7) {
        this.updateNetworkPeriod = i7;
    }
}
