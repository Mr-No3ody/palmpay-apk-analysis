package com.transsnet.palmpay.credit.ui.activity;

import N8.C0474s;
import Pa.i0;
import Ya.e;
import Ya.f;
import Za.d;
import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.FrameLayout;
import androidx.core.view.E;
import androidx.core.view.N;
import androidx.fragment.app.C1161a;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.Z;
import androidx.viewpager2.widget.ViewPager2;
import com.alibaba.android.arouter.facade.annotation.Route;
import com.alibaba.android.arouter.launcher.ARouter;
import com.alibaba.android.arouter.utils.TextUtils;
import com.transsnet.adsdk.widgets.banner.bannerview.b;
import com.transsnet.palmpay.core.base.BaseApplication;
import com.transsnet.palmpay.core.callback.HomeAcCallback;
import com.transsnet.palmpay.credit.bean.LoanHomeSource;
import com.transsnet.palmpay.credit.ui.fragment.LoanHomeFragment;
import com.transsnet.palmpay.credit.ui.fragment.LoanHomeGuestFragment;
import com.transsnet.palmpay.credit.ui.fragment.LoanRepaymentListFragment;
import com.transsnet.palmpay.util.ActivityUtils;
import io.fastkv.n;
import java.util.Iterator;
import java.util.Set;
import java.util.WeakHashMap;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import kotlin.text.y;
import p141j9.C1798f;
import p189me.jessyan.autosize.internal.CancelAdapt;
import p294tb.RunnableC2060w;

