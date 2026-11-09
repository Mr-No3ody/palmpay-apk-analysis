package x9;

import com.transsnet.palmpay.core.bean.req.CommonShareReq;
import com.transsnet.palmpay.core.network.PayApiService;
import com.transsnet.palmpay.send_money.ui.activity.tobank.SelectBankForToBankActivity;
import com.transsnet.palmpay.send_money.ui.activity.topp.InputMobileActivity;
import com.transsnet.palmpay.send_money.ui.activity.transfer_via_ussd.SelectBankForTransferViaUssdDialog;
import com.transsnet.palmpay.util.SizeUtils;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class u implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f43707a;

    public /* synthetic */ u(int i7) {
        this.f43707a = i7;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.f43707a) {
            case 0:
                return Unit.f38893a;
            case 1:
                return new p350xa.f();
            case 2:
                return Boolean.valueOf(p059e1.a.C("key_switch_network_stack", false));
            case 3:
                return Integer.valueOf(SizeUtils.dp2px(24.0f));
            case 4:
                int i7 = SelectBankForToBankActivity.f33506B;
                return new CopyOnWriteArrayList();
            case 5:
                int i10 = SelectBankForToBankActivity.f33506B;
                return new CopyOnWriteArrayList();
            case 6:
                int i11 = SelectBankForToBankActivity.f33506B;
                return new CopyOnWriteArrayList();
            case 7:
                int i12 = SelectBankForToBankActivity.f33506B;
                return new p173ld.n();
            case 8:
                int i13 = InputMobileActivity.f33535Z;
                p173ld.l lVar = new p173ld.l(p159kd.f.sm_search_result_info_layout, null);
                lVar.f39331a = "";
                return lVar;
            case 9:
                return ((PayApiService) p324va.c.f43141a.f14621b).commonShare(new CommonShareReq(17));
            case 10:
                SelectBankForTransferViaUssdDialog.a aVar = SelectBankForTransferViaUssdDialog.f33621Y;
                p173ld.m mVar = new p173ld.m(p159kd.f.sm_select_bank_list_title_layout);
                mVar.a(-100, p159kd.f.sm_select_bank_list_item_layout_v3);
                return mVar;
            default:
                SelectBankForTransferViaUssdDialog.a aVar2 = SelectBankForTransferViaUssdDialog.f33621Y;
                return new CopyOnWriteArrayList();
        }
    }
}
