package androidx.preference;

import android.R;
import android.util.SparseArray;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

/* JADX INFO: loaded from: classes.dex */
public final class u extends RecyclerView.ViewHolder {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final SparseArray f17672a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f17673b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f17674c;

    public u(View view) {
        super(view);
        SparseArray sparseArray = new SparseArray(4);
        this.f17672a = sparseArray;
        sparseArray.put(R.id.title, view.findViewById(R.id.title));
        sparseArray.put(R.id.summary, view.findViewById(R.id.summary));
        sparseArray.put(R.id.icon, view.findViewById(R.id.icon));
        int i7 = x.icon_frame;
        sparseArray.put(i7, view.findViewById(i7));
        sparseArray.put(R.id.icon_frame, view.findViewById(R.id.icon_frame));
    }

    public final View findViewById(int i7) {
        SparseArray sparseArray = this.f17672a;
        View view = (View) sparseArray.get(i7);
        if (view != null) {
            return view;
        }
        View viewFindViewById = this.itemView.findViewById(i7);
        if (viewFindViewById != null) {
            sparseArray.put(i7, viewFindViewById);
        }
        return viewFindViewById;
    }
}
