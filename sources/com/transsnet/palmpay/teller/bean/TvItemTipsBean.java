package com.transsnet.palmpay.teller.bean;

import C0.G;
import androidx.camera.camera2.internal.F;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0015\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B7\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u000b\u0010\u0013\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0014\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0015\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0016\u001a\u0004\u0018\u00010\u0003HÆ\u0003J9\u0010\u0017\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\u0018\u001a\u00020\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001b\u001a\u00020\u001cHÖ\u0001J\t\u0010\u001d\u001a\u00020\u0003HÖ\u0001R\u001c\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\n\"\u0004\b\u000e\u0010\fR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\n\"\u0004\b\u0010\u0010\fR\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\n\"\u0004\b\u0012\u0010\f¨\u0006\u001e"}, d2 = {"Lcom/transsnet/palmpay/teller/bean/TvItemTipsBean;", "", "billerId", "", "billerName", "paymentItemId", "remark", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getBillerId", "()Ljava/lang/String;", "setBillerId", "(Ljava/lang/String;)V", "getBillerName", "setBillerName", "getPaymentItemId", "setPaymentItemId", "getRemark", "setRemark", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "toString", "module_biller_export_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final /* data */ class TvItemTipsBean {

    @Nullable
    private String billerId;

    @Nullable
    private String billerName;

    @Nullable
    private String paymentItemId;

    @Nullable
    private String remark;

    public TvItemTipsBean() {
        this(null, null, null, null, 15, null);
    }

    public static /* synthetic */ TvItemTipsBean copy$default(TvItemTipsBean tvItemTipsBean, String str, String str2, String str3, String str4, int i7, Object obj) {
        if ((i7 & 1) != 0) {
            str = tvItemTipsBean.billerId;
        }
        if ((i7 & 2) != 0) {
            str2 = tvItemTipsBean.billerName;
        }
        if ((i7 & 4) != 0) {
            str3 = tvItemTipsBean.paymentItemId;
        }
        if ((i7 & 8) != 0) {
            str4 = tvItemTipsBean.remark;
        }
        return tvItemTipsBean.copy(str, str2, str3, str4);
    }

    @Nullable
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getBillerId() {
        return this.billerId;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getBillerName() {
        return this.billerName;
    }

    @Nullable
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getPaymentItemId() {
        return this.paymentItemId;
    }

    @Nullable
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getRemark() {
        return this.remark;
    }

    @NotNull
    public final TvItemTipsBean copy(@Nullable String billerId, @Nullable String billerName, @Nullable String paymentItemId, @Nullable String remark) {
        return new TvItemTipsBean(billerId, billerName, paymentItemId, remark);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof TvItemTipsBean)) {
            return false;
        }
        TvItemTipsBean tvItemTipsBean = (TvItemTipsBean) other;
        return Intrinsics.c(this.billerId, tvItemTipsBean.billerId) && Intrinsics.c(this.billerName, tvItemTipsBean.billerName) && Intrinsics.c(this.paymentItemId, tvItemTipsBean.paymentItemId) && Intrinsics.c(this.remark, tvItemTipsBean.remark);
    }

    @Nullable
    public final String getBillerId() {
        return this.billerId;
    }

    @Nullable
    public final String getBillerName() {
        return this.billerName;
    }

    @Nullable
    public final String getPaymentItemId() {
        return this.paymentItemId;
    }

    @Nullable
    public final String getRemark() {
        return this.remark;
    }

    public int hashCode() {
        String str = this.billerId;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.billerName;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.paymentItemId;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.remark;
        return iHashCode3 + (str4 != null ? str4.hashCode() : 0);
    }

    public final void setBillerId(@Nullable String str) {
        this.billerId = str;
    }

    public final void setBillerName(@Nullable String str) {
        this.billerName = str;
    }

    public final void setPaymentItemId(@Nullable String str) {
        this.paymentItemId = str;
    }

    public final void setRemark(@Nullable String str) {
        this.remark = str;
    }

    @NotNull
    public String toString() {
        String str = this.billerId;
        String str2 = this.billerName;
        return G.s(F.f("TvItemTipsBean(billerId=", str, ", billerName=", str2, ", paymentItemId="), this.paymentItemId, ", remark=", this.remark, ")");
    }

    public TvItemTipsBean(@Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable String str4) {
        this.billerId = str;
        this.billerName = str2;
        this.paymentItemId = str3;
        this.remark = str4;
    }

    public /* synthetic */ TvItemTipsBean(String str, String str2, String str3, String str4, int i7, DefaultConstructorMarker defaultConstructorMarker) {
        this((i7 & 1) != 0 ? null : str, (i7 & 2) != 0 ? null : str2, (i7 & 4) != 0 ? null : str3, (i7 & 8) != 0 ? null : str4);
    }
}
