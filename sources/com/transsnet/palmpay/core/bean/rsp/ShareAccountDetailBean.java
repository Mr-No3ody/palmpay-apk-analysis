package com.transsnet.palmpay.core.bean.rsp;

import kotlin.Metadata;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u000f\u0018\u00002\u00020\u0001B-\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tR\u001c\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000b\"\u0004\b\u000f\u0010\rR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u000b\"\u0004\b\u0011\u0010\rR\u001a\u0010\u0006\u001a\u00020\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015¨\u0006\u0016"}, d2 = {"Lcom/transsnet/palmpay/core/bean/rsp/ShareAccountDetailBean;", "", "memberId", "", "accountNo", "transType", "businessType", "", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;I)V", "getMemberId", "()Ljava/lang/String;", "setMemberId", "(Ljava/lang/String;)V", "getAccountNo", "setAccountNo", "getTransType", "setTransType", "getBusinessType", "()I", "setBusinessType", "(I)V", "lib_core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class ShareAccountDetailBean {

    @Nullable
    private String accountNo;
    private int businessType;

    @Nullable
    private String memberId;

    @Nullable
    private String transType;

    public ShareAccountDetailBean(@Nullable String str, @Nullable String str2, @Nullable String str3, int i7) {
        this.memberId = str;
        this.accountNo = str2;
        this.transType = str3;
        this.businessType = i7;
    }

    @Nullable
    public final String getAccountNo() {
        return this.accountNo;
    }

    public final int getBusinessType() {
        return this.businessType;
    }

    @Nullable
    public final String getMemberId() {
        return this.memberId;
    }

    @Nullable
    public final String getTransType() {
        return this.transType;
    }

    public final void setAccountNo(@Nullable String str) {
        this.accountNo = str;
    }

    public final void setBusinessType(int i7) {
        this.businessType = i7;
    }

    public final void setMemberId(@Nullable String str) {
        this.memberId = str;
    }

    public final void setTransType(@Nullable String str) {
        this.transType = str;
    }
}
