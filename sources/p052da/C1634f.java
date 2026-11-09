package p052da;

import C0.G;
import F6.d;
import Kb.c;
import L6.b;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.transsnet.palmpay.core.bean.BankCardInfo;
import com.transsnet.palmpay.core.viewmodel.PayMethodItemV3;
import com.transsnet.palmpay.custom_view.r;
import java.util.List;
import p025ba.k;

/* JADX INFO: renamed from: da.f, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C1634f extends c {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final String f35767i = C1632d.class.getSimpleName();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f35768e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f35769f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f35770g;

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
        if (viewHolder instanceof C1633e) {
            C1633e c1633e = (C1633e) viewHolder;
            List list = this.f4985b;
            if (list != null && i7 < list.size()) {
                c1633e.f35764d.setBankCardInfo((BankCardInfo) this.f4985b.get(i7));
            }
            if (this.f35770g) {
                if (this.f35769f == i7) {
                    c1633e.f35764d.f28554j.setVisibility(0);
                } else {
                    c1633e.f35764d.f28554j.setVisibility(4);
                }
            }
            if (i7 == this.f4985b.size()) {
                if (this.f35768e) {
                    c1633e.f35764d.f28554j.setVisibility(0);
                } else {
                    c1633e.f35764d.f28554j.setVisibility(4);
                }
            }
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i7) {
        if (i7 == 17) {
            return new C1633e(this, new PayMethodItemV3(viewGroup.getContext()));
        }
        if (i7 != 18) {
            d.h(f35767i, 3, G.m(i7, "onCreateViewHolder: "));
            return new C1633e(this, new PayMethodItemV3(viewGroup.getContext()));
        }
        PayMethodItemV3 payMethodItemV3 = new PayMethodItemV3(viewGroup.getContext());
        payMethodItemV3.f28548c.setImageResource(r.cv_add_bank_account);
        payMethodItemV3.f28549d.setText(k.core_use_new_account);
        payMethodItemV3.f28549d.setTextColor(this.f4984a.getResources().getColor(b.ppColorPrimary));
        payMethodItemV3.f28550e.setText("");
        return new C1633e(this, payMethodItemV3);
    }
}
