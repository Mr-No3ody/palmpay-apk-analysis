package Kb;

import android.util.SparseArray;
import android.view.View;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.transsnet.palmpay.custom_view.s;

/* JADX INFO: loaded from: classes4.dex */
public abstract class b extends RecyclerView.ViewHolder {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a f4981a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final SparseArray f4982b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ c f4983c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(c cVar, View view) {
        super(view);
        this.f4983c = cVar;
        this.f4982b = new SparseArray();
        this.f4981a = new a(this);
    }

    public final void a(View view) {
        view.setTag(s.cv_auto_track_tag_view_position, Integer.valueOf(getAdapterPosition()));
        view.setOnClickListener(this.f4981a);
    }

    public final void b(int i7, String str) {
        ((TextView) getView(i7)).setText(str);
    }

    public final void c(int i7, boolean z3) {
        getView(i7).setVisibility(z3 ? 0 : 8);
    }

    public final View getView(int i7) {
        SparseArray sparseArray = this.f4982b;
        View view = (View) sparseArray.get(i7);
        if (view != null) {
            return view;
        }
        View viewFindViewById = this.itemView.findViewById(i7);
        sparseArray.put(i7, viewFindViewById);
        return viewFindViewById;
    }

    public final void setTextColor(int i7, int i10) {
        ((TextView) getView(i7)).setTextColor(i10);
    }
}
