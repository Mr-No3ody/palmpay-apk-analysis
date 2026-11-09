package com.google.firebase.installations.local;

import C0.G;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.airbnb.lottie.model.layer.d;

/* JADX INFO: loaded from: classes2.dex */
final class AutoValue_PersistedInstallationEntry extends PersistedInstallationEntry {
    private final String authToken;
    private final long expiresInSecs;
    private final String firebaseInstallationId;
    private final String fisError;
    private final String refreshToken;
    private final PersistedInstallation.RegistrationStatus registrationStatus;
    private final long tokenCreationEpochInSecs;

    public static final class Builder extends PersistedInstallationEntry.Builder {
        private String authToken;
        private long expiresInSecs;
        private String firebaseInstallationId;
        private String fisError;
        private String refreshToken;
        private PersistedInstallation.RegistrationStatus registrationStatus;
        private byte set$0;
        private long tokenCreationEpochInSecs;

        @Override // com.google.firebase.installations.local.PersistedInstallationEntry.Builder
        public PersistedInstallationEntry build() {
            if (this.set$0 == 3 && this.registrationStatus != null) {
                return new AutoValue_PersistedInstallationEntry(this.firebaseInstallationId, this.registrationStatus, this.authToken, this.refreshToken, this.expiresInSecs, this.tokenCreationEpochInSecs, this.fisError);
            }
            StringBuilder sb2 = new StringBuilder();
            if (this.registrationStatus == null) {
                sb2.append(" registrationStatus");
            }
            if ((this.set$0 & 1) == 0) {
                sb2.append(" expiresInSecs");
            }
            if ((this.set$0 & 2) == 0) {
                sb2.append(" tokenCreationEpochInSecs");
            }
            throw new IllegalStateException(d.m("Missing required properties:", sb2));
        }

        @Override // com.google.firebase.installations.local.PersistedInstallationEntry.Builder
        public PersistedInstallationEntry.Builder setAuthToken(@Nullable String str) {
            this.authToken = str;
            return this;
        }

        @Override // com.google.firebase.installations.local.PersistedInstallationEntry.Builder
        public PersistedInstallationEntry.Builder setExpiresInSecs(long j6) {
            this.expiresInSecs = j6;
            this.set$0 = (byte) (this.set$0 | 1);
            return this;
        }

        @Override // com.google.firebase.installations.local.PersistedInstallationEntry.Builder
        public PersistedInstallationEntry.Builder setFirebaseInstallationId(String str) {
            this.firebaseInstallationId = str;
            return this;
        }

        @Override // com.google.firebase.installations.local.PersistedInstallationEntry.Builder
        public PersistedInstallationEntry.Builder setFisError(@Nullable String str) {
            this.fisError = str;
            return this;
        }

        @Override // com.google.firebase.installations.local.PersistedInstallationEntry.Builder
        public PersistedInstallationEntry.Builder setRefreshToken(@Nullable String str) {
            this.refreshToken = str;
            return this;
        }

        @Override // com.google.firebase.installations.local.PersistedInstallationEntry.Builder
        public PersistedInstallationEntry.Builder setRegistrationStatus(PersistedInstallation.RegistrationStatus registrationStatus) {
            if (registrationStatus == null) {
                throw new NullPointerException("Null registrationStatus");
            }
            this.registrationStatus = registrationStatus;
            return this;
        }

        @Override // com.google.firebase.installations.local.PersistedInstallationEntry.Builder
        public PersistedInstallationEntry.Builder setTokenCreationEpochInSecs(long j6) {
            this.tokenCreationEpochInSecs = j6;
            this.set$0 = (byte) (this.set$0 | 2);
            return this;
        }

        public Builder() {
        }

        private Builder(PersistedInstallationEntry persistedInstallationEntry) {
            this.firebaseInstallationId = persistedInstallationEntry.getFirebaseInstallationId();
            this.registrationStatus = persistedInstallationEntry.getRegistrationStatus();
            this.authToken = persistedInstallationEntry.getAuthToken();
            this.refreshToken = persistedInstallationEntry.getRefreshToken();
            this.expiresInSecs = persistedInstallationEntry.getExpiresInSecs();
            this.tokenCreationEpochInSecs = persistedInstallationEntry.getTokenCreationEpochInSecs();
            this.fisError = persistedInstallationEntry.getFisError();
            this.set$0 = (byte) 3;
        }
    }

