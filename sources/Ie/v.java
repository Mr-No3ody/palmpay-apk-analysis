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
public final class v {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final View f4405a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final TextView f4406b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final TextView f4407c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public String f4408d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final p355xf.t f4409e;

    public v(LinearLayout linearLayout) {
        p355xf.t tVarB = C2131j.b(new G9.j(21));
        this.f4409e = tVarB;
        View viewInflate = LayoutInflater.from(linearLayout != null ? linearLayout.getContext() : null).inflate(Ac.f.main_saving_stocks_layout, (ViewGroup) null);
        this.f4405a = viewInflate;
        if (viewInflate != null) {
            ConstraintLayout constraintLayout = (ConstraintLayout) viewInflate.findViewById(Ac.e.ctl_title);
            this.f4406b = (TextView) viewInflate.findViewById(Ac.e.tvTitle);
            this.f4407c = (TextView) viewInflate.findViewById(Ac.e.tvDesc);
            RecyclerView recyclerView = (RecyclerView) viewInflate.findViewById(Ac.e.rl_stock);
            if (constraintLayout != null) {
                constraintLayout.setOnClickListener(new Ha.d(this, 16));
            }
            if (recyclerView != null) {
                recyclerView.setLayoutManager(new LinearLayoutManager(viewInflate.getContext(), 0, false));
            }
            if (recyclerView != null) {
                recyclerView.setAdapter((p385ze.i) tVarB.getValue());
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
            ((p385ze.i) tVarB.getValue()).setOnItemClickListener(new Dg.a(this, 20));
        }
    }
}
