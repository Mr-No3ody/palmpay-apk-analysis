package com.google.firebase.heartbeatinfo;

import N8.q0;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
final class AutoValue_HeartBeatResult extends HeartBeatResult {
    private final List<String> usedDates;
    private final String userAgent;

    public AutoValue_HeartBeatResult(String str, List<String> list) {
        if (str == null) {
            throw new NullPointerException("Null userAgent");
        }
        this.userAgent = str;
        if (list == null) {
            throw new NullPointerException("Null usedDates");
        }
        this.usedDates = list;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof HeartBeatResult) {
            HeartBeatResult heartBeatResult = (HeartBeatResult) obj;
            if (this.userAgent.equals(heartBeatResult.getUserAgent()) && this.usedDates.equals(heartBeatResult.getUsedDates())) {
                return true;
            }
        }
        return false;
    }

    @Override // com.google.firebase.heartbeatinfo.HeartBeatResult
    public List<String> getUsedDates() {
        return this.usedDates;
    }

    @Override // com.google.firebase.heartbeatinfo.HeartBeatResult
    public String getUserAgent() {
        return this.userAgent;
    }

    public int hashCode() {
        return ((this.userAgent.hashCode() ^ 1000003) * 1000003) ^ this.usedDates.hashCode();
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("HeartBeatResult{userAgent=");
        sb2.append(this.userAgent);
        sb2.append(", usedDates=");
        return q0.o(sb2, this.usedDates, "}");
    }
}
