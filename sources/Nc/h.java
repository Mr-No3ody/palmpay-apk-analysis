package Nc;

import Pa.i0;
import Pa.r0;
import android.content.Context;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.transsnet.palmpay.core.bean.bill.TransType;
import com.transsnet.palmpay.managemoney.bean.resp.QueryCashBoxTransactionListResp;
import java.math.BigDecimal;
import java.util.Arrays;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class h extends AbstractC0482a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f6320b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f6321c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ImageView f6322d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final TextView f6323e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final TextView f6324f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final TextView f6325g;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final TextView f6326i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final TextView f6327j;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final View f6328o;

    static {
        new g(null);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(View itemView, boolean z3, boolean z8) {
        super(itemView);
        Intrinsics.checkNotNullParameter(itemView, "itemView");
        this.f6320b = z3;
        this.f6321c = z8;
        View viewFindViewById = itemView.findViewById(Jc.c.ivIcon);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById, "findViewById(...)");
        this.f6322d = (ImageView) viewFindViewById;
        View viewFindViewById2 = itemView.findViewById(Jc.c.tvTransactionName);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById2, "findViewById(...)");
        this.f6323e = (TextView) viewFindViewById2;
        View viewFindViewById3 = itemView.findViewById(Jc.c.tvTransactionTime);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById3, "findViewById(...)");
        this.f6324f = (TextView) viewFindViewById3;
        View viewFindViewById4 = itemView.findViewById(Jc.c.tvTransactionAmount);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById4, "findViewById(...)");
        this.f6325g = (TextView) viewFindViewById4;
        View viewFindViewById5 = itemView.findViewById(Jc.c.tvTransactionStatus);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById5, "findViewById(...)");
        this.f6326i = (TextView) viewFindViewById5;
        View viewFindViewById6 = itemView.findViewById(Jc.c.viewDivider);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById6, "findViewById(...)");
        this.f6328o = viewFindViewById6;
        this.f6327j = (TextView) itemView.findViewById(Jc.c.tvFundName);
    }

    /* JADX WARN: Code duplicated, block: B:24:0x0077  */
    @Override // Nc.AbstractC0482a
    public final void a(int i7, Object obj) {
        int i10;
        TextView textView;
        int i11;
        String string;
        QueryCashBoxTransactionListResp.CashBoxTransaction cashBoxTransaction = (QueryCashBoxTransactionListResp.CashBoxTransaction) obj;
        super.a(i7, cashBoxTransaction);
        this.f6328o.setVisibility(this.f6320b ? 0 : 8);
        boolean zV = i0.V(this.itemView);
        View view = this.itemView;
        if (view != null) {
            view.setBackgroundColor(view.getContext().getResources().getColor(zV ? com.transsnet.palmpay.custom_view.p.cv_color_1e1e1e : com.transsnet.palmpay.custom_view.p.md_white_1000));
        }
        if (cashBoxTransaction != null) {
            ImageView imageView = this.f6322d;
            if (this.f6321c) {
                r0.g1(imageView, Ea.a.c(TransType.TRANS_TYPE_X5, (14 & 2) != 0 ? null : -1, null, null), (G1.d) new G1.d().x(com.transsnet.palmpay.custom_view.r.cv_bill_default_icon));
            } else {
                String orgTransactionType = cashBoxTransaction.getOrgTransactionType();
                if (orgTransactionType == null) {
                    imageView.setImageResource(Jc.b.mm_icon_cash_box);
                } else {
                    if (orgTransactionType.length() == 0) {
                        orgTransactionType = null;
                    }
                    if (orgTransactionType != null) {
                        r0.g1(imageView, Ea.a.c(orgTransactionType, (14 & 2) != 0 ? null : -1, null, null), (G1.d) new G1.d().x(com.transsnet.palmpay.custom_view.r.cv_bill_default_icon));
                    } else {
                        imageView.setImageResource(Jc.b.mm_icon_cash_box);
                    }
                }
            }
            this.f6323e.setText(cashBoxTransaction.getTransactionName());
            this.f6324f.setText(r0.O(cashBoxTransaction.getGmtCreated()));
            boolean zEquals = "x7_01".equals(cashBoxTransaction.getSubTransType());
            TextView textView2 = this.f6325g;
            if (zEquals) {
                String str = cashBoxTransaction.getTransactionDirection() == 1 ? "+" : "-";
                double units = cashBoxTransaction.getUnits();
                try {
                    units = BigDecimal.valueOf(units).setScale(4, 4).doubleValue();
                } catch (Exception unused) {
                }
                String str2 = String.format("%s%s%s", Arrays.copyOf(new Object[]{str, Double.valueOf(units), " Units"}, 3));
                Intrinsics.checkNotNullExpressionValue(str2, "format(...)");
                textView2.setText(str2);
            } else {
                String str3 = String.format("%s%s", Arrays.copyOf(new Object[]{cashBoxTransaction.getTransactionDirection() == 1 ? "+" : "-", r0.A(cashBoxTransaction.getAmount())}, 2));
                Intrinsics.checkNotNullExpressionValue(str3, "format(...)");
                textView2.setText(str3);
            }
            Long balance = cashBoxTransaction.getBalance();
            TextView textView3 = this.f6326i;
            if (balance != null) {
                if (cashBoxTransaction.getTransactionStatus() == 2) {
                    Context context = this.itemView.getContext();
                    int i12 = Jc.f.mm_history_balance;
                    Long balance2 = cashBoxTransaction.getBalance();
                    Intrinsics.e(balance2);
                    string = context.getString(i12, r0.A(balance2.longValue()));
                } else {
                    Context context2 = this.itemView.getContext();
                    int transactionStatus = cashBoxTransaction.getTransactionStatus();
                    if (transactionStatus == 1) {
                        i11 = p025ba.k.core_processing;
                    } else if (transactionStatus != 2) {
                        i11 = transactionStatus != 3 ? p025ba.k.core_refunded : p025ba.k.core_failed;
                    } else {
                        i11 = p025ba.k.core_successful;
                    }
                    string = context2.getString(i11);
                }
                textView3.setText(string);
            } else {
                textView3.setText("");
            }
            Context context3 = this.itemView.getContext();
            int transactionStatus2 = cashBoxTransaction.getTransactionStatus();
            if (transactionStatus2 == 1) {
                i10 = com.transsnet.palmpay.custom_view.p.cv_color_ffaa0c;
            } else if (transactionStatus2 != 2) {
                i10 = transactionStatus2 != 3 ? L6.b.ppColorTextDisable : L6.b.ppColorError;
            } else {
                i10 = L6.b.ppColorTextAssist;
            }
            textView3.setTextColor(context3.getColor(i10));
            String fundName = cashBoxTransaction.getFundName();
            if (fundName == null || (textView = this.f6327j) == null) {
                return;
            }
            textView.setText(fundName);
        }
    }
}
