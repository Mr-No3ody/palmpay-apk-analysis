package Ie;

import android.view.View;
import android.widget.TextView;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.transsnet.palmpay.ui.viewhandler.MenuModelViewHandler$OnMenuItemClickListener;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes4.dex */
public final class s {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TextView f4390a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final p354xe.g f4391b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ArrayList f4392c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public MenuModelViewHandler$OnMenuItemClickListener f4393d;

    public s(View view) {
        this.f4390a = (TextView) view.findViewById(Ac.e.tvTitle);
        RecyclerView recyclerView = (RecyclerView) view.findViewById(Ac.e.functionList);
        ArrayList arrayList = new ArrayList();
        this.f4392c = arrayList;
        p354xe.g gVar = new p354xe.g(view.getContext());
        this.f4391b = gVar;
        gVar.f43932g = true;
        gVar.f43930e = true;
        gVar.f4985b = arrayList;
        recyclerView.setLayoutManager(new GridLayoutManager(view.getContext(), 4));
        recyclerView.setAdapter(gVar);
        recyclerView.addItemDecoration(new r());
        gVar.f4986c = new Dg.a(this, 19);
    }

    public final void a(String str, ArrayList arrayList) {
        this.f4390a.setText(str);
        ArrayList arrayList2 = this.f4392c;
        arrayList2.clear();
        arrayList2.addAll(arrayList);
        this.f4391b.notifyDataSetChanged();
    }
}
