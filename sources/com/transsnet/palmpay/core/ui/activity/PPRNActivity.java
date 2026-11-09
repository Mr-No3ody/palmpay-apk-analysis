package com.transsnet.palmpay.core.ui.activity;

import Pa.i0;
import Pa.n0;
import Pa.r0;
import android.R;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import androidx.core.view.OnApplyWindowInsetsListener;
import androidx.core.view.q0;
import com.alibaba.android.arouter.facade.annotation.Route;
import com.facebook.react.ReactActivity;
import com.facebook.react.ReactActivityDelegate;
import com.facebook.react.bridge.NativeModule;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.uimanager.DisplayMetricsHolder;
import com.google.firebase.crashlytics.FirebaseCrashlytics;
import com.palmpay.lib.webview.offline.utils.OfflineConstant;
import com.transsnet.palmpay.core.activityresult.IActivityPermissionResult;
import com.transsnet.palmpay.core.activityresult.IActivityResult;
import com.transsnet.palmpay.core.base.BaseApplication;
import com.transsnet.palmpay.core.bean.message.MessageEvent;
import com.transsnet.palmpay.core.callback.ShowDialogCallback;
import com.transsnet.palmpay.core.receiver.VagueReceiver$OnKeyListener;
import com.transsnet.palmpay.core.util.statistic.core.AutoTrackUtil;
import com.transsnet.palmpay.core.util.statistic.core.LogConstants;
import com.transsnet.palmpay.custom_view.dialog.LoadingDialog;
import com.transsnet.palmpay.util.BarUtils;
import com.transsnet.palmpay.util.UrlCoderUtil;
import face.security.device.api.FaceSecCode;
import java.util.HashMap;
import java.util.WeakHashMap;
import org.greenrobot.eventbus.Subscribe;
import org.greenrobot.eventbus.ThreadMode;
import p189me.jessyan.autosize.internal.CancelAdapt;

/* JADX INFO: loaded from: classes3.dex */
@Route(path = "/coreImpl/rn_host")
public class PPRNActivity extends ReactActivity implements CancelAdapt, VagueReceiver$OnKeyListener, IActivityResult, OnApplyWindowInsetsListener, IActivityPermissionResult, ShowDialogCallback {

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final /* synthetic */ int f27676v = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f27677a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public ImageView f27679c;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public LoadingDialog f27683g;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public View f27684i;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public a0 f27686o;
    public a0 t;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Boolean f27678b = null;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public String f27680d = null;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final p038ca.e f27681e = new p038ca.e(this, null, null);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final p038ca.d f27682f = new p038ca.d(this);

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public boolean f27685j = false;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final DisplayMetrics f27687p = new DisplayMetrics();

    @Override // com.facebook.react.ReactActivity
    public final ReactActivityDelegate createReactActivityDelegate() {
        return new b0(this, this);
    }

    public final void e() {
        LoadingDialog loadingDialog;
        if (i0.W(this) && (loadingDialog = this.f27683g) != null && loadingDialog.isShowing()) {
            this.f27683g.dismiss();
            this.f27683g = null;
        }
    }

    public final void f() {
        NativeModule nativeModule;
        try {
            ReactContext currentReactContext = getReactActivityDelegate().getCurrentReactContext();
            if (currentReactContext != null && currentReactContext.hasActiveReactInstance() && (nativeModule = currentReactContext.getNativeModule("DeviceInfo")) != null) {
                nativeModule.getClass().getDeclaredMethod("emitUpdateDimensionsEvent", new Class[0]).invoke(nativeModule, new Object[0]);
            }
        } catch (Exception unused) {
        }
    }

    public final void g(Boolean bool) {
        try {
            if (this.f27684i != null && this.f27685j && i0.W(this) && !Boolean.TRUE.equals(bool)) {
                if (this.f27686o != null) {
                    getWindow().getDecorView().removeCallbacks(this.f27686o);
                    this.f27686o = null;
                }
                e();
                ViewGroup viewGroup = (ViewGroup) this.f27684i.getParent();
                if (viewGroup != null) {
                    viewGroup.removeView(this.f27684i);
                }
                this.f27684i = null;
                this.f27685j = false;
                F6.d.h("ReactNative", 3, "hideRnLoadingAnimation: hide");
            }
        } catch (Exception e10) {
            F6.d.c("ReactNative", "hideRnLoadingAnimation: fail", e10);
        }
    }

