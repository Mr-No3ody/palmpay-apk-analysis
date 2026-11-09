package com.transsnet.palmpay.managemoney.bean.resp;

import com.google.firebase.messaging.Constants;
import com.transsnet.palmpay.core.bean.CommonResult;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001:\u0001\bB\u0011\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\t"}, d2 = {"Lcom/transsnet/palmpay/managemoney/bean/resp/GetRemindTurnOnAutoSaveResp;", "Lcom/transsnet/palmpay/core/bean/CommonResult;", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "Lcom/transsnet/palmpay/managemoney/bean/resp/GetRemindTurnOnAutoSaveResp$Data;", "<init>", "(Lcom/transsnet/palmpay/managemoney/bean/resp/GetRemindTurnOnAutoSaveResp$Data;)V", "getData", "()Lcom/transsnet/palmpay/managemoney/bean/resp/GetRemindTurnOnAutoSaveResp$Data;", "Data", "module_wealth_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class GetRemindTurnOnAutoSaveResp extends CommonResult {

    @Nullable
    private final Data data;

    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\n\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\b\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u0006J\u001a\u0010\t\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003HÆ\u0001¢\u0006\u0002\u0010\nJ\u0013\u0010\u000b\u001a\u00020\u00032\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\r\u001a\u00020\u000eHÖ\u0001J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001R\u0015\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\u0007\u001a\u0004\b\u0002\u0010\u0006¨\u0006\u0011"}, d2 = {"Lcom/transsnet/palmpay/managemoney/bean/resp/GetRemindTurnOnAutoSaveResp$Data;", "", "isRemind", "", "<init>", "(Ljava/lang/Boolean;)V", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "component1", "copy", "(Ljava/lang/Boolean;)Lcom/transsnet/palmpay/managemoney/bean/resp/GetRemindTurnOnAutoSaveResp$Data;", "equals", "other", "hashCode", "", "toString", "", "module_wealth_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class Data {

        @Nullable
        private final Boolean isRemind;

        public Data(@Nullable Boolean bool) {
            this.isRemind = bool;
        }

        public static /* synthetic */ Data copy$default(Data data, Boolean bool, int i7, Object obj) {
            if ((i7 & 1) != 0) {
                bool = data.isRemind;
            }
            return data.copy(bool);
        }

        @Nullable
        /* JADX INFO: renamed from: component1, reason: from getter */
        public final Boolean getIsRemind() {
            return this.isRemind;
        }

        @NotNull
        public final Data copy(@Nullable Boolean isRemind) {
            return new Data(isRemind);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Data) && Intrinsics.c(this.isRemind, ((Data) other).isRemind);
        }

        public int hashCode() {
            Boolean bool = this.isRemind;
            if (bool == null) {
                return 0;
            }
            return bool.hashCode();
        }

        @Nullable
        public final Boolean isRemind() {
            return this.isRemind;
        }

        @NotNull
        public String toString() {
            return "Data(isRemind=" + this.isRemind + ")";
        }
    }

    public GetRemindTurnOnAutoSaveResp(@Nullable Data data) {
        this.data = data;
    }

    @Nullable
    public final Data getData() {
        return this.data;
    }
}
