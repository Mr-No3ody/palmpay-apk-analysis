package com.transsnet.palmpay.credit.bean.resp;

import com.google.firebase.messaging.Constants;
import com.transsnet.palmpay.core.bean.CommonResult;
import kotlin.Metadata;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001:\u0001\bB\u0011\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\t"}, d2 = {"Lcom/transsnet/palmpay/credit/bean/resp/UnfreezePopupDataResp;", "Lcom/transsnet/palmpay/core/bean/CommonResult;", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "Lcom/transsnet/palmpay/credit/bean/resp/UnfreezePopupDataResp$Data;", "<init>", "(Lcom/transsnet/palmpay/credit/bean/resp/UnfreezePopupDataResp$Data;)V", "getData", "()Lcom/transsnet/palmpay/credit/bean/resp/UnfreezePopupDataResp$Data;", "Data", "module_flexi_export_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class UnfreezePopupDataResp extends CommonResult {

    @Nullable
    private final Data data;

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\u0018\u00002\u00020\u0001B%\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0006\u0010\u0007R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\tR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\t¨\u0006\f"}, d2 = {"Lcom/transsnet/palmpay/credit/bean/resp/UnfreezePopupDataResp$Data;", "", "jumpPath", "", "jumpType", "jumpParams", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getJumpPath", "()Ljava/lang/String;", "getJumpType", "getJumpParams", "module_flexi_export_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Data {

        @Nullable
        private final String jumpParams;

        @Nullable
        private final String jumpPath;

        @Nullable
        private final String jumpType;

        public Data(@Nullable String str, @Nullable String str2, @Nullable String str3) {
            this.jumpPath = str;
            this.jumpType = str2;
            this.jumpParams = str3;
        }

        @Nullable
        public final String getJumpParams() {
            return this.jumpParams;
        }

        @Nullable
        public final String getJumpPath() {
            return this.jumpPath;
        }

        @Nullable
        public final String getJumpType() {
            return this.jumpType;
        }
    }

    public UnfreezePopupDataResp(@Nullable Data data) {
        this.data = data;
    }

    @Nullable
    public final Data getData() {
        return this.data;
    }
}
