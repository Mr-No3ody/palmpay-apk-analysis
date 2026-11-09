package com.transsnet.palmpay.teller.bean;

import C0.G;
import N8.q0;
import androidx.camera.video.u;
import com.transsnet.palmpay.core.base.SingleLiveData$Params;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b\u001f\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001BC\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u000b\u0010\fJ\t\u0010\u001f\u001a\u00020\u0003HÆ\u0003J\t\u0010 \u001a\u00020\u0005HÆ\u0003J\t\u0010!\u001a\u00020\u0007HÆ\u0003J\u000b\u0010\"\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010#\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010$\u001a\u0004\u0018\u00010\u0005HÆ\u0003JK\u0010%\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\u0013\u0010&\u001a\u00020'2\b\u0010(\u001a\u0004\u0018\u00010)HÖ\u0003J\t\u0010*\u001a\u00020+HÖ\u0001J\t\u0010,\u001a\u00020\u0005HÖ\u0001R\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0004\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\u001a\u0010\u0006\u001a\u00020\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018R\u001c\u0010\b\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u0012\"\u0004\b\u001a\u0010\u0014R\u001c\u0010\t\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001b\u0010\u0012\"\u0004\b\u001c\u0010\u0014R\u001c\u0010\n\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001d\u0010\u0012\"\u0004\b\u001e\u0010\u0014¨\u0006-"}, d2 = {"Lcom/transsnet/palmpay/teller/bean/DataBundleParams;", "Lcom/transsnet/palmpay/core/base/SingleLiveData$Params;", "paymentItem", "Lcom/transsnet/palmpay/teller/bean/DataBundleWalletItemBean;", "mobileNumber", "", "amount", "", "volume", "volumeUnit", "sourceCategoryId", "<init>", "(Lcom/transsnet/palmpay/teller/bean/DataBundleWalletItemBean;Ljava/lang/String;JLjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getPaymentItem", "()Lcom/transsnet/palmpay/teller/bean/DataBundleWalletItemBean;", "setPaymentItem", "(Lcom/transsnet/palmpay/teller/bean/DataBundleWalletItemBean;)V", "getMobileNumber", "()Ljava/lang/String;", "setMobileNumber", "(Ljava/lang/String;)V", "getAmount", "()J", "setAmount", "(J)V", "getVolume", "setVolume", "getVolumeUnit", "setVolumeUnit", "getSourceCategoryId", "setSourceCategoryId", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "", "other", "", "hashCode", "", "toString", "module_biller_export_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final /* data */ class DataBundleParams implements SingleLiveData$Params {
    private long amount;

    @NotNull
    private String mobileNumber;

    @NotNull
    private DataBundleWalletItemBean paymentItem;

    @Nullable
    private String sourceCategoryId;

    @Nullable
    private String volume;

    @Nullable
    private String volumeUnit;

    public DataBundleParams(@NotNull DataBundleWalletItemBean paymentItem, @NotNull String mobileNumber, long j6, @Nullable String str, @Nullable String str2, @Nullable String str3) {
        Intrinsics.checkNotNullParameter(paymentItem, "paymentItem");
        Intrinsics.checkNotNullParameter(mobileNumber, "mobileNumber");
        this.paymentItem = paymentItem;
        this.mobileNumber = mobileNumber;
        this.amount = j6;
        this.volume = str;
        this.volumeUnit = str2;
        this.sourceCategoryId = str3;
    }

    public static /* synthetic */ DataBundleParams copy$default(DataBundleParams dataBundleParams, DataBundleWalletItemBean dataBundleWalletItemBean, String str, long j6, String str2, String str3, String str4, int i7, Object obj) {
        if ((i7 & 1) != 0) {
            dataBundleWalletItemBean = dataBundleParams.paymentItem;
        }
        if ((i7 & 2) != 0) {
            str = dataBundleParams.mobileNumber;
        }
        if ((i7 & 4) != 0) {
            j6 = dataBundleParams.amount;
        }
        if ((i7 & 8) != 0) {
            str2 = dataBundleParams.volume;
        }
        if ((i7 & 16) != 0) {
            str3 = dataBundleParams.volumeUnit;
        }
        if ((i7 & 32) != 0) {
            str4 = dataBundleParams.sourceCategoryId;
        }
        String str5 = str4;
        String str6 = str2;
        long j10 = j6;
        return dataBundleParams.copy(dataBundleWalletItemBean, str, j10, str6, str3, str5);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final DataBundleWalletItemBean getPaymentItem() {
        return this.paymentItem;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getMobileNumber() {
        return this.mobileNumber;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final long getAmount() {
        return this.amount;
    }

    @Nullable
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getVolume() {
        return this.volume;
    }

    @Nullable
    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getVolumeUnit() {
        return this.volumeUnit;
    }

    @Nullable
    /* JADX INFO: renamed from: component6, reason: from getter */
    public final String getSourceCategoryId() {
        return this.sourceCategoryId;
    }

    @NotNull
    public final DataBundleParams copy(@NotNull DataBundleWalletItemBean paymentItem, @NotNull String mobileNumber, long amount, @Nullable String volume, @Nullable String volumeUnit, @Nullable String sourceCategoryId) {
        Intrinsics.checkNotNullParameter(paymentItem, "paymentItem");
        Intrinsics.checkNotNullParameter(mobileNumber, "mobileNumber");
        return new DataBundleParams(paymentItem, mobileNumber, amount, volume, volumeUnit, sourceCategoryId);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof DataBundleParams)) {
            return false;
        }
        DataBundleParams dataBundleParams = (DataBundleParams) other;
        return Intrinsics.c(this.paymentItem, dataBundleParams.paymentItem) && Intrinsics.c(this.mobileNumber, dataBundleParams.mobileNumber) && this.amount == dataBundleParams.amount && Intrinsics.c(this.volume, dataBundleParams.volume) && Intrinsics.c(this.volumeUnit, dataBundleParams.volumeUnit) && Intrinsics.c(this.sourceCategoryId, dataBundleParams.sourceCategoryId);
    }

    public final long getAmount() {
        return this.amount;
    }

    @NotNull
    public final String getMobileNumber() {
        return this.mobileNumber;
    }

    @NotNull
    public final DataBundleWalletItemBean getPaymentItem() {
        return this.paymentItem;
    }

    @Nullable
    public final String getSourceCategoryId() {
        return this.sourceCategoryId;
    }

    @Nullable
    public final String getVolume() {
        return this.volume;
    }

    @Nullable
    public final String getVolumeUnit() {
        return this.volumeUnit;
    }

    public int hashCode() {
        int iB = q0.b(G.c(this.paymentItem.hashCode() * 31, 31, this.mobileNumber), 31, this.amount);
        String str = this.volume;
        int iHashCode = (iB + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.volumeUnit;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.sourceCategoryId;
        return iHashCode2 + (str3 != null ? str3.hashCode() : 0);
    }

    public final void setAmount(long j6) {
        this.amount = j6;
    }

    public final void setMobileNumber(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.mobileNumber = str;
    }

    public final void setPaymentItem(@NotNull DataBundleWalletItemBean dataBundleWalletItemBean) {
        Intrinsics.checkNotNullParameter(dataBundleWalletItemBean, "<set-?>");
        this.paymentItem = dataBundleWalletItemBean;
    }

    public final void setSourceCategoryId(@Nullable String str) {
        this.sourceCategoryId = str;
    }

    public final void setVolume(@Nullable String str) {
        this.volume = str;
    }

    public final void setVolumeUnit(@Nullable String str) {
        this.volumeUnit = str;
    }

    @NotNull
    public String toString() {
        DataBundleWalletItemBean dataBundleWalletItemBean = this.paymentItem;
        String str = this.mobileNumber;
        long j6 = this.amount;
        String str2 = this.volume;
        String str3 = this.volumeUnit;
        String str4 = this.sourceCategoryId;
        StringBuilder sb2 = new StringBuilder("DataBundleParams(paymentItem=");
        sb2.append(dataBundleWalletItemBean);
        sb2.append(", mobileNumber=");
        sb2.append(str);
        sb2.append(", amount=");
        sb2.append(j6);
        sb2.append(", volume=");
        sb2.append(str2);
        u.x(sb2, ", volumeUnit=", str3, ", sourceCategoryId=", str4);
        sb2.append(")");
        return sb2.toString();
    }

    public /* synthetic */ DataBundleParams(DataBundleWalletItemBean dataBundleWalletItemBean, String str, long j6, String str2, String str3, String str4, int i7, DefaultConstructorMarker defaultConstructorMarker) {
        this(dataBundleWalletItemBean, str, j6, (i7 & 8) != 0 ? null : str2, (i7 & 16) != 0 ? null : str3, (i7 & 32) != 0 ? null : str4);
    }
}
