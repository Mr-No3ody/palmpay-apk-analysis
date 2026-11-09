package p129ib;

import android.content.DialogInterface;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class a implements DialogInterface.OnShowListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f37458a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ m f37459b;

    public /* synthetic */ a(m mVar, int i7) {
        this.f37458a = i7;
        this.f37459b = mVar;
    }

    @Override // android.content.DialogInterface.OnShowListener
    public final void onShow(DialogInterface dialogInterface) {
        switch (this.f37458a) {
            case 0:
                this.f37459b.d("cashOpen");
                break;
            case 1:
                this.f37459b.d("cashOpen");
                break;
            case 2:
                this.f37459b.d("cashOpen");
                break;
            case 3:
                this.f37459b.d("borrowCycleChange");
                break;
            case 4:
                this.f37459b.d("unloanInactiveUserSendCoupon");
                break;
            case 5:
                this.f37459b.d("installmentMultiLoanGuide");
                break;
            case 6:
                this.f37459b.d("migrateAppSendCoupon");
                break;
            case 7:
                this.f37459b.d("prejyMigrateLoanTermExtension");
                break;
            case 8:
                this.f37459b.d("flexiUnFrozen");
                break;
            case 9:
                this.f37459b.d("flexiOpen");
                break;
            case 10:
                this.f37459b.d("calcReturnSendCoupon");
                break;
            case 11:
                this.f37459b.d("prejyMigrateBorrowCoupon");
                break;
            case 12:
                this.f37459b.d("installmentLoanOpen");
                break;
            case 13:
                this.f37459b.d("quotaChange");
                break;
            case 14:
                this.f37459b.d("prejyMigrateRaiseAmount");
                break;
            case 15:
                this.f37459b.d("quotaChange");
                break;
            case 16:
                this.f37459b.d("installmentLoanOpen");
                break;
            case 17:
                this.f37459b.d("installmentLoanOpen");
                break;
            default:
                this.f37459b.d("cashUnFrozen");
                break;
        }
    }
}
