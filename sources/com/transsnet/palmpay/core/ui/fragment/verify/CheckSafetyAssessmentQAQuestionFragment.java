package com.transsnet.palmpay.core.ui.fragment.verify;

import Ab.C;
import C9.C0138e;
import Ja.B;
import Ja.y;
import Ma.v;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.widget.NestedScrollView;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.b0;
import androidx.viewbinding.ViewBinding;
import com.mikepenz.iconics.view.IconicsTextView;
import com.palmpay.lib.ui.button.PpButton;
import com.palmpay.lib.ui.titlebar.PpTitleBar;
import com.transsnet.palmpay.core.base.BaseMvvmVBFragment;
import com.transsnet.palmpay.core.base.BaseViewModel;
import com.transsnet.palmpay.core.bean.verify.VerifyQuestionNodeBean;
import com.transsnet.palmpay.custom_view.StatusBarView;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.G;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import p002a.a;
import p025ba.e;
import p025ba.g;
import p142ja.j;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/transsnet/palmpay/core/ui/fragment/verify/CheckSafetyAssessmentQAQuestionFragment;", "Lcom/transsnet/palmpay/core/base/BaseMvvmVBFragment;", "Lcom/transsnet/palmpay/core/base/BaseViewModel;", "Lja/j;", "<init>", "()V", "lib_core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nCheckSafetyAssessmentQAQuestionFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CheckSafetyAssessmentQAQuestionFragment.kt\ncom/transsnet/palmpay/core/ui/fragment/verify/CheckSafetyAssessmentQAQuestionFragment\n+ 2 FragmentViewModelLazy.kt\nandroidx/fragment/app/FragmentViewModelLazyKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,264:1\n172#2,9:265\n1869#3,2:274\n1869#3,2:277\n2746#3,3:279\n1#4:276\n*S KotlinDebug\n*F\n+ 1 CheckSafetyAssessmentQAQuestionFragment.kt\ncom/transsnet/palmpay/core/ui/fragment/verify/CheckSafetyAssessmentQAQuestionFragment\n*L\n29#1:265,9\n121#1:274,2\n182#1:277,2\n190#1:279,3\n*E\n"})
public final class CheckSafetyAssessmentQAQuestionFragment extends BaseMvvmVBFragment<BaseViewModel, j> {

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public CheckSafetyAssessmentQAFragment f28021p;
    public VerifyQuestionNodeBean t;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final b0 f28020o = a.h(this, G.a(v.class), new B(this, 0), new B(this, 1), new B(this, 2));

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final ArrayList f28022v = new ArrayList();

    @Override // com.transsnet.palmpay.core.base.BaseMvvmFragment, com.transsnet.palmpay.core.base.BaseFragment
    public final int k() {
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
        this.f28021p = parentFragment2 instanceof CheckSafetyAssessmentQAFragment ? (CheckSafetyAssessmentQAFragment) parentFragment2 : null;
        ((v) this.f28020o.getValue()).f5926d.e(getViewLifecycleOwner(), new C0138e(new C(this, 20), 0));
        j jVar = (j) this.f27335j;
        if (jVar != null) {
            jVar.f38491c.setEnabled(false);
        }
        j jVar2 = (j) this.f27335j;
        if (jVar2 != null) {
            jVar2.f38491c.setOnClickListener(new y(this, 0));
        }
        j jVar3 = (j) this.f27335j;
        if (jVar3 != null) {
            jVar3.f38492d.setBackButton(S6.a.pay_Close);
        }
        j jVar4 = (j) this.f27335j;
        if (jVar4 != null) {
            jVar4.f38492d.setBackButtonClickListener(new y(this, 1));
        }
        return 0;
    }

    @Override // com.transsnet.palmpay.core.base.BaseMvvmVBFragment
    public final ViewBinding t(LayoutInflater inflater, ViewGroup viewGroup) {
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        View viewInflate = inflater.inflate(g.core_safety_assessment_qa_question_fragment, viewGroup, false);
        int i7 = e.llQuestionContainer;
        LinearLayout linearLayout = (LinearLayout) p059e1.a.m(i7, viewInflate);
        if (linearLayout != null) {
            i7 = e.nextBtn;
            PpButton ppButton = (PpButton) p059e1.a.m(i7, viewInflate);
            if (ppButton != null) {
                i7 = e.slvQuestionContainer;
                if (((NestedScrollView) p059e1.a.m(i7, viewInflate)) != null) {
                    i7 = e.statusBarView;
                    if (((StatusBarView) p059e1.a.m(i7, viewInflate)) != null) {
                        i7 = e.titleBar;
                        PpTitleBar ppTitleBar = (PpTitleBar) p059e1.a.m(i7, viewInflate);
                        if (ppTitleBar != null) {
                            i7 = e.tvQuestion;
                            TextView textView = (TextView) p059e1.a.m(i7, viewInflate);
                            if (textView != null) {
                                i7 = e.tvQuestionTips;
                                TextView textView2 = (TextView) p059e1.a.m(i7, viewInflate);
                                if (textView2 != null) {
                                    i7 = e.tvTag;
                                    if (((IconicsTextView) p059e1.a.m(i7, viewInflate)) != null) {
                                        j jVar = new j((ConstraintLayout) viewInflate, linearLayout, ppButton, ppTitleBar, textView, textView2);
                                        Intrinsics.checkNotNullExpressionValue(jVar, "inflate(...)");
                                        return jVar;
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
