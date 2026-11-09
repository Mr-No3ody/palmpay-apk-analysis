package com.transsnet.palmpay.managemoney.ui.fragment;

import android.graphics.Color;
import android.graphics.drawable.GradientDrawable;
import android.text.TextUtils;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.mikepenz.iconics.view.IconicsImageView;
import com.transsnet.palmpay.core.base.BaseApplication;
import com.transsnet.palmpay.core.bean.CommonBeanResult;
import com.transsnet.palmpay.core.bean.PageDataBean;
import com.transsnet.palmpay.core.bean.rsp.GetAutoTransferConfigResp;
import com.transsnet.palmpay.custom_view.EmptyView;
import com.transsnet.palmpay.custom_view.utils.CommonViewExtKt;
import com.transsnet.palmpay.managemoney.bean.resp.GetBeforeOrderResp;
import com.transsnet.palmpay.managemoney.bean.resp.GetCashBoxAccountInfoResp;
import com.transsnet.palmpay.managemoney.bean.resp.GetCashBoxHomeResp;
import com.transsnet.palmpay.managemoney.bean.resp.GetRemindTurnOnAutoSaveResp;
import com.transsnet.palmpay.managemoney.bean.resp.QueryCashBoxTransactionListResp;
import com.transsnet.palmpay.util.ToastUtils;
import java.math.BigDecimal;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.transsnet.palmpay.managemoney.ui.fragment.q, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C1595q implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f32652a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ CashBoxMainFragment f32653b;

    public /* synthetic */ C1595q(CashBoxMainFragment cashBoxMainFragment, int i7) {
        this.f32652a = i7;
        this.f32653b = cashBoxMainFragment;
    }

    /* JADX WARN: Code duplicated, block: B:119:0x01ed  */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        String middleFirstCopyWriting;
        String middleSecondCopyWriting;
        String middleButtonCopyWriting;
        TextView textView;
        String middlePicUrl;
        String middleButtonCopyWritingColor;
        String middleSecondCopyWritingColor;
        Boolean boolIsWithdrawPop;
        TextView textView2;
        int i7;
        PageDataBean<QueryCashBoxTransactionListResp.CashBoxTransaction> data;
        List<QueryCashBoxTransactionListResp.CashBoxTransaction> list;
        List<QueryCashBoxTransactionListResp.CashBoxTransaction> list2;
        String str = null;
        str = null;
        str = null;
        CashBoxMainFragment cashBoxMainFragment = this.f32653b;
        switch (this.f32652a) {
            case 0:
                com.transsnet.palmpay.core.base.q it = (com.transsnet.palmpay.core.base.q) obj;
                p355xf.t tVar = cashBoxMainFragment.f32388C;
                p355xf.t tVar2 = cashBoxMainFragment.f32401M;
                p355xf.t tVar3 = cashBoxMainFragment.f32386B;
                Intrinsics.checkNotNullParameter(it, "it");
                if (!(it instanceof com.transsnet.palmpay.core.base.o)) {
                    if (it instanceof com.transsnet.palmpay.core.base.p) {
                        GetCashBoxHomeResp getCashBoxHomeResp = (GetCashBoxHomeResp) ((com.transsnet.palmpay.core.base.p) it).f27360a;
                        try {
                            LinearLayout linearLayout = (LinearLayout) tVar2.getValue();
                            if (linearLayout != null) {
                                linearLayout.setVisibility(8);
                            }
                            GetCashBoxHomeResp.Data data2 = getCashBoxHomeResp.getData();
                            if (data2 != null && (boolIsWithdrawPop = data2.isWithdrawPop()) != null) {
                                cashBoxMainFragment.f32404O0 = boolIsWithdrawPop.booleanValue();
                            }
                            GetCashBoxHomeResp.Data data3 = getCashBoxHomeResp.getData();
                            if (data3 == null || (middleFirstCopyWriting = data3.getMiddleFirstCopyWriting()) == null || TextUtils.isEmpty(middleFirstCopyWriting)) {
                                middleFirstCopyWriting = null;
                            }
                            TextView textView3 = (TextView) cashBoxMainFragment.f32399L.getValue();
                            if (textView3 != null) {
                                textView3.setText(middleFirstCopyWriting);
                            }
                            LinearLayout linearLayout2 = (LinearLayout) tVar2.getValue();
                            if (linearLayout2 != null) {
                                linearLayout2.setVisibility(0);
                            }
                            GetCashBoxHomeResp.Data data4 = getCashBoxHomeResp.getData();
                            if (data4 == null || (middleSecondCopyWriting = data4.getMiddleSecondCopyWriting()) == null || TextUtils.isEmpty(middleSecondCopyWriting)) {
                                middleSecondCopyWriting = null;
                            }
                            TextView textView4 = (TextView) tVar.getValue();
                            if (textView4 != null) {
                                textView4.setText(middleSecondCopyWriting);
                            }
                            GetCashBoxHomeResp.Data data5 = getCashBoxHomeResp.getData();
                            if (data5 == null || (middleButtonCopyWriting = data5.getMiddleButtonCopyWriting()) == null || TextUtils.isEmpty(middleButtonCopyWriting)) {
                                middleButtonCopyWriting = null;
                            }
                            TextView textView5 = (TextView) tVar3.getValue();
                            if (textView5 != null) {
                                textView5.setText(middleButtonCopyWriting);
                            }
                            GetCashBoxHomeResp.Data data6 = getCashBoxHomeResp.getData();
                            String androidJumpUrl = data6 != null ? data6.getAndroidJumpUrl() : null;
                            if ((androidJumpUrl == null || androidJumpUrl.length() == 0) && (textView = (TextView) tVar3.getValue()) != null) {
                                textView.setVisibility(8);
                            }
                            GetCashBoxHomeResp.Data data7 = getCashBoxHomeResp.getData();
                            String androidJumpUrl2 = data7 != null ? data7.getAndroidJumpUrl() : null;
                            TextView textView6 = (TextView) tVar3.getValue();
                            if (textView6 != null) {
                                textView6.setOnClickListener(new C9.V(11, cashBoxMainFragment, androidJumpUrl2));
                            }
                            GetCashBoxHomeResp.Data data8 = getCashBoxHomeResp.getData();
                            if (data8 != null && (middleSecondCopyWritingColor = data8.getMiddleSecondCopyWritingColor()) != null && CommonViewExtKt.isValidHexColor(middleSecondCopyWritingColor)) {
                                int color = Color.parseColor(middleSecondCopyWritingColor);
                                TextView textView7 = (TextView) tVar.getValue();
                                if (textView7 != null) {
                                    textView7.setTextColor(color);
                                }
                            }
                            GetCashBoxHomeResp.Data data9 = getCashBoxHomeResp.getData();
                            if (data9 != null && (middleButtonCopyWritingColor = data9.getMiddleButtonCopyWritingColor()) != null && CommonViewExtKt.isValidHexColor(middleButtonCopyWritingColor)) {
                                GradientDrawable gradientDrawable = new GradientDrawable();
                                gradientDrawable.setColor(Color.parseColor(middleButtonCopyWritingColor));
                                gradientDrawable.setCornerRadius(12.0f);
                                TextView textView8 = (TextView) tVar3.getValue();
                                if (textView8 != null) {
                                    textView8.setBackground(gradientDrawable);
                                }
                            }
                            GetCashBoxHomeResp.Data data10 = getCashBoxHomeResp.getData();
                            if (data10 != null && (middlePicUrl = data10.getMiddlePicUrl()) != null && !TextUtils.isEmpty(middlePicUrl)) {
                                str = middlePicUrl;
                            }
                            Pa.r0.l1(str, (ImageView) cashBoxMainFragment.f32394H.getValue());
                            break;
                        } catch (Exception unused) {
                        } catch (Throwable th) {
                            throw th;
                        }
                    } else if (!(it instanceof com.transsnet.palmpay.core.base.m)) {
                        if (!(it instanceof com.transsnet.palmpay.core.base.n)) {
                            throw new p355xf.l();
                        }
                        ToastUtils.showLong(((com.transsnet.palmpay.core.base.n) it).f27358a, new Object[0]);
                        ((com.transsnet.palmpay.core.base.n) it).getClass();
                    }
                }
                return Unit.f38893a;
            case 1:
                com.transsnet.palmpay.core.base.q it2 = (com.transsnet.palmpay.core.base.q) obj;
                Intrinsics.checkNotNullParameter(it2, "it");
                if (!(it2 instanceof com.transsnet.palmpay.core.base.o)) {
                    if (it2 instanceof com.transsnet.palmpay.core.base.p) {
                        GetCashBoxAccountInfoResp.CashBoxAccountInfo data11 = ((GetCashBoxAccountInfoResp) ((com.transsnet.palmpay.core.base.p) it2).f27360a).getData();
                        cashBoxMainFragment.f32407Q0 = data11;
                        if (data11 != null) {
                            List<String> tierLimitAmount = data11.getTierLimitAmount();
                            if (tierLimitAmount != null) {
                                int iQ = Pa.r0.q(BaseApplication.get().getUser().getMobileMoneyAccountTier()) - 1;
                                if (iQ < 0) {
                                    iQ = 0;
                                }
                                if (!tierLimitAmount.isEmpty() && tierLimitAmount.size() > iQ) {
                                    cashBoxMainFragment.T0 = Long.parseLong(tierLimitAmount.get(iQ));
                                    IconicsImageView iconicsImageView = (IconicsImageView) cashBoxMainFragment.f32390D0.getValue();
                                    if (iconicsImageView != null) {
                                        String strValueOf = String.valueOf(data11.getCashBoxBalance());
                                        String strValueOf2 = String.valueOf(cashBoxMainFragment.T0);
                                        if (TextUtils.isEmpty(strValueOf) || TextUtils.isEmpty(strValueOf2)) {
                                            i7 = 8;
                                        } else {
                                            try {
                                                if (new BigDecimal(strValueOf).compareTo(new BigDecimal(strValueOf2)) >= 0) {
                                                    i7 = 0;
                                                } else {
                                                    i7 = 8;
                                                }
                                            } catch (Exception e10) {
                                                F6.d.c("BigDecimalUtil", e10.getMessage(), e10.fillInStackTrace());
                                            }
                                        }
                                        iconicsImageView.setVisibility(i7);
                                    }
                                }
                            }
                            cashBoxMainFragment.f32405P0 = new GetBeforeOrderResp.StateInfo(data11.getStateCode(), data11.getStateName());
                            Object[] objArr = data11.getAccountStatus() == 1 && data11.getCanBeDepositFromBalance() >= 100;
                            p355xf.t tVar4 = cashBoxMainFragment.f32418s0;
                            TextView textView9 = (TextView) tVar4.getValue();
                            if (textView9 != null) {
                                textView9.setVisibility(objArr == true ? 0 : 8);
                            }
                            if (objArr != false && (textView2 = (TextView) tVar4.getValue()) != null) {
                                textView2.setText(cashBoxMainFragment.getString(Jc.f.mm_daily_income, Pa.r0.B(data11.getCanBeDepositFromBalance(), true)));
                            }
                            TextView textView10 = (TextView) tVar4.getValue();
                            if (textView10 != null) {
                                textView10.setOnClickListener(new ViewOnClickListenerC1597t(cashBoxMainFragment));
                            }
                        }
                        cashBoxMainFragment.C(p059e1.a.C("cash_box_saving_shown", true), cashBoxMainFragment.f32407Q0);
                    } else if (!(it2 instanceof com.transsnet.palmpay.core.base.m)) {
                        if (!(it2 instanceof com.transsnet.palmpay.core.base.n)) {
                            throw new p355xf.l();
                        }
                        ToastUtils.showLong(((com.transsnet.palmpay.core.base.n) it2).f27358a, new Object[0]);
                    }
                }
                return Unit.f38893a;
            case 2:
                com.transsnet.palmpay.core.base.q it3 = (com.transsnet.palmpay.core.base.q) obj;
                Intrinsics.checkNotNullParameter(it3, "it");
                if (!(it3 instanceof com.transsnet.palmpay.core.base.o)) {
                    if (it3 instanceof com.transsnet.palmpay.core.base.p) {
                        QueryCashBoxTransactionListResp queryCashBoxTransactionListResp = (QueryCashBoxTransactionListResp) ((com.transsnet.palmpay.core.base.p) it3).f27360a;
                        EmptyView emptyView = (EmptyView) cashBoxMainFragment.t.getValue();
                        if (emptyView != null) {
                            PageDataBean<QueryCashBoxTransactionListResp.CashBoxTransaction> data12 = queryCashBoxTransactionListResp.getData();
                            emptyView.setVisibility(((data12 == null || (list2 = data12.list) == null) ? 0 : list2.size()) <= 0 ? 0 : 8);
                        }
                        if (queryCashBoxTransactionListResp.isSuccess() && (data = queryCashBoxTransactionListResp.getData()) != null && (list = data.list) != null) {
                            List<QueryCashBoxTransactionListResp.CashBoxTransaction> list3 = list.isEmpty() ? null : list;
                            if (list3 != null) {
                                Nc.e eVar = cashBoxMainFragment.f32408R0;
                                eVar.f6313c = list3;
                                eVar.notifyDataSetChanged();
                            }
                        }
                    } else if (!(it3 instanceof com.transsnet.palmpay.core.base.m)) {
                        if (!(it3 instanceof com.transsnet.palmpay.core.base.n)) {
                            throw new p355xf.l();
                        }
                        ToastUtils.showLong(((com.transsnet.palmpay.core.base.n) it3).f27358a, new Object[0]);
                        ((com.transsnet.palmpay.core.base.n) it3).getClass();
                    }
                }
                return Unit.f38893a;
            case 3:
                com.transsnet.palmpay.core.base.q it4 = (com.transsnet.palmpay.core.base.q) obj;
                Intrinsics.checkNotNullParameter(it4, "it");
                if (!(it4 instanceof com.transsnet.palmpay.core.base.o)) {
                    if (it4 instanceof com.transsnet.palmpay.core.base.p) {
                        CashBoxMainFragment.a aVar = CashBoxMainFragment.f32383V0;
                        cashBoxMainFragment.z();
                    } else if (!(it4 instanceof com.transsnet.palmpay.core.base.m)) {
                        if (!(it4 instanceof com.transsnet.palmpay.core.base.n)) {
                            throw new p355xf.l();
                        }
                        ToastUtils.showLong(((com.transsnet.palmpay.core.base.n) it4).f27358a, new Object[0]);
                        ((com.transsnet.palmpay.core.base.n) it4).getClass();
                    }
                }
                return Unit.f38893a;
            case 4:
                com.transsnet.palmpay.core.base.q it5 = (com.transsnet.palmpay.core.base.q) obj;
                Intrinsics.checkNotNullParameter(it5, "it");
                if (!(it5 instanceof com.transsnet.palmpay.core.base.o)) {
                    if (it5 instanceof com.transsnet.palmpay.core.base.p) {
                        cashBoxMainFragment.f32409S0 = (GetAutoTransferConfigResp) ((CommonBeanResult) ((com.transsnet.palmpay.core.base.p) it5).f27360a).data;
                        CashBoxMainFragment.x(cashBoxMainFragment);
                    } else if (!(it5 instanceof com.transsnet.palmpay.core.base.m)) {
                        if (!(it5 instanceof com.transsnet.palmpay.core.base.n)) {
                            throw new p355xf.l();
                        }
                        ToastUtils.showLong(((com.transsnet.palmpay.core.base.n) it5).f27358a, new Object[0]);
                        ((com.transsnet.palmpay.core.base.n) it5).getClass();
                    }
                }
                return Unit.f38893a;
            default:
                com.transsnet.palmpay.core.base.q it6 = (com.transsnet.palmpay.core.base.q) obj;
                Intrinsics.checkNotNullParameter(it6, "it");
                if (!(it6 instanceof com.transsnet.palmpay.core.base.o)) {
                    if (it6 instanceof com.transsnet.palmpay.core.base.p) {
                        GetRemindTurnOnAutoSaveResp.Data data13 = ((GetRemindTurnOnAutoSaveResp) ((com.transsnet.palmpay.core.base.p) it6).f27360a).getData();
                        if (data13 != null ? Intrinsics.c(data13.isRemind(), Boolean.FALSE) : false) {
                            CashBoxMainFragment.w(cashBoxMainFragment);
                        } else {
                            CashBoxMainFragment.a aVar2 = CashBoxMainFragment.f32383V0;
                            cashBoxMainFragment.A(true);
                        }
                    } else if (!(it6 instanceof com.transsnet.palmpay.core.base.m)) {
                        if (!(it6 instanceof com.transsnet.palmpay.core.base.n)) {
                            throw new p355xf.l();
                        }
                        ToastUtils.showLong(((com.transsnet.palmpay.core.base.n) it6).f27358a, new Object[0]);
                        ((com.transsnet.palmpay.core.base.n) it6).getClass();
                    }
                }
                return Unit.f38893a;
        }
    }
}
