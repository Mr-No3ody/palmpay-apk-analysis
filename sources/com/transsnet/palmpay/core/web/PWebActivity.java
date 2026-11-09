package com.transsnet.palmpay.core.web;

import C9.C0142i;
import M7.s;
import Pa.C0505b;
import Pa.C0525w;
import Pa.i0;
import Pa.n0;
import Pa.r0;
import Va.b;
import Va.c;
import Va.d;
import Va.g;
import Va.m;
import Va.p;
import Wf.AbstractC0777v;
import Wf.AbstractC0780y;
import android.app.Application;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.media.AudioDeviceInfo;
import android.media.AudioManager;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.view.ViewTreeObserver;
import android.view.Window;
import android.view.WindowInsetsController;
import android.webkit.ValueCallback;
import android.webkit.WebChromeClient;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.fragment.app.E;
import androidx.webkit.internal.o;
import androidx.webkit.j;
import androidx.webkit.k;
import com.alibaba.android.arouter.facade.annotation.Route;
import com.alibaba.android.arouter.launcher.ARouter;
import com.google.android.gms.location.DeviceOrientationRequest;
import com.google.firebase.crashlytics.internal.metadata.UserMetadata;
import com.luck.picture.lib.config.PictureMimeType;
import com.palmpay.lib.apm.network.NQEManager;
import com.palmpay.lib.ui.titlebar.PpTitleBar;
import com.palmpay.lib.webview.R;
import com.palmpay.lib.webview.cache.WebCache;
import com.palmpay.lib.webview.container.PPWebActivity;
import com.palmpay.lib.webview.container.PPWebView;
import com.palmpay.lib.webview.container.PPWebViewClient;
import com.palmpay.lib.webview.container.WebViewConfig;
import com.transsnet.palmpay.common.export.view.NetworkNotConnectView;
import com.transsnet.palmpay.core.activityresult.IActivityPermissionResult;
import com.transsnet.palmpay.core.activityresult.IActivityResult;
import com.transsnet.palmpay.core.base.BaseApplication;
import com.transsnet.palmpay.core.bean.OrderInfoForCustomerService;
import com.transsnet.palmpay.core.bean.message.MessageEvent;
import com.transsnet.palmpay.core.callback.ShowDialogCallback;
import com.transsnet.palmpay.core.receiver.VagueReceiver$OnKeyListener;
import com.transsnet.palmpay.core.rnbridge.bridge.AudioChannelBridge;
import com.transsnet.palmpay.core.util.statistic.core.AutoTrackUtil;
import com.transsnet.palmpay.core.util.statistic.core.LogConstants;
import com.transsnet.palmpay.core.web.PWebActivity;
import com.transsnet.palmpay.custom_view.dialog.LoadingDialog;
import com.transsnet.palmpay.custom_view.dialog.n;
import com.transsnet.palmpay.util.ActivityUtils;
import com.transsnet.palmpay.util.BarUtils;
import com.transsnet.palmpay.util.PhoneUtils;
import com.transsnet.palmpay.util.UrlCoderUtil;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.WeakHashMap;
import java.util.concurrent.Executor;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.collections.G;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.Regex;
import kotlin.text.StringsKt;
import kotlin.text.y;
import org.greenrobot.eventbus.Subscribe;
import org.greenrobot.eventbus.ThreadMode;
import org.jetbrains.annotations.NotNull;
import p038ca.e;
import p220oa.h;

/* JADX INFO: loaded from: classes3.dex */
@Route(path = "/common/webview")
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\b\u0017\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u00042\u00020\u0005:\u0001\rB\u0007¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\bH\u0007¢\u0006\u0004\b\u000b\u0010\f¨\u0006\u000e"}, d2 = {"Lcom/transsnet/palmpay/core/web/PWebActivity;", "Lcom/palmpay/lib/webview/container/PPWebActivity;", "Lcom/transsnet/palmpay/core/receiver/VagueReceiver$OnKeyListener;", "Lcom/transsnet/palmpay/core/activityresult/IActivityResult;", "Lcom/transsnet/palmpay/core/activityresult/IActivityPermissionResult;", "Lcom/transsnet/palmpay/core/callback/ShowDialogCallback;", "<init>", "()V", "Lcom/transsnet/palmpay/core/bean/message/MessageEvent;", "event", "", "onMessageEvent", "(Lcom/transsnet/palmpay/core/bean/message/MessageEvent;)V", "a", "module_common_impl_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nPWebActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PWebActivity.kt\ncom/transsnet/palmpay/core/web/PWebActivity\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,726:1\n1#2:727\n*E\n"})
public class PWebActivity extends PPWebActivity implements VagueReceiver$OnKeyListener, IActivityResult, IActivityPermissionResult, ShowDialogCallback {

