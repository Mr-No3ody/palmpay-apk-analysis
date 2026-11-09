package com.transsnet.palmpay.betting.ui.activity;

import C0.G;
import F6.d;
import Pa.r0;
import Pd.c;
import Rd.C0593i;
import V8.w;
import Wf.t0;
import android.net.Uri;
import android.os.Bundle;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.activity.u;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.lifecycle.V;
import androidx.viewbinding.ViewBinding;
import com.airbnb.lottie.LottieAnimationView;
import com.alibaba.android.arouter.facade.annotation.Route;
import com.alibaba.android.arouter.launcher.ARouter;
import com.bumptech.glide.load.resource.bitmap.z;
import com.mikepenz.iconics.view.IconicsImageView;
import com.palmpay.lib.ui.titlebar.PpTitleBar;
import com.transsnet.palmpay.betting.viewmodel.BettingDepositViewModel;
import com.transsnet.palmpay.core.base.BaseMvvmVBActivity;
import com.transsnet.palmpay.core.base.l;
import com.transsnet.palmpay.core.viewmodel.AndroidXWebView;
import com.transsnet.palmpay.custom_view.r;
import com.transsnet.palmpay.custom_view.utils.CommonViewExtKt;
import com.transsnet.palmpay.util.UrlCoderUtil;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.y;
import p140j8.f;
import p141j9.C1798f;
import p141j9.s;
import p187mc.b;
import p220oa.h;
import p282s9.n;
import p282s9.o;

/* JADX INFO: loaded from: classes3.dex */
@Route(path = "/quick_teller/betting_quickbet_web")
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\u0006B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0007"}, d2 = {"Lcom/transsnet/palmpay/betting/ui/activity/BettingQuickBetWebActivity;", "Lcom/transsnet/palmpay/core/base/BaseMvvmVBActivity;", "Lcom/transsnet/palmpay/betting/viewmodel/BettingDepositViewModel;", "LRd/i;", "<init>", "()V", "a", "module_biller_impl_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nBettingQuickBetWebActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BettingQuickBetWebActivity.kt\ncom/transsnet/palmpay/betting/ui/activity/BettingQuickBetWebActivity\n+ 2 LifecycleOwnerKtx.kt\ncom/transsnet/palmpay/core/base/ext/LifecycleOwnerKtxKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,493:1\n260#2,10:494\n296#2:504\n1#3:505\n*S KotlinDebug\n*F\n+ 1 BettingQuickBetWebActivity.kt\ncom/transsnet/palmpay/betting/ui/activity/BettingQuickBetWebActivity\n*L\n97#1:494,10\n97#1:504\n*E\n"})
public final class BettingQuickBetWebActivity extends BaseMvvmVBActivity<BettingDepositViewModel, C0593i> {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final String f26693j;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public String f26694d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public String f26695e = "";

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public String f26696f = "";

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public t0 f26697g;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public String f26698i;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    static {
        new a(null);
        Intrinsics.checkNotNullExpressionValue("BettingQuickBetWebActivity", "getSimpleName(...)");
        f26693j = "BettingQuickBetWebActivity";
    }

    public static void n(Uri uri) {
        String str = f26693j;
        try {
            d.h(str, 3, "处理pageId=7，跳转到Betting首页");
            Bundle bundle = new Bundle();
            p(uri, bundle);
            ARouter.getInstance().build("/quick_teller/betting_home").with(bundle).navigation();
            d.h(str, 3, "pageId=7跳转成功");
        } catch (Exception e10) {
            d.c(str, "处理pageId=7失败", e10);
        }
    }

    public static void o(Uri uri) {
        String str = f26693j;
        try {
            d.h(str, 3, "处理pageId=108，跳转到Betting创建订单页面");
            Bundle bundle = new Bundle();
            p(uri, bundle);
            ARouter.getInstance().build("/quick_teller/betting_quickbet_create").with(bundle).navigation();
            d.h(str, 3, "pageId=108跳转成功");
        } catch (Exception e10) {
            d.c(str, "处理pageId=108失败", e10);
        }
    }

    public static void p(Uri uri, Bundle bundle) {
        for (String str : uri.getQueryParameterNames()) {
            String queryParameter = uri.getQueryParameter(str);
            if (queryParameter != null) {
                Object[] objArr = {G.p("解析参数: ", str, " = ", queryParameter)};
                String str2 = f26693j;
                d.h(str2, 3, objArr);
                if (!y.g(queryParameter, "L", false) || queryParameter.length() <= 1) {
                    bundle.putString(str, queryParameter);
                    StringBuilder sb2 = new StringBuilder("添加String参数: ");
                    sb2.append(str);
                    d.h(str2, 3, G.r(sb2, " = ", queryParameter));
                } else {
                    try {
                        String strSubstring = queryParameter.substring(0, queryParameter.length() - 1);
                        Intrinsics.checkNotNullExpressionValue(strSubstring, "substring(...)");
                        long j6 = Long.parseLong(strSubstring);
                        bundle.putLong(str, j6);
                        d.h(str2, 3, "添加Long参数: " + str + " = " + j6);
                    } catch (NumberFormatException unused) {
                        bundle.putString(str, queryParameter);
                        StringBuilder sb3 = new StringBuilder("Long转换失败，当作String处理: ");
                        sb3.append(str);
                        d.h(str2, 5, G.r(sb3, " = ", queryParameter));
                    }
                }
            }
        }
    }

