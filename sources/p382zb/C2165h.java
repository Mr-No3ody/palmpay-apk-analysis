package p382zb;

import Z4.e;
import androidx.camera.core.impl.utils.n;
import com.transsnet.palmpay.credit.bean.resp.QueryCreditIncreaseResp;
import com.transsnet.palmpay.credit.ui.fragment.CLMainFragment;
import io.reactivex.disposables.Disposable;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: zb.h, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C2165h extends e {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ CLMainFragment f44586f;

    public C2165h(CLMainFragment cLMainFragment) {
        this.f44586f = cLMainFragment;
    }

    @Override // io.reactivex.Observer
    public final void onSubscribe(Disposable d2) {
        Intrinsics.checkNotNullParameter(d2, "d");
        this.f44586f.f(d2);
    }

    @Override // Z4.e
    public final void w(String message) {
        Intrinsics.checkNotNullParameter(message, "message");
        n.u(message);
    }

    @Override // Z4.e
    public final void y(Object obj) {
        QueryCreditIncreaseResp queryCreditIncreaseResp = (QueryCreditIncreaseResp) obj;
        if (queryCreditIncreaseResp == null || !queryCreditIncreaseResp.isSuccess()) {
            n.u(queryCreditIncreaseResp != null ? queryCreditIncreaseResp.getRespMsg() : null);
            return;
        }
        QueryCreditIncreaseResp.QueryCreditIncreaseData data = queryCreditIncreaseResp.getData();
        if (data != null) {
            data.getResidueApplyNumber();
        }
    }
}
