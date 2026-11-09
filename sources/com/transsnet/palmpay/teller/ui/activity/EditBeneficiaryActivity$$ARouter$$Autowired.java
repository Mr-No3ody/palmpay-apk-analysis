package com.transsnet.palmpay.teller.ui.activity;

import com.alibaba.android.arouter.facade.service.SerializationService;
import com.alibaba.android.arouter.facade.template.ISyringe;
import com.alibaba.android.arouter.launcher.ARouter;
import com.transsnet.palmpay.core.bean.CloseContactBean;

/* JADX INFO: loaded from: classes4.dex */
public class EditBeneficiaryActivity$$ARouter$$Autowired implements ISyringe {
    private SerializationService serializationService;

    @Override // com.alibaba.android.arouter.facade.template.ISyringe
    public void inject(Object target) {
        this.serializationService = (SerializationService) ARouter.getInstance().navigation(SerializationService.class);
        EditBeneficiaryActivity editBeneficiaryActivity = (EditBeneficiaryActivity) target;
        editBeneficiaryActivity.f34212i = editBeneficiaryActivity.getIntent().getExtras() == null ? editBeneficiaryActivity.f34212i : editBeneficiaryActivity.getIntent().getExtras().getString("extra_type", editBeneficiaryActivity.f34212i);
        editBeneficiaryActivity.f34213j = editBeneficiaryActivity.getIntent().getIntExtra("key_editable", editBeneficiaryActivity.f34213j);
        editBeneficiaryActivity.f34214o = (CloseContactBean) editBeneficiaryActivity.getIntent().getParcelableExtra("business_data");
    }
}
