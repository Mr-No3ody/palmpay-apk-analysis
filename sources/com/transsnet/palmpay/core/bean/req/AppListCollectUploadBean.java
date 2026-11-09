package com.transsnet.palmpay.core.bean.req;

import com.adjust.sdk.Constants;
import kotlin.Metadata;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003R\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\u001c\u0010\n\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\u0007\"\u0004\b\f\u0010\tR\u001c\u0010\r\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u0007\"\u0004\b\u000f\u0010\tR\u001e\u0010\u0010\u001a\u0004\u0018\u00010\u0011X\u0086\u000e¢\u0006\u0010\n\u0002\u0010\u0016\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015¨\u0006\u0017"}, d2 = {"Lcom/transsnet/palmpay/core/bean/req/AppListCollectUploadBean;", "", "<init>", "()V", Constants.SAMSUNG_PREINSTALL_CONTENT_URI_PATH, "", "getInfo", "()Ljava/lang/String;", "setInfo", "(Ljava/lang/String;)V", "memberId", "getMemberId", "setMemberId", "applyId", "getApplyId", "setApplyId", "lastPageFlag", "", "getLastPageFlag", "()Ljava/lang/Boolean;", "setLastPageFlag", "(Ljava/lang/Boolean;)V", "Ljava/lang/Boolean;", "lib_core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class AppListCollectUploadBean {

    @Nullable
    private String applyId;

    @Nullable
    private String info;

    @Nullable
    private Boolean lastPageFlag = Boolean.FALSE;

    @Nullable
    private String memberId;

    @Nullable
    public final String getApplyId() {
        return this.applyId;
    }

    @Nullable
    public final String getInfo() {
        return this.info;
    }

    @Nullable
    public final Boolean getLastPageFlag() {
        return this.lastPageFlag;
    }

    @Nullable
    public final String getMemberId() {
        return this.memberId;
    }

    public final void setApplyId(@Nullable String str) {
        this.applyId = str;
    }

    public final void setInfo(@Nullable String str) {
        this.info = str;
    }

    public final void setLastPageFlag(@Nullable Boolean bool) {
        this.lastPageFlag = bool;
    }

    public final void setMemberId(@Nullable String str) {
        this.memberId = str;
    }
}
