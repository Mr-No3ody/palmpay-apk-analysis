package com.transsnet.palmpay.echat;

import Ac.e;
import Ac.f;
import Ac.h;
import Ae.o;
import F6.d;
import N8.r;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.text.TextUtils;
import android.view.MenuItem;
import android.view.ViewGroup;
import android.webkit.ValueCallback;
import android.webkit.WebSettings;
import android.webkit.WebView;
import com.alibaba.android.arouter.facade.annotation.Route;
import com.alibaba.android.arouter.launcher.ARouter;
import com.palmpay.lib.ui.titlebar.PpTitleBar;
import com.transsnet.palmpay.core.base.BaseActivity;
import com.transsnet.palmpay.core.bean.req.GetCustomerServiceUrlReq;
import com.transsnet.palmpay.core.network.PayApiService;
import com.transsnet.palmpay.core.viewmodel.AndroidXWebView;
import com.transsnet.palmpay.util.FileUtils;
import com.transsnet.palmpay.util.ToastUtils;
import com.transsnet.palmpay.util.UrlCoderUtil;
import java.io.File;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import p025ba.k;
import p059e1.a;
import p071ef.b;
import p324va.c;

/* JADX INFO: loaded from: classes4.dex */
@Route(path = "/main/echat")
public class EchatActivity extends BaseActivity {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final /* synthetic */ int f31827i = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public AndroidXWebView f31828a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public ValueCallback f31829b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Uri f31830c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Handler f31831d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public String f31832e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public String f31833f = GetCustomerServiceUrlReq.ENTER_TYPE_DEFAULT;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public String f31834g;

    @Override // com.transsnet.palmpay.core.base.BaseActivity
    public final int getLayoutId() {
        return f.main_activity_echat;
    }

    @Override // com.transsnet.palmpay.core.base.BaseActivity
    public final void initData() {
        if (UrlCoderUtil.hasEnCode(this.f31834g)) {
            this.f31834g = UrlCoderUtil.decode(this.f31834g);
        }
        showLoadingDialog(true);
        if (TextUtils.isEmpty(this.f31834g)) {
            String strH = a.H("main_sp_customerServiceUrl" + this.f31833f);
            this.f31834g = strH;
            if (TextUtils.isEmpty(strH)) {
                String str = this.f31833f;
                GetCustomerServiceUrlReq getCustomerServiceUrlReq = new GetCustomerServiceUrlReq();
                getCustomerServiceUrlReq.time = System.currentTimeMillis();
                getCustomerServiceUrlReq.entryType = str;
                ((PayApiService) c.f43141a.f14621b).getCustomerServiceUrl(getCustomerServiceUrlReq).k(p298tf.f.f42629b).i(b.a()).subscribe(new r(this, 10, str, false));
            }
        }
        AndroidXWebView androidXWebView = this.f31828a;
        String str2 = this.f31834g;
        WebSettings settings = androidXWebView.getSettings();
        settings.setJavaScriptEnabled(true);
        settings.setSupportZoom(false);
        settings.setRenderPriority(WebSettings.RenderPriority.HIGH);
        settings.setCacheMode(-1);
        settings.setDomStorageEnabled(true);
        settings.setDatabaseEnabled(true);
        settings.setDatabasePath(getFilesDir().getAbsolutePath() + "EchatLocalStorage");
        settings.setNeedInitialFocus(true);
        settings.setLoadWithOverviewMode(true);
        settings.setUseWideViewPort(true);
        androidXWebView.setDownloadListener(new p187mc.a(0));
        androidXWebView.removeJavascriptInterface("accessibility");
        androidXWebView.removeJavascriptInterface("accessibilityTraversal");
        settings.setMixedContentMode(0);
        settings.setAllowUniversalAccessFromFileURLs(true);
        androidXWebView.setWebChromeClient(new o(this, 6));
        androidXWebView.setWebViewClient(new p187mc.b(this, androidXWebView));
        d.h("EchatActivity", 3, "initChatWebView: url " + str2);
        if (!TextUtils.isEmpty(str2)) {
            androidXWebView.loadUrl(str2);
        }
        String str3 = this.f31834g;
        Intrinsics.checkNotNullParameter("showTitle", "key");
        boolean zEqualsIgnoreCase = (TextUtils.isEmpty(str3) || !(str3 == null || StringsKt.A(str3, "showTitle", false))) ? false : "true".equalsIgnoreCase(Uri.parse(str3).getQueryParameter("showTitle"));
        PpTitleBar ppTitleBar = (PpTitleBar) findViewById(e.titleBar);
        if (zEqualsIgnoreCase) {
            ppTitleBar.setVisibility(0);
            ppTitleBar.setTitle(getString(h.main_palmpay_service));
        } else {
            ppTitleBar.setVisibility(8);
            requestLayoutFullScreen();
            initStatusBar(true);
        }
    }

