package com.transsnet.palmpay.credit.ui.fragment;

import A8.g;
import F6.d;
import Hb.w;
import Pa.C0525w;
import Pa.n0;
import Pa.r0;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import android.text.method.LinkMovementMethod;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Group;
import androidx.viewbinding.ViewBinding;
import com.alibaba.android.arouter.facade.annotation.Route;
import com.horcrux.svg.d0;
import com.mikepenz.iconics.view.IconicsCheckBox;
import com.transsnet.palmpay.core.base.BaseApplication;
import com.transsnet.palmpay.core.bean.message.MessageEvent;
import com.transsnet.palmpay.core.util.statistic.core.AutoTrackUtil;
import com.transsnet.palmpay.credit.bean.LoanHomeBottomInfo;
import com.transsnet.palmpay.credit.bean.LoanHomeDataInfo;
import com.transsnet.palmpay.credit.bean.ProductContentInfo;
import com.transsnet.palmpay.credit.bean.rsp.OkCardMainPageRspData;
import com.transsnet.palmpay.credit.view.LoanHomeBottomInfoView;
import com.transsnet.palmpay.custom_view.utils.CommonViewExtKt;
import com.transsnet.palmpay.util.SPUtils;
import com.transsnet.palmpay.util.SizeUtils;
import com.transsnet.palmpay.util.SpanUtils;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.F;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.greenrobot.eventbus.Subscribe;
import org.greenrobot.eventbus.ThreadMode;
import org.greenrobot.eventbus.c;
import org.jetbrains.annotations.NotNull;
import p099gb.b;
import p099gb.k;
import p220oa.h;
import p294tb.RunnableC2060w;
import p294tb.W;
import p310ub.h1;

/* JADX INFO: loaded from: classes4.dex */
@Route(path = "/credit_score/oc_double_open_guide_fragment")
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001\tB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\b¨\u0006\n"}, d2 = {"Lcom/transsnet/palmpay/credit/ui/fragment/OcGuideDoubleOpenFragment;", "Lcom/transsnet/palmpay/credit/ui/fragment/OpenAccountBaseFragment;", "<init>", "()V", "Lcom/transsnet/palmpay/core/bean/message/MessageEvent;", "event", "", "onMessageEvent", "(Lcom/transsnet/palmpay/core/bean/message/MessageEvent;)V", "a", "module_flexi_impl_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nOcGuideDoubleOpenFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 OcGuideDoubleOpenFragment.kt\ncom/transsnet/palmpay/credit/ui/fragment/OcGuideDoubleOpenFragment\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,518:1\n295#2,2:519\n295#2,2:521\n*S KotlinDebug\n*F\n+ 1 OcGuideDoubleOpenFragment.kt\ncom/transsnet/palmpay/credit/ui/fragment/OcGuideDoubleOpenFragment\n*L\n208#1:519,2\n331#1:521,2\n*E\n"})
public final class OcGuideDoubleOpenFragment extends OpenAccountBaseFragment {

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public static final /* synthetic */ int f30417r0 = 0;

    /* JADX INFO: renamed from: Z, reason: collision with root package name */
    public b f30418Z;

    /* JADX INFO: renamed from: k0, reason: collision with root package name */
    public AnimatorSet f30419k0;

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final RunnableC2060w f30420p0 = new RunnableC2060w(this, 9);

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public ProductContentInfo f30421q0;

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

