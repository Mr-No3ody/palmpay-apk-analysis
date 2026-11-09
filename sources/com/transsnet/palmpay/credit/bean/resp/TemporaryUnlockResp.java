package com.transsnet.palmpay.credit.bean.resp;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\u0007\u0018\u0000 \u00182\u00020\u0001:\u0001\u0018B\u0007¢\u0006\u0004\b\u0002\u0010\u0003R\u001e\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u0010\n\u0002\u0010\n\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\u001c\u0010\u000b\u001a\u0004\u0018\u00010\fX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u001e\u0010\u0011\u001a\u0004\u0018\u00010\u0012X\u0086\u000e¢\u0006\u0010\n\u0002\u0010\u0017\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016¨\u0006\u0019"}, d2 = {"Lcom/transsnet/palmpay/credit/bean/resp/TemporaryUnlockResp;", "", "<init>", "()V", "remainingTimes", "", "getRemainingTimes", "()Ljava/lang/Integer;", "setRemainingTimes", "(Ljava/lang/Integer;)V", "Ljava/lang/Integer;", "unlockSuccessContent", "", "getUnlockSuccessContent", "()Ljava/lang/String;", "setUnlockSuccessContent", "(Ljava/lang/String;)V", "expireTime", "", "getExpireTime", "()Ljava/lang/Long;", "setExpireTime", "(Ljava/lang/Long;)V", "Ljava/lang/Long;", "Companion", "module_flexi_export_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class TemporaryUnlockResp {

    @NotNull
    public static final String ERROR_CODE_TMP_UNLOCK_DAY_LIMIT = "TMP_UNLOCK_DAY_LIMIT";

    @NotNull
    public static final String ERROR_CODE_TMP_UNLOCK_OVER_DUE_OVER_15_DAYS = "TMP_UNLOCK_OVER_DUE_OVER_15_DAYS";

    @Nullable
    private Long expireTime;

    @Nullable
    private Integer remainingTimes;

    @Nullable
    private String unlockSuccessContent;

    @Nullable
    public final Long getExpireTime() {
        return this.expireTime;
    }

    @Nullable
    public final Integer getRemainingTimes() {
        return this.remainingTimes;
    }

    @Nullable
    public final String getUnlockSuccessContent() {
        return this.unlockSuccessContent;
    }

    public final void setExpireTime(@Nullable Long l5) {
        this.expireTime = l5;
    }

    public final void setRemainingTimes(@Nullable Integer num) {
        this.remainingTimes = num;
    }

    public final void setUnlockSuccessContent(@Nullable String str) {
        this.unlockSuccessContent = str;
    }
}
