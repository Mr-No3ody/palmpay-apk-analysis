package com.transsnet.palmpay.credit.bean.resp;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\u0018\u00002\u00020\u0001B#\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tR\u0015\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\f\u001a\u0004\b\n\u0010\u000bR\u0015\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\n\n\u0002\u0010\u000f\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, d2 = {"Lcom/transsnet/palmpay/credit/bean/resp/OcRepayExitData;", "", "needPop", "", "type", "", "config", "Lcom/transsnet/palmpay/credit/bean/resp/OcRepayExitConfig;", "<init>", "(Ljava/lang/Boolean;Ljava/lang/Integer;Lcom/transsnet/palmpay/credit/bean/resp/OcRepayExitConfig;)V", "getNeedPop", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getType", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getConfig", "()Lcom/transsnet/palmpay/credit/bean/resp/OcRepayExitConfig;", "module_flexi_export_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class OcRepayExitData {

    @NotNull
    private final OcRepayExitConfig config;

    @Nullable
    private final Boolean needPop;

    @Nullable
    private final Integer type;

    public OcRepayExitData(@Nullable Boolean bool, @Nullable Integer num, @NotNull OcRepayExitConfig config) {
        Intrinsics.checkNotNullParameter(config, "config");
        this.needPop = bool;
        this.type = num;
        this.config = config;
    }

    @NotNull
    public final OcRepayExitConfig getConfig() {
        return this.config;
    }

    @Nullable
    public final Boolean getNeedPop() {
        return this.needPop;
    }

    @Nullable
    public final Integer getType() {
        return this.type;
    }
}
