package p364y6;

import B6.c0;
import O6.d;
import android.widget.FrameLayout;
import android.widget.ViewFlipper;
import androidx.cardview.widget.CardView;
import com.airbnb.lottie.LottieAnimationView;
import com.horcrux.svg.d0;
import com.palmpay.lib.liveness.lang.LanguageManager$Companion;
import com.palmpay.lib.liveness.model.LivenessAction;
import com.palmpay.lib.liveness.ui.LivenessActivity;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import p232p6.p;
import p232p6.r;
import p232p6.s;
import p232p6.v;
import p348x6.c;
import p348x6.e;
import p348x6.g;
import p348x6.i;
import r6.a;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class j implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f44081a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ LivenessActivity f44082b;

    public /* synthetic */ j(LivenessActivity livenessActivity, int i7) {
        this.f44081a = i7;
        this.f44082b = livenessActivity;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        List list;
        int size = 0;
        LivenessActivity livenessActivity = this.f44082b;
        switch (this.f44081a) {
            case 0:
                int i7 = LivenessActivity.f23837Y;
                ArrayList arrayList = new ArrayList();
                int dimensionPixelSize = livenessActivity.getResources().getDimensionPixelSize(r.face_lottie_size);
                ViewFlipper viewFlipper = livenessActivity.f23856p;
                if (viewFlipper == null) {
                    Intrinsics.n("livenessViewFlipper");
                    throw null;
                }
                int i10 = v.lib_liveness_move_in;
                CardView cardView = new CardView(livenessActivity);
                cardView.setRadius(dimensionPixelSize / 2.0f);
                cardView.setContentPadding(0, 0, 0, 0);
                cardView.setCardBackgroundColor(0);
                cardView.setCardElevation(0.0f);
                FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(dimensionPixelSize, dimensionPixelSize);
                layoutParams.gravity = 17;
                cardView.setLayoutParams(layoutParams);
                LottieAnimationView lottieAnimationView = new LottieAnimationView(livenessActivity);
                lottieAnimationView.setRepeatMode(1);
                lottieAnimationView.f19579e.f20305b.setRepeatCount(-1);
                lottieAnimationView.setAnimation(i10);
                lottieAnimationView.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
                lottieAnimationView.e();
                cardView.addView(lottieAnimationView);
                viewFlipper.addView(cardView);
                a aVar = p.f41237d;
                if (aVar != null && (list = aVar.f41586r) != null) {
                    size = list.size();
                }
                if (size > 0) {
                    a aVar2 = p.f41237d;
                    List<LivenessAction> list2 = aVar2 != null ? aVar2.f41586r : null;
                    Intrinsics.e(list2);
                    for (LivenessAction livenessAction : list2) {
                        String action = livenessAction.getAction();
                        switch (action.hashCode()) {
                            case -1115947006:
                                if (action.equals("headNode")) {
                                    arrayList.add(new c(livenessAction.getThreshold()));
                                    ViewFlipper viewFlipper2 = livenessActivity.f23856p;
                                    if (viewFlipper2 == null) {
                                        Intrinsics.n("livenessViewFlipper");
                                        throw null;
                                    }
                                    viewFlipper2.addView(livenessActivity.e(v.lib_liveness_head_nod, dimensionPixelSize, dimensionPixelSize));
                                } else {
                                    continue;
                                }
                                break;
                            case -230212346:
                                if (action.equals("headShake")) {
                                    arrayList.add(new e(livenessAction.getThreshold()));
                                    ViewFlipper viewFlipper3 = livenessActivity.f23856p;
                                    if (viewFlipper3 == null) {
                                        Intrinsics.n("livenessViewFlipper");
                                        throw null;
                                    }
                                    viewFlipper3.addView(livenessActivity.e(v.lib_liveness_head_shake, dimensionPixelSize, dimensionPixelSize));
                                } else {
                                    continue;
                                }
                                break;
                            case 93826908:
                                if (action.equals("blink")) {
                                    arrayList.add(new p348x6.a(livenessAction.getThreshold()));
                                    ViewFlipper viewFlipper4 = livenessActivity.f23856p;
                                    if (viewFlipper4 == null) {
                                        Intrinsics.n("livenessViewFlipper");
                                        throw null;
                                    }
                                    viewFlipper4.addView(livenessActivity.e(v.lib_liveness_blink, dimensionPixelSize, dimensionPixelSize));
                                } else {
                                    continue;
                                }
                                break;
                            case 104086727:
                                if (action.equals("mouth")) {
                                    arrayList.add(new i(livenessAction.getThreshold()));
                                    ViewFlipper viewFlipper5 = livenessActivity.f23856p;
                                    if (viewFlipper5 == null) {
                                        Intrinsics.n("livenessViewFlipper");
                                        throw null;
                                    }
                                    viewFlipper5.addView(livenessActivity.e(v.lib_liveness_mouth_open, dimensionPixelSize, dimensionPixelSize));
                                } else {
                                    continue;
                                }
                                break;
                        }
                    }
                }
                arrayList.add(new g());
                return new c0(arrayList, livenessActivity.f23853i, 1);
            default:
                if (livenessActivity.f23857v) {
                    return Unit.f38893a;
                }
                if (livenessActivity.isDestroyed() || livenessActivity.isFinishing()) {
                    return Unit.f38893a;
                }
                d dVar = livenessActivity.f23849d;
                if (dVar != null) {
                    dVar.dismiss();
                }
                p292t6.a.a("finished Timer--------------");
                LanguageManager$Companion languageManager$Companion = p280s6.a.f42044a;
                String strO = d0.o(languageManager$Companion, "smart_selfie_processing_timeout_title");
                String strO2 = d0.o(languageManager$Companion, "smart_selfie_live_task_timeout_msg");
                String strO3 = d0.o(languageManager$Companion, "smart_selfie_processing_retry_button");
                int i11 = s.lib_liveness_face_error;
                h hVar = new h(livenessActivity, 1);
                int i12 = L6.i.ppDefaultDialogTheme;
                O6.c cVar = new O6.c(livenessActivity);
                cVar.f6614u = 1;
                cVar.f(strO);
                cVar.f6607m = i11;
                cVar.f6598d = strO2;
                cVar.f6600f = strO3;
                cVar.f6602h = hVar;
                cVar.f6605k = true;
                cVar.f6606l = 0;
                cVar.f6615v = i12;
                d dialog = cVar.g();
                dialog.setCancelable(false);
                dialog.setCanceledOnTouchOutside(false);
                Intrinsics.checkNotNullExpressionValue(dialog, "dialog");
                livenessActivity.f23857v = true;
                livenessActivity.g().f1606A = false;
                livenessActivity.h();
                top.zibin.luban.io.a aVar3 = livenessActivity.f23843M;
                if (aVar3 != null) {
                    aVar3.r();
                }
                return Unit.f38893a;
        }
    }
}
