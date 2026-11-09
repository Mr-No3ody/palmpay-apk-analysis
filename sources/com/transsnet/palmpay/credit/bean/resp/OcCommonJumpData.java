package com.transsnet.palmpay.credit.bean.resp;

import kotlin.Metadata;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\r\u0018\u00002\u00020\u0001B%\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0006\u0010\u0007R\u001c\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\t\"\u0004\b\r\u0010\u000bR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\t\"\u0004\b\u000f\u0010\u000b¨\u0006\u0010"}, d2 = {"Lcom/transsnet/palmpay/credit/bean/resp/OcCommonJumpData;", "", "jumpPath", "", "jumpType", "jumpParams", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getJumpPath", "()Ljava/lang/String;", "setJumpPath", "(Ljava/lang/String;)V", "getJumpType", "setJumpType", "getJumpParams", "setJumpParams", "module_flexi_export_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class OcCommonJumpData {

    @Nullable
    private String jumpParams;

    @Nullable
    private String jumpPath;

    @Nullable
    private String jumpType;

    public OcCommonJumpData(@Nullable String str, @Nullable String str2, @Nullable String str3) {
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

    public final void setJumpParams(@Nullable String str) {
        this.jumpParams = str;
    }

    public final void setJumpPath(@Nullable String str) {
        this.jumpPath = str;
    }

    public final void setJumpType(@Nullable String str) {
        this.jumpType = str;
    }
}
