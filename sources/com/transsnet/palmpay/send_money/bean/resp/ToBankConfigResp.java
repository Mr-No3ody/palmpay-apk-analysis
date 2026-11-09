package com.transsnet.palmpay.send_money.bean.resp;

import com.facebook.react.fabric.mounting.mountitems.IntBufferBatchMountItem;
import com.transsnet.palmpay.send_money.bean.RecentlyCompensationBean;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b/\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u0089\u0001\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\t\u0012\u0010\b\u0002\u0010\n\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u000b\u0012\u0010\b\u0002\u0010\r\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u000b\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000f\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0011\u0012\u0010\b\u0002\u0010\u0012\u001a\n\u0012\u0004\u0012\u00020\u0013\u0018\u00010\u000b\u0012\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0013¢\u0006\u0004\b\u0015\u0010\u0016J\u000b\u00104\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u00105\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u0010\u00106\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0002\u0010\u001cJ\u000b\u00107\u001a\u0004\u0018\u00010\tHÆ\u0003J\u0011\u00108\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u000bHÆ\u0003J\u0011\u00109\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u000bHÆ\u0003J\u000b\u0010:\u001a\u0004\u0018\u00010\u000fHÆ\u0003J\u000b\u0010;\u001a\u0004\u0018\u00010\u0011HÆ\u0003J\u0011\u0010<\u001a\n\u0012\u0004\u0012\u00020\u0013\u0018\u00010\u000bHÆ\u0003J\u000b\u0010=\u001a\u0004\u0018\u00010\u0013HÆ\u0003J\u0098\u0001\u0010>\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t2\u0010\b\u0002\u0010\n\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u000b2\u0010\b\u0002\u0010\r\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u000b2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00112\u0010\b\u0002\u0010\u0012\u001a\n\u0012\u0004\u0012\u00020\u0013\u0018\u00010\u000b2\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0013HÆ\u0001¢\u0006\u0002\u0010?J\u0013\u0010@\u001a\u00020\u00072\b\u0010A\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010B\u001a\u00020CHÖ\u0001J\t\u0010D\u001a\u00020\tHÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u0015\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\n\n\u0002\u0010\u001d\u001a\u0004\b\u001b\u0010\u001cR\u0013\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001fR\"\u0010\n\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u000bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b \u0010!\"\u0004\b\"\u0010#R\"\u0010\r\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u000bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b$\u0010!\"\u0004\b%\u0010#R\u001c\u0010\u000e\u001a\u0004\u0018\u00010\u000fX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b&\u0010'\"\u0004\b(\u0010)R\u001c\u0010\u0010\u001a\u0004\u0018\u00010\u0011X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b*\u0010+\"\u0004\b,\u0010-R\"\u0010\u0012\u001a\n\u0012\u0004\u0012\u00020\u0013\u0018\u00010\u000bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b.\u0010!\"\u0004\b/\u0010#R\u001c\u0010\u0014\u001a\u0004\u0018\u00010\u0013X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b0\u00101\"\u0004\b2\u00103¨\u0006E"}, d2 = {"Lcom/transsnet/palmpay/send_money/bean/resp/ToBankConfigResp;", "", "topEntrance", "Lcom/transsnet/palmpay/send_money/bean/resp/TopEntranceBean;", "bookTransfer", "Lcom/transsnet/palmpay/send_money/bean/resp/IsBookTransferResp;", "showTransferUssd", "", "ussdDialCode", "", "bannerEntranceList", "", "Lcom/transsnet/palmpay/send_money/bean/resp/BannerEntranceBean;", "topBanners", "recentlyScheduleTransfer", "Lcom/transsnet/palmpay/send_money/bean/resp/RecentlyScheduleTransferBean;", "recentlyCompensation", "Lcom/transsnet/palmpay/send_money/bean/RecentlyCompensationBean;", "benefitsBannerList", "Lcom/transsnet/palmpay/send_money/bean/resp/BenefitsBean;", "transferSafe", "<init>", "(Lcom/transsnet/palmpay/send_money/bean/resp/TopEntranceBean;Lcom/transsnet/palmpay/send_money/bean/resp/IsBookTransferResp;Ljava/lang/Boolean;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Lcom/transsnet/palmpay/send_money/bean/resp/RecentlyScheduleTransferBean;Lcom/transsnet/palmpay/send_money/bean/RecentlyCompensationBean;Ljava/util/List;Lcom/transsnet/palmpay/send_money/bean/resp/BenefitsBean;)V", "getTopEntrance", "()Lcom/transsnet/palmpay/send_money/bean/resp/TopEntranceBean;", "getBookTransfer", "()Lcom/transsnet/palmpay/send_money/bean/resp/IsBookTransferResp;", "getShowTransferUssd", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getUssdDialCode", "()Ljava/lang/String;", "getBannerEntranceList", "()Ljava/util/List;", "setBannerEntranceList", "(Ljava/util/List;)V", "getTopBanners", "setTopBanners", "getRecentlyScheduleTransfer", "()Lcom/transsnet/palmpay/send_money/bean/resp/RecentlyScheduleTransferBean;", "setRecentlyScheduleTransfer", "(Lcom/transsnet/palmpay/send_money/bean/resp/RecentlyScheduleTransferBean;)V", "getRecentlyCompensation", "()Lcom/transsnet/palmpay/send_money/bean/RecentlyCompensationBean;", "setRecentlyCompensation", "(Lcom/transsnet/palmpay/send_money/bean/RecentlyCompensationBean;)V", "getBenefitsBannerList", "setBenefitsBannerList", "getTransferSafe", "()Lcom/transsnet/palmpay/send_money/bean/resp/BenefitsBean;", "setTransferSafe", "(Lcom/transsnet/palmpay/send_money/bean/resp/BenefitsBean;)V", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "copy", "(Lcom/transsnet/palmpay/send_money/bean/resp/TopEntranceBean;Lcom/transsnet/palmpay/send_money/bean/resp/IsBookTransferResp;Ljava/lang/Boolean;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Lcom/transsnet/palmpay/send_money/bean/resp/RecentlyScheduleTransferBean;Lcom/transsnet/palmpay/send_money/bean/RecentlyCompensationBean;Ljava/util/List;Lcom/transsnet/palmpay/send_money/bean/resp/BenefitsBean;)Lcom/transsnet/palmpay/send_money/bean/resp/ToBankConfigResp;", "equals", "other", "hashCode", "", "toString", "module_money_transfer_export_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final /* data */ class ToBankConfigResp {

    @Nullable
    private List<BannerEntranceBean> bannerEntranceList;

    @Nullable
    private List<BenefitsBean> benefitsBannerList;

    @Nullable
    private final IsBookTransferResp bookTransfer;

    @Nullable
    private RecentlyCompensationBean recentlyCompensation;

    @Nullable
    private RecentlyScheduleTransferBean recentlyScheduleTransfer;

    @Nullable
    private final Boolean showTransferUssd;

    @Nullable
    private List<BannerEntranceBean> topBanners;

    @Nullable
    private final TopEntranceBean topEntrance;

    @Nullable
    private BenefitsBean transferSafe;

    @Nullable
    private final String ussdDialCode;

    public ToBankConfigResp(@Nullable TopEntranceBean topEntranceBean, @Nullable IsBookTransferResp isBookTransferResp, @Nullable Boolean bool, @Nullable String str, @Nullable List<BannerEntranceBean> list, @Nullable List<BannerEntranceBean> list2, @Nullable RecentlyScheduleTransferBean recentlyScheduleTransferBean, @Nullable RecentlyCompensationBean recentlyCompensationBean, @Nullable List<BenefitsBean> list3, @Nullable BenefitsBean benefitsBean) {
        this.topEntrance = topEntranceBean;
        this.bookTransfer = isBookTransferResp;
        this.showTransferUssd = bool;
        this.ussdDialCode = str;
        this.bannerEntranceList = list;
        this.topBanners = list2;
        this.recentlyScheduleTransfer = recentlyScheduleTransferBean;
        this.recentlyCompensation = recentlyCompensationBean;
        this.benefitsBannerList = list3;
        this.transferSafe = benefitsBean;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ ToBankConfigResp copy$default(ToBankConfigResp toBankConfigResp, TopEntranceBean topEntranceBean, IsBookTransferResp isBookTransferResp, Boolean bool, String str, List list, List list2, RecentlyScheduleTransferBean recentlyScheduleTransferBean, RecentlyCompensationBean recentlyCompensationBean, List list3, BenefitsBean benefitsBean, int i7, Object obj) {
        if ((i7 & 1) != 0) {
            topEntranceBean = toBankConfigResp.topEntrance;
        }
        if ((i7 & 2) != 0) {
            isBookTransferResp = toBankConfigResp.bookTransfer;
        }
        if ((i7 & 4) != 0) {
            bool = toBankConfigResp.showTransferUssd;
        }
        if ((i7 & 8) != 0) {
            str = toBankConfigResp.ussdDialCode;
        }
        if ((i7 & 16) != 0) {
            list = toBankConfigResp.bannerEntranceList;
        }
        if ((i7 & 32) != 0) {
            list2 = toBankConfigResp.topBanners;
        }
        if ((i7 & 64) != 0) {
            recentlyScheduleTransferBean = toBankConfigResp.recentlyScheduleTransfer;
        }
        if ((i7 & 128) != 0) {
            recentlyCompensationBean = toBankConfigResp.recentlyCompensation;
        }
        if ((i7 & IntBufferBatchMountItem.INSTRUCTION_UPDATE_EVENT_EMITTER) != 0) {
            list3 = toBankConfigResp.benefitsBannerList;
        }
        if ((i7 & 512) != 0) {
            benefitsBean = toBankConfigResp.transferSafe;
        }
        List list4 = list3;
        BenefitsBean benefitsBean2 = benefitsBean;
        RecentlyScheduleTransferBean recentlyScheduleTransferBean2 = recentlyScheduleTransferBean;
        RecentlyCompensationBean recentlyCompensationBean2 = recentlyCompensationBean;
        List list5 = list;
        List list6 = list2;
        return toBankConfigResp.copy(topEntranceBean, isBookTransferResp, bool, str, list5, list6, recentlyScheduleTransferBean2, recentlyCompensationBean2, list4, benefitsBean2);
    }

    @Nullable
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final TopEntranceBean getTopEntrance() {
        return this.topEntrance;
    }

    @Nullable
    /* JADX INFO: renamed from: component10, reason: from getter */
    public final BenefitsBean getTransferSafe() {
        return this.transferSafe;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final IsBookTransferResp getBookTransfer() {
        return this.bookTransfer;
    }

    @Nullable
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final Boolean getShowTransferUssd() {
        return this.showTransferUssd;
    }

    @Nullable
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getUssdDialCode() {
        return this.ussdDialCode;
    }

    @Nullable
    public final List<BannerEntranceBean> component5() {
        return this.bannerEntranceList;
    }

    @Nullable
    public final List<BannerEntranceBean> component6() {
        return this.topBanners;
    }

    @Nullable
    /* JADX INFO: renamed from: component7, reason: from getter */
    public final RecentlyScheduleTransferBean getRecentlyScheduleTransfer() {
        return this.recentlyScheduleTransfer;
    }

    @Nullable
    /* JADX INFO: renamed from: component8, reason: from getter */
    public final RecentlyCompensationBean getRecentlyCompensation() {
        return this.recentlyCompensation;
    }

    @Nullable
    public final List<BenefitsBean> component9() {
        return this.benefitsBannerList;
    }

    @NotNull
    public final ToBankConfigResp copy(@Nullable TopEntranceBean topEntrance, @Nullable IsBookTransferResp bookTransfer, @Nullable Boolean showTransferUssd, @Nullable String ussdDialCode, @Nullable List<BannerEntranceBean> bannerEntranceList, @Nullable List<BannerEntranceBean> topBanners, @Nullable RecentlyScheduleTransferBean recentlyScheduleTransfer, @Nullable RecentlyCompensationBean recentlyCompensation, @Nullable List<BenefitsBean> benefitsBannerList, @Nullable BenefitsBean transferSafe) {
        return new ToBankConfigResp(topEntrance, bookTransfer, showTransferUssd, ussdDialCode, bannerEntranceList, topBanners, recentlyScheduleTransfer, recentlyCompensation, benefitsBannerList, transferSafe);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ToBankConfigResp)) {
            return false;
        }
        ToBankConfigResp toBankConfigResp = (ToBankConfigResp) other;
        return Intrinsics.c(this.topEntrance, toBankConfigResp.topEntrance) && Intrinsics.c(this.bookTransfer, toBankConfigResp.bookTransfer) && Intrinsics.c(this.showTransferUssd, toBankConfigResp.showTransferUssd) && Intrinsics.c(this.ussdDialCode, toBankConfigResp.ussdDialCode) && Intrinsics.c(this.bannerEntranceList, toBankConfigResp.bannerEntranceList) && Intrinsics.c(this.topBanners, toBankConfigResp.topBanners) && Intrinsics.c(this.recentlyScheduleTransfer, toBankConfigResp.recentlyScheduleTransfer) && Intrinsics.c(this.recentlyCompensation, toBankConfigResp.recentlyCompensation) && Intrinsics.c(this.benefitsBannerList, toBankConfigResp.benefitsBannerList) && Intrinsics.c(this.transferSafe, toBankConfigResp.transferSafe);
    }

    @Nullable
    public final List<BannerEntranceBean> getBannerEntranceList() {
        return this.bannerEntranceList;
    }

    @Nullable
    public final List<BenefitsBean> getBenefitsBannerList() {
        return this.benefitsBannerList;
    }

    @Nullable
    public final IsBookTransferResp getBookTransfer() {
        return this.bookTransfer;
    }

    @Nullable
    public final RecentlyCompensationBean getRecentlyCompensation() {
        return this.recentlyCompensation;
    }

    @Nullable
    public final RecentlyScheduleTransferBean getRecentlyScheduleTransfer() {
        return this.recentlyScheduleTransfer;
    }

    @Nullable
    public final Boolean getShowTransferUssd() {
        return this.showTransferUssd;
    }

    @Nullable
    public final List<BannerEntranceBean> getTopBanners() {
        return this.topBanners;
    }

    @Nullable
    public final TopEntranceBean getTopEntrance() {
        return this.topEntrance;
    }

    @Nullable
    public final BenefitsBean getTransferSafe() {
        return this.transferSafe;
    }

    @Nullable
    public final String getUssdDialCode() {
        return this.ussdDialCode;
    }

    public int hashCode() {
        TopEntranceBean topEntranceBean = this.topEntrance;
        int iHashCode = (topEntranceBean == null ? 0 : topEntranceBean.hashCode()) * 31;
        IsBookTransferResp isBookTransferResp = this.bookTransfer;
        int iHashCode2 = (iHashCode + (isBookTransferResp == null ? 0 : isBookTransferResp.hashCode())) * 31;
        Boolean bool = this.showTransferUssd;
        int iHashCode3 = (iHashCode2 + (bool == null ? 0 : bool.hashCode())) * 31;
        String str = this.ussdDialCode;
        int iHashCode4 = (iHashCode3 + (str == null ? 0 : str.hashCode())) * 31;
        List<BannerEntranceBean> list = this.bannerEntranceList;
        int iHashCode5 = (iHashCode4 + (list == null ? 0 : list.hashCode())) * 31;
        List<BannerEntranceBean> list2 = this.topBanners;
        int iHashCode6 = (iHashCode5 + (list2 == null ? 0 : list2.hashCode())) * 31;
        RecentlyScheduleTransferBean recentlyScheduleTransferBean = this.recentlyScheduleTransfer;
        int iHashCode7 = (iHashCode6 + (recentlyScheduleTransferBean == null ? 0 : recentlyScheduleTransferBean.hashCode())) * 31;
        RecentlyCompensationBean recentlyCompensationBean = this.recentlyCompensation;
        int iHashCode8 = (iHashCode7 + (recentlyCompensationBean == null ? 0 : recentlyCompensationBean.hashCode())) * 31;
        List<BenefitsBean> list3 = this.benefitsBannerList;
        int iHashCode9 = (iHashCode8 + (list3 == null ? 0 : list3.hashCode())) * 31;
        BenefitsBean benefitsBean = this.transferSafe;
        return iHashCode9 + (benefitsBean != null ? benefitsBean.hashCode() : 0);
    }

    public final void setBannerEntranceList(@Nullable List<BannerEntranceBean> list) {
        this.bannerEntranceList = list;
    }

    public final void setBenefitsBannerList(@Nullable List<BenefitsBean> list) {
        this.benefitsBannerList = list;
    }

    public final void setRecentlyCompensation(@Nullable RecentlyCompensationBean recentlyCompensationBean) {
        this.recentlyCompensation = recentlyCompensationBean;
    }

    public final void setRecentlyScheduleTransfer(@Nullable RecentlyScheduleTransferBean recentlyScheduleTransferBean) {
        this.recentlyScheduleTransfer = recentlyScheduleTransferBean;
    }

    public final void setTopBanners(@Nullable List<BannerEntranceBean> list) {
        this.topBanners = list;
    }

    public final void setTransferSafe(@Nullable BenefitsBean benefitsBean) {
        this.transferSafe = benefitsBean;
    }

    @NotNull
    public String toString() {
        return "ToBankConfigResp(topEntrance=" + this.topEntrance + ", bookTransfer=" + this.bookTransfer + ", showTransferUssd=" + this.showTransferUssd + ", ussdDialCode=" + this.ussdDialCode + ", bannerEntranceList=" + this.bannerEntranceList + ", topBanners=" + this.topBanners + ", recentlyScheduleTransfer=" + this.recentlyScheduleTransfer + ", recentlyCompensation=" + this.recentlyCompensation + ", benefitsBannerList=" + this.benefitsBannerList + ", transferSafe=" + this.transferSafe + ")";
    }

    public /* synthetic */ ToBankConfigResp(TopEntranceBean topEntranceBean, IsBookTransferResp isBookTransferResp, Boolean bool, String str, List list, List list2, RecentlyScheduleTransferBean recentlyScheduleTransferBean, RecentlyCompensationBean recentlyCompensationBean, List list3, BenefitsBean benefitsBean, int i7, DefaultConstructorMarker defaultConstructorMarker) {
        this(topEntranceBean, isBookTransferResp, bool, str, (i7 & 16) != 0 ? null : list, (i7 & 32) != 0 ? null : list2, (i7 & 64) != 0 ? null : recentlyScheduleTransferBean, (i7 & 128) != 0 ? null : recentlyCompensationBean, (i7 & IntBufferBatchMountItem.INSTRUCTION_UPDATE_EVENT_EMITTER) != 0 ? null : list3, (i7 & 512) != 0 ? null : benefitsBean);
    }
}
