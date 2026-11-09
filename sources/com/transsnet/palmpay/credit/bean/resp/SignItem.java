package com.transsnet.palmpay.credit.bean.resp;

import kotlin.Metadata;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u0015\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\t\u001a\u0004\b\u0007\u0010\bR\u0015\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\t\u001a\u0004\b\n\u0010\b¨\u0006\u000b"}, d2 = {"Lcom/transsnet/palmpay/credit/bean/resp/SignItem;", "", "signType", "", "signStatus", "<init>", "(Ljava/lang/Integer;Ljava/lang/Integer;)V", "getSignType", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getSignStatus", "module_flexi_export_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class SignItem {

    @Nullable
    private final Integer signStatus;

    @Nullable
    private final Integer signType;

    public SignItem(@Nullable Integer num, @Nullable Integer num2) {
        this.signType = num;
        this.signStatus = num2;
    }

    @Nullable
    public final Integer getSignStatus() {
        return this.signStatus;
    }

    @Nullable
    public final Integer getSignType() {
        return this.signType;
    }
}
