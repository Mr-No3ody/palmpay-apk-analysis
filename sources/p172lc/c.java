package p172lc;

import J3.a;
import com.transsnet.palmpay.account.bean.rsp.QueryDeviceRsp;
import com.transsnet.palmpay.core.base.j;
import com.transsnet.palmpay.device.ui.mvp.contract.DeviceListContract;
import p171lb.d;

/* JADX INFO: loaded from: classes4.dex */
public final class c extends j implements DeviceListContract.Presenter {
    @Override // com.transsnet.palmpay.device.ui.mvp.contract.DeviceListContract.Presenter
    public final void activateDevice(QueryDeviceRsp queryDeviceRsp) {
        a.B(this, this.f27351a, new b(queryDeviceRsp, 1), new a(this, 4), new a(this, 5), false, true);
    }

    @Override // com.transsnet.palmpay.device.ui.mvp.contract.DeviceListContract.Presenter
    public final void deActivateDevice(QueryDeviceRsp queryDeviceRsp) {
        a.B(this, this.f27351a, new b(queryDeviceRsp, 2), new a(this, 6), new a(this, 0), false, true);
    }

    @Override // com.transsnet.palmpay.device.ui.mvp.contract.DeviceListContract.Presenter
    public final void deleteDevice(QueryDeviceRsp queryDeviceRsp) {
        a.B(this, (DeviceListContract.View) this.f27351a, new b(queryDeviceRsp, 0), new a(this, 2), new a(this, 3), false, true);
    }

    @Override // com.transsnet.palmpay.device.ui.mvp.contract.DeviceListContract.Presenter
    public final void loadDeviceList() {
        a.C(this, this.f27351a, new d(1), new a(this, 1), null, true, true, 8);
    }
}
