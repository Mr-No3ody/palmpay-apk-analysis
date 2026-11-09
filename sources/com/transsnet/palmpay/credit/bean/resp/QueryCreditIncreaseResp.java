package com.transsnet.palmpay.credit.bean.resp;

import com.google.firebase.messaging.Constants;
import com.transsnet.palmpay.core.bean.CommonResult;
import kotlin.Metadata;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0001\tB\u0011\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u001c\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\u0005¨\u0006\n"}, d2 = {"Lcom/transsnet/palmpay/credit/bean/resp/QueryCreditIncreaseResp;", "Lcom/transsnet/palmpay/core/bean/CommonResult;", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "Lcom/transsnet/palmpay/credit/bean/resp/QueryCreditIncreaseResp$QueryCreditIncreaseData;", "<init>", "(Lcom/transsnet/palmpay/credit/bean/resp/QueryCreditIncreaseResp$QueryCreditIncreaseData;)V", "getData", "()Lcom/transsnet/palmpay/credit/bean/resp/QueryCreditIncreaseResp$QueryCreditIncreaseData;", "setData", "QueryCreditIncreaseData", "module_flexi_export_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class QueryCreditIncreaseResp extends CommonResult {

    @Nullable
    private QueryCreditIncreaseData data;

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\r\u0018\u00002\u00020\u0001B\u001b\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007R\u001e\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u0010\n\u0002\u0010\f\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR\u001e\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u0010\n\u0002\u0010\u0011\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010¨\u0006\u0012"}, d2 = {"Lcom/transsnet/palmpay/credit/bean/resp/QueryCreditIncreaseResp$QueryCreditIncreaseData;", "", "result", "", "residueApplyNumber", "", "<init>", "(Ljava/lang/Boolean;Ljava/lang/Integer;)V", "getResult", "()Ljava/lang/Boolean;", "setResult", "(Ljava/lang/Boolean;)V", "Ljava/lang/Boolean;", "getResidueApplyNumber", "()Ljava/lang/Integer;", "setResidueApplyNumber", "(Ljava/lang/Integer;)V", "Ljava/lang/Integer;", "module_flexi_export_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class QueryCreditIncreaseData {

        @Nullable
        private Integer residueApplyNumber;

        @Nullable
        private Boolean result;

        public QueryCreditIncreaseData(@Nullable Boolean bool, @Nullable Integer num) {
            this.result = bool;
            this.residueApplyNumber = num;
        }

        @Nullable
        public final Integer getResidueApplyNumber() {
            return this.residueApplyNumber;
        }

        @Nullable
        public final Boolean getResult() {
            return this.result;
        }

        public final void setResidueApplyNumber(@Nullable Integer num) {
            this.residueApplyNumber = num;
        }

        public final void setResult(@Nullable Boolean bool) {
            this.result = bool;
        }
    }

    public QueryCreditIncreaseResp(@Nullable QueryCreditIncreaseData queryCreditIncreaseData) {
        this.data = queryCreditIncreaseData;
    }

    @Nullable
    public final QueryCreditIncreaseData getData() {
        return this.data;
    }

    public final void setData(@Nullable QueryCreditIncreaseData queryCreditIncreaseData) {
        this.data = queryCreditIncreaseData;
    }
}
