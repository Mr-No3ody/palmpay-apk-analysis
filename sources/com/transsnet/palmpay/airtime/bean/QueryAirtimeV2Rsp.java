package com.transsnet.palmpay.airtime.bean;

import com.google.firebase.messaging.Constants;
import com.transsnet.palmpay.core.bean.CommonResult;
import com.transsnet.palmpay.custom_view.input.OperatorItemExtraInfo;
import com.transsnet.palmpay.custom_view.input.OperatorSelectImpl;
import java.util.List;
import kotlin.Metadata;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001:\u0001\u000bB\u0007¢\u0006\u0004\b\u0002\u0010\u0003R\"\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\n¨\u0006\f"}, d2 = {"Lcom/transsnet/palmpay/airtime/bean/QueryAirtimeV2Rsp;", "Lcom/transsnet/palmpay/core/bean/CommonResult;", "<init>", "()V", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "", "Lcom/transsnet/palmpay/airtime/bean/QueryAirtimeV2Rsp$DataBean;", "getData", "()Ljava/util/List;", "setData", "(Ljava/util/List;)V", "DataBean", "module_biller_export_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class QueryAirtimeV2Rsp extends CommonResult {

    @Nullable
    private List<DataBean> data;

    @Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u000f\n\u0002\u0010\t\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\n\u0010=\u001a\u0004\u0018\u00010\fH\u0016J\n\u0010>\u001a\u0004\u0018\u00010\fH\u0016J\n\u0010?\u001a\u0004\u0018\u00010\fH\u0016J\u000f\u0010@\u001a\u0004\u0018\u00010\u001bH\u0016¢\u0006\u0002\u0010\u001dJ\n\u0010A\u001a\u0004\u0018\u00010BH\u0016R\"\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u001c\u0010\u000b\u001a\u0004\u0018\u00010\fX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u001c\u0010\u0011\u001a\u0004\u0018\u00010\fX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u000e\"\u0004\b\u0013\u0010\u0010R\u001c\u0010\u0014\u001a\u0004\u0018\u00010\fX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u000e\"\u0004\b\u0016\u0010\u0010R\u001c\u0010\u0017\u001a\u0004\u0018\u00010\fX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\u000e\"\u0004\b\u0019\u0010\u0010R\u001e\u0010\u001a\u001a\u0004\u0018\u00010\u001bX\u0086\u000e¢\u0006\u0010\n\u0002\u0010 \u001a\u0004\b\u001c\u0010\u001d\"\u0004\b\u001e\u0010\u001fR\u001e\u0010!\u001a\u0004\u0018\u00010\"X\u0086\u000e¢\u0006\u0010\n\u0002\u0010'\u001a\u0004\b#\u0010$\"\u0004\b%\u0010&R\u001c\u0010(\u001a\u0004\u0018\u00010\fX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b)\u0010\u000e\"\u0004\b*\u0010\u0010R\u001c\u0010+\u001a\u0004\u0018\u00010\fX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b,\u0010\u000e\"\u0004\b-\u0010\u0010R\u001c\u0010.\u001a\u0004\u0018\u00010\fX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b/\u0010\u000e\"\u0004\b0\u0010\u0010R\u001e\u00101\u001a\u0004\u0018\u000102X\u0086\u000e¢\u0006\u0010\n\u0002\u00107\u001a\u0004\b3\u00104\"\u0004\b5\u00106R\u001e\u00108\u001a\u0004\u0018\u000102X\u0086\u000e¢\u0006\u0010\n\u0002\u00107\u001a\u0004\b9\u00104\"\u0004\b:\u00106R\u001e\u0010;\u001a\u0004\u0018\u00010\u001bX\u0086\u000e¢\u0006\u0010\n\u0002\u0010 \u001a\u0004\b;\u0010\u001d\"\u0004\b<\u0010\u001f¨\u0006C"}, d2 = {"Lcom/transsnet/palmpay/airtime/bean/QueryAirtimeV2Rsp$DataBean;", "Lcom/transsnet/palmpay/custom_view/input/OperatorSelectImpl;", "<init>", "()V", "airtimeItems", "", "Lcom/transsnet/palmpay/airtime/bean/AirtimeItemsBean;", "getAirtimeItems", "()Ljava/util/List;", "setAirtimeItems", "(Ljava/util/List;)V", "logo", "", "getLogo", "()Ljava/lang/String;", "setLogo", "(Ljava/lang/String;)V", "name", "getName", "setName", "billerId", "getBillerId", "setBillerId", "network", "getNetwork", "setNetwork", "suspend", "", "getSuspend", "()Ljava/lang/Boolean;", "setSuspend", "(Ljava/lang/Boolean;)V", "Ljava/lang/Boolean;", "indexInList", "", "getIndexInList", "()Ljava/lang/Integer;", "setIndexInList", "(Ljava/lang/Integer;)V", "Ljava/lang/Integer;", "tips", "getTips", "setTips", "amtTips", "getAmtTips", "setAmtTips", "userIdTips", "getUserIdTips", "setUserIdTips", "maxAmount", "", "getMaxAmount", "()Ljava/lang/Long;", "setMaxAmount", "(Ljava/lang/Long;)V", "Ljava/lang/Long;", "minAmount", "getMinAmount", "setMinAmount", "isCover", "setCover", "getIcon", "getItemName", "getItemId", "isSuspend", "addExtraInfo", "Lcom/transsnet/palmpay/custom_view/input/OperatorItemExtraInfo;", "module_biller_export_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class DataBean implements OperatorSelectImpl {

        @Nullable
        private List<AirtimeItemsBean> airtimeItems;

        @Nullable
        private String amtTips;

        @Nullable
        private String billerId;

        @Nullable
        private Integer indexInList;

        @Nullable
        private Boolean isCover;

        @Nullable
        private String logo;

        @Nullable
        private Long maxAmount;

        @Nullable
        private Long minAmount;

        @Nullable
        private String name;

        @Nullable
        private String network;

        @Nullable
        private Boolean suspend;

        @Nullable
        private String tips;

        @Nullable
        private String userIdTips;

        public DataBean() {
            Boolean bool = Boolean.FALSE;
            this.suspend = bool;
            this.indexInList = 0;
            this.isCover = bool;
        }

        @Override // com.transsnet.palmpay.custom_view.input.OperatorSelectImpl
        @Nullable
        public OperatorItemExtraInfo addExtraInfo() {
            return null;
        }

        @Nullable
        public final List<AirtimeItemsBean> getAirtimeItems() {
            return this.airtimeItems;
        }

        @Nullable
        public final String getAmtTips() {
            return this.amtTips;
        }

        @Nullable
        public final String getBillerId() {
            return this.billerId;
        }

        @Override // com.transsnet.palmpay.custom_view.input.OperatorSelectImpl
        @Nullable
        /* JADX INFO: renamed from: getIcon, reason: from getter */
        public String getLogo() {
            return this.logo;
        }

        @Nullable
        public final Integer getIndexInList() {
            return this.indexInList;
        }

        @Override // com.transsnet.palmpay.custom_view.input.OperatorSelectImpl
        @Nullable
        /* JADX INFO: renamed from: getItemId, reason: from getter */
        public String getNetwork() {
            return this.network;
        }

        @Override // com.transsnet.palmpay.custom_view.input.OperatorSelectImpl
        @Nullable
        /* JADX INFO: renamed from: getItemName, reason: from getter */
        public String getName() {
            return this.name;
        }

        @Nullable
        public final String getLogo() {
            return this.logo;
        }

        @Nullable
        public final Long getMaxAmount() {
            return this.maxAmount;
        }

        @Nullable
        public final Long getMinAmount() {
            return this.minAmount;
        }

        @Nullable
        public final String getName() {
            return this.name;
        }

        @Nullable
        public final String getNetwork() {
            return this.network;
        }

        @Nullable
        public final Boolean getSuspend() {
            return this.suspend;
        }

        @Nullable
        public final String getTips() {
            return this.tips;
        }

        @Nullable
        public final String getUserIdTips() {
            return this.userIdTips;
        }

        @Nullable
        /* JADX INFO: renamed from: isCover, reason: from getter */
        public final Boolean getIsCover() {
            return this.isCover;
        }

        @Override // com.transsnet.palmpay.custom_view.input.OperatorSelectImpl
        @Nullable
        public Boolean isSuspend() {
            return this.suspend;
        }

        public final void setAirtimeItems(@Nullable List<AirtimeItemsBean> list) {
            this.airtimeItems = list;
        }

        public final void setAmtTips(@Nullable String str) {
            this.amtTips = str;
        }

        public final void setBillerId(@Nullable String str) {
            this.billerId = str;
        }

        public final void setCover(@Nullable Boolean bool) {
            this.isCover = bool;
        }

        public final void setIndexInList(@Nullable Integer num) {
            this.indexInList = num;
        }

        public final void setLogo(@Nullable String str) {
            this.logo = str;
        }

        public final void setMaxAmount(@Nullable Long l5) {
            this.maxAmount = l5;
        }

        public final void setMinAmount(@Nullable Long l5) {
            this.minAmount = l5;
        }

        public final void setName(@Nullable String str) {
            this.name = str;
        }

        public final void setNetwork(@Nullable String str) {
            this.network = str;
        }

        public final void setSuspend(@Nullable Boolean bool) {
            this.suspend = bool;
        }

        public final void setTips(@Nullable String str) {
            this.tips = str;
        }

        public final void setUserIdTips(@Nullable String str) {
            this.userIdTips = str;
        }
    }

    @Nullable
    public final List<DataBean> getData() {
        return this.data;
    }

    public final void setData(@Nullable List<DataBean> list) {
        this.data = list;
    }
}
