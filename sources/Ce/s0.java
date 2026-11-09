package Ce;

import Bc.C0105b;
import android.widget.LinearLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.transsnet.palmpay.core.bean.bill.TransHistoryItemBean;
import com.transsnet.palmpay.ui.fragment.TransactionHistoryFragment;
import com.transsnet.palmpay.util.SizeUtils;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class s0 extends RecyclerView.OnScrollListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ TransactionHistoryFragment f1529a;

    public s0(TransactionHistoryFragment transactionHistoryFragment) {
        this.f1529a = transactionHistoryFragment;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.OnScrollListener
    public final void onScrolled(RecyclerView recyclerView, int i7, int i10) {
        TransHistoryItemBean transHistoryItemBean;
        Intrinsics.checkNotNullParameter(recyclerView, "recyclerView");
        super.onScrolled(recyclerView, i7, i10);
        int i11 = TransactionHistoryFragment.f35248k0;
        TransactionHistoryFragment transactionHistoryFragment = this.f1529a;
        if (transactionHistoryFragment.v().getData().isEmpty()) {
            return;
        }
        int i12 = transactionHistoryFragment.f35256X + i10;
        transactionHistoryFragment.f35256X = i12;
        if (i12 > SizeUtils.dp2px(20.0f)) {
            C0105b c0105b = transactionHistoryFragment.f35260p;
            if (c0105b != null) {
                ((LinearLayout) c0105b.f666f).setVisibility(0);
            }
        } else {
            C0105b c0105b2 = transactionHistoryFragment.f35260p;
            if (c0105b2 != null) {
                ((LinearLayout) c0105b2.f666f).setVisibility(com.transsnet.palmpay.core.config.d.s() ? 0 : 8);
            }
        }
        int iFindFirstVisibleItemPosition = ((LinearLayoutManager) transactionHistoryFragment.f35250B.getValue()).findFirstVisibleItemPosition();
        if (iFindFirstVisibleItemPosition == -1 || iFindFirstVisibleItemPosition >= transactionHistoryFragment.v().getData().size() || (transHistoryItemBean = (TransHistoryItemBean) transactionHistoryFragment.v().getItem(iFindFirstVisibleItemPosition)) == null) {
            return;
        }
        transactionHistoryFragment.B(transHistoryItemBean);
    }
}
