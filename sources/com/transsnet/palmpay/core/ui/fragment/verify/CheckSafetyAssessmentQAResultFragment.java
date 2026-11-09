package com.transsnet.palmpay.core.ui.fragment.verify;

import Ja.C;
import Ja.D;
import Ma.v;
import N3.c;
import Pa.r0;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.b0;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import com.mikepenz.iconics.view.IconicsTextView;
import com.palmpay.lib.ui.button.PpButton;
import com.palmpay.lib.ui.titlebar.PpTitleBar;
import com.transsnet.palmpay.core.base.BaseMvvmVBFragment;
import com.transsnet.palmpay.core.base.BaseViewModel;
import com.transsnet.palmpay.core.bean.verify.FinallyResultDTO;
import com.transsnet.palmpay.core.bean.verify.VerifySafetyAssessmentResultGroup;
import com.transsnet.palmpay.custom_view.StatusBarView;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.G;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import p002a.a;
import p025ba.e;
import p025ba.g;
import p052da.T;
import p142ja.k;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/transsnet/palmpay/core/ui/fragment/verify/CheckSafetyAssessmentQAResultFragment;", "Lcom/transsnet/palmpay/core/base/BaseMvvmVBFragment;", "Lcom/transsnet/palmpay/core/base/BaseViewModel;", "Lja/k;", "<init>", "()V", "lib_core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nCheckSafetyAssessmentQAResultFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CheckSafetyAssessmentQAResultFragment.kt\ncom/transsnet/palmpay/core/ui/fragment/verify/CheckSafetyAssessmentQAResultFragment\n+ 2 FragmentViewModelLazy.kt\nandroidx/fragment/app/FragmentViewModelLazyKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,104:1\n172#2,9:105\n1869#3:114\n1870#3:116\n1#4:115\n*S KotlinDebug\n*F\n+ 1 CheckSafetyAssessmentQAResultFragment.kt\ncom/transsnet/palmpay/core/ui/fragment/verify/CheckSafetyAssessmentQAResultFragment\n*L\n21#1:105,9\n52#1:114\n52#1:116\n*E\n"})
public final class CheckSafetyAssessmentQAResultFragment extends BaseMvvmVBFragment<BaseViewModel, k> {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final b0 f28023o = a.h(this, G.a(v.class), new D(this, 0), new D(this, 1), new D(this, 2));

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public CheckSafetyAssessmentQAFragment f28024p;

    @Override // com.transsnet.palmpay.core.base.BaseMvvmFragment, com.transsnet.palmpay.core.base.BaseFragment
    public final int k() {
        FinallyResultDTO finallyResultDTO = (FinallyResultDTO) ((v) this.f28023o.getValue()).f5927e.d();
        if (finallyResultDTO != null) {
            ArrayList arrayList = new ArrayList();
            List<VerifySafetyAssessmentResultGroup> list = finallyResultDTO.detailDTOList;
            if (list != null) {
                for (VerifySafetyAssessmentResultGroup verifySafetyAssessmentResultGroup : list) {
                    arrayList.add(verifySafetyAssessmentResultGroup);
                    List<String> list2 = verifySafetyAssessmentResultGroup.content;
                    if (list2 != null) {
                        arrayList.addAll(list2);
                    }
                }
            }
            k kVar = (k) this.f27335j;
            RecyclerView.Adapter adapter = kVar != null ? kVar.f38499e.getAdapter() : null;
            Intrinsics.f(adapter, "null cannot be cast to non-null type com.transsnet.palmpay.core.adapter.SafetyAssessmentAdapter");
            ((T) adapter).setList(arrayList);
            String str = finallyResultDTO.titleIcon;
            if (str != null) {
                if (str.length() == 0) {
                    str = null;
                }
                if (str != null) {
                    k kVar2 = (k) this.f27335j;
                    r0.l1(str, kVar2 != null ? kVar2.f38498d : null);
                }
            }
            k kVar3 = (k) this.f27335j;
            if (kVar3 != null) {
                TextView textView = kVar3.f38501g;
                String str2 = finallyResultDTO.titleDesc;
                if (str2 == null) {
                    str2 = "";
                }
                textView.setText(str2);
            }
        }
        k kVar4 = (k) this.f27335j;
        if (kVar4 != null) {
            kVar4.f38497c.setOnClickListener(new C(this, 0));
        }
        k kVar5 = (k) this.f27335j;
        if (kVar5 != null) {
            kVar5.f38496b.setOnClickListener(new C(this, 1));
        }
        k kVar6 = (k) this.f27335j;
        if (kVar6 != null) {
            kVar6.f38500f.setBackButton(S6.a.pay_Close);
        }
        k kVar7 = (k) this.f27335j;
        if (kVar7 != null) {
            kVar7.f38500f.setBackButtonClickListener(new C(this, 2));
        }
        return 0;
    }

