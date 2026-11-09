package com.transsnet.palmpay.core.ui.fragment;

import N8.q0;
import Ua.C0617b;
import android.view.View;
import android.widget.TextView;
import androidx.fragment.app.C1161a;
import androidx.fragment.app.E;
import androidx.fragment.app.Z;
import com.alibaba.android.arouter.facade.annotation.Route;
import com.transsnet.palmpay.core.ui.activity.AddBankCardAccountActivity;
import com.transsnet.palmpay.core.ui.fragment.bankaccount.AddBankAccountBaseFragment;
import com.transsnet.palmpay.core.ui.fragment.bankaccount.AddBankAccountSelectBankFragment;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import p010a9.m;
import p355xf.C2131j;
import p355xf.t;

/* JADX INFO: loaded from: classes3.dex */
@Route(path = "/coreImpl/add_account_fragment")
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/transsnet/palmpay/core/ui/fragment/AddBankAccountFragment;", "Lcom/transsnet/palmpay/core/ui/fragment/bankaccount/AddBankAccountBaseFragment;", "Lcom/transsnet/palmpay/core/ui/activity/AddBankCardAccountActivity$BackPressedListener;", "<init>", "()V", "module_common_impl_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nAddBankAccountFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AddBankAccountFragment.kt\ncom/transsnet/palmpay/core/ui/fragment/AddBankAccountFragment\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,115:1\n1#2:116\n774#3:117\n865#3,2:118\n*S KotlinDebug\n*F\n+ 1 AddBankAccountFragment.kt\ncom/transsnet/palmpay/core/ui/fragment/AddBankAccountFragment\n*L\n45#1:117\n45#1:118,2\n*E\n"})
public final class AddBankAccountFragment extends AddBankAccountBaseFragment implements AddBankCardAccountActivity.BackPressedListener {

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public static final /* synthetic */ int f27823C = 0;

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public final t f27824A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public final t f27825B;

    public AddBankAccountFragment() {
        final int i7 = 0;
        this.f27824A = C2131j.b(new Function0(this) { // from class: com.transsnet.palmpay.core.ui.fragment.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ AddBankAccountFragment f27876b;

            {
                this.f27876b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                AddBankAccountFragment addBankAccountFragment = this.f27876b;
                switch (i7) {
                    case 0:
                        int i10 = AddBankAccountFragment.f27823C;
                        View view = addBankAccountFragment.f27318b;
                        if (view != null) {
                            return (TextView) view.findViewById(L9.a.tvTopTips);
                        }
                        return null;
                    default:
                        int i11 = AddBankAccountFragment.f27823C;
                        E eRequireActivity = addBankAccountFragment.requireActivity();
                        Intrinsics.checkNotNullExpressionValue(eRequireActivity, "requireActivity(...)");
                        return (C0617b) new androidx.camera.video.internal.c(eRequireActivity).h(C0617b.class);
                }
            }
        });
        final int i10 = 1;
        this.f27825B = C2131j.b(new Function0(this) { // from class: com.transsnet.palmpay.core.ui.fragment.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ AddBankAccountFragment f27876b;

            {
                this.f27876b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                AddBankAccountFragment addBankAccountFragment = this.f27876b;
                switch (i10) {
                    case 0:
                        int i11 = AddBankAccountFragment.f27823C;
                        View view = addBankAccountFragment.f27318b;
                        if (view != null) {
                            return (TextView) view.findViewById(L9.a.tvTopTips);
                        }
                        return null;
                    default:
                        int i12 = AddBankAccountFragment.f27823C;
                        E eRequireActivity = addBankAccountFragment.requireActivity();
                        Intrinsics.checkNotNullExpressionValue(eRequireActivity, "requireActivity(...)");
                        return (C0617b) new androidx.camera.video.internal.c(eRequireActivity).h(C0617b.class);
                }
            }
        });
    }

    @Override // com.transsnet.palmpay.core.ui.fragment.bankaccount.AddBankAccountBaseFragment, com.transsnet.palmpay.core.base.BaseFragment
    public final int h() {
        return L9.b.core_add_bank_account_fragment;
    }

    @Override // com.transsnet.palmpay.core.ui.fragment.bankaccount.AddBankAccountBaseFragment, com.transsnet.palmpay.core.base.BaseFragment
    public final int k() {
        ((C0617b) this.f27825B.getValue()).f9382d.e(getViewLifecycleOwner(), new T8.f(new m(this, 11)));
        return 0;
    }

    @Override // com.transsnet.palmpay.core.ui.fragment.bankaccount.AddBankAccountBaseFragment, com.transsnet.palmpay.core.base.BaseFragment
    public final int o() {
        Z childFragmentManager = getChildFragmentManager();
        C1161a c1161aE = q0.e(childFragmentManager, childFragmentManager);
        int i7 = L9.a.fragmentContainer;
        AddBankAccountSelectBankFragment addBankAccountSelectBankFragment = new AddBankAccountSelectBankFragment();
        addBankAccountSelectBankFragment.setArguments(getArguments());
        Unit unit = Unit.f38893a;
        c1161aE.e(i7, addBankAccountSelectBankFragment, null);
        c1161aE.c(null);
        c1161aE.h(true);
        super.o();
        return 0;
    }

    @Override // com.transsnet.palmpay.core.ui.activity.AddBankCardAccountActivity.BackPressedListener
    public final void onBackPressed() {
        if (!(getChildFragmentManager().D(L9.a.fragmentContainer) instanceof AddBankAccountSelectBankFragment)) {
            getChildFragmentManager().S();
            return;
        }
        E activity = getActivity();
        if (activity != null) {
            activity.finish();
        }
    }
}
