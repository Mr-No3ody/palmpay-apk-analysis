package com.google.firebase.sessions.settings;

import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p162kg.A;
import p162kg.C1814f;
import p162kg.C1824p;
import p162kg.G;
import p162kg.L;
import p162kg.V;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u000e\n\u0002\u0010\u000e\n\u0002\b\u0013\b\u0081\b\u0018\u0000 62\u00020\u0001:\u000276B9\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u000b\u0010\fBM\b\u0010\u0012\u0006\u0010\r\u001a\u00020\u0006\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e¢\u0006\u0004\b\u000b\u0010\u0010J'\u0010\u0019\u001a\u00020\u00162\u0006\u0010\u0011\u001a\u00020\u00002\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u0014H\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u0012\u0010\u001a\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u001bJ\u0012\u0010\u001c\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u001dJ\u0012\u0010\u001e\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b\u001e\u0010\u001fJ\u0012\u0010 \u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b \u0010\u001fJ\u0012\u0010!\u001a\u0004\u0018\u00010\tHÆ\u0003¢\u0006\u0004\b!\u0010\"JL\u0010#\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\tHÆ\u0001¢\u0006\u0004\b#\u0010$J\u0010\u0010&\u001a\u00020%HÖ\u0001¢\u0006\u0004\b&\u0010'J\u0010\u0010(\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b(\u0010)J\u001a\u0010+\u001a\u00020\u00022\b\u0010*\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b+\u0010,R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010-\u001a\u0004\b.\u0010\u001bR\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010/\u001a\u0004\b0\u0010\u001dR\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u00101\u001a\u0004\b2\u0010\u001fR\u0019\u0010\b\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\b\u00101\u001a\u0004\b3\u0010\u001fR\u0019\u0010\n\u001a\u0004\u0018\u00010\t8\u0006¢\u0006\f\n\u0004\b\n\u00104\u001a\u0004\b5\u0010\"¨\u00068"}, d2 = {"Lcom/google/firebase/sessions/settings/SessionConfigs;", "", "", "sessionsEnabled", "", "sessionSamplingRate", "", "sessionTimeoutSeconds", "cacheDurationSeconds", "", "cacheUpdatedTimeSeconds", "<init>", "(Ljava/lang/Boolean;Ljava/lang/Double;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Long;)V", "seen0", "Lkg/V;", "serializationConstructorMarker", "(ILjava/lang/Boolean;Ljava/lang/Double;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Long;Lkg/V;)V", "self", "Lkotlinx/serialization/encoding/CompositeEncoder;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$com_google_firebase_firebase_sessions", "(Lcom/google/firebase/sessions/settings/SessionConfigs;Lkotlinx/serialization/encoding/CompositeEncoder;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "component1", "()Ljava/lang/Boolean;", "component2", "()Ljava/lang/Double;", "component3", "()Ljava/lang/Integer;", "component4", "component5", "()Ljava/lang/Long;", "copy", "(Ljava/lang/Boolean;Ljava/lang/Double;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Long;)Lcom/google/firebase/sessions/settings/SessionConfigs;", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/Boolean;", "getSessionsEnabled", "Ljava/lang/Double;", "getSessionSamplingRate", "Ljava/lang/Integer;", "getSessionTimeoutSeconds", "getCacheDurationSeconds", "Ljava/lang/Long;", "getCacheUpdatedTimeSeconds", "Companion", "$serializer", "com.google.firebase-firebase-sessions"}, k = 1, mv = {2, 0, 0}, xi = 48)
@Serializable
public final /* data */ class SessionConfigs {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @Nullable
    private final Integer cacheDurationSeconds;

    @Nullable
    private final Long cacheUpdatedTimeSeconds;

    @Nullable
    private final Double sessionSamplingRate;

    @Nullable
    private final Integer sessionTimeoutSeconds;

    @Nullable
    private final Boolean sessionsEnabled;

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, d2 = {"Lcom/google/firebase/sessions/settings/SessionConfigs$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/google/firebase/sessions/settings/SessionConfigs;", "com.google.firebase-firebase-sessions"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        @NotNull
        public final KSerializer<SessionConfigs> serializer() {
            return SessionConfigs$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public /* synthetic */ SessionConfigs(int i7, Boolean bool, Double d2, Integer num, Integer num2, Long l5, V v3) {
        if (31 != (i7 & 31)) {
            L.e(SessionConfigs$$serializer.INSTANCE.getDescriptor(), i7, 31);
            throw null;
        }
        this.sessionsEnabled = bool;
        this.sessionSamplingRate = d2;
        this.sessionTimeoutSeconds = num;
        this.cacheDurationSeconds = num2;
        this.cacheUpdatedTimeSeconds = l5;
    }

    public static /* synthetic */ SessionConfigs copy$default(SessionConfigs sessionConfigs, Boolean bool, Double d2, Integer num, Integer num2, Long l5, int i7, Object obj) {
        if ((i7 & 1) != 0) {
            bool = sessionConfigs.sessionsEnabled;
        }
        if ((i7 & 2) != 0) {
            d2 = sessionConfigs.sessionSamplingRate;
        }
        if ((i7 & 4) != 0) {
            num = sessionConfigs.sessionTimeoutSeconds;
        }
        if ((i7 & 8) != 0) {
            num2 = sessionConfigs.cacheDurationSeconds;
        }
        if ((i7 & 16) != 0) {
            l5 = sessionConfigs.cacheUpdatedTimeSeconds;
        }
        Long l6 = l5;
        Integer num3 = num;
        return sessionConfigs.copy(bool, d2, num3, num2, l6);
    }

    @JvmStatic
    public static final /* synthetic */ void write$Self$com_google_firebase_firebase_sessions(SessionConfigs self, CompositeEncoder output, SerialDescriptor serialDesc) {
        output.encodeNullableSerializableElement(serialDesc, 0, C1814f.f38838a, self.sessionsEnabled);
        output.encodeNullableSerializableElement(serialDesc, 1, C1824p.f38870a, self.sessionSamplingRate);
        A a3 = A.f38776a;
        output.encodeNullableSerializableElement(serialDesc, 2, a3, self.sessionTimeoutSeconds);
        output.encodeNullableSerializableElement(serialDesc, 3, a3, self.cacheDurationSeconds);
        output.encodeNullableSerializableElement(serialDesc, 4, G.f38786a, self.cacheUpdatedTimeSeconds);
    }

    @Nullable
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final Boolean getSessionsEnabled() {
        return this.sessionsEnabled;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final Double getSessionSamplingRate() {
        return this.sessionSamplingRate;
    }

    @Nullable
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final Integer getSessionTimeoutSeconds() {
        return this.sessionTimeoutSeconds;
    }

    @Nullable
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final Integer getCacheDurationSeconds() {
        return this.cacheDurationSeconds;
    }

    @Nullable
    /* JADX INFO: renamed from: component5, reason: from getter */
    public final Long getCacheUpdatedTimeSeconds() {
        return this.cacheUpdatedTimeSeconds;
    }

    @NotNull
    public final SessionConfigs copy(@Nullable Boolean sessionsEnabled, @Nullable Double sessionSamplingRate, @Nullable Integer sessionTimeoutSeconds, @Nullable Integer cacheDurationSeconds, @Nullable Long cacheUpdatedTimeSeconds) {
        return new SessionConfigs(sessionsEnabled, sessionSamplingRate, sessionTimeoutSeconds, cacheDurationSeconds, cacheUpdatedTimeSeconds);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SessionConfigs)) {
            return false;
        }
        SessionConfigs sessionConfigs = (SessionConfigs) other;
        return Intrinsics.c(this.sessionsEnabled, sessionConfigs.sessionsEnabled) && Intrinsics.c(this.sessionSamplingRate, sessionConfigs.sessionSamplingRate) && Intrinsics.c(this.sessionTimeoutSeconds, sessionConfigs.sessionTimeoutSeconds) && Intrinsics.c(this.cacheDurationSeconds, sessionConfigs.cacheDurationSeconds) && Intrinsics.c(this.cacheUpdatedTimeSeconds, sessionConfigs.cacheUpdatedTimeSeconds);
    }

    @Nullable
    public final Integer getCacheDurationSeconds() {
        return this.cacheDurationSeconds;
    }

    @Nullable
    public final Long getCacheUpdatedTimeSeconds() {
        return this.cacheUpdatedTimeSeconds;
    }

    @Nullable
    public final Double getSessionSamplingRate() {
        return this.sessionSamplingRate;
    }

    @Nullable
    public final Integer getSessionTimeoutSeconds() {
        return this.sessionTimeoutSeconds;
    }

    @Nullable
    public final Boolean getSessionsEnabled() {
        return this.sessionsEnabled;
    }

    public int hashCode() {
        Boolean bool = this.sessionsEnabled;
        int iHashCode = (bool == null ? 0 : bool.hashCode()) * 31;
        Double d2 = this.sessionSamplingRate;
        int iHashCode2 = (iHashCode + (d2 == null ? 0 : d2.hashCode())) * 31;
        Integer num = this.sessionTimeoutSeconds;
        int iHashCode3 = (iHashCode2 + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.cacheDurationSeconds;
        int iHashCode4 = (iHashCode3 + (num2 == null ? 0 : num2.hashCode())) * 31;
        Long l5 = this.cacheUpdatedTimeSeconds;
        return iHashCode4 + (l5 != null ? l5.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "SessionConfigs(sessionsEnabled=" + this.sessionsEnabled + ", sessionSamplingRate=" + this.sessionSamplingRate + ", sessionTimeoutSeconds=" + this.sessionTimeoutSeconds + ", cacheDurationSeconds=" + this.cacheDurationSeconds + ", cacheUpdatedTimeSeconds=" + this.cacheUpdatedTimeSeconds + ')';
    }

    public SessionConfigs(@Nullable Boolean bool, @Nullable Double d2, @Nullable Integer num, @Nullable Integer num2, @Nullable Long l5) {
        this.sessionsEnabled = bool;
        this.sessionSamplingRate = d2;
        this.sessionTimeoutSeconds = num;
        this.cacheDurationSeconds = num2;
        this.cacheUpdatedTimeSeconds = l5;
    }
}