    public boolean equals(Object obj) {
        String str;
        String str2;
        String str3;
        if (obj == this) {
            return true;
        }
        if (obj instanceof PersistedInstallationEntry) {
            PersistedInstallationEntry persistedInstallationEntry = (PersistedInstallationEntry) obj;
            String str4 = this.firebaseInstallationId;
            if (str4 != null ? str4.equals(persistedInstallationEntry.getFirebaseInstallationId()) : persistedInstallationEntry.getFirebaseInstallationId() == null) {
                if (this.registrationStatus.equals(persistedInstallationEntry.getRegistrationStatus()) && ((str = this.authToken) != null ? str.equals(persistedInstallationEntry.getAuthToken()) : persistedInstallationEntry.getAuthToken() == null) && ((str2 = this.refreshToken) != null ? str2.equals(persistedInstallationEntry.getRefreshToken()) : persistedInstallationEntry.getRefreshToken() == null) && this.expiresInSecs == persistedInstallationEntry.getExpiresInSecs() && this.tokenCreationEpochInSecs == persistedInstallationEntry.getTokenCreationEpochInSecs() && ((str3 = this.fisError) != null ? str3.equals(persistedInstallationEntry.getFisError()) : persistedInstallationEntry.getFisError() == null)) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // com.google.firebase.installations.local.PersistedInstallationEntry
    @Nullable
    public String getAuthToken() {
        return this.authToken;
    }

    @Override // com.google.firebase.installations.local.PersistedInstallationEntry
    public long getExpiresInSecs() {
        return this.expiresInSecs;
    }

    @Override // com.google.firebase.installations.local.PersistedInstallationEntry
    @Nullable
    public String getFirebaseInstallationId() {
        return this.firebaseInstallationId;
    }

    @Override // com.google.firebase.installations.local.PersistedInstallationEntry
    @Nullable
    public String getFisError() {
        return this.fisError;
    }

    @Override // com.google.firebase.installations.local.PersistedInstallationEntry
    @Nullable
    public String getRefreshToken() {
        return this.refreshToken;
    }

    @Override // com.google.firebase.installations.local.PersistedInstallationEntry
    @NonNull
    public PersistedInstallation.RegistrationStatus getRegistrationStatus() {
        return this.registrationStatus;
    }

    @Override // com.google.firebase.installations.local.PersistedInstallationEntry
    public long getTokenCreationEpochInSecs() {
        return this.tokenCreationEpochInSecs;
    }

    public int hashCode() {
        String str = this.firebaseInstallationId;
        int iHashCode = ((((str == null ? 0 : str.hashCode()) ^ 1000003) * 1000003) ^ this.registrationStatus.hashCode()) * 1000003;
        String str2 = this.authToken;
        int iHashCode2 = (iHashCode ^ (str2 == null ? 0 : str2.hashCode())) * 1000003;
        String str3 = this.refreshToken;
        int iHashCode3 = (iHashCode2 ^ (str3 == null ? 0 : str3.hashCode())) * 1000003;
        long j6 = this.expiresInSecs;
        int i7 = (iHashCode3 ^ ((int) (j6 ^ (j6 >>> 32)))) * 1000003;
        long j10 = this.tokenCreationEpochInSecs;
        int i10 = (i7 ^ ((int) (j10 ^ (j10 >>> 32)))) * 1000003;
        String str4 = this.fisError;
        return i10 ^ (str4 != null ? str4.hashCode() : 0);
    }

    @Override // com.google.firebase.installations.local.PersistedInstallationEntry
    public PersistedInstallationEntry.Builder toBuilder() {
        return new Builder(this);
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("PersistedInstallationEntry{firebaseInstallationId=");
        sb2.append(this.firebaseInstallationId);
        sb2.append(", registrationStatus=");
        sb2.append(this.registrationStatus);
        sb2.append(", authToken=");
        sb2.append(this.authToken);
        sb2.append(", refreshToken=");
        sb2.append(this.refreshToken);
        sb2.append(", expiresInSecs=");
        sb2.append(this.expiresInSecs);
        sb2.append(", tokenCreationEpochInSecs=");
        sb2.append(this.tokenCreationEpochInSecs);
        sb2.append(", fisError=");
        return G.r(sb2, this.fisError, "}");
    }

    private AutoValue_PersistedInstallationEntry(@Nullable String str, PersistedInstallation.RegistrationStatus registrationStatus, @Nullable String str2, @Nullable String str3, long j6, long j10, @Nullable String str4) {
        this.firebaseInstallationId = str;
        this.registrationStatus = registrationStatus;
        this.authToken = str2;
        this.refreshToken = str3;
        this.expiresInSecs = j6;
        this.tokenCreationEpochInSecs = j10;
        this.fisError = str4;
    }
}
