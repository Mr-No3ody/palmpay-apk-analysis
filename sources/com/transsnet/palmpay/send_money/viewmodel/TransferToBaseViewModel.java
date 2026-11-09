package com.transsnet.palmpay.send_money.viewmodel;

import Kd.A1;
import Kd.B1;
import Kd.C0431y1;
import Kd.C0434z1;
import Pa.r0;
import android.app.Application;
import com.transsnet.palmpay.core.base.BaseViewModel;
import com.transsnet.palmpay.core.base.l;
import com.transsnet.palmpay.send_money.bean.ConfigReq;
import com.transsnet.palmpay.send_money.bean.VerifyPaymentInfoReq;
import com.transsnet.palmpay.send_money.bean.req.MemberDetailReq;
import com.transsnet.palmpay.send_money.bean.req.TransferCreateOrderReq;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import p140j8.f;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0016\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/transsnet/palmpay/send_money/viewmodel/TransferToBaseViewModel;", "Lcom/transsnet/palmpay/core/base/BaseViewModel;", "Landroid/app/Application;", "application", "<init>", "(Landroid/app/Application;)V", "module_money_transfer_impl_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public class TransferToBaseViewModel extends BaseViewModel {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final l f34062e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final l f34063f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final l f34064g;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final l f34065i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TransferToBaseViewModel(@NotNull Application application) {
        super(application);
        Intrinsics.checkNotNullParameter(application, "application");
        this.f34062e = new l();
        this.f34063f = new l();
        this.f34064g = new l();
        this.f34065i = new l();
    }

    public final void d(TransferCreateOrderReq req) {
        Intrinsics.checkNotNullParameter(req, "req");
        if (r0.U0()) {
            return;
        }
        C0431y1 c0431y1 = new C0431y1(req, null);
        l lVar = this.f34064g;
        lVar.f27356m = req;
        Unit unit = Unit.f38893a;
        f.v(this, c0431y1, lVar, 0L);
    }

    public final void e(ConfigReq req) {
        Intrinsics.checkNotNullParameter(req, "req");
        f.s(this, new C0434z1(req, null), this.f34062e, (28 & 4) != 0 ? 0L : 300L, (28 & 8) != 0, (28 & 16) == 0);
    }

    public final void f(MemberDetailReq memberDetailReq) {
        f.s(this, new A1(memberDetailReq, null), this.f34065i, (28 & 4) != 0 ? 0L : 300L, (28 & 8) != 0, (28 & 16) == 0);
    }

    public final void g(VerifyPaymentInfoReq verifyPaymentInfoReq) {
        f.s(this, new B1(verifyPaymentInfoReq, null), this.f34063f, (28 & 4) != 0 ? 0L : 300L, (28 & 8) != 0, (28 & 16) == 0);
    }
}
