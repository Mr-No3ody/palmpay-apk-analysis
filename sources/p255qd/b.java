package p255qd;

import com.facebook.react.modules.toast.ToastModule;
import com.transsnet.palmpay.core.base.IBaseView;
import com.transsnet.palmpay.core.bean.bill.BillRsp;
import com.transsnet.palmpay.send_money.ui.fragment.MoneyTransferHistoryFragment;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class b implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f41476a = 1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f41477b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f41478c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f41479d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f41480e;

    public /* synthetic */ b(ToastModule toastModule, String str, int i7, int i10) {
        this.f41479d = toastModule;
        this.f41480e = str;
        this.f41477b = i7;
        this.f41478c = i10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f41476a) {
            case 0:
                IBaseView iBaseView = ((f) this.f41479d).f27351a;
                if (iBaseView != null) {
                    ((MoneyTransferHistoryFragment) iBaseView).A(this.f41477b, this.f41478c, (BillRsp.DataBean.ExtDataBean) this.f41480e);
                }
                break;
            default:
                ToastModule.showWithGravity$lambda$1((ToastModule) this.f41479d, (String) this.f41480e, this.f41477b, this.f41478c);
                break;
        }
    }

    public /* synthetic */ b(f fVar, int i7, int i10, BillRsp.DataBean.ExtDataBean extDataBean) {
        this.f41479d = fVar;
        this.f41477b = i7;
        this.f41478c = i10;
        this.f41480e = extDataBean;
    }
}
