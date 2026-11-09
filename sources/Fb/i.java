package Fb;

import Ab.B;
import Pa.F;
import Pa.n0;
import Sf.p;
import android.app.Activity;
import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import androidx.fragment.app.E;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.Z;
import androidx.viewpager2.widget.ViewPager2;
import com.alibaba.android.arouter.launcher.ARouter;
import com.facebook.react.views.textinput.ReactEditTextInputConnectionWrapper;
import com.transsnet.palmpay.core.util.statistic.ClickEvent;
import com.transsnet.palmpay.credit.bean.OutstandingAccount;
import com.transsnet.palmpay.credit.bean.OutstandingContentInfo;
import com.transsnet.palmpay.credit.bean.WaiverInfo;
import com.transsnet.palmpay.credit.bean.rsp.LoanHomeRepaymentAccount;
import com.transsnet.palmpay.credit.bean.rsp.LoanHomeRepaymentDetail;
import com.transsnet.palmpay.credit.ui.fragment.LoanHomeFragment;
import com.transsnet.palmpay.util.ActivityUtils;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.collections.C1849p;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import kotlin.text.y;

/* JADX INFO: loaded from: classes4.dex */
public final class i {
    public static void a(View view, String str) {
        String string;
        if (view == null) {
            return;
        }
        String strK = (str == null || (string = StringsKt.V(str).toString()) == null) ? null : y.k(string, " ", "");
        boolean z3 = (strK != null ? strK : "").length() > 0;
        view.setEnabled(z3);
        view.setAlpha(z3 ? 1.0f : 0.4f);
        view.setOnClickListener(new k(view, 0, str, z3));
    }

    public static String b(String str) {
        String string;
        String strK = (str == null || (string = StringsKt.V(str).toString()) == null) ? null : y.k(string, " ", "");
        String str2 = strK != null ? strK : "";
        if (str2.length() == 0) {
            return "-";
        }
        StringBuilder sb2 = new StringBuilder();
        int i7 = 0;
        int i10 = 0;
        while (i7 < str2.length()) {
            char cCharAt = str2.charAt(i7);
            int i11 = i10 + 1;
            if (i10 > 0 && (i10 == 4 || i10 == 7)) {
                sb2.append(' ');
            }
            sb2.append(cCharAt);
            i7++;
            i10 = i11;
        }
        return sb2.toString();
    }

    public static String c(List list, Set targetReasonCodes) {
        Intrinsics.checkNotNullParameter(targetReasonCodes, "targetReasonCodes");
        Intrinsics.checkNotNullParameter(ReactEditTextInputConnectionWrapper.NEWLINE_RAW_VALUE, "separator");
        List list2 = list;
        if (list2 != null && !list2.isEmpty()) {
            List listI = p.i(p.c(p.g(p.c(CollectionsKt.y(list), new h(targetReasonCodes, 0)), new B(13)), new B(14)));
            if (listI.isEmpty()) {
                listI = null;
            }
            if (listI != null) {
                return CollectionsKt.J(listI, ReactEditTextInputConnectionWrapper.NEWLINE_RAW_VALUE, null, null, null, 62);
            }
        }
        return null;
    }

    public static int d(List list) {
        List list2 = list;
        if (list2 == null || list2.isEmpty()) {
            return 1;
        }
        Iterator it = list.iterator();
        int iIntValue = 0;
        while (it.hasNext()) {
            Integer num = ((OutstandingAccount) it.next()).outstandingBillCount;
            iIntValue += num != null ? num.intValue() : 1;
        }
        return iIntValue > 0 ? iIntValue : list.size();
    }

