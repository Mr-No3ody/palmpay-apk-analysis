package com.transsnet.palmpay.credit.bean.resp.mobile_Installment;

import com.chad.library.adapter.base.entity.MultiItemEntity;
import com.facebook.react.fabric.mounting.mountitems.IntBufferBatchMountItem;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b6\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0086\b\u0018\u0000 U2\u00020\u0001:\u0001UB£\u0001\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000e\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0011\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0013\u0012\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0015\u0012\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u0017\u0012\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u0019¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010@\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u001dJ\u000b\u0010A\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010B\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u000b\u0010C\u001a\u0004\u0018\u00010\tHÆ\u0003J\u000b\u0010D\u001a\u0004\u0018\u00010\u000bHÆ\u0003J\u000b\u0010E\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010F\u001a\u0004\u0018\u00010\u000eHÆ\u0003J\u000b\u0010G\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010H\u001a\u0004\u0018\u00010\u0011HÆ\u0003J\u000b\u0010I\u001a\u0004\u0018\u00010\u0013HÆ\u0003J\u000b\u0010J\u001a\u0004\u0018\u00010\u0015HÆ\u0003J\u000b\u0010K\u001a\u0004\u0018\u00010\u0017HÆ\u0003J\u000b\u0010L\u001a\u0004\u0018\u00010\u0019HÆ\u0003Jª\u0001\u0010M\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000e2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00112\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00132\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u00152\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u00172\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u0019HÆ\u0001¢\u0006\u0002\u0010NJ\u0013\u0010O\u001a\u00020P2\b\u0010Q\u001a\u0004\u0018\u00010RHÖ\u0003J\t\u0010S\u001a\u00020\u0003HÖ\u0001J\t\u0010T\u001a\u00020\u0005HÖ\u0001R\u001e\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u0010\n\u0002\u0010 \u001a\u0004\b\u001c\u0010\u001d\"\u0004\b\u001e\u0010\u001fR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b!\u0010\"\"\u0004\b#\u0010$R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b%\u0010&R\u0013\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b'\u0010(R\u0013\u0010\n\u001a\u0004\u0018\u00010\u000b¢\u0006\b\n\u0000\u001a\u0004\b)\u0010*R\u0018\u0010\f\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b+\u0010\"R\u001c\u0010\r\u001a\u0004\u0018\u00010\u000eX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b,\u0010-\"\u0004\b.\u0010/R\u0018\u0010\u000f\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b0\u0010\"R\u001c\u0010\u0010\u001a\u0004\u0018\u00010\u0011X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b1\u00102\"\u0004\b3\u00104R\u0013\u0010\u0012\u001a\u0004\u0018\u00010\u0013¢\u0006\b\n\u0000\u001a\u0004\b5\u00106R\u0013\u0010\u0014\u001a\u0004\u0018\u00010\u0015¢\u0006\b\n\u0000\u001a\u0004\b7\u00108R\u0013\u0010\u0016\u001a\u0004\u0018\u00010\u0017¢\u0006\b\n\u0000\u001a\u0004\b9\u0010:R\u0013\u0010\u0018\u001a\u0004\u0018\u00010\u0019¢\u0006\b\n\u0000\u001a\u0004\b;\u0010<R\u0014\u0010=\u001a\u00020\u00038VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b>\u0010?¨\u0006V"}, d2 = {"Lcom/transsnet/palmpay/credit/bean/resp/mobile_Installment/CLPhoneInstallmentMainData;", "Lcom/chad/library/adapter/base/entity/MultiItemEntity;", "itemLayoutType", "", "itemStyle", "", "mobileInstallmentCardData", "Lcom/transsnet/palmpay/credit/bean/resp/mobile_Installment/MobileInstallmentCardData;", "hirePurchaseDownPayCardData", "Lcom/transsnet/palmpay/credit/bean/resp/mobile_Installment/MobileInstallmentFirstPayCardData;", "agentInfoData", "Lcom/transsnet/palmpay/credit/bean/resp/mobile_Installment/AgentInformationCardData;", "aboutRepaymentJson", "aboutRepaymentData", "Lcom/transsnet/palmpay/credit/bean/resp/mobile_Installment/AboutRepaymentCardData;", "defaultInfoJson", "defaultInfoData", "Lcom/transsnet/palmpay/credit/bean/resp/mobile_Installment/DefaultInfoData;", "virtualAccountData", "Lcom/transsnet/palmpay/credit/bean/resp/mobile_Installment/VirtualAccountData;", "unlockingData", "Lcom/transsnet/palmpay/credit/bean/resp/mobile_Installment/HavingTroubleUnlockingCardData;", "repayAcctManageData", "Lcom/transsnet/palmpay/credit/bean/resp/mobile_Installment/RepayAcctManageData;", "productInfoChangeData", "Lcom/transsnet/palmpay/credit/bean/resp/mobile_Installment/ProductInfoChangeData;", "<init>", "(Ljava/lang/Integer;Ljava/lang/String;Lcom/transsnet/palmpay/credit/bean/resp/mobile_Installment/MobileInstallmentCardData;Lcom/transsnet/palmpay/credit/bean/resp/mobile_Installment/MobileInstallmentFirstPayCardData;Lcom/transsnet/palmpay/credit/bean/resp/mobile_Installment/AgentInformationCardData;Ljava/lang/String;Lcom/transsnet/palmpay/credit/bean/resp/mobile_Installment/AboutRepaymentCardData;Ljava/lang/String;Lcom/transsnet/palmpay/credit/bean/resp/mobile_Installment/DefaultInfoData;Lcom/transsnet/palmpay/credit/bean/resp/mobile_Installment/VirtualAccountData;Lcom/transsnet/palmpay/credit/bean/resp/mobile_Installment/HavingTroubleUnlockingCardData;Lcom/transsnet/palmpay/credit/bean/resp/mobile_Installment/RepayAcctManageData;Lcom/transsnet/palmpay/credit/bean/resp/mobile_Installment/ProductInfoChangeData;)V", "getItemLayoutType", "()Ljava/lang/Integer;", "setItemLayoutType", "(Ljava/lang/Integer;)V", "Ljava/lang/Integer;", "getItemStyle", "()Ljava/lang/String;", "setItemStyle", "(Ljava/lang/String;)V", "getMobileInstallmentCardData", "()Lcom/transsnet/palmpay/credit/bean/resp/mobile_Installment/MobileInstallmentCardData;", "getHirePurchaseDownPayCardData", "()Lcom/transsnet/palmpay/credit/bean/resp/mobile_Installment/MobileInstallmentFirstPayCardData;", "getAgentInfoData", "()Lcom/transsnet/palmpay/credit/bean/resp/mobile_Installment/AgentInformationCardData;", "getAboutRepaymentJson", "getAboutRepaymentData", "()Lcom/transsnet/palmpay/credit/bean/resp/mobile_Installment/AboutRepaymentCardData;", "setAboutRepaymentData", "(Lcom/transsnet/palmpay/credit/bean/resp/mobile_Installment/AboutRepaymentCardData;)V", "getDefaultInfoJson", "getDefaultInfoData", "()Lcom/transsnet/palmpay/credit/bean/resp/mobile_Installment/DefaultInfoData;", "setDefaultInfoData", "(Lcom/transsnet/palmpay/credit/bean/resp/mobile_Installment/DefaultInfoData;)V", "getVirtualAccountData", "()Lcom/transsnet/palmpay/credit/bean/resp/mobile_Installment/VirtualAccountData;", "getUnlockingData", "()Lcom/transsnet/palmpay/credit/bean/resp/mobile_Installment/HavingTroubleUnlockingCardData;", "getRepayAcctManageData", "()Lcom/transsnet/palmpay/credit/bean/resp/mobile_Installment/RepayAcctManageData;", "getProductInfoChangeData", "()Lcom/transsnet/palmpay/credit/bean/resp/mobile_Installment/ProductInfoChangeData;", "itemType", "getItemType", "()I", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "component13", "copy", "(Ljava/lang/Integer;Ljava/lang/String;Lcom/transsnet/palmpay/credit/bean/resp/mobile_Installment/MobileInstallmentCardData;Lcom/transsnet/palmpay/credit/bean/resp/mobile_Installment/MobileInstallmentFirstPayCardData;Lcom/transsnet/palmpay/credit/bean/resp/mobile_Installment/AgentInformationCardData;Ljava/lang/String;Lcom/transsnet/palmpay/credit/bean/resp/mobile_Installment/AboutRepaymentCardData;Ljava/lang/String;Lcom/transsnet/palmpay/credit/bean/resp/mobile_Installment/DefaultInfoData;Lcom/transsnet/palmpay/credit/bean/resp/mobile_Installment/VirtualAccountData;Lcom/transsnet/palmpay/credit/bean/resp/mobile_Installment/HavingTroubleUnlockingCardData;Lcom/transsnet/palmpay/credit/bean/resp/mobile_Installment/RepayAcctManageData;Lcom/transsnet/palmpay/credit/bean/resp/mobile_Installment/ProductInfoChangeData;)Lcom/transsnet/palmpay/credit/bean/resp/mobile_Installment/CLPhoneInstallmentMainData;", "equals", "", "other", "", "hashCode", "toString", "Companion", "module_flexi_export_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final /* data */ class CLPhoneInstallmentMainData implements MultiItemEntity {
    public static final int ITEM_TYPE_ABOUT_REPAYMENT = 6;
    public static final int ITEM_TYPE_AGENT_INFO = 1;
    public static final int ITEM_TYPE_DEFAULT = 7;
    public static final int ITEM_TYPE_EMPTY = -1;
    public static final int ITEM_TYPE_MOBILE_INSTALLMENT = 0;
    public static final int ITEM_TYPE_PRODUCT_INFO = 5;
    public static final int ITEM_TYPE_VA_TRANSFER = 8;
    public static final int ITEM_TYPE_WAITING_FIRST_PAYMENT = 3;

    @Nullable
    private transient AboutRepaymentCardData aboutRepaymentData;

    @SerializedName("aboutRepayment")
    @Nullable
    private final String aboutRepaymentJson;

    @Nullable
    private final AgentInformationCardData agentInfoData;

    @Nullable
    private transient DefaultInfoData defaultInfoData;

    @SerializedName("defaultInfo")
    @Nullable
    private final String defaultInfoJson;

    @Nullable
    private final MobileInstallmentFirstPayCardData hirePurchaseDownPayCardData;

    @Nullable
    private Integer itemLayoutType;

    @Nullable
    private String itemStyle;

    @Nullable
    private final MobileInstallmentCardData mobileInstallmentCardData;

    @Nullable
    private final ProductInfoChangeData productInfoChangeData;

    @Nullable
    private final RepayAcctManageData repayAcctManageData;

    @Nullable
    private final HavingTroubleUnlockingCardData unlockingData;

    @Nullable
    private final VirtualAccountData virtualAccountData;

    public CLPhoneInstallmentMainData() {
        this(null, null, null, null, null, null, null, null, null, null, null, null, null, 8191, null);
    }

    public static /* synthetic */ CLPhoneInstallmentMainData copy$default(CLPhoneInstallmentMainData cLPhoneInstallmentMainData, Integer num, String str, MobileInstallmentCardData mobileInstallmentCardData, MobileInstallmentFirstPayCardData mobileInstallmentFirstPayCardData, AgentInformationCardData agentInformationCardData, String str2, AboutRepaymentCardData aboutRepaymentCardData, String str3, DefaultInfoData defaultInfoData, VirtualAccountData virtualAccountData, HavingTroubleUnlockingCardData havingTroubleUnlockingCardData, RepayAcctManageData repayAcctManageData, ProductInfoChangeData productInfoChangeData, int i7, Object obj) {
        if ((i7 & 1) != 0) {
            num = cLPhoneInstallmentMainData.itemLayoutType;
        }
        return cLPhoneInstallmentMainData.copy(num, (i7 & 2) != 0 ? cLPhoneInstallmentMainData.itemStyle : str, (i7 & 4) != 0 ? cLPhoneInstallmentMainData.mobileInstallmentCardData : mobileInstallmentCardData, (i7 & 8) != 0 ? cLPhoneInstallmentMainData.hirePurchaseDownPayCardData : mobileInstallmentFirstPayCardData, (i7 & 16) != 0 ? cLPhoneInstallmentMainData.agentInfoData : agentInformationCardData, (i7 & 32) != 0 ? cLPhoneInstallmentMainData.aboutRepaymentJson : str2, (i7 & 64) != 0 ? cLPhoneInstallmentMainData.aboutRepaymentData : aboutRepaymentCardData, (i7 & 128) != 0 ? cLPhoneInstallmentMainData.defaultInfoJson : str3, (i7 & IntBufferBatchMountItem.INSTRUCTION_UPDATE_EVENT_EMITTER) != 0 ? cLPhoneInstallmentMainData.defaultInfoData : defaultInfoData, (i7 & 512) != 0 ? cLPhoneInstallmentMainData.virtualAccountData : virtualAccountData, (i7 & 1024) != 0 ? cLPhoneInstallmentMainData.unlockingData : havingTroubleUnlockingCardData, (i7 & 2048) != 0 ? cLPhoneInstallmentMainData.repayAcctManageData : repayAcctManageData, (i7 & 4096) != 0 ? cLPhoneInstallmentMainData.productInfoChangeData : productInfoChangeData);
    }

    @Nullable
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final Integer getItemLayoutType() {
        return this.itemLayoutType;
    }

    @Nullable
    /* JADX INFO: renamed from: component10, reason: from getter */
    public final VirtualAccountData getVirtualAccountData() {
        return this.virtualAccountData;
    }

    @Nullable
    /* JADX INFO: renamed from: component11, reason: from getter */
    public final HavingTroubleUnlockingCardData getUnlockingData() {
        return this.unlockingData;
    }

    @Nullable
    /* JADX INFO: renamed from: component12, reason: from getter */
    public final RepayAcctManageData getRepayAcctManageData() {
        return this.repayAcctManageData;
    }

    @Nullable
    /* JADX INFO: renamed from: component13, reason: from getter */
    public final ProductInfoChangeData getProductInfoChangeData() {
        return this.productInfoChangeData;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getItemStyle() {
        return this.itemStyle;
    }

    @Nullable
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final MobileInstallmentCardData getMobileInstallmentCardData() {
        return this.mobileInstallmentCardData;
    }

    @Nullable
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final MobileInstallmentFirstPayCardData getHirePurchaseDownPayCardData() {
        return this.hirePurchaseDownPayCardData;
    }

    @Nullable
    /* JADX INFO: renamed from: component5, reason: from getter */
    public final AgentInformationCardData getAgentInfoData() {
        return this.agentInfoData;
    }

    @Nullable
    /* JADX INFO: renamed from: component6, reason: from getter */
    public final String getAboutRepaymentJson() {
        return this.aboutRepaymentJson;
    }

    @Nullable
    /* JADX INFO: renamed from: component7, reason: from getter */
    public final AboutRepaymentCardData getAboutRepaymentData() {
        return this.aboutRepaymentData;
    }

    @Nullable
    /* JADX INFO: renamed from: component8, reason: from getter */
    public final String getDefaultInfoJson() {
        return this.defaultInfoJson;
    }

    @Nullable
    /* JADX INFO: renamed from: component9, reason: from getter */
    public final DefaultInfoData getDefaultInfoData() {
        return this.defaultInfoData;
    }

    @NotNull
    public final CLPhoneInstallmentMainData copy(@Nullable Integer itemLayoutType, @Nullable String itemStyle, @Nullable MobileInstallmentCardData mobileInstallmentCardData, @Nullable MobileInstallmentFirstPayCardData hirePurchaseDownPayCardData, @Nullable AgentInformationCardData agentInfoData, @Nullable String aboutRepaymentJson, @Nullable AboutRepaymentCardData aboutRepaymentData, @Nullable String defaultInfoJson, @Nullable DefaultInfoData defaultInfoData, @Nullable VirtualAccountData virtualAccountData, @Nullable HavingTroubleUnlockingCardData unlockingData, @Nullable RepayAcctManageData repayAcctManageData, @Nullable ProductInfoChangeData productInfoChangeData) {
        return new CLPhoneInstallmentMainData(itemLayoutType, itemStyle, mobileInstallmentCardData, hirePurchaseDownPayCardData, agentInfoData, aboutRepaymentJson, aboutRepaymentData, defaultInfoJson, defaultInfoData, virtualAccountData, unlockingData, repayAcctManageData, productInfoChangeData);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CLPhoneInstallmentMainData)) {
            return false;
        }
        CLPhoneInstallmentMainData cLPhoneInstallmentMainData = (CLPhoneInstallmentMainData) other;
        return Intrinsics.c(this.itemLayoutType, cLPhoneInstallmentMainData.itemLayoutType) && Intrinsics.c(this.itemStyle, cLPhoneInstallmentMainData.itemStyle) && Intrinsics.c(this.mobileInstallmentCardData, cLPhoneInstallmentMainData.mobileInstallmentCardData) && Intrinsics.c(this.hirePurchaseDownPayCardData, cLPhoneInstallmentMainData.hirePurchaseDownPayCardData) && Intrinsics.c(this.agentInfoData, cLPhoneInstallmentMainData.agentInfoData) && Intrinsics.c(this.aboutRepaymentJson, cLPhoneInstallmentMainData.aboutRepaymentJson) && Intrinsics.c(this.aboutRepaymentData, cLPhoneInstallmentMainData.aboutRepaymentData) && Intrinsics.c(this.defaultInfoJson, cLPhoneInstallmentMainData.defaultInfoJson) && Intrinsics.c(this.defaultInfoData, cLPhoneInstallmentMainData.defaultInfoData) && Intrinsics.c(this.virtualAccountData, cLPhoneInstallmentMainData.virtualAccountData) && Intrinsics.c(this.unlockingData, cLPhoneInstallmentMainData.unlockingData) && Intrinsics.c(this.repayAcctManageData, cLPhoneInstallmentMainData.repayAcctManageData) && Intrinsics.c(this.productInfoChangeData, cLPhoneInstallmentMainData.productInfoChangeData);
    }

    @Nullable
    public final AboutRepaymentCardData getAboutRepaymentData() {
        return this.aboutRepaymentData;
    }

    @Nullable
    public final String getAboutRepaymentJson() {
        return this.aboutRepaymentJson;
    }

    @Nullable
    public final AgentInformationCardData getAgentInfoData() {
        return this.agentInfoData;
    }

    @Nullable
    public final DefaultInfoData getDefaultInfoData() {
        return this.defaultInfoData;
    }

    @Nullable
    public final String getDefaultInfoJson() {
        return this.defaultInfoJson;
    }

    @Nullable
    public final MobileInstallmentFirstPayCardData getHirePurchaseDownPayCardData() {
        return this.hirePurchaseDownPayCardData;
    }

    @Nullable
    public final Integer getItemLayoutType() {
        return this.itemLayoutType;
    }

    @Nullable
    public final String getItemStyle() {
        return this.itemStyle;
    }

    @Override // com.chad.library.adapter.base.entity.MultiItemEntity
    public int getItemType() {
        Integer num;
        Integer num2 = this.itemLayoutType;
        if (((num2 != null && num2.intValue() == 0) || ((num2 != null && num2.intValue() == 1) || ((num2 != null && num2.intValue() == 3) || ((num2 != null && num2.intValue() == 5) || ((num2 != null && num2.intValue() == 6) || ((num2 != null && num2.intValue() == 7) || (num2 != null && num2.intValue() == 8))))))) && (num = this.itemLayoutType) != null) {
            return num.intValue();
        }
        return -1;
    }

    @Nullable
    public final MobileInstallmentCardData getMobileInstallmentCardData() {
        return this.mobileInstallmentCardData;
    }

    @Nullable
    public final ProductInfoChangeData getProductInfoChangeData() {
        return this.productInfoChangeData;
    }

    @Nullable
    public final RepayAcctManageData getRepayAcctManageData() {
        return this.repayAcctManageData;
    }

    @Nullable
    public final HavingTroubleUnlockingCardData getUnlockingData() {
        return this.unlockingData;
    }

    @Nullable
    public final VirtualAccountData getVirtualAccountData() {
        return this.virtualAccountData;
    }

    public int hashCode() {
        Integer num = this.itemLayoutType;
        int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
        String str = this.itemStyle;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        MobileInstallmentCardData mobileInstallmentCardData = this.mobileInstallmentCardData;
        int iHashCode3 = (iHashCode2 + (mobileInstallmentCardData == null ? 0 : mobileInstallmentCardData.hashCode())) * 31;
        MobileInstallmentFirstPayCardData mobileInstallmentFirstPayCardData = this.hirePurchaseDownPayCardData;
        int iHashCode4 = (iHashCode3 + (mobileInstallmentFirstPayCardData == null ? 0 : mobileInstallmentFirstPayCardData.hashCode())) * 31;
        AgentInformationCardData agentInformationCardData = this.agentInfoData;
        int iHashCode5 = (iHashCode4 + (agentInformationCardData == null ? 0 : agentInformationCardData.hashCode())) * 31;
        String str2 = this.aboutRepaymentJson;
        int iHashCode6 = (iHashCode5 + (str2 == null ? 0 : str2.hashCode())) * 31;
        AboutRepaymentCardData aboutRepaymentCardData = this.aboutRepaymentData;
        int iHashCode7 = (iHashCode6 + (aboutRepaymentCardData == null ? 0 : aboutRepaymentCardData.hashCode())) * 31;
        String str3 = this.defaultInfoJson;
        int iHashCode8 = (iHashCode7 + (str3 == null ? 0 : str3.hashCode())) * 31;
        DefaultInfoData defaultInfoData = this.defaultInfoData;
        int iHashCode9 = (iHashCode8 + (defaultInfoData == null ? 0 : defaultInfoData.hashCode())) * 31;
        VirtualAccountData virtualAccountData = this.virtualAccountData;
        int iHashCode10 = (iHashCode9 + (virtualAccountData == null ? 0 : virtualAccountData.hashCode())) * 31;
        HavingTroubleUnlockingCardData havingTroubleUnlockingCardData = this.unlockingData;
        int iHashCode11 = (iHashCode10 + (havingTroubleUnlockingCardData == null ? 0 : havingTroubleUnlockingCardData.hashCode())) * 31;
        RepayAcctManageData repayAcctManageData = this.repayAcctManageData;
        int iHashCode12 = (iHashCode11 + (repayAcctManageData == null ? 0 : repayAcctManageData.hashCode())) * 31;
        ProductInfoChangeData productInfoChangeData = this.productInfoChangeData;
        return iHashCode12 + (productInfoChangeData != null ? productInfoChangeData.hashCode() : 0);
    }

    public final void setAboutRepaymentData(@Nullable AboutRepaymentCardData aboutRepaymentCardData) {
        this.aboutRepaymentData = aboutRepaymentCardData;
    }

    public final void setDefaultInfoData(@Nullable DefaultInfoData defaultInfoData) {
        this.defaultInfoData = defaultInfoData;
    }

    public final void setItemLayoutType(@Nullable Integer num) {
        this.itemLayoutType = num;
    }

    public final void setItemStyle(@Nullable String str) {
        this.itemStyle = str;
    }

    @NotNull
    public String toString() {
        return "CLPhoneInstallmentMainData(itemLayoutType=" + this.itemLayoutType + ", itemStyle=" + this.itemStyle + ", mobileInstallmentCardData=" + this.mobileInstallmentCardData + ", hirePurchaseDownPayCardData=" + this.hirePurchaseDownPayCardData + ", agentInfoData=" + this.agentInfoData + ", aboutRepaymentJson=" + this.aboutRepaymentJson + ", aboutRepaymentData=" + this.aboutRepaymentData + ", defaultInfoJson=" + this.defaultInfoJson + ", defaultInfoData=" + this.defaultInfoData + ", virtualAccountData=" + this.virtualAccountData + ", unlockingData=" + this.unlockingData + ", repayAcctManageData=" + this.repayAcctManageData + ", productInfoChangeData=" + this.productInfoChangeData + ")";
    }

    public CLPhoneInstallmentMainData(@Nullable Integer num, @Nullable String str, @Nullable MobileInstallmentCardData mobileInstallmentCardData, @Nullable MobileInstallmentFirstPayCardData mobileInstallmentFirstPayCardData, @Nullable AgentInformationCardData agentInformationCardData, @Nullable String str2, @Nullable AboutRepaymentCardData aboutRepaymentCardData, @Nullable String str3, @Nullable DefaultInfoData defaultInfoData, @Nullable VirtualAccountData virtualAccountData, @Nullable HavingTroubleUnlockingCardData havingTroubleUnlockingCardData, @Nullable RepayAcctManageData repayAcctManageData, @Nullable ProductInfoChangeData productInfoChangeData) {
        this.itemLayoutType = num;
        this.itemStyle = str;
        this.mobileInstallmentCardData = mobileInstallmentCardData;
        this.hirePurchaseDownPayCardData = mobileInstallmentFirstPayCardData;
        this.agentInfoData = agentInformationCardData;
        this.aboutRepaymentJson = str2;
        this.aboutRepaymentData = aboutRepaymentCardData;
        this.defaultInfoJson = str3;
        this.defaultInfoData = defaultInfoData;
        this.virtualAccountData = virtualAccountData;
        this.unlockingData = havingTroubleUnlockingCardData;
        this.repayAcctManageData = repayAcctManageData;
        this.productInfoChangeData = productInfoChangeData;
    }

    public /* synthetic */ CLPhoneInstallmentMainData(Integer num, String str, MobileInstallmentCardData mobileInstallmentCardData, MobileInstallmentFirstPayCardData mobileInstallmentFirstPayCardData, AgentInformationCardData agentInformationCardData, String str2, AboutRepaymentCardData aboutRepaymentCardData, String str3, DefaultInfoData defaultInfoData, VirtualAccountData virtualAccountData, HavingTroubleUnlockingCardData havingTroubleUnlockingCardData, RepayAcctManageData repayAcctManageData, ProductInfoChangeData productInfoChangeData, int i7, DefaultConstructorMarker defaultConstructorMarker) {
        this((i7 & 1) != 0 ? null : num, (i7 & 2) != 0 ? null : str, (i7 & 4) != 0 ? null : mobileInstallmentCardData, (i7 & 8) != 0 ? null : mobileInstallmentFirstPayCardData, (i7 & 16) != 0 ? null : agentInformationCardData, (i7 & 32) != 0 ? null : str2, (i7 & 64) != 0 ? null : aboutRepaymentCardData, (i7 & 128) != 0 ? null : str3, (i7 & IntBufferBatchMountItem.INSTRUCTION_UPDATE_EVENT_EMITTER) != 0 ? null : defaultInfoData, (i7 & 512) != 0 ? null : virtualAccountData, (i7 & 1024) != 0 ? null : havingTroubleUnlockingCardData, (i7 & 2048) != 0 ? null : repayAcctManageData, (i7 & 4096) != 0 ? null : productInfoChangeData);
    }
}
