package com.transsnet.palmpay.send_money.bean;

import C0.G;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000b\u0010\r\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u000e\u001a\u0004\u0018\u00010\u0003HÆ\u0003J!\u0010\u000f\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0003HÖ\u0001R\u001c\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\b\"\u0004\b\f\u0010\n¨\u0006\u0016"}, d2 = {"Lcom/transsnet/palmpay/send_money/bean/InviteBean;", "", "toInviteTip", "", "toInviteDarkTip", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "getToInviteTip", "()Ljava/lang/String;", "setToInviteTip", "(Ljava/lang/String;)V", "getToInviteDarkTip", "setToInviteDarkTip", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "module_money_transfer_export_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final /* data */ class InviteBean {

    @Nullable
    private String toInviteDarkTip;

    @Nullable
    private String toInviteTip;

    public InviteBean(@Nullable String str, @Nullable String str2) {
        this.toInviteTip = str;
        this.toInviteDarkTip = str2;
    }

    public static /* synthetic */ InviteBean copy$default(InviteBean inviteBean, String str, String str2, int i7, Object obj) {
        if ((i7 & 1) != 0) {
            str = inviteBean.toInviteTip;
        }
        if ((i7 & 2) != 0) {
            str2 = inviteBean.toInviteDarkTip;
        }
        return inviteBean.copy(str, str2);
    }

    @Nullable
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getToInviteTip() {
        return this.toInviteTip;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getToInviteDarkTip() {
        return this.toInviteDarkTip;
    }

    @NotNull
    public final InviteBean copy(@Nullable String toInviteTip, @Nullable String toInviteDarkTip) {
        return new InviteBean(toInviteTip, toInviteDarkTip);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof InviteBean)) {
            return false;
        }
        InviteBean inviteBean = (InviteBean) other;
        return Intrinsics.c(this.toInviteTip, inviteBean.toInviteTip) && Intrinsics.c(this.toInviteDarkTip, inviteBean.toInviteDarkTip);
    }

    @Nullable
    public final String getToInviteDarkTip() {
        return this.toInviteDarkTip;
    }

    @Nullable
    public final String getToInviteTip() {
        return this.toInviteTip;
    }

    public int hashCode() {
        String str = this.toInviteTip;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.toInviteDarkTip;
        return iHashCode + (str2 != null ? str2.hashCode() : 0);
    }

    public final void setToInviteDarkTip(@Nullable String str) {
        this.toInviteDarkTip = str;
    }

    public final void setToInviteTip(@Nullable String str) {
        this.toInviteTip = str;
    }

    @NotNull
    public String toString() {
        return G.q("InviteBean(toInviteTip=", this.toInviteTip, ", toInviteDarkTip=", this.toInviteDarkTip, ")");
    }
}
