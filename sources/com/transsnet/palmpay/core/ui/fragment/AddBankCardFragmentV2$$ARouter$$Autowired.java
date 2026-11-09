package com.transsnet.palmpay.core.ui.fragment;

import com.alibaba.android.arouter.facade.service.SerializationService;
import com.alibaba.android.arouter.facade.template.ISyringe;
import com.alibaba.android.arouter.launcher.ARouter;
import com.transsnet.palmpay.core.bean.req.BindBankCardReq;

/* JADX INFO: loaded from: classes3.dex */
public class AddBankCardFragmentV2$$ARouter$$Autowired implements ISyringe {
    private SerializationService serializationService;

    @Override // com.alibaba.android.arouter.facade.template.ISyringe
    public void inject(Object obj) {
        this.serializationService = (SerializationService) ARouter.getInstance().navigation(SerializationService.class);
        AddBankCardFragmentV2 addBankCardFragmentV2 = (AddBankCardFragmentV2) obj;
        addBankCardFragmentV2.f27850v0 = (BindBankCardReq) addBankCardFragmentV2.getArguments().getParcelable("extra_data");
        addBankCardFragmentV2.f27852w0 = addBankCardFragmentV2.getArguments().getString("extra_data_1", addBankCardFragmentV2.f27852w0);
        addBankCardFragmentV2.f27853x0 = addBankCardFragmentV2.getArguments().getBoolean("real_name_auth", addBankCardFragmentV2.f27853x0);
        addBankCardFragmentV2.f27854y0 = addBankCardFragmentV2.getArguments().getBoolean("me_bind_bank_card", addBankCardFragmentV2.f27854y0);
        addBankCardFragmentV2.f27855z0 = Long.valueOf(addBankCardFragmentV2.getArguments().getLong("business_type", addBankCardFragmentV2.f27855z0.longValue()));
        addBankCardFragmentV2.f27828A0 = Long.valueOf(addBankCardFragmentV2.getArguments().getLong("extra_entry_type", addBankCardFragmentV2.f27828A0.longValue()));
    }
}
