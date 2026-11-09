package com.transsnet.palmpay.mall.ui.activity;

import com.alibaba.android.arouter.facade.service.SerializationService;
import com.alibaba.android.arouter.facade.template.ISyringe;
import com.alibaba.android.arouter.launcher.ARouter;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes4.dex */
public class MallPhotoViewActivity$$ARouter$$Autowired implements ISyringe {
    private SerializationService serializationService;

    @Override // com.alibaba.android.arouter.facade.template.ISyringe
    public void inject(Object obj) {
        this.serializationService = (SerializationService) ARouter.getInstance().navigation(SerializationService.class);
        MallPhotoViewActivity mallPhotoViewActivity = (MallPhotoViewActivity) obj;
        mallPhotoViewActivity.f32008a = (ArrayList) mallPhotoViewActivity.getIntent().getSerializableExtra("extra_data_1");
        mallPhotoViewActivity.f32009b = (ArrayList) mallPhotoViewActivity.getIntent().getSerializableExtra("extra_data_2");
        mallPhotoViewActivity.f32010c = mallPhotoViewActivity.getIntent().getIntExtra("extra_data", mallPhotoViewActivity.f32010c);
    }
}
