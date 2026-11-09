package com.transsnet.palmpay.account.ui.fragment.identify;

import C0.AbstractC0130w;
import C0.G;
import F8.d;
import I8.t;
import L6.b;
import N8.q0;
import Pa.H;
import Pa.b0;
import Pa.i0;
import Pa.r0;
import V8.A;
import V8.D;
import V8.x;
import V8.y;
import Wf.AbstractC0780y;
import Wf.I;
import android.animation.LayoutTransition;
import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.util.Property;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.view.Window;
import android.view.animation.AccelerateInterpolator;
import android.widget.CompoundButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatEditText;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Guideline;
import androidx.core.widget.NestedScrollView;
import androidx.fragment.app.E;
import androidx.lifecycle.LifecycleCoroutineScopeImpl;
import androidx.lifecycle.V;
import androidx.navigation.fragment.NavHostFragment;
import androidx.viewbinding.ViewBinding;
import com.mikepenz.iconics.view.IconicsCheckBox;
import com.palmpay.lib.ui.button.PpButton;
import com.palmpay.lib.ui.form.PpFormVertical;
import com.transsnet.adsdk.widgets.SingleAdView;
import com.transsnet.palmpay.account.bean.req.AddUserExtraInfoReq;
import com.transsnet.palmpay.account.bean.req.BaseUserInfoReq;
import com.transsnet.palmpay.account.bean.req.CheckIdentifyReq;
import com.transsnet.palmpay.account.bean.rsp.CheckIdentifyRsp;
import com.transsnet.palmpay.account.bean.rsp.IndustryList;
import com.transsnet.palmpay.account.bean.rsp.PreCheckPhoneRsp;
import com.transsnet.palmpay.account.ui.activity.IdentityVerificationActivity;
import com.transsnet.palmpay.account.ui.fragment.identify.IdentityVerificationUserProfileFragment;
import com.transsnet.palmpay.account.ui.viewmodel.IdentityVerificationViewModel;
import com.transsnet.palmpay.core.base.BaseApplication;
import com.transsnet.palmpay.core.base.BaseMvvmVBFragment;
import com.transsnet.palmpay.core.base.l;
import com.transsnet.palmpay.core.bean.CommonListResultV2;
import com.transsnet.palmpay.core.callback.CustomActionCallback;
import com.transsnet.palmpay.core.util.statistic.IAutoTrack;
import com.transsnet.palmpay.custom_view.dialog.p;
import com.transsnet.palmpay.custom_view.utils.CommonViewExtKt;
import io.fastkv.n;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import p025ba.k;
import p042cg.e;
import p042cg.f;
import p097g9.B;
import p220oa.h;
import p355xf.C2131j;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u00042\u00020\u00052\u00020\u0006:\u0001\tB\u0007¢\u0006\u0004\b\u0007\u0010\b¨\u0006\n"}, d2 = {"Lcom/transsnet/palmpay/account/ui/fragment/identify/IdentityVerificationUserProfileFragment;", "Lcom/transsnet/palmpay/core/base/BaseMvvmVBFragment;", "Lcom/transsnet/palmpay/account/ui/viewmodel/IdentityVerificationViewModel;", "LI8/t;", "Landroid/text/TextWatcher;", "Lcom/transsnet/palmpay/core/callback/CustomActionCallback;", "Lcom/transsnet/palmpay/core/util/statistic/IAutoTrack;", "<init>", "()V", "a", "module_account_impl_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nIdentityVerificationUserProfileFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 IdentityVerificationUserProfileFragment.kt\ncom/transsnet/palmpay/account/ui/fragment/identify/IdentityVerificationUserProfileFragment\n+ 2 ViewExt.kt\ncom/transsnet/palmpay/core/ext/ViewExtKt\n+ 3 LifecycleOwnerKtx.kt\ncom/transsnet/palmpay/core/base/ext/LifecycleOwnerKtxKt\n+ 4 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 5 ArraysJVM.kt\nkotlin/collections/ArraysKt__ArraysJVMKt\n*L\n1#1,949:1\n629#2,11:950\n171#3,12:961\n215#3:973\n171#3,12:974\n215#3:986\n1869#4,2:987\n1869#4,2:989\n1869#4,2:991\n1869#4,2:993\n1869#4,2:995\n37#5:997\n36#5,3:998\n37#5:1001\n36#5,3:1002\n37#5:1005\n36#5,3:1006\n37#5:1009\n36#5,3:1010\n37#5:1013\n36#5,3:1014\n*S KotlinDebug\n*F\n+ 1 IdentityVerificationUserProfileFragment.kt\ncom/transsnet/palmpay/account/ui/fragment/identify/IdentityVerificationUserProfileFragment\n*L\n127#1:950,11\n382#1:961,12\n382#1:973\n402#1:974,12\n402#1:986\n507#1:987,2\n527#1:989,2\n547#1:991,2\n567#1:993,2\n587#1:995,2\n756#1:997\n756#1:998,3\n780#1:1001\n780#1:1002,3\n803#1:1005\n803#1:1006,3\n826#1:1009\n826#1:1010,3\n849#1:1013\n849#1:1014,3\n*E\n"})
public final class IdentityVerificationUserProfileFragment extends BaseMvvmVBFragment<IdentityVerificationViewModel, t> implements TextWatcher, CustomActionCallback, IAutoTrack {

    /* JADX INFO: renamed from: L, reason: collision with root package name */
    public static final /* synthetic */ int f26181L = 0;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public String f26184C;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    public AbstractC0130w f26185H;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public boolean f26186o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final p355xf.t f26187p = C2131j.b(new b0(19));
    public final p355xf.t t = C2131j.b(new b0(20));

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final p355xf.t f26188v = C2131j.b(new b0(15));

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final p355xf.t f26189w = C2131j.b(new b0(16));

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public final p355xf.t f26182A = C2131j.b(new b0(17));

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public final p355xf.t f26183B = C2131j.b(new b0(18));

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

    public static String u(PpFormVertical ppFormVertical) {
        String editContent;
        return (ppFormVertical == null || (editContent = ppFormVertical.getEditContent()) == null) ? "" : editContent;
    }

    public final IdentityVerificationActivity A() {
        E e10 = this.f27319c;
        if (!(e10 instanceof IdentityVerificationActivity)) {
            return null;
        }
        Intrinsics.f(e10, "null cannot be cast to non-null type com.transsnet.palmpay.account.ui.activity.IdentityVerificationActivity");
        return (IdentityVerificationActivity) e10;
    }

    public final void B() {
        PreCheckPhoneRsp preCheckPhoneRsp;
        PreCheckPhoneRsp preCheckPhoneRsp2;
        PreCheckPhoneRsp preCheckPhoneRsp3;
        IdentityVerificationActivity identityVerificationActivityA;
        PreCheckPhoneRsp preCheckPhoneRsp4;
        PpButton ppButton;
        t tVar = (t) this.f27335j;
        if (tVar != null && (ppButton = tVar.f4224w) != null) {
            ppButton.b(true);
        }
        IdentityVerificationActivity identityVerificationActivityA2 = A();
        if (identityVerificationActivityA2 != null && identityVerificationActivityA2.r()) {
            if (TextUtils.isEmpty(this.f26184C) && (identityVerificationActivityA = A()) != null && (preCheckPhoneRsp4 = identityVerificationActivityA.f25869i) != null && preCheckPhoneRsp4.needNameVerify) {
                IdentityVerificationViewModel identityVerificationViewModel = (IdentityVerificationViewModel) this.f27333i;
                if (identityVerificationViewModel != null) {
                    IdentityVerificationActivity identityVerificationActivityA3 = A();
                    identityVerificationViewModel.f(identityVerificationActivityA3 != null ? identityVerificationActivityA3.n() : null);
                    return;
                }
                return;
            }
            IdentityVerificationActivity identityVerificationActivityA4 = A();
            if (identityVerificationActivityA4 == null || (preCheckPhoneRsp3 = identityVerificationActivityA4.f25869i) == null || !preCheckPhoneRsp3.needAddress) {
                F(this.f26184C);
                return;
            }
            Bundle bundle = new Bundle();
            CheckIdentifyRsp.copyAddressFromBundle(getArguments(), bundle);
            AbstractC0130w abstractC0130w = this.f26185H;
            if (abstractC0130w != null) {
                abstractC0130w.h(d.fragment_identity_verification_step_address, CheckIdentifyRsp.copyAddressFromBundle(getArguments(), bundle), null);
                return;
            }
            return;
        }
        IdentityVerificationActivity identityVerificationActivityA5 = A();
        if (identityVerificationActivityA5 != null && identityVerificationActivityA5.q()) {
            IdentityVerificationActivity identityVerificationActivityA6 = A();
            if (identityVerificationActivityA6 != null && (preCheckPhoneRsp2 = identityVerificationActivityA6.f25869i) != null && preCheckPhoneRsp2.needAddress) {
                AbstractC0130w abstractC0130w2 = this.f26185H;
                if (abstractC0130w2 != null) {
                    abstractC0130w2.h(d.fragment_identity_verification_step_address, CheckIdentifyRsp.copyAddressFromBundle(getArguments(), new Bundle()), null);
                    return;
                }
                return;
            }
            IdentityVerificationViewModel identityVerificationViewModel2 = (IdentityVerificationViewModel) this.f27333i;
            if (identityVerificationViewModel2 != null) {
                IdentityVerificationActivity identityVerificationActivityA7 = A();
                identityVerificationViewModel2.d(identityVerificationActivityA7 != null ? identityVerificationActivityA7.l() : null);
                return;
            }
            return;
        }
        IdentityVerificationActivity identityVerificationActivityA8 = A();
        if (TextUtils.isEmpty(identityVerificationActivityA8 != null ? identityVerificationActivityA8.m().verifyToken : null)) {
            IdentityVerificationViewModel identityVerificationViewModel3 = (IdentityVerificationViewModel) this.f27333i;
            if (identityVerificationViewModel3 != null) {
                IdentityVerificationActivity identityVerificationActivityA9 = A();
                identityVerificationViewModel3.f(identityVerificationActivityA9 != null ? identityVerificationActivityA9.n() : null);
                return;
            }
            return;
        }
        IdentityVerificationActivity identityVerificationActivityA10 = A();
        if (identityVerificationActivityA10 != null && (preCheckPhoneRsp = identityVerificationActivityA10.f25869i) != null && preCheckPhoneRsp.needAddress) {
            AbstractC0130w abstractC0130w3 = this.f26185H;
            if (abstractC0130w3 != null) {
                abstractC0130w3.h(d.fragment_identity_verification_step_address, CheckIdentifyRsp.copyAddressFromBundle(getArguments(), new Bundle()), null);
                return;
            }
            return;
        }
        IdentityVerificationViewModel identityVerificationViewModel4 = (IdentityVerificationViewModel) this.f27333i;
        if (identityVerificationViewModel4 != null) {
            IdentityVerificationActivity identityVerificationActivityA11 = A();
            identityVerificationViewModel4.e(identityVerificationActivityA11 != null ? identityVerificationActivityA11.m() : null);
        }
    }

