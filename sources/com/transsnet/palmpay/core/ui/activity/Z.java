package com.transsnet.palmpay.core.ui.activity;

import Ad.C0058e;
import Pa.i0;
import Qc.C0566g;
import android.content.Intent;
import android.net.Uri;
import android.text.TextUtils;
import android.view.View;
import androidx.core.util.Predicate;
import androidx.recyclerview.widget.RecyclerView;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import com.alibaba.android.arouter.launcher.ARouter;
import com.chad.library.adapter.base.listener.OnItemClickListener;
import com.facebook.cache.common.CacheKey;
import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.android.gms.tasks.Task;
import com.google.android.play.core.review.ReviewInfo;
import com.transsnet.palmpay.account.ui.activity.PalmPayLevelV2Activity;
import com.transsnet.palmpay.account.ui.viewmodel.PalmPayLevelViewModel;
import com.transsnet.palmpay.airtime.bean.R2CHistoryItemListBean;
import com.transsnet.palmpay.core.base.BaseActivity;
import com.transsnet.palmpay.core.bean.AccountFlowBean;
import com.transsnet.palmpay.core.bean.CouponItem;
import com.transsnet.palmpay.core.bean.bill.TransType;
import com.transsnet.palmpay.core.callback.Argument2Callback;
import com.transsnet.palmpay.credit.ui.dialog.AvailableCouponListDialogFragment;
import com.transsnet.palmpay.credit.ui.dialog.CLFillYourInformationDialogFragment;
import com.transsnet.palmpay.credit.ui.dialog.CreditApplicationDialogFragment;
import com.transsnet.palmpay.credit.ui.dialog.DownloadCashPageDialogFragment;
import com.transsnet.palmpay.credit.ui.dialog.PreferredLanguageDialog;
import com.transsnet.palmpay.custom_view.adapter.BaseRecyclerViewAdapter$ItemViewOnClickListener;
import com.transsnet.palmpay.custom_view.bean.OrderDetailItemBean;
import com.transsnet.palmpay.custom_view.dialog.PickStateDialogFragment;
import com.transsnet.palmpay.custom_view.interfac.OnOrderDetailItemClickListener;
import com.transsnet.palmpay.custom_view.wheelview.widget.WheelView;
import com.transsnet.palmpay.main.export.bean.rsp.GetUserAssetsAmountV2Resp;
import com.transsnet.palmpay.managemoney.bean.req.QueryOrderNoReq;
import com.transsnet.palmpay.managemoney.bean.resp.QueryCashBoxTransactionListResp;
import com.transsnet.palmpay.managemoney.ui.fragment.CashBoxMainFragment;
import com.transsnet.palmpay.managemoney.ui.fragment.CashBoxTransactionHistoryFragment;
import com.transsnet.palmpay.managemoney.ui.viewmodel.CashBoxTransactionHistoryViewModel;
import com.transsnet.palmpay.managemoney.ui.viewmodel.CashBoxViewModel;
import com.transsnet.palmpay.r2c.ui.activity.Recharge2CashDetailActivity;
import com.transsnet.palmpay.r2c.ui.activity.Recharge2CashRecordActivity;
import com.transsnet.palmpay.ui.activity.MyAssetsActivity;
import com.transsnet.palmpay.ui.activity.PalmPayStatementActivity;
import com.transsnet.palmpay.ui.activity.RateAppActivity;
import com.transsnet.palmpay.util.ActivityUtils;
import com.transsnet.palmpay.viewmodule.MyAssetsViewModel;
import io.reactivex.functions.Action;
import io.reactivex.functions.Consumer;
import io.reactivex.functions.Function;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class Z implements GoogleMap.OnMapClickListener, BaseRecyclerViewAdapter$ItemViewOnClickListener, Function, Consumer, Action, OnItemClickListener, WheelView.OnWheelItemClickListener, com.transsnet.palmpay.custom_view.interfac.OnItemClickListener, OnSuccessListener, OnOrderDetailItemClickListener, Predicate, com.facebook.common.internal.Predicate, Argument2Callback, SwipeRefreshLayout.OnRefreshListener, OnCompleteListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f27736a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f27737b;

    public /* synthetic */ Z(Object obj, int i7) {
        this.f27736a = i7;
        this.f27737b = obj;
    }

    @Override // com.transsnet.palmpay.custom_view.adapter.BaseRecyclerViewAdapter$ItemViewOnClickListener
    public void OnItemViewOnClick(View view, Object obj, RecyclerView.ViewHolder viewHolder) {
        Object obj2 = this.f27737b;
        switch (this.f27736a) {
            case 1:
                CouponItem data = (CouponItem) obj;
                AvailableCouponListDialogFragment.a aVar = AvailableCouponListDialogFragment.f29932H;
                Intrinsics.checkNotNullParameter(view, "view");
                Intrinsics.checkNotNullParameter(data, "data");
                if (view.getId() == p025ba.e.llDetailArrow) {
                    data.layoutExpand = !data.layoutExpand;
                    ((p052da.I) ((AvailableCouponListDialogFragment) obj2).f29933C.getValue()).notifyDataSetChanged();
                }
                break;
            default:
                AccountFlowBean.DataBean.ListBean listBean = (AccountFlowBean.DataBean.ListBean) obj;
                int i7 = PalmPayStatementActivity.f34505Q;
                PalmPayStatementActivity palmPayStatementActivity = (PalmPayStatementActivity) obj2;
                palmPayStatementActivity.getClass();
                if (listBean != null && !TextUtils.isEmpty(listBean.getPayId()) && listBean.getPayId().startsWith("R_") && !"03".equals(listBean.getTransType())) {
                    ARouter.getInstance().build("/main/refund_billdetail").withString("orderNo", listBean.getRemark()).withString("extra_data", listBean.getTransType()).navigation();
                } else if (!TextUtils.isEmpty(listBean.getPayId())) {
                    ((Fe.Q) palmPayStatementActivity.f27350a).queryOrderNoByPayId(listBean.getPayId());
                }
                break;
        }
    }

    @Override // io.reactivex.functions.Consumer
    public void accept(Object obj) {
        Object obj2 = this.f27737b;
        switch (this.f27736a) {
            case 3:
                CLFillYourInformationDialogFragment.a aVar = CLFillYourInformationDialogFragment.f29940M;
                ((p010a9.m) obj2).invoke(obj);
                break;
            case 4:
                CLFillYourInformationDialogFragment.a aVar2 = CLFillYourInformationDialogFragment.f29940M;
                ((com.facebook.react.packagerconnection.a) obj2).invoke(obj);
                break;
            case 5:
            case 6:
            case 9:
            case 10:
            default:
                DownloadCashPageDialogFragment.a aVar3 = DownloadCashPageDialogFragment.f29959L;
                ((com.facebook.react.packagerconnection.a) obj2).invoke(obj);
                break;
            case 7:
                CreditApplicationDialogFragment.a aVar4 = CreditApplicationDialogFragment.f29952L;
                ((C0058e) obj2).invoke(obj);
                break;
            case 8:
                CreditApplicationDialogFragment.a aVar5 = CreditApplicationDialogFragment.f29952L;
                ((com.facebook.react.packagerconnection.a) obj2).invoke(obj);
                break;
            case 11:
                DownloadCashPageDialogFragment.a aVar6 = DownloadCashPageDialogFragment.f29959L;
                ((p010a9.m) obj2).invoke(obj);
                break;
        }
    }

    @Override // io.reactivex.functions.Function
    public Object apply(Object p3) {
        Object obj = this.f27737b;
        switch (this.f27736a) {
            case 2:
                CLFillYourInformationDialogFragment.a aVar = CLFillYourInformationDialogFragment.f29940M;
                Intrinsics.checkNotNullParameter(p3, "p0");
                break;
            case 6:
                CreditApplicationDialogFragment.a aVar2 = CreditApplicationDialogFragment.f29952L;
                Intrinsics.checkNotNullParameter(p3, "p0");
                break;
            default:
                DownloadCashPageDialogFragment.a aVar3 = DownloadCashPageDialogFragment.f29959L;
                Intrinsics.checkNotNullParameter(p3, "p0");
                break;
        }
        return (Long) ((com.facebook.react.packagerconnection.a) obj).invoke(p3);
    }

    @Override // com.transsnet.palmpay.core.callback.Argument2Callback
    public void invoke(Object obj, Object obj2) {
        PalmPayLevelViewModel palmPayLevelViewModel;
        Intent intent = (Intent) obj2;
        if (((Integer) obj).intValue() == -1) {
            String stringExtra = intent != null ? intent.getStringExtra("extra_data") : "";
            BaseActivity baseActivity = (BaseActivity) this.f27737b;
            if (!(baseActivity instanceof PalmPayLevelV2Activity) || TextUtils.isEmpty(stringExtra) || (palmPayLevelViewModel = (PalmPayLevelViewModel) ((PalmPayLevelV2Activity) baseActivity).l()) == null) {
                return;
            }
            p140j8.f.s(palmPayLevelViewModel, new p097g9.Q(stringExtra, null), palmPayLevelViewModel.f26436p, (28 & 4) != 0 ? 0L : 300L, (28 & 8) != 0, (28 & 16) == 0);
        }
    }

    @Override // com.transsnet.palmpay.custom_view.interfac.OnOrderDetailItemClickListener
    public void onClick(OrderDetailItemBean it) {
        int i7 = Recharge2CashDetailActivity.f33114f;
        Intrinsics.checkNotNullParameter(it, "it");
        Integer style = it.getStyle();
        if (style != null && style.intValue() == 1004) {
            ActivityUtils.startActivity(Pa.F.a((Recharge2CashDetailActivity) this.f27737b, it.getAndroidUrl()));
        }
    }

    @Override // com.google.android.gms.tasks.OnCompleteListener
    public void onComplete(Task task) {
        int i7 = RateAppActivity.f34559c;
        Intrinsics.checkNotNullParameter(task, "task");
        if (task.isSuccessful()) {
            ((RateAppActivity) this.f27737b).f34561b = (ReviewInfo) task.getResult();
        }
    }

    @Override // com.chad.library.adapter.base.listener.OnItemClickListener
    public void onItemClick(M1.j jVar, View view, int i7) {
        Object obj = this.f27737b;
        switch (this.f27736a) {
            case 14:
                PreferredLanguageDialog.initViews$lambda$0((PreferredLanguageDialog) obj, jVar, view, i7);
                break;
            default:
                int i10 = Recharge2CashRecordActivity.f33127g;
                Intrinsics.checkNotNullParameter(jVar, "<unused var>");
                Intrinsics.checkNotNullParameter(view, "<unused var>");
                R2CHistoryItemListBean r2CHistoryItemListBean = (R2CHistoryItemListBean) ((p069ed.c) obj).getData().get(i7);
                if (r2CHistoryItemListBean.itemType == 1) {
                    com.palmpay.lib.apm.launchcounter.util.d.H("/airtime/recharge_2_cash_detail", "orderNo", r2CHistoryItemListBean.orderNo);
                }
                break;
        }
    }

    @Override // com.google.android.gms.maps.GoogleMap.OnMapClickListener
    public void onMapClick(LatLng it) {
        int i7 = MapsActivity.f27668e;
        Intrinsics.checkNotNullParameter(it, "it");
        MapsActivity mapsActivity = (MapsActivity) this.f27737b;
        mapsActivity.f27669a = it;
        GoogleMap googleMap = mapsActivity.f27670b;
        if (googleMap != null) {
            googleMap.clear();
        }
        GoogleMap googleMap2 = mapsActivity.f27670b;
        if (googleMap2 != null) {
            googleMap2.addMarker(new MarkerOptions().position(it));
        }
        GoogleMap googleMap3 = mapsActivity.f27670b;
        if (googleMap3 != null) {
            googleMap3.animateCamera(CameraUpdateFactory.newLatLng(it));
        }
    }

    @Override // androidx.swiperefreshlayout.widget.SwipeRefreshLayout.OnRefreshListener
    public void onRefresh() {
        MyAssetsActivity myAssetsActivity = (MyAssetsActivity) this.f27737b;
        Bc.m mVar = myAssetsActivity.f34503f;
        if (mVar != null) {
            mVar.f757B.setRefreshing(true);
        }
        MyAssetsViewModel myAssetsViewModel = (MyAssetsViewModel) myAssetsActivity.l();
        myAssetsViewModel.getClass();
        p140j8.f.s(myAssetsViewModel, new Pe.Y(1, null), myAssetsViewModel.f35386f, (28 & 4) != 0 ? 0L : 300L, (28 & 8) != 0, (28 & 16) == 0);
        MyAssetsViewModel myAssetsViewModel2 = (MyAssetsViewModel) myAssetsActivity.l();
        myAssetsViewModel2.getClass();
        p140j8.f.s(myAssetsViewModel2, new Pe.X(1, null), myAssetsViewModel2.f35385e, (28 & 4) != 0 ? 0L : 300L, (28 & 8) != 0, (28 & 16) == 0);
        Bc.m mVar2 = myAssetsActivity.f34503f;
        if (mVar2 != null) {
            p220oa.h.C(mVar2.f756A);
        }
        GetUserAssetsAmountV2Resp getUserAssetsAmountV2Resp = myAssetsActivity.f34501d;
        if (getUserAssetsAmountV2Resp != null) {
            myAssetsActivity.n(getUserAssetsAmountV2Resp.savingMonthReport);
            myAssetsActivity.m(myAssetsActivity.f34501d);
        }
    }

    @Override // com.google.android.gms.tasks.OnSuccessListener
    public void onSuccess(Object obj) {
        switch (this.f27736a) {
            case 18:
                ((com.facebook.react.packagerconnection.a) this.f27737b).invoke(obj);
                break;
            case 19:
                ((C0058e) this.f27737b).invoke(obj);
                break;
            default:
                ((p010a9.m) this.f27737b).invoke(obj);
                break;
        }
    }

    @Override // io.reactivex.functions.Action
    public void run() {
        Object obj = this.f27737b;
        switch (this.f27736a) {
            case 5:
                CLFillYourInformationDialogFragment cLFillYourInformationDialogFragment = (CLFillYourInformationDialogFragment) obj;
                cLFillYourInformationDialogFragment.f29942H.invoke();
                cLFillYourInformationDialogFragment.dismiss();
                break;
            case 9:
                CreditApplicationDialogFragment creditApplicationDialogFragment = (CreditApplicationDialogFragment) obj;
                creditApplicationDialogFragment.f29954H.invoke();
                creditApplicationDialogFragment.dismiss();
                break;
            default:
                DownloadCashPageDialogFragment.a aVar = DownloadCashPageDialogFragment.f29959L;
                ((DownloadCashPageDialogFragment) obj).dismiss();
                i0.b0("https://h5.fleximfb.com/cash/download-guide");
                break;
        }
    }

    @Override // androidx.core.util.Predicate
    public boolean test(Object obj) {
        switch (this.f27736a) {
            case 23:
                return this.f27737b.equals(obj);
            default:
                return ((Predicate) this.f27737b).lambda$negate$1(obj);
        }
    }

    @Override // com.transsnet.palmpay.custom_view.wheelview.widget.WheelView.OnWheelItemClickListener
    public void onItemClick(int i7, Object obj) {
        PickStateDialogFragment pickStateDialogFragment = (PickStateDialogFragment) this.f27737b;
        PickStateDialogFragment.OnAreaSelectedListener onAreaSelectedListener = pickStateDialogFragment.f31256C;
        if (onAreaSelectedListener != null) {
            onAreaSelectedListener.onAreaSelected(obj);
            pickStateDialogFragment.dismissAllowingStateLoss();
        }
    }

    @Override // com.facebook.common.internal.Predicate
    /* JADX INFO: renamed from: apply, reason: collision with other method in class */
    public boolean mo123apply(Object obj) {
        CacheKey key = (CacheKey) obj;
        Uri uri = (Uri) this.f27737b;
        Intrinsics.checkNotNullParameter(uri, "$uri");
        Intrinsics.checkNotNullParameter(key, "key");
        return key.containsUri(uri);
    }

    @Override // com.transsnet.palmpay.custom_view.interfac.OnItemClickListener
    public void onItemClick(Object obj) {
        String customLinkAndroid;
        CashBoxTransactionHistoryViewModel cashBoxTransactionHistoryViewModel;
        String customLinkAndroid2;
        Object obj2 = this.f27737b;
        switch (this.f27736a) {
            case 16:
                QueryCashBoxTransactionListResp.CashBoxTransaction cashBoxTransaction = (QueryCashBoxTransactionListResp.CashBoxTransaction) obj;
                CashBoxMainFragment.a aVar = CashBoxMainFragment.f32383V0;
                if ("2".equals(cashBoxTransaction.getRedirect()) && !TextUtils.isEmpty(cashBoxTransaction.getOrgOrderNo())) {
                    i0.b0("/h5/transaction-router/home?transType=" + cashBoxTransaction.getOrgTransactionType() + "&orderId=" + cashBoxTransaction.getOrgOrderNo());
                    break;
                } else if ("3".equals(cashBoxTransaction.getRedirect()) && !TextUtils.isEmpty(cashBoxTransaction.getOrgOrderNo())) {
                    com.palmpay.lib.apm.launchcounter.util.d.x(p002a.a.e(new Pair("orderNo", cashBoxTransaction.getOrgOrderNo()), new Pair("transType", cashBoxTransaction.getTransType())), "CommonDetail");
                    break;
                } else {
                    CashBoxMainFragment cashBoxMainFragment = (CashBoxMainFragment) obj2;
                    if ("4".equals(cashBoxTransaction.getRedirect())) {
                        if (!TextUtils.isEmpty(cashBoxTransaction.getCustomLinkH5())) {
                            customLinkAndroid = cashBoxTransaction.getCustomLinkH5();
                        } else {
                            customLinkAndroid = cashBoxTransaction.getCustomLinkAndroid();
                        }
                        if (!TextUtils.isEmpty(customLinkAndroid)) {
                            ActivityUtils.startActivity(Pa.F.a(cashBoxMainFragment.requireContext(), customLinkAndroid));
                        }
                        break;
                    } else if ((TextUtils.equals(cashBoxTransaction.getOrgTransactionType(), TransType.TRANS_TYPE_CASH_BOX_INTEREST) || TextUtils.equals(cashBoxTransaction.getOrgTransactionType(), TransType.TRANS_TYPE_SPEND_SAVE_WITHDRAW)) && !TextUtils.isEmpty(cashBoxTransaction.getOrgOrderNo())) {
                        Ea.a.e(cashBoxTransaction.getOrgTransactionType(), cashBoxTransaction.getOrgOrderNo(), "");
                        break;
                    } else if (!TextUtils.isEmpty(cashBoxTransaction.getPayId())) {
                        CashBoxViewModel cashBoxViewModel = (CashBoxViewModel) cashBoxMainFragment.f27327p;
                        String payId = cashBoxTransaction.getPayId();
                        cashBoxViewModel.getClass();
                        if (!TextUtils.isEmpty(payId)) {
                            Qc.I i7 = new Qc.I(payId, null);
                            QueryOrderNoReq queryOrderNoReq = new QueryOrderNoReq(payId);
                            com.transsnet.palmpay.core.base.l lVar = cashBoxViewModel.f32734B;
                            lVar.f27356m = queryOrderNoReq;
                            Unit unit = Unit.f38893a;
                            p140j8.f.v(cashBoxViewModel, i7, lVar, 0L);
                            break;
                        }
                    }
                }
                break;
            default:
                QueryCashBoxTransactionListResp.CashBoxTransaction cashBoxTransaction2 = (QueryCashBoxTransactionListResp.CashBoxTransaction) obj;
                CashBoxTransactionHistoryFragment.a aVar2 = CashBoxTransactionHistoryFragment.f32428Y;
                if ("2".equals(cashBoxTransaction2.getRedirect()) && !TextUtils.isEmpty(cashBoxTransaction2.getOrgOrderNo())) {
                    i0.b0("/h5/transaction-router/home?transType=" + cashBoxTransaction2.getOrgTransactionType() + "&orderId=" + cashBoxTransaction2.getOrgOrderNo());
                    break;
                } else if ("3".equals(cashBoxTransaction2.getRedirect()) && !TextUtils.isEmpty(cashBoxTransaction2.getOrgOrderNo())) {
                    com.palmpay.lib.apm.launchcounter.util.d.x(p002a.a.e(new Pair("orderNo", cashBoxTransaction2.getOrgOrderNo()), new Pair("transType", cashBoxTransaction2.getTransType())), "CommonDetail");
                    break;
                } else {
                    CashBoxTransactionHistoryFragment cashBoxTransactionHistoryFragment = (CashBoxTransactionHistoryFragment) obj2;
                    if ("4".equals(cashBoxTransaction2.getRedirect())) {
                        if (!TextUtils.isEmpty(cashBoxTransaction2.getCustomLinkH5())) {
                            customLinkAndroid2 = cashBoxTransaction2.getCustomLinkH5();
                        } else {
                            customLinkAndroid2 = cashBoxTransaction2.getCustomLinkAndroid();
                        }
                        if (!TextUtils.isEmpty(customLinkAndroid2)) {
                            ActivityUtils.startActivity(Pa.F.a(cashBoxTransactionHistoryFragment.requireContext(), customLinkAndroid2));
                        }
                        break;
                    } else if (TextUtils.equals(cashBoxTransaction2.getOrgTransactionType(), TransType.TRANS_TYPE_CASH_BOX_INTEREST) && !TextUtils.isEmpty(cashBoxTransaction2.getOrgOrderNo())) {
                        Ea.a.e(cashBoxTransaction2.getOrgTransactionType(), cashBoxTransaction2.getOrgOrderNo(), "");
                        break;
                    } else if ((TextUtils.equals(cashBoxTransaction2.getOrgTransactionType(), TransType.TRANS_TYPE_SPEND_SAVE_DEPOSIT) || TextUtils.equals(cashBoxTransaction2.getOrgTransactionType(), TransType.TRANS_TYPE_SPEND_SAVE_INTEREST) || TextUtils.equals(cashBoxTransaction2.getOrgTransactionType(), TransType.TRANS_TYPE_SPEND_SAVE_WITHDRAW)) && !TextUtils.isEmpty(cashBoxTransaction2.getOrgOrderNo())) {
                        Ea.a.e(cashBoxTransaction2.getOrgTransactionType(), cashBoxTransaction2.getOrgOrderNo(), "");
                        break;
                    } else if (!TextUtils.isEmpty(cashBoxTransaction2.getPayId()) && (cashBoxTransactionHistoryViewModel = (CashBoxTransactionHistoryViewModel) cashBoxTransactionHistoryFragment.f27333i) != null) {
                        String payId2 = cashBoxTransaction2.getPayId();
                        if (!TextUtils.isEmpty(payId2)) {
                            C0566g c0566g = new C0566g(payId2, null);
                            QueryOrderNoReq queryOrderNoReq2 = new QueryOrderNoReq(payId2);
                            com.transsnet.palmpay.core.base.l lVar2 = cashBoxTransactionHistoryViewModel.f32731p;
                            lVar2.f27356m = queryOrderNoReq2;
                            Unit unit2 = Unit.f38893a;
                            p140j8.f.v(cashBoxTransactionHistoryViewModel, c0566g, lVar2, 0L);
                            break;
                        }
                    }
                }
                break;
        }
    }
}
