package com.transsnet.palmpay.account.bean.rsp;

/* JADX INFO: loaded from: classes3.dex */
public class QueryT3QuotaRsp {
    private static final long STEP_AMOUNT = 10000000;
    public boolean defaultLimit;
    public long maxTransactionLimit;
    public long minTransactionLimit;
    public boolean needAuth;
    public long recommendTransactionLimit;

    public int getMaxProgress() {
        return (int) ((this.maxTransactionLimit - this.minTransactionLimit) / STEP_AMOUNT);
    }

    public int getProgress(long j6) {
        long j10 = this.minTransactionLimit;
        return j6 < j10 ? getMaxProgress() : (int) ((j6 - j10) / STEP_AMOUNT);
    }

    public long getTransactionLimit(int i7) {
        return (((long) i7) * STEP_AMOUNT) + this.minTransactionLimit;
    }
}
