package com.transsnet.palmpay.managemoney.bean.req;

import androidx.camera.camera2.internal.F;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B/\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0012\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0007HÆ\u0003J7\u0010\u0014\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u0007HÆ\u0001J\u0013\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0018\u001a\u00020\u0007HÖ\u0001J\t\u0010\u0019\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000bR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000bR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u001a"}, d2 = {"Lcom/transsnet/palmpay/managemoney/bean/req/EditStateReq;", "", "cid", "", "stateCode", "stateName", "orgSource", "", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;I)V", "getCid", "()Ljava/lang/String;", "getStateCode", "getStateName", "getOrgSource", "()I", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "toString", "module_wealth_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final /* data */ class EditStateReq {

    @Nullable
    private final String cid;
    private final int orgSource;

    @Nullable
    private final String stateCode;

    @Nullable
    private final String stateName;

    public EditStateReq(@Nullable String str, @Nullable String str2, @Nullable String str3, int i7) {
        this.cid = str;
        this.stateCode = str2;
        this.stateName = str3;
        this.orgSource = i7;
    }

    public static /* synthetic */ EditStateReq copy$default(EditStateReq editStateReq, String str, String str2, String str3, int i7, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = editStateReq.cid;
        }
        if ((i10 & 2) != 0) {
            str2 = editStateReq.stateCode;
        }
        if ((i10 & 4) != 0) {
            str3 = editStateReq.stateName;
        }
        if ((i10 & 8) != 0) {
            i7 = editStateReq.orgSource;
        }
        return editStateReq.copy(str, str2, str3, i7);
    }

    @Nullable
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getCid() {
        return this.cid;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getStateCode() {
        return this.stateCode;
    }

    @Nullable
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getStateName() {
        return this.stateName;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final int getOrgSource() {
        return this.orgSource;
    }

    @NotNull
    public final EditStateReq copy(@Nullable String cid, @Nullable String stateCode, @Nullable String stateName, int orgSource) {
        return new EditStateReq(cid, stateCode, stateName, orgSource);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof EditStateReq)) {
            return false;
        }
        EditStateReq editStateReq = (EditStateReq) other;
        return Intrinsics.c(this.cid, editStateReq.cid) && Intrinsics.c(this.stateCode, editStateReq.stateCode) && Intrinsics.c(this.stateName, editStateReq.stateName) && this.orgSource == editStateReq.orgSource;
    }

    @Nullable
    public final String getCid() {
        return this.cid;
    }

    public final int getOrgSource() {
        return this.orgSource;
    }

    @Nullable
    public final String getStateCode() {
        return this.stateCode;
    }

    @Nullable
    public final String getStateName() {
        return this.stateName;
    }

    public int hashCode() {
        String str = this.cid;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.stateCode;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.stateName;
        return Integer.hashCode(this.orgSource) + ((iHashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31);
    }

    @NotNull
    public String toString() {
        String str = this.cid;
        String str2 = this.stateCode;
        String str3 = this.stateName;
        int i7 = this.orgSource;
        StringBuilder sbF = F.f("EditStateReq(cid=", str, ", stateCode=", str2, ", stateName=");
        sbF.append(str3);
        sbF.append(", orgSource=");
        sbF.append(i7);
        sbF.append(")");
        return sbF.toString();
    }

    public /* synthetic */ EditStateReq(String str, String str2, String str3, int i7, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, str3, (i10 & 8) != 0 ? 1 : i7);
    }
}
