package com.google.android.datatransport.cct.internal;

import N8.q0;

/* JADX INFO: loaded from: classes.dex */
final class AutoValue_LogResponse extends LogResponse {
    private final long nextRequestWaitMillis;

    public AutoValue_LogResponse(long j6) {
        this.nextRequestWaitMillis = j6;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        return (obj instanceof LogResponse) && this.nextRequestWaitMillis == ((LogResponse) obj).getNextRequestWaitMillis();
    }

    @Override // com.google.android.datatransport.cct.internal.LogResponse
    public long getNextRequestWaitMillis() {
        return this.nextRequestWaitMillis;
    }

    public int hashCode() {
        long j6 = this.nextRequestWaitMillis;
        return ((int) (j6 ^ (j6 >>> 32))) ^ 1000003;
    }

    public String toString() {
        return q0.n(new StringBuilder("LogResponse{nextRequestWaitMillis="), "}", this.nextRequestWaitMillis);
    }
}
