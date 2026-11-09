package Wd;

import com.transsnet.palmpay.teller.bean.WAECOperatorBean;
import com.transsnet.palmpay.teller.ui.activity.JambHomeActivity;
import com.transsnet.palmpay.teller.ui.dialog.PickMobileNetWorkDialog;

/* JADX INFO: loaded from: classes4.dex */
public final class Q implements PickMobileNetWorkDialog.CallBack21 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ JambHomeActivity f10732a;

    public Q(JambHomeActivity jambHomeActivity) {
        this.f10732a = jambHomeActivity;
    }

    @Override // com.transsnet.palmpay.teller.ui.dialog.PickMobileNetWorkDialog.CallBack21
    public final void onNetworkItemClick(WAECOperatorBean wAECOperatorBean) {
        int i7 = JambHomeActivity.f34222B;
        this.f10732a.u();
    }
}
