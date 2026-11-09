package p382zb;

import Z4.e;
import com.transsnet.palmpay.credit.ui.fragment.OcHomeMobileInstalmentTabFragment;
import io.reactivex.disposables.Disposable;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class W extends e {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ OcHomeMobileInstalmentTabFragment f44554f;

    public W(OcHomeMobileInstalmentTabFragment ocHomeMobileInstalmentTabFragment) {
        this.f44554f = ocHomeMobileInstalmentTabFragment;
    }

    @Override // io.reactivex.Observer
    public final void onSubscribe(Disposable d2) {
        Intrinsics.checkNotNullParameter(d2, "d");
        this.f44554f.f(d2);
    }

    @Override // Z4.e
    public final void w(String message) {
        Intrinsics.checkNotNullParameter(message, "message");
    }

    @Override // Z4.e
    public final /* bridge */ /* synthetic */ void y(Object obj) {
    }
}
