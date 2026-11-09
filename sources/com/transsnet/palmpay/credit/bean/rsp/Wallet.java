package com.transsnet.palmpay.credit.bean.rsp;

import kotlin.Metadata;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u001b\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b¨\u0006\n"}, d2 = {"Lcom/transsnet/palmpay/credit/bean/rsp/Wallet;", "", "applySourceName", "", "mobileNo", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "getApplySourceName", "()Ljava/lang/String;", "getMobileNo", "module_flexi_export_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class Wallet {

    @Nullable
    private final String applySourceName;

    @Nullable
    private final String mobileNo;

    public Wallet(@Nullable String str, @Nullable String str2) {
        this.applySourceName = str;
        this.mobileNo = str2;
    }

    @Nullable
    public final String getApplySourceName() {
        return this.applySourceName;
    }

    @Nullable
    public final String getMobileNo() {
        return this.mobileNo;
    }
}
