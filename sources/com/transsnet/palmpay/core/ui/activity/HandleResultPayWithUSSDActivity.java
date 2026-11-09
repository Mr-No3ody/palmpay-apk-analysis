package com.transsnet.palmpay.core.ui.activity;

import C9.ViewOnClickListenerC0146m;
import Pa.i0;
import android.os.Bundle;
import android.text.TextUtils;
import android.widget.TextView;
import com.alibaba.android.arouter.facade.annotation.Route;
import com.alibaba.android.arouter.launcher.ARouter;
import com.palmpay.lib.ui.button.PpButton;
import com.transsnet.palmpay.core.base.BaseActivity;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
@Route(path = "/core/result_pay_with_ussd")
public class HandleResultPayWithUSSDActivity extends BaseActivity {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public PpButton f27638a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public TextView f27639b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public TextView f27640c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public TextView f27641d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public String f27642e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public String f27643f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f27644g = false;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final ViewOnClickListenerC0146m f27645i = new ViewOnClickListenerC0146m(this, 21);

    @Override // com.transsnet.palmpay.core.base.BaseActivity
    public final int getLayoutId() {
        return p025ba.g.core_activity_pay_with_ussd;
    }

    @Override // com.transsnet.palmpay.core.base.BaseActivity
    public final void initData() {
        try {
            JSONObject jSONObject = new JSONObject(this.f27643f);
            String strOptString = jSONObject.optString("payerWalletChannel");
            this.f27642e = strOptString;
            String strY = i0.Y(strOptString);
            this.f27642e = strY;
            if (TextUtils.isEmpty(strY)) {
                String strOptString2 = jSONObject.optString("walletChannel");
                this.f27642e = strOptString2;
                this.f27642e = i0.Y(strOptString2);
            }
            if ("tigo".equalsIgnoreCase(this.f27642e)) {
                this.f27644g = true;
                this.f27638a.setText(androidx.core.content.d.e(p025ba.k.core_pay_with_ussd, this));
                this.f27639b.setText(p025ba.k.core_result_pay_with_ussd);
                this.f27640c.setVisibility(0);
                this.f27641d.setVisibility(0);
            }
        } catch (Exception e10) {
            F6.d.c(this.TAG, "initData: ", e10);
        }
    }

    @Override // com.transsnet.palmpay.core.base.BaseActivity
    public final void processLogic(Bundle bundle) {
    }

    @Override // com.transsnet.palmpay.core.base.BaseActivity
    public final void setupView() {
        initStatusBar(getColor(L6.b.ppColorBackgroundLight));
        this.f27638a = (PpButton) findViewById(p025ba.e.ciap_complete_btn);
        this.f27640c = (TextView) findViewById(p025ba.e.ussd_guide_tv);
        this.f27641d = (TextView) findViewById(p025ba.e.aatur_done_tv);
        this.f27639b = (TextView) findViewById(p025ba.e.atubd_hint_tv);
        PpButton ppButton = this.f27638a;
        ViewOnClickListenerC0146m viewOnClickListenerC0146m = this.f27645i;
        ppButton.setOnClickListener(viewOnClickListenerC0146m);
        this.f27640c.setOnClickListener(viewOnClickListenerC0146m);
        this.f27641d.setOnClickListener(viewOnClickListenerC0146m);
        ARouter.getInstance().inject(this);
    }
}
