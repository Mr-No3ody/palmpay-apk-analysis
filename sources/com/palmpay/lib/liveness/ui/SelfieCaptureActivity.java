package com.palmpay.lib.liveness.ui;

import D6.f;
import D6.g;
import D6.m;
import E.AbstractC0198c;
import Gb.L;
import L6.i;
import O6.c;
import O6.d;
import Wf.AbstractC0780y;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.TextView;
import androidx.appcompat.app.AbstractActivityC0837o;
import androidx.camera.lifecycle.h;
import androidx.camera.view.C1027h;
import androidx.camera.view.PreviewView;
import androidx.lifecycle.V;
import androidx.lifecycle.b0;
import com.google.common.util.concurrent.ListenableFuture;
import com.google.firebase.crashlytics.internal.metadata.UserMetadata;
import com.horcrux.svg.d0;
import com.palmpay.lib.liveness.LiveID$ILiveIDMonitor;
import com.palmpay.lib.liveness.lang.LanguageManager$Companion;
import com.palmpay.lib.liveness.model.ExtendFeature;
import com.palmpay.lib.liveness.model.LiveIDException;
import com.palmpay.lib.liveness.result.LiveIDResult;
import com.palmpay.lib.liveness.ui.SelfieCaptureActivity;
import com.palmpay.lib.liveness.ui.widget.AlgorithmScheduleProgressBar;
import com.palmpay.lib.liveness.ui.widget.LTitleBar;
import com.palmpay.lib.ui.button.PpButton;
import io.fastkv.n;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.G;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt;
import p232p6.p;
import p232p6.s;
import p232p6.u;
import p320v6.e;
import p325vb.a;
import p355xf.l;
import p364y6.t;
import p364y6.v;
import p364y6.x;
import p364y6.y;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcom/palmpay/lib/liveness/ui/SelfieCaptureActivity;", "Landroidx/appcompat/app/o;", "<init>", "()V", "y6/v", "lib_liveness_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nSelfieCaptureActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SelfieCaptureActivity.kt\ncom/palmpay/lib/liveness/ui/SelfieCaptureActivity\n+ 2 ActivityViewModelLazy.kt\nandroidx/activity/ActivityViewModelLazyKt\n+ 3 DialogExt.kt\ncom/palmpay/lib/ui/dialog/DialogExtKt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,466:1\n75#2,13:467\n9#3,66:480\n9#3,66:547\n1#4:546\n*S KotlinDebug\n*F\n+ 1 SelfieCaptureActivity.kt\ncom/palmpay/lib/liveness/ui/SelfieCaptureActivity\n*L\n67#1:467,13\n298#1:480,66\n393#1:547,66\n*E\n"})
public final class SelfieCaptureActivity extends AbstractActivityC0837o {

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final /* synthetic */ int f23859v = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public C1027h f23860a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public PreviewView f23861b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public PpButton f23862c;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public d f23865f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public String f23866g;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public String f23867i;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f23869o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public L f23870p;
    public AlgorithmScheduleProgressBar t;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final b0 f23863d = new b0(G.a(m.class), new y(this, 0), new a(this, 5), new y(this, 1));

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public float f23864e = -9.0f;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f23868j = 2;

    public static final void e(SelfieCaptureActivity selfieCaptureActivity) {
        Intent intent = new Intent();
        f fVar = f.t;
        LiveIDResult.Error error = new LiveIDResult.Error(new LiveIDException(fVar.f1633a, fVar.f1634b, null, null, 12, null));
        Bundle bundle = new Bundle();
        bundle.putParcelable("key_bundle_live_id_result", error);
        n.H(error);
        selfieCaptureActivity.setResult(-1, intent.putExtras(bundle));
        selfieCaptureActivity.finish();
    }

