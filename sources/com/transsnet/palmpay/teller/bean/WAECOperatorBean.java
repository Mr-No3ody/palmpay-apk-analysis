package com.transsnet.palmpay.teller.bean;

import C0.G;
import androidx.camera.camera2.internal.F;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B%\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u000b\u0010\f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\r\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u000e\u001a\u0004\u0018\u00010\u0003HÆ\u0003J-\u0010\u000f\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\tR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\t¨\u0006\u0016"}, d2 = {"Lcom/transsnet/palmpay/teller/bean/WAECOperatorBean;", "", "code", "", "logo", "name", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getCode", "()Ljava/lang/String;", "getLogo", "getName", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "module_biller_export_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final /* data */ class WAECOperatorBean {

    @Nullable
    private final String code;

    @Nullable
    private final String logo;

    @Nullable
    private final String name;

    public WAECOperatorBean(@Nullable String str, @Nullable String str2, @Nullable String str3) {
        this.code = str;
        this.logo = str2;
        this.name = str3;
    }

    public static /* synthetic */ WAECOperatorBean copy$default(WAECOperatorBean wAECOperatorBean, String str, String str2, String str3, int i7, Object obj) {
        if ((i7 & 1) != 0) {
            str = wAECOperatorBean.code;
        }
        if ((i7 & 2) != 0) {
            str2 = wAECOperatorBean.logo;
        }
        if ((i7 & 4) != 0) {
            str3 = wAECOperatorBean.name;
        }
        return wAECOperatorBean.copy(str, str2, str3);
    }

    @Nullable
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getCode() {
        return this.code;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getLogo() {
        return this.logo;
    }

    @Nullable
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getName() {
        return this.name;
    }

    @NotNull
    public final WAECOperatorBean copy(@Nullable String code, @Nullable String logo, @Nullable String name) {
        return new WAECOperatorBean(code, logo, name);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof WAECOperatorBean)) {
            return false;
        }
        WAECOperatorBean wAECOperatorBean = (WAECOperatorBean) other;
        return Intrinsics.c(this.code, wAECOperatorBean.code) && Intrinsics.c(this.logo, wAECOperatorBean.logo) && Intrinsics.c(this.name, wAECOperatorBean.name);
    }

    @Nullable
    public final String getCode() {
        return this.code;
    }

    @Nullable
    public final String getLogo() {
        return this.logo;
    }

    @Nullable
    public final String getName() {
        return this.name;
    }

    public int hashCode() {
        String str = this.code;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.logo;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.name;
        return iHashCode2 + (str3 != null ? str3.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        String str = this.code;
        String str2 = this.logo;
        return G.r(F.f("WAECOperatorBean(code=", str, ", logo=", str2, ", name="), this.name, ")");
    }
}
