package p382zb;

import C0.G;
import Pa.i0;
import Pa.r0;
import Ya.b;
import Ya.g;
import Z4.e;
import android.content.Context;
import android.view.ViewStub;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.google.android.gms.location.DeviceOrientationRequest;
import com.horcrux.svg.d0;
import com.transsnet.palmpay.core.base.BaseFragment;
import com.transsnet.palmpay.core.bean.CommonResult;
import com.transsnet.palmpay.credit.bean.resp.CLOpenUserListResp;
import com.transsnet.palmpay.credit.bean.resp.OcLockWhiteData;
import com.transsnet.palmpay.credit.bean.resp.OcLockWhiteResp;
import com.transsnet.palmpay.credit.bean.resp.OcRewardListResp;
import com.transsnet.palmpay.credit.bean.resp.OcWithdrawListResp;
import com.transsnet.palmpay.credit.bean.rsp.CLMainConfig;
import com.transsnet.palmpay.credit.bean.rsp.CLMainCreditCard;
import com.transsnet.palmpay.credit.bean.rsp.CLMainData;
import com.transsnet.palmpay.credit.bean.rsp.CLMainResp;
import com.transsnet.palmpay.credit.bean.rsp.CashLoanWhitelistData;
import com.transsnet.palmpay.credit.bean.rsp.FinanceStatusData;
import com.transsnet.palmpay.credit.bean.rsp.FinanceStatusResp;
import com.transsnet.palmpay.credit.bean.rsp.OkCardMainPageRsp;
import com.transsnet.palmpay.credit.bean.rsp.OkCardMainPageRspData;
import com.transsnet.palmpay.credit.ui.fragment.CLOpenContainFragment;
import com.transsnet.palmpay.credit.ui.fragment.CLOpenFragment;
import com.transsnet.palmpay.credit.ui.fragment.LoanCreditFaceRecFragment;
import com.transsnet.palmpay.credit.ui.fragment.OcBaseFragment;
import com.transsnet.palmpay.credit.ui.fragment.OcGuideCashOpenFragment;
import com.transsnet.palmpay.credit.ui.fragment.OcProtocolLockFragment;
import com.transsnet.palmpay.credit.ui.fragment.OcProtocolNoLockFragment;
import com.transsnet.palmpay.credit.ui.fragment.OcReferEarnWithRewardsListFragment;
import com.transsnet.palmpay.credit.ui.fragment.OcReferEarnWithdrawListFragment;
import com.transsnet.palmpay.custom_view.SwipeRecyclerView;
import com.transsnet.palmpay.custom_view.marqueeview.MarqueeView;
import com.transsnet.palmpay.util.SPUtils;
import com.transsnet.palmpay.util.SpanUtils;
import com.transsnet.palmpay.util.ToastUtils;
import io.reactivex.disposables.Disposable;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import p355xf.t;
import p368yb.N;
import p368yb.U;