    @Override // com.facebook.react.ReactActivity
    public final String getMainComponentName() {
        return "PalmPayGHApp";
    }

    @Override // com.transsnet.palmpay.core.activityresult.IActivityPermissionResult
    /* JADX INFO: renamed from: getPermissionLauncher */
    public final p038ca.d getF28605j() {
        return this.f27682f;
    }

    @Override // com.transsnet.palmpay.core.activityresult.IActivityResult
    /* JADX INFO: renamed from: getStartActivityLauncher */
    public final p038ca.e getF28604i() {
        return this.f27681e;
    }

    public final void h() {
        DisplayMetrics displayMetrics = this.f27687p;
        if (displayMetrics.density <= 0.0f) {
            displayMetrics.setTo(Resources.getSystem().getDisplayMetrics());
        }
        DisplayMetrics displayMetrics2 = getResources().getDisplayMetrics();
        if (displayMetrics2.density == displayMetrics.density && displayMetrics2.densityDpi == displayMetrics.densityDpi) {
            return;
        }
        displayMetrics2.setTo(displayMetrics);
        getResources().getConfiguration().densityDpi = displayMetrics.densityDpi;
    }

    public final void i() {
        if (isFinishing() || isDestroyed()) {
            return;
        }
        View decorView = getWindow() != null ? getWindow().getDecorView() : null;
        if (decorView == null) {
            j();
            f();
            return;
        }
        a0 a0Var = this.t;
        if (a0Var != null) {
            decorView.removeCallbacks(a0Var);
        }
        a0 a0Var2 = new a0(this, 2);
        this.t = a0Var2;
        decorView.post(a0Var2);
    }

    public final void j() {
        h();
        try {
            DisplayMetricsHolder displayMetricsHolder = DisplayMetricsHolder.INSTANCE;
            WindowManager windowManager = (WindowManager) getSystemService("window");
            if (windowManager == null) {
                return;
            }
            DisplayMetrics displayMetrics = new DisplayMetrics();
            windowManager.getDefaultDisplay().getRealMetrics(displayMetrics);
            DisplayMetrics displayMetrics2 = this.f27687p;
            displayMetrics.density = displayMetrics2.density;
            displayMetrics.scaledDensity = displayMetrics2.scaledDensity;
            displayMetrics.densityDpi = displayMetrics2.densityDpi;
            DisplayMetrics displayMetrics3 = new DisplayMetrics();
            displayMetrics3.setTo(displayMetrics);
            View decorView = getWindow() != null ? getWindow().getDecorView() : null;
            if (decorView != null) {
                if (decorView.getWidth() > 0) {
                    displayMetrics3.widthPixels = decorView.getWidth();
                }
                if (decorView.getHeight() > 0) {
                    displayMetrics3.heightPixels = decorView.getHeight();
                }
            }
            DisplayMetricsHolder.class.getDeclaredMethod("setWindowDisplayMetrics", DisplayMetrics.class).invoke(null, displayMetrics3);
            DisplayMetricsHolder.class.getDeclaredMethod("setScreenDisplayMetrics", DisplayMetrics.class).invoke(null, displayMetrics);
        } catch (Exception e10) {
            F6.d.c("ReactNative", "syncReactNativeDisplayMetrics: ", e10);
        }
    }

    /* JADX WARN: Code duplicated, block: B:22:0x0059  */
    @Override // androidx.core.view.OnApplyWindowInsetsListener
    public final q0 onApplyWindowInsets(View view, q0 q0Var) {
        View childAt;
        int i7 = q0Var.f16277a.g(2).f16061d;
        try {
            ViewGroup viewGroup = (ViewGroup) findViewById(R.id.content);
            childAt = (viewGroup == null || viewGroup.getChildCount() <= 0) ? null : viewGroup.getChildAt(0);
        } catch (Exception e10) {
            Log.e("ReactNative", "Failed to get ContentView", e10);
        }
        if (childAt != null) {
            if (i7 <= 0) {
                p220oa.h.j(childAt, null, null, null, 0);
            } else {
                if (Build.VERSION.SDK_INT >= 35) {
                    View decorView = getWindow().getDecorView();
                    WeakHashMap weakHashMap = androidx.core.view.N.f16168a;
                    q0 q0VarA = androidx.core.view.F.a(decorView);
                    if (q0VarA != null && q0VarA.f16277a.g(2).f16061d <= 0) {
                        p220oa.h.j(childAt, null, null, null, 0);
                    }
                }
                p220oa.h.j(childAt, null, null, null, Integer.valueOf(i7));
            }
        }
        return q0Var;
    }

