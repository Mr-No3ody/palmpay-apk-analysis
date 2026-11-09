package com.transsnet.palmpay.managemoney.bean.resp;

import com.google.firebase.messaging.Constants;
import com.transsnet.palmpay.core.bean.CommonResult;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001:\u0001\u0012B\u0011\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u000b\u0010\b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0015\u0010\t\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0013"}, d2 = {"Lcom/transsnet/palmpay/managemoney/bean/resp/GetIdentityResp;", "Lcom/transsnet/palmpay/core/bean/CommonResult;", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "Lcom/transsnet/palmpay/managemoney/bean/resp/GetIdentityResp$IdentityBean;", "<init>", "(Lcom/transsnet/palmpay/managemoney/bean/resp/GetIdentityResp$IdentityBean;)V", "getData", "()Lcom/transsnet/palmpay/managemoney/bean/resp/GetIdentityResp$IdentityBean;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "IdentityBean", "module_wealth_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final /* data */ class GetIdentityResp extends CommonResult {

    @Nullable
    private final IdentityBean data;

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/transsnet/palmpay/managemoney/bean/resp/GetIdentityResp$IdentityBean;", "", "identityType", "", "<init>", "(I)V", "getIdentityType", "()I", "module_wealth_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class IdentityBean {
        private final int identityType;

        public IdentityBean() {
            this(0, 1, null);
        }

        public final int getIdentityType() {
            return this.identityType;
        }

        public IdentityBean(int i7) {
            this.identityType = i7;
        }

        public /* synthetic */ IdentityBean(int i7, int i10, DefaultConstructorMarker defaultConstructorMarker) {
            this((i10 & 1) != 0 ? 1 : i7);
        }
    }

    public GetIdentityResp(@Nullable IdentityBean identityBean) {
        this.data = identityBean;
    }

    public static /* synthetic */ GetIdentityResp copy$default(GetIdentityResp getIdentityResp, IdentityBean identityBean, int i7, Object obj) {
        if ((i7 & 1) != 0) {
            identityBean = getIdentityResp.data;
        }
        return getIdentityResp.copy(identityBean);
    }

    @Nullable
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final IdentityBean getData() {
        return this.data;
    }

    @NotNull
    public final GetIdentityResp copy(@Nullable IdentityBean data) {
        return new GetIdentityResp(data);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof GetIdentityResp) && Intrinsics.c(this.data, ((GetIdentityResp) other).data);
    }

    @Nullable
    public final IdentityBean getData() {
        return this.data;
    }

    public int hashCode() {
        IdentityBean identityBean = this.data;
        if (identityBean == null) {
            return 0;
        }
        return identityBean.hashCode();
    }

    @Override // com.transsnet.palmpay.core.bean.CommonResult
    @NotNull
    public String toString() {
        return "GetIdentityResp(data=" + this.data + ")";
    }
}
