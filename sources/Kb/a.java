package Kb;

import android.view.View;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public final class a implements View.OnClickListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ b f4980a;

    public a(b bVar) {
        this.f4980a = bVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        List list;
        Object item;
        b bVar = this.f4980a;
        int adapterPosition = bVar.getAdapterPosition();
        c cVar = bVar.f4983c;
        cVar.getClass();
        if (cVar.f4986c != null && (item = cVar.getItem(adapterPosition)) != null) {
            cVar.f4986c.OnItemViewOnClick(view, item, bVar);
        }
        if (cVar.f4987d == null || (list = cVar.f4985b) == null || adapterPosition != list.size()) {
            return;
        }
        cVar.f4987d.OnItemFooterViewOnClick(view, bVar);
    }
}
