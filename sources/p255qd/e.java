package p255qd;

import com.transsnet.palmpay.core.base.IBaseView;
import com.transsnet.palmpay.core.bean.bill.BillRsp;
import com.transsnet.palmpay.send_money.ui.fragment.MoneyTransferHistoryFragment;
import io.reactivex.disposables.Disposable;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class e extends Z4.e {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ f f41485f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ String f41486g;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f41487i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final /* synthetic */ int f41488j;

    public e(f fVar, String str, int i7, int i10) {
        this.f41485f = fVar;
        this.f41486g = str;
        this.f41487i = i7;
        this.f41488j = i10;
    }

    @Override // io.reactivex.Observer
    public final void onSubscribe(Disposable d2) {
        Intrinsics.checkNotNullParameter(d2, "d");
        this.f41485f.addSubscription(d2);
    }

    @Override // Z4.e
    public final void w(String message) {
        Intrinsics.checkNotNullParameter(message, "message");
    }

    @Override // Z4.e
    public final void y(Object obj) {
        BillRsp billRsp = (BillRsp) obj;
        f fVar = this.f41485f;
        if (billRsp == null || !billRsp.isSuccess()) {
            return;
        }
        try {
            BillRsp.DataBean.ExtDataBean extData = billRsp.getData().getExtData();
            if (extData != null) {
                fVar.f41493g.put(this.f41486g, extData);
                IBaseView iBaseView = fVar.f27351a;
                if (iBaseView != null) {
                    ((MoneyTransferHistoryFragment) iBaseView).A(this.f41487i, this.f41488j, extData);
                    IBaseView iBaseView2 = fVar.f27351a;
                    Intrinsics.f(iBaseView2, "null cannot be cast to non-null type com.transsnet.palmpay.send_money.ui.fragment.MoneyTransferHistoryFragment");
                    ((MoneyTransferHistoryFragment) iBaseView2).updateTotalAmount(this.f41487i, this.f41488j, extData.getInComeAmount(), extData.getPayOutAmount(), this.f41486g);
                }
            }
        } catch (Exception e10) {
            e10.printStackTrace();
        }
    }
}
