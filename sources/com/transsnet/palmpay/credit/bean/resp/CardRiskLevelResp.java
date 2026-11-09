package com.transsnet.palmpay.credit.bean.resp;

import com.google.firebase.analytics.FirebaseAnalytics;
import kotlin.Metadata;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u000e\u0018\u00002\u00020\u0001B-\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\u0007\u001a\u00020\u0003¢\u0006\u0004\b\b\u0010\tR\u0015\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\f\u001a\u0004\b\n\u0010\u000bR\u0015\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\f\u001a\u0004\b\r\u0010\u000bR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0007\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, d2 = {"Lcom/transsnet/palmpay/credit/bean/resp/CardRiskLevelResp;", "", "termSpan", "", FirebaseAnalytics.Param.TERM, "termSpanUnit", "", "maxLoanDays", "<init>", "(Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;I)V", "getTermSpan", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getTerm", "getTermSpanUnit", "()Ljava/lang/String;", "getMaxLoanDays", "()I", "setMaxLoanDays", "(I)V", "module_flexi_export_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class CardRiskLevelResp {
    private int maxLoanDays;

    @Nullable
    private final Integer term;

    @Nullable
    private final Integer termSpan;

    @Nullable
    private final String termSpanUnit;

    public CardRiskLevelResp(@Nullable Integer num, @Nullable Integer num2, @Nullable String str, int i7) {
        this.termSpan = num;
        this.term = num2;
        this.termSpanUnit = str;
        this.maxLoanDays = i7;
    }

    public final int getMaxLoanDays() {
        return this.maxLoanDays;
    }

    @Nullable
    public final Integer getTerm() {
        return this.term;
    }

    @Nullable
    public final Integer getTermSpan() {
        return this.termSpan;
    }

    @Nullable
    public final String getTermSpanUnit() {
        return this.termSpanUnit;
    }

    public final void setMaxLoanDays(int i7) {
        this.maxLoanDays = i7;
    }
}
