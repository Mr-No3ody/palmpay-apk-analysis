package com.transsnet.palmpay.send_money.bean.req;

import com.transsnet.palmpay.core.bean.req.CommonListReq;
import com.transsnet.palmpay.send_money.bean.MemberRelationDto;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u000e\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0011\u0010\n\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003HÆ\u0003J\u001b\u0010\u000b\u001a\u00020\u00002\u0010\b\u0002\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fHÖ\u0003J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001R\"\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\u0006¨\u0006\u0014"}, d2 = {"Lcom/transsnet/palmpay/send_money/bean/req/LocalContactReq;", "Lcom/transsnet/palmpay/core/bean/req/CommonListReq;", "localPhoneList", "", "Lcom/transsnet/palmpay/send_money/bean/MemberRelationDto;", "<init>", "(Ljava/util/List;)V", "getLocalPhoneList", "()Ljava/util/List;", "setLocalPhoneList", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "module_money_transfer_export_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final /* data */ class LocalContactReq extends CommonListReq {

    @Nullable
    private List<MemberRelationDto> localPhoneList;

    public LocalContactReq(@Nullable List<MemberRelationDto> list) {
        this.localPhoneList = list;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ LocalContactReq copy$default(LocalContactReq localContactReq, List list, int i7, Object obj) {
        if ((i7 & 1) != 0) {
            list = localContactReq.localPhoneList;
        }
        return localContactReq.copy(list);
    }

    @Nullable
    public final List<MemberRelationDto> component1() {
        return this.localPhoneList;
    }

    @NotNull
    public final LocalContactReq copy(@Nullable List<MemberRelationDto> localPhoneList) {
        return new LocalContactReq(localPhoneList);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof LocalContactReq) && Intrinsics.c(this.localPhoneList, ((LocalContactReq) other).localPhoneList);
    }

    @Nullable
    public final List<MemberRelationDto> getLocalPhoneList() {
        return this.localPhoneList;
    }

    public int hashCode() {
        List<MemberRelationDto> list = this.localPhoneList;
        if (list == null) {
            return 0;
        }
        return list.hashCode();
    }

    public final void setLocalPhoneList(@Nullable List<MemberRelationDto> list) {
        this.localPhoneList = list;
    }

    @NotNull
    public String toString() {
        return "LocalContactReq(localPhoneList=" + this.localPhoneList + ")";
    }
}
