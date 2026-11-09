package D9;

import Pa.i0;
import Pa.n0;
import android.view.View;
import com.transsnet.palmpay.cash_in.ui.activity.instruction.AddMoneyHomeActivity;
import com.transsnet.palmpay.cash_in.ui.activity.instruction.InterBankCashInInstructionActivity;
import com.transsnet.palmpay.core.base.BaseApplication;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class a implements View.OnClickListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1703a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ AddMoneyHomeActivity f1704b;

    public /* synthetic */ a(AddMoneyHomeActivity addMoneyHomeActivity, int i7) {
        this.f1703a = i7;
        this.f1704b = addMoneyHomeActivity;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        AddMoneyHomeActivity addMoneyHomeActivity = this.f1704b;
        switch (this.f1703a) {
            case 0:
                int i7 = AddMoneyHomeActivity.f26973o;
                n0.g().m("AddMoney_Tips_Click", (String) addMoneyHomeActivity.f26976e.getValue(), "");
                addMoneyHomeActivity.finish();
                break;
            case 1:
                int i10 = AddMoneyHomeActivity.f26973o;
                n0.g().l("AddMoney_BankTransfer_Click");
                if (!BaseApplication.hasLogin()) {
                    i0.K(null, null);
                } else {
                    InterBankCashInInstructionActivity.f26981p.launch(addMoneyHomeActivity);
                }
                break;
            default:
                int i11 = AddMoneyHomeActivity.f26973o;
                addMoneyHomeActivity.onBackPressed();
                break;
        }
    }
}
