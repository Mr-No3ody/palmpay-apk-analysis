package com.transsnet.palmpay.ui.activity.bankcard;

import Ac.e;
import Ac.f;
import Ac.h;
import L6.b;
import android.os.Bundle;
import android.text.TextUtils;
import android.widget.TextView;
import com.airbnb.lottie.LottieAnimationView;
import com.alibaba.android.arouter.facade.annotation.Route;
import com.alibaba.android.arouter.launcher.ARouter;
import com.palmpay.lib.ui.button.PpButton;
import com.transsnet.adsdk.widgets.Interstitial.InterstitialAdView;
import com.transsnet.palmpay.core.base.BaseActivity;
import com.transsnet.palmpay.core.bean.message.MessageEvent;
import com.transsnet.palmpay.custom_view.r;
import org.greenrobot.eventbus.c;
import p025ba.k;
import p052da.ViewOnClickListenerC1649v;

/* JADX INFO: loaded from: classes4.dex */
@Route(path = "/main/add_card_complete")
public class AddCardCompleteActivity extends BaseActivity {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ int f34625f = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public LottieAnimationView f34626a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public TextView f34627b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public TextView f34628c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public String f34629d = null;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public String f34630e = null;

    @Override // com.transsnet.palmpay.core.base.BaseActivity
    public final int getLayoutId() {
        return f.main_add_card_complete_activity;
    }

    @Override // com.transsnet.palmpay.core.base.BaseActivity
    public final void initData() {
        Integer num = 1;
        if (num.toString().equals(this.f34629d)) {
            this.f34626a.setImageResource(r.cv_result_success);
            this.f34627b.setText(k.core_success);
            this.f34627b.setAllCaps(true);
            this.f34628c.setText(h.main_add_card_success_desc);
            return;
        }
        Integer num2 = 3;
        if (num2.toString().equals(this.f34629d)) {
            this.f34626a.setImageResource(r.cv_result_pending);
            this.f34627b.setText(h.main_add_card_pending_title);
            this.f34628c.setText(h.main_add_card_pending_desc);
        } else {
            this.f34626a.setImageResource(r.cv_result_fail);
            this.f34627b.setText(k.core_failed);
            if (TextUtils.isEmpty(this.f34630e)) {
                this.f34628c.setText(h.main_add_card_fail_desc);
            } else {
                this.f34628c.setText(this.f34630e);
            }
        }
    }

    @Override // com.transsnet.palmpay.core.base.BaseActivity, androidx.activity.AbstractActivityC0822m, android.app.Activity
    public final void onBackPressed() {
        c.b().f(new MessageEvent(MessageEvent.EVENT_ADD_NEW_BANK_CARD));
        finish();
    }

    @Override // com.transsnet.palmpay.core.base.BaseActivity
    public final void processLogic(Bundle bundle) {
        new InterstitialAdView(getString(k.add_card_complete_pop_slot_id), new Ab.k(24)).show(this);
    }

    @Override // com.transsnet.palmpay.core.base.BaseActivity
    public final void setupView() {
        PpButton ppButton = (PpButton) findViewById(e.tvComplete);
        this.f34628c = (TextView) findViewById(e.tf_money_result_desc_tv);
        this.f34627b = (TextView) findViewById(e.tf_money_result_tv);
        this.f34626a = (LottieAnimationView) findViewById(e.tf_money_result_img);
        ppButton.setOnClickListener(new ViewOnClickListenerC1649v(this, 10));
        ARouter.getInstance().inject(this);
        initStatusBar(getColor(b.ppColorBackgroundLight));
    }
}
