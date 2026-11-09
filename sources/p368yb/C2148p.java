package p368yb;

import Kb.h;
import Pa.r0;
import Ya.b;
import Ya.d;
import Ya.f;
import Ya.g;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.transsnet.palmpay.credit.bean.rsp.BillSpreadRepaymentPlan;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import p351xb.m;

/* JADX INFO: renamed from: yb.p, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C2148p extends h {
    @Override // Kb.h
    public final RecyclerView.ViewHolder a(ViewGroup parent) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        View viewInflate = LayoutInflater.from(this.f4991a).inflate(f.cs_oc_bill_installmen_item, parent, false);
        Intrinsics.e(viewInflate);
        return new C2147o(viewInflate);
    }

    @Override // Kb.h
    public final void c(RecyclerView.ViewHolder holder, int i7) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        C2147o c2147o = (C2147o) holder;
        List list = this.f4992b;
        BillSpreadRepaymentPlan billSpreadRepaymentPlan = (BillSpreadRepaymentPlan) list.get(i7);
        c2147o.f44245e.setMax(list.size());
        c2147o.f44246f.setText(billSpreadRepaymentPlan.getCurrentTerm() + "/" + list.size());
        c2147o.f44247g.setText(billSpreadRepaymentPlan.getCurrentTermDesc());
        int i10 = g.cs_oc_cur_installment_due_date;
        Object[] objArr = {r0.X1(billSpreadRepaymentPlan.getRepaymentDateStamp(), "dd/MM")};
        Context context = this.f4991a;
        c2147o.f44248i.setText(context.getString(i10, objArr));
        Long currentPrincipal = billSpreadRepaymentPlan.getCurrentPrincipal();
        long jLongValue = currentPrincipal != null ? currentPrincipal.longValue() : 0L;
        Long currentServiceFee = billSpreadRepaymentPlan.getCurrentServiceFee();
        String strB = r0.B(jLongValue + (currentServiceFee != null ? currentServiceFee.longValue() : 0L), true);
        TextView textView = c2147o.f44250o;
        textView.setText(strB);
        Long currentPrincipal2 = billSpreadRepaymentPlan.getCurrentPrincipal();
        c2147o.f44251p.setText(r0.B(currentPrincipal2 != null ? currentPrincipal2.longValue() : 0L, true));
        Long currentServiceFee2 = billSpreadRepaymentPlan.getCurrentServiceFee();
        c2147o.t.setText(r0.B(currentServiceFee2 != null ? currentServiceFee2.longValue() : 0L, true));
        View view = c2147o.f44241a;
        if (i7 == 0) {
            view.setVisibility(4);
        } else {
            view.setVisibility(0);
        }
        int size = list.size() - 1;
        View view2 = c2147o.f44243c;
        View view3 = c2147o.f44242b;
        if (i7 == size) {
            view3.setVisibility(4);
            view2.setVisibility(4);
        } else {
            view3.setVisibility(0);
            view2.setVisibility(0);
        }
        Long settlementTime = billSpreadRepaymentPlan.getSettlementTime();
        TextView textView2 = c2147o.f44249j;
        ImageView imageView = c2147o.f44244d;
        ProgressBar progressBar = c2147o.f44245e;
        if (settlementTime != null) {
            int i11 = i7 + 1;
            progressBar.setProgress(i11);
            imageView.setImageResource(d.cs_oc_installment_completed_icon);
            view.setBackgroundColor(context.getColor(b.cs_oc_installment_completed_color));
            textView2.setVisibility(8);
            textView.setText(context.getString(g.cs_cur_paid_off));
            textView.setTextColor(context.getColor(b.cs_pay_off_txt_color));
            if (i11 >= list.size() || ((BillSpreadRepaymentPlan) list.get(i11)).getSettlementTime() != null) {
                view3.setBackgroundColor(context.getColor(b.cs_oc_installment_completed_color));
            } else {
                view3.setBackgroundResource(d.cs_oc_bill_ins_divider_uncompleted_bg);
            }
        } else {
            progressBar.setProgressDrawable(context.getDrawable(d.cs_oc_bill_installment_uncompleted_index_progress));
            progressBar.setProgress(i7 + 1);
            view.setBackgroundResource(d.cs_oc_bill_ins_divider_uncompleted_bg);
            view3.setBackgroundResource(d.cs_oc_bill_ins_divider_uncompleted_bg);
            imageView.setImageResource(d.cs_oc_bill_installment_uncompleted_icon);
            textView2.setVisibility(8);
        }
        p220oa.h.l(new m(holder, 1), textView);
    }
}
