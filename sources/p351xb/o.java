package p351xb;

import E.AbstractC0198c;
import Kb.h;
import Pa.r0;
import Ya.d;
import Ya.f;
import Ya.g;
import Za.b;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.transsnet.palmpay.credit.bean.resp.InsRepaymentPlanDetail;
import com.transsnet.palmpay.custom_view.r;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class o extends h {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f43802d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(b context, ArrayList data) {
        super(context, data);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(data, "data");
    }

    @Override // Kb.h
    public final RecyclerView.ViewHolder a(ViewGroup parent) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        View viewInflate = LayoutInflater.from(this.f4991a).inflate(f.cs_cl_installment_item, parent, false);
        Intrinsics.e(viewInflate);
        return new n(viewInflate);
    }

    @Override // Kb.h
    public final void c(RecyclerView.ViewHolder holder, int i7) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        n nVar = (n) holder;
        List list = this.f4992b;
        InsRepaymentPlanDetail insRepaymentPlanDetail = (InsRepaymentPlanDetail) list.get(i7);
        nVar.f43793e.setMax(this.f43802d);
        nVar.f43794f.setText(insRepaymentPlanDetail.getCurrentTerm() + "/" + this.f43802d);
        Integer currentTerm = insRepaymentPlanDetail.getCurrentTerm();
        nVar.f43795g.setText(AbstractC0198c.C(currentTerm != null ? currentTerm.intValue() : 1) + " Term");
        Long principal = insRepaymentPlanDetail.getPrincipal();
        nVar.f43798o.setText(r0.B(principal != null ? principal.longValue() : 0L, true));
        Long paidInterest = insRepaymentPlanDetail.getPaidInterest();
        long jLongValue = paidInterest != null ? paidInterest.longValue() : 0L;
        Long unpaidInterest = insRepaymentPlanDetail.getUnpaidInterest();
        long jLongValue2 = jLongValue + (unpaidInterest != null ? unpaidInterest.longValue() : 0L);
        Long paidPenalty = insRepaymentPlanDetail.getPaidPenalty();
        long jLongValue3 = jLongValue2 + (paidPenalty != null ? paidPenalty.longValue() : 0L);
        Long unpaidPenalty = insRepaymentPlanDetail.getUnpaidPenalty();
        long jLongValue4 = jLongValue3 + (unpaidPenalty != null ? unpaidPenalty.longValue() : 0L);
        Long paidServiceFee = insRepaymentPlanDetail.getPaidServiceFee();
        long jLongValue5 = paidServiceFee != null ? paidServiceFee.longValue() : 0L;
        Long unpaidServiceFee = insRepaymentPlanDetail.getUnpaidServiceFee();
        long jLongValue6 = jLongValue5 + (unpaidServiceFee != null ? unpaidServiceFee.longValue() : 0L);
        nVar.f43799p.setText(r0.B(jLongValue4, true));
        nVar.t.setText(r0.B(jLongValue6, true));
        View view = nVar.f43789a;
        if (i7 == 0) {
            view.setVisibility(4);
        } else {
            view.setVisibility(0);
        }
        int size = list.size() - 1;
        View view2 = nVar.f43791c;
        View view3 = nVar.f43790b;
        if (i7 == size) {
            view3.setVisibility(4);
            view2.setVisibility(4);
        } else {
            view3.setVisibility(0);
            view2.setVisibility(0);
        }
        Long settlementTime = insRepaymentPlanDetail.getSettlementTime();
        TextView textView = nVar.f43801w;
        ImageView imageView = nVar.f43792d;
        ProgressBar progressBar = nVar.f43793e;
        TextView textView2 = nVar.f43797j;
        TextView textView3 = nVar.f43796i;
        Context context = this.f4991a;
        if (settlementTime != null) {
            textView2.setTextColor(context.getColor(Ya.b.cs_oc_installment_completed_color));
            textView2.setText(context.getString(g.cs_cur_paid_off));
            textView3.setVisibility(8);
            int i10 = i7 + 1;
            progressBar.setProgress(i10);
            imageView.setImageResource(d.cs_oc_installment_completed_icon);
            view.setBackgroundColor(context.getColor(Ya.b.cs_oc_installment_completed_color));
            view3.setBackgroundColor(context.getColor(Ya.b.cs_oc_installment_completed_color));
            if (i10 >= list.size() - 1 || ((InsRepaymentPlanDetail) list.get(i10)).getSettlementTime() != null) {
                view3.setBackgroundColor(context.getColor(Ya.b.cs_oc_installment_completed_color));
            } else {
                view3.setBackgroundColor(context.getColor(Ya.b.cs_oc_installment_uncompleted_color));
            }
            textView.setText("hello");
        } else {
            Long repaymentDate = insRepaymentPlanDetail.getRepaymentDate();
            if (AbstractC0198c.K(repaymentDate != null ? repaymentDate.longValue() : 0L)) {
                textView2.setTextColor(context.getColor(Ya.b.cs_due_txt_color));
                textView2.setText(context.getString(g.cs_repay_overdue));
                textView3.setVisibility(0);
                textView3.setTextColor(context.getColor(Ya.b.cs_due_txt_color));
                textView3.setBackgroundResource(d.cs_cl_ins_due_txt_bg);
                Long repaymentDate2 = insRepaymentPlanDetail.getRepaymentDate();
                long jD = AbstractC0198c.D(repaymentDate2 != null ? repaymentDate2.longValue() : 0L);
                textView3.setText(jD > 1 ? context.getString(g.cs_cl_ins_days_overdue, Long.valueOf(jD), "s") : context.getString(g.cs_cl_ins_days_overdue, Long.valueOf(jD), ""));
                imageView.setImageResource(d.cs_oc_installment_due_icon);
                progressBar.setProgressDrawable(context.getDrawable(d.cs_oc_installment_due_index_progress));
            } else {
                textView3.setVisibility(0);
                textView3.setTextColor(context.getColor(L6.b.ppColorTextPrimary));
                textView3.setBackgroundResource(r.cv_shape_rect_corner_4_bg_dark);
                textView3.setText(context.getString(g.cs_cl_ins_due_on, r0.X1(insRepaymentPlanDetail.getRepaymentDate(), "dd/MM")));
                imageView.setImageResource(d.cs_oc_bill_installment_uncompleted_icon);
                progressBar.setProgressDrawable(context.getDrawable(d.cs_oc_installment_index_progress));
                Long principal2 = insRepaymentPlanDetail.getPrincipal();
                long jLongValue7 = principal2 != null ? principal2.longValue() : 0L;
                textView2.setTextColor(context.getColor(L6.b.ppColorTextPrimary));
                textView2.setText(r0.B(jLongValue7 + jLongValue4 + jLongValue6, true));
            }
            progressBar.setProgress(0);
            view.setBackgroundColor(context.getColor(Ya.b.cs_oc_installment_uncompleted_color));
            view3.setBackgroundColor(context.getColor(Ya.b.cs_oc_installment_uncompleted_color));
            textView.setText("");
        }
        p220oa.h.l(new m(holder, 0), textView2);
    }
}
