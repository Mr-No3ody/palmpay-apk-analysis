package com.transsnet.palmpay.core.ui.widget;

import com.transsnet.palmpay.core.bean.KeyValue;
import com.transsnet.palmpay.core.ui.pop.ChooseItemPopWindow$OnPopItemClickListener;
import kotlin.jvm.internal.Intrinsics;
import p025ba.k;

/* JADX INFO: loaded from: classes3.dex */
public final class b implements ChooseItemPopWindow$OnPopItemClickListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ TransFilterLayout f28184a;

    public b(TransFilterLayout transFilterLayout) {
        this.f28184a = transFilterLayout;
    }

    @Override // com.transsnet.palmpay.core.ui.pop.ChooseItemPopWindow$OnPopItemClickListener
    public final void onItemSelect(KeyValue keyValue) {
        Intrinsics.checkNotNullParameter(keyValue, "keyValue");
        int value = keyValue.getValue();
        TransFilterLayout transFilterLayout = this.f28184a;
        transFilterLayout.setCashBoxBillType(value);
        TransFilterLayout.OnSelectListener onSelectListener = transFilterLayout.f28163B;
        if (onSelectListener != null) {
            onSelectListener.onSelectCashBoxBillType(transFilterLayout.getCashBoxBillType());
        }
        boolean zC = Intrinsics.c(transFilterLayout.getResources().getString(k.core_all), keyValue.getKey());
        transFilterLayout.getTvFilterActive().setText(zC ? "Filter" : keyValue.getKey());
        transFilterLayout.h(transFilterLayout.getTvFilterActive(), zC ? S6.a.pay_Filter : S6.a.pay_Arrowdown, zC);
    }
}
