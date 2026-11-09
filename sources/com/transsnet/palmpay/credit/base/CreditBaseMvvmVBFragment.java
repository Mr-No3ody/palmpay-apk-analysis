package com.transsnet.palmpay.credit.base;

import android.content.Context;
import androidx.viewbinding.ViewBinding;
import com.transsnet.palmpay.core.base.BaseMvvmVBFragment;
import com.transsnet.palmpay.core.base.BaseViewModel;
import com.transsnet.palmpay.custom_view.dialog.LoadingDialog;
import com.transsnet.palmpay.custom_view.dialog.n;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import p116hb.e;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b&\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u0001*\b\b\u0001\u0010\u0004*\u00020\u00032\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0005B\u0007¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/transsnet/palmpay/credit/base/CreditBaseMvvmVBFragment;", "Lcom/transsnet/palmpay/core/base/BaseViewModel;", "VM", "Landroidx/viewbinding/ViewBinding;", "B", "Lcom/transsnet/palmpay/core/base/BaseMvvmVBFragment;", "<init>", "()V", "module_flexi_export_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public abstract class CreditBaseMvvmVBFragment<VM extends BaseViewModel, B extends ViewBinding> extends BaseMvvmVBFragment<VM, B> {
    @Override // com.transsnet.palmpay.core.base.BaseFragment
    public final LoadingDialog i() {
        Context context = requireContext();
        Intrinsics.checkNotNullExpressionValue(context, "requireContext(...)");
        Intrinsics.checkNotNullParameter(context, "context");
        n nVar = new n(context);
        nVar.f31290d = Integer.valueOf(e.cs_cash_loading);
        return nVar.a();
    }
}
