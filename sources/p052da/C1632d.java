package p052da;

import C0.G;
import F6.d;
import Kb.c;
import L6.b;
import S6.a;
import android.content.Context;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.recyclerview.widget.RecyclerView;
import com.transsnet.palmpay.core.bean.BankCardInfo;
import com.transsnet.palmpay.core.viewmodel.PayMethodItem;
import java.util.List;
import p025ba.k;

/* JADX INFO: renamed from: da.d, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C1632d extends c {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f35759e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f35760f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f35761g;

    @Override // Kb.c, androidx.recyclerview.widget.RecyclerView.Adapter
    public final int getItemCount() {
        return super.getItemCount() + 1;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final int getItemViewType(int i7) {
        List list = this.f4985b;
        return (list == null || list.isEmpty() || i7 == this.f4985b.size()) ? 18 : 17;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i7) {
        if (viewHolder instanceof C1631c) {
            C1631c c1631c = (C1631c) viewHolder;
            List list = this.f4985b;
            if (list != null && i7 < list.size()) {
                c1631c.f35758d.setBankCardInfo((BankCardInfo) this.f4985b.get(i7));
            }
            if (this.f35761g) {
                if (this.f35760f == i7) {
                    c1631c.f35758d.f28534j.setVisibility(0);
                } else {
                    c1631c.f35758d.f28534j.setVisibility(4);
                }
            }
            if (i7 == this.f4985b.size()) {
                if (this.f35759e) {
                    c1631c.f35758d.f28534j.setVisibility(0);
                } else {
                    c1631c.f35758d.f28534j.setVisibility(4);
                }
            }
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i7) {
        if (i7 == 17) {
            return new C1631c(this, new PayMethodItem(viewGroup.getContext()));
        }
        if (i7 != 18) {
            d.h("BankCardListAdapter", 3, G.m(i7, "onCreateViewHolder: "));
            return new C1631c(this, new PayMethodItem(viewGroup.getContext()));
        }
        PayMethodItem payMethodItem = new PayMethodItem(viewGroup.getContext());
        ImageView imageView = payMethodItem.f28528c;
        a aVar = a.pay_AddOutline;
        int i10 = b.ppColorPrimary;
        Context context = this.f4984a;
        imageView.setImageDrawable(p059e1.a.h(context, aVar, null, context.getColor(i10), 24.0f));
        payMethodItem.f28529d.setText(k.core_use_new_bank_account);
        payMethodItem.f28529d.setTextColor(context.getResources().getColor(b.ppColorPrimary));
        payMethodItem.f28530e.setText("");
        return new C1631c(this, payMethodItem);
    }
}
