package Ua;

import android.view.View;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.transsnet.palmpay.core.bean.CommonListResultV2;
import com.transsnet.palmpay.core.viewmodel.OneTimeCodeV3View;
import com.transsnet.palmpay.core.viewmodel.OneTimeCodeV4View;
import com.transsnet.palmpay.credit.bean.resp.CLHistoryBillData;
import com.transsnet.palmpay.credit.bean.resp.CLHistoryBillDetail;
import com.transsnet.palmpay.credit.bean.resp.CLHistoryBillResp;
import com.transsnet.palmpay.credit.bean.resp.OcHistoryBillListData;
import com.transsnet.palmpay.credit.bean.resp.OcHistoryBillListDetail;
import com.transsnet.palmpay.credit.bean.resp.OcHistoryBillListResp;
import com.transsnet.palmpay.credit.bean.rsp.OcRepaidListData;
import com.transsnet.palmpay.credit.bean.rsp.OcRepaidListDetail;
import com.transsnet.palmpay.credit.bean.rsp.OcRepaidListResp;
import com.transsnet.palmpay.credit.ui.activity.okcard.OcBillDetailActivity;
import com.transsnet.palmpay.credit.ui.activity.okcard.OcBillHistoryActivity;
import com.transsnet.palmpay.credit.ui.activity.okcard.OcRepaidListActivity;
import com.transsnet.palmpay.credit.ui.fragment.CLBorrowListFragment;
import com.transsnet.palmpay.credit.ui.fragment.CLRepaymentListFragment;
import com.transsnet.palmpay.credit.ui.fragment.OcBillFragment;
import com.transsnet.palmpay.util.ToastUtils;
import io.reactivex.disposables.Disposable;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import p368yb.C2144l;
import p368yb.C2146n;

/* JADX INFO: loaded from: classes3.dex */
public final class n0 extends Z4.e {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f9437f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ boolean f9438g;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ Object f9439i;

    public /* synthetic */ n0(Object obj, boolean z3, int i7) {
        this.f9437f = i7;
        this.f9439i = obj;
        this.f9438g = z3;
    }

    @Override // io.reactivex.Observer
    public final void onSubscribe(Disposable d2) {
        switch (this.f9437f) {
            case 0:
                OneTimeCodeV3View oneTimeCodeV3View = (OneTimeCodeV3View) this.f9439i;
                if (oneTimeCodeV3View.f28476o == null) {
                    oneTimeCodeV3View.f28476o = new p103gf.a();
                }
                oneTimeCodeV3View.f28476o.add(d2);
                break;
            case 1:
                OneTimeCodeV4View oneTimeCodeV4View = (OneTimeCodeV4View) this.f9439i;
                if (oneTimeCodeV4View.f28490j == null) {
                    oneTimeCodeV4View.f28490j = new p103gf.a();
                }
                oneTimeCodeV4View.f28490j.add(d2);
                break;
            case 2:
                Intrinsics.checkNotNullParameter(d2, "d");
                ((OcBillDetailActivity) this.f9439i).addSubscription(d2);
                break;
            case 3:
                Intrinsics.checkNotNullParameter(d2, "d");
                ((OcBillHistoryActivity) this.f9439i).addSubscription(d2);
                break;
            case 4:
                Intrinsics.checkNotNullParameter(d2, "d");
                ((OcRepaidListActivity) this.f9439i).addSubscription(d2);
                break;
            case 5:
                Intrinsics.checkNotNullParameter(d2, "d");
                ((CLBorrowListFragment) this.f9439i).f(d2);
                break;
            case 6:
                Intrinsics.checkNotNullParameter(d2, "d");
                ((CLRepaymentListFragment) this.f9439i).f(d2);
                break;
            default:
                Intrinsics.checkNotNullParameter(d2, "d");
                ((OcBillFragment) this.f9439i).f(d2);
                break;
        }
    }

