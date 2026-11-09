package p368yb;

import Kb.h;
import Pa.r0;
import Ya.b;
import Ya.d;
import Ya.f;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.fragment.app.E;
import androidx.recyclerview.widget.RecyclerView;
import com.transsnet.palmpay.credit.bean.rsp.OcRepaidListDetail;
import java.util.ArrayList;
import kotlin.collections.C1847n;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: yb.l, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C2144l extends h {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f44237d;

    static {
        new C2141i(null);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2144l(E context, ArrayList data, int i7) {
        super(context, data);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(data, "data");
        this.f44237d = i7;
    }

    @Override // Kb.h
    public final RecyclerView.ViewHolder a(ViewGroup parent) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        View viewInflate = LayoutInflater.from(this.f4991a).inflate(f.cs_oc_bill_item, parent, false);
        Intrinsics.e(viewInflate);
        return new C2143k(viewInflate);
    }

    @Override // Kb.h
    public final RecyclerView.ViewHolder b(ViewGroup parent) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        View itemView = LayoutInflater.from(this.f4991a).inflate(f.cs_oc_bill_list_empty_layout, parent, false);
        Intrinsics.e(itemView);
        Intrinsics.checkNotNullParameter(itemView, "itemView");
        return new C2142j(itemView);
    }

    @Override // Kb.h
    public final void c(RecyclerView.ViewHolder holder, int i7) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        C2143k c2143k = (C2143k) holder;
        OcRepaidListDetail ocRepaidListDetail = (OcRepaidListDetail) this.f4992b.get(i7);
        c2143k.f44234a.setText(ocRepaidListDetail.getBizDesc());
        c2143k.f44235b.setText(r0.X1(ocRepaidListDetail.getCreateTime(), "HH:mm, MMM dd, yyyy"));
        Long amount = ocRepaidListDetail.getAmount();
        long jLongValue = amount != null ? amount.longValue() : 0L;
        TextView textView = c2143k.f44236c;
        Context context = this.f4991a;
        if (jLongValue > 0) {
            textView.setTextColor(context.getColor(b.cs_oc_positive_txt_grey_color));
            textView.setText(r0.B(jLongValue, true));
        } else {
            textView.setTextColor(context.getColor(b.cs_oc_negative_txt_color));
            textView.setText(r0.B(jLongValue, true));
        }
        if (this.f44237d == 1) {
            Integer[] elements = {12, 13, 14};
            Intrinsics.checkNotNullParameter(elements, "elements");
            if (!CollectionsKt.A(C1847n.A(elements), ocRepaidListDetail.getOperationType())) {
                textView.setCompoundDrawablesWithIntrinsicBounds(0, 0, 0, 0);
                return;
            }
        }
        textView.setCompoundDrawablesWithIntrinsicBounds(0, 0, d.cs_oc_bill_right_arrow_grey_icon, 0);
    }

    @Override // Kb.h
    public final void d(RecyclerView.ViewHolder holder) {
        Intrinsics.checkNotNullParameter(holder, "holder");
    }
}
