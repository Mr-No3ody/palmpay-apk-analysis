package p370ye;

import Ac.f;
import android.graphics.Color;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class h extends RecyclerView.Adapter {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f44326a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f44327b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f44328c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f44329d = Color.parseColor("#F5C670");

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f44330e = Color.parseColor("#5F5B50");

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f44331f = Color.parseColor("#EADDC0");

    public h(int i7, boolean z3) {
        this.f44326a = i7;
        this.f44327b = z3;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final int getItemCount() {
        return this.f44326a;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i7) {
        int i10;
        g holder = (g) viewHolder;
        Intrinsics.checkNotNullParameter(holder, "holder");
        boolean z3 = i7 == this.f44328c;
        h hVar = holder.f44325b;
        if (z3) {
            i10 = hVar.f44329d;
        } else {
            i10 = hVar.f44327b ? hVar.f44330e : hVar.f44331f;
        }
        holder.f44324a.setColorFilter(i10);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int i7) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        View viewInflate = LayoutInflater.from(parent.getContext()).inflate(f.main_layout_activity_reward_premium_indication, parent, false);
        Intrinsics.e(viewInflate);
        return new g(this, viewInflate);
    }
}
