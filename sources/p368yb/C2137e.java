package p368yb;

import C0.G;
import Kb.h;
import Pa.r0;
import Ya.e;
import Ya.f;
import Ya.g;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.transsnet.palmpay.credit.bean.resp.OcIncreaseData;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: yb.e, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C2137e extends h {
    @Override // Kb.h
    public final RecyclerView.ViewHolder a(ViewGroup parent) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        View viewInflate = LayoutInflater.from(this.f4991a).inflate(f.cs_oc_increase_record_item, parent, false);
        Intrinsics.e(viewInflate);
        return new C2136d(viewInflate);
    }

    @Override // Kb.h
    public final RecyclerView.ViewHolder b(ViewGroup parent) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        Context context = this.f4991a;
        View itemView = LayoutInflater.from(context).inflate(f.cs_oc_bill_history_empty, parent, false);
        View viewFindViewById = itemView.findViewById(e.oc_empty_tips_tv);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById, "findViewById(...)");
        ((TextView) viewFindViewById).setText(context.getString(g.cs_oc_common_no_data_txt));
        Intrinsics.checkNotNullParameter(itemView, "itemView");
        return new Kb.g(itemView);
    }

    @Override // Kb.h
    public final void c(RecyclerView.ViewHolder holder, int i7) {
        String strA;
        Intrinsics.checkNotNullParameter(holder, "holder");
        OcIncreaseData ocIncreaseData = (OcIncreaseData) this.f4992b.get(i7);
        C2136d c2136d = (C2136d) holder;
        c2136d.f44226a.setText(ocIncreaseData.getDesc());
        TextView textView = c2136d.f44227b;
        Long createTime = ocIncreaseData.getCreateTime();
        textView.setText(r0.X1(Long.valueOf(createTime != null ? createTime.longValue() : 0L), "HH:mm, MMM dd, yyyy"));
        TextView textView2 = c2136d.f44228c;
        Long changeQuota = ocIncreaseData.getChangeQuota();
        if ((changeQuota != null ? changeQuota.longValue() : 0L) > 0) {
            Long changeQuota2 = ocIncreaseData.getChangeQuota();
            strA = G.o("+", r0.A(changeQuota2 != null ? changeQuota2.longValue() : 0L));
        } else {
            Long changeQuota3 = ocIncreaseData.getChangeQuota();
            strA = r0.A(changeQuota3 != null ? changeQuota3.longValue() : 0L);
        }
        textView2.setText(strA);
    }
}
