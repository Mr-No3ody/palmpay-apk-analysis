package com.transsnet.palmpay.core.bean.rsp;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003¢\u0006\u0004\b\u0007\u0010\bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\nR\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\n¨\u0006\u000e"}, d2 = {"Lcom/transsnet/palmpay/core/bean/rsp/UssdListRsp;", "", "opGuide", "", "channelUrl", "channelName", "funDescri", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getOpGuide", "()Ljava/lang/String;", "getChannelUrl", "getChannelName", "getFunDescri", "lib_core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class UssdListRsp {

    @NotNull
    private final String channelName;

    @NotNull
    private final String channelUrl;

    @NotNull
    private final String funDescri;

    @NotNull
    private final String opGuide;

    public UssdListRsp(@NotNull String opGuide, @NotNull String channelUrl, @NotNull String channelName, @NotNull String funDescri) {
        Intrinsics.checkNotNullParameter(opGuide, "opGuide");
        Intrinsics.checkNotNullParameter(channelUrl, "channelUrl");
        Intrinsics.checkNotNullParameter(channelName, "channelName");
        Intrinsics.checkNotNullParameter(funDescri, "funDescri");
        this.opGuide = opGuide;
        this.channelUrl = channelUrl;
        this.channelName = channelName;
        this.funDescri = funDescri;
    }

    @NotNull
    public final String getChannelName() {
        return this.channelName;
    }

    @NotNull
    public final String getChannelUrl() {
        return this.channelUrl;
    }

    @NotNull
    public final String getFunDescri() {
        return this.funDescri;
    }

    @NotNull
    public final String getOpGuide() {
        return this.opGuide;
    }
}