    public final void D() {
        IconicsCheckBox iconicsCheckBox;
        LoanHomeBottomInfoView loanHomeBottomInfoView;
        TextView textView;
        Group group;
        LinearLayout linearLayout;
        LinearLayout linearLayout2;
        IconicsCheckBox iconicsCheckBox2;
        d.h(this.f27317a, 3, "showDefaultLayout >>>");
        b bVar = this.f30418Z;
        if (bVar != null && (iconicsCheckBox2 = bVar.checkAgreement) != null) {
            iconicsCheckBox2.setOnCheckedChangeListener(new g(this, 18));
        }
        b bVar2 = this.f30418Z;
        if (bVar2 != null && (linearLayout2 = bVar2.layoutReview) != null) {
            h.s(linearLayout2, false);
        }
        b bVar3 = this.f30418Z;
        if (bVar3 != null && (linearLayout = bVar3.layoutNormal) != null) {
            h.s(linearLayout, true);
        }
        b bVar4 = this.f30418Z;
        if (bVar4 != null && (group = bVar4.groupConfinementPeriod) != null) {
            h.s(group, false);
        }
        b bVar5 = this.f30418Z;
        if (bVar5 != null && (textView = bVar5.tvApplicationAgreement) != null) {
            h.s(textView, true);
        }
        b bVar6 = this.f30418Z;
        if (bVar6 != null && (loanHomeBottomInfoView = bVar6.viewLoanHomeBottomInfo) != null) {
            h.s(loanHomeBottomInfoView, false);
        }
        b bVar7 = this.f30418Z;
        if (bVar7 != null && (iconicsCheckBox = bVar7.checkAgreement) != null) {
            h.s(iconicsCheckBox, true);
        }
        if (m()) {
            b bVar8 = this.f30418Z;
            r0.r1("https://static.chuanyinet.com/images/Frame%201686556545c7e93428-d584-4b.png", bVar8 != null ? bVar8.ivBg : null);
        } else {
            b bVar9 = this.f30418Z;
            r0.r1("https://static.chuanyinet.com/images/Group%20159788538699660eda-3253-4e.png", bVar9 != null ? bVar9.ivBg : null);
        }
        F();
        if (this.f30419k0 == null) {
            b bVar10 = this.f30418Z;
            this.f30419k0 = E(bVar10 != null ? bVar10.ivFinger : null, this.f30420p0);
        }
    }

    public final AnimatorSet E(ImageView imageView, RunnableC2060w runnableC2060w) {
        if (imageView == null) {
            return null;
        }
        h.s(imageView, true);
        float translationX = imageView.getTranslationX();
        float translationY = imageView.getTranslationY();
        float fDp2px = SizeUtils.dp2px(5.0f);
        float f10 = translationX - fDp2px;
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(imageView, "translationX", translationX, f10, translationX, f10, translationX);
        float f11 = translationY - fDp2px;
        ObjectAnimator objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(imageView, "translationY", translationY, f11, translationY, f11, translationY);
        AnimatorSet animatorSet = new AnimatorSet();
        AnimatorSet.Builder builderPlay = animatorSet.play(objectAnimatorOfFloat2);
        if (builderPlay != null) {
            builderPlay.with(objectAnimatorOfFloat);
        }
        animatorSet.setDuration(1330L);
        animatorSet.start();
        animatorSet.addListener(new w(5, this, runnableC2060w));
        return animatorSet;
    }

    public final void F() {
        d.h(this.f27317a, 3, "stopAnimation");
        AnimatorSet animatorSet = this.f30419k0;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
        this.f30419k0 = null;
        j().removeCallbacks(this.f30420p0);
    }

