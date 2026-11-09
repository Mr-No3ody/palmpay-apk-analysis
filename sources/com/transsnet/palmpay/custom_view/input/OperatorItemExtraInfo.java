package com.transsnet.palmpay.custom_view.input;

import C0.G;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u001f\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000b\u0010\n\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u000b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J!\u0010\f\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001J\t\u0010\u0012\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b¨\u0006\u0013"}, d2 = {"Lcom/transsnet/palmpay/custom_view/input/OperatorItemExtraInfo;", "", "tipUrl", "", "darkTipUrl", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "getTipUrl", "()Ljava/lang/String;", "getDarkTipUrl", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "lib_views_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final /* data */ class OperatorItemExtraInfo {

    @Nullable
    private final String darkTipUrl;

    @Nullable
    private final String tipUrl;

    /* JADX WARN: Multi-variable type inference failed */
    public OperatorItemExtraInfo() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    public static /* synthetic */ OperatorItemExtraInfo copy$default(OperatorItemExtraInfo operatorItemExtraInfo, String str, String str2, int i7, Object obj) {
        if ((i7 & 1) != 0) {
            str = operatorItemExtraInfo.tipUrl;
        }
        if ((i7 & 2) != 0) {
            str2 = operatorItemExtraInfo.darkTipUrl;
        }
        return operatorItemExtraInfo.copy(str, str2);
    }

    @Nullable
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getTipUrl() {
        return this.tipUrl;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getDarkTipUrl() {
        return this.darkTipUrl;
    }

    @NotNull
    public final OperatorItemExtraInfo copy(@Nullable String tipUrl, @Nullable String darkTipUrl) {
        return new OperatorItemExtraInfo(tipUrl, darkTipUrl);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof OperatorItemExtraInfo)) {
            return false;
        }
        OperatorItemExtraInfo operatorItemExtraInfo = (OperatorItemExtraInfo) other;
        return Intrinsics.c(this.tipUrl, operatorItemExtraInfo.tipUrl) && Intrinsics.c(this.darkTipUrl, operatorItemExtraInfo.darkTipUrl);
    }

    @Nullable
    public final String getDarkTipUrl() {
        return this.darkTipUrl;
    }

    @Nullable
    public final String getTipUrl() {
        return this.tipUrl;
    }

    public int hashCode() {
        String str = this.tipUrl;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.darkTipUrl;
        return iHashCode + (str2 != null ? str2.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return G.q("OperatorItemExtraInfo(tipUrl=", this.tipUrl, ", darkTipUrl=", this.darkTipUrl, ")");
    }

    public OperatorItemExtraInfo(@Nullable String str, @Nullable String str2) {
        this.tipUrl = str;
        this.darkTipUrl = str2;
    }

    public /* synthetic */ OperatorItemExtraInfo(String str, String str2, int i7, DefaultConstructorMarker defaultConstructorMarker) {
        this((i7 & 1) != 0 ? null : str, (i7 & 2) != 0 ? null : str2);
    }
}
