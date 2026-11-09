package Zd;

import Pa.i0;
import Pa.n0;
import Pa.r0;
import Rd.f0;
import Xd.C0784c;
import android.view.View;
import com.chad.library.adapter.base.listener.OnItemClickListener;
import com.palmpay.lib.ui.edit.PpAmountEditText;
import com.transsnet.palmpay.core.base.BaseApplication;
import com.transsnet.palmpay.teller.bean.PaymentAmountItemBean;
import com.transsnet.palmpay.teller.ui.fragment.BillPaymentElectricityHomeFragment;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: Zd.g, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class C0802g implements OnItemClickListener, PpAmountEditText.OnTextInputListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ BillPaymentElectricityHomeFragment f11663a;

    public /* synthetic */ C0802g(BillPaymentElectricityHomeFragment billPaymentElectricityHomeFragment) {
        this.f11663a = billPaymentElectricityHomeFragment;
    }

    @Override // com.palmpay.lib.ui.edit.PpAmountEditText.OnTextInputListener
    public void OnTextInput(String str) {
        int i7 = BillPaymentElectricityHomeFragment.f34255z0;
        this.f11663a.Q();
    }

    @Override // com.chad.library.adapter.base.listener.OnItemClickListener
    public void onItemClick(M1.j jVar, View view, int i7) {
        int i10 = BillPaymentElectricityHomeFragment.f34255z0;
        Intrinsics.checkNotNullParameter(jVar, "<unused var>");
        Intrinsics.checkNotNullParameter(view, "<unused var>");
        if (!BaseApplication.hasLogin()) {
            i0.K(null, null);
            return;
        }
        if (r0.U0()) {
            return;
        }
        BillPaymentElectricityHomeFragment billPaymentElectricityHomeFragment = this.f11663a;
        PaymentAmountItemBean paymentAmountItemBean = (PaymentAmountItemBean) billPaymentElectricityHomeFragment.D().getItem(i7);
        f0 f0Var = (f0) billPaymentElectricityHomeFragment.f27335j;
        if (f0Var != null) {
            f0Var.f8297g.setAmount(r0.A(paymentAmountItemBean.price));
        }
        C0784c c0784cD = billPaymentElectricityHomeFragment.D();
        c0784cD.f11143a = i7;
        c0784cD.notifyDataSetChanged();
        n0.g().m("ElectriCityClick", "SelectAmount", String.valueOf(paymentAmountItemBean.price));
        billPaymentElectricityHomeFragment.E();
    }
}
