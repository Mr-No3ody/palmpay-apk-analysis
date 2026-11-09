package p024b9;

import Ab.D;
import C0.P;
import F8.d;
import Pa.n0;
import Pa.r0;
import android.app.Activity;
import android.content.Context;
import android.text.TextUtils;
import com.transsnet.palmpay.account.bean.ApplyForTier3Req;
import com.transsnet.palmpay.account.bean.Tier3ApplyStatusRsp;
import com.transsnet.palmpay.account.bean.rsp.CountryRegionList;
import com.transsnet.palmpay.account.bean.rsp.LatestBillerOrderDetailRsp;
import com.transsnet.palmpay.account.bean.rsp.QueryAddressFromBillRsp;
import com.transsnet.palmpay.account.ui.activity.PalmPayLevelUpTier3V2Activity;
import com.transsnet.palmpay.account.ui.activity.PalmPayTier3PendingActivity;
import com.transsnet.palmpay.core.base.BaseApplication;
import com.transsnet.palmpay.core.bean.CommonBeanResult;
import io.fastkv.n;
import java.util.Calendar;
import java.util.HashMap;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p025ba.k;
import p220oa.h;

/* JADX INFO: loaded from: classes3.dex */
public final class b {
    public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private final String resolveAreaCode(List<? extends CountryRegionList> list, String str, String str2) {
        if (list != null && !TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2)) {
            for (CountryRegionList countryRegionList : list) {
                if (Intrinsics.c(str, countryRegionList.areaName)) {
                    for (CountryRegionList countryRegionList2 : countryRegionList.children) {
                        if (Intrinsics.c(str2, countryRegionList2.areaName)) {
                            return countryRegionList2.areaCode;
                        }
                    }
                }
            }
        }
        return null;
    }

    private final String resolveLgaCode(List<? extends CountryRegionList> list, String str, String str2, String str3) {
        List<CountryRegionList> list2;
        if (list != null && !TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2) && !TextUtils.isEmpty(str3)) {
            for (CountryRegionList countryRegionList : list) {
                if (Intrinsics.c(str, countryRegionList.areaName)) {
                    for (CountryRegionList countryRegionList2 : countryRegionList.children) {
                        if (Intrinsics.c(str2, countryRegionList2.areaName) && (list2 = countryRegionList2.children) != null) {
                            for (CountryRegionList countryRegionList3 : list2) {
                                if (Intrinsics.c(str3, countryRegionList3.areaName)) {
                                    return countryRegionList3.areaCode;
                                }
                            }
                        }
                    }
                }
            }
        }
        return null;
    }

    private final String resolveStateCode(List<? extends CountryRegionList> list, String str) {
        if (list != null && !TextUtils.isEmpty(str)) {
            for (CountryRegionList countryRegionList : list) {
                if (Intrinsics.c(str, countryRegionList.areaName)) {
                    return countryRegionList.areaCode;
                }
            }
        }
        return null;
    }

    @NotNull
    public final String billReceiptAddressNoteDate(@Nullable Long l5) {
        Calendar calendar = Calendar.getInstance();
        if (l5 == null || l5.longValue() <= 0) {
            calendar.add(2, -6);
        } else {
            calendar.add(6, -((int) l5.longValue()));
        }
        String strS = r0.S(calendar.getTimeInMillis());
        Intrinsics.checkNotNullExpressionValue(strS, "getDateFormat_MM_d_y(...)");
        return strS;
    }

    @NotNull
    public final ApplyForTier3Req buildRequest(@Nullable String str, @Nullable QueryAddressFromBillRsp queryAddressFromBillRsp, @Nullable String str2, @Nullable String str3, @Nullable String str4, @Nullable String str5, @Nullable String str6, @Nullable List<? extends CountryRegionList> list, @Nullable Tier3ApplyStatusRsp tier3ApplyStatusRsp) {
        String strResolveStateCode;
        String strResolveAreaCode;
        String strResolveLgaCode;
        ApplyForTier3Req applyForTier3Req = new ApplyForTier3Req();
        applyForTier3Req.homeAddressImg = str;
        if (str2 == null) {
            str2 = queryAddressFromBillRsp != null ? queryAddressFromBillRsp.getStateName() : null;
        }
        applyForTier3Req.stateName = str2;
        if (queryAddressFromBillRsp == null || (strResolveStateCode = queryAddressFromBillRsp.getStateCode()) == null) {
            strResolveStateCode = resolveStateCode(list, applyForTier3Req.stateName);
        }
        applyForTier3Req.stateCode = strResolveStateCode;
        if (TextUtils.isEmpty(strResolveStateCode) && tier3ApplyStatusRsp != null) {
            Tier3ApplyStatusRsp tier3ApplyStatusRsp2 = Intrinsics.c(applyForTier3Req.stateName, tier3ApplyStatusRsp.stateName) ? tier3ApplyStatusRsp : null;
            if (tier3ApplyStatusRsp2 != null) {
                applyForTier3Req.stateCode = tier3ApplyStatusRsp2.stateCode;
            }
        }
        if (str3 == null) {
            str3 = queryAddressFromBillRsp != null ? queryAddressFromBillRsp.getAreaName() : null;
        }
        applyForTier3Req.areaName = str3;
        if (queryAddressFromBillRsp == null || (strResolveAreaCode = queryAddressFromBillRsp.getAreaCode()) == null) {
            strResolveAreaCode = resolveAreaCode(list, applyForTier3Req.stateName, applyForTier3Req.areaName);
        }
        applyForTier3Req.areaCode = strResolveAreaCode;
        if (TextUtils.isEmpty(strResolveAreaCode) && tier3ApplyStatusRsp != null) {
            Tier3ApplyStatusRsp tier3ApplyStatusRsp3 = Intrinsics.c(applyForTier3Req.areaName, tier3ApplyStatusRsp.areaName) ? tier3ApplyStatusRsp : null;
            if (tier3ApplyStatusRsp3 != null) {
                applyForTier3Req.areaCode = tier3ApplyStatusRsp3.areaCode;
            }
        }
        if (str4 == null) {
            str4 = queryAddressFromBillRsp != null ? queryAddressFromBillRsp.getLgaName() : null;
        }
        applyForTier3Req.lgaName = str4;
        if (queryAddressFromBillRsp == null || (strResolveLgaCode = queryAddressFromBillRsp.getLgaCode()) == null) {
            strResolveLgaCode = resolveLgaCode(list, applyForTier3Req.stateName, applyForTier3Req.areaName, applyForTier3Req.lgaName);
        }
        applyForTier3Req.lgaCode = strResolveLgaCode;
        if (TextUtils.isEmpty(strResolveLgaCode) && tier3ApplyStatusRsp != null) {
            if (!Intrinsics.c(applyForTier3Req.lgaName, tier3ApplyStatusRsp.lgaName)) {
                tier3ApplyStatusRsp = null;
            }
            if (tier3ApplyStatusRsp != null) {
                applyForTier3Req.lgaCode = tier3ApplyStatusRsp.lgaCode;
            }
        }
        if (str5 == null) {
            str5 = queryAddressFromBillRsp != null ? queryAddressFromBillRsp.getAddressDetails() : null;
        }
        applyForTier3Req.street = str5;
        if (!TextUtils.isEmpty(str6)) {
            applyForTier3Req.orderNo = str6;
        }
        return applyForTier3Req;
    }

    /* JADX WARN: Code duplicated, block: B:15:0x001f  */
    @NotNull
    public final ApplyForTier3Req buildRequestFromParsedAddress(@Nullable PalmPayLevelUpTier3V2Activity palmPayLevelUpTier3V2Activity, @Nullable QueryAddressFromBillRsp queryAddressFromBillRsp, @Nullable String str) {
        String str2;
        if (TextUtils.isEmpty(palmPayLevelUpTier3V2Activity != null ? palmPayLevelUpTier3V2Activity.f25918c : null)) {
            str2 = null;
        } else {
            if (!Intrinsics.c(str, palmPayLevelUpTier3V2Activity != null ? palmPayLevelUpTier3V2Activity.f25917b : null) || palmPayLevelUpTier3V2Activity == null) {
                str2 = null;
            } else {
                str2 = palmPayLevelUpTier3V2Activity.f25918c;
            }
        }
        return buildRequest(str, queryAddressFromBillRsp, queryAddressFromBillRsp != null ? queryAddressFromBillRsp.getStateName() : null, queryAddressFromBillRsp != null ? queryAddressFromBillRsp.getAreaName() : null, queryAddressFromBillRsp != null ? queryAddressFromBillRsp.getLgaName() : null, queryAddressFromBillRsp != null ? queryAddressFromBillRsp.getAddressDetails() : null, str2, null, null);
    }

    @Nullable
    public final QueryAddressFromBillRsp fromPpBillOrder(@Nullable LatestBillerOrderDetailRsp latestBillerOrderDetailRsp) {
        if (latestBillerOrderDetailRsp == null) {
            return null;
        }
        String str = latestBillerOrderDetailRsp.stateCode;
        String str2 = latestBillerOrderDetailRsp.stateName;
        String str3 = latestBillerOrderDetailRsp.areaCode;
        String str4 = latestBillerOrderDetailRsp.areaName;
        String str5 = latestBillerOrderDetailRsp.lgaCode;
        String str6 = latestBillerOrderDetailRsp.lgaName;
        LatestBillerOrderDetailRsp.OrderDataBean orderDataBean = latestBillerOrderDetailRsp.orderInfo;
        return new QueryAddressFromBillRsp(str, str2, str3, str4, str5, str6, "", "", orderDataBean != null ? orderDataBean.address : null);
    }

    public final void handleApplicationResult(@Nullable Activity activity, @Nullable Context context, @Nullable CommonBeanResult<Tier3ApplyStatusRsp> commonBeanResult) {
        if (commonBeanResult != null) {
            HashMap map = new HashMap();
            map.put("AddressVerifyError_type", commonBeanResult.getRespCode());
            map.put("AddressVerifyError_Text", commonBeanResult.getRespMsg());
            n0.g().w("KYC_AddressVerifyError_Click", map);
            if (!commonBeanResult.isSuccess()) {
                if (commonBeanResult.getRichTextErrorDialog(context) != null || context == null) {
                    return;
                }
                n.O(context, 0, Integer.valueOf(k.core_oops), null, null, null, null, commonBeanResult.getRespMsg(), Integer.valueOf(k.core_confirm), null, null, null, null, null, null, false, 0, 8388221);
                return;
            }
            Tier3ApplyStatusRsp tier3ApplyStatusRsp = commonBeanResult.data;
            if (tier3ApplyStatusRsp == null || tier3ApplyStatusRsp.approveStatusNew != 2) {
                if (activity != null) {
                    PalmPayTier3PendingActivity.a.launch$default(PalmPayTier3PendingActivity.f25938i, activity, null, tier3ApplyStatusRsp, null, 10, null);
                    activity.finish();
                    return;
                }
                return;
            }
            PalmPayLevelUpTier3V2Activity palmPayLevelUpTier3V2Activity = activity instanceof PalmPayLevelUpTier3V2Activity ? (PalmPayLevelUpTier3V2Activity) activity : null;
            if (palmPayLevelUpTier3V2Activity == null) {
                if (activity != null) {
                    PalmPayTier3PendingActivity.a.launch$default(PalmPayTier3PendingActivity.f25938i, activity, null, tier3ApplyStatusRsp, null, 10, null);
                    activity.finish();
                    return;
                }
                return;
            }
            BaseApplication.get().getUserDataSource().a().i(p071ef.b.a()).subscribe(new D(palmPayLevelUpTier3V2Activity, 21));
            palmPayLevelUpTier3V2Activity.f25923i = commonBeanResult.data;
            Bc.n nVar = palmPayLevelUpTier3V2Activity.f25924j;
            if (nVar != null) {
                h.c(nVar.f781c);
            }
            P p3 = palmPayLevelUpTier3V2Activity.f25916a;
            if (p3 != null) {
                p3.h(d.fragment_tier3_step_loading, null, PalmPayLevelUpTier3V2Activity.f25915o.buildSlideNavOptions(Integer.valueOf(d.fragment_tier3_step_face), true));
            }
        }
    }

    @NotNull
    public final QueryAddressFromBillRsp mergeNonEmptyAddressFields(@NotNull QueryAddressFromBillRsp target, @NotNull QueryAddressFromBillRsp source) {
        Intrinsics.checkNotNullParameter(target, "target");
        Intrinsics.checkNotNullParameter(source, "source");
        String stateCode = source.getStateCode();
        if (TextUtils.isEmpty(stateCode)) {
            stateCode = null;
        }
        if (stateCode == null) {
            stateCode = target.getStateCode();
        }
        String str = stateCode;
        String stateName = source.getStateName();
        if (TextUtils.isEmpty(stateName)) {
            stateName = null;
        }
        if (stateName == null) {
            stateName = target.getStateName();
        }
        String str2 = stateName;
        String areaCode = source.getAreaCode();
        if (TextUtils.isEmpty(areaCode)) {
            areaCode = null;
        }
        if (areaCode == null) {
            areaCode = target.getAreaCode();
        }
        String str3 = areaCode;
        String areaName = source.getAreaName();
        if (TextUtils.isEmpty(areaName)) {
            areaName = null;
        }
        if (areaName == null) {
            areaName = target.getAreaName();
        }
        String str4 = areaName;
        String lgaCode = source.getLgaCode();
        if (TextUtils.isEmpty(lgaCode)) {
            lgaCode = null;
        }
        if (lgaCode == null) {
            lgaCode = target.getLgaCode();
        }
        String str5 = lgaCode;
        String lgaName = source.getLgaName();
        if (TextUtils.isEmpty(lgaName)) {
            lgaName = null;
        }
        if (lgaName == null) {
            lgaName = target.getLgaName();
        }
        String str6 = lgaName;
        String addressDetails = source.getAddressDetails();
        if (TextUtils.isEmpty(addressDetails)) {
            addressDetails = null;
        }
        if (addressDetails == null) {
            addressDetails = target.getAddressDetails();
        }
        String str7 = addressDetails;
        String billType = source.getBillType();
        if (TextUtils.isEmpty(billType)) {
            billType = null;
        }
        if (billType == null) {
            billType = target.getBillType();
        }
        String str8 = billType;
        String billDate = source.getBillDate();
        String billDate2 = TextUtils.isEmpty(billDate) ? null : billDate;
        if (billDate2 == null) {
            billDate2 = target.getBillDate();
        }
        return target.copy(str, str2, str3, str4, str5, str6, str8, billDate2, str7);
    }

    private b() {
    }
}