    public final void C() {
        AddUserExtraInfoReq addUserExtraInfoReqL;
        CheckIdentifyReq checkIdentifyReqN;
        IdentityVerificationActivity identityVerificationActivityA = A();
        if (identityVerificationActivityA != null && (checkIdentifyReqN = identityVerificationActivityA.n()) != null) {
            E(checkIdentifyReqN);
        }
        IdentityVerificationActivity identityVerificationActivityA2 = A();
        if (identityVerificationActivityA2 != null) {
            E(identityVerificationActivityA2.m());
        }
        IdentityVerificationActivity identityVerificationActivityA3 = A();
        if (identityVerificationActivityA3 == null || (addUserExtraInfoReqL = identityVerificationActivityA3.l()) == null) {
            return;
        }
        E(addUserExtraInfoReqL);
        addUserExtraInfoReqL.verifyNum = null;
        addUserExtraInfoReqL.verifyType = null;
    }

    public final void D(BaseUserInfoReq baseUserInfoReq, boolean z3, boolean z8) {
        baseUserInfoReq.politicallyExposedPerson = Boolean.valueOf(z3);
        if (!z3) {
            baseUserInfoReq.currentPolitically = Boolean.FALSE;
            baseUserInfoReq.positionHeld = null;
        } else {
            baseUserInfoReq.currentPolitically = Boolean.valueOf(z8);
            t tVar = (t) this.f27335j;
            baseUserInfoReq.positionHeld = u(tVar != null ? tVar.f4222p : null);
        }
    }

    public final void E(BaseUserInfoReq baseUserInfoReq) {
        t tVar = (t) this.f27335j;
        baseUserInfoReq.profession = u(tVar != null ? tVar.f4221o : null);
        t tVar2 = (t) this.f27335j;
        baseUserInfoReq.sourceOfFunds = u(tVar2 != null ? tVar2.t : null);
        t tVar3 = (t) this.f27335j;
        baseUserInfoReq.annualIncome = u(tVar3 != null ? tVar3.f4219i : null);
        t tVar4 = (t) this.f27335j;
        baseUserInfoReq.nationality = u(tVar4 != null ? tVar4.f4220j : null);
    }

