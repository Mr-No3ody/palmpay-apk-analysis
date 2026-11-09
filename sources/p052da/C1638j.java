package p052da;

import Kb.c;
import L6.b;
import android.graphics.Color;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.transsnet.palmpay.core.bean.BillProcessData2;
import com.transsnet.palmpay.custom_view.r;
import kotlin.jvm.internal.Intrinsics;
import p025ba.e;
import p025ba.g;

/* JADX INFO: renamed from: da.j, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C1638j extends c {
    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final void onBindViewHolder(RecyclerView.ViewHolder holder, int i7) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        if (i7 < this.f4985b.size()) {
            BillProcessData2 billProcessData2 = (BillProcessData2) this.f4985b.get(i7);
            C1637i c1637i = (C1637i) holder;
            c1637i.f35776e.setText(billProcessData2.shortTips);
            c1637i.f35777f.setText(billProcessData2.tips);
            int size = this.f4985b.size() - 1;
            View view = c1637i.f35778g;
            if (i7 == size) {
                view.setVisibility(8);
            }
            BillProcessData2 billProcessData3 = (i7 == this.f4985b.size() - 1 || this.f4985b.size() <= 1) ? null : (BillProcessData2) this.f4985b.get(i7 + 1);
            if (billProcessData3 != null) {
                if (billProcessData3.selected) {
                    view.setBackgroundColor(this.f4984a.getResources().getColor(b.ppColorPrimary));
                } else {
                    view.setBackgroundColor(Color.parseColor("#DFE0E1"));
                }
            }
            boolean z3 = billProcessData2.selected;
            ImageView imageView = c1637i.f35775d;
            if (z3) {
                imageView.setImageResource(r.cv_check_purple);
            } else {
                imageView.setImageResource(r.cv_check_gray);
            }
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int i7) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        View itemView = LayoutInflater.from(this.f4984a).inflate(g.core_item_bill_process, parent, false);
        Intrinsics.checkNotNullExpressionValue(itemView, "inflate(...)");
        Intrinsics.checkNotNullParameter(itemView, "itemView");
        C1637i c1637i = new C1637i(this, itemView);
        View viewFindViewById = itemView.findViewById(e.cib_checkiv);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById, "findViewById(...)");
        c1637i.f35775d = (ImageView) viewFindViewById;
        View viewFindViewById2 = itemView.findViewById(e.cib_ExpressageTv);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById2, "findViewById(...)");
        c1637i.f35776e = (TextView) viewFindViewById2;
        View viewFindViewById3 = itemView.findViewById(e.cib_TimeTv);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById3, "findViewById(...)");
        c1637i.f35777f = (TextView) viewFindViewById3;
        View viewFindViewById4 = itemView.findViewById(e.cib_Line);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById4, "findViewById(...)");
        c1637i.f35778g = viewFindViewById4;
        return c1637i;
    }
}
