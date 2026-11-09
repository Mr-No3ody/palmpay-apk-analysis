package p102ge;

import androidx.recyclerview.widget.RecyclerView;
import com.transsnet.palmpay.ui.activity.MerchantPaymentListActivity;

/* JADX INFO: loaded from: classes4.dex */
public final class E extends RecyclerView.AdapterDataObserver {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ MerchantPaymentListActivity f37182a;

    public E(MerchantPaymentListActivity merchantPaymentListActivity) {
        this.f37182a = merchantPaymentListActivity;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AdapterDataObserver
    public final void onChanged() {
        super.onChanged();
        MerchantPaymentListActivity merchantPaymentListActivity = this.f37182a;
        merchantPaymentListActivity.f34498c.setVisibility(merchantPaymentListActivity.f34497b.getItemCount() > 0 ? 8 : 0);
    }
}
