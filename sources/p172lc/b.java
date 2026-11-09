package p172lc;

import G8.a;
import com.transsnet.palmpay.account.bean.req.DeviceActionReq;
import com.transsnet.palmpay.account.bean.rsp.QueryDeviceRsp;
import com.transsnet.palmpay.account.business.IApiAccountService;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class b implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f39312a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ QueryDeviceRsp f39313b;

    public /* synthetic */ b(QueryDeviceRsp queryDeviceRsp, int i7) {
        this.f39312a = i7;
        this.f39313b = queryDeviceRsp;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.f39312a) {
            case 0:
                IApiAccountService iApiAccountServiceT = a.t();
                QueryDeviceRsp queryDeviceRsp = this.f39313b;
                return iApiAccountServiceT.deleteDevice(new DeviceActionReq(queryDeviceRsp != null ? queryDeviceRsp.getImei() : null, queryDeviceRsp != null ? queryDeviceRsp.getMemberId() : null));
            case 1:
                IApiAccountService iApiAccountServiceT2 = a.t();
                QueryDeviceRsp queryDeviceRsp2 = this.f39313b;
                return iApiAccountServiceT2.activateDevice(new DeviceActionReq(queryDeviceRsp2 != null ? queryDeviceRsp2.getImei() : null, queryDeviceRsp2 != null ? queryDeviceRsp2.getMemberId() : null));
            default:
                IApiAccountService iApiAccountServiceT3 = a.t();
                QueryDeviceRsp queryDeviceRsp3 = this.f39313b;
                return iApiAccountServiceT3.deActivateDevice(new DeviceActionReq(queryDeviceRsp3 != null ? queryDeviceRsp3.getImei() : null, queryDeviceRsp3 != null ? queryDeviceRsp3.getMemberId() : null));
        }
    }
}