/* JADX INFO: renamed from: zb.k, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C2168k extends e {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f44596f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ BaseFragment f44597g;

    public /* synthetic */ C2168k(BaseFragment baseFragment, int i7) {
        this.f44596f = i7;
        this.f44597g = baseFragment;
    }

    @Override // io.reactivex.Observer
    public final void onSubscribe(Disposable d2) {
        switch (this.f44596f) {
            case 0:
                Intrinsics.checkNotNullParameter(d2, "d");
                ((CLOpenContainFragment) this.f44597g).f(d2);
                break;
            case 1:
                Intrinsics.checkNotNullParameter(d2, "d");
                ((CLOpenFragment) this.f44597g).f(d2);
                break;
            case 2:
                Intrinsics.checkNotNullParameter(d2, "d");
                ((LoanCreditFaceRecFragment) this.f44597g).f(d2);
                break;
            case 3:
                Intrinsics.checkNotNullParameter(d2, "d");
                ((OcBaseFragment) this.f44597g).f(d2);
                break;
            case 4:
                Intrinsics.checkNotNullParameter(d2, "d");
                ((OcGuideCashOpenFragment) this.f44597g).f(d2);
                break;
            case 5:
                Intrinsics.checkNotNullParameter(d2, "d");
                ((OcProtocolLockFragment) this.f44597g).f(d2);
                break;
            case 6:
                Intrinsics.checkNotNullParameter(d2, "d");
                ((OcProtocolNoLockFragment) this.f44597g).f(d2);
                break;
            case 7:
                Intrinsics.checkNotNullParameter(d2, "d");
                ((OcReferEarnWithRewardsListFragment) this.f44597g).f(d2);
                break;
            default:
                Intrinsics.checkNotNullParameter(d2, "d");
                ((OcReferEarnWithdrawListFragment) this.f44597g).f(d2);
                break;
        }
    }

    @Override // Z4.e
    public final void w(String message) {
        BaseFragment baseFragment = this.f44597g;
        int i7 = this.f44596f;
        Intrinsics.checkNotNullParameter(message, "message");
        switch (i7) {
            case 0:
                ((CLOpenContainFragment) baseFragment).showLoadingDialog(false);
                ToastUtils.showShort(message, new Object[0]);
                break;
            case 1:
                ToastUtils.showShort(message, new Object[0]);
                break;
            case 2:
                ToastUtils.showShort(message, new Object[0]);
                break;
            case 3:
                OcBaseFragment ocBaseFragment = (OcBaseFragment) baseFragment;
                ocBaseFragment.showLoadingDialog(false);
                ocBaseFragment.v();
                ToastUtils.showShort(message, new Object[0]);
                break;
            case 4:
                ((OcGuideCashOpenFragment) baseFragment).showLoadingDialog(false);
                ToastUtils.showShort(message, new Object[0]);
                break;
            case 5:
                OcProtocolLockFragment ocProtocolLockFragment = (OcProtocolLockFragment) baseFragment;
                ocProtocolLockFragment.showLoadingDialog(false);
                ToastUtils.showShort(message, new Object[0]);
                ocProtocolLockFragment.x(false);
                break;
            case 6:
                ((OcProtocolNoLockFragment) baseFragment).showLoadingDialog(false);
                ToastUtils.showLong(message, new Object[0]);
                break;
            case 7:
                OcReferEarnWithRewardsListFragment.a aVar = OcReferEarnWithRewardsListFragment.f30486o;
                SwipeRecyclerView swipeRecyclerViewT = ((OcReferEarnWithRewardsListFragment) baseFragment).t();
                if (swipeRecyclerViewT != null) {
                    swipeRecyclerViewT.setRefreshing(false);
                }
                ToastUtils.showShort(message, new Object[0]);
                break;
            default:
                OcReferEarnWithdrawListFragment.a aVar2 = OcReferEarnWithdrawListFragment.f30489o;
                SwipeRecyclerView swipeRecyclerViewT2 = ((OcReferEarnWithdrawListFragment) baseFragment).t();
                if (swipeRecyclerViewT2 != null) {
                    swipeRecyclerViewT2.setRefreshing(false);
                }
                ToastUtils.showShort(message, new Object[0]);
                break;
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:341:0x04c4  */
    /* JADX WARN: Code duplicated, block: B:342:0x04c8  */
    /* JADX WARN: Code duplicated, block: B:344:0x04ce  */
    @Override // Z4.e
    public final void y(Object obj) {
        CLMainData cLMainData;
        CLMainConfig config;
        Long creditLimit;
        CashLoanWhitelistData cashLoanWhitelistData;
        Integer busiType;
        CLMainData cLMainData2;
        TextView textViewT;
        Long remainingDate;
        CLMainCreditCard creditCard;
        Integer accountStatus;
        TextView textView;
        Long exampleLoanDailyAmount;
        Long exampleAmount;
        CLMainCreditCard creditCard2;
        Integer accountStatus2;
        CashLoanWhitelistData cashLoanWhitelistData2;
        Long preCreditLimit;
        CashLoanWhitelistData cashLoanWhitelistData3;
        Integer busiType2;
        Double penaltyRatio;
        CLMainData cLMainData3;
        CLMainConfig config2;
        Long creditLimit2;
        CashLoanWhitelistData cashLoanWhitelistData4;
        Integer busiType3;
        CashLoanWhitelistData cashLoanWhitelistData5;
        Long preCreditLimit2;
        CashLoanWhitelistData cashLoanWhitelistData6;
        Integer busiType4;
        long jLongValue = 0;
        BaseFragment baseFragment = this.f44597g;
        switch (this.f44596f) {
            case 0:
                CLMainResp cLMainResp = (CLMainResp) obj;
                CLOpenContainFragment cLOpenContainFragment = (CLOpenContainFragment) baseFragment;
                cLOpenContainFragment.showLoadingDialog(false);
                if (cLMainResp == null || !cLMainResp.isSuccess() || cLMainResp.getData() == null) {
                    ToastUtils.showShort(cLMainResp != null ? cLMainResp.getRespMsg() : null, new Object[0]);
                    return;
                }
                CLMainData data = cLMainResp.getData();
                cLOpenContainFragment.f30325z0 = data;
                if (data != null ? Intrinsics.c(data.getInstallmentUserA(), Boolean.TRUE) : false) {
                    cLOpenContainFragment.x();
                    return;
                }
                CLMainData cLMainData4 = cLOpenContainFragment.f30325z0;
                if (cLMainData4 != null ? Intrinsics.c(cLMainData4.getInstallmentUserC(), Boolean.TRUE) : false) {
                    cLOpenContainFragment.x();
                    return;
                }
                if (i0.W(cLOpenContainFragment.getActivity())) {
                    ViewStub viewStub = (ViewStub) cLOpenContainFragment.f30323x0.getValue();
                    if (viewStub != null) {
                        viewStub.setVisibility(0);
                    }
                    ViewStub viewStub2 = (ViewStub) cLOpenContainFragment.f30324y0.getValue();
                    if (viewStub2 != null) {
                        viewStub2.setVisibility(8);
                    }
                    FrameLayout frameLayout = (FrameLayout) cLOpenContainFragment.f30304Q.getValue();
                    cLOpenContainFragment.f30297A0 = frameLayout != null ? (MarqueeView) frameLayout.findViewById(Ya.e.marquee) : null;
                    CLMainData cLMainData5 = cLOpenContainFragment.f30325z0;
                    t tVar = cLOpenContainFragment.f30298B;
                    if ((cLMainData5 == null || (cashLoanWhitelistData3 = cLMainData5.getCashLoanWhitelistData()) == null || (busiType2 = cashLoanWhitelistData3.getBusiType()) == null || busiType2.intValue() != 12) && ((cLMainData = cLOpenContainFragment.f30325z0) == null || (cashLoanWhitelistData = cLMainData.getCashLoanWhitelistData()) == null || (busiType = cashLoanWhitelistData.getBusiType()) == null || busiType.intValue() != 13)) {
                        TextView textView2 = (TextView) tVar.getValue();
                        if (textView2 != null) {
                            CLMainData cLMainData6 = cLOpenContainFragment.f30325z0;
                            textView2.setText(r0.F((cLMainData6 == null || (config = cLMainData6.getConfig()) == null || (creditLimit = config.getCreditLimit()) == null) ? 0L : creditLimit.longValue()));
                        }
                    } else {
                        TextView textView3 = (TextView) tVar.getValue();
                        if (textView3 != null) {
                            CLMainData cLMainData7 = cLOpenContainFragment.f30325z0;
                            textView3.setText(r0.F((cLMainData7 == null || (cashLoanWhitelistData2 = cLMainData7.getCashLoanWhitelistData()) == null || (preCreditLimit = cashLoanWhitelistData2.getPreCreditLimit()) == null) ? 0L : preCreditLimit.longValue()));
                        }
                    }
                    t tVar2 = cLOpenContainFragment.f30311o;
                    TextView textView4 = (TextView) tVar2.getValue();
                    if (textView4 != null) {
                        textView4.setVisibility(8);
                    }
                    CLMainData cLMainData8 = cLOpenContainFragment.f30325z0;
                    if ((cLMainData8 == null || (creditCard2 = cLMainData8.getCreditCard()) == null || (accountStatus2 = creditCard2.getAccountStatus()) == null || accountStatus2.intValue() != 4) && ((cLMainData2 = cLOpenContainFragment.f30325z0) == null || (creditCard = cLMainData2.getCreditCard()) == null || (accountStatus = creditCard.getAccountStatus()) == null || accountStatus.intValue() != 5)) {
                        CLMainData cLMainData9 = cLOpenContainFragment.f30325z0;
                        String userTag = cLMainData9 != null ? cLMainData9.getUserTag() : null;
                        if (userTag != null) {
                            switch (userTag) {
                                case "RE_ACTIVE":
                                case "CASH_LOAN_WHITE_LIST":
                                    cLOpenContainFragment.w();
                                    break;
                                case "BLACK_USER":
                                    TextView textViewT2 = cLOpenContainFragment.t();
                                    if (textViewT2 != null) {
                                        textViewT2.setEnabled(false);
                                    }
                                    break;
                                case "RETRY_TIME_TAG":
                                    Context context = cLOpenContainFragment.getContext();
                                    if (context != null) {
                                        TextView textViewT3 = cLOpenContainFragment.t();
                                        if (textViewT3 != null) {
                                            textViewT3.setEnabled(false);
                                        }
                                        TextView textView5 = (TextView) tVar2.getValue();
                                        if (textView5 != null) {
                                            SpanUtils spanUtilsAppend = new SpanUtils().append(cLOpenContainFragment.getString(g.cs_cl_apply_for_loan_again_after));
                                            CLMainData cLMainData10 = cLOpenContainFragment.f30325z0;
                                            if (cLMainData10 != null && (remainingDate = cLMainData10.getRemainingDate()) != null) {
                                                jLongValue = remainingDate.longValue();
                                            }
                                            G.w(context, b.cs_cl_main_color, d0.j(" ", r0.X1(Long.valueOf(jLongValue), "MMM dd, yyyy"), spanUtilsAppend), textView5);
                                        }
                                        TextView textView6 = (TextView) tVar2.getValue();
                                        if (textView6 != null) {
                                            textView6.setVisibility(0);
                                        }
                                    }
                                    break;
                                default:
                                    textViewT = cLOpenContainFragment.t();
                                    if (textViewT != null) {
                                        textViewT.setEnabled(false);
                                    }
                                    break;
                            }
                        } else {
                            textViewT = cLOpenContainFragment.t();
                            if (textViewT != null) {
                                textViewT.setEnabled(false);
                            }
                        }
                    } else {
                        cLOpenContainFragment.w();
                    }
                    Context context2 = cLOpenContainFragment.getContext();
                    if (context2 == null || (textView = (TextView) cLOpenContainFragment.f30296A.getValue()) == null) {
                        return;
                    }
                    SpanUtils spanUtilsAppend2 = new SpanUtils().append(cLOpenContainFragment.getString(g.cs_cl_card_interest_borrow));
                    CLMainData cLMainData11 = cLOpenContainFragment.f30325z0;
                    SpanUtils spanUtilsAppend3 = d0.k(" ", r0.B((cLMainData11 == null || (exampleAmount = cLMainData11.getExampleAmount()) == null) ? DeviceOrientationRequest.OUTPUT_PERIOD_MEDIUM : exampleAmount.longValue(), true), ",", spanUtilsAppend2).setForegroundColor(context2.getColor(b.cs_day_rate_value_txt_color)).setBold().append(" with lowest to");
                    CLMainData cLMainData12 = cLOpenContainFragment.f30325z0;
                    textView.setText(d0.j(" ", r0.B((cLMainData12 == null || (exampleLoanDailyAmount = cLMainData12.getExampleLoanDailyAmount()) == null) ? 30L : exampleLoanDailyAmount.longValue(), true), spanUtilsAppend3).setForegroundColor(context2.getColor(b.cs_day_rate_value_txt_color)).setBold().append(" daily interest").create());
                    return;
                }
                return;
            case 1:
                CLOpenUserListResp cLOpenUserListResp = (CLOpenUserListResp) obj;
                if (cLOpenUserListResp == null || !cLOpenUserListResp.isSuccess()) {
                    ToastUtils.showShort(cLOpenUserListResp != null ? cLOpenUserListResp.getRespMsg() : null, new Object[0]);
                    return;
                }
                List<String> data2 = cLOpenUserListResp.getData();
                if (data2 == null || data2.isEmpty()) {
                    return;
                }
                CLOpenFragment cLOpenFragment = (CLOpenFragment) baseFragment;
                MarqueeView marqueeView = cLOpenFragment.f30297A0;
                if (marqueeView != null) {
                    marqueeView.setVisibility(0);
                }
                MarqueeView marqueeView2 = cLOpenFragment.f30297A0;
                if (marqueeView2 != null) {
                    marqueeView2.b(cLOpenUserListResp.getData());
                    return;
                }
                return;
            case 2:
                CommonResult commonResult = (CommonResult) obj;
                if (commonResult == null || !commonResult.isSuccess()) {
                    ToastUtils.showShort(commonResult != null ? commonResult.getRespMsg() : null, new Object[0]);
                    return;
                }
                return;
            case 3:
                OkCardMainPageRsp okCardMainPageRsp = (OkCardMainPageRsp) obj;
                OcBaseFragment ocBaseFragment = (OcBaseFragment) baseFragment;
                ocBaseFragment.showLoadingDialog(false);
                if (okCardMainPageRsp != null && okCardMainPageRsp.isSuccess()) {
                    OkCardMainPageRspData data3 = okCardMainPageRsp.getData();
                    ocBaseFragment.f30369o = data3;
                    if (data3 != null && (penaltyRatio = data3.getPenaltyRatio()) != null) {
                        SPUtils.getInstance().put("key_okcard_penalty_ratio", (float) penaltyRatio.doubleValue());
                    }
                    ocBaseFragment.v();
                    return;
                }
                if (!"CFRONT_800089".equals(okCardMainPageRsp != null ? okCardMainPageRsp.getRespCode() : null)) {
                    ToastUtils.showShort(okCardMainPageRsp != null ? okCardMainPageRsp.getRespMsg() : null, new Object[0]);
                    return;
                }
                OkCardMainPageRspData data4 = okCardMainPageRsp.getData();
                if (data4 != null) {
                    data4.setApplyStatus(-1);
                }
                ocBaseFragment.v();
                return;
            case 4:
                CLMainResp cLMainResp2 = (CLMainResp) obj;
                OcGuideCashOpenFragment ocGuideCashOpenFragment = (OcGuideCashOpenFragment) baseFragment;
                ocGuideCashOpenFragment.showLoadingDialog(false);
                if (cLMainResp2 == null || !cLMainResp2.isSuccess() || cLMainResp2.getData() == null) {
                    ToastUtils.showShort(cLMainResp2 != null ? cLMainResp2.getRespMsg() : null, new Object[0]);
                    return;
                }
                CLMainData data5 = cLMainResp2.getData();
                ocGuideCashOpenFragment.t = data5;
                t tVar3 = ocGuideCashOpenFragment.f30415q0;
                if ((data5 == null || (cashLoanWhitelistData6 = data5.getCashLoanWhitelistData()) == null || (busiType4 = cashLoanWhitelistData6.getBusiType()) == null || busiType4.intValue() != 12) && ((cLMainData3 = ocGuideCashOpenFragment.t) == null || (cashLoanWhitelistData4 = cLMainData3.getCashLoanWhitelistData()) == null || (busiType3 = cashLoanWhitelistData4.getBusiType()) == null || busiType3.intValue() != 13)) {
                    TextView textView7 = (TextView) tVar3.getValue();
                    if (textView7 != null) {
                        CLMainData cLMainData13 = ocGuideCashOpenFragment.t;
                        if (cLMainData13 != null && (config2 = cLMainData13.getConfig()) != null && (creditLimit2 = config2.getCreditLimit()) != null) {
                            jLongValue = creditLimit2.longValue();
                        }
                        textView7.setText(r0.F(jLongValue));
                    }
                } else {
                    TextView textView8 = (TextView) tVar3.getValue();
                    if (textView8 != null) {
                        CLMainData cLMainData14 = ocGuideCashOpenFragment.t;
                        if (cLMainData14 != null && (cashLoanWhitelistData5 = cLMainData14.getCashLoanWhitelistData()) != null && (preCreditLimit2 = cashLoanWhitelistData5.getPreCreditLimit()) != null) {
                            jLongValue = preCreditLimit2.longValue();
                        }
                        textView8.setText(r0.F(jLongValue));
                    }
                }
                r0.R1((TextView) tVar3.getValue(), "fonts/PalmPayNum-Bold.ttf");
                if (ocGuideCashOpenFragment.getContext() != null) {
                    CLMainData cLMainData15 = ocGuideCashOpenFragment.t;
                    if (!(cLMainData15 != null ? Intrinsics.c(cLMainData15.getInstallmentUserA(), Boolean.TRUE) : false)) {
                        CLMainData cLMainData16 = ocGuideCashOpenFragment.t;
                        if (!(cLMainData16 != null ? Intrinsics.c(cLMainData16.getInstallmentUserC(), Boolean.TRUE) : false)) {
                            CLMainData cLMainData17 = ocGuideCashOpenFragment.t;
                            if (Intrinsics.c(cLMainData17 != null ? cLMainData17.getCashLoanWhitelist() : null, "1")) {
                                Intrinsics.checkNotNullParameter("CASH_LOAN", "<set-?>");
                                ocGuideCashOpenFragment.f30502w = "CASH_LOAN";
                                return;
                            }
                            CLMainData cLMainData18 = ocGuideCashOpenFragment.t;
                            if (cLMainData18 != null ? Intrinsics.c(cLMainData18.getInstantWhitelist(), Boolean.TRUE) : false) {
                                Intrinsics.checkNotNullParameter("CASH_INSTANT_LOAN", "<set-?>");
                                ocGuideCashOpenFragment.f30502w = "CASH_INSTANT_LOAN";
                                return;
                            }
                            return;
                        }
                    }
                    Intrinsics.checkNotNullParameter("CASH_INSTALLMENT_LOAN", "<set-?>");
                    ocGuideCashOpenFragment.f30502w = "CASH_INSTALLMENT_LOAN";
                    return;
                }
                return;
            case 5:
                OcLockWhiteResp ocLockWhiteResp = (OcLockWhiteResp) obj;
                OcProtocolLockFragment ocProtocolLockFragment = (OcProtocolLockFragment) baseFragment;
                ocProtocolLockFragment.showLoadingDialog(false);
                if (ocLockWhiteResp == null || !ocLockWhiteResp.isSuccess()) {
                    ocProtocolLockFragment.x(false);
                    ToastUtils.showShort(ocLockWhiteResp != null ? ocLockWhiteResp.getRespMsg() : null, new Object[0]);
                    return;
                }
                OcLockWhiteData data6 = ocLockWhiteResp.getData();
                ocProtocolLockFragment.f30477Q = data6;
                if (data6 != null ? Intrinsics.c(data6.getWhitelist(), Boolean.TRUE) : false) {
                    OcLockWhiteData ocLockWhiteData = ocProtocolLockFragment.f30477Q;
                    if (ocLockWhiteData != null ? Intrinsics.c(ocLockWhiteData.getWhitelistFlag(), Boolean.TRUE) : false) {
                        ocProtocolLockFragment.x(true);
                        return;
                    }
                }
                ocProtocolLockFragment.x(false);
                return;
            case 6:
                FinanceStatusResp financeStatusResp = (FinanceStatusResp) obj;
                ((OcProtocolNoLockFragment) baseFragment).showLoadingDialog(false);
                if (financeStatusResp != null && financeStatusResp.isSuccess() && financeStatusResp.getData() != null) {
                    FinanceStatusData data7 = financeStatusResp.getData();
                    if ((data7 != null ? data7.getOkCardAccount() : null) != null) {
                        FinanceStatusData data8 = financeStatusResp.getData();
                        if (data8 != null) {
                            data8.getOkCardAccount();
                            return;
                        }
                        return;
                    }
                }
                ToastUtils.showLong(financeStatusResp != null ? financeStatusResp.getRespMsg() : null, new Object[0]);
                return;
            case 7:
                OcRewardListResp response = (OcRewardListResp) obj;
                Intrinsics.checkNotNullParameter(response, "response");
                OcReferEarnWithRewardsListFragment.a aVar = OcReferEarnWithRewardsListFragment.f30486o;
                OcReferEarnWithRewardsListFragment ocReferEarnWithRewardsListFragment = (OcReferEarnWithRewardsListFragment) baseFragment;
                SwipeRecyclerView swipeRecyclerViewT = ocReferEarnWithRewardsListFragment.t();
                if (swipeRecyclerViewT != null) {
                    swipeRecyclerViewT.setRefreshing(false);
                }
                if (!response.isSuccess()) {
                    ToastUtils.showShort(response.getRespMsg(), new Object[0]);
                    return;
                }
                N n10 = ocReferEarnWithRewardsListFragment.f30488j;
                if (n10 == null) {
                    Intrinsics.n("mAdapter");
                    throw null;
                }
                n10.b();
                N n11 = ocReferEarnWithRewardsListFragment.f30488j;
                if (n11 == null) {
                    Intrinsics.n("mAdapter");
                    throw null;
                }
                n11.a(response.getData());
                N n12 = ocReferEarnWithRewardsListFragment.f30488j;
                if (n12 != null) {
                    n12.notifyDataSetChanged();
                    return;
                } else {
                    Intrinsics.n("mAdapter");
                    throw null;
                }
            default:
                OcWithdrawListResp response2 = (OcWithdrawListResp) obj;
                Intrinsics.checkNotNullParameter(response2, "response");
                OcReferEarnWithdrawListFragment.a aVar2 = OcReferEarnWithdrawListFragment.f30489o;
                OcReferEarnWithdrawListFragment ocReferEarnWithdrawListFragment = (OcReferEarnWithdrawListFragment) baseFragment;
                SwipeRecyclerView swipeRecyclerViewT2 = ocReferEarnWithdrawListFragment.t();
                if (swipeRecyclerViewT2 != null) {
                    swipeRecyclerViewT2.setRefreshing(false);
                }
                if (!response2.isSuccess()) {
                    ToastUtils.showShort(response2.getRespMsg(), new Object[0]);
                    return;
                }
                U u6 = ocReferEarnWithdrawListFragment.f30491j;
                if (u6 == null) {
                    Intrinsics.n("mAdapter");
                    throw null;
                }
                u6.b();
                U u10 = ocReferEarnWithdrawListFragment.f30491j;
                if (u10 == null) {
                    Intrinsics.n("mAdapter");
                    throw null;
                }
                u10.a(response2.getData());
                U u11 = ocReferEarnWithdrawListFragment.f30491j;
                if (u11 != null) {
                    u11.notifyDataSetChanged();
                    return;
                } else {
                    Intrinsics.n("mAdapter");
                    throw null;
                }
        }
    }
}