/* JADX INFO: loaded from: classes4.dex */
@Route(path = "/credit_score/loan_home_activity")
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u0005B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"Lcom/transsnet/palmpay/credit/ui/activity/LoanHomeActivity;", "LZa/d;", "Lme/jessyan/autosize/internal/CancelAdapt;", "<init>", "()V", "a", "module_flexi_impl_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class LoanHomeActivity extends d implements CancelAdapt {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ int f28689f = 0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Boolean f28690d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f28691e;

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

    public static void o(Activity activity) {
        if (activity == null && (activity = ActivityUtils.isActivityExistsInStack("com.transsnet.palmpay.ui.activity.HomeActivity")) == null) {
            return;
        }
        Intent intent = activity.getIntent();
        if (intent != null) {
            String stringExtra = intent.getStringExtra("tab");
            Uri data = intent.getData();
            String queryParameter = data != null ? data.getQueryParameter("tab") : null;
            if ("finance".equals(stringExtra) || "finance".equals(queryParameter)) {
                intent.removeExtra("tab");
                Uri data2 = intent.getData();
                if (data2 != null && data2.getQueryParameter("tab") != null) {
                    try {
                        Uri.Builder builderClearQuery = data2.buildUpon().clearQuery();
                        for (String str : data2.getQueryParameterNames()) {
                            if (!Intrinsics.c(str, "tab")) {
                                Iterator<String> it = data2.getQueryParameters(str).iterator();
                                while (it.hasNext()) {
                                    builderClearQuery.appendQueryParameter(str, it.next());
                                }
                            }
                        }
                        intent.setData(builderClearQuery.build());
                    } catch (Exception unused) {
                    }
                }
            }
        }
        HomeAcCallback homeAcCallback = activity instanceof HomeAcCallback ? (HomeAcCallback) activity : null;
        if (homeAcCallback != null) {
            homeAcCallback.switchToMainHomeTabOnLoanHomeExit();
        }
    }

    @Override // com.transsnet.palmpay.core.base.BaseActivity
    public final int getLayoutId() {
        return f.cs_activity_loan_home;
    }

    @Override // com.transsnet.palmpay.core.base.BaseActivity
    public final void initData() {
    }

    @Override // com.transsnet.palmpay.core.base.h, com.transsnet.palmpay.core.base.BaseActivity
    public final void initStatusBar() {
        initStatusBar(true);
    }

    @Override // com.transsnet.palmpay.core.base.BaseActivity
    public final boolean isForceNoNightMode() {
        return false;
    }

    public final void n(Intent intent) {
        if (intent != null) {
            if (!intent.getBooleanExtra("fromRepaymentSuccess", false)) {
                String stringExtra = intent.getStringExtra("fromRepaymentSuccess");
                if (!y.h(stringExtra, "true", true) && !Intrinsics.c(stringExtra, "1")) {
                    return;
                }
            }
            Fragment fragmentD = getSupportFragmentManager().D(e.fragmentContainer);
            LoanHomeFragment loanHomeFragment = fragmentD instanceof LoanHomeFragment ? (LoanHomeFragment) fragmentD : null;
            if (loanHomeFragment == null) {
                getWindow().getDecorView().post(new b(this, 23));
                return;
            }
            intent.removeExtra("fromRepaymentSuccess");
            loanHomeFragment.f30342H = false;
            if (loanHomeFragment.y()) {
                loanHomeFragment.f30341C = false;
                loanHomeFragment.refreshLoanHomeData(false);
                return;
            }
            loanHomeFragment.f30341C = true;
            LoanRepaymentListFragment loanRepaymentListFragmentW = loanHomeFragment.w();
            if (loanRepaymentListFragmentW != null) {
                loanRepaymentListFragmentW.v(false, true);
                return;
            }
            View view = loanHomeFragment.getView();
            if (view != null) {
                view.post(new RunnableC2060w(loanHomeFragment, 8));
            }
        }
    }

    @Override // com.transsnet.palmpay.core.base.BaseActivity, androidx.activity.AbstractActivityC0822m, android.app.Activity
    public final void onBackPressed() {
        if (this.f28691e) {
            o(null);
            finish();
            return;
        }
        if (BaseApplication.hasLogin()) {
            Fragment fragmentD = getSupportFragmentManager().D(e.fragmentContainer);
            LoanHomeFragment loanHomeFragment = fragmentD instanceof LoanHomeFragment ? (LoanHomeFragment) fragmentD : null;
            if (loanHomeFragment != null && !loanHomeFragment.y()) {
                ViewPager2 viewPager2 = (ViewPager2) loanHomeFragment.f30344M.getValue();
                if (viewPager2 != null) {
                    viewPager2.setCurrentItem(0, false);
                }
                loanHomeFragment.refreshLoanHomeData(false);
                return;
            }
        }
        Activity activityIsActivityExistsInStack = ActivityUtils.isActivityExistsInStack("com.transsnet.palmpay.ui.activity.HomeActivity");
        if (activityIsActivityExistsInStack != null) {
            o(activityIsActivityExistsInStack);
            finish();
        } else {
            i0.H(null);
            finish();
        }
    }

    @Override // com.transsnet.palmpay.core.base.BaseActivity, androidx.fragment.app.E, androidx.activity.AbstractActivityC0822m, androidx.core.app.AbstractActivityC1040i, android.app.Activity
    public final void onCreate(Bundle bundle) {
        n.K(getWindow(), false);
        super.onCreate(bundle);
        Intent intent = getIntent();
        boolean z3 = bundle == null;
        String strU = Eb.a.u(intent, new C1798f(this, 16));
        if (strU != null && !StringsKt.F(strU)) {
            Eb.a.f2267a = LoanHomeSource.INSTANCE.normalize(strU);
        } else if (z3) {
            Eb.a.f2267a = LoanHomeSource.INSTANCE.normalize("");
        }
    }

    @Override // androidx.activity.AbstractActivityC0822m, android.app.Activity
    public final void onNewIntent(Intent intent) {
        Intrinsics.checkNotNullParameter(intent, "intent");
        super.onNewIntent(intent);
        setIntent(intent);
        String strU = Eb.a.u(intent, new C1798f(this, 16));
        if (strU != null && !StringsKt.F(strU)) {
            Eb.a.f2267a = LoanHomeSource.INSTANCE.normalize(strU);
        }
        String stringExtra = intent.getStringExtra("tab");
        if (TextUtils.isEmpty(stringExtra)) {
            stringExtra = getQueryParameter("tab");
        }
        if ("repayment".equals(stringExtra) && (getSupportFragmentManager().D(e.fragmentContainer) instanceof LoanHomeFragment)) {
            Fragment fragmentD = getSupportFragmentManager().D(e.fragmentContainer);
            Intrinsics.f(fragmentD, "null cannot be cast to non-null type com.transsnet.palmpay.credit.ui.fragment.LoanHomeFragment");
            ViewPager2 viewPager2 = (ViewPager2) ((LoanHomeFragment) fragmentD).f30344M.getValue();
            if (viewPager2 != null) {
                viewPager2.setCurrentItem(1, false);
            }
        }
        n(intent);
    }

    @Override // com.transsnet.palmpay.core.base.BaseActivity, androidx.fragment.app.E, android.app.Activity
    public final void onResume() {
        Set set = Eb.b.f2269a;
        p118hf.a.f37382e = Boolean.TRUE;
        n(getIntent());
        super.onResume();
        p(false);
    }

    public final void p(boolean z3) {
        boolean zHasLogin = BaseApplication.hasLogin();
        if (z3 || !Intrinsics.c(this.f28690d, Boolean.valueOf(zHasLogin))) {
            this.f28690d = Boolean.valueOf(zHasLogin);
            Fragment fragmentNewInstance = zHasLogin ? LoanHomeFragment.f30338Z.newInstance() : LoanHomeGuestFragment.f30353o.newInstance();
            String str = zHasLogin ? "LoanHomeLoggedFragment" : "LoanHomeGuestFragment";
            try {
                Z supportFragmentManager = getSupportFragmentManager();
                supportFragmentManager.getClass();
                C1161a c1161a = new C1161a(supportFragmentManager);
                c1161a.e(e.fragmentContainer, fragmentNewInstance, str);
                c1161a.h(true);
            } catch (Exception e10) {
                F6.d.c(this.TAG, e10);
            }
        }
    }

    @Override // com.transsnet.palmpay.core.base.BaseActivity
    public final void processLogic(Bundle bundle) {
        if (bundle == null) {
            p(true);
        }
    }

    @Override // com.transsnet.palmpay.core.base.BaseActivity
    public final void setupView() {
        ARouter.getInstance().inject(this);
        FrameLayout frameLayout = (FrameLayout) findViewById(e.fragmentContainer);
        C0474s c0474s = new C0474s(2);
        WeakHashMap weakHashMap = N.f16168a;
        E.n(frameLayout, c0474s);
    }
}
