package p295tc;

import C0.G;
import Kb.c;
import Pa.r0;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.transsnet.palmpay.core.base.BaseApplication;
import com.transsnet.palmpay.jara_packet.bean.resp.RankList;
import kotlin.jvm.internal.Intrinsics;
import p236pc.b;
import p236pc.e;

/* JADX INFO: loaded from: classes4.dex */
public final class h extends c {
    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final void onBindViewHolder(RecyclerView.ViewHolder holder, int i7) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        g gVar = (g) holder;
        Context context = this.f4984a;
        if (i7 == 0 || i7 == 1 || i7 == 2) {
            gVar.f42568g.setVisibility(0);
            gVar.f42565d.setVisibility(8);
            gVar.f42566e.setTextColor(context.getResources().getColor(b.jp_yellow));
            gVar.f42567f.setTextColor(context.getResources().getColor(b.jp_yellow));
        } else {
            gVar.f42568g.setVisibility(8);
            gVar.f42565d.setVisibility(0);
            gVar.f42566e.setTextColor(context.getResources().getColor(b.jp_history_processing));
            gVar.f42567f.setTextColor(context.getResources().getColor(b.jp_history_processing));
        }
        RankList rankList = (RankList) this.f4985b.get(i7);
        if (i7 == 0) {
            r0.d1(gVar.f42568g, p236pc.c.jp_rank_1);
        } else if (i7 == 1) {
            r0.d1(gVar.f42568g, p236pc.c.jp_rank_2);
        } else if (i7 == 2) {
            r0.d1(gVar.f42568g, p236pc.c.jp_rank_3);
        }
        gVar.f42565d.setText(String.valueOf(rankList.rank));
        gVar.f42566e.setText(String.valueOf(rankList.memberName));
        G.y("+", BaseApplication.getCurrencySymbol(), r0.n0(rankList.amount), gVar.f42567f);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int i7) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        View viewInflate = LayoutInflater.from(this.f4984a).inflate(e.jp_item_re_rank, parent, false);
        Intrinsics.checkNotNullExpressionValue(viewInflate, "inflate(...)");
        return new g(this, viewInflate);
    }
}
