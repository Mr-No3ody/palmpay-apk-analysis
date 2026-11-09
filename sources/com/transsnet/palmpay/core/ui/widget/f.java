package com.transsnet.palmpay.core.ui.widget;

import com.transsnet.palmpay.core.bean.KeyValue;
import com.transsnet.palmpay.core.ui.pop.ChooseItemPopWindow$OnPopItemClickListener;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class f implements ChooseItemPopWindow$OnPopItemClickListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ TransFilterLayout f28188a;

    public f(TransFilterLayout transFilterLayout) {
        this.f28188a = transFilterLayout;
    }

    @Override // com.transsnet.palmpay.core.ui.pop.ChooseItemPopWindow$OnPopItemClickListener
    public final void onItemSelect(KeyValue keyValue) {
        Intrinsics.checkNotNullParameter(keyValue, "keyValue");
        int value = keyValue.getValue();
        TransFilterLayout transFilterLayout = this.f28188a;
        transFilterLayout.setStatusType(value);
        TransFilterLayout.OnSelectListener onSelectListener = transFilterLayout.f28163B;
        if (onSelectListener != null) {
            onSelectListener.onSelectStatus(transFilterLayout.getStatusType());
        }
        boolean zEquals = "All".equals(keyValue.getKey());
        transFilterLayout.getTvFilterAll().setText(zEquals ? "All Status" : keyValue.getKey());
        transFilterLayout.h(transFilterLayout.getTvFilterAll(), S6.a.pay_Arrowdown, zEquals);
    }
}
