package com.transsnet.palmpay.core.bean.cashier;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0086\b\u0018\u0000 \u00192\u00020\u0001:\u0001\u0019B\u0013\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0004\u0010\u0005B\u0011\b\u0016\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\u0004\u0010\bJ\u0018\u0010\u000b\u001a\u00020\f2\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\u000eH\u0016J\b\u0010\u000f\u001a\u00020\u000eH\u0016J\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0015\u0010\u0011\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015HÖ\u0003J\t\u0010\u0016\u001a\u00020\u000eHÖ\u0001J\t\u0010\u0017\u001a\u00020\u0018HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u001a"}, d2 = {"Lcom/transsnet/palmpay/core/bean/cashier/CusRightsDto;", "Landroid/os/Parcelable;", "fastTransSaveguardDto", "Lcom/transsnet/palmpay/core/bean/cashier/FastTransSaveGuardDto;", "<init>", "(Lcom/transsnet/palmpay/core/bean/cashier/FastTransSaveGuardDto;)V", "parcel", "Landroid/os/Parcel;", "(Landroid/os/Parcel;)V", "getFastTransSaveguardDto", "()Lcom/transsnet/palmpay/core/bean/cashier/FastTransSaveGuardDto;", "writeToParcel", "", "flags", "", "describeContents", "component1", "copy", "equals", "", "other", "", "hashCode", "toString", "", "CREATOR", "lib_core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final /* data */ class CusRightsDto implements Parcelable {

    /* JADX INFO: renamed from: CREATOR, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @Nullable
    private final FastTransSaveGuardDto fastTransSaveguardDto;

    /* JADX INFO: renamed from: com.transsnet.palmpay.core.bean.cashier.CusRightsDto$CREATOR, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0007H\u0016J\u001d\u0010\b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH\u0016¢\u0006\u0002\u0010\f¨\u0006\r"}, d2 = {"Lcom/transsnet/palmpay/core/bean/cashier/CusRightsDto$CREATOR;", "Landroid/os/Parcelable$Creator;", "Lcom/transsnet/palmpay/core/bean/cashier/CusRightsDto;", "<init>", "()V", "createFromParcel", "parcel", "Landroid/os/Parcel;", "newArray", "", "size", "", "(I)[Lcom/transsnet/palmpay/core/bean/cashier/CusRightsDto;", "lib_core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion implements Parcelable.Creator<CusRightsDto> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @NotNull
        public CusRightsDto createFromParcel(@NotNull Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new CusRightsDto(parcel);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @NotNull
        public CusRightsDto[] newArray(int size) {
            return new CusRightsDto[size];
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public CusRightsDto() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    public static /* synthetic */ CusRightsDto copy$default(CusRightsDto cusRightsDto, FastTransSaveGuardDto fastTransSaveGuardDto, int i7, Object obj) {
        if ((i7 & 1) != 0) {
            fastTransSaveGuardDto = cusRightsDto.fastTransSaveguardDto;
        }
        return cusRightsDto.copy(fastTransSaveGuardDto);
    }

    @Nullable
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final FastTransSaveGuardDto getFastTransSaveguardDto() {
        return this.fastTransSaveguardDto;
    }

    @NotNull
    public final CusRightsDto copy(@Nullable FastTransSaveGuardDto fastTransSaveguardDto) {
        return new CusRightsDto(fastTransSaveguardDto);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof CusRightsDto) && Intrinsics.c(this.fastTransSaveguardDto, ((CusRightsDto) other).fastTransSaveguardDto);
    }

    @Nullable
    public final FastTransSaveGuardDto getFastTransSaveguardDto() {
        return this.fastTransSaveguardDto;
    }

    public int hashCode() {
        FastTransSaveGuardDto fastTransSaveGuardDto = this.fastTransSaveguardDto;
        if (fastTransSaveGuardDto == null) {
            return 0;
        }
        return fastTransSaveGuardDto.hashCode();
    }

    @NotNull
    public String toString() {
        return "CusRightsDto(fastTransSaveguardDto=" + this.fastTransSaveguardDto + ")";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NotNull Parcel parcel, int flags) {
        Intrinsics.checkNotNullParameter(parcel, "parcel");
        parcel.writeParcelable(this.fastTransSaveguardDto, flags);
    }

    public CusRightsDto(@Nullable FastTransSaveGuardDto fastTransSaveGuardDto) {
        this.fastTransSaveguardDto = fastTransSaveGuardDto;
    }

    public /* synthetic */ CusRightsDto(FastTransSaveGuardDto fastTransSaveGuardDto, int i7, DefaultConstructorMarker defaultConstructorMarker) {
        this((i7 & 1) != 0 ? null : fastTransSaveGuardDto);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public CusRightsDto(@NotNull Parcel parcel) {
        this((FastTransSaveGuardDto) parcel.readParcelable(FastTransSaveGuardDto.class.getClassLoader()));
        Intrinsics.checkNotNullParameter(parcel, "parcel");
    }
}
