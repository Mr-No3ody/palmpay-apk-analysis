package com.flexibank.sdk.core.bean;

import android.os.Parcel;
import android.os.Parcelable;
import com.chad.library.adapter.base.entity.SectionEntity;
import com.flexibank.sdk.customview.interfac.FlexiBankSpinnerData;
import com.google.firebase.messaging.Constants;
import com.google.firebase.remoteconfig.RemoteConfigConstants;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.parcelize.Parcelize;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@Parcelize
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0012\n\u0002\u0010\b\n\u0002\b\u001e\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0007\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u0004:\u0001=R$\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR$\u0010\f\u001a\u0004\u0018\u00010\u00058\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\f\u0010\u0007\u001a\u0004\b\r\u0010\t\"\u0004\b\u000e\u0010\u000bR$\u0010\u000f\u001a\u0004\u0018\u00010\u00058\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000f\u0010\u0007\u001a\u0004\b\u0010\u0010\t\"\u0004\b\u0011\u0010\u000bR$\u0010\u0012\u001a\u0004\u0018\u00010\u00058\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0012\u0010\u0007\u001a\u0004\b\u0013\u0010\t\"\u0004\b\u0014\u0010\u000bR$\u0010\u0015\u001a\u0004\u0018\u00010\u00058\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0015\u0010\u0007\u001a\u0004\b\u0016\u0010\t\"\u0004\b\u0017\u0010\u000bR\"\u0010\u0019\u001a\u00020\u00188\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001c\"\u0004\b\u001d\u0010\u001eR\"\u0010\u001f\u001a\u00020\u00188\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001f\u0010\u001a\u001a\u0004\b \u0010\u001c\"\u0004\b!\u0010\u001eR$\u0010\"\u001a\u0004\u0018\u00010\u00058\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\"\u0010\u0007\u001a\u0004\b#\u0010\t\"\u0004\b$\u0010\u000bR$\u0010%\u001a\u0004\u0018\u00010\u00058\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b%\u0010\u0007\u001a\u0004\b&\u0010\t\"\u0004\b'\u0010\u000bR$\u0010(\u001a\u0004\u0018\u00010\u00058\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b(\u0010\u0007\u001a\u0004\b)\u0010\t\"\u0004\b*\u0010\u000bR$\u0010+\u001a\u0004\u0018\u00010\u00058\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b+\u0010\u0007\u001a\u0004\b,\u0010\t\"\u0004\b-\u0010\u000bR$\u0010.\u001a\u0004\u0018\u00010\u00058\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b.\u0010\u0007\u001a\u0004\b/\u0010\t\"\u0004\b0\u0010\u000bR$\u00101\u001a\u0004\u0018\u00010\u00058\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b1\u0010\u0007\u001a\u0004\b2\u0010\t\"\u0004\b3\u0010\u000bR$\u00104\u001a\u0004\u0018\u00010\u00058\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b4\u0010\u0007\u001a\u0004\b5\u0010\t\"\u0004\b6\u0010\u000bR\"\u00108\u001a\u0002078\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b8\u00109\u001a\u0004\b8\u0010:\"\u0004\b;\u0010<¨\u0006>"}, d2 = {"Lcom/flexibank/sdk/core/bean/FlexiBankBankInfo;", "Lcom/flexibank/sdk/customview/interfac/FlexiBankSpinnerData;", "Landroid/os/Parcelable;", "Lcom/chad/library/adapter/base/entity/SectionEntity;", "Lcom/flexibank/sdk/core/bean/FlexiBankBaseData;", "", "bankCode", "Ljava/lang/String;", "c", "()Ljava/lang/String;", "setBankCode", "(Ljava/lang/String;)V", "bankName", "d", "setBankName", "bankUrl", "e", "setBankUrl", "bgUrl", "getBgUrl", "setBgUrl", RemoteConfigConstants.RequestFieldKey.COUNTRY_CODE, "getCountryCode", "setCountryCode", "", "mmo", "I", "getMmo", "()I", "setMmo", "(I)V", "accountType", "getAccountType", "setAccountType", "indexType", "getIndexType", "setIndexType", "bankCardNo", "getBankCardNo", "setBankCardNo", "bankMark", "getBankMark", "setBankMark", "bankDarkMark", "getBankDarkMark", "setBankDarkMark", "relationshipPic", "getRelationshipPic", "setRelationshipPic", "relationshipDarkPic", "getRelationshipDarkPic", "setRelationshipDarkPic", Constants.ScionAnalytics.PARAM_LABEL, "getLabel", "setLabel", "", "isHeader", "Z", "()Z", "setHeader", "(Z)V", "a", "flexibank-sdk_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class FlexiBankBankInfo implements FlexiBankSpinnerData, Parcelable, SectionEntity, FlexiBankBaseData {

    @NotNull
    public static final Parcelable.Creator<FlexiBankBankInfo> CREATOR;
    private int accountType;

    @Nullable
    private String bankCardNo;

    @Nullable
    private String bankCode;

    @Nullable
    private String bankDarkMark;

    @Nullable
    private String bankMark;

    @Nullable
    private String bankName;

    @Nullable
    private String bankUrl;

    @Nullable
    private String bgUrl;

    @Nullable
    private String countryCode;

    @Nullable
    private String indexType;
    private boolean isHeader;

    @Nullable
    private String label;
    private int mmo;

    @Nullable
    private String relationshipDarkPic;

    @Nullable
    private String relationshipPic;

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006¨\u0006\b"}, d2 = {"Lcom/flexibank/sdk/core/bean/FlexiBankBankInfo$a;", "", "<init>", "()V", "", "ACCOUNT_TYPE_PALMPAY", "I", "ACCOUNT_TYPE_OTHER", "flexibank-sdk_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class b implements Parcelable.Creator<FlexiBankBankInfo> {
        @Override // android.os.Parcelable.Creator
        public final FlexiBankBankInfo createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new FlexiBankBankInfo(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt(), parcel.readInt(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() != 0);
        }

        @Override // android.os.Parcelable.Creator
        public final FlexiBankBankInfo[] newArray(int i7) {
            return new FlexiBankBankInfo[i7];
        }
    }

    static {
        new a(null);
        CREATOR = new b();
    }

    public FlexiBankBankInfo() {
        this(null, null, null, null, null, 0, 0, null, null, null, null, null, null, null, false);
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final String getBankCode() {
        return this.bankCode;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final String getBankName() {
        return this.bankName;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final String getBankUrl() {
        return this.bankUrl;
    }

    @Override // com.chad.library.adapter.base.entity.SectionEntity, com.chad.library.adapter.base.entity.MultiItemEntity
    public final int getItemType() {
        return this.isHeader ? -99 : -100;
    }

    @Override // com.flexibank.sdk.customview.interfac.FlexiBankSpinnerData
    public final String getName() {
        return this.bankName;
    }

    @Override // com.chad.library.adapter.base.entity.SectionEntity
    /* JADX INFO: renamed from: isHeader, reason: from getter */
    public final boolean getIsHeader() {
        return this.isHeader;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i7) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.bankCode);
        dest.writeString(this.bankName);
        dest.writeString(this.bankUrl);
        dest.writeString(this.bgUrl);
        dest.writeString(this.countryCode);
        dest.writeInt(this.mmo);
        dest.writeInt(this.accountType);
        dest.writeString(this.indexType);
        dest.writeString(this.bankCardNo);
        dest.writeString(this.bankMark);
        dest.writeString(this.bankDarkMark);
        dest.writeString(this.relationshipPic);
        dest.writeString(this.relationshipDarkPic);
        dest.writeString(this.label);
        dest.writeInt(this.isHeader ? 1 : 0);
    }

    public FlexiBankBankInfo(String str, String str2, String str3, String str4, String str5, int i7, int i10, String str6, String str7, String str8, String str9, String str10, String str11, String str12, boolean z3) {
        this.bankCode = str;
        this.bankName = str2;
        this.bankUrl = str3;
        this.bgUrl = str4;
        this.countryCode = str5;
        this.mmo = i7;
        this.accountType = i10;
        this.indexType = str6;
        this.bankCardNo = str7;
        this.bankMark = str8;
        this.bankDarkMark = str9;
        this.relationshipPic = str10;
        this.relationshipDarkPic = str11;
        this.label = str12;
        this.isHeader = z3;
    }
}
