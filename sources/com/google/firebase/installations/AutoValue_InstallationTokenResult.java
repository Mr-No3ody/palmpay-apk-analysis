package com.google.firebase.installations;

import N8.q0;
import androidx.annotation.NonNull;
import com.airbnb.lottie.model.layer.d;

/* JADX INFO: loaded from: classes2.dex */
final class AutoValue_InstallationTokenResult extends InstallationTokenResult {
    private final String token;
    private final long tokenCreationTimestamp;
    private final long tokenExpirationTimestamp;

    public static final class Builder extends InstallationTokenResult.Builder {
        private byte set$0;
        private String token;
        private long tokenCreationTimestamp;
        private long tokenExpirationTimestamp;

        @Override // com.google.firebase.installations.InstallationTokenResult.Builder
        public InstallationTokenResult build() {
            String str;
            if (this.set$0 == 3 && (str = this.token) != null) {
                return new AutoValue_InstallationTokenResult(str, this.tokenExpirationTimestamp, this.tokenCreationTimestamp);
            }
            StringBuilder sb2 = new StringBuilder();
            if (this.token == null) {
                sb2.append(" token");
            }
            if ((this.set$0 & 1) == 0) {
                sb2.append(" tokenExpirationTimestamp");
            }
            if ((this.set$0 & 2) == 0) {
                sb2.append(" tokenCreationTimestamp");
            }
            throw new IllegalStateException(d.m("Missing required properties:", sb2));
        }

        @Override // com.google.firebase.installations.InstallationTokenResult.Builder
        public InstallationTokenResult.Builder setToken(String str) {
            if (str == null) {
                throw new NullPointerException("Null token");
            }
            this.token = str;
            return this;
        }

        @Override // com.google.firebase.installations.InstallationTokenResult.Builder
        public InstallationTokenResult.Builder setTokenCreationTimestamp(long j6) {
            this.tokenCreationTimestamp = j6;
            this.set$0 = (byte) (this.set$0 | 2);
            return this;
        }

        @Override // com.google.firebase.installations.InstallationTokenResult.Builder
        public InstallationTokenResult.Builder setTokenExpirationTimestamp(long j6) {
            this.tokenExpirationTimestamp = j6;
            this.set$0 = (byte) (this.set$0 | 1);
            return this;
        }

        public Builder() {
        }

        private Builder(InstallationTokenResult installationTokenResult) {
            this.token = installationTokenResult.getToken();
            this.tokenExpirationTimestamp = installationTokenResult.getTokenExpirationTimestamp();
            this.tokenCreationTimestamp = installationTokenResult.getTokenCreationTimestamp();
            this.set$0 = (byte) 3;
        }
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof InstallationTokenResult) {
            InstallationTokenResult installationTokenResult = (InstallationTokenResult) obj;
            if (this.token.equals(installationTokenResult.getToken()) && this.tokenExpirationTimestamp == installationTokenResult.getTokenExpirationTimestamp() && this.tokenCreationTimestamp == installationTokenResult.getTokenCreationTimestamp()) {
                return true;
            }
        }
        return false;
    }

    @Override // com.google.firebase.installations.InstallationTokenResult
    @NonNull
    public String getToken() {
        return this.token;
    }

    @Override // com.google.firebase.installations.InstallationTokenResult
    @NonNull
    public long getTokenCreationTimestamp() {
        return this.tokenCreationTimestamp;
    }

    @Override // com.google.firebase.installations.InstallationTokenResult
    @NonNull
    public long getTokenExpirationTimestamp() {
        return this.tokenExpirationTimestamp;
    }

    public int hashCode() {
        int iHashCode = (this.token.hashCode() ^ 1000003) * 1000003;
        long j6 = this.tokenExpirationTimestamp;
        long j10 = this.tokenCreationTimestamp;
        return ((iHashCode ^ ((int) (j6 ^ (j6 >>> 32)))) * 1000003) ^ ((int) (j10 ^ (j10 >>> 32)));
    }

    @Override // com.google.firebase.installations.InstallationTokenResult
    public InstallationTokenResult.Builder toBuilder() {
        return new Builder(this);
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("InstallationTokenResult{token=");
        sb2.append(this.token);
        sb2.append(", tokenExpirationTimestamp=");
        sb2.append(this.tokenExpirationTimestamp);
        sb2.append(", tokenCreationTimestamp=");
        return q0.n(sb2, "}", this.tokenCreationTimestamp);
    }

    private AutoValue_InstallationTokenResult(String str, long j6, long j10) {
        this.token = str;
        this.tokenExpirationTimestamp = j6;
        this.tokenCreationTimestamp = j10;
    }
}