    /* JADX INFO: renamed from: L, reason: collision with root package name */
    public static boolean f28592L;

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public AudioManager f28593A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public b f28594B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public d f28595C;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    public long f28596H;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f28597a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f28598b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f28599c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public WebJsCallback f28600d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public JsInterface f28601e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public LoadingDialog f28602f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public ImageView f28603g;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final e f28604i = new e(this, null, null);

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final p038ca.d f28605j = new p038ca.d(this);

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public NetworkNotConnectView f28606o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public PPWebView f28607p;
    public s t;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public View f28608v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public m f28609w;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    static {
        new a(null);
        new Regex("^((25[0-5]|2[0-4]\\d|1\\d\\d|[1-9]?\\d)\\.){3}(25[0-5]|2[0-4]\\d|1\\d\\d|[1-9]?\\d)$");
    }

    public static final String l(PWebActivity pWebActivity) {
        AudioManager audioManager = pWebActivity.f28593A;
        if (audioManager == null) {
            return AudioChannelBridge.CHANNEL_RECEIVER;
        }
        if (audioManager.isBluetoothScoOn()) {
            return AudioChannelBridge.CHANNEL_BLUETOOTH;
        }
        if (audioManager.isWiredHeadsetOn()) {
            return AudioChannelBridge.CHANNEL_HEADSET;
        }
        return audioManager.isSpeakerphoneOn() ? AudioChannelBridge.CHANNEL_SPEAKER : AudioChannelBridge.CHANNEL_RECEIVER;
    }

