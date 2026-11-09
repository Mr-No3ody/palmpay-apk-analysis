package com.transsnet.palmpay.teller.bean.resp;

import C0.G;
import androidx.camera.camera2.internal.F;
import com.transsnet.palmpay.custom_view.input.InputSelectImpl;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B%\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\n\u0010\f\u001a\u0004\u0018\u00010\u0003H\u0016J\n\u0010\r\u001a\u0004\u0018\u00010\u0003H\u0016J\n\u0010\u000e\u001a\u0004\u0018\u00010\u0003H\u0016J\u000b\u0010\u000f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0003HÆ\u0003J-\u0010\u0012\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0016HÖ\u0003J\t\u0010\u0017\u001a\u00020\u0018HÖ\u0001J\t\u0010\u0019\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\tR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\t¨\u0006\u001a"}, d2 = {"Lcom/transsnet/palmpay/teller/bean/resp/RechargeHistoryBean;", "Lcom/transsnet/palmpay/custom_view/input/InputSelectImpl;", "customer", "", "billerName", "remark", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getCustomer", "()Ljava/lang/String;", "getBillerName", "getRemark", "getTag", "getItemName", "getItemHint", "component1", "component2", "component3", "copy", "equals", "", "other", "", "hashCode", "", "toString", "module_biller_export_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final /* data */ class RechargeHistoryBean implements InputSelectImpl {

    @Nullable
    private final String billerName;

    @Nullable
    private final String customer;

    @Nullable
    private final String remark;

    public RechargeHistoryBean(@Nullable String str, @Nullable String str2, @Nullable String str3) {
        this.customer = str;
        this.billerName = str2;
        this.remark = str3;
    }

    public static /* synthetic */ RechargeHistoryBean copy$default(RechargeHistoryBean rechargeHistoryBean, String str, String str2, String str3, int i7, Object obj) {
        if ((i7 & 1) != 0) {
            str = rechargeHistoryBean.customer;
        }
        if ((i7 & 2) != 0) {
            str2 = rechargeHistoryBean.billerName;
        }
        if ((i7 & 4) != 0) {
            str3 = rechargeHistoryBean.remark;
        }
        return rechargeHistoryBean.copy(str, str2, str3);
    }

    @Nullable
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getCustomer() {
        return this.customer;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getBillerName() {
        return this.billerName;
    }

    @Nullable
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getRemark() {
        return this.remark;
    }

    @NotNull
    public final RechargeHistoryBean copy(@Nullable String customer, @Nullable String billerName, @Nullable String remark) {
        return new RechargeHistoryBean(customer, billerName, remark);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof RechargeHistoryBean)) {
            return false;
        }
        RechargeHistoryBean rechargeHistoryBean = (RechargeHistoryBean) other;
        return Intrinsics.c(this.customer, rechargeHistoryBean.customer) && Intrinsics.c(this.billerName, rechargeHistoryBean.billerName) && Intrinsics.c(this.remark, rechargeHistoryBean.remark);
    }

    @Nullable
    public final String getBillerName() {
        return this.billerName;
    }

    @Nullable
    public final String getCustomer() {
        return this.customer;
    }

    @Override // com.transsnet.palmpay.custom_view.input.InputSelectImpl
    @Nullable
    public String getItemHint() {
        return this.billerName;
    }

    @Override // com.transsnet.palmpay.custom_view.input.InputSelectImpl
    @Nullable
    public String getItemName() {
        return this.customer;
    }

    @Nullable
    public final String getRemark() {
        return this.remark;
    }

    @Override // com.transsnet.palmpay.custom_view.input.InputSelectImpl
    @Nullable
    public String getTag() {
        return this.remark;
    }

    public int hashCode() {
        String str = this.customer;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.billerName;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.remark;
        return iHashCode2 + (str3 != null ? str3.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        String str = this.customer;
        String str2 = this.billerName;
        return G.r(F.f("RechargeHistoryBean(customer=", str, ", billerName=", str2, ", remark="), this.remark, ")");
    }
}
