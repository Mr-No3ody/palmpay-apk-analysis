package com.transsnet.palmpay.core.rnbridge.bridge;

import F6.d;
import Wd.C0751z;
import android.content.Context;
import android.text.TextUtils;
import com.didi.drouter.annotation.Service;
import com.palmpay.lib.bridge.IBridge;
import com.palmpay.lib.bridge.IBridgeCallback;
import com.palmpay.lib.bridge.SyncBridge;
import com.transsnet.palmpay.core.base.BaseApplication;
import com.transsnet.palmpay.core.bean.CashierBridgeDataBean;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
@Service(alias = {"/new_withdrawal_cashier/open"}, function = {IBridge.class, IBridge.class}, priority = 1)
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u001c\u0010\u0005\u001a\u00020\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\u00022\b\u0010\b\u001a\u0004\u0018\u00010\tH\u0014¨\u0006\n"}, d2 = {"Lcom/transsnet/palmpay/core/rnbridge/bridge/WithdrawalCashierBridge;", "Lcom/palmpay/lib/bridge/SyncBridge;", "Lcom/transsnet/palmpay/core/bean/CashierBridgeDataBean;", "<init>", "()V", "onHandle", "", "params", "callback", "Lcom/palmpay/lib/bridge/IBridgeCallback;", "module_common_impl_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class WithdrawalCashierBridge extends SyncBridge<CashierBridgeDataBean> {
    @Override // com.palmpay.lib.bridge.BaseBridge
    public void onHandle(@Nullable CashierBridgeDataBean params, @Nullable IBridgeCallback callback) {
        d.h("CashierBridge", 3, "传给收银台的参数：" + params);
        if (params == null || TextUtils.isEmpty(params.orderNo)) {
            if (callback != null) {
                callback.resolved("orderNo is empty");
                return;
            }
            return;
        }
        try {
            Context context = BaseApplication.getContext();
            Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
            C0751z c0751z = new C0751z(context, 1);
            c0751z.f4971b = params.orderNo;
            Long l5 = params.orderAmount;
            c0751z.c(Long.valueOf(l5 != null ? l5.longValue() : 0L));
            c0751z.f4972c = params.transType;
            c0751z.f4973d = params.subTransType;
            c0751z.f4976g = params.payeeAccountType;
            c0751z.f4977h = params.payerAccountType;
            c0751z.f4978i = params.calculationExtInfo;
            c0751z.d();
        } catch (Exception e10) {
            e10.printStackTrace();
        }
    }
}
