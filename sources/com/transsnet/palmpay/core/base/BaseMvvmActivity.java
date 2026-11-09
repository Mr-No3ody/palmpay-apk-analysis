package com.transsnet.palmpay.core.base;

import com.transsnet.palmpay.core.base.BaseViewModel;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import p355xf.C2131j;
import p355xf.t;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b&\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\u00020\u0003B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/transsnet/palmpay/core/base/BaseMvvmActivity;", "Lcom/transsnet/palmpay/core/base/BaseViewModel;", "VM", "Lcom/transsnet/palmpay/core/base/BaseActivity;", "<init>", "()V", "lib_core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public abstract class BaseMvvmActivity<VM extends BaseViewModel> extends BaseActivity {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int f27329b = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final t f27330a = C2131j.b(new X6.c(this, 14));

    @Override // com.transsnet.palmpay.core.base.BaseActivity
    public void initData() {
    }

    public final BaseViewModel l() {
        Object value = this.f27330a.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (BaseViewModel) value;
    }

    @Override // com.transsnet.palmpay.core.base.BaseActivity
    public void setupView() {
        getLifecycle().a(l());
    }
}
