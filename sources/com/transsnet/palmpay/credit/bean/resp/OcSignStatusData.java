package com.transsnet.palmpay.credit.bean.resp;

import kotlin.Metadata;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\u0018\u0000 \t2\u00020\u0001:\u0001\tB\u0011\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0015\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\b\u001a\u0004\b\u0006\u0010\u0007¨\u0006\n"}, d2 = {"Lcom/transsnet/palmpay/credit/bean/resp/OcSignStatusData;", "", "type", "", "<init>", "(Ljava/lang/Integer;)V", "getType", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "Companion", "module_flexi_export_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class OcSignStatusData {
    public static final int DOUBLE_SIGN = 3;
    public static final int NO_SIGN = 0;
    public static final int SINGLE_SIGN_CASH = 2;
    public static final int SINGLE_SIGN_FLEXI = 1;

    @Nullable
    private final Integer type;

    public OcSignStatusData(@Nullable Integer num) {
        this.type = num;
    }

    @Nullable
    public final Integer getType() {
        return this.type;
    }
}
