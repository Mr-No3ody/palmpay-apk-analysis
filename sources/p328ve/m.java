package p328ve;

import android.view.View;
import com.transsnet.palmpay.main.export.bean.rsp.MerchantListRsp;
import com.transsnet.palmpay.ui.activity.MerchantPaymentListActivity;

/* JADX INFO: loaded from: classes4.dex */
public final class m implements View.OnClickListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f43187a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ n f43188b;

    public /* synthetic */ m(n nVar, int i7) {
        this.f43187a = i7;
        this.f43188b = nVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.f43187a) {
            case 0:
                n nVar = this.f43188b;
                nVar.f43194f.f11489a.closeAllItems();
                o oVar = nVar.f43194f;
                if (oVar.f43196c != null) {
                    oVar.f43196c.onItemDeleted((MerchantListRsp) nVar.f43193e.getTag(), ((Integer) view.getTag()).intValue());
                }
                break;
            default:
                n nVar2 = this.f43188b;
                MerchantPaymentListActivity merchantPaymentListActivity = nVar2.f43194f.f43196c;
                if (merchantPaymentListActivity != null) {
                    merchantPaymentListActivity.onItemClicked((MerchantListRsp) nVar2.f43193e.getTag());
                }
                break;
        }
    }
}
