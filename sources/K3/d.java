package K3;

import android.R;
import android.content.Context;
import android.content.DialogInterface;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.LocaleList;
import android.os.Looper;
import android.os.Trace;
import android.text.TextUtils;
import android.util.Log;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.appcompat.app.AbstractActivityC0837o;
import androidx.appcompat.app.AbstractC0824b;
import androidx.appcompat.app.AbstractC0841t;
import androidx.appcompat.app.I;
import androidx.camera.video.u;
import androidx.core.view.C1052d;
import androidx.core.view.E;
import androidx.core.view.F;
import androidx.core.view.N;
import androidx.core.view.OnApplyWindowInsetsListener;
import androidx.core.view.q0;
import androidx.core.view.r0;
import androidx.core.view.s0;
import androidx.core.view.u0;
import androidx.core.view.v0;
import androidx.viewbinding.ViewBinding;
import com.adjust.sdk.Constants;
import com.flexibank.sdk.base.FlexiBankBaseViewModel;
import com.flexibank.sdk.base.FlexiBankLoadingDialogHost;
import com.flexibank.sdk.core.activityresult.FlexiBankActivityResult;
import com.flexibank.sdk.p;
import com.transsnet.palmpay.util.BarUtils;
import com.transsnet.palmpay.util.ToastUtils;
import java.util.Locale;
import java.util.WeakHashMap;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* JADX INFO: loaded from: classes.dex */
public abstract class d extends AbstractActivityC0837o implements DialogInterface.OnCancelListener, FlexiBankLoadingDialogHost, FlexiBankActivityResult, OnApplyWindowInsetsListener {

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final c f4911v = new c(null);

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static boolean f4912w;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Class f4913a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f4914b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public P6.a f4915c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public FlexiBankBaseViewModel f4916d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public ViewBinding f4917e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final V3.g f4918f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public View f4919g;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public View f4920i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public Boolean f4921j;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public String f4922o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public Handler f4923p;
    public final Ae.n t;

    public d(Class cls) {
        this.f4913a = cls;
        String simpleName = getClass().getSimpleName();
        Intrinsics.checkNotNullExpressionValue(simpleName, "getSimpleName(...)");
        this.f4914b = simpleName;
        this.f4918f = new V3.g(this);
        this.f4923p = new Handler(Looper.getMainLooper());
        this.t = new Ae.n(this, 24);
    }

