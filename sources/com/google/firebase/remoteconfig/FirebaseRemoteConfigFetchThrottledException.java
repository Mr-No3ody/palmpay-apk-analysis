package com.google.firebase.remoteconfig;

/* JADX INFO: loaded from: classes2.dex */
public class FirebaseRemoteConfigFetchThrottledException extends FirebaseRemoteConfigException {
    private final long throttleEndTimeMillis;

    public FirebaseRemoteConfigFetchThrottledException(long j6) {
        this("Fetch was throttled.", j6);
    }

    public long getThrottleEndTimeMillis() {
        return this.throttleEndTimeMillis;
    }

    public FirebaseRemoteConfigFetchThrottledException(String str, long j6) {
        super(str);
        this.throttleEndTimeMillis = j6;
    }
}
