package p051d9;

import Z4.e;
import com.transsnet.palmpay.account.ui.mvp.contract.PalmPayLevelUpTier3Contract;
import com.transsnet.palmpay.core.bean.CommonListResultV2;
import com.transsnet.palmpay.util.ToastUtils;
import io.reactivex.disposables.Disposable;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: d9.y, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C1627y extends e {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ C1628z f35669f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ boolean f35670g;

    public C1627y(C1628z c1628z, boolean z3) {
        this.f35669f = c1628z;
        this.f35670g = z3;
    }

    @Override // io.reactivex.Observer
    public final void onSubscribe(Disposable d2) {
        Intrinsics.checkNotNullParameter(d2, "d");
        this.f35669f.addSubscription(d2);
    }

    @Override // Z4.e
    public final void w(String message) {
        Intrinsics.checkNotNullParameter(message, "message");
        PalmPayLevelUpTier3Contract.View view = (PalmPayLevelUpTier3Contract.View) this.f35669f.f27351a;
        if (view != null) {
            view.showLoadingView(false);
        }
        ToastUtils.showLong(message, new Object[0]);
    }

    @Override // Z4.e
    public final void y(Object obj) {
        CommonListResultV2 response = (CommonListResultV2) obj;
        Intrinsics.checkNotNullParameter(response, "response");
        C1628z c1628z = this.f35669f;
        PalmPayLevelUpTier3Contract.View view = (PalmPayLevelUpTier3Contract.View) c1628z.f27351a;
        if (view != null) {
            view.showLoadingView(false);
        }
        if (!response.isSuccess()) {
            ToastUtils.showLong(response.getRespMsg(), new Object[0]);
            return;
        }
        PalmPayLevelUpTier3Contract.View view2 = (PalmPayLevelUpTier3Contract.View) c1628z.f27351a;
        if (view2 != null) {
            view2.handleCountryRegionListData(this.f35670g, response.data);
        }
    }
}
