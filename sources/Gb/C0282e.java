package Gb;

import com.palmpay.lib.ui.button.PpButton;
import com.transsnet.palmpay.credit.ui.view.OneTouchBorrowView;
import com.transsnet.palmpay.credit.view.CLMultipleCashProductView;

/* JADX INFO: renamed from: Gb.e, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C0282e implements OneTouchBorrowView.OneTouchBorrowListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ CLMultipleCashProductView f3271a;

    public C0282e(CLMultipleCashProductView cLMultipleCashProductView) {
        this.f3271a = cLMultipleCashProductView;
    }

    @Override // com.transsnet.palmpay.credit.ui.view.OneTouchBorrowView.OneTouchBorrowListener
    public final void clickBorrow() {
        PpButton ppButton;
        OneTouchBorrowView oneTouchBorrowView = this.f3271a.getOneTouchBorrowView();
        if (oneTouchBorrowView != null && (ppButton = oneTouchBorrowView.f30649d) != null) {
            ppButton.b(true);
        }
        p171lb.c.f39296f.getInstance().c();
    }

    @Override // com.transsnet.palmpay.credit.ui.view.OneTouchBorrowView.OneTouchBorrowListener
    public final void clickAgreement() {
    }
}
