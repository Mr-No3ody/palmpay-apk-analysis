package com.transsnet.palmpay.core.bean.req;

import kotlin.Metadata;
import kotlin.jvm.JvmField;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007R\u0010\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\b"}, d2 = {"Lcom/transsnet/palmpay/core/bean/req/MemberLabelReq;", "", "bussinessType", "", "status", "", "<init>", "(ILjava/lang/String;)V", "lib_core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class MemberLabelReq {

    @JvmField
    public final int bussinessType;

    @JvmField
    @NotNull
    public final String status;

    public MemberLabelReq(int i7, @NotNull String status) {
        Intrinsics.checkNotNullParameter(status, "status");
        this.bussinessType = i7;
        this.status = status;
    }
}
