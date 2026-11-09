package t9;

import android.os.Bundle;
import androidx.fragment.app.Fragment;
import com.transsnet.palmpay.betting.ui.fragment.BettingHistoryFragment;
import com.transsnet.palmpay.core.bean.bill.TransType;

/* JADX INFO: loaded from: classes3.dex */
public final class e extends androidx.viewpager2.adapter.f {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f42360o;

    @Override // androidx.viewpager2.adapter.f
    public final Fragment c(int i7) {
        BettingHistoryFragment bettingHistoryFragment = new BettingHistoryFragment();
        Bundle bundle = new Bundle();
        bundle.putString("key_history_category_id", i7 == 0 ? "8" : TransType.TRANS_TYPE_MERCHANT_PAYMENT);
        bettingHistoryFragment.setArguments(bundle);
        return bettingHistoryFragment;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final int getItemCount() {
        return this.f42360o;
    }
}
