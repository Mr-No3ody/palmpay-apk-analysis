package Kb;

import android.content.Context;
import androidx.recyclerview.widget.RecyclerView;
import com.transsnet.palmpay.custom_view.adapter.BaseRecyclerViewAdapter$ItemFooterViewOnClickListener;
import com.transsnet.palmpay.custom_view.adapter.BaseRecyclerViewAdapter$ItemViewOnClickListener;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public abstract class c extends RecyclerView.Adapter {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f4984a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public List f4985b = new ArrayList();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public BaseRecyclerViewAdapter$ItemViewOnClickListener f4986c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public BaseRecyclerViewAdapter$ItemFooterViewOnClickListener f4987d;

    public c(Context context) {
        this.f4984a = context;
    }

    public final void a(Collection collection) {
        if (collection != null && collection.size() > 0) {
            if (this.f4985b == null) {
                this.f4985b = new ArrayList();
            }
            this.f4985b.addAll(collection);
        }
        int size = collection == null ? 0 : collection.size();
        notifyItemRangeInserted((this.f4985b.size() - size) + 1, size);
    }

    public final void b() {
        this.f4985b.clear();
        notifyDataSetChanged();
    }

    public Object getItem(int i7) {
        if (i7 < 0 || i7 >= getItemCount()) {
            return null;
        }
        try {
            return this.f4985b.get(i7);
        } catch (Exception unused) {
            return null;
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        List list = this.f4985b;
        if (list == null) {
            return 0;
        }
        return list.size();
    }
}
