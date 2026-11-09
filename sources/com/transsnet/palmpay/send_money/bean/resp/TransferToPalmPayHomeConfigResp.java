package com.transsnet.palmpay.send_money.bean.resp;

import com.facebook.react.fabric.mounting.mountitems.IntBufferBatchMountItem;
import com.transsnet.palmpay.core.bean.rsp.CashBoxTrialCashEntryResp;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b!\u0018\u00002\u00020\u0001B\u0085\u0001\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\u0010\b\u0002\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b\u0012\u0010\b\u0002\u0010\f\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\r\u0012\u0010\b\u0002\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0011¢\u0006\u0004\b\u0012\u0010\u0013R\u001c\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\u0015\"\u0004\b\u0019\u0010\u0017R\"\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u001dR\u001c\u0010\b\u001a\u0004\u0018\u00010\tX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001e\u0010\u001f\"\u0004\b \u0010!R\u001c\u0010\n\u001a\u0004\u0018\u00010\u000bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\"\u0010#\"\u0004\b$\u0010%R\"\u0010\f\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b&\u0010\u001b\"\u0004\b'\u0010\u001dR\u001c\u0010\u000e\u001a\u0004\u0018\u00010\rX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b(\u0010)\"\u0004\b*\u0010+R\"\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b,\u0010\u001b\"\u0004\b-\u0010\u001dR\u001c\u0010\u0010\u001a\u0004\u0018\u00010\u0011X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b.\u0010/\"\u0004\b0\u00101¨\u00062"}, d2 = {"Lcom/transsnet/palmpay/send_money/bean/resp/TransferToPalmPayHomeConfigResp;", "", "noRecipientLocalContactPic", "", "noRecipientLocalContactDarkPic", "bannerEntranceList", "", "Lcom/transsnet/palmpay/send_money/bean/resp/BannerEntranceBean;", "recentlyScheduleTransfer", "Lcom/transsnet/palmpay/send_money/bean/resp/RecentlyScheduleTransferBean;", "financeInfo", "Lcom/transsnet/palmpay/core/bean/rsp/CashBoxTrialCashEntryResp;", "benefitsBannerList", "Lcom/transsnet/palmpay/send_money/bean/resp/BenefitsBean;", "transferSafe", "topBanners", "topEntrance", "Lcom/transsnet/palmpay/send_money/bean/resp/TopEntranceBean;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Lcom/transsnet/palmpay/send_money/bean/resp/RecentlyScheduleTransferBean;Lcom/transsnet/palmpay/core/bean/rsp/CashBoxTrialCashEntryResp;Ljava/util/List;Lcom/transsnet/palmpay/send_money/bean/resp/BenefitsBean;Ljava/util/List;Lcom/transsnet/palmpay/send_money/bean/resp/TopEntranceBean;)V", "getNoRecipientLocalContactPic", "()Ljava/lang/String;", "setNoRecipientLocalContactPic", "(Ljava/lang/String;)V", "getNoRecipientLocalContactDarkPic", "setNoRecipientLocalContactDarkPic", "getBannerEntranceList", "()Ljava/util/List;", "setBannerEntranceList", "(Ljava/util/List;)V", "getRecentlyScheduleTransfer", "()Lcom/transsnet/palmpay/send_money/bean/resp/RecentlyScheduleTransferBean;", "setRecentlyScheduleTransfer", "(Lcom/transsnet/palmpay/send_money/bean/resp/RecentlyScheduleTransferBean;)V", "getFinanceInfo", "()Lcom/transsnet/palmpay/core/bean/rsp/CashBoxTrialCashEntryResp;", "setFinanceInfo", "(Lcom/transsnet/palmpay/core/bean/rsp/CashBoxTrialCashEntryResp;)V", "getBenefitsBannerList", "setBenefitsBannerList", "getTransferSafe", "()Lcom/transsnet/palmpay/send_money/bean/resp/BenefitsBean;", "setTransferSafe", "(Lcom/transsnet/palmpay/send_money/bean/resp/BenefitsBean;)V", "getTopBanners", "setTopBanners", "getTopEntrance", "()Lcom/transsnet/palmpay/send_money/bean/resp/TopEntranceBean;", "setTopEntrance", "(Lcom/transsnet/palmpay/send_money/bean/resp/TopEntranceBean;)V", "module_money_transfer_export_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class TransferToPalmPayHomeConfigResp {

    @Nullable
    private List<BannerEntranceBean> bannerEntranceList;

    @Nullable
    private List<BenefitsBean> benefitsBannerList;

    @Nullable
    private CashBoxTrialCashEntryResp financeInfo;

    @Nullable
    private String noRecipientLocalContactDarkPic;

    @Nullable
    private String noRecipientLocalContactPic;

    @Nullable
    private RecentlyScheduleTransferBean recentlyScheduleTransfer;

    @Nullable
    private List<BannerEntranceBean> topBanners;

    @Nullable
    private TopEntranceBean topEntrance;

    @Nullable
    private BenefitsBean transferSafe;

    public TransferToPalmPayHomeConfigResp() {
        this(null, null, null, null, null, null, null, null, null, 511, null);
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
    public final CashBoxTrialCashEntryResp getFinanceInfo() {
        return this.financeInfo;
    }

    @Nullable
    public final String getNoRecipientLocalContactDarkPic() {
        return this.noRecipientLocalContactDarkPic;
    }

    @Nullable
    public final String getNoRecipientLocalContactPic() {
        return this.noRecipientLocalContactPic;
    }

    @Nullable
    public final RecentlyScheduleTransferBean getRecentlyScheduleTransfer() {
        return this.recentlyScheduleTransfer;
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

    public final void setBannerEntranceList(@Nullable List<BannerEntranceBean> list) {
        this.bannerEntranceList = list;
    }

    public final void setBenefitsBannerList(@Nullable List<BenefitsBean> list) {
        this.benefitsBannerList = list;
    }

    public final void setFinanceInfo(@Nullable CashBoxTrialCashEntryResp cashBoxTrialCashEntryResp) {
        this.financeInfo = cashBoxTrialCashEntryResp;
    }

    public final void setNoRecipientLocalContactDarkPic(@Nullable String str) {
        this.noRecipientLocalContactDarkPic = str;
    }

    public final void setNoRecipientLocalContactPic(@Nullable String str) {
        this.noRecipientLocalContactPic = str;
    }

    public final void setRecentlyScheduleTransfer(@Nullable RecentlyScheduleTransferBean recentlyScheduleTransferBean) {
        this.recentlyScheduleTransfer = recentlyScheduleTransferBean;
    }

    public final void setTopBanners(@Nullable List<BannerEntranceBean> list) {
        this.topBanners = list;
    }

    public final void setTopEntrance(@Nullable TopEntranceBean topEntranceBean) {
        this.topEntrance = topEntranceBean;
    }

    public final void setTransferSafe(@Nullable BenefitsBean benefitsBean) {
        this.transferSafe = benefitsBean;
    }

    public TransferToPalmPayHomeConfigResp(@Nullable String str, @Nullable String str2, @Nullable List<BannerEntranceBean> list, @Nullable RecentlyScheduleTransferBean recentlyScheduleTransferBean, @Nullable CashBoxTrialCashEntryResp cashBoxTrialCashEntryResp, @Nullable List<BenefitsBean> list2, @Nullable BenefitsBean benefitsBean, @Nullable List<BannerEntranceBean> list3, @Nullable TopEntranceBean topEntranceBean) {
        this.noRecipientLocalContactPic = str;
        this.noRecipientLocalContactDarkPic = str2;
        this.bannerEntranceList = list;
        this.recentlyScheduleTransfer = recentlyScheduleTransferBean;
        this.financeInfo = cashBoxTrialCashEntryResp;
        this.benefitsBannerList = list2;
        this.transferSafe = benefitsBean;
        this.topBanners = list3;
        this.topEntrance = topEntranceBean;
    }

    public /* synthetic */ TransferToPalmPayHomeConfigResp(String str, String str2, List list, RecentlyScheduleTransferBean recentlyScheduleTransferBean, CashBoxTrialCashEntryResp cashBoxTrialCashEntryResp, List list2, BenefitsBean benefitsBean, List list3, TopEntranceBean topEntranceBean, int i7, DefaultConstructorMarker defaultConstructorMarker) {
        this((i7 & 1) != 0 ? null : str, (i7 & 2) != 0 ? null : str2, (i7 & 4) != 0 ? null : list, (i7 & 8) != 0 ? null : recentlyScheduleTransferBean, (i7 & 16) != 0 ? null : cashBoxTrialCashEntryResp, (i7 & 32) != 0 ? null : list2, (i7 & 64) != 0 ? null : benefitsBean, (i7 & 128) != 0 ? null : list3, (i7 & IntBufferBatchMountItem.INSTRUCTION_UPDATE_EVENT_EMITTER) != 0 ? null : topEntranceBean);
    }
}
