package Ab;

import android.view.View;
import com.transsnet.palmpay.credit.ui.activity.okcard.OcRepayActivity;
import com.transsnet.palmpay.credit.ui.activity.okcard.OcRepayExtendActivity;
import com.transsnet.palmpay.credit.ui.activity.okcard.OcRepayOrderDetailInPalmPayActivity;
import com.transsnet.palmpay.credit.ui.fragment.cashloan.CLInstallmentBorrowFragment;
import com.transsnet.palmpay.credit.ui.view.BorrowCLInfoView;
import com.transsnet.palmpay.credit.ui.view.BorrowCLInfoView2;
import kotlin.jvm.internal.F;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class l implements View.OnClickListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f130a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ F f131b;

    public /* synthetic */ l(F f10, int i7) {
        this.f130a = i7;
        this.f131b = f10;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        F f10 = this.f131b;
        switch (this.f130a) {
            case 0:
                int i7 = CLInstallmentBorrowFragment.f30584M1;
                O6.d dVar = (O6.d) f10.f38951a;
                if (dVar != null) {
                    dVar.dismiss();
                }
                break;
            case 1:
                int i10 = BorrowCLInfoView.f30622w;
                O6.d dVar2 = (O6.d) f10.f38951a;
                if (dVar2 != null) {
                    dVar2.dismiss();
                }
                break;
            case 2:
                int i11 = BorrowCLInfoView2.f30633A;
                O6.d dVar3 = (O6.d) f10.f38951a;
                if (dVar3 != null) {
                    dVar3.dismiss();
                }
                break;
            case 3:
                int i12 = OcRepayActivity.f29705v1;
                O6.d dVar4 = (O6.d) f10.f38951a;
                if (dVar4 != null) {
                    dVar4.dismiss();
                }
                break;
            case 4:
                int i13 = OcRepayActivity.f29705v1;
                O6.d dVar5 = (O6.d) f10.f38951a;
                if (dVar5 != null) {
                    dVar5.dismiss();
                }
                break;
            case 5:
                int i14 = OcRepayActivity.f29705v1;
                O6.d dVar6 = (O6.d) f10.f38951a;
                if (dVar6 != null) {
                    dVar6.dismiss();
                }
                break;
            case 6:
                int i15 = OcRepayActivity.f29705v1;
                O6.d dVar7 = (O6.d) f10.f38951a;
                if (dVar7 != null) {
                    dVar7.dismiss();
                }
                break;
            case 7:
                int i16 = OcRepayExtendActivity.f29779C;
                O6.d dVar8 = (O6.d) f10.f38951a;
                if (dVar8 != null) {
                    dVar8.dismiss();
                }
                break;
            default:
                int i17 = OcRepayOrderDetailInPalmPayActivity.f29822o;
                O6.d dVar9 = (O6.d) f10.f38951a;
                if (dVar9 != null) {
                    dVar9.dismiss();
                }
                break;
        }
    }
}
