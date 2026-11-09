package com.palmpay.lib.liveness.model;

import androidx.annotation.Keep;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
@Keep
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000b\b\u0007\u0018\u00002\u00060\u0001j\u0002`\u0002B/\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\b\u0010\tR\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0005\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000bR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000bR\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000b¨\u0006\u000f"}, d2 = {"Lcom/palmpay/lib/liveness/model/LiveIDException;", "Ljava/lang/Exception;", "Lkotlin/Exception;", "code", "", "msg", "detail", "addition", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getCode", "()Ljava/lang/String;", "getMsg", "getDetail", "getAddition", "lib_liveness_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class LiveIDException extends Exception {

    @Nullable
    private final String addition;

    @NotNull
    private final String code;

    @Nullable
    private final String detail;

    @NotNull
    private final String msg;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LiveIDException(@NotNull String code, @NotNull String msg, @Nullable String str, @Nullable String str2) {
        super(msg);
        Intrinsics.checkNotNullParameter(code, "code");
        Intrinsics.checkNotNullParameter(msg, "msg");
        this.code = code;
        this.msg = msg;
        this.detail = str;
        this.addition = str2;
    }

    @Nullable
    public final String getAddition() {
        return this.addition;
    }

    @NotNull
    public final String getCode() {
        return this.code;
    }

    @Nullable
    public final String getDetail() {
        return this.detail;
    }

    @NotNull
    public final String getMsg() {
        return this.msg;
    }

    public /* synthetic */ LiveIDException(String str, String str2, String str3, String str4, int i7, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, (i7 & 4) != 0 ? null : str3, (i7 & 8) != 0 ? null : str4);
    }
}
