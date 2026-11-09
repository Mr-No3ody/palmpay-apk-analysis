package com.transsnet.palmpay.credit.bean.resp;

import kotlin.Metadata;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b\u000b\u0018\u00002\u00020\u0001B%\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\b\u0010\tR\u0015\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\f\u001a\u0004\b\n\u0010\u000bR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0015\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\n\n\u0002\u0010\u0011\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u0012"}, d2 = {"Lcom/transsnet/palmpay/credit/bean/resp/CardOverpaymentInfo;", "", "accountType", "", "cardNo", "", "overpaymentBalance", "", "<init>", "(Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/Long;)V", "getAccountType", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getCardNo", "()Ljava/lang/String;", "getOverpaymentBalance", "()Ljava/lang/Long;", "Ljava/lang/Long;", "module_flexi_export_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class CardOverpaymentInfo {

    @Nullable
    private final Integer accountType;

    @Nullable
    private final String cardNo;

    @Nullable
    private final Long overpaymentBalance;

    public CardOverpaymentInfo(@Nullable Integer num, @Nullable String str, @Nullable Long l5) {
        this.accountType = num;
        this.cardNo = str;
        this.overpaymentBalance = l5;
    }

    @Nullable
    public final Integer getAccountType() {
        return this.accountType;
    }

    @Nullable
    public final String getCardNo() {
        return this.cardNo;
    }

    @Nullable
    public final Long getOverpaymentBalance() {
        return this.overpaymentBalance;
    }
}
