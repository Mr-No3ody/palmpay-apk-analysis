package com.transsnet.palmpay.ui.activity;

import com.alibaba.android.arouter.facade.service.SerializationService;
import com.alibaba.android.arouter.facade.template.ISyringe;
import com.alibaba.android.arouter.launcher.ARouter;
import com.transsnet.palmpay.core.bean.bill.TransHistoryRsp;

/* JADX INFO: loaded from: classes4.dex */
public class RedirectOrderDetailActivity$$ARouter$$Autowired implements ISyringe {
    private SerializationService serializationService;

    @Override // com.alibaba.android.arouter.facade.template.ISyringe
    public void inject(Object obj) {
        this.serializationService = (SerializationService) ARouter.getInstance().navigation(SerializationService.class);
        RedirectOrderDetailActivity redirectOrderDetailActivity = (RedirectOrderDetailActivity) obj;
        redirectOrderDetailActivity.f34566a = (TransHistoryRsp.DataBean.ListBean) redirectOrderDetailActivity.getIntent().getSerializableExtra("extra_data");
    }
}
