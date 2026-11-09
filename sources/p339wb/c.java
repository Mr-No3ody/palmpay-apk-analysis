package p339wb;

import android.util.SparseArray;
import android.view.View;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;

/* JADX INFO: loaded from: classes4.dex */
public final class c extends RecyclerView.ViewHolder {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public SparseArray f43363a;

    public final void a(int i7, String str) {
        ((TextView) getView(i7)).setText(str);
    }

    public final void b(int i7, boolean z3) {
        getView(i7).setVisibility(z3 ? 0 : 8);
    }

    public final View getView(int i7) {
        SparseArray sparseArray = this.f43363a;
        View view = (View) sparseArray.get(i7);
        if (view != null) {
            return view;
        }
        View viewFindViewById = this.itemView.findViewById(i7);
        sparseArray.put(i7, viewFindViewById);
        return viewFindViewById;
    }
}
