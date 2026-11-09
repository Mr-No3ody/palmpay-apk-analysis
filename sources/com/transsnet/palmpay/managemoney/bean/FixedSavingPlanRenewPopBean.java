package com.transsnet.palmpay.managemoney.bean;

import C0.G;
import N8.q0;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.camera.video.u;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0016\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0086\b\u0018\u0000 92\u00020\u0001:\u00019BW\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0003\u0012\b\b\u0002\u0010\b\u001a\u00020\u0003\u0012\b\b\u0002\u0010\t\u001a\u00020\u0003\u0012\b\b\u0002\u0010\n\u001a\u00020\u0003\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\f\u0010\rB\u0011\b\u0016\u0012\u0006\u0010\u000e\u001a\u00020\u000f¢\u0006\u0004\b\f\u0010\u0010J\b\u0010%\u001a\u00020&H\u0016J\u0018\u0010'\u001a\u00020(2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010)\u001a\u00020&H\u0016J\t\u0010*\u001a\u00020\u0003HÆ\u0003J\u000b\u0010+\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010,\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\t\u0010-\u001a\u00020\u0003HÆ\u0003J\t\u0010.\u001a\u00020\u0003HÆ\u0003J\t\u0010/\u001a\u00020\u0003HÆ\u0003J\t\u00100\u001a\u00020\u0003HÆ\u0003J\u000b\u00101\u001a\u0004\u0018\u00010\u0005HÆ\u0003J_\u00102\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\u00032\b\b\u0002\u0010\t\u001a\u00020\u00032\b\b\u0002\u0010\n\u001a\u00020\u00032\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\u0013\u00103\u001a\u0002042\b\u00105\u001a\u0004\u0018\u000106HÖ\u0003J\t\u00107\u001a\u00020&HÖ\u0001J\t\u00108\u001a\u00020\u0005HÖ\u0001R\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018R\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u0016\"\u0004\b\u001a\u0010\u0018R\u001a\u0010\u0007\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001b\u0010\u0012\"\u0004\b\u001c\u0010\u0014R\u001a\u0010\b\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001d\u0010\u0012\"\u0004\b\u001e\u0010\u0014R\u001a\u0010\t\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001f\u0010\u0012\"\u0004\b \u0010\u0014R\u001a\u0010\n\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b!\u0010\u0012\"\u0004\b\"\u0010\u0014R\u001c\u0010\u000b\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b#\u0010\u0016\"\u0004\b$\u0010\u0018¨\u0006:"}, d2 = {"Lcom/transsnet/palmpay/managemoney/bean/FixedSavingPlanRenewPopBean;", "Landroid/os/Parcelable;", "productId", "", "productName", "", "orderId", "totalPayback", "maturityDate", "nextTotalPayback", "nextMaturityDate", "mainOrderId", "<init>", "(JLjava/lang/String;Ljava/lang/String;JJJJLjava/lang/String;)V", "parcel", "Landroid/os/Parcel;", "(Landroid/os/Parcel;)V", "getProductId", "()J", "setProductId", "(J)V", "getProductName", "()Ljava/lang/String;", "setProductName", "(Ljava/lang/String;)V", "getOrderId", "setOrderId", "getTotalPayback", "setTotalPayback", "getMaturityDate", "setMaturityDate", "getNextTotalPayback", "setNextTotalPayback", "getNextMaturityDate", "setNextMaturityDate", "getMainOrderId", "setMainOrderId", "describeContents", "", "writeToParcel", "", "flags", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "copy", "equals", "", "other", "", "hashCode", "toString", "CREATOR", "module_wealth_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final /* data */ class FixedSavingPlanRenewPopBean implements Parcelable {

    /* JADX INFO: renamed from: CREATOR, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @Nullable
    private String mainOrderId;
    private long maturityDate;
    private long nextMaturityDate;
    private long nextTotalPayback;

    @Nullable
    private String orderId;
    private long productId;

    @Nullable
    private String productName;
    private long totalPayback;

    /* JADX INFO: renamed from: com.transsnet.palmpay.managemoney.bean.FixedSavingPlanRenewPopBean$CREATOR, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0007H\u0016J\u001d\u0010\b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH\u0016¢\u0006\u0002\u0010\f¨\u0006\r"}, d2 = {"Lcom/transsnet/palmpay/managemoney/bean/FixedSavingPlanRenewPopBean$CREATOR;", "Landroid/os/Parcelable$Creator;", "Lcom/transsnet/palmpay/managemoney/bean/FixedSavingPlanRenewPopBean;", "<init>", "()V", "createFromParcel", "parcel", "Landroid/os/Parcel;", "newArray", "", "size", "", "(I)[Lcom/transsnet/palmpay/managemoney/bean/FixedSavingPlanRenewPopBean;", "module_wealth_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion implements Parcelable.Creator<FixedSavingPlanRenewPopBean> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @NotNull
        public FixedSavingPlanRenewPopBean createFromParcel(@NotNull Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new FixedSavingPlanRenewPopBean(parcel);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @NotNull
        public FixedSavingPlanRenewPopBean[] newArray(int size) {
            return new FixedSavingPlanRenewPopBean[size];
        }
    }

    public FixedSavingPlanRenewPopBean(long j6, @Nullable String str, @Nullable String str2, long j10, long j11, long j12, long j13, @Nullable String str3) {
        this.productId = j6;
        this.productName = str;
        this.orderId = str2;
        this.totalPayback = j10;
        this.maturityDate = j11;
        this.nextTotalPayback = j12;
        this.nextMaturityDate = j13;
        this.mainOrderId = str3;
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final long getProductId() {
        return this.productId;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getProductName() {
        return this.productName;
    }

    @Nullable
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getOrderId() {
        return this.orderId;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final long getTotalPayback() {
        return this.totalPayback;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final long getMaturityDate() {
        return this.maturityDate;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final long getNextTotalPayback() {
        return this.nextTotalPayback;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final long getNextMaturityDate() {
        return this.nextMaturityDate;
    }

    @Nullable
    /* JADX INFO: renamed from: component8, reason: from getter */
    public final String getMainOrderId() {
        return this.mainOrderId;
    }

    @NotNull
    public final FixedSavingPlanRenewPopBean copy(long productId, @Nullable String productName, @Nullable String orderId, long totalPayback, long maturityDate, long nextTotalPayback, long nextMaturityDate, @Nullable String mainOrderId) {
        return new FixedSavingPlanRenewPopBean(productId, productName, orderId, totalPayback, maturityDate, nextTotalPayback, nextMaturityDate, mainOrderId);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof FixedSavingPlanRenewPopBean)) {
            return false;
        }
        FixedSavingPlanRenewPopBean fixedSavingPlanRenewPopBean = (FixedSavingPlanRenewPopBean) other;
        return this.productId == fixedSavingPlanRenewPopBean.productId && Intrinsics.c(this.productName, fixedSavingPlanRenewPopBean.productName) && Intrinsics.c(this.orderId, fixedSavingPlanRenewPopBean.orderId) && this.totalPayback == fixedSavingPlanRenewPopBean.totalPayback && this.maturityDate == fixedSavingPlanRenewPopBean.maturityDate && this.nextTotalPayback == fixedSavingPlanRenewPopBean.nextTotalPayback && this.nextMaturityDate == fixedSavingPlanRenewPopBean.nextMaturityDate && Intrinsics.c(this.mainOrderId, fixedSavingPlanRenewPopBean.mainOrderId);
    }

    @Nullable
    public final String getMainOrderId() {
        return this.mainOrderId;
    }

    public final long getMaturityDate() {
        return this.maturityDate;
    }

    public final long getNextMaturityDate() {
        return this.nextMaturityDate;
    }

    public final long getNextTotalPayback() {
        return this.nextTotalPayback;
    }

    @Nullable
    public final String getOrderId() {
        return this.orderId;
    }

    public final long getProductId() {
        return this.productId;
    }

    @Nullable
    public final String getProductName() {
        return this.productName;
    }

    public final long getTotalPayback() {
        return this.totalPayback;
    }

    public int hashCode() {
        int iHashCode = Long.hashCode(this.productId) * 31;
        String str = this.productName;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.orderId;
        int iB = q0.b(q0.b(q0.b(q0.b((iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31, 31, this.totalPayback), 31, this.maturityDate), 31, this.nextTotalPayback), 31, this.nextMaturityDate);
        String str3 = this.mainOrderId;
        return iB + (str3 != null ? str3.hashCode() : 0);
    }

    public final void setMainOrderId(@Nullable String str) {
        this.mainOrderId = str;
    }

    public final void setMaturityDate(long j6) {
        this.maturityDate = j6;
    }

    public final void setNextMaturityDate(long j6) {
        this.nextMaturityDate = j6;
    }

    public final void setNextTotalPayback(long j6) {
        this.nextTotalPayback = j6;
    }

    public final void setOrderId(@Nullable String str) {
        this.orderId = str;
    }

    public final void setProductId(long j6) {
        this.productId = j6;
    }

    public final void setProductName(@Nullable String str) {
        this.productName = str;
    }

    public final void setTotalPayback(long j6) {
        this.totalPayback = j6;
    }

    @NotNull
    public String toString() {
        long j6 = this.productId;
        String str = this.productName;
        String str2 = this.orderId;
        long j10 = this.totalPayback;
        long j11 = this.maturityDate;
        long j12 = this.nextTotalPayback;
        long j13 = this.nextMaturityDate;
        String str3 = this.mainOrderId;
        StringBuilder sb2 = new StringBuilder("FixedSavingPlanRenewPopBean(productId=");
        sb2.append(j6);
        sb2.append(", productName=");
        sb2.append(str);
        u.w(sb2, ", orderId=", str2, ", totalPayback=");
        sb2.append(j10);
        u.v(sb2, ", maturityDate=", j11, ", nextTotalPayback=");
        sb2.append(j12);
        u.v(sb2, ", nextMaturityDate=", j13, ", mainOrderId=");
        return G.r(sb2, str3, ")");
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NotNull Parcel parcel, int flags) {
        Intrinsics.checkNotNullParameter(parcel, "parcel");
        parcel.writeLong(this.productId);
        parcel.writeString(this.productName);
        parcel.writeString(this.orderId);
        parcel.writeLong(this.totalPayback);
        parcel.writeLong(this.maturityDate);
        parcel.writeLong(this.nextTotalPayback);
        parcel.writeLong(this.nextMaturityDate);
        parcel.writeString(this.mainOrderId);
    }

    public /* synthetic */ FixedSavingPlanRenewPopBean(long j6, String str, String str2, long j10, long j11, long j12, long j13, String str3, int i7, DefaultConstructorMarker defaultConstructorMarker) {
        this((i7 & 1) != 0 ? 0L : j6, str, str2, (i7 & 8) != 0 ? 0L : j10, (i7 & 16) != 0 ? 0L : j11, (i7 & 32) != 0 ? 0L : j12, (i7 & 64) != 0 ? 0L : j13, str3);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public FixedSavingPlanRenewPopBean(@NotNull Parcel parcel) {
        this(parcel.readLong(), parcel.readString(), parcel.readString(), parcel.readLong(), parcel.readLong(), parcel.readLong(), parcel.readLong(), parcel.readString());
        Intrinsics.checkNotNullParameter(parcel, "parcel");
    }
}
