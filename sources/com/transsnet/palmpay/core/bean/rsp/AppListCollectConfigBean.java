package com.transsnet.palmpay.core.bean.rsp;

import java.util.List;
import kotlin.Metadata;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u000e\n\u0002\u0010\b\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003R\"\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u001e\u0010\u000b\u001a\u0004\u0018\u00010\fX\u0086\u000e¢\u0006\u0010\n\u0002\u0010\u0011\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u001e\u0010\u0012\u001a\u0004\u0018\u00010\fX\u0086\u000e¢\u0006\u0010\n\u0002\u0010\u0011\u001a\u0004\b\u0013\u0010\u000e\"\u0004\b\u0014\u0010\u0010R\u001c\u0010\u0015\u001a\u0004\u0018\u00010\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019R\u001e\u0010\u001a\u001a\u0004\u0018\u00010\u001bX\u0086\u000e¢\u0006\u0010\n\u0002\u0010 \u001a\u0004\b\u001c\u0010\u001d\"\u0004\b\u001e\u0010\u001f¨\u0006!"}, d2 = {"Lcom/transsnet/palmpay/core/bean/rsp/AppListCollectConfigBean;", "", "<init>", "()V", "appWhiteList", "", "", "getAppWhiteList", "()Ljava/util/List;", "setAppWhiteList", "(Ljava/util/List;)V", "uploadAble", "", "getUploadAble", "()Ljava/lang/Boolean;", "setUploadAble", "(Ljava/lang/Boolean;)V", "Ljava/lang/Boolean;", "includeSystemApp", "getIncludeSystemApp", "setIncludeSystemApp", "applyId", "getApplyId", "()Ljava/lang/String;", "setApplyId", "(Ljava/lang/String;)V", "maxCount", "", "getMaxCount", "()Ljava/lang/Integer;", "setMaxCount", "(Ljava/lang/Integer;)V", "Ljava/lang/Integer;", "lib_core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class AppListCollectConfigBean {

    @Nullable
    private List<String> appWhiteList;

    @Nullable
    private String applyId;

    @Nullable
    private Boolean includeSystemApp;

    @Nullable
    private Integer maxCount;

    @Nullable
    private Boolean uploadAble;

    public AppListCollectConfigBean() {
        Boolean bool = Boolean.FALSE;
        this.uploadAble = bool;
        this.includeSystemApp = bool;
        this.maxCount = 400;
    }

    @Nullable
    public final List<String> getAppWhiteList() {
        return this.appWhiteList;
    }

    @Nullable
    public final String getApplyId() {
        return this.applyId;
    }

    @Nullable
    public final Boolean getIncludeSystemApp() {
        return this.includeSystemApp;
    }

    @Nullable
    public final Integer getMaxCount() {
        return this.maxCount;
    }

    @Nullable
    public final Boolean getUploadAble() {
        return this.uploadAble;
    }

    public final void setAppWhiteList(@Nullable List<String> list) {
        this.appWhiteList = list;
    }

    public final void setApplyId(@Nullable String str) {
        this.applyId = str;
    }

    public final void setIncludeSystemApp(@Nullable Boolean bool) {
        this.includeSystemApp = bool;
    }

    public final void setMaxCount(@Nullable Integer num) {
        this.maxCount = num;
    }

    public final void setUploadAble(@Nullable Boolean bool) {
        this.uploadAble = bool;
    }
}