    @Override // com.transsnet.palmpay.core.base.BaseMvvmActivity, com.transsnet.palmpay.core.base.BaseActivity
    public final void initData() {
        if (UrlCoderUtil.hasEnCode(this.f26694d)) {
            this.f26694d = UrlCoderUtil.decode(this.f26694d);
        }
        if (TextUtils.isEmpty(this.f26694d)) {
            finish();
        }
        C0593i c0593i = (C0593i) this.f27334c;
        if (c0593i != null) {
            AndroidXWebView androidXWebView = c0593i.f8340o;
            String str = this.f26694d;
            WebSettings settings = androidXWebView.getSettings();
            Intrinsics.checkNotNullExpressionValue(settings, "getSettings(...)");
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
            androidXWebView.setDownloadListener(new p187mc.a(1));
            androidXWebView.removeJavascriptInterface("accessibility");
            androidXWebView.removeJavascriptInterface("accessibilityTraversal");
            settings.setMixedContentMode(0);
            settings.setAllowUniversalAccessFromFileURLs(true);
            androidXWebView.setWebViewClient(new b(androidXWebView, this));
            if (!TextUtils.isEmpty(str)) {
                d.h("BettingQuickBetWebActivity", 3, "initChatWebView: url ".concat(str == null ? "" : str));
                Intrinsics.e(str);
                androidXWebView.loadUrl(str);
            }
        }
        C0593i c0593i2 = (C0593i) this.f27334c;
        if (c0593i2 != null) {
            h.s(c0593i2.f8332b, true);
        }
        this.f26697g = org.chromium.support_lib_boundary.util.b.r(V.f(this), 3000L, null, new n(this, null), new o(this, null), 14);
        String str2 = this.f26695e;
        if (str2 != null && str2.length() != 0) {
            String strDecode = UrlCoderUtil.hasEnCode(this.f26695e) ? UrlCoderUtil.decode(this.f26695e) : this.f26695e;
            C0593i c0593i3 = (C0593i) this.f27334c;
            r0.j1(c0593i3 != null ? c0593i3.f8333c : null, strDecode != null ? strDecode : "", (G1.d) ((G1.d) ((G1.d) new G1.d().j(r.cv_palmpay_logo_7)).x(r.cv_palmpay_logo_7)).H(new z(CommonViewExtKt.getDp(4))));
        }
        String str3 = this.f26696f;
        if (str3 == null || str3.length() == 0) {
            return;
        }
        SpannableStringBuilder spannableStringBuilderCreate = G.i("You'll be redirected to the website of ").append(String.valueOf(this.f26696f)).setFontFamily("sans-serif-medium").setForegroundColor(CommonViewExtKt.colorInt(L6.b.ppColorWarning, this)).append(" Company, where the following services are provided.").create();
        C0593i c0593i4 = (C0593i) this.f27334c;
        if (c0593i4 != null) {
            c0593i4.f8336f.setText(spannableStringBuilderCreate);
        }
    }

