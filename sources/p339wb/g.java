package p339wb;

import Fb.i;
import Pa.F;
import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import com.palmpay.lib.apm.launchcounter.util.d;
import com.transsnet.palmpay.credit.bean.rsp.LoanHomeRepaymentAccount;
import com.transsnet.palmpay.credit.bean.rsp.LoanHomeRepaymentDetail;
import com.transsnet.palmpay.teller.bean.TvListByCategoryIdResp;
import com.transsnet.palmpay.teller.ui.fragment.BillPaymentTvHomeFragment;
import com.transsnet.palmpay.util.ActivityUtils;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class g implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f43371a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f43372b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f43373c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f43374d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f43375e;

    public /* synthetic */ g(Object obj, Object obj2, Object obj3, Object obj4, int i7) {
        this.f43371a = i7;
        this.f43372b = obj;
        this.f43373c = obj2;
        this.f43374d = obj3;
        this.f43375e = obj4;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        Integer accountType;
        Integer accountType2;
        LoanHomeRepaymentDetail loanHomeRepaymentDetail;
        String androidLink;
        Object obj2 = this.f43372b;
        Object obj3 = this.f43375e;
        Object obj4 = this.f43374d;
        Object obj5 = this.f43373c;
        switch (this.f43371a) {
            case 0:
                View it = (View) obj;
                Intrinsics.checkNotNullParameter(it, "it");
                LoanHomeRepaymentDetail loanHomeRepaymentDetail2 = (LoanHomeRepaymentDetail) obj4;
                LoanHomeRepaymentAccount loanHomeRepaymentAccount = (LoanHomeRepaymentAccount) obj5;
                if (!i.f((Context) obj2, loanHomeRepaymentAccount, loanHomeRepaymentDetail2)) {
                    List<LoanHomeRepaymentDetail> detailList = loanHomeRepaymentAccount.getDetailList();
                    if (detailList == null || (loanHomeRepaymentDetail = detailList.get(0)) == null || (androidLink = loanHomeRepaymentDetail.getAndroidLink()) == null) {
                        Integer accountType3 = loanHomeRepaymentAccount.getAccountType();
                        if (accountType3 != null && accountType3.intValue() == 11) {
                            d.F("/credit_score/oc_home_mobile_installment_standalone_activity");
                        } else {
                            Integer accountType4 = loanHomeRepaymentAccount.getAccountType();
                            if (accountType4 != null && accountType4.intValue() == 6) {
                                d.x(null, "LoanFlexi");
                            } else {
                                Integer accountType5 = loanHomeRepaymentAccount.getAccountType();
                                if ((accountType5 == null || accountType5.intValue() != 7) && (((accountType = loanHomeRepaymentAccount.getAccountType()) == null || accountType.intValue() != 14) && ((accountType2 = loanHomeRepaymentAccount.getAccountType()) == null || accountType2.intValue() != 9))) {
                                    Integer accountType6 = loanHomeRepaymentAccount.getAccountType();
                                    if (accountType6 != null && accountType6.intValue() == 13) {
                                        Bundle bundle = new Bundle();
                                        Long billId = loanHomeRepaymentDetail2.getBillId();
                                        bundle.putLong("billId", billId != null ? billId.longValue() : 0L);
                                        d.x(bundle, "PalmPayCardRepayment");
                                    }
                                } else if (!TextUtils.isEmpty(loanHomeRepaymentDetail2.getLoanNo()) || loanHomeRepaymentDetail2.getBillId() != null) {
                                    Bundle bundle2 = new Bundle();
                                    bundle2.putString("billId", String.valueOf(loanHomeRepaymentDetail2.getBillId()));
                                    bundle2.putString("accountType", loanHomeRepaymentDetail2.getAccountType());
                                    bundle2.putString("cardNo", loanHomeRepaymentDetail2.getCardNo());
                                    bundle2.putString("loanProduct", loanHomeRepaymentDetail2.getLoanProduct());
                                    d.x(bundle2, "LoanOutstandingBill");
                                }
                            }
                        }
                    } else {
                        ActivityUtils.startActivity(F.a(((i) obj3).getContext(), androidLink));
                    }
                }
                break;
            case 1:
                View it2 = (View) obj;
                Intrinsics.checkNotNullParameter(it2, "it");
                LoanHomeRepaymentDetail loanHomeRepaymentDetail3 = (LoanHomeRepaymentDetail) obj4;
                LoanHomeRepaymentAccount loanHomeRepaymentAccount2 = (LoanHomeRepaymentAccount) obj5;
                if (!i.f((Context) obj2, loanHomeRepaymentAccount2, loanHomeRepaymentDetail3)) {
                    ((i) obj3).f43379a.invoke(loanHomeRepaymentAccount2, loanHomeRepaymentDetail3);
                }
                break;
            default:
                long jLongValue = ((Long) obj).longValue();
                int i7 = BillPaymentTvHomeFragment.f34295v0;
                String str = (String) obj5;
                Intrinsics.e(str);
                String str2 = (String) obj4;
                Intrinsics.e(str2);
                ((BillPaymentTvHomeFragment) obj2).H(str, str2, jLongValue, (TvListByCategoryIdResp.TvItemChildBean) ((kotlin.jvm.internal.F) obj3).f38951a);
                break;
        }
        return Unit.f38893a;
    }
}
