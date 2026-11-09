package com.transsnet.palmpay.send_money.viewmodel;

import Kd.V1;
import Kd.W1;
import Kd.d2;
import N8.q0;
import Wf.AbstractC0780y;
import Wf.t0;
import android.app.Application;
import androidx.lifecycle.V;
import com.transsnet.palmpay.core.base.BaseApplication;
import com.transsnet.palmpay.core.base.BaseViewModel;
import com.transsnet.palmpay.core.base.l;
import com.transsnet.palmpay.send_money.bean.RecipientBeanV2;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import p140j8.f;
import p367ya.a;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/transsnet/palmpay/send_money/viewmodel/TransferToPalmPayHomeViewModel;", "Lcom/transsnet/palmpay/core/base/BaseViewModel;", "Landroid/app/Application;", "application", "<init>", "(Landroid/app/Application;)V", "module_money_transfer_impl_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nTransferToPalmPayHomeViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TransferToPalmPayHomeViewModel.kt\ncom/transsnet/palmpay/send_money/viewmodel/TransferToPalmPayHomeViewModel\n+ 2 MvvmExt.kt\ncom/transsnet/palmpay/core/base/ext/MvvmExtKt\n*L\n1#1,186:1\n85#2,13:187\n134#2,13:200\n134#2,13:213\n134#2,13:226\n*S KotlinDebug\n*F\n+ 1 TransferToPalmPayHomeViewModel.kt\ncom/transsnet/palmpay/send_money/viewmodel/TransferToPalmPayHomeViewModel\n*L\n42#1:187,13\n58#1:200,13\n74#1:213,13\n88#1:226,13\n*E\n"})
public final class TransferToPalmPayHomeViewModel extends BaseViewModel {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final l f34078e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final l f34079f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final l f34080g;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final l f34081i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final l f34082j;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final l f34083o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final l f34084p;
    public List t;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final l f34085v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public t0 f34086w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TransferToPalmPayHomeViewModel(@NotNull Application application) {
        super(application);
        Intrinsics.checkNotNullParameter(application, "application");
        this.f34078e = new l();
        this.f34079f = new l();
        this.f34080g = new l();
        new l();
        this.f34081i = new l();
        new l();
        this.f34082j = new l();
        this.f34083o = new l();
        this.f34084p = new l();
        this.f34085v = new l();
    }

    public final void d(Integer num, RecipientBeanV2 recipientBeanV2) {
        V1 v3 = new V1(num, recipientBeanV2, null);
        l lVar = this.f34084p;
        lVar.f27356m = recipientBeanV2;
        Unit unit = Unit.f38893a;
        f.v(this, v3, lVar, 0L);
    }

    public final void e() {
        t0 t0Var = this.f34086w;
        if (t0Var == null || !t0Var.isActive()) {
            this.f34086w = f.s(this, new W1(1, null), this.f34085v, (28 & 4) != 0 ? 0L : 300L, (28 & 8) != 0, (28 & 16) == 0);
        }
    }

    public final void f(Integer num) {
        AbstractC0780y.m(V.h(this), null, null, new d2(this.f34079f, q0.y(a.d().i(), "_queryHomeRecently_", BaseApplication.getCountryLocale()), null, num), 3);
    }
}