    @Override // Z4.e
    public final void w(String message) {
        boolean z3 = this.f9438g;
        Object obj = this.f9439i;
        switch (this.f9437f) {
            case 0:
                ToastUtils.showLong(message);
                if (z3) {
                    OneTimeCodeV3View oneTimeCodeV3View = (OneTimeCodeV3View) obj;
                    oneTimeCodeV3View.f28473g.setVisibility(8);
                    oneTimeCodeV3View.f28470d.setVisibility(0);
                    oneTimeCodeV3View.g();
                }
                break;
            case 1:
                ToastUtils.showLong(message);
                if (z3) {
                    int i7 = OneTimeCodeV4View.f28480B;
                    OneTimeCodeV4View oneTimeCodeV4View = (OneTimeCodeV4View) obj;
                    oneTimeCodeV4View.j(false);
                    oneTimeCodeV4View.l();
                    oneTimeCodeV4View.k();
                }
                break;
            case 2:
                Intrinsics.checkNotNullParameter(message, "message");
                OcBillDetailActivity ocBillDetailActivity = (OcBillDetailActivity) obj;
                ocBillDetailActivity.t--;
                ToastUtils.showShort(message, new Object[0]);
                ocBillDetailActivity.n().setVisibility(0);
                break;
            case 3:
                Intrinsics.checkNotNullParameter(message, "message");
                OcBillHistoryActivity ocBillHistoryActivity = (OcBillHistoryActivity) obj;
                ocBillHistoryActivity.f29361g--;
                ToastUtils.showShort(message, new Object[0]);
                ocBillHistoryActivity.n().setVisibility(0);
                break;
            case 4:
                Intrinsics.checkNotNullParameter(message, "message");
                ((OcRepaidListActivity) obj).f29702o--;
                ToastUtils.showShort(message, new Object[0]);
                break;
            case 5:
                Intrinsics.checkNotNullParameter(message, "message");
                CLBorrowListFragment cLBorrowListFragment = (CLBorrowListFragment) obj;
                cLBorrowListFragment.showLoadingDialog(false);
                cLBorrowListFragment.t--;
                ToastUtils.showShort(message, new Object[0]);
                break;
            case 6:
                Intrinsics.checkNotNullParameter(message, "message");
                CLRepaymentListFragment cLRepaymentListFragment = (CLRepaymentListFragment) obj;
                cLRepaymentListFragment.showLoadingDialog(false);
                cLRepaymentListFragment.t--;
                ToastUtils.showShort(message, new Object[0]);
                break;
            default:
                Intrinsics.checkNotNullParameter(message, "message");
                ((OcBillFragment) obj).f30384I0--;
                ToastUtils.showShort(message, new Object[0]);
                break;
        }
    }

