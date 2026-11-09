package com.transsnet.palmpay.core.ui.widget;

import com.transsnet.palmpay.core.bean.bill.BillType;
import com.transsnet.palmpay.core.ui.pop.ChooseMultiItemPopWindow$OnPopItemClickListener;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class e implements ChooseMultiItemPopWindow$OnPopItemClickListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ TransFilterLayout f28187a;

    public e(TransFilterLayout transFilterLayout) {
        this.f28187a = transFilterLayout;
    }

    @Override // com.transsnet.palmpay.core.ui.pop.ChooseMultiItemPopWindow$OnPopItemClickListener
    public final void onItemSelect(BillType keyValue) {
        Intrinsics.checkNotNullParameter(keyValue, "keyValue");
        String type = keyValue.type;
        Intrinsics.checkNotNullExpressionValue(type, "type");
        TransFilterLayout transFilterLayout = this.f28187a;
        transFilterLayout.setBillType(type);
        TransFilterLayout.OnSelectListener onSelectListener = transFilterLayout.f28163B;
        if (onSelectListener != null) {
            onSelectListener.onSelectBillType(transFilterLayout.getBillType());
        }
        boolean zEquals = "All".equals(keyValue.typeName);
        transFilterLayout.getTvFilterActive().setText(zEquals ? "Filter" : keyValue.typeName);
        transFilterLayout.h(transFilterLayout.getTvFilterActive(), S6.a.pay_Filter, zEquals);
    }
}