    /* JADX WARN: Code duplicated, block: B:46:0x00fe  */
    @Override // com.palmpay.lib.webview.container.PPWebActivity
    public final void configWebView(WebViewConfig.Builder builder) {
        String mUrl;
        ImageView rightImageView1;
        ImageView leftImageView;
        ImageView backImageView;
        long j6;
        ImageView leftImageView2;
        ImageView rightImageView2;
        ImageView rightImageView3;
        ViewTreeObserver viewTreeObserver;
        Intrinsics.checkNotNullParameter(builder, "builder");
        String mUrl2 = getMUrl();
        if (mUrl2 != null && !r0.Y0(mUrl2)) {
            i0.c0(mUrl2);
            finish();
        }
        String mUrl3 = getMUrl();
        if (mUrl3 != null) {
            StringsKt.F(mUrl3);
        }
        C0505b.b(this);
        Intent intent = getIntent();
        OrderInfoForCustomerService orderInfoForCustomerService = intent != null ? (OrderInfoForCustomerService) intent.getParcelableExtra("extra_data") : null;
        PPWebView pPWebView = new PPWebView(this);
        this.f28607p = pPWebView;
        WebSettings settings = pPWebView.getSettings();
        if (settings != null) {
            settings.setTextZoom(100);
        }
        builder.setCustomWebView(this.f28607p);
        String mUrl4 = getMUrl();
        Intrinsics.checkNotNullParameter("sDark", "key");
        boolean zEqualsIgnoreCase = false;
        if (((TextUtils.isEmpty(mUrl4) || !(mUrl4 == null || StringsKt.A(mUrl4, "sDark", false))) ? false : "true".equalsIgnoreCase(Uri.parse(mUrl4).getQueryParameter("sDark"))) && i0.T()) {
            this.f28597a = true;
        }
        n nVar = new n(this);
        nVar.f31289c = this.f28597a;
        this.f28602f = nVar.a();
        JsInterface jsInterface = new JsInterface(this, this.f28607p);
        this.f28601e = jsInterface;
        jsInterface.f28591e = getMUrl();
        WebJsCallback webJsCallback = new WebJsCallback(this, this.f28607p, orderInfoForCustomerService);
        this.f28600d = webJsCallback;
        webJsCallback.f28620p = this.f28604i;
        JsInterface jsInterface2 = this.f28601e;
        if (jsInterface2 != null) {
            jsInterface2.f28587a = webJsCallback;
        }
        if (jsInterface2 != null) {
            jsInterface2.f28590d = webJsCallback;
        }
        builder.addJavascriptInterface("palmpay", jsInterface2);
        builder.addExtraHeaders("PP_DEVICE_ID", PhoneUtils.getUniqueId());
        HashMap map = new HashMap();
        String mUrl5 = getMUrl();
        if (mUrl5 == null) {
            mUrl5 = "";
        }
        map.put(LogConstants.Autotrack.ELEMENT_URL, mUrl5);
        String mUrl6 = getMUrl();
        if (mUrl6 != null) {
            Intrinsics.checkNotNullExpressionValue("https://h5.palmpay.app", "getBaseH5Url(...)");
            if (y.m(mUrl6, "https://h5.palmpay.app", false)) {
                String mUrl7 = getMUrl();
                if (mUrl7 != null) {
                    mUrl = mUrl7.substring(22);
                    Intrinsics.checkNotNullExpressionValue(mUrl, "substring(...)");
                } else {
                    mUrl = null;
                }
            } else {
                mUrl = getMUrl();
            }
        } else {
            mUrl = getMUrl();
        }
        map.put(LogConstants.Autotrack.ELEMENT_SHORT_URL, mUrl != null ? mUrl : "");
        AutoTrackUtil.trackActivityProperties(this, map);
        PPWebView pPWebView2 = this.f28607p;
        if (i0.T()) {
            F6.d.h("PWebActivity", 3, "injectNightModeState: app in dark mode");
            if (pPWebView2 != null) {
                pPWebView2.addJavascriptInterface(Boolean.TRUE, "themeDark");
            }
        } else {
            F6.d.h("PWebActivity", 3, "injectNightModeState: app in dark mode false");
        }
        PPWebView pPWebView3 = this.f28607p;
        if (pPWebView3 != null) {
            pPWebView3.setVisibility(4);
        }
        PPWebView pPWebView4 = this.f28607p;
        if (pPWebView4 != null && (viewTreeObserver = pPWebView4.getViewTreeObserver()) != null) {
            viewTreeObserver.addOnGlobalLayoutListener(new c(this));
        }
        String mUrl8 = getMUrl();
        Intrinsics.checkNotNullParameter("nLoad", "key");
        if ((TextUtils.isEmpty(mUrl8) || !(mUrl8 == null || StringsKt.A(mUrl8, "nLoad", false))) ? false : "true".equalsIgnoreCase(Uri.parse(mUrl8).getQueryParameter("nLoad"))) {
            showLoadingDialog(true);
        }
        if (isHideTitleBar()) {
            setMTitle(" ");
            PpTitleBar titleBar = getTitleBar();
            if (titleBar != null) {
                titleBar.setTitle(getMTitle());
            }
            PpTitleBar titleBar2 = getTitleBar();
            if (titleBar2 != null && (rightImageView3 = titleBar2.getRightImageView1()) != null) {
                h.c(rightImageView3);
            }
            PpTitleBar titleBar3 = getTitleBar();
            if (titleBar3 != null && (rightImageView2 = titleBar3.getRightImageView2()) != null) {
                h.c(rightImageView2);
            }
            PpTitleBar titleBar4 = getTitleBar();
            if (titleBar4 != null) {
                h.s(titleBar4, true);
            }
            PpTitleBar titleBar5 = getTitleBar();
            if (titleBar5 != null && (leftImageView2 = titleBar5.getLeftImageView()) != null) {
                h.c(leftImageView2);
            }
            View view = this.f28608v;
            if (view != null) {
                h.s(view, true);
            }
            PpTitleBar titleBar6 = getTitleBar();
            if (titleBar6 != null) {
                titleBar6.setBackgroundResource(L6.b.ppColorBackgroundLight);
            }
            View view2 = this.f28608v;
            ViewGroup.LayoutParams layoutParams = view2 != null ? view2.getLayoutParams() : null;
            if (layoutParams != null) {
                layoutParams.height = BarUtils.getStatusBarHeight();
            }
            View view3 = this.f28608v;
            if (view3 != null) {
                view3.setLayoutParams(layoutParams);
            }
            setStatusBarTheme(true);
        }
        if (this.f28597a) {
            try {
                Configuration configuration = new Configuration(getResources().getConfiguration());
                configuration.uiMode = (configuration.uiMode & (-49)) | 32;
                Context contextCreateConfigurationContext = createConfigurationContext(configuration);
                Window window = getWindow();
                if (window != null) {
                    window.setBackgroundDrawable(new ColorDrawable(contextCreateConfigurationContext.getColor(L6.b.ppColorBackgroundDark)));
                }
                View view4 = this.f28608v;
                if (view4 != null) {
                    view4.setBackgroundColor(contextCreateConfigurationContext.getColor(L6.b.ppColorBackgroundLight));
                }
                PpTitleBar titleBar7 = getTitleBar();
                if (titleBar7 != null) {
                    titleBar7.setBackgroundColor(contextCreateConfigurationContext.getColor(L6.b.ppColorBackgroundLight));
                }
                Drawable drawable = contextCreateConfigurationContext.getDrawable(R.drawable.lib_web_icon_back_202046_24dp);
                if (drawable != null) {
                    Drawable drawableMutate = drawable.mutate();
                    Intrinsics.checkNotNullExpressionValue(drawableMutate, "wrap(...)");
                    drawableMutate.setTint(-1);
                    PpTitleBar titleBar8 = getTitleBar();
                    if (titleBar8 != null && (backImageView = titleBar8.getBackImageView()) != null) {
                        backImageView.setImageDrawable(drawableMutate);
                    }
                }
                Drawable drawable2 = contextCreateConfigurationContext.getDrawable(R.drawable.lib_web_icon_close_202046_24dp);
                if (drawable2 != null) {
                    Drawable drawableMutate2 = drawable2.mutate();
                    Intrinsics.checkNotNullExpressionValue(drawableMutate2, "wrap(...)");
                    drawableMutate2.setTint(-1);
                    PpTitleBar titleBar9 = getTitleBar();
                    if (titleBar9 != null && (leftImageView = titleBar9.getLeftImageView()) != null) {
                        leftImageView.setImageDrawable(drawableMutate2);
                    }
                }
                Drawable drawable3 = contextCreateConfigurationContext.getDrawable(R.drawable.lib_web_icon_more_202046_24dp);
                if (drawable3 != null) {
                    Drawable drawableMutate3 = drawable3.mutate();
                    Intrinsics.checkNotNullExpressionValue(drawableMutate3, "wrap(...)");
                    drawableMutate3.setTint(-1);
                    PpTitleBar titleBar10 = getTitleBar();
                    if (titleBar10 != null && (rightImageView1 = titleBar10.getRightImageView1()) != null) {
                        rightImageView1.setImageDrawable(drawableMutate3);
                    }
                }
            } catch (Exception e10) {
                F6.d.h("PWebActivity", 3, "applyDarkModeResources error: ", e10);
            }
        }
        this.t = new s(this, 27);
        String mUrl9 = getMUrl();
        Intrinsics.checkNotNullParameter("nLoad", "key");
        if (!TextUtils.isEmpty(mUrl9) && (mUrl9 == null || StringsKt.A(mUrl9, "nLoad", false))) {
            zEqualsIgnoreCase = "true".equalsIgnoreCase(Uri.parse(mUrl9).getQueryParameter("nLoad"));
        }
        if (zEqualsIgnoreCase) {
            j6 = BaseApplication.get().isOldAndroidDevice() ? DeviceOrientationRequest.OUTPUT_PERIOD_MEDIUM : 6000L;
        } else {
            j6 = 5000;
        }
        getWindow().getDecorView().postDelayed(this.t, j6);
    }

