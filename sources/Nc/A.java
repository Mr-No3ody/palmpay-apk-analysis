package Nc;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.mikepenz.iconics.view.IconicsImageView;
import com.transsnet.palmpay.managemoney.bean.ProductBean;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class A extends RecyclerView.Adapter {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f6302a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f6303b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public List f6304c;

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final int getItemCount() {
        List list = this.f6304c;
        if (list != null) {
            return list.size();
        }
        return 0;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final int getItemViewType(int i7) {
        return this.f6302a;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i7) {
        AbstractC0482a holder = (AbstractC0482a) viewHolder;
        Intrinsics.checkNotNullParameter(holder, "holder");
        List list = this.f6304c;
        holder.a(i7, list != null ? (ProductBean) list.get(i7) : null);
        holder.f6305a = new v(this, i7);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int i7) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        if (i7 == 1) {
            View viewInflate = LayoutInflater.from(parent.getContext()).inflate(Jc.d.mm_item_transaction_history, parent, false);
            Intrinsics.checkNotNullExpressionValue(viewInflate, "inflate(...)");
            return new w(this, viewInflate);
        }
        View itemView = LayoutInflater.from(parent.getContext()).inflate(Jc.d.mm_item_fixed_saving_plan, parent, false);
        Intrinsics.checkNotNullExpressionValue(itemView, "inflate(...)");
        Intrinsics.checkNotNullParameter(itemView, "itemView");
        z zVar = new z(itemView);
        View viewFindViewById = itemView.findViewById(Jc.c.ivIcon);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById, "findViewById(...)");
        zVar.f6371b = (ImageView) viewFindViewById;
        View viewFindViewById2 = itemView.findViewById(Jc.c.tvProductName);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById2, "findViewById(...)");
        zVar.f6372c = (TextView) viewFindViewById2;
        View viewFindViewById3 = itemView.findViewById(Jc.c.tvProductRatio);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById3, "findViewById(...)");
        zVar.f6373d = (TextView) viewFindViewById3;
        View viewFindViewById4 = itemView.findViewById(Jc.c.tvPrincipalAmount);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById4, "findViewById(...)");
        zVar.f6374e = (TextView) viewFindViewById4;
        View viewFindViewById5 = itemView.findViewById(Jc.c.tvPlanStatus);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById5, "findViewById(...)");
        zVar.f6375f = (TextView) viewFindViewById5;
        View viewFindViewById6 = itemView.findViewById(Jc.c.tvInterestAmount);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById6, "findViewById(...)");
        zVar.f6376g = (TextView) viewFindViewById6;
        View viewFindViewById7 = itemView.findViewById(Jc.c.tvAmountTitle);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById7, "findViewById(...)");
        zVar.f6377i = (TextView) viewFindViewById7;
        View viewFindViewById8 = itemView.findViewById(Jc.c.tvInterestAmountTitle);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById8, "findViewById(...)");
        zVar.f6378j = (TextView) viewFindViewById8;
        View viewFindViewById9 = itemView.findViewById(Jc.c.imageViewNext);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById9, "findViewById(...)");
        zVar.f6379o = (IconicsImageView) viewFindViewById9;
        View viewFindViewById10 = itemView.findViewById(Jc.c.tvAutoRenel);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById10, "findViewById(...)");
        zVar.f6380p = (TextView) viewFindViewById10;
        zVar.t = this.f6303b;
        View viewFindViewById11 = itemView.findViewById(Jc.c.clsAdvance);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById11, "findViewById(...)");
        zVar.f6381v = (ConstraintLayout) viewFindViewById11;
        View viewFindViewById12 = itemView.findViewById(Jc.c.tvAdvanceAmount);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById12, "findViewById(...)");
        zVar.f6382w = (TextView) viewFindViewById12;
        View viewFindViewById13 = itemView.findViewById(Jc.c.tvDueDate);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById13, "findViewById(...)");
        zVar.f6370A = (TextView) viewFindViewById13;
        return zVar;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i7, List payloads) {
        AbstractC0482a holder = (AbstractC0482a) viewHolder;
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