    @Override // com.transsnet.palmpay.core.base.BaseMvvmFragment, com.transsnet.palmpay.core.base.BaseFragment
    public final void n() {
    }

    @Override // com.transsnet.palmpay.core.base.BaseMvvmFragment, com.transsnet.palmpay.core.base.BaseFragment
    public final int o() {
        super.o();
        Fragment parentFragment = getParentFragment();
        Fragment parentFragment2 = parentFragment != null ? parentFragment.getParentFragment() : null;
        this.f28024p = parentFragment2 instanceof CheckSafetyAssessmentQAFragment ? (CheckSafetyAssessmentQAFragment) parentFragment2 : null;
        k kVar = (k) this.f27335j;
        if (kVar != null) {
            kVar.f38500f.setBackButton(S6.a.pay_Close);
        }
        k kVar2 = (k) this.f27335j;
        if (kVar2 != null) {
            kVar2.f38499e.setLayoutManager(new LinearLayoutManager(requireContext(), 1, false));
        }
        T t = new T();
        t.a(new c(2));
        t.a(new c(3));
        k kVar3 = (k) this.f27335j;
        if (kVar3 != null) {
            kVar3.f38499e.setAdapter(t);
        }
        return 0;
    }

    @Override // com.transsnet.palmpay.core.base.BaseMvvmVBFragment
    public final ViewBinding t(LayoutInflater inflater, ViewGroup viewGroup) {
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        View viewInflate = inflater.inflate(g.core_safety_assessment_qa_question_result_fragment, viewGroup, false);
        int i7 = e.cancelBtn;
        PpButton ppButton = (PpButton) p059e1.a.m(i7, viewInflate);
        if (ppButton != null) {
            i7 = e.continueBtn;
            PpButton ppButton2 = (PpButton) p059e1.a.m(i7, viewInflate);
            if (ppButton2 != null) {
                i7 = e.ivIcon;
                ImageView imageView = (ImageView) p059e1.a.m(i7, viewInflate);
                if (imageView != null) {
                    i7 = e.resultRy;
                    RecyclerView recyclerView = (RecyclerView) p059e1.a.m(i7, viewInflate);
                    if (recyclerView != null) {
                        i7 = e.statusBarView;
                        if (((StatusBarView) p059e1.a.m(i7, viewInflate)) != null) {
                            i7 = e.titleBar;
                            PpTitleBar ppTitleBar = (PpTitleBar) p059e1.a.m(i7, viewInflate);
                            if (ppTitleBar != null) {
                                i7 = e.tvTag;
                                if (((IconicsTextView) p059e1.a.m(i7, viewInflate)) != null) {
                                    i7 = e.tvTips;
                                    TextView textView = (TextView) p059e1.a.m(i7, viewInflate);
                                    if (textView != null) {
                                        k kVar = new k((ConstraintLayout) viewInflate, ppButton, ppButton2, imageView, recyclerView, ppTitleBar, textView);
                                        Intrinsics.checkNotNullExpressionValue(kVar, "inflate(...)");
                                        return kVar;
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
}