    @Override // android.app.Activity
    public final void finish() {
        super.finish();
        if (ActivityUtils.getActivityList().size() > 1 || ActivityUtils.isActivityExistsInStack("com.transsnet.palmpay.ui.activity.HomeActivity") != null) {
            return;
        }
        i0.j0();
    }

    @Override // com.palmpay.lib.webview.container.PPWebActivity
    public final long getDelayInitWebViewTime() {
        return 50L;
    }

    @Override // com.palmpay.lib.webview.container.PPWebActivity
    public final String getLoadUrl() {
        String loadUrl = super.getLoadUrl();
        if (UrlCoderUtil.hasEnCode(loadUrl)) {
            loadUrl = UrlCoderUtil.decode(loadUrl);
        }
        return (loadUrl == null || !y.m(loadUrl, "/", false)) ? loadUrl : com.transsnet.palmpay.core.config.d.g(loadUrl);
    }

    @Override // com.transsnet.palmpay.core.activityresult.IActivityPermissionResult
    /* JADX INFO: renamed from: getPermissionLauncher, reason: from getter */
    public final p038ca.d getF28605j() {
        return this.f28605j;
    }

    @Override // com.transsnet.palmpay.core.activityresult.IActivityResult
    /* JADX INFO: renamed from: getStartActivityLauncher, reason: from getter */
    public final e getF28604i() {
        return this.f28604i;
    }

