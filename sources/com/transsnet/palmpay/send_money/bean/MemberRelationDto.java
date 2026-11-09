package com.transsnet.palmpay.send_money.bean;

import C0.G;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u001a\u0010\u0004\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\b\"\u0004\b\n\u0010\u000b¨\u0006\u0015"}, d2 = {"Lcom/transsnet/palmpay/send_money/bean/MemberRelationDto;", "", "phone", "", "nickName", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "getPhone", "()Ljava/lang/String;", "getNickName", "setNickName", "(Ljava/lang/String;)V", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "module_money_transfer_export_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final /* data */ class MemberRelationDto {

    @NotNull
    private String nickName;

    @NotNull
    private final String phone;

    /* JADX WARN: Multi-variable type inference failed */
    public MemberRelationDto() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    public static /* synthetic */ MemberRelationDto copy$default(MemberRelationDto memberRelationDto, String str, String str2, int i7, Object obj) {
        if ((i7 & 1) != 0) {
            str = memberRelationDto.phone;
        }
        if ((i7 & 2) != 0) {
            str2 = memberRelationDto.nickName;
        }
        return memberRelationDto.copy(str, str2);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getPhone() {
        return this.phone;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getNickName() {
        return this.nickName;
    }

    @NotNull
    public final MemberRelationDto copy(@NotNull String phone, @NotNull String nickName) {
        Intrinsics.checkNotNullParameter(phone, "phone");
        Intrinsics.checkNotNullParameter(nickName, "nickName");
        return new MemberRelationDto(phone, nickName);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof MemberRelationDto)) {
            return false;
        }
        MemberRelationDto memberRelationDto = (MemberRelationDto) other;
        return Intrinsics.c(this.phone, memberRelationDto.phone) && Intrinsics.c(this.nickName, memberRelationDto.nickName);
    }

    @NotNull
    public final String getNickName() {
        return this.nickName;
    }

    @NotNull
    public final String getPhone() {
        return this.phone;
    }

    public int hashCode() {
        return this.nickName.hashCode() + (this.phone.hashCode() * 31);
    }

    public final void setNickName(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.nickName = str;
    }

    @NotNull
    public String toString() {
        return G.q("MemberRelationDto(phone=", this.phone, ", nickName=", this.nickName, ")");
    }

    public MemberRelationDto(@NotNull String phone, @NotNull String nickName) {
        Intrinsics.checkNotNullParameter(phone, "phone");
        Intrinsics.checkNotNullParameter(nickName, "nickName");
        this.phone = phone;
        this.nickName = nickName;
    }

    public /* synthetic */ MemberRelationDto(String str, String str2, int i7, DefaultConstructorMarker defaultConstructorMarker) {
        this((i7 & 1) != 0 ? "" : str, (i7 & 2) != 0 ? "" : str2);
    }
}
