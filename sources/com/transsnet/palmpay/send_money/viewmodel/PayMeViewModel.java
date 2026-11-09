package com.transsnet.palmpay.send_money.viewmodel;

import C0.G;
import Kd.r;
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
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/transsnet/palmpay/send_money/viewmodel/PayMeViewModel;", "Lcom/transsnet/palmpay/core/base/BaseViewModel;", "Landroid/app/Application;", "application", "<init>", "(Landroid/app/Application;)V", "module_money_transfer_impl_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nPayMeViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PayMeViewModel.kt\ncom/transsnet/palmpay/send_money/viewmodel/PayMeViewModel\n+ 2 MvvmExt.kt\ncom/transsnet/palmpay/core/base/ext/MvvmExtKt\n*L\n1#1,65:1\n85#2,13:66\n*S KotlinDebug\n*F\n+ 1 PayMeViewModel.kt\ncom/transsnet/palmpay/send_money/viewmodel/PayMeViewModel\n*L\n23#1:66,13\n*E\n"})
public final class PayMeViewModel extends BaseViewModel {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final l f33981e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final l f33982f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final l f33983g;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final l f33984i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final l f33985j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PayMeViewModel(@NotNull Application application) {
        super(application);
        Intrinsics.checkNotNullParameter(application, "application");
        this.f33981e = new l();
        this.f33982f = new l();
        this.f33983g = new l();
        this.f33984i = new l();
        this.f33985j = new l();
    }

    public final void d() {
        AbstractC0780y.m(V.h(this), null, null, new r(this.f33981e, G.p("Pref_", a.d().i(), "_queryPosterAccount_", BaseApplication.getCountryLocale()), null), 3);
    }
}
