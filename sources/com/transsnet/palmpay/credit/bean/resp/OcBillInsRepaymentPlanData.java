package com.transsnet.palmpay.credit.bean.resp;

import kotlin.Metadata;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0010\u0018\u00002\u00020\u0001BM\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u000b\u0010\fR\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000eR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000eR\u0015\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\n\n\u0002\u0010\u0013\u001a\u0004\b\u0011\u0010\u0012R\u0013\u0010\b\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u000eR\u0013\u0010\t\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u000eR\u0013\u0010\n\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u000e¨\u0006\u0017"}, d2 = {"Lcom/transsnet/palmpay/credit/bean/resp/OcBillInsRepaymentPlanData;", "", "billId", "", "cardNo", "extensionInfo", "operateType", "", "orderId", "phone", "transType", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getBillId", "()Ljava/lang/String;", "getCardNo", "getExtensionInfo", "getOperateType", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getOrderId", "getPhone", "getTransType", "module_flexi_export_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class OcBillInsRepaymentPlanData {

    @Nullable
    private final String billId;

    @Nullable
    private final String cardNo;

    @Nullable
    private final String extensionInfo;

    @Nullable
    private final Integer operateType;

    @Nullable
    private final String orderId;

    @Nullable
    private final String phone;

    @Nullable
    private final String transType;

    public OcBillInsRepaymentPlanData(@Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable Integer num, @Nullable String str4, @Nullable String str5, @Nullable String str6) {
        this.billId = str;
        this.cardNo = str2;
        this.extensionInfo = str3;
        this.operateType = num;
        this.orderId = str4;
        this.phone = str5;
        this.transType = str6;
    }

    @Nullable
    public final String getBillId() {
        return this.billId;
    }

    @Nullable
    public final String getCardNo() {
        return this.cardNo;
    }

    @Nullable
    public final String getExtensionInfo() {
        return this.extensionInfo;
    }

    @Nullable
    public final Integer getOperateType() {
        return this.operateType;
    }

    @Nullable
    public final String getOrderId() {
        return this.orderId;
    }

    @Nullable
    public final String getPhone() {
        return this.phone;
    }

    @Nullable
    public final String getTransType() {
        return this.transType;
    }
}
