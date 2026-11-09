package p179m1;

import Pa.r0;
import android.animation.Animator;
import android.view.KeyEvent;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.airbnb.lottie.LottieAnimationView;
import com.transsnet.palmpay.jara_packet.bean.resp.ReferEarnHomeResp;
import com.transsnet.palmpay.jara_packet.ui.activity.ReferEarnRewardDialogActivity;
import com.transsnet.palmpay.util.SizeUtils;
import com.transsnet.palmpay.util.SpanUtils;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import p025ba.k;
import p220oa.h;
import p236pc.c;
import p236pc.f;
import p355xf.t;

/* JADX INFO: loaded from: classes.dex */
public final class b implements Animator.AnimatorListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f39432a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ KeyEvent.Callback f39433b;

    public /* synthetic */ b(KeyEvent.Callback callback, int i7) {
        this.f39432a = i7;
        this.f39433b = callback;
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animation) {
        switch (this.f39432a) {
            case 0:
                Intrinsics.checkNotNullParameter(animation, "animation");
                e.a((LottieAnimationView) this.f39433b, true);
                break;
            default:
                Intrinsics.checkNotNullParameter(animation, "p0");
                break;
        }
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animation) {
        KeyEvent.Callback callback = this.f39433b;
        switch (this.f39432a) {
            case 0:
                Intrinsics.checkNotNullParameter(animation, "animation");
                e.a((LottieAnimationView) callback, false);
                break;
            default:
                Intrinsics.checkNotNullParameter(animation, "p0");
                ReferEarnRewardDialogActivity.a aVar = ReferEarnRewardDialogActivity.f31932q0;
                ReferEarnRewardDialogActivity referEarnRewardDialogActivity = (ReferEarnRewardDialogActivity) callback;
                r0.h1(referEarnRewardDialogActivity.o(), r0.y0("jp_pickcard_result_title.webp"), c.jp_pickcard_result_title);
                h.s(referEarnRewardDialogActivity.o(), true);
                Object value = referEarnRewardDialogActivity.f31946f.getValue();
                Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
                h.s((ImageView) value, true);
                ReferEarnHomeResp referEarnHomeResp = referEarnRewardDialogActivity.f31953p0;
                if (referEarnHomeResp != null) {
                    boolean zIsDialog1Type = referEarnHomeResp.isDialog1Type();
                    t tVar = referEarnRewardDialogActivity.f31949j;
                    t tVar2 = referEarnRewardDialogActivity.f31948i;
                    if (zIsDialog1Type) {
                        Object value2 = tVar2.getValue();
                        Intrinsics.checkNotNullExpressionValue(value2, "getValue(...)");
                        ((TextView) value2).setText(referEarnRewardDialogActivity.getString(f.jp_invite_now));
                        Object value3 = tVar.getValue();
                        Intrinsics.checkNotNullExpressionValue(value3, "getValue(...)");
                        h.s((LinearLayout) value3, true);
                        Object value4 = referEarnRewardDialogActivity.f31935C.getValue();
                        Intrinsics.checkNotNullExpressionValue(value4, "getValue(...)");
                        h.s((ConstraintLayout) value4, true);
                        List<ReferEarnHomeResp.ReferEarnHomeCardBean> list = referEarnHomeResp.cardContextDTOS;
                        if (list != null && list.size() == 3) {
                            Object value5 = referEarnRewardDialogActivity.f31934B.getValue();
                            Intrinsics.checkNotNullExpressionValue(value5, "getValue(...)");
                            TextView textView = (TextView) value5;
                            Long l5 = list.get(0).middleValue;
                            textView.setText(l5 != null ? l5.toString() : null);
                            Object value6 = referEarnRewardDialogActivity.f31933A.getValue();
                            Intrinsics.checkNotNullExpressionValue(value6, "getValue(...)");
                            TextView textView2 = (TextView) value6;
                            Long l6 = list.get(1).middleValue;
                            textView2.setText(l6 != null ? l6.toString() : null);
                            Object value7 = referEarnRewardDialogActivity.f31955w.getValue();
                            Intrinsics.checkNotNullExpressionValue(value7, "getValue(...)");
                            TextView textView3 = (TextView) value7;
                            Long l8 = list.get(2).middleValue;
                            textView3.setText(l8 != null ? l8.toString() : null);
                        }
                        referEarnRewardDialogActivity.q();
                    } else if (referEarnHomeResp.isDialog2Type()) {
                        Object value8 = tVar2.getValue();
                        Intrinsics.checkNotNullExpressionValue(value8, "getValue(...)");
                        ((TextView) value8).setText(referEarnRewardDialogActivity.getString(k.core_claim_now));
                        Object value9 = tVar.getValue();
                        Intrinsics.checkNotNullExpressionValue(value9, "getValue(...)");
                        h.s((LinearLayout) value9, true);
                        Object value10 = referEarnRewardDialogActivity.f31954v.getValue();
                        Intrinsics.checkNotNullExpressionValue(value10, "getValue(...)");
                        h.s((ConstraintLayout) value10, true);
                        List<ReferEarnHomeResp.ReferEarnHomeCardBean> list2 = referEarnHomeResp.cardContextDTOS;
                        if (list2 != null && list2.size() == 3) {
                            Object value11 = referEarnRewardDialogActivity.t.getValue();
                            Intrinsics.checkNotNullExpressionValue(value11, "getValue(...)");
                            TextView textView4 = (TextView) value11;
                            SpanUtils fontSize = new SpanUtils().append(referEarnRewardDialogActivity.getString(k.core_currency_char_nig)).setFontSize(SizeUtils.dp2px(18.0f));
                            Long l10 = list2.get(0).middleValue;
                            textView4.setText(fontSize.append(r0.E(l10 != null ? l10.longValue() : 0L)).setFontSize(SizeUtils.dp2px(40.0f)).create());
                            Object value12 = referEarnRewardDialogActivity.f31952p.getValue();
                            Intrinsics.checkNotNullExpressionValue(value12, "getValue(...)");
                            TextView textView5 = (TextView) value12;
                            SpanUtils fontSize2 = new SpanUtils().append(referEarnRewardDialogActivity.getString(k.core_currency_char_nig)).setFontSize(SizeUtils.dp2px(10.0f));
                            Long l11 = list2.get(1).middleValue;
                            textView5.setText(fontSize2.append(r0.E(l11 != null ? l11.longValue() : 0L)).setFontSize(SizeUtils.dp2px(22.0f)).create());
                            Object value13 = referEarnRewardDialogActivity.f31951o.getValue();
                            Intrinsics.checkNotNullExpressionValue(value13, "getValue(...)");
                            TextView textView6 = (TextView) value13;
                            SpanUtils fontSize3 = new SpanUtils().append(referEarnRewardDialogActivity.getString(k.core_currency_char_nig)).setFontSize(SizeUtils.dp2px(10.0f));
                            Long l12 = list2.get(2).middleValue;
                            textView6.setText(fontSize3.append(r0.E(l12 != null ? l12.longValue() : 0L)).setFontSize(SizeUtils.dp2px(22.0f)).create());
                        }
                        referEarnRewardDialogActivity.q();
                    } else if (referEarnHomeResp.isDialog3Type()) {
                        Object value14 = referEarnRewardDialogActivity.f31945e.getValue();
                        Intrinsics.checkNotNullExpressionValue(value14, "getValue(...)");
                        h.s((RelativeLayout) value14, true);
                    }
                }
                break;
        }
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationRepeat(Animator animation) {
        switch (this.f39432a) {
            case 0:
                Intrinsics.checkNotNullParameter(animation, "animation");
                break;
            default:
                Intrinsics.checkNotNullParameter(animation, "p0");
                break;
        }
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animation) {
        switch (this.f39432a) {
            case 0:
                Intrinsics.checkNotNullParameter(animation, "animation");
                break;
            default:
                Intrinsics.checkNotNullParameter(animation, "p0");
                break;
        }
    }
}
