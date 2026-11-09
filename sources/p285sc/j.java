package p285sc;

import com.transsnet.palmpay.core.ui.widget.CustomFloatingView;
import com.transsnet.palmpay.jara_packet.ui.activity.ReferEarnHomePageActivity;

/* JADX INFO: loaded from: classes4.dex */
public final class j implements CustomFloatingView.Callback15 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ReferEarnHomePageActivity f42221a;

    public j(ReferEarnHomePageActivity referEarnHomePageActivity) {
        this.f42221a = referEarnHomePageActivity;
    }

    @Override // com.transsnet.palmpay.core.ui.widget.CustomFloatingView.Callback15
    public final void onCountDownFinish() {
        this.f42221a.f31898t0 = "";
    }
}
