package p255qd;

import C0.G;
import F6.d;
import N8.q0;
import android.os.Handler;
import androidx.camera.video.u;
import com.transsnet.palmpay.core.base.IBaseView;
import com.transsnet.palmpay.core.base.j;
import com.transsnet.palmpay.core.bean.bill.BillReqNew;
import com.transsnet.palmpay.core.bean.bill.BillRsp;
import com.transsnet.palmpay.core.bean.bill.TransHistoryReq;
import com.transsnet.palmpay.core.bean.bill.TransHistoryRsp;
import com.transsnet.palmpay.core.bean.bill.TransType;
import com.transsnet.palmpay.core.network.PayApiService;
import com.transsnet.palmpay.send_money.contract.MoneyTransferHistoryContract;
import com.transsnet.palmpay.send_money.ui.fragment.MoneyTransferHistoryFragment;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.HashMap;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import p071ef.b;
import p324va.c;

/* JADX INFO: loaded from: classes4.dex */
public final class f extends j implements MoneyTransferHistoryContract.Presenter {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final String f41489h;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public TransHistoryReq f41490d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final ArrayList f41491e = new ArrayList();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final ArrayList f41492f = new ArrayList();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final HashMap f41493g = new HashMap();

    static {
        new c(null);
        f41489h = f.class.getSimpleName();
    }

    public static long e(int i7, int i10) {
        Calendar calendar = Calendar.getInstance();
        calendar.clear();
        calendar.set(i7, i10 - 1, 1);
        return calendar.getTimeInMillis();
    }

