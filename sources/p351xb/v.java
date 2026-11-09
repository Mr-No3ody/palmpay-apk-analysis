package p351xb;

import Kb.h;
import Pa.r0;
import Ya.f;
import Ya.g;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.transsnet.palmpay.credit.bean.rsp.OcRepaidListDetail;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class v extends h {
    @Override // Kb.h
    public final RecyclerView.ViewHolder a(ViewGroup parent) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        View viewInflate = LayoutInflater.from(this.f4991a).inflate(f.cs_cl_repayment_item, parent, false);
        Intrinsics.e(viewInflate);
        return new u(viewInflate);
    }

    @Override // Kb.h
    public final void c(RecyclerView.ViewHolder holder, int i7) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        u uVar = (u) holder;
        OcRepaidListDetail ocRepaidListDetail = (OcRepaidListDetail) this.f4992b.get(i7);
        Long amount = ocRepaidListDetail.getAmount();
        uVar.f43814a.setText(this.f4991a.getString(g.cs_cl_item_repayment, r0.B(amount != null ? amount.longValue() : 0L, true)));
        TextView textView = uVar.f43815b;
        Long createTime = ocRepaidListDetail.getCreateTime();
        textView.setText(r0.X1(Long.valueOf(createTime != null ? createTime.longValue() : 0L), "HH:mm, MMM dd, yyyy"));
        uVar.f43816c.setText(ocRepaidListDetail.getBizDesc());
    }
}
