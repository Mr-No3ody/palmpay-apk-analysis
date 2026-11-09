package Wd;

import com.transsnet.palmpay.teller.bean.WAECOperatorBean;
import com.transsnet.palmpay.teller.ui.activity.WaecHomeActivity;
import com.transsnet.palmpay.teller.ui.dialog.PickMobileNetWorkDialog;

/* JADX INFO: loaded from: classes4.dex */
public final class Z implements PickMobileNetWorkDialog.CallBack21 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ WaecHomeActivity f10746a;

    public Z(WaecHomeActivity waecHomeActivity) {
        this.f10746a = waecHomeActivity;
    }

    @Override // com.transsnet.palmpay.teller.ui.dialog.PickMobileNetWorkDialog.CallBack21
    public final void onNetworkItemClick(WAECOperatorBean wAECOperatorBean) {
        int i7 = WaecHomeActivity.f34237Q;
        WaecHomeActivity waecHomeActivity = this.f10746a;
        waecHomeActivity.f34243M = wAECOperatorBean;
        Rd.D d2 = (Rd.D) waecHomeActivity.f27334c;
        if (d2 != null) {
            d2.f8017e.h(wAECOperatorBean != null ? wAECOperatorBean.getName() : null);
        }
        waecHomeActivity.x();
    }
}