    /* JADX WARN: Code duplicated, block: B:103:0x0159  */
    /* JADX WARN: Code duplicated, block: B:69:0x00e0  */
    /* JADX WARN: Code duplicated, block: B:71:0x00e4  */
    /* JADX WARN: Code duplicated, block: B:73:0x00ea  */
    /* JADX WARN: Code duplicated, block: B:74:0x00f2  */
    /* JADX WARN: Code duplicated, block: B:77:0x0106  */
    @Override // Z4.e
    public final void y(Object obj) {
        Long total;
        Long total2;
        Long total3;
        TextView textView;
        Long total4;
        TextView textView2;
        Long total5;
        ArrayList arrayList;
        C2144l c2144l;
        Long total6;
        long jLongValue = -1;
        boolean z3 = this.f9438g;
        Object obj2 = this.f9439i;
        switch (this.f9437f) {
            case 0:
                CommonListResultV2 commonListResultV2 = (CommonListResultV2) obj;
                OneTimeCodeV3View oneTimeCodeV3View = (OneTimeCodeV3View) obj2;
                if (z3) {
                    oneTimeCodeV3View.f28473g.setVisibility(8);
                    oneTimeCodeV3View.f28470d.setVisibility(0);
                }
                if (commonListResultV2.isSuccess()) {
                    oneTimeCodeV3View.f28478v = commonListResultV2.data;
                }
                if (z3) {
                    int i7 = OneTimeCodeV3View.f28465B;
                    oneTimeCodeV3View.g();
                    return;
                }
                return;
            case 1:
                CommonListResultV2 commonListResultV3 = (CommonListResultV2) obj;
                OneTimeCodeV4View oneTimeCodeV4View = (OneTimeCodeV4View) obj2;
                if (z3) {
                    int i10 = OneTimeCodeV4View.f28480B;
                    oneTimeCodeV4View.j(false);
                    oneTimeCodeV4View.l();
                }
                if (commonListResultV3.isSuccess()) {
                    oneTimeCodeV4View.t = commonListResultV3.data;
                }
                if (z3) {
                    int i11 = OneTimeCodeV4View.f28480B;
                    oneTimeCodeV4View.k();
                    return;
                }
                return;
            case 2:
                OcRepaidListResp ocRepaidListResp = (OcRepaidListResp) obj;
                OcBillDetailActivity ocBillDetailActivity = (OcBillDetailActivity) obj2;
                if (ocRepaidListResp == null || !ocRepaidListResp.isSuccess()) {
                    ocBillDetailActivity.t--;
                    ToastUtils.showShort(ocRepaidListResp != null ? ocRepaidListResp.getRespMsg() : null, new Object[0]);
                } else {
                    OcRepaidListData data = ocRepaidListResp.getData();
                    if (data != null && (total = data.getTotal()) != null) {
                        jLongValue = total.longValue();
                    }
                    ocBillDetailActivity.f29355v = jLongValue;
                    if (z3) {
                        ArrayList arrayList2 = ocBillDetailActivity.f29353o;
                        if (arrayList2 == null) {
                            Intrinsics.n("mData");
                            throw null;
                        }
                        arrayList2.clear();
                    }
                    OcRepaidListData data2 = ocRepaidListResp.getData();
                    List<OcRepaidListDetail> list = data2 != null ? data2.getList() : null;
                    if (list != null && !list.isEmpty()) {
                        ArrayList arrayList3 = ocBillDetailActivity.f29353o;
                        if (arrayList3 == null) {
                            Intrinsics.n("mData");
                            throw null;
                        }
                        OcRepaidListData data3 = ocRepaidListResp.getData();
                        List<OcRepaidListDetail> list2 = data3 != null ? data3.getList() : null;
                        Intrinsics.e(list2);
                        arrayList3.addAll(list2);
                    }
                    C2144l c2144l2 = ocBillDetailActivity.f29354p;
                    if (c2144l2 == null) {
                        Intrinsics.n("mAdapter");
                        throw null;
                    }
                    c2144l2.notifyDataSetChanged();
                }
                int i12 = OcBillDetailActivity.f29342L;
                ocBillDetailActivity.n().setVisibility(0);
                return;
            case 3:
                OcHistoryBillListResp ocHistoryBillListResp = (OcHistoryBillListResp) obj;
                OcBillHistoryActivity ocBillHistoryActivity = (OcBillHistoryActivity) obj2;
                if (ocHistoryBillListResp == null || !ocHistoryBillListResp.isSuccess()) {
                    ocBillHistoryActivity.f29361g--;
                    ToastUtils.showShort(ocHistoryBillListResp != null ? ocHistoryBillListResp.getRespMsg() : null, new Object[0]);
                } else {
                    OcHistoryBillListData data4 = ocHistoryBillListResp.getData();
                    if (data4 != null && (total2 = data4.getTotal()) != null) {
                        jLongValue = total2.longValue();
                    }
                    ocBillHistoryActivity.f29362i = jLongValue;
                    if (z3) {
                        ArrayList arrayList4 = ocBillHistoryActivity.f29359e;
                        if (arrayList4 == null) {
                            Intrinsics.n("mData");
                            throw null;
                        }
                        arrayList4.clear();
                    }
                    OcHistoryBillListData data5 = ocHistoryBillListResp.getData();
                    List<OcHistoryBillListDetail> list3 = data5 != null ? data5.getList() : null;
                    if (list3 != null && !list3.isEmpty()) {
                        ArrayList arrayList5 = ocBillHistoryActivity.f29359e;
                        if (arrayList5 == null) {
                            Intrinsics.n("mData");
                            throw null;
                        }
                        OcHistoryBillListData data6 = ocHistoryBillListResp.getData();
                        List<OcHistoryBillListDetail> list4 = data6 != null ? data6.getList() : null;
                        Intrinsics.e(list4);
                        arrayList5.addAll(list4);
                    }
                    C2146n c2146n = ocBillHistoryActivity.f29360f;
                    if (c2146n == null) {
                        Intrinsics.n("mAdapter");
                        throw null;
                    }
                    c2146n.notifyDataSetChanged();
                }
                int i13 = OcBillHistoryActivity.f29357j;
                ocBillHistoryActivity.n().setVisibility(0);
                return;
            case 4:
                OcRepaidListResp ocRepaidListResp2 = (OcRepaidListResp) obj;
                OcRepaidListActivity ocRepaidListActivity = (OcRepaidListActivity) obj2;
                if (ocRepaidListResp2 == null || !ocRepaidListResp2.isSuccess()) {
                    ocRepaidListActivity.f29702o--;
                    ToastUtils.showShort(ocRepaidListResp2 != null ? ocRepaidListResp2.getRespMsg() : null, new Object[0]);
                    return;
                }
                OcRepaidListData data7 = ocRepaidListResp2.getData();
                if (data7 != null && (total3 = data7.getTotal()) != null) {
                    jLongValue = total3.longValue();
                }
                ocRepaidListActivity.f29703p = jLongValue;
                if (z3) {
                    ArrayList arrayList6 = ocRepaidListActivity.f29699g;
                    if (arrayList6 == null) {
                        Intrinsics.n("mData");
                        throw null;
                    }
                    arrayList6.clear();
                }
                OcRepaidListData data8 = ocRepaidListResp2.getData();
                List<OcRepaidListDetail> list5 = data8 != null ? data8.getList() : null;
                if (list5 != null && !list5.isEmpty()) {
                    ArrayList arrayList7 = ocRepaidListActivity.f29699g;
                    if (arrayList7 == null) {
                        Intrinsics.n("mData");
                        throw null;
                    }
                    OcRepaidListData data9 = ocRepaidListResp2.getData();
                    List<OcRepaidListDetail> list6 = data9 != null ? data9.getList() : null;
                    Intrinsics.e(list6);
                    arrayList7.addAll(list6);
                }
                p368yb.W w3 = ocRepaidListActivity.f29700i;
                if (w3 != null) {
                    w3.notifyDataSetChanged();
                    return;
                } else {
                    Intrinsics.n("mAdapter");
                    throw null;
                }
            case 5:
                CLHistoryBillResp cLHistoryBillResp = (CLHistoryBillResp) obj;
                CLBorrowListFragment cLBorrowListFragment = (CLBorrowListFragment) obj2;
                cLBorrowListFragment.showLoadingDialog(false);
                if (cLHistoryBillResp == null || !cLHistoryBillResp.isSuccess()) {
                    cLBorrowListFragment.t--;
                    ToastUtils.showShort(cLHistoryBillResp != null ? cLHistoryBillResp.getRespMsg() : null, new Object[0]);
                    return;
                }
                CLHistoryBillData data10 = cLHistoryBillResp.getData();
                if (data10 != null && (total4 = data10.getTotal()) != null) {
                    jLongValue = total4.longValue();
                }
                cLBorrowListFragment.f30237v = jLongValue;
                if (z3) {
                    ArrayList arrayList8 = cLBorrowListFragment.f30235o;
                    if (arrayList8 == null) {
                        Intrinsics.n("mData");
                        throw null;
                    }
                    arrayList8.clear();
                }
                CLHistoryBillData data11 = cLHistoryBillResp.getData();
                List<CLHistoryBillDetail> list7 = data11 != null ? data11.getList() : null;
                p355xf.t tVar = cLBorrowListFragment.f30233i;
                if (list7 != null && !list7.isEmpty()) {
                    ArrayList arrayList9 = cLBorrowListFragment.f30235o;
                    if (arrayList9 == null) {
                        Intrinsics.n("mData");
                        throw null;
                    }
                    CLHistoryBillData data12 = cLHistoryBillResp.getData();
                    List<CLHistoryBillDetail> list8 = data12 != null ? data12.getList() : null;
                    Intrinsics.e(list8);
                    arrayList9.addAll(list8);
                    RecyclerView recyclerViewT = cLBorrowListFragment.t();
                    if (recyclerViewT != null) {
                        recyclerViewT.setVisibility(0);
                    }
                    View view = (View) tVar.getValue();
                    if (view != null) {
                        view.setVisibility(8);
                    }
                } else if (z3) {
                    RecyclerView recyclerViewT2 = cLBorrowListFragment.t();
                    if (recyclerViewT2 != null) {
                        recyclerViewT2.setVisibility(8);
                    }
                    View view2 = (View) tVar.getValue();
                    if (view2 != null) {
                        view2.setVisibility(0);
                    }
                    View view3 = (View) tVar.getValue();
                    if (view3 != null && (textView = (TextView) view3.findViewById(Ya.e.tvTips)) != null) {
                        textView.setText("No Loan Records");
                    }
                }
                p351xb.f fVar = cLBorrowListFragment.f30236p;
                if (fVar != null) {
                    fVar.notifyDataSetChanged();
                    return;
                } else {
                    Intrinsics.n("mAdapter");
                    throw null;
                }
            case 6:
                OcRepaidListResp ocRepaidListResp3 = (OcRepaidListResp) obj;
                CLRepaymentListFragment cLRepaymentListFragment = (CLRepaymentListFragment) obj2;
                cLRepaymentListFragment.showLoadingDialog(false);
                if (ocRepaidListResp3 == null || !ocRepaidListResp3.isSuccess()) {
                    cLRepaymentListFragment.t--;
                    ToastUtils.showShort(ocRepaidListResp3 != null ? ocRepaidListResp3.getRespMsg() : null, new Object[0]);
                    return;
                }
                OcRepaidListData data13 = ocRepaidListResp3.getData();
                if (data13 != null && (total5 = data13.getTotal()) != null) {
                    jLongValue = total5.longValue();
                }
                cLRepaymentListFragment.f30330v = jLongValue;
                if (z3) {
                    ArrayList arrayList10 = cLRepaymentListFragment.f30328o;
                    if (arrayList10 == null) {
                        Intrinsics.n("mData");
                        throw null;
                    }
                    arrayList10.clear();
                }
                OcRepaidListData data14 = ocRepaidListResp3.getData();
                List<OcRepaidListDetail> list9 = data14 != null ? data14.getList() : null;
                p355xf.t tVar2 = cLRepaymentListFragment.f30327j;
                if (list9 != null && !list9.isEmpty()) {
                    ArrayList arrayList11 = cLRepaymentListFragment.f30328o;
                    if (arrayList11 == null) {
                        Intrinsics.n("mData");
                        throw null;
                    }
                    OcRepaidListData data15 = ocRepaidListResp3.getData();
                    List<OcRepaidListDetail> list10 = data15 != null ? data15.getList() : null;
                    Intrinsics.e(list10);
                    arrayList11.addAll(list10);
                    RecyclerView recyclerViewU = cLRepaymentListFragment.u();
                    if (recyclerViewU != null) {
                        recyclerViewU.setVisibility(0);
                    }
                    View view4 = (View) tVar2.getValue();
                    if (view4 != null) {
                        view4.setVisibility(8);
                    }
                } else if (z3) {
                    RecyclerView recyclerViewU2 = cLRepaymentListFragment.u();
                    if (recyclerViewU2 != null) {
                        recyclerViewU2.setVisibility(8);
                    }
                    View view5 = (View) tVar2.getValue();
                    if (view5 != null) {
                        view5.setVisibility(0);
                    }
                    View view6 = (View) tVar2.getValue();
                    if (view6 != null && (textView2 = (TextView) view6.findViewById(Ya.e.tvTips)) != null) {
                        textView2.setText("No Repayment Records");
                    }
                }
                p351xb.v vVar = cLRepaymentListFragment.f30329p;
                if (vVar != null) {
                    vVar.notifyDataSetChanged();
                    return;
                } else {
                    Intrinsics.n("mAdapter");
                    throw null;
                }
            default:
                OcRepaidListResp ocRepaidListResp4 = (OcRepaidListResp) obj;
                OcBillFragment ocBillFragment = (OcBillFragment) obj2;
                if (ocRepaidListResp4 == null || !ocRepaidListResp4.isSuccess()) {
                    ocBillFragment.f30384I0--;
                    ToastUtils.showShort(ocRepaidListResp4 != null ? ocRepaidListResp4.getRespMsg() : null, new Object[0]);
                    return;
                }
                OcRepaidListData data16 = ocRepaidListResp4.getData();
                if (data16 != null && (total6 = data16.getTotal()) != null) {
                    jLongValue = total6.longValue();
                }
                ocBillFragment.f30385J0 = jLongValue;
                if (z3) {
                    ArrayList arrayList12 = ocBillFragment.f30377C0;
                    if (arrayList12 == null) {
                        Intrinsics.n("mListData");
                        throw null;
                    }
                    arrayList12.clear();
                    ArrayList arrayList13 = ocBillFragment.f30378D0;
                    if (arrayList13 == null) {
                        Intrinsics.n("mInstalmentListData");
                        throw null;
                    }
                    arrayList13.clear();
                }
                OcRepaidListData data17 = ocRepaidListResp4.getData();
                List<OcRepaidListDetail> list11 = data17 != null ? data17.getList() : null;
                if (list11 != null && !list11.isEmpty()) {
                    OcRepaidListData data18 = ocRepaidListResp4.getData();
                    List<OcRepaidListDetail> list12 = data18 != null ? data18.getList() : null;
                    Intrinsics.e(list12);
                    for (OcRepaidListDetail ocRepaidListDetail : list12) {
                        Integer operationType = ocRepaidListDetail.getOperationType();
                        int i14 = Integer.parseInt("99");
                        if (operationType != null && operationType.intValue() == i14) {
                            ArrayList arrayList14 = ocBillFragment.f30378D0;
                            if (arrayList14 == null) {
                                Intrinsics.n("mInstalmentListData");
                                throw null;
                            }
                            arrayList14.add(ocRepaidListDetail);
                        } else {
                            ArrayList arrayList15 = ocBillFragment.f30377C0;
                            if (arrayList15 == null) {
                                Intrinsics.n("mListData");
                                throw null;
                            }
                            arrayList15.add(ocRepaidListDetail);
                        }
                    }
                }
                if (Intrinsics.c(ocBillFragment.f30386K0, "99")) {
                    ocBillFragment.B().setVisibility(8);
                } else {
                    ArrayList arrayList16 = ocBillFragment.f30377C0;
                    if (arrayList16 == null) {
                        Intrinsics.n("mListData");
                        throw null;
                    }
                    if (arrayList16.isEmpty()) {
                        ArrayList arrayList17 = ocBillFragment.f30378D0;
                        if (arrayList17 == null) {
                            Intrinsics.n("mInstalmentListData");
                            throw null;
                        }
                        if (arrayList17.isEmpty()) {
                            arrayList = ocBillFragment.f30377C0;
                            if (arrayList != null) {
                                Intrinsics.n("mListData");
                                throw null;
                            }
                            if (arrayList.isEmpty()) {
                                ocBillFragment.B().setBackground(null);
                            } else {
                                ocBillFragment.B().setBackgroundResource(com.transsnet.palmpay.custom_view.r.cv_shape_rect_corner_12_bg_white);
                            }
                            ocBillFragment.B().setVisibility(0);
                            c2144l = ocBillFragment.f30379E0;
                            if (c2144l != null) {
                                c2144l.notifyDataSetChanged();
                            }
                        } else {
                            ocBillFragment.B().setVisibility(8);
                        }
                    } else {
                        arrayList = ocBillFragment.f30377C0;
                        if (arrayList != null) {
                            Intrinsics.n("mListData");
                            throw null;
                        }
                        if (arrayList.isEmpty()) {
                            ocBillFragment.B().setBackground(null);
                        } else {
                            ocBillFragment.B().setBackgroundResource(com.transsnet.palmpay.custom_view.r.cv_shape_rect_corner_12_bg_white);
                        }
                        ocBillFragment.B().setVisibility(0);
                        c2144l = ocBillFragment.f30379E0;
                        if (c2144l != null) {
                            c2144l.notifyDataSetChanged();
                        }
                    }
                }
                if (!Intrinsics.c(ocBillFragment.f30386K0, "99")) {
                    ArrayList arrayList18 = ocBillFragment.f30378D0;
                    if (arrayList18 == null) {
                        Intrinsics.n("mInstalmentListData");
                        throw null;
                    }
                    if (arrayList18.isEmpty()) {
                        RecyclerView recyclerViewC = ocBillFragment.C();
                        if (recyclerViewC != null) {
                            recyclerViewC.setVisibility(8);
                            return;
                        }
                        return;
                    }
                }
                ArrayList arrayList19 = ocBillFragment.f30378D0;
                if (arrayList19 == null) {
                    Intrinsics.n("mInstalmentListData");
                    throw null;
                }
                if (arrayList19.isEmpty()) {
                    ocBillFragment.C().setBackground(null);
                } else {
                    ocBillFragment.C().setBackgroundResource(com.transsnet.palmpay.custom_view.r.cv_shape_rect_corner_12_bg_white);
                }
                RecyclerView recyclerViewC2 = ocBillFragment.C();
                if (recyclerViewC2 != null) {
                    recyclerViewC2.setVisibility(0);
                }
                C2144l c2144l3 = ocBillFragment.f30380F0;
                if (c2144l3 != null) {
                    c2144l3.notifyDataSetChanged();
                    return;
                }
                return;
        }
    }
}
