package com.palmpay.lib.apm.network.bean;

import com.microsoft.codepush.react.CodePushConstants;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u0019\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0005J\u0010\u0010\n\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u0007J\u0010\u0010\u000b\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u0007J&\u0010\f\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003HÆ\u0001¢\u0006\u0002\u0010\rJ\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001R\u0015\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\b\u001a\u0004\b\u0006\u0010\u0007R\u0015\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\b\u001a\u0004\b\t\u0010\u0007¨\u0006\u0015"}, d2 = {"Lcom/palmpay/lib/apm/network/bean/RttRecord;", "", "rtt", "", CodePushConstants.LATEST_ROLLBACK_TIME_KEY, "(Ljava/lang/Long;Ljava/lang/Long;)V", "getRtt", "()Ljava/lang/Long;", "Ljava/lang/Long;", "getTime", "component1", "component2", "copy", "(Ljava/lang/Long;Ljava/lang/Long;)Lcom/palmpay/lib/apm/network/bean/RttRecord;", "equals", "", "other", "hashCode", "", "toString", "", "apm_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final /* data */ class RttRecord {

    @Nullable
    private final Long rtt;

    @Nullable
    private final Long time;

    public RttRecord(@Nullable Long l5, @Nullable Long l6) {
        this.rtt = l5;
        this.time = l6;
    }

    public static /* synthetic */ RttRecord copy$default(RttRecord rttRecord, Long l5, Long l6, int i7, Object obj) {
        if ((i7 & 1) != 0) {
            l5 = rttRecord.rtt;
        }
        if ((i7 & 2) != 0) {
            l6 = rttRecord.time;
        }
        return rttRecord.copy(l5, l6);
    }

    @Nullable
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final Long getRtt() {
        return this.rtt;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final Long getTime() {
        return this.time;
    }

    @NotNull
    public final RttRecord copy(@Nullable Long rtt, @Nullable Long time) {
        return new RttRecord(rtt, time);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof RttRecord)) {
            return false;
        }
        RttRecord rttRecord = (RttRecord) other;
        return Intrinsics.c(this.rtt, rttRecord.rtt) && Intrinsics.c(this.time, rttRecord.time);
    }

    @Nullable
    public final Long getRtt() {
        return this.rtt;
    }

    @Nullable
    public final Long getTime() {
        return this.time;
    }

    public int hashCode() {
        Long l5 = this.rtt;
        int iHashCode = (l5 == null ? 0 : l5.hashCode()) * 31;
        Long l6 = this.time;
        return iHashCode + (l6 != null ? l6.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "RttRecord(rtt=" + this.rtt + ", time=" + this.time + ")";
    }
}