    @Override // com.palmpay.lib.webview.container.PPWebActivity
    public final void handlerCustomerFileChooser(int i7, Intent intent) {
        WebJsCallback webJsCallback = this.f28600d;
        if (webJsCallback != null) {
            if (-1 == i7 && intent != null) {
                String stringExtra = intent.getStringExtra("photoUrl");
                Uri data = intent.getData();
                HashMap map = new HashMap();
                map.put("cbId", webJsCallback.f28613d);
                map.put("fnName", "getPhotoSource");
                map.put("photo_url", stringExtra);
                map.put("photo_file", data != null ? data.getEncodedPath() : null);
                webJsCallback.a(map);
            }
            webJsCallback.f28613d = null;
        }
    }

    @Override // com.palmpay.lib.webview.container.PPWebActivity
    public final boolean isDelayAddWebView() {
        return false;
    }

    @Override // com.palmpay.lib.webview.container.PPWebActivity
    public final boolean isPending() {
        WebJsCallback webJsCallback = this.f28600d;
        return webJsCallback != null && webJsCallback.d(getMUrl());
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [Va.b] */
    public final void m() {
        try {
            int i7 = Build.VERSION.SDK_INT;
            if (i7 >= 31) {
                if (this.f28594B != null) {
                    return;
                }
            } else if (this.f28595C != null) {
                return;
            }
            Object systemService = getSystemService(PictureMimeType.MIME_TYPE_PREFIX_AUDIO);
            Intrinsics.f(systemService, "null cannot be cast to non-null type android.media.AudioManager");
            AudioManager audioManager = (AudioManager) systemService;
            this.f28593A = audioManager;
            if (i7 >= 31) {
                this.f28594B = new AudioManager.OnCommunicationDeviceChangedListener() { // from class: Va.b
                    /* JADX WARN: Code duplicated, block: B:24:0x004c  */
                    /* JADX WARN: Code duplicated, block: B:25:0x004f  */
                    @Override // android.media.AudioManager.OnCommunicationDeviceChangedListener
                    public final void onCommunicationDeviceChanged(AudioDeviceInfo audioDeviceInfo) {
                        AudioDeviceInfo communicationDevice;
                        PWebActivity pWebActivity = this.f10232a;
                        boolean z3 = PWebActivity.f28592L;
                        F6.d.h("========", 3, "进来了PWebActivity===" + audioDeviceInfo);
                        AudioManager audioManager2 = pWebActivity.f28593A;
                        String str = AudioChannelBridge.CHANNEL_SPEAKER;
                        if (audioManager2 != null && (communicationDevice = audioManager2.getCommunicationDevice()) != null) {
                            int type = communicationDevice.getType();
                            if (type == 1) {
                                str = AudioChannelBridge.CHANNEL_RECEIVER;
                            } else if (type != 2) {
                                if (type == 3 || type == 4) {
                                    str = AudioChannelBridge.CHANNEL_HEADSET;
                                } else if (type == 7 || type == 8) {
                                    str = AudioChannelBridge.CHANNEL_BLUETOOTH;
                                } else if (type == 22) {
                                    str = AudioChannelBridge.CHANNEL_HEADSET;
                                } else if (type == 23 || type == 26) {
                                    str = AudioChannelBridge.CHANNEL_BLUETOOTH;
                                }
                            }
                        }
                        pWebActivity.n(str);
                    }
                };
                Executor mainExecutor = getMainExecutor();
                b bVar = this.f28594B;
                Intrinsics.e(bVar);
                audioManager.addOnCommunicationDeviceChangedListener(mainExecutor, bVar);
                return;
            }
            d dVar = new d(this);
            this.f28595C = dVar;
            AudioManager audioManager2 = this.f28593A;
            if (audioManager2 != null) {
                audioManager2.registerAudioDeviceCallback(dVar, new Handler(getMainLooper()));
            }
        } catch (Exception e10) {
            F6.d.c("loadAudioEvent", "loadAudioEvent error", e10);
        }
    }

    public final void n(String str) {
        F6.d.h("AudioRoute", 3, "EVENT_AUDIO_CHANGE-当前变化音频通道: ".concat(str));
        LinkedHashMap linkedHashMapH = G.h(new Pair("cbId", "AudioChangedFinish"), new Pair("fnName", "audioDeviceChanged"), new Pair("param", str));
        JsInterface jsInterface = this.f28601e;
        if (jsInterface != null) {
            jsInterface.a(linkedHashMapH);
        }
    }

    @Override // com.palmpay.lib.webview.container.PPWebActivity, androidx.fragment.app.E, androidx.activity.AbstractActivityC0822m, android.app.Activity
    public final void onActivityResult(int i7, int i10, Intent intent) {
        super.onActivityResult(i7, i10, intent);
        WebJsCallback webJsCallback = this.f28600d;
        if (webJsCallback == null || 488 != i7) {
            return;
        }
        if (i10 != -1) {
            webJsCallback.f28613d = null;
            return;
        }
        Intrinsics.e(intent);
        String stringExtra = intent.getStringExtra("photoUrl");
        Uri data = intent.getData();
        HashMap map = new HashMap();
        map.put("cbId", webJsCallback.f28613d);
        map.put("fnName", "getPhotoSource");
        map.put("photo_url", stringExtra);
        map.put("photo_file", data != null ? data.getEncodedPath() : null);
        webJsCallback.a(map);
        webJsCallback.f28613d = null;
    }

    @Override // androidx.activity.AbstractActivityC0822m, android.app.Activity
    public final void onBackPressed() {
        super.onBackPressed();
        if (this.f28596H == 0 || System.currentTimeMillis() - this.f28596H > 800) {
            this.f28596H = System.currentTimeMillis();
        } else {
            finish();
        }
    }

    @Override // com.palmpay.lib.webview.container.PPWebActivity, androidx.fragment.app.E, androidx.activity.AbstractActivityC0822m, androidx.core.app.AbstractActivityC1040i, android.app.Activity
    public final void onCreate(Bundle bundle) {
        WebViewClient ppWebViewClient;
        this.f28609w = new m(this, SystemClock.elapsedRealtime(), !f28592L);
        if (!f28592L) {
            WebCache webCache = WebCache.INSTANCE;
            Application application = getApplication();
            Intrinsics.checkNotNullExpressionValue(application, "getApplication(...)");
            webCache.addWebResourceFallbackInterceptor(new Wa.b(application));
            Application application2 = getApplication();
            Intrinsics.checkNotNullExpressionValue(application2, "getApplication(...)");
            webCache.addWebResourceInterceptor(new Wa.d(application2));
        }
        f28592L = true;
        getDelegate().l(1);
        super.onCreate(bundle);
        String mUrl = getMUrl();
        Intrinsics.checkNotNullParameter("securityPage", "key");
        this.f28598b = (TextUtils.isEmpty(mUrl) || !(mUrl == null || StringsKt.A(mUrl, "securityPage", false))) ? false : "true".equalsIgnoreCase(Uri.parse(mUrl).getQueryParameter("securityPage"));
        String mUrl2 = getMUrl();
        Intrinsics.checkNotNullParameter("bAudioStatus", "key");
        this.f28599c = (TextUtils.isEmpty(mUrl2) || !(mUrl2 == null || StringsKt.A(mUrl2, "bAudioStatus", false))) ? false : "true".equalsIgnoreCase(Uri.parse(mUrl2).getQueryParameter("bAudioStatus"));
        if (bundle == null) {
            n0.p(getIntent());
        }
        org.greenrobot.eventbus.c.b().j(this);
        View viewFindViewById = findViewById(L9.a.v_status_bar);
        this.f28608v = viewFindViewById;
        if (viewFindViewById != null) {
            ViewGroup.LayoutParams layoutParams = viewFindViewById.getLayoutParams();
            if (layoutParams != null) {
                layoutParams.height = BarUtils.getStatusBarHeight();
            }
            View view = this.f28608v;
            if (view != null) {
                view.setBackgroundResource(L6.b.ppColorBackgroundLight);
            }
            View view2 = this.f28608v;
            if (view2 != null) {
                view2.setLayoutParams(layoutParams);
            }
        }
        PPWebView pPWebView = this.f28607p;
        if (pPWebView != null && k.a("GET_WEB_VIEW_CLIENT")) {
            WeakHashMap weakHashMap = j.f18330a;
            androidx.webkit.internal.b bVar = o.f18309b;
            if (bVar.a()) {
                ppWebViewClient = pPWebView.getWebViewClient();
            } else {
                if (!bVar.b()) {
                    throw o.a();
                }
                if (Build.VERSION.SDK_INT >= 28) {
                    Looper webViewLooper = pPWebView.getWebViewLooper();
                    if (webViewLooper != Looper.myLooper()) {
                        throw new RuntimeException("A WebView method was called on thread '" + Thread.currentThread().getName() + "'. All WebView methods must be called on the same thread. (Expected Looper " + webViewLooper + " called on " + Looper.myLooper() + ", FYI main Looper is " + Looper.getMainLooper() + ")");
                    }
                } else {
                    try {
                        Method declaredMethod = WebView.class.getDeclaredMethod("checkThread", new Class[0]);
                        declaredMethod.setAccessible(true);
                        declaredMethod.invoke(pPWebView, new Object[0]);
                    } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException e10) {
                        throw new RuntimeException(e10);
                    }
                }
                ppWebViewClient = j.d(pPWebView).f18328a.getWebViewClient();
            }
            Intrinsics.checkNotNullExpressionValue(ppWebViewClient, "getWebViewClient(...)");
            if (ppWebViewClient instanceof PPWebViewClient) {
                m mVar = this.f28609w;
                JsInterface jsInterface = this.f28601e;
                Intrinsics.checkNotNullParameter(ppWebViewClient, "ppWebViewClient");
                p pVar = new p();
                pVar.f10278a = (PPWebViewClient) ppWebViewClient;
                pVar.f10279b = mVar;
                pVar.f10280c = jsInterface;
                pPWebView.setWebViewClient(pVar);
            }
        }
        if (this.f28599c) {
            m();
        }
    }

