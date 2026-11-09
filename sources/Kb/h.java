package Kb;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.transsnet.palmpay.custom_view.interfac.OnRvItemClickListener;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public abstract class h extends RecyclerView.Adapter {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f4991a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f4992b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public OnRvItemClickListener f4993c;

    static {
        new f(null);
    }

    public h(Context mContext, List mData) {
        Intrinsics.checkNotNullParameter(mContext, "mContext");
        Intrinsics.checkNotNullParameter(mData, "mData");
        this.f4991a = mContext;
        this.f4992b = mData;
    }

    public abstract RecyclerView.ViewHolder a(ViewGroup viewGroup);

    public RecyclerView.ViewHolder b(ViewGroup parent) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        View itemView = new View(this.f4991a);
        Intrinsics.checkNotNullParameter(itemView, "itemView");
        return new g(itemView);
    }

    public abstract void c(RecyclerView.ViewHolder viewHolder, int i7);

    public void d(RecyclerView.ViewHolder holder) {
        Intrinsics.checkNotNullParameter(holder, "holder");
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        List list = this.f4992b;
        if (list.isEmpty()) {
            return 1;
        }
        return list.size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final int getItemViewType(int i7) {
        return this.f4992b.isEmpty() ? 1 : 0;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final void onBindViewHolder(RecyclerView.ViewHolder holder, int i7) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        if (getItemViewType(i7) != 0) {
            d(holder);
        } else {
            c(holder, i7);
            holder.itemView.setOnClickListener(new Gd.e(this, holder, i7, 1));
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int i7) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        return i7 == 0 ? a(parent) : b(parent);
    }
}
