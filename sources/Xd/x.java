package Xd;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class x extends RecyclerView.Adapter {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f11182a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f11183b;

    public x(int i7) {
        this.f11182a = i7;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final int getItemCount() {
        return this.f11182a;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i7) {
        w holder = (w) viewHolder;
        Intrinsics.checkNotNullParameter(holder, "holder");
        boolean z3 = i7 == this.f11183b;
        holder.getClass();
        holder.f11181a.setImageResource(z3 ? com.transsnet.palmpay.custom_view.r.cv_shape_rect_corner_8_bg_white : com.transsnet.palmpay.custom_view.r.cv_shape_rect_corner_8_bg_disable);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int i7) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        View viewInflate = LayoutInflater.from(parent.getContext()).inflate(Pd.d.qt_layout_activity_banner_with_coupon_indication, parent, false);
        Intrinsics.e(viewInflate);
        return new w(viewInflate);
    }
}
