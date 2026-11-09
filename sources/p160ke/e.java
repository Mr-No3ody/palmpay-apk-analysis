package p160ke;

import Pa.r0;
import android.view.View;
import com.palmpay.lib.apm.launchcounter.util.d;
import com.transsnet.palmpay.ui.activity.detail.MerchantOrderDetailActivity;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class e implements View.OnClickListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f38754a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ MerchantOrderDetailActivity f38755b;

    public /* synthetic */ e(MerchantOrderDetailActivity merchantOrderDetailActivity, int i7) {
        this.f38754a = i7;
        this.f38755b = merchantOrderDetailActivity;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        MerchantOrderDetailActivity merchantOrderDetailActivity = this.f38755b;
        switch (this.f38754a) {
            case 0:
                merchantOrderDetailActivity.f34711b.t.setVisibility(4);
                r0.L1(merchantOrderDetailActivity.f34710a, merchantOrderDetailActivity, merchantOrderDetailActivity.f34711b, merchantOrderDetailActivity.findViewById(Ac.e.scrollView));
                break;
            default:
                int i7 = MerchantOrderDetailActivity.f34703Q;
                merchantOrderDetailActivity.getClass();
                d.F("/main/echat");
                break;
        }
    }
}
