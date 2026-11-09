package p082f9;

import F8.h;
import I8.x;
import Pa.r0;
import android.content.Context;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.mikepenz.iconics.view.IconicsImageView;
import com.transsnet.palmpay.account.bean.RealNameAuthInfoRsp;
import com.transsnet.palmpay.custom_view.r;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public x f36435a;

    public final String a(Long l5) {
        Context context;
        if (l5 == null) {
            x xVar = this.f36435a;
            String string = (xVar == null || (context = xVar.f4260a.getContext()) == null) ? null : context.getString(h.ac_unlimited_text);
            return string == null ? "" : string;
        }
        String strF = r0.F(l5.longValue());
        Intrinsics.e(strF);
        return strF;
    }

    public final void b(ConstraintLayout constraintLayout, IconicsImageView iconicsImageView, TextView textView, TextView textView2, TextView textView3, TextView textView4, RealNameAuthInfoRsp.TierLimit tierLimit, boolean z3, boolean z8) {
        String str;
        if (textView != null) {
            if (tierLimit == null || (str = tierLimit.name) == null) {
                str = "";
            }
            textView.setText(str);
        }
        if (textView3 != null) {
            textView3.setText(a(tierLimit != null ? tierLimit.transactionLimit : null));
        }
        if (textView4 != null) {
            textView4.setText(a(tierLimit != null ? tierLimit.balanceLimit : null));
        }
        if (constraintLayout != null) {
            constraintLayout.setBackgroundResource(z3 ? r.cv_shape_rect_corner_4_bg_dark : 0);
        }
        if (iconicsImageView != null) {
            p220oa.h.s(iconicsImageView, z3);
        }
        if (textView2 != null) {
            p220oa.h.s(textView2, z8);
        }
    }
}
