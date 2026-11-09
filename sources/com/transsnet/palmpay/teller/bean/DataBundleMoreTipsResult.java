package com.transsnet.palmpay.teller.bean;

import com.transsnet.palmpay.core.bean.CommonBeanResult;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B+\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\u000e\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007¢\u0006\u0004\b\t\u0010\nJ\u000b\u0010\u0012\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010\u0013\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\u000eJ\u0011\u0010\u0014\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007HÆ\u0003J8\u0010\u0015\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u0010\b\u0002\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007HÆ\u0001¢\u0006\u0002\u0010\u0016J\u0013\u0010\u0017\u001a\u00020\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001a\u001a\u00020\u0005HÖ\u0001J\t\u0010\u001b\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0015\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\n\n\u0002\u0010\u000f\u001a\u0004\b\r\u0010\u000eR\u0019\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u001c"}, d2 = {"Lcom/transsnet/palmpay/teller/bean/DataBundleMoreTipsResult;", "", "billerName", "", "bundleCategoryId", "", "response", "Lcom/transsnet/palmpay/core/bean/CommonBeanResult;", "Lcom/transsnet/palmpay/teller/bean/DataBundleExtraItemInfo;", "<init>", "(Ljava/lang/String;Ljava/lang/Integer;Lcom/transsnet/palmpay/core/bean/CommonBeanResult;)V", "getBillerName", "()Ljava/lang/String;", "getBundleCategoryId", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getResponse", "()Lcom/transsnet/palmpay/core/bean/CommonBeanResult;", "component1", "component2", "component3", "copy", "(Ljava/lang/String;Ljava/lang/Integer;Lcom/transsnet/palmpay/core/bean/CommonBeanResult;)Lcom/transsnet/palmpay/teller/bean/DataBundleMoreTipsResult;", "equals", "", "other", "hashCode", "toString", "module_biller_export_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final /* data */ class DataBundleMoreTipsResult {

    @Nullable
    private final String billerName;

    @Nullable
    private final Integer bundleCategoryId;

    @Nullable
    private final CommonBeanResult<DataBundleExtraItemInfo> response;

    public DataBundleMoreTipsResult(@Nullable String str, @Nullable Integer num, @Nullable CommonBeanResult<DataBundleExtraItemInfo> commonBeanResult) {
        this.billerName = str;
        this.bundleCategoryId = num;
        this.response = commonBeanResult;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ DataBundleMoreTipsResult copy$default(DataBundleMoreTipsResult dataBundleMoreTipsResult, String str, Integer num, CommonBeanResult commonBeanResult, int i7, Object obj) {
        if ((i7 & 1) != 0) {
            str = dataBundleMoreTipsResult.billerName;
        }
        if ((i7 & 2) != 0) {
            num = dataBundleMoreTipsResult.bundleCategoryId;
        }
        if ((i7 & 4) != 0) {
            commonBeanResult = dataBundleMoreTipsResult.response;
        }
        return dataBundleMoreTipsResult.copy(str, num, commonBeanResult);
    }

    @Nullable
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getBillerName() {
        return this.billerName;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final Integer getBundleCategoryId() {
        return this.bundleCategoryId;
    }

    @Nullable
    public final CommonBeanResult<DataBundleExtraItemInfo> component3() {
        return this.response;
    }

    @NotNull
    public final DataBundleMoreTipsResult copy(@Nullable String billerName, @Nullable Integer bundleCategoryId, @Nullable CommonBeanResult<DataBundleExtraItemInfo> response) {
        return new DataBundleMoreTipsResult(billerName, bundleCategoryId, response);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof DataBundleMoreTipsResult)) {
            return false;
        }
        DataBundleMoreTipsResult dataBundleMoreTipsResult = (DataBundleMoreTipsResult) other;
        return Intrinsics.c(this.billerName, dataBundleMoreTipsResult.billerName) && Intrinsics.c(this.bundleCategoryId, dataBundleMoreTipsResult.bundleCategoryId) && Intrinsics.c(this.response, dataBundleMoreTipsResult.response);
    }

    @Nullable
    public final String getBillerName() {
        return this.billerName;
    }

    @Nullable
    public final Integer getBundleCategoryId() {
        return this.bundleCategoryId;
    }

    @Nullable
    public final CommonBeanResult<DataBundleExtraItemInfo> getResponse() {
        return this.response;
    }

    public int hashCode() {
        String str = this.billerName;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        Integer num = this.bundleCategoryId;
        int iHashCode2 = (iHashCode + (num == null ? 0 : num.hashCode())) * 31;
        CommonBeanResult<DataBundleExtraItemInfo> commonBeanResult = this.response;
        return iHashCode2 + (commonBeanResult != null ? commonBeanResult.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "DataBundleMoreTipsResult(billerName=" + this.billerName + ", bundleCategoryId=" + this.bundleCategoryId + ", response=" + this.response + ")";
    }
}
