package p185ma;

import Ac.h;
import Ce.C0170l;
import Fe.I;
import J3.a;
import N8.q0;
import O6.c;
import Pa.i0;
import Pa.n0;
import Pa.r0;
import android.app.Activity;
import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import com.alibaba.android.arouter.launcher.ARouter;
import com.flexibank.sdk.customview.model.FlexiBankModelPageTitleArea;
import com.flexibank.sdk.p;
import com.palmpay.lib.apm.launchcounter.util.d;
import com.palmpay.lib.ui.button.PpButton;
import com.transsnet.palmpay.core.dialog.CommonQRCodeDialog;
import com.transsnet.palmpay.core.dialog.DayPickDialog;
import com.transsnet.palmpay.core.dialog.MobileWalletGuideDialog;
import com.transsnet.palmpay.core.dialog.RemindTimeSelectDialog;
import com.transsnet.palmpay.core.dialog.SelectBankDialog;
import com.transsnet.palmpay.core.dialog.SelectBankDialogV2;
import com.transsnet.palmpay.core.dialog.ShareDialog;
import com.transsnet.palmpay.credit.ui.activity.okcard.OcApplyBaseActivity;
import com.transsnet.palmpay.custom_view.dialog.b;
import com.transsnet.palmpay.custom_view.dialog.y;
import com.transsnet.palmpay.custom_view.q;
import com.transsnet.palmpay.custom_view.r;
import com.transsnet.palmpay.jara_packet.ui.activity.JaraCommissionDetailActivity;
import com.transsnet.palmpay.main.export.bean.req.ClaimRewardReq;
import com.transsnet.palmpay.main.export.bean.rsp.GetPointFlowRsp;
import com.transsnet.palmpay.main.export.bean.rsp.HomeRewardsCenterContentType;
import com.transsnet.palmpay.main.export.bean.rsp.HomeRewardsClaimClickEvent;
import com.transsnet.palmpay.main.export.bean.rsp.HomeRewardsStatisticsExtKt;
import com.transsnet.palmpay.main.export.bean.rsp.RewardsInfo;
import com.transsnet.palmpay.send_money.bean.resp.Data;
import com.transsnet.palmpay.ui.activity.points.PointStatementDetailActivity;
import com.transsnet.palmpay.ui.activity.qr.PayMoneyToPalmPayBusinessResultActivity;
import com.transsnet.palmpay.ui.activity.qr.QrcodePayMoneySuccessActivity;
import com.transsnet.palmpay.ui.activity.settings.SettingsActivity;
import com.transsnet.palmpay.ui.activity.thirdpartymerchant.ThirdPartyMerchantActivity;
import com.transsnet.palmpay.ui.activity.thirdpartymerchant.ThirdPartyMerchantOrderDetailActivity;
import com.transsnet.palmpay.ui.activity.welcome.WelcomeNewUserActivity;
import com.transsnet.palmpay.ui.fragment.HomeFragment;
import com.transsnet.palmpay.ui.fragment.HomeFragmentHomeTab;
import com.transsnet.palmpay.ui.fragment.HomePalmZoneTabV2;
import com.transsnet.palmpay.util.ClipboardUtils;
import com.transsnet.palmpay.util.ToastUtils;
import com.transsnet.palmpay.viewmodule.PalmZoneViewModel;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import kotlin.jvm.internal.Intrinsics;
import p025ba.k;
import p370ye.j;

