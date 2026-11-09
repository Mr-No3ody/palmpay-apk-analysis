package com.google.firebase;

import N8.q0;

/* JADX INFO: loaded from: classes.dex */
final class AutoValue_StartupTime extends StartupTime {
    private final long elapsedRealtime;
    private final long epochMillis;
    private final long uptimeMillis;

    public AutoValue_StartupTime(long j6, long j10, long j11) {
        this.epochMillis = j6;
        this.elapsedRealtime = j10;
        this.uptimeMillis = j11;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof StartupTime) {
            StartupTime startupTime = (StartupTime) obj;
            if (this.epochMillis == startupTime.getEpochMillis() && this.elapsedRealtime == startupTime.getElapsedRealtime() && this.uptimeMillis == startupTime.getUptimeMillis()) {
                return true;
            }
        }
        return false;
    }

    @Override // com.google.firebase.StartupTime
    public long getElapsedRealtime() {
        return this.elapsedRealtime;
    }

    @Override // com.google.firebase.StartupTime
    public long getEpochMillis() {
        return this.epochMillis;
    }

    @Override // com.google.firebase.StartupTime
    public long getUptimeMillis() {
        return this.uptimeMillis;
    }

    public int hashCode() {
        long j6 = this.epochMillis;
        long j10 = this.elapsedRealtime;
        int i7 = (((((int) (j6 ^ (j6 >>> 32))) ^ 1000003) * 1000003) ^ ((int) (j10 ^ (j10 >>> 32)))) * 1000003;
        long j11 = this.uptimeMillis;
        return i7 ^ ((int) ((j11 >>> 32) ^ j11));
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("StartupTime{epochMillis=");
        sb2.append(this.epochMillis);
        sb2.append(", elapsedRealtime=");
        sb2.append(this.elapsedRealtime);
        sb2.append(", uptimeMillis=");
        return q0.n(sb2, "}", this.uptimeMillis);
    }
}
