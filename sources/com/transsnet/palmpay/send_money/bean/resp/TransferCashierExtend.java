package com.transsnet.palmpay.send_money.bean.resp;

import java.io.Serializable;
import kotlin.Metadata;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0011\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003R\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\u001c\u0010\n\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\u0007\"\u0004\b\f\u0010\tR\u001c\u0010\r\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u0007\"\u0004\b\u000f\u0010\tR\u001c\u0010\u0010\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0007\"\u0004\b\u0012\u0010\tR\u001c\u0010\u0013\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0007\"\u0004\b\u0015\u0010\t¨\u0006\u0016"}, d2 = {"Lcom/transsnet/palmpay/send_money/bean/resp/TransferCashierExtend;", "Ljava/io/Serializable;", "<init>", "()V", "businessRiskType", "", "getBusinessRiskType", "()Ljava/lang/String;", "setBusinessRiskType", "(Ljava/lang/String;)V", "disposal", "getDisposal", "setDisposal", "flowId", "getFlowId", "setFlowId", "senderFullName", "getSenderFullName", "setSenderFullName", "senderPhone", "getSenderPhone", "setSenderPhone", "module_money_transfer_export_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class TransferCashierExtend implements Serializable {

    @Nullable
    private String businessRiskType;

    @Nullable
    private String disposal;

    @Nullable
    private String flowId;

    @Nullable
    private String senderFullName;

    @Nullable
    private String senderPhone;

    @Nullable
    public final String getBusinessRiskType() {
        return this.businessRiskType;
    }

    @Nullable
    public final String getDisposal() {
        return this.disposal;
    }

    @Nullable
    public final String getFlowId() {
        return this.flowId;
    }

    @Nullable
    public final String getSenderFullName() {
        return this.senderFullName;
    }

    @Nullable
    public final String getSenderPhone() {
        return this.senderPhone;
    }

    public final void setBusinessRiskType(@Nullable String str) {
        this.businessRiskType = str;
    }

    public final void setDisposal(@Nullable String str) {
        this.disposal = str;
    }

    public final void setFlowId(@Nullable String str) {
        this.flowId = str;
    }

    public final void setSenderFullName(@Nullable String str) {
        this.senderFullName = str;
    }

    public final void setSenderPhone(@Nullable String str) {
        this.senderPhone = str;
    }
}
