package com.transsnet.palmpay.core.ui.widget;

import com.transsnet.palmpay.core.bean.KeyValue;
import com.transsnet.palmpay.core.ui.pop.ChooseItemPopWindow$OnPopItemClickListener;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class d implements ChooseItemPopWindow$OnPopItemClickListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ TransFilterLayout f28186a;

    public d(TransFilterLayout transFilterLayout) {
        this.f28186a = transFilterLayout;
    }

    @Override // com.transsnet.palmpay.core.ui.pop.ChooseItemPopWindow$OnPopItemClickListener
    public final void onItemSelect(KeyValue keyValue) {
        Intrinsics.checkNotNullParameter(keyValue, "keyValue");
        int value = keyValue.getValue();
        TransFilterLayout transFilterLayout = this.f28186a;
        transFilterLayout.setIOType(value);
        TransFilterLayout.OnSelectListener onSelectListener = transFilterLayout.f28163B;
        if (onSelectListener != null) {
            onSelectListener.onSelectIOType(transFilterLayout.getIOType());
        }
        boolean zEquals = "All".equals(keyValue.getKey());
        transFilterLayout.getTvFilterIO().setText(zEquals ? "All" : keyValue.getKey());
        transFilterLayout.h(transFilterLayout.getTvFilterIO(), S6.a.pay_Arrowdown, zEquals);
    }
}
