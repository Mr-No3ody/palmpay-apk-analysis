package com.transsnet.palmpay.core.ui.activity;

import C9.ViewOnClickListenerC0146m;
import Pa.i0;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.TextView;
import com.alibaba.android.arouter.facade.annotation.Route;
import com.alibaba.android.arouter.launcher.ARouter;
import com.transsnet.palmpay.core.base.BaseActivity;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
@Route(path = "/core/result_pay_with_ussd_by_push")
public class HandleResultPayWithUSSDByPushActivity extends BaseActivity {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public View f27646a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public TextView f27647b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public TextView f27648c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public String f27649d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public String f27650e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final ViewOnClickListenerC0146m f27651f = new ViewOnClickListenerC0146m(this, 22);

    @Override // com.transsnet.palmpay.core.base.BaseActivity
    public final int getLayoutId() {
        return p025ba.g.core_activity_pay_with_ussd;
    }

    @Override // com.transsnet.palmpay.core.base.BaseActivity
    public final void initData() {
        try {
            JSONObject jSONObject = new JSONObject(this.f27650e);
            String strOptString = jSONObject.optString("payerWalletChannel");
            this.f27649d = strOptString;
            String strY = i0.Y(strOptString);
            this.f27649d = strY;
            if (TextUtils.isEmpty(strY)) {
                String strOptString2 = jSONObject.optString("walletChannel");
                this.f27649d = strOptString2;
                this.f27649d = i0.Y(strOptString2);
            }
        } catch (Exception unused) {
        }
    }

    @Override // com.transsnet.palmpay.core.base.BaseActivity
    public final void processLogic(Bundle bundle) {
        if (TextUtils.isEmpty(this.f27650e)) {
            finish();
        }
    }

    @Override // com.transsnet.palmpay.core.base.BaseActivity
    public final void setupView() {
        initStatusBar(getColor(L6.b.ppColorBackgroundLight));
        this.f27646a = findViewById(p025ba.e.ciap_complete_btn);
        this.f27647b = (TextView) findViewById(p025ba.e.ussd_guide_tv);
        this.f27648c = (TextView) findViewById(p025ba.e.aatur_done_tv);
        View view = this.f27646a;
        ViewOnClickListenerC0146m viewOnClickListenerC0146m = this.f27651f;
        view.setOnClickListener(viewOnClickListenerC0146m);
        this.f27647b.setOnClickListener(viewOnClickListenerC0146m);
        this.f27648c.setOnClickListener(viewOnClickListenerC0146m);
        ARouter.getInstance().inject(this);
    }
}
