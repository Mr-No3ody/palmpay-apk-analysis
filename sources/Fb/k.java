package Fb;

import Hb.P;
import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.view.View;
import com.alibaba.android.arouter.launcher.ARouter;
import com.transsnet.palmpay.account.bean.rsp.QueryDeviceRsp;
import com.transsnet.palmpay.airtime.bean.AirtimeDetailData;
import com.transsnet.palmpay.airtime.bean.rsp.R2COrderDetailResp;
import com.transsnet.palmpay.airtime.ui.AirtimeBillDetailActivity;
import com.transsnet.palmpay.core.ui.dialog.BillDetailProcessDialog;
import com.transsnet.palmpay.credit.bean.other.LoanCoupon;
import com.transsnet.palmpay.device.ui.activity.DeviceListActivity;
import com.transsnet.palmpay.r2c.ui.activity.Recharge2CashDetailActivity;
import com.transsnet.palmpay.teller.bean.BillPaymentOrderDetailRsp;
import com.transsnet.palmpay.teller.ui.activity.BillPaymentOrderDetailActivity;
import com.transsnet.palmpay.util.ToastUtils;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import kotlin.text.y;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class k implements View.OnClickListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2644a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ boolean f2645b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f2646c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f2647d;

    public /* synthetic */ k(DeviceListActivity deviceListActivity, QueryDeviceRsp queryDeviceRsp, boolean z3) {
        this.f2644a = 5;
        this.f2646c = deviceListActivity;
        this.f2647d = queryDeviceRsp;
        this.f2645b = z3;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        String string;
        String strK = null;
        boolean z3 = this.f2645b;
        Object obj = this.f2647d;
        Object obj2 = this.f2646c;
        switch (this.f2644a) {
            case 0:
                if (z3) {
                    Context context = ((View) obj2).getContext();
                    Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
                    Intrinsics.checkNotNullParameter(context, "context");
                    String str = (String) obj;
                    if (str != null && (string = StringsKt.V(str).toString()) != null) {
                        strK = y.k(string, " ", "");
                    }
                    String str2 = strK != null ? strK : "";
                    if (str2.length() != 0) {
                        Object systemService = context.getSystemService("clipboard");
                        Intrinsics.f(systemService, "null cannot be cast to non-null type android.content.ClipboardManager");
                        ((ClipboardManager) systemService).setPrimaryClip(ClipData.newPlainText("va_account", str2));
                        ToastUtils.showLong("Copied to clipboard", new Object[0]);
                        break;
                    }
                }
                break;
            case 1:
                if (z3) {
                    LoanCoupon loanCoupon = (LoanCoupon) obj;
                    strK = loanCoupon != null ? loanCoupon.androidLink : null;
                    ((P) obj2).getClass();
                    P.j(strK);
                }
                break;
            case 2:
                BillPaymentOrderDetailActivity.a aVar = BillPaymentOrderDetailActivity.f34162i;
                if (z3) {
                    BillDetailProcessDialog billDetailProcessDialog = new BillDetailProcessDialog((BillPaymentOrderDetailActivity) obj2);
                    billDetailProcessDialog.show();
                    billDetailProcessDialog.fillData(((BillPaymentOrderDetailRsp) obj).getOrderStatusInfo());
                }
                break;
            case 3:
                int i7 = Recharge2CashDetailActivity.f33114f;
                if (z3) {
                    BillDetailProcessDialog billDetailProcessDialog2 = new BillDetailProcessDialog((Recharge2CashDetailActivity) obj2);
                    billDetailProcessDialog2.show();
                    billDetailProcessDialog2.fillData(((R2COrderDetailResp) obj).orderStatusInfo);
                }
                break;
            case 4:
                int i10 = AirtimeBillDetailActivity.f26454i;
                if (z3) {
                    BillDetailProcessDialog billDetailProcessDialog3 = new BillDetailProcessDialog((AirtimeBillDetailActivity) obj2);
                    billDetailProcessDialog3.show();
                    billDetailProcessDialog3.fillData(((AirtimeDetailData) obj).getOrderStatusInfo());
                }
                break;
            default:
                DeviceListActivity deviceListActivity = (DeviceListActivity) obj2;
                deviceListActivity.f31826f = (QueryDeviceRsp) obj;
                ARouter.getInstance().build("/account/authentication").navigation(deviceListActivity, z3 ? DeviceListActivity.f31819j : DeviceListActivity.f31820o);
                break;
        }
    }

    public /* synthetic */ k(Object obj, int i7, Object obj2, boolean z3) {
        this.f2644a = i7;
        this.f2645b = z3;
        this.f2646c = obj;
        this.f2647d = obj2;
    }
}
