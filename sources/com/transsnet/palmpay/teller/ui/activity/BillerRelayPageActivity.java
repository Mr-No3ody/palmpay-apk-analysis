package com.transsnet.palmpay.teller.ui.activity;

import C0.G;
import L6.b;
import Pa.r0;
import Pd.c;
import Pd.d;
import Rd.C0608y;
import Uc.I0;
import Wd.C0736j;
import Wd.C0737k;
import Wf.t0;
import android.os.Bundle;
import android.text.SpannableStringBuilder;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.lifecycle.V;
import androidx.viewbinding.ViewBinding;
import com.airbnb.lottie.LottieAnimationView;
import com.alibaba.android.arouter.facade.annotation.Route;
import com.alibaba.android.arouter.launcher.ARouter;
import com.bumptech.glide.load.resource.bitmap.z;
import com.mikepenz.iconics.view.IconicsImageView;
import com.transsnet.palmpay.core.base.BaseMvvmVBActivity;
import com.transsnet.palmpay.core.base.BaseViewModel;
import com.transsnet.palmpay.custom_view.r;
import com.transsnet.palmpay.custom_view.utils.CommonViewExtKt;
import com.transsnet.palmpay.util.UrlCoderUtil;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import p059e1.a;

/* JADX INFO: loaded from: classes4.dex */
@Route(path = "/quick_teller/biller_relay_page")
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/transsnet/palmpay/teller/ui/activity/BillerRelayPageActivity;", "Lcom/transsnet/palmpay/core/base/BaseMvvmVBActivity;", "Lcom/transsnet/palmpay/core/base/BaseViewModel;", "LRd/y;", "<init>", "()V", "module_biller_impl_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class BillerRelayPageActivity extends BaseMvvmVBActivity<BaseViewModel, C0608y> {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final /* synthetic */ int f34167j = 0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public t0 f34168d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public String f34169e = "";

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public String f34170f = "";

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public String f34171g = "";

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public String f34172i = "outside";

    @Override // com.transsnet.palmpay.core.base.BaseActivity
    public final void initStatusBar() {
        super.initStatusBar(true);
    }

    @Override // com.transsnet.palmpay.core.base.BaseMvvmVBActivity
    public final ViewBinding m() {
        View viewInflate = getLayoutInflater().inflate(d.qt_activity_relay_page, (ViewGroup) null, false);
        int i7 = c.ivBillerLogo;
        ImageView imageView = (ImageView) a.m(i7, viewInflate);
        if (imageView != null) {
            i7 = c.ivClose;
            IconicsImageView iconicsImageView = (IconicsImageView) a.m(i7, viewInflate);
            if (iconicsImageView != null) {
                i7 = c.ivLogo;
                if (((ImageView) a.m(i7, viewInflate)) != null) {
                    i7 = c.lottieAnimationView;
                    LottieAnimationView lottieAnimationView = (LottieAnimationView) a.m(i7, viewInflate);
                    if (lottieAnimationView != null) {
                        i7 = c.tvContent;
                        TextView textView = (TextView) a.m(i7, viewInflate);
                        if (textView != null) {
                            i7 = c.tvCountdown;
                            TextView textView2 = (TextView) a.m(i7, viewInflate);
                            if (textView2 != null) {
                                i7 = c.tvtitle;
                                TextView textView3 = (TextView) a.m(i7, viewInflate);
                                if (textView3 != null) {
                                    C0608y c0608y = new C0608y((LinearLayout) viewInflate, imageView, iconicsImageView, lottieAnimationView, textView, textView2, textView3);
                                    Intrinsics.checkNotNullExpressionValue(c0608y, "inflate(...)");
                                    return c0608y;
                                }
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i7)));
    }

    @Override // com.transsnet.palmpay.core.base.BaseMvvmVBActivity, com.transsnet.palmpay.core.base.BaseActivity, androidx.appcompat.app.AbstractActivityC0837o, androidx.fragment.app.E, android.app.Activity
    public final void onDestroy() {
        super.onDestroy();
        t0 t0Var = this.f34168d;
        if (t0Var != null) {
            t0Var.cancel((CancellationException) null);
        }
        C0608y c0608y = (C0608y) this.f27334c;
        if (c0608y != null) {
            c0608y.f8551d.a();
        }
    }

    @Override // com.transsnet.palmpay.core.base.BaseActivity
    public final void processLogic(Bundle bundle) {
        ARouter.getInstance().inject(this);
        String str = this.f34171g;
        if (str == null || str.length() == 0) {
            finish();
            return;
        }
        C0608y c0608y = (C0608y) this.f27334c;
        if (c0608y != null) {
            c0608y.f8550c.setOnClickListener(new I0(this, 18));
        }
        String str2 = this.f34169e;
        if (str2 != null && str2.length() != 0) {
            String strDecode = UrlCoderUtil.hasEnCode(this.f34169e) ? UrlCoderUtil.decode(this.f34169e) : this.f34169e;
            C0608y c0608y2 = (C0608y) this.f27334c;
            ImageView imageView = c0608y2 != null ? c0608y2.f8549b : null;
            if (strDecode == null) {
                strDecode = "";
            }
            r0.j1(imageView, strDecode, (G1.d) ((G1.d) ((G1.d) new G1.d().j(r.cv_palmpay_logo_7)).x(r.cv_palmpay_logo_7)).H(new z(CommonViewExtKt.getDp(4))));
        }
        String str3 = this.f34170f;
        if (str3 != null && str3.length() != 0) {
            SpannableStringBuilder spannableStringBuilderCreate = G.i("You'll be redirected to the website of ").append(String.valueOf(this.f34170f)).setFontFamily("sans-serif-medium").setForegroundColor(CommonViewExtKt.colorInt(b.ppColorWarning, this)).append(" Company, where the following services are provided.").create();
            C0608y c0608y3 = (C0608y) this.f27334c;
            if (c0608y3 != null) {
                c0608y3.f8552e.setText(spannableStringBuilderCreate);
            }
        }
        this.f34168d = org.chromium.support_lib_boundary.util.b.r(V.f(this), 3000L, null, new C0736j(this, null), new C0737k(this, null), 14);
    }
}
