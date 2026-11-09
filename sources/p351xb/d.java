package p351xb;

import Kb.g;
import Kb.h;
import Pa.r0;
import Ya.f;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.transsnet.palmpay.credit.bean.rsp.OcRepaidListDetail;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class d extends h {
    @Override // Kb.h
    public final RecyclerView.ViewHolder a(ViewGroup parent) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        View viewInflate = LayoutInflater.from(this.f4991a).inflate(f.cs_cl_bill_repayment_item, parent, false);
        Intrinsics.e(viewInflate);
        return new c(viewInflate);
    }

    @Override // Kb.h
    public final RecyclerView.ViewHolder b(ViewGroup parent) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        View itemView = LayoutInflater.from(this.f4991a).inflate(f.cs_cl_bill_repayment_empty_item, parent, false);
        Intrinsics.e(itemView);
        Intrinsics.checkNotNullParameter(itemView, "itemView");
        return new g(itemView);
    }

    @Override // Kb.h
    public final void c(RecyclerView.ViewHolder holder, int i7) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        c cVar = (c) holder;
        OcRepaidListDetail ocRepaidListDetail = (OcRepaidListDetail) this.f4992b.get(i7);
        TextView textView = cVar.f43754a;
        int i10 = Ya.g.cs_cl_item_repayment;
        Long amount = ocRepaidListDetail.getAmount();
        textView.setText(this.f4991a.getString(i10, r0.B(amount != null ? amount.longValue() : 0L, false)));
        TextView textView2 = cVar.f43755b;
        Long createTime = ocRepaidListDetail.getCreateTime();
        textView2.setText(r0.X1(Long.valueOf(createTime != null ? createTime.longValue() : 0L), "HH:mm, MMM dd, yyyy"));
        cVar.f43756c.setText(ocRepaidListDetail.getBizDesc());
    }
}
