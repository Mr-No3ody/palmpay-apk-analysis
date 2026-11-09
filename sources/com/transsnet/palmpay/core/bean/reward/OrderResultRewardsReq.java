package com.transsnet.palmpay.core.bean.reward;

import kotlin.Metadata;
import kotlin.jvm.JvmField;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\u0018\u00002\u00020\u0001B'\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0006\u0010\u0007R\u0014\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0005\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000¨\u0006\b"}, d2 = {"Lcom/transsnet/palmpay/core/bean/reward/OrderResultRewardsReq;", "", "transType", "", "payId", "orderNo", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "lib_core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class OrderResultRewardsReq {

    @JvmField
    @Nullable
    public String orderNo;

    @JvmField
    @Nullable
    public String payId;

    @JvmField
    @Nullable
    public String transType;

    public OrderResultRewardsReq(@Nullable String str, @Nullable String str2, @Nullable String str3) {
        this.transType = str;
        this.payId = str2;
        this.orderNo = str3;
    }

    public /* synthetic */ OrderResultRewardsReq(String str, String str2, String str3, int i7, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, (i7 & 4) != 0 ? null : str3);
    }
}
