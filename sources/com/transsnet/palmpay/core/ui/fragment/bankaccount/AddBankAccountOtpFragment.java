package com.transsnet.palmpay.core.ui.fragment.bankaccount;

import Ae.j;
import L9.b;
import La.h;
import Tb.c;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.view.View;
import android.widget.TextView;
import androidx.fragment.app.E;
import com.transsnet.palmpay.core.bean.BankInfo;
import com.transsnet.palmpay.core.bean.req.AddBankAccSendOtpReq;
import com.transsnet.palmpay.core.bean.req.AddBankAccountReq;
import com.transsnet.palmpay.core.bean.rsp.AddBankAccSendOtpRsp;
import com.transsnet.palmpay.core.bean.rsp.AddPayBankAccRsp;
import com.transsnet.palmpay.custom_view.model.ModelSendSms;
import com.transsnet.palmpay.custom_view.s;
import com.transsnet.palmpay.util.ToastUtils;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p025ba.k;
import p355xf.C2131j;
import p355xf.t;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003:\u0001\u0006B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0007"}, d2 = {"Lcom/transsnet/palmpay/core/ui/fragment/bankaccount/AddBankAccountOtpFragment;", "Lcom/transsnet/palmpay/core/ui/fragment/bankaccount/AddBankAccountBaseFragment;", "Landroid/text/TextWatcher;", "Landroid/view/View$OnClickListener;", "<init>", "()V", "a", "module_common_impl_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class AddBankAccountOtpFragment extends AddBankAccountBaseFragment implements TextWatcher, View.OnClickListener {

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    public static final a f27887H = new a(null);

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public final t f27888A = C2131j.b(new j(this, 22));

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public String f27889B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public AddBankAccSendOtpReq f27890C;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final AddBankAccountOtpFragment newInstance(@NotNull AddBankAccSendOtpReq req, @Nullable BankInfo bankInfo, @Nullable String str) {
            Intrinsics.checkNotNullParameter(req, "req");
            AddBankAccountOtpFragment addBankAccountOtpFragment = new AddBankAccountOtpFragment();
            Bundle bundle = new Bundle();
            bundle.putParcelable("otp_req", req);
            if (bankInfo != null) {
                bundle.putParcelable("bank_info", bankInfo);
            }
            if (str != null) {
                bundle.putString("account_no", str);
            }
            addBankAccountOtpFragment.setArguments(bundle);
            return addBankAccountOtpFragment;
        }

        private a() {
        }
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        boolean z3 = !TextUtils.isEmpty(w());
        TextView textView = (TextView) this.f27888A.getValue();
        if (textView != null) {
            textView.setEnabled(z3);
        }
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i7, int i10, int i11) {
    }

    @Override // com.transsnet.palmpay.core.ui.fragment.bankaccount.AddBankAccountBaseFragment, com.transsnet.palmpay.core.base.BaseFragment
    public final int h() {
        return b.core_fragment_add_bank_account_otp;
    }

    @Override // com.transsnet.palmpay.core.ui.mvp.contract.AddBankAccountContract.IView
    public final void handleAddBankAccountResult(AddPayBankAccRsp response) {
        Intrinsics.checkNotNullParameter(response, "response");
        if (!response.isSuccess()) {
            ToastUtils.showLong(response.getRespMsg(), new Object[0]);
            return;
        }
        int i7 = response.data.status;
        if (i7 == 1) {
            v();
            E activity = getActivity();
            if (activity != null) {
                activity.finish();
                return;
            }
            return;
        }
        if (i7 == 0) {
            String string = getString(k.core_operation_fail);
            Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
            y(string);
        }
    }

    @Override // com.transsnet.palmpay.core.ui.mvp.contract.AddBankAccountContract.IView
    public final void handleOtpResult(AddBankAccSendOtpRsp response) {
        Intrinsics.checkNotNullParameter(response, "response");
        if (!response.isSuccess() || response.getData() == null) {
            ToastUtils.showLong(response.getRespMsg(), new Object[0]);
        } else {
            this.f27889B = response.getData().getReference();
            z();
        }
        boolean z3 = !TextUtils.isEmpty(w());
        TextView textView = (TextView) this.f27888A.getValue();
        if (textView != null) {
            textView.setEnabled(z3);
        }
    }

    @Override // com.transsnet.palmpay.core.ui.fragment.bankaccount.AddBankAccountBaseFragment, com.transsnet.palmpay.core.base.BaseFragment
    public final int k() {
        return 0;
    }

    @Override // com.transsnet.palmpay.core.base.BaseMVPFragment, com.transsnet.palmpay.core.base.BaseFragment
    public final void n() {
        h hVar;
        super.n();
        AddBankAccSendOtpReq addBankAccSendOtpReq = this.f27890C;
        if (addBankAccSendOtpReq == null || (hVar = (h) this.f27328i) == null) {
            return;
        }
        hVar.addBankAccountSendOtp(addBankAccSendOtpReq);
    }

    @Override // com.transsnet.palmpay.core.ui.fragment.bankaccount.AddBankAccountBaseFragment, com.transsnet.palmpay.core.base.BaseFragment
    public final int o() {
        Bundle arguments = getArguments();
        if (arguments != null) {
            this.f27890C = (AddBankAccSendOtpReq) arguments.getParcelable("otp_req");
        }
        ModelSendSms modelSendSms = (ModelSendSms) this.f27318b.findViewById(L9.a.itemMobileSms);
        Intrinsics.checkNotNullParameter(modelSendSms, "<set-?>");
        this.f27883w = modelSendSms;
        super.o();
        x().setNeedInputPhoneNumber(false);
        x().f31581d.setInputType(2);
        x().f31582e.setOnClickListener(this);
        x().f31581d.addTextChangedListener(this);
        x().f31581d.setFilters(new c[]{new c(10, 0)});
        TextView textView = (TextView) this.f27888A.getValue();
        if (textView != null) {
            textView.setOnClickListener(this);
        }
        return 0;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        AddBankAccSendOtpReq addBankAccSendOtpReq;
        h hVar;
        if (view != null) {
            int id2 = view.getId();
            if (id2 != L9.a.tvNext) {
                if (id2 != s.tt_send_sms_text || (addBankAccSendOtpReq = this.f27890C) == null || (hVar = (h) this.f27328i) == null) {
                    return;
                }
                hVar.addBankAccountSendOtp(addBankAccSendOtpReq);
                return;
            }
            if (TextUtils.isEmpty(this.f27889B)) {
                ToastUtils.showLong(getString(k.core_msg_send_otp_first), new Object[0]);
                return;
            }
            AddBankAccountReq addBankAccountReq = new AddBankAccountReq();
            BankInfo bankInfo = this.f27880o;
            addBankAccountReq.bankCode = bankInfo != null ? bankInfo.bankCode : null;
            addBankAccountReq.bankAccountNo = this.f27881p;
            addBankAccountReq.reference = this.f27889B;
            addBankAccountReq.otp = w();
            AddBankAccSendOtpReq addBankAccSendOtpReq2 = this.f27890C;
            if (addBankAccSendOtpReq2 != null) {
                addBankAccountReq.bvn = addBankAccSendOtpReq2.bvn;
                addBankAccountReq.birth = addBankAccSendOtpReq2.birth;
            }
            h hVar2 = (h) this.f27328i;
            if (hVar2 != null) {
                hVar2.addBankAccount(addBankAccountReq);
            }
        }
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i7, int i10, int i11) {
    }
}
