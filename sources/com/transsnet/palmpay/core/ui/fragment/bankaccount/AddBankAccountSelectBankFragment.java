package com.transsnet.palmpay.core.ui.fragment.bankaccount;

import Ab.ViewOnClickListenerC0053e;
import F6.d;
import L9.b;
import La.h;
import N8.q0;
import O6.c;
import Pa.F;
import Pa.i0;
import android.app.Activity;
import android.content.Intent;
import android.graphics.Typeface;
import android.os.Bundle;
import android.text.Editable;
import android.text.InputFilter;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import androidx.fragment.app.C1161a;
import androidx.fragment.app.E;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.Z;
import com.alibaba.android.arouter.facade.Postcard;
import com.alibaba.android.arouter.launcher.ARouter;
import com.horcrux.svg.d0;
import com.transsnet.palmpay.account.bean.ResetPinVerifyTypeRsp;
import com.transsnet.palmpay.core.base.BaseApplication;
import com.transsnet.palmpay.core.base.IBasePresenter;
import com.transsnet.palmpay.core.bean.BankInfo;
import com.transsnet.palmpay.core.bean.CommonResult;
import com.transsnet.palmpay.core.bean.message.MessageEvent;
import com.transsnet.palmpay.core.bean.req.AddBankAccountReq;
import com.transsnet.palmpay.core.bean.req.BindBankAccountReq;
import com.transsnet.palmpay.core.bean.req.CheckBankCardInfoReq;
import com.transsnet.palmpay.core.bean.req.CheckCardBindNumReq;
import com.transsnet.palmpay.core.bean.req.QueryBankListReq;
import com.transsnet.palmpay.core.bean.rsp.AddPayBankAccRsp;
import com.transsnet.palmpay.core.bean.rsp.BindActionRsp;
import com.transsnet.palmpay.core.bean.rsp.CheckBankCardInfoRsp;
import com.transsnet.palmpay.core.dialog.SelectBankDialog;
import com.transsnet.palmpay.core.dialog.SelectBankDialogV2;
import com.transsnet.palmpay.core.ui.fragment.AddBankAccountFragment;
import com.transsnet.palmpay.core.ui.fragment.bankaccount.AddBankAccountSelectBankFragment;
import com.transsnet.palmpay.core.viewmodel.ModelBankCardItem1;
import com.transsnet.palmpay.core.viewmodel.ModelBankInfoItem;
import com.transsnet.palmpay.custom_view.RoundedTextView;
import com.transsnet.palmpay.custom_view.TitleEditView;
import com.transsnet.palmpay.custom_view.p;
import com.transsnet.palmpay.custom_view.r;
import com.transsnet.palmpay.util.ActivityUtils;
import com.transsnet.palmpay.util.SPUtils;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import p025ba.k;
import p355xf.C2131j;
import p355xf.t;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u0004:\u0001\u0007B\u0007¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\b"}, d2 = {"Lcom/transsnet/palmpay/core/ui/fragment/bankaccount/AddBankAccountSelectBankFragment;", "Lcom/transsnet/palmpay/core/ui/fragment/bankaccount/AddBankAccountBaseFragment;", "Landroid/text/TextWatcher;", "Landroid/view/View$OnClickListener;", "Lcom/transsnet/palmpay/core/dialog/SelectBankDialog$CallBack;", "<init>", "()V", "a", "module_common_impl_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class AddBankAccountSelectBankFragment extends AddBankAccountBaseFragment implements TextWatcher, View.OnClickListener, SelectBankDialog.CallBack {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public static final /* synthetic */ int f27891p0 = 0;

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public final t f27892A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public final t f27893B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public final t f27894C;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    public final t f27895H;

    /* JADX INFO: renamed from: L, reason: collision with root package name */
    public final t f27896L;

    /* JADX INFO: renamed from: M, reason: collision with root package name */
    public List f27897M = new ArrayList();

    /* JADX INFO: renamed from: Q, reason: collision with root package name */
    public boolean f27898Q;

    /* JADX INFO: renamed from: X, reason: collision with root package name */
    public boolean f27899X;

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    public boolean f27900Y;

    /* JADX INFO: renamed from: Z, reason: collision with root package name */
    public SelectBankDialogV2 f27901Z;

    /* JADX INFO: renamed from: k0, reason: collision with root package name */
    public List f27902k0;

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

    public AddBankAccountSelectBankFragment() {
        final int i7 = 0;
        this.f27892A = C2131j.b(new Function0(this) { // from class: Ia.b

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ AddBankAccountSelectBankFragment f4296b;

            {
                this.f4296b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                AddBankAccountSelectBankFragment addBankAccountSelectBankFragment = this.f4296b;
                switch (i7) {
                    case 0:
                        int i10 = AddBankAccountSelectBankFragment.f27891p0;
                        View view = addBankAccountSelectBankFragment.f27318b;
                        if (view != null) {
                            return (RoundedTextView) view.findViewById(L9.a.tvNext);
                        }
                        return null;
                    case 1:
                        int i11 = AddBankAccountSelectBankFragment.f27891p0;
                        View view2 = addBankAccountSelectBankFragment.f27318b;
                        if (view2 != null) {
                            return (ModelBankCardItem1) view2.findViewById(L9.a.bank_name_tv);
                        }
                        return null;
                    case 2:
                        int i12 = AddBankAccountSelectBankFragment.f27891p0;
                        View view3 = addBankAccountSelectBankFragment.f27318b;
                        if (view3 != null) {
                            return (TextView) view3.findViewById(L9.a.tvAccountNoError);
                        }
                        return null;
                    case 3:
                        int i13 = AddBankAccountSelectBankFragment.f27891p0;
                        View view4 = addBankAccountSelectBankFragment.f27318b;
                        if (view4 != null) {
                            return (TextView) view4.findViewById(L9.a.tvNote);
                        }
                        return null;
                    default:
                        int i14 = AddBankAccountSelectBankFragment.f27891p0;
                        View view5 = addBankAccountSelectBankFragment.f27318b;
                        if (view5 != null) {
                            return (TitleEditView) view5.findViewById(L9.a.itemAccountNo);
                        }
                        return null;
                }
            }
        });
        final int i10 = 1;
        this.f27893B = C2131j.b(new Function0(this) { // from class: Ia.b

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ AddBankAccountSelectBankFragment f4296b;

            {
                this.f4296b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                AddBankAccountSelectBankFragment addBankAccountSelectBankFragment = this.f4296b;
                switch (i10) {
                    case 0:
                        int i11 = AddBankAccountSelectBankFragment.f27891p0;
                        View view = addBankAccountSelectBankFragment.f27318b;
                        if (view != null) {
                            return (RoundedTextView) view.findViewById(L9.a.tvNext);
                        }
                        return null;
                    case 1:
                        int i12 = AddBankAccountSelectBankFragment.f27891p0;
                        View view2 = addBankAccountSelectBankFragment.f27318b;
                        if (view2 != null) {
                            return (ModelBankCardItem1) view2.findViewById(L9.a.bank_name_tv);
                        }
                        return null;
                    case 2:
                        int i13 = AddBankAccountSelectBankFragment.f27891p0;
                        View view3 = addBankAccountSelectBankFragment.f27318b;
                        if (view3 != null) {
                            return (TextView) view3.findViewById(L9.a.tvAccountNoError);
                        }
                        return null;
                    case 3:
                        int i14 = AddBankAccountSelectBankFragment.f27891p0;
                        View view4 = addBankAccountSelectBankFragment.f27318b;
                        if (view4 != null) {
                            return (TextView) view4.findViewById(L9.a.tvNote);
                        }
                        return null;
                    default:
                        int i15 = AddBankAccountSelectBankFragment.f27891p0;
                        View view5 = addBankAccountSelectBankFragment.f27318b;
                        if (view5 != null) {
                            return (TitleEditView) view5.findViewById(L9.a.itemAccountNo);
                        }
                        return null;
                }
            }
        });
        final int i11 = 2;
        this.f27894C = C2131j.b(new Function0(this) { // from class: Ia.b

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ AddBankAccountSelectBankFragment f4296b;

            {
                this.f4296b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                AddBankAccountSelectBankFragment addBankAccountSelectBankFragment = this.f4296b;
                switch (i11) {
                    case 0:
                        int i12 = AddBankAccountSelectBankFragment.f27891p0;
                        View view = addBankAccountSelectBankFragment.f27318b;
                        if (view != null) {
                            return (RoundedTextView) view.findViewById(L9.a.tvNext);
                        }
                        return null;
                    case 1:
                        int i13 = AddBankAccountSelectBankFragment.f27891p0;
                        View view2 = addBankAccountSelectBankFragment.f27318b;
                        if (view2 != null) {
                            return (ModelBankCardItem1) view2.findViewById(L9.a.bank_name_tv);
                        }
                        return null;
                    case 2:
                        int i14 = AddBankAccountSelectBankFragment.f27891p0;
                        View view3 = addBankAccountSelectBankFragment.f27318b;
                        if (view3 != null) {
                            return (TextView) view3.findViewById(L9.a.tvAccountNoError);
                        }
                        return null;
                    case 3:
                        int i15 = AddBankAccountSelectBankFragment.f27891p0;
                        View view4 = addBankAccountSelectBankFragment.f27318b;
                        if (view4 != null) {
                            return (TextView) view4.findViewById(L9.a.tvNote);
                        }
                        return null;
                    default:
                        int i16 = AddBankAccountSelectBankFragment.f27891p0;
                        View view5 = addBankAccountSelectBankFragment.f27318b;
                        if (view5 != null) {
                            return (TitleEditView) view5.findViewById(L9.a.itemAccountNo);
                        }
                        return null;
                }
            }
        });
        final int i12 = 3;
        this.f27895H = C2131j.b(new Function0(this) { // from class: Ia.b

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ AddBankAccountSelectBankFragment f4296b;

            {
                this.f4296b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                AddBankAccountSelectBankFragment addBankAccountSelectBankFragment = this.f4296b;
                switch (i12) {
                    case 0:
                        int i13 = AddBankAccountSelectBankFragment.f27891p0;
                        View view = addBankAccountSelectBankFragment.f27318b;
                        if (view != null) {
                            return (RoundedTextView) view.findViewById(L9.a.tvNext);
                        }
                        return null;
                    case 1:
                        int i14 = AddBankAccountSelectBankFragment.f27891p0;
                        View view2 = addBankAccountSelectBankFragment.f27318b;
                        if (view2 != null) {
                            return (ModelBankCardItem1) view2.findViewById(L9.a.bank_name_tv);
                        }
                        return null;
                    case 2:
                        int i15 = AddBankAccountSelectBankFragment.f27891p0;
                        View view3 = addBankAccountSelectBankFragment.f27318b;
                        if (view3 != null) {
                            return (TextView) view3.findViewById(L9.a.tvAccountNoError);
                        }
                        return null;
                    case 3:
                        int i16 = AddBankAccountSelectBankFragment.f27891p0;
                        View view4 = addBankAccountSelectBankFragment.f27318b;
                        if (view4 != null) {
                            return (TextView) view4.findViewById(L9.a.tvNote);
                        }
                        return null;
                    default:
                        int i17 = AddBankAccountSelectBankFragment.f27891p0;
                        View view5 = addBankAccountSelectBankFragment.f27318b;
                        if (view5 != null) {
                            return (TitleEditView) view5.findViewById(L9.a.itemAccountNo);
                        }
                        return null;
                }
            }
        });
        final int i13 = 4;
        this.f27896L = C2131j.b(new Function0(this) { // from class: Ia.b

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ AddBankAccountSelectBankFragment f4296b;

            {
                this.f4296b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                AddBankAccountSelectBankFragment addBankAccountSelectBankFragment = this.f4296b;
                switch (i13) {
                    case 0:
                        int i14 = AddBankAccountSelectBankFragment.f27891p0;
                        View view = addBankAccountSelectBankFragment.f27318b;
                        if (view != null) {
                            return (RoundedTextView) view.findViewById(L9.a.tvNext);
                        }
                        return null;
                    case 1:
                        int i15 = AddBankAccountSelectBankFragment.f27891p0;
                        View view2 = addBankAccountSelectBankFragment.f27318b;
                        if (view2 != null) {
                            return (ModelBankCardItem1) view2.findViewById(L9.a.bank_name_tv);
                        }
                        return null;
                    case 2:
                        int i16 = AddBankAccountSelectBankFragment.f27891p0;
                        View view3 = addBankAccountSelectBankFragment.f27318b;
                        if (view3 != null) {
                            return (TextView) view3.findViewById(L9.a.tvAccountNoError);
                        }
                        return null;
                    case 3:
                        int i17 = AddBankAccountSelectBankFragment.f27891p0;
                        View view4 = addBankAccountSelectBankFragment.f27318b;
                        if (view4 != null) {
                            return (TextView) view4.findViewById(L9.a.tvNote);
                        }
                        return null;
                    default:
                        int i18 = AddBankAccountSelectBankFragment.f27891p0;
                        View view5 = addBankAccountSelectBankFragment.f27318b;
                        if (view5 != null) {
                            return (TitleEditView) view5.findViewById(L9.a.itemAccountNo);
                        }
                        return null;
                }
            }
        });
    }

    public final void A() {
        String str;
        if (BaseApplication.isAO() || this.f27880o != null) {
            BindBankAccountReq bindBankAccountReq = new BindBankAccountReq();
            BankInfo bankInfo = this.f27880o;
            if (bankInfo == null) {
                str = null;
            } else {
                Intrinsics.e(bankInfo);
                str = bankInfo.bankCode;
            }
            bindBankAccountReq.bankCode = str;
            bindBankAccountReq.bankAccountNo = D();
            h hVar = (h) this.f27328i;
            if (hVar != null) {
                hVar.bindBankAccount(bindBankAccountReq);
            }
        }
    }

    public final void B() {
        String str;
        if (BaseApplication.isAO() || this.f27880o != null) {
            CheckCardBindNumReq checkCardBindNumReq = new CheckCardBindNumReq();
            BankInfo bankInfo = this.f27880o;
            if (bankInfo == null) {
                str = null;
            } else {
                Intrinsics.e(bankInfo);
                str = bankInfo.bankCode;
            }
            checkCardBindNumReq.setBankCode(str);
            checkCardBindNumReq.setBankAccountNo(D());
            h hVar = (h) this.f27328i;
            if (hVar != null) {
                hVar.checkCardBindNum(checkCardBindNumReq);
            }
        }
    }

    public final BankInfo C(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        for (BankInfo bankInfo : this.f27897M) {
            if (Intrinsics.c(bankInfo.bankCode, str)) {
                return bankInfo;
            }
        }
        return null;
    }

    public final String D() {
        String editText;
        TitleEditView titleEditViewE = E();
        return (titleEditViewE == null || (editText = titleEditViewE.getEditText()) == null) ? "" : editText;
    }

    public final TitleEditView E() {
        return (TitleEditView) this.f27896L.getValue();
    }

    public final TextView F() {
        return (TextView) this.f27894C.getValue();
    }

    public final void G() {
        BankInfo bankInfo = this.f27880o;
        if (bankInfo == null || !BaseApplication.isNG()) {
            return;
        }
        AddBankAccountReq addBankAccountReq = new AddBankAccountReq();
        addBankAccountReq.bankCode = bankInfo.bankCode;
        addBankAccountReq.bankAccountNo = D();
        h hVar = (h) this.f27328i;
        if (hVar != null) {
            hVar.addBankAccount(addBankAccountReq);
        }
    }

    public final void H(String str) {
        c cVar = new c(getContext());
        cVar.e(k.core_tips);
        cVar.f6598d = str;
        cVar.c(k.core_cancel, null);
        cVar.d(k.core_add_bvn, new ViewOnClickListenerC0053e(22));
        cVar.g();
    }

    public final void I() {
        boolean z3 = TextUtils.isEmpty(D()) ? false : this.f27880o != null || BaseApplication.isAO();
        RoundedTextView roundedTextView = (RoundedTextView) this.f27892A.getValue();
        if (roundedTextView != null) {
            roundedTextView.setEnabled(z3);
        }
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        TextView textView = (TextView) this.f27895H.getValue();
        if (textView != null) {
            textView.setVisibility(((editable != null ? editable.length() : 0) <= 0 || !this.f27900Y) ? 8 : 0);
        }
        I();
        this.f27881p = D();
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i7, int i10, int i11) {
    }

    @Override // com.transsnet.palmpay.core.ui.fragment.bankaccount.AddBankAccountBaseFragment, com.transsnet.palmpay.core.base.BaseFragment
    public final int h() {
        return b.core_select_bank_account_fragment;
    }

    @Override // com.transsnet.palmpay.core.ui.mvp.contract.AddBankAccountContract.IView
    public final void handleAddBankAccountResult(AddPayBankAccRsp addPayBankAccRsp) {
        if (addPayBankAccRsp != null) {
            if (!addPayBankAccRsp.isSuccess()) {
                if (CommonResult.CODE_REQUIRE_VERIFY_BVN.equals(addPayBankAccRsp.getRespCode())) {
                    String respMsg = addPayBankAccRsp.getRespMsg();
                    Intrinsics.checkNotNullExpressionValue(respMsg, "getRespMsg(...)");
                    H(respMsg);
                    return;
                } else {
                    String respMsg2 = addPayBankAccRsp.getRespMsg();
                    Intrinsics.checkNotNullExpressionValue(respMsg2, "getRespMsg(...)");
                    y(respMsg2);
                    return;
                }
            }
            if (Intrinsics.c(addPayBankAccRsp.data.verifyMethod, "ChangeName")) {
                this.f27898Q = true;
                d0.g(2, "/coreImpl/modify_real_name_alert", "extra_type").withString("extra_message", addPayBankAccRsp.getRespMsg()).withString("extra_data", addPayBankAccRsp.data.changeNameToken).navigation();
                return;
            }
            if (Intrinsics.c(addPayBankAccRsp.data.verifyMethod, ResetPinVerifyTypeRsp.VERIFY_TYPE_BVN)) {
                Fragment parentFragment = getParentFragment();
                Intrinsics.f(parentFragment, "null cannot be cast to non-null type com.transsnet.palmpay.core.ui.fragment.AddBankAccountFragment");
                BankInfo bankInfo = this.f27880o;
                Intrinsics.e(bankInfo);
                String bankAccountNo = D();
                Intrinsics.checkNotNullParameter(bankInfo, "bankInfo");
                Intrinsics.checkNotNullParameter(bankAccountNo, "bankAccountNo");
                Z childFragmentManager = ((AddBankAccountFragment) parentFragment).getChildFragmentManager();
                C1161a c1161aE = q0.e(childFragmentManager, childFragmentManager);
                c1161aE.e(L9.a.fragmentContainer, AddUbaBankAccountFragment.f27903Q.newInstance(bankInfo, bankAccountNo), null);
                c1161aE.c(null);
                c1161aE.h(true);
                return;
            }
            if (addPayBankAccRsp.data.status == 1) {
                v();
                E activity = getActivity();
                if (activity != null) {
                    activity.finish();
                    return;
                }
                return;
            }
            Fragment parentFragment2 = getParentFragment();
            Intrinsics.f(parentFragment2, "null cannot be cast to non-null type com.transsnet.palmpay.core.ui.fragment.AddBankAccountFragment");
            BankInfo bankInfo2 = this.f27880o;
            Intrinsics.e(bankInfo2);
            String bankAccountNo2 = D();
            Intrinsics.checkNotNullParameter(bankInfo2, "bankInfo");
            Intrinsics.checkNotNullParameter(bankAccountNo2, "bankAccountNo");
            Z childFragmentManager2 = ((AddBankAccountFragment) parentFragment2).getChildFragmentManager();
            C1161a c1161aE2 = q0.e(childFragmentManager2, childFragmentManager2);
            c1161aE2.e(L9.a.fragmentContainer, AddBankAccountNgFragment.f27884C.newInstance(bankInfo2, bankAccountNo2), null);
            c1161aE2.c(null);
            c1161aE2.h(true);
        }
    }

    @Override // com.transsnet.palmpay.core.ui.mvp.contract.BasePaymentContract.IView
    public final void handleBankList(List list) {
        SelectBankDialogV2 selectBankDialogV2;
        if (list != null) {
            this.f27897M = list;
            SelectBankDialogV2 selectBankDialogV3 = this.f27901Z;
            if (selectBankDialogV3 == null || !selectBankDialogV3.isShowing() || (selectBankDialogV2 = this.f27901Z) == null) {
                return;
            }
            selectBankDialogV2.setBankCardInfos(this.f27897M);
        }
    }

    @Override // com.transsnet.palmpay.core.ui.mvp.contract.AddBankAccountContract.IView
    public final void handleBindResult(BindActionRsp response) {
        Intrinsics.checkNotNullParameter(response, "response");
        if (response.isSuccess()) {
            if (!TextUtils.isEmpty(response.token)) {
                d0.g(2, "/coreImpl/modify_real_name_alert", "extra_type").withString("extra_message", response.getRespMsg()).withString("extra_data", response.token).navigation();
                return;
            }
            v();
            if (SPUtils.getInstance().getInt("KEY_WITHDRAW_ACCOUNT_NUM") <= 0) {
                SPUtils.getInstance().put("KEY_WITHDRAW_ACCOUNT_NUM", 1);
            }
            org.greenrobot.eventbus.c.b().f(new MessageEvent(9, ""));
            ARouter.getInstance().build("/core/common_result").withInt("extra_result", 1).withString("extra_title", getString(k.core_success)).withString("extra_message", getString(k.core_msg_bind_account_success)).withString("extra_Btn1Text", getString(k.core_complete)).withInt("extra_Btn1Text_action", 1).withBoolean("extra_flag", true).navigation();
            return;
        }
        if (CommonResult.CODE_BANK_CARD_NAME_NOT_MATCH_AUTHEN_NAME.equalsIgnoreCase(response.getRespCode())) {
            q(response.getRespMsg(), getResources().getString(k.core_try_again), getResources().getString(k.core_cancel));
            Unit unit = Unit.f38893a;
            return;
        }
        Postcard postcardWithString = d0.g(3, "/core/common_result", "extra_result").withString("extra_title", getString(k.core_failed)).withString("extra_message", response.getRespMsg()).withString("extra_Btn1Text", getString(k.core_try_again)).withInt("extra_Btn1Text_action", 1).withString("extra_Btn2Text", getString(k.core_cancel));
        postcardWithString.withInt("extra_Btn2Text_action", 5);
        Activity parentActivity = ActivityUtils.getParentActivity(requireActivity());
        if (parentActivity != null) {
            postcardWithString.withString("extra_Btn2Text_page", parentActivity.getClass().getName());
        }
        postcardWithString.navigation();
    }

    @Override // com.transsnet.palmpay.core.ui.mvp.contract.AddBankAccountContract.IView
    public final void handleCheckCardBindNum(CommonResult commonResult) {
        super.handleCheckCardBindNum(commonResult);
        if (commonResult == null || !commonResult.isSuccess()) {
            Intrinsics.e(commonResult);
            String respMsg = commonResult.getRespMsg();
            Intrinsics.checkNotNullExpressionValue(respMsg, "getRespMsg(...)");
            y(respMsg);
            return;
        }
        if (this.f27899X) {
            A();
            return;
        }
        try {
            startActivityForResult(i0.q(getContext()), 91);
        } catch (Exception e10) {
            d.c(this.f27317a, "clickNext: ", e10);
        }
    }

    @Override // com.transsnet.palmpay.core.ui.mvp.contract.AddBankAccountContract.IView
    public final void handleCheckInputBankAccountInfoRsp(CheckBankCardInfoReq checkBankCardInfoReq, final CheckBankCardInfoRsp checkBankCardInfoRsp) {
        if (this.f27900Y) {
            if (checkBankCardInfoRsp != null) {
                if (!checkBankCardInfoRsp.isSuccess()) {
                    String respMsg = checkBankCardInfoRsp.getRespMsg();
                    Intrinsics.checkNotNullExpressionValue(respMsg, "getRespMsg(...)");
                    y(respMsg);
                    return;
                }
                if (checkBankCardInfoRsp.data == null) {
                    B();
                    return;
                }
                Intrinsics.e(checkBankCardInfoReq);
                if (Intrinsics.c(checkBankCardInfoReq.bankCode, checkBankCardInfoRsp.data.bankCode)) {
                    B();
                    return;
                }
                c cVar = new c(getContext());
                cVar.e(k.core_title_attention);
                cVar.f6605k = true;
                cVar.b(k.core_msg_wrong_bank_selected);
                final int i7 = 0;
                cVar.d(k.core_yes, new View.OnClickListener(this) { // from class: Ia.a

                    /* JADX INFO: renamed from: b, reason: collision with root package name */
                    public final /* synthetic */ AddBankAccountSelectBankFragment f4293b;

                    {
                        this.f4293b = this;
                    }

                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        AddBankAccountSelectBankFragment addBankAccountSelectBankFragment = this.f4293b;
                        CheckBankCardInfoRsp checkBankCardInfoRsp2 = checkBankCardInfoRsp;
                        switch (i7) {
                            case 0:
                                int i10 = AddBankAccountSelectBankFragment.f27891p0;
                                BankInfo bankInfoC = addBankAccountSelectBankFragment.C(checkBankCardInfoRsp2.data.bankCode);
                                if (bankInfoC != null) {
                                    addBankAccountSelectBankFragment.f27880o = bankInfoC;
                                    ModelBankInfoItem modelBankInfoItem = addBankAccountSelectBankFragment.t;
                                    Intrinsics.e(modelBankInfoItem);
                                    modelBankInfoItem.setBankCardInfo(addBankAccountSelectBankFragment.f27880o);
                                }
                                addBankAccountSelectBankFragment.B();
                                break;
                            default:
                                int i11 = AddBankAccountSelectBankFragment.f27891p0;
                                BankInfo bankInfoC2 = addBankAccountSelectBankFragment.C(checkBankCardInfoRsp2.data.bankCode);
                                if (bankInfoC2 != null) {
                                    addBankAccountSelectBankFragment.f27880o = bankInfoC2;
                                }
                                addBankAccountSelectBankFragment.G();
                                break;
                        }
                    }
                });
                cVar.c(k.core_no, null);
                cVar.g();
                return;
            }
            return;
        }
        if (checkBankCardInfoRsp != null) {
            if (!checkBankCardInfoRsp.isSuccess()) {
                if (CommonResult.CODE_REQUIRE_VERIFY_BVN.equals(checkBankCardInfoRsp.getRespCode())) {
                    String respMsg2 = checkBankCardInfoRsp.getRespMsg();
                    Intrinsics.checkNotNullExpressionValue(respMsg2, "getRespMsg(...)");
                    H(respMsg2);
                    return;
                } else {
                    String respMsg3 = checkBankCardInfoRsp.getRespMsg();
                    Intrinsics.checkNotNullExpressionValue(respMsg3, "getRespMsg(...)");
                    y(respMsg3);
                    return;
                }
            }
            if (checkBankCardInfoRsp.data == null) {
                G();
                return;
            }
            Intrinsics.e(checkBankCardInfoReq);
            if (Intrinsics.c(checkBankCardInfoReq.bankCode, checkBankCardInfoRsp.data.bankCode)) {
                G();
                return;
            }
            c cVar2 = new c(getContext());
            cVar2.e(k.core_title_attention);
            cVar2.f6605k = true;
            cVar2.b(k.core_msg_wrong_bank_selected);
            final int i10 = 1;
            cVar2.d(k.core_yes, new View.OnClickListener(this) { // from class: Ia.a

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final /* synthetic */ AddBankAccountSelectBankFragment f4293b;

                {
                    this.f4293b = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    AddBankAccountSelectBankFragment addBankAccountSelectBankFragment = this.f4293b;
                    CheckBankCardInfoRsp checkBankCardInfoRsp2 = checkBankCardInfoRsp;
                    switch (i10) {
                        case 0:
                            int i11 = AddBankAccountSelectBankFragment.f27891p0;
                            BankInfo bankInfoC = addBankAccountSelectBankFragment.C(checkBankCardInfoRsp2.data.bankCode);
                            if (bankInfoC != null) {
                                addBankAccountSelectBankFragment.f27880o = bankInfoC;
                                ModelBankInfoItem modelBankInfoItem = addBankAccountSelectBankFragment.t;
                                Intrinsics.e(modelBankInfoItem);
                                modelBankInfoItem.setBankCardInfo(addBankAccountSelectBankFragment.f27880o);
                            }
                            addBankAccountSelectBankFragment.B();
                            break;
                        default:
                            int i12 = AddBankAccountSelectBankFragment.f27891p0;
                            BankInfo bankInfoC2 = addBankAccountSelectBankFragment.C(checkBankCardInfoRsp2.data.bankCode);
                            if (bankInfoC2 != null) {
                                addBankAccountSelectBankFragment.f27880o = bankInfoC2;
                            }
                            addBankAccountSelectBankFragment.G();
                            break;
                    }
                }
            });
            cVar2.c(k.core_no, null);
            cVar2.g();
        }
    }

    @Override // com.transsnet.palmpay.core.ui.mvp.contract.AddBankAccountContract.IView
    public final void handlePaymentMethods(List list) {
        this.f27902k0 = list;
        SelectBankDialogV2 selectBankDialogV2 = this.f27901Z;
        if (selectBankDialogV2 == null || !selectBankDialogV2.isShowing()) {
            return;
        }
        SelectBankDialogV2 selectBankDialogV3 = this.f27901Z;
        if (selectBankDialogV3 != null) {
            selectBankDialogV3.setPayBankAccount(this.f27902k0);
        }
        SelectBankDialogV2 selectBankDialogV4 = this.f27901Z;
        if (selectBankDialogV4 != null) {
            selectBankDialogV4.setBankCardInfos(this.f27897M);
        }
    }

    @Override // com.transsnet.palmpay.core.ui.fragment.bankaccount.AddBankAccountBaseFragment, com.transsnet.palmpay.core.base.BaseFragment
    public final int k() {
        ModelBankCardItem1 modelBankCardItem1;
        if (BaseApplication.isAO() && (modelBankCardItem1 = (ModelBankCardItem1) this.f27893B.getValue()) != null) {
            modelBankCardItem1.setVisibility(8);
        }
        I();
        return 0;
    }

    @Override // com.transsnet.palmpay.core.base.BaseMVPFragment, com.transsnet.palmpay.core.base.BaseFragment
    public final void n() {
        super.n();
        if (BaseApplication.isAO()) {
            return;
        }
        if (!this.f27900Y) {
            h hVar = (h) this.f27328i;
            if (hVar != null) {
                hVar.queryBankList(new QueryBankListReq(4, 1));
                return;
            }
            return;
        }
        h hVar2 = (h) this.f27328i;
        if (hVar2 != null) {
            hVar2.queryBankList(new QueryBankListReq(2));
        }
        h hVar3 = (h) this.f27328i;
        if (hVar3 != null) {
            hVar3.queryPaymentMethod();
        }
    }

    @Override // com.transsnet.palmpay.core.ui.fragment.bankaccount.AddBankAccountBaseFragment, com.transsnet.palmpay.core.base.BaseFragment
    public final int o() {
        TextView titleView;
        TextView titleView2;
        super.o();
        Bundle arguments = getArguments();
        if (arguments != null) {
            this.f27900Y = arguments.getBoolean("me_bind_bank_card", false);
        }
        ModelBankInfoItem modelBankInfoItem = this.t;
        if (modelBankInfoItem != null) {
            modelBankInfoItem.f28272j.setText(k.core_select_bank_text);
            modelBankInfoItem.f28266c.setImageResource(r.cv_bank_account);
            modelBankInfoItem.e(false);
            modelBankInfoItem.f28267d.addTextChangedListener(this);
            modelBankInfoItem.setOnClickListener(this);
        }
        TitleEditView titleEditViewE = E();
        if (titleEditViewE != null && (titleView2 = titleEditViewE.getTitleView()) != null) {
            titleView2.setTextSize(0.0f);
        }
        TitleEditView titleEditViewE2 = E();
        if (titleEditViewE2 != null && (titleView = titleEditViewE2.getTitleView()) != null) {
            titleView.setTextColor(requireContext().getColor(p.cv_color_263138));
        }
        TitleEditView titleEditViewE3 = E();
        if (titleEditViewE3 != null) {
            titleEditViewE3.setEdittextBackGround(null);
        }
        RoundedTextView roundedTextView = (RoundedTextView) this.f27892A.getValue();
        if (roundedTextView != null) {
            roundedTextView.setOnClickListener(this);
        }
        boolean zIsAO = BaseApplication.isAO();
        t tVar = this.f27893B;
        if (zIsAO) {
            ModelBankCardItem1 modelBankCardItem1 = (ModelBankCardItem1) tVar.getValue();
            if (modelBankCardItem1 != null) {
                modelBankCardItem1.setVisibility(8);
            }
            TitleEditView titleEditViewE4 = E();
            if (titleEditViewE4 != null) {
                titleEditViewE4.setInputFilter(new InputFilter[0]);
            }
            TitleEditView titleEditViewE5 = E();
            if (titleEditViewE5 != null) {
                titleEditViewE5.setInputType(1);
            }
        }
        TitleEditView titleEditViewE6 = E();
        if (titleEditViewE6 != null) {
            titleEditViewE6.f31176u0 = this;
        }
        ModelBankCardItem1 modelBankCardItem2 = (ModelBankCardItem1) tVar.getValue();
        if (modelBankCardItem2 != null) {
            modelBankCardItem2.setOnClickListener(this);
        }
        SelectBankDialogV2 selectBankDialogV2 = new SelectBankDialogV2(requireContext());
        this.f27901Z = selectBankDialogV2;
        selectBankDialogV2.setCallBack(new Ia.c(this));
        return 0;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onActivityResult(int i7, int i10, Intent intent) {
        super.onActivityResult(i7, i10, intent);
        if (i7 == 91) {
            if (i10 == -1) {
                this.f27899X = true;
                A();
                return;
            }
            return;
        }
        if (i7 == 100 && i10 == -1) {
            Intrinsics.e(intent);
            onChooseBankClick((BankInfo) intent.getParcelableExtra("BANK_CARD_INFO"));
        }
    }

    @Override // com.transsnet.palmpay.core.dialog.SelectBankDialog.CallBack
    public final void onChooseBankClick(BankInfo bankInfo) {
        ModelBankCardItem1 modelBankCardItem1;
        this.f27880o = bankInfo;
        if (bankInfo != null && (modelBankCardItem1 = (ModelBankCardItem1) this.f27893B.getValue()) != null) {
            modelBankCardItem1.setBankInfo(bankInfo);
        }
        I();
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        SelectBankDialogV2 selectBankDialogV2;
        if (view != null) {
            int id2 = view.getId();
            if (id2 == L9.a.itemBankInfo) {
                startActivityForResult(F.c(getContext(), ARouter.getInstance().build("/sm/select_bank_activity").withInt("bank_list_type", 4).withInt("extra_type", 1)), 100);
                return;
            }
            if (id2 != L9.a.tvNext) {
                if (id2 == L9.a.bank_name_tv) {
                    if (!this.f27900Y) {
                        startActivityForResult(F.c(getContext(), ARouter.getInstance().build("/sm/select_bank_activity").withInt("bank_list_type", 4).withInt("extra_type", 1)), 100);
                        return;
                    }
                    BankInfo bankInfo = this.f27880o;
                    if (bankInfo != null && (selectBankDialogV2 = this.f27901Z) != null) {
                        selectBankDialogV2.initNowSelectedBankCard(bankInfo);
                    }
                    SelectBankDialogV2 selectBankDialogV3 = this.f27901Z;
                    if (selectBankDialogV3 != null) {
                        selectBankDialogV3.show();
                    }
                    List list = this.f27897M;
                    if (list != null && list.isEmpty()) {
                        SelectBankDialogV2 selectBankDialogV4 = this.f27901Z;
                        if (selectBankDialogV4 != null) {
                            selectBankDialogV4.setLoading();
                            return;
                        }
                        return;
                    }
                    SelectBankDialogV2 selectBankDialogV5 = this.f27901Z;
                    if (selectBankDialogV5 != null) {
                        selectBankDialogV5.setBankCardInfos(this.f27897M);
                    }
                    SelectBankDialogV2 selectBankDialogV6 = this.f27901Z;
                    if (selectBankDialogV6 != null) {
                        selectBankDialogV6.setPayBankAccount(this.f27902k0);
                        return;
                    }
                    return;
                }
                return;
            }
            if (!this.f27900Y) {
                String strD = D();
                if (TextUtils.isEmpty(strD)) {
                    TitleEditView titleEditViewE = E();
                    if (titleEditViewE != null) {
                        titleEditViewE.setError(getString(k.core_invalid_bank_account_number));
                    }
                    TextView textViewF = F();
                    if (textViewF != null) {
                        textViewF.setText(getString(k.core_invalid_bank_account_number));
                    }
                    TextView textViewF2 = F();
                    if (textViewF2 != null) {
                        textViewF2.setVisibility(0);
                        return;
                    }
                    return;
                }
                if (BaseApplication.isNG() && strD.length() != 10) {
                    TitleEditView titleEditViewE2 = E();
                    if (titleEditViewE2 != null) {
                        titleEditViewE2.setError(getString(k.core_invalid_bank_account_number));
                    }
                    TextView textViewF3 = F();
                    if (textViewF3 != null) {
                        textViewF3.setText(getString(k.core_invalid_bank_account_number));
                    }
                    TextView textViewF4 = F();
                    if (textViewF4 != null) {
                        textViewF4.setVisibility(0);
                        return;
                    }
                    return;
                }
                TextView textViewF5 = F();
                if (textViewF5 != null) {
                    textViewF5.setVisibility(8);
                }
            }
            BankInfo bankInfo2 = this.f27880o;
            if (bankInfo2 != null) {
                CheckBankCardInfoReq checkBankCardInfoReq = new CheckBankCardInfoReq(1, D(), bankInfo2.bankCode, "1");
                h hVar = (h) this.f27328i;
                if (hVar != null) {
                    hVar.checkInputBankAccountInfo(checkBankCardInfoReq);
                }
            }
        }
    }

    @Override // com.transsnet.palmpay.core.base.BaseFragment, androidx.fragment.app.Fragment
    public final void onResume() {
        TitleEditView titleEditViewE;
        super.onResume();
        if (this.f27898Q) {
            if (BaseApplication.getInstance().getUser().isAuthenticated()) {
                G();
            }
            this.f27898Q = false;
        }
        BankInfo bankInfo = this.f27880o;
        if (bankInfo != null) {
            onChooseBankClick(bankInfo);
        }
        String str = this.f27881p;
        if (str == null || (titleEditViewE = E()) == null) {
            return;
        }
        titleEditViewE.setEditText(str);
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i7, int i10, int i11) {
        EditText editTextView;
        TextView textViewF = F();
        if (textViewF != null) {
            textViewF.setVisibility(8);
        }
        TitleEditView titleEditViewE = E();
        if (titleEditViewE == null || (editTextView = titleEditViewE.getEditTextView()) == null) {
            return;
        }
        editTextView.setTypeface(Typeface.create(TextUtils.isEmpty(StringsKt.V(String.valueOf(charSequence)).toString()) ? "sans-serif" : "sans-serif-medium", 0));
    }

    @Override // com.transsnet.palmpay.core.ui.fragment.bankaccount.AddBankAccountBaseFragment, com.transsnet.palmpay.core.base.BaseMVPFragment
    public final IBasePresenter t() {
        return new h();
    }

    @Override // com.transsnet.palmpay.core.ui.fragment.bankaccount.AddBankAccountBaseFragment
    /* JADX INFO: renamed from: u */
    public final h t() {
        return new h();
    }
}