    public static int f(long j6) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(j6);
        return calendar.get(2) + 1;
    }

    @Override // com.transsnet.palmpay.core.base.j
    /* JADX INFO: renamed from: a */
    public final void attachView(IBaseView iBaseView) {
        MoneyTransferHistoryContract.View view = (MoneyTransferHistoryContract.View) iBaseView;
        Intrinsics.checkNotNullParameter(view, "view");
        this.f27351a = view;
    }

    @Override // com.transsnet.palmpay.core.base.j, com.transsnet.palmpay.core.base.IBasePresenter
    public final void attachView(MoneyTransferHistoryContract.View view) {
        MoneyTransferHistoryContract.View view2 = view;
        Intrinsics.checkNotNullParameter(view2, "view");
        this.f27351a = view2;
    }

    public final void b(ArrayList arrayList, List list) {
        int size = list.size();
        for (int i7 = 0; i7 < size; i7++) {
            TransHistoryRsp.DataBean.ListBean listBean = (TransHistoryRsp.DataBean.ListBean) list.get(i7);
            if (i7 == 0) {
                c(arrayList, listBean);
            }
            if (i7 > 0) {
                if (f(listBean.updateTime) != f(((TransHistoryRsp.DataBean.ListBean) list.get(i7 - 1)).updateTime)) {
                    c(arrayList, listBean);
                }
            }
            arrayList.add(listBean);
        }
    }

    public final void c(ArrayList arrayList, TransHistoryRsp.DataBean.ListBean listBean) {
        TransHistoryRsp.DataBean.ListBean listBean2 = new TransHistoryRsp.DataBean.ListBean();
        listBean2.itemType = 1;
        listBean2.updateTime = listBean.updateTime;
        arrayList.add(listBean2);
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(listBean.updateTime);
        int i7 = calendar.get(2) + 1;
        int i10 = calendar.get(1);
        IBaseView iBaseView = this.f27351a;
        if (iBaseView != null) {
            MoneyTransferHistoryFragment moneyTransferHistoryFragment = (MoneyTransferHistoryFragment) iBaseView;
            String str = moneyTransferHistoryFragment.f33673H;
            if (str == null) {
                str = "";
            }
            getAmountSummary(i10, i7, str, moneyTransferHistoryFragment.f33672C, moneyTransferHistoryFragment.f33671B);
        }
    }

    public final void d(TransHistoryReq transHistoryReq, int i7, boolean z3) {
        StringBuilder sbP = q0.p(transHistoryReq.beginYear, "fetchData: ", transHistoryReq.beginMonth, "/", " noDataCount ");
        sbP.append(i7);
        d.h(f41489h, 3, sbP.toString());
        ((PayApiService) c.f43141a.f14621b).getTransactionHistory(transHistoryReq).k(p298tf.f.f42629b).i(b.a()).subscribe(new d(this, transHistoryReq, i7, z3));
    }

    @Override // com.transsnet.palmpay.core.base.j, com.transsnet.palmpay.core.base.IBasePresenter
    public final void detachView() {
        this.f41493g.clear();
        ArrayList arrayList = this.f41491e;
        Intrinsics.e(arrayList);
        arrayList.clear();
        this.f41492f.clear();
        super.detachView();
    }

    @Override // com.transsnet.palmpay.send_money.contract.MoneyTransferHistoryContract.Presenter
    public final void getAmountSummary(int i7, int i10, String str, int i11, int i12) {
        String str2 = i7 + "/" + i10 + "/" + str + "/" + i11 + "/" + i12;
        Object[] objArr = {G.o("fetchData: ", str2)};
        String str3 = f41489h;
        d.h(str3, 3, objArr);
        BillRsp.DataBean.ExtDataBean extDataBean = (BillRsp.DataBean.ExtDataBean) this.f41493g.get(str2);
        if (extDataBean != null) {
            long inComeAmount = extDataBean.getInComeAmount();
            long payOutAmount = extDataBean.getPayOutAmount();
            StringBuilder sbR = u.r(inComeAmount, "fetchData: ", "/");
            sbR.append(payOutAmount);
            d.h(str3, 3, sbR.toString());
            IBaseView iBaseView = this.f27351a;
            Intrinsics.e(iBaseView);
            ((MoneyTransferHistoryContract.View) iBaseView).updateTotalAmount(i7, i10, extDataBean.getInComeAmount(), extDataBean.getPayOutAmount(), str2);
            new Handler().postDelayed(new b(this, i7, i10, extDataBean), 200L);
            return;
        }
        BillReqNew billReqNew = new BillReqNew();
        billReqNew.setBeginTime(e(i7, i10));
        billReqNew.setEndTime(e(i7, i10 + 1));
        if (TransType.TRANS_SCENE_REFUND.equals(str)) {
            billReqNew.setTransScene(str);
        } else {
            billReqNew.setTransType(str);
        }
        billReqNew.setPageNum(1);
        billReqNew.setPageSize(1);
        billReqNew.setTotalFlag(1);
        if (i11 > 0) {
            billReqNew.inOutFlag = i11;
        }
        if (i12 > 0) {
            billReqNew.status = i12;
        }
        ((PayApiService) c.f43141a.f14621b).getBills(billReqNew).k(p298tf.f.f42629b).i(b.a()).subscribe(new e(this, str2, i7, i10));
    }

    @Override // com.transsnet.palmpay.send_money.contract.MoneyTransferHistoryContract.Presenter
    public final void loadTransactionData(int i7, int i10, String str, int i11, int i12, boolean z3) {
        TransHistoryReq transHistoryReq;
        StringBuilder sbP = q0.p(i7, "loadTransactionData: ", i10, "/", " loadMore ");
        sbP.append(z3);
        d.h(f41489h, 3, sbP.toString());
        TransHistoryReq transHistoryReq2 = new TransHistoryReq();
        if (!z3 || (transHistoryReq = this.f41490d) == null) {
            ArrayList arrayList = this.f41491e;
            Intrinsics.e(arrayList);
            arrayList.clear();
            transHistoryReq2.beginTime = e(i7, i10 - 1);
            transHistoryReq2.endTime = e(i7, i10 + 1);
            transHistoryReq2.pageNum = 1;
            transHistoryReq2.beginYear = i7;
            transHistoryReq2.beginMonth = i10;
        } else {
            transHistoryReq2.beginTime = transHistoryReq.beginTime;
            Intrinsics.e(transHistoryReq);
            transHistoryReq2.endTime = transHistoryReq.endTime;
            TransHistoryReq transHistoryReq3 = this.f41490d;
            Intrinsics.e(transHistoryReq3);
            transHistoryReq2.pageNum = transHistoryReq3.pageNum + 1;
            TransHistoryReq transHistoryReq4 = this.f41490d;
            Intrinsics.e(transHistoryReq4);
            transHistoryReq2.beginYear = transHistoryReq4.beginYear;
            TransHistoryReq transHistoryReq5 = this.f41490d;
            Intrinsics.e(transHistoryReq5);
            transHistoryReq2.beginMonth = transHistoryReq5.beginMonth;
        }
        transHistoryReq2.pageSize = 10;
        transHistoryReq2.transType = str;
        transHistoryReq2.inOutFlag = i11;
        if (i12 > 0) {
            transHistoryReq2.status = Integer.valueOf(i12);
        }
        d(transHistoryReq2, 0, z3);
    }
}
