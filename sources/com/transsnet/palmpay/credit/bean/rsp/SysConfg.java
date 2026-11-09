package com.transsnet.palmpay.credit.bean.rsp;

import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B!\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u000e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u000b\u0010\r\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0011\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005HÆ\u0003J'\u0010\u000f\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\u0010\b\u0002\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005HÆ\u0001J\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0019\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\u0016"}, d2 = {"Lcom/transsnet/palmpay/credit/bean/rsp/SysConfg;", "", "keyType", "", "values", "", "Lcom/transsnet/palmpay/credit/bean/rsp/SysConfigValue;", "<init>", "(Ljava/lang/String;Ljava/util/List;)V", "getKeyType", "()Ljava/lang/String;", "getValues", "()Ljava/util/List;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "module_flexi_export_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final /* data */ class SysConfg {

    @Nullable
    private final String keyType;

    @Nullable
    private final List<SysConfigValue> values;

    public SysConfg(@Nullable String str, @Nullable List<SysConfigValue> list) {
        this.keyType = str;
        this.values = list;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ SysConfg copy$default(SysConfg sysConfg, String str, List list, int i7, Object obj) {
        if ((i7 & 1) != 0) {
            str = sysConfg.keyType;
        }
        if ((i7 & 2) != 0) {
            list = sysConfg.values;
        }
        return sysConfg.copy(str, list);
    }

    @Nullable
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getKeyType() {
        return this.keyType;
    }

    @Nullable
    public final List<SysConfigValue> component2() {
        return this.values;
    }

    @NotNull
    public final SysConfg copy(@Nullable String keyType, @Nullable List<SysConfigValue> values) {
        return new SysConfg(keyType, values);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SysConfg)) {
            return false;
        }
        SysConfg sysConfg = (SysConfg) other;
        return Intrinsics.c(this.keyType, sysConfg.keyType) && Intrinsics.c(this.values, sysConfg.values);
    }

    @Nullable
    public final String getKeyType() {
        return this.keyType;
    }

    @Nullable
    public final List<SysConfigValue> getValues() {
        return this.values;
    }

    public int hashCode() {
        String str = this.keyType;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        List<SysConfigValue> list = this.values;
        return iHashCode + (list != null ? list.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "SysConfg(keyType=" + this.keyType + ", values=" + this.values + ")";
    }
}
