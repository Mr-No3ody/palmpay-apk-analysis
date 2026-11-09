package Fe;

import com.transsnet.palmpay.core.base.BaseApplication;
import com.transsnet.palmpay.core.bean.CommonBeanResult;
import com.transsnet.palmpay.core.bean.CommonResult;
import com.transsnet.palmpay.core.bean.LastPayerDataBean;
import com.transsnet.palmpay.core.bean.rsp.UnReadMsgCntRsp;
import com.transsnet.palmpay.credit.bean.LoanEnterPreCheckInfo;
import com.transsnet.palmpay.main.export.bean.rsp.HomeRewardsCenterRsp;
import com.transsnet.palmpay.main.export.bean.rsp.MeTabTotalAssetInfo;
import com.transsnet.palmpay.main.export.bean.rsp.QueryHomeBusinessRsp;
import com.transsnet.palmpay.main.export.bean.rsp.QueryLastTransactionHistoryRsp;
import com.transsnet.palmpay.main.export.bean.rsp.TaskCenterRewardResultBean;
import com.transsnet.palmpay.ui.mvp.contract.HomeFragmentContract$IView;
import com.transsnet.palmpay.util.ToastUtils;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: Fe.h, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class C0260h implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2774a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ I f2775b;

    public /* synthetic */ C0260h(I i7, int i10) {
        this.f2774a = i10;
        this.f2775b = i7;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        HomeFragmentContract$IView homeFragmentContract$IView;
        HomeFragmentContract$IView homeFragmentContract$IView2;
        HomeFragmentContract$IView homeFragmentContract$IView3;
        HomeFragmentContract$IView homeFragmentContract$IView4;
        HomeFragmentContract$IView homeFragmentContract$IView5;
        switch (this.f2774a) {
            case 0:
                QueryLastTransactionHistoryRsp it = (QueryLastTransactionHistoryRsp) obj;
                Intrinsics.checkNotNullParameter(it, "it");
                if (it.isSuccess() && (homeFragmentContract$IView = (HomeFragmentContract$IView) this.f2775b.f27351a) != null) {
                    homeFragmentContract$IView.queryLastTransactionHistoryOk(it.data);
                }
                break;
            case 1:
                CommonBeanResult it2 = (CommonBeanResult) obj;
                Intrinsics.checkNotNullParameter(it2, "it");
                if (it2.isSuccess()) {
                    I i7 = this.f2775b;
                    i7.f2737e = false;
                    if (it2.data != 0 && BaseApplication.hasLogin()) {
                        HomeFragmentContract$IView homeFragmentContract$IView6 = (HomeFragmentContract$IView) i7.f27351a;
                        if (homeFragmentContract$IView6 != null) {
                            homeFragmentContract$IView6.handleHomeRewards(((HomeRewardsCenterRsp) it2.data).taskV2DTO);
                        }
                        HomeFragmentContract$IView homeFragmentContract$IView7 = (HomeFragmentContract$IView) i7.f27351a;
                        if (homeFragmentContract$IView7 != null) {
                            homeFragmentContract$IView7.handleHomeRewardsCenter((HomeRewardsCenterRsp) it2.data);
                        }
                        HomeFragmentContract$IView homeFragmentContract$IView8 = (HomeFragmentContract$IView) i7.f27351a;
                        if (homeFragmentContract$IView8 != null) {
                            homeFragmentContract$IView8.handleHomeTaskCenter(((HomeRewardsCenterRsp) it2.data).taskCenterDTO);
                        }
                    }
                    HomeRewardsCenterRsp homeRewardsCenterRsp = (HomeRewardsCenterRsp) it2.data;
                    if ((homeRewardsCenterRsp != null ? homeRewardsCenterRsp.queryAppProductRecommendationsRes : null) != null && (homeFragmentContract$IView2 = (HomeFragmentContract$IView) i7.f27351a) != null) {
                        homeFragmentContract$IView2.handleHomeWealthResult(homeRewardsCenterRsp != null ? homeRewardsCenterRsp.queryAppProductRecommendationsRes : null);
                    }
                }
                break;
            case 2:
                CommonBeanResult it3 = (CommonBeanResult) obj;
                Intrinsics.checkNotNullParameter(it3, "it");
                boolean zIsSuccess = it3.isSuccess();
                I i10 = this.f2775b;
                if (zIsSuccess) {
                    QueryHomeBusinessRsp queryHomeBusinessRsp = (QueryHomeBusinessRsp) it3.data;
                    if (queryHomeBusinessRsp != null) {
                        HomeFragmentContract$IView homeFragmentContract$IView9 = (HomeFragmentContract$IView) i10.f27351a;
                        if (homeFragmentContract$IView9 != null) {
                            homeFragmentContract$IView9.handleImportantNotice(queryHomeBusinessRsp.queryMsgRespPageDto);
                        }
                        UnReadMsgCntRsp unReadMsgCntRsp = queryHomeBusinessRsp.msgUnReadRes;
                        if (unReadMsgCntRsp != null && (homeFragmentContract$IView3 = (HomeFragmentContract$IView) i10.f27351a) != null) {
                            homeFragmentContract$IView3.handleUnreadMsgCntRsp(unReadMsgCntRsp);
                        }
                    }
                } else {
                    HomeFragmentContract$IView homeFragmentContract$IView10 = (HomeFragmentContract$IView) i10.f27351a;
                    if (homeFragmentContract$IView10 != null) {
                        homeFragmentContract$IView10.handleImportantNotice(null);
                    }
                }
                break;
            case 3:
                HomeFragmentContract$IView homeFragmentContract$IView11 = (HomeFragmentContract$IView) this.f2775b.f27351a;
                if (homeFragmentContract$IView11 != null) {
                    homeFragmentContract$IView11.handleImportantNotice(null);
                }
                break;
            case 4:
                CommonBeanResult<LoanEnterPreCheckInfo> it4 = (CommonBeanResult) obj;
                Intrinsics.checkNotNullParameter(it4, "it");
                HomeFragmentContract$IView homeFragmentContract$IView12 = (HomeFragmentContract$IView) this.f2775b.f27351a;
                if (homeFragmentContract$IView12 != null) {
                    homeFragmentContract$IView12.handleLoanPreCheckInfoResult(it4);
                }
                break;
            case 5:
                HomeFragmentContract$IView homeFragmentContract$IView13 = (HomeFragmentContract$IView) this.f2775b.f27351a;
                if (homeFragmentContract$IView13 != null) {
                    homeFragmentContract$IView13.handleLoanPreCheckInfoResult(null);
                }
                break;
            case 6:
                CommonBeanResult it5 = (CommonBeanResult) obj;
                Intrinsics.checkNotNullParameter(it5, "it");
                HomeFragmentContract$IView homeFragmentContract$IView14 = (HomeFragmentContract$IView) this.f2775b.f27351a;
                if (homeFragmentContract$IView14 != null) {
                    homeFragmentContract$IView14.handleMeTabTotalAssetInfo((MeTabTotalAssetInfo) it5.data);
                }
                break;
            case 7:
                ToastUtils.showLong((String) obj, new Object[0]);
                HomeFragmentContract$IView homeFragmentContract$IView15 = (HomeFragmentContract$IView) this.f2775b.f27351a;
                if (homeFragmentContract$IView15 != null) {
                    homeFragmentContract$IView15.handleMeTabTotalAssetInfo(null);
                }
                break;
            case 8:
                CommonBeanResult it6 = (CommonBeanResult) obj;
                Intrinsics.checkNotNullParameter(it6, "it");
                boolean zIsSuccess2 = it6.isSuccess();
                I i11 = this.f2775b;
                if (zIsSuccess2) {
                    QueryHomeBusinessRsp queryHomeBusinessRsp2 = (QueryHomeBusinessRsp) it6.data;
                    if (queryHomeBusinessRsp2 != null) {
                        UnReadMsgCntRsp unReadMsgCntRsp2 = queryHomeBusinessRsp2.msgUnReadRes;
                        if (unReadMsgCntRsp2 != null && (homeFragmentContract$IView5 = (HomeFragmentContract$IView) i11.f27351a) != null) {
                            homeFragmentContract$IView5.handleUnreadMsgCntRsp(unReadMsgCntRsp2);
                        }
                        LastPayerDataBean lastPayerDataBean = queryHomeBusinessRsp2.newestOrder;
                        if (lastPayerDataBean != null && (homeFragmentContract$IView4 = (HomeFragmentContract$IView) i11.f27351a) != null) {
                            homeFragmentContract$IView4.handleLastPayer(lastPayerDataBean);
                        }
                        HomeFragmentContract$IView homeFragmentContract$IView16 = (HomeFragmentContract$IView) i11.f27351a;
                        if (homeFragmentContract$IView16 != null) {
                            homeFragmentContract$IView16.handleImportantNotice(queryHomeBusinessRsp2.queryMsgRespPageDto);
                        }
                    }
                } else {
                    HomeFragmentContract$IView homeFragmentContract$IView17 = (HomeFragmentContract$IView) i11.f27351a;
                    if (homeFragmentContract$IView17 != null) {
                        homeFragmentContract$IView17.handleImportantNotice(null);
                    }
                }
                break;
            case 9:
                HomeFragmentContract$IView homeFragmentContract$IView18 = (HomeFragmentContract$IView) this.f2775b.f27351a;
                if (homeFragmentContract$IView18 != null) {
                    homeFragmentContract$IView18.handleImportantNotice(null);
                }
                break;
            case 10:
                CommonResult it7 = (CommonResult) obj;
                Intrinsics.checkNotNullParameter(it7, "it");
                HomeFragmentContract$IView homeFragmentContract$IView19 = (HomeFragmentContract$IView) this.f2775b.f27351a;
                if (homeFragmentContract$IView19 != null) {
                    homeFragmentContract$IView19.handleClearRewardsResultCacheResult(it7);
                }
                break;
            case 11:
                HomeFragmentContract$IView homeFragmentContract$IView20 = (HomeFragmentContract$IView) this.f2775b.f27351a;
                if (homeFragmentContract$IView20 != null) {
                    homeFragmentContract$IView20.handleClearRewardsResultCacheResult(null);
                }
                break;
            case 12:
                CommonResult it8 = (CommonResult) obj;
                Intrinsics.checkNotNullParameter(it8, "it");
                HomeFragmentContract$IView homeFragmentContract$IView21 = (HomeFragmentContract$IView) this.f2775b.f27351a;
                if (homeFragmentContract$IView21 != null) {
                    homeFragmentContract$IView21.handleClaimRewardsCenterRewardResult(it8);
                }
                break;
            case 13:
                HomeFragmentContract$IView homeFragmentContract$IView22 = (HomeFragmentContract$IView) this.f2775b.f27351a;
                if (homeFragmentContract$IView22 != null) {
                    homeFragmentContract$IView22.handleClaimRewardsCenterRewardResult(null);
                }
                break;
            case 14:
                CommonBeanResult<TaskCenterRewardResultBean> it9 = (CommonBeanResult) obj;
                Intrinsics.checkNotNullParameter(it9, "it");
                boolean zIsSuccess3 = it9.isSuccess();
                I i12 = this.f2775b;
                if (zIsSuccess3) {
                    HomeFragmentContract$IView homeFragmentContract$IView23 = (HomeFragmentContract$IView) i12.f27351a;
                    if (homeFragmentContract$IView23 != null) {
                        homeFragmentContract$IView23.handleTaskCenterRewardResult(it9);
                    }
                } else {
                    HomeFragmentContract$IView homeFragmentContract$IView24 = (HomeFragmentContract$IView) i12.f27351a;
                    if (homeFragmentContract$IView24 != null) {
                        homeFragmentContract$IView24.handleTaskCenterRewardResult(null);
                    }
                }
                break;
            default:
                HomeFragmentContract$IView homeFragmentContract$IView25 = (HomeFragmentContract$IView) this.f2775b.f27351a;
                if (homeFragmentContract$IView25 != null) {
                    homeFragmentContract$IView25.handleImportantNotice(null);
                }
                break;
        }
        return Unit.f38893a;
    }
}
