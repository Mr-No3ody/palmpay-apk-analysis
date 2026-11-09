package Ce;

import com.transsnet.palmpay.core.ui.widget.DragView;
import com.transsnet.palmpay.custom_view.swipe.VerticalSwipeRefreshLayout;
import com.transsnet.palmpay.ui.fragment.HomePalmZoneTabV2;

/* JADX INFO: loaded from: classes4.dex */
public final class U implements DragView.Callback {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ HomePalmZoneTabV2 f1453a;

    public U(HomePalmZoneTabV2 homePalmZoneTabV2) {
        this.f1453a = homePalmZoneTabV2;
    }

    @Override // com.transsnet.palmpay.core.ui.widget.DragView.Callback
    public final void onDragOver() {
        VerticalSwipeRefreshLayout verticalSwipeRefreshLayout;
        Bc.i iVar = this.f1453a.f35139L;
        if (iVar == null || (verticalSwipeRefreshLayout = (VerticalSwipeRefreshLayout) iVar.f728f) == null) {
            return;
        }
        verticalSwipeRefreshLayout.setEnabled(true);
    }

    @Override // com.transsnet.palmpay.core.ui.widget.DragView.Callback
    public final void touchDown() {
        VerticalSwipeRefreshLayout verticalSwipeRefreshLayout;
        Bc.i iVar = this.f1453a.f35139L;
        if (iVar == null || (verticalSwipeRefreshLayout = (VerticalSwipeRefreshLayout) iVar.f728f) == null) {
            return;
        }
        verticalSwipeRefreshLayout.setEnabled(false);
    }
}
