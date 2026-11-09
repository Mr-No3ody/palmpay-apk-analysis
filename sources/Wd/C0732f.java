package Wd;

import com.transsnet.palmpay.custom_view.SwipeRecyclerView;
import com.transsnet.palmpay.teller.ui.activity.BeneficiariesActivity;

/* JADX INFO: renamed from: Wd.f, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C0732f implements SwipeRecyclerView.OnLoadListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ BeneficiariesActivity f10757a;

    public C0732f(BeneficiariesActivity beneficiariesActivity) {
        this.f10757a = beneficiariesActivity;
    }

    @Override // com.transsnet.palmpay.custom_view.SwipeRecyclerView.OnLoadListener
    public final void onLoadMore() {
        BeneficiariesActivity beneficiariesActivity = this.f10757a;
        int i7 = beneficiariesActivity.f34155j;
        if (i7 < beneficiariesActivity.f34154i) {
            beneficiariesActivity.f34155j = i7 + 1;
            beneficiariesActivity.m();
            return;
        }
        SwipeRecyclerView swipeRecyclerView = beneficiariesActivity.f34149c;
        if (swipeRecyclerView != null) {
            swipeRecyclerView.c();
        }
        SwipeRecyclerView swipeRecyclerView2 = beneficiariesActivity.f34149c;
        if (swipeRecyclerView2 != null) {
            swipeRecyclerView2.b(beneficiariesActivity.getString(Pd.f.qt_no_more));
        }
    }

    @Override // com.transsnet.palmpay.custom_view.SwipeRecyclerView.OnLoadListener
    public final void onRefresh() {
        BeneficiariesActivity beneficiariesActivity = this.f10757a;
        beneficiariesActivity.f34155j = 1;
        beneficiariesActivity.m();
    }
}
