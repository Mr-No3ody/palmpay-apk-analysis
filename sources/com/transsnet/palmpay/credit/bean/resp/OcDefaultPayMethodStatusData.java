package com.transsnet.palmpay.credit.bean.resp;

import kotlin.Metadata;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007R\u0015\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\n\u001a\u0004\b\b\u0010\tR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lcom/transsnet/palmpay/credit/bean/resp/OcDefaultPayMethodStatusData;", "", "flexiFlag", "", "linkConfig", "Lcom/transsnet/palmpay/credit/bean/resp/OcCommonJumpData;", "<init>", "(Ljava/lang/Boolean;Lcom/transsnet/palmpay/credit/bean/resp/OcCommonJumpData;)V", "getFlexiFlag", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getLinkConfig", "()Lcom/transsnet/palmpay/credit/bean/resp/OcCommonJumpData;", "module_flexi_export_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class OcDefaultPayMethodStatusData {

    @Nullable
    private final Boolean flexiFlag;

    @Nullable
    private final OcCommonJumpData linkConfig;

    public OcDefaultPayMethodStatusData(@Nullable Boolean bool, @Nullable OcCommonJumpData ocCommonJumpData) {
        this.flexiFlag = bool;
        this.linkConfig = ocCommonJumpData;
    }

    @Nullable
    public final Boolean getFlexiFlag() {
        return this.flexiFlag;
    }

    @Nullable
    public final OcCommonJumpData getLinkConfig() {
        return this.linkConfig;
    }
}
