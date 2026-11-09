package p255qd;

import C0.G;
import N8.q0;
import Pa.r0;
import Z4.e;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.transsnet.palmpay.core.base.IBaseView;
import com.transsnet.palmpay.core.bean.bill.TransHistoryReq;
import com.transsnet.palmpay.core.bean.bill.TransHistoryRsp;
import com.transsnet.palmpay.send_money.contract.MoneyTransferHistoryContract;
import com.transsnet.palmpay.send_money.ui.fragment.MoneyTransferHistoryFragment;
import com.transsnet.palmpay.util.ToastUtils;
import io.reactivex.disposables.Disposable;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import p159kd.b;
import p355xf.t;

/* JADX INFO: loaded from: classes4.dex */
public final class d extends e {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ f f41481f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ TransHistoryReq f41482g;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f41483i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final /* synthetic */ boolean f41484j;

    public d(f fVar, TransHistoryReq transHistoryReq, int i7, boolean z3) {
        this.f41481f = fVar;
        this.f41482g = transHistoryReq;
        this.f41483i = i7;
        this.f41484j = z3;
    }

    @Override // io.reactivex.Observer
    public final void onSubscribe(Disposable disposable) {
        Intrinsics.checkNotNullParameter(disposable, "disposable");
        this.f41481f.addSubscription(disposable);
    }

    @Override // Z4.e
    public final void w(String message) {
        Intrinsics.checkNotNullParameter(message, "message");
        ToastUtils.showLong(message, new Object[0]);
    }

