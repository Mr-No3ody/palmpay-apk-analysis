package Xc;

import com.transsnet.palmpay.p2pcash.ui.atm.view.P2PButton;
import com.transsnet.palmpay.util.SizeUtils;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class e implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f11121a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ P2PButton f11122b;

    public /* synthetic */ e(P2PButton p2PButton, int i7) {
        this.f11121a = i7;
        this.f11122b = p2PButton;
    }

    @Override // java.lang.Runnable
    public final void run() {
        P2PButton p2PButton = this.f11122b;
        switch (this.f11121a) {
            case 0:
                if (p2PButton.f32996e == 38) {
                    p2PButton.f32993b.getLayoutParams().height = SizeUtils.dp2px(38.0f);
                    p2PButton.f32993b.setRadius(SizeUtils.dp2px(10.0f));
                    p2PButton.f32994c.setTextSize(2, 14.0f);
                } else {
                    p2PButton.f32993b.getLayoutParams().height = SizeUtils.dp2px(48.0f);
                    p2PButton.f32993b.setRadius(SizeUtils.dp2px(12.0f));
                    p2PButton.f32994c.setTextSize(2, 16.0f);
                }
                break;
            default:
                int i7 = P2PButton.f32991o;
                p2PButton.getClass();
                try {
                    p2PButton.f32999i = false;
                } catch (Exception unused) {
                    return;
                }
                break;
        }
    }
}
