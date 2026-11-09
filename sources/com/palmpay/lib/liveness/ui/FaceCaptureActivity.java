package com.palmpay.lib.liveness.ui;

import D6.f;
import D6.m;
import L6.i;
import O6.c;
import O6.d;
import Wf.AbstractC0780y;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.text.TextUtils;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.TextView;
import androidx.appcompat.app.AbstractActivityC0837o;
import androidx.camera.lifecycle.h;
import androidx.camera.view.PreviewView;
import androidx.lifecycle.V;
import androidx.lifecycle.b0;
import com.google.common.util.concurrent.ListenableFuture;
import com.google.firebase.crashlytics.internal.metadata.UserMetadata;
import com.horcrux.svg.d0;
import com.palmpay.lib.liveness.LiveID$ILiveIDMonitor;
import com.palmpay.lib.liveness.lang.LanguageManager$Companion;
import com.palmpay.lib.liveness.model.LiveIDException;
import com.palmpay.lib.liveness.result.LiveIDResult;
import com.palmpay.lib.liveness.result.LiveSelfieResult;
import com.palmpay.lib.liveness.ui.widget.AlgorithmScheduleProgressBar;
import com.palmpay.lib.ui.titlebar.PpTitleBar;
import io.fastkv.n;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.G;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.Nullable;
import p232p6.p;
import p232p6.s;
import p232p6.t;
import p232p6.u;
import p297te.g;
import p364y6.e;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcom/palmpay/lib/liveness/ui/FaceCaptureActivity;", "Landroidx/appcompat/app/o;", "<init>", "()V", "a", "lib_liveness_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nFaceCaptureActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FaceCaptureActivity.kt\ncom/palmpay/lib/liveness/ui/FaceCaptureActivity\n+ 2 ActivityViewModelLazy.kt\nandroidx/activity/ActivityViewModelLazyKt\n+ 3 DialogExt.kt\ncom/palmpay/lib/ui/dialog/DialogExtKt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,354:1\n75#2,13:355\n9#3,66:368\n9#3,66:435\n1#4:434\n*S KotlinDebug\n*F\n+ 1 FaceCaptureActivity.kt\ncom/palmpay/lib/liveness/ui/FaceCaptureActivity\n*L\n51#1:355,13\n190#1:368,66\n275#1:435,66\n*E\n"})
public final class FaceCaptureActivity extends AbstractActivityC0837o {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final a f23821i = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public PreviewView f23822a;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public d f23825d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public String f23826e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public String f23827f;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final b0 f23823b = new b0(G.a(m.class), new e(this, 1), new e(this, 0), new e(this, 2));

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public float f23824c = -9.0f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f23828g = 2;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @JvmStatic
        @Nullable
        public final LiveIDResult<LiveSelfieResult> resultFromBundle(@Nullable Bundle bundle) {
            Parcelable parcelable;
            if (bundle == null) {
                return null;
            }
            if (Build.VERSION.SDK_INT >= 34) {
                parcelable = (Parcelable) bundle.getParcelable("key_bundle_live_id_result", LiveIDResult.class);
            } else {
                Parcelable parcelable2 = bundle.getParcelable("key_bundle_live_id_result");
                parcelable = (LiveIDResult) (parcelable2 instanceof LiveIDResult ? parcelable2 : null);
            }
            return (LiveIDResult) parcelable;
        }

