package com.transsnet.palmpay.cash_in.bean.response;

import kotlin.Metadata;
import kotlin.jvm.JvmField;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\u0018\u00002\u00020\u0001B9\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\t\u0010\nR\u0014\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0016\u0010\u0004\u001a\u0004\u0018\u00010\u00058\u0006@\u0006X\u0087\u000e¢\u0006\u0004\n\u0002\u0010\u000bR\u0014\u0010\u0006\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000¨\u0006\f"}, d2 = {"Lcom/transsnet/palmpay/cash_in/bean/response/QueryUssdLastOrderResp;", "", "bankCode", "", "hasUssdRecord", "", "orderNo", "bankUrl", "bankName", "<init>", "(Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "Ljava/lang/Boolean;", "module_cash_in_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class QueryUssdLastOrderResp {

    @JvmField
    @Nullable
    public String bankCode;

    @JvmField
    @Nullable
    public String bankName;

    @JvmField
    @Nullable
    public String bankUrl;

    @JvmField
    @Nullable
    public Boolean hasUssdRecord;

    @JvmField
    @Nullable
    public String orderNo;

    public QueryUssdLastOrderResp(@Nullable String str, @Nullable Boolean bool, @Nullable String str2, @Nullable String str3, @Nullable String str4) {
        this.bankCode = str;
        this.hasUssdRecord = bool;
        this.orderNo = str2;
        this.bankUrl = str3;
        this.bankName = str4;
    }
}