    public static void e(Context context, OutstandingContentInfo info) {
        Long validUntil;
        OutstandingAccount outstandingAccount;
        OutstandingAccount outstandingAccount2;
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(info, "info");
        Intrinsics.checkNotNullParameter("repay", "type");
        WaiverInfo waiverInfo = info.waiverInfo;
        if (waiverInfo == null || !Intrinsics.c(waiverInfo.getWaiverEnable(), Boolean.TRUE) || (validUntil = waiverInfo.getValidUntil()) == null || validUntil.longValue() <= System.currentTimeMillis()) {
            org.chromium.support_lib_boundary.util.b.A(context, info.outstandingAccounts, true);
            return;
        }
        Set set = Eb.b.f2269a;
        n0.g().q(new ClickEvent("Loan_Home_Repay_Click"));
        List<OutstandingAccount> list = info.outstandingAccounts;
        Integer num = null;
        String str = (list == null || (outstandingAccount2 = (OutstandingAccount) CollectionsKt.firstOrNull(list)) == null) ? null : outstandingAccount2.androidLink;
        if (!TextUtils.isEmpty(str)) {
            F.f(str, null, null);
            return;
        }
        if (!TextUtils.isEmpty(info.jumpPath)) {
            F.f(info.jumpPath, info.jumpType, info.jumpParams);
            return;
        }
        Intrinsics.checkNotNullParameter(info, "info");
        if (d(info.outstandingAccounts) > 1) {
            com.palmpay.lib.apm.launchcounter.util.d.x(null, "LoanRepayMix");
            return;
        }
        List<OutstandingAccount> list2 = info.outstandingAccounts;
        if (list2 != null && (outstandingAccount = (OutstandingAccount) CollectionsKt.firstOrNull(list2)) != null) {
            num = outstandingAccount.accountType;
        }
        g(context, num, info.outstandingAccounts);
    }

    public static boolean f(Context context, LoanHomeRepaymentAccount account, LoanHomeRepaymentDetail detail) {
        Long validUntil;
        Intrinsics.checkNotNullParameter(account, "account");
        Intrinsics.checkNotNullParameter(detail, "detail");
        Intrinsics.checkNotNullParameter(account, "account");
        Intrinsics.checkNotNullParameter(detail, "detail");
        WaiverInfo waiverInfo = account.getWaiverInfo();
        if (waiverInfo == null) {
            waiverInfo = detail.getWaiverInfo();
        }
        if (waiverInfo == null || !Intrinsics.c(waiverInfo.getWaiverEnable(), Boolean.TRUE) || (validUntil = waiverInfo.getValidUntil()) == null || validUntil.longValue() <= System.currentTimeMillis()) {
            return false;
        }
        if (!TextUtils.isEmpty(detail.getAndroidLink())) {
            F.f(detail.getAndroidLink(), null, null);
            return true;
        }
        Integer outstandingBillCount = account.getOutstandingBillCount();
        if ((outstandingBillCount != null ? outstandingBillCount.intValue() : 1) > 1) {
            h(context);
            return true;
        }
        Integer accountType = account.getAccountType();
        Integer accountType2 = account.getAccountType();
        Long billId = detail.getBillId();
        if (billId == null) {
            billId = account.getOutstandingBillId();
        }
        Long currentOutstandingAmount = detail.getCurrentOutstandingAmount();
        if (currentOutstandingAmount == null) {
            currentOutstandingAmount = detail.getTotalOutstandingAmount();
        }
        g(context, accountType, C1849p.c(new OutstandingAccount(accountType2, billId, currentOutstandingAmount, detail.getRepaymentDateStamp(), account.getOutstandingBillCount(), account.getCardNo(), null, account.getLoanProduct(), account.getProductTitle(), detail.getUnpaidPenalty(), null, detail.getLoanNo(), detail.getAndroidLink())));
        return true;
    }

    public static void g(Context context, Integer num, List list) {
        if (num != null && num.intValue() == 6) {
            com.palmpay.lib.apm.launchcounter.util.d.x(null, "LoanFlexi");
        } else {
            org.chromium.support_lib_boundary.util.b.A(context, list, false);
        }
    }

    public static void h(Context context) {
        E e10;
        Z supportFragmentManager;
        Intrinsics.checkNotNullParameter(context, "context");
        if (context instanceof E) {
            e10 = (E) context;
        } else {
            Activity topActivity = ActivityUtils.getTopActivity();
            e10 = topActivity instanceof E ? (E) topActivity : null;
        }
        Fragment fragmentD = (e10 == null || (supportFragmentManager = e10.getSupportFragmentManager()) == null) ? null : supportFragmentManager.D(Ya.e.fragmentContainer);
        LoanHomeFragment loanHomeFragment = fragmentD instanceof LoanHomeFragment ? (LoanHomeFragment) fragmentD : null;
        if (loanHomeFragment == null) {
            ARouter.getInstance().build("/credit_score/loan_home_activity").withString("tab", "repayment").withFlags(536870912).navigation(context);
            return;
        }
        ViewPager2 viewPager2 = (ViewPager2) loanHomeFragment.f30344M.getValue();
        if (viewPager2 != null) {
            viewPager2.setCurrentItem(1, false);
        }
    }
}
