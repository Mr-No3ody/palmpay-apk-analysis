package p172lc;

import com.transsnet.palmpay.account.bean.rsp.DeviceActionRsp;
import com.transsnet.palmpay.core.bean.CommonListResultV2;
import com.transsnet.palmpay.core.bean.CommonResult;
import com.transsnet.palmpay.device.ui.mvp.contract.DeviceListContract;
import com.transsnet.palmpay.util.ToastUtils;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class a implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f39310a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ c f39311b;

    public /* synthetic */ a(c cVar, int i7) {
        this.f39310a = i7;
        this.f39311b = cVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f39310a) {
            case 0:
                ToastUtils.showLong((String) obj, new Object[0]);
                this.f39311b.loadDeviceList();
                break;
            case 1:
                CommonListResultV2 it = (CommonListResultV2) obj;
                Intrinsics.checkNotNullParameter(it, "it");
                DeviceListContract.View view = (DeviceListContract.View) this.f39311b.f27351a;
                if (view != null) {
                    view.showDeviceList(it.data);
                }
                break;
            case 2:
                CommonResult it2 = (CommonResult) obj;
                Intrinsics.checkNotNullParameter(it2, "it");
                c cVar = this.f39311b;
                cVar.loadDeviceList();
                DeviceListContract.View view2 = (DeviceListContract.View) cVar.f27351a;
                if (view2 != null) {
                    view2.showCommandResultView(it2);
                }
                break;
            case 3:
                this.f39311b.loadDeviceList();
                ToastUtils.showLong((String) obj, new Object[0]);
                break;
            case 4:
                DeviceActionRsp it3 = (DeviceActionRsp) obj;
                Intrinsics.checkNotNullParameter(it3, "it");
                DeviceListContract.View view3 = (DeviceListContract.View) this.f39311b.f27351a;
                if (view3 != null) {
                    view3.showDeviceActionResultView(it3);
                }
                break;
            case 5:
                ToastUtils.showLong((String) obj, new Object[0]);
                this.f39311b.loadDeviceList();
                break;
            default:
                DeviceActionRsp it4 = (DeviceActionRsp) obj;
                Intrinsics.checkNotNullParameter(it4, "it");
                DeviceListContract.View view4 = (DeviceListContract.View) this.f39311b.f27351a;
                if (view4 != null) {
                    view4.showDeviceActionResultView(it4);
                }
                break;
        }
        return Unit.f38893a;
    }
}
