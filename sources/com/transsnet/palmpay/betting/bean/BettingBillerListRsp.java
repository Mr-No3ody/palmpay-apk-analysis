package com.transsnet.palmpay.betting.bean;

import java.util.List;
import kotlin.Metadata;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u000b\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003R\"\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\"\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\b\"\u0004\b\r\u0010\nR\"\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\b\"\u0004\b\u0010\u0010\n¨\u0006\u0011"}, d2 = {"Lcom/transsnet/palmpay/betting/bean/BettingBillerListRsp;", "", "<init>", "()V", "historyBillers", "", "Lcom/transsnet/palmpay/betting/bean/BettingBillerListItemBean;", "getHistoryBillers", "()Ljava/util/List;", "setHistoryBillers", "(Ljava/util/List;)V", "recommendBillers", "getRecommendBillers", "setRecommendBillers", "allBillers", "getAllBillers", "setAllBillers", "module_biller_export_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class BettingBillerListRsp {

    @Nullable
    private List<BettingBillerListItemBean> allBillers;

    @Nullable
    private List<BettingBillerListItemBean> historyBillers;

    @Nullable
    private List<BettingBillerListItemBean> recommendBillers;

    @Nullable
    public final List<BettingBillerListItemBean> getAllBillers() {
        return this.allBillers;
    }

    @Nullable
    public final List<BettingBillerListItemBean> getHistoryBillers() {
        return this.historyBillers;
    }

    @Nullable
    public final List<BettingBillerListItemBean> getRecommendBillers() {
        return this.recommendBillers;
    }

    public final void setAllBillers(@Nullable List<BettingBillerListItemBean> list) {
        this.allBillers = list;
    }

    public final void setHistoryBillers(@Nullable List<BettingBillerListItemBean> list) {
        this.historyBillers = list;
    }

    public final void setRecommendBillers(@Nullable List<BettingBillerListItemBean> list) {
        this.recommendBillers = list;
    }
}
