package p368yb;

import Kb.h;
import Pa.r0;
import Ya.b;
import Ya.e;
import Ya.f;
import Ya.g;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.transsnet.palmpay.credit.bean.rsp.OcRepaidListDetail;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class W extends h {
    @Override // Kb.h
    public final RecyclerView.ViewHolder a(ViewGroup parent) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        View viewInflate = LayoutInflater.from(this.f4991a).inflate(f.cs_oc_repaid_list_item, parent, false);
        Intrinsics.e(viewInflate);
        return new V(viewInflate);
    }

    @Override // Kb.h
    public final RecyclerView.ViewHolder b(ViewGroup parent) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        Context context = this.f4991a;
        View itemView = LayoutInflater.from(context).inflate(f.cs_oc_bill_history_empty, parent, false);
        View viewFindViewById = itemView.findViewById(e.oc_empty_tips_tv);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById, "findViewById(...)");
        ((TextView) viewFindViewById).setText(context.getString(g.cs_oc_repayment_empty_tips));
        Intrinsics.checkNotNullParameter(itemView, "itemView");
        return new Kb.g(itemView);
    }

    @Override // Kb.h
    public final void c(RecyclerView.ViewHolder holder, int i7) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        V v3 = (V) holder;
        OcRepaidListDetail ocRepaidListDetail = (OcRepaidListDetail) this.f4992b.get(i7);
        v3.f44208a.setText(ocRepaidListDetail.getBizDesc());
        Long amount = ocRepaidListDetail.getAmount();
        long jLongValue = amount != null ? amount.longValue() : 0L;
        v3.f44209b.setText(r0.X1(ocRepaidListDetail.getCreateTime(), "MMM dd, yyyy"));
        Context context = this.f4991a;
        if (jLongValue > 0) {
            v3.f44210c.setTextColor(context.getColor(b.cs_oc_positive_txt_color));
            v3.f44210c.setText(r0.A(jLongValue));
        } else {
            v3.f44210c.setTextColor(context.getColor(b.cs_oc_negative_txt_color));
            v3.f44210c.setText(r0.A(jLongValue));
        }
    }
}