    @Override // Z4.e
    public final void y(Object obj) {
        TextView textViewX;
        List<TransHistoryRsp.DataBean.ListBean> list;
        TransHistoryRsp transHistoryRsp = (TransHistoryRsp) obj;
        if (transHistoryRsp != null) {
            boolean zIsSuccess = transHistoryRsp.isSuccess();
            boolean z3 = this.f41484j;
            f fVar = this.f41481f;
            if (zIsSuccess) {
                TransHistoryReq transHistoryReq = this.f41482g;
                fVar.f41490d = transHistoryReq;
                TransHistoryRsp.DataBean dataBean = transHistoryRsp.data;
                int size = (dataBean == null || (list = dataBean.list) == null) ? 0 : list.size();
                ArrayList arrayList = fVar.f41492f;
                if (size > 0) {
                    List<TransHistoryRsp.DataBean.ListBean> list2 = transHistoryRsp.data.list;
                    Intrinsics.checkNotNullExpressionValue(list2, "list");
                    ArrayList arrayList2 = new ArrayList();
                    ArrayList arrayList3 = fVar.f41491e;
                    if (arrayList3 == null || arrayList3.isEmpty() || f.f(((TransHistoryRsp.DataBean.ListBean) q0.i(1, arrayList3)).updateTime) != f.f(list2.get(0).updateTime)) {
                        fVar.b(arrayList2, list2);
                    } else {
                        int size2 = list2.size();
                        for (int i7 = 0; i7 < size2; i7++) {
                            TransHistoryRsp.DataBean.ListBean listBean = list2.get(i7);
                            if (i7 > 0) {
                                if (f.f(listBean.updateTime) != f.f(list2.get(i7 - 1).updateTime)) {
                                    fVar.c(arrayList2, listBean);
                                }
                            }
                            arrayList2.add(listBean);
                        }
                    }
                    arrayList.addAll(arrayList2);
                }
                StringBuilder sbP = q0.p(transHistoryReq.beginYear, "fetchData2: ", transHistoryReq.beginMonth, "/", " noDataCount ");
                int i10 = this.f41483i;
                sbP.append(i10);
                F6.d.h("TAG", 3, sbP.toString());
                if (arrayList.size() < 10 && i10 < 3) {
                    TransHistoryReq transHistoryReq2 = new TransHistoryReq();
                    int i11 = transHistoryReq.beginYear;
                    transHistoryReq2.beginYear = i11;
                    int i12 = transHistoryReq.beginMonth;
                    transHistoryReq2.beginMonth = i12 - 2;
                    transHistoryReq2.beginTime = f.e(i11, i12 - 3);
                    transHistoryReq2.endTime = f.e(transHistoryReq2.beginYear, transHistoryReq2.beginMonth + 1);
                    transHistoryReq2.pageNum = 1;
                    transHistoryReq2.pageSize = 10;
                    transHistoryReq2.transType = transHistoryReq.transType;
                    transHistoryReq2.status = transHistoryReq.status;
                    transHistoryReq2.inOutFlag = transHistoryReq.inOutFlag;
                    fVar.d(transHistoryReq2, i10 + 1, z3);
                    return;
                }
                if (transHistoryReq.pageNum == 1 && arrayList.size() == 0 && !z3) {
                    IBaseView iBaseView = fVar.f27351a;
                    if (iBaseView != null) {
                        MoneyTransferHistoryFragment moneyTransferHistoryFragment = (MoneyTransferHistoryFragment) iBaseView;
                        List list3 = moneyTransferHistoryFragment.w().f4985b;
                        if (list3 != null) {
                            list3.clear();
                        }
                        moneyTransferHistoryFragment.w().notifyDataSetChanged();
                        int iN0 = r0.N0(System.currentTimeMillis());
                        int i13 = moneyTransferHistoryFragment.f33675M;
                        t tVar = moneyTransferHistoryFragment.f33679p;
                        if (iN0 == i13) {
                            TextView textView = (TextView) tVar.getValue();
                            if (textView != null) {
                                textView.setText(r0.i0(moneyTransferHistoryFragment.f33674L - 1));
                            }
                        } else {
                            TextView textView2 = (TextView) tVar.getValue();
                            if (textView2 != null) {
                                textView2.setText(r0.i0(moneyTransferHistoryFragment.f33674L - 1) + " " + moneyTransferHistoryFragment.f33675M);
                            }
                        }
                        TextView textViewY = moneyTransferHistoryFragment.y();
                        if (textViewY != null) {
                            textViewY.setVisibility(0);
                        }
                        TextView textViewX2 = moneyTransferHistoryFragment.x();
                        if (textViewX2 != null) {
                            textViewX2.setVisibility(0);
                        }
                        int i14 = moneyTransferHistoryFragment.f33672C;
                        if (i14 == 1) {
                            TextView textViewY2 = moneyTransferHistoryFragment.y();
                            if (textViewY2 != null) {
                                textViewY2.setVisibility(8);
                            }
                        } else if (i14 == 2 && (textViewX = moneyTransferHistoryFragment.x()) != null) {
                            textViewX.setVisibility(8);
                        }
                        TextView textViewX3 = moneyTransferHistoryFragment.x();
                        if (textViewX3 != null) {
                            textViewX3.setText(G.i("In  ").setForegroundColor(moneyTransferHistoryFragment.requireContext().getColor(b.sm_color_858a8f)).append("0.00").create());
                        }
                        TextView textViewY3 = moneyTransferHistoryFragment.y();
                        if (textViewY3 != null) {
                            textViewY3.setText(G.i("Out  ").setForegroundColor(moneyTransferHistoryFragment.requireContext().getColor(b.sm_color_858a8f)).append("0.00").create());
                        }
                        LinearLayout linearLayoutV = moneyTransferHistoryFragment.v();
                        if (linearLayoutV != null) {
                            linearLayoutV.setVisibility(0);
                            return;
                        }
                        return;
                    }
                    return;
                }
            } else {
                ToastUtils.showLong(transHistoryRsp.getRespMsg(), new Object[0]);
            }
            if (fVar.f27351a != null) {
                ArrayList arrayList4 = fVar.f41492f;
                int size3 = arrayList4.size();
                ArrayList arrayList5 = fVar.f41491e;
                if (size3 > 0) {
                    Intrinsics.e(arrayList5);
                    arrayList5.addAll(arrayList4);
                    arrayList4.clear();
                }
                IBaseView iBaseView2 = fVar.f27351a;
                Intrinsics.e(iBaseView2);
                ((MoneyTransferHistoryContract.View) iBaseView2).showTransactionData(z3, arrayList5);
                IBaseView iBaseView3 = fVar.f27351a;
                Intrinsics.e(iBaseView3);
                ((MoneyTransferHistoryContract.View) iBaseView3).stopLoadMore();
            }
        }
    }
}
