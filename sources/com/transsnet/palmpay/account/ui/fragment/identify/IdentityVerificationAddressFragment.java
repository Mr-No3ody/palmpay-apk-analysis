package com.transsnet.palmpay.account.ui.fragment.identify;

import De.d;
import Fd.G;
import I8.p;
import L6.b;
import M3.f;
import M7.s;
import Pa.b0;
import Pa.r0;
import T6.c;
import Ua.ViewOnFocusChangeListenerC0631l;
import V8.C0708b;
import V8.ViewOnClickListenerC0710d;
import V8.g;
import Wf.AbstractC0780y;
import Wf.I;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatEditText;
import androidx.constraintlayout.widget.Barrier;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.view.H;
import androidx.core.view.N;
import androidx.core.widget.NestedScrollView;
import androidx.fragment.app.E;
import androidx.lifecycle.LifecycleCoroutineScopeImpl;
import androidx.lifecycle.V;
import androidx.viewbinding.ViewBinding;
import com.palmpay.lib.ui.button.PpButton;
import com.palmpay.lib.ui.form.PpFormVertical;
import com.transsnet.adsdk.widgets.SingleAdView;
import com.transsnet.palmpay.account.bean.req.AddUserExtraInfoReq;
import com.transsnet.palmpay.account.bean.req.BaseUserInfoReq;
import com.transsnet.palmpay.account.bean.req.CheckIdentifyReq;
import com.transsnet.palmpay.account.bean.rsp.CountryRegionList;
import com.transsnet.palmpay.account.bean.rsp.PreCheckPhoneRsp;
import com.transsnet.palmpay.account.ui.activity.IdentityVerificationActivity;
import com.transsnet.palmpay.account.ui.viewmodel.IdentityVerificationViewModel;
import com.transsnet.palmpay.core.base.BaseMvvmVBFragment;
import com.transsnet.palmpay.core.base.l;
import com.transsnet.palmpay.core.callback.CustomActionCallback;
import com.transsnet.palmpay.core.util.statistic.IAutoTrack;
import com.transsnet.palmpay.custom_view.utils.CommonViewExtKt;
import com.transsnet.palmpay.custom_view.utils.KeyBoardListenerHelper;
import io.fastkv.n;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import p025ba.k;
import p042cg.e;
import p220oa.h;
import p355xf.C2131j;
import p355xf.t;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u00042\u00020\u00052\u00020\u00062\u00020\u0007:\u0001\nB\u0007¢\u0006\u0004\b\b\u0010\t¨\u0006\u000b"}, d2 = {"Lcom/transsnet/palmpay/account/ui/fragment/identify/IdentityVerificationAddressFragment;", "Lcom/transsnet/palmpay/core/base/BaseMvvmVBFragment;", "Lcom/transsnet/palmpay/account/ui/viewmodel/IdentityVerificationViewModel;", "LI8/p;", "Landroid/text/TextWatcher;", "Lcom/transsnet/palmpay/core/callback/CustomActionCallback;", "Lcom/transsnet/palmpay/core/util/statistic/IAutoTrack;", "Lcom/transsnet/palmpay/custom_view/utils/KeyBoardListenerHelper$OnKeyBoardChangeListener;", "<init>", "()V", "a", "module_account_impl_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nIdentityVerificationAddressFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 IdentityVerificationAddressFragment.kt\ncom/transsnet/palmpay/account/ui/fragment/identify/IdentityVerificationAddressFragment\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 LifecycleOwnerKtx.kt\ncom/transsnet/palmpay/core/base/ext/LifecycleOwnerKtxKt\n+ 4 ArraysJVM.kt\nkotlin/collections/ArraysKt__ArraysJVMKt\n*L\n1#1,923:1\n1#2:924\n171#3,12:925\n215#3:937\n171#3,12:938\n215#3:950\n37#4:951\n36#4,3:952\n37#4:955\n36#4,3:956\n37#4:959\n36#4,3:960\n*S KotlinDebug\n*F\n+ 1 IdentityVerificationAddressFragment.kt\ncom/transsnet/palmpay/account/ui/fragment/identify/IdentityVerificationAddressFragment\n*L\n273#1:925,12\n273#1:937\n302#1:938,12\n302#1:950\n549#1:951\n549#1:952,3\n593#1:955\n593#1:956,3\n629#1:959\n629#1:960,3\n*E\n"})
public final class IdentityVerificationAddressFragment extends BaseMvvmVBFragment<IdentityVerificationViewModel, p> implements TextWatcher, CustomActionCallback, IAutoTrack, KeyBoardListenerHelper.OnKeyBoardChangeListener {