/* JADX INFO: loaded from: classes3.dex */
public final class e implements View.OnClickListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f39598a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f39599b;

    public /* synthetic */ e(Object obj, int i7) {
        this.f39598a = i7;
        this.f39599b = obj;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        GetPointFlowRsp.DataBean.ListBean listBean;
        String str;
        HomeFragmentHomeTab homeFragmentHomeTab;
        WeakReference weakReference;
        HomeFragmentHomeTab homeFragmentHomeTab2;
        HomeFragment homeFragment;
        HomePalmZoneTabV2 homePalmZoneTabV2B;
        PalmZoneViewModel palmZoneViewModel;
        final int i7 = 1;
        Object obj = this.f39599b;
        switch (this.f39598a) {
            case 0:
                int id2 = view.getId();
                if (id2 == p025ba.e.mdp_close_iv || id2 == p025ba.e.mdp_confirm_btn) {
                    ((DayPickDialog) obj).dismiss();
                }
                break;
            case 1:
                ((MobileWalletGuideDialog) obj).dismiss();
                break;
            case 2:
                ((RemindTimeSelectDialog) obj).dismiss();
                break;
            case 3:
                if (view.getId() == p025ba.e.cdspm_close_iv) {
                    ((SelectBankDialog) obj).dismiss();
                }
                break;
            case 4:
                if (view.getId() == p025ba.e.cdspm_close_iv) {
                    ((SelectBankDialogV2) obj).dismiss();
                }
                break;
            case 5:
                int id3 = view.getId();
                ShareDialog shareDialog = (ShareDialog) obj;
                if (id3 == p025ba.e.ivClose) {
                    shareDialog.dismiss();
                    break;
                } else if (id3 == p025ba.e.cds_qr_code_container) {
                    int dimensionPixelOffset = ((b) shareDialog).mContext.getResources().getDimensionPixelOffset(q.dp90);
                    new CommonQRCodeDialog(((b) shareDialog).mContext, a.i(shareDialog.mShareText, dimensionPixelOffset, dimensionPixelOffset, null)).show();
                    break;
                } else if (id3 == p025ba.e.cds_copy_link_container) {
                    y yVar = new y(((b) shareDialog).mContext);
                    yVar.f31325c = r.cv_common_toast_succ;
                    yVar.f31324b = ((b) shareDialog).mContext.getString(k.core_core_copy_successfully);
                    yVar.f31323a = ((Context) yVar.f31327e).getString(k.core_copy_toast_desc);
                    yVar.h();
                    ClipboardUtils.copyText(shareDialog.mShareText);
                    HashMap map = new HashMap();
                    map.put("ShareBusinessType", Integer.valueOf(shareDialog.mShareBusinessType));
                    n0.g().n("ShareDialogItemCopyClick", map);
                    break;
                } else if (id3 == p025ba.e.cds_more_container) {
                    shareDialog.dismiss();
                    break;
                } else if (id3 == p025ba.e.ivCopyText && !TextUtils.isEmpty(shareDialog.mShareText)) {
                    ClipboardUtils.copyText(shareDialog.mShareText);
                    ToastUtils.showLong(k.core_copy_success);
                    break;
                }
                break;
            case 6:
                int id4 = view.getId();
                if (id4 != Ac.e.imageViewShare && id4 == Ac.e.viewReceipt && (listBean = ((PointStatementDetailActivity) obj).f34815p) != null && (str = listBean.transOrderType) != null) {
                    Ea.a.e(str, listBean.outOrderNo, "");
                }
                break;
            case 7:
                Intrinsics.checkNotNullParameter(view, "view");
                if (view.getId() == p.fb_cmpta_back_iv) {
                    FlexiBankModelPageTitleArea flexiBankModelPageTitleArea = (FlexiBankModelPageTitleArea) obj;
                    if (flexiBankModelPageTitleArea.getMContext() instanceof Activity) {
                        Context mContext = flexiBankModelPageTitleArea.getMContext();
                        Intrinsics.f(mContext, "null cannot be cast to non-null type android.app.Activity");
                        ((Activity) mContext).finish();
                    }
                }
                break;
            case 8:
                int id5 = view.getId();
                if (id5 == Ac.e.actur_complete_btn) {
                    q0.u("/main/home");
                } else if (id5 == Ac.e.actur_done_tv) {
                    q0.u("/main/home");
                } else if (id5 == Ac.e.imageViewShare) {
                    r0.L1(null, new C0170l(i7), ((PayMoneyToPalmPayBusinessResultActivity) obj).findViewById(Ac.e.rootView));
                }
                break;
            case 9:
                int i10 = QrcodePayMoneySuccessActivity.f34920C;
                ARouter.getInstance().build("/main/home").navigation();
                ((QrcodePayMoneySuccessActivity) obj).finish();
                break;
            case 10:
                i0.b0((String) obj);
                break;
            case 11:
                JaraCommissionDetailActivity jaraCommissionDetailActivity = (JaraCommissionDetailActivity) obj;
                jaraCommissionDetailActivity.n(jaraCommissionDetailActivity.f31848a);
                break;
            case 12:
                int i11 = SettingsActivity.f34971d;
                final SettingsActivity settingsActivity = (SettingsActivity) obj;
                c cVar = new c(settingsActivity);
                cVar.e(h.main_log_out);
                cVar.b(h.main_msg_log_out);
                final int i12 = 0;
                cVar.d(h.main_ok, new View.OnClickListener() { // from class: se.f
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view2) {
                        SettingsActivity settingsActivity2 = settingsActivity;
                        switch (i12) {
                            case 0:
                                int i13 = SettingsActivity.f34971d;
                                String string = settingsActivity2.getResources().getString(h.main_ok);
                                Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
                                SettingsActivity.n(string);
                                Fe.q0 q0Var = (Fe.q0) settingsActivity2.f27350a;
                                if (q0Var != null) {
                                    q0Var.logout();
                                }
                                break;
                            case 1:
                                int i14 = SettingsActivity.f34971d;
                                String string2 = settingsActivity2.getResources().getString(h.main_cancel);
                                Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
                                SettingsActivity.n(string2);
                                break;
                            default:
                                int i15 = SettingsActivity.f34971d;
                                String string3 = settingsActivity2.getResources().getString(h.main_closed);
                                Intrinsics.checkNotNullExpressionValue(string3, "getString(...)");
                                SettingsActivity.n(string3);
                                break;
                        }
                    }
                });
                cVar.c(h.main_cancel, new View.OnClickListener() { // from class: se.f
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view2) {
                        SettingsActivity settingsActivity2 = settingsActivity;
                        switch (i7) {
                            case 0:
                                int i13 = SettingsActivity.f34971d;
                                String string = settingsActivity2.getResources().getString(h.main_ok);
                                Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
                                SettingsActivity.n(string);
                                Fe.q0 q0Var = (Fe.q0) settingsActivity2.f27350a;
                                if (q0Var != null) {
                                    q0Var.logout();
                                }
                                break;
                            case 1:
                                int i14 = SettingsActivity.f34971d;
                                String string2 = settingsActivity2.getResources().getString(h.main_cancel);
                                Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
                                SettingsActivity.n(string2);
                                break;
                            default:
                                int i15 = SettingsActivity.f34971d;
                                String string3 = settingsActivity2.getResources().getString(h.main_closed);
                                Intrinsics.checkNotNullExpressionValue(string3, "getString(...)");
                                SettingsActivity.n(string3);
                                break;
                        }
                    }
                });
                final int i13 = 2;
                cVar.f6604j = new View.OnClickListener() { // from class: se.f
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view2) {
                        SettingsActivity settingsActivity2 = settingsActivity;
                        switch (i13) {
                            case 0:
                                int i14 = SettingsActivity.f34971d;
                                String string = settingsActivity2.getResources().getString(h.main_ok);
                                Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
                                SettingsActivity.n(string);
                                Fe.q0 q0Var = (Fe.q0) settingsActivity2.f27350a;
                                if (q0Var != null) {
                                    q0Var.logout();
                                }
                                break;
                            case 1:
                                int i15 = SettingsActivity.f34971d;
                                String string2 = settingsActivity2.getResources().getString(h.main_cancel);
                                Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
                                SettingsActivity.n(string2);
                                break;
                            default:
                                int i16 = SettingsActivity.f34971d;
                                String string3 = settingsActivity2.getResources().getString(h.main_closed);
                                Intrinsics.checkNotNullExpressionValue(string3, "getString(...)");
                                SettingsActivity.n(string3);
                                break;
                        }
                    }
                };
                cVar.g();
                break;
            case 13:
                i0.b0(((Data) obj).getMerchantServiceUrl());
                break;
            case 14:
                ((ThirdPartyMerchantActivity) obj).finish();
                break;
            case 15:
                ThirdPartyMerchantOrderDetailActivity thirdPartyMerchantOrderDetailActivity = (ThirdPartyMerchantOrderDetailActivity) obj;
                thirdPartyMerchantOrderDetailActivity.n(thirdPartyMerchantOrderDetailActivity.f35007a);
                break;
            case 16:
                ((OcApplyBaseActivity) obj).finish();
                break;
            case 17:
                Integer numValueOf = view != null ? Integer.valueOf(view.getId()) : null;
                int i14 = Ac.e.tvLogin;
                WelcomeNewUserActivity welcomeNewUserActivity = (WelcomeNewUserActivity) obj;
                if (numValueOf != null && numValueOf.intValue() == i14) {
                    String str2 = welcomeNewUserActivity.f35042b;
                    if (str2 == null || str2.length() == 0) {
                        d.F("/account/login");
                    } else {
                        d.H("/account/login", "business_path", str2);
                    }
                } else {
                    int i15 = Ac.e.btnSignUp;
                    if (numValueOf != null && numValueOf.intValue() == i15) {
                        String str3 = welcomeNewUserActivity.f35042b;
                        if (str3 == null || str3.length() == 0) {
                            d.F("/account/signup");
                        } else {
                            d.H("/account/signup", "business_path", str3);
                        }
                    }
                }
                welcomeNewUserActivity.finish();
                break;
            default:
                if (view != null) {
                    View view2 = view.getTag() instanceof HomeRewardsClaimClickEvent ? view : null;
                    if (view2 != null) {
                        Object tag = view2.getTag();
                        Intrinsics.f(tag, "null cannot be cast to non-null type com.transsnet.palmpay.main.export.bean.rsp.HomeRewardsClaimClickEvent");
                        HomeRewardsClaimClickEvent homeRewardsClaimClickEvent = (HomeRewardsClaimClickEvent) tag;
                        Integer contentType = homeRewardsClaimClickEvent.getContentType();
                        int content_type_reward_task = HomeRewardsCenterContentType.INSTANCE.getCONTENT_TYPE_REWARD_TASK();
                        j jVar = (j) obj;
                        if (contentType != null && contentType.intValue() == content_type_reward_task) {
                            RewardsInfo rewardsInfo = homeRewardsClaimClickEvent instanceof RewardsInfo ? (RewardsInfo) homeRewardsClaimClickEvent : null;
                            if (rewardsInfo != null) {
                                String str4 = rewardsInfo.memberTaskNo;
                                Long l5 = rewardsInfo.rewardSpecialMemberCycleId;
                                if (str4 != null && str4.length() != 0 && l5 != null && (weakReference = jVar.f44332a) != null && (homeFragmentHomeTab2 = (HomeFragmentHomeTab) weakReference.get()) != null && (homeFragment = (HomeFragment) homeFragmentHomeTab2.getParentFragment()) != null) {
                                    homeFragment.H(homeFragment.E());
                                    if (str4.length() != 0 && (homePalmZoneTabV2B = homeFragment.B()) != null && (palmZoneViewModel = (PalmZoneViewModel) homePalmZoneTabV2B.f27333i) != null) {
                                        palmZoneViewModel.e(l5, str4);
                                    }
                                }
                            }
                        } else {
                            if (view instanceof PpButton) {
                                ((PpButton) view).b(true);
                            }
                            WeakReference weakReference2 = jVar.f44332a;
                            if (weakReference2 != null && (homeFragmentHomeTab = (HomeFragmentHomeTab) weakReference2.get()) != null) {
                                ClaimRewardReq claimRewardReq = new ClaimRewardReq();
                                claimRewardReq.activityId = homeRewardsClaimClickEvent.getActivityId();
                                claimRewardReq.couponCode = homeRewardsClaimClickEvent.getCouponCode();
                                claimRewardReq.contentType = homeRewardsClaimClickEvent.getContentType();
                                claimRewardReq.bizIdList = homeRewardsClaimClickEvent.takeBizIdList();
                                I i16 = (I) homeFragmentHomeTab.f27328i;
                                if (i16 != null) {
                                    i16.claimRewardsCenterReward(claimRewardReq);
                                }
                            }
                        }
                        HomeRewardsStatisticsExtKt.sendStatisticsEvent(homeRewardsClaimClickEvent);
                    }
                }
                break;
        }
    }
}