    @Override // com.transsnet.palmpay.core.base.BaseMvvmVBActivity
    public final ViewBinding m() {
        View viewM;
        View viewInflate = getLayoutInflater().inflate(Pd.d.qt_activity_betting_quick_bet_web, (ViewGroup) null, false);
        int i7 = c.clLoading;
        ConstraintLayout constraintLayout = (ConstraintLayout) p059e1.a.m(i7, viewInflate);
        if (constraintLayout != null) {
            i7 = c.ivBillerLogo;
            ImageView imageView = (ImageView) p059e1.a.m(i7, viewInflate);
            if (imageView != null) {
                i7 = c.ivClose;
                if (((IconicsImageView) p059e1.a.m(i7, viewInflate)) != null) {
                    i7 = c.ivLogo;
                    if (((ImageView) p059e1.a.m(i7, viewInflate)) != null) {
                        i7 = c.lottieAnimationView;
                        LottieAnimationView lottieAnimationView = (LottieAnimationView) p059e1.a.m(i7, viewInflate);
                        if (lottieAnimationView != null) {
                            i7 = c.titleBar;
                            PpTitleBar ppTitleBar = (PpTitleBar) p059e1.a.m(i7, viewInflate);
                            if (ppTitleBar != null) {
                                i7 = c.tvContent;
                                TextView textView = (TextView) p059e1.a.m(i7, viewInflate);
                                if (textView != null) {
                                    i7 = c.tvCountdown;
                                    TextView textView2 = (TextView) p059e1.a.m(i7, viewInflate);
                                    if (textView2 != null) {
                                        i7 = c.tvTitle;
                                        TextView textView3 = (TextView) p059e1.a.m(i7, viewInflate);
                                        if (textView3 != null && (viewM = p059e1.a.m((i7 = c.viewBg), viewInflate)) != null) {
                                            i7 = c.webView;
                                            AndroidXWebView androidXWebView = (AndroidXWebView) p059e1.a.m(i7, viewInflate);
                                            if (androidXWebView != null) {
                                                C0593i c0593i = new C0593i((ConstraintLayout) viewInflate, constraintLayout, imageView, lottieAnimationView, ppTitleBar, textView, textView2, textView3, viewM, androidXWebView);
                                                Intrinsics.checkNotNullExpressionValue(c0593i, "inflate(...)");
                                                return c0593i;
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i7)));
    }

    @Override // android.app.Activity
    public final boolean onCreateOptionsMenu(Menu menu) {
        Intrinsics.checkNotNullParameter(menu, "menu");
        return super.onCreateOptionsMenu(menu);
    }

    @Override // com.transsnet.palmpay.core.base.BaseMvvmVBActivity, com.transsnet.palmpay.core.base.BaseActivity, androidx.appcompat.app.AbstractActivityC0837o, androidx.fragment.app.E, android.app.Activity
    public final void onDestroy() {
        AndroidXWebView androidXWebView;
        super.onDestroy();
        C0593i c0593i = (C0593i) this.f27334c;
        if (c0593i == null || (androidXWebView = c0593i.f8340o) == null) {
            return;
        }
        androidXWebView.loadDataWithBaseURL(null, "", "text/html", "utf-8", null);
        androidXWebView.clearHistory();
        ViewParent parent = androidXWebView.getParent();
        ViewGroup viewGroup = parent instanceof ViewGroup ? (ViewGroup) parent : null;
        if (viewGroup != null) {
            viewGroup.removeView(androidXWebView);
        }
        androidXWebView.destroy();
    }

    @Override // com.transsnet.palmpay.core.base.BaseActivity, android.app.Activity
    public final boolean onOptionsItemSelected(MenuItem item) {
        Intrinsics.checkNotNullParameter(item, "item");
        if (item.getItemId() == 16908332) {
            finish();
        }
        return super.onOptionsItemSelected(item);
    }

    @Override // com.transsnet.palmpay.core.base.BaseActivity
    public final void processLogic(Bundle bundle) {
        BettingDepositViewModel bettingDepositViewModel = (BettingDepositViewModel) l();
        if (bettingDepositViewModel != null) {
            f.s(bettingDepositViewModel, new x9.f(this.f26694d, null), bettingDepositViewModel.f26780w, (28 & 4) != 0 ? 0L : 300L, (28 & 8) != 0, (28 & 16) == 0);
        }
        l lVar = ((BettingDepositViewModel) l()).f26780w;
        if (lVar != null) {
            lVar.e(this, new s(new w(22, this, this), (short) 0));
        }
    }

    public final boolean q(WebView view, String str) {
        Intrinsics.checkNotNullParameter(view, "view");
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        Intrinsics.e(str);
        if (!y.m(str, "palmpay://com.transsnet.palmpay.link?pageId=", false)) {
            view.loadUrl(str);
            return true;
        }
        Object[] objArr = {"拦截到deepLink: ".concat(str)};
        String str2 = f26693j;
        d.h(str2, 3, objArr);
        try {
            d.h(str2, 3, "处理deepLink: ".concat(str));
            Uri uri = Uri.parse(str);
            String queryParameter = uri.getQueryParameter("pageId");
            d.h(str2, 3, "解析到pageId: " + queryParameter);
            if (Intrinsics.c(queryParameter, "108")) {
                o(uri);
                return true;
            }
            if (Intrinsics.c(queryParameter, "7")) {
                n(uri);
                return true;
            }
            d.h(str2, 5, "不支持的pageId: " + queryParameter + "，忽略此deepLink");
            return true;
        } catch (Exception e10) {
            d.c(str2, "处理deepLink失败: ".concat(str), e10);
            return true;
        }
    }

    @Override // com.transsnet.palmpay.core.base.BaseMvvmActivity, com.transsnet.palmpay.core.base.BaseActivity
    public final void setupView() {
        u.a(getOnBackPressedDispatcher(), this, new C1798f(this, 15));
        ARouter.getInstance().inject(this);
        initStatusBar(getColor(L6.b.ppColorBackgroundLight));
        C0593i c0593i = (C0593i) this.f27334c;
        if (c0593i != null) {
            c0593i.f8335e.setBackButtonClickListener(new p173ld.o(this, 20));
        }
    }
}
