package com.transsnet.palmpay.ui.activity.welcome;

import Ac.e;
import Ac.f;
import Bc.k;
import Pa.i0;
import Wf.AbstractC0780y;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.camera.core.impl.utils.executor.g;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.lifecycle.V;
import androidx.viewbinding.ViewBinding;
import com.adjust.sdk.Constants;
import com.alibaba.android.arouter.facade.annotation.Route;
import com.alibaba.android.arouter.launcher.ARouter;
import com.palmpay.lib.ui.button.PpButton;
import com.palmpay.lib.ui.titlebar.PpTitleBar;
import com.transsnet.adsdk.widgets.SingleAdView;
import com.transsnet.palmpay.core.base.BaseActivity;
import com.transsnet.palmpay.core.util.statistic.core.AutoTrackUtil;
import com.transsnet.palmpay.core.util.statistic.core.LogConstants;
import com.transsnet.palmpay.custom_view.StatusBarView;
import com.transsnet.palmpay.util.ActivityUtils;
import java.net.URLDecoder;
import java.util.HashMap;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import p270rd.C1976t;
import p313ue.d;
import p355xf.C2131j;
import p355xf.o;
import p355xf.p;
import p355xf.q;
import p355xf.t;
import p7.h;

/* JADX INFO: loaded from: classes4.dex */
@Route(path = "/main/welcome_new_user")
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcom/transsnet/palmpay/ui/activity/welcome/WelcomeNewUserActivity;", "Lcom/transsnet/palmpay/core/base/BaseActivity;", "<init>", "()V", "a", "module_main_impl_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nWelcomeNewUserActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 WelcomeNewUserActivity.kt\ncom/transsnet/palmpay/ui/activity/welcome/WelcomeNewUserActivity\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 ViewExt.kt\ncom/transsnet/palmpay/core/ext/ViewExtKt\n*L\n1#1,205:1\n1#2:206\n562#3,10:207\n595#3,6:217\n*S KotlinDebug\n*F\n+ 1 WelcomeNewUserActivity.kt\ncom/transsnet/palmpay/ui/activity/welcome/WelcomeNewUserActivity\n*L\n145#1:207,10\n185#1:217,6\n*E\n"})
public final class WelcomeNewUserActivity extends BaseActivity {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final a f35040i = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f35041a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f35042b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public String f35043c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public String f35044d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public String f35045e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public k f35046f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final t f35047g = C2131j.b(new C1976t(22));

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @JvmStatic
        public final void start(@NotNull Context context) {
            Intrinsics.checkNotNullParameter(context, "context");
            ActivityUtils.startActivity(new Intent(context, (Class<?>) WelcomeNewUserActivity.class));
        }

        private a() {
        }
    }

    public static String l(String str) {
        Object objF;
        if (str == null || str.length() == 0) {
            return str;
        }
        try {
            o oVar = q.f43977a;
            objF = URLDecoder.decode(str, Constants.ENCODING);
        } catch (Throwable th) {
            o oVar2 = q.f43977a;
            objF = g.f(th);
        }
        Object obj = str;
        if (!(objF instanceof p)) {
            obj = objF;
        }
        return (String) obj;
    }

    @Override // com.transsnet.palmpay.core.base.BaseActivity
    public final int getLayoutId() {
        return 0;
    }

    @Override // com.transsnet.palmpay.core.base.BaseActivity
    public final void initData() {
        k kVar = this.f35046f;
        boolean zV = i0.V(kVar != null ? (ConstraintLayout) kVar.f751e : null);
        String str = TextUtils.isEmpty(this.f35044d) ? this.f35043c : this.f35044d;
        if (!zV) {
            str = this.f35043c;
        }
        if (str == null || str.length() == 0) {
            AbstractC0780y.m(V.f(this), null, null, new d(2, null), 3);
            this.f35045e = p059e1.a.H("main_sp_welcome_new_user_config");
        } else {
            this.f35045e = str;
        }
        getWindow().getDecorView().post(new h((Handler) this.f35047g.getValue(), 15, this, false));
    }

    @Override // com.transsnet.palmpay.core.base.BaseActivity
    public final void initStatusBar() {
        initStatusBar(true);
    }

    @Override // com.transsnet.palmpay.core.base.BaseActivity
    public final ViewBinding initViewBinding(Bundle bundle) {
        View viewInflate = getLayoutInflater().inflate(f.main_activity_welcome_new_user, (ViewGroup) null, false);
        int i7 = e.btnSignUp;
        PpButton ppButton = (PpButton) p059e1.a.m(i7, viewInflate);
        if (ppButton != null) {
            i7 = e.cornerAd;
            if (((SingleAdView) p059e1.a.m(i7, viewInflate)) != null) {
                i7 = e.ivBg;
                AppCompatImageView appCompatImageView = (AppCompatImageView) p059e1.a.m(i7, viewInflate);
                if (appCompatImageView != null) {
                    i7 = e.statusBarView;
                    if (((StatusBarView) p059e1.a.m(i7, viewInflate)) != null) {
                        i7 = e.titleBar;
                        PpTitleBar ppTitleBar = (PpTitleBar) p059e1.a.m(i7, viewInflate);
                        if (ppTitleBar != null) {
                            i7 = e.tvLogin;
                            PpButton ppButton2 = (PpButton) p059e1.a.m(i7, viewInflate);
                            if (ppButton2 != null) {
                                k kVar = new k((ConstraintLayout) viewInflate, ppButton, appCompatImageView, ppTitleBar, ppButton2, 2);
                                this.f35046f = kVar;
                                return kVar;
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i7)));
    }

    @Override // com.transsnet.palmpay.core.base.BaseActivity
    public final boolean isForceNoNightMode() {
        return false;
    }

    @Override // com.transsnet.palmpay.core.base.BaseActivity, androidx.appcompat.app.AbstractActivityC0837o, androidx.fragment.app.E, android.app.Activity
    public final void onDestroy() {
        super.onDestroy();
        ((Handler) this.f35047g.getValue()).removeCallbacksAndMessages(null);
    }

    @Override // com.transsnet.palmpay.core.base.BaseActivity
    public final void processLogic(Bundle bundle) {
        String str = this.f35045e;
        if (str != null) {
            HashMap map = new HashMap();
            map.put(LogConstants.Autotrack.ELEMENT_URL, str);
            AutoTrackUtil.trackActivityProperties(this, map);
        }
    }

    @Override // com.transsnet.palmpay.core.base.BaseActivity
    public final void setupView() {
        k kVar;
        requestLayoutFullScreen();
        ARouter.getInstance().inject(this);
        this.f35042b = l(this.f35042b);
        this.f35043c = l(this.f35043c);
        this.f35044d = l(this.f35044d);
        String str = this.f35041a;
        if (str == null || str.length() == 0 || (kVar = this.f35046f) == null) {
            return;
        }
        ((PpTitleBar) kVar.f750d).setTitle(str);
    }
}
