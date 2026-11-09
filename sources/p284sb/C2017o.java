package p284sb;

import Db.u;
import Db.v;
import M1.j;
import android.view.View;
import com.chad.library.adapter.base.listener.OnItemClickListener;
import com.chad.library.adapter.base.listener.OnLoadMoreListener;
import com.transsnet.palmpay.core.bean.req.ParseInstalmentsQrcodeReq;
import com.transsnet.palmpay.core.bean.rsp.GetRecentMerchantsResp;
import com.transsnet.palmpay.credit.ui.activity.PastShopListActivity;
import com.transsnet.palmpay.credit.ui.viewmodel.PastShopViewModel;
import kotlin.jvm.internal.Intrinsics;
import p140j8.f;

/* JADX INFO: renamed from: sb.o, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class C2017o implements OnItemClickListener, OnLoadMoreListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ PastShopListActivity f42175a;

    public /* synthetic */ C2017o(PastShopListActivity pastShopListActivity) {
        this.f42175a = pastShopListActivity;
    }

    @Override // com.chad.library.adapter.base.listener.OnItemClickListener
    public void onItemClick(j jVar, View view, int i7) {
        int i10 = PastShopListActivity.f28701j;
        Intrinsics.checkNotNullParameter(jVar, "<unused var>");
        Intrinsics.checkNotNullParameter(view, "<unused var>");
        PastShopListActivity pastShopListActivity = this.f42175a;
        String snNo = ((GetRecentMerchantsResp.ListDataBean) pastShopListActivity.n().getData().get(i7)).snNo;
        Intrinsics.checkNotNullExpressionValue(snNo, "snNo");
        ParseInstalmentsQrcodeReq req = new ParseInstalmentsQrcodeReq("", snNo);
        PastShopViewModel pastShopViewModel = (PastShopViewModel) pastShopListActivity.l();
        pastShopViewModel.getClass();
        Intrinsics.checkNotNullParameter(req, "req");
        f.v(pastShopViewModel, new v(req, null), pastShopViewModel.f30695e, 0L);
    }

    @Override // com.chad.library.adapter.base.listener.OnLoadMoreListener
    public void onLoadMore() {
        int i7 = PastShopListActivity.f28701j;
        PastShopListActivity pastShopListActivity = this.f42175a;
        PastShopViewModel pastShopViewModel = (PastShopViewModel) pastShopListActivity.l();
        int i10 = pastShopListActivity.f28703g + 1;
        pastShopListActivity.f28703g = i10;
        pastShopViewModel.getClass();
        f.s(pastShopViewModel, new u(i10, null), pastShopViewModel.f30696f, (28 & 4) != 0 ? 0L : 300L, (28 & 8) != 0, (28 & 16) == 0);
    }
}
