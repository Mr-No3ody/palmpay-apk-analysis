package Nc;

import Ad.c0;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.transsnet.palmpay.managemoney.bean.PayoutOption;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class u extends RecyclerView.Adapter {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public ArrayList f6357a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final defpackage.a f6358b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f6359c = -1;

    public u(ArrayList arrayList, defpackage.a aVar) {
        this.f6357a = arrayList;
        this.f6358b = aVar;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final int getItemCount() {
        ArrayList arrayList = this.f6357a;
        if (arrayList != null) {
            return arrayList.size();
        }
        return 0;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i7) {
        t holder = (t) viewHolder;
        Intrinsics.checkNotNullParameter(holder, "holder");
        ArrayList arrayList = this.f6357a;
        holder.a(arrayList != null ? (PayoutOption) arrayList.get(i7) : null, i7);
        holder.f6305a = new c0(29, holder, this);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int i7) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        View viewInflate = LayoutInflater.from(parent.getContext()).inflate(Jc.d.mm_item_payout_options, parent, false);
        Intrinsics.checkNotNullExpressionValue(viewInflate, "inflate(...)");
        return new t(this, viewInflate);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i7, List payloads) {
        t holder = (t) viewHolder;
        Intrinsics.checkNotNullParameter(holder, "holder");
        Intrinsics.checkNotNullParameter(payloads, "payloads");
        if (payloads.isEmpty()) {
            super.onBindViewHolder(holder, i7, payloads);
            return;
        }
        Object obj = payloads.get(0);
        Intrinsics.f(obj, "null cannot be cast to non-null type android.os.Bundle");
        holder.b((Bundle) obj);
    }
}
