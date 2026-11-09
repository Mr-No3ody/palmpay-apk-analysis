package Ce;

import android.view.View;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import com.transsnet.palmpay.core.base.BaseApplication;
import com.transsnet.palmpay.core.callback.Argument2Callback;
import com.transsnet.palmpay.custom_view.swipe.VerticalSwipeRefreshLayout;
import com.transsnet.palmpay.ui.activity.PalmZoneRewardsActivity;
import com.transsnet.palmpay.ui.fragment.HomePalmZoneTabV2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class N implements SwipeRefreshLayout.OnRefreshListener, Argument2Callback {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ HomePalmZoneTabV2 f1439a;

    public /* synthetic */ N(HomePalmZoneTabV2 homePalmZoneTabV2) {
        this.f1439a = homePalmZoneTabV2;
    }

    @Override // com.transsnet.palmpay.core.callback.Argument2Callback
    public void invoke(Object obj, Object obj2) {
        int iIntValue = ((Integer) obj2).intValue();
        int i7 = HomePalmZoneTabV2.f35134Z;
        Intrinsics.checkNotNullParameter((View) obj, "<unused var>");
        if (iIntValue == 0) {
            Pa.i0.b0("/h5/reward/rules");
            return;
        }
        if (iIntValue != 2) {
            return;
        }
        if (!BaseApplication.hasLogin()) {
            Pa.i0.K(null, null);
            return;
        }
        androidx.fragment.app.E activity = this.f1439a.getActivity();
        if (activity != null) {
            PalmZoneRewardsActivity.f34524a.launch(activity);
        }
        Pa.n0.g().m("HomePalmZoneTabV2_element_click", "Rewards", "");
    }

    @Override // androidx.swiperefreshlayout.widget.SwipeRefreshLayout.OnRefreshListener
    public void onRefresh() {
        VerticalSwipeRefreshLayout verticalSwipeRefreshLayout;
        int i7 = HomePalmZoneTabV2.f35134Z;
        HomePalmZoneTabV2 homePalmZoneTabV2 = this.f1439a;
        homePalmZoneTabV2.y();
        Bc.i iVar = homePalmZoneTabV2.f35139L;
        if (iVar == null || (verticalSwipeRefreshLayout = (VerticalSwipeRefreshLayout) iVar.f728f) == null) {
            return;
        }
        verticalSwipeRefreshLayout.setRefreshing(false);
    }
}
