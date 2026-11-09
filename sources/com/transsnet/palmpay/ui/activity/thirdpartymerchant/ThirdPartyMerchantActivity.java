package com.transsnet.palmpay.ui.activity.thirdpartymerchant;

import Ac.f;
import Ae.o;
import Cc.a;
import F6.d;
import Ja.C0328a;
import N8.r;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.ImageView;
import android.widget.ProgressBar;
import com.alibaba.android.arouter.facade.annotation.Route;
import com.palmpay.lib.ui.titlebar.PpTitleBar;
import com.transsnet.palmpay.core.base.BaseActivity;
import com.transsnet.palmpay.core.bean.message.TPMerchantPaymentMsg;
import com.transsnet.palmpay.core.viewmodel.AndroidXWebView;
import com.transsnet.palmpay.main.export.bean.req.ThirdAuthorizationCodeReq;
import com.transsnet.palmpay.main.export.bean.rsp.ThirdPartyMerchantListResp;
import com.transsnet.palmpay.main.export.business.IApiMainService;
import java.util.HashMap;
import org.greenrobot.eventbus.Subscribe;
import org.greenrobot.eventbus.ThreadMode;
import org.greenrobot.eventbus.c;
import org.json.JSONObject;
import p071ef.b;
import p285sc.x;
import p297te.e;
import p297te.h;

/* JADX INFO: loaded from: classes4.dex */
@Route(path = "/main/third_party_merchant")
public class ThirdPartyMerchantActivity extends BaseActivity {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ int f34991g = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public AndroidXWebView f34992a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public ProgressBar f34993b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public ThirdPartyMerchantListResp.ThirdPartyMerchant f34994c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public HashMap f34995d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public PpTitleBar f34996e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public String f34997f;

    @Override // com.transsnet.palmpay.core.base.BaseActivity
    public final int getLayoutId() {
        return f.main_three_party_merchant_activity;
    }

    @Override // com.transsnet.palmpay.core.base.BaseActivity
    public final void initData() {
        c.b().j(this);
        ThirdPartyMerchantListResp.ThirdPartyMerchant thirdPartyMerchant = (ThirdPartyMerchantListResp.ThirdPartyMerchant) getIntent().getSerializableExtra("merchant");
        this.f34994c = thirdPartyMerchant;
        if (thirdPartyMerchant != null) {
            this.f34996e.setTitle(thirdPartyMerchant.getMerchantName());
            this.f34992a.loadUrl(this.f34994c.getServiceLink());
        } else {
            if (!TextUtils.isEmpty(this.f34997f)) {
                this.f34992a.loadUrl(this.f34997f);
                return;
            }
            this.f34993b.setVisibility(0);
            this.f34993b.setProgress(1);
            ((IApiMainService) a.f1353a.f39520b).queryThirdPartyMerchantById().k(p298tf.f.f42629b).i(b.a()).subscribe(new p297te.f(this));
        }
    }

    public final void l(String str, String str2) {
        try {
            if (TextUtils.isEmpty(str2)) {
                return;
            }
            this.f34992a.evaluateJavascript("javascript:window.PalmPayJSBridge.callback('" + str + "','" + str2 + "')", new e());
        } catch (Exception e10) {
            e10.printStackTrace();
        }
    }

    public final void m(ThirdAuthorizationCodeReq thirdAuthorizationCodeReq, String str) {
        showLoadingDialog(true);
        ((IApiMainService) a.f1353a.f39520b).requestAuthorization(thirdAuthorizationCodeReq).k(p298tf.f.f42629b).i(b.a()).subscribe(new r(this, 11, str, false));
    }

