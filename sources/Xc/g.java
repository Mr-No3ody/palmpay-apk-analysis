package Xc;

import Ad.V;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.transsnet.palmpay.p2pcash.ui.atm.view.P2PAmountView;
import com.transsnet.palmpay.p2pcash.ui.atm.view.P2PInputAmountView;

/* JADX INFO: loaded from: classes4.dex */
public final class g extends RecyclerView.Adapter {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ P2PInputAmountView f11125a;

    public g(P2PInputAmountView p2PInputAmountView) {
        this.f11125a = p2PInputAmountView;
        p2PInputAmountView.f33006b.setAdapter(this);
        p2PInputAmountView.f33006b.setLayoutManager(new GridLayoutManager(p2PInputAmountView.f33005a, 4));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final int getItemCount() {
        return this.f11125a.f33011g.size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i7) {
        f fVar = (f) viewHolder;
        int i10 = f.f11123b;
        View view = fVar.itemView;
        if (view instanceof P2PAmountView) {
            ((P2PAmountView) view).setAmount(((Long) fVar.f11124a.f11125a.f33011g.get(i7)).longValue());
        }
        fVar.itemView.setOnClickListener(new V(fVar, i7, 3));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i7) {
        return new f(this, LayoutInflater.from(this.f11125a.f33005a).inflate(Sc.c.p2p_amount_layout, viewGroup, false));
    }
}
