package p368yb;

import E.AbstractC0198c;
import Kb.h;
import Pa.r0;
import Ya.f;
import Ya.g;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ProgressBar;
import androidx.recyclerview.widget.RecyclerView;
import com.transsnet.palmpay.credit.bean.resp.SpreadRepaymentPlan;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class a0 extends h {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Context f44220d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final List f44221e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a0(Context context, List data) {
        super(context, data);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(data, "data");
        this.f44220d = context;
        this.f44221e = data;
    }

    @Override // Kb.h
    public final RecyclerView.ViewHolder a(ViewGroup parent) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        View viewInflate = LayoutInflater.from(this.f44220d).inflate(f.cs_oc_repayment_plan_item, parent, false);
        Intrinsics.e(viewInflate);
        return new Z(viewInflate);
    }

    @Override // Kb.h
    public final void c(RecyclerView.ViewHolder holder, int i7) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        Z z3 = (Z) holder;
        SpreadRepaymentPlan spreadRepaymentPlan = (SpreadRepaymentPlan) this.f44221e.get(i7);
        int i10 = i7 + 1;
        String strC = AbstractC0198c.C(i10);
        z3.f44214a.setText(strC + " Repayment");
        int i11 = g.cs_cl_installment_due_on;
        Long repaymentDateStamp = spreadRepaymentPlan.getRepaymentDateStamp();
        Object[] objArr = {r0.X1(Long.valueOf(repaymentDateStamp != null ? repaymentDateStamp.longValue() : 0L), "dd MMM")};
        Context context = this.f4991a;
        z3.f44215b.setText(context.getString(i11, objArr));
        int i12 = g.cs_cl_interest_incl;
        Long currentPrincipal = spreadRepaymentPlan.getCurrentPrincipal();
        long jLongValue = currentPrincipal != null ? currentPrincipal.longValue() : 0L;
        Long currentServiceFee = spreadRepaymentPlan.getCurrentServiceFee();
        String strB = r0.B(jLongValue + (currentServiceFee != null ? currentServiceFee.longValue() : 0L), true);
        Long currentServiceFee2 = spreadRepaymentPlan.getCurrentServiceFee();
        z3.f44216c.setText(context.getString(i12, strB, r0.B(currentServiceFee2 != null ? currentServiceFee2.longValue() : 0L, true)));
        List list = this.f4992b;
        int size = list.size();
        ProgressBar progressBar = z3.f44217d;
        progressBar.setMax(size);
        progressBar.setProgress(i10);
        View view = z3.f44219f;
        View view2 = z3.f44218e;
        if (i7 == 0) {
            view2.setVisibility(4);
            view.setVisibility(0);
        } else if (i7 == list.size() - 1) {
            view2.setVisibility(0);
            view.setVisibility(4);
        } else {
            view2.setVisibility(0);
            view.setVisibility(0);
        }
    }
}
