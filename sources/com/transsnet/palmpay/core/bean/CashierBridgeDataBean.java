package com.transsnet.palmpay.core.bean;

import kotlin.Metadata;
import kotlin.jvm.JvmField;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0004\u001a\u0004\u0018\u00010\u00058\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0016\u0010\u0007\u001a\u0004\u0018\u00010\b8\u0006@\u0006X\u0087\u000e¢\u0006\u0004\n\u0002\u0010\tR\u0014\u0010\n\u001a\u0004\u0018\u00010\u00058\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u000b\u001a\u0004\u0018\u00010\u00058\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\f\u001a\u0004\u0018\u00010\u00058\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\r\u001a\u0004\u0018\u00010\u00058\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0012\u0010\u000e\u001a\u00020\u000f8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0010\u001a\u0004\u0018\u00010\u00058\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0011\u001a\u0004\u0018\u00010\u00058\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000¨\u0006\u0012"}, d2 = {"Lcom/transsnet/palmpay/core/bean/CashierBridgeDataBean;", "", "<init>", "()V", "orderNo", "", "transType", "orderAmount", "", "Ljava/lang/Long;", "payeeAccountType", "displayOrderAmount", "calculationExtInfo", "subTransType", "showCashierPreview", "", "jsonExtras", "payerAccountType", "module_common_impl_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class CashierBridgeDataBean {

    @JvmField
    @Nullable
    public String calculationExtInfo;

    @JvmField
    @Nullable
    public String displayOrderAmount;

    @JvmField
    @Nullable
    public String jsonExtras;

    @JvmField
    @Nullable
    public String orderNo;

    @JvmField
    @Nullable
    public String payeeAccountType;

    @JvmField
    @Nullable
    public String payerAccountType;

    @JvmField
    @Nullable
    public String subTransType;

    @JvmField
    @Nullable
    public String transType;

    @JvmField
    @Nullable
    public Long orderAmount = 0L;

    @JvmField
    public boolean showCashierPreview = true;
}
