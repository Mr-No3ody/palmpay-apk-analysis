package com.transsnet.palmpay.account.ui.fragment.upgrade;

import Bc.C0104a;
import F8.e;
import L6.b;
import Pa.i0;
import Pa.n0;
import Pa.r0;
import Ua.ViewOnFocusChangeListenerC0631l;
import X6.c;
import android.content.Context;
import android.os.Build;
import android.text.Editable;
import android.text.Html;
import android.text.InputFilter;
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
import androidx.core.view.H;
import androidx.core.view.N;
import androidx.core.widget.NestedScrollView;
import androidx.fragment.app.E;
import androidx.lifecycle.AbstractC1207q;
import androidx.lifecycle.V;
import androidx.viewbinding.ViewBinding;
import com.palmpay.lib.ui.button.PpButton;
import com.palmpay.lib.ui.form.PpFormVertical;
import com.palmpay.lib.ui.titlebar.PpTitleBar;
import com.transsnet.adsdk.widgets.SingleAdView;
import com.transsnet.palmpay.account.bean.ApplyForTier3Req;
import com.transsnet.palmpay.account.bean.rsp.CountryRegionList;
import com.transsnet.palmpay.account.bean.rsp.QueryAddressFromBillRsp;
import com.transsnet.palmpay.account.ui.activity.PalmPayLevelUpTier3V2Activity;
import com.transsnet.palmpay.account.ui.mvp.contract.PalmPayLevelUpTier3Contract;
import com.transsnet.palmpay.core.base.BaseMVPFragment;
import com.transsnet.palmpay.core.base.IBasePresenter;
import com.transsnet.palmpay.core.bean.CommonBeanResult;
import com.transsnet.palmpay.core.util.statistic.IAutoTrack;
import com.transsnet.palmpay.custom_view.dialog.p;
import com.transsnet.palmpay.custom_view.utils.CommonViewExtKt;
import com.transsnet.palmpay.custom_view.utils.KeyBoardListenerHelper;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import p024b9.d;
import p024b9.f;
import p024b9.g;
import p025ba.k;
import p051d9.C1628z;
import p220oa.h;
import p355xf.C2131j;
import p355xf.t;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u00012\u00020\u00032\u00020\u00042\u00020\u00052\u00020\u00062\u00020\u0007:\u0001\nB\u0007¢\u0006\u0004\b\b\u0010\t¨\u0006\u000b"}, d2 = {"Lcom/transsnet/palmpay/account/ui/fragment/upgrade/UpgradeTier3StepAddressEditFragment;", "Lcom/transsnet/palmpay/core/base/BaseMVPFragment;", "Ld9/z;", "Lcom/transsnet/palmpay/account/ui/mvp/contract/PalmPayLevelUpTier3Contract$View;", "Landroid/text/TextWatcher;", "Landroid/view/View$OnClickListener;", "Lcom/transsnet/palmpay/custom_view/utils/KeyBoardListenerHelper$OnKeyBoardChangeListener;", "Lcom/transsnet/palmpay/core/util/statistic/IAutoTrack;", "<init>", "()V", "a", "module_account_impl_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nUpgradeTier3StepAddressEditFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 UpgradeTier3StepAddressEditFragment.kt\ncom/transsnet/palmpay/account/ui/fragment/upgrade/UpgradeTier3StepAddressEditFragment\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 4 ArraysJVM.kt\nkotlin/collections/ArraysKt__ArraysJVMKt\n*L\n1#1,655:1\n1#2:656\n1869#3,2:657\n37#4:659\n36#4,3:660\n37#4:663\n36#4,3:664\n37#4:667\n36#4,3:668\n*S KotlinDebug\n*F\n+ 1 UpgradeTier3StepAddressEditFragment.kt\ncom/transsnet/palmpay/account/ui/fragment/upgrade/UpgradeTier3StepAddressEditFragment\n*L\n287#1:657,2\n423#1:659\n423#1:660,3\n464#1:663\n464#1:664,3\n497#1:667\n497#1:668,3\n*E\n"})
public final class UpgradeTier3StepAddressEditFragment extends BaseMVPFragment<C1628z> implements PalmPayLevelUpTier3Contract.View, TextWatcher, View.OnClickListener, KeyBoardListenerHelper.OnKeyBoardChangeListener, IAutoTrack {

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public static final /* synthetic */ int f26283C = 0;

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public int f26284A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public boolean f26285B;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public C0104a f26286j;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public List f26288p;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public int f26289v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public List f26290w;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final t f26287o = C2131j.b(new c(this, 9));
    public final ArrayList t = new ArrayList();

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
            ppFormVertical.setOnFocusChangeListener(new ViewOnFocusChangeListenerC0631l(2));
        }
    }

    public static String v(PpFormVertical ppFormVertical) {
        String editContent;
        return (ppFormVertical == null || (editContent = ppFormVertical.getEditContent()) == null) ? "" : editContent;
    }

    /* JADX WARN: Code duplicated, block: B:24:0x0054  */
    public final void A() {
        boolean z3;
        C0104a c0104a = this.f26286j;
        if (c0104a != null) {
            PpButton ppButton = (PpButton) c0104a.f660v;
            if (TextUtils.isEmpty(v((PpFormVertical) c0104a.f657j))) {
                z3 = false;
            } else {
                C0104a c0104a2 = this.f26286j;
                if (TextUtils.isEmpty(v(c0104a2 != null ? (PpFormVertical) c0104a2.f655g : null))) {
                    z3 = false;
                } else {
                    C0104a c0104a3 = this.f26286j;
                    if (TextUtils.isEmpty(v(c0104a3 != null ? (PpFormVertical) c0104a3.f654f : null))) {
                        z3 = false;
                    } else {
                        C0104a c0104a4 = this.f26286j;
                        if (TextUtils.isEmpty(v(c0104a4 != null ? (PpFormVertical) c0104a4.f656i : null))) {
                            z3 = false;
                        } else {
                            z3 = true;
                        }
                    }
                }
            }
            ppButton.setEnabled(z3);
        }
    }

    public final void B(PpFormVertical ppFormVertical) {
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
        C0104a c0104a;
        Pb.a aVar;
        LinearLayout root;
        if (this.f26285B == z3) {
            return;
        }
        this.f26285B = z3;
        C0104a c0104a2 = this.f26286j;
        if (c0104a2 != null) {
            h.s((PpButton) c0104a2.f660v, !z3);
        }
        C0104a c0104a3 = this.f26286j;
        if (c0104a3 != null && (aVar = (Pb.a) c0104a3.f653e) != null && (root = aVar.getRoot()) != null) {
            h.s(root, !z3);
        }
        C0104a c0104a4 = this.f26286j;
        if (c0104a4 != null) {
            h.s((SingleAdView) c0104a4.f652d, !z3);
        }
        if (z3 && (c0104a = this.f26286j) != null) {
            ((NestedScrollView) c0104a.f651c).postDelayed(new g(this, 0), 200L);
        }
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable s3) {
        PpFormVertical ppFormVertical;
        PpFormVertical ppFormVertical2;
        PpFormVertical ppFormVertical3;
        TextView textView;
        Intrinsics.checkNotNullParameter(s3, "s");
        A();
        C0104a c0104a = this.f26286j;
        if (c0104a != null && (textView = (TextView) c0104a.f658o) != null) {
            h.c(textView);
        }
        C0104a c0104a2 = this.f26286j;
        if (c0104a2 != null && (ppFormVertical3 = (PpFormVertical) c0104a2.f654f) != null) {
            ppFormVertical3.setBottomText(null);
        }
        C0104a c0104a3 = this.f26286j;
        if (c0104a3 != null && (ppFormVertical2 = (PpFormVertical) c0104a3.f655g) != null) {
            ppFormVertical2.setBottomText(null);
        }
        C0104a c0104a4 = this.f26286j;
        if (c0104a4 != null && (ppFormVertical = (PpFormVertical) c0104a4.f656i) != null) {
            ppFormVertical.setBottomText(null);
        }
        x();
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence s3, int i7, int i10, int i11) {
        Intrinsics.checkNotNullParameter(s3, "s");
    }

    @Override // com.transsnet.palmpay.core.base.IBaseView
    public final AbstractC1207q getCoroutineScope() {
        return V.f(this);
    }

    @Override // com.transsnet.palmpay.core.util.statistic.IAutoTrack
    public final String getPageAlias() {
        return "t3_manual_address_page_exposure";
    }

    @Override // com.transsnet.palmpay.core.base.BaseFragment
    public final int h() {
        return 0;
    }

    @Override // com.transsnet.palmpay.account.ui.mvp.contract.PalmPayLevelUpTier3Contract.View
    public final void handleApplicationResult(CommonBeanResult commonBeanResult) {
        d.f18795f.handleApplicationResult(getActivity(), getContext(), commonBeanResult);
    }

    /* JADX WARN: Code duplicated, block: B:42:0x00ad A[EDGE_INSN: B:42:0x00ad->B:43:0x00ae BREAK  A[LOOP:1: B:36:0x0094->B:41:0x00ab]] */
    @Override // com.transsnet.palmpay.account.ui.mvp.contract.PalmPayLevelUpTier3Contract.View
    public final void handleCountryRegionListData(boolean z3, List list) {
        int i7;
        if (!i0.W(getActivity()) || isDetached() || !isAdded() || list == null) {
            return;
        }
        List list2 = this.f26288p;
        if (list2 == null || list2.size() != list.size()) {
            this.f26288p = list;
            ArrayList arrayList = this.t;
            arrayList.clear();
            this.f26289v = 0;
            C0104a c0104a = this.f26286j;
            String editContent = c0104a != null ? ((PpFormVertical) c0104a.f654f).getEditContent() : null;
            C0104a c0104a2 = this.f26286j;
            String editContent2 = c0104a2 != null ? ((PpFormVertical) c0104a2.f655g).getEditContent() : null;
            Iterator it = list.iterator();
            int i10 = 0;
            while (it.hasNext()) {
                int i11 = i10 + 1;
                CountryRegionList countryRegionList = (CountryRegionList) it.next();
                String areaName = countryRegionList.areaName;
                Intrinsics.checkNotNullExpressionValue(areaName, "areaName");
                arrayList.add(areaName);
                if (countryRegionList.areaName.equals(editContent)) {
                    this.f26289v = i10;
                    List<CountryRegionList> list3 = countryRegionList.children;
                    this.f26290w = list3;
                    if (list3 != null) {
                        if (list3.isEmpty()) {
                            list3 = null;
                        }
                        if (list3 == null) {
                            i7 = 0;
                            break;
                        }
                        Iterator<T> it2 = list3.iterator();
                        i7 = 0;
                        while (true) {
                            if (!it2.hasNext()) {
                                i7 = 0;
                                break;
                            }
                            int i12 = i7 + 1;
                            if (Intrinsics.c(editContent2, ((CountryRegionList) it2.next()).areaName)) {
                                break;
                            } else {
                                i7 = i12;
                            }
                        }
                    } else {
                        i7 = 0;
                        break;
                    }
                    this.f26284A = i7;
                }
                i10 = i11;
            }
            if (z3) {
                z();
            }
        }
    }

    @Override // com.transsnet.palmpay.core.base.BaseFragment
    public final int k() {
        C0104a c0104a;
        C0104a c0104a2;
        C0104a c0104a3;
        C0104a c0104a4;
        PpTitleBar titleBar;
        C0104a c0104a5 = this.f26286j;
        B(c0104a5 != null ? (PpFormVertical) c0104a5.f654f : null);
        C0104a c0104a6 = this.f26286j;
        B(c0104a6 != null ? (PpFormVertical) c0104a6.f655g : null);
        C0104a c0104a7 = this.f26286j;
        B(c0104a7 != null ? (PpFormVertical) c0104a7.f656i : null);
        C0104a c0104a8 = this.f26286j;
        if (c0104a8 != null) {
            ((PpFormVertical) c0104a8.f654f).setTitle(h.B(r0.H0(F8.h.ac_address_level1_name), getActivity(), null, Integer.valueOf(b.ppColorTextPrimary), null, null, null, 1018));
        }
        C0104a c0104a9 = this.f26286j;
        if (c0104a9 != null) {
            ((PpFormVertical) c0104a9.f655g).setTitle(h.B(r0.H0(F8.h.ac_address_level2_name), getActivity(), null, Integer.valueOf(b.ppColorTextPrimary), null, null, null, 1018));
        }
        C0104a c0104a10 = this.f26286j;
        if (c0104a10 != null) {
            ((PpFormVertical) c0104a10.f656i).setTitle(h.B(r0.H0(F8.h.ac_address_level3_name), getActivity(), null, Integer.valueOf(b.ppColorTextPrimary), null, null, null, 1018));
        }
        C0104a c0104a11 = this.f26286j;
        if (c0104a11 != null) {
            ((PpFormVertical) c0104a11.f657j).setTitle(h.B(r0.H0(F8.h.ac_street_address), getActivity(), null, Integer.valueOf(b.ppColorTextPrimary), null, null, null, 1018));
        }
        x();
        PalmPayLevelUpTier3V2Activity palmPayLevelUpTier3V2ActivityW = w();
        if (palmPayLevelUpTier3V2ActivityW != null && (titleBar = palmPayLevelUpTier3V2ActivityW.getTitleBar()) != null) {
            titleBar.setBackButtonClickListener(new f(this, 4));
            titleBar.setRightText("");
        }
        C0104a c0104a12 = this.f26286j;
        if (c0104a12 != null) {
            ((PpFormVertical) c0104a12.f657j).setInputFilters(new InputFilter[]{new Tb.c(100, 0), new Tb.b("[`~!@#$%^&*()+=|{}':;'\\[\\]<>/?~！@#￥%……&*（）——+|{}【】‘；：”“’、？]\n")});
        }
        C0104a c0104a13 = this.f26286j;
        if (c0104a13 != null) {
            ((PpFormVertical) c0104a13.f654f).setEditTextWatcher(this);
        }
        C0104a c0104a14 = this.f26286j;
        if (c0104a14 != null) {
            ((PpFormVertical) c0104a14.f655g).setEditTextWatcher(this);
        }
        C0104a c0104a15 = this.f26286j;
        if (c0104a15 != null) {
            ((PpFormVertical) c0104a15.f656i).setEditTextWatcher(this);
        }
        C0104a c0104a16 = this.f26286j;
        if (c0104a16 != null) {
            ((PpFormVertical) c0104a16.f657j).setEditTextWatcher(this);
        }
        C0104a c0104a17 = this.f26286j;
        if (c0104a17 != null) {
            ((PpButton) c0104a17.f660v).setOnClickListener(this);
        }
        C0104a c0104a18 = this.f26286j;
        u(c0104a18 != null ? (PpFormVertical) c0104a18.f654f : null);
        C0104a c0104a19 = this.f26286j;
        u(c0104a19 != null ? (PpFormVertical) c0104a19.f655g : null);
        C0104a c0104a20 = this.f26286j;
        u(c0104a20 != null ? (PpFormVertical) c0104a20.f656i : null);
        C0104a c0104a21 = this.f26286j;
        u(c0104a21 != null ? (PpFormVertical) c0104a21.f657j : null);
        PalmPayLevelUpTier3V2Activity palmPayLevelUpTier3V2ActivityW2 = w();
        QueryAddressFromBillRsp queryAddressFromBillRsp = palmPayLevelUpTier3V2ActivityW2 != null ? palmPayLevelUpTier3V2ActivityW2.f25921f : null;
        if (queryAddressFromBillRsp != null) {
            String stateName = queryAddressFromBillRsp.getStateName();
            if (stateName != null) {
                if (TextUtils.isEmpty(stateName)) {
                    stateName = null;
                }
                if (stateName != null && (c0104a4 = this.f26286j) != null) {
                    ((PpFormVertical) c0104a4.f654f).setEditContent(stateName);
                }
            }
            String areaName = queryAddressFromBillRsp.getAreaName();
            if (areaName != null) {
                if (TextUtils.isEmpty(areaName)) {
                    areaName = null;
                }
                if (areaName != null && (c0104a3 = this.f26286j) != null) {
                    ((PpFormVertical) c0104a3.f655g).setEditContent(areaName);
                }
            }
            String lgaName = queryAddressFromBillRsp.getLgaName();
            if (lgaName != null) {
                if (TextUtils.isEmpty(lgaName)) {
                    lgaName = null;
                }
                if (lgaName != null && (c0104a2 = this.f26286j) != null) {
                    ((PpFormVertical) c0104a2.f656i).setEditContent(lgaName);
                }
            }
            String addressDetails = queryAddressFromBillRsp.getAddressDetails();
            if (addressDetails != null) {
                String str = TextUtils.isEmpty(addressDetails) ? null : addressDetails;
                if (str != null && (c0104a = this.f26286j) != null) {
                    ((PpFormVertical) c0104a.f657j).setEditContent(str);
                }
            }
        } else {
            w();
        }
        A();
        return 0;
    }

    @Override // com.transsnet.palmpay.core.base.BaseFragment
    public final ViewBinding l(LayoutInflater inflater, ViewGroup viewGroup) {
        View viewM;
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        View viewInflate = inflater.inflate(e.ac_fragment_palmpay_level_up_tier3_step_address_edit, viewGroup, false);
        int i7 = F8.d.adView;
        SingleAdView singleAdView = (SingleAdView) p059e1.a.m(i7, viewInflate);
        if (singleAdView != null && (viewM = p059e1.a.m((i7 = F8.d.bottomView), viewInflate)) != null) {
            Pb.a aVarBind = Pb.a.bind(viewM);
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
                                        i7 = F8.d.tvLine1;
                                        TextView textView2 = (TextView) p059e1.a.m(i7, viewInflate);
                                        if (textView2 != null) {
                                            i7 = F8.d.tvSubtitle;
                                            TextView textView3 = (TextView) p059e1.a.m(i7, viewInflate);
                                            if (textView3 != null) {
                                                C0104a c0104a = new C0104a((ConstraintLayout) viewInflate, singleAdView, aVarBind, ppFormVertical, ppFormVertical2, ppFormVertical3, ppFormVertical4, nestedScrollView, ppButton, textView, textView2, textView3);
                                                this.f26286j = c0104a;
                                                return c0104a;
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

    @Override // com.transsnet.palmpay.core.base.BaseMVPFragment, com.transsnet.palmpay.core.base.BaseFragment
    public final void n() {
        super.n();
        C0104a c0104a = this.f26286j;
        y(c0104a != null ? (PpFormVertical) c0104a.f654f : null, new f(this, 1));
        C0104a c0104a2 = this.f26286j;
        y(c0104a2 != null ? (PpFormVertical) c0104a2.f655g : null, new f(this, 2));
        C0104a c0104a3 = this.f26286j;
        y(c0104a3 != null ? (PpFormVertical) c0104a3.f656i : null, new f(this, 3));
        C1628z c1628z = (C1628z) this.f27328i;
        if (c1628z != null) {
            c1628z.queryRegionList(false);
        }
    }

    @Override // com.transsnet.palmpay.core.base.BaseFragment
    public final int o() {
        ViewGroup.LayoutParams layoutParams;
        C0104a c0104a = this.f26286j;
        AppCompatEditText editText = c0104a != null ? ((PpFormVertical) c0104a.f657j).getEditText() : null;
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
        if (editText != null) {
            editText.setTextColor(CommonViewExtKt.colorInt(b.ppColorTextPrimary, requireContext()));
        }
        C0104a c0104a2 = this.f26286j;
        if (c0104a2 != null) {
            c0104a2.t.setText(Html.fromHtml(getString(F8.h.ac_msg_proof_of_address_edit), 0));
        }
        return 0;
    }

    /* JADX WARN: Code duplicated, block: B:31:0x0067  */
    /* JADX WARN: Code duplicated, block: B:9:0x002b A[PHI: r12
      0x002b: PHI (r12v41 java.lang.String) = (r12v7 java.lang.String), (r12v42 java.lang.String) binds: [B:14:0x0037, B:7:0x0028] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // android.view.View.OnClickListener
    public final void onClick(View v3) {
        String str;
        String str2;
        String str3;
        PalmPayLevelUpTier3V2Activity palmPayLevelUpTier3V2ActivityW;
        Intrinsics.checkNotNullParameter(v3, "v");
        if (v3.getId() == F8.d.textViewConfirm) {
            n0.g().l("KYC_AddressVerify_Click");
            n0.g().l("PalmPay_KYCT3SubmitClick");
            PalmPayLevelUpTier3V2Activity palmPayLevelUpTier3V2ActivityW2 = w();
            if (palmPayLevelUpTier3V2ActivityW2 == null || (str = palmPayLevelUpTier3V2ActivityW2.f25922g) == null) {
                PalmPayLevelUpTier3V2Activity palmPayLevelUpTier3V2ActivityW3 = w();
                str = palmPayLevelUpTier3V2ActivityW3 != null ? palmPayLevelUpTier3V2ActivityW3.f25917b : null;
                if (str == null) {
                    w();
                    str2 = null;
                } else {
                    str2 = str;
                }
            } else {
                str2 = str;
            }
            PalmPayLevelUpTier3V2Activity palmPayLevelUpTier3V2ActivityW4 = w();
            if (TextUtils.isEmpty(palmPayLevelUpTier3V2ActivityW4 != null ? palmPayLevelUpTier3V2ActivityW4.f25918c : null)) {
                str3 = null;
            } else {
                PalmPayLevelUpTier3V2Activity palmPayLevelUpTier3V2ActivityW5 = w();
                if (!Intrinsics.c(str2, palmPayLevelUpTier3V2ActivityW5 != null ? palmPayLevelUpTier3V2ActivityW5.f25917b : null) || (palmPayLevelUpTier3V2ActivityW = w()) == null) {
                    str3 = null;
                } else {
                    str3 = palmPayLevelUpTier3V2ActivityW.f25918c;
                }
            }
            p024b9.b bVar = d.f18795f;
            PalmPayLevelUpTier3V2Activity palmPayLevelUpTier3V2ActivityW6 = w();
            QueryAddressFromBillRsp queryAddressFromBillRsp = palmPayLevelUpTier3V2ActivityW6 != null ? palmPayLevelUpTier3V2ActivityW6.f25921f : null;
            C0104a c0104a = this.f26286j;
            String strV = v(c0104a != null ? (PpFormVertical) c0104a.f654f : null);
            C0104a c0104a2 = this.f26286j;
            String strV2 = v(c0104a2 != null ? (PpFormVertical) c0104a2.f655g : null);
            C0104a c0104a3 = this.f26286j;
            String strV3 = v(c0104a3 != null ? (PpFormVertical) c0104a3.f656i : null);
            C0104a c0104a4 = this.f26286j;
            String strV4 = v(c0104a4 != null ? (PpFormVertical) c0104a4.f657j : null);
            List<? extends CountryRegionList> list = this.f26288p;
            w();
            ApplyForTier3Req applyForTier3ReqBuildRequest = bVar.buildRequest(str2, queryAddressFromBillRsp, strV, strV2, strV3, strV4, str3, list, null);
            C1628z c1628z = (C1628z) this.f27328i;
            if (c1628z != null) {
                c1628z.submitApplication(applyForTier3ReqBuildRequest);
            }
        }
    }

    @Override // com.transsnet.palmpay.core.base.BaseMVPFragment, com.transsnet.palmpay.core.base.BaseFragment, androidx.fragment.app.Fragment
    public final void onDestroy() {
        super.onDestroy();
        ((KeyBoardListenerHelper) this.f26287o.getValue()).setOnKeyBoardChangeListener(null);
    }

    @Override // com.transsnet.palmpay.core.base.BaseFragment, androidx.fragment.app.Fragment
    public final void onResume() {
        super.onResume();
        ((KeyBoardListenerHelper) this.f26287o.getValue()).setOnKeyBoardChangeListener(this);
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence s3, int i7, int i10, int i11) {
        Intrinsics.checkNotNullParameter(s3, "s");
    }

    @Override // com.transsnet.palmpay.account.ui.mvp.contract.PalmPayLevelUpTier3Contract.View
    public final void showRetryIdentityListDialog(String message) {
        Intrinsics.checkNotNullParameter(message, "message");
        O6.c cVar = new O6.c(getActivity());
        cVar.e(k.core_title_error_info);
        cVar.d(k.core_try_again, new f(this, 0));
        cVar.f6598d = message;
        O6.d dVarA = cVar.a();
        Intrinsics.checkNotNullExpressionValue(dVarA, "create(...)");
        dVarA.show();
    }

    @Override // com.transsnet.palmpay.core.base.BaseMVPFragment
    public final IBasePresenter t() {
        return new C1628z();
    }

    public final PalmPayLevelUpTier3V2Activity w() {
        E e10 = this.f27319c;
        if (!(e10 instanceof PalmPayLevelUpTier3V2Activity)) {
            return null;
        }
        Intrinsics.f(e10, "null cannot be cast to non-null type com.transsnet.palmpay.account.ui.activity.PalmPayLevelUpTier3V2Activity");
        return (PalmPayLevelUpTier3V2Activity) e10;
    }

    public final void x() {
        C0104a c0104a = this.f26286j;
        if (c0104a != null) {
            ((PpFormVertical) c0104a.f657j).setBottomText(h.B(r0.H0(F8.h.ac_street_address_note), null, null, Integer.valueOf(b.ppColorPrimary), null, null, null, 1019));
        }
    }

    public final void y(PpFormVertical ppFormVertical, View.OnClickListener onClickListener) {
        AppCompatEditText editText;
        AppCompatEditText editText2;
        AppCompatEditText editText3;
        AppCompatEditText editText4;
        if (ppFormVertical != null && (editText4 = ppFormVertical.getEditText()) != null) {
            editText4.setFocusable(false);
        }
        if (ppFormVertical != null && (editText3 = ppFormVertical.getEditText()) != null) {
            editText3.setEnabled(true);
        }
        if (ppFormVertical != null) {
            ppFormVertical.f();
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

    public final void z() {
        ArrayList arrayList = this.t;
        ArrayList arrayList2 = !arrayList.isEmpty() ? arrayList : null;
        if (arrayList2 != null) {
            p pVar = new p(requireContext());
            pVar.b(k.core_select);
            pVar.a((CharSequence[]) arrayList2.toArray(new String[0]), this.f26289v < arrayList.size() ? this.f26289v : 0, new De.d(this, 3));
            pVar.show();
        }
    }
}
