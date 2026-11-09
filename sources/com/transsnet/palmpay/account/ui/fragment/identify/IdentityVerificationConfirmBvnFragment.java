package com.transsnet.palmpay.account.ui.fragment.identify;

import C0.AbstractC0130w;
import C9.C0139f;
import F8.d;
import F8.e;
import Fd.G;
import G8.a;
import I8.q;
import L6.b;
import N8.C0463g;
import T8.o;
import V8.h;
import android.content.Context;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatEditText;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.E;
import androidx.navigation.fragment.NavHostFragment;
import androidx.viewbinding.ViewBinding;
import com.palmpay.lib.ui.button.PpButton;
import com.palmpay.lib.ui.form.PpFormVertical;
import com.transsnet.palmpay.account.bean.ResetPinVerifyTypeRsp;
import com.transsnet.palmpay.account.bean.req.AddUserExtraInfoReq;
import com.transsnet.palmpay.account.bean.req.CheckIdentifyReq;
import com.transsnet.palmpay.account.bean.rsp.BvnIdentityInfoRsp;
import com.transsnet.palmpay.account.ui.activity.IdentityVerificationActivity;
import com.transsnet.palmpay.account.ui.viewmodel.IdentityVerificationViewModel;
import com.transsnet.palmpay.core.base.BaseMvvmVBFragment;
import com.transsnet.palmpay.core.base.l;
import com.transsnet.palmpay.core.util.statistic.IAutoTrack;
import com.transsnet.palmpay.custom_view.utils.CommonViewExtKt;
import com.transsnet.palmpay.util.TimeUtils;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u00042\u00020\u0005B\u0007¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/transsnet/palmpay/account/ui/fragment/identify/IdentityVerificationConfirmBvnFragment;", "Lcom/transsnet/palmpay/core/base/BaseMvvmVBFragment;", "Lcom/transsnet/palmpay/account/ui/viewmodel/IdentityVerificationViewModel;", "LI8/q;", "Landroid/text/TextWatcher;", "Lcom/transsnet/palmpay/core/util/statistic/IAutoTrack;", "<init>", "()V", "module_account_impl_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nIdentityVerificationConfirmBvnFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 IdentityVerificationConfirmBvnFragment.kt\ncom/transsnet/palmpay/account/ui/fragment/identify/IdentityVerificationConfirmBvnFragment\n+ 2 LifecycleOwnerKtx.kt\ncom/transsnet/palmpay/core/base/ext/LifecycleOwnerKtxKt\n+ 3 XDatePickerDialog.kt\ncom/palmpay/lib/ui/picker/picker/XDatePickerDialog$Builder$Companion\n*L\n1#1,366:1\n171#2,12:367\n215#2:379\n171#2,12:380\n215#2:392\n138#3:393\n*S KotlinDebug\n*F\n+ 1 IdentityVerificationConfirmBvnFragment.kt\ncom/transsnet/palmpay/account/ui/fragment/identify/IdentityVerificationConfirmBvnFragment\n*L\n140#1:367,12\n140#1:379\n198#1:380,12\n198#1:392\n340#1:393\n*E\n"})
public final class IdentityVerificationConfirmBvnFragment extends BaseMvvmVBFragment<IdentityVerificationViewModel, q> implements TextWatcher, IAutoTrack {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public BvnIdentityInfoRsp f26167o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public AbstractC0130w f26168p;

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable s3) {
        Intrinsics.checkNotNullParameter(s3, "s");
        y();
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence s3, int i7, int i10, int i11) {
        Intrinsics.checkNotNullParameter(s3, "s");
    }

    @Override // com.transsnet.palmpay.core.util.statistic.IAutoTrack
    public final String getPageAlias() {
        return "QuickVerificationConfirmation";
    }

    @Override // com.transsnet.palmpay.core.base.BaseMvvmVBFragment, com.transsnet.palmpay.core.base.BaseFragment
    public final int h() {
        return 0;
    }

    @Override // com.transsnet.palmpay.core.base.BaseMvvmFragment, com.transsnet.palmpay.core.base.BaseFragment
    public final int k() {
        ImageView rightImg;
        AppCompatEditText editText;
        AppCompatEditText editText2;
        AppCompatEditText editText3;
        AppCompatEditText editText4;
        AppCompatEditText editText5;
        q qVar = (q) this.f27335j;
        if (qVar != null) {
            qVar.f4188b.setEditTextWatcher(this);
        }
        q qVar2 = (q) this.f27335j;
        PpFormVertical ppFormVertical = qVar2 != null ? qVar2.f4188b : null;
        h hVar = new h(this, 0);
        if (ppFormVertical != null && (editText5 = ppFormVertical.getEditText()) != null) {
            editText5.setFocusable(false);
        }
        if (ppFormVertical != null && (editText4 = ppFormVertical.getEditText()) != null) {
            editText4.setEnabled(true);
        }
        if (ppFormVertical != null && (editText3 = ppFormVertical.getEditText()) != null) {
            editText3.setInputType(524289);
        }
        if (ppFormVertical != null && (editText2 = ppFormVertical.getEditText()) != null) {
            editText2.setOnClickListener(hVar);
        }
        if (ppFormVertical != null) {
            ppFormVertical.setRightIconClickListener(hVar);
        }
        q qVar3 = (q) this.f27335j;
        if (qVar3 != null && (editText = qVar3.f4188b.getEditText()) != null) {
            editText.setTextColor(CommonViewExtKt.colorInt(b.ppColorTextPrimary, requireContext()));
        }
        q qVar4 = (q) this.f27335j;
        if (qVar4 != null && (rightImg = qVar4.f4188b.getRightImg()) != null) {
            Context context = getContext();
            rightImg.setImageDrawable(context != null ? a.x(context, S6.a.pay_Arrowdown, Integer.valueOf(requireContext().getColor(b.ppColorTextNormal)), null, 24.0f, 116) : null);
        }
        BvnIdentityInfoRsp bvnIdentityInfoRsp = this.f26167o;
        if (TextUtils.isEmpty(bvnIdentityInfoRsp != null ? bvnIdentityInfoRsp.bvnHide : null)) {
            q qVar5 = (q) this.f27335j;
            if (qVar5 != null) {
                TextView textView = qVar5.f4192f;
                BvnIdentityInfoRsp bvnIdentityInfoRsp2 = this.f26167o;
                textView.setText(bvnIdentityInfoRsp2 != null ? bvnIdentityInfoRsp2.ninHide : null);
            }
            q qVar6 = (q) this.f27335j;
            if (qVar6 != null) {
                qVar6.f4191e.setText("NIN");
            }
        } else {
            q qVar7 = (q) this.f27335j;
            if (qVar7 != null) {
                TextView textView2 = qVar7.f4192f;
                BvnIdentityInfoRsp bvnIdentityInfoRsp3 = this.f26167o;
                textView2.setText(bvnIdentityInfoRsp3 != null ? bvnIdentityInfoRsp3.bvnHide : null);
            }
            q qVar8 = (q) this.f27335j;
            if (qVar8 != null) {
                qVar8.f4191e.setText(ResetPinVerifyTypeRsp.VERIFY_TYPE_BVN);
            }
        }
        q qVar9 = (q) this.f27335j;
        if (qVar9 != null) {
            TextView textView3 = qVar9.f4193g;
            BvnIdentityInfoRsp bvnIdentityInfoRsp4 = this.f26167o;
            textView3.setText(bvnIdentityInfoRsp4 != null ? bvnIdentityInfoRsp4.firstNameHide : null);
        }
        q qVar10 = (q) this.f27335j;
        if (qVar10 != null) {
            TextView textView4 = qVar10.f4194i;
            BvnIdentityInfoRsp bvnIdentityInfoRsp5 = this.f26167o;
            textView4.setText(bvnIdentityInfoRsp5 != null ? bvnIdentityInfoRsp5.lastNameHide : null);
        }
        q qVar11 = (q) this.f27335j;
        if (qVar11 != null) {
            qVar11.f4185A.setOnClickListener(new h(this, 1));
        }
        BvnIdentityInfoRsp bvnIdentityInfoRsp6 = this.f26167o;
        if (TextUtils.isEmpty(bvnIdentityInfoRsp6 != null ? bvnIdentityInfoRsp6.birthday : null)) {
            q qVar12 = (q) this.f27335j;
            if (qVar12 != null) {
                p220oa.h.s(qVar12.f4195j, false);
            }
            q qVar13 = (q) this.f27335j;
            if (qVar13 != null) {
                p220oa.h.s(qVar13.f4199w, false);
            }
            q qVar14 = (q) this.f27335j;
            if (qVar14 != null) {
                p220oa.h.s(qVar14.f4189c, true);
                return 0;
            }
        } else {
            try {
                Locale locale = Locale.ENGLISH;
                SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd", locale);
                BvnIdentityInfoRsp bvnIdentityInfoRsp7 = this.f26167o;
                String str = bvnIdentityInfoRsp7 != null ? bvnIdentityInfoRsp7.birthday : null;
                Intrinsics.e(str);
                Date date = simpleDateFormat.parse(str);
                q qVar15 = (q) this.f27335j;
                if (qVar15 != null) {
                    qVar15.f4195j.setText(TimeUtils.date2String(date, new SimpleDateFormat("MMM dd, yyyy", locale)));
                }
            } catch (Exception unused) {
                q qVar16 = (q) this.f27335j;
                if (qVar16 != null) {
                    TextView textView5 = qVar16.f4195j;
                    BvnIdentityInfoRsp bvnIdentityInfoRsp8 = this.f26167o;
                    textView5.setText(bvnIdentityInfoRsp8 != null ? bvnIdentityInfoRsp8.birthday : null);
                }
            }
            q qVar17 = (q) this.f27335j;
            if (qVar17 != null) {
                p220oa.h.s(qVar17.f4195j, true);
            }
            q qVar18 = (q) this.f27335j;
            if (qVar18 != null) {
                p220oa.h.s(qVar18.f4199w, true);
            }
            q qVar19 = (q) this.f27335j;
            if (qVar19 != null) {
                p220oa.h.s(qVar19.f4189c, false);
            }
        }
        return 0;
    }

    @Override // com.transsnet.palmpay.core.base.BaseMvvmFragment, com.transsnet.palmpay.core.base.BaseFragment
    public final void n() {
        y();
        IdentityVerificationViewModel identityVerificationViewModel = (IdentityVerificationViewModel) this.f27333i;
        l lVar = identityVerificationViewModel != null ? identityVerificationViewModel.f26423g : null;
        if (lVar != null) {
            lVar.e(this, new G(new C0139f(28, this, this), 18));
        }
        IdentityVerificationViewModel identityVerificationViewModel2 = (IdentityVerificationViewModel) this.f27333i;
        l lVar2 = identityVerificationViewModel2 != null ? identityVerificationViewModel2.f26424i : null;
        if (lVar2 != null) {
            lVar2.e(this, new G(new o(2, this, this), 18));
        }
    }

    @Override // com.transsnet.palmpay.core.base.BaseMvvmFragment, com.transsnet.palmpay.core.base.BaseFragment
    public final int o() {
        super.o();
        IdentityVerificationActivity identityVerificationActivityV = v();
        if (identityVerificationActivityV != null) {
            identityVerificationActivityV.s((IdentityVerificationViewModel) this.f27333i, new C0463g(this, 14));
        }
        this.f26168p = NavHostFragment.f17502e.findNavController(this);
        Bundle arguments = getArguments();
        if (arguments != null) {
            this.f26167o = (BvnIdentityInfoRsp) arguments.getParcelable("extra_data");
        }
        q qVar = (q) this.f27335j;
        if (qVar == null) {
            return 0;
        }
        qVar.f4190d.setOnClickListener(new h(this, 2));
        return 0;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onPause() {
        w();
        super.onPause();
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence s3, int i7, int i10, int i11) {
        Intrinsics.checkNotNullParameter(s3, "s");
    }

    @Override // com.transsnet.palmpay.core.base.BaseMvvmVBFragment
    public final ViewBinding t(LayoutInflater inflater, ViewGroup viewGroup) {
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        View viewInflate = inflater.inflate(e.ac_fragment_identity_verification_step_confirm_bvn, viewGroup, false);
        int i7 = d.bottomView;
        View viewM = p059e1.a.m(i7, viewInflate);
        if (viewM != null) {
            Pb.a.bind(viewM);
            i7 = d.inputBirthday;
            PpFormVertical ppFormVertical = (PpFormVertical) p059e1.a.m(i7, viewInflate);
            if (ppFormVertical != null) {
                i7 = d.layoutBirthDay;
                LinearLayout linearLayout = (LinearLayout) p059e1.a.m(i7, viewInflate);
                if (linearLayout != null) {
                    i7 = d.textViewNext;
                    PpButton ppButton = (PpButton) p059e1.a.m(i7, viewInflate);
                    if (ppButton != null) {
                        i7 = d.tvLine0;
                        TextView textView = (TextView) p059e1.a.m(i7, viewInflate);
                        if (textView != null) {
                            i7 = d.tvLine1;
                            TextView textView2 = (TextView) p059e1.a.m(i7, viewInflate);
                            if (textView2 != null) {
                                i7 = d.tvLine2;
                                TextView textView3 = (TextView) p059e1.a.m(i7, viewInflate);
                                if (textView3 != null) {
                                    i7 = d.tvLine3;
                                    TextView textView4 = (TextView) p059e1.a.m(i7, viewInflate);
                                    if (textView4 != null) {
                                        i7 = d.tvLine4;
                                        TextView textView5 = (TextView) p059e1.a.m(i7, viewInflate);
                                        if (textView5 != null) {
                                            i7 = d.tvName0;
                                            TextView textView6 = (TextView) p059e1.a.m(i7, viewInflate);
                                            if (textView6 != null) {
                                                i7 = d.tvName1;
                                                TextView textView7 = (TextView) p059e1.a.m(i7, viewInflate);
                                                if (textView7 != null) {
                                                    i7 = d.tvName2;
                                                    TextView textView8 = (TextView) p059e1.a.m(i7, viewInflate);
                                                    if (textView8 != null) {
                                                        i7 = d.tvName3;
                                                        TextView textView9 = (TextView) p059e1.a.m(i7, viewInflate);
                                                        if (textView9 != null) {
                                                            i7 = d.tvName4;
                                                            TextView textView10 = (TextView) p059e1.a.m(i7, viewInflate);
                                                            if (textView10 != null) {
                                                                i7 = d.tvNotMe;
                                                                PpButton ppButton2 = (PpButton) p059e1.a.m(i7, viewInflate);
                                                                if (ppButton2 != null) {
                                                                    i7 = d.tvTitle;
                                                                    TextView textView11 = (TextView) p059e1.a.m(i7, viewInflate);
                                                                    if (textView11 != null) {
                                                                        q qVar = new q((ConstraintLayout) viewInflate, ppFormVertical, linearLayout, ppButton, textView, textView2, textView3, textView4, textView5, textView6, textView7, textView8, textView9, textView10, ppButton2, textView11);
                                                                        Intrinsics.checkNotNullExpressionValue(qVar, "inflate(...)");
                                                                        return qVar;
                                                                    }
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
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

    public final Calendar u() {
        PpFormVertical ppFormVertical;
        q qVar = (q) this.f27335j;
        Object tag = (qVar == null || (ppFormVertical = qVar.f4188b) == null) ? null : ppFormVertical.getTag();
        if (tag instanceof Calendar) {
            return (Calendar) tag;
        }
        Calendar calendar = Calendar.getInstance();
        calendar.set(1, calendar.get(1) - 18);
        calendar.setTimeInMillis(calendar.getTimeInMillis() - 86400000);
        return calendar;
    }

    public final IdentityVerificationActivity v() {
        E e10 = this.f27319c;
        if (!(e10 instanceof IdentityVerificationActivity)) {
            return null;
        }
        Intrinsics.f(e10, "null cannot be cast to non-null type com.transsnet.palmpay.account.ui.activity.IdentityVerificationActivity");
        return (IdentityVerificationActivity) e10;
    }

    public final void w() {
        AddUserExtraInfoReq addUserExtraInfoReqL;
        CheckIdentifyReq checkIdentifyReqN;
        IdentityVerificationActivity identityVerificationActivityV = v();
        if (identityVerificationActivityV != null && (checkIdentifyReqN = identityVerificationActivityV.n()) != null) {
            checkIdentifyReqN.identityAuthen = true;
            x(checkIdentifyReqN);
        }
        IdentityVerificationActivity identityVerificationActivityV2 = v();
        if (identityVerificationActivityV2 == null || (addUserExtraInfoReqL = identityVerificationActivityV2.l()) == null) {
            return;
        }
        x(addUserExtraInfoReqL);
    }

    public final void x(AddUserExtraInfoReq addUserExtraInfoReq) {
        BvnIdentityInfoRsp bvnIdentityInfoRsp = this.f26167o;
        String strDate2String = null;
        if (TextUtils.isEmpty(bvnIdentityInfoRsp != null ? bvnIdentityInfoRsp.birthday : null)) {
            strDate2String = TimeUtils.date2String(u().getTime(), new SimpleDateFormat("yyyy-MM-dd", Locale.ENGLISH));
            Intrinsics.checkNotNullExpressionValue(strDate2String, "date2String(...)");
        } else {
            BvnIdentityInfoRsp bvnIdentityInfoRsp2 = this.f26167o;
            if (bvnIdentityInfoRsp2 != null) {
                strDate2String = bvnIdentityInfoRsp2.birthday;
            }
        }
        addUserExtraInfoReq.birthday = strDate2String;
    }

    /* JADX WARN: Code duplicated, block: B:16:0x0025  */
    public final boolean y() {
        boolean z3;
        PpButton ppButton;
        PpFormVertical ppFormVertical;
        BvnIdentityInfoRsp bvnIdentityInfoRsp = this.f26167o;
        String editContent = null;
        if (TextUtils.isEmpty(bvnIdentityInfoRsp != null ? bvnIdentityInfoRsp.birthday : null)) {
            q qVar = (q) this.f27335j;
            if (qVar != null && (ppFormVertical = qVar.f4188b) != null) {
                editContent = ppFormVertical.getEditContent();
            }
            if (TextUtils.isEmpty(editContent)) {
                z3 = false;
            } else {
                z3 = true;
            }
        } else {
            z3 = true;
        }
        q qVar2 = (q) this.f27335j;
        if (qVar2 != null && (ppButton = qVar2.f4190d) != null) {
            ppButton.setEnabled(z3);
        }
        return z3;
    }
}
