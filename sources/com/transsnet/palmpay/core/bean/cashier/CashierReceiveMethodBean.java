package com.transsnet.palmpay.core.bean.cashier;

import C0.G;
import N8.q0;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.camera.video.u;
import com.facebook.react.fabric.mounting.mountitems.IntBufferBatchMountItem;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.google.firebase.crashlytics.internal.metadata.UserMetadata;
import com.google.firebase.remoteconfig.RemoteConfigConstants;
import com.microsoft.codepush.react.CodePushConstants;
import kotlin.Metadata;
import kotlin.jvm.JvmField;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.parcelize.Parcelize;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
@Parcelize
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b+\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0083\u0002\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000e\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u000e\u0012\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001e\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u001fJ\u0010\u0010 \u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u001fJ\u000b\u0010!\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u000b\u0010\"\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u000b\u0010#\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u000b\u0010$\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u000b\u0010%\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u000b\u0010&\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u000b\u0010'\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u0010\u0010(\u001a\u0004\u0018\u00010\u000eHÆ\u0003¢\u0006\u0002\u0010)J\u000b\u0010*\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u000b\u0010+\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u000b\u0010,\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u000b\u0010-\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u000b\u0010.\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u0010\u0010/\u001a\u0004\u0018\u00010\u000eHÆ\u0003¢\u0006\u0002\u0010)J\u000b\u00100\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u0010\u00101\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u001fJ\u000b\u00102\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u000b\u00103\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u000b\u00104\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u008a\u0002\u00105\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000e2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u000e2\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u0006HÆ\u0001¢\u0006\u0002\u00106J\u0006\u00107\u001a\u00020\u000eJ\u0013\u00108\u001a\u00020\u00032\b\u00109\u001a\u0004\u0018\u00010:HÖ\u0003J\t\u0010;\u001a\u00020\u000eHÖ\u0001J\t\u0010<\u001a\u00020\u0006HÖ\u0001J\u0016\u0010=\u001a\u00020>2\u0006\u0010?\u001a\u00020@2\u0006\u0010A\u001a\u00020\u000eR\u0016\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u0004\n\u0002\u0010\u001cR\u0016\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u0004\n\u0002\u0010\u001cR\u0014\u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\t\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\n\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u000b\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\f\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0016\u0010\r\u001a\u0004\u0018\u00010\u000e8\u0006@\u0006X\u0087\u000e¢\u0006\u0004\n\u0002\u0010\u001dR\u0014\u0010\u000f\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0010\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0011\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0012\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0013\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0016\u0010\u0014\u001a\u0004\u0018\u00010\u000e8\u0006@\u0006X\u0087\u000e¢\u0006\u0004\n\u0002\u0010\u001dR\u0014\u0010\u0015\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0016\u0010\u0016\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u0004\n\u0002\u0010\u001cR\u0014\u0010\u0017\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0018\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0019\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000¨\u0006B"}, d2 = {"Lcom/transsnet/palmpay/core/bean/cashier/CashierReceiveMethodBean;", "Landroid/os/Parcelable;", "defaultMethodFlag", "", "showInPreview", "receiveType", "", "receiveAccountType", "accountId", FirebaseAnalytics.Param.CURRENCY, "bankName", "bankUrl", "bankCode", "accountStatus", "", "cardNo", "cardType", RemoteConfigConstants.RequestFieldKey.COUNTRY_CODE, "memberId", "remark", "defaultPayFlag", "bankAccountNo", "enable", "tips", "acTips", "superscript", "<init>", "(Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "Ljava/lang/Boolean;", "Ljava/lang/Integer;", "component1", "()Ljava/lang/Boolean;", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "()Ljava/lang/Integer;", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "component18", "component19", "component20", "component21", "copy", "(Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/transsnet/palmpay/core/bean/cashier/CashierReceiveMethodBean;", "describeContents", "equals", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "lib_core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final /* data */ class CashierReceiveMethodBean implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<CashierReceiveMethodBean> CREATOR = new Creator();

    @JvmField
    @Nullable
    public String acTips;

    @JvmField
    @Nullable
    public String accountId;

    @JvmField
    @Nullable
    public Integer accountStatus;

    @JvmField
    @Nullable
    public String bankAccountNo;

    @JvmField
    @Nullable
    public String bankCode;

    @JvmField
    @Nullable
    public String bankName;

    @JvmField
    @Nullable
    public String bankUrl;

    @JvmField
    @Nullable
    public String cardNo;

    @JvmField
    @Nullable
    public String cardType;

    @JvmField
    @Nullable
    public String countryCode;

    @JvmField
    @Nullable
    public String currency;

    @JvmField
    @Nullable
    public Boolean defaultMethodFlag;

    @JvmField
    @Nullable
    public Integer defaultPayFlag;

    @JvmField
    @Nullable
    public Boolean enable;

    @JvmField
    @Nullable
    public String memberId;

    @JvmField
    @Nullable
    public String receiveAccountType;

    @JvmField
    @Nullable
    public String receiveType;

    @JvmField
    @Nullable
    public String remark;

    @JvmField
    @Nullable
    public Boolean showInPreview;

    @JvmField
    @Nullable
    public String superscript;

    @JvmField
    @Nullable
    public String tips;

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<CashierReceiveMethodBean> {
        /* JADX WARN: Can't rename method to resolve collision */
        /* JADX WARN: Multi-variable type inference failed */
        @Override // android.os.Parcelable.Creator
        public final CashierReceiveMethodBean createFromParcel(Parcel parcel) {
            Boolean boolValueOf;
            Boolean boolValueOf2;
            Integer num;
            Integer numValueOf;
            Integer num2;
            Integer numValueOf2;
            Object obj;
            Object objValueOf;
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            if (parcel.readInt() == 0) {
                boolValueOf = null;
            } else {
                boolValueOf = Boolean.valueOf(parcel.readInt() != 0);
            }
            if (parcel.readInt() == 0) {
                boolValueOf2 = null;
                num = null;
            } else {
                boolValueOf2 = Boolean.valueOf(parcel.readInt() != 0);
                num = null;
            }
            String string = parcel.readString();
            Boolean bool = boolValueOf2;
            String string2 = parcel.readString();
            Integer num3 = num;
            String string3 = parcel.readString();
            String string4 = parcel.readString();
            String string5 = parcel.readString();
            String string6 = parcel.readString();
            String string7 = parcel.readString();
            if (parcel.readInt() == 0) {
                numValueOf = num3;
                num2 = numValueOf;
            } else {
                numValueOf = Integer.valueOf(parcel.readInt());
                num2 = num3;
            }
            String string8 = parcel.readString();
            Integer num4 = numValueOf;
            String string9 = parcel.readString();
            Integer num5 = num2;
            String string10 = parcel.readString();
            String string11 = parcel.readString();
            String string12 = parcel.readString();
            if (parcel.readInt() == 0) {
                numValueOf2 = num5;
                obj = numValueOf2;
            } else {
                numValueOf2 = Integer.valueOf(parcel.readInt());
                obj = num5;
            }
            String string13 = parcel.readString();
            if (parcel.readInt() == 0) {
                objValueOf = obj;
            } else {
                objValueOf = Boolean.valueOf(parcel.readInt() != 0);
            }
            return new CashierReceiveMethodBean(boolValueOf, bool, string, string2, string3, string4, string5, string6, string7, num4, string8, string9, string10, string11, string12, numValueOf2, string13, objValueOf, parcel.readString(), parcel.readString(), parcel.readString());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final CashierReceiveMethodBean[] newArray(int i7) {
            return new CashierReceiveMethodBean[i7];
        }
    }

    public CashierReceiveMethodBean() {
        this(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 2097151, null);
    }

    public static /* synthetic */ CashierReceiveMethodBean copy$default(CashierReceiveMethodBean cashierReceiveMethodBean, Boolean bool, Boolean bool2, String str, String str2, String str3, String str4, String str5, String str6, String str7, Integer num, String str8, String str9, String str10, String str11, String str12, Integer num2, String str13, Boolean bool3, String str14, String str15, String str16, int i7, Object obj) {
        String str17;
        String str18;
        Boolean bool4 = (i7 & 1) != 0 ? cashierReceiveMethodBean.defaultMethodFlag : bool;
        Boolean bool5 = (i7 & 2) != 0 ? cashierReceiveMethodBean.showInPreview : bool2;
        String str19 = (i7 & 4) != 0 ? cashierReceiveMethodBean.receiveType : str;
        String str20 = (i7 & 8) != 0 ? cashierReceiveMethodBean.receiveAccountType : str2;
        String str21 = (i7 & 16) != 0 ? cashierReceiveMethodBean.accountId : str3;
        String str22 = (i7 & 32) != 0 ? cashierReceiveMethodBean.currency : str4;
        String str23 = (i7 & 64) != 0 ? cashierReceiveMethodBean.bankName : str5;
        String str24 = (i7 & 128) != 0 ? cashierReceiveMethodBean.bankUrl : str6;
        String str25 = (i7 & IntBufferBatchMountItem.INSTRUCTION_UPDATE_EVENT_EMITTER) != 0 ? cashierReceiveMethodBean.bankCode : str7;
        Integer num3 = (i7 & 512) != 0 ? cashierReceiveMethodBean.accountStatus : num;
        String str26 = (i7 & 1024) != 0 ? cashierReceiveMethodBean.cardNo : str8;
        String str27 = (i7 & 2048) != 0 ? cashierReceiveMethodBean.cardType : str9;
        String str28 = (i7 & 4096) != 0 ? cashierReceiveMethodBean.countryCode : str10;
        String str29 = (i7 & UserMetadata.MAX_INTERNAL_KEY_SIZE) != 0 ? cashierReceiveMethodBean.memberId : str11;
        Boolean bool6 = bool4;
        String str30 = (i7 & 16384) != 0 ? cashierReceiveMethodBean.remark : str12;
        Integer num4 = (i7 & 32768) != 0 ? cashierReceiveMethodBean.defaultPayFlag : num2;
        String str31 = (i7 & 65536) != 0 ? cashierReceiveMethodBean.bankAccountNo : str13;
        Boolean bool7 = (i7 & 131072) != 0 ? cashierReceiveMethodBean.enable : bool3;
        String str32 = (i7 & CodePushConstants.DOWNLOAD_BUFFER_SIZE) != 0 ? cashierReceiveMethodBean.tips : str14;
        String str33 = (i7 & 524288) != 0 ? cashierReceiveMethodBean.acTips : str15;
        if ((i7 & 1048576) != 0) {
            str18 = str33;
            str17 = cashierReceiveMethodBean.superscript;
        } else {
            str17 = str16;
            str18 = str33;
        }
        return cashierReceiveMethodBean.copy(bool6, bool5, str19, str20, str21, str22, str23, str24, str25, num3, str26, str27, str28, str29, str30, num4, str31, bool7, str32, str18, str17);
    }

    @Nullable
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final Boolean getDefaultMethodFlag() {
        return this.defaultMethodFlag;
    }

    @Nullable
    /* JADX INFO: renamed from: component10, reason: from getter */
    public final Integer getAccountStatus() {
        return this.accountStatus;
    }

    @Nullable
    /* JADX INFO: renamed from: component11, reason: from getter */
    public final String getCardNo() {
        return this.cardNo;
    }

    @Nullable
    /* JADX INFO: renamed from: component12, reason: from getter */
    public final String getCardType() {
        return this.cardType;
    }

    @Nullable
    /* JADX INFO: renamed from: component13, reason: from getter */
    public final String getCountryCode() {
        return this.countryCode;
    }

    @Nullable
    /* JADX INFO: renamed from: component14, reason: from getter */
    public final String getMemberId() {
        return this.memberId;
    }

    @Nullable
    /* JADX INFO: renamed from: component15, reason: from getter */
    public final String getRemark() {
        return this.remark;
    }

    @Nullable
    /* JADX INFO: renamed from: component16, reason: from getter */
    public final Integer getDefaultPayFlag() {
        return this.defaultPayFlag;
    }

    @Nullable
    /* JADX INFO: renamed from: component17, reason: from getter */
    public final String getBankAccountNo() {
        return this.bankAccountNo;
    }

    @Nullable
    /* JADX INFO: renamed from: component18, reason: from getter */
    public final Boolean getEnable() {
        return this.enable;
    }

    @Nullable
    /* JADX INFO: renamed from: component19, reason: from getter */
    public final String getTips() {
        return this.tips;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final Boolean getShowInPreview() {
        return this.showInPreview;
    }

    @Nullable
    /* JADX INFO: renamed from: component20, reason: from getter */
    public final String getAcTips() {
        return this.acTips;
    }

    @Nullable
    /* JADX INFO: renamed from: component21, reason: from getter */
    public final String getSuperscript() {
        return this.superscript;
    }

    @Nullable
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getReceiveType() {
        return this.receiveType;
    }

    @Nullable
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getReceiveAccountType() {
        return this.receiveAccountType;
    }

    @Nullable
    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getAccountId() {
        return this.accountId;
    }

    @Nullable
    /* JADX INFO: renamed from: component6, reason: from getter */
    public final String getCurrency() {
        return this.currency;
    }

    @Nullable
    /* JADX INFO: renamed from: component7, reason: from getter */
    public final String getBankName() {
        return this.bankName;
    }

    @Nullable
    /* JADX INFO: renamed from: component8, reason: from getter */
    public final String getBankUrl() {
        return this.bankUrl;
    }

    @Nullable
    /* JADX INFO: renamed from: component9, reason: from getter */
    public final String getBankCode() {
        return this.bankCode;
    }

    @NotNull
    public final CashierReceiveMethodBean copy(@Nullable Boolean defaultMethodFlag, @Nullable Boolean showInPreview, @Nullable String receiveType, @Nullable String receiveAccountType, @Nullable String accountId, @Nullable String currency, @Nullable String bankName, @Nullable String bankUrl, @Nullable String bankCode, @Nullable Integer accountStatus, @Nullable String cardNo, @Nullable String cardType, @Nullable String countryCode, @Nullable String memberId, @Nullable String remark, @Nullable Integer defaultPayFlag, @Nullable String bankAccountNo, @Nullable Boolean enable, @Nullable String tips, @Nullable String acTips, @Nullable String superscript) {
        return new CashierReceiveMethodBean(defaultMethodFlag, showInPreview, receiveType, receiveAccountType, accountId, currency, bankName, bankUrl, bankCode, accountStatus, cardNo, cardType, countryCode, memberId, remark, defaultPayFlag, bankAccountNo, enable, tips, acTips, superscript);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CashierReceiveMethodBean)) {
            return false;
        }
        CashierReceiveMethodBean cashierReceiveMethodBean = (CashierReceiveMethodBean) other;
        return Intrinsics.c(this.defaultMethodFlag, cashierReceiveMethodBean.defaultMethodFlag) && Intrinsics.c(this.showInPreview, cashierReceiveMethodBean.showInPreview) && Intrinsics.c(this.receiveType, cashierReceiveMethodBean.receiveType) && Intrinsics.c(this.receiveAccountType, cashierReceiveMethodBean.receiveAccountType) && Intrinsics.c(this.accountId, cashierReceiveMethodBean.accountId) && Intrinsics.c(this.currency, cashierReceiveMethodBean.currency) && Intrinsics.c(this.bankName, cashierReceiveMethodBean.bankName) && Intrinsics.c(this.bankUrl, cashierReceiveMethodBean.bankUrl) && Intrinsics.c(this.bankCode, cashierReceiveMethodBean.bankCode) && Intrinsics.c(this.accountStatus, cashierReceiveMethodBean.accountStatus) && Intrinsics.c(this.cardNo, cashierReceiveMethodBean.cardNo) && Intrinsics.c(this.cardType, cashierReceiveMethodBean.cardType) && Intrinsics.c(this.countryCode, cashierReceiveMethodBean.countryCode) && Intrinsics.c(this.memberId, cashierReceiveMethodBean.memberId) && Intrinsics.c(this.remark, cashierReceiveMethodBean.remark) && Intrinsics.c(this.defaultPayFlag, cashierReceiveMethodBean.defaultPayFlag) && Intrinsics.c(this.bankAccountNo, cashierReceiveMethodBean.bankAccountNo) && Intrinsics.c(this.enable, cashierReceiveMethodBean.enable) && Intrinsics.c(this.tips, cashierReceiveMethodBean.tips) && Intrinsics.c(this.acTips, cashierReceiveMethodBean.acTips) && Intrinsics.c(this.superscript, cashierReceiveMethodBean.superscript);
    }

    public int hashCode() {
        Boolean bool = this.defaultMethodFlag;
        int iHashCode = (bool == null ? 0 : bool.hashCode()) * 31;
        Boolean bool2 = this.showInPreview;
        int iHashCode2 = (iHashCode + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        String str = this.receiveType;
        int iHashCode3 = (iHashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.receiveAccountType;
        int iHashCode4 = (iHashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.accountId;
        int iHashCode5 = (iHashCode4 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.currency;
        int iHashCode6 = (iHashCode5 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.bankName;
        int iHashCode7 = (iHashCode6 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.bankUrl;
        int iHashCode8 = (iHashCode7 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.bankCode;
        int iHashCode9 = (iHashCode8 + (str7 == null ? 0 : str7.hashCode())) * 31;
        Integer num = this.accountStatus;
        int iHashCode10 = (iHashCode9 + (num == null ? 0 : num.hashCode())) * 31;
        String str8 = this.cardNo;
        int iHashCode11 = (iHashCode10 + (str8 == null ? 0 : str8.hashCode())) * 31;
        String str9 = this.cardType;
        int iHashCode12 = (iHashCode11 + (str9 == null ? 0 : str9.hashCode())) * 31;
        String str10 = this.countryCode;
        int iHashCode13 = (iHashCode12 + (str10 == null ? 0 : str10.hashCode())) * 31;
        String str11 = this.memberId;
        int iHashCode14 = (iHashCode13 + (str11 == null ? 0 : str11.hashCode())) * 31;
        String str12 = this.remark;
        int iHashCode15 = (iHashCode14 + (str12 == null ? 0 : str12.hashCode())) * 31;
        Integer num2 = this.defaultPayFlag;
        int iHashCode16 = (iHashCode15 + (num2 == null ? 0 : num2.hashCode())) * 31;
        String str13 = this.bankAccountNo;
        int iHashCode17 = (iHashCode16 + (str13 == null ? 0 : str13.hashCode())) * 31;
        Boolean bool3 = this.enable;
        int iHashCode18 = (iHashCode17 + (bool3 == null ? 0 : bool3.hashCode())) * 31;
        String str14 = this.tips;
        int iHashCode19 = (iHashCode18 + (str14 == null ? 0 : str14.hashCode())) * 31;
        String str15 = this.acTips;
        int iHashCode20 = (iHashCode19 + (str15 == null ? 0 : str15.hashCode())) * 31;
        String str16 = this.superscript;
        return iHashCode20 + (str16 != null ? str16.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        Boolean bool = this.defaultMethodFlag;
        Boolean bool2 = this.showInPreview;
        String str = this.receiveType;
        String str2 = this.receiveAccountType;
        String str3 = this.accountId;
        String str4 = this.currency;
        String str5 = this.bankName;
        String str6 = this.bankUrl;
        String str7 = this.bankCode;
        Integer num = this.accountStatus;
        String str8 = this.cardNo;
        String str9 = this.cardType;
        String str10 = this.countryCode;
        String str11 = this.memberId;
        String str12 = this.remark;
        Integer num2 = this.defaultPayFlag;
        String str13 = this.bankAccountNo;
        Boolean bool3 = this.enable;
        String str14 = this.tips;
        String str15 = this.acTips;
        String str16 = this.superscript;
        StringBuilder sb2 = new StringBuilder("CashierReceiveMethodBean(defaultMethodFlag=");
        sb2.append(bool);
        sb2.append(", showInPreview=");
        sb2.append(bool2);
        sb2.append(", receiveType=");
        u.x(sb2, str, ", receiveAccountType=", str2, ", accountId=");
        u.x(sb2, str3, ", currency=", str4, ", bankName=");
        u.x(sb2, str5, ", bankUrl=", str6, ", bankCode=");
        sb2.append(str7);
        sb2.append(", accountStatus=");
        sb2.append(num);
        sb2.append(", cardNo=");
        u.x(sb2, str8, ", cardType=", str9, ", countryCode=");
        u.x(sb2, str10, ", memberId=", str11, ", remark=");
        sb2.append(str12);
        sb2.append(", defaultPayFlag=");
        sb2.append(num2);
        sb2.append(", bankAccountNo=");
        sb2.append(str13);
        sb2.append(", enable=");
        sb2.append(bool3);
        sb2.append(", tips=");
        u.x(sb2, str14, ", acTips=", str15, ", superscript=");
        return G.r(sb2, str16, ")");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        Boolean bool = this.defaultMethodFlag;
        if (bool == null) {
            dest.writeInt(0);
        } else {
            q0.r(dest, 1, bool);
        }
        Boolean bool2 = this.showInPreview;
        if (bool2 == null) {
            dest.writeInt(0);
        } else {
            q0.r(dest, 1, bool2);
        }
        dest.writeString(this.receiveType);
        dest.writeString(this.receiveAccountType);
        dest.writeString(this.accountId);
        dest.writeString(this.currency);
        dest.writeString(this.bankName);
        dest.writeString(this.bankUrl);
        dest.writeString(this.bankCode);
        Integer num = this.accountStatus;
        if (num == null) {
            dest.writeInt(0);
        } else {
            q0.s(dest, 1, num);
        }
        dest.writeString(this.cardNo);
        dest.writeString(this.cardType);
        dest.writeString(this.countryCode);
        dest.writeString(this.memberId);
        dest.writeString(this.remark);
        Integer num2 = this.defaultPayFlag;
        if (num2 == null) {
            dest.writeInt(0);
        } else {
            q0.s(dest, 1, num2);
        }
        dest.writeString(this.bankAccountNo);
        Boolean bool3 = this.enable;
        if (bool3 == null) {
            dest.writeInt(0);
        } else {
            q0.r(dest, 1, bool3);
        }
        dest.writeString(this.tips);
        dest.writeString(this.acTips);
        dest.writeString(this.superscript);
    }

    public CashierReceiveMethodBean(@Nullable Boolean bool, @Nullable Boolean bool2, @Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable String str4, @Nullable String str5, @Nullable String str6, @Nullable String str7, @Nullable Integer num, @Nullable String str8, @Nullable String str9, @Nullable String str10, @Nullable String str11, @Nullable String str12, @Nullable Integer num2, @Nullable String str13, @Nullable Boolean bool3, @Nullable String str14, @Nullable String str15, @Nullable String str16) {
        this.defaultMethodFlag = bool;
        this.showInPreview = bool2;
        this.receiveType = str;
        this.receiveAccountType = str2;
        this.accountId = str3;
        this.currency = str4;
        this.bankName = str5;
        this.bankUrl = str6;
        this.bankCode = str7;
        this.accountStatus = num;
        this.cardNo = str8;
        this.cardType = str9;
        this.countryCode = str10;
        this.memberId = str11;
        this.remark = str12;
        this.defaultPayFlag = num2;
        this.bankAccountNo = str13;
        this.enable = bool3;
        this.tips = str14;
        this.acTips = str15;
        this.superscript = str16;
    }

    public /* synthetic */ CashierReceiveMethodBean(Boolean bool, Boolean bool2, String str, String str2, String str3, String str4, String str5, String str6, String str7, Integer num, String str8, String str9, String str10, String str11, String str12, Integer num2, String str13, Boolean bool3, String str14, String str15, String str16, int i7, DefaultConstructorMarker defaultConstructorMarker) {
        this((i7 & 1) != 0 ? Boolean.FALSE : bool, (i7 & 2) != 0 ? Boolean.FALSE : bool2, (i7 & 4) != 0 ? null : str, (i7 & 8) != 0 ? null : str2, (i7 & 16) != 0 ? null : str3, (i7 & 32) != 0 ? null : str4, (i7 & 64) != 0 ? null : str5, (i7 & 128) != 0 ? null : str6, (i7 & IntBufferBatchMountItem.INSTRUCTION_UPDATE_EVENT_EMITTER) != 0 ? null : str7, (i7 & 512) != 0 ? 0 : num, (i7 & 1024) != 0 ? null : str8, (i7 & 2048) != 0 ? null : str9, (i7 & 4096) != 0 ? null : str10, (i7 & UserMetadata.MAX_INTERNAL_KEY_SIZE) != 0 ? null : str11, (i7 & 16384) != 0 ? null : str12, (i7 & 32768) != 0 ? null : num2, (i7 & 65536) != 0 ? null : str13, (i7 & 131072) != 0 ? Boolean.TRUE : bool3, (i7 & CodePushConstants.DOWNLOAD_BUFFER_SIZE) != 0 ? null : str14, (i7 & 524288) != 0 ? null : str15, (i7 & 1048576) != 0 ? null : str16);
    }
}
