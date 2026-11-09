package com.transsnet.palmpay.core.base;

import C0.G;
import Ce.DialogInterfaceOnDismissListenerC0168j;
import Nc.x;
import Pa.AbstractC0520q;
import Pa.AbstractC0526x;
import Pa.C;
import Pa.C0521s;
import Pa.D;
import Pa.RunnableC0527y;
import Pa.T;
import Pa.i0;
import android.R;
import android.annotation.TargetApi;
import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.LocaleList;
import android.os.Looper;
import android.os.Trace;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.Window;
import android.view.WindowInsetsController;
import android.view.WindowManager;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.ColorRes;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AbstractActivityC0837o;
import androidx.appcompat.app.AbstractC0841t;
import androidx.appcompat.app.I;
import androidx.appcompat.widget.ActionBarContainer;
import androidx.core.app.AbstractC1032a;
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
import androidx.fragment.app.C1161a;
import androidx.fragment.app.DialogFragment;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.Z;
import androidx.viewbinding.ViewBinding;
import com.facebook.react.uimanager.events.PointerEventHelper;
import com.google.android.material.snackbar.Snackbar;
import com.mikepenz.iconics.IconicsDrawable;
import com.palmpay.lib.apm.network.bean.NQEQualityBean;
import com.transsnet.palmpay.core.activityresult.IActivityResult;
import com.transsnet.palmpay.core.bean.message.MessageEvent;
import com.transsnet.palmpay.core.receiver.VagueReceiver$OnKeyListener;
import com.transsnet.palmpay.core.ui.widget.BrowseCountdownView;
import com.transsnet.palmpay.core.util.network.PPNetworkUtils$OnNetworkFailListener;
import com.transsnet.palmpay.core.util.statistic.core.AutoTrackUtil;
import com.transsnet.palmpay.core.util.statistic.core.LogConstants;
import com.transsnet.palmpay.custom_view.dialog.LoadingDialog;
import com.transsnet.palmpay.custom_view.dialog.ToastDialog;
import com.transsnet.palmpay.custom_view.t;
import com.transsnet.palmpay.custom_view.utils.CommonViewExtKt;
import com.transsnet.palmpay.util.ActivityUtils;
import com.transsnet.palmpay.util.AppUtils;
import com.transsnet.palmpay.util.BarUtils;
import com.transsnet.palmpay.util.KeyboardUtils;
import com.transsnet.palmpay.util.PermissionUtils;
import com.transsnet.palmpay.util.SPUtils;
import com.transsnet.palmpay.util.ScreenUtils;
import com.transsnet.palmpay.util.TimeUtils;
import com.transsnet.palmpay.util.ToastUtils;
import face.security.device.api.FaceSecCode;
import io.reactivex.disposables.Disposable;
import java.io.File;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Locale;
import java.util.WeakHashMap;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public abstract class BaseActivity extends AbstractActivityC0837o implements DialogInterface.OnCancelListener, IBaseView, VagueReceiver$OnKeyListener, IActivityResult, PPNetworkUtils$OnNetworkFailListener, OnApplyWindowInsetsListener {
    public static final String ENTER_EVENT = "ENTER";
    protected static final String NAV_BAR_TAG = "nav_bar_bg";
    public static final String NEXT_EVENT = "NEXT";
    private static final int REQUEST_CODE_LOCATION_PERMISSION = 638;
    protected static final String SKIP_EVENT = "SKIP";
    protected static final String STATUS_BAR_BG = "status_bar_bg";
    private boolean bHasLoggedInWhenCreated;
    protected p103gf.a mCompositeDisposable;
    private a mDialogState;
    protected LoadingDialog mLoadingDialog;
    private Boolean mPreLoadingCancelable;
    private String mPreLoadingMsg;
    private p038ca.e mStartActivityLauncher;
    private TextView mTvDebugInfo;
    private View navigationBarView;
    private View statusBarView;
    ImageView vagueImage;
    public final String TAG = getClass().getSimpleName();
    private Activity.ScreenCaptureCallback mScreenCaptureCallback = null;
    private final long LOADING_DIALOG_DELAY_TIME = 100;
    private Handler mHandler = new Handler(Looper.getMainLooper());
    private Runnable mLoadingDismissRunnable = new androidx.customview.widget.e(this, 19);

    private void addBrowseCountdownViewToActivity() {
        Intent intent;
        Bundle bundleExtra;
        if (ActivityUtils.isValidActivityContext(this)) {
            Intent intent2 = getIntent();
            AttributeSet attributeSet = null;
            String stringExtra = intent2 != null ? intent2.getStringExtra("browse_taskContentType") : null;
            Intent intent3 = getIntent();
            int i7 = 0;
            Integer numValueOf = intent3 != null ? Integer.valueOf(intent3.getIntExtra("browse_time", 0)) : null;
            if (TextUtils.isEmpty(stringExtra) && (intent = getIntent()) != null && (bundleExtra = intent.getBundleExtra("rn_key_params")) != null) {
                stringExtra = bundleExtra.getString("browse_taskContentType");
                numValueOf = Integer.valueOf(bundleExtra.getInt("browse_time", 0));
            }
            if ((numValueOf != null ? numValueOf.intValue() : 0) > 0 && stringExtra != null) {
                if (TextUtils.isEmpty(stringExtra)) {
                    stringExtra = null;
                }
                if (stringExtra != null) {
                    View viewFindViewById = getWindow().getDecorView().findViewById(R.id.content);
                    Intrinsics.f(viewFindViewById, "null cannot be cast to non-null type android.view.ViewGroup");
                    BrowseCountdownView browseCountdownView = new BrowseCountdownView(this, attributeSet, 6, i7);
                    FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
                    layoutParams.gravity = 8388693;
                    browseCountdownView.setLayoutParams(layoutParams);
                    p220oa.h.j(browseCountdownView, 0, 0, 0, Integer.valueOf(CommonViewExtKt.getDp(20)));
                    ((ViewGroup) viewFindViewById).addView(browseCountdownView);
                    if ((numValueOf != null ? numValueOf.intValue() : 0) <= 0) {
                        numValueOf = 15;
                    }
                    browseCountdownView.f(numValueOf, stringExtra);
                }
            }
        }
    }

    private void addDebugInfoView() {
    }

    private void addScreenCaptureCallback() {
        if (Build.VERSION.SDK_INT >= 34) {
            try {
                if (this.mScreenCaptureCallback == null) {
                    this.mScreenCaptureCallback = new Activity.ScreenCaptureCallback() { // from class: com.transsnet.palmpay.core.base.b
                        @Override // android.app.Activity.ScreenCaptureCallback
                        public final void onScreenCaptured() {
                            this.f27343a.lambda$addScreenCaptureCallback$6();
                        }
                    };
                    registerScreenCaptureCallback(T.b(-1), this.mScreenCaptureCallback);
                }
            } catch (Exception e10) {
                this.mScreenCaptureCallback = null;
                F6.d.c(this.TAG, "addScreenCaptureCallback: ", e10);
            }
        }
    }

    public static void armIdleGateDefault() {
        if (Looper.myLooper() != Looper.getMainLooper()) {
            new Handler(Looper.getMainLooper()).post(new RunnableC0527y(9));
        } else {
            Looper.myQueue().addIdleHandler(new d(0));
        }
    }

    private void bindDebugScreenshotClick() {
        TextView textView = this.mTvDebugInfo;
        if (textView == null) {
            return;
        }
        textView.setOnClickListener(new C(this, 1));
    }

    public static void checkHardwareAccelerated(Window window) {
        if (window != null && Build.VERSION.SDK_INT == 29) {
            String str = Build.MODEL;
            String str2 = Build.BRAND;
            if ("Infinix".equalsIgnoreCase(str2) && "Infinix X612".equalsIgnoreCase(str)) {
                return;
            }
            if ("Qubo".equalsIgnoreCase(str2)) {
                if ("x626".equalsIgnoreCase(str) || "big1".equalsIgnoreCase(str)) {
                    return;
                }
            } else if ("blackview".equalsIgnoreCase(str2) && "a60".equalsIgnoreCase(str)) {
                return;
            }
            window.clearFlags(PointerEventHelper.X_FLAG_SUPPORTS_HOVER);
            window.addFlags(PointerEventHelper.X_FLAG_SUPPORTS_HOVER);
        }
    }

    private boolean checkLogInStateChange() {
        return this.bHasLoggedInWhenCreated != BaseApplication.hasLogin();
    }

    private boolean hasBottomVirtualNavigationBar() {
        if (Build.VERSION.SDK_INT >= 35) {
            View decorView = getWindow().getDecorView();
            WeakHashMap weakHashMap = N.f16168a;
            q0 q0VarA = F.a(decorView);
            if (q0VarA != null) {
                int i7 = q0VarA.f16277a.g(2).f16061d;
                F6.d.h(this.TAG, 3, G.m(i7, "hasBottomVirtualNavigationBar=== "));
                return i7 > 0;
            }
        }
        return true;
    }

    private void hideKeyboardWhenTouchAround() {
        View decorView = getWindow().getDecorView();
        if (decorView == null) {
            return;
        }
        decorView.setOnTouchListener(new K3.b(2));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void lambda$addScreenCaptureCallback$5() {
        IconicsDrawable iconicsDrawableH = p059e1.a.h(this, S6.a.pay_InformationOutline, null, getColor(L6.b.ppColorTextNormal), 12.0f);
        ToastDialog toastDialog = new ToastDialog(this, t.cv_toast_dialog_v2);
        toastDialog.setMessage("PalmPay has detected that your screen is being recorded. Please ensure your personal information is secured.");
        toastDialog.setTitle((String) null);
        toastDialog.setIcon(0);
        toastDialog.setIcon(iconicsDrawableH);
        toastDialog.setBackground(0);
        toastDialog.show(5000L, 2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$addScreenCaptureCallback$6() {
        this.mHandler.post(new com.transsnet.adsdk.widgets.banner.bannerview.b(this, 2));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$bindDebugScreenshotClick$3(View view) {
        try {
            Class.forName("com.transsnet.palmpay.debug.pagecapture.PageScreenshotCapturer").getMethod("capture", Activity.class).invoke(null, this);
        } catch (Throwable th) {
            F6.d.c(this.TAG, "PageScreenshotCapturer unavailable", th);
            ToastUtils.showShort(getString(p025ba.k.core_debug_page_capture_unavailable));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ boolean lambda$hideKeyboardWhenTouchAround$2(View view, MotionEvent motionEvent) {
        if (motionEvent.getAction() != 0) {
            return false;
        }
        KeyboardUtils.hideSoftInput(view);
        return false;
    }

    private /* synthetic */ Object lambda$onCreate$0(int i7) {
        setContentView(i7);
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$showCommonDialog$4(String str, String str2) {
        C0521s c0521s = C0521s.f7158a;
        C0521s.h(this, str, str2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void loadingDismiss() {
        try {
            LoadingDialog loadingDialog = this.mLoadingDialog;
            if (loadingDialog == null || !loadingDialog.isShowing()) {
                return;
            }
            this.mLoadingDialog.dismiss();
            this.mLoadingDialog.setOnCancelListener(null);
            this.mLoadingDialog = null;
        } catch (Exception unused) {
        }
    }

    private void parseActivityProperties() {
        if (getIntent() != null) {
            Intent intent = getIntent();
            HashMap map = new HashMap();
            String action = intent.getAction();
            if (TextUtils.isEmpty(action)) {
                map.put(LogConstants.Autotrack.INTENT_NAME, intent.getStringExtra(LogConstants.Autotrack.INTENT_NAME));
            } else {
                map.put(LogConstants.Autotrack.INTENT_NAME, action);
            }
            String stringExtra = intent.getStringExtra("extra_msg_type");
            if (!TextUtils.isEmpty(stringExtra)) {
                map.put(LogConstants.Autotrack.ELEMENT_PUSH_MSG_TYPE, stringExtra);
            }
            String stringExtra2 = intent.getStringExtra("extra_push_batch_no");
            if (!TextUtils.isEmpty(stringExtra2)) {
                map.put(LogConstants.Autotrack.ELEMENT_PUSH_BATCH_NO, stringExtra2);
            }
            String stringExtra3 = intent.getStringExtra("adSlotId");
            if (!TextUtils.isEmpty(stringExtra3)) {
                map.put(LogConstants.Autotrack.ELEMENT_EXTRA_AD_SLOT_ID, stringExtra3);
            }
            String stringExtra4 = intent.getStringExtra("extra_push_msg_id");
            if (!TextUtils.isEmpty(stringExtra4)) {
                map.put(LogConstants.Autotrack.ELEMENT_EXTRA_ID, stringExtra4);
            }
            String stringExtra5 = intent.getStringExtra("_source_ad_name");
            if (!TextUtils.isEmpty(stringExtra5)) {
                F6.d.h("BaseActivity", 3, androidx.camera.camera2.internal.F.d(new StringBuilder("Activity = "), this.TAG, "sourceName = ", stringExtra5));
                map.put("_source_ad_name", stringExtra5);
            }
            AutoTrackUtil.trackActivityProperties(this, map);
        }
    }

    private void postDebugInfo() {
    }

    private void removeScreenCaptureCallback() {
        if (Build.VERSION.SDK_INT < 34) {
            return;
        }
        Activity.ScreenCaptureCallback screenCaptureCallback = this.mScreenCaptureCallback;
        this.mScreenCaptureCallback = null;
        if (screenCaptureCallback == null) {
            return;
        }
        try {
            unregisterScreenCaptureCallback(screenCaptureCallback);
        } catch (Exception e10) {
            F6.d.c(this.TAG, "removeScreenCaptureCallback: ", e10);
        }
    }

    private void setLayoutFactory2() {
        getLayoutInflater().setFactory2(new e(this));
    }

    private void setupNavBarColor(int navigationBarColor, ViewGroup decorView) {
        View viewFindViewWithTag = decorView.findViewWithTag(NAV_BAR_TAG);
        if (viewFindViewWithTag != null) {
            this.navigationBarView = viewFindViewWithTag;
            viewFindViewWithTag.setBackgroundColor(navigationBarColor);
        } else {
            View view = new View(this);
            this.navigationBarView = view;
            view.setTag(NAV_BAR_TAG);
            this.navigationBarView.setBackgroundColor(navigationBarColor);
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, 0);
            layoutParams.gravity = 80;
            decorView.addView(this.navigationBarView, layoutParams);
        }
        WeakHashMap weakHashMap = N.f16168a;
        E.n(decorView, this);
    }

    private void setupStatusBarColor(int statusBarColor, ViewGroup decorView) {
        View viewFindViewWithTag = decorView.findViewWithTag(STATUS_BAR_BG);
        if (viewFindViewWithTag != null) {
            this.statusBarView = viewFindViewWithTag;
            viewFindViewWithTag.setBackgroundColor(statusBarColor);
            return;
        }
        View view = new View(this);
        this.statusBarView = view;
        view.setTag(STATUS_BAR_BG);
        this.statusBarView.setBackgroundColor(statusBarColor);
        this.statusBarView.setLayoutParams(new ViewGroup.LayoutParams(-1, 0));
        decorView.addView(this.statusBarView);
    }

    private void unSubscribe() {
        p103gf.a aVar = this.mCompositeDisposable;
        if (aVar != null) {
            aVar.dispose();
            this.mCompositeDisposable = null;
        }
    }

    public void addSubscription(Disposable disposable) {
        if (this.mCompositeDisposable == null) {
            this.mCompositeDisposable = new p103gf.a();
        }
        this.mCompositeDisposable.add(disposable);
    }

    public void applySystemBarAppearance(int statusBarColor, int navigationBarColor, boolean isLightMode) {
        org.chromium.support_lib_boundary.util.b s0Var;
        try {
            Window window = getWindow();
            ViewGroup viewGroup = (ViewGroup) window.getDecorView();
            C1052d c1052d = new C1052d(viewGroup, 4);
            int i7 = Build.VERSION.SDK_INT;
            if (i7 >= 35) {
                s0Var = new v0(window, c1052d);
            } else if (i7 >= 30) {
                s0Var = new u0(window, c1052d);
            } else {
                s0Var = i7 >= 26 ? new s0(window, c1052d) : new r0(window, c1052d);
            }
            s0Var.d0(isLightMode);
            s0Var.c0(isLightMode);
            if (Build.VERSION.SDK_INT >= 35) {
                io.fastkv.n.K(window, false);
            } else {
                window.setDecorFitsSystemWindows(false);
            }
            setupStatusBarColor(statusBarColor, viewGroup);
            setupNavBarColor(navigationBarColor, viewGroup);
            WeakHashMap weakHashMap = N.f16168a;
            E.n(viewGroup, this);
        } catch (Exception e10) {
            F6.d.c(this.TAG, "applySystemBarAppearance failed", e10);
        }
    }

    public void armIdleGate() {
        armIdleGateDefault();
    }

    @Override // androidx.appcompat.app.AbstractActivityC0837o, android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    public void attachBaseContext(Context newBase) {
        String string = p367ya.a.d().f44149a.getString("key_default_language", null);
        StringBuilder sb2 = new StringBuilder("attachBaseContext: api:");
        int i7 = Build.VERSION.SDK_INT;
        sb2.append(i7);
        sb2.append(" countryLocale:");
        sb2.append(string);
        F6.d.h("r0", 3, sb2.toString());
        if (i7 > 24) {
            Resources resources = newBase.getResources();
            Locale locale = Locale.ENGLISH;
            if ("AO".equalsIgnoreCase(string)) {
                locale = new Locale("pt");
            }
            F6.d.h("r0", 3, "getLocaleByCountry: " + locale.getDisplayName());
            Configuration configuration = resources.getConfiguration();
            configuration.setLocale(locale);
            configuration.setLocales(new LocaleList(locale));
            newBase = newBase.createConfigurationContext(configuration);
        }
        super.attachBaseContext(newBase);
    }

    @TargetApi(3)
    public void checkAndShowLoadingDialog(final boolean show, final boolean cancelable, final String message) {
        if (Looper.getMainLooper().getThread() == Thread.currentThread()) {
            lambda$checkAndShowLoadingDialog$1(show, cancelable, message);
        } else {
            runOnUiThread(new Runnable() { // from class: com.transsnet.palmpay.core.base.c
                @Override // java.lang.Runnable
                public final void run() {
                    this.f27344a.lambda$checkAndShowLoadingDialog$1(show, cancelable, message);
                }
            });
        }
    }

    public void checkLocationPermission(int period) {
        if (PermissionUtils.isGranted("android.permission.ACCESS_COARSE_LOCATION") || PermissionUtils.isGranted(com.transsnet.palmpay.core.config.d.j())) {
            return;
        }
        long j6 = p367ya.a.d().f44149a.getLong("key_last_ask_location_permission_time_v2", 0L);
        if (j6 > 0) {
            if (period == 1) {
                return;
            }
            if (period == 2 && TimeUtils.isToday(j6)) {
                return;
            }
        }
        p367ya.a aVarD = p367ya.a.d();
        aVarD.f44149a.g(System.currentTimeMillis(), "key_last_ask_location_permission_time_v2");
        AbstractC1032a.g(this, new String[]{"android.permission.ACCESS_COARSE_LOCATION", com.transsnet.palmpay.core.config.d.j()}, REQUEST_CODE_LOCATION_PERMISSION);
    }

    public void createViewBinding(Bundle savedInstanceState) {
        ViewBinding viewBindingInitViewBinding = initViewBinding(savedInstanceState);
        if (viewBindingInitViewBinding != null) {
            setContentView(viewBindingInitViewBinding.getRoot());
        }
    }

    public void fillDisplayCutOutEdge() {
        View viewFindViewById;
        if (Build.VERSION.SDK_INT < 30 || !ScreenUtils.isWaterFallDisplay()) {
            return;
        }
        View viewFindViewById2 = findViewById(R.id.content);
        if (viewFindViewById2 != null && (viewFindViewById = viewFindViewById2.findViewById(R.id.content)) != null) {
            viewFindViewById.setPadding(0, BarUtils.getStatusBarHeight(), 0, 0);
        }
        ViewParent parent = viewFindViewById2.getParent();
        if (parent instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) parent;
            for (int i7 = 0; i7 < viewGroup.getChildCount(); i7++) {
                View childAt = viewGroup.getChildAt(i7);
                if (childAt instanceof ActionBarContainer) {
                    ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) childAt.getLayoutParams();
                    marginLayoutParams.setMargins(0, marginLayoutParams.topMargin, 0, marginLayoutParams.bottomMargin);
                    childAt.setLayoutParams(marginLayoutParams);
                }
            }
        }
        if (Build.VERSION.SDK_INT >= 35) {
            io.fastkv.n.K(getWindow(), false);
        } else {
            getWindow().setDecorFitsSystemWindows(false);
        }
    }

    public View getContentView() {
        try {
            ViewGroup viewGroup = (ViewGroup) findViewById(R.id.content);
            if (viewGroup == null || viewGroup.getChildCount() <= 0) {
                return null;
            }
            return viewGroup.getChildAt(0);
        } catch (Exception e10) {
            Log.e(this.TAG, "Failed to get ContentView", e10);
            return null;
        }
    }

    public a getDialogState() {
        if (this.mDialogState == null) {
            a aVar = new a();
            aVar.f27341b = new WeakReference(this);
            this.mDialogState = aVar;
        }
        return this.mDialogState;
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public File getFilesDir() {
        return getApplication().getFilesDir();
    }

    public abstract int getLayoutId();

    public int getNetworkCheckAvailable() {
        return 0;
    }

    public String getQueryParameter(String key) {
        Uri data;
        Intent intent = getIntent();
        if (intent == null || TextUtils.isEmpty(key)) {
            return null;
        }
        String stringExtra = getIntent().getStringExtra(key);
        return (!TextUtils.isEmpty(stringExtra) || (data = intent.getData()) == null) ? stringExtra : data.getQueryParameter(key);
    }

    @Override // com.transsnet.palmpay.core.activityresult.IActivityResult
    @Nullable
    /* JADX INFO: renamed from: getStartActivityLauncher */
    public p038ca.e getF28604i() {
        return this.mStartActivityLauncher;
    }

    public String getStartActivityLauncherKey() {
        return null;
    }

    public Handler getUIHandler() {
        if (this.mHandler == null) {
            this.mHandler = new Handler(Looper.getMainLooper());
        }
        return this.mHandler;
    }

    public void goBackToHome() {
        Activity activityIsActivityExistsInStack = ActivityUtils.isActivityExistsInStack("com.transsnet.palmpay.ui.activity.HomeActivity");
        if (activityIsActivityExistsInStack == null) {
            showLoadingDialog(true);
            com.palmpay.lib.apm.launchcounter.util.d.F("/main/home");
        } else if (checkLogInStateChange()) {
            ActivityUtils.finishToActivity(activityIsActivityExistsInStack, false);
        } else {
            finish();
        }
    }

    public void hideSoftInput() {
        InputMethodManager inputMethodManager = (InputMethodManager) getSystemService("input_method");
        View decorView = getWindow().getDecorView();
        if (inputMethodManager == null || decorView == null) {
            return;
        }
        inputMethodManager.hideSoftInputFromWindow(decorView.getWindowToken(), 0);
    }

    public abstract void initData();

    public void initStatusBar() {
        initStatusBar(false);
    }

    public ViewBinding initViewBinding(Bundle savedInstanceState) {
        return null;
    }

    public boolean isDarkMode() {
        if (!isForceNoNightMode()) {
            if (Pa.r0.V0()) {
                return Pa.r0.J0(getResources()) == 32;
            }
            if (Pa.r0.Z0()) {
                return true;
            }
        }
        return false;
    }

    @Override // android.app.Activity
    public boolean isDestroyed() {
        return super.isDestroyed();
    }

    public boolean isForceNoNightMode() {
        return true;
    }

    public boolean isMainBusiness() {
        return false;
    }

    @Override // androidx.core.view.OnApplyWindowInsetsListener
    @NonNull
    public q0 onApplyWindowInsets(@NonNull View v3, @NonNull q0 insets) {
        View contentView;
        int i7 = insets.f16277a.g(1).f16059b;
        View view = this.statusBarView;
        if (view != null) {
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            layoutParams.height = i7;
            this.statusBarView.setLayoutParams(layoutParams);
        }
        int i10 = insets.f16277a.g(2).f16061d;
        if (this.navigationBarView != null) {
            if (i10 <= 0 || !hasBottomVirtualNavigationBar()) {
                this.navigationBarView.setVisibility(8);
            } else {
                ViewGroup.LayoutParams layoutParams2 = this.navigationBarView.getLayoutParams();
                layoutParams2.height = i10;
                this.navigationBarView.setLayoutParams(layoutParams2);
                this.navigationBarView.setVisibility(0);
            }
        }
        try {
            if (!getWindow().getDecorView().getFitsSystemWindows() && (contentView = getContentView()) != null) {
                p220oa.h.j(contentView, null, null, null, Integer.valueOf(Math.max(i10, 0)));
            }
        } catch (Exception unused) {
        }
        return insets;
    }

    @Override // androidx.activity.AbstractActivityC0822m, android.app.Activity
    public void onBackPressed() {
        if (i0.W(this)) {
            if (shouldNavigateHomeOnBack()) {
                goBackToHome();
            } else {
                getOnBackPressedDispatcher().d();
            }
        }
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public void onCancel(DialogInterface dialog) {
        unSubscribe();
    }

    @Override // androidx.fragment.app.E, androidx.activity.AbstractActivityC0822m, androidx.core.app.AbstractActivityC1040i, android.app.Activity
    public void onCreate(@Nullable Bundle savedInstanceState) {
        Ea.a.a(getApplicationContext());
        try {
            if (AbstractC0520q.f7143i && AbstractC0520q.f7138d == 28) {
                AbstractC0841t.k(1);
            } else if (Pa.r0.T0()) {
                int i7 = ((I) getDelegate()).f12122I0;
                int iL0 = Pa.r0.l0(this);
                if (i7 != iL0) {
                    getDelegate().l(iL0);
                }
            } else {
                getDelegate().l(1);
            }
        } catch (Exception unused) {
            AbstractC0841t.k(1);
        }
        super.onCreate(savedInstanceState);
        if (TextUtils.isEmpty(getStartActivityLauncherKey())) {
            this.mStartActivityLauncher = new p038ca.e(this, null, null);
        } else {
            this.mStartActivityLauncher = new p038ca.e(this, getActivityResultRegistry(), getStartActivityLauncherKey());
        }
        this.bHasLoggedInWhenCreated = BaseApplication.hasLogin();
        setRequestedOrientation(1);
        checkHardwareAccelerated(getWindow());
        if (Build.VERSION.SDK_INT >= 30) {
            WindowManager.LayoutParams attributes = getWindow().getAttributes();
            attributes.layoutInDisplayCutoutMode = 3;
            getWindow().setAttributes(attributes);
        }
        int layoutId = getLayoutId();
        if (layoutId != 0) {
            try {
                Trace.beginSection("setContentView");
                try {
                    lambda$onCreate$0(layoutId);
                    Trace.endSection();
                } catch (Throwable th) {
                    Trace.endSection();
                    throw th;
                }
            } catch (Exception e10) {
                e10.printStackTrace();
                if (e10.getMessage() == null || !e10.getMessage().toLowerCase(Locale.ROOT).contains("webview")) {
                    throw new RuntimeException(e10.getMessage());
                }
                ToastUtils.showLong(e10.getMessage());
                finish();
                return;
            }
        } else {
            createViewBinding(savedInstanceState);
        }
        parseActivityProperties();
        hideKeyboardWhenTouchAround();
        initStatusBar();
        setupView();
        initData();
        processLogic(savedInstanceState);
        addBrowseCountdownViewToActivity();
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
        LoadingDialog.releaseContentOverlay(this);
        a aVar = this.mDialogState;
        if (aVar != null) {
            WeakReference weakReference = aVar.f27340a;
            Dialog dialog = weakReference != null ? (Dialog) weakReference.get() : null;
            if (dialog != null) {
                try {
                    dialog.dismiss();
                } catch (Exception e10) {
                    F6.d.c("ActivityDialogState", "dismissDialog: ", e10);
                }
            }
        }
        this.mHandler.removeCallbacksAndMessages(null);
        this.mHandler.removeCallbacks(this.mLoadingDismissRunnable);
        super.onDestroy();
        unSubscribe();
    }

    @Override // com.transsnet.palmpay.core.util.network.PPNetworkUtils$OnNetworkFailListener
    public void onNetworkFail(String code) {
    }

    public void onNetworkStateChanged(int preNetworkQualityType, int networkQualityType, NQEQualityBean nqeQuality) {
        if (networkQualityType == 1 || networkQualityType == 2) {
            int networkCheckAvailable = getNetworkCheckAvailable();
            Intrinsics.checkNotNullParameter(this, "activity");
            if (networkCheckAvailable != 0 && AppUtils.isAppForeground() && i0.W(this)) {
                boolean zC = p059e1.a.C("nqe_sp_nqe_tips_enable", false);
                if (networkQualityType != 2 || zC) {
                    boolean zIsToday = TimeUtils.isToday(SPUtils.getInstance().getLong("key_network_dialog_showed", 0L));
                    if ((networkCheckAvailable & 2) != 0 && !zIsToday) {
                        SPUtils.getInstance().put("key_network_dialog_showed", System.currentTimeMillis());
                        D.f7011a = true;
                        String str = networkQualityType == 2 ? "Network Instability" : "No Network Connection";
                        String str2 = networkQualityType == 2 ? "You can choose the following ways to improve network quality." : "Please check your network settings or dialing #861* to enjoy PalmPay Services with no Data.";
                        int i7 = networkQualityType == 2 ? p025ba.d.core_bad_network : p025ba.d.core_no_network;
                        O6.c cVar = new O6.c(this);
                        cVar.f6607m = i7;
                        cVar.f6596b = O6.d.f(str);
                        cVar.f6598d = str2;
                        C c6 = new C(this, 0);
                        cVar.f6601g = "Settings";
                        cVar.f6603i = c6;
                        K8.a aVar = new K8.a(16);
                        cVar.f6600f = "Dial *861#";
                        cVar.f6602h = aVar;
                        O6.d dVarA = cVar.a();
                        dVarA.setOnDismissListener(new DialogInterfaceOnDismissListenerC0168j(3));
                        dVarA.setCanceledOnTouchOutside(false);
                        dVarA.show();
                        return;
                    }
                    if ((1 & networkCheckAvailable) == 0 || D.f7011a || networkQualityType == 2) {
                        return;
                    }
                    long jCurrentTimeMillis = D.f7012b == 0 ? 60000L : System.currentTimeMillis() - D.f7012b;
                    if (jCurrentTimeMillis < 0) {
                        D.f7012b = System.currentTimeMillis();
                    }
                    if (jCurrentTimeMillis < 60000) {
                        return;
                    }
                    D.f7012b = System.currentTimeMillis();
                    ViewGroup viewGroup = (ViewGroup) getWindow().getDecorView().findViewById(R.id.content);
                    if (viewGroup == null) {
                        return;
                    }
                    Snackbar snackbarMake = Snackbar.make(viewGroup, "", 0);
                    Intrinsics.checkNotNullExpressionValue(snackbarMake, "make(...)");
                    snackbarMake.setDuration(FaceSecCode.SC_SUCCESS);
                    View view = snackbarMake.getView();
                    Intrinsics.f(view, "null cannot be cast to non-null type android.widget.FrameLayout");
                    FrameLayout frameLayout = (FrameLayout) view;
                    frameLayout.setBackgroundResource(com.transsnet.palmpay.custom_view.p.transparent);
                    View viewInflate = getLayoutInflater().inflate(p025ba.g.core_network_toast_dialog, (ViewGroup) null);
                    frameLayout.addView(viewInflate);
                    ((TextView) frameLayout.findViewById(com.google.android.material.R.id.snackbar_text)).setVisibility(4);
                    View viewFindViewById = viewInflate.findViewById(p025ba.e.tips_msg);
                    Intrinsics.checkNotNullExpressionValue(viewFindViewById, "findViewById(...)");
                    TextView textView = (TextView) viewFindViewById;
                    View viewFindViewById2 = viewInflate.findViewById(p025ba.e.ivClose);
                    Intrinsics.checkNotNullExpressionValue(viewFindViewById2, "findViewById(...)");
                    View viewFindViewById3 = viewInflate.findViewById(p025ba.e.btnDial);
                    Intrinsics.checkNotNullExpressionValue(viewFindViewById3, "findViewById(...)");
                    if (TextUtils.isEmpty("Network is not available, please check.Dial *861# to enjoy PalmPay with no data.")) {
                        textView.setVisibility(8);
                    } else {
                        textView.setVisibility(0);
                        textView.setText("Network is not available, please check.Dial *861# to enjoy PalmPay with no data.");
                    }
                    viewFindViewById3.setOnClickListener(new K8.a(17));
                    viewFindViewById2.setOnClickListener(new x(snackbarMake, 12));
                    frameLayout.setClickable(false);
                    frameLayout.setFocusable(false);
                    frameLayout.setDescendantFocusability(393216);
                    frameLayout.setOnTouchListener(new K3.b(1));
                    snackbarMake.show();
                }
            }
        }
    }

    @Override // android.app.Activity
    public boolean onOptionsItemSelected(MenuItem item) {
        if (item.getItemId() != 16908332) {
            return super.onOptionsItemSelected(item);
        }
        getOnBackPressedDispatcher().d();
        return true;
    }

    @Override // androidx.fragment.app.E, android.app.Activity
    public void onPause() {
        removeScreenCaptureCallback();
        super.onPause();
    }

    @Override // androidx.appcompat.app.AbstractActivityC0837o, androidx.fragment.app.E, android.app.Activity
    public void onPostResume() {
        super.onPostResume();
        BaseApplication.getInstance().lateInit(this);
    }

    @Override // com.transsnet.palmpay.core.receiver.VagueReceiver$OnKeyListener
    public void onRecentClick() {
        F6.d.h("vague reason", 3, "onRecentClick refresh");
        this.vagueImage = Pa.r0.e(this.vagueImage, this);
    }

    @Override // androidx.fragment.app.E, androidx.activity.AbstractActivityC0822m, android.app.Activity, androidx.core.app.ActivityCompat$OnRequestPermissionsResultCallback
    public void onRequestPermissionsResult(int requestCode, @NonNull String[] permissions, @NonNull int[] grantResults) {
        super.onRequestPermissionsResult(requestCode, permissions, grantResults);
        if (requestCode == REQUEST_CODE_LOCATION_PERMISSION) {
            for (int i7 = 0; i7 < grantResults.length; i7++) {
                F6.d.h(this.TAG, 3, "onRequestPermissionsResult: " + permissions[i7] + " " + grantResults[i7]);
            }
            if (PermissionUtils.isGranted("android.permission.ACCESS_COARSE_LOCATION") || PermissionUtils.isGranted(com.transsnet.palmpay.core.config.d.j())) {
                G.u(MessageEvent.EVENT_REFRESH_LOCATION, org.greenrobot.eventbus.c.b());
            }
        }
    }

    @Override // androidx.fragment.app.E, android.app.Activity
    public void onResume() {
        postDebugInfo();
        Pa.r0.F1(this.vagueImage, this);
        Pa.r0.G1(this);
        super.onResume();
        addScreenCaptureCallback();
    }

    @Override // androidx.appcompat.app.AbstractActivityC0837o, androidx.fragment.app.E, android.app.Activity
    public void onStart() throws IllegalAccessException {
        super.onStart();
    }

    @Override // androidx.appcompat.app.AbstractActivityC0837o, androidx.fragment.app.E, android.app.Activity
    public void onStop() {
        super.onStop();
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public void onWindowFocusChanged(boolean hasFocus) {
        String stringExtra;
        WeakReference weakReference;
        Activity activity;
        super.onWindowFocusChanged(hasFocus);
        if (hasFocus) {
            ConcurrentHashMap concurrentHashMap = AbstractC0526x.f7167a;
            Intrinsics.checkNotNullParameter(this, "newActivity");
            Intrinsics.checkNotNullParameter(this, "newActivity");
            Intent intent = getIntent();
            if (intent == null || (stringExtra = intent.getStringExtra("pp_launch_finish_token")) == null) {
                return;
            }
            intent.removeExtra("pp_launch_finish_token");
            if (TextUtils.isEmpty(stringExtra) || (weakReference = (WeakReference) AbstractC0526x.f7167a.remove(stringExtra)) == null || (activity = (Activity) weakReference.get()) == null || activity.isFinishing() || activity.isDestroyed()) {
                return;
            }
            activity.finish();
            p220oa.h.a(activity, 0, 0);
        }
    }

    public abstract void processLogic(@Nullable Bundle savedInstanceState);

    public void requestLayoutFullScreen() {
        View decorView = getWindow().getDecorView();
        if (decorView != null) {
            decorView.setSystemUiVisibility(decorView.getSystemUiVisibility() | 1024);
        }
    }

    public void sendOverlayDebugInfo(CharSequence debug) {
    }

    public void setNavigationBarColor(int color) {
        int i7 = Build.VERSION.SDK_INT;
        if (i7 >= 35) {
            return;
        }
        boolean z3 = 1.0d - (((((double) Color.blue(color)) * 0.114d) + ((((double) Color.green(color)) * 0.587d) + (((double) Color.red(color)) * 0.299d))) / 255.0d) >= 0.5d;
        Window window = getWindow();
        if (window != null) {
            window.setNavigationBarColor(color);
            if (i7 < 30) {
                if (i7 >= 26) {
                    View decorView = window.getDecorView();
                    int systemUiVisibility = decorView.getSystemUiVisibility();
                    decorView.setSystemUiVisibility(z3 ? systemUiVisibility & (-17) : systemUiVisibility | 16);
                    return;
                }
                return;
            }
            WindowInsetsController insetsController = window.getInsetsController();
            if (insetsController != null) {
                if (z3) {
                    insetsController.setSystemBarsAppearance(0, 16);
                } else {
                    insetsController.setSystemBarsAppearance(16, 16);
                }
            }
        }
    }

    @Override // android.app.Activity
    public void setRequestedOrientation(int requestedOrientation) {
        if (Build.VERSION.SDK_INT == 26) {
            super.setRequestedOrientation(-1);
        } else {
            super.setRequestedOrientation(requestedOrientation);
        }
    }

    public void setWindowBackground(@ColorRes int colorId) {
        getWindow().setBackgroundDrawable(new ColorDrawable(getColor(colorId)));
    }

    public abstract void setupView();

    public boolean shouldNavigateHomeOnBack() {
        return !TextUtils.equals(getClass().getName(), "com.transsnet.palmpay.ui.activity.HomeActivity") && ActivityUtils.getTopActivity() == this && isTaskRoot();
    }

    public void showCommonDialog(String url, String body) {
        if (TextUtils.isEmpty(body) || TextUtils.isEmpty(url) || !i0.W(this)) {
            return;
        }
        runOnUiThread(new androidx.emoji2.text.j(this, 18, url, body));
    }

    public void showDialog(Dialog dialog, int priority) {
        boolean zW;
        a dialogState = getDialogState();
        WeakReference weakReference = dialogState.f27341b;
        BaseActivity baseActivity = weakReference != null ? (BaseActivity) weakReference.get() : null;
        if (dialog != null) {
            boolean z3 = false;
            if (baseActivity == null) {
                zW = false;
            } else {
                try {
                    zW = i0.W(baseActivity);
                } catch (Exception unused) {
                    zW = false;
                }
            }
            if (zW) {
                WeakReference weakReference2 = dialogState.f27340a;
                if ((weakReference2 != null ? (Dialog) weakReference2.get() : null) == null) {
                    if (!dialog.isShowing()) {
                        try {
                            dialog.show();
                        } catch (Exception e10) {
                            F6.d.c("ActivityDialogState", "showDialog: ", e10);
                        }
                    }
                    z3 = true;
                } else {
                    WeakReference weakReference3 = dialogState.f27340a;
                    boolean zIsShowing = (weakReference3 != null ? (Dialog) weakReference3.get() : null).isShowing();
                    if (priority > dialogState.f27342c || !zIsShowing) {
                        if (zIsShowing) {
                            WeakReference weakReference4 = dialogState.f27340a;
                            Dialog dialog2 = weakReference4 != null ? (Dialog) weakReference4.get() : null;
                            if (dialog2 != null) {
                                try {
                                    dialog2.dismiss();
                                } catch (Exception e11) {
                                    F6.d.c("ActivityDialogState", "dismissDialog: ", e11);
                                }
                            }
                        }
                        if (!dialog.isShowing()) {
                            try {
                                dialog.show();
                            } catch (Exception e12) {
                                F6.d.c("ActivityDialogState", "showDialog: ", e12);
                            }
                        }
                        z3 = true;
                    }
                }
                if (z3) {
                    dialogState.f27340a = new WeakReference(dialog);
                    dialogState.f27342c = priority;
                }
            }
        }
    }

    public DialogFragment showDialogFragment(DialogFragment dialog) {
        Z supportFragmentManager = getSupportFragmentManager();
        C1161a c1161aE = N8.q0.e(supportFragmentManager, supportFragmentManager);
        Fragment fragmentE = supportFragmentManager.E("dialog");
        if (fragmentE != null) {
            c1161aE.m(fragmentE);
        }
        c1161aE.d(0, dialog, "dialog", 1);
        c1161aE.h(true);
        return dialog;
    }

    public void showErrorMessageDialog(String errorMsg, String button1, String button2) {
        O6.c cVar = new O6.c(this);
        cVar.e(p025ba.k.core_title_error_info);
        cVar.f6598d = errorMsg;
        if (!TextUtils.isEmpty(button1)) {
            cVar.f6600f = button1;
            cVar.f6602h = null;
        }
        if (!TextUtils.isEmpty(button2)) {
            cVar.f6601g = button2;
            cVar.f6603i = null;
        }
        cVar.g();
    }

    public void showLoadingDialog(boolean show) {
        showLoadingDialog(show, "");
    }

    public void showLoadingView(boolean z3) {
        showLoadingDialog(z3);
    }

    public void showSoftInput(final EditText editText) {
        InputMethodManager inputMethodManager = (InputMethodManager) getSystemService("input_method");
        View decorView = getWindow().getDecorView();
        if (inputMethodManager == null || decorView == null) {
            return;
        }
        editText.requestFocus();
        decorView.postDelayed(new androidx.core.provider.m(10, inputMethodManager, editText), 250L);
    }

    public void initStatusBar(boolean transparent) {
        initStatusBar(transparent ? 0 : getColor(L6.b.ppColorBackgroundLight));
    }

    public void showLoadingDialog(boolean show, String message) {
        checkAndShowLoadingDialog(show, true, message);
    }

    @Override // com.transsnet.palmpay.core.base.IBaseView
    public void showLoadingDialog(boolean show, boolean cancelable) {
        checkAndShowLoadingDialog(show, cancelable, "");
    }

    /* JADX INFO: renamed from: showLoadingDialog, reason: merged with bridge method [inline-methods] */
    public void lambda$checkAndShowLoadingDialog$1(boolean show, boolean cancelable, String message) {
        if (i0.W(this)) {
            if (show) {
                Handler handler = this.mHandler;
                if (handler != null) {
                    handler.removeCallbacks(this.mLoadingDismissRunnable);
                }
                LoadingDialog loadingDialog = this.mLoadingDialog;
                if (loadingDialog != null && loadingDialog.isShowing()) {
                    Boolean bool = this.mPreLoadingCancelable;
                    if ((bool == null || cancelable == bool.booleanValue()) && message.equals(this.mPreLoadingMsg)) {
                        return;
                    }
                    this.mLoadingDialog.dismiss();
                    this.mLoadingDialog = null;
                }
                com.transsnet.palmpay.custom_view.dialog.n nVar = new com.transsnet.palmpay.custom_view.dialog.n(this);
                nVar.f31288b = message;
                LoadingDialog loadingDialogA = nVar.a();
                loadingDialogA.show();
                this.mLoadingDialog = loadingDialogA;
                loadingDialogA.setCanceledOnTouchOutside(false);
                this.mLoadingDialog.setCancelable(cancelable);
                this.mLoadingDialog.setOnCancelListener(this);
                this.mPreLoadingCancelable = Boolean.valueOf(cancelable);
                this.mPreLoadingMsg = message;
                return;
            }
            if (this.mHandler == null) {
                this.mHandler = new Handler(Looper.getMainLooper());
            }
            this.mHandler.postDelayed(this.mLoadingDismissRunnable, 100L);
        }
    }

    public void initStatusBar(int color, int navigationBarColor) {
        initStatusBar(color, navigationBarColor, color == -1 || getColor(L6.b.ppColorBackgroundDark) == color);
    }

    public void initStatusBar(int color) {
        initStatusBar(color, color == -1 || getColor(L6.b.ppColorBackgroundDark) == color);
    }

    public void showErrorMessageDialog(String title, String errorMsg, String button1, String button2, View.OnClickListener listener1, View.OnClickListener listener2) {
        O6.c cVar = new O6.c(this);
        cVar.f6596b = O6.d.f(title);
        cVar.f6598d = errorMsg;
        if (!TextUtils.isEmpty(button1)) {
            cVar.f6600f = button1;
            cVar.f6602h = listener1;
        }
        if (!TextUtils.isEmpty(button2)) {
            cVar.f6601g = button2;
            cVar.f6603i = listener2;
        }
        cVar.g();
    }

    public void initStatusBar(int color, boolean isLightMode) {
        initStatusBar(color, color, isLightMode);
    }

    private void initStatusBar(int color, int navigationBarColor, boolean isLightMode) {
        Window window = getWindow();
        window.addFlags(Integer.MIN_VALUE);
        if (Build.VERSION.SDK_INT >= 35) {
            applySystemBarAppearance(color, navigationBarColor, isLightMode);
        } else {
            window.setStatusBarColor(color);
            BarUtils.setStatusBarLightMode(this, isLightMode);
        }
    }

    public void showErrorMessageDialog(String errorMsg, String button) {
        showErrorMessageDialog(errorMsg, button, (String) null);
    }

    public void showErrorMessageDialog(String errorMsg, String button, View.OnClickListener listener) {
        O6.c cVar = new O6.c(this);
        cVar.e(p025ba.k.core_opps);
        cVar.f6598d = errorMsg;
        cVar.f6600f = button;
        cVar.f6602h = listener;
        cVar.g();
    }

    public void showErrorMessageDialog(String title, String errorMsg, String button, View.OnClickListener listener) {
        O6.c cVar = new O6.c(this);
        cVar.f6596b = O6.d.f(title);
        cVar.f6598d = errorMsg;
        cVar.f6600f = button;
        cVar.f6602h = listener;
        cVar.g();
    }

    public void showErrorMessageDialog(String errorMsg) {
        showErrorMessageDialog(errorMsg, getResources().getString(p025ba.k.core_confirm));
    }
}
