package Gb;

import android.os.CountDownTimer;
import com.transsnet.palmpay.credit.ui.dialog.CLTemporaryUnlockDialog;
import com.transsnet.palmpay.credit.viewmodel.OcHomeFinanceViewModel;

/* JADX INFO: loaded from: classes4.dex */
public final class x extends CountDownTimer {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3308a = 1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ y f3309b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x(long j6, y yVar, long j10) {
        super(j6, 1000L);
        this.f3309b = yVar;
    }

    @Override // android.os.CountDownTimer
    public final void onFinish() {
        switch (this.f3308a) {
            case 0:
                y yVar = this.f3309b;
                yVar.a();
                OcHomeFinanceViewModel ocHomeFinanceViewModel = yVar.f3314e;
                if (ocHomeFinanceViewModel != null) {
                    ocHomeFinanceViewModel.d();
                }
                break;
            default:
                y yVar2 = this.f3309b;
                x xVar = yVar2.f3316g;
                if (xVar != null) {
                    xVar.cancel();
                }
                yVar2.f3316g = null;
                yVar2.c();
                yVar2.f3318i = true;
                if (!yVar2.f3317h) {
                    yVar2.f3317h = true;
                    OcHomeFinanceViewModel ocHomeFinanceViewModel2 = yVar2.f3314e;
                    if (ocHomeFinanceViewModel2 != null) {
                        ocHomeFinanceViewModel2.d();
                    }
                    break;
                }
                break;
        }
    }

    @Override // android.os.CountDownTimer
    public final void onTick(long j6) {
        switch (this.f3308a) {
            case 0:
                long j10 = j6 / ((long) 1000);
                y yVar = this.f3309b;
                CLTemporaryUnlockDialog cLTemporaryUnlockDialog = yVar.f3319j;
                if (cLTemporaryUnlockDialog != null) {
                    cLTemporaryUnlockDialog.updateCountDown(j10);
                }
                yVar.b(j10);
                break;
            default:
                this.f3309b.c();
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x(y yVar, long j6) {
        super(j6, 1000L);
        this.f3309b = yVar;
    }
}
