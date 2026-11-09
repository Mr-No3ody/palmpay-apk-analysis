package Gd;

import android.widget.ImageView;
import android.widget.TextView;
import com.transsnet.palmpay.send_money.ui.view.TransferResultHeaderModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class i implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3351a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ TransferResultHeaderModel f3352b;

    public /* synthetic */ i(TransferResultHeaderModel transferResultHeaderModel, int i7) {
        this.f3351a = i7;
        this.f3352b = transferResultHeaderModel;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        TransferResultHeaderModel transferResultHeaderModel = this.f3352b;
        switch (this.f3351a) {
            case 0:
                TransferResultHeaderModel.a aVar = TransferResultHeaderModel.f33879g;
                return (TextView) transferResultHeaderModel.findViewById(p159kd.e.tv_order_result_status_tips);
            case 1:
                TransferResultHeaderModel.a aVar2 = TransferResultHeaderModel.f33879g;
                return (ImageView) transferResultHeaderModel.findViewById(p159kd.e.iv_transfer_result_extend);
            case 2:
                TransferResultHeaderModel.a aVar3 = TransferResultHeaderModel.f33879g;
                return (TextView) transferResultHeaderModel.findViewById(p159kd.e.tv_order_result_amount);
            case 3:
                TransferResultHeaderModel.a aVar4 = TransferResultHeaderModel.f33879g;
                return (TextView) transferResultHeaderModel.findViewById(p159kd.e.tv_order_status);
            case 4:
                TransferResultHeaderModel.a aVar5 = TransferResultHeaderModel.f33879g;
                return (ImageView) transferResultHeaderModel.findViewById(p159kd.e.iv_transfer_result);
            default:
                TransferResultHeaderModel.a aVar6 = TransferResultHeaderModel.f33879g;
                transferResultHeaderModel.getClass();
                return Unit.f38893a;
        }
    }
}
