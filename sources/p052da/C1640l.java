package p052da;

import Kb.c;
import L6.b;
import android.content.Context;
import android.graphics.Color;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.transsnet.palmpay.core.bean.BillProcessTitleData1;
import com.transsnet.palmpay.custom_view.r;
import kotlin.jvm.internal.Intrinsics;
import p025ba.g;
import p355xf.t;

/* JADX INFO: renamed from: da.l, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C1640l extends c {
    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final void onBindViewHolder(RecyclerView.ViewHolder holder, int i7) {
        BillProcessTitleData1 billProcessTitleData1;
        Intrinsics.checkNotNullParameter(holder, "holder");
        C1639k c1639k = (C1639k) holder;
        BillProcessTitleData1 billProcessTitleData2 = (BillProcessTitleData1) this.f4985b.get(i7);
        ((View) c1639k.f35781f.getValue()).setVisibility(0);
        t tVar = c1639k.f35780e;
        ((View) tVar.getValue()).setVisibility(0);
        t tVar2 = c1639k.f35781f;
        if (i7 == 0) {
            ((View) tVar2.getValue()).setVisibility(8);
            billProcessTitleData1 = this.f4985b.size() > 1 ? (BillProcessTitleData1) this.f4985b.get(i7 + 1) : null;
        } else if (i7 == this.f4985b.size() - 1) {
            ((View) tVar.getValue()).setVisibility(8);
            if (this.f4985b.size() > 1) {
            }
        } else {
            BillProcessTitleData1 billProcessTitleData3 = (BillProcessTitleData1) this.f4985b.get(i7 + 1);
            billProcessTitleData1 = billProcessTitleData3;
        }
        boolean z3 = billProcessTitleData2.checked;
        String str = billProcessTitleData2.shortTips;
        t tVar3 = c1639k.f35782g;
        if (z3) {
            ((ImageView) tVar3.getValue()).setImageResource(r.cv_check_purple);
        } else {
            ((ImageView) tVar3.getValue()).setImageResource(r.cv_check_gray);
        }
        ((TextView) c1639k.f35779d.getValue()).setText(str);
        int color = Color.parseColor("#DFE0E1");
        boolean z8 = billProcessTitleData2.checked;
        Context context = this.f4984a;
        if (z8) {
            ((View) tVar2.getValue()).setBackgroundColor(context.getResources().getColor(b.ppColorPrimary));
        } else {
            ((View) tVar2.getValue()).setBackgroundColor(color);
        }
        if (billProcessTitleData1 != null) {
            if (billProcessTitleData1.checked) {
                ((View) tVar.getValue()).setBackgroundColor(context.getResources().getColor(b.ppColorPrimary));
            } else {
                ((View) tVar.getValue()).setBackgroundColor(color);
            }
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int i7) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        View viewInflate = LayoutInflater.from(this.f4984a).inflate(g.core_item_bill_data_process1, parent, false);
        Intrinsics.e(viewInflate);
        return new C1639k(this, viewInflate);
    }
}
