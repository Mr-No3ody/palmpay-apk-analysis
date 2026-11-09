package com.palmpay.lib.liveness.video;

import Ae.n;
import B5.c;
import C6.e;
import C6.h;
import C6.j;
import C6.k;
import C6.l;
import C6.o;
import C6.p;
import C6.v;
import D6.f;
import E.A;
import E.C;
import E.C0211p;
import E.Z;
import L6.i;
import O6.d;
import Wf.AbstractC0780y;
import Wf.B;
import android.content.Intent;
import android.hardware.camera2.CaptureRequest;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.util.Range;
import android.util.Size;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.TextView;
import androidx.appcompat.app.AbstractActivityC0837o;
import androidx.camera.camera2.impl.b;
import androidx.camera.core.impl.C0971c;
import androidx.camera.core.impl.C0992m0;
import androidx.camera.core.impl.ImageOutputConfig;
import androidx.camera.core.impl.W;
import androidx.camera.core.impl.utils.executor.g;
import androidx.camera.view.PreviewView;
import androidx.lifecycle.V;
import androidx.lifecycle.b0;
import com.didiglobal.booster.instrument.ShadowHandlerThread;
import com.didiglobal.booster.instrument.ShadowThread;
import com.google.common.util.concurrent.ListenableFuture;
import com.google.firebase.crashlytics.internal.metadata.UserMetadata;
import com.horcrux.svg.d0;
import com.palmpay.lib.liveness.LiveID$ILiveIDMonitor;
import com.palmpay.lib.liveness.lang.LanguageManager$Companion;
import com.palmpay.lib.liveness.model.LiveIDException;
import com.palmpay.lib.liveness.result.LiveIDResult;
import com.palmpay.lib.liveness.ui.widget.AlgorithmScheduleProgressBar;
import com.palmpay.lib.ui.titlebar.PpTitleBar;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.G;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import p232p6.t;
import p232p6.u;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0006"}, d2 = {"Lcom/palmpay/lib/liveness/video/VideoActivity;", "Landroidx/appcompat/app/o;", "<init>", "()V", "a", "C6/d", "lib_liveness_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nVideoActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 VideoActivity.kt\ncom/palmpay/lib/liveness/video/VideoActivity\n+ 2 ActivityViewModelLazy.kt\nandroidx/activity/ActivityViewModelLazyKt\n+ 3 DialogExt.kt\ncom/palmpay/lib/ui/dialog/DialogExtKt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,420:1\n75#2,13:421\n9#3,66:434\n9#3,66:500\n1#4:566\n*S KotlinDebug\n*F\n+ 1 VideoActivity.kt\ncom/palmpay/lib/liveness/video/VideoActivity\n*L\n65#1:421,13\n212#1:434,66\n242#1:500,66\n*E\n"})
public final class VideoActivity extends AbstractActivityC0837o {

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public static final Size f23949B;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public PreviewView f23951a;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public d f23954d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public String f23955e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public String f23956f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public String f23957g;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f23958i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public B f23959j;
    public int t;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public float f23952b = -9.0f;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final b0 f23953c = new b0(G.a(v.class), new h(this, 1), new h(this, 0), new h(this, 2));

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final ArrayList f23960o = new ArrayList();

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final Integer[] f23961p = {-65536, -256, -16776961, -16711936};

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final Handler f23962v = new Handler(Looper.getMainLooper());

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final c f23963w = new c(this, 2);

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public final n f23950A = new n(this, 2);

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final Size getTARGET_RESOLUTION_SIZE() {
            return VideoActivity.f23949B;
        }