        private a() {
        }
    }

    public final void e() {
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

    public final m f() {
        return (m) this.f23823b.getValue();
    }

    public final void g() {
        f().f1672H = false;
        LanguageManager$Companion languageManager$Companion = p280s6.a.f42044a;
        String strO = d0.o(languageManager$Companion, "smart_quit_title");
        int i7 = s.lib_liveness_icon_quit;
        languageManager$Companion.getInstance().getClass();
        CharSequence charSequenceB = p280s6.a.b(this);
        String strO2 = d0.o(languageManager$Companion, "smart_selfie_processing_retry_button");
        String strO3 = d0.o(languageManager$Companion, "smart_selfie_processing_quit_button");
        p364y6.a aVar = new p364y6.a(this, 0);
        p364y6.a aVar2 = new p364y6.a(this, 1);
        int i10 = i.ppDefaultDialogTheme;
        c cVar = new c(this);
        cVar.f6614u = 1;
        cVar.f(strO);
        cVar.f6607m = i7;
        cVar.f6598d = charSequenceB;
        cVar.f6600f = strO2;
        cVar.f6602h = aVar;
        cVar.f6601g = strO3;
        cVar.f6603i = aVar2;
        cVar.f6605k = true;
        cVar.f6606l = 0;
        cVar.f6615v = i10;
        d dialog = cVar.g();
        dialog.setCancelable(false);
        dialog.setCanceledOnTouchOutside(false);
        Intrinsics.checkNotNullExpressionValue(dialog, "dialog");
    }

    @Override // androidx.activity.AbstractActivityC0822m, android.app.Activity
    public final void onBackPressed() {
        g();
    }

    @Override // androidx.fragment.app.E, androidx.activity.AbstractActivityC0822m, androidx.core.app.AbstractActivityC1040i, android.app.Activity
    public final void onCreate(Bundle bundle) {
        String stringExtra;
        String stringExtra2;
        LiveID$ILiveIDMonitor liveID$ILiveIDMonitor;
        LiveID$ILiveIDMonitor liveID$ILiveIDMonitor2;
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
        setContentView(u.lib_liveness_single);
        View viewFindViewById = findViewById(t.face_pp_license);
        r6.a aVar = p.f41237d;
        if (aVar != null ? Boolean.TRUE.equals(aVar.f41572d) : false) {
            if (viewFindViewById != null) {
                viewFindViewById.setVisibility(0);
            }
        } else if (viewFindViewById != null) {
            viewFindViewById.setVisibility(8);
        }
        ((PpTitleBar) findViewById(t.face_titlebar)).setBackButtonClickListener(new p364y6.a(this, 2));
        TextView textView = (TextView) findViewById(t.face_bottom_tips_tv);
        AlgorithmScheduleProgressBar algorithmScheduleProgressBar = (AlgorithmScheduleProgressBar) findViewById(t.face_algorithm_schedule_progressbar);
        this.f23822a = (PreviewView) findViewById(t.camera_preview);
        Intent intent = getIntent();
        if (intent == null || (stringExtra = intent.getStringExtra("KEY_TRANSACTION_ID")) == null) {
            stringExtra = "";
        }
        this.f23826e = stringExtra;
        Intent intent2 = getIntent();
        if (intent2 == null || (stringExtra2 = intent2.getStringExtra("KEY_UPLOAD_URL")) == null) {
            stringExtra2 = "";
        }
        this.f23827f = stringExtra2;
        Intent intent3 = getIntent();
        this.f23828g = intent3 != null ? intent3.getIntExtra("KEY_FILE_TYPE", 2) : 2;
        String str = this.f23826e;
        if (str == null) {
            Intrinsics.n("transactionId");
            throw null;
        }
        if (!TextUtils.isEmpty(str)) {
            String str2 = this.f23827f;
            if (str2 == null) {
                Intrinsics.n("uploadUrl");
                throw null;
            }
            if (!TextUtils.isEmpty(str2) && p.f41246m) {
                try {
                    m mVarF = f();
                    String str3 = this.f23826e;
                    if (str3 == null) {
                        Intrinsics.n("transactionId");
                        throw null;
                    }
                    mVarF.f1670B = str3;
                    ListenableFuture<h> fVar = h.f14527i.getInstance(this);
                    fVar.addListener(new g(3, this, fVar), androidx.core.content.d.d(this));
                    WindowManager.LayoutParams attributes = getWindow().getAttributes();
                    this.f23824c = attributes.screenBrightness;
                    Window window3 = getWindow();
                    attributes.screenBrightness = 1.0f;
                    window3.setAttributes(attributes);
                    r6.a aVar2 = p.f41237d;
                    if (aVar2 != null && (liveID$ILiveIDMonitor2 = aVar2.f41573e) != null) {
                        p320v6.d dVar = p320v6.e.f43076d;
                        String str4 = dVar.f43071a;
                        Pair pair = new Pair("event_desc", dVar.f43072b);
                        Integer num = p.f41243j;
                        Pair pair2 = new Pair("scene", Integer.valueOf(num != null ? num.intValue() : -1));
                        String str5 = this.f23826e;
                        if (str5 == null) {
                            Intrinsics.n("transactionId");
                            throw null;
                        }
                        Pair pair3 = new Pair("transactionId", str5);
                        String str6 = p.f41242i;
                        liveID$ILiveIDMonitor2.report(str4, kotlin.collections.G.h(pair, pair2, pair3, new Pair("uuid", str6 != null ? str6 : "")));
                    }
                    AbstractC0780y.m(V.f(this), null, null, new p364y6.d(this, textView, algorithmScheduleProgressBar, null), 3);
                    return;
                } catch (Exception unused) {
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
        r6.a aVar3 = p.f41237d;
        if (aVar3 != null && (liveID$ILiveIDMonitor = aVar3.f41573e) != null) {
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
        if (this.f23824c != -9.0f) {
            Window window = getWindow();
            WindowManager.LayoutParams attributes = getWindow().getAttributes();
            attributes.screenBrightness = this.f23824c;
            window.setAttributes(attributes);
        }
        d dVar = this.f23825d;
        if (dVar != null) {
            dVar.dismiss();
        }
    }
}
