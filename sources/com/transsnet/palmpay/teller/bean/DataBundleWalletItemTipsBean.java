package com.transsnet.palmpay.teller.bean;

import androidx.camera.camera2.internal.F;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0016\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B7\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\b\u0010\tJ\u000b\u0010\u0017\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0018\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0019\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010\u001a\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0002\u0010\u0013J>\u0010\u001b\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÆ\u0001¢\u0006\u0002\u0010\u001cJ\u0013\u0010\u001d\u001a\u00020\u001e2\b\u0010\u001f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010 \u001a\u00020!HÖ\u0001J\t\u0010\"\u001a\u00020\u0003HÖ\u0001R\u001c\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000b\"\u0004\b\u000f\u0010\rR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u000b\"\u0004\b\u0011\u0010\rR\u001e\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u0086\u000e¢\u0006\u0010\n\u0002\u0010\u0016\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015¨\u0006#"}, d2 = {"Lcom/transsnet/palmpay/teller/bean/DataBundleWalletItemTipsBean;", "", "billerName", "", "paymentItemId", "remark", "deductionAmount", "", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;)V", "getBillerName", "()Ljava/lang/String;", "setBillerName", "(Ljava/lang/String;)V", "getPaymentItemId", "setPaymentItemId", "getRemark", "setRemark", "getDeductionAmount", "()Ljava/lang/Long;", "setDeductionAmount", "(Ljava/lang/Long;)V", "Ljava/lang/Long;", "component1", "component2", "component3", "component4", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;)Lcom/transsnet/palmpay/teller/bean/DataBundleWalletItemTipsBean;", "equals", "", "other", "hashCode", "", "toString", "module_biller_export_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final /* data */ class DataBundleWalletItemTipsBean {

    @Nullable
    private String billerName;

    @Nullable
    private Long deductionAmount;

    @Nullable
    private String paymentItemId;

    @Nullable
    private String remark;

    public DataBundleWalletItemTipsBean() {
        this(null, null, null, null, 15, null);
    }

    public static /* synthetic */ DataBundleWalletItemTipsBean copy$default(DataBundleWalletItemTipsBean dataBundleWalletItemTipsBean, String str, String str2, String str3, Long l5, int i7, Object obj) {
        if ((i7 & 1) != 0) {
            str = dataBundleWalletItemTipsBean.billerName;
        }
        if ((i7 & 2) != 0) {
            str2 = dataBundleWalletItemTipsBean.paymentItemId;
        }
        if ((i7 & 4) != 0) {
            str3 = dataBundleWalletItemTipsBean.remark;
        }
        if ((i7 & 8) != 0) {
            l5 = dataBundleWalletItemTipsBean.deductionAmount;
        }
        return dataBundleWalletItemTipsBean.copy(str, str2, str3, l5);
    }

    @Nullable
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getBillerName() {
        return this.billerName;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getPaymentItemId() {
        return this.paymentItemId;
    }

    @Nullable
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getRemark() {
        return this.remark;
    }

    @Nullable
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final Long getDeductionAmount() {
        return this.deductionAmount;
    }

    @NotNull
    public final DataBundleWalletItemTipsBean copy(@Nullable String billerName, @Nullable String paymentItemId, @Nullable String remark, @Nullable Long deductionAmount) {
        return new DataBundleWalletItemTipsBean(billerName, paymentItemId, remark, deductionAmount);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof DataBundleWalletItemTipsBean)) {
            return false;
        }
        DataBundleWalletItemTipsBean dataBundleWalletItemTipsBean = (DataBundleWalletItemTipsBean) other;
        return Intrinsics.c(this.billerName, dataBundleWalletItemTipsBean.billerName) && Intrinsics.c(this.paymentItemId, dataBundleWalletItemTipsBean.paymentItemId) && Intrinsics.c(this.remark, dataBundleWalletItemTipsBean.remark) && Intrinsics.c(this.deductionAmount, dataBundleWalletItemTipsBean.deductionAmount);
    }

    @Nullable
    public final String getBillerName() {
        return this.billerName;
    }

    @Nullable
    public final Long getDeductionAmount() {
        return this.deductionAmount;
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
        String str = this.billerName;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.paymentItemId;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.remark;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        Long l5 = this.deductionAmount;
        return iHashCode3 + (l5 != null ? l5.hashCode() : 0);
    }

    public final void setBillerName(@Nullable String str) {
        this.billerName = str;
    }

    public final void setDeductionAmount(@Nullable Long l5) {
        this.deductionAmount = l5;
    }

    public final void setPaymentItemId(@Nullable String str) {
        this.paymentItemId = str;
    }

    public final void setRemark(@Nullable String str) {
        this.remark = str;
    }

    @NotNull
    public String toString() {
        String str = this.billerName;
        String str2 = this.paymentItemId;
        String str3 = this.remark;
        Long l5 = this.deductionAmount;
        StringBuilder sbF = F.f("DataBundleWalletItemTipsBean(billerName=", str, ", paymentItemId=", str2, ", remark=");
        sbF.append(str3);
        sbF.append(", deductionAmount=");
        sbF.append(l5);
        sbF.append(")");
        return sbF.toString();
    }

    public DataBundleWalletItemTipsBean(@Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable Long l5) {
        this.billerName = str;
        this.paymentItemId = str2;
        this.remark = str3;
        this.deductionAmount = l5;
    }

    public /* synthetic */ DataBundleWalletItemTipsBean(String str, String str2, String str3, Long l5, int i7, DefaultConstructorMarker defaultConstructorMarker) {
        this((i7 & 1) != 0 ? null : str, (i7 & 2) != 0 ? null : str2, (i7 & 4) != 0 ? null : str3, (i7 & 8) != 0 ? null : l5);
    }
}
