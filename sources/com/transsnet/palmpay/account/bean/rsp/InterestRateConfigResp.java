package com.transsnet.palmpay.account.bean.rsp;

import kotlin.Metadata;
import kotlin.jvm.JvmField;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u00002\u00020\u0001BE\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\u0006\u0010\b\u001a\u00020\t\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u000b\u0010\fR\u0012\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0005\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0006\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0007\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\b\u001a\u00020\t8\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\n\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\r"}, d2 = {"Lcom/transsnet/palmpay/account/bean/rsp/InterestRateConfigResp;", "", "productRate", "", "incomeTaxRate", "productRateV2", "productDesc", "autoSaveOffRetainDesc", "interestSwitchStatus", "", "businessLicense", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;)V", "module_account_export_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class InterestRateConfigResp {

    @JvmField
    @NotNull
    public final String autoSaveOffRetainDesc;

    @JvmField
    @Nullable
    public final String businessLicense;

    @JvmField
    @Nullable
    public final String incomeTaxRate;

    @JvmField
    public final int interestSwitchStatus;

    @JvmField
    @NotNull
    public final String productDesc;

    @JvmField
    @Nullable
    public final String productRate;

    @JvmField
    @NotNull
    public final String productRateV2;

    public InterestRateConfigResp(@Nullable String str, @Nullable String str2, @NotNull String productRateV2, @NotNull String productDesc, @NotNull String autoSaveOffRetainDesc, int i7, @Nullable String str3) {
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
}
