package com.transsnet.palmpay.core.bean.req;

import kotlin.Metadata;
import kotlin.jvm.JvmField;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u0007\u0010\bR\u0010\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\t"}, d2 = {"Lcom/transsnet/palmpay/core/bean/req/QueryRecipientReq;", "", "orderSourceType", "", "number", "memberId", "", "<init>", "(IILjava/lang/String;)V", "lib_core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class QueryRecipientReq {

    @JvmField
    @Nullable
    public final String memberId;

    @JvmField
    public final int number;

    @JvmField
    public final int orderSourceType;

    public QueryRecipientReq(int i7, int i10, @Nullable String str) {
        this.orderSourceType = i7;
        this.number = i10;
        this.memberId = str;
    }

    public /* synthetic */ QueryRecipientReq(int i7, int i10, String str, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(i7, i10, (i11 & 4) != 0 ? "" : str);
    }
}
