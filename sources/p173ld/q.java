package p173ld;

import F6.d;
import Kb.c;
import Pa.r0;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.recyclerview.widget.RecyclerView;
import com.transsnet.palmpay.core.bean.BankInfo;
import com.transsnet.palmpay.custom_view.r;
import java.util.List;
import p159kd.e;
import p159kd.f;

/* JADX INFO: loaded from: classes4.dex */
public final class q extends c {
    @Override // Kb.c
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public final BankInfo getItem(int i7) {
        try {
            return (BankInfo) this.f4985b.get(i7);
        } catch (Exception e10) {
            d.c("q", "getItem: ", e10);
            return null;
        }
    }

    @Override // Kb.c, androidx.recyclerview.widget.RecyclerView.Adapter
    public final int getItemCount() {
        List list = this.f4985b;
        if (list == null) {
            return 0;
        }
        return list.size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i7) {
        p pVar = (p) viewHolder;
        BankInfo item = getItem(i7);
        r0.j1((ImageView) pVar.getView(e.bank_logo), item.bankUrl, G1.d.O(r.cv_default_bank_logo));
        pVar.b(e.bank_name, item.bankName);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i7) {
        return new p(this, LayoutInflater.from(this.f4984a).inflate(f.sm_select_bank_list_item_layout_v2, viewGroup, false));
    }
}
