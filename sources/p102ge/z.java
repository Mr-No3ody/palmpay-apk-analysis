package p102ge;

import com.transsnet.palmpay.core.ui.widget.CustomFloatingView;
import com.transsnet.palmpay.ui.activity.LifeBillsHomeActivity;

/* JADX INFO: loaded from: classes4.dex */
public final class z implements CustomFloatingView.Callback15 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ LifeBillsHomeActivity f37241a;

    public z(LifeBillsHomeActivity lifeBillsHomeActivity) {
        this.f37241a = lifeBillsHomeActivity;
    }

    @Override // com.transsnet.palmpay.core.ui.widget.CustomFloatingView.Callback15
    public final void onCountDownFinish() {
        this.f37241a.f34493p = "";
    }
}
