package Zc;

import android.content.Context;
import android.util.SparseArray;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

/* JADX INFO: loaded from: classes4.dex */
public final class g extends RecyclerView.ViewHolder {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final View f11632a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final SparseArray f11633b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Context f11634c;

    public g(View view, Context context) {
        super(view);
        this.f11634c = context;
        this.f11632a = view;
        this.f11633b = new SparseArray();
    }

    public final View getView(int i7) {
        SparseArray sparseArray = this.f11633b;
        View view = (View) sparseArray.get(i7);
        if (view != null) {
            return view;
        }
        View viewFindViewById = this.f11632a.findViewById(i7);
        sparseArray.put(i7, viewFindViewById);
        return viewFindViewById;
    }
}
