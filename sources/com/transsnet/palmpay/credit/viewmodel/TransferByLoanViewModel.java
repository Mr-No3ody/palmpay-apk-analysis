package com.transsnet.palmpay.credit.viewmodel;

import Ef.a;
import Ff.c;
import Jb.I;
import Jb.O;
import Jb.P;
import Wf.AbstractC0780y;
import Wf.B;
import android.app.Application;
import androidx.camera.core.impl.utils.executor.g;
import androidx.lifecycle.F;
import androidx.lifecycle.V;
import com.transsnet.palmpay.core.base.BaseViewModel;
import com.transsnet.palmpay.core.base.l;
import com.transsnet.palmpay.core.bean.CommonBeanResult;
import com.transsnet.palmpay.credit.bean.resp.TransferSuccessExistsData;
import com.transsnet.palmpay.credit.network.IApiCreditService;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/transsnet/palmpay/credit/viewmodel/TransferByLoanViewModel;", "Lcom/transsnet/palmpay/core/base/BaseViewModel;", "Landroid/app/Application;", "application", "<init>", "(Landroid/app/Application;)V", "module_flexi_impl_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nTransferByLoanViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TransferByLoanViewModel.kt\ncom/transsnet/palmpay/credit/viewmodel/TransferByLoanViewModel\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,255:1\n1#2:256\n*E\n"})
public final class TransferByLoanViewModel extends BaseViewModel {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public B f30928A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public boolean f30929B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public boolean f30930C;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final l f30931e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final F f30932f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final F f30933g;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final F f30934i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final F f30935j;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final F f30936o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final F f30937p;
    public final F t;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final F f30938v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public Boolean f30939w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TransferByLoanViewModel(@NotNull Application application) {
        super(application);
        Intrinsics.checkNotNullParameter(application, "application");
        this.f30931e = new l();
        F f10 = new F(I.f4706a);
        this.f30932f = f10;
        this.f30933g = f10;
        F f11 = new F(Boolean.FALSE);
        this.f30934i = f11;
        this.f30935j = f11;
        F f12 = new F();
        this.f30936o = f12;
        this.f30937p = f12;
        F f13 = new F();
        this.t = f13;
        this.f30938v = f13;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0016  */
    /* JADX WARN: Multi-variable type inference failed */
    public static final Object d(TransferByLoanViewModel transferByLoanViewModel, c cVar) {
        O o10;
        transferByLoanViewModel.getClass();
        if (cVar instanceof O) {
            o10 = (O) cVar;
            int i7 = o10.f4722c;
            if ((i7 & Integer.MIN_VALUE) != 0) {
                o10.f4722c = i7 - Integer.MIN_VALUE;
            } else {
                o10 = new O(transferByLoanViewModel, cVar);
            }
        } else {
            o10 = new O(transferByLoanViewModel, cVar);
        }
        Object transferSuccessExists = o10.f4720a;
        a aVar = a.f2423a;
        int i10 = o10.f4722c;
        boolean zC = false;
        try {
            if (i10 == 0) {
                g.M(transferSuccessExists);
                p221ob.c.f40268a.getInstance().getClass();
                IApiCreditService iApiCreditServiceA = p221ob.c.a();
                o10.f4722c = 1;
                transferSuccessExists = iApiCreditServiceA.getTransferSuccessExists("INSTALLMENT_LOAN", o10);
                if (transferSuccessExists == aVar) {
                    return aVar;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                g.M(transferSuccessExists);
            }
            CommonBeanResult commonBeanResult = (CommonBeanResult) transferSuccessExists;
            if (!commonBeanResult.isSuccess()) {
                return Boolean.FALSE;
            }
            TransferSuccessExistsData transferSuccessExistsData = (TransferSuccessExistsData) commonBeanResult.data;
            if (transferSuccessExistsData != null) {
                zC = Intrinsics.c(transferSuccessExistsData.getExistsSuccessLoan(), Boolean.TRUE);
            }
            return Boolean.valueOf(zC);
        } catch (CancellationException e10) {
            throw e10;
        } catch (Exception unused) {
        }
    }

    public final void e() {
        if (this.f30939w != null) {
            return;
        }
        B b7 = this.f30928A;
        if (b7 == null || !b7.isActive()) {
            this.f30928A = AbstractC0780y.d(V.h(this), null, new P(this, null), 3);
        }
    }
}
