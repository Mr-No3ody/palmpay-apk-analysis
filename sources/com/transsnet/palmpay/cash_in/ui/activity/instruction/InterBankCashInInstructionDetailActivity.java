package com.transsnet.palmpay.cash_in.ui.activity.instruction;

import C9.ViewOnClickListenerC0146m;
import Ce.ViewOnClickListenerC0159a;
import G1.d;
import Pa.r0;
import android.os.Bundle;
import android.text.TextUtils;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import com.alibaba.android.arouter.launcher.ARouter;
import com.transsnet.palmpay.cash_in.bean.response.BankCashInInstructionBean;
import com.transsnet.palmpay.core.base.BaseActivity;
import com.transsnet.palmpay.custom_view.r;
import com.transsnet.palmpay.util.SizeUtils;
import p025ba.k;
import p366y9.a;
import p366y9.b;
import p366y9.c;

/* JADX INFO: loaded from: classes3.dex */
public class InterBankCashInInstructionDetailActivity extends BaseActivity {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ int f26992g = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public BankCashInInstructionBean f26993a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public ImageView f26994b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public ImageView f26995c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public TextView f26996d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public TextView f26997e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public Button f26998f;

    @Override // com.transsnet.palmpay.core.base.BaseActivity
    public final int getLayoutId() {
        requestLayoutFullScreen();
        return c.ci_activity_inter_bank_cash_in_instruction_detail;
    }

    @Override // com.transsnet.palmpay.core.base.BaseActivity
    public final void initData() {
        if (this.f26993a == null) {
            finish();
            return;
        }
        r0.j1(this.f26994b, this.f26993a.bankBackground, (d) ((d) new d().I(new Sa.d(this, SizeUtils.dp2px(25.0f), 6), true)).x(a.ci_background_white));
        r0.u1(this.f26995c, this.f26993a.bankIcon1, r.cv_bank_account);
        this.f26993a.bankName.show(this.f26996d);
        this.f26993a.text1.show(this.f26997e);
        this.f26998f.setText(getString(!TextUtils.isEmpty(this.f26993a.appUrl) ? k.core_open_this_app : k.core_ok));
    }

    @Override // com.transsnet.palmpay.core.base.BaseActivity
    public final void processLogic(Bundle bundle) {
    }

    @Override // com.transsnet.palmpay.core.base.BaseActivity
    public final void setupView() {
        ARouter.getInstance().inject(this);
        initStatusBar(true);
        this.f26994b = (ImageView) findViewById(b.ivBankBg);
        this.f26995c = (ImageView) findViewById(b.ivBankIcon);
        this.f26996d = (TextView) findViewById(b.tvBankName);
        this.f26997e = (TextView) findViewById(b.tvBankMessage);
        this.f26998f = (Button) findViewById(b.btnAction);
        findViewById(b.ivBackIv).setOnClickListener(new ViewOnClickListenerC0159a(this, 6));
        this.f26998f.setOnClickListener(new ViewOnClickListenerC0146m(this, 2));
    }
}
