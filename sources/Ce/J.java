package Ce;

import androidx.core.view.KeyEventDispatcher$Component;
import com.transsnet.adsdk.widgets.interfaces.AdShowCallback;
import com.transsnet.adsdk.widgets.snackbar.SnackBarRecycle;
import com.transsnet.palmpay.core.callback.HomeAcCallback;
import com.transsnet.palmpay.ui.fragment.HomeFragmentHomeTab;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class J implements AdShowCallback {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1429a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f1430b;

    public /* synthetic */ J(Object obj, int i7) {
        this.f1429a = i7;
        this.f1430b = obj;
    }

    @Override // com.transsnet.adsdk.widgets.interfaces.AdShowCallback
    public final void showSnackBarCallback(SnackBarRecycle snackbar) {
        switch (this.f1429a) {
            case 0:
                Intrinsics.checkNotNullParameter(snackbar, "snackbar");
                HomeFragmentHomeTab homeFragmentHomeTab = (HomeFragmentHomeTab) this.f1430b;
                if (homeFragmentHomeTab.getActivity() instanceof HomeAcCallback) {
                    KeyEventDispatcher$Component activity = homeFragmentHomeTab.getActivity();
                    Intrinsics.f(activity, "null cannot be cast to non-null type com.transsnet.palmpay.core.callback.HomeAcCallback");
                    ((HomeAcCallback) activity).showSnackBar(snackbar);
                }
                break;
            default:
                KeyEventDispatcher$Component keyEventDispatcher$Component = (androidx.fragment.app.E) this.f1430b;
                Intrinsics.f(keyEventDispatcher$Component, "null cannot be cast to non-null type com.transsnet.palmpay.core.callback.HomeAcCallback");
                ((HomeAcCallback) keyEventDispatcher$Component).showSnackBar(snackbar);
                break;
        }
    }
}
