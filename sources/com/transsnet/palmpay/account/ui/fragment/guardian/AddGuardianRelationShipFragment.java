package com.transsnet.palmpay.account.ui.fragment.guardian;

import Bc.f;
import C0.G;
import C9.C0139f;
import C9.Q;
import De.d;
import F8.e;
import F8.h;
import L6.b;
import L8.a;
import N8.C0463g;
import Pa.b0;
import Pa.r0;
import T8.k;
import android.content.Context;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatEditText;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import com.palmpay.lib.ui.button.PpButton;
import com.palmpay.lib.ui.form.PpFormVertical;
import com.palmpay.lib.ui.titlebar.PpTitleBar;
import com.transsnet.palmpay.account.bean.req.SubmitGuardianReq;
import com.transsnet.palmpay.account.bean.rsp.GuardianConfig;
import com.transsnet.palmpay.account.bean.rsp.GuardianRelationListBean;
import com.transsnet.palmpay.account.ui.activity.AddGuardianActivity;
import com.transsnet.palmpay.account.ui.viewmodel.AddGuardianViewModel;
import com.transsnet.palmpay.core.base.BaseApplication;
import com.transsnet.palmpay.core.base.l;
import com.transsnet.palmpay.custom_view.dialog.p;
import com.transsnet.palmpay.custom_view.utils.CommonViewExtKt;
import com.transsnet.palmpay.util.KeyboardUtils;
import com.transsnet.palmpay.util.PhoneBaseNumberUtils;
import io.fastkv.n;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import p355xf.C2131j;
import p355xf.t;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/transsnet/palmpay/account/ui/fragment/guardian/AddGuardianRelationShipFragment;", "Lcom/transsnet/palmpay/account/ui/fragment/guardian/BaseAddGuardianFragment;", "Landroid/text/TextWatcher;", "<init>", "()V", "module_account_impl_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nAddGuardianRelationShipFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AddGuardianRelationShipFragment.kt\ncom/transsnet/palmpay/account/ui/fragment/guardian/AddGuardianRelationShipFragment\n+ 2 LifecycleOwnerKtx.kt\ncom/transsnet/palmpay/core/base/ext/LifecycleOwnerKtxKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 ArraysJVM.kt\nkotlin/collections/ArraysKt__ArraysJVMKt\n*L\n1#1,433:1\n115#2,8:434\n145#2:442\n171#2,12:443\n215#2:455\n1#3:456\n37#4:457\n36#4,3:458\n*S KotlinDebug\n*F\n+ 1 AddGuardianRelationShipFragment.kt\ncom/transsnet/palmpay/account/ui/fragment/guardian/AddGuardianRelationShipFragment\n*L\n187#1:434,8\n187#1:442\n199#1:443,12\n199#1:455\n335#1:457\n335#1:458,3\n*E\n"})
public final class AddGuardianRelationShipFragment extends BaseAddGuardianFragment implements TextWatcher {

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public int f26136p;
    public f t;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final t f26137v = C2131j.b(new b0(8));

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final t f26138w = C2131j.b(new b0(9));

    public static String z(PpFormVertical ppFormVertical) {
        String editContent;
        return (ppFormVertical == null || (editContent = ppFormVertical.getEditContent()) == null) ? "" : editContent;
    }

    public final List A() {
        return (List) this.f26137v.getValue();
    }

    public final void B() {
        List listA = A();
        if (listA.isEmpty()) {
            listA = null;
        }
        if (listA != null) {
            p pVar = new p(requireContext());
            pVar.b(h.ac_state);
            pVar.a((CharSequence[]) ((List) this.f26138w.getValue()).toArray(new String[0]), this.f26136p < A().size() ? this.f26136p : 0, new d(this, 1));
            pVar.show();
        }
    }

