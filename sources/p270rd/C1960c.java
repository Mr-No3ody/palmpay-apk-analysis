package p270rd;

import Ef.a;
import Ff.h;
import Wf.AbstractC0780y;
import Wf.I;
import androidx.camera.core.impl.utils.executor.g;
import com.alibaba.android.arouter.launcher.ARouter;
import com.transsnet.palmpay.core.bean.TransferByLoanOpenParams;
import com.transsnet.palmpay.core.interfaces.ILoanBankSilentAuthService;
import com.transsnet.palmpay.core.interfaces.ITransferByLoanService;
import com.transsnet.palmpay.send_money.ui.activity.CashierTransferPreviewActivity;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import p042cg.e;
import p042cg.f;

/* JADX INFO: renamed from: rd.c, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C1960c extends h implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f41729a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ CashierTransferPreviewActivity f41730b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ ITransferByLoanService f41731c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1960c(CashierTransferPreviewActivity cashierTransferPreviewActivity, ITransferByLoanService iTransferByLoanService, Continuation continuation) {
        super(2, continuation);
        this.f41730b = cashierTransferPreviewActivity;
        this.f41731c = iTransferByLoanService;
    }

    @Override // Ff.a
    public final Continuation create(Object obj, Continuation continuation) {
        return new C1960c(this.f41730b, this.f41731c, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((C1960c) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f38893a);
    }

    /* JADX WARN: Code duplicated, block: B:35:0x0078 A[Catch: all -> 0x0012, TRY_LEAVE, TryCatch #0 {all -> 0x0012, blocks: (B:5:0x000e, B:26:0x005d, B:28:0x0065, B:30:0x006b, B:33:0x0072, B:35:0x0078, B:42:0x008c, B:45:0x0096, B:53:0x00b2, B:12:0x0023, B:14:0x0029, B:17:0x0031, B:19:0x0044, B:23:0x004b, B:60:0x00c6), top: B:73:0x000a }] */
    /* JADX WARN: Code duplicated, block: B:42:0x008c A[Catch: all -> 0x0012, TRY_ENTER, TryCatch #0 {all -> 0x0012, blocks: (B:5:0x000e, B:26:0x005d, B:28:0x0065, B:30:0x006b, B:33:0x0072, B:35:0x0078, B:42:0x008c, B:45:0x0096, B:53:0x00b2, B:12:0x0023, B:14:0x0029, B:17:0x0031, B:19:0x0044, B:23:0x004b, B:60:0x00c6), top: B:73:0x000a }] */
    /* JADX WARN: Code duplicated, block: B:44:0x0094  */
    @Override // Ff.a
    public final Object invokeSuspend(Object obj) {
        String str;
        ITransferByLoanService iTransferByLoanService = this.f41731c;
        a aVar = a.f2423a;
        int i7 = this.f41729a;
        boolean zBooleanValue = true;
        CashierTransferPreviewActivity cashierTransferPreviewActivity = this.f41730b;
        try {
            if (i7 == 0) {
                g.M(obj);
                cashierTransferPreviewActivity.showLoadingDialog(true);
                if (!cashierTransferPreviewActivity.isFinishing() && !cashierTransferPreviewActivity.isDestroyed()) {
                    Object objNavigation = ARouter.getInstance().build("/credit_score/loan_bank_silent_auth_service").navigation();
                    ILoanBankSilentAuthService iLoanBankSilentAuthService = objNavigation instanceof ILoanBankSilentAuthService ? (ILoanBankSilentAuthService) objNavigation : null;
                    if (iLoanBankSilentAuthService != null) {
                        f fVar = I.f10809a;
                        e eVar = e.f19009c;
                        C1959b c1959b = new C1959b(iLoanBankSilentAuthService, null);
                        this.f41729a = 1;
                        obj = AbstractC0780y.s(eVar, c1959b, this);
                        if (obj == aVar) {
                            return aVar;
                        }
                    }
                    if (zBooleanValue && !cashierTransferPreviewActivity.isFinishing() && !cashierTransferPreviewActivity.isDestroyed()) {
                        if (iTransferByLoanService.isTrialOpen()) {
                            Unit unit = Unit.f38893a;
                            cashierTransferPreviewActivity.Z0 = false;
                            if (!cashierTransferPreviewActivity.isFinishing() && !cashierTransferPreviewActivity.isDestroyed()) {
                                cashierTransferPreviewActivity.showLoadingDialog(false);
                            }
                            return unit;
                        }
                        long j6 = cashierTransferPreviewActivity.f27461p;
                        str = cashierTransferPreviewActivity.d1;
                        if (str == null) {
                            str = "";
                        }
                        iTransferByLoanService.launch(cashierTransferPreviewActivity, new TransferByLoanOpenParams(j6, str, cashierTransferPreviewActivity.f27454d));
                        cashierTransferPreviewActivity.Z0 = false;
                        if (!cashierTransferPreviewActivity.isFinishing() && !cashierTransferPreviewActivity.isDestroyed()) {
                            cashierTransferPreviewActivity.showLoadingDialog(false);
                        }
                        return Unit.f38893a;
                    }
                    Unit unit2 = Unit.f38893a;
                    cashierTransferPreviewActivity.Z0 = false;
                    if (!cashierTransferPreviewActivity.isFinishing() && !cashierTransferPreviewActivity.isDestroyed()) {
                        cashierTransferPreviewActivity.showLoadingDialog(false);
                    }
                    return unit2;
                }
                Unit unit3 = Unit.f38893a;
                cashierTransferPreviewActivity.Z0 = false;
                if (!cashierTransferPreviewActivity.isFinishing() && !cashierTransferPreviewActivity.isDestroyed()) {
                    cashierTransferPreviewActivity.showLoadingDialog(false);
                }
                return unit3;
            }
            if (i7 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            g.M(obj);
            zBooleanValue = ((Boolean) obj).booleanValue();
            if (zBooleanValue) {
                if (iTransferByLoanService.isTrialOpen()) {
                    Unit unit4 = Unit.f38893a;
                    cashierTransferPreviewActivity.Z0 = false;
                    if (!cashierTransferPreviewActivity.isFinishing()) {
                        cashierTransferPreviewActivity.showLoadingDialog(false);
                    }
                    return unit4;
                }
                long j10 = cashierTransferPreviewActivity.f27461p;
                str = cashierTransferPreviewActivity.d1;
                if (str == null) {
                    str = "";
                }
                iTransferByLoanService.launch(cashierTransferPreviewActivity, new TransferByLoanOpenParams(j10, str, cashierTransferPreviewActivity.f27454d));
                cashierTransferPreviewActivity.Z0 = false;
                if (!cashierTransferPreviewActivity.isFinishing()) {
                    cashierTransferPreviewActivity.showLoadingDialog(false);
                }
                return Unit.f38893a;
            }
            Unit unit5 = Unit.f38893a;
            cashierTransferPreviewActivity.Z0 = false;
            if (!cashierTransferPreviewActivity.isFinishing()) {
                cashierTransferPreviewActivity.showLoadingDialog(false);
            }
            return unit5;
        } catch (Throwable th) {
            cashierTransferPreviewActivity.Z0 = false;
            if (!cashierTransferPreviewActivity.isFinishing() && !cashierTransferPreviewActivity.isDestroyed()) {
                cashierTransferPreviewActivity.showLoadingDialog(false);
            }
            throw th;
        }
    }
}
