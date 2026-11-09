package com.transsnet.palmpay.credit.bean.req;

import com.google.firebase.analytics.FirebaseAnalytics;
import com.transsnet.palmpay.credit.bean.resp.RepaymentPlan;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\t\n\u0002\b\u000e\u0018\u00002\u00020\u0001BI\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0010\b\u0002\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\f\u0010\rR\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0019\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u000fR\u0015\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\n\n\u0002\u0010\u0015\u001a\u0004\b\u0013\u0010\u0014R\u0015\u0010\n\u001a\u0004\u0018\u00010\u000b¢\u0006\n\n\u0002\u0010\u0018\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0019"}, d2 = {"Lcom/transsnet/palmpay/credit/bean/req/CLSaveCashierContextOrderExtend;", "", FirebaseAnalytics.Param.TERM, "", "largeRepaymentPlan", "", "Lcom/transsnet/palmpay/credit/bean/resp/RepaymentPlan;", "purpose", "freePasswordFlag", "", "managementFee", "", "<init>", "(Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Long;)V", "getTerm", "()Ljava/lang/String;", "getLargeRepaymentPlan", "()Ljava/util/List;", "getPurpose", "getFreePasswordFlag", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getManagementFee", "()Ljava/lang/Long;", "Ljava/lang/Long;", "module_flexi_export_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class CLSaveCashierContextOrderExtend {

    @Nullable
    private final Boolean freePasswordFlag;

    @Nullable
    private final List<RepaymentPlan> largeRepaymentPlan;

    @Nullable
    private final Long managementFee;

    @Nullable
    private final String purpose;

    @Nullable
    private final String term;

    public CLSaveCashierContextOrderExtend() {
        this(null, null, null, null, null, 31, null);
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
    public final Long getManagementFee() {
        return this.managementFee;
    }

    @Nullable
    public final String getPurpose() {
        return this.purpose;
    }

    @Nullable
    public final String getTerm() {
        return this.term;
    }

    public CLSaveCashierContextOrderExtend(@Nullable String str, @Nullable List<RepaymentPlan> list, @Nullable String str2, @Nullable Boolean bool, @Nullable Long l5) {
        this.term = str;
        this.largeRepaymentPlan = list;
        this.purpose = str2;
        this.freePasswordFlag = bool;
        this.managementFee = l5;
    }

    public /* synthetic */ CLSaveCashierContextOrderExtend(String str, List list, String str2, Boolean bool, Long l5, int i7, DefaultConstructorMarker defaultConstructorMarker) {
        this((i7 & 1) != 0 ? null : str, (i7 & 2) != 0 ? null : list, (i7 & 4) != 0 ? null : str2, (i7 & 8) != 0 ? Boolean.FALSE : bool, (i7 & 16) != 0 ? 0L : l5);
    }
}
