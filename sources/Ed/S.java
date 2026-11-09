package Ed;

import Pa.i0;
import Pa.n0;
import android.view.View;
import com.transsnet.palmpay.send_money.bean.resp.TopEntranceBean;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class S implements View.OnClickListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2342a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ TopEntranceBean f2343b;

    public /* synthetic */ S(TopEntranceBean topEntranceBean, int i7) {
        this.f2342a = i7;
        this.f2343b = topEntranceBean;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.f2342a) {
            case 0:
                i0.b0(this.f2343b.getJumpUrl());
                n0.g().l("Transfer_ToBank_CustomerService_Click");
                break;
            default:
                i0.b0(this.f2343b.getJumpUrl());
                n0.g().l("Transfer_ToPalmPay_CS_Click");
                break;
        }
    }
}