    public final boolean l(WebView webView, String str) {
        if (str.startsWith("tel:")) {
            startActivity(new Intent("android.intent.action.VIEW", Uri.parse(str)));
            return true;
        }
        if (!str.startsWith("mailto:")) {
            if (!str.startsWith("http")) {
                return true;
            }
            webView.loadUrl(str);
            return true;
        }
        try {
            Intent intent = new Intent("android.intent.action.SENDTO");
            intent.setData(Uri.parse(str));
            startActivity(intent);
            return true;
        } catch (Exception e10) {
            d.c("EchatActivity", "shouldOverrideUrlLoading: ", e10);
            return true;
        }
    }

    @Override // androidx.fragment.app.E, androidx.activity.AbstractActivityC0822m, android.app.Activity
    public final void onActivityResult(int i7, int i10, Intent intent) {
        super.onActivityResult(i7, i10, intent);
        if (i7 == 254) {
            if (-1 == i10) {
                Uri data = intent.getData();
                File file = new File(data.getPath());
                if (!FileUtils.isFileExists(file)) {
                    ToastUtils.showLong(k.core_failed);
                } else if (file.length() > 5242880) {
                    ToastUtils.showLong(h.main_msg_file_too_large);
                } else {
                    this.f31830c = data;
                }
            }
            ValueCallback valueCallback = this.f31829b;
            if (valueCallback != null) {
                Uri uri = this.f31830c;
                valueCallback.onReceiveValue(uri != null ? new Uri[]{uri} : null);
                this.f31829b = null;
                this.f31830c = null;
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x003b, code lost:
    
        if (android.text.TextUtils.equals(r0, r3.f31834g + "/index") != false) goto L14;
     */
    @Override // com.transsnet.palmpay.core.base.BaseActivity, androidx.activity.AbstractActivityC0822m, android.app.Activity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onBackPressed() {
        /*
            r3 = this;
            com.transsnet.palmpay.core.viewmodel.AndroidXWebView r0 = r3.f31828a
            android.webkit.WebBackForwardList r0 = r0.copyBackForwardList()
            android.webkit.WebHistoryItem r0 = r0.getCurrentItem()
            if (r0 == 0) goto L11
            java.lang.String r0 = r0.getOriginalUrl()
            goto L12
        L11:
            r0 = 0
        L12:
            com.transsnet.palmpay.core.viewmodel.AndroidXWebView r1 = r3.f31828a
            if (r1 == 0) goto L43
            boolean r1 = r1.canGoBack()
            if (r1 == 0) goto L43
            java.lang.String r1 = r3.f31834g
            boolean r1 = android.text.TextUtils.equals(r0, r1)
            if (r1 != 0) goto L3d
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = r3.f31834g
            r1.append(r2)
            java.lang.String r2 = "/index"
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            boolean r0 = android.text.TextUtils.equals(r0, r1)
            if (r0 == 0) goto L43
        L3d:
            com.transsnet.palmpay.core.viewmodel.AndroidXWebView r0 = r3.f31828a
            r0.goBack()
            return
        L43:
            super.onBackPressed()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.transsnet.palmpay.echat.EchatActivity.onBackPressed():void");
    }

    @Override // com.transsnet.palmpay.core.base.BaseActivity, androidx.appcompat.app.AbstractActivityC0837o, androidx.fragment.app.E, android.app.Activity
    public final void onDestroy() {
        Handler handler = this.f31831d;
        if (handler != null) {
            handler.removeCallbacksAndMessages(null);
        }
        super.onDestroy();
        AndroidXWebView androidXWebView = this.f31828a;
        if (androidXWebView != null) {
            androidXWebView.loadDataWithBaseURL(null, "", "text/html", "utf-8", null);
            this.f31828a.clearHistory();
            ((ViewGroup) this.f31828a.getParent()).removeView(this.f31828a);
            this.f31828a.destroy();
            this.f31828a = null;
        }
    }

    @Override // com.transsnet.palmpay.core.base.BaseActivity, android.app.Activity
    public final boolean onOptionsItemSelected(MenuItem menuItem) {
        if (menuItem.getItemId() == 16908332) {
            finish();
        }
        return super.onOptionsItemSelected(menuItem);
    }

    @Override // com.transsnet.palmpay.core.base.BaseActivity
    public final void processLogic(Bundle bundle) {
    }

    @Override // com.transsnet.palmpay.core.base.BaseActivity
    public final void setupView() {
        ARouter.getInstance().inject(this);
        this.f31831d = new Handler();
        initStatusBar(getColor(L6.b.ppColorBackgroundLight));
        this.f31828a = (AndroidXWebView) findViewById(e.webView);
    }
}
