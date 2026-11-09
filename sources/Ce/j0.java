package Ce;

import com.transsnet.palmpay.core.bean.req.CommonListReq;
import com.transsnet.palmpay.custom_view.SwipeRecyclerView;
import com.transsnet.palmpay.ui.fragment.PalmZoneTaskRewardsFragment;
import com.transsnet.palmpay.viewmodule.PalmZoneViewModel;

/* JADX INFO: loaded from: classes4.dex */
public final class j0 implements SwipeRecyclerView.OnLoadListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ PalmZoneTaskRewardsFragment f1493a;

    public j0(PalmZoneTaskRewardsFragment palmZoneTaskRewardsFragment) {
        this.f1493a = palmZoneTaskRewardsFragment;
    }

    @Override // com.transsnet.palmpay.custom_view.SwipeRecyclerView.OnLoadListener
    public final void onLoadMore() {
        PalmZoneTaskRewardsFragment.a aVar = PalmZoneTaskRewardsFragment.f35232v;
        PalmZoneTaskRewardsFragment palmZoneTaskRewardsFragment = this.f1493a;
        PalmZoneViewModel palmZoneViewModel = (PalmZoneViewModel) palmZoneTaskRewardsFragment.f27333i;
        if (palmZoneViewModel != null) {
            CommonListReq commonListReq = new CommonListReq();
            commonListReq.pageNum = palmZoneTaskRewardsFragment.t + 1;
            palmZoneViewModel.i(commonListReq);
        }
    }

    @Override // com.transsnet.palmpay.custom_view.SwipeRecyclerView.OnLoadListener
    public final void onRefresh() {
        PalmZoneTaskRewardsFragment.a aVar = PalmZoneTaskRewardsFragment.f35232v;
        PalmZoneViewModel palmZoneViewModel = (PalmZoneViewModel) this.f1493a.f27333i;
        if (palmZoneViewModel != null) {
            palmZoneViewModel.i(new CommonListReq());
        }
    }
}
