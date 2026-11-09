package p102ge;

import Pe.C0542n;
import android.view.View;
import com.transsnet.palmpay.core.bean.HomePageMenuData;
import com.transsnet.palmpay.core.bean.req.BillPaymentEditReq;
import com.transsnet.palmpay.ui.activity.BillPaymentEditActivity;
import com.transsnet.palmpay.viewmodule.BillPaymentEditViewModel;
import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;
import p140j8.f;

/* JADX INFO: renamed from: ge.h, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class ViewOnClickListenerC1735h implements View.OnClickListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f37217a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ BillPaymentEditActivity f37218b;

    public /* synthetic */ ViewOnClickListenerC1735h(BillPaymentEditActivity billPaymentEditActivity, int i7) {
        this.f37217a = i7;
        this.f37218b = billPaymentEditActivity;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        BillPaymentEditActivity billPaymentEditActivity = this.f37218b;
        switch (this.f37217a) {
            case 0:
                int i7 = BillPaymentEditActivity.f34439j;
                ArrayList req = new ArrayList();
                for (HomePageMenuData homePageMenuData : billPaymentEditActivity.f34442e) {
                    BillPaymentEditReq billPaymentEditReq = new BillPaymentEditReq();
                    String menuName = homePageMenuData.menuName;
                    Intrinsics.checkNotNullExpressionValue(menuName, "menuName");
                    billPaymentEditReq.menuName = menuName;
                    billPaymentEditReq.menuId = homePageMenuData.menuId;
                    req.add(billPaymentEditReq);
                }
                BillPaymentEditViewModel billPaymentEditViewModel = (BillPaymentEditViewModel) billPaymentEditActivity.l();
                billPaymentEditViewModel.getClass();
                Intrinsics.checkNotNullParameter(req, "req");
                f.s(billPaymentEditViewModel, new C0542n(req, null), billPaymentEditViewModel.f35360e, (28 & 4) != 0 ? 0L : 300L, (28 & 8) != 0, (28 & 16) == 0);
                break;
            default:
                int i10 = BillPaymentEditActivity.f34439j;
                billPaymentEditActivity.finish();
                break;
        }
    }
}
