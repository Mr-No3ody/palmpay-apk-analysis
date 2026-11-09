package com.transsnet.palmpay.credit.export;

import android.content.Context;
import com.alibaba.android.arouter.facade.annotation.Route;
import com.transsnet.palmpay.core.base.BaseApplication;
import com.transsnet.palmpay.core.provider.IOkCardModule;
import com.transsnet.palmpay.credit.service.OkCardCollectDeviceInfoService;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
@Route(path = "/credit_score/provier")
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/transsnet/palmpay/credit/export/OkCardModuleImpl;", "Lcom/transsnet/palmpay/core/provider/IOkCardModule;", "<init>", "()V", "module_flexi_impl_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class OkCardModuleImpl implements IOkCardModule {
    @Override // com.transsnet.palmpay.core.provider.IOkCardModule
    public final void collectDeviceInfo() {
        OkCardCollectDeviceInfoService.a aVar = OkCardCollectDeviceInfoService.f28650i;
        Context context = BaseApplication.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        aVar.enqueueWork(context, false, false, true, true, false, null);
    }

    @Override // com.alibaba.android.arouter.facade.template.IProvider
    public final void init(Context context) {
    }
}
