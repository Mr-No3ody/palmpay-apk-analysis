package p310ub;

import L6.b;
import Ya.g;
import android.view.animation.LinearInterpolator;
import android.view.animation.RotateAnimation;
import android.widget.ImageView;
import android.widget.TextView;
import com.transsnet.palmpay.credit.bean.resp.OcApplyResultData;
import com.transsnet.palmpay.credit.ui.activity.okcard.OcApplyResultActivity;
import kotlin.jvm.internal.Intrinsics;
import p355xf.t;

/* JADX INFO: renamed from: ub.p, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class RunnableC2094p implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f42900a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ OcApplyResultActivity f42901b;

    public /* synthetic */ RunnableC2094p(OcApplyResultActivity ocApplyResultActivity, int i7) {
        this.f42900a = i7;
        this.f42901b = ocApplyResultActivity;
    }

    @Override // java.lang.Runnable
    public final void run() {
        OcApplyResultActivity ocApplyResultActivity = this.f42901b;
        switch (this.f42900a) {
            case 0:
                OcApplyResultData ocApplyResultData = ocApplyResultActivity.f29283D0;
                if (ocApplyResultData != null) {
                    ocApplyResultData.setApplyId("");
                }
                ocApplyResultActivity.r();
                break;
            case 1:
                int i7 = OcApplyResultActivity.f29276O0;
                t tVar = ocApplyResultActivity.f29277A;
                Object value = tVar.getValue();
                Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
                ((TextView) value).setText(String.valueOf(ocApplyResultActivity.f29293L0));
                int i10 = ocApplyResultActivity.f29293L0;
                if (i10 != 0 && i10 != 1) {
                    switch (i10) {
                        case 7:
                            ocApplyResultActivity.w().clearAnimation();
                            ocApplyResultActivity.w().setVisibility(4);
                            Object value2 = ocApplyResultActivity.f29304g.getValue();
                            Intrinsics.checkNotNullExpressionValue(value2, "getValue(...)");
                            ((ImageView) value2).setVisibility(0);
                            t tVar2 = ocApplyResultActivity.f29302e;
                            Object value3 = tVar2.getValue();
                            Intrinsics.checkNotNullExpressionValue(value3, "getValue(...)");
                            ((ImageView) value3).setVisibility(0);
                            RotateAnimation rotateAnimation = new RotateAnimation(0.0f, 360.0f, 1, 0.5f, 1, 0.5f);
                            rotateAnimation.setDuration(1000L);
                            rotateAnimation.setRepeatCount(-1);
                            rotateAnimation.setInterpolator(new LinearInterpolator());
                            Object value4 = tVar2.getValue();
                            Intrinsics.checkNotNullExpressionValue(value4, "getValue(...)");
                            ((ImageView) value4).startAnimation(rotateAnimation);
                            Object value5 = ocApplyResultActivity.f29301d.getValue();
                            Intrinsics.checkNotNullExpressionValue(value5, "getValue(...)");
                            ((TextView) value5).setTextColor(ocApplyResultActivity.getColor(b.ppColorTextPrimary));
                            break;
                        case 8:
                            ocApplyResultActivity.v().clearAnimation();
                            ocApplyResultActivity.v().setVisibility(4);
                            Object value6 = ocApplyResultActivity.f29308o.getValue();
                            Intrinsics.checkNotNullExpressionValue(value6, "getValue(...)");
                            ((ImageView) value6).setVisibility(0);
                            ocApplyResultActivity.w().setVisibility(0);
                            RotateAnimation rotateAnimation2 = new RotateAnimation(0.0f, 360.0f, 1, 0.5f, 1, 0.5f);
                            rotateAnimation2.setDuration(1000L);
                            rotateAnimation2.setRepeatCount(-1);
                            rotateAnimation2.setInterpolator(new LinearInterpolator());
                            ocApplyResultActivity.w().startAnimation(rotateAnimation2);
                            Object value7 = ocApplyResultActivity.f29303f.getValue();
                            Intrinsics.checkNotNullExpressionValue(value7, "getValue(...)");
                            ((TextView) value7).setTextColor(ocApplyResultActivity.getColor(b.ppColorTextPrimary));
                            break;
                        case 9:
                            ocApplyResultActivity.u().clearAnimation();
                            ocApplyResultActivity.u().setVisibility(4);
                            Object value8 = ocApplyResultActivity.t.getValue();
                            Intrinsics.checkNotNullExpressionValue(value8, "getValue(...)");
                            ((ImageView) value8).setVisibility(0);
                            ocApplyResultActivity.v().setVisibility(0);
                            RotateAnimation rotateAnimation3 = new RotateAnimation(0.0f, 360.0f, 1, 0.5f, 1, 0.5f);
                            rotateAnimation3.setDuration(1000L);
                            rotateAnimation3.setRepeatCount(-1);
                            rotateAnimation3.setInterpolator(new LinearInterpolator());
                            ocApplyResultActivity.v().startAnimation(rotateAnimation3);
                            Object value9 = ocApplyResultActivity.f29306j.getValue();
                            Intrinsics.checkNotNullExpressionValue(value9, "getValue(...)");
                            ((TextView) value9).setTextColor(ocApplyResultActivity.getColor(b.ppColorTextPrimary));
                            break;
                        case 10:
                            ocApplyResultActivity.u().setVisibility(0);
                            RotateAnimation rotateAnimation4 = new RotateAnimation(0.0f, 360.0f, 1, 0.5f, 1, 0.5f);
                            rotateAnimation4.setDuration(1000L);
                            rotateAnimation4.setRepeatCount(-1);
                            rotateAnimation4.setInterpolator(new LinearInterpolator());
                            ocApplyResultActivity.u().startAnimation(rotateAnimation4);
                            break;
                    }
                } else {
                    Object value10 = ocApplyResultActivity.f29318w.getValue();
                    Intrinsics.checkNotNullExpressionValue(value10, "getValue(...)");
                    ((TextView) value10).setText(ocApplyResultActivity.getString(g.cs_oc_unstable_network));
                }
                int i11 = ocApplyResultActivity.f29293L0 - 1;
                ocApplyResultActivity.f29293L0 = i11;
                if (i11 >= 0) {
                    ocApplyResultActivity.f29295M0.postDelayed((Runnable) ocApplyResultActivity.f29296N0.getValue(), 1000L);
                } else {
                    Object value11 = tVar.getValue();
                    Intrinsics.checkNotNullExpressionValue(value11, "getValue(...)");
                    ((TextView) value11).setText((CharSequence) null);
                }
                break;
            case 2:
                Object value12 = ocApplyResultActivity.f29292L.getValue();
                Intrinsics.checkNotNullExpressionValue(value12, "getValue(...)");
                ((TextView) value12).setText(String.valueOf(ocApplyResultActivity.f29285F0));
                int i12 = ocApplyResultActivity.f29285F0 - 1;
                ocApplyResultActivity.f29285F0 = i12;
                if (i12 > 0) {
                    ocApplyResultActivity.f29290J0.postDelayed((Runnable) ocApplyResultActivity.f29291K0.getValue(), 1000L);
                } else {
                    ocApplyResultActivity.finish();
                }
                break;
            default:
                ocApplyResultActivity.r();
                break;
        }
    }
}
