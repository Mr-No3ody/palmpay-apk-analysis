package p293t7;

import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.FrameLayout;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class d extends RecyclerView.Adapter {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f42351a = new ArrayList();

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final int getItemCount() {
        return this.f42351a.size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i7) {
        f holder = (f) viewHolder;
        Intrinsics.checkNotNullParameter(holder, "holder");
        View view = holder.itemView;
        Intrinsics.f(view, "null cannot be cast to non-null type android.widget.FrameLayout");
        FrameLayout frameLayout = (FrameLayout) view;
        Object obj = this.f42351a.get(i7);
        Intrinsics.checkNotNullExpressionValue(obj, "get(...)");
        View view2 = (View) obj;
        holder.setIsRecyclable(false);
        if (frameLayout.getChildCount() > 0) {
            frameLayout.removeAllViews();
        }
        if (view2.getParent() != null) {
            ViewParent parent = view2.getParent();
            Intrinsics.f(parent, "null cannot be cast to non-null type android.widget.FrameLayout");
            ((FrameLayout) parent).removeView(view2);
        }
        frameLayout.addView(view2);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int i7) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        return f.f42352a.create(parent);
    }
}
