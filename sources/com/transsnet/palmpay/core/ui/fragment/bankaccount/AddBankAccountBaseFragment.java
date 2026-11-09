package com.transsnet.palmpay.core.ui.fragment.bankaccount;

import F6.d;
import Gb.L;
import La.h;
import Pa.r0;
import android.os.Bundle;
import android.text.TextUtils;
import androidx.fragment.app.E;
import com.transsnet.palmpay.core.base.BaseMVPFragment;
import com.transsnet.palmpay.core.bean.BankInfo;
import com.transsnet.palmpay.core.bean.PaymentMethod;
import com.transsnet.palmpay.core.bean.message.MessageEvent;
import com.transsnet.palmpay.core.ui.activity.AddNewBankAccountActivity;
import com.transsnet.palmpay.core.ui.mvp.contract.AddBankAccountContract;
import com.transsnet.palmpay.core.viewmodel.ModelBankInfoItem;
import com.transsnet.palmpay.custom_view.TitleEditView;
import com.transsnet.palmpay.custom_view.model.ModelSendSms;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.greenrobot.eventbus.c;
import p025ba.k;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0016\u0018\u00002\u000e\u0012\n\u0012\b\u0012\u0002\b\u0003\u0018\u00010\u00020\u00012\u00020\u0003:\u0001\u0006B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0007"}, d2 = {"Lcom/transsnet/palmpay/core/ui/fragment/bankaccount/AddBankAccountBaseFragment;", "Lcom/transsnet/palmpay/core/base/BaseMVPFragment;", "LLa/h;", "Lcom/transsnet/palmpay/core/ui/mvp/contract/AddBankAccountContract$IView;", "<init>", "()V", "a", "module_common_impl_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public class AddBankAccountBaseFragment extends BaseMVPFragment<h> implements AddBankAccountContract.IView {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public L f27879j;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public BankInfo f27880o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public String f27881p;
    public ModelBankInfoItem t;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public TitleEditView f27882v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public ModelSendSms f27883w;

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

    @Override // com.transsnet.palmpay.core.base.BaseFragment
    public int h() {
        return 0;
    }

    @Override // com.transsnet.palmpay.core.base.BaseFragment
    public int k() {
        return 0;
    }

    @Override // com.transsnet.palmpay.core.base.BaseFragment
    public int o() {
        BankInfo bankInfo;
        Bundle arguments = getArguments();
        if (arguments != null) {
            this.f27880o = (BankInfo) arguments.getParcelable("bank_info");
            this.f27881p = arguments.getString("account_no");
        }
        ModelBankInfoItem modelBankInfoItem = this.t;
        if (modelBankInfoItem != null && (bankInfo = this.f27880o) != null) {
            modelBankInfoItem.f28267d.setText(bankInfo.bankName);
            r0.o1(bankInfo.bankUrl, modelBankInfoItem.f28266c);
        }
        TitleEditView titleEditView = this.f27882v;
        if (titleEditView == null) {
            return 0;
        }
        titleEditView.setEditText(this.f27881p);
        return 0;
    }

    @Override // com.transsnet.palmpay.core.base.BaseMVPFragment
    /* JADX INFO: renamed from: u, reason: merged with bridge method [inline-methods] */
    public h t() {
        return new h();
    }

    public final void v() {
        MessageEvent messageEvent = new MessageEvent(MessageEvent.BIND_PAY_BANK_ACCOUNT_SUCCESS);
        PaymentMethod paymentMethod = new PaymentMethod();
        paymentMethod.payType = 7;
        paymentMethod.senderAccountType = 6;
        paymentMethod.reUseable = 0;
        if (TextUtils.isEmpty(this.f27881p)) {
            TitleEditView titleEditView = this.f27882v;
            if (titleEditView != null) {
                paymentMethod.bankAccountNo = titleEditView.getEditText();
                TitleEditView titleEditView2 = this.f27882v;
                paymentMethod.cardNo = titleEditView2 != null ? titleEditView2.getEditText() : null;
            }
        } else {
            String str = this.f27881p;
            paymentMethod.bankAccountNo = str;
            paymentMethod.cardNo = str;
        }
        BankInfo bankInfo = this.f27880o;
        if (bankInfo != null) {
            paymentMethod.bankCode = bankInfo.bankCode;
            paymentMethod.bankName = bankInfo.bankName;
            paymentMethod.bankUrl = bankInfo.bankUrl;
        }
        messageEvent.setEventObj(paymentMethod);
        if (getActivity() instanceof AddNewBankAccountActivity) {
            E activity = getActivity();
            Intrinsics.f(activity, "null cannot be cast to non-null type com.transsnet.palmpay.core.ui.activity.AddNewBankAccountActivity");
            messageEvent.setEventContent(((AddNewBankAccountActivity) activity).f27420c);
        }
        c.b().f(messageEvent);
    }

    public final String w() {
        try {
            return x().f31581d.getEditableText().toString();
        } catch (Exception e10) {
            d.c(this.f27317a, "getInputOTP: ", e10);
            return "";
        }
    }

    public final ModelSendSms x() {
        ModelSendSms modelSendSms = this.f27883w;
        if (modelSendSms != null) {
            return modelSendSms;
        }
        Intrinsics.n("mModelSendSms");
        throw null;
    }

    public final void y(CharSequence message) {
        Intrinsics.checkNotNullParameter(message, "message");
        O6.c cVar = new O6.c(getContext());
        cVar.e(k.core_title_attention);
        cVar.f6605k = true;
        cVar.f6598d = message;
        cVar.d(k.core_confirm, null);
        O6.d dVarA = cVar.a();
        dVarA.setCanceledOnTouchOutside(false);
        dVarA.setCancelable(false);
        dVarA.show();
    }

    public final void z() {
        x().f31582e.setTag(Boolean.TRUE);
        L l5 = this.f27879j;
        if (l5 != null) {
            l5.cancel();
            x().f31582e.setTag(Boolean.FALSE);
            this.f27879j = null;
        }
        L l6 = new L(this, 3);
        this.f27879j = l6;
        l6.start();
    }
}