    @Override // androidx.fragment.app.E, androidx.activity.AbstractActivityC0822m, android.app.Activity
    public final void onActivityResult(int i7, int i10, Intent intent) {
        if (i7 == 392) {
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("result", i10 == -1 ? "success" : "fail");
            } catch (Exception e10) {
                d.c(this.TAG, "onActivityResult1: ", e10);
            }
            l(jSONObject.toString(), (String) this.f34995d.remove("ID_2"));
            return;
        }
        if (i7 == 393 && i10 == -1) {
            if (intent == null) {
                return;
            }
            String stringExtra = intent.getStringExtra("contact_name");
            String stringExtra2 = intent.getStringExtra("PHONE_NUMBER");
            if (TextUtils.isEmpty(stringExtra) || TextUtils.isEmpty(stringExtra2)) {
                return;
            }
            JSONObject jSONObject2 = new JSONObject();
            try {
                jSONObject2.put("name", stringExtra);
                jSONObject2.put("number", stringExtra2);
            } catch (Exception e11) {
                d.c(this.TAG, "onActivityResult2: ", e11);
            }
            l(jSONObject2.toString(), (String) this.f34995d.remove("ID_3"));
        }
        super.onActivityResult(i7, i10, intent);
    }

    @Override // com.transsnet.palmpay.core.base.BaseActivity, androidx.activity.AbstractActivityC0822m, android.app.Activity
    public final void onBackPressed() {
        AndroidXWebView androidXWebView = this.f34992a;
        if (androidXWebView == null || !androidXWebView.canGoBack() || "file:///android_asset/network_error.html".equals(this.f34992a.getUrl())) {
            super.onBackPressed();
        } else {
            this.f34992a.goBack();
        }
    }

    @Override // com.transsnet.palmpay.core.base.BaseActivity, androidx.appcompat.app.AbstractActivityC0837o, androidx.fragment.app.E, android.app.Activity
    public final void onDestroy() {
        AndroidXWebView androidXWebView = this.f34992a;
        if (androidXWebView != null) {
            ViewParent parent = androidXWebView.getParent();
            if (parent != null) {
                ((ViewGroup) parent).removeView(this.f34992a);
            }
            this.f34992a.stopLoading();
            this.f34992a.getSettings().setJavaScriptEnabled(false);
            this.f34992a.clearHistory();
            this.f34992a.clearView();
            this.f34992a.removeAllViews();
            this.f34992a.destroy();
        }
        super.onDestroy();
        c.b().l(this);
    }

    @Override // androidx.activity.AbstractActivityC0822m, android.app.Activity
    public final void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
        ThirdPartyMerchantListResp.ThirdPartyMerchant thirdPartyMerchant = (ThirdPartyMerchantListResp.ThirdPartyMerchant) intent.getSerializableExtra("merchant");
        if (thirdPartyMerchant == null || thirdPartyMerchant.getServiceLink().equals(this.f34994c.getServiceLink())) {
            return;
        }
        this.f34994c = thirdPartyMerchant;
        this.f34996e.setTitle(thirdPartyMerchant.getMerchantName());
        this.f34992a.loadUrl(this.f34994c.getServiceLink());
    }

    @Subscribe(threadMode = ThreadMode.MAIN)
    public void onPaymentMessage(TPMerchantPaymentMsg tPMerchantPaymentMsg) {
        l(tPMerchantPaymentMsg.getResultMsg(), (String) this.f34995d.remove("ID_1"));
    }

    @Override // com.transsnet.palmpay.core.base.BaseActivity
    public final void processLogic(Bundle bundle) {
        this.f34996e.setRightImageView1ClickListener(new x(this, 16));
    }

    @Override // com.transsnet.palmpay.core.base.BaseActivity
    public final void setupView() {
        this.f34992a = (AndroidXWebView) findViewById(Ac.e.web_view_container);
        this.f34993b = (ProgressBar) findViewById(Ac.e.progress_bar);
        String stringExtra = getIntent().getStringExtra("linkUrl");
        this.f34997f = stringExtra;
        if (TextUtils.isEmpty(stringExtra)) {
            this.f34997f = getQueryParameter("linkUrl");
        }
        this.f34995d = new HashMap();
        initStatusBar(getColor(L6.b.ppColorBackgroundLight));
        PpTitleBar ppTitleBar = (PpTitleBar) findViewById(Ac.e.titleBar);
        this.f34996e = ppTitleBar;
        S6.a aVar = S6.a.pay_CloseFill;
        int color = getColor(L6.b.ppColorTextNormal);
        ImageView imageView = ppTitleBar.f24624e;
        if (imageView != null) {
            imageView.setImageDrawable(p059e1.a.h(ppTitleBar.getContext(), aVar, null, color, 24));
        }
        this.f34992a.getSettings().setJavaScriptEnabled(true);
        this.f34992a.getSettings().setCacheMode(-1);
        this.f34992a.addJavascriptInterface(new h(this), "merchant");
        this.f34992a.setWebChromeClient(new o(this, 7));
        this.f34992a.setWebViewClient(new C0328a(this, 2));
    }
}
