package com.transsnet.palmpay.credit.bean.resp;

import com.google.firebase.messaging.Constants;
import com.transsnet.palmpay.core.bean.CommonResult;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u000b\u0010\b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0015\u0010\t\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, d2 = {"Lcom/transsnet/palmpay/credit/bean/resp/CLRepaymentPlanResp;", "Lcom/transsnet/palmpay/core/bean/CommonResult;", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "Lcom/transsnet/palmpay/credit/bean/resp/CLRepaymentPlanData;", "<init>", "(Lcom/transsnet/palmpay/credit/bean/resp/CLRepaymentPlanData;)V", "getData", "()Lcom/transsnet/palmpay/credit/bean/resp/CLRepaymentPlanData;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "module_flexi_export_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final /* data */ class CLRepaymentPlanResp extends CommonResult {

    @Nullable
    private final CLRepaymentPlanData data;

    public CLRepaymentPlanResp(@Nullable CLRepaymentPlanData cLRepaymentPlanData) {
        this.data = cLRepaymentPlanData;
    }

    public static /* synthetic */ CLRepaymentPlanResp copy$default(CLRepaymentPlanResp cLRepaymentPlanResp, CLRepaymentPlanData cLRepaymentPlanData, int i7, Object obj) {
        if ((i7 & 1) != 0) {
            cLRepaymentPlanData = cLRepaymentPlanResp.data;
        }
        return cLRepaymentPlanResp.copy(cLRepaymentPlanData);
    }

    @Nullable
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final CLRepaymentPlanData getData() {
        return this.data;
    }

    @NotNull
    public final CLRepaymentPlanResp copy(@Nullable CLRepaymentPlanData data) {
        return new CLRepaymentPlanResp(data);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof CLRepaymentPlanResp) && Intrinsics.c(this.data, ((CLRepaymentPlanResp) other).data);
    }

    @Nullable
    public final CLRepaymentPlanData getData() {
        return this.data;
    }

    public int hashCode() {
        CLRepaymentPlanData cLRepaymentPlanData = this.data;
        if (cLRepaymentPlanData == null) {
            return 0;
        }
        return cLRepaymentPlanData.hashCode();
    }

    @Override // com.transsnet.palmpay.core.bean.CommonResult
    @NotNull
    public String toString() {
        return "CLRepaymentPlanResp(data=" + this.data + ")";
    }
}
