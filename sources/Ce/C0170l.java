package Ce;

import com.alibaba.android.arouter.launcher.ARouter;
import com.transsnet.palmpay.core.callback.CompleteCallback;
import com.transsnet.palmpay.send_money.ui.activity.TransReceiptActivity;
import com.transsnet.palmpay.send_money.ui.activity.pay_me.PayMeMerchantActivity;
import com.transsnet.palmpay.util.AppUtils;
import com.transsnet.palmpay.util.SPUtils;
import com.transsnet.palmpay.util.ToastUtils;
import java.io.File;

/* JADX INFO: renamed from: Ce.l, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class C0170l implements CompleteCallback {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1498a;

    public /* synthetic */ C0170l(int i7) {
        this.f1498a = i7;
    }

    @Override // com.transsnet.palmpay.core.callback.CompleteCallback
    public final void onComplete(Object[] objArr) {
        switch (this.f1498a) {
            case 0:
                Boolean bool = ((Boolean[]) objArr)[0];
                if (bool != null) {
                    if (!bool.booleanValue()) {
                        AppUtils.exitApp();
                    } else {
                        SPUtils.get().put("key_pre_install_build_privacy_dialog_show", false);
                    }
                }
                break;
            case 1:
                ARouter.getInstance().build("/coreImpl/receipt_share_page").withSerializable("extra_data", ((File[]) objArr)[0]).navigation();
                break;
            case 2:
                TransReceiptActivity.a aVar = TransReceiptActivity.f33225A;
                if (((File[]) objArr)[0] != null) {
                    ToastUtils.showLong(p159kd.h.sm_save_successfully);
                }
                break;
            default:
                int i7 = PayMeMerchantActivity.f33315j;
                break;
        }
    }
}
