package com.transsnet.palmpay.managemoney.ui.viewmodel;

import Qc.o0;
import Qc.q0;
import Wf.AbstractC0780y;
import android.app.Application;
import androidx.lifecycle.V;
import com.transsnet.palmpay.core.base.BaseViewModel;
import com.transsnet.palmpay.core.base.l;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/transsnet/palmpay/managemoney/ui/viewmodel/UserFixedSavingViewModel;", "Lcom/transsnet/palmpay/core/base/BaseViewModel;", "Landroid/app/Application;", "application", "<init>", "(Landroid/app/Application;)V", "module_wealth_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class UserFixedSavingViewModel extends BaseViewModel {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f32795e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final l f32796f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final l f32797g;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public List f32798i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final l f32799j;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final l f32800o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UserFixedSavingViewModel(@NotNull Application application) {
        super(application);
        Intrinsics.checkNotNullParameter(application, "application");
        this.f32795e = 1;
        this.f32796f = new l();
        this.f32797g = new l();
        this.f32799j = new l();
        this.f32800o = new l();
    }

    public final void d(int i7, boolean z3) {
        this.f32795e = z3 ? 1 : this.f32795e;
        AbstractC0780y.m(V.h(this), null, null, new o0(this, i7, z3, null), 3);
    }

    public final void e(int i7, boolean z3) {
        this.f32795e = z3 ? 1 : this.f32795e;
        AbstractC0780y.m(V.h(this), null, null, new q0(this, i7, z3, null), 3);
    }
}
