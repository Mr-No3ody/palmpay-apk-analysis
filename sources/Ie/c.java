package Ie;

import android.view.View;
import android.widget.ImageView;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.jvm.internal.Intrinsics;
import p355xf.C2131j;

/* JADX INFO: loaded from: classes4.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final View f4312a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f4313b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final p355xf.t f4314c;

    public c(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        this.f4312a = view;
        p355xf.t tVarB = C2131j.b(new G9.j(15));
        this.f4314c = tVarB;
        RecyclerView recyclerView = (RecyclerView) view.findViewById(Ac.e.rc_exclusive);
        ImageView imageView = (ImageView) view.findViewById(Ac.e.iv_arrow);
        if (imageView != null) {
            imageView.setOnClickListener(new Ha.d(this, 6));
        }
        recyclerView.setLayoutManager(new GridLayoutManager(view.getContext(), 3));
        recyclerView.addItemDecoration(new b());
        recyclerView.setHasFixedSize(true);
        recyclerView.setAdapter((p354xe.a) tVarB.getValue());
        ((p354xe.a) tVarB.getValue()).addChildClickViewIds(Ac.e.btn);
        ((p354xe.a) tVarB.getValue()).setOnItemClickListener(new B8.d(4));
    }
}
