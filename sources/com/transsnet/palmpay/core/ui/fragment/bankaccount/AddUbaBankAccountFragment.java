package com.transsnet.palmpay.core.ui.fragment.bankaccount;

import L9.b;
import android.content.Context;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.view.View;
import android.widget.TextView;
import androidx.fragment.app.C1161a;
import androidx.fragment.app.E;
import androidx.fragment.app.Z;
import com.transsnet.palmpay.core.base.BaseApplication;
import com.transsnet.palmpay.core.bean.BankInfo;
import com.transsnet.palmpay.core.bean.req.AddBankAccSendOtpReq;
import com.transsnet.palmpay.core.bean.req.AddBankAccountReq;
import com.transsnet.palmpay.core.bean.rsp.AddPayBankAccRsp;
import com.transsnet.palmpay.core.db.entity.User;
import com.transsnet.palmpay.core.ui.activity.AddNewBankAccountActivity;
import com.transsnet.palmpay.core.ui.fragment.bankaccount.AddUbaBankAccountFragment;
import com.transsnet.palmpay.core.viewmodel.ModelBankInfoItem;
import com.transsnet.palmpay.custom_view.TitleEditView;
import com.transsnet.palmpay.custom_view.dialog.DatePickDialog;
import com.transsnet.palmpay.custom_view.utils.CommonViewExtKt;
import com.transsnet.palmpay.util.ToastUtils;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.y;
import org.jetbrains.annotations.NotNull;
import p025ba.k;
import p220oa.h;
import p355xf.C2131j;
import p355xf.t;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003:\u0001\u0006B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0007"}, d2 = {"Lcom/transsnet/palmpay/core/ui/fragment/bankaccount/AddUbaBankAccountFragment;", "Lcom/transsnet/palmpay/core/ui/fragment/bankaccount/AddBankAccountBaseFragment;", "Landroid/text/TextWatcher;", "Landroid/view/View$OnClickListener;", "<init>", "()V", "a", "module_common_impl_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class AddUbaBankAccountFragment extends AddBankAccountBaseFragment implements TextWatcher, View.OnClickListener {

    /* JADX INFO: renamed from: Q, reason: collision with root package name */
    public static final a f27903Q = new a(null);

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public final t f27904A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public final t f27905B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public final t f27906C;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    public DatePickDialog f27907H;

    /* JADX INFO: renamed from: L, reason: collision with root package name */
    public Calendar f27908L;

    /* JADX INFO: renamed from: M, reason: collision with root package name */
    public AddBankAccSendOtpReq f27909M;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final AddUbaBankAccountFragment newInstance(@NotNull BankInfo bankInfo, @NotNull String bankAccountNo) {
            Intrinsics.checkNotNullParameter(bankInfo, "bankInfo");
            Intrinsics.checkNotNullParameter(bankAccountNo, "bankAccountNo");
            AddUbaBankAccountFragment addUbaBankAccountFragment = new AddUbaBankAccountFragment();
            Bundle bundle = new Bundle();
            bundle.putParcelable("bank_info", bankInfo);
            bundle.putString("account_no", bankAccountNo);
            addUbaBankAccountFragment.setArguments(bundle);
            return addUbaBankAccountFragment;
        }

        private a() {
        }
    }

    public AddUbaBankAccountFragment() {
        final int i7 = 0;
        this.f27904A = C2131j.b(new Function0(this) { // from class: Ia.d

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ AddUbaBankAccountFragment f4299b;

            {
                this.f4299b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                AddUbaBankAccountFragment addUbaBankAccountFragment = this.f4299b;
                switch (i7) {
                    case 0:
                        AddUbaBankAccountFragment.a aVar = AddUbaBankAccountFragment.f27903Q;
                        View view = addUbaBankAccountFragment.f27318b;
                        if (view != null) {
                            return view.findViewById(L9.a.tvNext);
                        }
                        return null;
                    case 1:
                        AddUbaBankAccountFragment.a aVar2 = AddUbaBankAccountFragment.f27903Q;
                        View view2 = addUbaBankAccountFragment.f27318b;
                        if (view2 != null) {
                            return (TitleEditView) view2.findViewById(L9.a.itemBVN);
                        }
                        return null;
                    default:
                        AddUbaBankAccountFragment.a aVar3 = AddUbaBankAccountFragment.f27903Q;
                        View view3 = addUbaBankAccountFragment.f27318b;
                        if (view3 != null) {
                            return (TitleEditView) view3.findViewById(L9.a.itemBirth);
                        }
                        return null;
                }
            }
        });
        final int i10 = 1;
        this.f27905B = C2131j.b(new Function0(this) { // from class: Ia.d

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ AddUbaBankAccountFragment f4299b;

            {
                this.f4299b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                AddUbaBankAccountFragment addUbaBankAccountFragment = this.f4299b;
                switch (i10) {
                    case 0:
                        AddUbaBankAccountFragment.a aVar = AddUbaBankAccountFragment.f27903Q;
                        View view = addUbaBankAccountFragment.f27318b;
                        if (view != null) {
                            return view.findViewById(L9.a.tvNext);
                        }
                        return null;
                    case 1:
                        AddUbaBankAccountFragment.a aVar2 = AddUbaBankAccountFragment.f27903Q;
                        View view2 = addUbaBankAccountFragment.f27318b;
                        if (view2 != null) {
                            return (TitleEditView) view2.findViewById(L9.a.itemBVN);
                        }
                        return null;
                    default:
                        AddUbaBankAccountFragment.a aVar3 = AddUbaBankAccountFragment.f27903Q;
                        View view3 = addUbaBankAccountFragment.f27318b;
                        if (view3 != null) {
                            return (TitleEditView) view3.findViewById(L9.a.itemBirth);
                        }
                        return null;
                }
            }
        });
        final int i11 = 2;
        this.f27906C = C2131j.b(new Function0(this) { // from class: Ia.d

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ AddUbaBankAccountFragment f4299b;

            {
                this.f4299b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                AddUbaBankAccountFragment addUbaBankAccountFragment = this.f4299b;
                switch (i11) {
                    case 0:
                        AddUbaBankAccountFragment.a aVar = AddUbaBankAccountFragment.f27903Q;
                        View view = addUbaBankAccountFragment.f27318b;
                        if (view != null) {
                            return view.findViewById(L9.a.tvNext);
                        }
                        return null;
                    case 1:
                        AddUbaBankAccountFragment.a aVar2 = AddUbaBankAccountFragment.f27903Q;
                        View view2 = addUbaBankAccountFragment.f27318b;
                        if (view2 != null) {
                            return (TitleEditView) view2.findViewById(L9.a.itemBVN);
                        }
                        return null;
                    default:
                        AddUbaBankAccountFragment.a aVar3 = AddUbaBankAccountFragment.f27903Q;
                        View view3 = addUbaBankAccountFragment.f27318b;
                        if (view3 != null) {
                            return (TitleEditView) view3.findViewById(L9.a.itemBirth);
                        }
                        return null;
                }
            }
        });
    }

    public final String A(Calendar calendar) {
        TitleEditView titleEditViewB = B();
        if (TextUtils.isEmpty(titleEditViewB != null ? titleEditViewB.getEditText() : null)) {
            return calendar == null ? "" : new SimpleDateFormat("ddMMyyyy", Locale.ENGLISH).format(calendar.getTime());
        }
        TitleEditView titleEditViewB2 = B();
        if (titleEditViewB2 != null) {
            return titleEditViewB2.getEditText();
        }
        return null;
    }

    public final TitleEditView B() {
        return (TitleEditView) this.f27906C.getValue();
    }

    public final void C() {
        String editText;
        TitleEditView titleEditView = (TitleEditView) this.f27905B.getValue();
        if (titleEditView == null || (editText = titleEditView.getEditText()) == null) {
            editText = "";
        }
        boolean z3 = (TextUtils.isEmpty(editText) || TextUtils.isEmpty(A(this.f27908L))) ? false : true;
        View view = (View) this.f27904A.getValue();
        if (view != null) {
            view.setEnabled(z3);
        }
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        C();
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i7, int i10, int i11) {
    }

    @Override // com.transsnet.palmpay.core.ui.fragment.bankaccount.AddBankAccountBaseFragment, com.transsnet.palmpay.core.base.BaseFragment
    public final int h() {
        return b.core_fragment_add_bank_account_uba;
    }

    @Override // com.transsnet.palmpay.core.ui.mvp.contract.AddBankAccountContract.IView
    public final void handleAddBankAccountResult(AddPayBankAccRsp response) {
        String editText;
        Intrinsics.checkNotNullParameter(response, "response");
        if (!response.isSuccess()) {
            ToastUtils.showLong(response.getRespMsg(), new Object[0]);
            return;
        }
        AddPayBankAccRsp.DataBean dataBean = response.data;
        int i7 = dataBean.status;
        if (i7 == 1) {
            v();
            E activity = getActivity();
            if (activity != null) {
                activity.finish();
                return;
            }
            return;
        }
        if (i7 == 0 && "OTP".equalsIgnoreCase(dataBean.verifyMethod)) {
            AddBankAccSendOtpReq req = new AddBankAccSendOtpReq();
            BankInfo bankInfo = this.f27880o;
            Intrinsics.e(bankInfo);
            req.bankCode = bankInfo.bankCode;
            TitleEditView titleEditView = this.f27882v;
            Intrinsics.e(titleEditView);
            req.accountNo = titleEditView.getEditText();
            req.reference = response.data.reference;
            req.birth = A(this.f27908L);
            TitleEditView titleEditView2 = (TitleEditView) this.f27905B.getValue();
            if (titleEditView2 == null || (editText = titleEditView2.getEditText()) == null) {
                editText = "";
            }
            req.bvn = editText;
            this.f27909M = req;
            E activity2 = getActivity();
            Intrinsics.f(activity2, "null cannot be cast to non-null type com.transsnet.palmpay.core.ui.activity.AddNewBankAccountActivity");
            AddNewBankAccountActivity addNewBankAccountActivity = (AddNewBankAccountActivity) activity2;
            BankInfo bankInfo2 = this.f27880o;
            String str = this.f27881p;
            Intrinsics.checkNotNullParameter(req, "req");
            ((TextView) addNewBankAccountActivity.f27419b.getValue()).setText(k.core_confirm_verification_code);
            ((TextView) addNewBankAccountActivity.f27418a.getValue()).setText(k.core_msg_confirm_verification_code);
            Z supportFragmentManager = addNewBankAccountActivity.getSupportFragmentManager();
            supportFragmentManager.getClass();
            C1161a c1161a = new C1161a(supportFragmentManager);
            c1161a.e(L9.a.fragmentContainer, AddBankAccountOtpFragment.f27887H.newInstance(req, bankInfo2, str), null);
            c1161a.c(null);
            c1161a.h(true);
        }
    }

    @Override // com.transsnet.palmpay.core.ui.fragment.bankaccount.AddBankAccountBaseFragment, com.transsnet.palmpay.core.base.BaseFragment
    public final int k() {
        TitleEditView titleEditViewB;
        User user = BaseApplication.getInstance().getUser();
        TitleEditView titleEditView = (TitleEditView) this.f27905B.getValue();
        if (titleEditView != null) {
            titleEditView.setEditText(user.getBvnCode());
        }
        if (TextUtils.isEmpty(user.getBirthday()) || (titleEditViewB = B()) == null) {
            return 0;
        }
        String birthday = user.getBirthday();
        Intrinsics.checkNotNullExpressionValue(birthday, "getBirthday(...)");
        titleEditViewB.setEditText(y.k(birthday, "/", "-"));
        return 0;
    }

    @Override // com.transsnet.palmpay.core.ui.fragment.bankaccount.AddBankAccountBaseFragment, com.transsnet.palmpay.core.base.BaseFragment
    public final int o() {
        this.t = (ModelBankInfoItem) this.f27318b.findViewById(L9.a.itemBankInfo);
        this.f27882v = (TitleEditView) this.f27318b.findViewById(L9.a.itemAccountNo);
        super.o();
        TitleEditView titleEditView = this.f27882v;
        if (titleEditView != null) {
            titleEditView.setTitle(h.B(CommonViewExtKt.string(k.core_bank_account_number, getActivity()), null, null, Integer.valueOf(L6.b.ppColorTextPrimary), null, null, null, 1019));
        }
        TitleEditView titleEditViewB = B();
        if (titleEditViewB != null) {
            titleEditViewB.setTitle(h.B(CommonViewExtKt.string(k.core_date_of_birth, getActivity()), null, null, Integer.valueOf(L6.b.ppColorTextPrimary), null, null, null, 1019));
        }
        TitleEditView titleEditViewB2 = B();
        if (titleEditViewB2 != null) {
            Context context = getContext();
            titleEditViewB2.setDrawableRight(context != null ? G8.a.x(context, S6.a.pay_Arrowdown, null, Integer.valueOf(L6.b.ppColorPrimary), 16.0f, 114) : null);
        }
        TitleEditView titleEditViewB3 = B();
        if (titleEditViewB3 != null) {
            titleEditViewB3.setOnClickListener(this);
        }
        DatePickDialog datePickDialog = new DatePickDialog(getContext());
        this.f27907H = datePickDialog;
        datePickDialog.setOnDismissListener(new Dd.b(this, 3));
        DatePickDialog datePickDialog2 = this.f27907H;
        if (datePickDialog2 != null) {
            datePickDialog2.setShowConfirmBtn(true);
        }
        TitleEditView titleEditView2 = (TitleEditView) this.f27905B.getValue();
        if (titleEditView2 != null) {
            titleEditView2.f31176u0 = this;
        }
        TitleEditView titleEditViewB4 = B();
        if (titleEditViewB4 != null) {
            titleEditViewB4.f31176u0 = this;
        }
        View view = (View) this.f27904A.getValue();
        if (view == null) {
            return 0;
        }
        view.setOnClickListener(this);
        return 0;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        DatePickDialog datePickDialog;
        String editText;
        if (view != null) {
            int id2 = view.getId();
            if (id2 != L9.a.tvNext) {
                if (id2 == L9.a.itemBirth) {
                    Calendar calendar = Calendar.getInstance();
                    calendar.set(1, calendar.get(1) - 18);
                    DatePickDialog datePickDialog2 = this.f27907H;
                    if (datePickDialog2 != null) {
                        datePickDialog2.show();
                    }
                    DatePickDialog datePickDialog3 = this.f27907H;
                    if (datePickDialog3 != null) {
                        datePickDialog3.setAgeRange(18, 100);
                    }
                    DatePickDialog datePickDialog4 = this.f27907H;
                    if (datePickDialog4 != null) {
                        datePickDialog4.setDate(calendar);
                    }
                    Calendar calendar2 = this.f27908L;
                    if (calendar2 == null || (datePickDialog = this.f27907H) == null) {
                        return;
                    }
                    datePickDialog.setDate(calendar2);
                    return;
                }
                return;
            }
            String str = this.f27881p;
            if (TextUtils.isEmpty(str)) {
                ToastUtils.showLong(getString(k.core_invalid_bank_account_number), new Object[0]);
                return;
            }
            if (BaseApplication.isNG() && (str == null || str.length() != 10)) {
                ToastUtils.showLong(getString(k.core_invalid_bank_account_number), new Object[0]);
                return;
            }
            t tVar = this.f27905B;
            TitleEditView titleEditView = (TitleEditView) tVar.getValue();
            if (titleEditView == null || (editText = titleEditView.getEditText()) == null) {
                editText = "";
            }
            if (editText.length() != 11) {
                TitleEditView titleEditView2 = (TitleEditView) tVar.getValue();
                if (titleEditView2 != null) {
                    titleEditView2.setError(getString(k.core_invalid_bvn_number));
                    return;
                }
                return;
            }
            AddBankAccountReq addBankAccountReq = new AddBankAccountReq();
            BankInfo bankInfo = this.f27880o;
            addBankAccountReq.bankCode = bankInfo != null ? bankInfo.bankCode : null;
            addBankAccountReq.bankAccountNo = this.f27881p;
            addBankAccountReq.birth = A(this.f27908L);
            addBankAccountReq.bvn = editText;
            La.h hVar = (La.h) this.f27328i;
            if (hVar != null) {
                hVar.addBankAccount(addBankAccountReq);
            }
        }
    }

    @Override // com.transsnet.palmpay.core.base.BaseFragment, androidx.fragment.app.Fragment
    public final void onResume() {
        super.onResume();
        AddBankAccSendOtpReq addBankAccSendOtpReq = this.f27909M;
        if (addBankAccSendOtpReq != null) {
            TitleEditView titleEditView = this.f27882v;
            if (titleEditView != null) {
                titleEditView.setEditText(addBankAccSendOtpReq.accountNo);
            }
            TitleEditView titleEditView2 = (TitleEditView) this.f27905B.getValue();
            if (titleEditView2 != null) {
                titleEditView2.setEditText(addBankAccSendOtpReq.bvn);
            }
            ModelBankInfoItem modelBankInfoItem = this.t;
            if (modelBankInfoItem != null) {
                modelBankInfoItem.setBankCardInfo(this.f27880o);
            }
            TitleEditView titleEditViewB = B();
            if (titleEditViewB != null) {
                titleEditViewB.setEditText(addBankAccSendOtpReq.birth);
            }
            this.f27909M = null;
        }
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i7, int i10, int i11) {
    }
}
