package com.transsnet.palmpay.send_money.bean.resp;

import com.google.firebase.messaging.Constants;
import com.transsnet.palmpay.core.bean.CommonResult;
import kotlin.Metadata;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001:\u0001\nB\u0007¢\u0006\u0004\b\u0002\u0010\u0003R\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\t¨\u0006\u000b"}, d2 = {"Lcom/transsnet/palmpay/send_money/bean/resp/TransferMatchMemberRsp;", "Lcom/transsnet/palmpay/core/bean/CommonResult;", "<init>", "()V", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "Lcom/transsnet/palmpay/send_money/bean/resp/TransferMatchMemberRsp$DataBean;", "getData", "()Lcom/transsnet/palmpay/send_money/bean/resp/TransferMatchMemberRsp$DataBean;", "setData", "(Lcom/transsnet/palmpay/send_money/bean/resp/TransferMatchMemberRsp$DataBean;)V", "DataBean", "module_money_transfer_export_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class TransferMatchMemberRsp extends CommonResult {

    @Nullable
    private DataBean data;

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b&\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003R\u001a\u0010\u0004\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\u001c\u0010\n\u001a\u0004\u0018\u00010\u000bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u001c\u0010\u0010\u001a\u0004\u0018\u00010\u000bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\r\"\u0004\b\u0012\u0010\u000fR\u001c\u0010\u0013\u001a\u0004\u0018\u00010\u000bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\r\"\u0004\b\u0015\u0010\u000fR\u001c\u0010\u0016\u001a\u0004\u0018\u00010\u000bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\r\"\u0004\b\u0018\u0010\u000fR\u001c\u0010\u0019\u001a\u0004\u0018\u00010\u000bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001a\u0010\r\"\u0004\b\u001b\u0010\u000fR\u001a\u0010\u001c\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001d\u0010\u0007\"\u0004\b\u001e\u0010\tR\u001c\u0010\u001f\u001a\u0004\u0018\u00010\u000bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b \u0010\r\"\u0004\b!\u0010\u000fR\u001c\u0010\"\u001a\u0004\u0018\u00010\u000bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b#\u0010\r\"\u0004\b$\u0010\u000fR\u001c\u0010%\u001a\u0004\u0018\u00010\u000bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b&\u0010\r\"\u0004\b'\u0010\u000fR\u001c\u0010(\u001a\u0004\u0018\u00010\u000bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b)\u0010\r\"\u0004\b*\u0010\u000fR\u001e\u0010+\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u0010\n\u0002\u00100\u001a\u0004\b,\u0010-\"\u0004\b.\u0010/¨\u00061"}, d2 = {"Lcom/transsnet/palmpay/send_money/bean/resp/TransferMatchMemberRsp$DataBean;", "", "<init>", "()V", "businessType", "", "getBusinessType", "()I", "setBusinessType", "(I)V", "transType", "", "getTransType", "()Ljava/lang/String;", "setTransType", "(Ljava/lang/String;)V", "accountName", "getAccountName", "setAccountName", "accountMark", "getAccountMark", "setAccountMark", "accountNo", "getAccountNo", "setAccountNo", "ppAccountNo", "getPpAccountNo", "setPpAccountNo", "status", "getStatus", "setStatus", "statusDesc", "getStatusDesc", "setStatusDesc", "payeeMemberId", "getPayeeMemberId", "setPayeeMemberId", "bankToPhoneTransPrefixTips", "getBankToPhoneTransPrefixTips", "setBankToPhoneTransPrefixTips", "bankToPhoneTransSuffixTips", "getBankToPhoneTransSuffixTips", "setBankToPhoneTransSuffixTips", "recipientTradeStatus", "getRecipientTradeStatus", "()Ljava/lang/Integer;", "setRecipientTradeStatus", "(Ljava/lang/Integer;)V", "Ljava/lang/Integer;", "module_money_transfer_export_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class DataBean {

        @Nullable
        private String accountMark;

        @Nullable
        private String accountName;

        @Nullable
        private String accountNo;

        @Nullable
        private String bankToPhoneTransPrefixTips;

        @Nullable
        private String bankToPhoneTransSuffixTips;
        private int businessType = 2;

        @Nullable
        private String payeeMemberId;

        @Nullable
        private String ppAccountNo;

        @Nullable
        private Integer recipientTradeStatus;
        private int status;

        @Nullable
        private String statusDesc;

        @Nullable
        private String transType;

        @Nullable
        public final String getAccountMark() {
            return this.accountMark;
        }

        @Nullable
        public final String getAccountName() {
            return this.accountName;
        }

        @Nullable
        public final String getAccountNo() {
            return this.accountNo;
        }

        @Nullable
        public final String getBankToPhoneTransPrefixTips() {
            return this.bankToPhoneTransPrefixTips;
        }

        @Nullable
        public final String getBankToPhoneTransSuffixTips() {
            return this.bankToPhoneTransSuffixTips;
        }

        public final int getBusinessType() {
            return this.businessType;
        }

        @Nullable
        public final String getPayeeMemberId() {
            return this.payeeMemberId;
        }

        @Nullable
        public final String getPpAccountNo() {
            return this.ppAccountNo;
        }

        @Nullable
        public final Integer getRecipientTradeStatus() {
            return this.recipientTradeStatus;
        }

        public final int getStatus() {
            return this.status;
        }

        @Nullable
        public final String getStatusDesc() {
            return this.statusDesc;
        }

        @Nullable
        public final String getTransType() {
            return this.transType;
        }

        public final void setAccountMark(@Nullable String str) {
            this.accountMark = str;
        }

        public final void setAccountName(@Nullable String str) {
            this.accountName = str;
        }

        public final void setAccountNo(@Nullable String str) {
            this.accountNo = str;
        }

        public final void setBankToPhoneTransPrefixTips(@Nullable String str) {
            this.bankToPhoneTransPrefixTips = str;
        }

        public final void setBankToPhoneTransSuffixTips(@Nullable String str) {
            this.bankToPhoneTransSuffixTips = str;
        }

        public final void setBusinessType(int i7) {
            this.businessType = i7;
        }

        public final void setPayeeMemberId(@Nullable String str) {
            this.payeeMemberId = str;
        }

        public final void setPpAccountNo(@Nullable String str) {
            this.ppAccountNo = str;
        }

        public final void setRecipientTradeStatus(@Nullable Integer num) {
            this.recipientTradeStatus = num;
        }

        public final void setStatus(int i7) {
            this.status = i7;
        }

        public final void setStatusDesc(@Nullable String str) {
            this.statusDesc = str;
        }

        public final void setTransType(@Nullable String str) {
            this.transType = str;
        }
    }

    @Nullable
    public final DataBean getData() {
        return this.data;
    }

    public final void setData(@Nullable DataBean dataBean) {
        this.data = dataBean;
    }
}
