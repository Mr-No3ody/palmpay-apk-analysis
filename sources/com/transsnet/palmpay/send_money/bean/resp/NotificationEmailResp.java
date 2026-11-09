package com.transsnet.palmpay.send_money.bean.resp;

import N8.q0;
import androidx.camera.camera2.internal.F;
import com.google.android.gms.common.Scopes;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0013\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B1\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\t\u0010\nJ\u000b\u0010\u0013\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0014\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0006HÆ\u0003J\u0010\u0010\u0016\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0002\u0010\u0011J<\u0010\u0017\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\bHÆ\u0001¢\u0006\u0002\u0010\u0018J\u0013\u0010\u0019\u001a\u00020\b2\b\u0010\u001a\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001b\u001a\u00020\u001cHÖ\u0001J\t\u0010\u001d\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\fR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0015\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\n\n\u0002\u0010\u0012\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u001e"}, d2 = {"Lcom/transsnet/palmpay/send_money/bean/resp/NotificationEmailResp;", "", Scopes.EMAIL, "", "memberId", "emailAboveAmount", "", "noticeFlag", "", "<init>", "(Ljava/lang/String;Ljava/lang/String;JLjava/lang/Boolean;)V", "getEmail", "()Ljava/lang/String;", "getMemberId", "getEmailAboveAmount", "()J", "getNoticeFlag", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "component1", "component2", "component3", "component4", "copy", "(Ljava/lang/String;Ljava/lang/String;JLjava/lang/Boolean;)Lcom/transsnet/palmpay/send_money/bean/resp/NotificationEmailResp;", "equals", "other", "hashCode", "", "toString", "module_money_transfer_export_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final /* data */ class NotificationEmailResp {

    @Nullable
    private final String email;
    private final long emailAboveAmount;

    @Nullable
    private final String memberId;

    @Nullable
    private final Boolean noticeFlag;

    public NotificationEmailResp(@Nullable String str, @Nullable String str2, long j6, @Nullable Boolean bool) {
        this.email = str;
        this.memberId = str2;
        this.emailAboveAmount = j6;
        this.noticeFlag = bool;
    }

    public static /* synthetic */ NotificationEmailResp copy$default(NotificationEmailResp notificationEmailResp, String str, String str2, long j6, Boolean bool, int i7, Object obj) {
        if ((i7 & 1) != 0) {
            str = notificationEmailResp.email;
        }
        if ((i7 & 2) != 0) {
            str2 = notificationEmailResp.memberId;
        }
        if ((i7 & 4) != 0) {
            j6 = notificationEmailResp.emailAboveAmount;
        }
        if ((i7 & 8) != 0) {
            bool = notificationEmailResp.noticeFlag;
        }
        Boolean bool2 = bool;
        return notificationEmailResp.copy(str, str2, j6, bool2);
    }

    @Nullable
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getEmail() {
        return this.email;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getMemberId() {
        return this.memberId;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final long getEmailAboveAmount() {
        return this.emailAboveAmount;
    }

    @Nullable
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final Boolean getNoticeFlag() {
        return this.noticeFlag;
    }

    @NotNull
    public final NotificationEmailResp copy(@Nullable String email, @Nullable String memberId, long emailAboveAmount, @Nullable Boolean noticeFlag) {
        return new NotificationEmailResp(email, memberId, emailAboveAmount, noticeFlag);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof NotificationEmailResp)) {
            return false;
        }
        NotificationEmailResp notificationEmailResp = (NotificationEmailResp) other;
        return Intrinsics.c(this.email, notificationEmailResp.email) && Intrinsics.c(this.memberId, notificationEmailResp.memberId) && this.emailAboveAmount == notificationEmailResp.emailAboveAmount && Intrinsics.c(this.noticeFlag, notificationEmailResp.noticeFlag);
    }

    @Nullable
    public final String getEmail() {
        return this.email;
    }

    public final long getEmailAboveAmount() {
        return this.emailAboveAmount;
    }

    @Nullable
    public final String getMemberId() {
        return this.memberId;
    }

    @Nullable
    public final Boolean getNoticeFlag() {
        return this.noticeFlag;
    }

    public int hashCode() {
        String str = this.email;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.memberId;
        int iB = q0.b((iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31, 31, this.emailAboveAmount);
        Boolean bool = this.noticeFlag;
        return iB + (bool != null ? bool.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        String str = this.email;
        String str2 = this.memberId;
        long j6 = this.emailAboveAmount;
        Boolean bool = this.noticeFlag;
        StringBuilder sbF = F.f("NotificationEmailResp(email=", str, ", memberId=", str2, ", emailAboveAmount=");
        sbF.append(j6);
        sbF.append(", noticeFlag=");
        sbF.append(bool);
        sbF.append(")");
        return sbF.toString();
    }

    public /* synthetic */ NotificationEmailResp(String str, String str2, long j6, Boolean bool, int i7, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, (i7 & 4) != 0 ? 1000000L : j6, (i7 & 8) != 0 ? Boolean.FALSE : bool);
    }
}