    public final void C(String str) {
        SubmitGuardianReq submitGuardianReqL;
        String mobileNumber;
        String mobileNumber2;
        KeyboardUtils.hideSoftInput(getActivity());
        f fVar = this.t;
        if (fVar != null) {
            ((PpButton) fVar.f698d).b(true);
        }
        AddGuardianActivity addGuardianActivityV = v();
        if (addGuardianActivityV == null || (submitGuardianReqL = addGuardianActivityV.l()) == null) {
            return;
        }
        try {
            f fVar2 = this.t;
            String str2 = "";
            if (fVar2 == null || (mobileNumber = ((PpFormVertical) fVar2.f699e).getMobileNumber()) == null) {
                mobileNumber = "";
            }
            String strA0 = r0.a0(mobileNumber);
            if (strA0 != null && !strA0.equals(submitGuardianReqL.guardianPhone)) {
                submitGuardianReqL.otpToken = null;
                submitGuardianReqL.clearFiles();
            }
            f fVar3 = this.t;
            if (fVar3 != null && (mobileNumber2 = ((PpFormVertical) fVar3.f699e).getMobileNumber()) != null) {
                str2 = mobileNumber2;
            }
            submitGuardianReqL.guardianPhone = r0.a0(str2);
            submitGuardianReqL.relationType = Integer.valueOf(((GuardianRelationListBean) A().get(this.f26136p)).relationType);
            if (!TextUtils.isEmpty(str)) {
                submitGuardianReqL.otpToken = str;
            }
            AddGuardianViewModel addGuardianViewModel = (AddGuardianViewModel) this.f27333i;
            if (addGuardianViewModel != null) {
                addGuardianViewModel.e(submitGuardianReqL);
            }
        } catch (Exception e10) {
            F6.d.c(this.f27317a, G.o("submitRequest ", e10.getMessage()));
        }
    }

