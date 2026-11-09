package W8;

import Bc.C0105b;
import E.AbstractC0198c;
import E.V;
import E.j0;
import Fe.Z;
import Rd.C;
import android.content.Context;
import android.graphics.Typeface;
import android.os.Handler;
import android.os.Trace;
import android.widget.TextView;
import androidx.activity.ViewTreeObserverOnDrawListenerC0819j;
import androidx.camera.camera2.internal.A;
import androidx.camera.camera2.internal.B;
import androidx.camera.camera2.internal.compat.r;
import androidx.camera.core.SurfaceOutput;
import androidx.camera.core.imagecapture.t;
import androidx.camera.core.impl.AbstractC0970b0;
import androidx.camera.video.E;
import androidx.camera.video.internal.compat.quirk.DeactivateEncoderSurfaceBeforeStopEncoderQuirk;
import androidx.camera.video.internal.encoder.Encoder;
import androidx.camera.video.q;
import androidx.camera.video.s;
import androidx.core.widget.NestedScrollView;
import androidx.lifecycle.C1212w;
import androidx.lifecycle.EnumC1203m;
import androidx.lifecycle.M;
import com.google.api.Service;
import com.palmpay.lib.ui.button.PpButton;
import com.transsnet.palmpay.account.ui.fragment.login.LogInWithTouchIdFragment;
import com.transsnet.palmpay.credit.base.CreditBaseMvvmActivity;
import com.transsnet.palmpay.p2pcash.ui.atm.dialog.StatusDialog;
import com.transsnet.palmpay.p2pcash.ui.atm.view.P2PPositionSelectorView;
import com.transsnet.palmpay.p2pcash.ui.atm.view.TimeCountView;
import com.transsnet.palmpay.teller.ui.activity.BillerSearchActivity;
import com.transsnet.palmpay.teller.ui.activity.TvPreCheckActivity;
import com.transsnet.palmpay.teller.ui.viewhandler.BillerSearchViewModel;
import java.nio.MappedByteBuffer;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Objects;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KProperty;
import okhttp3.Call;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class o implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f10595a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f10596b;

    public /* synthetic */ o(Object obj, int i7) {
        this.f10595a = i7;
        this.f10596b = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        TextView textView;
        PpButton ppButton;
        NestedScrollView nestedScrollView;
        int i7 = 24;
        switch (this.f10595a) {
            case 0:
                int i10 = LogInWithTouchIdFragment.f26230C;
                LogInWithTouchIdFragment logInWithTouchIdFragment = (LogInWithTouchIdFragment) this.f10596b;
                if (!logInWithTouchIdFragment.isResumed() || logInWithTouchIdFragment.isDetached()) {
                    return;
                }
                if (logInWithTouchIdFragment.t) {
                    if (logInWithTouchIdFragment.f26236v) {
                        logInWithTouchIdFragment.y();
                        return;
                    }
                    return;
                }
                logInWithTouchIdFragment.t = true;
                C0105b c0105b = logInWithTouchIdFragment.f26232B;
                if (c0105b != null && (ppButton = (PpButton) c0105b.f666f) != null) {
                    p220oa.h.s(ppButton, false);
                }
                C0105b c0105b2 = logInWithTouchIdFragment.f26232B;
                if (c0105b2 != null && (textView = (TextView) c0105b2.f663c) != null) {
                    p220oa.h.s(textView, false);
                }
                logInWithTouchIdFragment.A(false);
                logInWithTouchIdFragment.z();
                return;
            case 1:
                ((StatusDialog) this.f10596b).lambda$updateUI$1();
                return;
            case 2:
                int i11 = BillerSearchActivity.f34173p;
                BillerSearchActivity billerSearchActivity = (BillerSearchActivity) this.f10596b;
                String text = billerSearchActivity.p();
                BillerSearchViewModel billerSearchViewModel = (BillerSearchViewModel) billerSearchActivity.l();
                ArrayList billerList = billerSearchActivity.f34177g;
                billerSearchViewModel.getClass();
                Intrinsics.checkNotNullParameter(text, "text");
                Intrinsics.checkNotNullParameter(billerList, "billerList");
                p140j8.f.s(billerSearchViewModel, new p055de.e(text, billerList, null), billerSearchViewModel.f34381g, (28 & 4) != 0 ? 0L : 300L, (28 & 8) != 0, (28 & 16) == 0);
                BillerSearchViewModel billerSearchViewModel2 = (BillerSearchViewModel) billerSearchActivity.l();
                ArrayList menus = billerSearchActivity.f34175e;
                billerSearchViewModel2.getClass();
                Intrinsics.checkNotNullParameter(text, "text");
                Intrinsics.checkNotNullParameter(menus, "menus");
                p140j8.f.s(billerSearchViewModel2, new p055de.g(text, menus, null), billerSearchViewModel2.f34382i, (28 & 4) != 0 ? 0L : 300L, (28 & 8) != 0, (28 & 16) == 0);
                return;
            case 3:
                KProperty[] kPropertyArr = TvPreCheckActivity.f34231j;
                C c6 = (C) ((TvPreCheckActivity) this.f10596b).f27334c;
                if (c6 == null || (nestedScrollView = c6.f8009p) == null) {
                    return;
                }
                nestedScrollView.e(130);
                return;
            case 4:
                int i12 = P2PPositionSelectorView.f33029A;
                ((P2PPositionSelectorView) this.f10596b).a();
                return;
            case 5:
                int i13 = TimeCountView.f33051o;
                He.a aVar = (He.a) this.f10596b;
                if (aVar.f3864b) {
                    return;
                }
                aVar.f3864b = true;
                ((Handler) aVar.f3865c).post(new B5.c(aVar, i7));
                return;
            case 6:
                Za.b.l((Za.b) this.f10596b);
                return;
            case 7:
                Za.d.m((Za.d) this.f10596b);
                return;
            case 8:
                CreditBaseMvvmActivity.m((CreditBaseMvvmActivity) this.f10596b);
                return;
            case 9:
                ViewTreeObserverOnDrawListenerC0819j this$0 = (ViewTreeObserverOnDrawListenerC0819j) this.f10596b;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                Runnable runnable = this$0.f12033b;
                if (runnable != null) {
                    runnable.run();
                    this$0.f12033b = null;
                    return;
                }
                return;
            case 10:
                androidx.activity.n.a((androidx.activity.n) this.f10596b);
                return;
            case 11:
                ((r) this.f10596b).f13479b.onCameraAccessPrioritiesChanged();
                return;
            case 12:
                t tVar = ((androidx.camera.core.imagecapture.n) ((V) this.f10596b).f1957b).f13773a;
                if (tVar != null) {
                    tVar.f13803g.onCaptureStarted();
                    return;
                }
                return;
            case 13:
                ((A) this.f10596b).onOpenAvailable();
                return;
            case 14:
                ((B) this.f10596b).onConfigureAvailable();
                return;
            case 15:
                ((androidx.concurrent.futures.m) this.f10596b).cancel(true);
                return;
            case 16:
                ((SurfaceOutput) this.f10596b).close();
                return;
            case 17:
                androidx.camera.core.processing.f fVar = (androidx.camera.core.processing.f) this.f10596b;
                fVar.f14397j = true;
                fVar.a();
                return;
            case 18:
                ((j0) this.f10596b).a();
                return;
            case 19:
                ((AbstractC0970b0) this.f10596b).b();
                return;
            case 20:
                G.h hVar = (G.h) ((top.zibin.luban.io.a) this.f10596b).f42647d;
                if (hVar != null) {
                    Iterator it = hVar.values().iterator();
                    while (it.hasNext()) {
                        ((androidx.camera.core.processing.m) it.next()).c();
                    }
                    return;
                }
                return;
            case 21:
                Encoder encoder = (Encoder) this.f10596b;
                p140j8.f.G("Recorder");
                if (androidx.camera.video.internal.compat.quirk.a.f14630a.b(DeactivateEncoderSurfaceBeforeStopEncoderQuirk.class) != null) {
                    s.d(encoder);
                    return;
                }
                return;
            case 22:
                q qVar = (q) ((p1.d) this.f10596b).f41179c;
                if (qVar.f14812d) {
                    return;
                }
                p140j8.f.G("Recorder");
                s sVar = qVar.f14815g;
                Objects.toString(sVar.f14855s);
                p140j8.f.G("Recorder");
                E e10 = sVar.f14833A;
                e10.a();
                androidx.camera.core.impl.utils.futures.j.e(e10.f14566j).addListener(new Da.h(qVar, i7, qVar.f14809a, qVar.f14810b), sVar.f14840d);
                return;
            case 23:
                ((androidx.camera.video.C) this.f10596b).o();
                return;
            case 24:
                ((E) this.f10596b).f14567k.b(null);
                return;
            case Service.MONITORED_RESOURCES_FIELD_NUMBER /* 25 */:
                ((androidx.camera.video.internal.encoder.t) this.f10596b).a();
                return;
            case 26:
                androidx.emoji2.text.r rVar = (androidx.emoji2.text.r) this.f10596b;
                synchronized (rVar.f16923d) {
                    try {
                        if (rVar.f16927h == null) {
                            return;
                        }
                        try {
                            androidx.core.provider.j jVarB = rVar.b();
                            int i14 = jVarB.f16132e;
                            if (i14 == 2) {
                                synchronized (rVar.f16923d) {
                                }
                            }
                            if (i14 != 0) {
                                throw new RuntimeException("fetchFonts result is not OK. (" + i14 + ")");
                            }
                            try {
                                int i15 = androidx.core.os.j.f16100a;
                                Trace.beginSection("EmojiCompat.FontRequestEmojiCompatConfig.buildTypeface");
                                Z4.a aVar2 = rVar.f16922c;
                                Context context = rVar.f16920a;
                                aVar2.getClass();
                                androidx.core.provider.j[] jVarArr = {jVarB};
                                androidx.core.graphics.o oVar = androidx.core.graphics.h.f16065a;
                                Trace.beginSection(AbstractC0198c.m0("TypefaceCompat.createFromFontInfo"));
                                try {
                                    Typeface typefaceG = androidx.core.graphics.h.f16065a.g(context, jVarArr, 0);
                                    Trace.endSection();
                                    MappedByteBuffer mappedByteBufferP = androidx.core.graphics.o.p(rVar.f16920a, jVarB.f16128a);
                                    if (mappedByteBufferP == null || typefaceG == null) {
                                        throw new RuntimeException("Unable to open file.");
                                    }
                                    try {
                                        Trace.beginSection("EmojiCompat.MetadataRepo.create");
                                        O2.a aVar3 = new O2.a(typefaceG, J3.a.M(mappedByteBufferP));
                                        Trace.endSection();
                                        Trace.endSection();
                                        synchronized (rVar.f16923d) {
                                            try {
                                                androidx.emoji2.text.h hVar2 = rVar.f16927h;
                                                if (hVar2 != null) {
                                                    hVar2.b(aVar3);
                                                }
                                            } catch (Throwable th) {
                                                throw th;
                                            }
                                            break;
                                        }
                                        rVar.a();
                                        return;
                                    } catch (Throwable th2) {
                                        int i16 = androidx.core.os.j.f16100a;
                                        Trace.endSection();
                                        throw th2;
                                    }
                                } catch (Throwable th3) {
                                    Trace.endSection();
                                    throw th3;
                                }
                            } catch (Throwable th4) {
                                int i17 = androidx.core.os.j.f16100a;
                                Trace.endSection();
                                throw th4;
                            }
                            break;
                        } catch (Throwable th5) {
                            synchronized (rVar.f16923d) {
                                try {
                                    androidx.emoji2.text.h hVar3 = rVar.f16927h;
                                    if (hVar3 != null) {
                                        hVar3.a(th5);
                                    }
                                    rVar.a();
                                    return;
                                } catch (Throwable th6) {
                                    throw th6;
                                }
                            }
                        }
                    } catch (Throwable th7) {
                        throw th7;
                    }
                }
            case 27:
                M this$1 = (M) this.f10596b;
                Intrinsics.checkNotNullParameter(this$1, "this$0");
                int i18 = this$1.f17361b;
                C1212w c1212w = this$1.f17365f;
                if (i18 == 0) {
                    this$1.f17362c = true;
                    c1212w.e(EnumC1203m.ON_PAUSE);
                }
                if (this$1.f17360a == 0 && this$1.f17362c) {
                    c1212w.e(EnumC1203m.ON_STOP);
                    this$1.f17363d = true;
                    return;
                }
                return;
            case 28:
                ((Z) this.f10596b).onSuccess(new p045d3.g(4));
                return;
            default:
                ((Call) this.f10596b).cancel();
                return;
        }
    }
}
