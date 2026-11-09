package p352xc;

import Bc.f;
import N8.q0;
import Pa.r0;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.transsnet.palmpay.core.base.BaseApplication;
import com.transsnet.palmpay.jara_packet.bean.resp.ReferEarnHomeResp;
import kotlin.jvm.internal.Intrinsics;
import p059e1.a;
import p236pc.d;
import p355xf.C2131j;
import p355xf.t;
import x9.u;

/* JADX INFO: loaded from: classes4.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final View f43841a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final f f43842b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public ReferEarnHomeResp f43843c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final t f43844d = C2131j.b(new u(3));

    public b(ViewStub viewStub) {
        View viewInflate;
        if (viewStub != null) {
            try {
                viewInflate = viewStub.inflate();
            } catch (Exception unused) {
            }
        } else {
            viewInflate = null;
        }
        this.f43841a = viewInflate;
        View view = this.f43841a;
        if (view != null) {
            int i7 = d.ivCashLevel1;
            TextView textView = (TextView) a.m(i7, view);
            if (textView != null) {
                i7 = d.ivCashLevel2;
                TextView textView2 = (TextView) a.m(i7, view);
                if (textView2 != null) {
                    i7 = d.ivCashLevel3;
                    TextView textView3 = (TextView) a.m(i7, view);
                    if (textView3 != null) {
                        i7 = d.seekBarProgress;
                        ProgressBar progressBar = (ProgressBar) a.m(i7, view);
                        if (progressBar != null) {
                            i7 = d.tvCashLevel1;
                            TextView textView4 = (TextView) a.m(i7, view);
                            if (textView4 != null) {
                                i7 = d.tvCashLevel2;
                                TextView textView5 = (TextView) a.m(i7, view);
                                if (textView5 != null) {
                                    i7 = d.tvCashLevel3;
                                    TextView textView6 = (TextView) a.m(i7, view);
                                    if (textView6 != null) {
                                        this.f43842b = new f((ConstraintLayout) view, textView, textView2, textView3, progressBar, textView4, textView5, textView6, 15);
                                        return;
                                    }
                                }
                            }
                        }
                    }
                }
            }
            throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i7)));
        }
    }

    public static String a(long j6) {
        return q0.j(BaseApplication.getCurrencySymbol(), r0.n0(j6));
    }

    public final String b(String str) {
        Context context;
        int i7 = 0;
        if (str != null) {
            try {
                i7 = Integer.parseInt(str);
            } catch (Exception unused) {
            }
        }
        View view = this.f43841a;
        if (view == null || (context = view.getContext()) == null) {
            return null;
        }
        return context.getString(i7 > 1 ? p236pc.f.jp_s_users : p236pc.f.jp_s_user, Integer.valueOf(i7));
    }

    public final void c(ReferEarnHomeResp referEarnHomeResp) {
        if (referEarnHomeResp != null) {
            View view = this.f43841a;
            int measuredWidth = view != null ? view.getMeasuredWidth() : 0;
            float f10 = referEarnHomeResp.targetAmt1;
            float f11 = referEarnHomeResp.targetAmt3;
            float f12 = f10 / f11;
            float f13 = referEarnHomeResp.targetAmt2 / f11;
            f fVar = this.f43842b;
            ViewGroup.LayoutParams layoutParams = fVar != null ? ((TextView) fVar.f698d).getLayoutParams() : null;
            Intrinsics.f(layoutParams, "null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
            ConstraintLayout.LayoutParams layoutParams2 = (ConstraintLayout.LayoutParams) layoutParams;
            float f14 = measuredWidth;
            t tVar = this.f43844d;
            layoutParams2.setMargins(((int) (f12 * f14)) - ((Number) tVar.getValue()).intValue(), 0, 0, 0);
            if (fVar != null) {
                ((TextView) fVar.f698d).setLayoutParams(layoutParams2);
            }
            ViewGroup.LayoutParams layoutParams3 = fVar != null ? ((TextView) fVar.f699e).getLayoutParams() : null;
            Intrinsics.f(layoutParams3, "null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
            ConstraintLayout.LayoutParams layoutParams4 = (ConstraintLayout.LayoutParams) layoutParams3;
            layoutParams4.setMargins(((int) (f13 * f14)) - ((Number) tVar.getValue()).intValue(), 0, 0, 0);
            if (fVar != null) {
                ((TextView) fVar.f699e).setLayoutParams(layoutParams4);
            }
        }
    }
}
