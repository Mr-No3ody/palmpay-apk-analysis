package com.flexibank.sdk.core.web;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.Window;
import com.flexibank.sdk.core.viewmodel.FlexiBankAndroidXWebView;
import com.google.firebase.crashlytics.internal.metadata.UserMetadata;
import com.palmpay.lib.webview.container.PPWebActivity;
import com.palmpay.lib.webview.container.WebViewConfig;
import com.transsnet.palmpay.util.ActivityUtils;
import com.transsnet.palmpay.util.UrlCoderUtil;
import j4.b;
import j4.u;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import kotlin.text.y;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0016\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcom/flexibank/sdk/core/web/FlexiBankPWebActivity;", "Lcom/palmpay/lib/webview/container/PPWebActivity;", "<init>", "()V", "a", "flexibank-sdk_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public class FlexiBankPWebActivity extends PPWebActivity {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f22146a;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    static {
        new a(null);
    }

    @Override // com.palmpay.lib.webview.container.PPWebActivity
    public final void configWebView(WebViewConfig.Builder builder) {
        Intrinsics.checkNotNullParameter(builder, "builder");
        String mUrl = getMUrl();
        if (mUrl != null) {
            boolean zM = false;
            if (!TextUtils.isEmpty(mUrl)) {
                String strConcat = "https://h5.flexi-bank.com";
                if (!TextUtils.isEmpty("https://h5.flexi-bank.com") && !y.g("https://h5.flexi-bank.com", "/", false)) {
                    strConcat = "https://h5.flexi-bank.com".concat("/");
                }
                zM = y.m(mUrl, strConcat, false);
            }
            if (!zM) {
                Intent intentA = u.a(mUrl);
                if (intentA != null) {
                    ActivityUtils.startActivity(intentA);
                }
                finish();
            }
        }
        b.f38281d.assistActivity(this);
        builder.setCustomWebView(new FlexiBankAndroidXWebView(this));
    }

    @Override // com.palmpay.lib.webview.container.PPWebActivity
    public final String getLoadUrl() {
        String loadUrl = super.getLoadUrl();
        return UrlCoderUtil.hasEnCode(loadUrl) ? UrlCoderUtil.decode(loadUrl) : loadUrl;
    }

    @Override // com.palmpay.lib.webview.container.PPWebActivity
    public final boolean isDelayAddWebView() {
        return false;
    }

    @Override // com.palmpay.lib.webview.container.PPWebActivity, androidx.fragment.app.E, androidx.activity.AbstractActivityC0822m, androidx.core.app.AbstractActivityC1040i, android.app.Activity
    public final void onCreate(Bundle bundle) {
        getDelegate().l(1);
        super.onCreate(bundle);
        String mUrl = getMUrl();
        boolean zH = false;
        if (mUrl != null && mUrl.length() != 0 && StringsKt.A(mUrl, "securityPage", false)) {
            zH = y.h(Uri.parse(mUrl).getQueryParameter("securityPage"), "true", true);
        }
        this.f22146a = zH;
    }

    @Override // com.palmpay.lib.webview.container.PPWebActivity, androidx.fragment.app.E, android.app.Activity
    public final void onPause() {
        Window window;
        super.onPause();
        if (!this.f22146a || (window = getWindow()) == null) {
            return;
        }
        window.clearFlags(UserMetadata.MAX_INTERNAL_KEY_SIZE);
    }

    @Override // com.palmpay.lib.webview.container.PPWebActivity, androidx.fragment.app.E, android.app.Activity
    public final void onResume() {
        Window window;
        super.onResume();
        if (!this.f22146a || (window = getWindow()) == null) {
            return;
        }
        window.setFlags(UserMetadata.MAX_INTERNAL_KEY_SIZE, UserMetadata.MAX_INTERNAL_KEY_SIZE);
    }
}
