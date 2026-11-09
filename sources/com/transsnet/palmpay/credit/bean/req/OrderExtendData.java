package com.transsnet.palmpay.credit.bean.req;

import com.google.firebase.analytics.FirebaseAnalytics;
import com.transsnet.palmpay.credit.bean.resp.RepaymentPlan;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0010\u0018\u00002\u00020\u0001BA\u0012\u000e\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\b\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\f\u0010\rR\u0019\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0011R\u0015\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\n\n\u0002\u0010\u0015\u001a\u0004\b\u0013\u0010\u0014R\u001e\u0010\n\u001a\u0004\u0018\u00010\u000bX\u0086\u000e¢\u0006\u0010\n\u0002\u0010\u001a\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019¨\u0006\u001b"}, d2 = {"Lcom/transsnet/palmpay/credit/bean/req/OrderExtendData;", "", "largeRepaymentPlan", "", "Lcom/transsnet/palmpay/credit/bean/resp/RepaymentPlan;", "purpose", "", FirebaseAnalytics.Param.TERM, "productSubId", "", "freePasswordFlag", "", "<init>", "(Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Boolean;)V", "getLargeRepaymentPlan", "()Ljava/util/List;", "getPurpose", "()Ljava/lang/String;", "getTerm", "getProductSubId", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getFreePasswordFlag", "()Ljava/lang/Boolean;", "setFreePasswordFlag", "(Ljava/lang/Boolean;)V", "Ljava/lang/Boolean;", "module_flexi_export_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class OrderExtendData {

    @Nullable
    private Boolean freePasswordFlag;

    @Nullable
    private final List<RepaymentPlan> largeRepaymentPlan;

    @Nullable
    private final Integer productSubId;

    @Nullable
    private final String purpose;

    @Nullable
    private final String term;

    public OrderExtendData(@Nullable List<RepaymentPlan> list, @Nullable String str, @Nullable String str2, @Nullable Integer num, @Nullable Boolean bool) {
        this.largeRepaymentPlan = list;
        this.purpose = str;
        this.term = str2;
        this.productSubId = num;
        this.freePasswordFlag = bool;
    }

    @Nullable
    public final Boolean getFreePasswordFlag() {
        return this.freePasswordFlag;
    }

    @Nullable
    public final List<RepaymentPlan> getLargeRepaymentPlan() {
        return this.largeRepaymentPlan;
    }

    @Nullable
    public final Integer getProductSubId() {
        return this.productSubId;
    }

    @Nullable
    public final String getPurpose() {
        return this.purpose;
    }

    @Nullable
    public final String getTerm() {
        return this.term;
    }

    public final void setFreePasswordFlag(@Nullable Boolean bool) {
        this.freePasswordFlag = bool;
    }

    public /* synthetic */ OrderExtendData(List list, String str, String str2, Integer num, Boolean bool, int i7, DefaultConstructorMarker defaultConstructorMarker) {
        this(list, str, str2, num, (i7 & 16) != 0 ? Boolean.FALSE : bool);
    }
}