    @Override // com.palmpay.lib.webview.container.PPWebActivity
    public final boolean onCustomerShowFileChooser(WebView webView, ValueCallback valueCallback, WebChromeClient.FileChooserParams fileChooserParams, int i7) {
        E eB;
        String[] acceptTypes;
        WebJsCallback webJsCallback = this.f28600d;
        if (webJsCallback != null && (eB = webJsCallback.b()) != null) {
            if (fileChooserParams != null && (acceptTypes = fileChooserParams.getAcceptTypes()) != null) {
                for (String str : acceptTypes) {
                    if (!y.h(str, "application/pdf", true) && !y.h(str, ".pdf", true)) {
                        Intrinsics.e(str);
                        if (!StringsKt.A(str, "pdf", true)) {
                        }
                    }
                    ARouter.getInstance().build("/account/setUserPhoto").withBoolean("crop_photo", false).withBoolean("photoBig", true).withBoolean("private_photo", true).withBoolean("origin_photo", true).withString("pdf_mode", "pick_and_snap").navigation(eB, i7);
                    return true;
                }
            }
            webJsCallback.e(i7, "");
        }
        return true;
    }

    @Override // com.palmpay.lib.webview.container.PPWebActivity, androidx.appcompat.app.AbstractActivityC0837o, androidx.fragment.app.E, android.app.Activity
    public final void onDestroy() {
        super.onDestroy();
        m mVar = this.f28609w;
        if (mVar != null) {
            mVar.f10270d = true;
        }
        this.f28609w = null;
        WebJsCallback webJsCallback = this.f28600d;
        if (webJsCallback != null) {
            webJsCallback.f28620p = null;
        }
        this.f28600d = null;
        if (this.t != null) {
            getWindow().getDecorView().removeCallbacks(this.t);
            this.t = null;
        }
        org.greenrobot.eventbus.c.b().l(this);
        AudioManager audioManager = this.f28593A;
        if (audioManager != null) {
            if (Build.VERSION.SDK_INT >= 31) {
                b bVar = this.f28594B;
                if (bVar != null) {
                    audioManager.removeOnCommunicationDeviceChangedListener(bVar);
                }
                this.f28594B = null;
            } else {
                d dVar = this.f28595C;
                if (dVar != null) {
                    audioManager.unregisterAudioDeviceCallback(dVar);
                }
                this.f28595C = null;
            }
        }
        this.f28593A = null;
    }

