package com.transsnet.palmpay.credit.bean.req;

import com.google.firebase.remoteconfig.RemoteConfigConstants;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u000b\u0018\u00002\u00020\u0001B\u001b\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007R\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR\u001a\u0010\u0004\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {"Lcom/transsnet/palmpay/credit/bean/req/CLPermissionInfo;", "", "name", "", RemoteConfigConstants.ResponseFieldKey.STATE, "", "<init>", "(Ljava/lang/String;I)V", "getName", "()Ljava/lang/String;", "setName", "(Ljava/lang/String;)V", "getState", "()I", "setState", "(I)V", "module_flexi_export_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class CLPermissionInfo {

    @NotNull
    private String name;
    private int state;

    /* JADX WARN: Multi-variable type inference failed */
    public CLPermissionInfo() {
        this(null, 0, 3, 0 == true ? 1 : 0);
    }

    @NotNull
    public final String getName() {
        return this.name;
    }

    public final int getState() {
        return this.state;
    }

    public final void setName(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.name = str;
    }

    public final void setState(int i7) {
        this.state = i7;
    }

    public CLPermissionInfo(@NotNull String name, int i7) {
        Intrinsics.checkNotNullParameter(name, "name");
        this.name = name;
        this.state = i7;
    }

    public /* synthetic */ CLPermissionInfo(String str, int i7, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? "" : str, (i10 & 2) != 0 ? 0 : i7);
    }
}
