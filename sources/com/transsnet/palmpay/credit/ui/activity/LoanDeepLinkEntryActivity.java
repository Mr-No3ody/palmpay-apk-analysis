package com.transsnet.palmpay.credit.ui.activity;

import Db.C0193j;
import Db.C0194k;
import Pa.i0;
import android.graphics.drawable.ColorDrawable;
import android.net.Uri;
import android.os.Bundle;
import com.transsnet.palmpay.core.base.BaseApplication;
import com.transsnet.palmpay.core.base.l;
import com.transsnet.palmpay.credit.base.CreditBaseMvvmActivity;
import com.transsnet.palmpay.credit.ui.viewmodel.LoanDeepLinkEntryViewModel;
import com.transsnet.palmpay.custom_view.p;
import com.transsnet.palmpay.util.ActivityUtils;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;
import p054dd.q;
import p140j8.f;
import p284sb.C2014l;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/transsnet/palmpay/credit/ui/activity/LoanDeepLinkEntryActivity;", "Lcom/transsnet/palmpay/credit/base/CreditBaseMvvmActivity;", "Lcom/transsnet/palmpay/credit/ui/viewmodel/LoanDeepLinkEntryViewModel;", "<init>", "()V", "module_flexi_impl_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nLoanDeepLinkEntryActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LoanDeepLinkEntryActivity.kt\ncom/transsnet/palmpay/credit/ui/activity/LoanDeepLinkEntryActivity\n+ 2 LifecycleOwnerKtx.kt\ncom/transsnet/palmpay/core/base/ext/LifecycleOwnerKtxKt\n*L\n1#1,96:1\n171#2,12:97\n215#2:109\n171#2,12:110\n215#2:122\n*S KotlinDebug\n*F\n+ 1 LoanDeepLinkEntryActivity.kt\ncom/transsnet/palmpay/credit/ui/activity/LoanDeepLinkEntryActivity\n*L\n63#1:97,12\n63#1:109\n79#1:110,12\n79#1:122\n*E\n"})
public final class LoanDeepLinkEntryActivity extends CreditBaseMvvmActivity<LoanDeepLinkEntryViewModel> {
    @Override // com.transsnet.palmpay.core.base.BaseActivity
    public final int getLayoutId() {
        return 0;
    }

    @Override // com.transsnet.palmpay.core.base.BaseActivity
    public final void initStatusBar() {
        initStatusBar(true);
    }

    /* JADX WARN: Code duplicated, block: B:23:0x0066  */
    /* JADX WARN: Code duplicated, block: B:25:0x0070  */
    @Override // com.transsnet.palmpay.core.base.BaseActivity
    public final void processLogic(Bundle bundle) {
        if (BaseApplication.hasLogin()) {
            Uri data = getIntent().getData();
            String host = data != null ? data.getHost() : null;
            if (host == null) {
                if (ActivityUtils.getActivityList().size() == 1) {
                    i0.H(null);
                }
                finish();
            } else {
                int iHashCode = host.hashCode();
                if (iHashCode != -1142022989) {
                    if (iHashCode == -992194793 && host.equals("loan.repay")) {
                        LoanDeepLinkEntryViewModel loanDeepLinkEntryViewModel = (LoanDeepLinkEntryViewModel) l();
                        loanDeepLinkEntryViewModel.getClass();
                        f.s(loanDeepLinkEntryViewModel, new C0194k(1, null), loanDeepLinkEntryViewModel.f30686e, (28 & 4) != 0 ? 0L : 300L, (28 & 8) != 0, (28 & 16) == 0);
                    } else {
                        if (ActivityUtils.getActivityList().size() == 1) {
                            i0.H(null);
                        }
                        finish();
                    }
                } else if (host.equals("loan.borrow")) {
                    LoanDeepLinkEntryViewModel loanDeepLinkEntryViewModel2 = (LoanDeepLinkEntryViewModel) l();
                    loanDeepLinkEntryViewModel2.getClass();
                    f.s(loanDeepLinkEntryViewModel2, new C0193j(1, null), loanDeepLinkEntryViewModel2.f30687f, (28 & 4) != 0 ? 0L : 300L, (28 & 8) != 0, (28 & 16) == 0);
                } else {
                    if (ActivityUtils.getActivityList().size() == 1) {
                        i0.H(null);
                    }
                    finish();
                }
            }
        } else {
            i0.K(null, null);
            finish();
        }
        LoanDeepLinkEntryViewModel loanDeepLinkEntryViewModel3 = (LoanDeepLinkEntryViewModel) l();
        l lVar = loanDeepLinkEntryViewModel3 != null ? loanDeepLinkEntryViewModel3.f30686e : null;
        if (lVar != null) {
            lVar.e(this, new q(new C2014l(this, this, 0), 28));
        }
        LoanDeepLinkEntryViewModel loanDeepLinkEntryViewModel4 = (LoanDeepLinkEntryViewModel) l();
        l lVar2 = loanDeepLinkEntryViewModel4 != null ? loanDeepLinkEntryViewModel4.f30687f : null;
        if (lVar2 != null) {
            lVar2.e(this, new q(new C2014l(this, this, 1), 28));
        }
    }

    @Override // com.transsnet.palmpay.core.base.BaseMvvmActivity, com.transsnet.palmpay.core.base.BaseActivity
    public final void setupView() {
        getWindow().setBackgroundDrawable(new ColorDrawable(getColor(p.transparent_30)));
    }
}
