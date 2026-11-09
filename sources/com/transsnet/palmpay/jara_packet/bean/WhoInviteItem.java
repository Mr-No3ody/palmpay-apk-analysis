package com.transsnet.palmpay.jara_packet.bean;

import androidx.camera.video.u;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\u000b\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001BC\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0006\u0010\u0015\u001a\u00020\u0016J\u0010\u0010\u0017\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\rJ\u000b\u0010\u0018\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u0019\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u001a\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u001b\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u001c\u001a\u0004\u0018\u00010\u0001HÆ\u0003JV\u0010\u001d\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0001HÆ\u0001¢\u0006\u0002\u0010\u001eJ\u0013\u0010\u001f\u001a\u00020\u00162\b\u0010 \u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010!\u001a\u00020\"HÖ\u0001J\t\u0010#\u001a\u00020\u0005HÖ\u0001R\u0015\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\u000e\u001a\u0004\b\f\u0010\rR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0010R\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0010R\u0013\u0010\b\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0010R\u0013\u0010\t\u001a\u0004\u0018\u00010\u0001¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\u0014¨\u0006$"}, d2 = {"Lcom/transsnet/palmpay/jara_packet/bean/WhoInviteItem;", "", "id", "", "phone", "", "transType", "displayName", "reason", "isInvite", "<init>", "(Ljava/lang/Long;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;)V", "getId", "()Ljava/lang/Long;", "Ljava/lang/Long;", "getPhone", "()Ljava/lang/String;", "getTransType", "getDisplayName", "getReason", "()Ljava/lang/Object;", "hasInvited", "", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "(Ljava/lang/Long;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;)Lcom/transsnet/palmpay/jara_packet/bean/WhoInviteItem;", "equals", "other", "hashCode", "", "toString", "module_rewards_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final /* data */ class WhoInviteItem {

    @Nullable
    private final String displayName;

    @Nullable
    private final Long id;

    @Nullable
    private final Object isInvite;

    @Nullable
    private final String phone;

    @Nullable
    private final String reason;

    @Nullable
    private final String transType;

    public WhoInviteItem(@Nullable Long l5, @Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable String str4, @Nullable Object obj) {
        this.id = l5;
        this.phone = str;
        this.transType = str2;
        this.displayName = str3;
        this.reason = str4;
        this.isInvite = obj;
    }

    public static /* synthetic */ WhoInviteItem copy$default(WhoInviteItem whoInviteItem, Long l5, String str, String str2, String str3, String str4, Object obj, int i7, Object obj2) {
        if ((i7 & 1) != 0) {
            l5 = whoInviteItem.id;
        }
        if ((i7 & 2) != 0) {
            str = whoInviteItem.phone;
        }
        if ((i7 & 4) != 0) {
            str2 = whoInviteItem.transType;
        }
        if ((i7 & 8) != 0) {
            str3 = whoInviteItem.displayName;
        }
        if ((i7 & 16) != 0) {
            str4 = whoInviteItem.reason;
        }
        if ((i7 & 32) != 0) {
            obj = whoInviteItem.isInvite;
        }
        String str5 = str4;
        Object obj3 = obj;
        return whoInviteItem.copy(l5, str, str2, str3, str5, obj3);
    }

    @Nullable
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final Long getId() {
        return this.id;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getPhone() {
        return this.phone;
    }

    @Nullable
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getTransType() {
        return this.transType;
    }

    @Nullable
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getDisplayName() {
        return this.displayName;
    }

    @Nullable
    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getReason() {
        return this.reason;
    }

    @Nullable
    /* JADX INFO: renamed from: component6, reason: from getter */
    public final Object getIsInvite() {
        return this.isInvite;
    }

    @NotNull
    public final WhoInviteItem copy(@Nullable Long id2, @Nullable String phone, @Nullable String transType, @Nullable String displayName, @Nullable String reason, @Nullable Object isInvite) {
        return new WhoInviteItem(id2, phone, transType, displayName, reason, isInvite);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof WhoInviteItem)) {
            return false;
        }
        WhoInviteItem whoInviteItem = (WhoInviteItem) other;
        return Intrinsics.c(this.id, whoInviteItem.id) && Intrinsics.c(this.phone, whoInviteItem.phone) && Intrinsics.c(this.transType, whoInviteItem.transType) && Intrinsics.c(this.displayName, whoInviteItem.displayName) && Intrinsics.c(this.reason, whoInviteItem.reason) && Intrinsics.c(this.isInvite, whoInviteItem.isInvite);
    }

    @Nullable
    public final String getDisplayName() {
        return this.displayName;
    }

    @Nullable
    public final Long getId() {
        return this.id;
    }

    @Nullable
    public final String getPhone() {
        return this.phone;
    }

    @Nullable
    public final String getReason() {
        return this.reason;
    }

    @Nullable
    public final String getTransType() {
        return this.transType;
    }

    public final boolean hasInvited() {
        Object obj = this.isInvite;
        if (obj instanceof Number) {
            return ((Number) obj).intValue() == 1;
        }
        if (obj instanceof String) {
            return Intrinsics.c(StringsKt.V((String) obj).toString(), "1");
        }
        return false;
    }

    public int hashCode() {
        Long l5 = this.id;
        int iHashCode = (l5 == null ? 0 : l5.hashCode()) * 31;
        String str = this.phone;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.transType;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.displayName;
        int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.reason;
        int iHashCode5 = (iHashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
        Object obj = this.isInvite;
        return iHashCode5 + (obj != null ? obj.hashCode() : 0);
    }

    @Nullable
    public final Object isInvite() {
        return this.isInvite;
    }

    @NotNull
    public String toString() {
        Long l5 = this.id;
        String str = this.phone;
        String str2 = this.transType;
        String str3 = this.displayName;
        String str4 = this.reason;
        Object obj = this.isInvite;
        StringBuilder sb2 = new StringBuilder("WhoInviteItem(id=");
        sb2.append(l5);
        sb2.append(", phone=");
        sb2.append(str);
        sb2.append(", transType=");
        u.x(sb2, str2, ", displayName=", str3, ", reason=");
        sb2.append(str4);
        sb2.append(", isInvite=");
        sb2.append(obj);
        sb2.append(")");
        return sb2.toString();
    }
}
