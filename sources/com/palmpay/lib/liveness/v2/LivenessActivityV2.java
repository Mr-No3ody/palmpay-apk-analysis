package com.palmpay.lib.liveness.v2;

import B5.c;
import B6.C0084f;
import B6.C0092n;
import B6.C0098u;
import B6.C0099v;
import B6.RunnableC0083e;
import B6.RunnableC0085g;
import B6.ViewOnClickListenerC0082d;
import B6.e0;
import B6.r;
import D6.f;
import E.AbstractC0198c;
import O6.d;
import Wf.AbstractC0780y;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.text.Html;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import android.widget.FrameLayout;
import android.widget.TextView;
import android.widget.ViewFlipper;
import androidx.appcompat.app.AbstractActivityC0837o;
import androidx.camera.lifecycle.h;
import androidx.camera.view.C1027h;
import androidx.camera.view.PreviewView;
import androidx.lifecycle.V;
import androidx.lifecycle.b0;
import com.airbnb.lottie.LottieAnimationView;
import com.didiglobal.booster.instrument.ShadowExecutors;
import com.google.common.util.concurrent.ListenableFuture;
import com.google.firebase.crashlytics.internal.metadata.UserMetadata;
import com.horcrux.svg.d0;
import com.palmpay.lib.liveness.LiveID$ILiveIDMonitor;
import com.palmpay.lib.liveness.lang.LanguageManager$Companion;
import com.palmpay.lib.liveness.model.ExtendFeature;
import com.palmpay.lib.liveness.model.LiveIDException;
import com.palmpay.lib.liveness.result.LiveIDResult;
import com.palmpay.lib.liveness.ui.widget.AlgorithmScheduleProgressBar;
import com.palmpay.lib.liveness.ui.widget.CountdownProgressViewV2;
import com.palmpay.lib.liveness.ui.widget.LTitleBar;
import com.palmpay.lib.liveness.ui.widget.LivenessStepLayout;
import io.fastkv.n;
import java.util.concurrent.ExecutorService;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.jvm.internal.G;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt;
import kotlin.text.y;
import p232p6.p;
import p232p6.q;
import p232p6.t;
import p232p6.u;
import p320v6.e;
import top.zibin.luban.io.a;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/palmpay/lib/liveness/v2/LivenessActivityV2;", "Landroidx/appcompat/app/o;", "<init>", "()V", "lib_liveness_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nLivenessActivityV2.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LivenessActivityV2.kt\ncom/palmpay/lib/liveness/v2/LivenessActivityV2\n+ 2 ActivityViewModelLazy.kt\nandroidx/activity/ActivityViewModelLazyKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 View.kt\nandroidx/core/view/ViewKt\n*L\n1#1,713:1\n75#2,13:714\n1#3:727\n260#4:728\n*S KotlinDebug\n*F\n+ 1 LivenessActivityV2.kt\ncom/palmpay/lib/liveness/v2/LivenessActivityV2\n*L\n110#1:714,13\n585#1:728\n*E\n"})
public final class LivenessActivityV2 extends AbstractActivityC0837o {

    /* JADX INFO: renamed from: Z, reason: collision with root package name */
    public static final /* synthetic */ int f23926Z = 0;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public int f23929C;

    /* JADX INFO: renamed from: Q, reason: collision with root package name */
    public a f23933Q;

    /* JADX INFO: renamed from: X, reason: collision with root package name */
    public String f23934X;

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    public CountdownProgressViewV2 f23935Y;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public C1027h f23936a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public PreviewView f23937b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public ExecutorService f23938c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public d f23939d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public d f23940e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public e0 f23941f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public LTitleBar f23942g;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public LivenessStepLayout f23943i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public ViewFlipper f23944j;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public String f23946p;
    public String t;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public boolean f23948w;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public float f23945o = -9.0f;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public int f23947v = 2;

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public final Handler f23927A = new Handler(Looper.getMainLooper());

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public final Integer[] f23928B = {-65536, -256, -16776961, -16711936};

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    public final c f23930H = new c(this, 1);

    /* JADX INFO: renamed from: L, reason: collision with root package name */
    public final RunnableC0083e f23931L = new RunnableC0083e(this, 1);

    /* JADX INFO: renamed from: M, reason: collision with root package name */
    public final b0 f23932M = new b0(G.a(B6.b0.class), new C0099v(this, 0), new C0084f(this, 0), new C0099v(this, 1));

