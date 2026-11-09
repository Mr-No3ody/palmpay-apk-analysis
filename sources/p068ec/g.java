package p068ec;

import Rd.C0599o;
import com.transsnet.palmpay.databundle.ui.activity.BuyBundleHomePageActivity;
import kotlin.reflect.KProperty;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class g implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f36257a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ BuyBundleHomePageActivity f36258b;

    public /* synthetic */ g(BuyBundleHomePageActivity buyBundleHomePageActivity, int i7) {
        this.f36257a = i7;
        this.f36258b = buyBundleHomePageActivity;
    }

    @Override // java.lang.Runnable
    public final void run() {
        BuyBundleHomePageActivity buyBundleHomePageActivity = this.f36258b;
        switch (this.f36257a) {
            case 0:
                KProperty[] kPropertyArr = BuyBundleHomePageActivity.f31740t0;
                C0599o c0599o = (C0599o) buyBundleHomePageActivity.f27334c;
                if (c0599o != null) {
                    c0599o.t.p(0);
                }
                break;
            default:
                KProperty[] kPropertyArr2 = BuyBundleHomePageActivity.f31740t0;
                C0599o c0599o2 = (C0599o) buyBundleHomePageActivity.f27334c;
                if (c0599o2 != null) {
                    c0599o2.t.p(c0599o2.f8430e.getTop());
                }
                break;
        }
    }
}