    @Subscribe(threadMode = ThreadMode.MAIN)
    public final void onMessageEvent(@NotNull MessageEvent event) {
        Intrinsics.checkNotNullParameter(event, "event");
        if (event.getEventType() == 343) {
            Boolean boolG = C0525w.g(event.getEventContent(), "result");
            String strJ = C0525w.j(event.getEventContent(), "orderNo");
            String strJ2 = C0525w.j(event.getEventContent(), "transType");
            String strJ3 = C0525w.j(event.getEventContent(), "orderData");
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            linkedHashMap.put("cbId", "payOrderFinish");
            linkedHashMap.put("fnName", "payOrderFinish");
            linkedHashMap.put("result", boolG);
            Intrinsics.e(strJ);
            linkedHashMap.put("orderNo", strJ);
            Intrinsics.e(strJ2);
            linkedHashMap.put("transType", strJ2);
            Intrinsics.e(strJ3);
            linkedHashMap.put("orderData", strJ3);
            JsInterface jsInterface = this.f28601e;
            if (jsInterface != null) {
                jsInterface.a(linkedHashMap);
            }
        }
    }

    @Override // com.palmpay.lib.webview.container.PPWebActivity, androidx.fragment.app.E, android.app.Activity
    public final void onPause() {
        Window window;
        super.onPause();
        if (!this.f28598b || (window = getWindow()) == null) {
            return;
        }
        window.clearFlags(UserMetadata.MAX_INTERNAL_KEY_SIZE);
    }

