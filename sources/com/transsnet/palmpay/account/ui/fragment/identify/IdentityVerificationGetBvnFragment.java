package com.transsnet.palmpay.account.ui.fragment.identify;

import C0.AbstractC0130w;
import C9.C0139f;
import F8.d;
import I8.s;
import L6.b;
import N8.C0457a;
import Pa.F;
import Pa.r0;
import R3.e;
import T8.f;
import android.content.Context;
import android.content.Intent;
import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatEditText;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.m;
import androidx.fragment.app.E;
import androidx.navigation.fragment.NavHostFragment;
import androidx.viewbinding.ViewBinding;
import com.palmpay.lib.ui.button.PpButton;
import com.palmpay.lib.ui.form.PpFormVertical;
import com.transsnet.palmpay.account.ui.fragment.identify.IdentityVerificationGetBvnFragment;
import com.transsnet.palmpay.account.ui.viewmodel.IdentityVerificationViewModel;
import com.transsnet.palmpay.core.base.BaseActivity;
import com.transsnet.palmpay.core.base.BaseMvvmVBFragment;
import com.transsnet.palmpay.core.base.l;
import com.transsnet.palmpay.core.bean.BankInfo;
import com.transsnet.palmpay.core.callback.CustomActionCallback;
import com.transsnet.palmpay.core.util.statistic.IAutoTrack;
import com.transsnet.palmpay.custom_view.r;
import com.transsnet.palmpay.custom_view.utils.CommonViewExtKt;
import com.transsnet.palmpay.util.KeyboardUtils;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import p097g9.C1722u;
import p220oa.h;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u00042\u00020\u00052\u00020\u0006:\u0001\tB\u0007¢\u0006\u0004\b\u0007\u0010\b¨\u0006\n"}, d2 = {"Lcom/transsnet/palmpay/account/ui/fragment/identify/IdentityVerificationGetBvnFragment;", "Lcom/transsnet/palmpay/core/base/BaseMvvmVBFragment;", "Lcom/transsnet/palmpay/account/ui/viewmodel/IdentityVerificationViewModel;", "LI8/s;", "Landroid/text/TextWatcher;", "Lcom/transsnet/palmpay/core/util/statistic/IAutoTrack;", "Lcom/transsnet/palmpay/core/callback/CustomActionCallback;", "<init>", "()V", "a", "module_account_impl_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nIdentityVerificationGetBvnFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 IdentityVerificationGetBvnFragment.kt\ncom/transsnet/palmpay/account/ui/fragment/identify/IdentityVerificationGetBvnFragment\n+ 2 LifecycleOwnerKtx.kt\ncom/transsnet/palmpay/core/base/ext/LifecycleOwnerKtxKt\n*L\n1#1,254:1\n115#2,8:255\n145#2:263\n*S KotlinDebug\n*F\n+ 1 IdentityVerificationGetBvnFragment.kt\ncom/transsnet/palmpay/account/ui/fragment/identify/IdentityVerificationGetBvnFragment\n*L\n168#1:255,8\n168#1:263\n*E\n"})
public final class IdentityVerificationGetBvnFragment extends BaseMvvmVBFragment<IdentityVerificationViewModel, s> implements TextWatcher, IAutoTrack, CustomActionCallback {
    public static final /* synthetic */ int t = 0;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public BankInfo f26169o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public AbstractC0130w f26170p;

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

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        PpFormVertical ppFormVertical;
        PpFormVertical ppFormVertical2;
        w();
        s sVar = (s) this.f27335j;
        if (sVar != null && (ppFormVertical2 = sVar.f4203b) != null) {
            ppFormVertical2.setBottomText(null);
        }
        s sVar2 = (s) this.f27335j;
        if (sVar2 == null || (ppFormVertical = sVar2.f4204c) == null) {
            return;
        }
        ppFormVertical.setBottomText(null);
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i7, int i10, int i11) {
    }

    @Override // com.transsnet.palmpay.core.util.statistic.IAutoTrack
    public final String getPageAlias() {
        return "Get BVN Via Bank Account";
    }

    @Override // com.transsnet.palmpay.core.callback.CustomActionCallback
    public final boolean goBack(String str) {
        AbstractC0130w abstractC0130w = this.f26170p;
        if (abstractC0130w == null) {
            return true;
        }
        abstractC0130w.j();
        return true;
    }

    @Override // com.transsnet.palmpay.core.base.BaseMvvmFragment, com.transsnet.palmpay.core.base.BaseFragment
    public final int k() {
        w();
        return 0;
    }

    @Override // com.transsnet.palmpay.core.base.BaseMvvmFragment, com.transsnet.palmpay.core.base.BaseFragment
    public final void n() {
        IdentityVerificationViewModel identityVerificationViewModel = (IdentityVerificationViewModel) this.f27333i;
        l lVar = identityVerificationViewModel != null ? identityVerificationViewModel.f26420H : null;
        if (lVar != null) {
            lVar.e(this, new f(new C0139f(this, 29), (byte) 0));
        }
    }

    @Override // com.transsnet.palmpay.core.base.BaseMvvmFragment, com.transsnet.palmpay.core.base.BaseFragment
    public final int o() {
        AppCompatEditText editText;
        AppCompatEditText editText2;
        AppCompatEditText editText3;
        AppCompatEditText editText4;
        Window window;
        super.o();
        E activity = getActivity();
        if (activity != null && (window = activity.getWindow()) != null) {
            window.setSoftInputMode(20);
        }
        this.f26170p = NavHostFragment.f17502e.findNavController(this);
        s sVar = (s) this.f27335j;
        if (sVar != null) {
            PpFormVertical ppFormVertical = sVar.f4204c;
            ImageView rightImg = ppFormVertical.getRightImg();
            if (rightImg != null) {
                Context context = getContext();
                rightImg.setImageDrawable(context != null ? G8.a.x(context, S6.a.pay_Arrowdown, Integer.valueOf(CommonViewExtKt.colorInt(b.ppColorTextAssist, getContext())), null, 24.0f, 116) : null);
            }
            ImageView rightImg2 = ppFormVertical.getRightImg();
            if (rightImg2 != null) {
                h.s(rightImg2, true);
            }
            ppFormVertical.setEditTextWatcher(this);
            ViewGroup.LayoutParams layoutParams = ppFormVertical.getLabelTextView().getLayoutParams();
            Intrinsics.f(layoutParams, "null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
            ConstraintLayout.LayoutParams layoutParams2 = (ConstraintLayout.LayoutParams) layoutParams;
            layoutParams2.t = 0;
            layoutParams2.setMarginStart(CommonViewExtKt.getDp(16));
            ((ViewGroup.MarginLayoutParams) layoutParams2).leftMargin = CommonViewExtKt.getDp(16);
            ppFormVertical.getLabelTextView().setLayoutParams(layoutParams2);
            m mVar = new m();
            mVar.e(ppFormVertical);
            View view = ppFormVertical.t;
            if (view != null) {
                int id2 = view.getId();
                mVar.h(id2, 1, 0, 1, PpFormVertical.g(ppFormVertical.getContext(), 16.0f));
                mVar.h(id2, 6, 0, 6, PpFormVertical.g(ppFormVertical.getContext(), 16.0f));
                mVar.h(id2, 7, 0, 7, PpFormVertical.g(ppFormVertical.getContext(), 16.0f));
            }
            TextView textView = ppFormVertical.f24417o;
            if (textView != null) {
                int id3 = textView.getId();
                mVar.h(id3, 1, 0, 1, PpFormVertical.g(ppFormVertical.getContext(), 16.0f));
                mVar.h(id3, 6, 0, 6, PpFormVertical.g(ppFormVertical.getContext(), 16.0f));
                mVar.h(id3, 7, 0, 7, PpFormVertical.g(ppFormVertical.getContext(), 16.0f));
            }
            mVar.b(ppFormVertical);
        }
        s sVar2 = (s) this.f27335j;
        if (sVar2 != null) {
            sVar2.f4203b.setEditTextWatcher(new e(this, 8));
        }
        s sVar3 = (s) this.f27335j;
        PpFormVertical ppFormVertical2 = sVar3 != null ? sVar3.f4204c : null;
        final int i7 = 0;
        View.OnClickListener onClickListener = new View.OnClickListener(this) { // from class: V8.i

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ IdentityVerificationGetBvnFragment f10136b;

            {
                this.f10136b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                IdentityVerificationGetBvnFragment identityVerificationGetBvnFragment = this.f10136b;
                switch (i7) {
                    case 0:
                        int i10 = IdentityVerificationGetBvnFragment.t;
                        I8.s sVar4 = (I8.s) identityVerificationGetBvnFragment.f27335j;
                        if (sVar4 == null || !sVar4.f4205d.a()) {
                            KeyboardUtils.hideSoftInput(identityVerificationGetBvnFragment.getActivity());
                            Intent intentA = F.a(identityVerificationGetBvnFragment.getContext(), "/sm/select_bank_activity");
                            if (intentA != null) {
                                intentA.putExtra("bank_list_type", 2);
                                (identityVerificationGetBvnFragment.getActivity() instanceof BaseActivity ? ((BaseActivity) identityVerificationGetBvnFragment.getActivity()).getF28604i() : null).f(intentA, new C0457a(identityVerificationGetBvnFragment, 29));
                            }
                        }
                        break;
                    default:
                        int i11 = IdentityVerificationGetBvnFragment.t;
                        I8.s sVar5 = (I8.s) identityVerificationGetBvnFragment.f27335j;
                        String editContent = sVar5 != null ? sVar5.f4203b.getEditContent() : null;
                        if (!TextUtils.isEmpty(editContent)) {
                            if ((editContent != null ? editContent.length() : 0) >= 10) {
                                if (identityVerificationGetBvnFragment.f26169o != null) {
                                    identityVerificationGetBvnFragment.v(true);
                                    IdentityVerificationViewModel identityVerificationViewModel = (IdentityVerificationViewModel) identityVerificationGetBvnFragment.f27333i;
                                    if (identityVerificationViewModel != null) {
                                        p140j8.f.s(identityVerificationViewModel, new C1722u(identityVerificationGetBvnFragment.f26169o, editContent, null), identityVerificationViewModel.f26420H, (28 & 4) != 0 ? 0L : 300L, (28 & 8) != 0, (28 & 16) == 0);
                                    }
                                } else {
                                    I8.s sVar6 = (I8.s) identityVerificationGetBvnFragment.f27335j;
                                    if (sVar6 != null) {
                                        sVar6.f4204c.setBottomText(p220oa.h.B("Please select bank", identityVerificationGetBvnFragment.getContext(), null, Integer.valueOf(L6.b.ppColorError), null, null, null, 1018));
                                    }
                                }
                            }
                        }
                        I8.s sVar7 = (I8.s) identityVerificationGetBvnFragment.f27335j;
                        if (sVar7 != null) {
                            sVar7.f4203b.setBottomText(p220oa.h.B("Please enter 10 digits account number", identityVerificationGetBvnFragment.getContext(), null, Integer.valueOf(L6.b.ppColorError), null, null, null, 1018));
                        }
                        break;
                }
            }
        };
        if (ppFormVertical2 != null && (editText4 = ppFormVertical2.getEditText()) != null) {
            editText4.setFocusable(false);
        }
        if (ppFormVertical2 != null && (editText3 = ppFormVertical2.getEditText()) != null) {
            editText3.setEnabled(true);
        }
        if (ppFormVertical2 != null && (editText2 = ppFormVertical2.getEditText()) != null) {
            editText2.setInputType(524289);
        }
        if (ppFormVertical2 != null && (editText = ppFormVertical2.getEditText()) != null) {
            editText.setOnClickListener(onClickListener);
        }
        if (ppFormVertical2 != null) {
            ppFormVertical2.setRightIconClickListener(onClickListener);
        }
        s sVar4 = (s) this.f27335j;
        if (sVar4 != null) {
            final int i10 = 1;
            sVar4.f4205d.setOnClickListener(new View.OnClickListener(this) { // from class: V8.i

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final /* synthetic */ IdentityVerificationGetBvnFragment f10136b;

                {
                    this.f10136b = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    IdentityVerificationGetBvnFragment identityVerificationGetBvnFragment = this.f10136b;
                    switch (i10) {
                        case 0:
                            int i11 = IdentityVerificationGetBvnFragment.t;
                            I8.s sVar5 = (I8.s) identityVerificationGetBvnFragment.f27335j;
                            if (sVar5 == null || !sVar5.f4205d.a()) {
                                KeyboardUtils.hideSoftInput(identityVerificationGetBvnFragment.getActivity());
                                Intent intentA = F.a(identityVerificationGetBvnFragment.getContext(), "/sm/select_bank_activity");
                                if (intentA != null) {
                                    intentA.putExtra("bank_list_type", 2);
                                    (identityVerificationGetBvnFragment.getActivity() instanceof BaseActivity ? ((BaseActivity) identityVerificationGetBvnFragment.getActivity()).getF28604i() : null).f(intentA, new C0457a(identityVerificationGetBvnFragment, 29));
                                }
                            }
                            break;
                        default:
                            int i12 = IdentityVerificationGetBvnFragment.t;
                            I8.s sVar6 = (I8.s) identityVerificationGetBvnFragment.f27335j;
                            String editContent = sVar6 != null ? sVar6.f4203b.getEditContent() : null;
                            if (!TextUtils.isEmpty(editContent)) {
                                if ((editContent != null ? editContent.length() : 0) >= 10) {
                                    if (identityVerificationGetBvnFragment.f26169o != null) {
                                        identityVerificationGetBvnFragment.v(true);
                                        IdentityVerificationViewModel identityVerificationViewModel = (IdentityVerificationViewModel) identityVerificationGetBvnFragment.f27333i;
                                        if (identityVerificationViewModel != null) {
                                            p140j8.f.s(identityVerificationViewModel, new C1722u(identityVerificationGetBvnFragment.f26169o, editContent, null), identityVerificationViewModel.f26420H, (28 & 4) != 0 ? 0L : 300L, (28 & 8) != 0, (28 & 16) == 0);
                                        }
                                    } else {
                                        I8.s sVar7 = (I8.s) identityVerificationGetBvnFragment.f27335j;
                                        if (sVar7 != null) {
                                            sVar7.f4204c.setBottomText(p220oa.h.B("Please select bank", identityVerificationGetBvnFragment.getContext(), null, Integer.valueOf(L6.b.ppColorError), null, null, null, 1018));
                                        }
                                    }
                                }
                            }
                            I8.s sVar8 = (I8.s) identityVerificationGetBvnFragment.f27335j;
                            if (sVar8 != null) {
                                sVar8.f4203b.setBottomText(p220oa.h.B("Please enter 10 digits account number", identityVerificationGetBvnFragment.getContext(), null, Integer.valueOf(L6.b.ppColorError), null, null, null, 1018));
                            }
                            break;
                    }
                }
            });
        }
        return 0;
    }

    @Override // com.transsnet.palmpay.core.base.BaseFragment, androidx.fragment.app.Fragment
    public final void onResume() {
        super.onResume();
        BankInfo bankInfo = this.f26169o;
        if (bankInfo != null) {
            Intrinsics.e(bankInfo);
            u(bankInfo);
        }
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i7, int i10, int i11) {
    }

    @Override // com.transsnet.palmpay.core.base.BaseMvvmVBFragment
    public final ViewBinding t(LayoutInflater inflater, ViewGroup viewGroup) {
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        View viewInflate = inflater.inflate(F8.e.ac_fragment_identity_verification_step_get_bvn, viewGroup, false);
        int i7 = d.inputAccountNo;
        PpFormVertical ppFormVertical = (PpFormVertical) p059e1.a.m(i7, viewInflate);
        if (ppFormVertical != null) {
            i7 = d.inputBankName;
            PpFormVertical ppFormVertical2 = (PpFormVertical) p059e1.a.m(i7, viewInflate);
            if (ppFormVertical2 != null) {
                i7 = d.textViewNext;
                PpButton ppButton = (PpButton) p059e1.a.m(i7, viewInflate);
                if (ppButton != null) {
                    i7 = d.tvMessage;
                    TextView textView = (TextView) p059e1.a.m(i7, viewInflate);
                    if (textView != null) {
                        i7 = d.tvTitle;
                        TextView textView2 = (TextView) p059e1.a.m(i7, viewInflate);
                        if (textView2 != null) {
                            s sVar = new s((LinearLayout) viewInflate, ppFormVertical, ppFormVertical2, ppButton, textView, textView2);
                            Intrinsics.checkNotNullExpressionValue(sVar, "inflate(...)");
                            return sVar;
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i7)));
    }

    public final void u(BankInfo bankInfo) {
        ImageView leftImg;
        AppCompatEditText editText;
        s sVar = (s) this.f27335j;
        if (sVar != null && (editText = sVar.f4204c.getEditText()) != null) {
            String bankName = bankInfo.bankName;
            Intrinsics.checkNotNullExpressionValue(bankName, "bankName");
            editText.setText(h.B(bankName, getActivity(), null, Integer.valueOf(b.ppColorTextPrimary), null, null, null, 1018));
        }
        s sVar2 = (s) this.f27335j;
        if (sVar2 != null && (leftImg = sVar2.f4204c.getLeftImg()) != null) {
            h.C(leftImg);
        }
        s sVar3 = (s) this.f27335j;
        r0.u1(sVar3 != null ? sVar3.f4204c.getLeftImg() : null, bankInfo.bankUrl, r.cv_default_bank_logo);
        this.f26169o = bankInfo;
    }

    public final void v(boolean z3) {
        s sVar = (s) this.f27335j;
        if (sVar != null) {
            sVar.f4205d.b(z3);
        }
        s sVar2 = (s) this.f27335j;
        if (sVar2 != null) {
            sVar2.f4203b.setEnabled(!z3);
        }
    }

    public final void w() {
        PpButton ppButton;
        PpFormVertical ppFormVertical;
        PpFormVertical ppFormVertical2;
        String editContent;
        s sVar = (s) this.f27335j;
        boolean z3 = ((sVar == null || (ppFormVertical2 = sVar.f4203b) == null || (editContent = ppFormVertical2.getEditContent()) == null) ? 0 : editContent.length()) >= 10;
        s sVar2 = (s) this.f27335j;
        boolean z8 = TextUtils.isEmpty((sVar2 == null || (ppFormVertical = sVar2.f4204c) == null) ? null : ppFormVertical.getEditContent()) ? false : z3;
        s sVar3 = (s) this.f27335j;
        if (sVar3 == null || (ppButton = sVar3.f4205d) == null) {
            return;
        }
        ppButton.setEnabled(z8);
    }
}
