package com.transsnet.palmpay.managemoney.ui.fragment;

import com.transsnet.palmpay.managemoney.ui.activity.UserFixedSavingActivity;
import com.transsnet.palmpay.managemoney.ui.adapter.NewUserFixedProductListAdapter$OnPayoutOptionsClickListener;
import com.transsnet.palmpay.managemoney.ui.dialog.SelectPayoutOptionsDialogFragment;
import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class P implements NewUserFixedProductListAdapter$OnPayoutOptionsClickListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ NewUserFixedSavingFragment f32541a;

    public P(NewUserFixedSavingFragment newUserFixedSavingFragment) {
        this.f32541a = newUserFixedSavingFragment;
    }

    @Override // com.transsnet.palmpay.managemoney.ui.adapter.NewUserFixedProductListAdapter$OnPayoutOptionsClickListener
    public final void onPayoutOptionsClick() {
        NewUserFixedSavingFragment newUserFixedSavingFragment = this.f32541a;
        if (newUserFixedSavingFragment.getActivity() != null) {
            androidx.fragment.app.E activity = newUserFixedSavingFragment.getActivity();
            Intrinsics.f(activity, "null cannot be cast to non-null type com.transsnet.palmpay.managemoney.ui.activity.UserFixedSavingActivity");
            ArrayList arrayList = ((UserFixedSavingActivity) activity).f32211d;
            if (arrayList == null || arrayList.isEmpty()) {
                return;
            }
            SelectPayoutOptionsDialogFragment.a aVar = SelectPayoutOptionsDialogFragment.f32319X;
            androidx.fragment.app.E activity2 = newUserFixedSavingFragment.getActivity();
            Intrinsics.f(activity2, "null cannot be cast to non-null type com.transsnet.palmpay.managemoney.ui.activity.UserFixedSavingActivity");
            SelectPayoutOptionsDialogFragment selectPayoutOptionsDialogFragmentNewInstance = aVar.newInstance(((UserFixedSavingActivity) activity2).f32211d);
            androidx.fragment.app.Z childFragmentManager = newUserFixedSavingFragment.getChildFragmentManager();
            Intrinsics.checkNotNullExpressionValue(childFragmentManager, "getChildFragmentManager(...)");
            selectPayoutOptionsDialogFragmentNewInstance.show(childFragmentManager, "showSelectPayoutOptionsDialog");
        }
    }
}
