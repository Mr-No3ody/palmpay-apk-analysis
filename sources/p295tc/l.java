package p295tc;

import C0.G;
import Pa.r0;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.transsnet.palmpay.core.base.BaseApplication;
import com.transsnet.palmpay.custom_view.p;
import com.transsnet.palmpay.jara_packet.bean.resp.ReferEarnRewardsResp;
import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;
import p236pc.b;
import p236pc.e;

/* JADX INFO: loaded from: classes4.dex */
public final class l extends RecyclerView.Adapter {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Context f42577a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public ArrayList f42578b;

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final int getItemCount() {
        return this.f42578b.size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i7) {
        k holder = (k) viewHolder;
        Intrinsics.checkNotNullParameter(holder, "holder");
        TextView textView = holder.f42573a;
        Context context = this.f42577a;
        textView.setTextColor(context.getResources().getColor(p.cv_text_color_white));
        int color = context.getResources().getColor(p.cv_text_color_white);
        TextView textView2 = holder.f42574b;
        textView2.setTextColor(color);
        int color2 = context.getResources().getColor(b.jp_history_succ);
        TextView textView3 = holder.f42575c;
        textView3.setTextColor(color2);
        holder.f42576d.setVisibility(8);
        ReferEarnRewardsResp referEarnRewardsResp = (ReferEarnRewardsResp) this.f42578b.get(i7);
        holder.f42573a.setText(referEarnRewardsResp.typeName);
        textView2.setText(r0.R(referEarnRewardsResp.createTime));
        G.y("+ ", BaseApplication.getCurrencySymbol(), r0.n0(referEarnRewardsResp.amount), textView3);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int i7) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        View viewInflate = LayoutInflater.from(this.f42577a).inflate(e.jp_item_cs_history, parent, false);
        Intrinsics.checkNotNullExpressionValue(viewInflate, "inflate(...)");
        return new k(viewInflate);
    }
}
