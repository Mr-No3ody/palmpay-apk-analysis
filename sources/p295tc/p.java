package p295tc;

import C0.G;
import Kb.c;
import N8.q0;
import Pa.r0;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.transsnet.palmpay.core.base.BaseApplication;
import com.transsnet.palmpay.jara_packet.bean.resp.ReferEarnWithDraw;
import kotlin.jvm.internal.Intrinsics;
import p025ba.k;
import p236pc.b;
import p236pc.e;
import p236pc.f;

/* JADX INFO: loaded from: classes4.dex */
public final class p extends c {
    @Override // Kb.c, androidx.recyclerview.widget.RecyclerView.Adapter
    public final int getItemCount() {
        return this.f4985b.size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final void onBindViewHolder(RecyclerView.ViewHolder holder, int i7) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        o oVar = (o) holder;
        oVar.f42588i.setVisibility(8);
        oVar.f42586f.setVisibility(8);
        oVar.f42587g.setVisibility(8);
        oVar.f42589j.setVisibility(8);
        int i10 = ((ReferEarnWithDraw) this.f4985b.get(i7)).status;
        Context context = this.f4984a;
        if (i10 == 2) {
            oVar.f42584d.setTextColor(context.getColor(b.jp_history_failed));
            oVar.f42585e.setTextColor(context.getColor(b.jp_history_processing));
            oVar.f42587g.setTextColor(context.getColor(b.jp_history_failed));
            oVar.f42587g.setVisibility(0);
            oVar.f42589j.setVisibility(0);
            oVar.f42587g.setText(context.getString(k.core_failed));
        } else if (((ReferEarnWithDraw) this.f4985b.get(i7)).status == 3 || ((ReferEarnWithDraw) this.f4985b.get(i7)).status == 4 || ((ReferEarnWithDraw) this.f4985b.get(i7)).status == 5) {
            oVar.f42584d.setTextColor(context.getColor(L6.b.ppColorWarning));
            oVar.f42585e.setTextColor(context.getColor(b.jp_history_processing));
            oVar.f42587g.setTextColor(context.getColor(L6.b.ppColorWarning));
            oVar.f42587g.setVisibility(0);
            oVar.f42587g.setText(context.getString(k.core_processing));
            oVar.f42588i.setVisibility(0);
            oVar.f42588i.setBackground(context.getDrawable(p236pc.c.jp_resolve_btn_r6_bg));
            oVar.f42588i.setText(context.getString(f.jp_resolve));
            oVar.f42588i.setTextColor(context.getColor(L6.b.ppColorTextPrimary));
        } else if (((ReferEarnWithDraw) this.f4985b.get(i7)).status == 0) {
            oVar.f42584d.setTextColor(context.getColor(b.jp_history_processing));
            oVar.f42585e.setTextColor(context.getColor(b.jp_history_processing));
            oVar.f42587g.setTextColor(context.getColor(b.jp_history_processing));
            oVar.f42587g.setVisibility(0);
            oVar.f42587g.setText(context.getString(f.jp_waiting2));
            oVar.f42588i.setVisibility(0);
            oVar.f42588i.setBackground(context.getDrawable(p236pc.c.jp_withdraw_btn_r6_bg));
            oVar.f42588i.setText(context.getString(f.jp_withdraw));
            oVar.f42588i.setTextColor(context.getColor(L6.b.ppColorTextBase));
        } else if (((ReferEarnWithDraw) this.f4985b.get(i7)).commentEnable) {
            oVar.f42584d.setTextColor(context.getColor(com.transsnet.palmpay.custom_view.p.cv_text_color_white));
            oVar.f42585e.setTextColor(context.getColor(b.jp_history_processing));
            oVar.f42586f.setTextColor(context.getColor(b.jp_history_succ));
            oVar.f42586f.setVisibility(0);
            oVar.f42588i.setVisibility(0);
            oVar.f42588i.setBackground(context.getDrawable(p236pc.c.jp_share_btn_r6_bg));
            oVar.f42588i.setText(context.getString(f.jp_share_earn));
            oVar.f42588i.setTextColor(context.getColor(L6.b.ppColorTextBase));
        } else {
            oVar.f42584d.setTextColor(context.getColor(com.transsnet.palmpay.custom_view.p.cv_text_color_white));
            oVar.f42585e.setTextColor(context.getColor(com.transsnet.palmpay.custom_view.p.cv_text_color_white));
            oVar.f42586f.setTextColor(context.getColor(b.jp_history_succ));
            oVar.f42586f.setVisibility(0);
        }
        ReferEarnWithDraw referEarnWithDraw = (ReferEarnWithDraw) this.f4985b.get(i7);
        oVar.f42584d.setText(context.getResources().getString(f.jp_refer_earn_s, q0.j(BaseApplication.getCurrencySymbol(), r0.n0(referEarnWithDraw.amount))));
        oVar.f42585e.setText(r0.R(referEarnWithDraw.updateTime));
        G.y("+ ", BaseApplication.getCurrencySymbol(), r0.n0(referEarnWithDraw.amount), oVar.f42586f);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int i7) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        View viewInflate = LayoutInflater.from(this.f4984a).inflate(e.jp_item_cs_history, parent, false);
        Intrinsics.checkNotNullExpressionValue(viewInflate, "inflate(...)");
        return new o(this, viewInflate);
    }
}
