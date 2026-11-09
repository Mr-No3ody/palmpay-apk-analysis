package Ie;

import android.view.View;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.scwang.smartrefresh.layout.util.DensityUtil;
import com.transsnet.palmpay.custom_view.C1548f;
import java.util.List;
import p355xf.C2131j;

/* JADX INFO: loaded from: classes4.dex */
public final class t {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final View f4394a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final p355xf.t f4395b;

    public t(View view) {
        this.f4394a = view;
        p355xf.t tVarB = C2131j.b(new G9.j(20));
        this.f4395b = tVarB;
        if (view != null) {
            RecyclerView recyclerView = (RecyclerView) view.findViewById(Ac.e.rl_comment);
            if (recyclerView != null) {
                recyclerView.setLayoutManager(new LinearLayoutManager(view.getContext(), 0, false));
            }
            if (recyclerView != null) {
                C1548f c1548f = new C1548f(view.getContext().getColor(com.transsnet.palmpay.custom_view.p.transparent), DensityUtil.dp2px(12.0f));
                c1548f.f31336e = false;
                recyclerView.addItemDecoration(c1548f);
            }
            if (recyclerView != null) {
                recyclerView.setAdapter((p385ze.c) tVarB.getValue());
            }
        }
    }

    public final void a(List list) {
        p385ze.c cVar;
        if (list != null) {
            if (list.isEmpty()) {
                list = null;
            }
            if (list != null && (cVar = (p385ze.c) this.f4395b.getValue()) != null) {
                cVar.setList(list);
            }
        }
        View view = this.f4394a;
        if (view != null) {
            p220oa.h.s(view, true);
        }
    }
}
