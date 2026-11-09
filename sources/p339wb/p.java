package p339wb;

import C0.G;
import E.AbstractC0198c;
import F6.d;
import Kb.c;
import L6.b;
import Pa.r0;
import Ya.f;
import Ya.g;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.transsnet.palmpay.credit.bean.OutstandingAccount;
import com.transsnet.palmpay.util.SpanUtils;
import kotlin.jvm.internal.Intrinsics;
import p220oa.h;
import p264r5.a;

/* JADX INFO: loaded from: classes4.dex */
public final class p extends c {
    static {
        new n(null);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final void onBindViewHolder(RecyclerView.ViewHolder holder, int i7) {
        Long l5;
        Long l6;
        Long l8;
        Long l10;
        Long l11;
        Intrinsics.checkNotNullParameter(holder, "holder");
        if (holder instanceof o) {
            o oVar = (o) holder;
            OutstandingAccount outstandingAccount = (OutstandingAccount) getItem(i7);
            oVar.getClass();
            d.h("OutstandingDetailAdapter", 3, "OutstandingDetailAdapter >>> loan");
            TextView textView = oVar.f43382d;
            if (textView != null) {
                textView.setText(outstandingAccount != null ? outstandingAccount.productTitle : null);
            }
            TextView textView2 = oVar.f43384f;
            if (textView2 != null) {
                textView2.setText(r0.B((outstandingAccount == null || (l11 = outstandingAccount.billOutstandingAmount) == null) ? 0L : l11.longValue(), true));
            }
            long jZ = AbstractC0198c.z((outstandingAccount == null || (l10 = outstandingAccount.repaymentDateStamp) == null) ? 0L : l10.longValue());
            String strX1 = r0.X1(Long.valueOf((outstandingAccount == null || (l8 = outstandingAccount.repaymentDateStamp) == null) ? 0L : l8.longValue()), "MMM dd");
            d.h("OutstandingDetailAdapter", 3, "leftDays = " + jZ + ", dueDate = " + strX1);
            TextView textView3 = oVar.f43383e;
            p pVar = oVar.f43386i;
            if (jZ < 0) {
                long jD = AbstractC0198c.D((outstandingAccount == null || (l6 = outstandingAccount.repaymentDateStamp) == null) ? 0L : l6.longValue());
                if (textView3 != null) {
                    textView3.setBackground(a.q(Ya.d.cs_cl_outstanding_item_desc_bg_red, pVar.f4984a));
                }
                if (textView3 != null) {
                    textView3.setTextColor(pVar.f4984a.getColor(com.transsnet.palmpay.custom_view.p.md_white_1000));
                }
                if (textView3 != null) {
                    textView3.setText(jD <= 1 ? pVar.f4984a.getString(g.cs_cl_outstanding_item_desc_overdue_one) : pVar.f4984a.getString(g.cs_cl_outstanding_item_desc_overdue, Long.valueOf(jD)));
                }
            } else if (jZ < 1) {
                if (textView3 != null) {
                    textView3.setBackground(a.q(Ya.d.cs_cl_outstanding_item_desc_bg_red, pVar.f4984a));
                }
                if (textView3 != null) {
                    textView3.setTextColor(pVar.f4984a.getColor(com.transsnet.palmpay.custom_view.p.md_white_1000));
                }
                if (textView3 != null) {
                    textView3.setText(pVar.f4984a.getString(g.cs_cl_outstanding_item_desc_due_date_today));
                }
            } else if (jZ <= 3) {
                if (textView3 != null) {
                    textView3.setBackground(a.q(Ya.d.cs_cl_outstanding_item_desc_bg_yellow, pVar.f4984a));
                }
                if (textView3 != null) {
                    textView3.setTextColor(pVar.f4984a.getColor(b.ppColorWarning));
                }
                if (textView3 != null) {
                    textView3.setText(jZ <= 1 ? pVar.f4984a.getString(g.cs_cl_outstanding_item_desc_due_date_one) : pVar.f4984a.getString(g.cs_cl_outstanding_item_desc_due_date, Long.valueOf(jZ)));
                }
            } else {
                if (textView3 != null) {
                    textView3.setBackground(a.q(Ya.d.cs_cl_outstanding_item_desc_bg_gray, pVar.f4984a));
                }
                if (textView3 != null) {
                    textView3.setTextColor(pVar.f4984a.getColor(b.ppColorTextAssist));
                }
                if (textView3 != null) {
                    textView3.setText(pVar.f4984a.getString(g.cs_cl_outstanding_item_desc_normal, strX1));
                }
            }
            long jLongValue = (outstandingAccount == null || (l5 = outstandingAccount.penalty) == null) ? 0L : l5.longValue();
            String strB = r0.B(jLongValue, true);
            TextView textView4 = oVar.f43385g;
            if (textView4 != null) {
                h.s(textView4, jLongValue > 0);
            }
            if (textView4 != null) {
                SpanUtils spanUtilsAppend = new SpanUtils().append(pVar.f4984a.getString(g.cs_cl_outstanding_item_desc_late_fee));
                int i10 = b.ppColorTextAssist;
                Context context = pVar.f4984a;
                G.w(context, b.ppColorError, spanUtilsAppend.setForegroundColor(context.getColor(i10)).append(" ").append(strB), textView4);
            }
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int i7) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        View viewInflate = LayoutInflater.from(this.f4984a).inflate(f.cs_cl_outstanding_detail_item, parent, false);
        Intrinsics.checkNotNullExpressionValue(viewInflate, "inflate(...)");
        return new o(this, viewInflate);
    }
}