    public static final void f(final SelfieCaptureActivity selfieCaptureActivity, g gVar) {
        selfieCaptureActivity.getClass();
        LanguageManager$Companion languageManager$Companion = p280s6.a.f42044a;
        String strO = d0.o(languageManager$Companion, "smart_selfie_capture_timeout_text");
        String strO2 = d0.o(languageManager$Companion, "smart_selfie_pick_photo_msg");
        String strO3 = d0.o(languageManager$Companion, "smart_selfie_processing_retry_button");
        int iOrdinal = gVar.ordinal();
        if (iOrdinal == 0) {
            if (selfieCaptureActivity.isDestroyed() || selfieCaptureActivity.isFinishing()) {
                return;
            }
            selfieCaptureActivity.i();
            return;
        }
        if (iOrdinal == 1) {
            if (selfieCaptureActivity.isDestroyed() || selfieCaptureActivity.isFinishing()) {
                return;
            }
            d dVar = selfieCaptureActivity.f23865f;
            if (dVar != null) {
                dVar.dismiss();
            }
            final int i7 = 0;
            selfieCaptureActivity.h().d(new Function1(selfieCaptureActivity) { // from class: y6.u

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final /* synthetic */ SelfieCaptureActivity f44110b;

                {
                    this.f44110b = selfieCaptureActivity;
                }

                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    SelfieCaptureActivity selfieCaptureActivity2 = this.f44110b;
                    LiveIDResult it = (LiveIDResult) obj;
                    switch (i7) {
                        case 0:
                            int i10 = SelfieCaptureActivity.f23859v;
                            Intrinsics.checkNotNullParameter(it, "it");
                            Intent intent = new Intent();
                            Bundle bundle = new Bundle();
                            bundle.putParcelable("key_bundle_live_id_result", it);
                            n.H(it);
                            selfieCaptureActivity2.setResult(-1, intent.putExtras(bundle));
                            selfieCaptureActivity2.finish();
                            break;
                        default:
                            int i11 = SelfieCaptureActivity.f23859v;
                            Intrinsics.checkNotNullParameter(it, "it");
                            Intent intent2 = new Intent();
                            Bundle bundle2 = new Bundle();
                            bundle2.putParcelable("key_bundle_live_id_result", it);
                            n.H(it);
                            selfieCaptureActivity2.setResult(-1, intent2.putExtras(bundle2));
                            selfieCaptureActivity2.finish();
                            break;
                    }
                    return Unit.f38893a;
                }
            });
            return;
        }
        if (iOrdinal == 2) {
            if (selfieCaptureActivity.isDestroyed() || selfieCaptureActivity.isFinishing()) {
                return;
            }
            d dVar2 = selfieCaptureActivity.f23865f;
            if (dVar2 != null) {
                dVar2.dismiss();
            }
            final int i10 = 1;
            selfieCaptureActivity.h().d(new Function1(selfieCaptureActivity) { // from class: y6.u

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final /* synthetic */ SelfieCaptureActivity f44110b;

                {
                    this.f44110b = selfieCaptureActivity;
                }

                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    SelfieCaptureActivity selfieCaptureActivity2 = this.f44110b;
                    LiveIDResult it = (LiveIDResult) obj;
                    switch (i10) {
                        case 0:
                            int i11 = SelfieCaptureActivity.f23859v;
                            Intrinsics.checkNotNullParameter(it, "it");
                            Intent intent = new Intent();
                            Bundle bundle = new Bundle();
                            bundle.putParcelable("key_bundle_live_id_result", it);
                            n.H(it);
                            selfieCaptureActivity2.setResult(-1, intent.putExtras(bundle));
                            selfieCaptureActivity2.finish();
                            break;
                        default:
                            int i12 = SelfieCaptureActivity.f23859v;
                            Intrinsics.checkNotNullParameter(it, "it");
                            Intent intent2 = new Intent();
                            Bundle bundle2 = new Bundle();
                            bundle2.putParcelable("key_bundle_live_id_result", it);
                            n.H(it);
                            selfieCaptureActivity2.setResult(-1, intent2.putExtras(bundle2));
                            selfieCaptureActivity2.finish();
                            break;
                    }
                    return Unit.f38893a;
                }
            });
            return;
        }
        if (iOrdinal != 3) {
            throw new l();
        }
        if (selfieCaptureActivity.isDestroyed() || selfieCaptureActivity.isFinishing()) {
            return;
        }
        d dVar3 = selfieCaptureActivity.f23865f;
        if (dVar3 != null) {
            dVar3.dismiss();
        }
        int i11 = s.lib_liveness_face_error;
        t tVar = new t(selfieCaptureActivity, 4);
        int i12 = i.ppDefaultDialogTheme;
        c cVar = new c(selfieCaptureActivity);
        cVar.f6614u = 1;
        cVar.f(strO);
        cVar.f6607m = i11;
        cVar.f6598d = strO2;
        cVar.f6600f = strO3;
        cVar.f6602h = tVar;
        cVar.f6605k = true;
        cVar.f6606l = 0;
        cVar.f6615v = i12;
        d dialog = cVar.g();
        dialog.setCancelable(false);
        dialog.setCanceledOnTouchOutside(false);
        Intrinsics.checkNotNullExpressionValue(dialog, "dialog");
    }

    @Override // androidx.appcompat.app.AbstractActivityC0837o, android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    public final void attachBaseContext(Context newBase) {
        Intrinsics.checkNotNullParameter(newBase, "newBase");
        super.attachBaseContext(AbstractC0198c.a0(newBase, p280s6.a.f42044a.getUserLanguage(newBase)));
    }

    public final void g() {
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

    public final m h() {
        return (m) this.f23863d.getValue();
    }

    public final void i() {
        if (this.f23865f == null) {
            LanguageManager$Companion languageManager$Companion = p280s6.a.f42044a;
            String strO = d0.o(languageManager$Companion, "smart_selfie_processing_title");
            String strO2 = d0.o(languageManager$Companion, "smart_selfie_processing_msg");
            c cVar = new c(this);
            cVar.f6605k = true;
            cVar.f6596b = d.f(strO);
            cVar.f6598d = strO2;
            cVar.f6607m = s.lib_liveness_face_loading;
            d dVarA = cVar.a();
            this.f23865f = dVarA;
            dVarA.setCancelable(false);
        }
        d dVar = this.f23865f;
        if (dVar != null) {
            dVar.show();
        }
    }

    public final void j() {
        h().f1672H = false;
        L l5 = this.f23870p;
        if (l5 != null) {
            l5.cancel();
        }
        LanguageManager$Companion languageManager$Companion = p280s6.a.f42044a;
        String strO = d0.o(languageManager$Companion, "smart_quit_title");
        int i7 = s.lib_liveness_icon_quit;
        languageManager$Companion.getInstance().getClass();
        CharSequence charSequenceB = p280s6.a.b(this);
        String strO2 = d0.o(languageManager$Companion, "smart_selfie_processing_retry_button");
        String strO3 = d0.o(languageManager$Companion, "smart_selfie_processing_quit_button");
        t tVar = new t(this, 0);
        t tVar2 = new t(this, 1);
        int i10 = i.ppDefaultDialogTheme;
        c cVar = new c(this);
        cVar.f6614u = 1;
        cVar.f(strO);
        cVar.f6607m = i7;
        cVar.f6598d = charSequenceB;
        cVar.f6600f = strO2;
        cVar.f6602h = tVar;
        cVar.f6601g = strO3;
        cVar.f6603i = tVar2;
        cVar.f6605k = true;
        cVar.f6606l = 0;
        cVar.f6615v = i10;
        d dialog = cVar.g();
        dialog.setCancelable(false);
        dialog.setCanceledOnTouchOutside(false);
        Intrinsics.checkNotNullExpressionValue(dialog, "dialog");
    }

    public final void k() {
        if (this.f23870p == null) {
            this.f23870p = new L(this);
        }
        L l5 = this.f23870p;
        if (l5 != null) {
            l5.start();
        }
    }

    @Override // androidx.activity.AbstractActivityC0822m, android.app.Activity
    public final void onBackPressed() {
        j();
    }

    /* JADX WARN: Code duplicated, block: B:34:0x00db  */
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
        setContentView(u.lib_liveness_page);
        ((LTitleBar) findViewById(p232p6.t.face_titlebar)).setBackButtonClickListener(new t(this, 2));
        View viewFindViewById = findViewById(p232p6.t.face_pp_license);
        r6.a aVar = p.f41237d;
        if (aVar != null ? Boolean.TRUE.equals(aVar.f41572d) : false) {
            if (viewFindViewById != null) {
                viewFindViewById.setVisibility(0);
            }
        } else if (viewFindViewById != null) {
            viewFindViewById.setVisibility(8);
        }
        TextView textView = (TextView) findViewById(p232p6.t.face_bottom_tips_tv);
        LanguageManager$Companion languageManager$Companion = p280s6.a.f42044a;
        languageManager$Companion.getInstance().getClass();
        textView.setText(p280s6.a.a("smart_selfie_pick_photo_msg"));
        r6.a aVar2 = p.f41237d;
        if (aVar2 != null && (extendFeature2 = aVar2.f41587s) != null && (businessTxt = extendFeature2.getBusinessTxt()) != null) {
            z3 = StringsKt.F(businessTxt) ^ true;
        }
        if (z3) {
            TextView textView2 = (TextView) findViewById(p232p6.t.face_business_tips_tv);
            textView2.setVisibility(0);
            r6.a aVar3 = p.f41237d;
            textView2.setText((aVar3 == null || (extendFeature = aVar3.f41587s) == null) ? null : extendFeature.getBusinessTxt());
        }
        PpButton ppButton = (PpButton) findViewById(p232p6.t.capture_btn);
        this.f23862c = ppButton;
        if (ppButton == null) {
            Intrinsics.n("captureButton");
            throw null;
        }
        languageManager$Companion.getInstance().getClass();
        ppButton.setText(p280s6.a.a("smart_selfie_capture_btn_text"));
        PpButton ppButton2 = this.f23862c;
        if (ppButton2 == null) {
            Intrinsics.n("captureButton");
            throw null;
        }
        ppButton2.setEnabled(false);
        this.t = (AlgorithmScheduleProgressBar) findViewById(p232p6.t.face_algorithm_schedule_progressbar);
        PpButton ppButton3 = this.f23862c;
        if (ppButton3 == null) {
            Intrinsics.n("captureButton");
            throw null;
        }
        ppButton3.setOnClickListener(new v(new t(this, 3)));
        this.f23861b = (PreviewView) findViewById(p232p6.t.camera_preview);
        Intent intent = getIntent();
        if (intent == null || (stringExtra = intent.getStringExtra("KEY_TRANSACTION_ID")) == null) {
            stringExtra = "";
        }
        this.f23866g = stringExtra;
        Intent intent2 = getIntent();
        if (intent2 == null || (stringExtra2 = intent2.getStringExtra("KEY_UPLOAD_URL")) == null) {
            stringExtra2 = "";
        }
        this.f23867i = stringExtra2;
        Intent intent3 = getIntent();
        this.f23868j = intent3 != null ? intent3.getIntExtra("KEY_FILE_TYPE", 2) : 2;
        Intent intent4 = getIntent();
        this.f23869o = intent4 != null ? intent4.getIntExtra("KEY_DEAL_TYPE", 0) : 0;
        String str = this.f23866g;
        if (str == null) {
            Intrinsics.n("transactionId");
            throw null;
        }
        if (!TextUtils.isEmpty(str)) {
            String str2 = this.f23867i;
            if (str2 == null) {
                Intrinsics.n("uploadUrl");
                throw null;
            }
            if (!TextUtils.isEmpty(str2)) {
                try {
                    m mVarH = h();
                    String str3 = this.f23866g;
                    if (str3 == null) {
                        Intrinsics.n("transactionId");
                        throw null;
                    }
                    mVarH.f1670B = str3;
                    ListenableFuture<h> fVar = h.f14527i.getInstance(this);
                    fVar.addListener(new p297te.g(5, this, fVar), androidx.core.content.d.d(this));
                    WindowManager.LayoutParams attributes = getWindow().getAttributes();
                    this.f23864e = attributes.screenBrightness;
                    Window window3 = getWindow();
                    attributes.screenBrightness = 1.0f;
                    window3.setAttributes(attributes);
                    r6.a aVar4 = p.f41237d;
                    if (aVar4 != null && (liveID$ILiveIDMonitor2 = aVar4.f41573e) != null) {
                        p320v6.d dVar = e.f43076d;
                        String str4 = dVar.f43071a;
                        Pair pair = new Pair("event_desc", dVar.f43072b);
                        Integer num = p.f41243j;
                        Pair pair2 = new Pair("scene", Integer.valueOf(num != null ? num.intValue() : -1));
                        String str5 = this.f23866g;
                        if (str5 == null) {
                            Intrinsics.n("transactionId");
                            throw null;
                        }
                        Pair pair3 = new Pair("transactionId", str5);
                        String str6 = p.f41242i;
                        liveID$ILiveIDMonitor2.report(str4, kotlin.collections.G.h(pair, pair2, pair3, new Pair("uuid", str6 != null ? str6 : "")));
                    }
                    AbstractC0780y.m(V.f(this), null, null, new x(this, null), 3);
                    k();
                    return;
                } catch (Exception unused) {
                    Intent intent5 = new Intent();
                    f fVar2 = f.f1630o;
                    LiveIDResult.Error error = new LiveIDResult.Error(new LiveIDException(fVar2.f1633a, fVar2.f1634b, "camera init error", null, 8, null));
                    Bundle bundle2 = new Bundle();
                    bundle2.putParcelable("key_bundle_live_id_result", error);
                    n.H(error);
                    setResult(-1, intent5.putExtras(bundle2));
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
            Pair pair7 = new Pair("msg", "params is empty");
            String str8 = p.f41242i;
            liveID$ILiveIDMonitor.report(str7, kotlin.collections.G.h(pair4, pair5, pair6, pair7, new Pair("uuid", str8 != null ? str8 : "")));
        }
        finish();
    }

    @Override // androidx.appcompat.app.AbstractActivityC0837o, androidx.fragment.app.E, android.app.Activity
    public final void onDestroy() {
        super.onDestroy();
        if (this.f23864e != -9.0f) {
            Window window = getWindow();
            WindowManager.LayoutParams attributes = getWindow().getAttributes();
            attributes.screenBrightness = this.f23864e;
            window.setAttributes(attributes);
        }
        d dVar = this.f23865f;
        if (dVar != null) {
            dVar.dismiss();
        }
        L l5 = this.f23870p;
        if (l5 != null) {
            l5.cancel();
        }
    }
}