        private a() {
        }
    }

    static {
        new a(null);
        f23949B = new Size(480, 640);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0015  */
    public static final Object e(VideoActivity videoActivity, Ff.c cVar) throws Throwable {
        e eVar;
        if (cVar instanceof e) {
            eVar = (e) cVar;
            int i7 = eVar.f1168d;
            if ((i7 & Integer.MIN_VALUE) != 0) {
                eVar.f1168d = i7 - Integer.MIN_VALUE;
            } else {
                eVar = new e(videoActivity, cVar);
            }
        } else {
            eVar = new e(videoActivity, cVar);
        }
        Object objH = eVar.f1166b;
        Ef.a aVar = Ef.a.f2423a;
        int i10 = eVar.f1168d;
        if (i10 == 0) {
            g.M(objH);
            ListenableFuture<androidx.camera.lifecycle.h> fVar = androidx.camera.lifecycle.h.f14527i.getInstance(videoActivity);
            eVar.f1165a = videoActivity;
            eVar.f1168d = 1;
            objH = G8.a.h(fVar, eVar);
            if (objH == aVar) {
                return aVar;
            }
        } else {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            videoActivity = eVar.f1165a;
            g.M(objH);
        }
        androidx.camera.lifecycle.h hVar = (androidx.camera.lifecycle.h) objH;
        if (videoActivity.f23960o.size() == 0) {
            int i11 = p292t6.a.f42345a;
            Intrinsics.checkNotNullParameter("Error: This device does not have any camera, bailing out", "msg");
            Intrinsics.checkNotNullParameter("Liveness", "tag");
            Intrinsics.checkNotNullParameter("Error: This device does not have any camera, bailing out", "msg");
            videoActivity.g();
            return Unit.f38893a;
        }
        ArrayList arrayList = videoActivity.f23960o;
        C0211p c0211p = ((C6.d) arrayList.get(0 % arrayList.size())).f1163a;
        Z z3 = new Z();
        CaptureRequest.Key key = CaptureRequest.CONTROL_AE_TARGET_FPS_RANGE;
        Range range = new Range(new Integer(24), new Integer(24));
        C0971c c0971cK = b.k(key);
        W w3 = W.f13994a;
        C0992m0 c0992m0 = z3.f1976a;
        c0992m0.insertOption(c0971cK, w3, range);
        c0992m0.insertOption(ImageOutputConfig.f13899D, f23949B);
        E.b0 b0VarA = z3.build();
        PreviewView previewView = videoActivity.f23951a;
        if (previewView == null) {
            Intrinsics.n("cameraPreview");
            throw null;
        }
        b0VarA.E(previewView.getSurfaceProvider());
        Intrinsics.checkNotNullExpressionValue(b0VarA, "apply(...)");
        try {
            hVar.unbindAll();
            C cA = new A().build();
            cA.G(androidx.core.content.d.d(videoActivity), new C6.c(videoActivity.f()));
            Unit unit = Unit.f38893a;
            hVar.d(videoActivity, c0211p, b0VarA, cA);
        } catch (Exception e10) {
            int i12 = p292t6.a.f42345a;
            p292t6.a.b("Use case binding failed : " + e10.getMessage());
            videoActivity.g();
        }
        return Unit.f38893a;
    }

    public final v f() {
        return (v) this.f23953c.getValue();
    }

    public final void g() {
        Intent intent = new Intent();
        Bundle bundle = new Bundle();
        f fVar = f.f1630o;
        bundle.putParcelable("key_bundle_live_id_result", new LiveIDResult.Error(new LiveIDException(fVar.f1633a, fVar.f1634b, null, null, 12, null)));
        setResult(-1, intent.putExtras(bundle));
        finish();
    }

    public final void h() {
        Handler handler = this.f23962v;
        handler.removeCallbacksAndMessages(null);
        handler.post(this.f23950A);
    }

    public final void i() {
        h();
        v vVarF = f();
        vVarF.f1222C = false;
        o oVar = vVarF.f1227X;
        if (oVar != null) {
            oVar.f1196i = false;
        }
        LanguageManager$Companion languageManager$Companion = p280s6.a.f42044a;
        String strO = d0.o(languageManager$Companion, "smart_quit_title");
        String strO2 = d0.o(languageManager$Companion, "smart_quit_msg");
        String strO3 = d0.o(languageManager$Companion, "smart_selfie_processing_retry_button");
        String strO4 = d0.o(languageManager$Companion, "smart_selfie_processing_quit_button");
        C6.a aVar = new C6.a(this, 0);
        C6.a aVar2 = new C6.a(this, 1);
        int i7 = i.ppDefaultDialogTheme;
        O6.c cVar = new O6.c(this);
        cVar.f6614u = 1;
        cVar.f(strO);
        cVar.f6598d = strO2;
        cVar.f6600f = strO3;
        cVar.f6602h = aVar;
        cVar.f6601g = strO4;
        cVar.f6603i = aVar2;
        cVar.f6605k = true;
        cVar.f6606l = 0;
        cVar.f6615v = i7;
        d dialog = cVar.g();
        dialog.setCancelable(false);
        dialog.setCanceledOnTouchOutside(false);
        Intrinsics.checkNotNullExpressionValue(dialog, "dialog");
    }

    @Override // androidx.activity.AbstractActivityC0822m, android.app.Activity
    public final void onBackPressed() {
        i();
    }

    @Override // androidx.fragment.app.E, androidx.activity.AbstractActivityC0822m, androidx.core.app.AbstractActivityC1040i, android.app.Activity
    public final void onCreate(Bundle bundle) {
        String stringExtra;
        String stringExtra2;
        String stringExtra3;
        LiveID$ILiveIDMonitor liveID$ILiveIDMonitor;
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
        setContentView(u.lib_liveness_video);
        this.f23951a = (PreviewView) findViewById(t.camera_preview);
        ((PpTitleBar) findViewById(t.face_titlebar)).setBackButtonClickListener(new C6.a(this, 2));
        TextView textView = (TextView) findViewById(t.face_bottom_tips_tv);
        AlgorithmScheduleProgressBar algorithmScheduleProgressBar = (AlgorithmScheduleProgressBar) findViewById(t.face_algorithm_schedule_progressbar);
        Intent intent = getIntent();
        if (intent == null || (stringExtra = intent.getStringExtra("KEY_TRANSACTION_ID")) == null) {
            stringExtra = "";
        }
        this.f23955e = stringExtra;
        Intent intent2 = getIntent();
        if (intent2 == null || (stringExtra2 = intent2.getStringExtra("KEY_UPLOAD_URL")) == null) {
            stringExtra2 = "";
        }
        this.f23956f = stringExtra2;
        Intent intent3 = getIntent();
        if (intent3 == null || (stringExtra3 = intent3.getStringExtra("KEY_UPLOAD_VIDEO_URL")) == null) {
            stringExtra3 = "";
        }
        this.f23957g = stringExtra3;
        Intent intent4 = getIntent();
        this.f23958i = intent4 != null ? intent4.getIntExtra("KEY_FILE_TYPE", 1) : 1;
        String str = this.f23955e;
        if (str == null) {
            Intrinsics.n("transactionId");
            throw null;
        }
        if (!TextUtils.isEmpty(str)) {
            String str2 = this.f23956f;
            if (str2 == null) {
                Intrinsics.n("uploadUrl");
                throw null;
            }
            if (!TextUtils.isEmpty(str2)) {
                AbstractC0780y.m(V.f(this), null, null, new C6.g(this, textView, algorithmScheduleProgressBar, null), 3);
                v vVarF = f();
                vVarF.f1228Y = Boolean.FALSE;
                vVarF.f1224L = 0;
                p pVar = new p(vVarF, 0);
                o oVar = new o();
                oVar.f1188a = pVar;
                vVarF.f1227X = oVar;
                ShadowHandlerThread shadowHandlerThread = new ShadowHandlerThread("MediaCodecHandlerThread", "\u200bcom.palmpay.lib.liveness.video.VideoEncoder");
                ShadowThread.setThreadName(shadowHandlerThread, "\u200bcom.palmpay.lib.liveness.video.VideoEncoder").start();
                Handler handler = new Handler(shadowHandlerThread.getLooper());
                oVar.f1195h = handler;
                handler.post(new l(oVar, 1));
                try {
                    this.f23959j = AbstractC0780y.d(V.f(this), null, new j(this, null), 3);
                    AbstractC0780y.m(V.f(this), null, null, new k(this, null), 3);
                    WindowManager.LayoutParams attributes = getWindow().getAttributes();
                    this.f23952b = attributes.screenBrightness;
                    Window window3 = getWindow();
                    attributes.screenBrightness = 1.0f;
                    window3.setAttributes(attributes);
                    return;
                } catch (Exception unused) {
                    Intent intent5 = new Intent();
                    Bundle bundle2 = new Bundle();
                    f fVar = f.f1630o;
                    bundle2.putParcelable("key_bundle_live_id_result", new LiveIDResult.Error(new LiveIDException(fVar.f1633a, fVar.f1634b, null, null, 12, null)));
                    setResult(-1, intent5.putExtras(bundle2));
                    finish();
                    return;
                }
            }
        }
        r6.a aVar = p232p6.p.f41237d;
        if (aVar != null && (liveID$ILiveIDMonitor = aVar.f41573e) != null) {
            p320v6.d dVar = p320v6.e.f43079g;
            String str3 = dVar.f43071a;
            Pair pair = new Pair("event_desc", dVar.f43072b);
            Integer num = p232p6.p.f41243j;
            Pair pair2 = new Pair("scene", Integer.valueOf(num != null ? num.intValue() : -1));
            Pair pair3 = new Pair("code", "-99");
            Pair pair4 = new Pair("msg", "params is empty");
            String str4 = p232p6.p.f41242i;
            liveID$ILiveIDMonitor.report(str3, kotlin.collections.G.h(pair, pair2, pair3, pair4, new Pair("uuid", str4 != null ? str4 : "")));
        }
        finish();
    }

    @Override // androidx.appcompat.app.AbstractActivityC0837o, androidx.fragment.app.E, android.app.Activity
    public final void onDestroy() {
        super.onDestroy();
        if (this.f23952b != -9.0f) {
            Window window = getWindow();
            WindowManager.LayoutParams attributes = getWindow().getAttributes();
            attributes.screenBrightness = this.f23952b;
            window.setAttributes(attributes);
        }
        d dVar = this.f23954d;
        if (dVar != null) {
            dVar.dismiss();
        }
        this.f23962v.removeCallbacksAndMessages(null);
        v vVarF = f();
        vVarF.f1222C = false;
        o oVar = vVarF.f1227X;
        if (oVar != null) {
            oVar.f1188a = null;
            Handler handler = oVar.f1195h;
            if (handler != null) {
                handler.post(new l(oVar, 2));
            }
        }
    }
}
