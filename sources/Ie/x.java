package Ie;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.transsnet.palmpay.custom_view.utils.CommonViewExtKt;
import p355xf.C2131j;

/* JADX INFO: loaded from: classes4.dex */
public final class x {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final View f4415a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final TextView f4416b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final TextView f4417c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final p355xf.t f4418d;

    public x(LinearLayout linearLayout) {
        p355xf.t tVarB = C2131j.b(new G9.j(23));
        this.f4418d = tVarB;
        View viewInflate = LayoutInflater.from(linearLayout != null ? linearLayout.getContext() : null).inflate(Ac.f.main_saving_insurance_layout, (ViewGroup) null);
        this.f4415a = viewInflate;
        if (viewInflate != null) {
            ConstraintLayout constraintLayout = (ConstraintLayout) viewInflate.findViewById(Ac.e.ctl_title);
            this.f4416b = (TextView) viewInflate.findViewById(Ac.e.tvTitle);
            this.f4417c = (TextView) viewInflate.findViewById(Ac.e.tvDesc);
            RecyclerView recyclerView = (RecyclerView) viewInflate.findViewById(Ac.e.rl_insurance);
            if (recyclerView != null) {
                recyclerView.setLayoutManager(new LinearLayoutManager(viewInflate.getContext(), 1, false));
            }
            if (recyclerView != null) {
                recyclerView.setAdapter((p385ze.k) tVarB.getValue());
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
                constraintLayout.setOnClickListener(new Ha.d(this, 18));
            }
            ((p385ze.k) tVarB.getValue()).setOnItemClickListener(new B8.d(7));
        }
    }
}
