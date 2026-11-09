package Ce;

import com.transsnet.palmpay.core.ui.widget.DragView;
import com.transsnet.palmpay.custom_view.swipe.VerticalSwipeRefreshLayout;
import com.transsnet.palmpay.ui.fragment.HomeFragmentHomeTab;

/* JADX INFO: loaded from: classes4.dex */
public final class I implements DragView.Callback {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ HomeFragmentHomeTab f1428a;

    public I(HomeFragmentHomeTab homeFragmentHomeTab) {
        this.f1428a = homeFragmentHomeTab;
    }

    @Override // com.transsnet.palmpay.core.ui.widget.DragView.Callback
    public final void onDragOver() {
        int i7 = HomeFragmentHomeTab.f35093A0;
        VerticalSwipeRefreshLayout verticalSwipeRefreshLayoutY = this.f1428a.y();
        if (verticalSwipeRefreshLayoutY != null) {
            verticalSwipeRefreshLayoutY.setEnabled(true);
        }
    }

    @Override // com.transsnet.palmpay.core.ui.widget.DragView.Callback
    public final void touchDown() {
        int i7 = HomeFragmentHomeTab.f35093A0;
        VerticalSwipeRefreshLayout verticalSwipeRefreshLayoutY = this.f1428a.y();
        if (verticalSwipeRefreshLayoutY != null) {
            verticalSwipeRefreshLayoutY.setEnabled(false);
        }
    }
}
