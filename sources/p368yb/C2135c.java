package p368yb;

import Kb.h;
import N8.q0;
import Pa.r0;
import Ya.b;
import Ya.d;
import Ya.f;
import Ya.g;
import android.content.Context;
import android.text.format.DateUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.transsnet.palmpay.credit.bean.rsp.AllBillDetail;
import com.transsnet.palmpay.credit.ui.activity.okcard.OcAllBillActivity;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: yb.c, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C2135c extends h {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f44225d;

    static {
        new C2133a(null);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2135c(OcAllBillActivity context, ArrayList data, int i7) {
        super(context, data);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(data, "data");
        this.f44225d = i7;
    }

    @Override // Kb.h
    public final RecyclerView.ViewHolder a(ViewGroup parent) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        View viewInflate = LayoutInflater.from(this.f4991a).inflate(f.cs_oc_all_bill_item, parent, false);
        Intrinsics.e(viewInflate);
        return new C2134b(viewInflate);
    }

    @Override // Kb.h
    public final void c(RecyclerView.ViewHolder holder, int i7) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        C2134b c2134b = (C2134b) holder;
        AllBillDetail allBillDetail = (AllBillDetail) this.f4992b.get(i7);
        TextView textView = c2134b.f44222a;
        Long repaymentDateStamp = allBillDetail.getRepaymentDateStamp();
        textView.setText("Due on " + r0.X1(Long.valueOf(repaymentDateStamp != null ? repaymentDateStamp.longValue() : 0L), "dd/MM"));
        Long outstandingAmount = allBillDetail.getOutstandingAmount();
        c2134b.f44224c.setText(r0.B(outstandingAmount != null ? outstandingAmount.longValue() : 0L, true));
        int i10 = this.f44225d;
        TextView textView2 = c2134b.f44223b;
        if (i10 != 2) {
            textView2.setVisibility(8);
            return;
        }
        Long repaymentDateStamp2 = allBillDetail.getRepaymentDateStamp();
        boolean zIsToday = DateUtils.isToday(repaymentDateStamp2 != null ? repaymentDateStamp2.longValue() : 0L);
        Context context = this.f4991a;
        if (zIsToday) {
            textView2.setTextColor(context.getColor(b.cs_overdue_today_txt_color));
            textView2.setBackgroundResource(d.cs_oc_all_bill_overdue_today_txt_bg);
            textView2.setText(context.getString(g.cs_days_overdue_today));
            textView2.setVisibility(0);
            return;
        }
        textView2.setTextColor(context.getColor(b.cs_overdue_txt_color));
        textView2.setBackgroundResource(d.cs_oc_all_bill_overdue_txt_bg);
        Long repaymentDateStamp3 = allBillDetail.getRepaymentDateStamp();
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(new Date(repaymentDateStamp3.longValue()));
        calendar.set(11, 0);
        calendar.set(12, 0);
        calendar.set(13, 0);
        Calendar calendar2 = Calendar.getInstance();
        calendar2.set(11, 0);
        textView2.setText(context.getString(g.cs_days_overdue, Long.valueOf((q0.c(calendar2, 12, 0, 13, 0) - calendar.getTimeInMillis()) / 86400000)));
        textView2.setVisibility(0);
    }
}