    /* JADX INFO: renamed from: Q, reason: collision with root package name */
    public static final /* synthetic */ int f26156Q = 0;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public int f26158B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public List f26159C;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    public int f26160H;

    /* JADX INFO: renamed from: L, reason: collision with root package name */
    public String f26161L;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public String f26163o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public String f26164p;
    public String t;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public boolean f26165v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public List f26166w;

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public final t f26157A = C2131j.b(new b0(14));

    /* JADX INFO: renamed from: M, reason: collision with root package name */
    public final t f26162M = C2131j.b(new f(this, 24));

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @JvmStatic
        @NotNull
        public final IdentityVerificationAddressFragment newInstance() {
            IdentityVerificationAddressFragment identityVerificationAddressFragment = new IdentityVerificationAddressFragment();
            identityVerificationAddressFragment.setArguments(new Bundle());
            return identityVerificationAddressFragment;
        }

        private a() {
        }
    }

    static {
        new a(null);
    }

    public static void u(PpFormVertical ppFormVertical) {
        int i7;
        if (ppFormVertical != null && (i7 = Build.VERSION.SDK_INT) >= 26) {
            N.s(ppFormVertical, 8);
            AppCompatEditText editText = ppFormVertical.getEditText();
            if (editText != null) {
                N.s(editText, 2);
                String[] strArr = new String[0];
                if (i7 >= 26) {
                    H.b(editText, strArr);
                }
            }
            ppFormVertical.setOnFocusChangeListener(new ViewOnFocusChangeListenerC0631l(1));
        }
    }

    public static String v(PpFormVertical ppFormVertical) {
        String editContent;
        return (ppFormVertical == null || (editContent = ppFormVertical.getEditContent()) == null) ? "" : editContent;
    }

    /* JADX WARN: Code duplicated, block: B:46:0x00ac A[EDGE_INSN: B:46:0x00ac->B:48:0x00b0 BREAK  A[LOOP:1: B:36:0x007b->B:88:0x007b]] */
    /* JADX WARN: Code duplicated, block: B:75:0x0117 A[EDGE_INSN: B:75:0x0117->B:77:0x011b BREAK  A[LOOP:3: B:65:0x00e6->B:95:0x00e6]] */
    public final void A(BaseUserInfoReq baseUserInfoReq) {
        String str;
        String str2;
        String str3;
        p pVar = (p) this.f27335j;
        String stateName = v(pVar != null ? pVar.f4177c : null);
        baseUserInfoReq.stateName = stateName;
        Intrinsics.checkNotNullExpressionValue(stateName, "stateName");
        if (this.f26166w != null && !TextUtils.isEmpty(stateName)) {
            List list = this.f26166w;
            Intrinsics.e(list);
            Iterator it = list.iterator();
            while (true) {
                if (!it.hasNext()) {
                    str = this.f26163o;
                    break;
                }
                CountryRegionList countryRegionList = (CountryRegionList) it.next();
                if (stateName.equals(countryRegionList.areaName)) {
                    str = countryRegionList.areaCode;
                    break;
                }
            }
        } else {
            str = null;
        }
        baseUserInfoReq.stateCode = str;
        p pVar2 = (p) this.f27335j;
        String strV = v(pVar2 != null ? pVar2.f4178d : null);
        baseUserInfoReq.areaName = strV;
        String str4 = baseUserInfoReq.stateName;
        if (!TextUtils.isEmpty(str4) && !TextUtils.isEmpty(strV)) {
            List list2 = this.f26166w;
            if (list2 == null) {
                str2 = this.f26164p;
                break;
            }
            if (list2.isEmpty()) {
                list2 = null;
            }
            if (list2 == null) {
                str2 = this.f26164p;
                break;
            }
            Iterator it2 = list2.iterator();
            loop1: while (true) {
                if (!it2.hasNext()) {
                    str2 = this.f26164p;
                    break;
                }
                CountryRegionList countryRegionList2 = (CountryRegionList) it2.next();
                if (Intrinsics.c(str4, countryRegionList2.areaName)) {
                    for (CountryRegionList countryRegionList3 : countryRegionList2.children) {
                        if (strV.equals(countryRegionList3.areaName)) {
                            str2 = countryRegionList3.areaCode;
                            break loop1;
                        }
                    }
                }
            }
        } else {
            str2 = null;
        }
        baseUserInfoReq.areaCode = str2;
        p pVar3 = (p) this.f27335j;
        String strV2 = v(pVar3 != null ? pVar3.f4179e : null);
        baseUserInfoReq.lgaName = strV2;
        String str5 = baseUserInfoReq.areaName;
        if (!TextUtils.isEmpty(strV2) && !TextUtils.isEmpty(str5)) {
            List list3 = this.f26159C;
            if (list3 == null) {
                str3 = this.t;
                break;
            }
            if (list3.isEmpty()) {
                list3 = null;
            }
            if (list3 == null) {
                str3 = this.t;
                break;
            }
            Iterator it3 = list3.iterator();
            loop3: while (true) {
                if (!it3.hasNext()) {
                    str3 = this.t;
                    break;
                }
                CountryRegionList countryRegionList4 = (CountryRegionList) it3.next();
                if (Intrinsics.c(str5, countryRegionList4.areaName)) {
                    for (CountryRegionList countryRegionList5 : countryRegionList4.children) {
                        if (strV2.equals(countryRegionList5.areaName)) {
                            str3 = countryRegionList5.areaCode;
                            break loop3;
                        }
                    }
                }
            }
        } else {
            str3 = null;
        }
        baseUserInfoReq.lgaCode = str3;
        p pVar4 = (p) this.f27335j;
        baseUserInfoReq.street = v(pVar4 != null ? pVar4.f4180f : null);
    }

    public final void B(String str) {
        CheckIdentifyReq checkIdentifyReqN;
        Intent intent = new Intent();
        intent.putExtra("_token", str);
        IdentityVerificationActivity identityVerificationActivityX = x();
        if (identityVerificationActivityX != null && (checkIdentifyReqN = identityVerificationActivityX.n()) != null) {
            intent.putExtra("stateCode", checkIdentifyReqN.stateCode);
            intent.putExtra("stateName", checkIdentifyReqN.stateName);
            intent.putExtra("lgaCode", checkIdentifyReqN.lgaCode);
            intent.putExtra("lgaName", checkIdentifyReqN.lgaName);
            intent.putExtra("areaCode", checkIdentifyReqN.areaCode);
            intent.putExtra("areaName", checkIdentifyReqN.areaName);
            intent.putExtra("street", checkIdentifyReqN.street);
            intent.putExtra("industry", checkIdentifyReqN.industry);
            intent.putExtra("profession", checkIdentifyReqN.profession);
            intent.putExtra("sourceOfFunds", checkIdentifyReqN.sourceOfFunds);
            intent.putExtra("annualIncome", checkIdentifyReqN.annualIncome);
            Boolean bool = checkIdentifyReqN.politicallyExposedPerson;
            if (bool != null) {
                intent.putExtra("politicallyExposedPerson", bool != null ? bool.booleanValue() : false);
            }
            Boolean bool2 = checkIdentifyReqN.currentPolitically;
            if (bool2 != null) {
                intent.putExtra("currentPolitically", bool2 != null ? bool2.booleanValue() : false);
            }
            intent.putExtra("positionHeld", checkIdentifyReqN.positionHeld);
            intent.putExtra("nationality", checkIdentifyReqN.nationality);
            if (!TextUtils.isEmpty(checkIdentifyReqN.faceToken)) {
                intent.putExtra("_face_token", checkIdentifyReqN.faceToken);
            }
        }
        E activity = getActivity();
        if (activity != null) {
            activity.setResult(-1, intent);
        }
        E activity2 = getActivity();
        if (activity2 != null) {
            activity2.finish();
        }
    }

    public final void C(PpFormVertical ppFormVertical, View.OnClickListener onClickListener) {
        AppCompatEditText editText;
        AppCompatEditText editText2;
        AppCompatEditText editText3;
        AppCompatEditText editText4;
        AppCompatEditText editText5;
        AppCompatEditText editText6;
        AppCompatEditText editText7;
        if (ppFormVertical != null && (editText7 = ppFormVertical.getEditText()) != null) {
            editText7.setFocusable(false);
        }
        if (ppFormVertical != null && (editText6 = ppFormVertical.getEditText()) != null) {
            editText6.setFocusableInTouchMode(false);
        }
        if (ppFormVertical != null && (editText5 = ppFormVertical.getEditText()) != null) {
            editText5.setEnabled(true);
        }
        if (ppFormVertical != null) {
            ppFormVertical.f();
        }
        if (ppFormVertical != null && (editText4 = ppFormVertical.getEditText()) != null) {
            editText4.setLongClickable(false);
        }
        if (ppFormVertical != null && (editText3 = ppFormVertical.getEditText()) != null) {
            editText3.setTextIsSelectable(false);
        }
        if (ppFormVertical != null && (editText2 = ppFormVertical.getEditText()) != null) {
            editText2.setTextColor(CommonViewExtKt.colorInt(b.ppColorTextPrimary, requireContext()));
        }
        if (ppFormVertical != null && (editText = ppFormVertical.getEditText()) != null) {
            editText.setOnClickListener(onClickListener);
        }
        if (ppFormVertical != null) {
            ppFormVertical.setRightIconClickListener(onClickListener);
        }
    }

    public final void D() {
        List listW = w();
        if (listW.isEmpty()) {
            listW = null;
        }
        if (listW != null) {
            com.transsnet.palmpay.custom_view.dialog.p pVar = new com.transsnet.palmpay.custom_view.dialog.p(requireContext());
            pVar.b(k.core_select);
            pVar.a((CharSequence[]) w().toArray(new String[0]), this.f26158B < w().size() ? this.f26158B : 0, new d(this, 2));
            pVar.show();
        }
    }

    public final void E() {
        p pVar = (p) this.f27335j;
        boolean z3 = !TextUtils.isEmpty(v(pVar != null ? pVar.f4180f : null));
        p pVar2 = (p) this.f27335j;
        if (TextUtils.isEmpty(v(pVar2 != null ? pVar2.f4178d : null))) {
            z3 = false;
        }
        p pVar3 = (p) this.f27335j;
        if (TextUtils.isEmpty(v(pVar3 != null ? pVar3.f4177c : null))) {
            z3 = false;
        }
        p pVar4 = (p) this.f27335j;
        boolean z8 = TextUtils.isEmpty(v(pVar4 != null ? pVar4.f4179e : null)) ? false : z3;
        p pVar5 = (p) this.f27335j;
        if (pVar5 != null) {
            pVar5.f4182i.setEnabled(z8);
        }
    }

    public final void F(PpFormVertical ppFormVertical) {
        ImageView rightImg;
        ImageView rightImg2;
        if (ppFormVertical != null && (rightImg2 = ppFormVertical.getRightImg()) != null) {
            Context context = getContext();
            rightImg2.setImageDrawable(context != null ? G8.a.x(context, S6.a.pay_Arrowdown, Integer.valueOf(requireContext().getColor(b.ppColorTextNormal)), null, 24.0f, 116) : null);
        }
        if (ppFormVertical == null || (rightImg = ppFormVertical.getRightImg()) == null) {
            return;
        }
        h.s(rightImg, true);
    }

    @Override // com.transsnet.palmpay.custom_view.utils.KeyBoardListenerHelper.OnKeyBoardChangeListener
    public final void OnKeyBoardChange(boolean z3, int i7) {
        p pVar;
        if (!z3 || (pVar = (p) this.f27335j) == null) {
            return;
        }
        pVar.f4181g.postDelayed(new s(this, 25), 500L);
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable s3) {
        Intrinsics.checkNotNullParameter(s3, "s");
        E();
        p pVar = (p) this.f27335j;
        if (pVar != null) {
            pVar.f4177c.setBottomText(null);
        }
        p pVar2 = (p) this.f27335j;
        if (pVar2 != null) {
            pVar2.f4178d.setBottomText(null);
        }
        p pVar3 = (p) this.f27335j;
        if (pVar3 != null) {
            pVar3.f4179e.setBottomText(null);
        }
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence s3, int i7, int i10, int i11) {
        Intrinsics.checkNotNullParameter(s3, "s");
    }

    @Override // com.transsnet.palmpay.core.util.statistic.IAutoTrack
    public final String getPageAlias() {
        return "AddressEntry";
    }

    @Override // com.transsnet.palmpay.core.callback.CustomActionCallback
    public final boolean goBack(String str) {
        if (this.f26165v) {
            return false;
        }
        LifecycleCoroutineScopeImpl lifecycleCoroutineScopeImplF = V.f(this);
        p042cg.f fVar = I.f10809a;
        AbstractC0780y.m(lifecycleCoroutineScopeImplF, e.f19009c, null, new V8.f(this, null), 2);
        return true;
    }

    @Override // com.transsnet.palmpay.core.base.BaseMvvmVBFragment, com.transsnet.palmpay.core.base.BaseFragment
    public final int h() {
        return 0;
    }

    @Override // com.transsnet.palmpay.core.base.BaseMvvmFragment, com.transsnet.palmpay.core.base.BaseFragment
    public final int k() {
        AppCompatEditText editText;
        AppCompatEditText editText2;
        AppCompatEditText editText3;
        PreCheckPhoneRsp preCheckPhoneRsp;
        p pVar;
        IdentityVerificationActivity identityVerificationActivityX = x();
        if (identityVerificationActivityX != null && Intrinsics.c(identityVerificationActivityX.f25866e, "FROM_REGISITER_PAGE") && (pVar = (p) this.f27335j) != null) {
            pVar.f4176b.setSlotId("9BD3D0A7458341C7A004F3804F4F68F6");
        }
        p pVar2 = (p) this.f27335j;
        F(pVar2 != null ? pVar2.f4177c : null);
        p pVar3 = (p) this.f27335j;
        F(pVar3 != null ? pVar3.f4178d : null);
        p pVar4 = (p) this.f27335j;
        F(pVar4 != null ? pVar4.f4179e : null);
        p pVar5 = (p) this.f27335j;
        if (pVar5 != null) {
            pVar5.f4177c.setTitle(h.B(r0.H0(F8.h.ac_address_level1_name), getActivity(), null, Integer.valueOf(b.ppColorTextPrimary), null, null, null, 1018));
        }
        p pVar6 = (p) this.f27335j;
        if (pVar6 != null) {
            pVar6.f4178d.setTitle(h.B(r0.H0(F8.h.ac_address_level2_name), getActivity(), null, Integer.valueOf(b.ppColorTextPrimary), null, null, null, 1018));
        }
        p pVar7 = (p) this.f27335j;
        if (pVar7 != null) {
            pVar7.f4179e.setTitle(h.B(r0.H0(F8.h.ac_address_level3_name), getActivity(), null, Integer.valueOf(b.ppColorTextPrimary), null, null, null, 1018));
        }
        p pVar8 = (p) this.f27335j;
        if (pVar8 != null) {
            pVar8.f4180f.setTitle(h.B(r0.H0(F8.h.ac_street_address), getActivity(), null, Integer.valueOf(b.ppColorTextPrimary), null, null, null, 1018));
        }
        p pVar9 = (p) this.f27335j;
        if (pVar9 != null) {
            pVar9.f4177c.setEditTextWatcher(this);
        }
        p pVar10 = (p) this.f27335j;
        if (pVar10 != null) {
            pVar10.f4178d.setEditTextWatcher(this);
        }
        p pVar11 = (p) this.f27335j;
        if (pVar11 != null) {
            pVar11.f4179e.setEditTextWatcher(this);
        }
        p pVar12 = (p) this.f27335j;
        if (pVar12 != null) {
            pVar12.f4180f.setEditTextWatcher(this);
        }
        p pVar13 = (p) this.f27335j;
        if (pVar13 != null) {
            pVar13.f4182i.setOnClickListener(new ViewOnClickListenerC0710d(this, 0));
        }
        p pVar14 = (p) this.f27335j;
        if (pVar14 != null) {
            TextView textView = pVar14.f4184o;
            IdentityVerificationActivity identityVerificationActivityX2 = x();
            h.s(textView, (identityVerificationActivityX2 == null || (preCheckPhoneRsp = identityVerificationActivityX2.f25869i) == null || !preCheckPhoneRsp.canSkipAddress) ? false : true);
        }
        p pVar15 = (p) this.f27335j;
        if (pVar15 != null && (editText3 = pVar15.f4180f.getEditText()) != null) {
            editText3.setImeOptions(6);
        }
        p pVar16 = (p) this.f27335j;
        if (pVar16 != null && (editText2 = pVar16.f4180f.getEditText()) != null) {
            editText2.setRawInputType(1);
        }
        p pVar17 = (p) this.f27335j;
        u(pVar17 != null ? pVar17.f4177c : null);
        p pVar18 = (p) this.f27335j;
        u(pVar18 != null ? pVar18.f4178d : null);
        p pVar19 = (p) this.f27335j;
        u(pVar19 != null ? pVar19.f4179e : null);
        p pVar20 = (p) this.f27335j;
        u(pVar20 != null ? pVar20.f4180f : null);
        p pVar21 = (p) this.f27335j;
        if (pVar21 != null && (editText = pVar21.f4180f.getEditText()) != null) {
            c cVar = new c(2);
            editText.setCustomSelectionActionModeCallback(cVar);
            editText.setCustomInsertionActionModeCallback(cVar);
        }
        Bundle arguments = getArguments();
        if (arguments != null) {
            String string = arguments.getString("stateCode");
            String string2 = arguments.getString("stateName");
            if (!TextUtils.isEmpty(string) && !TextUtils.isEmpty(string2)) {
                p pVar22 = (p) this.f27335j;
                if (pVar22 != null) {
                    pVar22.f4177c.setEditContent(string2);
                }
                this.f26163o = string;
                String string3 = arguments.getString("areaCode");
                String string4 = arguments.getString("areaName");
                if (!TextUtils.isEmpty(string3) && !TextUtils.isEmpty(string4)) {
                    p pVar23 = (p) this.f27335j;
                    if (pVar23 != null) {
                        pVar23.f4178d.setEditContent(string4);
                    }
                    this.f26164p = string3;
                    String string5 = arguments.getString("lgaCode");
                    String string6 = arguments.getString("lgaName");
                    if (!TextUtils.isEmpty(string5) && !TextUtils.isEmpty(string6)) {
                        p pVar24 = (p) this.f27335j;
                        if (pVar24 != null) {
                            pVar24.f4179e.setEditContent(string6);
                        }
                        this.t = string5;
                    }
                }
            }
            p pVar25 = (p) this.f27335j;
            if (pVar25 != null) {
                pVar25.f4180f.setEditContent(arguments.getString("street"));
            }
        }
        E();
        return 0;
    }

    @Override // com.transsnet.palmpay.core.base.BaseMvvmFragment, com.transsnet.palmpay.core.base.BaseFragment
    public final void n() {
        p pVar = (p) this.f27335j;
        C(pVar != null ? pVar.f4177c : null, new ViewOnClickListenerC0710d(this, 1));
        p pVar2 = (p) this.f27335j;
        C(pVar2 != null ? pVar2.f4178d : null, new ViewOnClickListenerC0710d(this, 2));
        p pVar3 = (p) this.f27335j;
        C(pVar3 != null ? pVar3.f4179e : null, new ViewOnClickListenerC0710d(this, 3));
        p pVar4 = (p) this.f27335j;
        if (pVar4 != null) {
            pVar4.f4184o.setOnClickListener(new ViewOnClickListenerC0710d(this, 4));
        }
        IdentityVerificationViewModel identityVerificationViewModel = (IdentityVerificationViewModel) this.f27333i;
        if (identityVerificationViewModel != null) {
            identityVerificationViewModel.j(false);
        }
        IdentityVerificationViewModel identityVerificationViewModel2 = (IdentityVerificationViewModel) this.f27333i;
        n.B(this, identityVerificationViewModel2 != null ? identityVerificationViewModel2.t : null, this, new Ba.a(this, 14), new C0708b(this, 1), true, null, 224);
        IdentityVerificationViewModel identityVerificationViewModel3 = (IdentityVerificationViewModel) this.f27333i;
        l lVar = identityVerificationViewModel3 != null ? identityVerificationViewModel3.f26423g : null;
        if (lVar != null) {
            lVar.e(this, new G(new g(this, this, 0), 17));
        }
        IdentityVerificationViewModel identityVerificationViewModel4 = (IdentityVerificationViewModel) this.f27333i;
        l lVar2 = identityVerificationViewModel4 != null ? identityVerificationViewModel4.f26424i : null;
        if (lVar2 != null) {
            lVar2.e(this, new G(new g(this, this, 1), 17));
        }
    }

    @Override // com.transsnet.palmpay.core.base.BaseMvvmFragment, com.transsnet.palmpay.core.base.BaseFragment
    public final int o() {
        ViewGroup.LayoutParams layoutParams;
        Window window;
        super.o();
        E activity = getActivity();
        if (activity != null && (window = activity.getWindow()) != null) {
            window.setSoftInputMode(19);
        }
        IdentityVerificationActivity identityVerificationActivityX = x();
        if (identityVerificationActivityX != null) {
            identityVerificationActivityX.s((IdentityVerificationViewModel) this.f27333i, new C0708b(this, 0));
        }
        p pVar = (p) this.f27335j;
        AppCompatEditText editText = pVar != null ? pVar.f4180f.getEditText() : null;
        if (editText != null) {
            editText.setInputType(131072);
        }
        if (editText != null) {
            editText.setSingleLine(false);
        }
        if (editText != null) {
            editText.setMaxLines(3);
        }
        if (editText != null && (layoutParams = editText.getLayoutParams()) != null) {
            layoutParams.height = -2;
        }
        Bundle arguments = getArguments();
        this.f26161L = arguments != null ? arguments.getString("_token") : null;
        return 0;
    }

    @Override // com.transsnet.palmpay.core.base.BaseFragment, androidx.fragment.app.Fragment
    public final void onDestroy() {
        super.onDestroy();
        ((KeyBoardListenerHelper) this.f26162M.getValue()).setOnKeyBoardChangeListener(null);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onPause() {
        z();
        super.onPause();
    }

    @Override // com.transsnet.palmpay.core.base.BaseFragment, androidx.fragment.app.Fragment
    public final void onResume() {
        super.onResume();
        ((KeyBoardListenerHelper) this.f26162M.getValue()).setOnKeyBoardChangeListener(this);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onSaveInstanceState(Bundle outState) {
        Intrinsics.checkNotNullParameter(outState, "outState");
        p pVar = (p) this.f27335j;
        outState.putString("inputAddressLevel1", v(pVar != null ? pVar.f4177c : null));
        p pVar2 = (p) this.f27335j;
        outState.putString("inputStreet", v(pVar2 != null ? pVar2.f4180f : null));
        p pVar3 = (p) this.f27335j;
        outState.putString("inputAddressLevel2", v(pVar3 != null ? pVar3.f4178d : null));
        p pVar4 = (p) this.f27335j;
        outState.putString("inputAddressLevel3", v(pVar4 != null ? pVar4.f4179e : null));
        super.onSaveInstanceState(outState);
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence s3, int i7, int i10, int i11) {
        Intrinsics.checkNotNullParameter(s3, "s");
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewStateRestored(Bundle bundle) {
        p pVar;
        PpFormVertical ppFormVertical;
        p pVar2;
        PpFormVertical ppFormVertical2;
        p pVar3;
        PpFormVertical ppFormVertical3;
        p pVar4;
        PpFormVertical ppFormVertical4;
        super.onViewStateRestored(bundle);
        String string = bundle != null ? bundle.getString("inputAddressLevel1") : null;
        if (!TextUtils.isEmpty(string) && (pVar4 = (p) this.f27335j) != null && (ppFormVertical4 = pVar4.f4177c) != null) {
            ppFormVertical4.setEditContent(string);
        }
        String string2 = bundle != null ? bundle.getString("inputStreet") : null;
        if (!TextUtils.isEmpty(string2) && (pVar3 = (p) this.f27335j) != null && (ppFormVertical3 = pVar3.f4180f) != null) {
            ppFormVertical3.setEditContent(string2);
        }
        String string3 = bundle != null ? bundle.getString("inputAddressLevel2") : null;
        if (!TextUtils.isEmpty(string3) && (pVar2 = (p) this.f27335j) != null && (ppFormVertical2 = pVar2.f4178d) != null) {
            ppFormVertical2.setEditContent(string3);
        }
        String string4 = bundle != null ? bundle.getString("inputAddressLevel3") : null;
        if (TextUtils.isEmpty(string4) || (pVar = (p) this.f27335j) == null || (ppFormVertical = pVar.f4179e) == null) {
            return;
        }
        ppFormVertical.setEditContent(string4);
    }

    @Override // com.transsnet.palmpay.core.base.BaseMvvmVBFragment
    public final ViewBinding t(LayoutInflater inflater, ViewGroup viewGroup) {
        View viewM;
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        View viewInflate = inflater.inflate(F8.e.ac_fragment_identity_verification_step_address, viewGroup, false);
        int i7 = F8.d.bottomBarrier;
        if (((Barrier) p059e1.a.m(i7, viewInflate)) != null && (viewM = p059e1.a.m((i7 = F8.d.bottomView), viewInflate)) != null) {
            Pb.a.bind(viewM);
            i7 = F8.d.cornerAd;
            SingleAdView singleAdView = (SingleAdView) p059e1.a.m(i7, viewInflate);
            if (singleAdView != null) {
                i7 = F8.d.inputAddressLevel1;
                PpFormVertical ppFormVertical = (PpFormVertical) p059e1.a.m(i7, viewInflate);
                if (ppFormVertical != null) {
                    i7 = F8.d.inputAddressLevel2;
                    PpFormVertical ppFormVertical2 = (PpFormVertical) p059e1.a.m(i7, viewInflate);
                    if (ppFormVertical2 != null) {
                        i7 = F8.d.inputAddressLevel3;
                        PpFormVertical ppFormVertical3 = (PpFormVertical) p059e1.a.m(i7, viewInflate);
                        if (ppFormVertical3 != null) {
                            i7 = F8.d.inputStreet;
                            PpFormVertical ppFormVertical4 = (PpFormVertical) p059e1.a.m(i7, viewInflate);
                            if (ppFormVertical4 != null) {
                                i7 = F8.d.scrollView;
                                NestedScrollView nestedScrollView = (NestedScrollView) p059e1.a.m(i7, viewInflate);
                                if (nestedScrollView != null) {
                                    i7 = F8.d.textViewConfirm;
                                    PpButton ppButton = (PpButton) p059e1.a.m(i7, viewInflate);
                                    if (ppButton != null) {
                                        i7 = F8.d.tvAddressError;
                                        TextView textView = (TextView) p059e1.a.m(i7, viewInflate);
                                        if (textView != null) {
                                            i7 = F8.d.tvSkip;
                                            TextView textView2 = (TextView) p059e1.a.m(i7, viewInflate);
                                            if (textView2 != null) {
                                                p pVar = new p((ConstraintLayout) viewInflate, singleAdView, ppFormVertical, ppFormVertical2, ppFormVertical3, ppFormVertical4, nestedScrollView, ppButton, textView, textView2);
                                                Intrinsics.checkNotNullExpressionValue(pVar, "inflate(...)");
                                                return pVar;
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

    public final List w() {
        return (List) this.f26157A.getValue();
    }

    public final IdentityVerificationActivity x() {
        E e10 = this.f27319c;
        if (!(e10 instanceof IdentityVerificationActivity)) {
            return null;
        }
        Intrinsics.f(e10, "null cannot be cast to non-null type com.transsnet.palmpay.account.ui.activity.IdentityVerificationActivity");
        return (IdentityVerificationActivity) e10;
    }

    public final void y() {
        IdentityVerificationActivity identityVerificationActivityX;
        PreCheckPhoneRsp preCheckPhoneRsp;
        PpButton ppButton;
        p pVar = (p) this.f27335j;
        if (pVar != null && (ppButton = pVar.f4182i) != null) {
            ppButton.b(true);
        }
        IdentityVerificationActivity identityVerificationActivityX2 = x();
        if (identityVerificationActivityX2 != null && identityVerificationActivityX2.r()) {
            if (!TextUtils.isEmpty(this.f26161L) || (identityVerificationActivityX = x()) == null || (preCheckPhoneRsp = identityVerificationActivityX.f25869i) == null || !preCheckPhoneRsp.needNameVerify) {
                B(this.f26161L);
                return;
            }
            IdentityVerificationViewModel identityVerificationViewModel = (IdentityVerificationViewModel) this.f27333i;
            if (identityVerificationViewModel != null) {
                IdentityVerificationActivity identityVerificationActivityX3 = x();
                identityVerificationViewModel.f(identityVerificationActivityX3 != null ? identityVerificationActivityX3.n() : null);
                return;
            }
            return;
        }
        IdentityVerificationActivity identityVerificationActivityX4 = x();
        if (identityVerificationActivityX4 != null && identityVerificationActivityX4.q()) {
            IdentityVerificationViewModel identityVerificationViewModel2 = (IdentityVerificationViewModel) this.f27333i;
            if (identityVerificationViewModel2 != null) {
                IdentityVerificationActivity identityVerificationActivityX5 = x();
                identityVerificationViewModel2.d(identityVerificationActivityX5 != null ? identityVerificationActivityX5.l() : null);
                return;
            }
            return;
        }
        IdentityVerificationActivity identityVerificationActivityX6 = x();
        if (TextUtils.isEmpty(identityVerificationActivityX6 != null ? identityVerificationActivityX6.m().verifyToken : null)) {
            IdentityVerificationViewModel identityVerificationViewModel3 = (IdentityVerificationViewModel) this.f27333i;
            if (identityVerificationViewModel3 != null) {
                IdentityVerificationActivity identityVerificationActivityX7 = x();
                identityVerificationViewModel3.f(identityVerificationActivityX7 != null ? identityVerificationActivityX7.n() : null);
                return;
            }
            return;
        }
        IdentityVerificationViewModel identityVerificationViewModel4 = (IdentityVerificationViewModel) this.f27333i;
        if (identityVerificationViewModel4 != null) {
            IdentityVerificationActivity identityVerificationActivityX8 = x();
            identityVerificationViewModel4.e(identityVerificationActivityX8 != null ? identityVerificationActivityX8.m() : null);
        }
    }

    public final void z() {
        AddUserExtraInfoReq addUserExtraInfoReqL;
        CheckIdentifyReq checkIdentifyReqN;
        IdentityVerificationActivity identityVerificationActivityX = x();
        if (identityVerificationActivityX != null && (checkIdentifyReqN = identityVerificationActivityX.n()) != null) {
            A(checkIdentifyReqN);
        }
        IdentityVerificationActivity identityVerificationActivityX2 = x();
        if (identityVerificationActivityX2 != null) {
            A(identityVerificationActivityX2.m());
        }
        IdentityVerificationActivity identityVerificationActivityX3 = x();
        if (identityVerificationActivityX3 == null || (addUserExtraInfoReqL = identityVerificationActivityX3.l()) == null) {
            return;
        }
        A(addUserExtraInfoReqL);
        addUserExtraInfoReqL.verifyNum = null;
        addUserExtraInfoReqL.verifyType = null;
    }
}
