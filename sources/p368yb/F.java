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
import com.transsnet.palmpay.credit.bean.rsp.OfflineInstallmentRepaymentPlanPO;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import p351xb.m;

/* JADX INFO: loaded from: classes4.dex */
public final class F extends h {
    @Override // Kb.h
    public final RecyclerView.ViewHolder a(ViewGroup parent) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        View viewInflate = LayoutInflater.from(this.f4991a).inflate(f.cs_oc_installmen_item, parent, false);
        Intrinsics.e(viewInflate);
        return new E(viewInflate);
    }

    @Override // Kb.h
    public final void c(RecyclerView.ViewHolder holder, int i7) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        E e10 = (E) holder;
        List list = this.f4992b;
        OfflineInstallmentRepaymentPlanPO offlineInstallmentRepaymentPlanPO = (OfflineInstallmentRepaymentPlanPO) list.get(i7);
        e10.f44164e.setMax(list.size());
        e10.f44165f.setText(offlineInstallmentRepaymentPlanPO.getCurrentTerm() + "/" + list.size());
        e10.f44166g.setText(offlineInstallmentRepaymentPlanPO.getCurrentTermDesc());
        int i10 = g.cs_oc_cur_installment_due_date;
        Object[] objArr = {r0.X1(offlineInstallmentRepaymentPlanPO.getRepaymentDateStamp(), "dd/MM")};
        Context context = this.f4991a;
        e10.f44167i.setText(context.getString(i10, objArr));
        Long currentAmount = offlineInstallmentRepaymentPlanPO.getCurrentAmount();
        long jLongValue = currentAmount != null ? currentAmount.longValue() : 0L;
        Long currentServiceFee = offlineInstallmentRepaymentPlanPO.getCurrentServiceFee();
        String strB = r0.B(jLongValue + (currentServiceFee != null ? currentServiceFee.longValue() : 0L), true);
        TextView textView = e10.f44169o;
        textView.setText(strB);
        Long currentAmount2 = offlineInstallmentRepaymentPlanPO.getCurrentAmount();
        e10.f44170p.setText(r0.B(currentAmount2 != null ? currentAmount2.longValue() : 0L, true));
        Long currentServiceFee2 = offlineInstallmentRepaymentPlanPO.getCurrentServiceFee();
        e10.t.setText(r0.B(currentServiceFee2 != null ? currentServiceFee2.longValue() : 0L, true));
        View view = e10.f44160a;
        if (i7 == 0) {
            view.setVisibility(4);
        } else {
            view.setVisibility(0);
        }
        int size = list.size() - 1;
        View view2 = e10.f44162c;
        View view3 = e10.f44161b;
        if (i7 == size) {
            view3.setVisibility(4);
            view2.setVisibility(4);
        } else {
            view3.setVisibility(0);
            view2.setVisibility(0);
        }
        Long settlementTime = offlineInstallmentRepaymentPlanPO.getSettlementTime();
        TextView textView2 = e10.f44168j;
        ImageView imageView = e10.f44163d;
        ProgressBar progressBar = e10.f44164e;
        if (settlementTime != null) {
            progressBar.setProgress(i7 + 1);
            imageView.setImageResource(d.cs_oc_installment_completed_icon);
            view.setBackgroundColor(context.getColor(b.cs_oc_installment_completed_color));
            view3.setBackgroundColor(context.getColor(b.cs_oc_installment_completed_color));
            textView2.setVisibility(0);
            if (i7 >= list.size() - 1 || offlineInstallmentRepaymentPlanPO.getSettlementTime() != null) {
                view3.setBackgroundColor(context.getColor(b.cs_oc_installment_completed_color));
            } else {
                view3.setBackgroundColor(context.getColor(b.cs_oc_installment_uncompleted_color));
            }
        } else {
            progressBar.setProgress(0);
            view.setBackgroundColor(context.getColor(b.cs_oc_installment_uncompleted_color));
            view3.setBackgroundColor(context.getColor(b.cs_oc_installment_uncompleted_color));
            imageView.setImageResource(d.cs_oc_bill_installment_uncompleted_icon);
            textView2.setVisibility(8);
        }
        p220oa.h.l(new m(holder, 2), textView);
    }
}
