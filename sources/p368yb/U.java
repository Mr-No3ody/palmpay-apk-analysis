package p368yb;

import C0.G;
import Kb.c;
import L6.b;
import Pa.r0;
import Ya.f;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.transsnet.palmpay.credit.bean.resp.OcWithdrawListData;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class U extends c {
    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final void onBindViewHolder(RecyclerView.ViewHolder holder, int i7) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        T t = (T) holder;
        t.f44206g.setVisibility(8);
        t.f44207i.setVisibility(8);
        t.f44205f.setVisibility(8);
        OcWithdrawListData ocWithdrawListData = (OcWithdrawListData) this.f4985b.get(i7);
        t.f44204e.setText(r0.R(ocWithdrawListData.getUpdateTime()));
        TextView textView = t.f44205f;
        Context context = this.f4984a;
        textView.setTextColor(context.getResources().getColor(b.ppColorSuccess));
        G.x("+ ", r0.n0(ocWithdrawListData.getAmount()), t.f44205f);
        t.f44203d.setTextColor(context.getResources().getColor(b.ppColorTextBase));
        t.f44204e.setTextColor(context.getResources().getColor(b.ppColorTextBase));
        int withdrawStatus = ocWithdrawListData.getWithdrawStatus();
        if (withdrawStatus == 0) {
            t.f44207i.setVisibility(0);
            return;
        }
        if (withdrawStatus == 1) {
            t.f44205f.setVisibility(0);
            return;
        }
        t.f44205f.setVisibility(0);
        t.f44206g.setVisibility(0);
        t.f44205f.setTextColor(context.getResources().getColor(b.ppColorError));
        t.f44203d.setTextColor(context.getResources().getColor(b.ppColorError));
        t.f44204e.setTextColor(context.getResources().getColor(b.ppColorError));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int i7) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        View viewInflate = LayoutInflater.from(this.f4984a).inflate(f.cs_item_re_history, parent, false);
        Intrinsics.checkNotNullExpressionValue(viewInflate, "inflate(...)");
        return new T(this, viewInflate);
    }
}
