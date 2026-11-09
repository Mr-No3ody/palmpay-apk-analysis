package B6;

import Wf.AbstractC0780y;
import android.widget.FrameLayout;
import android.widget.ViewFlipper;
import androidx.cardview.widget.CardView;
import com.airbnb.lottie.LottieAnimationView;
import com.palmpay.lib.liveness.model.LivenessAction;
import com.palmpay.lib.liveness.v2.LivenessActivityV2;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: B6.f, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class C0084f implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f482a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ LivenessActivityV2 f483b;

    public /* synthetic */ C0084f(LivenessActivityV2 livenessActivityV2, int i7) {
        this.f482a = i7;
        this.f483b = livenessActivityV2;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        List list;
        LivenessActivityV2 livenessActivityV2 = this.f483b;
        switch (this.f482a) {
            case 0:
                int i7 = LivenessActivityV2.f23926Z;
                ArrayList arrayList = new ArrayList();
                int dimensionPixelSize = livenessActivityV2.getResources().getDimensionPixelSize(p232p6.r.face_lottie_size);
                ViewFlipper viewFlipper = livenessActivityV2.f23944j;
                if (viewFlipper == null) {
                    Intrinsics.n("livenessViewFlipper");
                    throw null;
                }
                int i10 = p232p6.v.lib_liveness_move_in;
                CardView cardView = new CardView(livenessActivityV2);
                cardView.setRadius(dimensionPixelSize / 2.0f);
                cardView.setContentPadding(0, 0, 0, 0);
                cardView.setCardBackgroundColor(0);
                cardView.setCardElevation(0.0f);
                FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(dimensionPixelSize, dimensionPixelSize);
                layoutParams.gravity = 17;
                cardView.setLayoutParams(layoutParams);
                LottieAnimationView lottieAnimationView = new LottieAnimationView(livenessActivityV2);
                lottieAnimationView.setRepeatMode(1);
                lottieAnimationView.f19579e.f20305b.setRepeatCount(-1);
                lottieAnimationView.setAnimation(i10);
                lottieAnimationView.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
                lottieAnimationView.e();
                cardView.addView(lottieAnimationView);
                viewFlipper.addView(cardView);
                r6.a aVar = p232p6.p.f41237d;
                if (((aVar == null || (list = aVar.f41586r) == null) ? 0 : list.size()) > 0) {
                    r6.a aVar2 = p232p6.p.f41237d;
                    List<LivenessAction> list2 = aVar2 != null ? aVar2.f41586r : null;
                    Intrinsics.e(list2);
                    for (LivenessAction livenessAction : list2) {
                        String action = livenessAction.getAction();
                        switch (action.hashCode()) {
                            case -1115947006:
                                if (action.equals("headNode")) {
                                    arrayList.add(new p348x6.c(livenessAction.getThreshold()));
                                    ViewFlipper viewFlipper2 = livenessActivityV2.f23944j;
                                    if (viewFlipper2 == null) {
                                        Intrinsics.n("livenessViewFlipper");
                                        throw null;
                                    }
                                    viewFlipper2.addView(livenessActivityV2.e(p232p6.v.lib_liveness_head_nod, dimensionPixelSize, dimensionPixelSize));
                                } else {
                                    continue;
                                }
                                break;
                            case -230212346:
                                if (action.equals("headShake")) {
                                    arrayList.add(new p348x6.e(livenessAction.getThreshold()));
                                    ViewFlipper viewFlipper3 = livenessActivityV2.f23944j;
                                    if (viewFlipper3 == null) {
                                        Intrinsics.n("livenessViewFlipper");
                                        throw null;
                                    }
                                    viewFlipper3.addView(livenessActivityV2.e(p232p6.v.lib_liveness_head_shake, dimensionPixelSize, dimensionPixelSize));
                                } else {
                                    continue;
                                }
                                break;
                            case 93826908:
                                if (action.equals("blink")) {
                                    arrayList.add(new p348x6.a(livenessAction.getThreshold()));
                                    ViewFlipper viewFlipper4 = livenessActivityV2.f23944j;
                                    if (viewFlipper4 == null) {
                                        Intrinsics.n("livenessViewFlipper");
                                        throw null;
                                    }
                                    viewFlipper4.addView(livenessActivityV2.e(p232p6.v.lib_liveness_blink, dimensionPixelSize, dimensionPixelSize));
                                } else {
                                    continue;
                                }
                                break;
                            case 104086727:
                                if (action.equals("mouth")) {
                                    arrayList.add(new p348x6.i(livenessAction.getThreshold()));
                                    ViewFlipper viewFlipper5 = livenessActivityV2.f23944j;
                                    if (viewFlipper5 == null) {
                                        Intrinsics.n("livenessViewFlipper");
                                        throw null;
                                    }
                                    viewFlipper5.addView(livenessActivityV2.e(p232p6.v.lib_liveness_mouth_open, dimensionPixelSize, dimensionPixelSize));
                                } else {
                                    continue;
                                }
                                break;
                        }
                    }
                }
                arrayList.add(new p348x6.g());
                return new c0(arrayList, livenessActivityV2.f23947v, 0);
            default:
                int i11 = LivenessActivityV2.f23926Z;
                b0 b0VarG = livenessActivityV2.g();
                b0VarG.f458i.f407h = true;
                AbstractC0780y.m(androidx.lifecycle.V.h(b0VarG), null, null, new Q(b0VarG, null), 3);
                return Unit.f38893a;
        }
    }
}
