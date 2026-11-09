package com.transsnet.palmpay.core.bean.req;

import kotlin.Metadata;
import kotlin.jvm.JvmField;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\u0018\u00002\u00020\u0001B+\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0007\u0010\bR\u0014\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0016\u0010\u0004\u001a\u0004\u0018\u00010\u00058\u0006@\u0006X\u0087\u000e¢\u0006\u0004\n\u0002\u0010\tR\u0014\u0010\u0006\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000¨\u0006\n"}, d2 = {"Lcom/transsnet/palmpay/core/bean/req/QueryManagementInfoReq;", "", "cardNo", "", "productSubId", "", "loanAmount", "<init>", "(Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;)V", "Ljava/lang/Integer;", "lib_core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class QueryManagementInfoReq {

    @JvmField
    @Nullable
    public String cardNo;

    @JvmField
    @Nullable
    public String loanAmount;

    @JvmField
    @Nullable
    public Integer productSubId;

    public QueryManagementInfoReq() {
        this(null, null, null, 7, null);
    }

    public QueryManagementInfoReq(@Nullable String str, @Nullable Integer num, @Nullable String str2) {
        this.cardNo = str;
        this.productSubId = num;
        this.loanAmount = str2;
    }

    public /* synthetic */ QueryManagementInfoReq(String str, Integer num, String str2, int i7, DefaultConstructorMarker defaultConstructorMarker) {
        this((i7 & 1) != 0 ? null : str, (i7 & 2) != 0 ? null : num, (i7 & 4) != 0 ? null : str2);
    }
}
