package Gb;

import Rd.C0595k;
import android.view.View;
import android.view.ViewStub;
import android.widget.LinearLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.transsnet.palmpay.credit.bean.LoanHomeDataInfo;
import com.transsnet.palmpay.credit.bean.resp.mobile_Installment.CLPhoneInstallmentMainData;
import com.transsnet.palmpay.credit.bean.resp.mobile_Installment.MobileInstallmentCardData;
import com.transsnet.palmpay.credit.ui.dialog.CLTemporaryUnlockDialog;
import com.transsnet.palmpay.credit.ui.fragment.OcHomeMobileInstalmentTabFragment;
import com.transsnet.palmpay.credit.view.LoanHomeBottomInfoView;
import com.transsnet.palmpay.credit.viewmodel.OcHomeFinanceViewModel;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.List;
import p355xf.C2131j;

/* JADX INFO: loaded from: classes4.dex */
public final class y {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C0595k f3310a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final WeakReference f3311b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public LoanHomeDataInfo f3312c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final p355xf.t f3313d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final OcHomeFinanceViewModel f3314e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public x f3315f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public x f3316g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f3317h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public boolean f3318i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public CLTemporaryUnlockDialog f3319j;

    static {
        new w(null);
    }

    public y(ViewStub viewStub, OcHomeMobileInstalmentTabFragment ocHomeMobileInstalmentTabFragment) {
        p355xf.t tVarB = C2131j.b(new v(this, 0));
        this.f3313d = tVarB;
        WeakReference weakReference = new WeakReference(ocHomeMobileInstalmentTabFragment);
        this.f3311b = weakReference;
        OcHomeMobileInstalmentTabFragment ocHomeMobileInstalmentTabFragment2 = (OcHomeMobileInstalmentTabFragment) weakReference.get();
        if (ocHomeMobileInstalmentTabFragment2 != null) {
            this.f3314e = ocHomeMobileInstalmentTabFragment2.x();
        }
        View viewInflate = viewStub != null ? viewStub.inflate() : null;
        if (viewInflate != null) {
            int i7 = Ya.e.rvMobileInstallment;
            RecyclerView recyclerView = (RecyclerView) p059e1.a.m(i7, viewInflate);
            if (recyclerView != null) {
                i7 = Ya.e.viewLoanHomeBottomInfo;
                if (((LoanHomeBottomInfoView) p059e1.a.m(i7, viewInflate)) != null) {
                    this.f3310a = new C0595k((LinearLayout) viewInflate, recyclerView);
                    recyclerView.setAdapter((p339wb.e) tVarB.getValue());
                    recyclerView.setLayoutManager(new LinearLayoutManager(viewInflate.getContext(), 1, false));
                    recyclerView.setNestedScrollingEnabled(false);
                    recyclerView.setHasFixedSize(true);
                    recyclerView.addItemDecoration(new Qb.c(12, 0, 0, 0));
                    ((p339wb.e) tVarB.getValue()).setOnItemChildClickListener(new Dg.a(this, 13));
                    return;
                }
            }
            throw new NullPointerException("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i7)));
        }
    }

    public final void a() {
        b(0L);
        x xVar = this.f3315f;
        if (xVar == null) {
            return;
        }
        xVar.cancel();
        this.f3315f = null;
    }

    public final void b(long j6) {
        List<CLPhoneInstallmentMainData> list;
        int iIndexOf;
        MobileInstallmentCardData mobileInstallmentCardData;
        LoanHomeDataInfo loanHomeDataInfo = this.f3312c;
        if (loanHomeDataInfo == null || (list = loanHomeDataInfo.hirePurchaseProductContent) == null) {
            return;
        }
        Object obj = null;
        if (list.isEmpty()) {
            list = null;
        }
        if (list != null) {
            for (Object obj2 : list) {
                Integer itemLayoutType = ((CLPhoneInstallmentMainData) obj2).getItemLayoutType();
                if (itemLayoutType != null && itemLayoutType.intValue() == 0) {
                    obj = obj2;
                    break;
                }
            }
            CLPhoneInstallmentMainData cLPhoneInstallmentMainData = (CLPhoneInstallmentMainData) obj;
            if (cLPhoneInstallmentMainData == null || (iIndexOf = list.indexOf(cLPhoneInstallmentMainData)) == -1 || (mobileInstallmentCardData = cLPhoneInstallmentMainData.getMobileInstallmentCardData()) == null) {
                return;
            }
            mobileInstallmentCardData.setExpireTime(Long.valueOf(j6));
            ((p339wb.e) this.f3313d.getValue()).notifyItemChanged(iIndexOf, "COUNTDOWN_UPDATE");
        }
    }

    /* JADX WARN: Code duplicated, block: B:19:0x0031  */
    public final void c() {
        int iIndexOf;
        List<CLPhoneInstallmentMainData> list;
        Object next;
        LoanHomeDataInfo loanHomeDataInfo = this.f3312c;
        if (loanHomeDataInfo == null || (list = loanHomeDataInfo.hirePurchaseProductContent) == null) {
            iIndexOf = -1;
        } else {
            Iterator<T> it = list.iterator();
            while (true) {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
                Integer itemLayoutType = ((CLPhoneInstallmentMainData) next).getItemLayoutType();
                if (itemLayoutType != null && itemLayoutType.intValue() == 0) {
                    break;
                }
            }
            CLPhoneInstallmentMainData cLPhoneInstallmentMainData = (CLPhoneInstallmentMainData) next;
            if (cLPhoneInstallmentMainData == null) {
                iIndexOf = -1;
            } else {
                iIndexOf = list.indexOf(cLPhoneInstallmentMainData);
            }
        }
        if (iIndexOf == -1) {
            return;
        }
        ((p339wb.e) this.f3313d.getValue()).notifyItemChanged(iIndexOf, "EXEMPTION_COUNTDOWN_UPDATE");
    }
}
