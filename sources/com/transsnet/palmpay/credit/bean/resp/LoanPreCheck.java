package com.transsnet.palmpay.credit.bean.resp;

import java.util.List;
import kotlin.Metadata;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u000f\u0018\u00002\u00020\u0001B?\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\u000e\u0010\b\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\t\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\f\u0010\rR\u0015\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\u0010\u001a\u0004\b\u000e\u0010\u000fR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0015\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\n\n\u0002\u0010\u0015\u001a\u0004\b\u0013\u0010\u0014R\u0019\u0010\b\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0015\u0010\u000b\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\u0010\u001a\u0004\b\u0018\u0010\u000f¨\u0006\u0019"}, d2 = {"Lcom/transsnet/palmpay/credit/bean/resp/LoanPreCheck;", "", "signType", "", "cardNo", "", "needRoute", "", "signList", "", "Lcom/transsnet/palmpay/credit/bean/resp/SignItem;", "accountType", "<init>", "(Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/Boolean;Ljava/util/List;Ljava/lang/Integer;)V", "getSignType", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getCardNo", "()Ljava/lang/String;", "getNeedRoute", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getSignList", "()Ljava/util/List;", "getAccountType", "module_flexi_export_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class LoanPreCheck {

    @Nullable
    private final Integer accountType;

    @Nullable
    private final String cardNo;

    @Nullable
    private final Boolean needRoute;

    @Nullable
    private final List<SignItem> signList;

    @Nullable
    private final Integer signType;

    public LoanPreCheck(@Nullable Integer num, @Nullable String str, @Nullable Boolean bool, @Nullable List<SignItem> list, @Nullable Integer num2) {
        this.signType = num;
        this.cardNo = str;
        this.needRoute = bool;
        this.signList = list;
        this.accountType = num2;
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
    public final Boolean getNeedRoute() {
        return this.needRoute;
    }

    @Nullable
    public final List<SignItem> getSignList() {
        return this.signList;
    }

    @Nullable
    public final Integer getSignType() {
        return this.signType;
    }
}
