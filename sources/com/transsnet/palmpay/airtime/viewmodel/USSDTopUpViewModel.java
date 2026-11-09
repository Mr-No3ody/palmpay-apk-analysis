package com.transsnet.palmpay.airtime.viewmodel;

import android.app.Application;
import com.transsnet.palmpay.core.base.BaseViewModel;
import com.transsnet.palmpay.core.base.l;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/transsnet/palmpay/airtime/viewmodel/USSDTopUpViewModel;", "Lcom/transsnet/palmpay/core/base/BaseViewModel;", "Landroid/app/Application;", "application", "<init>", "(Landroid/app/Application;)V", "module_biller_impl_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nUSSDTopUpViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 USSDTopUpViewModel.kt\ncom/transsnet/palmpay/airtime/viewmodel/USSDTopUpViewModel\n+ 2 MvvmExt.kt\ncom/transsnet/palmpay/core/base/ext/MvvmExtKt\n*L\n1#1,29:1\n85#2,13:30\n*S KotlinDebug\n*F\n+ 1 USSDTopUpViewModel.kt\ncom/transsnet/palmpay/airtime/viewmodel/USSDTopUpViewModel\n*L\n16#1:30,13\n*E\n"})
public final class USSDTopUpViewModel extends BaseViewModel {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final l f26650e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public USSDTopUpViewModel(@NotNull Application application) {
        super(application);
        Intrinsics.checkNotNullParameter(application, "application");
        this.f26650e = new l();
    }
}
