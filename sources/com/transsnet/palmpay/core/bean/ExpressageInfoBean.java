package com.transsnet.palmpay.core.bean;

import com.microsoft.codepush.react.CodePushConstants;
import kotlin.Metadata;
import kotlin.jvm.JvmField;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0003¢\u0006\u0004\b\b\u0010\tR\u0010\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0005\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0006\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0007\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\n"}, d2 = {"Lcom/transsnet/palmpay/core/bean/ExpressageInfoBean;", "", "city", "", "message", "messageEng", "status", CodePushConstants.LATEST_ROLLBACK_TIME_KEY, "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "lib_core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class ExpressageInfoBean {

    @JvmField
    @NotNull
    public final String city;

    @JvmField
    @NotNull
    public final String message;

    @JvmField
    @NotNull
    public final String messageEng;

    @JvmField
    @NotNull
    public final String status;

    @JvmField
    @NotNull
    public final String time;

    public ExpressageInfoBean(@NotNull String city, @NotNull String message, @NotNull String messageEng, @NotNull String status, @NotNull String time) {
        Intrinsics.checkNotNullParameter(city, "city");
        Intrinsics.checkNotNullParameter(message, "message");
        Intrinsics.checkNotNullParameter(messageEng, "messageEng");
        Intrinsics.checkNotNullParameter(status, "status");
        Intrinsics.checkNotNullParameter(time, "time");
        this.city = city;
        this.message = message;
        this.messageEng = messageEng;
        this.status = status;
        this.time = time;
    }
}
