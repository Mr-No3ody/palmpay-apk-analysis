package Pe;

import Bc.C0105b;
import Fe.C0262j;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.transsnet.palmpay.core.bean.bill.TransHistoryItemBean;
import com.transsnet.palmpay.core.bean.bill.TransHistoryReqV2;
import com.transsnet.palmpay.core.bean.bill.TransHistoryRspV2;
import com.transsnet.palmpay.ui.fragment.TransactionHistoryFragment;
import com.transsnet.palmpay.util.ToastUtils;
import com.transsnet.palmpay.viewmodule.TransactionHistoryViewModel;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class r0 implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ TransactionHistoryViewModel f7293a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ TransHistoryReqV2 f7294b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f7295c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ boolean f7296d;

    public /* synthetic */ r0(TransactionHistoryViewModel transactionHistoryViewModel, TransHistoryReqV2 transHistoryReqV2, int i7, boolean z3) {
        this.f7293a = transactionHistoryViewModel;
        this.f7294b = transHistoryReqV2;
        this.f7295c = i7;
        this.f7296d = z3;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        boolean z3;
        TransHistoryRspV2 rsp = (TransHistoryRspV2) obj;
        int i7 = TransactionHistoryViewModel.f35404A;
        Intrinsics.checkNotNullParameter(rsp, "rsp");
        boolean zIsSuccess = rsp.isSuccess();
        TransHistoryReqV2 transHistoryReqV2 = this.f7294b;
        TransactionHistoryViewModel transactionHistoryViewModel = this.f7293a;
        boolean z8 = this.f7296d;
        boolean z10 = false;
        if (zIsSuccess) {
            transactionHistoryViewModel.f35410o = transHistoryReqV2;
            Long l5 = transHistoryReqV2.beginTime;
            Pa.r0.T(l5 != null ? l5.longValue() : 0L);
            Long l6 = transHistoryReqV2.endTime;
            Pa.r0.T(l6 != null ? l6.longValue() : 0L);
            TransHistoryRspV2.DataBean dataBean = rsp.data;
            List<TransHistoryItemBean> list = dataBean != null ? dataBean.list : null;
            int size = ((list == null || !list.isEmpty()) && list != null) ? list.size() : 0;
            ArrayList arrayList = transactionHistoryViewModel.t;
            if (size > 0 && list != null) {
                arrayList.addAll(list);
            }
            if (arrayList.size() < 10) {
                TransHistoryRspV2.ExtraData extraData = rsp.data.extData;
                z3 = extraData != null && extraData.beginTime < extraData.firstBillTime;
                int i10 = this.f7295c;
                if (i10 < 3 && !z3) {
                    TransHistoryReqV2 transHistoryReqV3 = transactionHistoryViewModel.f35410o;
                    if (transHistoryReqV3 != null) {
                        if (extraData != null) {
                            transHistoryReqV3.endTime = Long.valueOf(extraData.beginTime);
                        }
                        TransHistoryReqV2 transHistoryReqV4 = new TransHistoryReqV2();
                        String str = transHistoryReqV3.wardMemberId;
                        if (str != null) {
                            if (str.length() == 0) {
                                str = null;
                            }
                            if (str != null) {
                                transHistoryReqV4.wardMemberId = str;
                            }
                        }
                        Long l8 = transHistoryReqV3.beginTime;
                        transHistoryReqV4.endTime = l8;
                        transHistoryReqV4.beginTime = Long.valueOf(TransactionHistoryViewModel.g(l8 != null ? l8.longValue() : 0L));
                        transHistoryReqV4.pageNum = 1;
                        transHistoryReqV4.pageSize = 10;
                        transHistoryReqV4.conditionCode = transHistoryReqV3.conditionCode;
                        p140j8.f.t(transactionHistoryViewModel, new t0(transHistoryReqV4, null), new r0(transactionHistoryViewModel, transHistoryReqV4, i10 + 1, z8), new C0262j(transactionHistoryViewModel, transHistoryReqV4, z8));
                    }
                    return Unit.f38893a;
                }
            } else {
                z3 = false;
            }
            Integer num = transHistoryReqV2.pageNum;
            if (num != null && num.intValue() == 1 && arrayList.size() == 0 && !z8) {
                TransactionHistoryFragment transactionHistoryFragment = transactionHistoryViewModel.f35413w;
                if (transactionHistoryFragment != null) {
                    transactionHistoryFragment.v().setList(new ArrayList());
                    transactionHistoryFragment.A(transactionHistoryFragment.f35255Q, transactionHistoryFragment.f35254M);
                    C0105b c0105b = transactionHistoryFragment.f35260p;
                    if (c0105b != null) {
                        ((TextView) c0105b.f663c).setText(C0.G.i("In  ").setForegroundColor(transactionHistoryFragment.requireContext().getColor(Ac.b.main_color_858a8f)).append("0.00").create());
                    }
                    C0105b c0105b2 = transactionHistoryFragment.f35260p;
                    if (c0105b2 != null) {
                        ((TextView) c0105b2.f664d).setText(C0.G.i("Out  ").setForegroundColor(transactionHistoryFragment.requireContext().getColor(Ac.b.main_color_858a8f)).append("0.00").create());
                    }
                    C0105b c0105b3 = transactionHistoryFragment.f35260p;
                    if (c0105b3 != null) {
                        ((LinearLayout) c0105b3.f666f).setVisibility(0);
                    }
                }
                return Unit.f38893a;
            }
            z10 = z3;
        } else {
            ToastUtils.showLong(rsp.getRespMsg(), new Object[0]);
        }
        transactionHistoryViewModel.h(transHistoryReqV2, z10, z8);
        return Unit.f38893a;
    }
}
