package Ie;

import Ab.ViewOnClickListenerC0053e;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.mikepenz.iconics.view.IconicsTextView;
import com.scwang.smartrefresh.layout.util.DensityUtil;
import com.transsnet.palmpay.custom_view.C1548f;
import com.transsnet.palmpay.custom_view.utils.CommonViewExtKt;
import p355xf.C2131j;

/* JADX INFO: loaded from: classes4.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final View f4315a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final TextView f4316b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final TextView f4317c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final RecyclerView f4318d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final ConstraintLayout f4319e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final ConstraintLayout f4320f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final IconicsTextView f4321g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final TextView f4322h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public String f4323i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final p355xf.t f4324j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final p355xf.t f4325k;

    public d(LinearLayout linearLayout) {
        p355xf.t tVarB = C2131j.b(new G9.j(16));
        this.f4324j = tVarB;
        p355xf.t tVarB2 = C2131j.b(new G9.j(17));
        this.f4325k = tVarB2;
        View viewInflate = LayoutInflater.from(linearLayout != null ? linearLayout.getContext() : null).inflate(Ac.f.main_saving_fixed_saving_layout, (ViewGroup) null);
        this.f4315a = viewInflate;
        if (viewInflate != null) {
            ConstraintLayout constraintLayout = (ConstraintLayout) viewInflate.findViewById(Ac.e.ctl_title);
            this.f4319e = constraintLayout;
            this.f4320f = (ConstraintLayout) viewInflate.findViewById(Ac.e.csl_exclusiveList);
            this.f4316b = (TextView) viewInflate.findViewById(Ac.e.tvTitle);
            this.f4317c = (TextView) viewInflate.findViewById(Ac.e.tvDesc);
            this.f4322h = (TextView) viewInflate.findViewById(Ac.e.tvExcluesiveTitle);
            IconicsTextView iconicsTextView = (IconicsTextView) viewInflate.findViewById(Ac.e.tvMoreInfo);
            this.f4321g = iconicsTextView;
            RecyclerView recyclerView = (RecyclerView) viewInflate.findViewById(Ac.e.rl_productList);
            this.f4318d = recyclerView;
            if (recyclerView != null) {
                recyclerView.setLayoutManager(new LinearLayoutManager(viewInflate.getContext(), 1, false));
            }
            if (recyclerView != null) {
                recyclerView.setAdapter((p385ze.d) tVarB.getValue());
            }
            RecyclerView recyclerView2 = (RecyclerView) viewInflate.findViewById(Ac.e.rl_exclusiveList);
            if (recyclerView2 != null) {
                recyclerView2.setLayoutManager(new LinearLayoutManager(viewInflate.getContext(), 1, false));
            }
            if (recyclerView2 != null) {
                C1548f c1548f = new C1548f(viewInflate.getContext().getColor(com.transsnet.palmpay.custom_view.p.transparent), DensityUtil.dp2px(8.0f));
                c1548f.f31336e = true;
                recyclerView2.addItemDecoration(c1548f);
            }
            if (recyclerView2 != null) {
                recyclerView2.setAdapter((p385ze.d) tVarB2.getValue());
            }
            viewInflate.setVisibility(8);
            if (linearLayout != null) {
                linearLayout.addView(viewInflate);
            }
            LinearLayout linearLayout2 = new LinearLayout(linearLayout != null ? linearLayout.getContext() : null);
            linearLayout2.setLayoutParams(new LinearLayout.LayoutParams(-1, CommonViewExtKt.getDp(12)));
            if (linearLayout != null) {
                linearLayout.addView(linearLayout2);
            }
            if (constraintLayout != null) {
                constraintLayout.setOnClickListener(new Ha.d(this, 7));
            }
            if (iconicsTextView != null) {
                iconicsTextView.setOnClickListener(new ViewOnClickListenerC0053e(24));
            }
        }
    }

    public final void a(String str, String str2, String str3, boolean z3) {
        IconicsTextView iconicsTextView;
        TextView textView = this.f4316b;
        if (textView != null) {
            textView.setText(str);
        }
        TextView textView2 = this.f4317c;
        if (textView2 != null) {
            textView2.setText(str2);
        }
        this.f4323i = str3;
        if (z3 || (iconicsTextView = this.f4321g) == null) {
            return;
        }
        iconicsTextView.setVisibility(8);
    }
}
