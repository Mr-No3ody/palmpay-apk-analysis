package com.transsnet.palmpay.credit.bean.req;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0013\u0018\u00002\u00020\u0001BC\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\b\u0010\tR\u001c\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000b\"\u0004\b\u000f\u0010\rR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u000b\"\u0004\b\u0011\u0010\rR\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u000b\"\u0004\b\u0013\u0010\rR\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u000b\"\u0004\b\u0015\u0010\r¨\u0006\u0016"}, d2 = {"Lcom/transsnet/palmpay/credit/bean/req/UploadMonoTokenReq;", "", "applicationSource", "", "code", "memberId", "applyId", "scene", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getApplicationSource", "()Ljava/lang/String;", "setApplicationSource", "(Ljava/lang/String;)V", "getCode", "setCode", "getMemberId", "setMemberId", "getApplyId", "setApplyId", "getScene", "setScene", "module_flexi_export_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class UploadMonoTokenReq {

    @Nullable
    private String applicationSource;

    @Nullable
    private String applyId;

    @Nullable
    private String code;

    @Nullable
    private String memberId;

    @Nullable
    private String scene;

    public UploadMonoTokenReq() {
        this(null, null, null, null, null, 31, null);
    }

    @Nullable
    public final String getApplicationSource() {
        return this.applicationSource;
    }

    @Nullable
    public final String getApplyId() {
        return this.applyId;
    }

    @Nullable
    public final String getCode() {
        return this.code;
    }

    @Nullable
    public final String getMemberId() {
        return this.memberId;
    }

    @Nullable
    public final String getScene() {
        return this.scene;
    }

    public final void setApplicationSource(@Nullable String str) {
        this.applicationSource = str;
    }

    public final void setApplyId(@Nullable String str) {
        this.applyId = str;
    }

    public final void setCode(@Nullable String str) {
        this.code = str;
    }

    public final void setMemberId(@Nullable String str) {
        this.memberId = str;
    }

    public final void setScene(@Nullable String str) {
        this.scene = str;
    }

    public UploadMonoTokenReq(@Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable String str4, @Nullable String str5) {
        this.applicationSource = str;
        this.code = str2;
        this.memberId = str3;
        this.applyId = str4;
        this.scene = str5;
    }

    public /* synthetic */ UploadMonoTokenReq(String str, String str2, String str3, String str4, String str5, int i7, DefaultConstructorMarker defaultConstructorMarker) {
        this((i7 & 1) != 0 ? null : str, (i7 & 2) != 0 ? null : str2, (i7 & 4) != 0 ? null : str3, (i7 & 8) != 0 ? null : str4, (i7 & 16) != 0 ? null : str5);
    }
}
