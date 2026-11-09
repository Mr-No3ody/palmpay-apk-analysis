package com.transsnet.palmpay.core.bean.rsp;

import kotlin.Metadata;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0013\u0018\u00002\u00020\u0001B/\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\t\u0010\nR\u001c\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u001e\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u0010\n\u0002\u0010\u0013\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\f\"\u0004\b\u0015\u0010\u000eR\u001e\u0010\u0007\u001a\u0004\u0018\u00010\bX\u0086\u000e¢\u0006\u0010\n\u0002\u0010\u001a\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019¨\u0006\u001b"}, d2 = {"Lcom/transsnet/palmpay/core/bean/rsp/QueryManagementInfoResp;", "", "managementFee", "", "managementFeeRate", "", "managementFeeRuleNo", "managementMode", "", "<init>", "(Ljava/lang/String;Ljava/lang/Float;Ljava/lang/String;Ljava/lang/Integer;)V", "getManagementFee", "()Ljava/lang/String;", "setManagementFee", "(Ljava/lang/String;)V", "getManagementFeeRate", "()Ljava/lang/Float;", "setManagementFeeRate", "(Ljava/lang/Float;)V", "Ljava/lang/Float;", "getManagementFeeRuleNo", "setManagementFeeRuleNo", "getManagementMode", "()Ljava/lang/Integer;", "setManagementMode", "(Ljava/lang/Integer;)V", "Ljava/lang/Integer;", "lib_core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class QueryManagementInfoResp {

    @Nullable
    private String managementFee;

    @Nullable
    private Float managementFeeRate;

    @Nullable
    private String managementFeeRuleNo;

    @Nullable
    private Integer managementMode;

    public QueryManagementInfoResp(@Nullable String str, @Nullable Float f10, @Nullable String str2, @Nullable Integer num) {
        this.managementFee = str;
        this.managementFeeRate = f10;
        this.managementFeeRuleNo = str2;
        this.managementMode = num;
    }

    @Nullable
    public final String getManagementFee() {
        return this.managementFee;
    }

    @Nullable
    public final Float getManagementFeeRate() {
        return this.managementFeeRate;
    }

    @Nullable
    public final String getManagementFeeRuleNo() {
        return this.managementFeeRuleNo;
    }

    @Nullable
    public final Integer getManagementMode() {
        return this.managementMode;
    }

    public final void setManagementFee(@Nullable String str) {
        this.managementFee = str;
    }

    public final void setManagementFeeRate(@Nullable Float f10) {
        this.managementFeeRate = f10;
    }

    public final void setManagementFeeRuleNo(@Nullable String str) {
        this.managementFeeRuleNo = str;
    }

    public final void setManagementMode(@Nullable Integer num) {
        this.managementMode = num;
    }
}
