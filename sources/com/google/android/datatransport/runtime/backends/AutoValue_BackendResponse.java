package com.google.android.datatransport.runtime.backends;

import N8.q0;

/* JADX INFO: loaded from: classes.dex */
final class AutoValue_BackendResponse extends BackendResponse {
    private final long nextRequestWaitMillis;
    private final BackendResponse.Status status;

    public AutoValue_BackendResponse(BackendResponse.Status status, long j6) {
        if (status == null) {
            throw new NullPointerException("Null status");
        }
        this.status = status;
        this.nextRequestWaitMillis = j6;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof BackendResponse) {
            BackendResponse backendResponse = (BackendResponse) obj;
            if (this.status.equals(backendResponse.getStatus()) && this.nextRequestWaitMillis == backendResponse.getNextRequestWaitMillis()) {
                return true;
            }
        }
        return false;
    }

    @Override // com.google.android.datatransport.runtime.backends.BackendResponse
    public long getNextRequestWaitMillis() {
        return this.nextRequestWaitMillis;
    }

    @Override // com.google.android.datatransport.runtime.backends.BackendResponse
    public BackendResponse.Status getStatus() {
        return this.status;
    }

    public int hashCode() {
        int iHashCode = (this.status.hashCode() ^ 1000003) * 1000003;
        long j6 = this.nextRequestWaitMillis;
        return iHashCode ^ ((int) (j6 ^ (j6 >>> 32)));
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("BackendResponse{status=");
        sb2.append(this.status);
        sb2.append(", nextRequestWaitMillis=");
        return q0.n(sb2, "}", this.nextRequestWaitMillis);
    }
}