    @Override // androidx.appcompat.app.AbstractActivityC0837o, android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    public final void attachBaseContext(Context context) {
        Intrinsics.checkNotNullParameter(context, "newBase");
        int i7 = j4.k.f38298a;
        Intrinsics.checkNotNullParameter(context, "context");
        p110h4.a aVar = p110h4.b.f37294b;
        String string = aVar.getInstance().f37296a.getString("key_default_language", null);
        int i10 = Build.VERSION.SDK_INT;
        if (i10 > 24) {
            Resources resources = context.getResources();
            Locale locale = Locale.ENGLISH;
            if ("AO".equalsIgnoreCase(string)) {
                locale = new Locale("pt");
            }
            locale.getDisplayName();
            Configuration configuration = resources.getConfiguration();
            configuration.setLocale(locale);
            configuration.setLocales(new LocaleList(locale));
            context = context.createConfigurationContext(configuration);
        }
        super.attachBaseContext(context);
        if (i10 != 24 || f4912w) {
            return;
        }
        Intrinsics.checkNotNullParameter(this, "context");
        String string2 = aVar.getInstance().f37296a.getString("key_default_language", null);
        if (i10 <= 24 && !TextUtils.isEmpty(string2)) {
            Resources resources2 = getResources();
            Configuration configuration2 = resources2.getConfiguration();
            Locale locale2 = Locale.ENGLISH;
            if ("AO".equalsIgnoreCase(string2)) {
                locale2 = new Locale("pt");
            }
            locale2.getDisplayName();
            configuration2.setLocale(locale2);
            locale2.toString();
            resources2.updateConfiguration(configuration2, resources2.getDisplayMetrics());
        }
        f4912w = true;
    }

    public final void checkAndShowLoadingDialog(final boolean z3, final boolean z8, String str) {
        Intrinsics.checkNotNullParameter("", "message");
        if (Intrinsics.c(Looper.getMainLooper().getThread(), Thread.currentThread())) {
            showLoadingDialog(z3, z8, "");
        } else {
            runOnUiThread(new Runnable() { // from class: K3.a
                @Override // java.lang.Runnable
                public final void run() {
                    this.f4907a.showLoadingDialog(z3, z8, "");
                }
            });
        }
    }

    public final FlexiBankBaseViewModel e() {
        FlexiBankBaseViewModel flexiBankBaseViewModel = this.f4916d;
        if (flexiBankBaseViewModel != null) {
            return flexiBankBaseViewModel;
        }
        Intrinsics.n("mViewModel");
        throw null;
    }

    public ViewBinding f() {
        return null;
    }

    public int getLayoutId() {
        return 0;
    }

    @Override // com.flexibank.sdk.core.activityresult.FlexiBankActivityResult
    public final V3.g getStartActivityLauncher() {
        return this.f4918f;
    }

    public abstract void initData();

    public abstract void initStatusBar();

    public final void initStatusBar(int i7) {
        org.chromium.support_lib_boundary.util.b s0Var;
        boolean z3 = i7 == -1 || getColor(L6.b.ppColorBackgroundDark) == i7;
        getWindow().addFlags(Integer.MIN_VALUE);
        int i10 = Build.VERSION.SDK_INT;
        if (i10 < 35) {
            getWindow().setStatusBarColor(i7);
            BarUtils.setStatusBarLightMode(this, z3);
            return;
        }
        try {
            View decorView = getWindow().getDecorView();
            Intrinsics.f(decorView, "null cannot be cast to non-null type android.view.ViewGroup");
            ViewGroup viewGroup = (ViewGroup) decorView;
            Window window = getWindow();
            C1052d c1052d = new C1052d(viewGroup, 4);
            int i11 = Build.VERSION.SDK_INT;
            if (i11 >= 35) {
                s0Var = new v0(window, c1052d);
            } else if (i11 >= 30) {
                s0Var = new u0(window, c1052d);
            } else {
                s0Var = i11 >= 26 ? new s0(window, c1052d) : new r0(window, c1052d);
            }
            s0Var.d0(z3);
            s0Var.c0(z3);
            if (i10 >= 35) {
                io.fastkv.n.K(getWindow(), false);
            } else if (i10 >= 30) {
                getWindow().setDecorFitsSystemWindows(false);
            }
            View viewFindViewWithTag = viewGroup.findViewWithTag("status_bar_bg");
            if (viewFindViewWithTag != null) {
                viewFindViewWithTag.setBackgroundColor(i7);
            } else {
                viewFindViewWithTag = new View(this);
                viewFindViewWithTag.setTag("status_bar_bg");
                viewFindViewWithTag.setBackgroundColor(i7);
                viewFindViewWithTag.setLayoutParams(new ViewGroup.LayoutParams(-1, 0));
                viewGroup.addView(viewFindViewWithTag);
            }
            this.f4919g = viewFindViewWithTag;
            View viewFindViewWithTag2 = viewGroup.findViewWithTag("nav_bar_bg");
            if (viewFindViewWithTag2 != null) {
                viewFindViewWithTag2.setBackgroundColor(i7);
            } else {
                viewFindViewWithTag2 = new View(this);
                viewFindViewWithTag2.setTag("nav_bar_bg");
                viewFindViewWithTag2.setBackgroundColor(i7);
                FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, 0);
                layoutParams.gravity = 80;
                viewGroup.addView(viewFindViewWithTag2, layoutParams);
            }
            this.f4920i = viewFindViewWithTag2;
            WeakHashMap weakHashMap = N.f16168a;
            E.n(viewGroup, this);
            E.n(viewGroup, this);
        } catch (Exception e10) {
            Log.e(this.f4914b, "applySystemBarAppearance failed", e10);
        }
    }

    public abstract boolean isForceNoNightMode();

    public final void loadingDismiss() {
        try {
            P6.a aVar = this.f4915c;
            if (aVar != null) {
                if (!aVar.isShowing()) {
                    aVar = null;
                }
                if (aVar != null) {
                    aVar.dismiss();
                    aVar.setOnCancelListener(null);
                    this.f4915c = null;
                }
            }
        } catch (Exception unused) {
        }
    }

    /* JADX WARN: Code duplicated, block: B:15:0x005e  */
    /* JADX WARN: Code duplicated, block: B:30:0x008e  */
    /* JADX WARN: Code duplicated, block: B:33:0x009a A[Catch: Exception -> 0x00a5, TRY_LEAVE, TryCatch #1 {Exception -> 0x00a5, blocks: (B:16:0x0063, B:33:0x009a, B:31:0x0090, B:19:0x0075, B:21:0x007d, B:26:0x0087), top: B:38:0x0063, inners: #0 }] */
    @Override // androidx.core.view.OnApplyWindowInsetsListener
    public final q0 onApplyWindowInsets(View v3, q0 insets) {
        View viewFindViewById;
        Intrinsics.checkNotNullParameter(v3, "v");
        Intrinsics.checkNotNullParameter(insets, "insets");
        int i7 = insets.f16277a.g(1).f16059b;
        View view = this.f4919g;
        if (view != null) {
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            layoutParams.height = i7;
            view.setLayoutParams(layoutParams);
        }
        int i10 = insets.f16277a.g(2).f16061d;
        View view2 = this.f4920i;
        if (view2 != null) {
            if (i10 <= 0) {
                view2.setVisibility(8);
            } else {
                if (Build.VERSION.SDK_INT >= 35) {
                    View decorView = getWindow().getDecorView();
                    WeakHashMap weakHashMap = N.f16168a;
                    q0 q0VarA = F.a(decorView);
                    if (q0VarA != null && q0VarA.f16277a.g(2).f16061d <= 0) {
                        view2.setVisibility(8);
                    }
                }
                ViewGroup.LayoutParams layoutParams2 = view2.getLayoutParams();
                layoutParams2.height = i10;
                view2.setLayoutParams(layoutParams2);
                view2.setVisibility(0);
            }
        }
        try {
            if (!getWindow().getDecorView().getFitsSystemWindows()) {
                try {
                    ViewGroup viewGroup = (ViewGroup) findViewById(R.id.content);
                    if (viewGroup == null) {
                        viewFindViewById = null;
                        if (viewFindViewById != null) {
                            p062e4.a.b(viewFindViewById, null, null, null, Integer.valueOf(Math.max(i10, 0)));
                        }
                    } else {
                        if (viewGroup.getChildCount() <= 0) {
                            viewGroup = null;
                        }
                        if (viewGroup != null) {
                            viewFindViewById = viewGroup.findViewById(R.id.content);
                        } else {
                            viewFindViewById = null;
                        }
                        if (viewFindViewById != null) {
                            p062e4.a.b(viewFindViewById, null, null, null, Integer.valueOf(Math.max(i10, 0)));
                        }
                    }
                } catch (Exception e10) {
                    Log.e(this.f4914b, "Failed to get ContentView", e10);
                }
            }
        } catch (Exception unused) {
        }
        return insets;
    }

    @Override // androidx.activity.AbstractActivityC0822m, android.app.Activity
    public void onBackPressed() {
        if ((isDestroyed() || isFinishing()) ? false : true) {
            super.onBackPressed();
        }
    }

    @Override // androidx.fragment.app.E, androidx.activity.AbstractActivityC0822m, androidx.core.app.AbstractActivityC1040i, android.app.Activity
    public final void onCreate(Bundle bundle) {
        Locale locale;
        String strQ;
        try {
            String str = Build.MANUFACTURER;
            int i7 = Build.VERSION.SDK_INT;
            if (Constants.REFERRER_API_SAMSUNG.equalsIgnoreCase(str) && i7 == 28) {
                AbstractC0841t.k(1);
            } else {
                if (!isForceNoNightMode()) {
                    com.flexibank.sdk.k.o();
                }
                if (((I) getDelegate()).f12122I0 != 1) {
                    getDelegate().l(1);
                }
            }
        } catch (Exception unused) {
            AbstractC0841t.k(1);
        }
        super.onCreate(bundle);
        TextUtils.isEmpty(com.flexibank.sdk.k.h());
        setRequestedOrientation(1);
        f4911v.checkHardwareAccelerated(getWindow());
        if (Build.VERSION.SDK_INT >= 30) {
            Window window = getWindow();
            WindowManager.LayoutParams attributes = getWindow().getAttributes();
            attributes.layoutInDisplayCutoutMode = 3;
            window.setAttributes(attributes);
        }
        int layoutId = getLayoutId();
        if (layoutId != 0) {
            try {
                Trace.beginSection("setContentView");
                try {
                    setContentView(layoutId);
                    Unit unit = Unit.f38893a;
                    Trace.endSection();
                } catch (Throwable th) {
                    Trace.endSection();
                    throw th;
                }
            } catch (Exception e10) {
                e10.printStackTrace();
                String message = e10.getMessage();
                if (message == null || (strQ = u.q((locale = Locale.ROOT), "ROOT", message, locale, "toLowerCase(...)")) == null || !StringsKt.A(strQ, "webview", false)) {
                    throw new RuntimeException(message);
                }
                ToastUtils.showLong(message, new Object[0]);
                finish();
                return;
            }
        } else {
            ViewBinding viewBindingF = f();
            this.f4917e = viewBindingF;
            if (viewBindingF == null) {
                viewBindingF = null;
            }
            if (viewBindingF != null) {
                setContentView(((x4.a) viewBindingF).f43569a);
            }
        }
        getWindow().getDecorView().setOnTouchListener(new b(0));
        initStatusBar();
        Class cls = this.f4913a;
        if (cls != null) {
            this.f4916d = (FlexiBankBaseViewModel) new androidx.camera.video.internal.c(this).h(cls);
            getLifecycle().a(e());
        }
        setupView();
        initData();
        processLogic(bundle);
    }

    @Override // androidx.appcompat.app.AbstractActivityC0837o, androidx.fragment.app.E, android.app.Activity
    public void onDestroy() {
        try {
            View decorView = getWindow().getDecorView();
            WeakHashMap weakHashMap = N.f16168a;
            E.n(decorView, null);
        } catch (Exception unused) {
        }
        loadingDismiss();
        Handler handler = this.f4923p;
        if (handler != null) {
            handler.removeCallbacksAndMessages(null);
        }
        Handler handler2 = this.f4923p;
        if (handler2 != null) {
            handler2.removeCallbacks(this.t);
        }
        super.onDestroy();
        this.f4917e = null;
    }

    @Override // android.app.Activity
    public final boolean onOptionsItemSelected(MenuItem item) {
        Intrinsics.checkNotNullParameter(item, "item");
        if (item.getItemId() != 16908332) {
            return super.onOptionsItemSelected(item);
        }
        onBackPressed();
        return true;
    }

    @Override // androidx.fragment.app.E, android.app.Activity
    public void onResume() {
        try {
            String str = Build.MANUFACTURER;
            int i7 = Build.VERSION.SDK_INT;
            if (!Constants.REFERRER_API_SAMSUNG.equalsIgnoreCase(str) || i7 != 28) {
                if (!isForceNoNightMode()) {
                    com.flexibank.sdk.k.o();
                }
                if (((I) getDelegate()).f12122I0 != 1) {
                    getDelegate().l(1);
                }
            }
        } catch (Exception unused) {
            AbstractC0841t.k(1);
        }
        super.onResume();
    }

    public abstract void processLogic(Bundle bundle);

    @Override // android.app.Activity
    public final void setRequestedOrientation(int i7) {
        if (Build.VERSION.SDK_INT == 26) {
            i7 = -1;
        }
        super.setRequestedOrientation(i7);
    }

    @Override // android.app.Activity
    public final void setTitle(CharSequence charSequence) {
        View viewD;
        TextView textView;
        AbstractC0824b supportActionBar = getSupportActionBar();
        if (supportActionBar == null || (viewD = supportActionBar.d()) == null || (textView = (TextView) viewD.findViewById(p.fb_textViewTitle)) == null) {
            super.setTitle(charSequence);
        } else {
            textView.setText(charSequence);
        }
    }

    public abstract void setupView();

    public final void showCommonDialog(String str, String str2) {
        if (str == null || str.length() == 0 || str2 == null || str2.length() == 0 || isDestroyed() || isFinishing()) {
            return;
        }
        runOnUiThread(new Da.h(this, 4, str, str2));
    }

    @Override // com.flexibank.sdk.base.FlexiBankLoadingDialogHost
    public final void showLoadingDialog(boolean z3) {
        Intrinsics.checkNotNullParameter("", "message");
        checkAndShowLoadingDialog(z3, true, "");
    }

    public final void showLoadingDialog(boolean z3, boolean z8, String str) {
        Intrinsics.checkNotNullParameter("", "message");
        if (isDestroyed() || isFinishing()) {
            return;
        }
        Ae.n nVar = this.t;
        if (z3) {
            Handler handler = this.f4923p;
            if (handler != null) {
                handler.removeCallbacks(nVar);
            }
            P6.a aVar = this.f4915c;
            if (aVar != null && aVar.isShowing()) {
                if ((this.f4921j == null || Boolean.valueOf(z8).equals(this.f4921j)) && "".equals(this.f4922o)) {
                    return;
                }
                P6.a aVar2 = this.f4915c;
                if (aVar2 != null) {
                    aVar2.dismiss();
                }
                this.f4915c = null;
            }
            P6.a aVar3 = new P6.a(this, L6.g.lib_ui_lottie_loading);
            aVar3.f6999e = 1;
            aVar3.f6998d = "";
            aVar3.show();
            this.f4915c = aVar3;
            aVar3.setCanceledOnTouchOutside(false);
            aVar3.setCancelable(z8);
            aVar3.setOnCancelListener(this);
            this.f4921j = Boolean.valueOf(z8);
            this.f4922o = "";
            return;
        }
        Handler handler2 = this.f4923p;
        if (handler2 == null) {
            handler2 = new Handler(Looper.getMainLooper());
            this.f4923p = handler2;
        }
        handler2.postDelayed(nVar, 100L);
    }

    @Override // android.app.Activity
    public final void setTitle(int i7) {
        View viewD;
        TextView textView;
        AbstractC0824b supportActionBar = getSupportActionBar();
        if (supportActionBar != null && (viewD = supportActionBar.d()) != null && (textView = (TextView) viewD.findViewById(p.fb_textViewTitle)) != null) {
            textView.setText(getString(i7));
        } else {
            super.setTitle(i7);
        }
    }

    @Override // com.flexibank.sdk.base.FlexiBankLoadingDialogHost
    public final void showLoadingDialog(boolean z3, boolean z8) {
        checkAndShowLoadingDialog(z3, z8, "");
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public void onCancel(DialogInterface dialogInterface) {
    }
}
