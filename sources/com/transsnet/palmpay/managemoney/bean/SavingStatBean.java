package com.transsnet.palmpay.managemoney.bean;

import N8.q0;
import androidx.camera.video.u;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B%\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J'\u0010\u000f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\tR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\t¨\u0006\u0017"}, d2 = {"Lcom/transsnet/palmpay/managemoney/bean/SavingStatBean;", "", "totalSavingBalance", "", "onHold", "maturedEarning", "<init>", "(JJJ)V", "getTotalSavingBalance", "()J", "getOnHold", "getMaturedEarning", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "", "module_wealth_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final /* data */ class SavingStatBean {
    private final long maturedEarning;
    private final long onHold;
    private final long totalSavingBalance;

    public SavingStatBean() {
        this(0L, 0L, 0L, 7, null);
    }

    public static /* synthetic */ SavingStatBean copy$default(SavingStatBean savingStatBean, long j6, long j10, long j11, int i7, Object obj) {
        if ((i7 & 1) != 0) {
            j6 = savingStatBean.totalSavingBalance;
        }
        long j12 = j6;
        if ((i7 & 2) != 0) {
            j10 = savingStatBean.onHold;
        }
        long j13 = j10;
        if ((i7 & 4) != 0) {
            j11 = savingStatBean.maturedEarning;
        }
        return savingStatBean.copy(j12, j13, j11);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final long getTotalSavingBalance() {
        return this.totalSavingBalance;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final long getOnHold() {
        return this.onHold;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final long getMaturedEarning() {
        return this.maturedEarning;
    }

    @NotNull
    public final SavingStatBean copy(long totalSavingBalance, long onHold, long maturedEarning) {
        return new SavingStatBean(totalSavingBalance, onHold, maturedEarning);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SavingStatBean)) {
            return false;
        }
        SavingStatBean savingStatBean = (SavingStatBean) other;
        return this.totalSavingBalance == savingStatBean.totalSavingBalance && this.onHold == savingStatBean.onHold && this.maturedEarning == savingStatBean.maturedEarning;
    }

    public final long getMaturedEarning() {
        return this.maturedEarning;
    }

    public final long getOnHold() {
        return this.onHold;
    }

    public final long getTotalSavingBalance() {
        return this.totalSavingBalance;
    }

    public int hashCode() {
        return Long.hashCode(this.maturedEarning) + q0.b(Long.hashCode(this.totalSavingBalance) * 31, 31, this.onHold);
    }

    @NotNull
    public String toString() {
        long j6 = this.totalSavingBalance;
        long j10 = this.onHold;
        long j11 = this.maturedEarning;
        StringBuilder sbR = u.r(j6, "SavingStatBean(totalSavingBalance=", ", onHold=");
        sbR.append(j10);
        sbR.append(", maturedEarning=");
        sbR.append(j11);
        sbR.append(")");
        return sbR.toString();
    }

    public SavingStatBean(long j6, long j10, long j11) {
        this.totalSavingBalance = j6;
        this.onHold = j10;
        this.maturedEarning = j11;
    }

    public /* synthetic */ SavingStatBean(long j6, long j10, long j11, int i7, DefaultConstructorMarker defaultConstructorMarker) {
        this((i7 & 1) != 0 ? 0L : j6, (i7 & 2) != 0 ? 0L : j10, (i7 & 4) != 0 ? 0L : j11);
    }
}