    /* JADX WARN: Code duplicated, block: B:109:0x0158  */
    /* JADX WARN: Code duplicated, block: B:111:0x015c  */
    /* JADX WARN: Code duplicated, block: B:152:0x01d1  */
    /* JADX WARN: Code duplicated, block: B:95:0x012d  */
    public final void G(LoanHomeDataInfo loanHomeDataInfo) {
        List<ProductContentInfo> list;
        ProductContentInfo productContentInfo;
        Object next;
        boolean z3;
        LinearLayout linearLayout;
        TextView textView;
        TextView textView2;
        TextView textView3;
        IconicsCheckBox iconicsCheckBox;
        TextView textView4;
        String strV1;
        Long l5;
        Group group;
        IconicsCheckBox iconicsCheckBox2;
        TextView textView5;
        LinearLayout linearLayout2;
        LinearLayout linearLayout3;
        Group group2;
        ProductContentInfo productContentInfo2;
        LoanHomeBottomInfoView loanHomeBottomInfoView;
        LoanHomeBottomInfoView loanHomeBottomInfoView2;
        LoanHomeBottomInfoView loanHomeBottomInfoView3;
        LoanHomeBottomInfoView loanHomeBottomInfoView4;
        LoanHomeBottomInfoView loanHomeBottomInfoView5;
        LoanHomeBottomInfoView loanHomeBottomInfoView6;
        k kVar;
        TextView textView6;
        TextView textView7;
        k kVar2;
        ConstraintLayout root;
        Object next2;
        Group group3;
        d.h(this.f27317a, 3, "updateData >>> loanHomeDataInfo = " + loanHomeDataInfo);
        if (loanHomeDataInfo != null) {
            List<ProductContentInfo> list2 = loanHomeDataInfo.productContentInfo;
            boolean z8 = false;
            int size = list2 != null ? list2.size() : 0;
            b bVar = this.f30418Z;
            if (bVar != null && (group3 = bVar.layoutGetMoneyNow) != null) {
                h.s(group3, size == 0);
            }
            Unit unit = null;
            long jLongValue = 0;
            if (BaseApplication.hasLogin()) {
                List<ProductContentInfo> list3 = loanHomeDataInfo.productContentInfo;
                if (list3 != null) {
                    Iterator<T> it = list3.iterator();
                    do {
                        if (!it.hasNext()) {
                            next2 = null;
                            break;
                        }
                        next2 = it.next();
                    } while (!Intrinsics.c(((ProductContentInfo) next2).loanProduct, "PALMPAY_BUSINESS_LOAN"));
                    productContentInfo2 = (ProductContentInfo) next2;
                } else {
                    productContentInfo2 = null;
                }
                b bVar2 = this.f30418Z;
                if (bVar2 != null && (kVar2 = bVar2.clBusinessLoanLayout) != null && (root = kVar2.getRoot()) != null) {
                    h.s(root, productContentInfo2 != null);
                }
                b bVar3 = this.f30418Z;
                if (bVar3 != null && (textView7 = bVar3.tvBusinessLoanTitle) != null) {
                    h.s(textView7, productContentInfo2 != null);
                }
                if (productContentInfo2 != null) {
                    Long l6 = productContentInfo2.amount;
                    String strV2 = r0.V1(r0.B(l6 != null ? l6.longValue() : 0L, true));
                    b bVar4 = this.f30418Z;
                    if (bVar4 != null && (kVar = bVar4.clBusinessLoanLayout) != null && (textView6 = kVar.tvLoanAmountValue) != null) {
                        textView6.setText(strV2);
                    }
                    n0.g().w("BusinessLoanCreditLoanPageShow", F.b(new Pair("source", "guide")));
                    b bVar5 = this.f30418Z;
                    if (bVar5 != null && (loanHomeBottomInfoView6 = bVar5.viewLoanHomeBottomInfo) != null) {
                        LoanHomeBottomInfo loanHomeBottomInfo = p186mb.d.f39634e.getInstance().f39636a;
                        int i7 = LoanHomeBottomInfoView.f30793c;
                        loanHomeBottomInfoView6.e(loanHomeBottomInfo, null, null);
                    }
                    b bVar6 = this.f30418Z;
                    if (bVar6 != null && (loanHomeBottomInfoView5 = bVar6.viewLoanHomeBottomInfo) != null) {
                        h.C(loanHomeBottomInfoView5);
                    }
                    b bVar7 = this.f30418Z;
                    if (bVar7 != null && (loanHomeBottomInfoView4 = bVar7.viewLoanHomeBottomInfo2) != null) {
                        h.c(loanHomeBottomInfoView4);
                    }
                } else {
                    b bVar8 = this.f30418Z;
                    if (bVar8 != null && (loanHomeBottomInfoView3 = bVar8.viewLoanHomeBottomInfo2) != null) {
                        LoanHomeBottomInfo loanHomeBottomInfo2 = p186mb.d.f39634e.getInstance().f39636a;
                        int i10 = LoanHomeBottomInfoView.f30793c;
                        loanHomeBottomInfoView3.e(loanHomeBottomInfo2, null, null);
                    }
                    b bVar9 = this.f30418Z;
                    if (bVar9 != null && (loanHomeBottomInfoView2 = bVar9.viewLoanHomeBottomInfo2) != null) {
                        h.C(loanHomeBottomInfoView2);
                    }
                    b bVar10 = this.f30418Z;
                    if (bVar10 != null && (loanHomeBottomInfoView = bVar10.viewLoanHomeBottomInfo) != null) {
                        h.c(loanHomeBottomInfoView);
                    }
                }
            }
            if (size > 0) {
                if (size == 1) {
                    List<ProductContentInfo> list4 = loanHomeDataInfo.productContentInfo;
                    if (list4 != null) {
                        productContentInfo = list4.get(0);
                    } else {
                        productContentInfo = null;
                    }
                } else {
                    List<ProductContentInfo> list5 = loanHomeDataInfo.productContentInfo;
                    if (list5 != null) {
                        Iterator<T> it2 = list5.iterator();
                        do {
                            if (!it2.hasNext()) {
                                next = null;
                                break;
                            }
                            next = it2.next();
                        } while (Intrinsics.c(((ProductContentInfo) next).loanProduct, "PALMPAY_BUSINESS_LOAN"));
                        ProductContentInfo productContentInfo3 = (ProductContentInfo) next;
                        if (productContentInfo3 == null) {
                            list = loanHomeDataInfo.productContentInfo;
                            if (list != null) {
                                productContentInfo = list.get(0);
                            } else {
                                productContentInfo = null;
                            }
                        } else {
                            productContentInfo = productContentInfo3;
                        }
                    } else {
                        list = loanHomeDataInfo.productContentInfo;
                        if (list != null) {
                            productContentInfo = list.get(0);
                        } else {
                            productContentInfo = null;
                        }
                    }
                }
                if (m()) {
                    b bVar11 = this.f30418Z;
                    r0.r1("https://static.chuanyinet.com/images/Frame%201686556545c7e93428-d584-4b.png", bVar11 != null ? bVar11.ivBg : null);
                } else {
                    b bVar12 = this.f30418Z;
                    r0.r1("https://static.chuanyinet.com/images/Group%20159788538699660eda-3253-4e.png", bVar12 != null ? bVar12.ivBg : null);
                }
                this.f30421q0 = productContentInfo;
                b bVar13 = this.f30418Z;
                if (bVar13 != null && (group2 = bVar13.groupConfinementPeriod) != null) {
                    h.s(group2, TextUtils.equals(productContentInfo != null ? productContentInfo.status : null, "assessment"));
                }
                b bVar14 = this.f30418Z;
                if (bVar14 != null && (linearLayout3 = bVar14.layoutNormal) != null) {
                    h.s(linearLayout3, !TextUtils.equals(productContentInfo != null ? productContentInfo.status : null, "assessment"));
                }
                if (TextUtils.equals(productContentInfo != null ? productContentInfo.status : null, "underReview")) {
                    z3 = true;
                } else {
                    if (TextUtils.equals(productContentInfo != null ? productContentInfo.status : null, "declined")) {
                        z3 = true;
                    } else {
                        z3 = false;
                    }
                }
                b bVar15 = this.f30418Z;
                if (bVar15 != null && (linearLayout2 = bVar15.layoutReview) != null) {
                    h.s(linearLayout2, z3);
                }
                b bVar16 = this.f30418Z;
                if (bVar16 != null && (textView5 = bVar16.tvApplicationAgreement) != null) {
                    h.s(textView5, !TextUtils.equals(productContentInfo != null ? productContentInfo.status : null, "assessment"));
                }
                b bVar17 = this.f30418Z;
                if (bVar17 != null && (iconicsCheckBox2 = bVar17.checkAgreement) != null) {
                    h.s(iconicsCheckBox2, !TextUtils.equals(productContentInfo != null ? productContentInfo.status : null, "assessment"));
                }
                if (!TextUtils.equals(productContentInfo != null ? productContentInfo.status : null, "assessment")) {
                    if (!TextUtils.equals(productContentInfo != null ? productContentInfo.status : null, "underReview")) {
                        if (!TextUtils.equals(productContentInfo != null ? productContentInfo.status : null, "declined")) {
                            z8 = true;
                        }
                    }
                }
                b bVar18 = this.f30418Z;
                if (bVar18 != null && (group = bVar18.layoutGetMoneyNow) != null) {
                    h.s(group, z8);
                }
                b bVar19 = this.f30418Z;
                if (bVar19 != null && (textView4 = bVar19.tvAmount) != null) {
                    if (TextUtils.isEmpty(productContentInfo != null ? productContentInfo.maxCreditQuota : null)) {
                        if (productContentInfo != null && (l5 = productContentInfo.amount) != null) {
                            jLongValue = l5.longValue();
                        }
                        strV1 = r0.V1(r0.B(jLongValue, true));
                    } else {
                        strV1 = productContentInfo != null ? productContentInfo.maxCreditQuota : null;
                    }
                    textView4.setText(strV1);
                }
                F();
                if (this.f30419k0 == null && z8) {
                    b bVar20 = this.f30418Z;
                    this.f30419k0 = E(bVar20 != null ? bVar20.ivFinger : null, this.f30420p0);
                }
                if (!TextUtils.isEmpty(productContentInfo != null ? productContentInfo.giftImage : null)) {
                    b bVar21 = this.f30418Z;
                    r0.l1(productContentInfo != null ? productContentInfo.giftImage : null, bVar21 != null ? bVar21.ivGift : null);
                }
                b bVar22 = this.f30418Z;
                if (bVar22 != null && (iconicsCheckBox = bVar22.checkAgreement) != null) {
                    iconicsCheckBox.setOnCheckedChangeListener(new g(this, 18));
                }
                b bVar23 = this.f30418Z;
                if (bVar23 != null && (textView3 = bVar23.tvConfinementPeriodContent) != null) {
                    textView3.setText(productContentInfo != null ? productContentInfo.subTitle2 : null);
                }
                b bVar24 = this.f30418Z;
                if (bVar24 != null && (textView2 = bVar24.tvConfinementPeriodSubContent) != null) {
                    textView2.setText(productContentInfo != null ? productContentInfo.applyTitle : null);
                }
                b bVar25 = this.f30418Z;
                if (bVar25 != null && (textView = bVar25.tvReapplyDate) != null) {
                    textView.setText(productContentInfo != null ? productContentInfo.applySubTitle : null);
                }
                b bVar26 = this.f30418Z;
                r0.l1(productContentInfo != null ? productContentInfo.applyIcon : null, bVar26 != null ? bVar26.ivCalendar : null);
                b bVar27 = this.f30418Z;
                if (bVar27 != null && (linearLayout = bVar27.layoutReview) != null) {
                    h.l(new W(19, productContentInfo, this), linearLayout);
                    unit = Unit.f38893a;
                }
            } else {
                D();
                unit = Unit.f38893a;
            }
            if (unit != null) {
                return;
            }
        }
        D();
    }

