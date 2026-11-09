package com.transsnet.palmpay.core.rnbridge.bridge;

import Pa.F;
import Pa.i0;
import android.text.TextUtils;
import com.alibaba.android.arouter.launcher.ARouter;
import com.didi.drouter.annotation.Service;
import com.google.android.material.navigation.NavigationBarView;
import com.google.firebase.messaging.Constants;
import com.palmpay.lib.apm.launchcounter.util.d;
import com.palmpay.lib.bridge.IBridge;
import com.palmpay.lib.bridge.IBridgeCallback;
import com.palmpay.lib.bridge.SyncBridge;
import com.transsnet.palmpay.core.base.BaseApplication;
import com.transsnet.palmpay.core.bean.bill.TransHistoryItemBean;
import com.transsnet.palmpay.core.bean.bill.TransHistoryRsp;
import com.transsnet.palmpay.util.ActivityUtils;
import kotlin.Metadata;
import kotlin.Pair;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
@Service(alias = {"/orderDetail/open"}, function = {IBridge.class, IBridge.class}, priority = 1)
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u001c\u0010\u0005\u001a\u00020\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\u00022\b\u0010\b\u001a\u0004\u0018\u00010\tH\u0014J\u0012\u0010\n\u001a\u00020\u00062\b\u0010\u000b\u001a\u0004\u0018\u00010\u0002H\u0002¨\u0006\f"}, d2 = {"Lcom/transsnet/palmpay/core/rnbridge/bridge/OrderDetailBridge;", "Lcom/palmpay/lib/bridge/SyncBridge;", "Lcom/transsnet/palmpay/core/bean/bill/TransHistoryItemBean;", "<init>", "()V", "onHandle", "", "params", "callback", "Lcom/palmpay/lib/bridge/IBridgeCallback;", "goNext", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "module_common_impl_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class OrderDetailBridge extends SyncBridge<TransHistoryItemBean> {
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    private final void goNext(TransHistoryItemBean data) {
        if (data == null) {
            return;
        }
        if (TextUtils.isEmpty(data.redirect)) {
            Ea.a.e(data.transType, data.orderNo, data.subTransTypeCode);
            return;
        }
        String str = data.redirect;
        if (str != null) {
            switch (str.hashCode()) {
                case NavigationBarView.ITEM_GRAVITY_TOP_CENTER /* 49 */:
                    if (str.equals("1")) {
                        TransHistoryRsp.DataBean.ListBean listBean = new TransHistoryRsp.DataBean.ListBean();
                        listBean.orderNo = data.orderNo;
                        listBean.transType = data.transType;
                        Long l5 = data.updateTime;
                        listBean.updateTime = l5 != null ? l5.longValue() : 0L;
                        Long l6 = data.amount;
                        listBean.amount = l6 != null ? l6.longValue() : 0L;
                        listBean.iconUrl = data.iconUrl;
                        listBean.title = data.title;
                        listBean.orderStatus = data.orderStatus;
                        ARouter.getInstance().build("/main/redirect_order_detail").withSerializable("extra_data", listBean).navigation();
                        break;
                    }
                    break;
                case 50:
                    if (str.equals("2")) {
                        i0.b0("/h5/transaction-router/home?transType=" + data.transType + "&orderId=" + data.orderNo);
                        break;
                    }
                    break;
                case 51:
                    if (str.equals("3")) {
                        d.x(p002a.a.e(new Pair("orderNo", data.orderNo), new Pair("transType", data.transType)), "CommonDetail");
                        break;
                    }
                    break;
                case 52:
                    if (str.equals("4")) {
                        String customLinkAndroid = !TextUtils.isEmpty(data.customLinkH5) ? data.customLinkH5 : data.getCustomLinkAndroid();
                        if (!TextUtils.isEmpty(customLinkAndroid)) {
                            ActivityUtils.startActivity(F.a(BaseApplication.getContext(), customLinkAndroid));
                        }
                        break;
                    }
                    break;
            }
        }
    }

    @Override // com.palmpay.lib.bridge.BaseBridge
    public void onHandle(@Nullable TransHistoryItemBean params, @Nullable IBridgeCallback callback) {
        F6.d.h("orderDetail", 3, "传给详情页的参数：" + params);
        if (params == null || TextUtils.isEmpty(params.orderNo)) {
            if (callback != null) {
                callback.resolved("orderNo is empty");
            }
        } else {
            try {
                goNext(params);
            } catch (Exception e10) {
                e10.printStackTrace();
            }
        }
    }
}