    @Override // com.facebook.react.ReactActivity, androidx.appcompat.app.AbstractActivityC0837o, androidx.activity.AbstractActivityC0822m, android.app.Activity, android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        i();
    }

    @Override // com.facebook.react.ReactActivity, androidx.fragment.app.E, androidx.activity.AbstractActivityC0822m, androidx.core.app.AbstractActivityC1040i, android.app.Activity
    public final void onCreate(Bundle bundle) {
        long j6;
        ViewGroup.LayoutParams layoutParams;
        Ea.a.a(this);
        Ca.f.a(this);
        DisplayMetrics displayMetrics = this.f27687p;
        if (displayMetrics.density <= 0.0f) {
            displayMetrics.setTo(Resources.getSystem().getDisplayMetrics());
        }
        getDelegate().l(i0.T() ? 2 : 1);
        Bundle bundle2 = (Bundle) getIntent().getParcelableExtra("rn_key_params");
        if (bundle2 == null) {
            bundle2 = getIntent().getExtras();
        }
        if (bundle2 == null) {
            bundle2 = new Bundle();
        }
        String string = bundle2.getString("bundleUrl");
        this.f27680d = string;
        if (TextUtils.isEmpty(string)) {
            String string2 = bundle2.getString("bundleZip");
            if (!TextUtils.isEmpty(string2)) {
                this.f27680d = N8.q0.k("https://static.chuanyinet.com/files/", string2, OfflineConstant.ZIP_SUFFIX);
            }
        } else if (UrlCoderUtil.hasEnCode(this.f27680d)) {
            this.f27680d = UrlCoderUtil.decode(this.f27680d);
        }
        super.onCreate(null);
        i();
        if (Build.VERSION.SDK_INT == 26) {
            super.setRequestedOrientation(-1);
        } else {
            super.setRequestedOrientation(1);
        }
        getWindow().getDecorView().post(new a0(this, 0));
        org.greenrobot.eventbus.c.b().j(this);
        n0.g().t("onCreate_" + this.f27677a);
        n0.g().s("FB_RN_V" + BaseApplication.get().getVersionCode() + "_" + BaseApplication.get().getCodePushData());
        HashMap map = new HashMap();
        map.put(LogConstants.Autotrack.ELEMENT_RN_ROUTER, this.f27677a);
        AutoTrackUtil.trackActivityProperties(this, map);
        try {
            if (BaseApplication.isFirebaseInitialized()) {
                FirebaseCrashlytics.getInstance().log("RnPage:" + this.f27677a);
            }
        } catch (Throwable th) {
            F6.d.h("ReactNative", 5, "Crashlytics unavailable, skip RnPage log", th);
        }
        F6.d.h("ReactNative", 3, "onCreate: page:" + this.f27677a + " appName: " + bundle2.getString("appName") + " useNativeLoading:" + this.f27678b);
        StringBuilder sb2 = new StringBuilder("Version: (");
        sb2.append(BaseApplication.get().getCodePushData());
        sb2.append(")");
        Log.e("RN", sb2.toString());
        try {
            if (this.f27684i == null && !this.f27685j) {
                this.f27684i = LayoutInflater.from(this).inflate(L9.b.cm_layout_rn_loading, (ViewGroup) null);
                ViewGroup viewGroup = (ViewGroup) getWindow().getDecorView().getRootView();
                p220oa.h.j(this.f27684i.findViewById(L9.a.titleBar), Integer.valueOf(BarUtils.getStatusBarHeight()), 0, 0, 0);
                if (viewGroup instanceof FrameLayout) {
                    FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(-1, -2);
                    layoutParams2.gravity = 48;
                    layoutParams = layoutParams2;
                } else if (viewGroup instanceof RelativeLayout) {
                    RelativeLayout.LayoutParams layoutParams3 = new RelativeLayout.LayoutParams(-1, -2);
                    layoutParams3.addRule(10);
                    layoutParams = layoutParams3;
                } else if (viewGroup instanceof LinearLayout) {
                    LinearLayout.LayoutParams layoutParams4 = new LinearLayout.LayoutParams(-1, -2);
                    layoutParams4.gravity = 48;
                    layoutParams = layoutParams4;
                } else {
                    layoutParams = new ViewGroup.LayoutParams(-1, -1);
                }
                this.f27684i.setLayoutParams(layoutParams);
                viewGroup.addView(this.f27684i, 0);
                this.f27685j = true;
                e();
                com.transsnet.palmpay.custom_view.dialog.n nVar = new com.transsnet.palmpay.custom_view.dialog.n(this);
                nVar.f31288b = null;
                LoadingDialog loadingDialogA = nVar.a();
                loadingDialogA.show();
                this.f27683g = loadingDialogA;
            }
        } catch (Exception e10) {
            F6.d.c("ReactNative", "showRnLoadingAnimation: fail ", e10);
        }
        this.f27686o = new a0(this, 1);
        if (Boolean.TRUE.equals(this.f27678b)) {
            j6 = 15000;
        } else {
            j6 = BaseApplication.get().isOldAndroidDevice() ? FaceSecCode.SC_SUCCESS : 6000;
        }
        getWindow().getDecorView().postDelayed(this.f27686o, j6);
    }

    @Override // com.facebook.react.ReactActivity, androidx.appcompat.app.AbstractActivityC0837o, androidx.fragment.app.E, android.app.Activity
    public final void onDestroy() {
        try {
            View decorView = getWindow().getDecorView();
            WeakHashMap weakHashMap = androidx.core.view.N.f16168a;
            androidx.core.view.E.n(decorView, null);
            a0 a0Var = this.t;
            if (a0Var != null) {
                decorView.removeCallbacks(a0Var);
                this.t = null;
            }
        } catch (Exception unused) {
        }
        e();
        if (this.f27686o != null) {
            getWindow().getDecorView().removeCallbacks(this.f27686o);
            this.f27686o = null;
        }
        this.f27684i = null;
        org.greenrobot.eventbus.c.b().f(new MessageEvent(MessageEvent.EVENT_RN_ACTIVITY_DESTORYED, this.f27677a));
        org.greenrobot.eventbus.c.b().l(this);
        super.onDestroy();
    }

    @Subscribe(threadMode = ThreadMode.MAIN)
    public void onMessageEvent(MessageEvent messageEvent) {
        if (messageEvent.getEventType() == 518) {
            HashMap map = new HashMap();
            map.put("rn_key_params", (String) messageEvent.getEventObj());
            map.put("rn_key_params_ext", (String) messageEvent.getEventObjExt());
            map.put("rn_key_event_tag", messageEvent.getEventTag());
            N9.b.f6269a.sendEvent(messageEvent.getEventContent(), map);
        }
    }

    @Override // com.facebook.react.ReactActivity, androidx.fragment.app.E, android.app.Activity
    public final void onPause() {
        n0.g().t("onPause_" + this.f27677a);
        try {
            super.onPause();
        } catch (AssertionError | Exception unused) {
        }
    }

    @Override // com.transsnet.palmpay.core.receiver.VagueReceiver$OnKeyListener
    public final void onRecentClick() {
        this.f27679c = r0.e(this.f27679c, this);
    }

    @Override // com.facebook.react.ReactActivity, androidx.fragment.app.E, android.app.Activity
    public final void onResume() {
        n0.g().t("onResume_" + this.f27677a);
        super.onResume();
        h();
        i();
        r0.F1(this.f27679c, this);
    }

    @Override // com.transsnet.palmpay.core.callback.ShowDialogCallback
    public final void showLoadingDialog(boolean z3) {
        if (!z3) {
            e();
            return;
        }
        e();
        com.transsnet.palmpay.custom_view.dialog.n nVar = new com.transsnet.palmpay.custom_view.dialog.n(this);
        nVar.f31288b = null;
        LoadingDialog loadingDialogA = nVar.a();
        loadingDialogA.show();
        this.f27683g = loadingDialogA;
    }
}
