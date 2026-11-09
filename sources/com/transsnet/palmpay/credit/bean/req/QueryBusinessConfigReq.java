package com.transsnet.palmpay.credit.bean.req;

import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0015\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lcom/transsnet/palmpay/credit/bean/req/QueryBusinessConfigReq;", "", "scenes", "", "", "<init>", "(Ljava/util/List;)V", "getScenes", "()Ljava/util/List;", "module_flexi_export_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class QueryBusinessConfigReq {

    @NotNull
    private final List<String> scenes;

    public QueryBusinessConfigReq(@NotNull List<String> scenes) {
        Intrinsics.checkNotNullParameter(scenes, "scenes");
        this.scenes = scenes;
    }

    @NotNull
    public final List<String> getScenes() {
        return this.scenes;
    }
}
