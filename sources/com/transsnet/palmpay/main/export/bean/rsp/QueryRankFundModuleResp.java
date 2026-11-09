package com.transsnet.palmpay.main.export.bean.rsp;

import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.JvmField;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B'\u0012\u000e\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003\u0012\u000e\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0003¢\u0006\u0004\b\u0007\u0010\bR\u001a\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u001a\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000¨\u0006\t"}, d2 = {"Lcom/transsnet/palmpay/main/export/bean/rsp/QueryRankFundModuleResp;", "", "rankingListTypeList", "", "Lcom/transsnet/palmpay/main/export/bean/rsp/QueryRankFundModul;", "recommendedFundInfoList", "Lcom/transsnet/palmpay/main/export/bean/rsp/QueryFundModuleResp;", "<init>", "(Ljava/util/List;Ljava/util/List;)V", "module_main_export_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class QueryRankFundModuleResp {

    @JvmField
    @Nullable
    public List<QueryRankFundModul> rankingListTypeList;

    @JvmField
    @Nullable
    public List<QueryFundModuleResp> recommendedFundInfoList;

    public QueryRankFundModuleResp(@Nullable List<QueryRankFundModul> list, @Nullable List<QueryFundModuleResp> list2) {
        this.rankingListTypeList = list;
        this.recommendedFundInfoList = list2;
    }
}
