package com.transsnet.palmpay.ui.fragment.settings;

import A8.g;
import Ac.f;
import Ac.h;
import C0.G;
import De.b;
import Fe.q0;
import O6.c;
import Pa.F;
import Pa.i0;
import Pa.r0;
import android.content.Intent;
import android.view.View;
import android.widget.CompoundButton;
import androidx.fragment.app.E;
import androidx.lifecycle.AbstractC1207q;
import androidx.lifecycle.V;
import com.alibaba.android.arouter.launcher.ARouter;
import com.palmpay.lib.apm.launchcounter.util.d;
import com.transsnet.palmpay.account.bean.req.SecurityVerifyMethodReq;
import com.transsnet.palmpay.core.base.BaseApplication;
import com.transsnet.palmpay.core.base.BaseMVPFragment;
import com.transsnet.palmpay.core.base.IBasePresenter;
import com.transsnet.palmpay.core.bean.CommonBeanResult;
import com.transsnet.palmpay.core.bean.CommonResult;
import com.transsnet.palmpay.custom_view.dialog.p;
import com.transsnet.palmpay.custom_view.dialog.y;
import com.transsnet.palmpay.main.export.bean.req.ThresholdListRsp;
import com.transsnet.palmpay.main.export.bean.req.ThresholdReq;
import com.transsnet.palmpay.main.export.bean.req.ThresholdRsp;
import com.transsnet.palmpay.ui.mvp.contract.SettingsContract;
import com.transsnet.palmpay.ui.view.SettingItem;
import com.transsnet.palmpay.util.ToastUtils;
import io.fastkv.n;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntRange;
import p025ba.k;
import p038ca.e;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u00012\u00020\u00032\u00020\u00042\u00020\u0005:\u0001\bB\u0007¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\t"}, d2 = {"Lcom/transsnet/palmpay/ui/fragment/settings/PaymentSettingsFragment;", "Lcom/transsnet/palmpay/core/base/BaseMVPFragment;", "LFe/q0;", "Lcom/transsnet/palmpay/ui/mvp/contract/SettingsContract$View;", "Landroid/view/View$OnClickListener;", "Landroid/widget/CompoundButton$OnCheckedChangeListener;", "<init>", "()V", "a", "module_main_impl_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class PaymentSettingsFragment extends BaseMVPFragment<q0> implements SettingsContract.View, View.OnClickListener, CompoundButton.OnCheckedChangeListener {

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public static final /* synthetic */ int f35271C = 0;

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public String[] f35272A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public int[] f35273B;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final e f35274j = new e(this, null, null);

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public SettingItem f35275o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public SettingItem f35276p;
    public SettingItem t;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public int f35277v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int f35278w;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    static {
        new a(null);
    }

    public final void A(boolean z3) {
        SettingItem settingItem = this.f35275o;
        if (settingItem != null) {
            settingItem.setOnCheckedChangeListener(null);
            SettingItem settingItem2 = this.f35275o;
            if (settingItem2 != null) {
                settingItem2.setChecked(z3);
            }
            SettingItem settingItem3 = this.f35275o;
            if (settingItem3 != null) {
                settingItem3.setOnCheckedChangeListener(this);
            }
        }
    }

    @Override // com.transsnet.palmpay.core.base.IBaseView
    public final AbstractC1207q getCoroutineScope() {
        return V.f(this);
    }

    @Override // com.transsnet.palmpay.core.base.BaseFragment
    public final int h() {
        return f.main_fragment_payment_settings;
    }

    @Override // com.transsnet.palmpay.ui.mvp.contract.SettingsContract.View
    public final void handleCreateOneStepPayThreshold(CommonResult commonResult) {
        E activity;
        Intrinsics.checkNotNullParameter(commonResult, "commonResult");
        if (!commonResult.isSuccess()) {
            ToastUtils.showLong(commonResult.getRespMsg(), new Object[0]);
            if (getActivity() == null || (activity = getActivity()) == null) {
                return;
            }
            activity.finish();
            return;
        }
        A(false);
        SettingItem settingItem = this.f35275o;
        if (settingItem != null) {
            settingItem.setVisibility(0);
        }
        SettingItem settingItem2 = this.f35275o;
        if (settingItem2 != null) {
            settingItem2.setOnCheckedChangeListener(this);
        }
    }

    @Override // com.transsnet.palmpay.ui.mvp.contract.SettingsContract.View
    public final void handleModifyOneStepPayThreshold(CommonResult commonResult) {
        if (commonResult == null) {
            q0 q0Var = (q0) this.f27328i;
            if (q0Var != null) {
                q0Var.queryOneStepPayThreshold();
                return;
            }
            return;
        }
        if (commonResult.isSuccess()) {
            showLoadingDialog(false);
            return;
        }
        if ("CFRONT_700005".equalsIgnoreCase(commonResult.getRespCode())) {
            ToastUtils.showLong(commonResult.getRespMsg(), new Object[0]);
        } else {
            String respMsg = commonResult.getRespMsg();
            Intrinsics.checkNotNullExpressionValue(respMsg, "getRespMsg(...)");
            y(respMsg);
        }
        q0 q0Var2 = (q0) this.f27328i;
        if (q0Var2 != null) {
            q0Var2.queryOneStepPayThreshold();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.transsnet.palmpay.ui.mvp.contract.SettingsContract.View
    public final void handleOneStepPayThreshold(CommonBeanResult thresholdRsp) {
        int amountThreshold;
        Intrinsics.checkNotNullParameter(thresholdRsp, "thresholdRsp");
        if (!thresholdRsp.isSuccess()) {
            String respMsg = thresholdRsp.getRespMsg();
            Intrinsics.checkNotNullExpressionValue(respMsg, "getRespMsg(...)");
            y(respMsg);
            return;
        }
        try {
            int[] iArr = this.f35273B;
            Intrinsics.e(iArr);
            amountThreshold = iArr[0];
        } catch (Exception unused) {
            amountThreshold = 0;
        }
        ThresholdRsp thresholdRsp2 = (ThresholdRsp) thresholdRsp.data;
        if (thresholdRsp2 != null) {
            amountThreshold = thresholdRsp2.getAmountThreshold();
            if (thresholdRsp2.getThresholdOn() == 1) {
                A(true);
                SettingItem settingItem = this.f35275o;
                if (settingItem != null) {
                    settingItem.setVisibility(0);
                }
                SettingItem settingItem2 = this.f35276p;
                if (settingItem2 != null) {
                    settingItem2.setVisibility(0);
                }
            } else {
                A(false);
                SettingItem settingItem3 = this.f35275o;
                if (settingItem3 != null) {
                    settingItem3.setVisibility(0);
                }
                SettingItem settingItem4 = this.f35275o;
                if (settingItem4 != null) {
                    settingItem4.setOnCheckedChangeListener(this);
                }
            }
        } else {
            ThresholdReq thresholdReq = new ThresholdReq();
            thresholdReq.setMemberId(BaseApplication.getInstance().getUser().getMemberId());
            thresholdReq.setAmountThreshold(amountThreshold);
            thresholdReq.setThresholdOn(0);
            q0 q0Var = (q0) this.f27328i;
            if (q0Var != null) {
                q0Var.createOneStepPayThreshold(thresholdReq);
            }
        }
        SettingItem settingItem5 = this.f35276p;
        if (settingItem5 != null) {
            this.f35277v = amountThreshold;
            settingItem5.setSummary(u(amountThreshold));
        }
    }

    @Override // com.transsnet.palmpay.ui.mvp.contract.SettingsContract.View
    public final void handlePaymentThresholds(ThresholdListRsp response) {
        Intrinsics.checkNotNullParameter(response, "response");
        if (!response.isSuccess()) {
            String respMsg = response.getRespMsg();
            Intrinsics.checkNotNullExpressionValue(respMsg, "getRespMsg(...)");
            y(respMsg);
            return;
        }
        List<Integer> list = response.data;
        if (list == null || list.isEmpty()) {
            return;
        }
        int size = list.size();
        this.f35272A = new String[size];
        this.f35273B = new int[size];
        for (int i7 = 0; i7 < size; i7++) {
            int iIntValue = list.get(i7).intValue();
            String[] strArr = this.f35272A;
            if (strArr == null) {
                Intrinsics.n("mThresholdEntries");
                throw null;
            }
            strArr[i7] = getString(h.main_payment_limits_item, BaseApplication.getCurrencySymbol(), r0.E(iIntValue));
            int[] iArr = this.f35273B;
            Intrinsics.e(iArr);
            iArr[i7] = iIntValue;
        }
        q0 q0Var = (q0) this.f27328i;
        if (q0Var != null) {
            q0Var.queryOneStepPayThreshold();
        }
    }

    @Override // com.transsnet.palmpay.core.base.BaseFragment
    public final int k() {
        return 0;
    }

    @Override // com.transsnet.palmpay.core.base.BaseMVPFragment, com.transsnet.palmpay.core.base.BaseFragment
    public final void n() {
        super.n();
        q0 q0Var = (q0) this.f27328i;
        if (q0Var != null) {
            q0Var.queryPaymentThresholds();
        }
    }

    @Override // com.transsnet.palmpay.core.base.BaseFragment
    public final int o() {
        int i7;
        SettingItem settingItem = (SettingItem) this.f27318b.findViewById(Ac.e.key_reset_pin);
        if (settingItem != null) {
            settingItem.setOnPreferenceClickListener(this);
        }
        SettingItem settingItem2 = (SettingItem) this.f27318b.findViewById(Ac.e.key_change_pin);
        if (settingItem2 != null) {
            settingItem2.setOnPreferenceClickListener(this);
        }
        SettingItem settingItem3 = (SettingItem) this.f27318b.findViewById(Ac.e.key_threshold);
        this.f35276p = settingItem3;
        if (settingItem3 != null) {
            settingItem3.setOnPreferenceClickListener(this);
        }
        SettingItem settingItem4 = (SettingItem) this.f27318b.findViewById(Ac.e.key_one_step_pay);
        this.f35275o = settingItem4;
        if (settingItem4 != null) {
            settingItem4.setChecked(false);
        }
        int[] iArr = this.f35273B;
        if (iArr != null) {
            try {
                Intrinsics.e(iArr);
                i7 = iArr[0];
            } catch (Exception unused) {
                i7 = 0;
            }
            SettingItem settingItem5 = this.f35276p;
            if (settingItem5 != null) {
                this.f35277v = i7;
                settingItem5.setSummary(u(i7));
            }
        }
        SettingItem settingItem6 = (SettingItem) this.f27318b.findViewById(Ac.e.key_touchId_for_palmpay);
        this.t = settingItem6;
        if (settingItem6 != null) {
            settingItem6.setChecked(n.x());
        }
        SettingItem settingItem7 = this.t;
        if (settingItem7 != null) {
            settingItem7.setOnCheckedChangeListener(new g(this, 1));
        }
        SettingItem settingItem8 = (SettingItem) this.f27318b.findViewById(Ac.e.key_payMethod);
        if (settingItem8 != null) {
            settingItem8.setOnPreferenceClickListener(this);
        }
        SettingItem settingItem9 = (SettingItem) this.f27318b.findViewById(Ac.e.key_automatic_payments);
        if (settingItem9 != null) {
            settingItem9.setOnPreferenceClickListener(this);
        }
        return 0;
    }

    @Override // android.widget.CompoundButton.OnCheckedChangeListener
    public final void onCheckedChanged(CompoundButton buttonView, boolean z3) {
        Intrinsics.checkNotNullParameter(buttonView, "buttonView");
        Intent intentC = F.c(getActivity(), ARouter.getInstance().build("/account/verifyAccount"));
        if (intentC != null) {
            intentC.putExtra("extra_type", SecurityVerifyMethodReq.MODIFY_THRESHOLD);
            this.f35274j.f(intentC, new b(this, z3, 0));
        }
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View v3) {
        int[] iArr;
        Intrinsics.checkNotNullParameter(v3, "v");
        int id2 = v3.getId();
        if (id2 == Ac.e.key_automatic_payments) {
            i0.b0("/single-page/payment-setting/automatic?nLoad=true&sDark=true");
            return;
        }
        if (id2 == Ac.e.key_payMethod) {
            d.F("/main/set_payment_method");
            return;
        }
        if (id2 == Ac.e.key_change_pin) {
            d.H("/account/verifyAccount", "extra_type", SecurityVerifyMethodReq.LOGIN_CHANGE_PIN);
            return;
        }
        if (id2 == Ac.e.key_reset_pin) {
            d.H("/account/verifyAccount", "extra_type", SecurityVerifyMethodReq.LOGIN_RESET_PIN);
            return;
        }
        if (id2 != Ac.e.key_threshold || (iArr = this.f35273B) == null || iArr.length == 0) {
            return;
        }
        Intrinsics.checkNotNullParameter(iArr, "<this>");
        Intrinsics.checkNotNullParameter(iArr, "<this>");
        int i7 = 0;
        int i10 = new IntRange(0, iArr.length - 1, 1).f38978b;
        if (i10 >= 0) {
            int i11 = 0;
            while (true) {
                int[] iArr2 = this.f35273B;
                Intrinsics.e(iArr2);
                if (iArr2[i11] != this.f35277v) {
                    if (i11 == i10) {
                        break;
                    } else {
                        i11++;
                    }
                } else {
                    i7 = i11;
                    break;
                }
            }
        }
        p pVar = new p(getActivity());
        pVar.f31294a = "Payment limits";
        String[] strArr = this.f35272A;
        if (strArr == null) {
            Intrinsics.n("mThresholdEntries");
            throw null;
        }
        pVar.a(strArr, i7, new De.d(this, 0));
        pVar.show();
    }

    @Override // com.transsnet.palmpay.core.base.BaseMVPFragment
    public final IBasePresenter t() {
        return new q0();
    }

    public final String u(int i7) {
        int[] iArr = this.f35273B;
        String[] strArr = this.f35272A;
        if (strArr == null) {
            Intrinsics.n("mThresholdEntries");
            throw null;
        }
        if (iArr == null || iArr.length != strArr.length) {
            return null;
        }
        int length = iArr.length;
        for (int i10 = 0; i10 < length; i10++) {
            if (iArr[i10] == i7) {
                return strArr[i10];
            }
        }
        return strArr[0];
    }

    public final void v(int i7) {
        if (i7 == -1) {
            n.N(false);
            D3.a.N("disable", "success", null);
        } else {
            SettingItem settingItem = this.t;
            if (settingItem != null) {
                settingItem.setChecked(true);
            }
        }
    }

    public final void w(int i7) {
        F6.d.h("PaymentSettings", 3, G.m(i7, "onPreferenceChange threshold new: "));
        F6.d.h("PaymentSettings", 3, G.m(this.f35277v, "onPreferenceChange threshold old: "));
        this.f35278w = i7;
        Intent intentC = F.c(getActivity(), ARouter.getInstance().build("/account/verifyAccount"));
        if (intentC != null) {
            intentC.putExtra("extra_type", SecurityVerifyMethodReq.MODIFY_THRESHOLD);
            this.f35274j.f(intentC, new De.e(this, 0));
        }
    }

    public final void x(int i7, String str, boolean z3) {
        ThresholdReq thresholdReq = new ThresholdReq();
        thresholdReq.setMemberId(BaseApplication.getInstance().getUser().getMemberId());
        if (z3) {
            thresholdReq.setAmountThreshold(i7);
            thresholdReq.setThresholdOn(1);
        } else {
            thresholdReq.setAmountThreshold(i7);
            thresholdReq.setThresholdOn(0);
        }
        thresholdReq.securityVerifyToken = str;
        q0 q0Var = (q0) this.f27328i;
        if (q0Var != null) {
            q0Var.modifyOneStepPayThreshold(thresholdReq);
        }
    }

    public final void y(String str) {
        c cVar = new c(getActivity());
        cVar.e(k.core_title_error_info);
        cVar.f6598d = str;
        cVar.d(k.core_try_again, new De.c(this, 1));
        cVar.c(k.core_cancel, new De.c(this, 2));
        cVar.f6604j = new De.c(this, 3);
        cVar.g();
    }

    public final void z(String str) {
        y yVar = new y(getActivity());
        yVar.f31328f = S6.a.pay_SelectedOutline;
        yVar.f31323a = str;
        yVar.h();
    }
}
