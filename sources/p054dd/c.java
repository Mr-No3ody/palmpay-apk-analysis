package p054dd;

import M1.j;
import Pa.n0;
import Pa.r0;
import Rd.C0607x;
import android.text.TextUtils;
import android.view.View;
import com.chad.library.adapter.base.listener.OnItemClickListener;
import com.palmpay.lib.ui.edit.PpAmountEditText;
import com.transsnet.palmpay.airtime.bean.R2CProductsResp;
import com.transsnet.palmpay.core.callback.Argument2Callback;
import com.transsnet.palmpay.custom_view.v;
import com.transsnet.palmpay.r2c.ui.activity.Recharge2CashHomeActivity;
import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;
import p069ed.a;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class c implements PpAmountEditText.OnTextInputListener, OnItemClickListener, Argument2Callback {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Recharge2CashHomeActivity f35874a;

    public /* synthetic */ c(Recharge2CashHomeActivity recharge2CashHomeActivity) {
        this.f35874a = recharge2CashHomeActivity;
    }

    @Override // com.palmpay.lib.ui.edit.PpAmountEditText.OnTextInputListener
    public void OnTextInput(String str) {
        Recharge2CashHomeActivity recharge2CashHomeActivity = this.f35874a;
        recharge2CashHomeActivity.f33118i = 0L;
        a aVarP = recharge2CashHomeActivity.p();
        aVarP.f36284a = -1;
        aVarP.notifyDataSetChanged();
    }

    @Override // com.transsnet.palmpay.core.callback.Argument2Callback
    public void invoke(Object obj, Object obj2) {
        if (((Integer) obj).intValue() == -1) {
            Recharge2CashHomeActivity.r(this.f35874a, null, 3);
        } else {
            ArrayList arrayList = Recharge2CashHomeActivity.f33117v;
        }
    }

    @Override // com.chad.library.adapter.base.listener.OnItemClickListener
    public void onItemClick(j jVar, View view, int i7) {
        String phoneNumber;
        ArrayList arrayList = Recharge2CashHomeActivity.f33117v;
        Intrinsics.checkNotNullParameter(jVar, "<unused var>");
        Intrinsics.checkNotNullParameter(view, "<unused var>");
        Recharge2CashHomeActivity recharge2CashHomeActivity = this.f35874a;
        R2CProductsResp r2CProductsResp = (R2CProductsResp) recharge2CashHomeActivity.p().getItem(i7);
        C0607x c0607x = (C0607x) recharge2CashHomeActivity.f27334c;
        if (c0607x != null) {
            ((PpAmountEditText) c0607x.f8543c.f700f).setAmount(r0.n0(r2CProductsResp.price));
        }
        a aVarP = recharge2CashHomeActivity.p();
        aVarP.f36284a = i7;
        aVarP.notifyDataSetChanged();
        C0607x c0607x2 = (C0607x) recharge2CashHomeActivity.f27334c;
        if (c0607x2 == null || (phoneNumber = c0607x2.f8544d.getPhoneNumber()) == null) {
            phoneNumber = "";
        }
        if (!TextUtils.isEmpty(phoneNumber) && r0.b1(phoneNumber)) {
            if (!r0.U0()) {
                Recharge2CashHomeActivity.r(recharge2CashHomeActivity, r2CProductsResp, 2);
            }
            n0.g().l("RechargeToCashNewHomePage_ItemButton");
        } else {
            C0607x c0607x3 = (C0607x) recharge2CashHomeActivity.f27334c;
            if (c0607x3 != null) {
                c0607x3.f8544d.setError(recharge2CashHomeActivity.getString(v.cv_msg_enter_recipient_mobile_number));
            }
        }
    }
}
