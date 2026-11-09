package com.transsnet.palmpay.core.bean.cashier;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.camera.video.u;
import com.google.firebase.analytics.FirebaseAnalytics;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0010\u0002\n\u0002\b\u000b\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0086\b\u0018\u0000 12\u00020\u0001:\u00011BC\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\n\u0010\u000bB\u0011\b\u0016\u0012\u0006\u0010\f\u001a\u00020\r¢\u0006\u0004\b\n\u0010\u000eJ\u0018\u0010!\u001a\u00020\"2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010#\u001a\u00020\tH\u0016J\b\u0010$\u001a\u00020\tH\u0016J\u0010\u0010%\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u0010J\u000b\u0010&\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010'\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010(\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u0010\u0010)\u001a\u0004\u0018\u00010\tHÆ\u0003¢\u0006\u0002\u0010\u001dJJ\u0010*\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\tHÆ\u0001¢\u0006\u0002\u0010+J\u0013\u0010,\u001a\u00020\u00032\b\u0010-\u001a\u0004\u0018\u00010.HÖ\u0003J\t\u0010/\u001a\u00020\tHÖ\u0001J\t\u00100\u001a\u00020\u0005HÖ\u0001R\u001e\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u0010\n\u0002\u0010\u0013\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\u0015\"\u0004\b\u0019\u0010\u0017R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001a\u0010\u0015\"\u0004\b\u001b\u0010\u0017R\u001e\u0010\b\u001a\u0004\u0018\u00010\tX\u0086\u000e¢\u0006\u0010\n\u0002\u0010 \u001a\u0004\b\u001c\u0010\u001d\"\u0004\b\u001e\u0010\u001f¨\u00062"}, d2 = {"Lcom/transsnet/palmpay/core/bean/cashier/FastTransSaveGuardDto;", "Landroid/os/Parcelable;", "saveGuardFlag", "", "title", "", "darkTitle", "description", FirebaseAnalytics.Param.PRICE, "", "<init>", "(Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;)V", "parcel", "Landroid/os/Parcel;", "(Landroid/os/Parcel;)V", "getSaveGuardFlag", "()Ljava/lang/Boolean;", "setSaveGuardFlag", "(Ljava/lang/Boolean;)V", "Ljava/lang/Boolean;", "getTitle", "()Ljava/lang/String;", "setTitle", "(Ljava/lang/String;)V", "getDarkTitle", "setDarkTitle", "getDescription", "setDescription", "getPrice", "()Ljava/lang/Integer;", "setPrice", "(Ljava/lang/Integer;)V", "Ljava/lang/Integer;", "writeToParcel", "", "flags", "describeContents", "component1", "component2", "component3", "component4", "component5", "copy", "(Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;)Lcom/transsnet/palmpay/core/bean/cashier/FastTransSaveGuardDto;", "equals", "other", "", "hashCode", "toString", "CREATOR", "lib_core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final /* data */ class FastTransSaveGuardDto implements Parcelable {

    /* JADX INFO: renamed from: CREATOR, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @Nullable
    private String darkTitle;

    @Nullable
    private String description;

    @Nullable
    private Integer price;

    @Nullable
    private Boolean saveGuardFlag;

    @Nullable
    private String title;

    /* JADX INFO: renamed from: com.transsnet.palmpay.core.bean.cashier.FastTransSaveGuardDto$CREATOR, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0007H\u0016J\u001d\u0010\b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH\u0016¢\u0006\u0002\u0010\f¨\u0006\r"}, d2 = {"Lcom/transsnet/palmpay/core/bean/cashier/FastTransSaveGuardDto$CREATOR;", "Landroid/os/Parcelable$Creator;", "Lcom/transsnet/palmpay/core/bean/cashier/FastTransSaveGuardDto;", "<init>", "()V", "createFromParcel", "parcel", "Landroid/os/Parcel;", "newArray", "", "size", "", "(I)[Lcom/transsnet/palmpay/core/bean/cashier/FastTransSaveGuardDto;", "lib_core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion implements Parcelable.Creator<FastTransSaveGuardDto> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @NotNull
        public FastTransSaveGuardDto createFromParcel(@NotNull Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new FastTransSaveGuardDto(parcel);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @NotNull
        public FastTransSaveGuardDto[] newArray(int size) {
            return new FastTransSaveGuardDto[size];
        }
    }

    public FastTransSaveGuardDto() {
        this(null, null, null, null, null, 31, null);
    }

    public static /* synthetic */ FastTransSaveGuardDto copy$default(FastTransSaveGuardDto fastTransSaveGuardDto, Boolean bool, String str, String str2, String str3, Integer num, int i7, Object obj) {
        if ((i7 & 1) != 0) {
            bool = fastTransSaveGuardDto.saveGuardFlag;
        }
        if ((i7 & 2) != 0) {
            str = fastTransSaveGuardDto.title;
        }
        if ((i7 & 4) != 0) {
            str2 = fastTransSaveGuardDto.darkTitle;
        }
        if ((i7 & 8) != 0) {
            str3 = fastTransSaveGuardDto.description;
        }
        if ((i7 & 16) != 0) {
            num = fastTransSaveGuardDto.price;
        }
        Integer num2 = num;
        String str4 = str2;
        return fastTransSaveGuardDto.copy(bool, str, str4, str3, num2);
    }

    @Nullable
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final Boolean getSaveGuardFlag() {
        return this.saveGuardFlag;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    @Nullable
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getDarkTitle() {
        return this.darkTitle;
    }

    @Nullable
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getDescription() {
        return this.description;
    }

    @Nullable
    /* JADX INFO: renamed from: component5, reason: from getter */
    public final Integer getPrice() {
        return this.price;
    }

    @NotNull
    public final FastTransSaveGuardDto copy(@Nullable Boolean saveGuardFlag, @Nullable String title, @Nullable String darkTitle, @Nullable String description, @Nullable Integer price) {
        return new FastTransSaveGuardDto(saveGuardFlag, title, darkTitle, description, price);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof FastTransSaveGuardDto)) {
            return false;
        }
        FastTransSaveGuardDto fastTransSaveGuardDto = (FastTransSaveGuardDto) other;
        return Intrinsics.c(this.saveGuardFlag, fastTransSaveGuardDto.saveGuardFlag) && Intrinsics.c(this.title, fastTransSaveGuardDto.title) && Intrinsics.c(this.darkTitle, fastTransSaveGuardDto.darkTitle) && Intrinsics.c(this.description, fastTransSaveGuardDto.description) && Intrinsics.c(this.price, fastTransSaveGuardDto.price);
    }

    @Nullable
    public final String getDarkTitle() {
        return this.darkTitle;
    }

    @Nullable
    public final String getDescription() {
        return this.description;
    }

    @Nullable
    public final Integer getPrice() {
        return this.price;
    }

    @Nullable
    public final Boolean getSaveGuardFlag() {
        return this.saveGuardFlag;
    }

    @Nullable
    public final String getTitle() {
        return this.title;
    }

    public int hashCode() {
        Boolean bool = this.saveGuardFlag;
        int iHashCode = (bool == null ? 0 : bool.hashCode()) * 31;
        String str = this.title;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.darkTitle;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.description;
        int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        Integer num = this.price;
        return iHashCode4 + (num != null ? num.hashCode() : 0);
    }

    public final void setDarkTitle(@Nullable String str) {
        this.darkTitle = str;
    }

    public final void setDescription(@Nullable String str) {
        this.description = str;
    }

    public final void setPrice(@Nullable Integer num) {
        this.price = num;
    }

    public final void setSaveGuardFlag(@Nullable Boolean bool) {
        this.saveGuardFlag = bool;
    }

    public final void setTitle(@Nullable String str) {
        this.title = str;
    }

    @NotNull
    public String toString() {
        Boolean bool = this.saveGuardFlag;
        String str = this.title;
        String str2 = this.darkTitle;
        String str3 = this.description;
        Integer num = this.price;
        StringBuilder sb2 = new StringBuilder("FastTransSaveGuardDto(saveGuardFlag=");
        sb2.append(bool);
        sb2.append(", title=");
        sb2.append(str);
        sb2.append(", darkTitle=");
        u.x(sb2, str2, ", description=", str3, ", price=");
        sb2.append(num);
        sb2.append(")");
        return sb2.toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NotNull Parcel parcel, int flags) {
        Intrinsics.checkNotNullParameter(parcel, "parcel");
        parcel.writeValue(this.saveGuardFlag);
        parcel.writeString(this.title);
        parcel.writeString(this.darkTitle);
        parcel.writeString(this.description);
        parcel.writeValue(this.price);
    }

    public FastTransSaveGuardDto(@Nullable Boolean bool, @Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable Integer num) {
        this.saveGuardFlag = bool;
        this.title = str;
        this.darkTitle = str2;
        this.description = str3;
        this.price = num;
    }

    public /* synthetic */ FastTransSaveGuardDto(Boolean bool, String str, String str2, String str3, Integer num, int i7, DefaultConstructorMarker defaultConstructorMarker) {
        this((i7 & 1) != 0 ? Boolean.FALSE : bool, (i7 & 2) != 0 ? null : str, (i7 & 4) != 0 ? null : str2, (i7 & 8) != 0 ? null : str3, (i7 & 16) != 0 ? null : num);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public FastTransSaveGuardDto(@NotNull Parcel parcel) {
        Intrinsics.checkNotNullParameter(parcel, "parcel");
        Object value = parcel.readValue(Boolean.TYPE.getClassLoader());
        Boolean bool = value instanceof Boolean ? (Boolean) value : null;
        String string = parcel.readString();
        String string2 = parcel.readString();
        String string3 = parcel.readString();
        Object value2 = parcel.readValue(Integer.TYPE.getClassLoader());
        this(bool, string, string2, string3, value2 instanceof Integer ? (Integer) value2 : null);
    }
}
