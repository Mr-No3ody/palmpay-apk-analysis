package com.alibaba.android.arouter.routes;

import com.alibaba.android.arouter.facade.template.IRouteGroup;
import com.alibaba.android.arouter.facade.template.IRouteRoot;
import com.transsnet.palmpay.core.bean.req.GetCustomerServiceUrlReq;
import com.transsnet.palmpay.core.ui.dialog.CoinRewardDialog;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public class ARouter$$Root$$module_money_transfer_impl implements IRouteRoot {
    @Override // com.alibaba.android.arouter.facade.template.IRouteRoot
    public void loadInto(Map<String, Class<? extends IRouteGroup>> map) {
        map.put(CoinRewardDialog.TYPE_URL_COLLECT, ARouter$$Group$$collect.class);
        map.put("kkcar", ARouter$$Group$$kkcar.class);
        map.put(GetCustomerServiceUrlReq.ENTER_TYPE_QRCODE, ARouter$$Group$$qrcode.class);
        map.put("request", ARouter$$Group$$request.class);
        map.put("send", ARouter$$Group$$send.class);
        map.put("sm", ARouter$$Group$$sm.class);
        map.put("smorder", ARouter$$Group$$smorder.class);
        map.put("voucher", ARouter$$Group$$voucher.class);
    }
}
