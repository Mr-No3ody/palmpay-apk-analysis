package com.transsnet.palmpay.credit.bean;

import com.facebook.react.fabric.mounting.mountitems.IntBufferBatchMountItem;
import kotlin.Metadata;
import kotlin.jvm.JvmField;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0085\u0001\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\u000b\u001a\u00020\f\u0012\b\b\u0002\u0010\r\u001a\u00020\f\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0010¢\u0006\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0005\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0012\u0010\u0006\u001a\u00020\u00078\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\t\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\n\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0012\u0010\u000b\u001a\u00020\f8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0012\u0010\r\u001a\u00020\f8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u000e\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u000f\u001a\u0004\u0018\u00010\u00108\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000¨\u0006\u0013"}, d2 = {"Lcom/transsnet/palmpay/credit/bean/PayShopOrderCreateBean;", "", "orderNo", "", "status", "accountNo", "businessType", "", "payeeMerchantName", "payeeMobileNo", "remark", "amount", "", "createTime", "calculationExtInfo", "cashierExtendFiled", "Lcom/transsnet/palmpay/credit/bean/TransferCashierExtendBean;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;JJLjava/lang/String;Lcom/transsnet/palmpay/credit/bean/TransferCashierExtendBean;)V", "module_flexi_export_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class PayShopOrderCreateBean {

    @JvmField
    @Nullable
    public String accountNo;

    @JvmField
    public long amount;

    @JvmField
    public int businessType;

    @JvmField
    @Nullable
    public String calculationExtInfo;

    @JvmField
    @Nullable
    public TransferCashierExtendBean cashierExtendFiled;

    @JvmField
    public long createTime;

    @JvmField
    @Nullable
    public String orderNo;

    @JvmField
    @Nullable
    public String payeeMerchantName;

    @JvmField
    @Nullable
    public String payeeMobileNo;

    @JvmField
    @Nullable
    public String remark;

    @JvmField
    @Nullable
    public String status;

    public PayShopOrderCreateBean() {
        this(null, null, null, 0, null, null, null, 0L, 0L, null, null, 2047, null);
    }

    public PayShopOrderCreateBean(@Nullable String str, @Nullable String str2, @Nullable String str3, int i7, @Nullable String str4, @Nullable String str5, @Nullable String str6, long j6, long j10, @Nullable String str7, @Nullable TransferCashierExtendBean transferCashierExtendBean) {
        this.orderNo = str;
        this.status = str2;
        this.accountNo = str3;
        this.businessType = i7;
        this.payeeMerchantName = str4;
        this.payeeMobileNo = str5;
        this.remark = str6;
        this.amount = j6;
        this.createTime = j10;
        this.calculationExtInfo = str7;
        this.cashierExtendFiled = transferCashierExtendBean;
    }

    public /* synthetic */ PayShopOrderCreateBean(String str, String str2, String str3, int i7, String str4, String str5, String str6, long j6, long j10, String str7, TransferCashierExtendBean transferCashierExtendBean, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? null : str, (i10 & 2) != 0 ? null : str2, (i10 & 4) != 0 ? null : str3, (i10 & 8) != 0 ? 0 : i7, (i10 & 16) != 0 ? null : str4, (i10 & 32) != 0 ? null : str5, (i10 & 64) != 0 ? null : str6, (i10 & 128) != 0 ? 0L : j6, (i10 & IntBufferBatchMountItem.INSTRUCTION_UPDATE_EVENT_EMITTER) == 0 ? j10 : 0L, (i10 & 512) != 0 ? null : str7, (i10 & 1024) != 0 ? null : transferCashierExtendBean);
    }
}
