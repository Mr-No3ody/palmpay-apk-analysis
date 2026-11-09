package com.transsnet.palmpay.core.bean.style_config;

import kotlin.Metadata;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u000f\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003R\u001e\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u0010\n\u0002\u0010\n\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\u001e\u0010\u000b\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u0010\n\u0002\u0010\n\u001a\u0004\b\f\u0010\u0007\"\u0004\b\r\u0010\tR\u001e\u0010\u000e\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u0010\n\u0002\u0010\n\u001a\u0004\b\u000f\u0010\u0007\"\u0004\b\u0010\u0010\tR\u001e\u0010\u0011\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u0010\n\u0002\u0010\n\u001a\u0004\b\u0012\u0010\u0007\"\u0004\b\u0013\u0010\t¨\u0006\u0014"}, d2 = {"Lcom/transsnet/palmpay/core/bean/style_config/CornerRadius;", "", "<init>", "()V", "topLeft", "", "getTopLeft", "()Ljava/lang/Integer;", "setTopLeft", "(Ljava/lang/Integer;)V", "Ljava/lang/Integer;", "topRight", "getTopRight", "setTopRight", "bottomLeft", "getBottomLeft", "setBottomLeft", "bottomRight", "getBottomRight", "setBottomRight", "lib_core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class CornerRadius {

    @Nullable
    private Integer bottomLeft;

    @Nullable
    private Integer bottomRight;

    @Nullable
    private Integer topLeft;

    @Nullable
    private Integer topRight;

    @Nullable
    public final Integer getBottomLeft() {
        return this.bottomLeft;
    }

    @Nullable
    public final Integer getBottomRight() {
        return this.bottomRight;
    }

    @Nullable
    public final Integer getTopLeft() {
        return this.topLeft;
    }

    @Nullable
    public final Integer getTopRight() {
        return this.topRight;
    }

    public final void setBottomLeft(@Nullable Integer num) {
        this.bottomLeft = num;
    }

    public final void setBottomRight(@Nullable Integer num) {
        this.bottomRight = num;
    }

    public final void setTopLeft(@Nullable Integer num) {
        this.topLeft = num;
    }

    public final void setTopRight(@Nullable Integer num) {
        this.topRight = num;
    }
}
