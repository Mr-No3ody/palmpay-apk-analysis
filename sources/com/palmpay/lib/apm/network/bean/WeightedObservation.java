package com.palmpay.lib.apm.network.bean;

import androidx.camera.video.u;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0006\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\t\u0010\f\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0015"}, d2 = {"Lcom/palmpay/lib/apm/network/bean/WeightedObservation;", "", "value", "", "weight", "", "(JD)V", "getValue", "()J", "getWeight", "()D", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "apm_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final /* data */ class WeightedObservation {
    private final long value;
    private final double weight;

    public WeightedObservation(long j6, double d2) {
        this.value = j6;
        this.weight = d2;
    }

    public static /* synthetic */ WeightedObservation copy$default(WeightedObservation weightedObservation, long j6, double d2, int i7, Object obj) {
        if ((i7 & 1) != 0) {
            j6 = weightedObservation.value;
        }
        if ((i7 & 2) != 0) {
            d2 = weightedObservation.weight;
        }
        return weightedObservation.copy(j6, d2);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final long getValue() {
        return this.value;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final double getWeight() {
        return this.weight;
    }

    @NotNull
    public final WeightedObservation copy(long value, double weight) {
        return new WeightedObservation(value, weight);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof WeightedObservation)) {
            return false;
        }
        WeightedObservation weightedObservation = (WeightedObservation) other;
        return this.value == weightedObservation.value && Double.compare(this.weight, weightedObservation.weight) == 0;
    }

    public final long getValue() {
        return this.value;
    }

    public final double getWeight() {
        return this.weight;
    }

    public int hashCode() {
        return Double.hashCode(this.weight) + (Long.hashCode(this.value) * 31);
    }

    @NotNull
    public String toString() {
        long j6 = this.value;
        double d2 = this.weight;
        StringBuilder sbR = u.r(j6, "WeightedObservation(value=", ", weight=");
        sbR.append(d2);
        sbR.append(")");
        return sbR.toString();
    }
}
