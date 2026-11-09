package B6;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.text.Html;
import android.text.Spanned;
import android.view.View;
import android.widget.TextView;
import android.widget.ViewFlipper;
import androidx.appcompat.widget.AppCompatImageView;
import com.palmpay.lib.liveness.lang.LanguageManager$Companion;
import com.palmpay.lib.liveness.result.LiveIDResult;
import com.palmpay.lib.liveness.ui.widget.CountdownProgressViewV2;
import com.palmpay.lib.liveness.ui.widget.LivenessStepLayout;
import com.palmpay.lib.liveness.v2.LivenessActivityV2;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.FlowCollector;

/* JADX INFO: renamed from: B6.s, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C0096s implements FlowCollector {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ LivenessActivityV2 f517a;

    public C0096s(LivenessActivityV2 livenessActivityV2) {
        this.f517a = livenessActivityV2;
    }

    @Override // kotlinx.coroutines.flow.FlowCollector
    public final Object emit(Object obj, Continuation continuation) {
        int i7;
        Spanned spannedFromHtml;
        D d2 = (D) obj;
        boolean z3 = d2 instanceof B;
        LivenessActivityV2 livenessActivityV2 = this.f517a;
        Handler handler = livenessActivityV2.f23927A;
        if (z3) {
            int i10 = LivenessActivityV2.f23926Z;
            livenessActivityV2.i();
            B b7 = (B) d2;
            EnumC0100w enumC0100w = b7.f384a;
            i7 = enumC0100w != null ? AbstractC0086h.f487a[enumC0100w.ordinal()] : -1;
            if (i7 == 1) {
                livenessActivityV2.f23934X = "blink";
                top.zibin.luban.io.a aVar = livenessActivityV2.f23933Q;
                if (aVar != null) {
                    aVar.o("blink");
                }
            } else if (i7 == 2) {
                livenessActivityV2.f23934X = "mouth_open";
                top.zibin.luban.io.a aVar2 = livenessActivityV2.f23933Q;
                if (aVar2 != null) {
                    aVar2.o("mouth_open");
                }
            } else if (i7 == 3) {
                livenessActivityV2.f23934X = "head_nod";
                top.zibin.luban.io.a aVar3 = livenessActivityV2.f23933Q;
                if (aVar3 != null) {
                    aVar3.o("head_nod");
                }
            } else if (i7 == 4) {
                livenessActivityV2.f23934X = "head_shake";
                top.zibin.luban.io.a aVar4 = livenessActivityV2.f23933Q;
                if (aVar4 != null) {
                    aVar4.o("head_shake");
                }
            }
            handler.removeCallbacksAndMessages(null);
            handler.post(livenessActivityV2.f23931L);
            ViewFlipper viewFlipper = livenessActivityV2.f23944j;
            if (viewFlipper == null) {
                Intrinsics.n("livenessViewFlipper");
                throw null;
            }
            int i11 = (int) b7.f385b;
            viewFlipper.setDisplayedChild(1 + i11);
            LivenessStepLayout livenessStepLayout = livenessActivityV2.f23943i;
            if (livenessStepLayout == null) {
                Intrinsics.n("faceStepView");
                throw null;
            }
            livenessStepLayout.b(i11);
            int i12 = p292t6.a.f42345a;
            p292t6.a.a("startTimer index effect: " + i11);
        } else if (d2 instanceof C) {
            int i13 = LivenessActivityV2.f23926Z;
            CountdownProgressViewV2 countdownProgressViewV2 = livenessActivityV2.f23935Y;
            if (countdownProgressViewV2 == null) {
                Intrinsics.n("countdownProgressView");
                throw null;
            }
            countdownProgressViewV2.b();
        } else if (d2 instanceof C0101x) {
            int i14 = LivenessActivityV2.f23926Z;
            livenessActivityV2.g().f458i.f407h = true;
            top.zibin.luban.io.a aVar5 = livenessActivityV2.f23933Q;
            if (aVar5 != null) {
                aVar5.r();
            }
            EnumC0100w enumC0100w2 = ((C0101x) d2).f535a;
            if (!livenessActivityV2.f23948w && !livenessActivityV2.isDestroyed() && !livenessActivityV2.isFinishing()) {
                O6.d dVar = livenessActivityV2.f23939d;
                if (dVar != null) {
                    dVar.dismiss();
                }
                LanguageManager$Companion languageManager$Companion = p280s6.a.f42044a;
                String strO = com.horcrux.svg.d0.o(languageManager$Companion, "smart_timeout_dialog_title");
                String defaultMsg = com.horcrux.svg.d0.o(languageManager$Companion, "smart_selfie_live_task_timeout_msg");
                String strO2 = com.horcrux.svg.d0.o(languageManager$Companion, "smart_selfie_processing_retry_button");
                if (livenessActivityV2.f23940e == null) {
                    View viewInflate = View.inflate(livenessActivityV2, p232p6.u.lib_liveness_dialog_content, null);
                    Intrinsics.e(viewInflate);
                    livenessActivityV2.f23941f = new e0(viewInflate);
                    O6.c cVar = new O6.c(livenessActivityV2);
                    cVar.f6596b = O6.d.f(strO);
                    cVar.f6605k = true;
                    cVar.f6616w = viewInflate;
                    ViewOnClickListenerC0082d viewOnClickListenerC0082d = new ViewOnClickListenerC0082d(livenessActivityV2, 3);
                    cVar.f6600f = strO2;
                    cVar.f6602h = viewOnClickListenerC0082d;
                    O6.d dVarA = cVar.a();
                    livenessActivityV2.f23940e = dVarA;
                    dVarA.setCancelable(false);
                }
                e0 e0Var = livenessActivityV2.f23941f;
                if (e0Var != null) {
                    Intrinsics.checkNotNullParameter(defaultMsg, "defaultMsg");
                    View view = e0Var.f475b;
                    view.setVisibility(8);
                    TextView textView = e0Var.f478e;
                    textView.setVisibility(8);
                    TextView textView2 = e0Var.f480g;
                    textView2.setVisibility(8);
                    i7 = enumC0100w2 != null ? d0.f471a[enumC0100w2.ordinal()] : -1;
                    String str = e0Var.f481h;
                    AppCompatImageView appCompatImageView = e0Var.f479f;
                    AppCompatImageView appCompatImageView2 = e0Var.f477d;
                    switch (i7) {
                        case 1:
                            languageManager$Companion.getInstance().getClass();
                            spannedFromHtml = Html.fromHtml(kotlin.text.y.k(p280s6.a.a("smart_face_into_frame"), "{themeColor}", str), 0);
                            appCompatImageView2.setImageResource(p232p6.s.lib_liveness_avatar_original);
                            break;
                        case 2:
                            languageManager$Companion.getInstance().getClass();
                            spannedFromHtml = Html.fromHtml(kotlin.text.y.k(p280s6.a.a("smart_face_too_far"), "{themeColor}", str), 0);
                            appCompatImageView2.setImageResource(p232p6.s.lib_liveness_avatar_original);
                            textView.setVisibility(0);
                            languageManager$Companion.getInstance().getClass();
                            textView.setText(p280s6.a.a("smart_move_closer"));
                            break;
                        case 3:
                            languageManager$Companion.getInstance().getClass();
                            spannedFromHtml = Html.fromHtml(kotlin.text.y.k(p280s6.a.a("smart_face_too_close"), "{themeColor}", str), 0);
                            appCompatImageView2.setImageResource(p232p6.s.lib_liveness_avatar_original);
                            textView.setVisibility(0);
                            languageManager$Companion.getInstance().getClass();
                            textView.setText(p280s6.a.a("smart_move_back"));
                            break;
                        case 4:
                            languageManager$Companion.getInstance().getClass();
                            spannedFromHtml = Html.fromHtml(kotlin.text.y.k(p280s6.a.a("smart_face_blink"), "{themeColor}", str), 0);
                            view.setVisibility(0);
                            appCompatImageView2.setImageResource(p232p6.s.lib_liveness_avatar_eyes_close);
                            appCompatImageView.setImageResource(p232p6.s.lib_liveness_avatar_original);
                            textView.setVisibility(0);
                            textView2.setVisibility(0);
                            languageManager$Companion.getInstance().getClass();
                            textView.setText(p280s6.a.a("smart_eyes_close"));
                            languageManager$Companion.getInstance().getClass();
                            textView2.setText(p280s6.a.a("smart_eyes_open"));
                            break;
                        case 5:
                            languageManager$Companion.getInstance().getClass();
                            spannedFromHtml = Html.fromHtml(kotlin.text.y.k(p280s6.a.a("smart_face_mouth"), "{themeColor}", str), 0);
                            view.setVisibility(0);
                            appCompatImageView2.setImageResource(p232p6.s.lib_liveness_avatar_mouth_open);
                            appCompatImageView.setImageResource(p232p6.s.lib_liveness_avatar_original);
                            textView.setVisibility(0);
                            textView2.setVisibility(0);
                            languageManager$Companion.getInstance().getClass();
                            textView.setText(p280s6.a.a("smart_mouth_open"));
                            languageManager$Companion.getInstance().getClass();
                            textView2.setText(p280s6.a.a("smart_mouth_close"));
                            break;
                        case 6:
                            languageManager$Companion.getInstance().getClass();
                            spannedFromHtml = Html.fromHtml(kotlin.text.y.k(p280s6.a.a("smart_face_head_shake"), "{themeColor}", str), 0);
                            view.setVisibility(0);
                            appCompatImageView2.setImageResource(p232p6.s.lib_liveness_avatar_head_left);
                            appCompatImageView.setImageResource(p232p6.s.lib_liveness_avatar_head_right);
                            textView.setVisibility(0);
                            textView2.setVisibility(0);
                            languageManager$Companion.getInstance().getClass();
                            textView.setText(p280s6.a.a("smart_head_right"));
                            languageManager$Companion.getInstance().getClass();
                            textView2.setText(p280s6.a.a("smart_head_left"));
                            break;
                        case 7:
                            languageManager$Companion.getInstance().getClass();
                            spannedFromHtml = Html.fromHtml(kotlin.text.y.k(p280s6.a.a("smart_face_head_nod"), "{themeColor}", str), 0);
                            view.setVisibility(0);
                            appCompatImageView2.setImageResource(p232p6.s.lib_liveness_avatar_head_up);
                            appCompatImageView.setImageResource(p232p6.s.lib_liveness_avatar_head_down);
                            textView.setVisibility(0);
                            textView2.setVisibility(0);
                            languageManager$Companion.getInstance().getClass();
                            textView.setText(p280s6.a.a("smart_head_up"));
                            languageManager$Companion.getInstance().getClass();
                            textView2.setText(p280s6.a.a("smart_head_down"));
                            break;
                        default:
                            spannedFromHtml = Html.fromHtml(defaultMsg, 0);
                            e0Var.f474a.setVisibility(0);
                            appCompatImageView2.setImageResource(p232p6.s.lib_liveness_avatar_original);
                            break;
                    }
                    e0Var.f476c.setText(spannedFromHtml);
                }
                O6.d dVar2 = livenessActivityV2.f23940e;
                if (dVar2 != null) {
                    dVar2.show();
                }
                livenessActivityV2.f23948w = true;
            }
        } else if (d2 instanceof C0103z) {
            handler.removeCallbacksAndMessages(null);
            handler.post(livenessActivityV2.f23930H);
            livenessActivityV2.f23934X = "hold_on";
            top.zibin.luban.io.a aVar6 = livenessActivityV2.f23933Q;
            if (aVar6 != null) {
                aVar6.o("hold_on");
            }
        } else if (d2 instanceof C0102y) {
            O6.d dVar3 = livenessActivityV2.f23939d;
            if (dVar3 != null) {
                dVar3.dismiss();
            }
            Intent intent = new Intent();
            Bundle bundle = new Bundle();
            C0102y c0102y = (C0102y) d2;
            bundle.putParcelable("key_bundle_live_id_result", c0102y.f536a);
            io.fastkv.n.H(c0102y.f536a);
            livenessActivityV2.setResult(-1, intent.putExtras(bundle));
            livenessActivityV2.finish();
        } else {
            if (!(d2 instanceof A)) {
                throw new p355xf.l();
            }
            O6.d dVar4 = livenessActivityV2.f23939d;
            if (dVar4 != null) {
                dVar4.dismiss();
            }
            LiveIDResult.Error error = new LiveIDResult.Error(((A) d2).f383a);
            Intent intent2 = new Intent();
            Bundle bundle2 = new Bundle();
            bundle2.putParcelable("key_bundle_live_id_result", error);
            io.fastkv.n.H(error);
            livenessActivityV2.setResult(-1, intent2.putExtras(bundle2));
            livenessActivityV2.finish();
        }
        return Unit.f38893a;
    }
}
