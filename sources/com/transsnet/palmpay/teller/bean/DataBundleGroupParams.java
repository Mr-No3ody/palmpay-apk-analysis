package com.transsnet.palmpay.teller.bean;

import com.transsnet.palmpay.core.base.SingleLiveData$Params;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0011\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u001b\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J\u0010\u0010\u0012\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\rJ$\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005HÆ\u0001¢\u0006\u0002\u0010\u0014J\u0013\u0010\u0015\u001a\u00020\u00052\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017HÖ\u0003J\t\u0010\u0018\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0019\u001a\u00020\u001aHÖ\u0001R\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR\u001e\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u0010\n\u0002\u0010\u0010\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000f¨\u0006\u001b"}, d2 = {"Lcom/transsnet/palmpay/teller/bean/DataBundleGroupParams;", "Lcom/transsnet/palmpay/core/base/SingleLiveData$Params;", "selectIndex", "", "forceRefresh", "", "<init>", "(ILjava/lang/Boolean;)V", "getSelectIndex", "()I", "setSelectIndex", "(I)V", "getForceRefresh", "()Ljava/lang/Boolean;", "setForceRefresh", "(Ljava/lang/Boolean;)V", "Ljava/lang/Boolean;", "component1", "component2", "copy", "(ILjava/lang/Boolean;)Lcom/transsnet/palmpay/teller/bean/DataBundleGroupParams;", "equals", "other", "", "hashCode", "toString", "", "module_biller_export_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final /* data */ class DataBundleGroupParams implements SingleLiveData$Params {

    @Nullable
    private Boolean forceRefresh;
    private int selectIndex;

    public DataBundleGroupParams(int i7, @Nullable Boolean bool) {
        this.selectIndex = i7;
        this.forceRefresh = bool;
    }

    public static /* synthetic */ DataBundleGroupParams copy$default(DataBundleGroupParams dataBundleGroupParams, int i7, Boolean bool, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            i7 = dataBundleGroupParams.selectIndex;
        }
        if ((i10 & 2) != 0) {
            bool = dataBundleGroupParams.forceRefresh;
        }
        return dataBundleGroupParams.copy(i7, bool);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final int getSelectIndex() {
        return this.selectIndex;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final Boolean getForceRefresh() {
        return this.forceRefresh;
    }

    @NotNull
    public final DataBundleGroupParams copy(int selectIndex, @Nullable Boolean forceRefresh) {
        return new DataBundleGroupParams(selectIndex, forceRefresh);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof DataBundleGroupParams)) {
            return false;
        }
        DataBundleGroupParams dataBundleGroupParams = (DataBundleGroupParams) other;
        return this.selectIndex == dataBundleGroupParams.selectIndex && Intrinsics.c(this.forceRefresh, dataBundleGroupParams.forceRefresh);
    }

    @Nullable
    public final Boolean getForceRefresh() {
        return this.forceRefresh;
    }

    public final int getSelectIndex() {
        return this.selectIndex;
    }

    public int hashCode() {
        int iHashCode = Integer.hashCode(this.selectIndex) * 31;
        Boolean bool = this.forceRefresh;
        return iHashCode + (bool == null ? 0 : bool.hashCode());
    }

    public final void setForceRefresh(@Nullable Boolean bool) {
        this.forceRefresh = bool;
    }

    public final void setSelectIndex(int i7) {
        this.selectIndex = i7;
    }

    @NotNull
    public String toString() {
        return "DataBundleGroupParams(selectIndex=" + this.selectIndex + ", forceRefresh=" + this.forceRefresh + ")";
    }

    public /* synthetic */ DataBundleGroupParams(int i7, Boolean bool, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(i7, (i10 & 2) != 0 ? Boolean.FALSE : bool);
    }
}