    @Override // androidx.appcompat.app.AbstractActivityC0837o, android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    public final void attachBaseContext(Context newBase) {
        Intrinsics.checkNotNullParameter(newBase, "newBase");
        super.attachBaseContext(AbstractC0198c.a0(newBase, p280s6.a.f42044a.getUserLanguage(newBase)));
    }

    public final LottieAnimationView e(int i7, int i10, int i11) {
        LottieAnimationView lottieAnimationView = new LottieAnimationView(this);
        lottieAnimationView.setRepeatMode(1);
        lottieAnimationView.f19579e.f20305b.setRepeatCount(-1);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(i10, i11);
        layoutParams.gravity = 17;
        lottieAnimationView.setLayoutParams(layoutParams);
        lottieAnimationView.setAnimation(i7);
        lottieAnimationView.e();
        return lottieAnimationView;
    }

    public final void f() {
        if (isDestroyed() || isFinishing()) {
            return;
        }
        Intent intent = new Intent();
        f fVar = f.f1630o;
        LiveIDResult.Error error = new LiveIDResult.Error(new LiveIDException(fVar.f1633a, fVar.f1634b, "camera init error", null, 8, null));
        Bundle bundle = new Bundle();
        bundle.putParcelable("key_bundle_live_id_result", error);
        n.H(error);
        setResult(-1, intent.putExtras(bundle));
        finish();
    }

    public final B6.b0 g() {
        return (B6.b0) this.f23932M.getValue();
    }

    public final void h() {
        Handler handler = this.f23927A;
        handler.removeCallbacksAndMessages(null);
        handler.post(this.f23931L);
        CountdownProgressViewV2 countdownProgressViewV2 = this.f23935Y;
        if (countdownProgressViewV2 == null) {
            Intrinsics.n("countdownProgressView");
            throw null;
        }
        countdownProgressViewV2.b();
        a aVar = this.f23933Q;
        if (aVar != null) {
            aVar.r();
        }
        g().f458i.f407h = true;
        View viewInflate = View.inflate(this, u.lib_liveness_quit_dialog_content, null);
        LanguageManager$Companion languageManager$Companion = p280s6.a.f42044a;
        ((TextView) viewInflate.findViewById(t.tvContent)).setText(Html.fromHtml(y.k(d0.o(languageManager$Companion, "smart_quit_tips"), "{themeColor}", AbstractC0198c.h(q.face_primary_color, this)), 0));
        TextView textView = (TextView) viewInflate.findViewById(t.tv_title);
        languageManager$Companion.getInstance().getClass();
        textView.setText(p280s6.a.a("smart_quit_title"));
        TextView textView2 = (TextView) viewInflate.findViewById(t.tvMsg);
        languageManager$Companion.getInstance().getClass();
        textView2.setText(p280s6.a.a("smart_quit_msg_v2"));
        O6.c cVar = new O6.c(this);
        cVar.f6605k = true;
        cVar.f6616w = viewInflate;
        String strO = d0.o(languageManager$Companion, "smart_selfie_processing_retry_button");
        ViewOnClickListenerC0082d viewOnClickListenerC0082d = new ViewOnClickListenerC0082d(this, 1);
        cVar.f6600f = strO;
        cVar.f6602h = viewOnClickListenerC0082d;
        String strO2 = d0.o(languageManager$Companion, "smart_selfie_processing_quit_button");
        ViewOnClickListenerC0082d viewOnClickListenerC0082d2 = new ViewOnClickListenerC0082d(this, 2);
        cVar.f6601g = strO2;
        cVar.f6603i = viewOnClickListenerC0082d2;
        d dVarA = cVar.a();
        dVarA.setCancelable(false);
        dVarA.show();
    }

    public final void i() {
        CountdownProgressViewV2 countdownProgressViewV2 = this.f23935Y;
        if (countdownProgressViewV2 == null) {
            Intrinsics.n("countdownProgressView");
            throw null;
        }
        if (countdownProgressViewV2.getVisibility() != 0) {
            CountdownProgressViewV2 countdownProgressViewV3 = this.f23935Y;
            if (countdownProgressViewV3 == null) {
                Intrinsics.n("countdownProgressView");
                throw null;
            }
            countdownProgressViewV3.setVisibility(0);
        }
        CountdownProgressViewV2 countdownProgressViewV4 = this.f23935Y;
        if (countdownProgressViewV4 != null) {
            countdownProgressViewV4.a(new C0084f(this, 1));
        } else {
            Intrinsics.n("countdownProgressView");
            throw null;
        }
    }

    @Override // androidx.activity.AbstractActivityC0822m, android.app.Activity
    public final void onBackPressed() {
        h();
    }

    @Override // androidx.fragment.app.E, androidx.activity.AbstractActivityC0822m, androidx.core.app.AbstractActivityC1040i, android.app.Activity
    public final void onCreate(Bundle bundle) {
        String stringExtra;
        String stringExtra2;
        LiveID$ILiveIDMonitor liveID$ILiveIDMonitor;
        LiveID$ILiveIDMonitor liveID$ILiveIDMonitor2;
        ExtendFeature extendFeature;
        ExtendFeature extendFeature2;
        String businessTxt;
        View decorView;
        View decorView2;
        getDelegate().l(1);
        super.onCreate(bundle);
        getWindow().clearFlags(67108864);
        getWindow().addFlags(Integer.MIN_VALUE);
        getWindow().getDecorView().setSystemUiVisibility(getWindow().getDecorView().getSystemUiVisibility() | 1280);
        getWindow().setStatusBarColor(0);
        Window window = getWindow();
        Integer numValueOf = (window == null || (decorView2 = window.getDecorView()) == null) ? null : Integer.valueOf(decorView2.getSystemUiVisibility());
        Window window2 = getWindow();
        if (window2 != null && (decorView = window2.getDecorView()) != null) {
            Integer numValueOf2 = numValueOf != null ? Integer.valueOf(numValueOf.intValue() | UserMetadata.MAX_INTERNAL_KEY_SIZE) : null;
            Intrinsics.e(numValueOf2);
            decorView.setSystemUiVisibility(numValueOf2.intValue());
        }
        setContentView(u.lib_liveness_face);
        LTitleBar lTitleBar = (LTitleBar) findViewById(t.face_titlebar);
        this.f23942g = lTitleBar;
        if (lTitleBar == null) {
            Intrinsics.n("titleBar");
            throw null;
        }
        lTitleBar.setBackButtonClickListener(new ViewOnClickListenerC0082d(this, 0));
        View viewFindViewById = findViewById(t.face_pp_license);
        r6.a aVar = p.f41237d;
        if (aVar != null ? Boolean.TRUE.equals(aVar.f41572d) : false) {
            if (viewFindViewById != null) {
                viewFindViewById.setVisibility(0);
            }
        } else if (viewFindViewById != null) {
            viewFindViewById.setVisibility(8);
        }
        LTitleBar lTitleBar2 = this.f23942g;
        if (lTitleBar2 == null) {
            Intrinsics.n("titleBar");
            throw null;
        }
        this.f23935Y = (CountdownProgressViewV2) lTitleBar2.findViewById(t.tv_right);
        TextView textView = (TextView) findViewById(t.face_bottom_tips_tv);
        r6.a aVar2 = p.f41237d;
        if ((aVar2 == null || (extendFeature2 = aVar2.f41587s) == null || (businessTxt = extendFeature2.getBusinessTxt()) == null || !(StringsKt.F(businessTxt) ^ true)) ? false : true) {
            TextView textView2 = (TextView) findViewById(t.face_business_tips_tv);
            textView2.setVisibility(0);
            r6.a aVar3 = p.f41237d;
            textView2.setText((aVar3 == null || (extendFeature = aVar3.f41587s) == null) ? null : extendFeature.getBusinessTxt());
        }
        AlgorithmScheduleProgressBar algorithmScheduleProgressBar = (AlgorithmScheduleProgressBar) findViewById(t.face_algorithm_schedule_progressbar);
        this.f23937b = (PreviewView) findViewById(t.camera_preview);
        this.f23943i = (LivenessStepLayout) findViewById(t.face_step);
        this.f23944j = (ViewFlipper) findViewById(t.liveness_view_flipper);
        Intent intent = getIntent();
        if (intent == null || (stringExtra = intent.getStringExtra("KEY_TRANSACTION_ID")) == null) {
            stringExtra = "";
        }
        this.f23946p = stringExtra;
        Intent intent2 = getIntent();
        if (intent2 == null || (stringExtra2 = intent2.getStringExtra("KEY_UPLOAD_URL")) == null) {
            stringExtra2 = "";
        }
        this.t = stringExtra2;
        Intent intent3 = getIntent();
        this.f23947v = intent3 != null ? intent3.getIntExtra("KEY_FILE_TYPE", 2) : 2;
        String str = this.f23946p;
        if (str == null) {
            Intrinsics.n("transactionId");
            throw null;
        }
        if (!TextUtils.isEmpty(str)) {
            String str2 = this.t;
            if (str2 == null) {
                Intrinsics.n("uploadUrl");
                throw null;
            }
            if (!TextUtils.isEmpty(str2) && p.f41246m) {
                B6.b0 b0VarG = g();
                String str3 = this.f23946p;
                if (str3 == null) {
                    Intrinsics.n("transactionId");
                    throw null;
                }
                b0VarG.f452A = str3;
                try {
                    this.f23938c = ShadowExecutors.newOptimizedSingleThreadExecutor("\u200bcom.palmpay.lib.liveness.v2.LivenessActivityV2");
                    ListenableFuture<h> fVar = h.f14527i.getInstance(this);
                    fVar.addListener(new RunnableC0085g(0, this, fVar), androidx.core.content.d.d(this));
                    WindowManager.LayoutParams attributes = getWindow().getAttributes();
                    this.f23945o = attributes.screenBrightness;
                    Window window3 = getWindow();
                    attributes.screenBrightness = 1.0f;
                    window3.setAttributes(attributes);
                    getWindow().addFlags(128);
                    r6.a aVar4 = p.f41237d;
                    if (aVar4 != null && (liveID$ILiveIDMonitor2 = aVar4.f41573e) != null) {
                        p320v6.d dVar = e.f43076d;
                        String str4 = dVar.f43071a;
                        Pair pair = new Pair("event_desc", dVar.f43072b);
                        Integer num = p.f41243j;
                        Pair pair2 = new Pair("scene", Integer.valueOf(num != null ? num.intValue() : -1));
                        String str5 = this.f23946p;
                        if (str5 == null) {
                            Intrinsics.n("transactionId");
                            throw null;
                        }
                        Pair pair3 = new Pair("transactionId", str5);
                        String str6 = p.f41242i;
                        liveID$ILiveIDMonitor2.report(str4, kotlin.collections.G.h(pair, pair2, pair3, new Pair("uuid", str6 != null ? str6 : "")));
                    }
                    AbstractC0780y.m(V.f(this), null, null, new r(this, textView, algorithmScheduleProgressBar, null), 3);
                    AbstractC0780y.m(V.f(this), null, null, new C0098u(this, null), 3);
                    LTitleBar lTitleBar3 = this.f23942g;
                    if (lTitleBar3 == null) {
                        Intrinsics.n("titleBar");
                        throw null;
                    }
                    ViewGroup.LayoutParams layoutParams = lTitleBar3.getRightImageView1().getLayoutParams();
                    int i7 = (int) (((double) (24 * getResources().getDisplayMetrics().density)) + 0.5d);
                    layoutParams.width = i7;
                    layoutParams.height = i7;
                    LTitleBar lTitleBar4 = this.f23942g;
                    if (lTitleBar4 == null) {
                        Intrinsics.n("titleBar");
                        throw null;
                    }
                    lTitleBar4.getRightImageView1().setLayoutParams(layoutParams);
                    AbstractC0780y.m(V.f(this), null, null, new C0092n(this, null), 3);
                    PreviewView previewView = this.f23937b;
                    if (previewView != null) {
                        previewView.post(new RunnableC0083e(this, 2));
                        return;
                    } else {
                        Intrinsics.n("cameraPreview");
                        throw null;
                    }
                } catch (Exception e10) {
                    e10.printStackTrace();
                    Intent intent4 = new Intent();
                    f fVar2 = f.f1630o;
                    LiveIDResult.Error error = new LiveIDResult.Error(new LiveIDException(fVar2.f1633a, fVar2.f1634b, "camera init error", null, 8, null));
                    Bundle bundle2 = new Bundle();
                    bundle2.putParcelable("key_bundle_live_id_result", error);
                    n.H(error);
                    setResult(-1, intent4.putExtras(bundle2));
                    finish();
                    return;
                }
            }
        }
        r6.a aVar5 = p.f41237d;
        if (aVar5 != null && (liveID$ILiveIDMonitor = aVar5.f41573e) != null) {
            p320v6.d dVar2 = e.f43079g;
            String str7 = dVar2.f43071a;
            Pair pair4 = new Pair("event_desc", dVar2.f43072b);
            Integer num2 = p.f41243j;
            Pair pair5 = new Pair("scene", Integer.valueOf(num2 != null ? num2.intValue() : -1));
            Pair pair6 = new Pair("code", "-99");
            Pair pair7 = new Pair("msg", "params is empty or LiveID not init");
            String str8 = p.f41242i;
            liveID$ILiveIDMonitor.report(str7, kotlin.collections.G.h(pair4, pair5, pair6, pair7, new Pair("uuid", str8 != null ? str8 : "")));
        }
        finish();
    }

    @Override // androidx.appcompat.app.AbstractActivityC0837o, androidx.fragment.app.E, android.app.Activity
    public final void onDestroy() {
        super.onDestroy();
        if (this.f23945o != -9.0f) {
            Window window = getWindow();
            WindowManager.LayoutParams attributes = getWindow().getAttributes();
            attributes.screenBrightness = this.f23945o;
            window.setAttributes(attributes);
        }
        getWindow().clearFlags(128);
        d dVar = this.f23939d;
        if (dVar != null) {
            dVar.dismiss();
        }
        a aVar = this.f23933Q;
        if (aVar != null) {
            aVar.r();
        }
        ExecutorService executorService = this.f23938c;
        if (executorService != null) {
            executorService.shutdown();
        }
    }

    @Override // androidx.appcompat.app.AbstractActivityC0837o, androidx.fragment.app.E, android.app.Activity
    public final void onStop() {
        super.onStop();
        a aVar = this.f23933Q;
        if (aVar != null) {
            aVar.r();
        }
    }
}
