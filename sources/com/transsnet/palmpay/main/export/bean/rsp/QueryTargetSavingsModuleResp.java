package com.transsnet.palmpay.main.export.bean.rsp;

import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.JvmField;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0017\u0012\u000e\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u001a\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000¨\u0006\u0007"}, d2 = {"Lcom/transsnet/palmpay/main/export/bean/rsp/QueryTargetSavingsModuleResp;", "", "trendingTarget", "", "Lcom/transsnet/palmpay/main/export/bean/rsp/QueryTargetSavingsModul;", "<init>", "(Ljava/util/List;)V", "module_main_export_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class QueryTargetSavingsModuleResp {

    @JvmField
    @Nullable
    public List<QueryTargetSavingsModul> trendingTarget;

    public QueryTargetSavingsModuleResp(@Nullable List<QueryTargetSavingsModul> list) {
        this.trendingTarget = list;
    }
}
