package Wb;

import Gd.e;
import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.transsnet.palmpay.custom_view.t;
import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class b extends RecyclerView.Adapter {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Activity f10664a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ArrayList f10665b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Oe.a f10666c;

    public b(Activity mActivity, ArrayList mLiteMenuData) {
        Intrinsics.checkNotNullParameter(mActivity, "mActivity");
        Intrinsics.checkNotNullParameter(mLiteMenuData, "mLiteMenuData");
        this.f10664a = mActivity;
        this.f10665b = mLiteMenuData;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final int getItemCount() {
        return this.f10665b.size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i7) {
        a holder = (a) viewHolder;
        Intrinsics.checkNotNullParameter(holder, "holder");
        ArrayList arrayList = this.f10665b;
        if (((c) arrayList.get(i7)).f10668b != null) {
            holder.f10662b.setVisibility(0);
            holder.f10662b.setImageDrawable(((c) arrayList.get(i7)).f10668b);
        } else {
            holder.f10662b.setVisibility(8);
        }
        if (i7 == arrayList.size() - 1) {
            holder.f10663c.setVisibility(8);
        } else {
            holder.f10663c.setVisibility(0);
        }
        holder.f10661a.setText(((c) arrayList.get(i7)).f10667a);
        holder.itemView.setOnClickListener(new e(this, holder, i7, 2));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int i7) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        View viewInflate = LayoutInflater.from(this.f10664a).inflate(t.cv_oc_top_right_menu_item, parent, false);
        Intrinsics.checkNotNullExpressionValue(viewInflate, "inflate(...)");
        return new a(viewInflate);
    }
}
