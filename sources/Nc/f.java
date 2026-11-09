package Nc;

import C0.G;
import Pa.r0;
import android.view.View;
import android.widget.TextView;
import com.transsnet.palmpay.managemoney.bean.resp.QueryCashBoxTransactionListResp;
import com.transsnet.palmpay.managemoney.ui.adapter.CashBoxTransactionMonthViewHolder$OnMonthClickListener;
import com.transsnet.palmpay.util.SpanUtils;
import java.util.Calendar;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class f extends AbstractC0482a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final CashBoxTransactionMonthViewHolder$OnMonthClickListener f6316b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final TextView f6317c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final TextView f6318d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final TextView f6319e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(View itemView, CashBoxTransactionMonthViewHolder$OnMonthClickListener cashBoxTransactionMonthViewHolder$OnMonthClickListener) {
        super(itemView);
        Intrinsics.checkNotNullParameter(itemView, "itemView");
        this.f6316b = cashBoxTransactionMonthViewHolder$OnMonthClickListener;
        View viewFindViewById = itemView.findViewById(Jc.c.abl_month_tv);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById, "findViewById(...)");
        this.f6317c = (TextView) viewFindViewById;
        View viewFindViewById2 = itemView.findViewById(Jc.c.money_in_textViewSummary);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById2, "findViewById(...)");
        this.f6318d = (TextView) viewFindViewById2;
        View viewFindViewById3 = itemView.findViewById(Jc.c.money_out_textViewSummary);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById3, "findViewById(...)");
        this.f6319e = (TextView) viewFindViewById3;
    }

    @Override // Nc.AbstractC0482a
    public final void a(int i7, Object obj) {
        QueryCashBoxTransactionListResp.CashBoxTransaction cashBoxTransaction = (QueryCashBoxTransactionListResp.CashBoxTransaction) obj;
        super.a(i7, cashBoxTransaction);
        if (cashBoxTransaction != null) {
            Calendar calendar = Calendar.getInstance();
            calendar.setTimeInMillis(cashBoxTransaction.getGmtCreated());
            int i10 = calendar.get(2);
            int i11 = i10 + 1;
            int i12 = calendar.get(1);
            if (i11 > 0) {
                int iN0 = r0.N0(System.currentTimeMillis());
                TextView textView = this.f6317c;
                if (iN0 == i12) {
                    textView.setText(r0.i0(i10));
                } else {
                    textView.setText(r0.i0(i10) + " " + i12);
                }
                textView.setOnClickListener(new Je.l(this, 29));
            }
            long inComeAmount = cashBoxTransaction.getInComeAmount();
            long payOutAmount = cashBoxTransaction.getPayOutAmount();
            int transactionDirection = cashBoxTransaction.getTransactionDirection();
            TextView textView2 = this.f6318d;
            textView2.setVisibility(0);
            TextView textView3 = this.f6319e;
            textView3.setVisibility(0);
            if (transactionDirection == 1) {
                textView3.setVisibility(8);
            } else if (transactionDirection == 2) {
                textView2.setVisibility(8);
            }
            textView2.setText(G.i("In  ").setForegroundColor(textView2.getContext().getColor(com.transsnet.palmpay.custom_view.p.cv_color_858a8f)).append(inComeAmount > -1 ? r0.B(inComeAmount, false) : "₦ --").create());
            textView3.setText(new SpanUtils().append("Out  ").setForegroundColor(textView2.getContext().getColor(com.transsnet.palmpay.custom_view.p.cv_color_858a8f)).append(payOutAmount > -1 ? r0.B(Math.abs(payOutAmount), false) : "₦ --").create());
        }
    }
}
