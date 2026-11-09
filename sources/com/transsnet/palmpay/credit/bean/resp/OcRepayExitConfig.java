package com.transsnet.palmpay.credit.bean.resp;

import kotlin.Metadata;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0015\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\b\u001a\u0004\b\u0006\u0010\u0007¨\u0006\t"}, d2 = {"Lcom/transsnet/palmpay/credit/bean/resp/OcRepayExitConfig;", "", "creditLimit", "", "<init>", "(Ljava/lang/Long;)V", "getCreditLimit", "()Ljava/lang/Long;", "Ljava/lang/Long;", "module_flexi_export_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class OcRepayExitConfig {

    @Nullable
    private final Long creditLimit;

    public OcRepayExitConfig(@Nullable Long l5) {
        this.creditLimit = l5;
    }

    @Nullable
    public final Long getCreditLimit() {
        return this.creditLimit;
    }
}
