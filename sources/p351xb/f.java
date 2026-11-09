package p351xb;

import Kb.h;
import Pa.r0;
import Ya.b;
import Ya.g;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.transsnet.palmpay.credit.bean.resp.CLHistoryBillDetail;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class f extends h {
    @Override // Kb.h
    public final RecyclerView.ViewHolder a(ViewGroup parent) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        View viewInflate = LayoutInflater.from(this.f4991a).inflate(Ya.f.cs_cl_borrow_item, parent, false);
        Intrinsics.e(viewInflate);
        return new e(viewInflate);
    }

    @Override // Kb.h
    public final void c(RecyclerView.ViewHolder holder, int i7) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        e eVar = (e) holder;
        CLHistoryBillDetail cLHistoryBillDetail = (CLHistoryBillDetail) this.f4992b.get(i7);
        Long loanAmount = cLHistoryBillDetail.getLoanAmount();
        eVar.f43757a.setText(r0.B(loanAmount != null ? loanAmount.longValue() : 0L, true));
        TextView textView = eVar.f43758b;
        Long loanTime = cLHistoryBillDetail.getLoanTime();
        textView.setText(r0.X1(Long.valueOf(loanTime != null ? loanTime.longValue() : 0L), "HH:mm, MMM dd, yyyy"));
        Object repaymentStatus = cLHistoryBillDetail.getRepaymentStatus();
        if (repaymentStatus == null) {
            repaymentStatus = 0L;
        }
        boolean zEquals = repaymentStatus.equals(2);
        Context context = this.f4991a;
        if (zEquals) {
            eVar.f43759c.setText(context.getString(g.cs_cl_bill_overdue));
            eVar.f43759c.setTextColor(context.getColor(b.cs_cl_bill_overdue_txt_color));
            return;
        }
        Object repaymentStatus2 = cLHistoryBillDetail.getRepaymentStatus();
        if (repaymentStatus2 == null) {
            repaymentStatus2 = 0L;
        }
        if (repaymentStatus2.equals(1)) {
            eVar.f43759c.setText(context.getString(g.cs_cl_bill_not_paid_off));
            eVar.f43759c.setTextColor(context.getColor(b.cs_cl_no_pay_off_txt_color));
        } else {
            eVar.f43759c.setText(context.getString(g.cs_cl_bill_paid_off));
            eVar.f43759c.setTextColor(context.getColor(b.cs_cl_pay_off_txt_color));
        }
    }
}
