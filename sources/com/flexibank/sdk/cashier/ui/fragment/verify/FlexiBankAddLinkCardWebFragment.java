package com.flexibank.sdk.cashier.ui.fragment.verify;

import Ae.o;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebSettings;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import androidx.core.view.KeyEventDispatcher$Component;
import androidx.viewbinding.ViewBinding;
import com.flexibank.sdk.cashier.callback.FlexiBankPayVerificationCallback;
import com.flexibank.sdk.core.viewmodel.FlexiBankAndroidXWebView;
import com.flexibank.sdk.p;
import com.flexibank.sdk.q;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import x4.e;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0005B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"Lcom/flexibank/sdk/cashier/ui/fragment/verify/FlexiBankAddLinkCardWebFragment;", "Lcom/flexibank/sdk/cashier/ui/fragment/verify/FlexiBankBaseVerifyFragment;", "Lx4/e;", "<init>", "()V", "a", "flexibank-sdk_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class FlexiBankAddLinkCardWebFragment extends FlexiBankBaseVerifyFragment<e> {

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static final a f21998w = new a(null);

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public FlexiBankAndroidXWebView f21999p;
    public ProgressBar t;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public String f22000v = "";

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @JvmStatic
        @NotNull
        public final FlexiBankAddLinkCardWebFragment newInstance(@Nullable String str) {
            FlexiBankAddLinkCardWebFragment flexiBankAddLinkCardWebFragment = new FlexiBankAddLinkCardWebFragment();
            Bundle bundle = new Bundle();
            bundle.putString("url", str);
            flexiBankAddLinkCardWebFragment.setArguments(bundle);
            return flexiBankAddLinkCardWebFragment;
        }

        private a() {
        }
    }

    public static final FlexiBankPayVerificationCallback r(FlexiBankAddLinkCardWebFragment flexiBankAddLinkCardWebFragment) {
        KeyEventDispatcher$Component activity = flexiBankAddLinkCardWebFragment.getActivity();
        Intrinsics.f(activity, "null cannot be cast to non-null type com.flexibank.sdk.cashier.callback.FlexiBankPayVerificationCallback");
        return (FlexiBankPayVerificationCallback) activity;
    }

    @Override // com.flexibank.sdk.base.FlexiBankBaseFragment
    public final ViewBinding i(LayoutInflater inflater, ViewGroup viewGroup) {
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        View viewInflate = inflater.inflate(q.fb_fragment_add_link_card_web, viewGroup, false);
        int i7 = p.fb_aalaw_progressbar;
        ProgressBar progressBar = (ProgressBar) p059e1.a.m(i7, viewInflate);
        if (progressBar != null) {
            i7 = p.fb_aalaw_webview;
            FlexiBankAndroidXWebView flexiBankAndroidXWebView = (FlexiBankAndroidXWebView) p059e1.a.m(i7, viewInflate);
            if (flexiBankAndroidXWebView != null) {
                e eVar = new e((LinearLayout) viewInflate, progressBar, flexiBankAndroidXWebView);
                Intrinsics.checkNotNullExpressionValue(eVar, "inflate(...)");
                return eVar;
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i7)));
    }

    @Override // com.flexibank.sdk.base.FlexiBankBaseFragment
    public final int j() {
        return 0;
    }

    @Override // com.flexibank.sdk.base.FlexiBankBaseFragment
    public final void k() {
    }

    @Override // com.flexibank.sdk.base.FlexiBankBaseFragment
    public final int l() {
        String string;
        FlexiBankAndroidXWebView flexiBankAndroidXWebView;
        WebSettings settings;
        Bundle arguments = getArguments();
        if (arguments == null || (string = arguments.getString("url")) == null) {
            string = "";
        }
        this.f22000v = string;
        e eVar = (e) this.f21944f;
        this.f21999p = eVar != null ? eVar.f43594c : null;
        ProgressBar progressBar = eVar != null ? eVar.f43593b : null;
        this.t = progressBar;
        if (progressBar != null) {
            progressBar.setMax(100);
        }
        FlexiBankAndroidXWebView flexiBankAndroidXWebView2 = this.f21999p;
        if (flexiBankAndroidXWebView2 != null) {
            flexiBankAndroidXWebView2.requestFocus();
        }
        FlexiBankAndroidXWebView flexiBankAndroidXWebView3 = this.f21999p;
        if (flexiBankAndroidXWebView3 != null && (settings = flexiBankAndroidXWebView3.getSettings()) != null) {
            settings.setJavaScriptEnabled(true);
        }
        FlexiBankAndroidXWebView flexiBankAndroidXWebView4 = this.f21999p;
        if (flexiBankAndroidXWebView4 != null) {
            flexiBankAndroidXWebView4.setWebViewClient(new R3.a(this, 0));
        }
        FlexiBankAndroidXWebView flexiBankAndroidXWebView5 = this.f21999p;
        if (flexiBankAndroidXWebView5 != null) {
            flexiBankAndroidXWebView5.setWebChromeClient(new o(this, 3));
        }
        if (TextUtils.isEmpty(this.f22000v) || (flexiBankAndroidXWebView = this.f21999p) == null) {
            return 0;
        }
        String str = this.f22000v;
        Intrinsics.e(str);
        flexiBankAndroidXWebView.loadUrl(str);
        return 0;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDestroy() {
        super.onDestroy();
        FlexiBankAndroidXWebView flexiBankAndroidXWebView = this.f21999p;
        if (flexiBankAndroidXWebView != null) {
            flexiBankAndroidXWebView.destroy();
        }
    }
}
