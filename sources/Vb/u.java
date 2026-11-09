package Vb;

import android.widget.ImageView;
import android.widget.TextView;
import com.transsnet.palmpay.custom_view.model.TransactionResultHeaderModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class u implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f10320a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ TransactionResultHeaderModel f10321b;

    public /* synthetic */ u(TransactionResultHeaderModel transactionResultHeaderModel, int i7) {
        this.f10320a = i7;
        this.f10321b = transactionResultHeaderModel;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        TransactionResultHeaderModel transactionResultHeaderModel = this.f10321b;
        switch (this.f10320a) {
            case 0:
                TransactionResultHeaderModel.a aVar = TransactionResultHeaderModel.f31650j;
                return (TextView) transactionResultHeaderModel.findViewById(com.transsnet.palmpay.custom_view.s.tv_order_result_status_tips);
            case 1:
                TransactionResultHeaderModel.a aVar2 = TransactionResultHeaderModel.f31650j;
                return (TextView) transactionResultHeaderModel.findViewById(com.transsnet.palmpay.custom_view.s.tv_order_result_amount);
            case 2:
                TransactionResultHeaderModel.a aVar3 = TransactionResultHeaderModel.f31650j;
                return (TextView) transactionResultHeaderModel.findViewById(com.transsnet.palmpay.custom_view.s.tv_order_status);
            case 3:
                TransactionResultHeaderModel.a aVar4 = TransactionResultHeaderModel.f31650j;
                return (ImageView) transactionResultHeaderModel.findViewById(com.transsnet.palmpay.custom_view.s.iv_transfer_result);
            default:
                transactionResultHeaderModel.getClass();
                return Unit.f38893a;
        }
    }
}
