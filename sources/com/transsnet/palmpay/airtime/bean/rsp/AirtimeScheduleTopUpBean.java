package com.transsnet.palmpay.airtime.bean.rsp;

import N8.q0;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.camera.camera2.internal.F;
import androidx.camera.video.u;
import com.facebook.react.fabric.mounting.mountitems.IntBufferBatchMountItem;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.parcelize.Parcelize;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
@Parcelize
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000b\n\u0002\b4\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u008b\u0001\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\r\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000f\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\u0011\u0010\u0012J\u000b\u00104\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u00105\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u00106\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u00107\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u00108\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u00109\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010:\u001a\u0004\u0018\u00010\nHÆ\u0003¢\u0006\u0002\u0010\"J\u0010\u0010;\u001a\u0004\u0018\u00010\nHÆ\u0003¢\u0006\u0002\u0010\"J\u0010\u0010<\u001a\u0004\u0018\u00010\rHÆ\u0003¢\u0006\u0002\u0010)J\u0010\u0010=\u001a\u0004\u0018\u00010\u000fHÆ\u0003¢\u0006\u0002\u0010.J\u0010\u0010>\u001a\u0004\u0018\u00010\rHÆ\u0003¢\u0006\u0002\u0010)J\u0092\u0001\u0010?\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\r2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\rHÆ\u0001¢\u0006\u0002\u0010@J\u0006\u0010A\u001a\u00020\nJ\u0013\u0010B\u001a\u00020\u000f2\b\u0010C\u001a\u0004\u0018\u00010DHÖ\u0003J\t\u0010E\u001a\u00020\nHÖ\u0001J\t\u0010F\u001a\u00020\u0003HÖ\u0001J\u0016\u0010G\u001a\u00020H2\u0006\u0010I\u001a\u00020J2\u0006\u0010K\u001a\u00020\nR\u001c\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u0014\"\u0004\b\u0018\u0010\u0016R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u0014\"\u0004\b\u001a\u0010\u0016R\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001b\u0010\u0014\"\u0004\b\u001c\u0010\u0016R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001d\u0010\u0014\"\u0004\b\u001e\u0010\u0016R\u001c\u0010\b\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001f\u0010\u0014\"\u0004\b \u0010\u0016R\u001e\u0010\t\u001a\u0004\u0018\u00010\nX\u0086\u000e¢\u0006\u0010\n\u0002\u0010%\u001a\u0004\b!\u0010\"\"\u0004\b#\u0010$R\u001e\u0010\u000b\u001a\u0004\u0018\u00010\nX\u0086\u000e¢\u0006\u0010\n\u0002\u0010%\u001a\u0004\b&\u0010\"\"\u0004\b'\u0010$R\u001e\u0010\f\u001a\u0004\u0018\u00010\rX\u0086\u000e¢\u0006\u0010\n\u0002\u0010,\u001a\u0004\b(\u0010)\"\u0004\b*\u0010+R\u001e\u0010\u000e\u001a\u0004\u0018\u00010\u000fX\u0086\u000e¢\u0006\u0010\n\u0002\u00101\u001a\u0004\b-\u0010.\"\u0004\b/\u00100R\u001e\u0010\u0010\u001a\u0004\u0018\u00010\rX\u0086\u000e¢\u0006\u0010\n\u0002\u0010,\u001a\u0004\b2\u0010)\"\u0004\b3\u0010+¨\u0006L"}, d2 = {"Lcom/transsnet/palmpay/airtime/bean/rsp/AirtimeScheduleTopUpBean;", "Landroid/os/Parcelable;", "phone", "", "billerId", "billerName", "billerLogo", "itemId", "timeText", "timeType", "", "timeValue", "amount", "", "active", "", "discountAmount", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Long;Ljava/lang/Boolean;Ljava/lang/Long;)V", "getPhone", "()Ljava/lang/String;", "setPhone", "(Ljava/lang/String;)V", "getBillerId", "setBillerId", "getBillerName", "setBillerName", "getBillerLogo", "setBillerLogo", "getItemId", "setItemId", "getTimeText", "setTimeText", "getTimeType", "()Ljava/lang/Integer;", "setTimeType", "(Ljava/lang/Integer;)V", "Ljava/lang/Integer;", "getTimeValue", "setTimeValue", "getAmount", "()Ljava/lang/Long;", "setAmount", "(Ljava/lang/Long;)V", "Ljava/lang/Long;", "getActive", "()Ljava/lang/Boolean;", "setActive", "(Ljava/lang/Boolean;)V", "Ljava/lang/Boolean;", "getDiscountAmount", "setDiscountAmount", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Long;Ljava/lang/Boolean;Ljava/lang/Long;)Lcom/transsnet/palmpay/airtime/bean/rsp/AirtimeScheduleTopUpBean;", "describeContents", "equals", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "module_biller_export_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final /* data */ class AirtimeScheduleTopUpBean implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<AirtimeScheduleTopUpBean> CREATOR = new Creator();

    @Nullable
    private Boolean active;

    @Nullable
    private Long amount;

    @Nullable
    private String billerId;

    @Nullable
    private String billerLogo;

    @Nullable
    private String billerName;

    @Nullable
    private Long discountAmount;

    @Nullable
    private String itemId;

    @Nullable
    private String phone;

    @Nullable
    private String timeText;

    @Nullable
    private Integer timeType;

    @Nullable
    private Integer timeValue;

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<AirtimeScheduleTopUpBean> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final AirtimeScheduleTopUpBean createFromParcel(Parcel parcel) {
            Boolean boolValueOf;
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            String string = parcel.readString();
            String string2 = parcel.readString();
            String string3 = parcel.readString();
            String string4 = parcel.readString();
            String string5 = parcel.readString();
            String string6 = parcel.readString();
            Integer numValueOf = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            Integer numValueOf2 = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            Long lValueOf = parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong());
            if (parcel.readInt() == 0) {
                boolValueOf = null;
            } else {
                boolValueOf = Boolean.valueOf(parcel.readInt() != 0);
            }
            return new AirtimeScheduleTopUpBean(string, string2, string3, string4, string5, string6, numValueOf, numValueOf2, lValueOf, boolValueOf, parcel.readInt() != 0 ? Long.valueOf(parcel.readLong()) : null);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final AirtimeScheduleTopUpBean[] newArray(int i7) {
            return new AirtimeScheduleTopUpBean[i7];
        }
    }

    public AirtimeScheduleTopUpBean() {
        this(null, null, null, null, null, null, null, null, null, null, null, 2047, null);
    }

    public static /* synthetic */ AirtimeScheduleTopUpBean copy$default(AirtimeScheduleTopUpBean airtimeScheduleTopUpBean, String str, String str2, String str3, String str4, String str5, String str6, Integer num, Integer num2, Long l5, Boolean bool, Long l6, int i7, Object obj) {
        if ((i7 & 1) != 0) {
            str = airtimeScheduleTopUpBean.phone;
        }
        if ((i7 & 2) != 0) {
            str2 = airtimeScheduleTopUpBean.billerId;
        }
        if ((i7 & 4) != 0) {
            str3 = airtimeScheduleTopUpBean.billerName;
        }
        if ((i7 & 8) != 0) {
            str4 = airtimeScheduleTopUpBean.billerLogo;
        }
        if ((i7 & 16) != 0) {
            str5 = airtimeScheduleTopUpBean.itemId;
        }
        if ((i7 & 32) != 0) {
            str6 = airtimeScheduleTopUpBean.timeText;
        }
        if ((i7 & 64) != 0) {
            num = airtimeScheduleTopUpBean.timeType;
        }
        if ((i7 & 128) != 0) {
            num2 = airtimeScheduleTopUpBean.timeValue;
        }
        if ((i7 & IntBufferBatchMountItem.INSTRUCTION_UPDATE_EVENT_EMITTER) != 0) {
            l5 = airtimeScheduleTopUpBean.amount;
        }
        if ((i7 & 512) != 0) {
            bool = airtimeScheduleTopUpBean.active;
        }
        if ((i7 & 1024) != 0) {
            l6 = airtimeScheduleTopUpBean.discountAmount;
        }
        Boolean bool2 = bool;
        Long l8 = l6;
        Integer num3 = num2;
        Long l10 = l5;
        String str7 = str6;
        Integer num4 = num;
        String str8 = str5;
        String str9 = str3;
        return airtimeScheduleTopUpBean.copy(str, str2, str9, str4, str8, str7, num4, num3, l10, bool2, l8);
    }

    @Nullable
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getPhone() {
        return this.phone;
    }

    @Nullable
    /* JADX INFO: renamed from: component10, reason: from getter */
    public final Boolean getActive() {
        return this.active;
    }

    @Nullable
    /* JADX INFO: renamed from: component11, reason: from getter */
    public final Long getDiscountAmount() {
        return this.discountAmount;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getBillerId() {
        return this.billerId;
    }

    @Nullable
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getBillerName() {
        return this.billerName;
    }

    @Nullable
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getBillerLogo() {
        return this.billerLogo;
    }

    @Nullable
    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getItemId() {
        return this.itemId;
    }

    @Nullable
    /* JADX INFO: renamed from: component6, reason: from getter */
    public final String getTimeText() {
        return this.timeText;
    }

    @Nullable
    /* JADX INFO: renamed from: component7, reason: from getter */
    public final Integer getTimeType() {
        return this.timeType;
    }

    @Nullable
    /* JADX INFO: renamed from: component8, reason: from getter */
    public final Integer getTimeValue() {
        return this.timeValue;
    }

    @Nullable
    /* JADX INFO: renamed from: component9, reason: from getter */
    public final Long getAmount() {
        return this.amount;
    }

    @NotNull
    public final AirtimeScheduleTopUpBean copy(@Nullable String phone, @Nullable String billerId, @Nullable String billerName, @Nullable String billerLogo, @Nullable String itemId, @Nullable String timeText, @Nullable Integer timeType, @Nullable Integer timeValue, @Nullable Long amount, @Nullable Boolean active, @Nullable Long discountAmount) {
        return new AirtimeScheduleTopUpBean(phone, billerId, billerName, billerLogo, itemId, timeText, timeType, timeValue, amount, active, discountAmount);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AirtimeScheduleTopUpBean)) {
            return false;
        }
        AirtimeScheduleTopUpBean airtimeScheduleTopUpBean = (AirtimeScheduleTopUpBean) other;
        return Intrinsics.c(this.phone, airtimeScheduleTopUpBean.phone) && Intrinsics.c(this.billerId, airtimeScheduleTopUpBean.billerId) && Intrinsics.c(this.billerName, airtimeScheduleTopUpBean.billerName) && Intrinsics.c(this.billerLogo, airtimeScheduleTopUpBean.billerLogo) && Intrinsics.c(this.itemId, airtimeScheduleTopUpBean.itemId) && Intrinsics.c(this.timeText, airtimeScheduleTopUpBean.timeText) && Intrinsics.c(this.timeType, airtimeScheduleTopUpBean.timeType) && Intrinsics.c(this.timeValue, airtimeScheduleTopUpBean.timeValue) && Intrinsics.c(this.amount, airtimeScheduleTopUpBean.amount) && Intrinsics.c(this.active, airtimeScheduleTopUpBean.active) && Intrinsics.c(this.discountAmount, airtimeScheduleTopUpBean.discountAmount);
    }

    @Nullable
    public final Boolean getActive() {
        return this.active;
    }

    @Nullable
    public final Long getAmount() {
        return this.amount;
    }

    @Nullable
    public final String getBillerId() {
        return this.billerId;
    }

    @Nullable
    public final String getBillerLogo() {
        return this.billerLogo;
    }

    @Nullable
    public final String getBillerName() {
        return this.billerName;
    }

    @Nullable
    public final Long getDiscountAmount() {
        return this.discountAmount;
    }

    @Nullable
    public final String getItemId() {
        return this.itemId;
    }

    @Nullable
    public final String getPhone() {
        return this.phone;
    }

    @Nullable
    public final String getTimeText() {
        return this.timeText;
    }

    @Nullable
    public final Integer getTimeType() {
        return this.timeType;
    }

    @Nullable
    public final Integer getTimeValue() {
        return this.timeValue;
    }

    public int hashCode() {
        String str = this.phone;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.billerId;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.billerName;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.billerLogo;
        int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.itemId;
        int iHashCode5 = (iHashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.timeText;
        int iHashCode6 = (iHashCode5 + (str6 == null ? 0 : str6.hashCode())) * 31;
        Integer num = this.timeType;
        int iHashCode7 = (iHashCode6 + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.timeValue;
        int iHashCode8 = (iHashCode7 + (num2 == null ? 0 : num2.hashCode())) * 31;
        Long l5 = this.amount;
        int iHashCode9 = (iHashCode8 + (l5 == null ? 0 : l5.hashCode())) * 31;
        Boolean bool = this.active;
        int iHashCode10 = (iHashCode9 + (bool == null ? 0 : bool.hashCode())) * 31;
        Long l6 = this.discountAmount;
        return iHashCode10 + (l6 != null ? l6.hashCode() : 0);
    }

    public final void setActive(@Nullable Boolean bool) {
        this.active = bool;
    }

    public final void setAmount(@Nullable Long l5) {
        this.amount = l5;
    }

    public final void setBillerId(@Nullable String str) {
        this.billerId = str;
    }

    public final void setBillerLogo(@Nullable String str) {
        this.billerLogo = str;
    }

    public final void setBillerName(@Nullable String str) {
        this.billerName = str;
    }

    public final void setDiscountAmount(@Nullable Long l5) {
        this.discountAmount = l5;
    }

    public final void setItemId(@Nullable String str) {
        this.itemId = str;
    }

    public final void setPhone(@Nullable String str) {
        this.phone = str;
    }

    public final void setTimeText(@Nullable String str) {
        this.timeText = str;
    }

    public final void setTimeType(@Nullable Integer num) {
        this.timeType = num;
    }

    public final void setTimeValue(@Nullable Integer num) {
        this.timeValue = num;
    }

    @NotNull
    public String toString() {
        String str = this.phone;
        String str2 = this.billerId;
        String str3 = this.billerName;
        String str4 = this.billerLogo;
        String str5 = this.itemId;
        String str6 = this.timeText;
        Integer num = this.timeType;
        Integer num2 = this.timeValue;
        Long l5 = this.amount;
        Boolean bool = this.active;
        Long l6 = this.discountAmount;
        StringBuilder sbF = F.f("AirtimeScheduleTopUpBean(phone=", str, ", billerId=", str2, ", billerName=");
        u.x(sbF, str3, ", billerLogo=", str4, ", itemId=");
        u.x(sbF, str5, ", timeText=", str6, ", timeType=");
        sbF.append(num);
        sbF.append(", timeValue=");
        sbF.append(num2);
        sbF.append(", amount=");
        sbF.append(l5);
        sbF.append(", active=");
        sbF.append(bool);
        sbF.append(", discountAmount=");
        sbF.append(l6);
        sbF.append(")");
        return sbF.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.phone);
        dest.writeString(this.billerId);
        dest.writeString(this.billerName);
        dest.writeString(this.billerLogo);
        dest.writeString(this.itemId);
        dest.writeString(this.timeText);
        Integer num = this.timeType;
        if (num == null) {
            dest.writeInt(0);
        } else {
            q0.s(dest, 1, num);
        }
        Integer num2 = this.timeValue;
        if (num2 == null) {
            dest.writeInt(0);
        } else {
            q0.s(dest, 1, num2);
        }
        Long l5 = this.amount;
        if (l5 == null) {
            dest.writeInt(0);
        } else {
            q0.t(dest, 1, l5);
        }
        Boolean bool = this.active;
        if (bool == null) {
            dest.writeInt(0);
        } else {
            q0.r(dest, 1, bool);
        }
        Long l6 = this.discountAmount;
        if (l6 == null) {
            dest.writeInt(0);
        } else {
            q0.t(dest, 1, l6);
        }
    }

    public AirtimeScheduleTopUpBean(@Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable String str4, @Nullable String str5, @Nullable String str6, @Nullable Integer num, @Nullable Integer num2, @Nullable Long l5, @Nullable Boolean bool, @Nullable Long l6) {
        this.phone = str;
        this.billerId = str2;
        this.billerName = str3;
        this.billerLogo = str4;
        this.itemId = str5;
        this.timeText = str6;
        this.timeType = num;
        this.timeValue = num2;
        this.amount = l5;
        this.active = bool;
        this.discountAmount = l6;
    }

    public /* synthetic */ AirtimeScheduleTopUpBean(String str, String str2, String str3, String str4, String str5, String str6, Integer num, Integer num2, Long l5, Boolean bool, Long l6, int i7, DefaultConstructorMarker defaultConstructorMarker) {
        this((i7 & 1) != 0 ? null : str, (i7 & 2) != 0 ? null : str2, (i7 & 4) != 0 ? null : str3, (i7 & 8) != 0 ? null : str4, (i7 & 16) != 0 ? null : str5, (i7 & 32) != 0 ? null : str6, (i7 & 64) != 0 ? null : num, (i7 & 128) != 0 ? null : num2, (i7 & IntBufferBatchMountItem.INSTRUCTION_UPDATE_EVENT_EMITTER) != 0 ? null : l5, (i7 & 512) != 0 ? null : bool, (i7 & 1024) != 0 ? null : l6);
    }
}
