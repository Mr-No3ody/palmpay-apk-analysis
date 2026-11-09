package com.transsnet.palmpay.core.base;

import com.transsnet.palmpay.core.base.BaseViewModel;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b&\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\u00020\u0003B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/transsnet/palmpay/core/base/BaseMvvmFragment;", "Lcom/transsnet/palmpay/core/base/BaseViewModel;", "VM", "Lcom/transsnet/palmpay/core/base/BaseFragment;", "<init>", "()V", "lib_core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public abstract class BaseMvvmFragment<VM extends BaseViewModel> extends BaseFragment {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public BaseViewModel f27333i;

    @Override // com.transsnet.palmpay.core.base.BaseFragment
    public int k() {
        return 0;
    }

    @Override // com.transsnet.palmpay.core.base.BaseFragment
    public void n() {
    }

    @Override // com.transsnet.palmpay.core.base.BaseFragment
    public int o() {
        try {
            Class clsA = p002a.a.A(this);
            if (clsA != null) {
                this.f27333i = (BaseViewModel) new androidx.camera.video.internal.c(this).h(clsA);
            }
        } catch (Exception unused) {
        }
        BaseViewModel baseViewModel = this.f27333i;
        if (baseViewModel == null) {
            return 0;
        }
        getLifecycle().a(baseViewModel);
        return 0;
    }
}
