package B6;

import E.AbstractC0198c;
import Wf.AbstractC0780y;
import Wf.t0;
import Zf.AbstractC0807c;
import android.content.Intent;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.os.Handler;
import android.util.Size;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.ViewFlipper;
import androidx.appcompat.app.AbstractActivityC0837o;
import androidx.camera.view.C1027h;
import androidx.camera.view.PreviewView;
import com.palmpay.lib.liveness.lang.LanguageManager$Companion;
import com.palmpay.lib.liveness.result.LiveIDResult;
import com.palmpay.lib.liveness.ui.FaceCaptureActivity;
import com.palmpay.lib.liveness.ui.LivenessActivity;
import com.palmpay.lib.liveness.ui.widget.AlgorithmScheduleProgressBar;
import com.palmpay.lib.liveness.ui.widget.CountdownProgressViewV2;
import com.palmpay.lib.liveness.ui.widget.LivenessStepLayout;
import com.palmpay.lib.liveness.v2.LivenessActivityV2;
import com.palmpay.lib.liveness.video.VideoActivity;
import com.transsnet.palmpay.bean.HomeDialogState;
import io.fastkv.n;
import java.io.File;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.C1893z;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.g0;

/* JADX INFO: renamed from: B6.p, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C0094p implements FlowCollector {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f505a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f506b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f507c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Object f508d;

    public /* synthetic */ C0094p(AbstractActivityC0837o abstractActivityC0837o, TextView textView, AlgorithmScheduleProgressBar algorithmScheduleProgressBar, int i7) {
        this.f505a = i7;
        this.f508d = abstractActivityC0837o;
        this.f506b = textView;
        this.f507c = algorithmScheduleProgressBar;
    }

    /* JADX WARN: Code duplicated, block: B:272:0x0525  */
    /* JADX WARN: Code duplicated, block: B:298:0x0581  */
    /* JADX WARN: Code duplicated, block: B:518:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r3v28, types: [Ff.h, kotlin.jvm.functions.Function2] */
    @Override // kotlinx.coroutines.flow.FlowCollector
    public final Object emit(Object obj, Continuation continuation) {
        int i7;
        int i10;
        g0 g0Var;
        Object value;
        g0 g0Var2;
        Object value2;
        C1893z c1893z;
        C0094p c0094p;
        int i11;
        List list;
        g0 g0Var3;
        Object value3;
        Object obj2 = obj;
        Object obj3 = this.f507c;
        Object obj4 = this.f506b;
        Object obj5 = this.f508d;
        switch (this.f505a) {
            case 0:
                O o10 = (O) obj2;
                LivenessActivityV2 livenessActivityV2 = (LivenessActivityV2) obj5;
                if (o10.f412c) {
                    int i12 = LivenessActivityV2.f23926Z;
                    LanguageManager$Companion languageManager$Companion = p280s6.a.f42044a;
                    String strO = com.horcrux.svg.d0.o(languageManager$Companion, "smart_selfie_processing_title");
                    String strO2 = com.horcrux.svg.d0.o(languageManager$Companion, "smart_selfie_processing_msg");
                    if (!livenessActivityV2.isDestroyed() && !livenessActivityV2.isFinishing()) {
                        if (livenessActivityV2.f23939d == null) {
                            O6.c cVar = new O6.c(livenessActivityV2);
                            cVar.f6605k = true;
                            cVar.f6596b = O6.d.f(strO);
                            cVar.f6598d = strO2;
                            cVar.f6607m = p232p6.s.lib_liveness_face_loading;
                            O6.d dVarA = cVar.a();
                            livenessActivityV2.f23939d = dVarA;
                            dVarA.setCancelable(false);
                        }
                        O6.d dVar = livenessActivityV2.f23939d;
                        if (dVar != null) {
                            dVar.show();
                        }
                    }
                    top.zibin.luban.io.a aVar = livenessActivityV2.f23933Q;
                    if (aVar != null) {
                        aVar.r();
                    }
                } else if (o10.f413d == null) {
                    p280s6.a languageManager$Companion2 = p280s6.a.f42044a.getInstance();
                    EnumC0100w enumC0100w = o10.f410a;
                    String str = enumC0100w != null ? enumC0100w.f534a : "";
                    languageManager$Companion2.getClass();
                    ((TextView) obj4).setText(p280s6.a.a(str));
                    AlgorithmScheduleProgressBar algorithmScheduleProgressBar = (AlgorithmScheduleProgressBar) obj3;
                    switch (enumC0100w != null ? AbstractC0093o.f504a[enumC0100w.ordinal()] : -1) {
                        case 1:
                            ViewFlipper viewFlipper = livenessActivityV2.f23944j;
                            if (viewFlipper == null) {
                                Intrinsics.n("livenessViewFlipper");
                                throw null;
                            }
                            if (viewFlipper.getVisibility() != 0) {
                                ViewFlipper viewFlipper2 = livenessActivityV2.f23944j;
                                if (viewFlipper2 == null) {
                                    Intrinsics.n("livenessViewFlipper");
                                    throw null;
                                }
                                i7 = 0;
                                viewFlipper2.setVisibility(0);
                            } else {
                                i7 = 0;
                            }
                            ViewFlipper viewFlipper3 = livenessActivityV2.f23944j;
                            if (viewFlipper3 == null) {
                                Intrinsics.n("livenessViewFlipper");
                                throw null;
                            }
                            viewFlipper3.setDisplayedChild(i7);
                            LivenessStepLayout livenessStepLayout = livenessActivityV2.f23943i;
                            if (livenessStepLayout == null) {
                                Intrinsics.n("faceStepView");
                                throw null;
                            }
                            livenessStepLayout.setVisibility(4);
                            break;
                            break;
                        case 2:
                            algorithmScheduleProgressBar.b(0.0f, true, 50);
                            break;
                        case 3:
                        case 4:
                        case 5:
                        case 6:
                            ViewFlipper viewFlipper4 = livenessActivityV2.f23944j;
                            if (viewFlipper4 == null) {
                                Intrinsics.n("livenessViewFlipper");
                                throw null;
                            }
                            if (viewFlipper4.getVisibility() != 0) {
                                ViewFlipper viewFlipper5 = livenessActivityV2.f23944j;
                                if (viewFlipper5 == null) {
                                    Intrinsics.n("livenessViewFlipper");
                                    throw null;
                                }
                                i10 = 0;
                                viewFlipper5.setVisibility(0);
                            } else {
                                i10 = 0;
                            }
                            LivenessStepLayout livenessStepLayout2 = livenessActivityV2.f23943i;
                            if (livenessStepLayout2 == null) {
                                Intrinsics.n("faceStepView");
                                throw null;
                            }
                            livenessStepLayout2.setVisibility(i10);
                            LivenessStepLayout livenessStepLayout3 = livenessActivityV2.f23943i;
                            if (livenessStepLayout3 == null) {
                                Intrinsics.n("faceStepView");
                                throw null;
                            }
                            int i13 = (int) o10.f411b;
                            livenessStepLayout3.b(i13);
                            int i14 = p292t6.a.f42345a;
                            p292t6.a.a("startTimer index state: " + i13);
                            algorithmScheduleProgressBar.b(1.0f, true, 50);
                            break;
                            break;
                        case 7:
                            ViewFlipper viewFlipper6 = livenessActivityV2.f23944j;
                            if (viewFlipper6 == null) {
                                Intrinsics.n("livenessViewFlipper");
                                throw null;
                            }
                            viewFlipper6.setVisibility(8);
                            CountdownProgressViewV2 countdownProgressViewV2 = livenessActivityV2.f23935Y;
                            if (countdownProgressViewV2 == null) {
                                Intrinsics.n("countdownProgressView");
                                throw null;
                            }
                            countdownProgressViewV2.setVisibility(8);
                            LivenessStepLayout livenessStepLayout4 = livenessActivityV2.f23943i;
                            if (livenessStepLayout4 == null) {
                                Intrinsics.n("faceStepView");
                                throw null;
                            }
                            livenessStepLayout4.setVisibility(4);
                            break;
                            break;
                    }
                } else {
                    int i15 = LivenessActivityV2.f23926Z;
                    Handler handler = livenessActivityV2.f23927A;
                    handler.removeCallbacksAndMessages(null);
                    handler.post(livenessActivityV2.f23931L);
                    C1027h c1027h = livenessActivityV2.f23936a;
                    if (c1027h != null) {
                        c1027h.r();
                    }
                    PreviewView previewView = livenessActivityV2.f23937b;
                    if (previewView == null) {
                        Intrinsics.n("cameraPreview");
                        throw null;
                    }
                    previewView.setController(null);
                    livenessActivityV2.f23936a = null;
                    Bitmap bitmap = o10.f414e;
                    if (bitmap != null) {
                        ImageView imageView = new ImageView(livenessActivityV2);
                        imageView.setImageBitmap(bitmap);
                        imageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
                        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1);
                        PreviewView previewView2 = livenessActivityV2.f23937b;
                        if (previewView2 == null) {
                            Intrinsics.n("cameraPreview");
                            throw null;
                        }
                        ViewParent parent = previewView2.getParent();
                        Intrinsics.f(parent, "null cannot be cast to non-null type android.view.ViewGroup");
                        ((ViewGroup) parent).addView(imageView, layoutParams);
                        PreviewView previewView3 = livenessActivityV2.f23937b;
                        if (previewView3 == null) {
                            Intrinsics.n("cameraPreview");
                            throw null;
                        }
                        previewView3.setVisibility(8);
                    }
                    b0 b0VarG = livenessActivityV2.g();
                    String uploadUrl = livenessActivityV2.t;
                    if (uploadUrl == null) {
                        Intrinsics.n("uploadUrl");
                        throw null;
                    }
                    String transactionId = livenessActivityV2.f23946p;
                    if (transactionId == null) {
                        Intrinsics.n("transactionId");
                        throw null;
                    }
                    int i16 = b0.f451H;
                    b0VarG.getClass();
                    Intrinsics.checkNotNullParameter(uploadUrl, "uploadUrl");
                    Intrinsics.checkNotNullParameter(transactionId, "transactionId");
                    File selfieFile = o10.f413d;
                    Intrinsics.checkNotNullParameter(selfieFile, "selfieFile");
                    t0 t0Var = b0VarG.f463w;
                    if (t0Var == null || !t0Var.isActive()) {
                        do {
                            g0Var = b0VarG.f459j;
                            value = g0Var.getValue();
                        } while (!g0Var.compareAndSet(value, O.a((O) value, null, 0.0f, true, null, null, 3)));
                        CoroutineScope coroutineScopeH = androidx.lifecycle.V.h(b0VarG);
                        p042cg.f fVar = Wf.I.f10809a;
                        b0VarG.f463w = AbstractC0780y.m(coroutineScopeH, p042cg.e.f19009c, null, new Z(selfieFile, uploadUrl, b0VarG, transactionId, null), 2);
                    }
                }
                return Unit.f38893a;
            case 1:
                D6.i iVar = (D6.i) obj2;
                final VideoActivity videoActivity = (VideoActivity) obj5;
                if (iVar.f1657e != null) {
                    Size size = VideoActivity.f23949B;
                    videoActivity.h();
                    LanguageManager$Companion languageManager$Companion3 = p280s6.a.f42044a;
                    String strO3 = com.horcrux.svg.d0.o(languageManager$Companion3, "smart_selfie_processing_title");
                    String strO4 = com.horcrux.svg.d0.o(languageManager$Companion3, "smart_selfie_processing_msg");
                    String strO5 = com.horcrux.svg.d0.o(languageManager$Companion3, "smart_selfie_processing_timeout_title");
                    String strO6 = com.horcrux.svg.d0.o(languageManager$Companion3, "smart_selfie_processing_timeout_msg");
                    String strO7 = com.horcrux.svg.d0.o(languageManager$Companion3, "smart_selfie_processing_retry_button");
                    int iOrdinal = iVar.f1657e.ordinal();
                    if (iOrdinal != 0) {
                        if (iOrdinal != 1) {
                            if (iOrdinal != 2) {
                                if (iOrdinal != 3) {
                                    throw new p355xf.l();
                                }
                                if (!videoActivity.isDestroyed() && !videoActivity.isFinishing()) {
                                    O6.d dVar2 = videoActivity.f23954d;
                                    if (dVar2 != null) {
                                        dVar2.dismiss();
                                    }
                                    int i17 = p232p6.s.lib_liveness_face_error;
                                    C6.a aVar2 = new C6.a(videoActivity, 3);
                                    int i18 = L6.i.ppDefaultDialogTheme;
                                    O6.c cVar2 = new O6.c(videoActivity);
                                    cVar2.f6614u = 1;
                                    cVar2.f(strO5);
                                    cVar2.f6607m = i17;
                                    cVar2.f6598d = strO6;
                                    cVar2.f6600f = strO7;
                                    cVar2.f6602h = aVar2;
                                    cVar2.f6605k = true;
                                    cVar2.f6606l = 0;
                                    cVar2.f6615v = i18;
                                    O6.d dialog = cVar2.g();
                                    dialog.setCancelable(false);
                                    dialog.setCanceledOnTouchOutside(false);
                                    Intrinsics.checkNotNullExpressionValue(dialog, "dialog");
                                }
                            } else if (!videoActivity.isDestroyed() && !videoActivity.isFinishing()) {
                                O6.d dVar3 = videoActivity.f23954d;
                                if (dVar3 != null) {
                                    dVar3.dismiss();
                                }
                                C6.v vVarF = videoActivity.f();
                                final int i19 = 1;
                                Function1 callback = new Function1() { // from class: C6.b
                                    @Override // kotlin.jvm.functions.Function1
                                    public final Object invoke(Object obj6) {
                                        VideoActivity videoActivity2 = videoActivity;
                                        LiveIDResult it = (LiveIDResult) obj6;
                                        switch (i19) {
                                            case 0:
                                                Size size2 = VideoActivity.f23949B;
                                                Intrinsics.checkNotNullParameter(it, "it");
                                                Intent intent = new Intent();
                                                Bundle bundle = new Bundle();
                                                bundle.putParcelable("key_bundle_live_id_result", it);
                                                videoActivity2.setResult(-1, intent.putExtras(bundle));
                                                videoActivity2.finish();
                                                break;
                                            default:
                                                Size size3 = VideoActivity.f23949B;
                                                Intrinsics.checkNotNullParameter(it, "it");
                                                Intent intent2 = new Intent();
                                                Bundle bundle2 = new Bundle();
                                                bundle2.putParcelable("key_bundle_live_id_result", it);
                                                videoActivity2.setResult(-1, intent2.putExtras(bundle2));
                                                videoActivity2.finish();
                                                break;
                                        }
                                        return Unit.f38893a;
                                    }
                                };
                                vVarF.getClass();
                                Intrinsics.checkNotNullParameter(callback, "callback");
                                LiveIDResult liveIDResult = vVarF.t;
                                Intrinsics.e(liveIDResult);
                                callback.invoke(liveIDResult);
                            }
                        } else if (!videoActivity.isDestroyed() && !videoActivity.isFinishing()) {
                            O6.d dVar4 = videoActivity.f23954d;
                            if (dVar4 != null) {
                                dVar4.dismiss();
                            }
                            C6.v vVarF2 = videoActivity.f();
                            final int i20 = 0;
                            Function1 callback2 = new Function1() { // from class: C6.b
                                @Override // kotlin.jvm.functions.Function1
                                public final Object invoke(Object obj6) {
                                    VideoActivity videoActivity2 = videoActivity;
                                    LiveIDResult it = (LiveIDResult) obj6;
                                    switch (i20) {
                                        case 0:
                                            Size size2 = VideoActivity.f23949B;
                                            Intrinsics.checkNotNullParameter(it, "it");
                                            Intent intent = new Intent();
                                            Bundle bundle = new Bundle();
                                            bundle.putParcelable("key_bundle_live_id_result", it);
                                            videoActivity2.setResult(-1, intent.putExtras(bundle));
                                            videoActivity2.finish();
                                            break;
                                        default:
                                            Size size3 = VideoActivity.f23949B;
                                            Intrinsics.checkNotNullParameter(it, "it");
                                            Intent intent2 = new Intent();
                                            Bundle bundle2 = new Bundle();
                                            bundle2.putParcelable("key_bundle_live_id_result", it);
                                            videoActivity2.setResult(-1, intent2.putExtras(bundle2));
                                            videoActivity2.finish();
                                            break;
                                    }
                                    return Unit.f38893a;
                                }
                            };
                            vVarF2.getClass();
                            Intrinsics.checkNotNullParameter(callback2, "callback");
                            LiveIDResult liveIDResult2 = vVarF2.t;
                            Intrinsics.e(liveIDResult2);
                            callback2.invoke(liveIDResult2);
                        }
                    } else if (!videoActivity.isDestroyed() && !videoActivity.isFinishing()) {
                        if (videoActivity.f23954d == null) {
                            O6.c cVar3 = new O6.c(videoActivity);
                            cVar3.f6605k = true;
                            cVar3.f6596b = O6.d.f(strO3);
                            cVar3.f6598d = strO4;
                            cVar3.f6607m = p232p6.s.lib_liveness_face_loading;
                            O6.d dVarA2 = cVar3.a();
                            videoActivity.f23954d = dVarA2;
                            dVarA2.setCancelable(false);
                        }
                        O6.d dVar5 = videoActivity.f23954d;
                        if (dVar5 != null) {
                            dVar5.show();
                        }
                    }
                } else if (iVar.f1656d != null) {
                    Size size2 = VideoActivity.f23949B;
                    videoActivity.h();
                    C6.v vVarF3 = videoActivity.f();
                    String uploadUrl2 = videoActivity.f23956f;
                    if (uploadUrl2 == null) {
                        Intrinsics.n("uploadUrl");
                        throw null;
                    }
                    String transactionId2 = videoActivity.f23955e;
                    if (transactionId2 == null) {
                        Intrinsics.n("transactionId");
                        throw null;
                    }
                    int i21 = videoActivity.f23958i;
                    vVarF3.getClass();
                    Intrinsics.checkNotNullParameter(uploadUrl2, "uploadUrl");
                    Intrinsics.checkNotNullParameter(transactionId2, "transactionId");
                    vVarF3.f1220A = transactionId2;
                    File file = vVarF3.f1238w;
                    ArrayList arrayList = vVarF3.f1237v;
                    if (file != null) {
                        do {
                            g0Var2 = vVarF3.f1235o;
                            value2 = g0Var2.getValue();
                        } while (!g0Var2.compareAndSet(value2, D6.i.a((D6.i) value2, null, 0.0f, null, null, D6.g.f1635a, null, null, HomeDialogState.PRIORITY_HIGHEST_111)));
                        AbstractC0780y.m(androidx.lifecycle.V.h(vVarF3), AbstractC0198c.x(new C6.p(vVarF3, 1)), null, new C6.t(i21, arrayList, file, uploadUrl2, vVarF3, transactionId2, null), 2);
                    }
                    C6.v vVarF4 = videoActivity.f();
                    String uploadVideoUrl = videoActivity.f23957g;
                    if (uploadVideoUrl == null) {
                        Intrinsics.n("uploadVideoUrl");
                        throw null;
                    }
                    vVarF4.getClass();
                    Intrinsics.checkNotNullParameter(uploadVideoUrl, "uploadVideoUrl");
                    AbstractC0780y.m(Wf.V.f10828a, null, null, new C6.u(vVarF4, uploadVideoUrl, null), 3);
                } else {
                    p280s6.a languageManager$Companion4 = p280s6.a.f42044a.getInstance();
                    String str2 = iVar.f1653a.f1652a;
                    languageManager$Companion4.getClass();
                    ((TextView) obj4).setText(p280s6.a.a(str2));
                    if (Boolean.TRUE.equals(iVar.f1655c)) {
                        Handler handler2 = videoActivity.f23962v;
                        handler2.removeCallbacksAndMessages(null);
                        handler2.post(videoActivity.f23963w);
                    } else {
                        Size size3 = VideoActivity.f23949B;
                        videoActivity.h();
                    }
                    AlgorithmScheduleProgressBar algorithmScheduleProgressBar2 = (AlgorithmScheduleProgressBar) obj3;
                    Intrinsics.e(algorithmScheduleProgressBar2);
                    Size size4 = VideoActivity.f23949B;
                    float f10 = iVar.f1654b;
                    if (0.0f == f10 || 1.0f == f10) {
                        algorithmScheduleProgressBar2.b(f10, true, 50);
                    } else {
                        algorithmScheduleProgressBar2.b(f10, false, 500);
                    }
                }
                return Unit.f38893a;
            case 2:
                Object objB = AbstractC0807c.b((CoroutineContext) obj5, obj2, obj4, (Zf.E) obj3, continuation);
                return objB == Ef.a.f2423a ? objB : Unit.f38893a;
            case 3:
                if (continuation instanceof C1893z) {
                    c1893z = (C1893z) continuation;
                    int i22 = c1893z.f39249e;
                    if ((i22 & Integer.MIN_VALUE) != 0) {
                        c1893z.f39249e = i22 - Integer.MIN_VALUE;
                    } else {
                        c1893z = new C1893z(this, continuation);
                    }
                } else {
                    c1893z = new C1893z(this, continuation);
                }
                Object objInvoke = c1893z.f39247c;
                Ef.a aVar3 = Ef.a.f2423a;
                int i23 = c1893z.f39249e;
                if (i23 != 0) {
                    if (i23 != 1) {
                        if (i23 == 2) {
                            obj2 = c1893z.f39246b;
                            c0094p = c1893z.f39245a;
                            androidx.camera.core.impl.utils.executor.g.M(objInvoke);
                            if (!((Boolean) objInvoke).booleanValue()) {
                                ((kotlin.jvm.internal.B) c0094p.f508d).f38947a = true;
                                c1893z.f39245a = null;
                                c1893z.f39246b = null;
                                c1893z.f39249e = 3;
                                if (((FlowCollector) c0094p.f506b).emit(obj2, c1893z) == aVar3) {
                                    return aVar3;
                                }
                            }
                        } else if (i23 != 3) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                    }
                    androidx.camera.core.impl.utils.executor.g.M(objInvoke);
                } else {
                    androidx.camera.core.impl.utils.executor.g.M(objInvoke);
                    if (((kotlin.jvm.internal.B) obj5).f38947a) {
                        c1893z.f39249e = 1;
                        if (((FlowCollector) obj4).emit(obj2, c1893z) == aVar3) {
                            return aVar3;
                        }
                    } else {
                        c1893z.f39245a = this;
                        c1893z.f39246b = obj2;
                        c1893z.f39249e = 2;
                        objInvoke = ((Ff.h) obj3).invoke(obj2, c1893z);
                        if (objInvoke == aVar3) {
                            return aVar3;
                        }
                        c0094p = this;
                        if (!((Boolean) objInvoke).booleanValue()) {
                            ((kotlin.jvm.internal.B) c0094p.f508d).f38947a = true;
                            c1893z.f39245a = null;
                            c1893z.f39246b = null;
                            c1893z.f39249e = 3;
                            if (((FlowCollector) c0094p.f506b).emit(obj2, c1893z) == aVar3) {
                                return aVar3;
                            }
                        }
                    }
                }
                return Unit.f38893a;
            case 4:
                D6.i iVar2 = (D6.i) obj2;
                D6.g gVar = iVar2.f1657e;
                final FaceCaptureActivity faceCaptureActivity = (FaceCaptureActivity) obj5;
                if (gVar != null) {
                    FaceCaptureActivity.a aVar4 = FaceCaptureActivity.f23821i;
                    LanguageManager$Companion languageManager$Companion5 = p280s6.a.f42044a;
                    String strO8 = com.horcrux.svg.d0.o(languageManager$Companion5, "smart_selfie_processing_title");
                    String strO9 = com.horcrux.svg.d0.o(languageManager$Companion5, "smart_selfie_processing_msg");
                    String strO10 = com.horcrux.svg.d0.o(languageManager$Companion5, "smart_selfie_processing_timeout_title");
                    String strO11 = com.horcrux.svg.d0.o(languageManager$Companion5, "smart_selfie_processing_timeout_msg");
                    String strO12 = com.horcrux.svg.d0.o(languageManager$Companion5, "smart_selfie_processing_retry_button");
                    int iOrdinal2 = gVar.ordinal();
                    if (iOrdinal2 != 0) {
                        if (iOrdinal2 != 1) {
                            if (iOrdinal2 != 2) {
                                if (iOrdinal2 != 3) {
                                    throw new p355xf.l();
                                }
                                if (!faceCaptureActivity.isDestroyed() && !faceCaptureActivity.isFinishing()) {
                                    O6.d dVar6 = faceCaptureActivity.f23825d;
                                    if (dVar6 != null) {
                                        dVar6.dismiss();
                                    }
                                    int i24 = p232p6.s.lib_liveness_face_error;
                                    p364y6.a aVar5 = new p364y6.a(faceCaptureActivity, 3);
                                    int i25 = L6.i.ppDefaultDialogTheme;
                                    O6.c cVar4 = new O6.c(faceCaptureActivity);
                                    cVar4.f6614u = 1;
                                    cVar4.f(strO10);
                                    cVar4.f6607m = i24;
                                    cVar4.f6598d = strO11;
                                    cVar4.f6600f = strO12;
                                    cVar4.f6602h = aVar5;
                                    cVar4.f6605k = true;
                                    cVar4.f6606l = 0;
                                    cVar4.f6615v = i25;
                                    O6.d dialog2 = cVar4.g();
                                    dialog2.setCancelable(false);
                                    dialog2.setCanceledOnTouchOutside(false);
                                    Intrinsics.checkNotNullExpressionValue(dialog2, "dialog");
                                }
                            } else if (!faceCaptureActivity.isDestroyed() && !faceCaptureActivity.isFinishing()) {
                                O6.d dVar7 = faceCaptureActivity.f23825d;
                                if (dVar7 != null) {
                                    dVar7.dismiss();
                                }
                                final int i26 = 1;
                                faceCaptureActivity.f().d(new Function1() { // from class: y6.b
                                    @Override // kotlin.jvm.functions.Function1
                                    public final Object invoke(Object obj6) {
                                        FaceCaptureActivity faceCaptureActivity2 = faceCaptureActivity;
                                        LiveIDResult it = (LiveIDResult) obj6;
                                        switch (i26) {
                                            case 0:
                                                FaceCaptureActivity.a aVar6 = FaceCaptureActivity.f23821i;
                                                Intrinsics.checkNotNullParameter(it, "it");
                                                Intent intent = new Intent();
                                                Bundle bundle = new Bundle();
                                                bundle.putParcelable("key_bundle_live_id_result", it);
                                                n.H(it);
                                                faceCaptureActivity2.setResult(-1, intent.putExtras(bundle));
                                                faceCaptureActivity2.finish();
                                                break;
                                            default:
                                                FaceCaptureActivity.a aVar7 = FaceCaptureActivity.f23821i;
                                                Intrinsics.checkNotNullParameter(it, "it");
                                                Intent intent2 = new Intent();
                                                Bundle bundle2 = new Bundle();
                                                bundle2.putParcelable("key_bundle_live_id_result", it);
                                                n.H(it);
                                                faceCaptureActivity2.setResult(-1, intent2.putExtras(bundle2));
                                                faceCaptureActivity2.finish();
                                                break;
                                        }
                                        return Unit.f38893a;
                                    }
                                });
                            }
                        } else if (!faceCaptureActivity.isDestroyed() && !faceCaptureActivity.isFinishing()) {
                            O6.d dVar8 = faceCaptureActivity.f23825d;
                            if (dVar8 != null) {
                                dVar8.dismiss();
                            }
                            final int i27 = 0;
                            faceCaptureActivity.f().d(new Function1() { // from class: y6.b
                                @Override // kotlin.jvm.functions.Function1
                                public final Object invoke(Object obj6) {
                                    FaceCaptureActivity faceCaptureActivity2 = faceCaptureActivity;
                                    LiveIDResult it = (LiveIDResult) obj6;
                                    switch (i27) {
                                        case 0:
                                            FaceCaptureActivity.a aVar6 = FaceCaptureActivity.f23821i;
                                            Intrinsics.checkNotNullParameter(it, "it");
                                            Intent intent = new Intent();
                                            Bundle bundle = new Bundle();
                                            bundle.putParcelable("key_bundle_live_id_result", it);
                                            n.H(it);
                                            faceCaptureActivity2.setResult(-1, intent.putExtras(bundle));
                                            faceCaptureActivity2.finish();
                                            break;
                                        default:
                                            FaceCaptureActivity.a aVar7 = FaceCaptureActivity.f23821i;
                                            Intrinsics.checkNotNullParameter(it, "it");
                                            Intent intent2 = new Intent();
                                            Bundle bundle2 = new Bundle();
                                            bundle2.putParcelable("key_bundle_live_id_result", it);
                                            n.H(it);
                                            faceCaptureActivity2.setResult(-1, intent2.putExtras(bundle2));
                                            faceCaptureActivity2.finish();
                                            break;
                                    }
                                    return Unit.f38893a;
                                }
                            });
                        }
                    } else if (!faceCaptureActivity.isDestroyed() && !faceCaptureActivity.isFinishing()) {
                        if (faceCaptureActivity.f23825d == null) {
                            O6.c cVar5 = new O6.c(faceCaptureActivity);
                            cVar5.f6605k = true;
                            cVar5.f6596b = O6.d.f(strO8);
                            cVar5.f6598d = strO9;
                            cVar5.f6607m = p232p6.s.lib_liveness_face_loading;
                            O6.d dVarA3 = cVar5.a();
                            faceCaptureActivity.f23825d = dVarA3;
                            dVarA3.setCancelable(false);
                        }
                        O6.d dVar9 = faceCaptureActivity.f23825d;
                        if (dVar9 != null) {
                            dVar9.show();
                        }
                    }
                } else if (iVar2.f1656d != null) {
                    FaceCaptureActivity.a aVar6 = FaceCaptureActivity.f23821i;
                    D6.m mVarF = faceCaptureActivity.f();
                    String str3 = faceCaptureActivity.f23827f;
                    if (str3 == null) {
                        Intrinsics.n("uploadUrl");
                        throw null;
                    }
                    String str4 = faceCaptureActivity.f23826e;
                    if (str4 == null) {
                        Intrinsics.n("transactionId");
                        throw null;
                    }
                    mVarF.f(str3, str4, faceCaptureActivity.f23828g, null, 0);
                } else {
                    p280s6.a languageManager$Companion6 = p280s6.a.f42044a.getInstance();
                    String str5 = iVar2.f1653a.f1652a;
                    languageManager$Companion6.getClass();
                    ((TextView) obj4).setText(p280s6.a.a(str5));
                    AlgorithmScheduleProgressBar algorithmScheduleProgressBar3 = (AlgorithmScheduleProgressBar) obj3;
                    Intrinsics.e(algorithmScheduleProgressBar3);
                    FaceCaptureActivity.a aVar7 = FaceCaptureActivity.f23821i;
                    float f11 = iVar2.f1654b;
                    if (0.0f == f11 || 1.0f == f11) {
                        algorithmScheduleProgressBar3.b(f11, true, 50);
                    } else {
                        algorithmScheduleProgressBar3.b(f11, false, 500);
                    }
                }
                return Unit.f38893a;
            default:
                D6.i iVar3 = (D6.i) obj2;
                final LivenessActivity livenessActivity = (LivenessActivity) obj5;
                if (iVar3.f1657e != null) {
                    int i28 = LivenessActivity.f23837Y;
                    livenessActivity.h();
                    LanguageManager$Companion languageManager$Companion7 = p280s6.a.f42044a;
                    String strO13 = com.horcrux.svg.d0.o(languageManager$Companion7, "smart_selfie_processing_title");
                    String strO14 = com.horcrux.svg.d0.o(languageManager$Companion7, "smart_selfie_processing_msg");
                    String strO15 = com.horcrux.svg.d0.o(languageManager$Companion7, "smart_selfie_processing_timeout_title");
                    String strO16 = com.horcrux.svg.d0.o(languageManager$Companion7, "smart_selfie_processing_timeout_msg");
                    String strO17 = com.horcrux.svg.d0.o(languageManager$Companion7, "smart_selfie_processing_retry_button");
                    int iOrdinal3 = iVar3.f1657e.ordinal();
                    if (iOrdinal3 != 0) {
                        if (iOrdinal3 != 1) {
                            if (iOrdinal3 != 2) {
                                if (iOrdinal3 != 3) {
                                    throw new p355xf.l();
                                }
                                if (!livenessActivity.f23857v && !livenessActivity.isDestroyed() && !livenessActivity.isFinishing()) {
                                    O6.d dVar10 = livenessActivity.f23849d;
                                    if (dVar10 != null) {
                                        dVar10.dismiss();
                                    }
                                    int i29 = p232p6.s.lib_liveness_face_error;
                                    p364y6.h hVar = new p364y6.h(livenessActivity, 4);
                                    int i30 = L6.i.ppDefaultDialogTheme;
                                    O6.c cVar6 = new O6.c(livenessActivity);
                                    cVar6.f6614u = 1;
                                    cVar6.f(strO15);
                                    cVar6.f6607m = i29;
                                    cVar6.f6598d = strO16;
                                    cVar6.f6600f = strO17;
                                    cVar6.f6602h = hVar;
                                    cVar6.f6605k = true;
                                    cVar6.f6606l = 0;
                                    cVar6.f6615v = i30;
                                    O6.d dialog3 = cVar6.g();
                                    dialog3.setCancelable(false);
                                    dialog3.setCanceledOnTouchOutside(false);
                                    Intrinsics.checkNotNullExpressionValue(dialog3, "dialog");
                                    livenessActivity.f23857v = true;
                                    livenessActivity.i();
                                    top.zibin.luban.io.a aVar8 = livenessActivity.f23843M;
                                    if (aVar8 != null) {
                                        aVar8.r();
                                    }
                                }
                            } else if (!livenessActivity.isDestroyed() && !livenessActivity.isFinishing()) {
                                O6.d dVar11 = livenessActivity.f23849d;
                                if (dVar11 != null) {
                                    dVar11.dismiss();
                                }
                                D6.e eVarG = livenessActivity.g();
                                final int i31 = 1;
                                Function1 callback3 = new Function1() { // from class: y6.k
                                    @Override // kotlin.jvm.functions.Function1
                                    public final Object invoke(Object obj6) {
                                        LivenessActivity livenessActivity2 = livenessActivity;
                                        LiveIDResult it = (LiveIDResult) obj6;
                                        switch (i31) {
                                            case 0:
                                                int i32 = LivenessActivity.f23837Y;
                                                Intrinsics.checkNotNullParameter(it, "it");
                                                Intent intent = new Intent();
                                                Bundle bundle = new Bundle();
                                                bundle.putParcelable("key_bundle_live_id_result", it);
                                                n.H(it);
                                                livenessActivity2.setResult(-1, intent.putExtras(bundle));
                                                livenessActivity2.finish();
                                                break;
                                            default:
                                                int i33 = LivenessActivity.f23837Y;
                                                Intrinsics.checkNotNullParameter(it, "it");
                                                Intent intent2 = new Intent();
                                                Bundle bundle2 = new Bundle();
                                                bundle2.putParcelable("key_bundle_live_id_result", it);
                                                n.H(it);
                                                livenessActivity2.setResult(-1, intent2.putExtras(bundle2));
                                                livenessActivity2.finish();
                                                break;
                                        }
                                        return Unit.f38893a;
                                    }
                                };
                                eVarG.getClass();
                                Intrinsics.checkNotNullParameter(callback3, "callback");
                                LiveIDResult liveIDResult3 = eVarG.f1619o;
                                Intrinsics.e(liveIDResult3);
                                callback3.invoke(liveIDResult3);
                            }
                        } else if (!livenessActivity.isDestroyed() && !livenessActivity.isFinishing()) {
                            O6.d dVar12 = livenessActivity.f23849d;
                            if (dVar12 != null) {
                                dVar12.dismiss();
                            }
                            D6.e eVarG2 = livenessActivity.g();
                            final int i32 = 0;
                            Function1 callback4 = new Function1() { // from class: y6.k
                                @Override // kotlin.jvm.functions.Function1
                                public final Object invoke(Object obj6) {
                                    LivenessActivity livenessActivity2 = livenessActivity;
                                    LiveIDResult it = (LiveIDResult) obj6;
                                    switch (i32) {
                                        case 0:
                                            int i33 = LivenessActivity.f23837Y;
                                            Intrinsics.checkNotNullParameter(it, "it");
                                            Intent intent = new Intent();
                                            Bundle bundle = new Bundle();
                                            bundle.putParcelable("key_bundle_live_id_result", it);
                                            n.H(it);
                                            livenessActivity2.setResult(-1, intent.putExtras(bundle));
                                            livenessActivity2.finish();
                                            break;
                                        default:
                                            int i34 = LivenessActivity.f23837Y;
                                            Intrinsics.checkNotNullParameter(it, "it");
                                            Intent intent2 = new Intent();
                                            Bundle bundle2 = new Bundle();
                                            bundle2.putParcelable("key_bundle_live_id_result", it);
                                            n.H(it);
                                            livenessActivity2.setResult(-1, intent2.putExtras(bundle2));
                                            livenessActivity2.finish();
                                            break;
                                    }
                                    return Unit.f38893a;
                                }
                            };
                            eVarG2.getClass();
                            Intrinsics.checkNotNullParameter(callback4, "callback");
                            LiveIDResult liveIDResult4 = eVarG2.f1619o;
                            Intrinsics.e(liveIDResult4);
                            callback4.invoke(liveIDResult4);
                        }
                    } else if (!livenessActivity.isDestroyed() && !livenessActivity.isFinishing()) {
                        if (livenessActivity.f23849d == null) {
                            O6.c cVar7 = new O6.c(livenessActivity);
                            cVar7.f6605k = true;
                            cVar7.f6596b = O6.d.f(strO13);
                            cVar7.f6598d = strO14;
                            cVar7.f6607m = p232p6.s.lib_liveness_face_loading;
                            O6.d dVarA4 = cVar7.a();
                            livenessActivity.f23849d = dVarA4;
                            dVarA4.setCancelable(false);
                        }
                        O6.d dVar13 = livenessActivity.f23849d;
                        if (dVar13 != null) {
                            dVar13.show();
                        }
                    }
                    top.zibin.luban.io.a aVar9 = livenessActivity.f23843M;
                    if (aVar9 != null) {
                        aVar9.r();
                    }
                } else if (iVar3.f1656d != null) {
                    int i33 = LivenessActivity.f23837Y;
                    livenessActivity.h();
                    C1027h c1027h2 = livenessActivity.f23846a;
                    if (c1027h2 != null) {
                        c1027h2.r();
                    }
                    PreviewView previewView4 = livenessActivity.f23847b;
                    if (previewView4 == null) {
                        Intrinsics.n("cameraPreview");
                        throw null;
                    }
                    previewView4.setController(null);
                    livenessActivity.f23846a = null;
                    Bitmap bitmap2 = iVar3.f1659g;
                    if (bitmap2 != null) {
                        ImageView imageView2 = new ImageView(livenessActivity);
                        imageView2.setImageBitmap(bitmap2);
                        imageView2.setScaleType(ImageView.ScaleType.CENTER_CROP);
                        FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(-1, -1);
                        PreviewView previewView5 = livenessActivity.f23847b;
                        if (previewView5 == null) {
                            Intrinsics.n("cameraPreview");
                            throw null;
                        }
                        ViewParent parent2 = previewView5.getParent();
                        Intrinsics.f(parent2, "null cannot be cast to non-null type android.view.ViewGroup");
                        ((ViewGroup) parent2).addView(imageView2, layoutParams2);
                        PreviewView previewView6 = livenessActivity.f23847b;
                        if (previewView6 == null) {
                            Intrinsics.n("cameraPreview");
                            throw null;
                        }
                        previewView6.setVisibility(8);
                    }
                    D6.e eVarG3 = livenessActivity.g();
                    String uploadUrl3 = livenessActivity.f23852g;
                    if (uploadUrl3 == null) {
                        Intrinsics.n("uploadUrl");
                        throw null;
                    }
                    String transactionId3 = livenessActivity.f23851f;
                    if (transactionId3 == null) {
                        Intrinsics.n("transactionId");
                        throw null;
                    }
                    int i34 = livenessActivity.f23853i;
                    eVarG3.getClass();
                    Intrinsics.checkNotNullParameter(uploadUrl3, "uploadUrl");
                    Intrinsics.checkNotNullParameter(transactionId3, "transactionId");
                    eVarG3.t = transactionId3;
                    eVarG3.f1614e = i34;
                    File file2 = eVarG3.f1620p;
                    if (file2 != null) {
                        do {
                            g0Var3 = eVarG3.f1617i;
                            value3 = g0Var3.getValue();
                        } while (!g0Var3.compareAndSet(value3, D6.i.a((D6.i) value3, null, 0.0f, null, null, D6.g.f1635a, null, null, HomeDialogState.PRIORITY_HIGHEST_111)));
                        AbstractC0780y.m(androidx.lifecycle.V.h(eVarG3), AbstractC0198c.x(new Ab.C(eVarG3, 7)), null, new D6.d(file2, uploadUrl3, eVarG3, transactionId3, null), 2);
                    }
                } else {
                    p280s6.a languageManager$Companion8 = p280s6.a.f42044a.getInstance();
                    D6.h hVar2 = iVar3.f1653a;
                    String str6 = hVar2.f1652a;
                    languageManager$Companion8.getClass();
                    ((TextView) obj4).setText(p280s6.a.a(str6));
                    AlgorithmScheduleProgressBar algorithmScheduleProgressBar4 = (AlgorithmScheduleProgressBar) obj3;
                    Intrinsics.e(algorithmScheduleProgressBar4);
                    int i35 = LivenessActivity.f23837Y;
                    int i36 = p292t6.a.f42345a;
                    float f12 = livenessActivity.t;
                    StringBuilder sb2 = new StringBuilder("currentProgress : ");
                    sb2.append(f12);
                    sb2.append(" , progress : ");
                    float f13 = iVar3.f1654b;
                    sb2.append(f13);
                    sb2.append(" , state: ");
                    sb2.append(hVar2);
                    p292t6.a.a(sb2.toString());
                    int iOrdinal4 = hVar2.ordinal();
                    if (iOrdinal4 == 0) {
                        ViewFlipper viewFlipper7 = livenessActivity.f23856p;
                        if (viewFlipper7 == null) {
                            Intrinsics.n("livenessViewFlipper");
                            throw null;
                        }
                        if (viewFlipper7.getVisibility() != 0) {
                            ViewFlipper viewFlipper8 = livenessActivity.f23856p;
                            if (viewFlipper8 == null) {
                                Intrinsics.n("livenessViewFlipper");
                                throw null;
                            }
                            i11 = 0;
                            viewFlipper8.setVisibility(0);
                        } else {
                            i11 = 0;
                        }
                        ViewFlipper viewFlipper9 = livenessActivity.f23856p;
                        if (viewFlipper9 == null) {
                            Intrinsics.n("livenessViewFlipper");
                            throw null;
                        }
                        viewFlipper9.setDisplayedChild(i11);
                        LivenessStepLayout livenessStepLayout5 = livenessActivity.f23855o;
                        if (livenessStepLayout5 == null) {
                            Intrinsics.n("faceStepView");
                            throw null;
                        }
                        livenessStepLayout5.setVisibility(4);
                    } else if (iOrdinal4 != 2) {
                        switch (iOrdinal4) {
                            case 7:
                            case 8:
                            case 9:
                            case 10:
                                ViewFlipper viewFlipper10 = livenessActivity.f23856p;
                                if (viewFlipper10 == null) {
                                    Intrinsics.n("livenessViewFlipper");
                                    throw null;
                                }
                                if (viewFlipper10.getVisibility() != 0) {
                                    ViewFlipper viewFlipper11 = livenessActivity.f23856p;
                                    if (viewFlipper11 == null) {
                                        Intrinsics.n("livenessViewFlipper");
                                        throw null;
                                    }
                                    viewFlipper11.setVisibility(0);
                                }
                                if (livenessActivity.t != f13) {
                                    r6.a aVar10 = p232p6.p.f41237d;
                                    if (f13 < ((aVar10 == null || (list = aVar10.f41586r) == null) ? 0 : list.size())) {
                                        livenessActivity.t = f13;
                                        ViewFlipper viewFlipper12 = livenessActivity.f23856p;
                                        if (viewFlipper12 == null) {
                                            Intrinsics.n("livenessViewFlipper");
                                            throw null;
                                        }
                                        viewFlipper12.setDisplayedChild(((int) f13) + 1);
                                        livenessActivity.k();
                                        switch (hVar2.ordinal()) {
                                            case 7:
                                                livenessActivity.f23844Q = "blink";
                                                top.zibin.luban.io.a aVar11 = livenessActivity.f23843M;
                                                if (aVar11 != null) {
                                                    aVar11.o("blink");
                                                }
                                                break;
                                            case 8:
                                                livenessActivity.f23844Q = "mouth_open";
                                                top.zibin.luban.io.a aVar12 = livenessActivity.f23843M;
                                                if (aVar12 != null) {
                                                    aVar12.o("mouth_open");
                                                }
                                                break;
                                            case 9:
                                                livenessActivity.f23844Q = "head_nod";
                                                top.zibin.luban.io.a aVar13 = livenessActivity.f23843M;
                                                if (aVar13 != null) {
                                                    aVar13.o("head_nod");
                                                }
                                                break;
                                            case 10:
                                                livenessActivity.f23844Q = "head_shake";
                                                top.zibin.luban.io.a aVar14 = livenessActivity.f23843M;
                                                if (aVar14 != null) {
                                                    aVar14.o("head_shake");
                                                }
                                                break;
                                        }
                                    }
                                }
                                LivenessStepLayout livenessStepLayout6 = livenessActivity.f23855o;
                                if (livenessStepLayout6 == null) {
                                    Intrinsics.n("faceStepView");
                                    throw null;
                                }
                                livenessStepLayout6.setVisibility(0);
                                LivenessStepLayout livenessStepLayout7 = livenessActivity.f23855o;
                                if (livenessStepLayout7 == null) {
                                    Intrinsics.n("faceStepView");
                                    throw null;
                                }
                                livenessStepLayout7.b((int) f13);
                                algorithmScheduleProgressBar4.b(1.0f, true, 50);
                                break;
                                break;
                            case 11:
                                ViewFlipper viewFlipper13 = livenessActivity.f23856p;
                                if (viewFlipper13 == null) {
                                    Intrinsics.n("livenessViewFlipper");
                                    throw null;
                                }
                                viewFlipper13.setVisibility(8);
                                livenessActivity.i();
                                CountdownProgressViewV2 countdownProgressViewV3 = livenessActivity.f23845X;
                                if (countdownProgressViewV3 == null) {
                                    Intrinsics.n("countdownProgressView");
                                    throw null;
                                }
                                countdownProgressViewV3.setVisibility(8);
                                LivenessStepLayout livenessStepLayout8 = livenessActivity.f23855o;
                                if (livenessStepLayout8 == null) {
                                    Intrinsics.n("faceStepView");
                                    throw null;
                                }
                                livenessStepLayout8.setVisibility(4);
                                livenessActivity.f23844Q = "hold_on";
                                top.zibin.luban.io.a aVar15 = livenessActivity.f23843M;
                                if (aVar15 != null) {
                                    aVar15.o("hold_on");
                                }
                                break;
                                break;
                        }
                    } else {
                        algorithmScheduleProgressBar4.b(0.0f, true, 50);
                    }
                    if (!Boolean.TRUE.equals(iVar3.f1655c) || livenessActivity.f23857v) {
                        livenessActivity.h();
                    } else {
                        Handler handler3 = livenessActivity.f23858w;
                        handler3.removeCallbacksAndMessages(null);
                        handler3.post(livenessActivity.f23840C);
                    }
                }
                return Unit.f38893a;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C0094p(kotlin.jvm.internal.B b7, FlowCollector flowCollector, Function2 function2) {
        this.f505a = 3;
        this.f508d = b7;
        this.f506b = flowCollector;
        this.f507c = (Ff.h) function2;
    }

    public C0094p(FlowCollector flowCollector, CoroutineContext coroutineContext) {
        this.f505a = 2;
        this.f508d = coroutineContext;
        this.f506b = p015ag.v.b(coroutineContext);
        this.f507c = new Zf.E(flowCollector, null);
    }
}
