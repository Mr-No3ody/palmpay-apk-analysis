package com.transsnet.palmpay.core.rnbridge.bridge;

import F6.d;
import android.text.TextUtils;
import com.alibaba.android.arouter.facade.Postcard;
import com.alibaba.android.arouter.launcher.ARouter;
import com.didi.drouter.annotation.Service;
import com.palmpay.lib.bridge.IBridge;
import com.palmpay.lib.bridge.IBridgeCallback;
import com.palmpay.lib.bridge.SyncBridge;
import com.transsnet.palmpay.core.bean.CashierBridgeDataBean;
import kotlin.Metadata;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
@Service(alias = {"/new_cashier/open"}, function = {IBridge.class, IBridge.class}, priority = 1)
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u001c\u0010\u0005\u001a\u00020\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\u00022\b\u0010\b\u001a\u0004\u0018\u00010\tH\u0014¨\u0006\n"}, d2 = {"Lcom/transsnet/palmpay/core/rnbridge/bridge/CashierBridge;", "Lcom/palmpay/lib/bridge/SyncBridge;", "Lcom/transsnet/palmpay/core/bean/CashierBridgeDataBean;", "<init>", "()V", "onHandle", "", "params", "callback", "Lcom/palmpay/lib/bridge/IBridgeCallback;", "module_common_impl_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class CashierBridge extends SyncBridge<CashierBridgeDataBean> {
    @Override // com.palmpay.lib.bridge.BaseBridge
    public void onHandle(@Nullable CashierBridgeDataBean params, @Nullable IBridgeCallback callback) {
        d.h("CashierBridge", 3, "传给收银台的参数：" + params);
        if (params == null || TextUtils.isEmpty(params.orderNo)) {
            if (callback != null) {
                callback.resolved("orderNo is empty");
            }
        } else {
            try {
                Postcard postcardWithString = ARouter.getInstance().build("/core/rn_preview").withString("mOrderNo", params.orderNo).withString("mTransType", params.transType).withString("mSubTransType", params.subTransType).withString("mOrderType", "999");
                Long l5 = params.orderAmount;
                postcardWithString.withLong("mOrderAmount", l5 != null ? l5.longValue() : 0L).withString("mPayeeAccountType", params.payeeAccountType).withString("mCalculationExtInfo", params.calculationExtInfo).withString("mDisplayOrderAmount", params.displayOrderAmount).withBoolean("mShowCashierPreview", params.showCashierPreview).withString("mJSONExtras", params.jsonExtras).navigation();
            } catch (Exception e10) {
                e10.printStackTrace();
            }
        }
    }
}
