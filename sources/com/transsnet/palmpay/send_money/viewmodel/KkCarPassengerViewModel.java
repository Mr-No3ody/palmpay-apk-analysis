package com.transsnet.palmpay.send_money.viewmodel;

import Kd.C0394m;
import Wf.AbstractC0780y;
import Wf.t0;
import android.app.Application;
import androidx.camera.core.impl.utils.executor.g;
import androidx.lifecycle.F;
import androidx.lifecycle.V;
import com.google.gson.Gson;
import com.transsnet.palmpay.core.base.BaseViewModel;
import com.transsnet.palmpay.core.base.l;
import com.transsnet.palmpay.core.bean.CommonBeanResult;
import com.transsnet.palmpay.core.bean.payment.PayByOrderResp;
import com.transsnet.palmpay.send_money.bean.kkcar.KkCarPayVerificationArgs;
import com.transsnet.palmpay.send_money.bean.resp.kkcar.KkCarQrCodeRsp;
import com.transsnet.palmpay.send_money.util.kkcar.KkCarPassengerAuthStore;
import com.transsnet.palmpay.send_money.util.kkcar.KkCarPayResultMapper;
import com.transsnet.palmpay.util.SPUtils;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import p355xf.o;
import p355xf.q;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001:\u0001\u0006B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0007"}, d2 = {"Lcom/transsnet/palmpay/send_money/viewmodel/KkCarPassengerViewModel;", "Lcom/transsnet/palmpay/core/base/BaseViewModel;", "Landroid/app/Application;", "application", "<init>", "(Landroid/app/Application;)V", "a", "module_money_transfer_impl_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nKkCarPassengerViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 KkCarPassengerViewModel.kt\ncom/transsnet/palmpay/send_money/viewmodel/KkCarPassengerViewModel\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,248:1\n1#2:249\n*E\n"})
public final class KkCarPassengerViewModel extends BaseViewModel {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public static final /* synthetic */ int f33971A = 0;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final F f33972e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final F f33973f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final F f33974g;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final F f33975i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final F f33976j;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final l f33977o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final F f33978p;
    public final l t;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public t0 f33979v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public String f33980w;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    static {
        new a(null);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public KkCarPassengerViewModel(@NotNull Application application) {
        super(application);
        Intrinsics.checkNotNullParameter(application, "application");
        this.f33972e = new F();
        this.f33973f = new F();
        this.f33974g = new F();
        this.f33975i = new F();
        this.f33976j = new F();
        this.f33977o = new l();
        this.f33978p = new F(Boolean.FALSE);
        this.t = new l();
        new l();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void d(KkCarPassengerViewModel kkCarPassengerViewModel, CommonBeanResult commonBeanResult) {
        kkCarPassengerViewModel.getClass();
        KkCarQrCodeRsp kkCarQrCodeRsp = (KkCarQrCodeRsp) commonBeanResult.data;
        if (kkCarQrCodeRsp == null) {
            return;
        }
        KkCarQrCodeRsp.QrCodeDTO qrCodeDTO = kkCarQrCodeRsp.getQrCodeDTO();
        kkCarPassengerViewModel.f33980w = qrCodeDTO != null ? qrCodeDTO.getQrCode() : null;
        KkCarPassengerAuthStore kkCarPassengerAuthStore = KkCarPassengerAuthStore.INSTANCE;
        KkCarQrCodeRsp.QrCodeDTO qrCodeDTO2 = kkCarQrCodeRsp.getQrCodeDTO();
        kkCarPassengerAuthStore.saveAuthStatus(qrCodeDTO2 != null ? qrCodeDTO2.getAuthStatus() : null);
        PayByOrderResp.DataBean payOrderResultDTO = kkCarQrCodeRsp.getPayOrderResultDTO();
        if (payOrderResultDTO != null) {
            payOrderResultDTO.needPaymentRetry = Boolean.FALSE;
        }
        kkCarPassengerViewModel.f33973f.i(kkCarQrCodeRsp);
        try {
            o oVar = q.f43977a;
            SPUtils.get().put("sm_kk_car_passenger_qr_code_json", new Gson().toJson(kkCarQrCodeRsp));
            Unit unit = Unit.f38893a;
        } catch (Throwable th) {
            o oVar2 = q.f43977a;
            g.f(th);
        }
        KkCarPayVerificationArgs payVerificationArgs = KkCarPayResultMapper.INSTANCE.toPayVerificationArgs(kkCarQrCodeRsp);
        if (payVerificationArgs == null) {
            KkCarQrCodeRsp.QrCodeOrderDTO qrCodeOrderDTO = kkCarQrCodeRsp.getQrCodeOrderDTO();
            if ((qrCodeOrderDTO != null ? qrCodeOrderDTO.getOrderStatus() : null) != null) {
                kkCarPassengerViewModel.f33974g.i(qrCodeOrderDTO);
                return;
            }
            return;
        }
        kkCarPassengerViewModel.f33975i.i(payVerificationArgs);
        t0 t0Var = kkCarPassengerViewModel.f33979v;
        if (t0Var != null) {
            t0Var.cancel((CancellationException) null);
        }
    }

    public static void e(KkCarPassengerViewModel kkCarPassengerViewModel) {
        t0 t0Var = kkCarPassengerViewModel.f33979v;
        if (t0Var == null || !t0Var.isActive()) {
            kkCarPassengerViewModel.f(false);
        }
    }

    @Override // com.transsnet.palmpay.core.base.BaseViewModel, androidx.lifecycle.a0
    public final void b() {
        t0 t0Var = this.f33979v;
        if (t0Var != null) {
            t0Var.cancel((CancellationException) null);
        }
    }

    public final void f(boolean z3) {
        t0 t0Var = this.f33979v;
        if (t0Var != null) {
            t0Var.cancel((CancellationException) null);
        }
        if (z3) {
            this.f33978p.i(Boolean.TRUE);
        }
        this.f33979v = AbstractC0780y.m(V.h(this), null, null, new C0394m(this, null), 3);
    }
}
