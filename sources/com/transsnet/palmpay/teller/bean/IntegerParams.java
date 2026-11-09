package com.transsnet.palmpay.teller.bean;

import androidx.camera.camera2.internal.F;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.transsnet.palmpay.core.base.SingleLiveData$Params;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\t\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\n\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u000b\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u000eHÖ\u0003J\t\u0010\u000f\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\u0005¨\u0006\u0012"}, d2 = {"Lcom/transsnet/palmpay/teller/bean/IntegerParams;", "Lcom/transsnet/palmpay/core/base/SingleLiveData$Params;", FirebaseAnalytics.Param.INDEX, "", "<init>", "(I)V", "getIndex", "()I", "setIndex", "component1", "copy", "equals", "", "other", "", "hashCode", "toString", "", "module_biller_export_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final /* data */ class IntegerParams implements SingleLiveData$Params {
    private int index;

    public IntegerParams(int i7) {
        this.index = i7;
    }

    public static /* synthetic */ IntegerParams copy$default(IntegerParams integerParams, int i7, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            i7 = integerParams.index;
        }
        return integerParams.copy(i7);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final int getIndex() {
        return this.index;
    }

    @NotNull
    public final IntegerParams copy(int index) {
        return new IntegerParams(index);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof IntegerParams) && this.index == ((IntegerParams) other).index;
    }

    public final int getIndex() {
        return this.index;
    }

    public int hashCode() {
        return Integer.hashCode(this.index);
    }

    public final void setIndex(int i7) {
        this.index = i7;
    }

    @NotNull
    public String toString() {
        return F.c(this.index, "IntegerParams(index=", ")");
    }
}
