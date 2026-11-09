package p271re;

import com.alibaba.android.arouter.launcher.ARouter;
import com.transsnet.palmpay.core.callback.CompleteCallback;
import com.transsnet.palmpay.ui.activity.qr.QrcodePayMoneyOrderDetailActivity;
import java.io.File;

/* JADX INFO: loaded from: classes4.dex */
public final class l implements CompleteCallback {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ QrcodePayMoneyOrderDetailActivity f41801a;

    public l(QrcodePayMoneyOrderDetailActivity qrcodePayMoneyOrderDetailActivity) {
        this.f41801a = qrcodePayMoneyOrderDetailActivity;
    }

    @Override // com.transsnet.palmpay.core.callback.CompleteCallback
    public final void onComplete(Object[] objArr) {
        this.f41801a.f34908b.t.setVisibility(0);
        ARouter.getInstance().build("/coreImpl/receipt_share_page").withSerializable("extra_data", ((File[]) objArr)[0]).navigation();
    }
}
