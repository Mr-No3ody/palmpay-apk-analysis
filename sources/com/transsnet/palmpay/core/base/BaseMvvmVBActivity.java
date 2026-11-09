package com.transsnet.palmpay.core.base;

import android.os.Bundle;
import androidx.viewbinding.ViewBinding;
import com.transsnet.palmpay.core.base.BaseViewModel;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b&\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u0001*\b\b\u0001\u0010\u0004*\u00020\u00032\b\u0012\u0004\u0012\u00028\u00000\u0005B\u0007¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/transsnet/palmpay/core/base/BaseMvvmVBActivity;", "Lcom/transsnet/palmpay/core/base/BaseViewModel;", "VM", "Landroidx/viewbinding/ViewBinding;", "B", "Lcom/transsnet/palmpay/core/base/BaseMvvmActivity;", "<init>", "()V", "lib_core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public abstract class BaseMvvmVBActivity<VM extends BaseViewModel, B extends ViewBinding> extends BaseMvvmActivity<VM> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public ViewBinding f27334c;

    @Override // com.transsnet.palmpay.core.base.BaseActivity
    public void createViewBinding(Bundle bundle) {
        ViewBinding viewBindingM = m();
        this.f27334c = viewBindingM;
        setContentView(viewBindingM.getRoot());
    }

    @Override // com.transsnet.palmpay.core.base.BaseActivity
    public final int getLayoutId() {
        return 0;
    }

    public abstract ViewBinding m();

    @Override // com.transsnet.palmpay.core.base.BaseActivity, androidx.appcompat.app.AbstractActivityC0837o, androidx.fragment.app.E, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        this.f27334c = null;
    }
}
