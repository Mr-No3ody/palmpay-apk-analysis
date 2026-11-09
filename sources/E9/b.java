package E9;

import Pa.r0;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.transsnet.palmpay.core.base.BaseApplication;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class b extends Kb.h {
    @Override // Kb.h
    public final RecyclerView.ViewHolder a(ViewGroup parent) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        View viewInflate = LayoutInflater.from(this.f4991a).inflate(p366y9.c.cash_in_recharge_amount_item, parent, false);
        Intrinsics.e(viewInflate);
        return new a(viewInflate);
    }

    @Override // Kb.h
    public final void c(RecyclerView.ViewHolder holder, int i7) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        ((a) holder).f2257a.setText(BaseApplication.getCurrencySymbol() + r0.n0(((Number) this.f4992b.get(i7)).longValue()));
    }
}
