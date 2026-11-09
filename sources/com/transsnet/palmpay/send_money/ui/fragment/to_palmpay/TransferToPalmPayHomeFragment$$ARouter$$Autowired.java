package com.transsnet.palmpay.send_money.ui.fragment.to_palmpay;

import com.alibaba.android.arouter.facade.service.SerializationService;
import com.alibaba.android.arouter.facade.template.ISyringe;
import com.alibaba.android.arouter.launcher.ARouter;

/* JADX INFO: loaded from: classes4.dex */
public class TransferToPalmPayHomeFragment$$ARouter$$Autowired implements ISyringe {
    private SerializationService serializationService;

    @Override // com.alibaba.android.arouter.facade.template.ISyringe
    public void inject(Object obj) {
        this.serializationService = (SerializationService) ARouter.getInstance().navigation(SerializationService.class);
        TransferToPalmPayHomeFragment transferToPalmPayHomeFragment = (TransferToPalmPayHomeFragment) obj;
        transferToPalmPayHomeFragment.f33819o = transferToPalmPayHomeFragment.getArguments().getString("core_order_source_type", transferToPalmPayHomeFragment.f33819o);
    }
}
