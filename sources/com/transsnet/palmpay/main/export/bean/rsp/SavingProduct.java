package com.transsnet.palmpay.main.export.bean.rsp;

import N8.q0;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import androidx.camera.video.u;
import com.facebook.react.fabric.mounting.mountitems.IntBufferBatchMountItem;
import com.google.firebase.crashlytics.internal.metadata.UserMetadata;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0019\n\u0002\u0010\u0002\n\u0002\b\u0013\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0086\b\u0018\u0000 J2\u00020\u0001:\u0001JB\u008b\u0001\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u0003\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\f\u001a\u00020\r\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u0013\u001a\u00020\u0003¢\u0006\u0004\b\u0014\u0010\u0015B\u0011\b\u0016\u0012\u0006\u0010\u0016\u001a\u00020\u0017¢\u0006\u0004\b\u0014\u0010\u0018J\b\u0010/\u001a\u0004\u0018\u00010\u0005J\u0018\u00100\u001a\u0002012\u0006\u0010\u0016\u001a\u00020\u00172\u0006\u00102\u001a\u00020\rH\u0016J\b\u00103\u001a\u00020\rH\u0016J\u0010\u00104\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u001aJ\u000b\u00105\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u00106\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u00107\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\t\u00108\u001a\u00020\tHÆ\u0003J\t\u00109\u001a\u00020\u0003HÆ\u0003J\u000b\u0010:\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\t\u0010;\u001a\u00020\rHÆ\u0003J\u0010\u0010<\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u001aJ\u000b\u0010=\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010>\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010?\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010@\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\t\u0010A\u001a\u00020\u0003HÆ\u0003J®\u0001\u0010B\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u00032\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\f\u001a\u00020\r2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u0013\u001a\u00020\u0003HÆ\u0001¢\u0006\u0002\u0010CJ\u0013\u0010D\u001a\u00020E2\b\u0010F\u001a\u0004\u0018\u00010GHÖ\u0003J\t\u0010H\u001a\u00020\rHÖ\u0001J\t\u0010I\u001a\u00020\u0005HÖ\u0001R\u0015\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\u001b\u001a\u0004\b\u0019\u0010\u001aR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001dR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001dR\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001f\u0010\u001d\"\u0004\b \u0010!R\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010#R\u0011\u0010\n\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b$\u0010%R\u0013\u0010\u000b\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b&\u0010\u001dR\u0011\u0010\f\u001a\u00020\r¢\u0006\b\n\u0000\u001a\u0004\b'\u0010(R\u0015\u0010\u000e\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\u001b\u001a\u0004\b)\u0010\u001aR\u0013\u0010\u000f\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b*\u0010\u001dR\u0013\u0010\u0010\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b+\u0010\u001dR\u0013\u0010\u0011\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b,\u0010\u001dR\u0013\u0010\u0012\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b-\u0010\u001dR\u0011\u0010\u0013\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b.\u0010%¨\u0006K"}, d2 = {"Lcom/transsnet/palmpay/main/export/bean/rsp/SavingProduct;", "Landroid/os/Parcelable;", "productId", "", "productIcon", "", "productName", "introduction", "annualizedIncomeRatio", "", "durationDay", "goal", "productStatus", "", "amount", "newUserIcon", "oldUserIcon", "buyPageIcon", "androidUrl", "maxDurationDay", "<init>", "(Ljava/lang/Long;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;FJLjava/lang/String;ILjava/lang/Long;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;J)V", "parcel", "Landroid/os/Parcel;", "(Landroid/os/Parcel;)V", "getProductId", "()Ljava/lang/Long;", "Ljava/lang/Long;", "getProductIcon", "()Ljava/lang/String;", "getProductName", "getIntroduction", "setIntroduction", "(Ljava/lang/String;)V", "getAnnualizedIncomeRatio", "()F", "getDurationDay", "()J", "getGoal", "getProductStatus", "()I", "getAmount", "getNewUserIcon", "getOldUserIcon", "getBuyPageIcon", "getAndroidUrl", "getMaxDurationDay", "getShowName", "writeToParcel", "", "flags", "describeContents", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "component13", "component14", "copy", "(Ljava/lang/Long;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;FJLjava/lang/String;ILjava/lang/Long;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;J)Lcom/transsnet/palmpay/main/export/bean/rsp/SavingProduct;", "equals", "", "other", "", "hashCode", "toString", "CREATOR", "module_main_export_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final /* data */ class SavingProduct implements Parcelable {

    /* JADX INFO: renamed from: CREATOR, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @Nullable
    private final Long amount;

    @Nullable
    private final String androidUrl;
    private final float annualizedIncomeRatio;

    @Nullable
    private final String buyPageIcon;
    private final long durationDay;

    @Nullable
    private final String goal;

    @Nullable
    private String introduction;
    private final long maxDurationDay;

    @Nullable
    private final String newUserIcon;

    @Nullable
    private final String oldUserIcon;

    @Nullable
    private final String productIcon;

    @Nullable
    private final Long productId;

    @Nullable
    private final String productName;
    private final int productStatus;

    /* JADX INFO: renamed from: com.transsnet.palmpay.main.export.bean.rsp.SavingProduct$CREATOR, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0007H\u0016J\u001d\u0010\b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH\u0016¢\u0006\u0002\u0010\f¨\u0006\r"}, d2 = {"Lcom/transsnet/palmpay/main/export/bean/rsp/SavingProduct$CREATOR;", "Landroid/os/Parcelable$Creator;", "Lcom/transsnet/palmpay/main/export/bean/rsp/SavingProduct;", "<init>", "()V", "createFromParcel", "parcel", "Landroid/os/Parcel;", "newArray", "", "size", "", "(I)[Lcom/transsnet/palmpay/main/export/bean/rsp/SavingProduct;", "module_main_export_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion implements Parcelable.Creator<SavingProduct> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @NotNull
        public SavingProduct createFromParcel(@NotNull Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new SavingProduct(parcel);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @NotNull
        public SavingProduct[] newArray(int size) {
            return new SavingProduct[size];
        }
    }

    public SavingProduct(@Nullable Long l5, @Nullable String str, @Nullable String str2, @Nullable String str3, float f10, long j6, @Nullable String str4, int i7, @Nullable Long l6, @Nullable String str5, @Nullable String str6, @Nullable String str7, @Nullable String str8, long j10) {
        this.productId = l5;
        this.productIcon = str;
        this.productName = str2;
        this.introduction = str3;
        this.annualizedIncomeRatio = f10;
        this.durationDay = j6;
        this.goal = str4;
        this.productStatus = i7;
        this.amount = l6;
        this.newUserIcon = str5;
        this.oldUserIcon = str6;
        this.buyPageIcon = str7;
        this.androidUrl = str8;
        this.maxDurationDay = j10;
    }

    public static /* synthetic */ SavingProduct copy$default(SavingProduct savingProduct, Long l5, String str, String str2, String str3, float f10, long j6, String str4, int i7, Long l6, String str5, String str6, String str7, String str8, long j10, int i10, Object obj) {
        long j11;
        Long l8;
        Long l10 = (i10 & 1) != 0 ? savingProduct.productId : l5;
        String str9 = (i10 & 2) != 0 ? savingProduct.productIcon : str;
        String str10 = (i10 & 4) != 0 ? savingProduct.productName : str2;
        String str11 = (i10 & 8) != 0 ? savingProduct.introduction : str3;
        float f11 = (i10 & 16) != 0 ? savingProduct.annualizedIncomeRatio : f10;
        long j12 = (i10 & 32) != 0 ? savingProduct.durationDay : j6;
        String str12 = (i10 & 64) != 0 ? savingProduct.goal : str4;
        int i11 = (i10 & 128) != 0 ? savingProduct.productStatus : i7;
        Long l11 = (i10 & IntBufferBatchMountItem.INSTRUCTION_UPDATE_EVENT_EMITTER) != 0 ? savingProduct.amount : l6;
        String str13 = (i10 & 512) != 0 ? savingProduct.newUserIcon : str5;
        String str14 = (i10 & 1024) != 0 ? savingProduct.oldUserIcon : str6;
        String str15 = (i10 & 2048) != 0 ? savingProduct.buyPageIcon : str7;
        String str16 = (i10 & 4096) != 0 ? savingProduct.androidUrl : str8;
        if ((i10 & UserMetadata.MAX_INTERNAL_KEY_SIZE) != 0) {
            l8 = l10;
            j11 = savingProduct.maxDurationDay;
        } else {
            j11 = j10;
            l8 = l10;
        }
        return savingProduct.copy(l8, str9, str10, str11, f11, j12, str12, i11, l11, str13, str14, str15, str16, j11);
    }

    @Nullable
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final Long getProductId() {
        return this.productId;
    }

    @Nullable
    /* JADX INFO: renamed from: component10, reason: from getter */
    public final String getNewUserIcon() {
        return this.newUserIcon;
    }

    @Nullable
    /* JADX INFO: renamed from: component11, reason: from getter */
    public final String getOldUserIcon() {
        return this.oldUserIcon;
    }

    @Nullable
    /* JADX INFO: renamed from: component12, reason: from getter */
    public final String getBuyPageIcon() {
        return this.buyPageIcon;
    }

    @Nullable
    /* JADX INFO: renamed from: component13, reason: from getter */
    public final String getAndroidUrl() {
        return this.androidUrl;
    }

    /* JADX INFO: renamed from: component14, reason: from getter */
    public final long getMaxDurationDay() {
        return this.maxDurationDay;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getProductIcon() {
        return this.productIcon;
    }

    @Nullable
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getProductName() {
        return this.productName;
    }

    @Nullable
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getIntroduction() {
        return this.introduction;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final float getAnnualizedIncomeRatio() {
        return this.annualizedIncomeRatio;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final long getDurationDay() {
        return this.durationDay;
    }

    @Nullable
    /* JADX INFO: renamed from: component7, reason: from getter */
    public final String getGoal() {
        return this.goal;
    }

    /* JADX INFO: renamed from: component8, reason: from getter */
    public final int getProductStatus() {
        return this.productStatus;
    }

    @Nullable
    /* JADX INFO: renamed from: component9, reason: from getter */
    public final Long getAmount() {
        return this.amount;
    }

    @NotNull
    public final SavingProduct copy(@Nullable Long productId, @Nullable String productIcon, @Nullable String productName, @Nullable String introduction, float annualizedIncomeRatio, long durationDay, @Nullable String goal, int productStatus, @Nullable Long amount, @Nullable String newUserIcon, @Nullable String oldUserIcon, @Nullable String buyPageIcon, @Nullable String androidUrl, long maxDurationDay) {
        return new SavingProduct(productId, productIcon, productName, introduction, annualizedIncomeRatio, durationDay, goal, productStatus, amount, newUserIcon, oldUserIcon, buyPageIcon, androidUrl, maxDurationDay);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SavingProduct)) {
            return false;
        }
        SavingProduct savingProduct = (SavingProduct) other;
        return Intrinsics.c(this.productId, savingProduct.productId) && Intrinsics.c(this.productIcon, savingProduct.productIcon) && Intrinsics.c(this.productName, savingProduct.productName) && Intrinsics.c(this.introduction, savingProduct.introduction) && Float.compare(this.annualizedIncomeRatio, savingProduct.annualizedIncomeRatio) == 0 && this.durationDay == savingProduct.durationDay && Intrinsics.c(this.goal, savingProduct.goal) && this.productStatus == savingProduct.productStatus && Intrinsics.c(this.amount, savingProduct.amount) && Intrinsics.c(this.newUserIcon, savingProduct.newUserIcon) && Intrinsics.c(this.oldUserIcon, savingProduct.oldUserIcon) && Intrinsics.c(this.buyPageIcon, savingProduct.buyPageIcon) && Intrinsics.c(this.androidUrl, savingProduct.androidUrl) && this.maxDurationDay == savingProduct.maxDurationDay;
    }

    @Nullable
    public final Long getAmount() {
        return this.amount;
    }

    @Nullable
    public final String getAndroidUrl() {
        return this.androidUrl;
    }

    public final float getAnnualizedIncomeRatio() {
        return this.annualizedIncomeRatio;
    }

    @Nullable
    public final String getBuyPageIcon() {
        return this.buyPageIcon;
    }

    public final long getDurationDay() {
        return this.durationDay;
    }

    @Nullable
    public final String getGoal() {
        return this.goal;
    }

    @Nullable
    public final String getIntroduction() {
        return this.introduction;
    }

    public final long getMaxDurationDay() {
        return this.maxDurationDay;
    }

    @Nullable
    public final String getNewUserIcon() {
        return this.newUserIcon;
    }

    @Nullable
    public final String getOldUserIcon() {
        return this.oldUserIcon;
    }

    @Nullable
    public final String getProductIcon() {
        return this.productIcon;
    }

    @Nullable
    public final Long getProductId() {
        return this.productId;
    }

    @Nullable
    public final String getProductName() {
        return this.productName;
    }

    public final int getProductStatus() {
        return this.productStatus;
    }

    @Nullable
    public final String getShowName() {
        if (!TextUtils.isEmpty(this.goal)) {
            return this.goal;
        }
        if (!TextUtils.isEmpty(this.productName)) {
            return this.productName;
        }
        return this.durationDay + "-fixed-day";
    }

    public int hashCode() {
        Long l5 = this.productId;
        int iHashCode = (l5 == null ? 0 : l5.hashCode()) * 31;
        String str = this.productIcon;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.productName;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.introduction;
        int iB = q0.b((Float.hashCode(this.annualizedIncomeRatio) + ((iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31)) * 31, 31, this.durationDay);
        String str4 = this.goal;
        int iB2 = u.b(this.productStatus, (iB + (str4 == null ? 0 : str4.hashCode())) * 31, 31);
        Long l6 = this.amount;
        int iHashCode4 = (iB2 + (l6 == null ? 0 : l6.hashCode())) * 31;
        String str5 = this.newUserIcon;
        int iHashCode5 = (iHashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.oldUserIcon;
        int iHashCode6 = (iHashCode5 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.buyPageIcon;
        int iHashCode7 = (iHashCode6 + (str7 == null ? 0 : str7.hashCode())) * 31;
        String str8 = this.androidUrl;
        return Long.hashCode(this.maxDurationDay) + ((iHashCode7 + (str8 != null ? str8.hashCode() : 0)) * 31);
    }

    public final void setIntroduction(@Nullable String str) {
        this.introduction = str;
    }

    @NotNull
    public String toString() {
        Long l5 = this.productId;
        String str = this.productIcon;
        String str2 = this.productName;
        String str3 = this.introduction;
        float f10 = this.annualizedIncomeRatio;
        long j6 = this.durationDay;
        String str4 = this.goal;
        int i7 = this.productStatus;
        Long l6 = this.amount;
        String str5 = this.newUserIcon;
        String str6 = this.oldUserIcon;
        String str7 = this.buyPageIcon;
        String str8 = this.androidUrl;
        long j10 = this.maxDurationDay;
        StringBuilder sb2 = new StringBuilder("SavingProduct(productId=");
        sb2.append(l5);
        sb2.append(", productIcon=");
        sb2.append(str);
        sb2.append(", productName=");
        u.x(sb2, str2, ", introduction=", str3, ", annualizedIncomeRatio=");
        sb2.append(f10);
        sb2.append(", durationDay=");
        sb2.append(j6);
        sb2.append(", goal=");
        sb2.append(str4);
        sb2.append(", productStatus=");
        sb2.append(i7);
        sb2.append(", amount=");
        sb2.append(l6);
        sb2.append(", newUserIcon=");
        sb2.append(str5);
        u.x(sb2, ", oldUserIcon=", str6, ", buyPageIcon=", str7);
        u.w(sb2, ", androidUrl=", str8, ", maxDurationDay=");
        return q0.n(sb2, ")", j10);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NotNull Parcel parcel, int flags) {
        Intrinsics.checkNotNullParameter(parcel, "parcel");
        parcel.writeValue(this.productId);
        parcel.writeString(this.productIcon);
        parcel.writeString(this.productName);
        parcel.writeString(this.introduction);
        parcel.writeFloat(this.annualizedIncomeRatio);
        parcel.writeLong(this.durationDay);
        parcel.writeString(this.goal);
        parcel.writeInt(this.productStatus);
        parcel.writeValue(this.amount);
        parcel.writeString(this.newUserIcon);
        parcel.writeString(this.oldUserIcon);
        parcel.writeString(this.buyPageIcon);
        parcel.writeString(this.androidUrl);
        parcel.writeLong(this.maxDurationDay);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public SavingProduct(@NotNull Parcel parcel) {
        Intrinsics.checkNotNullParameter(parcel, "parcel");
        Class cls = Long.TYPE;
        Object value = parcel.readValue(cls.getClassLoader());
        Long l5 = value instanceof Long ? (Long) value : null;
        String string = parcel.readString();
        String string2 = parcel.readString();
        String string3 = parcel.readString();
        float f10 = parcel.readFloat();
        long j6 = parcel.readLong();
        String string4 = parcel.readString();
        int i7 = parcel.readInt();
        Object value2 = parcel.readValue(cls.getClassLoader());
        this(l5, string, string2, string3, f10, j6, string4, i7, value2 instanceof Long ? (Long) value2 : null, parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readLong());
    }
}
