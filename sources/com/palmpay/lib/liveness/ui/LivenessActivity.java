package com.palmpay.lib.liveness.ui;

import D6.e;
import D6.f;
import E.AbstractC0198c;
import O6.c;
import O6.d;
import Wf.AbstractC0780y;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import android.widget.FrameLayout;
import android.widget.TextView;
import android.widget.ViewFlipper;
import androidx.appcompat.app.AbstractActivityC0837o;
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
import p232p6.p;
import p232p6.t;
import p232p6.u;
import p297te.g;
import p353xd.B;
import p364y6.h;
import p364y6.i;
import p364y6.j;
import p364y6.r;
import p364y6.s;
import top.zibin.luban.io.a;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/palmpay/lib/liveness/ui/LivenessActivity;", "Landroidx/appcompat/app/o;", "<init>", "()V", "lib_liveness_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nLivenessActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LivenessActivity.kt\ncom/palmpay/lib/liveness/ui/LivenessActivity\n+ 2 ActivityViewModelLazy.kt\nandroidx/activity/ActivityViewModelLazyKt\n+ 3 DialogExt.kt\ncom/palmpay/lib/ui/dialog/DialogExtKt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 5 View.kt\nandroidx/core/view/ViewKt\n*L\n1#1,757:1\n75#2,13:758\n9#3,66:771\n9#3,66:839\n9#3,66:905\n1#4:837\n260#5:838\n*S KotlinDebug\n*F\n+ 1 LivenessActivity.kt\ncom/palmpay/lib/liveness/ui/LivenessActivity\n*L\n112#1:758,13\n505#1:771,66\n705#1:839,66\n647#1:905,66\n632#1:838\n*E\n"})
public final class LivenessActivity extends AbstractActivityC0837o {

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    public static final /* synthetic */ int f23837Y = 0;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public int f23839B;

    /* JADX INFO: renamed from: M, reason: collision with root package name */
    public a f23843M;

    /* JADX INFO: renamed from: Q, reason: collision with root package name */
    public String f23844Q;

    /* JADX INFO: renamed from: X, reason: collision with root package name */
    public CountdownProgressViewV2 f23845X;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public C1027h f23846a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public PreviewView f23847b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public ExecutorService f23848c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public d f23849d;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public String f23851f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public String f23852g;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public LTitleBar f23854j;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public LivenessStepLayout f23855o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public ViewFlipper f23856p;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public boolean f23857v;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public float f23850e = -9.0f;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f23853i = 2;
    public float t = -1.0f;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final Handler f23858w = new Handler(Looper.getMainLooper());

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public final Integer[] f23838A = {-65536, -256, -16776961, -16711936};

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public final B f23840C = new B(this, 1);

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    public final i f23841H = new i(this, 1);

    /* JADX INFO: renamed from: L, reason: collision with root package name */
    public final b0 f23842L = new b0(G.a(e.class), new s(this, 0), new j(this, 0), new s(this, 1));

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

    public final e g() {
        return (e) this.f23842L.getValue();
    }

    public final void h() {
        Handler handler = this.f23858w;
        handler.removeCallbacksAndMessages(null);
        handler.post(this.f23841H);
    }

    public final void i() {
        p292t6.a.a("resetTimer------------");
        CountdownProgressViewV2 countdownProgressViewV2 = this.f23845X;
        if (countdownProgressViewV2 != null) {
            countdownProgressViewV2.b();
        } else {
            Intrinsics.n("countdownProgressView");
            throw null;
        }
    }

    public final void j() {
        h();
        i();
        a aVar = this.f23843M;
        if (aVar != null) {
            aVar.r();
        }
        g().f1606A = false;
        LanguageManager$Companion languageManager$Companion = p280s6.a.f42044a;
        String strO = d0.o(languageManager$Companion, "smart_quit_title");
        int i7 = p232p6.s.lib_liveness_icon_quit;
        languageManager$Companion.getInstance().getClass();
        CharSequence charSequenceB = p280s6.a.b(this);
        String strO2 = d0.o(languageManager$Companion, "smart_selfie_processing_retry_button");
        String strO3 = d0.o(languageManager$Companion, "smart_selfie_processing_quit_button");
        h hVar = new h(this, 0);
        h hVar2 = new h(this, 2);
        int i10 = L6.i.ppDefaultDialogTheme;
        c cVar = new c(this);
        cVar.f6614u = 1;
        cVar.f(strO);
        cVar.f6607m = i7;
        cVar.f6598d = charSequenceB;
        cVar.f6600f = strO2;
        cVar.f6602h = hVar;
        cVar.f6601g = strO3;
        cVar.f6603i = hVar2;
        cVar.f6605k = true;
        cVar.f6606l = 0;
        cVar.f6615v = i10;
        d dialog = cVar.g();
        dialog.setCancelable(false);
        dialog.setCanceledOnTouchOutside(false);
        Intrinsics.checkNotNullExpressionValue(dialog, "dialog");
    }

