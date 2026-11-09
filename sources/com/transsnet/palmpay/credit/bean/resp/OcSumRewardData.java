package com.transsnet.palmpay.credit.bean.resp;

import kotlin.Metadata;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b¨\u0006\n"}, d2 = {"Lcom/transsnet/palmpay/credit/bean/resp/OcSumRewardData;", "", "reward", "", "totalReward", "<init>", "(JJ)V", "getReward", "()J", "getTotalReward", "module_flexi_export_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class OcSumRewardData {
    private final long reward;
    private final long totalReward;

    public OcSumRewardData(long j6, long j10) {
        this.reward = j6;
        this.totalReward = j10;
    }

    public final long getReward() {
        return this.reward;
    }

    public final long getTotalReward() {
        return this.totalReward;
    }
}
