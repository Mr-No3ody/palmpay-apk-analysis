package com.google.firebase.heartbeatinfo;

import N8.q0;

/* JADX INFO: loaded from: classes2.dex */
final class AutoValue_SdkHeartBeatResult extends SdkHeartBeatResult {
    private final long millis;
    private final String sdkName;

    public AutoValue_SdkHeartBeatResult(String str, long j6) {
        if (str == null) {
            throw new NullPointerException("Null sdkName");
        }
        this.sdkName = str;
        this.millis = j6;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof SdkHeartBeatResult) {
            SdkHeartBeatResult sdkHeartBeatResult = (SdkHeartBeatResult) obj;
            if (this.sdkName.equals(sdkHeartBeatResult.getSdkName()) && this.millis == sdkHeartBeatResult.getMillis()) {
                return true;
            }
        }
        return false;
    }

    @Override // com.google.firebase.heartbeatinfo.SdkHeartBeatResult
    public long getMillis() {
        return this.millis;
    }

    @Override // com.google.firebase.heartbeatinfo.SdkHeartBeatResult
    public String getSdkName() {
        return this.sdkName;
    }

    public int hashCode() {
        int iHashCode = (this.sdkName.hashCode() ^ 1000003) * 1000003;
        long j6 = this.millis;
        return iHashCode ^ ((int) (j6 ^ (j6 >>> 32)));
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("SdkHeartBeatResult{sdkName=");
        sb2.append(this.sdkName);
        sb2.append(", millis=");
        return q0.n(sb2, "}", this.millis);
    }
}
