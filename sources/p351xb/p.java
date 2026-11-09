package p351xb;

import L6.b;
import M1.j;
import N8.q0;
import Pa.r0;
import Ya.d;
import Ya.e;
import Ya.f;
import Ya.g;
import android.content.Context;
import android.text.TextUtils;
import android.widget.CheckBox;
import com.chad.library.adapter.base.viewholder.BaseViewHolder;
import com.transsnet.palmpay.credit.bean.resp.CLRepaymentPlanData;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class p extends j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Integer f43803a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Integer f43804b;

    public p(Integer num, Integer num2) {
        super(f.cs_cl_keep_time_item, null);
        this.f43803a = num;
        this.f43804b = num2;
    }

    @Override // M1.j
    public final void convert(BaseViewHolder holder, Object obj) {
        String strX1;
        String string;
        CLRepaymentPlanData itemData = (CLRepaymentPlanData) obj;
        Intrinsics.checkNotNullParameter(holder, "holder");
        Intrinsics.checkNotNullParameter(itemData, "itemData");
        int i7 = e.tvTime;
        Integer num = this.f43804b;
        if (num != null && num.intValue() == 2) {
            strX1 = TextUtils.equals(itemData.getTermSpanUnit(), "D") ? q0.j(r0.w1(String.valueOf(itemData.getTermSpan()), String.valueOf(itemData.getLoanTerm())).toPlainString(), " days") : q0.j(r0.w1(String.valueOf(itemData.getTermSpan()), String.valueOf(itemData.getLoanTerm())).toPlainString(), " months");
        } else if (num != null && num.intValue() == 3) {
            strX1 = itemData.getLoanDays() + " Days";
        } else {
            strX1 = r0.X1(itemData.getRepaymentDate(), "dd MMM, yyyy");
        }
        holder.setText(i7, strX1);
        CheckBox checkBox = (CheckBox) holder.getView(e.ckKeepTime);
        Integer num2 = this.f43803a;
        boolean z3 = false;
        checkBox.setChecked(num2 != null && num2.intValue() == holder.getLayoutPosition());
        int i10 = e.tvDate;
        if (num != null && num.intValue() == 2) {
            string = getContext().getString(g.cs_cl_repay_in_periods, itemData.getLoanTerm());
        } else if (num != null && num.intValue() == 3) {
            Context context = getContext();
            int i11 = g.cs_cl_borrow_interest_per_day;
            Long loanAmount = itemData.getLoanAmount();
            String strC = r0.C(r0.E(loanAmount != null ? loanAmount.longValue() : 0L), true);
            Long interest = itemData.getInterest();
            string = context.getString(i11, strC, r0.B(interest != null ? interest.longValue() : 0L, true));
        } else {
            string = getContext().getString(g.cs_cl_repay_in_days, itemData.getLoanDays());
        }
        holder.setText(i10, string);
        Boolean available = itemData.getAvailable();
        Boolean bool = Boolean.FALSE;
        if (Intrinsics.c(available, bool)) {
            holder.setEnabled(e.ckKeepTime, false);
            holder.setBackgroundResource(e.ckKeepTime, d.cs_cl_keep_time_selected_disabled_icon);
        } else {
            holder.setEnabled(e.ckKeepTime, true);
            holder.setBackgroundResource(e.ckKeepTime, d.cs_cl_keep_time_selector);
            CheckBox checkBox2 = (CheckBox) holder.getView(e.ckKeepTime);
            Integer num3 = this.f43803a;
            int layoutPosition = holder.getLayoutPosition();
            if (num3 != null && num3.intValue() == layoutPosition) {
                z3 = true;
            }
            checkBox2.setChecked(z3);
        }
        holder.setVisible(e.tvUnlocked, Intrinsics.c(itemData.getAvailable(), bool));
        holder.setTextColor(e.tvTime, Intrinsics.c(itemData.getAvailable(), bool) ? getContext().getColor(b.ppColorTextDisable) : getContext().getColor(b.ppColorTextPrimary));
        holder.setTextColor(e.tvDate, Intrinsics.c(itemData.getAvailable(), bool) ? getContext().getColor(b.ppColorTextDisable) : getContext().getColor(b.ppColorTextNormal));
    }
}
