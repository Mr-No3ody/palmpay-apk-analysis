package com.transsnet.palmpay.managemoney.bean.resp;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\r\u0018\u00002\u00020\u0001BE\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\u0006\u0010\b\u001a\u00020\t\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u000b\u0010\fR\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000eR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000eR\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u000eR\u0011\u0010\u0007\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u000eR\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0013\u0010\n\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u000e¨\u0006\u0016"}, d2 = {"Lcom/transsnet/palmpay/managemoney/bean/resp/GetInterestRateConfigResp;", "", "productRate", "", "incomeTaxRate", "productRateV2", "productDesc", "autoSaveOffRetainDesc", "interestSwitchStatus", "", "businessLicense", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;)V", "getProductRate", "()Ljava/lang/String;", "getIncomeTaxRate", "getProductRateV2", "getProductDesc", "getAutoSaveOffRetainDesc", "getInterestSwitchStatus", "()I", "getBusinessLicense", "module_wealth_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class GetInterestRateConfigResp {

    @NotNull
    private final String autoSaveOffRetainDesc;

    @Nullable
    private final String businessLicense;

    @Nullable
    private final String incomeTaxRate;
    private final int interestSwitchStatus;

    @NotNull
    private final String productDesc;

    @Nullable
    private final String productRate;

    @NotNull
    private final String productRateV2;

    public GetInterestRateConfigResp(@Nullable String str, @Nullable String str2, @NotNull String productRateV2, @NotNull String productDesc, @NotNull String autoSaveOffRetainDesc, int i7, @Nullable String str3) {
        Intrinsics.checkNotNullParameter(productRateV2, "productRateV2");
        Intrinsics.checkNotNullParameter(productDesc, "productDesc");
        Intrinsics.checkNotNullParameter(autoSaveOffRetainDesc, "autoSaveOffRetainDesc");
        this.productRate = str;
        this.incomeTaxRate = str2;
        this.productRateV2 = productRateV2;
        this.productDesc = productDesc;
        this.autoSaveOffRetainDesc = autoSaveOffRetainDesc;
        this.interestSwitchStatus = i7;
        this.businessLicense = str3;
    }

    @NotNull
    public final String getAutoSaveOffRetainDesc() {
        return this.autoSaveOffRetainDesc;
    }

    @Nullable
    public final String getBusinessLicense() {
        return this.businessLicense;
    }

    @Nullable
    public final String getIncomeTaxRate() {
        return this.incomeTaxRate;
    }

    public final int getInterestSwitchStatus() {
        return this.interestSwitchStatus;
    }

    @NotNull
    public final String getProductDesc() {
        return this.productDesc;
    }

    @Nullable
    public final String getProductRate() {
        return this.productRate;
    }

    @NotNull
    public final String getProductRateV2() {
        return this.productRateV2;
    }
}