    public final void k() {
        p292t6.a.a("startTimer--------------");
        CountdownProgressViewV2 countdownProgressViewV2 = this.f23845X;
        if (countdownProgressViewV2 == null) {
            Intrinsics.n("countdownProgressView");
            throw null;
        }
        if (countdownProgressViewV2.getVisibility() != 0) {
            CountdownProgressViewV2 countdownProgressViewV3 = this.f23845X;
            if (countdownProgressViewV3 == null) {
                Intrinsics.n("countdownProgressView");
                throw null;
            }
            countdownProgressViewV3.setVisibility(0);
        }
        CountdownProgressViewV2 countdownProgressViewV4 = this.f23845X;
        if (countdownProgressViewV4 != null) {
            countdownProgressViewV4.a(new j(this, 1));
        } else {
            Intrinsics.n("countdownProgressView");
            throw null;
        }
    }

    @Override // androidx.activity.AbstractActivityC0822m, android.app.Activity
    public final void onBackPressed() {
        j();
    }

    /* JADX WARN: Code duplicated, block: B:38:0x00dd  */
    @Override // androidx.fragment.app.E, androidx.activity.AbstractActivityC0822m, androidx.core.app.AbstractActivityC1040i, android.app.Activity
    public final void onCreate(Bundle bundle) {
        boolean z3;
        String stringExtra;
        String stringExtra2;
        LiveID$ILiveIDMonitor liveID$ILiveIDMonitor;
        LiveID$ILiveIDMonitor liveID$ILiveIDMonitor2;
        ExtendFeature extendFeature;
        ExtendFeature extendFeature2;
        String businessTxt;
        View decorView;
        View decorView2;
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
        this.f23854j = lTitleBar;
        if (lTitleBar == null) {
            Intrinsics.n("titleBar");
            throw null;
        }
        lTitleBar.setBackButtonClickListener(new h(this, 3));
        View viewFindViewById = findViewById(t.face_pp_license);
        r6.a aVar = p.f41237d;
        if (aVar != null ? Boolean.TRUE.equals(aVar.f41572d) : false) {
            if (viewFindViewById != null) {
                viewFindViewById.setVisibility(0);
            }
        } else if (viewFindViewById != null) {
            viewFindViewById.setVisibility(8);
        }
        LTitleBar lTitleBar2 = this.f23854j;
        if (lTitleBar2 == null) {
            Intrinsics.n("titleBar");
            throw null;
        }
        this.f23845X = (CountdownProgressViewV2) lTitleBar2.findViewById(t.tv_right);
        TextView textView = (TextView) findViewById(t.face_bottom_tips_tv);
        r6.a aVar2 = p.f41237d;
        if (aVar2 != null && (extendFeature2 = aVar2.f41587s) != null && (businessTxt = extendFeature2.getBusinessTxt()) != null) {
            z3 = StringsKt.F(businessTxt) ^ true;
        }
        if (z3) {
            TextView textView2 = (TextView) findViewById(t.face_business_tips_tv);
            textView2.setVisibility(0);
            r6.a aVar3 = p.f41237d;
            textView2.setText((aVar3 == null || (extendFeature = aVar3.f41587s) == null) ? null : extendFeature.getBusinessTxt());
        }
        AlgorithmScheduleProgressBar algorithmScheduleProgressBar = (AlgorithmScheduleProgressBar) findViewById(t.face_algorithm_schedule_progressbar);
        this.f23847b = (PreviewView) findViewById(t.camera_preview);
        this.f23855o = (LivenessStepLayout) findViewById(t.face_step);
        this.f23856p = (ViewFlipper) findViewById(t.liveness_view_flipper);
        Intent intent = getIntent();
        if (intent == null || (stringExtra = intent.getStringExtra("KEY_TRANSACTION_ID")) == null) {
            stringExtra = "";
        }
        this.f23851f = stringExtra;
        Intent intent2 = getIntent();
        if (intent2 == null || (stringExtra2 = intent2.getStringExtra("KEY_UPLOAD_URL")) == null) {
            stringExtra2 = "";
        }
        this.f23852g = stringExtra2;
        Intent intent3 = getIntent();
        this.f23853i = intent3 != null ? intent3.getIntExtra("KEY_FILE_TYPE", 2) : 2;
        String str = this.f23851f;
        if (str == null) {
            Intrinsics.n("transactionId");
            throw null;
        }
        if (!TextUtils.isEmpty(str)) {
            String str2 = this.f23852g;
            if (str2 == null) {
                Intrinsics.n("uploadUrl");
                throw null;
            }
            if (!TextUtils.isEmpty(str2) && p.f41246m) {
                e eVarG = g();
                String str3 = this.f23851f;
                if (str3 == null) {
                    Intrinsics.n("transactionId");
                    throw null;
                }
                eVarG.t = str3;
                try {
                    this.f23848c = ShadowExecutors.newOptimizedSingleThreadExecutor("\u200bcom.palmpay.lib.liveness.ui.LivenessActivity");
                    ListenableFuture<androidx.camera.lifecycle.h> fVar = androidx.camera.lifecycle.h.f14527i.getInstance(this);
                    fVar.addListener(new g(4, this, fVar), androidx.core.content.d.d(this));
                    WindowManager.LayoutParams attributes = getWindow().getAttributes();
                    this.f23850e = attributes.screenBrightness;
                    Window window3 = getWindow();
                    attributes.screenBrightness = 1.0f;
                    window3.setAttributes(attributes);
                    getWindow().addFlags(128);
                    r6.a aVar4 = p.f41237d;
                    if (aVar4 != null && (liveID$ILiveIDMonitor2 = aVar4.f41573e) != null) {
                        p320v6.d dVar = p320v6.e.f43076d;
                        String str4 = dVar.f43071a;
                        Pair pair = new Pair("event_desc", dVar.f43072b);
                        Integer num = p.f41243j;
                        Pair pair2 = new Pair("scene", Integer.valueOf(num != null ? num.intValue() : -1));
                        String str5 = this.f23851f;
                        if (str5 == null) {
                            Intrinsics.n("transactionId");
                            throw null;
                        }
                        Pair pair3 = new Pair("transactionId", str5);
                        String str6 = p.f41242i;
                        liveID$ILiveIDMonitor2.report(str4, kotlin.collections.G.h(pair, pair2, pair3, new Pair("uuid", str6 != null ? str6 : "")));
                    }
                    AbstractC0780y.m(V.f(this), null, null, new r(this, textView, algorithmScheduleProgressBar, null), 3);
                    LTitleBar lTitleBar3 = this.f23854j;
                    if (lTitleBar3 == null) {
                        Intrinsics.n("titleBar");
                        throw null;
                    }
                    ViewGroup.LayoutParams layoutParams = lTitleBar3.getRightImageView1().getLayoutParams();
                    int i7 = (int) (((double) (24 * getResources().getDisplayMetrics().density)) + 0.5d);
                    layoutParams.width = i7;
                    layoutParams.height = i7;
                    LTitleBar lTitleBar4 = this.f23854j;
                    if (lTitleBar4 == null) {
                        Intrinsics.n("titleBar");
                        throw null;
                    }
                    lTitleBar4.getRightImageView1().setLayoutParams(layoutParams);
                    AbstractC0780y.m(V.f(this), null, null, new p364y6.p(this, null), 3);
                    PreviewView previewView = this.f23847b;
                    if (previewView != null) {
                        previewView.post(new i(this, 2));
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
            p320v6.d dVar2 = p320v6.e.f43079g;
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
        if (this.f23850e != -9.0f) {
            Window window = getWindow();
            WindowManager.LayoutParams attributes = getWindow().getAttributes();
            attributes.screenBrightness = this.f23850e;
            window.setAttributes(attributes);
        }
        getWindow().clearFlags(128);
        d dVar = this.f23849d;
        if (dVar != null) {
            dVar.dismiss();
        }
        a aVar = this.f23843M;
        if (aVar != null) {
            aVar.r();
        }
        ExecutorService executorService = this.f23848c;
        if (executorService != null) {
            executorService.shutdown();
        }
    }

    @Override // androidx.appcompat.app.AbstractActivityC0837o, androidx.fragment.app.E, android.app.Activity
    public final void onStop() {
        super.onStop();
        a aVar = this.f23843M;
        if (aVar != null) {
            aVar.r();
        }
    }
}
