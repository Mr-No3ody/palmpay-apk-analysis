package Je;

import Ab.ViewOnClickListenerC0053e;
import Me.AbstractC0456a;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.palmpay.lib.ui.button.PpButton;
import com.transsnet.palmpay.custom_view.utils.CommonViewExtKt;
import com.transsnet.palmpay.main.export.bean.rsp.PalmZoneReferEarnHomeResp;
import com.transsnet.palmpay.ui.fragment.HomePalmZoneTabV2;
import java.util.List;
import kotlin.collections.C1850q;
import kotlin.collections.z;
import kotlin.jvm.internal.Intrinsics;
import p355xf.C2131j;
import p355xf.t;

/* JADX INFO: loaded from: classes4.dex */
public final class n extends AbstractC0456a implements ViewTreeObserver.OnGlobalLayoutListener {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final LinearLayout f4828c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final HomePalmZoneTabV2 f4829d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public View f4830e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public View f4831f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public PalmZoneReferEarnHomeResp f4832g;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public TextView f4833i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public ProgressBar f4834j;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public List f4835o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public PpButton f4836p;
    public final t t;

    public n(LinearLayout linearLayout, HomePalmZoneTabV2 homePalmZoneTabV2) {
        super(0);
        this.f4828c = linearLayout;
        this.f4829d = homePalmZoneTabV2;
        this.f4835o = z.f38935a;
        this.t = C2131j.b(new G9.j(26));
        AppCompatImageView appCompatImageViewE = e(linearLayout, Ac.d.main_rewards_hub_skeleton_bg);
        this.f5949a = appCompatImageViewE;
        if (appCompatImageViewE == null) {
            n();
        }
    }

    public static m l(int i7, View view) {
        View viewFindViewById = view.findViewById(i7);
        return new m(viewFindViewById, viewFindViewById != null ? (TextView) viewFindViewById.findViewById(Ac.e.tvMilestoneAmt) : null, viewFindViewById != null ? (TextView) viewFindViewById.findViewById(Ac.e.tvMilestoneUser) : null);
    }

    public final String m(String str) {
        Context context;
        int i7 = 0;
        if (str != null) {
            try {
                i7 = Integer.parseInt(str);
            } catch (Exception unused) {
            }
        }
        View view = this.f4830e;
        if (view == null || (context = view.getContext()) == null) {
            return null;
        }
        return context.getString(i7 > 1 ? Ac.h.main_s_users : Ac.h.main_s_user, Integer.valueOf(i7));
    }

    public final void n() {
        View viewG = AbstractC0456a.g(this, this.f4828c, Ac.f.main_layout_palmzone_refer_earn_card, 12);
        this.f4830e = viewG;
        if (viewG != null) {
            this.f4831f = viewG.findViewById(Ac.e.clProgress);
            this.f4833i = (TextView) viewG.findViewById(Ac.e.tvEarnedAmount);
            this.f4834j = (ProgressBar) viewG.findViewById(Ac.e.progressBar);
            this.f4835o = C1850q.h(l(Ac.e.milestone1, viewG), l(Ac.e.milestone2, viewG), l(Ac.e.milestone3, viewG));
            this.f4836p = (PpButton) viewG.findViewById(Ac.e.btnInviteNow);
            View viewFindViewById = viewG.findViewById(Ac.e.tvMore);
            if (viewFindViewById != null) {
                viewFindViewById.setOnClickListener(new ViewOnClickListenerC0053e(29));
            }
            PpButton ppButton = this.f4836p;
            if (ppButton != null) {
                ppButton.setOnClickListener(new l(this, 0));
            }
        }
    }

    public final void o(PalmZoneReferEarnHomeResp palmZoneReferEarnHomeResp) {
        View view;
        ViewTreeObserver viewTreeObserver;
        if (palmZoneReferEarnHomeResp != null) {
            View view2 = ((m) this.f4835o.get(0)).f4825a;
            View view3 = ((m) this.f4835o.get(1)).f4825a;
            View view4 = this.f4831f;
            int measuredWidth = view4 != null ? view4.getMeasuredWidth() : 0;
            float f10 = palmZoneReferEarnHomeResp.targetAmt1 / palmZoneReferEarnHomeResp.targetAmt3;
            if (measuredWidth == 0 && (view = this.f4831f) != null && (viewTreeObserver = view.getViewTreeObserver()) != null) {
                viewTreeObserver.addOnGlobalLayoutListener(this);
            }
            t tVar = this.t;
            if (view2 != null) {
                ViewGroup.LayoutParams layoutParams = view2.getLayoutParams();
                Intrinsics.f(layoutParams, "null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
                ConstraintLayout.LayoutParams layoutParams2 = (ConstraintLayout.LayoutParams) layoutParams;
                if (measuredWidth > 0) {
                    int iIntValue = ((int) (f10 * measuredWidth)) - ((Number) tVar.getValue()).intValue();
                    if (iIntValue <= 0) {
                        iIntValue = 0;
                    }
                    layoutParams2.setMargins(iIntValue, 0, 0, 0);
                } else {
                    layoutParams2.setMargins(0, 0, 0, 0);
                }
                view2.setLayoutParams(layoutParams);
            }
            if (view3 != null) {
                ViewGroup.LayoutParams layoutParams3 = view3.getLayoutParams();
                Intrinsics.f(layoutParams3, "null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
                ConstraintLayout.LayoutParams layoutParams4 = (ConstraintLayout.LayoutParams) layoutParams3;
                if (measuredWidth > 0) {
                    layoutParams4.setMargins(((int) (0.5f * measuredWidth)) - ((Number) tVar.getValue()).intValue(), 0, 0, 0);
                } else {
                    layoutParams4.setMargins(CommonViewExtKt.getDp(100.0f), 0, 0, 0);
                }
                view3.setLayoutParams(layoutParams3);
            }
        }
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        ViewTreeObserver viewTreeObserver;
        o(this.f4832g);
        View view = this.f4831f;
        if (view == null || (viewTreeObserver = view.getViewTreeObserver()) == null) {
            return;
        }
        viewTreeObserver.removeOnGlobalLayoutListener(this);
    }
}