    /* JADX WARN: Code duplicated, block: B:12:0x002a  */
    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        String mobileNumber;
        f fVar = this.t;
        boolean z3 = !TextUtils.isEmpty(z(fVar != null ? (PpFormVertical) fVar.f699e : null));
        f fVar2 = this.t;
        if (TextUtils.isEmpty(z(fVar2 != null ? (PpFormVertical) fVar2.f700f : null))) {
            z3 = false;
        } else {
            PhoneBaseNumberUtils phoneBaseNumberUtils = PhoneBaseNumberUtils.INSTANCE;
            f fVar3 = this.t;
            if (fVar3 == null || (mobileNumber = ((PpFormVertical) fVar3.f699e).getMobileNumber()) == null) {
                mobileNumber = "";
            }
            if (!PhoneBaseNumberUtils.isValidMobileNumber$default(phoneBaseNumberUtils, mobileNumber, BaseApplication.getCountryLocale(), false, 4, null)) {
                z3 = false;
            }
        }
        f fVar4 = this.t;
        if (fVar4 != null) {
            ((PpButton) fVar4.f698d).setEnabled(z3);
        }
        f fVar5 = this.t;
        if (fVar5 != null) {
            ((PpFormVertical) fVar5.f699e).setBottomText(null);
        }
        f fVar6 = this.t;
        if (fVar6 != null) {
            ((PpFormVertical) fVar6.f700f).setBottomText(null);
        }
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i7, int i10, int i11) {
    }

    @Override // com.transsnet.palmpay.account.ui.fragment.guardian.BaseAddGuardianFragment, com.transsnet.palmpay.core.callback.CustomActionCallback
    public final boolean goBack(String str) {
        if (this.f26141j) {
            return false;
        }
        a.d(getContext(), "Don't Give Up Yet!", null, null, "Complete your guardian information to enjoy high-quality financial services.", Integer.valueOf(h.ac_continue), null, null, Integer.valueOf(h.ac_quit), new k(this, 3), null, 6860);
        return true;
    }

    @Override // com.transsnet.palmpay.account.ui.fragment.guardian.BaseAddGuardianFragment, com.transsnet.palmpay.core.base.BaseFragment
    public final int h() {
        return 0;
    }

    @Override // com.transsnet.palmpay.account.ui.fragment.guardian.BaseAddGuardianFragment, com.transsnet.palmpay.core.base.BaseMvvmFragment, com.transsnet.palmpay.core.base.BaseFragment
    public final int k() {
        AppCompatEditText editText;
        AppCompatEditText editText2;
        AppCompatEditText editText3;
        AppCompatEditText editText4;
        AppCompatEditText editText5;
        GuardianConfig guardianConfig;
        GuardianConfig guardianConfig2;
        ImageView rightImg;
        ImageView rightImg2;
        super.k();
        f fVar = this.t;
        y(fVar != null ? (PpTitleBar) fVar.f703j : null);
        f fVar2 = this.t;
        PpFormVertical ppFormVertical = fVar2 != null ? (PpFormVertical) fVar2.f700f : null;
        if (ppFormVertical != null && (rightImg2 = ppFormVertical.getRightImg()) != null) {
            Context context = getContext();
            rightImg2.setImageDrawable(context != null ? G8.a.x(context, S6.a.pay_Arrowdown, Integer.valueOf(requireContext().getColor(b.ppColorTextNormal)), null, 24.0f, 116) : null);
        }
        if (ppFormVertical != null && (rightImg = ppFormVertical.getRightImg()) != null) {
            p220oa.h.s(rightImg, true);
        }
        f fVar3 = this.t;
        if (fVar3 != null) {
            TextView textView = (TextView) fVar3.f702i;
            AddGuardianActivity addGuardianActivityV = v();
            textView.setText((addGuardianActivityV == null || (guardianConfig2 = addGuardianActivityV.f25817f) == null) ? null : guardianConfig2.addGuardianTitle);
        }
        f fVar4 = this.t;
        if (fVar4 != null) {
            TextView textView2 = (TextView) fVar4.f701g;
            AddGuardianActivity addGuardianActivityV2 = v();
            textView2.setText((addGuardianActivityV2 == null || (guardianConfig = addGuardianActivityV2.f25817f) == null) ? null : guardianConfig.addGuardianContent);
        }
        f fVar5 = this.t;
        if (fVar5 != null) {
            ((PpFormVertical) fVar5.f700f).setEditTextWatcher(this);
        }
        f fVar6 = this.t;
        if (fVar6 != null) {
            ((PpFormVertical) fVar6.f699e).setEditTextWatcher(this);
        }
        f fVar7 = this.t;
        if (fVar7 != null && (editText5 = ((PpFormVertical) fVar7.f699e).getEditText()) != null) {
            editText5.setTextColor(CommonViewExtKt.colorInt(b.ppColorTextPrimary, getContext()));
        }
        f fVar8 = this.t;
        PpFormVertical ppFormVertical2 = fVar8 != null ? (PpFormVertical) fVar8.f700f : null;
        k kVar = new k(this, 4);
        if (ppFormVertical2 != null && (editText4 = ppFormVertical2.getEditText()) != null) {
            editText4.setFocusable(false);
        }
        if (ppFormVertical2 != null && (editText3 = ppFormVertical2.getEditText()) != null) {
            editText3.setEnabled(true);
        }
        if (ppFormVertical2 != null && (editText2 = ppFormVertical2.getEditText()) != null) {
            editText2.setTextColor(CommonViewExtKt.colorInt(b.ppColorTextPrimary, requireContext()));
        }
        if (ppFormVertical2 != null && (editText = ppFormVertical2.getEditText()) != null) {
            editText.setOnClickListener(kVar);
        }
        if (ppFormVertical2 != null) {
            ppFormVertical2.setRightIconClickListener(kVar);
        }
        f fVar9 = this.t;
        if (fVar9 != null) {
            ((PpButton) fVar9.f698d).setOnClickListener(new k(this, 5));
        }
        return 0;
    }

    @Override // com.transsnet.palmpay.core.base.BaseFragment
    public final ViewBinding l(LayoutInflater inflater, ViewGroup viewGroup) {
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        View viewInflate = inflater.inflate(e.ac_fragment_add_guardian_relationship, viewGroup, false);
        int i7 = F8.d.bottomViewStub;
        ViewStub viewStub = (ViewStub) p059e1.a.m(i7, viewInflate);
        if (viewStub != null) {
            i7 = F8.d.btnConfirm;
            PpButton ppButton = (PpButton) p059e1.a.m(i7, viewInflate);
            if (ppButton != null) {
                i7 = F8.d.inputMobile;
                PpFormVertical ppFormVertical = (PpFormVertical) p059e1.a.m(i7, viewInflate);
                if (ppFormVertical != null) {
                    i7 = F8.d.inputRelationship;
                    PpFormVertical ppFormVertical2 = (PpFormVertical) p059e1.a.m(i7, viewInflate);
                    if (ppFormVertical2 != null) {
                        i7 = F8.d.layoutContainer;
                        if (((LinearLayout) p059e1.a.m(i7, viewInflate)) != null) {
                            i7 = F8.d.titleBar;
                            PpTitleBar ppTitleBar = (PpTitleBar) p059e1.a.m(i7, viewInflate);
                            if (ppTitleBar != null) {
                                i7 = F8.d.tvMsg;
                                TextView textView = (TextView) p059e1.a.m(i7, viewInflate);
                                if (textView != null) {
                                    i7 = F8.d.tvTitle;
                                    TextView textView2 = (TextView) p059e1.a.m(i7, viewInflate);
                                    if (textView2 != null) {
                                        f fVar = new f((ConstraintLayout) viewInflate, viewStub, ppButton, ppFormVertical, ppFormVertical2, ppTitleBar, textView, textView2);
                                        this.t = fVar;
                                        return fVar;
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i7)));
    }

    @Override // com.transsnet.palmpay.core.base.BaseMvvmFragment, com.transsnet.palmpay.core.base.BaseFragment
    public final void n() {
        AddGuardianViewModel addGuardianViewModel = (AddGuardianViewModel) this.f27333i;
        if (addGuardianViewModel != null) {
            addGuardianViewModel.d(false);
        }
        AddGuardianViewModel addGuardianViewModel2 = (AddGuardianViewModel) this.f27333i;
        n.B(this, addGuardianViewModel2 != null ? addGuardianViewModel2.f26407e : null, this, new Ba.a(this, 13), new C0463g(this, 12), true, null, 224);
        AddGuardianViewModel addGuardianViewModel3 = (AddGuardianViewModel) this.f27333i;
        l lVar = addGuardianViewModel3 != null ? addGuardianViewModel3.f26409g : null;
        if (lVar != null) {
            lVar.e(this, new Fd.G(new C0139f(this, 26), 13));
        }
        AddGuardianViewModel addGuardianViewModel4 = (AddGuardianViewModel) this.f27333i;
        l lVar2 = addGuardianViewModel4 != null ? addGuardianViewModel4.f26412o : null;
        if (lVar2 != null) {
            lVar2.e(this, new Fd.G(new Q(28, this, this), 13));
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onSaveInstanceState(Bundle outState) {
        Intrinsics.checkNotNullParameter(outState, "outState");
        f fVar = this.t;
        outState.putString("inputRelationship", z(fVar != null ? (PpFormVertical) fVar.f700f : null));
        f fVar2 = this.t;
        outState.putString("inputMobile", z(fVar2 != null ? (PpFormVertical) fVar2.f699e : null));
        super.onSaveInstanceState(outState);
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i7, int i10, int i11) {
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewStateRestored(Bundle bundle) {
        PpFormVertical ppFormVertical;
        PpFormVertical ppFormVertical2;
        super.onViewStateRestored(bundle);
        f fVar = this.t;
        if (fVar != null && (ppFormVertical2 = (PpFormVertical) fVar.f700f) != null) {
            ppFormVertical2.setEditContent(bundle != null ? bundle.getString("inputRelationship") : null);
        }
        f fVar2 = this.t;
        if (fVar2 == null || (ppFormVertical = (PpFormVertical) fVar2.f699e) == null) {
            return;
        }
        ppFormVertical.setEditContent(bundle != null ? bundle.getString("inputMobile") : null);
    }

    @Override // com.transsnet.palmpay.account.ui.fragment.guardian.BaseAddGuardianFragment
    public final ViewStub t() {
        f fVar = this.t;
        if (fVar != null) {
            return (ViewStub) fVar.f696b;
        }
        return null;
    }
}
