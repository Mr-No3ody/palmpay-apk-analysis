package com.transsnet.palmpay.teller.bean.resp;

import N8.q0;
import com.google.firebase.messaging.Constants;
import com.transsnet.palmpay.core.bean.CommonResult;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u000b\u0010\t\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0015\u0010\n\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\u000b\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u000eHÖ\u0003J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001J\t\u0010\u0011\u001a\u00020\u0003HÖ\u0001R\u001c\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\u0005¨\u0006\u0012"}, d2 = {"Lcom/transsnet/palmpay/teller/bean/resp/BettingWithdrawRecentUserIDResp;", "Lcom/transsnet/palmpay/core/bean/CommonResult;", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "", "<init>", "(Ljava/lang/String;)V", "getData", "()Ljava/lang/String;", "setData", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "module_biller_export_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final /* data */ class BettingWithdrawRecentUserIDResp extends CommonResult {

    @Nullable
    private String data;

    public BettingWithdrawRecentUserIDResp(@Nullable String str) {
        this.data = str;
    }

    public static /* synthetic */ BettingWithdrawRecentUserIDResp copy$default(BettingWithdrawRecentUserIDResp bettingWithdrawRecentUserIDResp, String str, int i7, Object obj) {
        if ((i7 & 1) != 0) {
            str = bettingWithdrawRecentUserIDResp.data;
        }
        return bettingWithdrawRecentUserIDResp.copy(str);
    }

    @Nullable
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getData() {
        return this.data;
    }

    @NotNull
    public final BettingWithdrawRecentUserIDResp copy(@Nullable String data) {
        return new BettingWithdrawRecentUserIDResp(data);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof BettingWithdrawRecentUserIDResp) && Intrinsics.c(this.data, ((BettingWithdrawRecentUserIDResp) other).data);
    }

    @Nullable
    public final String getData() {
        return this.data;
    }

    public int hashCode() {
        String str = this.data;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }

    public final void setData(@Nullable String str) {
        this.data = str;
    }

    @Override // com.transsnet.palmpay.core.bean.CommonResult
    @NotNull
    public String toString() {
        return q0.k("BettingWithdrawRecentUserIDResp(data=", this.data, ")");
    }
}
