package com.google.firebase.remoteconfig.internal;

import com.google.firebase.remoteconfig.FirebaseRemoteConfigInfo;
import com.google.firebase.remoteconfig.FirebaseRemoteConfigSettings;

/* JADX INFO: loaded from: classes2.dex */
public class FirebaseRemoteConfigInfoImpl implements FirebaseRemoteConfigInfo {
    private final FirebaseRemoteConfigSettings configSettings;
    private final int lastFetchStatus;
    private final long lastSuccessfulFetchTimeInMillis;

    public static class Builder {
        private FirebaseRemoteConfigSettings builderConfigSettings;
        private int builderLastFetchStatus;
        private long builderLastSuccessfulFetchTimeInMillis;

        public FirebaseRemoteConfigInfoImpl build() {
            return new FirebaseRemoteConfigInfoImpl(this.builderLastSuccessfulFetchTimeInMillis, this.builderLastFetchStatus, this.builderConfigSettings);
        }

        public Builder withConfigSettings(FirebaseRemoteConfigSettings firebaseRemoteConfigSettings) {
            this.builderConfigSettings = firebaseRemoteConfigSettings;
            return this;
        }

        public Builder withLastFetchStatus(int i7) {
            this.builderLastFetchStatus = i7;
            return this;
        }

        public Builder withLastSuccessfulFetchTimeInMillis(long j6) {
            this.builderLastSuccessfulFetchTimeInMillis = j6;
            return this;
        }

        private Builder() {
        }
    }

    public static Builder newBuilder() {
        return new Builder();
    }

    @Override // com.google.firebase.remoteconfig.FirebaseRemoteConfigInfo
    public FirebaseRemoteConfigSettings getConfigSettings() {
        return this.configSettings;
    }

    @Override // com.google.firebase.remoteconfig.FirebaseRemoteConfigInfo
    public long getFetchTimeMillis() {
        return this.lastSuccessfulFetchTimeInMillis;
    }

    @Override // com.google.firebase.remoteconfig.FirebaseRemoteConfigInfo
    public int getLastFetchStatus() {
        return this.lastFetchStatus;
    }

    private FirebaseRemoteConfigInfoImpl(long j6, int i7, FirebaseRemoteConfigSettings firebaseRemoteConfigSettings) {
        this.lastSuccessfulFetchTimeInMillis = j6;
        this.lastFetchStatus = i7;
        this.configSettings = firebaseRemoteConfigSettings;
    }
}
