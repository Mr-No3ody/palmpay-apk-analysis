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
import androidx.camera.video.u;
import androidx.recyclerview.widget.RecyclerView;
import com.transsnet.palmpay.credit.bean.resp.OcHistoryBillListDetail;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: yb.n, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C2146n extends h {
    @Override // Kb.h
    public final RecyclerView.ViewHolder a(ViewGroup parent) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        View viewInflate = LayoutInflater.from(this.f4991a).inflate(f.cs_oc_bill_history_item, parent, false);
        Intrinsics.e(viewInflate);
        return new C2145m(viewInflate);
    }

    @Override // Kb.h
    public final RecyclerView.ViewHolder b(ViewGroup parent) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        Context context = this.f4991a;
        View itemView = LayoutInflater.from(context).inflate(f.cs_oc_bill_history_empty, parent, false);
        View viewFindViewById = itemView.findViewById(e.oc_empty_tips_tv);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById, "findViewById(...)");
        ((TextView) viewFindViewById).setText(context.getString(g.cs_oc_no_bill_history));
        Intrinsics.checkNotNullParameter(itemView, "itemView");
        return new Kb.g(itemView);
    }

    @Override // Kb.h
    public final void c(RecyclerView.ViewHolder holder, int i7) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        C2145m c2145m = (C2145m) holder;
        OcHistoryBillListDetail ocHistoryBillListDetail = (OcHistoryBillListDetail) this.f4992b.get(i7);
        c2145m.f44238a.setText(u.n(r0.X1(ocHistoryBillListDetail.getBeginTimeStamp(), "MMM"), " bill ", r0.X1(ocHistoryBillListDetail.getBeginTimeStamp(), "dd"), "~", r0.X1(ocHistoryBillListDetail.getEndTimeStamp(), "dd")));
        c2145m.f44239b.setText(r0.X1(ocHistoryBillListDetail.getBeginTimeStamp(), "MMM dd,yyyy") + "-" + r0.X1(ocHistoryBillListDetail.getEndTimeStamp(), "MMM dd, yyyy"));
        Long paidInterest = ocHistoryBillListDetail.getPaidInterest();
        long jLongValue = paidInterest != null ? paidInterest.longValue() : 0L;
        Long paidPenalty = ocHistoryBillListDetail.getPaidPenalty();
        long jLongValue2 = jLongValue + (paidPenalty != null ? paidPenalty.longValue() : 0L);
        Long paidPrincipal = ocHistoryBillListDetail.getPaidPrincipal();
        long jLongValue3 = jLongValue2 + (paidPrincipal != null ? paidPrincipal.longValue() : 0L);
        Long paidInstallmentServiceFee = ocHistoryBillListDetail.getPaidInstallmentServiceFee();
        long jLongValue4 = jLongValue3 + (paidInstallmentServiceFee != null ? paidInstallmentServiceFee.longValue() : 0L);
        Context context = this.f4991a;
        if (jLongValue4 > 0) {
            c2145m.f44240c.setTextColor(context.getColor(b.cs_oc_negative_txt_color));
            c2145m.f44240c.setText(r0.B(jLongValue4, true));
        } else {
            c2145m.f44240c.setTextColor(context.getColor(b.cs_oc_negative_txt_color));
            c2145m.f44240c.setText(r0.B(jLongValue4, true));
        }
    }
}
