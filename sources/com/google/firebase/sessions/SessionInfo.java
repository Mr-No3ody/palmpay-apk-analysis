package com.google.firebase.sessions;

import C0.G;
import N8.q0;
import androidx.camera.video.u;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0018\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0080\b\u0018\u00002\u00020\u0001B?\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\u0003\u0012\u0006\u0010\f\u001a\u00020\u0003¢\u0006\u0004\b\r\u0010\u000eJ\t\u0010\u001a\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001b\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001c\u001a\u00020\u0006HÆ\u0003J\t\u0010\u001d\u001a\u00020\bHÆ\u0003J\t\u0010\u001e\u001a\u00020\nHÆ\u0003J\t\u0010\u001f\u001a\u00020\u0003HÆ\u0003J\t\u0010 \u001a\u00020\u0003HÆ\u0003JO\u0010!\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\u00032\b\b\u0002\u0010\f\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\"\u001a\u00020#2\b\u0010$\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010%\u001a\u00020\u0006HÖ\u0001J\t\u0010&\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0010R\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0011\u0010\t\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0011\u0010\u000b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0010R\u0011\u0010\f\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0010¨\u0006'"}, d2 = {"Lcom/google/firebase/sessions/SessionInfo;", "", "sessionId", "", "firstSessionId", "sessionIndex", "", "eventTimestampUs", "", "dataCollectionStatus", "Lcom/google/firebase/sessions/DataCollectionStatus;", "firebaseInstallationId", "firebaseAuthenticationToken", "<init>", "(Ljava/lang/String;Ljava/lang/String;IJLcom/google/firebase/sessions/DataCollectionStatus;Ljava/lang/String;Ljava/lang/String;)V", "getSessionId", "()Ljava/lang/String;", "getFirstSessionId", "getSessionIndex", "()I", "getEventTimestampUs", "()J", "getDataCollectionStatus", "()Lcom/google/firebase/sessions/DataCollectionStatus;", "getFirebaseInstallationId", "getFirebaseAuthenticationToken", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "equals", "", "other", "hashCode", "toString", "com.google.firebase-firebase-sessions"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class SessionInfo {

    @NotNull
    private final DataCollectionStatus dataCollectionStatus;
    private final long eventTimestampUs;

    @NotNull
    private final String firebaseAuthenticationToken;

    @NotNull
    private final String firebaseInstallationId;

    @NotNull
    private final String firstSessionId;

    @NotNull
    private final String sessionId;
    private final int sessionIndex;

    public SessionInfo(@NotNull String sessionId, @NotNull String firstSessionId, int i7, long j6, @NotNull DataCollectionStatus dataCollectionStatus, @NotNull String firebaseInstallationId, @NotNull String firebaseAuthenticationToken) {
        Intrinsics.checkNotNullParameter(sessionId, "sessionId");
        Intrinsics.checkNotNullParameter(firstSessionId, "firstSessionId");
        Intrinsics.checkNotNullParameter(dataCollectionStatus, "dataCollectionStatus");
        Intrinsics.checkNotNullParameter(firebaseInstallationId, "firebaseInstallationId");
        Intrinsics.checkNotNullParameter(firebaseAuthenticationToken, "firebaseAuthenticationToken");
        this.sessionId = sessionId;
        this.firstSessionId = firstSessionId;
        this.sessionIndex = i7;
        this.eventTimestampUs = j6;
        this.dataCollectionStatus = dataCollectionStatus;
        this.firebaseInstallationId = firebaseInstallationId;
        this.firebaseAuthenticationToken = firebaseAuthenticationToken;
    }

    public static /* synthetic */ SessionInfo copy$default(SessionInfo sessionInfo, String str, String str2, int i7, long j6, DataCollectionStatus dataCollectionStatus, String str3, String str4, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = sessionInfo.sessionId;
        }
        if ((i10 & 2) != 0) {
            str2 = sessionInfo.firstSessionId;
        }
        if ((i10 & 4) != 0) {
            i7 = sessionInfo.sessionIndex;
        }
        if ((i10 & 8) != 0) {
            j6 = sessionInfo.eventTimestampUs;
        }
        if ((i10 & 16) != 0) {
            dataCollectionStatus = sessionInfo.dataCollectionStatus;
        }
        if ((i10 & 32) != 0) {
            str3 = sessionInfo.firebaseInstallationId;
        }
        if ((i10 & 64) != 0) {
            str4 = sessionInfo.firebaseAuthenticationToken;
        }
        String str5 = str4;
        DataCollectionStatus dataCollectionStatus2 = dataCollectionStatus;
        long j10 = j6;
        int i11 = i7;
        return sessionInfo.copy(str, str2, i11, j10, dataCollectionStatus2, str3, str5);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getSessionId() {
        return this.sessionId;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getFirstSessionId() {
        return this.firstSessionId;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final int getSessionIndex() {
        return this.sessionIndex;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final long getEventTimestampUs() {
        return this.eventTimestampUs;
    }

    @NotNull
    /* JADX INFO: renamed from: component5, reason: from getter */
    public final DataCollectionStatus getDataCollectionStatus() {
        return this.dataCollectionStatus;
    }

    @NotNull
    /* JADX INFO: renamed from: component6, reason: from getter */
    public final String getFirebaseInstallationId() {
        return this.firebaseInstallationId;
    }

    @NotNull
    /* JADX INFO: renamed from: component7, reason: from getter */
    public final String getFirebaseAuthenticationToken() {
        return this.firebaseAuthenticationToken;
    }

    @NotNull
    public final SessionInfo copy(@NotNull String sessionId, @NotNull String firstSessionId, int sessionIndex, long eventTimestampUs, @NotNull DataCollectionStatus dataCollectionStatus, @NotNull String firebaseInstallationId, @NotNull String firebaseAuthenticationToken) {
        Intrinsics.checkNotNullParameter(sessionId, "sessionId");
        Intrinsics.checkNotNullParameter(firstSessionId, "firstSessionId");
        Intrinsics.checkNotNullParameter(dataCollectionStatus, "dataCollectionStatus");
        Intrinsics.checkNotNullParameter(firebaseInstallationId, "firebaseInstallationId");
        Intrinsics.checkNotNullParameter(firebaseAuthenticationToken, "firebaseAuthenticationToken");
        return new SessionInfo(sessionId, firstSessionId, sessionIndex, eventTimestampUs, dataCollectionStatus, firebaseInstallationId, firebaseAuthenticationToken);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SessionInfo)) {
            return false;
        }
        SessionInfo sessionInfo = (SessionInfo) other;
        return Intrinsics.c(this.sessionId, sessionInfo.sessionId) && Intrinsics.c(this.firstSessionId, sessionInfo.firstSessionId) && this.sessionIndex == sessionInfo.sessionIndex && this.eventTimestampUs == sessionInfo.eventTimestampUs && Intrinsics.c(this.dataCollectionStatus, sessionInfo.dataCollectionStatus) && Intrinsics.c(this.firebaseInstallationId, sessionInfo.firebaseInstallationId) && Intrinsics.c(this.firebaseAuthenticationToken, sessionInfo.firebaseAuthenticationToken);
    }

    @NotNull
    public final DataCollectionStatus getDataCollectionStatus() {
        return this.dataCollectionStatus;
    }

    public final long getEventTimestampUs() {
        return this.eventTimestampUs;
    }

    @NotNull
    public final String getFirebaseAuthenticationToken() {
        return this.firebaseAuthenticationToken;
    }

    @NotNull
    public final String getFirebaseInstallationId() {
        return this.firebaseInstallationId;
    }

    @NotNull
    public final String getFirstSessionId() {
        return this.firstSessionId;
    }

    @NotNull
    public final String getSessionId() {
        return this.sessionId;
    }

    public final int getSessionIndex() {
        return this.sessionIndex;
    }

    public int hashCode() {
        return this.firebaseAuthenticationToken.hashCode() + G.c((this.dataCollectionStatus.hashCode() + q0.b(u.b(this.sessionIndex, G.c(this.sessionId.hashCode() * 31, 31, this.firstSessionId), 31), 31, this.eventTimestampUs)) * 31, 31, this.firebaseInstallationId);
    }

    @NotNull
    public String toString() {
        StringBuilder sb2 = new StringBuilder("SessionInfo(sessionId=");
        sb2.append(this.sessionId);
        sb2.append(", firstSessionId=");
        sb2.append(this.firstSessionId);
        sb2.append(", sessionIndex=");
        sb2.append(this.sessionIndex);
        sb2.append(", eventTimestampUs=");
        sb2.append(this.eventTimestampUs);
        sb2.append(", dataCollectionStatus=");
        sb2.append(this.dataCollectionStatus);
        sb2.append(", firebaseInstallationId=");
        sb2.append(this.firebaseInstallationId);
        sb2.append(", firebaseAuthenticationToken=");
        return u.p(sb2, this.firebaseAuthenticationToken, ')');
    }
}
