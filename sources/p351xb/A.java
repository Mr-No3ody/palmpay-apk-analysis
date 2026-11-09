package p351xb;

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
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.transsnet.palmpay.credit.bean.resp.RepaymentPlan;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class A extends h {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Context f43746d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final List f43747e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public A(Context context, List data) {
        super(context, data);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(data, "data");
        this.f43746d = context;
        this.f43747e = data;
    }

    @Override // Kb.h
    public final RecyclerView.ViewHolder a(ViewGroup parent) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        View viewInflate = LayoutInflater.from(this.f43746d).inflate(f.cs_cl_repayment_plan_item, parent, false);
        Intrinsics.e(viewInflate);
        return new z(viewInflate);
    }

    @Override // Kb.h
    public final void c(RecyclerView.ViewHolder holder, int i7) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        z zVar = (z) holder;
        List list = this.f43747e;
        RepaymentPlan repaymentPlan = (RepaymentPlan) list.get(i7);
        int i10 = i7 + 1;
        String strC = AbstractC0198c.C(i10);
        TextView textView = zVar.f43827a;
        int i11 = g.cs_cl_installment_due_on;
        Long repaymentDate = repaymentPlan.getRepaymentDate();
        Object[] objArr = {r0.X1(Long.valueOf(repaymentDate != null ? repaymentDate.longValue() : 0L), "dd MMM, yyyy")};
        Context context = this.f4991a;
        textView.setText(context.getString(i11, objArr));
        zVar.f43828b.setText(strC + " Term");
        zVar.f43829c.setText(i10 + "/" + list.size());
        Long principal = repaymentPlan.getPrincipal();
        long jLongValue = principal != null ? principal.longValue() : 0L;
        Long interest = repaymentPlan.getInterest();
        long jLongValue2 = jLongValue + (interest != null ? interest.longValue() : 0L);
        Long serviceFee = repaymentPlan.getServiceFee();
        zVar.f43830d.setText(r0.B(jLongValue2 + (serviceFee != null ? serviceFee.longValue() : 0L), true));
        int i12 = g.cs_cl_interest_incl;
        Long interest2 = repaymentPlan.getInterest();
        zVar.f43831e.setText(context.getString(i12, r0.B(interest2 != null ? interest2.longValue() : 0L, true)));
        Long serviceFee2 = repaymentPlan.getServiceFee();
        long jLongValue3 = serviceFee2 != null ? serviceFee2.longValue() : 0L;
        TextView textView2 = zVar.f43832f;
        if (jLongValue3 > 0) {
            int i13 = g.cs_repay_plan_service_fee;
            Long serviceFee3 = repaymentPlan.getServiceFee();
            textView2.setText(context.getString(i13, r0.B(serviceFee3 != null ? serviceFee3.longValue() : 0L, true)));
            textView2.setVisibility(0);
        } else {
            textView2.setVisibility(8);
        }
        List list2 = this.f4992b;
        int size = list2.size();
        ProgressBar progressBar = zVar.f43833g;
        progressBar.setMax(size);
        progressBar.setProgress(i10);
        View view = zVar.f43834i;
        View view2 = zVar.f43835j;
        if (i7 == 0) {
            view.setVisibility(4);
            if (list2.size() > 1) {
                view2.setVisibility(0);
                return;
            } else {
                view2.setVisibility(8);
                return;
            }
        }
        if (i7 == list2.size() - 1) {
            view.setVisibility(0);
            view2.setVisibility(4);
        } else {
            view.setVisibility(0);
            view2.setVisibility(0);
        }
    }
}