    @Override // com.transsnet.palmpay.core.receiver.VagueReceiver$OnKeyListener
    public final void onRecentClick() {
        this.f28603g = r0.e(this.f28603g, this);
    }

    @Override // com.palmpay.lib.webview.container.PPWebActivity, androidx.fragment.app.E, android.app.Activity
    public final void onResume() {
        Window window;
        super.onResume();
        r0.F1(this.f28603g, this);
        if (this.f28598b && (window = getWindow()) != null) {
            window.setFlags(UserMetadata.MAX_INTERNAL_KEY_SIZE, UserMetadata.MAX_INTERNAL_KEY_SIZE);
        }
        int i7 = 0;
        if (!NQEManager.INSTANCE.isNetworkOffline()) {
            NetworkNotConnectView networkNotConnectView = this.f28606o;
            if (networkNotConnectView != null) {
                h.s(networkNotConnectView, false);
                return;
            }
            return;
        }
        if (this.f28606o == null) {
            NetworkNotConnectView networkNotConnectView2 = new NetworkNotConnectView(this, null, 6, i7);
            this.f28606o = networkNotConnectView2;
            networkNotConnectView2.setRefreshListener(new C0142i(this, 9));
            View viewFindViewById = findViewById(android.R.id.content);
            if (viewFindViewById != null) {
                FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1);
                if (viewFindViewById instanceof ViewGroup) {
                    ((ViewGroup) viewFindViewById).addView(this.f28606o, layoutParams);
                }
            }
        }
        NetworkNotConnectView networkNotConnectView3 = this.f28606o;
        if (networkNotConnectView3 != null) {
            h.s(networkNotConnectView3, true);
        }
    }

    @Override // androidx.appcompat.app.AbstractActivityC0837o, androidx.activity.AbstractActivityC0822m, android.app.Activity
    public final void setContentView(int i7) {
        super.setContentView(L9.b.cm_activity_web);
        if (isHideTitleBar()) {
            ((ViewStub) findViewById(L9.a.titleStub1)).inflate();
        } else {
            ((ViewStub) findViewById(L9.a.titleStub2)).inflate();
        }
        Window window = getWindow();
        if (window != null) {
            window.setBackgroundDrawableResource(L6.b.ppColorBackgroundDark);
        }
    }

    @Override // com.palmpay.lib.webview.container.PPWebActivity
    public final void setStatusBarTheme(boolean z3) {
        Window window = getWindow();
        if (window != null) {
            if (Build.VERSION.SDK_INT < 30) {
                int systemUiVisibility = window.getDecorView().getSystemUiVisibility();
                window.getDecorView().setSystemUiVisibility(!z3 ? systemUiVisibility & (-8193) : systemUiVisibility | UserMetadata.MAX_INTERNAL_KEY_SIZE);
            } else {
                WindowInsetsController insetsController = window.getInsetsController();
                if (insetsController != null) {
                    insetsController.setSystemBarsAppearance(z3 ? 0 : 8, 8);
                }
            }
        }
    }

    @Override // com.transsnet.palmpay.core.callback.ShowDialogCallback
    public final void showLoadingDialog(boolean z3) {
        AbstractC0780y.m(AbstractC0777v.b(), null, null, new g(this, z3, null), 3);
    }
}
