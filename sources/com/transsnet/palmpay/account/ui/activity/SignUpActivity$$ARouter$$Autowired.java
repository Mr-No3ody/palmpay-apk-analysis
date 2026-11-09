package com.transsnet.palmpay.account.ui.activity;

import com.alibaba.android.arouter.facade.service.SerializationService;
import com.alibaba.android.arouter.facade.template.ISyringe;
import com.alibaba.android.arouter.launcher.ARouter;

/* JADX INFO: loaded from: classes3.dex */
public class SignUpActivity$$ARouter$$Autowired implements ISyringe {
    private SerializationService serializationService;

    @Override // com.alibaba.android.arouter.facade.template.ISyringe
    public void inject(Object obj) {
        this.serializationService = (SerializationService) ARouter.getInstance().navigation(SerializationService.class);
        SignUpActivity signUpActivity = (SignUpActivity) obj;
        signUpActivity.f26033b = signUpActivity.getIntent().getExtras() == null ? signUpActivity.f26033b : signUpActivity.getIntent().getExtras().getString("_number", signUpActivity.f26033b);
        signUpActivity.f26034c = signUpActivity.getIntent().getExtras() == null ? signUpActivity.f26034c : signUpActivity.getIntent().getExtras().getString("_token", signUpActivity.f26034c);
        signUpActivity.f26035d = signUpActivity.getIntent().getExtras() == null ? signUpActivity.f26035d : signUpActivity.getIntent().getExtras().getString("source", signUpActivity.f26035d);
        signUpActivity.f26036e = signUpActivity.getIntent().getExtras() == null ? signUpActivity.f26036e : signUpActivity.getIntent().getExtras().getString("_input_number", signUpActivity.f26036e);
        signUpActivity.f26037f = signUpActivity.getIntent().getExtras() == null ? signUpActivity.f26037f : signUpActivity.getIntent().getExtras().getString("extra_data", signUpActivity.f26037f);
        signUpActivity.f26038g = signUpActivity.getIntent().getBooleanExtra("extra_flag", signUpActivity.f26038g);
        signUpActivity.f26039i = signUpActivity.getIntent().getExtras() == null ? signUpActivity.f26039i : signUpActivity.getIntent().getExtras().getString("extra_note", signUpActivity.f26039i);
        signUpActivity.f26040j = signUpActivity.getIntent().getExtras() == null ? signUpActivity.f26040j : signUpActivity.getIntent().getExtras().getString("business_path", signUpActivity.f26040j);
    }
}