    @Override // com.transsnet.palmpay.core.base.BaseFragment
    public final int h() {
        return 0;
    }

    @Override // com.transsnet.palmpay.core.base.BaseFragment
    public final int k() {
        if (this.f30369o != null) {
            return 0;
        }
        u();
        return 0;
    }

    @Override // com.transsnet.palmpay.core.base.BaseFragment
    public final ViewBinding l(LayoutInflater inflater, ViewGroup viewGroup) {
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        b bVarInflate = b.inflate(inflater, viewGroup, false);
        this.f30418Z = bVarInflate;
        Intrinsics.e(bVarInflate);
        return bVarInflate;
    }

    @Override // com.transsnet.palmpay.credit.ui.fragment.OcBaseFragment, com.transsnet.palmpay.core.base.BaseFragment
    public final int o() {
        super.o();
        if (getContext() == null) {
            return 0;
        }
        v();
        return 0;
    }

    @Override // com.transsnet.palmpay.core.base.BaseFragment, androidx.fragment.app.Fragment
    public final void onAttach(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        super.onAttach(context);
        if (c.b().e(this)) {
            return;
        }
        c.b().j(this);
    }

    @Override // com.transsnet.palmpay.core.base.BaseFragment, androidx.fragment.app.Fragment
    public final void onDestroy() {
        super.onDestroy();
        F();
    }

