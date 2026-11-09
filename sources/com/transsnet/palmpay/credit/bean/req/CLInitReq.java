package com.transsnet.palmpay.credit.bean.req;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u000f\u0018\u0000 \u00172\u00020\u0001:\u0001\u0017BG\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u000b\u0010\fR\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000eR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u000eR\u0015\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\n\n\u0002\u0010\u0015\u001a\u0004\b\u0013\u0010\u0014R\u0013\u0010\n\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u000e¨\u0006\u0018"}, d2 = {"Lcom/transsnet/palmpay/credit/bean/req/CLInitReq;", "", "channelEnum", "", "product", "applySource", "", "sn", "phoneLockIsInstall", "", "deviceToken", "<init>", "(Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;)V", "getChannelEnum", "()Ljava/lang/String;", "getProduct", "getApplySource", "()I", "getSn", "getPhoneLockIsInstall", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getDeviceToken", "Companion", "module_flexi_export_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class CLInitReq {
    public static final int APPLY_SOURCE_INSTALLMENT = 7;
    public static final int APPLY_SOURCE_PALMPAY = 2;
    private final int applySource;

    @Nullable
    private final String channelEnum;

    @Nullable
    private final String deviceToken;

    @Nullable
    private final Boolean phoneLockIsInstall;

    @Nullable
    private final String product;

    @Nullable
    private final String sn;

    public CLInitReq(@Nullable String str, @Nullable String str2, int i7, @Nullable String str3, @Nullable Boolean bool, @Nullable String str4) {
        this.channelEnum = str;
        this.product = str2;
        this.applySource = i7;
        this.sn = str3;
        this.phoneLockIsInstall = bool;
        this.deviceToken = str4;
    }

    public final int getApplySource() {
        return this.applySource;
    }

    @Nullable
    public final String getChannelEnum() {
        return this.channelEnum;
    }

    @Nullable
    public final String getDeviceToken() {
        return this.deviceToken;
    }

    @Nullable
    public final Boolean getPhoneLockIsInstall() {
        return this.phoneLockIsInstall;
    }

    @Nullable
    public final String getProduct() {
        return this.product;
    }

    @Nullable
    public final String getSn() {
        return this.sn;
    }

    public /* synthetic */ CLInitReq(String str, String str2, int i7, String str3, Boolean bool, String str4, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, i7, (i10 & 8) != 0 ? null : str3, (i10 & 16) != 0 ? Boolean.FALSE : bool, (i10 & 32) != 0 ? null : str4);
    }
}
