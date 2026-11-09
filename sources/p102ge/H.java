package p102ge;

import Ac.h;
import Fe.Q;
import com.transsnet.palmpay.custom_view.SwipeRecyclerView;
import com.transsnet.palmpay.ui.activity.PalmPayStatementActivity;

/* JADX INFO: loaded from: classes4.dex */
public final class H implements SwipeRecyclerView.OnLoadListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ PalmPayStatementActivity f37188a;

    public H(PalmPayStatementActivity palmPayStatementActivity) {
        this.f37188a = palmPayStatementActivity;
    }

    @Override // com.transsnet.palmpay.custom_view.SwipeRecyclerView.OnLoadListener
    public final void onLoadMore() {
        PalmPayStatementActivity palmPayStatementActivity = this.f37188a;
        int i7 = palmPayStatementActivity.f34507B;
        if (i7 >= palmPayStatementActivity.f34508C) {
            palmPayStatementActivity.t.c();
            palmPayStatementActivity.t.b(palmPayStatementActivity.getString(h.main_list_end));
        } else {
            palmPayStatementActivity.f34507B = i7 + 1;
            palmPayStatementActivity.t.a();
            ((Q) palmPayStatementActivity.f27350a).loadBillData(palmPayStatementActivity.f34510L, palmPayStatementActivity.f34509H, null, palmPayStatementActivity.f34507B, 15, palmPayStatementActivity.f34506A);
        }
    }

    @Override // com.transsnet.palmpay.custom_view.SwipeRecyclerView.OnLoadListener
    public final void onRefresh() {
        PalmPayStatementActivity palmPayStatementActivity = this.f37188a;
        palmPayStatementActivity.f34507B = 1;
        Q q10 = (Q) palmPayStatementActivity.f27350a;
        int i7 = palmPayStatementActivity.f34510L;
        int i10 = palmPayStatementActivity.f34509H;
        palmPayStatementActivity.getClass();
        q10.loadBillData(i7, i10, null, palmPayStatementActivity.f34507B, 15, palmPayStatementActivity.f34506A);
    }
}