    @Override // com.transsnet.palmpay.core.base.BaseFragment, androidx.fragment.app.Fragment
    public final void onDetach() {
        super.onDetach();
        c.b().l(this);
    }

    @Subscribe(threadMode = ThreadMode.MAIN)
    public final void onMessageEvent(@NotNull MessageEvent event) {
        Intrinsics.checkNotNullParameter(event, "event");
        if (event.getEventType() == 563) {
            C0525w c0525wF = C0525w.f();
            String eventContent = event.getEventContent();
            c0525wF.getClass();
            G((LoanHomeDataInfo) C0525w.d(eventContent, LoanHomeDataInfo.class));
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onPause() {
        super.onPause();
        F();
    }

    /* JADX WARN: Code duplicated, block: B:46:0x0165  */
    @Override // com.transsnet.palmpay.credit.ui.fragment.OcBaseFragment
    public final void v() {
        TextView textView;
        boolean z3;
        TextView textView2;
        TextView textView3;
        k kVar;
        ConstraintLayout constraintLayout;
        k kVar2;
        Bundle arguments = getArguments();
        String string = arguments != null ? arguments.getString("oc_guide_data") : null;
        if (!TextUtils.isEmpty(string)) {
            this.f30369o = (OkCardMainPageRspData) d0.l(OkCardMainPageRspData.class, string);
        }
        d.h(this.f27317a, 3, "handleBusinessLoan >>>");
        String str = m() ? "https://static.chuanyinet.com/images/bussiness_loan_bg_darkfdcd9ac1-da06-4d.webp" : "https://static.chuanyinet.com/images/bussiness_loan_bg851d1517-52c0-4f.webp";
        b bVar = this.f30418Z;
        r0.n1((bVar == null || (kVar2 = bVar.clBusinessLoanLayout) == null) ? null : kVar2.layoutApply, str);
        b bVar2 = this.f30418Z;
        if (bVar2 != null && (kVar = bVar2.clBusinessLoanLayout) != null && (constraintLayout = kVar.layoutApply) != null) {
            h.l(new h1(18), constraintLayout);
        }
        int iColorInt = CommonViewExtKt.colorInt(L6.b.ppColorTextPrimary, getActivity());
        b bVar3 = this.f30418Z;
        if (bVar3 != null && (textView3 = bVar3.tvApplicationAgreement) != null) {
            textView3.setMovementMethod(LinkMovementMethod.getInstance());
            textView3.setHighlightColor(0);
            textView3.setText(new SpanUtils().append("I have read, understood and agreed to ").setForegroundColor(CommonViewExtKt.colorInt(L6.b.ppColorTextNormal, getActivity())).append("Credit Limit Application Agreement,").setUnderline().setForegroundColor(iColorInt).setClickSpan(new Dd.d(iColorInt, 15)).append(" ").append("Loan Terms,").setForegroundColor(iColorInt).setUnderline().setClickSpan(new Dd.d(iColorInt, 16)).append(" ").append("Privacy Policy.").setForegroundColor(iColorInt).setUnderline().setForegroundColor(iColorInt).setClickSpan(new Dd.d(iColorInt, 17)).create());
        }
        C0525w c0525wF = C0525w.f();
        Bundle arguments2 = getArguments();
        String string2 = arguments2 != null ? arguments2.getString("home_loan_data") : null;
        c0525wF.getClass();
        G((LoanHomeDataInfo) C0525w.d(string2, LoanHomeDataInfo.class));
        HashMap map = new HashMap();
        if (BaseApplication.hasLogin()) {
            b bVar4 = this.f30418Z;
            if (bVar4 != null && (textView = bVar4.openFlexiTv) != null) {
                Intrinsics.checkNotNullParameter("key_okcard_ban_days", "key");
                if (SPUtils.getInstance(p059e1.a.G("key_okcard_ban_days")).getInt(p367ya.a.d().e("key_okcard_ban_days"), 0) > 0) {
                    Intrinsics.checkNotNullParameter("key_cash_loan_ban_days", "key");
                    z3 = SPUtils.getInstance(p059e1.a.G("key_cash_loan_ban_days")).getInt(p367ya.a.d().e("key_cash_loan_ban_days"), 0) <= 0;
                }
                textView.setEnabled(z3);
            }
            OkCardMainPageRspData okCardMainPageRspData = this.f30369o;
            if (Intrinsics.c(okCardMainPageRspData != null ? okCardMainPageRspData.getUserTag() : null, "BLACK_LIST_USER")) {
                map.put("screen_name", "OcGuideDoubleOpenFragment_black_list");
            } else {
                Integer num = this.f30368j;
                if (num != null && num.intValue() == 7) {
                    map.put("screen_name", "OcGuideDoubleOpenFragment_can_active");
                } else {
                    OkCardMainPageRspData okCardMainPageRspData2 = this.f30369o;
                    if (Intrinsics.c(okCardMainPageRspData2 != null ? okCardMainPageRspData2.getNoLockUserWhitelist() : null, "1")) {
                        map.put("screen_name", "OcGuideDoubleOpenFragment_can_active");
                    } else {
                        map.put("screen_name", "OcGuideDoubleOpenFragment_no_lock_no_white_list");
                    }
                }
            }
        } else {
            map.put("screen_name", "OcGuideDoubleOpenFragment_visitor");
        }
        b bVar5 = this.f30418Z;
        if (bVar5 != null && (textView2 = bVar5.openFlexiTv) != null) {
            h.l(new p327vd.c(this, 21), textView2);
        }
        AutoTrackUtil.trackActivityProperties(getActivity(), map);
    }
}
