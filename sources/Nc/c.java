package Nc;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.transsnet.palmpay.custom_view.RoundedTextView;
import com.transsnet.palmpay.managemoney.bean.ProductBean;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class c extends RecyclerView.Adapter {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public List f6310a;

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final int getItemCount() {
        List list = this.f6310a;
        if (list != null) {
            return list.size();
        }
        return 0;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i7) {
        b holder = (b) viewHolder;
        Intrinsics.checkNotNullParameter(holder, "holder");
        holder.f6309e.setTag(Integer.valueOf(i7));
        List list = this.f6310a;
        holder.a(list != null ? (ProductBean) list.get(i7) : null, i7);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int i7) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        View itemView = LayoutInflater.from(parent.getContext()).inflate(Jc.d.mm_item_cash_box_fixed_savings_product, parent, false);
        Intrinsics.checkNotNullExpressionValue(itemView, "inflate(...)");
        Intrinsics.checkNotNullParameter(itemView, "itemView");
        b bVar = new b(itemView);
        View viewFindViewById = itemView.findViewById(Jc.c.ivProductIcon);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById, "findViewById(...)");
        bVar.f6306b = (ImageView) viewFindViewById;
        View viewFindViewById2 = itemView.findViewById(Jc.c.tvProductName);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById2, "findViewById(...)");
        bVar.f6307c = (TextView) viewFindViewById2;
        View viewFindViewById3 = itemView.findViewById(Jc.c.tvProductIncreaseUp);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById3, "findViewById(...)");
        bVar.f6308d = (TextView) viewFindViewById3;
        View viewFindViewById4 = itemView.findViewById(Jc.c.rtvSave);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById4, "findViewById(...)");
        RoundedTextView roundedTextView = (RoundedTextView) viewFindViewById4;
        bVar.f6309e = roundedTextView;
        roundedTextView.setOnClickListener(new Je.l(this, 28));
        return bVar;
    }
}
