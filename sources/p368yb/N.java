package p368yb;

import C0.G;
import Kb.c;
import L6.b;
import Pa.r0;
import Ya.f;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.transsnet.palmpay.credit.bean.resp.OcRewardListData;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class N extends c {
    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final void onBindViewHolder(RecyclerView.ViewHolder holder, int i7) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        M m7 = (M) holder;
        OcRewardListData ocRewardListData = (OcRewardListData) this.f4985b.get(i7);
        m7.f44189e.setText(r0.R(ocRewardListData.getActiveTime()));
        m7.f44190f.setTextColor(this.f4984a.getResources().getColor(b.ppColorSuccess));
        G.x("+ ", r0.n0(ocRewardListData.getAmount()), m7.f44190f);
        m7.f44191g.setVisibility(8);
        m7.f44192i.setVisibility(8);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int i7) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        View viewInflate = LayoutInflater.from(this.f4984a).inflate(f.cs_item_re_history, parent, false);
        Intrinsics.checkNotNullExpressionValue(viewInflate, "inflate(...)");
        return new M(this, viewInflate);
    }
}
