package com.transsnet.palmpay.viewmodule;

import C0.G;
import Pe.C0548u;
import Wf.AbstractC0780y;
import android.app.Application;
import androidx.lifecycle.V;
import com.transsnet.palmpay.core.base.BaseApplication;
import com.transsnet.palmpay.core.base.BaseViewModel;
import com.transsnet.palmpay.core.base.l;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import p367ya.a;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/transsnet/palmpay/viewmodule/HomeSavingsViewModel;", "Lcom/transsnet/palmpay/core/base/BaseViewModel;", "Landroid/app/Application;", "application", "<init>", "(Landroid/app/Application;)V", "module_main_impl_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nHomeSavingsViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 HomeSavingsViewModel.kt\ncom/transsnet/palmpay/viewmodule/HomeSavingsViewModel\n+ 2 MvvmExt.kt\ncom/transsnet/palmpay/core/base/ext/MvvmExtKt\n*L\n1#1,213:1\n85#2,13:214\n*S KotlinDebug\n*F\n+ 1 HomeSavingsViewModel.kt\ncom/transsnet/palmpay/viewmodule/HomeSavingsViewModel\n*L\n80#1:214,13\n*E\n"})
public final class HomeSavingsViewModel extends BaseViewModel {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public final l f35364A;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final l f35365e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final l f35366f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final l f35367g;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final l f35368i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final l f35369j;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final l f35370o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final l f35371p;
    public final l t;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final l f35372v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final l f35373w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HomeSavingsViewModel(@NotNull Application application) {
        super(application);
        Intrinsics.checkNotNullParameter(application, "application");
        this.f35365e = new l();
        this.f35366f = new l();
        this.f35367g = new l();
        this.f35368i = new l();
        this.f35369j = new l();
        this.f35370o = new l();
        this.f35371p = new l();
        new l();
        this.t = new l();
        this.f35372v = new l();
        this.f35373w = new l();
        this.f35364A = new l();
    }

    public final void d() {
        AbstractC0780y.m(V.h(this), null, null, new C0548u(this.f35365e, G.p("Pref_", a.d().i(), "_FinanceSavingsV1Home_", BaseApplication.getCountryLocale()), null), 3);
    }
}