    public final void F(String str) {
        CheckIdentifyReq checkIdentifyReqN;
        Intent intent = new Intent();
        intent.putExtra("_token", str);
        IdentityVerificationActivity identityVerificationActivityA = A();
        if (identityVerificationActivityA != null && (checkIdentifyReqN = identityVerificationActivityA.n()) != null) {
            intent.putExtra("industry", checkIdentifyReqN.industry);
            intent.putExtra("profession", checkIdentifyReqN.profession);
            intent.putExtra("sourceOfFunds", checkIdentifyReqN.sourceOfFunds);
            intent.putExtra("annualIncome", checkIdentifyReqN.annualIncome);
            intent.putExtra("nationality", checkIdentifyReqN.nationality);
            Boolean bool = checkIdentifyReqN.politicallyExposedPerson;
            if (bool != null) {
                intent.putExtra("politicallyExposedPerson", bool != null ? bool.booleanValue() : false);
            }
            Boolean bool2 = checkIdentifyReqN.currentPolitically;
            if (bool2 != null) {
                intent.putExtra("currentPolitically", bool2 != null ? bool2.booleanValue() : false);
            }
            intent.putExtra("positionHeld", checkIdentifyReqN.positionHeld);
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

    public final void G(PpFormVertical ppFormVertical, View.OnClickListener onClickListener) {
        AppCompatEditText editText;
        TextView labelTextView;
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
            editText2.setTextColor(CommonViewExtKt.colorInt(b.ppColorTextPrimary, getContext()));
        }
        if (ppFormVertical != null && (labelTextView = ppFormVertical.getLabelTextView()) != null) {
            labelTextView.setOnClickListener(onClickListener);
        }
        if (ppFormVertical != null && (editText = ppFormVertical.getEditText()) != null) {
            editText.setOnClickListener(onClickListener);
        }
        if (ppFormVertical != null) {
            ppFormVertical.setRightIconClickListener(onClickListener);
        }
    }

    public final void H() {
        if (v().isEmpty()) {
            IdentityVerificationViewModel identityVerificationViewModel = (IdentityVerificationViewModel) this.f27333i;
            if (identityVerificationViewModel != null) {
                identityVerificationViewModel.g(true);
                return;
            }
            return;
        }
        t tVar = (t) this.f27335j;
        String editContent = tVar != null ? tVar.f4219i.getEditContent() : null;
        Iterator it = v().iterator();
        int i7 = 0;
        int i10 = 0;
        while (it.hasNext()) {
            int i11 = i10 + 1;
            if (Intrinsics.c((String) it.next(), editContent)) {
                i7 = i10;
            }
            i10 = i11;
        }
        p pVar = new p(requireContext());
        pVar.b(k.core_select);
        pVar.a((CharSequence[]) v().toArray(new String[0]), i7, new y(this, 4));
        pVar.show();
    }

    public final void I() {
        if (w().isEmpty()) {
            IdentityVerificationViewModel identityVerificationViewModel = (IdentityVerificationViewModel) this.f27333i;
            if (identityVerificationViewModel != null) {
                identityVerificationViewModel.h(true);
                return;
            }
            return;
        }
        t tVar = (t) this.f27335j;
        String editContent = tVar != null ? tVar.f4220j.getEditContent() : null;
        Iterator it = w().iterator();
        int i7 = 0;
        int i10 = 0;
        while (it.hasNext()) {
            int i11 = i10 + 1;
            if (Intrinsics.c((String) it.next(), editContent)) {
                i7 = i10;
            }
            i10 = i11;
        }
        p pVar = new p(requireContext());
        pVar.b(k.core_select);
        pVar.a((CharSequence[]) w().toArray(new String[0]), i7, new y(this, 3));
        pVar.show();
    }

    /* JADX WARN: Code duplicated, block: B:24:0x0054  */
    public final void J() {
        int i7;
        if (x().isEmpty()) {
            IdentityVerificationViewModel identityVerificationViewModel = (IdentityVerificationViewModel) this.f27333i;
            if (identityVerificationViewModel != null) {
                identityVerificationViewModel.k(true);
                return;
            }
            return;
        }
        t tVar = (t) this.f27335j;
        String editContent = tVar != null ? tVar.f4221o.getEditContent() : null;
        if (TextUtils.isEmpty(editContent)) {
            i7 = 0;
        } else {
            Iterator it = x().iterator();
            i7 = 0;
            while (it.hasNext() && !Intrinsics.c(editContent, (String) it.next())) {
                i7++;
            }
            if (i7 >= x().size()) {
                i7 = 0;
            }
        }
        p pVar = new p(requireContext());
        pVar.b(k.core_select);
        pVar.a((CharSequence[]) x().toArray(new String[0]), i7, new y(this, 2));
        pVar.show();
    }

    public final void K() {
        if (y().isEmpty()) {
            IdentityVerificationViewModel identityVerificationViewModel = (IdentityVerificationViewModel) this.f27333i;
            if (identityVerificationViewModel != null) {
                identityVerificationViewModel.i(true);
                return;
            }
            return;
        }
        t tVar = (t) this.f27335j;
        String editContent = tVar != null ? tVar.f4222p.getEditContent() : null;
        Iterator it = y().iterator();
        int i7 = 0;
        int i10 = 0;
        while (it.hasNext()) {
            int i11 = i10 + 1;
            if (Intrinsics.c((String) it.next(), editContent)) {
                i7 = i10;
            }
            i10 = i11;
        }
        p pVar = new p(requireContext());
        pVar.b(k.core_select);
        pVar.a((CharSequence[]) y().toArray(new String[0]), i7, new y(this, 1));
        pVar.show();
    }

    public final void L() {
        if (z().isEmpty()) {
            IdentityVerificationViewModel identityVerificationViewModel = (IdentityVerificationViewModel) this.f27333i;
            if (identityVerificationViewModel != null) {
                identityVerificationViewModel.k(true);
                return;
            }
            return;
        }
        t tVar = (t) this.f27335j;
        String editContent = tVar != null ? tVar.t.getEditContent() : null;
        Iterator it = z().iterator();
        int i7 = 0;
        int i10 = 0;
        while (it.hasNext()) {
            int i11 = i10 + 1;
            if (Intrinsics.c((String) it.next(), editContent)) {
                i7 = i10;
            }
            i10 = i11;
        }
        p pVar = new p(requireContext());
        pVar.b(k.core_select);
        pVar.a((CharSequence[]) z().toArray(new String[0]), i7, new y(this, 0));
        pVar.show();
    }

    public final void M() {
        t tVar;
        t tVar2 = (t) this.f27335j;
        boolean zIsEmpty = true;
        if (tVar2 != null && tVar2.f4214c.isChecked()) {
            t tVar3 = (t) this.f27335j;
            zIsEmpty = true ^ TextUtils.isEmpty(u(tVar3 != null ? tVar3.f4222p : null));
            t tVar4 = (t) this.f27335j;
            if (tVar4 != null && !tVar4.f4216e.isChecked() && (tVar = (t) this.f27335j) != null && !tVar.f4217f.isChecked()) {
                zIsEmpty = false;
            }
        }
        t tVar5 = (t) this.f27335j;
        if (TextUtils.isEmpty(u(tVar5 != null ? tVar5.f4219i : null))) {
            zIsEmpty = false;
        }
        t tVar6 = (t) this.f27335j;
        if (TextUtils.isEmpty(u(tVar6 != null ? tVar6.f4221o : null))) {
            zIsEmpty = false;
        }
        t tVar7 = (t) this.f27335j;
        if (TextUtils.isEmpty(u(tVar7 != null ? tVar7.t : null))) {
            zIsEmpty = false;
        }
        t tVar8 = (t) this.f27335j;
        boolean z3 = TextUtils.isEmpty(u(tVar8 != null ? tVar8.f4220j : null)) ? false : zIsEmpty;
        t tVar9 = (t) this.f27335j;
        if (tVar9 != null) {
            tVar9.f4224w.setEnabled(z3);
        }
    }

    public final void N(PpFormVertical ppFormVertical) {
        ImageView rightImg;
        ImageView rightImg2;
        if (ppFormVertical != null && (rightImg2 = ppFormVertical.getRightImg()) != null) {
            Context context = getContext();
            rightImg2.setImageDrawable(context != null ? G8.a.x(context, S6.a.pay_Arrowdown, Integer.valueOf(requireContext().getColor(b.ppColorTextAssist)), null, 24.0f, 116) : null);
        }
        if (ppFormVertical == null || (rightImg = ppFormVertical.getRightImg()) == null) {
            return;
        }
        h.s(rightImg, true);
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable s3) {
        PpFormVertical ppFormVertical;
        PpFormVertical ppFormVertical2;
        PpFormVertical ppFormVertical3;
        PpFormVertical ppFormVertical4;
        Intrinsics.checkNotNullParameter(s3, "s");
        M();
        t tVar = (t) this.f27335j;
        if (tVar != null && (ppFormVertical4 = tVar.f4220j) != null) {
            ppFormVertical4.setBottomText(null);
        }
        t tVar2 = (t) this.f27335j;
        if (tVar2 != null && (ppFormVertical3 = tVar2.f4221o) != null) {
            ppFormVertical3.setBottomText(null);
        }
        t tVar3 = (t) this.f27335j;
        if (tVar3 != null && (ppFormVertical2 = tVar3.t) != null) {
            ppFormVertical2.setBottomText(null);
        }
        t tVar4 = (t) this.f27335j;
        if (tVar4 == null || (ppFormVertical = tVar4.f4219i) == null) {
            return;
        }
        ppFormVertical.setBottomText(null);
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence s3, int i7, int i10, int i11) {
        Intrinsics.checkNotNullParameter(s3, "s");
    }

    @Override // com.transsnet.palmpay.core.util.statistic.IAutoTrack
    public final String getPageAlias() {
        return "PEPEntry";
    }

    @Override // com.transsnet.palmpay.core.callback.CustomActionCallback
    public final boolean goBack(String str) {
        if (this.f26186o) {
            return false;
        }
        LifecycleCoroutineScopeImpl lifecycleCoroutineScopeImplF = V.f(this);
        f fVar = I.f10809a;
        AbstractC0780y.m(lifecycleCoroutineScopeImplF, e.f19009c, null, new D(this, null), 2);
        return true;
    }

    @Override // com.transsnet.palmpay.core.base.BaseMvvmVBFragment, com.transsnet.palmpay.core.base.BaseFragment
    public final int h() {
        return 0;
    }

    @Override // com.transsnet.palmpay.core.base.BaseMvvmFragment, com.transsnet.palmpay.core.base.BaseFragment
    public final int k() {
        PreCheckPhoneRsp preCheckPhoneRsp;
        t tVar;
        int i7 = 0;
        t tVar2 = (t) this.f27335j;
        N(tVar2 != null ? tVar2.f4221o : null);
        t tVar3 = (t) this.f27335j;
        N(tVar3 != null ? tVar3.t : null);
        t tVar4 = (t) this.f27335j;
        N(tVar4 != null ? tVar4.f4219i : null);
        t tVar5 = (t) this.f27335j;
        N(tVar5 != null ? tVar5.f4222p : null);
        t tVar6 = (t) this.f27335j;
        N(tVar6 != null ? tVar6.f4220j : null);
        IdentityVerificationActivity identityVerificationActivityA = A();
        if (identityVerificationActivityA != null && Intrinsics.c(identityVerificationActivityA.f25866e, "FROM_REGISITER_PAGE") && (tVar = (t) this.f27335j) != null) {
            tVar.f4218g.setSlotId("9BD3D0A7458341C7A004F3804F4F68F6");
        }
        t tVar7 = (t) this.f27335j;
        if (tVar7 != null) {
            tVar7.f4221o.setTitle(h.B(r0.H0(F8.h.ac_occupation), getActivity(), null, Integer.valueOf(b.ppColorTextPrimary), null, null, null, 1018));
        }
        t tVar8 = (t) this.f27335j;
        if (tVar8 != null) {
            tVar8.t.setTitle(h.B(r0.H0(F8.h.ac_source_of_funds), getActivity(), null, Integer.valueOf(b.ppColorTextPrimary), null, null, null, 1018));
        }
        t tVar9 = (t) this.f27335j;
        if (tVar9 != null) {
            tVar9.f4219i.setTitle(h.B(r0.H0(F8.h.ac_annual_income), getActivity(), null, Integer.valueOf(b.ppColorTextPrimary), null, null, null, 1018));
        }
        t tVar10 = (t) this.f27335j;
        if (tVar10 != null) {
            tVar10.f4222p.setTitle(h.B(r0.H0(F8.h.ac_position_held), getActivity(), null, Integer.valueOf(b.ppColorTextPrimary), null, null, null, 1018));
        }
        t tVar11 = (t) this.f27335j;
        if (tVar11 != null) {
            tVar11.f4220j.setTitle(h.B(r0.H0(F8.h.ac_nationality), getActivity(), null, Integer.valueOf(b.ppColorTextPrimary), null, null, null, 1018));
        }
        t tVar12 = (t) this.f27335j;
        if (tVar12 != null) {
            tVar12.f4221o.setEditTextWatcher(this);
        }
        t tVar13 = (t) this.f27335j;
        if (tVar13 != null) {
            tVar13.t.setEditTextWatcher(this);
        }
        t tVar14 = (t) this.f27335j;
        if (tVar14 != null) {
            tVar14.f4219i.setEditTextWatcher(this);
        }
        t tVar15 = (t) this.f27335j;
        if (tVar15 != null) {
            tVar15.f4222p.setEditTextWatcher(this);
        }
        t tVar16 = (t) this.f27335j;
        if (tVar16 != null) {
            tVar16.f4220j.setEditTextWatcher(this);
        }
        t tVar17 = (t) this.f27335j;
        if (tVar17 != null) {
            tVar17.f4224w.setOnClickListener(new x(this, i7));
        }
        t tVar18 = (t) this.f27335j;
        if (tVar18 != null) {
            TextView textView = tVar18.f4210C;
            IdentityVerificationActivity identityVerificationActivityA2 = A();
            h.s(textView, (identityVerificationActivityA2 == null || (preCheckPhoneRsp = identityVerificationActivityA2.f25869i) == null || !preCheckPhoneRsp.canSkipIndustry) ? false : true);
        }
        M();
        t tVar19 = (t) this.f27335j;
        if (tVar19 != null) {
            ConstraintLayout constraintLayout = tVar19.f4211H;
            LayoutTransition layoutTransition = new LayoutTransition();
            layoutTransition.setAnimateParentHierarchy(false);
            layoutTransition.setDuration(2, 300L);
            Property property = View.ALPHA;
            layoutTransition.setAnimator(2, ObjectAnimator.ofPropertyValuesHolder(null, PropertyValuesHolder.ofFloat((Property<?, Float>) property, 0.0f, 1.0f)));
            layoutTransition.setDuration(3, 500L);
            layoutTransition.setAnimator(3, ObjectAnimator.ofPropertyValuesHolder(null, PropertyValuesHolder.ofFloat((Property<?, Float>) property, 1.0f, 0.0f)));
            layoutTransition.setInterpolator(2, new AccelerateInterpolator());
            layoutTransition.setInterpolator(3, new AccelerateInterpolator());
            constraintLayout.setLayoutTransition(layoutTransition);
        }
        return 0;
    }

    @Override // com.transsnet.palmpay.core.base.BaseMvvmFragment, com.transsnet.palmpay.core.base.BaseFragment
    public final void n() {
        t tVar = (t) this.f27335j;
        if (tVar != null) {
            tVar.f4221o.e();
        }
        t tVar2 = (t) this.f27335j;
        if (tVar2 != null) {
            tVar2.t.e();
        }
        t tVar3 = (t) this.f27335j;
        if (tVar3 != null) {
            tVar3.f4219i.e();
        }
        t tVar4 = (t) this.f27335j;
        if (tVar4 != null) {
            tVar4.f4220j.e();
        }
        t tVar5 = (t) this.f27335j;
        if (tVar5 != null) {
            tVar5.f4222p.e();
        }
        t tVar6 = (t) this.f27335j;
        G(tVar6 != null ? tVar6.f4221o : null, new x(this, 1));
        t tVar7 = (t) this.f27335j;
        G(tVar7 != null ? tVar7.t : null, new x(this, 2));
        t tVar8 = (t) this.f27335j;
        G(tVar8 != null ? tVar8.f4219i : null, new x(this, 3));
        t tVar9 = (t) this.f27335j;
        G(tVar9 != null ? tVar9.f4220j : null, new x(this, 4));
        t tVar10 = (t) this.f27335j;
        G(tVar10 != null ? tVar10.f4222p : null, new x(this, 5));
        t tVar11 = (t) this.f27335j;
        if (tVar11 != null) {
            tVar11.f4210C.setOnClickListener(new x(this, 6));
        }
        t tVar12 = (t) this.f27335j;
        if (tVar12 != null) {
            final int i7 = 0;
            tVar12.f4214c.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener(this) { // from class: V8.B

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final /* synthetic */ IdentityVerificationUserProfileFragment f10107b;

                {
                    this.f10107b = this;
                }

                @Override // android.widget.CompoundButton.OnCheckedChangeListener
                public final void onCheckedChanged(CompoundButton compoundButton, boolean z3) {
                    PpFormVertical ppFormVertical;
                    ConstraintLayout constraintLayout;
                    IconicsCheckBox iconicsCheckBox;
                    I8.t tVar13;
                    IconicsCheckBox iconicsCheckBox2;
                    I8.t tVar14;
                    IconicsCheckBox iconicsCheckBox3;
                    IdentityVerificationUserProfileFragment identityVerificationUserProfileFragment = this.f10107b;
                    switch (i7) {
                        case 0:
                            int i10 = IdentityVerificationUserProfileFragment.f26181L;
                            Intrinsics.checkNotNullParameter(compoundButton, "<unused var>");
                            identityVerificationUserProfileFragment.M();
                            if (z3) {
                                I8.t tVar15 = (I8.t) identityVerificationUserProfileFragment.f27335j;
                                if (tVar15 != null) {
                                    tVar15.f4215d.setChecked(false);
                                }
                                I8.t tVar16 = (I8.t) identityVerificationUserProfileFragment.f27335j;
                                if (tVar16 != null) {
                                    p220oa.h.C(tVar16.f4211H);
                                }
                                I8.t tVar17 = (I8.t) identityVerificationUserProfileFragment.f27335j;
                                if (tVar17 != null) {
                                    p220oa.h.C(tVar17.f4222p);
                                }
                                I8.t tVar18 = (I8.t) identityVerificationUserProfileFragment.f27335j;
                                if (tVar18 != null) {
                                    tVar18.f4223v.postDelayed(new M7.s(identityVerificationUserProfileFragment, 26), 500L);
                                }
                            }
                            break;
                        case 1:
                            int i11 = IdentityVerificationUserProfileFragment.f26181L;
                            Intrinsics.checkNotNullParameter(compoundButton, "<unused var>");
                            identityVerificationUserProfileFragment.M();
                            if (z3) {
                                I8.t tVar19 = (I8.t) identityVerificationUserProfileFragment.f27335j;
                                if (tVar19 != null && (iconicsCheckBox = tVar19.f4214c) != null) {
                                    iconicsCheckBox.setChecked(false);
                                }
                                I8.t tVar20 = (I8.t) identityVerificationUserProfileFragment.f27335j;
                                if (tVar20 != null && (constraintLayout = tVar20.f4211H) != null) {
                                    p220oa.h.c(constraintLayout);
                                }
                                I8.t tVar21 = (I8.t) identityVerificationUserProfileFragment.f27335j;
                                if (tVar21 != null && (ppFormVertical = tVar21.f4222p) != null) {
                                    p220oa.h.c(ppFormVertical);
                                    break;
                                }
                            }
                            break;
                        case 2:
                            int i12 = IdentityVerificationUserProfileFragment.f26181L;
                            Intrinsics.checkNotNullParameter(compoundButton, "<unused var>");
                            identityVerificationUserProfileFragment.M();
                            if (z3 && (tVar13 = (I8.t) identityVerificationUserProfileFragment.f27335j) != null && (iconicsCheckBox2 = tVar13.f4217f) != null) {
                                iconicsCheckBox2.setChecked(false);
                                break;
                            }
                            break;
                        default:
                            int i13 = IdentityVerificationUserProfileFragment.f26181L;
                            Intrinsics.checkNotNullParameter(compoundButton, "<unused var>");
                            identityVerificationUserProfileFragment.M();
                            if (z3 && (tVar14 = (I8.t) identityVerificationUserProfileFragment.f27335j) != null && (iconicsCheckBox3 = tVar14.f4216e) != null) {
                                iconicsCheckBox3.setChecked(false);
                                break;
                            }
                            break;
                    }
                }
            });
        }
        t tVar13 = (t) this.f27335j;
        if (tVar13 != null) {
            final int i10 = 1;
            tVar13.f4215d.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener(this) { // from class: V8.B

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final /* synthetic */ IdentityVerificationUserProfileFragment f10107b;

                {
                    this.f10107b = this;
                }

                @Override // android.widget.CompoundButton.OnCheckedChangeListener
                public final void onCheckedChanged(CompoundButton compoundButton, boolean z3) {
                    PpFormVertical ppFormVertical;
                    ConstraintLayout constraintLayout;
                    IconicsCheckBox iconicsCheckBox;
                    I8.t tVar14;
                    IconicsCheckBox iconicsCheckBox2;
                    I8.t tVar15;
                    IconicsCheckBox iconicsCheckBox3;
                    IdentityVerificationUserProfileFragment identityVerificationUserProfileFragment = this.f10107b;
                    switch (i10) {
                        case 0:
                            int i11 = IdentityVerificationUserProfileFragment.f26181L;
                            Intrinsics.checkNotNullParameter(compoundButton, "<unused var>");
                            identityVerificationUserProfileFragment.M();
                            if (z3) {
                                I8.t tVar16 = (I8.t) identityVerificationUserProfileFragment.f27335j;
                                if (tVar16 != null) {
                                    tVar16.f4215d.setChecked(false);
                                }
                                I8.t tVar17 = (I8.t) identityVerificationUserProfileFragment.f27335j;
                                if (tVar17 != null) {
                                    p220oa.h.C(tVar17.f4211H);
                                }
                                I8.t tVar18 = (I8.t) identityVerificationUserProfileFragment.f27335j;
                                if (tVar18 != null) {
                                    p220oa.h.C(tVar18.f4222p);
                                }
                                I8.t tVar19 = (I8.t) identityVerificationUserProfileFragment.f27335j;
                                if (tVar19 != null) {
                                    tVar19.f4223v.postDelayed(new M7.s(identityVerificationUserProfileFragment, 26), 500L);
                                }
                            }
                            break;
                        case 1:
                            int i12 = IdentityVerificationUserProfileFragment.f26181L;
                            Intrinsics.checkNotNullParameter(compoundButton, "<unused var>");
                            identityVerificationUserProfileFragment.M();
                            if (z3) {
                                I8.t tVar110 = (I8.t) identityVerificationUserProfileFragment.f27335j;
                                if (tVar110 != null && (iconicsCheckBox = tVar110.f4214c) != null) {
                                    iconicsCheckBox.setChecked(false);
                                }
                                I8.t tVar20 = (I8.t) identityVerificationUserProfileFragment.f27335j;
                                if (tVar20 != null && (constraintLayout = tVar20.f4211H) != null) {
                                    p220oa.h.c(constraintLayout);
                                }
                                I8.t tVar21 = (I8.t) identityVerificationUserProfileFragment.f27335j;
                                if (tVar21 != null && (ppFormVertical = tVar21.f4222p) != null) {
                                    p220oa.h.c(ppFormVertical);
                                    break;
                                }
                            }
                            break;
                        case 2:
                            int i13 = IdentityVerificationUserProfileFragment.f26181L;
                            Intrinsics.checkNotNullParameter(compoundButton, "<unused var>");
                            identityVerificationUserProfileFragment.M();
                            if (z3 && (tVar14 = (I8.t) identityVerificationUserProfileFragment.f27335j) != null && (iconicsCheckBox2 = tVar14.f4217f) != null) {
                                iconicsCheckBox2.setChecked(false);
                                break;
                            }
                            break;
                        default:
                            int i14 = IdentityVerificationUserProfileFragment.f26181L;
                            Intrinsics.checkNotNullParameter(compoundButton, "<unused var>");
                            identityVerificationUserProfileFragment.M();
                            if (z3 && (tVar15 = (I8.t) identityVerificationUserProfileFragment.f27335j) != null && (iconicsCheckBox3 = tVar15.f4216e) != null) {
                                iconicsCheckBox3.setChecked(false);
                                break;
                            }
                            break;
                    }
                }
            });
        }
        t tVar14 = (t) this.f27335j;
        if (tVar14 != null) {
            final int i11 = 2;
            tVar14.f4216e.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener(this) { // from class: V8.B

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final /* synthetic */ IdentityVerificationUserProfileFragment f10107b;

                {
                    this.f10107b = this;
                }

                @Override // android.widget.CompoundButton.OnCheckedChangeListener
                public final void onCheckedChanged(CompoundButton compoundButton, boolean z3) {
                    PpFormVertical ppFormVertical;
                    ConstraintLayout constraintLayout;
                    IconicsCheckBox iconicsCheckBox;
                    I8.t tVar15;
                    IconicsCheckBox iconicsCheckBox2;
                    I8.t tVar16;
                    IconicsCheckBox iconicsCheckBox3;
                    IdentityVerificationUserProfileFragment identityVerificationUserProfileFragment = this.f10107b;
                    switch (i11) {
                        case 0:
                            int i12 = IdentityVerificationUserProfileFragment.f26181L;
                            Intrinsics.checkNotNullParameter(compoundButton, "<unused var>");
                            identityVerificationUserProfileFragment.M();
                            if (z3) {
                                I8.t tVar17 = (I8.t) identityVerificationUserProfileFragment.f27335j;
                                if (tVar17 != null) {
                                    tVar17.f4215d.setChecked(false);
                                }
                                I8.t tVar18 = (I8.t) identityVerificationUserProfileFragment.f27335j;
                                if (tVar18 != null) {
                                    p220oa.h.C(tVar18.f4211H);
                                }
                                I8.t tVar19 = (I8.t) identityVerificationUserProfileFragment.f27335j;
                                if (tVar19 != null) {
                                    p220oa.h.C(tVar19.f4222p);
                                }
                                I8.t tVar110 = (I8.t) identityVerificationUserProfileFragment.f27335j;
                                if (tVar110 != null) {
                                    tVar110.f4223v.postDelayed(new M7.s(identityVerificationUserProfileFragment, 26), 500L);
                                }
                            }
                            break;
                        case 1:
                            int i13 = IdentityVerificationUserProfileFragment.f26181L;
                            Intrinsics.checkNotNullParameter(compoundButton, "<unused var>");
                            identityVerificationUserProfileFragment.M();
                            if (z3) {
                                I8.t tVar111 = (I8.t) identityVerificationUserProfileFragment.f27335j;
                                if (tVar111 != null && (iconicsCheckBox = tVar111.f4214c) != null) {
                                    iconicsCheckBox.setChecked(false);
                                }
                                I8.t tVar20 = (I8.t) identityVerificationUserProfileFragment.f27335j;
                                if (tVar20 != null && (constraintLayout = tVar20.f4211H) != null) {
                                    p220oa.h.c(constraintLayout);
                                }
                                I8.t tVar21 = (I8.t) identityVerificationUserProfileFragment.f27335j;
                                if (tVar21 != null && (ppFormVertical = tVar21.f4222p) != null) {
                                    p220oa.h.c(ppFormVertical);
                                    break;
                                }
                            }
                            break;
                        case 2:
                            int i14 = IdentityVerificationUserProfileFragment.f26181L;
                            Intrinsics.checkNotNullParameter(compoundButton, "<unused var>");
                            identityVerificationUserProfileFragment.M();
                            if (z3 && (tVar15 = (I8.t) identityVerificationUserProfileFragment.f27335j) != null && (iconicsCheckBox2 = tVar15.f4217f) != null) {
                                iconicsCheckBox2.setChecked(false);
                                break;
                            }
                            break;
                        default:
                            int i15 = IdentityVerificationUserProfileFragment.f26181L;
                            Intrinsics.checkNotNullParameter(compoundButton, "<unused var>");
                            identityVerificationUserProfileFragment.M();
                            if (z3 && (tVar16 = (I8.t) identityVerificationUserProfileFragment.f27335j) != null && (iconicsCheckBox3 = tVar16.f4216e) != null) {
                                iconicsCheckBox3.setChecked(false);
                                break;
                            }
                            break;
                    }
                }
            });
        }
        t tVar15 = (t) this.f27335j;
        if (tVar15 != null) {
            final int i12 = 3;
            tVar15.f4217f.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener(this) { // from class: V8.B

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final /* synthetic */ IdentityVerificationUserProfileFragment f10107b;

                {
                    this.f10107b = this;
                }

                @Override // android.widget.CompoundButton.OnCheckedChangeListener
                public final void onCheckedChanged(CompoundButton compoundButton, boolean z3) {
                    PpFormVertical ppFormVertical;
                    ConstraintLayout constraintLayout;
                    IconicsCheckBox iconicsCheckBox;
                    I8.t tVar16;
                    IconicsCheckBox iconicsCheckBox2;
                    I8.t tVar17;
                    IconicsCheckBox iconicsCheckBox3;
                    IdentityVerificationUserProfileFragment identityVerificationUserProfileFragment = this.f10107b;
                    switch (i12) {
                        case 0:
                            int i13 = IdentityVerificationUserProfileFragment.f26181L;
                            Intrinsics.checkNotNullParameter(compoundButton, "<unused var>");
                            identityVerificationUserProfileFragment.M();
                            if (z3) {
                                I8.t tVar18 = (I8.t) identityVerificationUserProfileFragment.f27335j;
                                if (tVar18 != null) {
                                    tVar18.f4215d.setChecked(false);
                                }
                                I8.t tVar19 = (I8.t) identityVerificationUserProfileFragment.f27335j;
                                if (tVar19 != null) {
                                    p220oa.h.C(tVar19.f4211H);
                                }
                                I8.t tVar110 = (I8.t) identityVerificationUserProfileFragment.f27335j;
                                if (tVar110 != null) {
                                    p220oa.h.C(tVar110.f4222p);
                                }
                                I8.t tVar111 = (I8.t) identityVerificationUserProfileFragment.f27335j;
                                if (tVar111 != null) {
                                    tVar111.f4223v.postDelayed(new M7.s(identityVerificationUserProfileFragment, 26), 500L);
                                }
                            }
                            break;
                        case 1:
                            int i14 = IdentityVerificationUserProfileFragment.f26181L;
                            Intrinsics.checkNotNullParameter(compoundButton, "<unused var>");
                            identityVerificationUserProfileFragment.M();
                            if (z3) {
                                I8.t tVar112 = (I8.t) identityVerificationUserProfileFragment.f27335j;
                                if (tVar112 != null && (iconicsCheckBox = tVar112.f4214c) != null) {
                                    iconicsCheckBox.setChecked(false);
                                }
                                I8.t tVar20 = (I8.t) identityVerificationUserProfileFragment.f27335j;
                                if (tVar20 != null && (constraintLayout = tVar20.f4211H) != null) {
                                    p220oa.h.c(constraintLayout);
                                }
                                I8.t tVar21 = (I8.t) identityVerificationUserProfileFragment.f27335j;
                                if (tVar21 != null && (ppFormVertical = tVar21.f4222p) != null) {
                                    p220oa.h.c(ppFormVertical);
                                    break;
                                }
                            }
                            break;
                        case 2:
                            int i15 = IdentityVerificationUserProfileFragment.f26181L;
                            Intrinsics.checkNotNullParameter(compoundButton, "<unused var>");
                            identityVerificationUserProfileFragment.M();
                            if (z3 && (tVar16 = (I8.t) identityVerificationUserProfileFragment.f27335j) != null && (iconicsCheckBox2 = tVar16.f4217f) != null) {
                                iconicsCheckBox2.setChecked(false);
                                break;
                            }
                            break;
                        default:
                            int i16 = IdentityVerificationUserProfileFragment.f26181L;
                            Intrinsics.checkNotNullParameter(compoundButton, "<unused var>");
                            identityVerificationUserProfileFragment.M();
                            if (z3 && (tVar17 = (I8.t) identityVerificationUserProfileFragment.f27335j) != null && (iconicsCheckBox3 = tVar17.f4216e) != null) {
                                iconicsCheckBox3.setChecked(false);
                                break;
                            }
                            break;
                    }
                }
            });
        }
        IdentityVerificationViewModel identityVerificationViewModel = (IdentityVerificationViewModel) this.f27333i;
        if (identityVerificationViewModel != null) {
            identityVerificationViewModel.k(false);
        }
        IdentityVerificationViewModel identityVerificationViewModel2 = (IdentityVerificationViewModel) this.f27333i;
        if (identityVerificationViewModel2 != null) {
            identityVerificationViewModel2.g(false);
        }
        IdentityVerificationViewModel identityVerificationViewModel3 = (IdentityVerificationViewModel) this.f27333i;
        if (identityVerificationViewModel3 != null) {
            identityVerificationViewModel3.i(false);
        }
        IdentityVerificationViewModel identityVerificationViewModel4 = (IdentityVerificationViewModel) this.f27333i;
        if (identityVerificationViewModel4 != null) {
            String strB = H.b(G.o("queryOccupation", BaseApplication.getCountryLocale()));
            Intrinsics.checkNotNullExpressionValue(strB, "createCacheKey(...)");
            Boolean bool = Boolean.FALSE;
            l lVar = identityVerificationViewModel4.f26428v;
            lVar.f27356m = bool;
            AbstractC0780y.m(V.h(identityVerificationViewModel4), null, null, new B(lVar, q0.y(strB, "_", BaseApplication.getCountryLocale()), null), 3);
        }
        IdentityVerificationViewModel identityVerificationViewModel5 = (IdentityVerificationViewModel) this.f27333i;
        if (identityVerificationViewModel5 != null) {
            identityVerificationViewModel5.h(false);
        }
        t tVar16 = (t) this.f27335j;
        if (tVar16 != null) {
            tVar16.f4220j.setEditContent("Nigeria");
        }
        IdentityVerificationViewModel identityVerificationViewModel6 = (IdentityVerificationViewModel) this.f27333i;
        final int i13 = 0;
        n.B(this, identityVerificationViewModel6 != null ? identityVerificationViewModel6.f26429w : null, this, new Function2(this) { // from class: V8.z

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ IdentityVerificationUserProfileFragment f10173b;

            {
                this.f10173b = this;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                IdentityVerificationUserProfileFragment identityVerificationUserProfileFragment = this.f10173b;
                Boolean bool2 = (Boolean) obj;
                CommonListResultV2 result = (CommonListResultV2) obj2;
                switch (i13) {
                    case 0:
                        int i14 = IdentityVerificationUserProfileFragment.f26181L;
                        Intrinsics.checkNotNullParameter(result, "result");
                        if (result.isSuccess() && bool2 != null) {
                            boolean zBooleanValue = bool2.booleanValue();
                            Collection<IndustryList> collection = result.data;
                            if (i0.W(identityVerificationUserProfileFragment.getActivity()) && !identityVerificationUserProfileFragment.isDetached() && identityVerificationUserProfileFragment.isAdded() && collection != null) {
                                if ((collection.isEmpty() ? null : collection) != null) {
                                    identityVerificationUserProfileFragment.z().clear();
                                    for (IndustryList industryList : collection) {
                                        List listZ = identityVerificationUserProfileFragment.z();
                                        String name = industryList.name;
                                        Intrinsics.checkNotNullExpressionValue(name, "name");
                                        listZ.add(name);
                                    }
                                    if (zBooleanValue) {
                                        identityVerificationUserProfileFragment.L();
                                    }
                                }
                            }
                        }
                        break;
                    case 1:
                        int i15 = IdentityVerificationUserProfileFragment.f26181L;
                        Intrinsics.checkNotNullParameter(result, "result");
                        if (result.isSuccess() && bool2 != null) {
                            boolean zBooleanValue2 = bool2.booleanValue();
                            Collection<IndustryList> collection2 = result.data;
                            if (i0.W(identityVerificationUserProfileFragment.getActivity()) && !identityVerificationUserProfileFragment.isDetached() && identityVerificationUserProfileFragment.isAdded() && collection2 != null) {
                                if ((collection2.isEmpty() ? null : collection2) != null) {
                                    identityVerificationUserProfileFragment.v().clear();
                                    for (IndustryList industryList2 : collection2) {
                                        List listV = identityVerificationUserProfileFragment.v();
                                        String name2 = industryList2.name;
                                        Intrinsics.checkNotNullExpressionValue(name2, "name");
                                        listV.add(name2);
                                    }
                                    if (zBooleanValue2) {
                                        identityVerificationUserProfileFragment.H();
                                    }
                                }
                            }
                        }
                        break;
                    case 2:
                        int i16 = IdentityVerificationUserProfileFragment.f26181L;
                        Intrinsics.checkNotNullParameter(result, "result");
                        if (result.isSuccess() && bool2 != null) {
                            boolean zBooleanValue3 = bool2.booleanValue();
                            Collection<IndustryList> collection3 = result.data;
                            if (i0.W(identityVerificationUserProfileFragment.getActivity()) && !identityVerificationUserProfileFragment.isDetached() && identityVerificationUserProfileFragment.isAdded() && collection3 != null) {
                                if ((collection3.isEmpty() ? null : collection3) != null) {
                                    identityVerificationUserProfileFragment.w().clear();
                                    for (IndustryList industryList3 : collection3) {
                                        List listW = identityVerificationUserProfileFragment.w();
                                        String name3 = industryList3.name;
                                        Intrinsics.checkNotNullExpressionValue(name3, "name");
                                        listW.add(name3);
                                    }
                                    if (zBooleanValue3) {
                                        identityVerificationUserProfileFragment.I();
                                    }
                                }
                            }
                        }
                        break;
                    case 3:
                        int i17 = IdentityVerificationUserProfileFragment.f26181L;
                        Intrinsics.checkNotNullParameter(result, "result");
                        if (result.isSuccess() && bool2 != null) {
                            boolean zBooleanValue4 = bool2.booleanValue();
                            Collection<IndustryList> collection4 = result.data;
                            if (i0.W(identityVerificationUserProfileFragment.getActivity()) && !identityVerificationUserProfileFragment.isDetached() && identityVerificationUserProfileFragment.isAdded() && collection4 != null) {
                                if ((collection4.isEmpty() ? null : collection4) != null) {
                                    identityVerificationUserProfileFragment.y().clear();
                                    for (IndustryList industryList4 : collection4) {
                                        List listY = identityVerificationUserProfileFragment.y();
                                        String name4 = industryList4.name;
                                        Intrinsics.checkNotNullExpressionValue(name4, "name");
                                        listY.add(name4);
                                    }
                                    if (zBooleanValue4) {
                                        identityVerificationUserProfileFragment.K();
                                    }
                                }
                            }
                        }
                        break;
                    default:
                        int i18 = IdentityVerificationUserProfileFragment.f26181L;
                        Intrinsics.checkNotNullParameter(result, "result");
                        if (result.isSuccess() && bool2 != null) {
                            boolean zBooleanValue5 = bool2.booleanValue();
                            Collection<IndustryList> collection5 = result.data;
                            if (i0.W(identityVerificationUserProfileFragment.getActivity()) && !identityVerificationUserProfileFragment.isDetached() && identityVerificationUserProfileFragment.isAdded() && collection5 != null) {
                                if ((collection5.isEmpty() ? null : collection5) != null) {
                                    identityVerificationUserProfileFragment.x().clear();
                                    for (IndustryList industryList5 : collection5) {
                                        List listX = identityVerificationUserProfileFragment.x();
                                        String name5 = industryList5.name;
                                        Intrinsics.checkNotNullExpressionValue(name5, "name");
                                        listX.add(name5);
                                    }
                                    if (zBooleanValue5) {
                                        identityVerificationUserProfileFragment.J();
                                    }
                                }
                            }
                        }
                        break;
                }
                return Unit.f38893a;
            }
        }, new A(this, i13), true, null, 224);
        IdentityVerificationViewModel identityVerificationViewModel7 = (IdentityVerificationViewModel) this.f27333i;
        final int i14 = 1;
        n.B(this, identityVerificationViewModel7 != null ? identityVerificationViewModel7.f26417A : null, this, new Function2(this) { // from class: V8.z

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ IdentityVerificationUserProfileFragment f10173b;

            {
                this.f10173b = this;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                IdentityVerificationUserProfileFragment identityVerificationUserProfileFragment = this.f10173b;
                Boolean bool2 = (Boolean) obj;
                CommonListResultV2 result = (CommonListResultV2) obj2;
                switch (i14) {
                    case 0:
                        int i15 = IdentityVerificationUserProfileFragment.f26181L;
                        Intrinsics.checkNotNullParameter(result, "result");
                        if (result.isSuccess() && bool2 != null) {
                            boolean zBooleanValue = bool2.booleanValue();
                            Collection<IndustryList> collection = result.data;
                            if (i0.W(identityVerificationUserProfileFragment.getActivity()) && !identityVerificationUserProfileFragment.isDetached() && identityVerificationUserProfileFragment.isAdded() && collection != null) {
                                if ((collection.isEmpty() ? null : collection) != null) {
                                    identityVerificationUserProfileFragment.z().clear();
                                    for (IndustryList industryList : collection) {
                                        List listZ = identityVerificationUserProfileFragment.z();
                                        String name = industryList.name;
                                        Intrinsics.checkNotNullExpressionValue(name, "name");
                                        listZ.add(name);
                                    }
                                    if (zBooleanValue) {
                                        identityVerificationUserProfileFragment.L();
                                    }
                                }
                            }
                        }
                        break;
                    case 1:
                        int i16 = IdentityVerificationUserProfileFragment.f26181L;
                        Intrinsics.checkNotNullParameter(result, "result");
                        if (result.isSuccess() && bool2 != null) {
                            boolean zBooleanValue2 = bool2.booleanValue();
                            Collection<IndustryList> collection2 = result.data;
                            if (i0.W(identityVerificationUserProfileFragment.getActivity()) && !identityVerificationUserProfileFragment.isDetached() && identityVerificationUserProfileFragment.isAdded() && collection2 != null) {
                                if ((collection2.isEmpty() ? null : collection2) != null) {
                                    identityVerificationUserProfileFragment.v().clear();
                                    for (IndustryList industryList2 : collection2) {
                                        List listV = identityVerificationUserProfileFragment.v();
                                        String name2 = industryList2.name;
                                        Intrinsics.checkNotNullExpressionValue(name2, "name");
                                        listV.add(name2);
                                    }
                                    if (zBooleanValue2) {
                                        identityVerificationUserProfileFragment.H();
                                    }
                                }
                            }
                        }
                        break;
                    case 2:
                        int i17 = IdentityVerificationUserProfileFragment.f26181L;
                        Intrinsics.checkNotNullParameter(result, "result");
                        if (result.isSuccess() && bool2 != null) {
                            boolean zBooleanValue3 = bool2.booleanValue();
                            Collection<IndustryList> collection3 = result.data;
                            if (i0.W(identityVerificationUserProfileFragment.getActivity()) && !identityVerificationUserProfileFragment.isDetached() && identityVerificationUserProfileFragment.isAdded() && collection3 != null) {
                                if ((collection3.isEmpty() ? null : collection3) != null) {
                                    identityVerificationUserProfileFragment.w().clear();
                                    for (IndustryList industryList3 : collection3) {
                                        List listW = identityVerificationUserProfileFragment.w();
                                        String name3 = industryList3.name;
                                        Intrinsics.checkNotNullExpressionValue(name3, "name");
                                        listW.add(name3);
                                    }
                                    if (zBooleanValue3) {
                                        identityVerificationUserProfileFragment.I();
                                    }
                                }
                            }
                        }
                        break;
                    case 3:
                        int i18 = IdentityVerificationUserProfileFragment.f26181L;
                        Intrinsics.checkNotNullParameter(result, "result");
                        if (result.isSuccess() && bool2 != null) {
                            boolean zBooleanValue4 = bool2.booleanValue();
                            Collection<IndustryList> collection4 = result.data;
                            if (i0.W(identityVerificationUserProfileFragment.getActivity()) && !identityVerificationUserProfileFragment.isDetached() && identityVerificationUserProfileFragment.isAdded() && collection4 != null) {
                                if ((collection4.isEmpty() ? null : collection4) != null) {
                                    identityVerificationUserProfileFragment.y().clear();
                                    for (IndustryList industryList4 : collection4) {
                                        List listY = identityVerificationUserProfileFragment.y();
                                        String name4 = industryList4.name;
                                        Intrinsics.checkNotNullExpressionValue(name4, "name");
                                        listY.add(name4);
                                    }
                                    if (zBooleanValue4) {
                                        identityVerificationUserProfileFragment.K();
                                    }
                                }
                            }
                        }
                        break;
                    default:
                        int i19 = IdentityVerificationUserProfileFragment.f26181L;
                        Intrinsics.checkNotNullParameter(result, "result");
                        if (result.isSuccess() && bool2 != null) {
                            boolean zBooleanValue5 = bool2.booleanValue();
                            Collection<IndustryList> collection5 = result.data;
                            if (i0.W(identityVerificationUserProfileFragment.getActivity()) && !identityVerificationUserProfileFragment.isDetached() && identityVerificationUserProfileFragment.isAdded() && collection5 != null) {
                                if ((collection5.isEmpty() ? null : collection5) != null) {
                                    identityVerificationUserProfileFragment.x().clear();
                                    for (IndustryList industryList5 : collection5) {
                                        List listX = identityVerificationUserProfileFragment.x();
                                        String name5 = industryList5.name;
                                        Intrinsics.checkNotNullExpressionValue(name5, "name");
                                        listX.add(name5);
                                    }
                                    if (zBooleanValue5) {
                                        identityVerificationUserProfileFragment.J();
                                    }
                                }
                            }
                        }
                        break;
                }
                return Unit.f38893a;
            }
        }, new A(this, i14), true, null, 224);
        IdentityVerificationViewModel identityVerificationViewModel8 = (IdentityVerificationViewModel) this.f27333i;
        final int i15 = 2;
        n.B(this, identityVerificationViewModel8 != null ? identityVerificationViewModel8.f26418B : null, this, new Function2(this) { // from class: V8.z

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ IdentityVerificationUserProfileFragment f10173b;

            {
                this.f10173b = this;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                IdentityVerificationUserProfileFragment identityVerificationUserProfileFragment = this.f10173b;
                Boolean bool2 = (Boolean) obj;
                CommonListResultV2 result = (CommonListResultV2) obj2;
                switch (i15) {
                    case 0:
                        int i16 = IdentityVerificationUserProfileFragment.f26181L;
                        Intrinsics.checkNotNullParameter(result, "result");
                        if (result.isSuccess() && bool2 != null) {
                            boolean zBooleanValue = bool2.booleanValue();
                            Collection<IndustryList> collection = result.data;
                            if (i0.W(identityVerificationUserProfileFragment.getActivity()) && !identityVerificationUserProfileFragment.isDetached() && identityVerificationUserProfileFragment.isAdded() && collection != null) {
                                if ((collection.isEmpty() ? null : collection) != null) {
                                    identityVerificationUserProfileFragment.z().clear();
                                    for (IndustryList industryList : collection) {
                                        List listZ = identityVerificationUserProfileFragment.z();
                                        String name = industryList.name;
                                        Intrinsics.checkNotNullExpressionValue(name, "name");
                                        listZ.add(name);
                                    }
                                    if (zBooleanValue) {
                                        identityVerificationUserProfileFragment.L();
                                    }
                                }
                            }
                        }
                        break;
                    case 1:
                        int i17 = IdentityVerificationUserProfileFragment.f26181L;
                        Intrinsics.checkNotNullParameter(result, "result");
                        if (result.isSuccess() && bool2 != null) {
                            boolean zBooleanValue2 = bool2.booleanValue();
                            Collection<IndustryList> collection2 = result.data;
                            if (i0.W(identityVerificationUserProfileFragment.getActivity()) && !identityVerificationUserProfileFragment.isDetached() && identityVerificationUserProfileFragment.isAdded() && collection2 != null) {
                                if ((collection2.isEmpty() ? null : collection2) != null) {
                                    identityVerificationUserProfileFragment.v().clear();
                                    for (IndustryList industryList2 : collection2) {
                                        List listV = identityVerificationUserProfileFragment.v();
                                        String name2 = industryList2.name;
                                        Intrinsics.checkNotNullExpressionValue(name2, "name");
                                        listV.add(name2);
                                    }
                                    if (zBooleanValue2) {
                                        identityVerificationUserProfileFragment.H();
                                    }
                                }
                            }
                        }
                        break;
                    case 2:
                        int i18 = IdentityVerificationUserProfileFragment.f26181L;
                        Intrinsics.checkNotNullParameter(result, "result");
                        if (result.isSuccess() && bool2 != null) {
                            boolean zBooleanValue3 = bool2.booleanValue();
                            Collection<IndustryList> collection3 = result.data;
                            if (i0.W(identityVerificationUserProfileFragment.getActivity()) && !identityVerificationUserProfileFragment.isDetached() && identityVerificationUserProfileFragment.isAdded() && collection3 != null) {
                                if ((collection3.isEmpty() ? null : collection3) != null) {
                                    identityVerificationUserProfileFragment.w().clear();
                                    for (IndustryList industryList3 : collection3) {
                                        List listW = identityVerificationUserProfileFragment.w();
                                        String name3 = industryList3.name;
                                        Intrinsics.checkNotNullExpressionValue(name3, "name");
                                        listW.add(name3);
                                    }
                                    if (zBooleanValue3) {
                                        identityVerificationUserProfileFragment.I();
                                    }
                                }
                            }
                        }
                        break;
                    case 3:
                        int i19 = IdentityVerificationUserProfileFragment.f26181L;
                        Intrinsics.checkNotNullParameter(result, "result");
                        if (result.isSuccess() && bool2 != null) {
                            boolean zBooleanValue4 = bool2.booleanValue();
                            Collection<IndustryList> collection4 = result.data;
                            if (i0.W(identityVerificationUserProfileFragment.getActivity()) && !identityVerificationUserProfileFragment.isDetached() && identityVerificationUserProfileFragment.isAdded() && collection4 != null) {
                                if ((collection4.isEmpty() ? null : collection4) != null) {
                                    identityVerificationUserProfileFragment.y().clear();
                                    for (IndustryList industryList4 : collection4) {
                                        List listY = identityVerificationUserProfileFragment.y();
                                        String name4 = industryList4.name;
                                        Intrinsics.checkNotNullExpressionValue(name4, "name");
                                        listY.add(name4);
                                    }
                                    if (zBooleanValue4) {
                                        identityVerificationUserProfileFragment.K();
                                    }
                                }
                            }
                        }
                        break;
                    default:
                        int i110 = IdentityVerificationUserProfileFragment.f26181L;
                        Intrinsics.checkNotNullParameter(result, "result");
                        if (result.isSuccess() && bool2 != null) {
                            boolean zBooleanValue5 = bool2.booleanValue();
                            Collection<IndustryList> collection5 = result.data;
                            if (i0.W(identityVerificationUserProfileFragment.getActivity()) && !identityVerificationUserProfileFragment.isDetached() && identityVerificationUserProfileFragment.isAdded() && collection5 != null) {
                                if ((collection5.isEmpty() ? null : collection5) != null) {
                                    identityVerificationUserProfileFragment.x().clear();
                                    for (IndustryList industryList5 : collection5) {
                                        List listX = identityVerificationUserProfileFragment.x();
                                        String name5 = industryList5.name;
                                        Intrinsics.checkNotNullExpressionValue(name5, "name");
                                        listX.add(name5);
                                    }
                                    if (zBooleanValue5) {
                                        identityVerificationUserProfileFragment.J();
                                    }
                                }
                            }
                        }
                        break;
                }
                return Unit.f38893a;
            }
        }, new A(this, 3), true, null, 224);
        IdentityVerificationViewModel identityVerificationViewModel9 = (IdentityVerificationViewModel) this.f27333i;
        final int i16 = 3;
        n.B(this, identityVerificationViewModel9 != null ? identityVerificationViewModel9.f26419C : null, this, new Function2(this) { // from class: V8.z

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ IdentityVerificationUserProfileFragment f10173b;

            {
                this.f10173b = this;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                IdentityVerificationUserProfileFragment identityVerificationUserProfileFragment = this.f10173b;
                Boolean bool2 = (Boolean) obj;
                CommonListResultV2 result = (CommonListResultV2) obj2;
                switch (i16) {
                    case 0:
                        int i17 = IdentityVerificationUserProfileFragment.f26181L;
                        Intrinsics.checkNotNullParameter(result, "result");
                        if (result.isSuccess() && bool2 != null) {
                            boolean zBooleanValue = bool2.booleanValue();
                            Collection<IndustryList> collection = result.data;
                            if (i0.W(identityVerificationUserProfileFragment.getActivity()) && !identityVerificationUserProfileFragment.isDetached() && identityVerificationUserProfileFragment.isAdded() && collection != null) {
                                if ((collection.isEmpty() ? null : collection) != null) {
                                    identityVerificationUserProfileFragment.z().clear();
                                    for (IndustryList industryList : collection) {
                                        List listZ = identityVerificationUserProfileFragment.z();
                                        String name = industryList.name;
                                        Intrinsics.checkNotNullExpressionValue(name, "name");
                                        listZ.add(name);
                                    }
                                    if (zBooleanValue) {
                                        identityVerificationUserProfileFragment.L();
                                    }
                                }
                            }
                        }
                        break;
                    case 1:
                        int i18 = IdentityVerificationUserProfileFragment.f26181L;
                        Intrinsics.checkNotNullParameter(result, "result");
                        if (result.isSuccess() && bool2 != null) {
                            boolean zBooleanValue2 = bool2.booleanValue();
                            Collection<IndustryList> collection2 = result.data;
                            if (i0.W(identityVerificationUserProfileFragment.getActivity()) && !identityVerificationUserProfileFragment.isDetached() && identityVerificationUserProfileFragment.isAdded() && collection2 != null) {
                                if ((collection2.isEmpty() ? null : collection2) != null) {
                                    identityVerificationUserProfileFragment.v().clear();
                                    for (IndustryList industryList2 : collection2) {
                                        List listV = identityVerificationUserProfileFragment.v();
                                        String name2 = industryList2.name;
                                        Intrinsics.checkNotNullExpressionValue(name2, "name");
                                        listV.add(name2);
                                    }
                                    if (zBooleanValue2) {
                                        identityVerificationUserProfileFragment.H();
                                    }
                                }
                            }
                        }
                        break;
                    case 2:
                        int i19 = IdentityVerificationUserProfileFragment.f26181L;
                        Intrinsics.checkNotNullParameter(result, "result");
                        if (result.isSuccess() && bool2 != null) {
                            boolean zBooleanValue3 = bool2.booleanValue();
                            Collection<IndustryList> collection3 = result.data;
                            if (i0.W(identityVerificationUserProfileFragment.getActivity()) && !identityVerificationUserProfileFragment.isDetached() && identityVerificationUserProfileFragment.isAdded() && collection3 != null) {
                                if ((collection3.isEmpty() ? null : collection3) != null) {
                                    identityVerificationUserProfileFragment.w().clear();
                                    for (IndustryList industryList3 : collection3) {
                                        List listW = identityVerificationUserProfileFragment.w();
                                        String name3 = industryList3.name;
                                        Intrinsics.checkNotNullExpressionValue(name3, "name");
                                        listW.add(name3);
                                    }
                                    if (zBooleanValue3) {
                                        identityVerificationUserProfileFragment.I();
                                    }
                                }
                            }
                        }
                        break;
                    case 3:
                        int i110 = IdentityVerificationUserProfileFragment.f26181L;
                        Intrinsics.checkNotNullParameter(result, "result");
                        if (result.isSuccess() && bool2 != null) {
                            boolean zBooleanValue4 = bool2.booleanValue();
                            Collection<IndustryList> collection4 = result.data;
                            if (i0.W(identityVerificationUserProfileFragment.getActivity()) && !identityVerificationUserProfileFragment.isDetached() && identityVerificationUserProfileFragment.isAdded() && collection4 != null) {
                                if ((collection4.isEmpty() ? null : collection4) != null) {
                                    identityVerificationUserProfileFragment.y().clear();
                                    for (IndustryList industryList4 : collection4) {
                                        List listY = identityVerificationUserProfileFragment.y();
                                        String name4 = industryList4.name;
                                        Intrinsics.checkNotNullExpressionValue(name4, "name");
                                        listY.add(name4);
                                    }
                                    if (zBooleanValue4) {
                                        identityVerificationUserProfileFragment.K();
                                    }
                                }
                            }
                        }
                        break;
                    default:
                        int i111 = IdentityVerificationUserProfileFragment.f26181L;
                        Intrinsics.checkNotNullParameter(result, "result");
                        if (result.isSuccess() && bool2 != null) {
                            boolean zBooleanValue5 = bool2.booleanValue();
                            Collection<IndustryList> collection5 = result.data;
                            if (i0.W(identityVerificationUserProfileFragment.getActivity()) && !identityVerificationUserProfileFragment.isDetached() && identityVerificationUserProfileFragment.isAdded() && collection5 != null) {
                                if ((collection5.isEmpty() ? null : collection5) != null) {
                                    identityVerificationUserProfileFragment.x().clear();
                                    for (IndustryList industryList5 : collection5) {
                                        List listX = identityVerificationUserProfileFragment.x();
                                        String name5 = industryList5.name;
                                        Intrinsics.checkNotNullExpressionValue(name5, "name");
                                        listX.add(name5);
                                    }
                                    if (zBooleanValue5) {
                                        identityVerificationUserProfileFragment.J();
                                    }
                                }
                            }
                        }
                        break;
                }
                return Unit.f38893a;
            }
        }, new A(this, 4), true, null, 224);
        IdentityVerificationViewModel identityVerificationViewModel10 = (IdentityVerificationViewModel) this.f27333i;
        final int i17 = 4;
        n.B(this, identityVerificationViewModel10 != null ? identityVerificationViewModel10.f26428v : null, this, new Function2(this) { // from class: V8.z

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ IdentityVerificationUserProfileFragment f10173b;

            {
                this.f10173b = this;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                IdentityVerificationUserProfileFragment identityVerificationUserProfileFragment = this.f10173b;
                Boolean bool2 = (Boolean) obj;
                CommonListResultV2 result = (CommonListResultV2) obj2;
                switch (i17) {
                    case 0:
                        int i18 = IdentityVerificationUserProfileFragment.f26181L;
                        Intrinsics.checkNotNullParameter(result, "result");
                        if (result.isSuccess() && bool2 != null) {
                            boolean zBooleanValue = bool2.booleanValue();
                            Collection<IndustryList> collection = result.data;
                            if (i0.W(identityVerificationUserProfileFragment.getActivity()) && !identityVerificationUserProfileFragment.isDetached() && identityVerificationUserProfileFragment.isAdded() && collection != null) {
                                if ((collection.isEmpty() ? null : collection) != null) {
                                    identityVerificationUserProfileFragment.z().clear();
                                    for (IndustryList industryList : collection) {
                                        List listZ = identityVerificationUserProfileFragment.z();
                                        String name = industryList.name;
                                        Intrinsics.checkNotNullExpressionValue(name, "name");
                                        listZ.add(name);
                                    }
                                    if (zBooleanValue) {
                                        identityVerificationUserProfileFragment.L();
                                    }
                                }
                            }
                        }
                        break;
                    case 1:
                        int i19 = IdentityVerificationUserProfileFragment.f26181L;
                        Intrinsics.checkNotNullParameter(result, "result");
                        if (result.isSuccess() && bool2 != null) {
                            boolean zBooleanValue2 = bool2.booleanValue();
                            Collection<IndustryList> collection2 = result.data;
                            if (i0.W(identityVerificationUserProfileFragment.getActivity()) && !identityVerificationUserProfileFragment.isDetached() && identityVerificationUserProfileFragment.isAdded() && collection2 != null) {
                                if ((collection2.isEmpty() ? null : collection2) != null) {
                                    identityVerificationUserProfileFragment.v().clear();
                                    for (IndustryList industryList2 : collection2) {
                                        List listV = identityVerificationUserProfileFragment.v();
                                        String name2 = industryList2.name;
                                        Intrinsics.checkNotNullExpressionValue(name2, "name");
                                        listV.add(name2);
                                    }
                                    if (zBooleanValue2) {
                                        identityVerificationUserProfileFragment.H();
                                    }
                                }
                            }
                        }
                        break;
                    case 2:
                        int i110 = IdentityVerificationUserProfileFragment.f26181L;
                        Intrinsics.checkNotNullParameter(result, "result");
                        if (result.isSuccess() && bool2 != null) {
                            boolean zBooleanValue3 = bool2.booleanValue();
                            Collection<IndustryList> collection3 = result.data;
                            if (i0.W(identityVerificationUserProfileFragment.getActivity()) && !identityVerificationUserProfileFragment.isDetached() && identityVerificationUserProfileFragment.isAdded() && collection3 != null) {
                                if ((collection3.isEmpty() ? null : collection3) != null) {
                                    identityVerificationUserProfileFragment.w().clear();
                                    for (IndustryList industryList3 : collection3) {
                                        List listW = identityVerificationUserProfileFragment.w();
                                        String name3 = industryList3.name;
                                        Intrinsics.checkNotNullExpressionValue(name3, "name");
                                        listW.add(name3);
                                    }
                                    if (zBooleanValue3) {
                                        identityVerificationUserProfileFragment.I();
                                    }
                                }
                            }
                        }
                        break;
                    case 3:
                        int i111 = IdentityVerificationUserProfileFragment.f26181L;
                        Intrinsics.checkNotNullParameter(result, "result");
                        if (result.isSuccess() && bool2 != null) {
                            boolean zBooleanValue4 = bool2.booleanValue();
                            Collection<IndustryList> collection4 = result.data;
                            if (i0.W(identityVerificationUserProfileFragment.getActivity()) && !identityVerificationUserProfileFragment.isDetached() && identityVerificationUserProfileFragment.isAdded() && collection4 != null) {
                                if ((collection4.isEmpty() ? null : collection4) != null) {
                                    identityVerificationUserProfileFragment.y().clear();
                                    for (IndustryList industryList4 : collection4) {
                                        List listY = identityVerificationUserProfileFragment.y();
                                        String name4 = industryList4.name;
                                        Intrinsics.checkNotNullExpressionValue(name4, "name");
                                        listY.add(name4);
                                    }
                                    if (zBooleanValue4) {
                                        identityVerificationUserProfileFragment.K();
                                    }
                                }
                            }
                        }
                        break;
                    default:
                        int i112 = IdentityVerificationUserProfileFragment.f26181L;
                        Intrinsics.checkNotNullParameter(result, "result");
                        if (result.isSuccess() && bool2 != null) {
                            boolean zBooleanValue5 = bool2.booleanValue();
                            Collection<IndustryList> collection5 = result.data;
                            if (i0.W(identityVerificationUserProfileFragment.getActivity()) && !identityVerificationUserProfileFragment.isDetached() && identityVerificationUserProfileFragment.isAdded() && collection5 != null) {
                                if ((collection5.isEmpty() ? null : collection5) != null) {
                                    identityVerificationUserProfileFragment.x().clear();
                                    for (IndustryList industryList5 : collection5) {
                                        List listX = identityVerificationUserProfileFragment.x();
                                        String name5 = industryList5.name;
                                        Intrinsics.checkNotNullExpressionValue(name5, "name");
                                        listX.add(name5);
                                    }
                                    if (zBooleanValue5) {
                                        identityVerificationUserProfileFragment.J();
                                    }
                                }
                            }
                        }
                        break;
                }
                return Unit.f38893a;
            }
        }, new A(this, 5), true, null, 224);
        IdentityVerificationViewModel identityVerificationViewModel11 = (IdentityVerificationViewModel) this.f27333i;
        l lVar2 = identityVerificationViewModel11 != null ? identityVerificationViewModel11.f26424i : null;
        if (lVar2 != null) {
            lVar2.e(this, new Fd.G(new V8.E(this, this, 0), 23));
        }
        IdentityVerificationViewModel identityVerificationViewModel12 = (IdentityVerificationViewModel) this.f27333i;
        l lVar3 = identityVerificationViewModel12 != null ? identityVerificationViewModel12.f26423g : null;
        if (lVar3 != null) {
            lVar3.e(this, new Fd.G(new V8.E(this, this, 1), 23));
        }
    }

    @Override // com.transsnet.palmpay.core.base.BaseMvvmFragment, com.transsnet.palmpay.core.base.BaseFragment
    public final int o() {
        Window window;
        super.o();
        this.f26185H = NavHostFragment.f17502e.findNavController(this);
        IdentityVerificationActivity identityVerificationActivityA = A();
        if (identityVerificationActivityA != null) {
            identityVerificationActivityA.setTitle("");
        }
        IdentityVerificationActivity identityVerificationActivityA2 = A();
        if (identityVerificationActivityA2 != null) {
            identityVerificationActivityA2.s((IdentityVerificationViewModel) this.f27333i, new A(this, 2));
        }
        Handler handler = (Handler) this.f26183B.getValue();
        E activity = getActivity();
        View decorView = (activity == null || (window = activity.getWindow()) == null) ? null : window.getDecorView();
        if (decorView != null) {
            decorView.post(new Ce.H(handler, 10, this, this));
        }
        Bundle arguments = getArguments();
        this.f26184C = arguments != null ? arguments.getString("_token") : null;
        return 0;
    }

    @Override // com.transsnet.palmpay.core.base.BaseFragment, androidx.fragment.app.Fragment
    public final void onDestroy() {
        Handler handler = (Handler) this.f26183B.getValue();
        if (handler != null) {
            handler.removeCallbacksAndMessages(null);
        }
        super.onDestroy();
    }

    @Override // androidx.fragment.app.Fragment
    public final void onPause() {
        C();
        super.onPause();
    }

    @Override // androidx.fragment.app.Fragment
    public final void onSaveInstanceState(Bundle outState) {
        Intrinsics.checkNotNullParameter(outState, "outState");
        t tVar = (t) this.f27335j;
        outState.putString("inputIncome", u(tVar != null ? tVar.f4219i : null));
        t tVar2 = (t) this.f27335j;
        outState.putString("inputOccupation", u(tVar2 != null ? tVar2.f4221o : null));
        t tVar3 = (t) this.f27335j;
        outState.putString("inputSourceFunds", u(tVar3 != null ? tVar3.t : null));
        t tVar4 = (t) this.f27335j;
        outState.putString("inputOfficialPosition", u(tVar4 != null ? tVar4.f4222p : null));
        t tVar5 = (t) this.f27335j;
        outState.putString("inputNationality", u(tVar5 != null ? tVar5.f4220j : null));
        super.onSaveInstanceState(outState);
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence s3, int i7, int i10, int i11) {
        Intrinsics.checkNotNullParameter(s3, "s");
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewStateRestored(Bundle bundle) {
        t tVar;
        PpFormVertical ppFormVertical;
        PpFormVertical ppFormVertical2;
        PpFormVertical ppFormVertical3;
        PpFormVertical ppFormVertical4;
        PpFormVertical ppFormVertical5;
        PpFormVertical ppFormVertical6;
        super.onViewStateRestored(bundle);
        t tVar2 = (t) this.f27335j;
        String editContent = null;
        if (tVar2 != null && (ppFormVertical6 = tVar2.f4219i) != null) {
            ppFormVertical6.setEditContent(bundle != null ? bundle.getString("inputIncome") : null);
        }
        t tVar3 = (t) this.f27335j;
        if (tVar3 != null && (ppFormVertical5 = tVar3.f4221o) != null) {
            ppFormVertical5.setEditContent(bundle != null ? bundle.getString("inputOccupation") : null);
        }
        t tVar4 = (t) this.f27335j;
        if (tVar4 != null && (ppFormVertical4 = tVar4.t) != null) {
            ppFormVertical4.setEditContent(bundle != null ? bundle.getString("inputSourceFunds") : null);
        }
        t tVar5 = (t) this.f27335j;
        if (tVar5 != null && (ppFormVertical3 = tVar5.f4222p) != null) {
            ppFormVertical3.setEditContent(bundle != null ? bundle.getString("inputOfficialPosition") : null);
        }
        String string = bundle != null ? bundle.getString("inputNationality") : null;
        t tVar6 = (t) this.f27335j;
        if (tVar6 != null && (ppFormVertical2 = tVar6.f4220j) != null) {
            editContent = ppFormVertical2.getEditContent();
        }
        if ((!TextUtils.isEmpty(editContent) && TextUtils.isEmpty(string)) || (tVar = (t) this.f27335j) == null || (ppFormVertical = tVar.f4220j) == null) {
            return;
        }
        ppFormVertical.setEditContent(string);
    }

    @Override // com.transsnet.palmpay.core.base.BaseMvvmVBFragment
    public final ViewBinding t(LayoutInflater inflater, ViewGroup viewGroup) {
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        View viewInflate = inflater.inflate(F8.e.ac_fragment_identity_verification_step_user_profile, viewGroup, false);
        int i7 = d.bottomStub;
        ViewStub viewStub = (ViewStub) p059e1.a.m(i7, viewInflate);
        if (viewStub != null) {
            i7 = d.centerGuide;
            if (((Guideline) p059e1.a.m(i7, viewInflate)) != null) {
                i7 = d.centerGuide2;
                if (((Guideline) p059e1.a.m(i7, viewInflate)) != null) {
                    i7 = d.check11;
                    IconicsCheckBox iconicsCheckBox = (IconicsCheckBox) p059e1.a.m(i7, viewInflate);
                    if (iconicsCheckBox != null) {
                        i7 = d.check12;
                        IconicsCheckBox iconicsCheckBox2 = (IconicsCheckBox) p059e1.a.m(i7, viewInflate);
                        if (iconicsCheckBox2 != null) {
                            i7 = d.check21;
                            IconicsCheckBox iconicsCheckBox3 = (IconicsCheckBox) p059e1.a.m(i7, viewInflate);
                            if (iconicsCheckBox3 != null) {
                                i7 = d.check22;
                                IconicsCheckBox iconicsCheckBox4 = (IconicsCheckBox) p059e1.a.m(i7, viewInflate);
                                if (iconicsCheckBox4 != null) {
                                    i7 = d.cornerAd;
                                    SingleAdView singleAdView = (SingleAdView) p059e1.a.m(i7, viewInflate);
                                    if (singleAdView != null) {
                                        i7 = d.inputIncome;
                                        PpFormVertical ppFormVertical = (PpFormVertical) p059e1.a.m(i7, viewInflate);
                                        if (ppFormVertical != null) {
                                            i7 = d.inputNationality;
                                            PpFormVertical ppFormVertical2 = (PpFormVertical) p059e1.a.m(i7, viewInflate);
                                            if (ppFormVertical2 != null) {
                                                i7 = d.inputOccupation;
                                                PpFormVertical ppFormVertical3 = (PpFormVertical) p059e1.a.m(i7, viewInflate);
                                                if (ppFormVertical3 != null) {
                                                    i7 = d.inputOfficialPosition;
                                                    PpFormVertical ppFormVertical4 = (PpFormVertical) p059e1.a.m(i7, viewInflate);
                                                    if (ppFormVertical4 != null) {
                                                        i7 = d.inputSourceFunds;
                                                        PpFormVertical ppFormVertical5 = (PpFormVertical) p059e1.a.m(i7, viewInflate);
                                                        if (ppFormVertical5 != null) {
                                                            i7 = d.layout1;
                                                            NestedScrollView nestedScrollView = (NestedScrollView) p059e1.a.m(i7, viewInflate);
                                                            if (nestedScrollView != null) {
                                                                i7 = d.textViewConfirm;
                                                                PpButton ppButton = (PpButton) p059e1.a.m(i7, viewInflate);
                                                                if (ppButton != null) {
                                                                    i7 = d.tv11;
                                                                    TextView textView = (TextView) p059e1.a.m(i7, viewInflate);
                                                                    if (textView != null) {
                                                                        i7 = d.tv21;
                                                                        TextView textView2 = (TextView) p059e1.a.m(i7, viewInflate);
                                                                        if (textView2 != null) {
                                                                            i7 = d.tvSkip;
                                                                            TextView textView3 = (TextView) p059e1.a.m(i7, viewInflate);
                                                                            if (textView3 != null) {
                                                                                i7 = d.view2;
                                                                                ConstraintLayout constraintLayout = (ConstraintLayout) p059e1.a.m(i7, viewInflate);
                                                                                if (constraintLayout != null) {
                                                                                    t tVar = new t((LinearLayout) viewInflate, viewStub, iconicsCheckBox, iconicsCheckBox2, iconicsCheckBox3, iconicsCheckBox4, singleAdView, ppFormVertical, ppFormVertical2, ppFormVertical3, ppFormVertical4, ppFormVertical5, nestedScrollView, ppButton, textView, textView2, textView3, constraintLayout);
                                                                                    Intrinsics.checkNotNullExpressionValue(tVar, "inflate(...)");
                                                                                    return tVar;
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
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i7)));
    }

    public final List v() {
        return (List) this.f26188v.getValue();
    }

    public final List w() {
        return (List) this.f26182A.getValue();
    }

    public final List x() {
        return (List) this.f26187p.getValue();
    }

    public final List y() {
        return (List) this.f26189w.getValue();
    }

    public final List z() {
        return (List) this.t.getValue();
    }
}
