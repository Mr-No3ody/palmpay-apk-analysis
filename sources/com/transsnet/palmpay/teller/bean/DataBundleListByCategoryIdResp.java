package com.transsnet.palmpay.teller.bean;

import N8.q0;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.camera.camera2.internal.F;
import androidx.camera.video.u;
import com.facebook.react.fabric.mounting.mountitems.IntBufferBatchMountItem;
import com.facebook.react.uimanager.ViewProps;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.google.firebase.crashlytics.internal.metadata.UserMetadata;
import com.google.firebase.messaging.Constants;
import com.transsnet.palmpay.core.bean.CommonResult;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.parcelize.Parcelize;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001:\u0002\u0015\u0016B#\u0012\u001a\u0010\u0002\u001a\u0016\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003j\n\u0012\u0004\u0012\u00020\u0004\u0018\u0001`\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u001d\u0010\u000b\u001a\u0016\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003j\n\u0012\u0004\u0012\u00020\u0004\u0018\u0001`\u0005HÆ\u0003J'\u0010\f\u001a\u00020\u00002\u001c\b\u0002\u0010\u0002\u001a\u0016\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003j\n\u0012\u0004\u0012\u00020\u0004\u0018\u0001`\u0005HÆ\u0001J\u0013\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010HÖ\u0003J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001R.\u0010\u0002\u001a\u0016\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003j\n\u0012\u0004\u0012\u00020\u0004\u0018\u0001`\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u0007¨\u0006\u0017"}, d2 = {"Lcom/transsnet/palmpay/teller/bean/DataBundleListByCategoryIdResp;", "Lcom/transsnet/palmpay/core/bean/CommonResult;", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "Ljava/util/ArrayList;", "Lcom/transsnet/palmpay/teller/bean/DataBundleListByCategoryIdResp$DataBundleWalletCategoryBean;", "Lkotlin/collections/ArrayList;", "<init>", "(Ljava/util/ArrayList;)V", "getData", "()Ljava/util/ArrayList;", "setData", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "DataBundleWalletCategoryBean", "DataBundleWalletItemChildBean", "module_biller_export_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final /* data */ class DataBundleListByCategoryIdResp extends CommonResult {

    @Nullable
    private ArrayList<DataBundleWalletCategoryBean> data;

    @Parcelize
    @Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b@\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B¹\u0001\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0012\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0014¢\u0006\u0004\b\u0015\u0010\u0016J\t\u0010A\u001a\u00020\u0003HÆ\u0003J\u000b\u0010B\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010C\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010D\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010E\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010F\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010G\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u0010\u0010H\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010*J\u000b\u0010I\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010J\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010K\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010L\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010M\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u0010\u0010N\u001a\u0004\u0018\u00010\u0012HÆ\u0003¢\u0006\u0002\u00109J\u0010\u0010O\u001a\u0004\u0018\u00010\u0014HÆ\u0003¢\u0006\u0002\u0010=JÀ\u0001\u0010P\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00122\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0014HÆ\u0001¢\u0006\u0002\u0010QJ\u0006\u0010R\u001a\u00020\u0012J\u0013\u0010S\u001a\u00020\u00142\b\u0010T\u001a\u0004\u0018\u00010UHÖ\u0003J\t\u0010V\u001a\u00020\u0012HÖ\u0001J\t\u0010W\u001a\u00020\u0005HÖ\u0001J\u0016\u0010X\u001a\u00020Y2\u0006\u0010Z\u001a\u00020[2\u0006\u0010\\\u001a\u00020\u0012R\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001aR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001b\u0010\u001c\"\u0004\b\u001d\u0010\u001eR\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001f\u0010\u001c\"\u0004\b \u0010\u001eR\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b!\u0010\u001c\"\u0004\b\"\u0010\u001eR\u001c\u0010\b\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b#\u0010\u001c\"\u0004\b$\u0010\u001eR\u001c\u0010\t\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b%\u0010\u001c\"\u0004\b&\u0010\u001eR\u001c\u0010\n\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b'\u0010\u001c\"\u0004\b(\u0010\u001eR\u001e\u0010\u000b\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u0010\n\u0002\u0010-\u001a\u0004\b)\u0010*\"\u0004\b+\u0010,R\u001c\u0010\f\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b.\u0010\u001c\"\u0004\b/\u0010\u001eR\u001c\u0010\r\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b0\u0010\u001c\"\u0004\b1\u0010\u001eR\u001c\u0010\u000e\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b2\u0010\u001c\"\u0004\b3\u0010\u001eR\u001c\u0010\u000f\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b4\u0010\u001c\"\u0004\b5\u0010\u001eR\u001c\u0010\u0010\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b6\u0010\u001c\"\u0004\b7\u0010\u001eR\u001e\u0010\u0011\u001a\u0004\u0018\u00010\u0012X\u0086\u000e¢\u0006\u0010\n\u0002\u0010<\u001a\u0004\b8\u00109\"\u0004\b:\u0010;R\u001e\u0010\u0013\u001a\u0004\u0018\u00010\u0014X\u0086\u000e¢\u0006\u0010\n\u0002\u0010@\u001a\u0004\b\u0013\u0010=\"\u0004\b>\u0010?¨\u0006]"}, d2 = {"Lcom/transsnet/palmpay/teller/bean/DataBundleListByCategoryIdResp$DataBundleWalletItemChildBean;", "Lcom/transsnet/palmpay/teller/bean/BaseDataBundleItemBean;", FirebaseAnalytics.Param.PRICE, "", ViewProps.COLOR, "", "image", "cornerMark", "itemId", "itemName", "remark", "deductionAmount", "description", "volume", "volumeUnit", "validityExtDesc", "validity", "validityDay", "", "isBuyAgain", "", "<init>", "(JLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Boolean;)V", "getPrice", "()J", "setPrice", "(J)V", "getColor", "()Ljava/lang/String;", "setColor", "(Ljava/lang/String;)V", "getImage", "setImage", "getCornerMark", "setCornerMark", "getItemId", "setItemId", "getItemName", "setItemName", "getRemark", "setRemark", "getDeductionAmount", "()Ljava/lang/Long;", "setDeductionAmount", "(Ljava/lang/Long;)V", "Ljava/lang/Long;", "getDescription", "setDescription", "getVolume", "setVolume", "getVolumeUnit", "setVolumeUnit", "getValidityExtDesc", "setValidityExtDesc", "getValidity", "setValidity", "getValidityDay", "()Ljava/lang/Integer;", "setValidityDay", "(Ljava/lang/Integer;)V", "Ljava/lang/Integer;", "()Ljava/lang/Boolean;", "setBuyAgain", "(Ljava/lang/Boolean;)V", "Ljava/lang/Boolean;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "component13", "component14", "component15", "copy", "(JLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Boolean;)Lcom/transsnet/palmpay/teller/bean/DataBundleListByCategoryIdResp$DataBundleWalletItemChildBean;", "describeContents", "equals", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "module_biller_export_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class DataBundleWalletItemChildBean extends BaseDataBundleItemBean {

        @NotNull
        public static final Parcelable.Creator<DataBundleWalletItemChildBean> CREATOR = new Creator();

        @Nullable
        private String color;

        @Nullable
        private String cornerMark;

        @Nullable
        private Long deductionAmount;

        @Nullable
        private String description;

        @Nullable
        private String image;

        @Nullable
        private Boolean isBuyAgain;

        @Nullable
        private String itemId;

        @Nullable
        private String itemName;
        private long price;

        @Nullable
        private String remark;

        @Nullable
        private String validity;

        @Nullable
        private Integer validityDay;

        @Nullable
        private String validityExtDesc;

        @Nullable
        private String volume;

        @Nullable
        private String volumeUnit;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<DataBundleWalletItemChildBean> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final DataBundleWalletItemChildBean createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                long j6 = parcel.readLong();
                String string = parcel.readString();
                String string2 = parcel.readString();
                String string3 = parcel.readString();
                String string4 = parcel.readString();
                String string5 = parcel.readString();
                String string6 = parcel.readString();
                Boolean boolValueOf = null;
                Long lValueOf = parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong());
                String string7 = parcel.readString();
                String string8 = parcel.readString();
                String string9 = parcel.readString();
                String string10 = parcel.readString();
                String string11 = parcel.readString();
                Integer numValueOf = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
                if (parcel.readInt() != 0) {
                    boolValueOf = Boolean.valueOf(parcel.readInt() != 0);
                }
                return new DataBundleWalletItemChildBean(j6, string, string2, string3, string4, string5, string6, lValueOf, string7, string8, string9, string10, string11, numValueOf, boolValueOf);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final DataBundleWalletItemChildBean[] newArray(int i7) {
                return new DataBundleWalletItemChildBean[i7];
            }
        }

        public DataBundleWalletItemChildBean() {
            this(0L, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 32767, null);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final long getPrice() {
            return this.price;
        }

        @Nullable
        /* JADX INFO: renamed from: component10, reason: from getter */
        public final String getVolume() {
            return this.volume;
        }

        @Nullable
        /* JADX INFO: renamed from: component11, reason: from getter */
        public final String getVolumeUnit() {
            return this.volumeUnit;
        }

        @Nullable
        /* JADX INFO: renamed from: component12, reason: from getter */
        public final String getValidityExtDesc() {
            return this.validityExtDesc;
        }

        @Nullable
        /* JADX INFO: renamed from: component13, reason: from getter */
        public final String getValidity() {
            return this.validity;
        }

        @Nullable
        /* JADX INFO: renamed from: component14, reason: from getter */
        public final Integer getValidityDay() {
            return this.validityDay;
        }

        @Nullable
        /* JADX INFO: renamed from: component15, reason: from getter */
        public final Boolean getIsBuyAgain() {
            return this.isBuyAgain;
        }

        @Nullable
        /* JADX INFO: renamed from: component2, reason: from getter */
        public final String getColor() {
            return this.color;
        }

        @Nullable
        /* JADX INFO: renamed from: component3, reason: from getter */
        public final String getImage() {
            return this.image;
        }

        @Nullable
        /* JADX INFO: renamed from: component4, reason: from getter */
        public final String getCornerMark() {
            return this.cornerMark;
        }

        @Nullable
        /* JADX INFO: renamed from: component5, reason: from getter */
        public final String getItemId() {
            return this.itemId;
        }

        @Nullable
        /* JADX INFO: renamed from: component6, reason: from getter */
        public final String getItemName() {
            return this.itemName;
        }

        @Nullable
        /* JADX INFO: renamed from: component7, reason: from getter */
        public final String getRemark() {
            return this.remark;
        }

        @Nullable
        /* JADX INFO: renamed from: component8, reason: from getter */
        public final Long getDeductionAmount() {
            return this.deductionAmount;
        }

        @Nullable
        /* JADX INFO: renamed from: component9, reason: from getter */
        public final String getDescription() {
            return this.description;
        }

        @NotNull
        public final DataBundleWalletItemChildBean copy(long price, @Nullable String color, @Nullable String image, @Nullable String cornerMark, @Nullable String itemId, @Nullable String itemName, @Nullable String remark, @Nullable Long deductionAmount, @Nullable String description, @Nullable String volume, @Nullable String volumeUnit, @Nullable String validityExtDesc, @Nullable String validity, @Nullable Integer validityDay, @Nullable Boolean isBuyAgain) {
            return new DataBundleWalletItemChildBean(price, color, image, cornerMark, itemId, itemName, remark, deductionAmount, description, volume, volumeUnit, validityExtDesc, validity, validityDay, isBuyAgain);
        }

        @Override // com.transsnet.palmpay.teller.bean.BaseDataBundleItemBean, android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof DataBundleWalletItemChildBean)) {
                return false;
            }
            DataBundleWalletItemChildBean dataBundleWalletItemChildBean = (DataBundleWalletItemChildBean) other;
            return this.price == dataBundleWalletItemChildBean.price && Intrinsics.c(this.color, dataBundleWalletItemChildBean.color) && Intrinsics.c(this.image, dataBundleWalletItemChildBean.image) && Intrinsics.c(this.cornerMark, dataBundleWalletItemChildBean.cornerMark) && Intrinsics.c(this.itemId, dataBundleWalletItemChildBean.itemId) && Intrinsics.c(this.itemName, dataBundleWalletItemChildBean.itemName) && Intrinsics.c(this.remark, dataBundleWalletItemChildBean.remark) && Intrinsics.c(this.deductionAmount, dataBundleWalletItemChildBean.deductionAmount) && Intrinsics.c(this.description, dataBundleWalletItemChildBean.description) && Intrinsics.c(this.volume, dataBundleWalletItemChildBean.volume) && Intrinsics.c(this.volumeUnit, dataBundleWalletItemChildBean.volumeUnit) && Intrinsics.c(this.validityExtDesc, dataBundleWalletItemChildBean.validityExtDesc) && Intrinsics.c(this.validity, dataBundleWalletItemChildBean.validity) && Intrinsics.c(this.validityDay, dataBundleWalletItemChildBean.validityDay) && Intrinsics.c(this.isBuyAgain, dataBundleWalletItemChildBean.isBuyAgain);
        }

        @Nullable
        public final String getColor() {
            return this.color;
        }

        @Nullable
        public final String getCornerMark() {
            return this.cornerMark;
        }

        @Nullable
        public final Long getDeductionAmount() {
            return this.deductionAmount;
        }

        @Nullable
        public final String getDescription() {
            return this.description;
        }

        @Nullable
        public final String getImage() {
            return this.image;
        }

        @Nullable
        public final String getItemId() {
            return this.itemId;
        }

        @Nullable
        public final String getItemName() {
            return this.itemName;
        }

        public final long getPrice() {
            return this.price;
        }

        @Nullable
        public final String getRemark() {
            return this.remark;
        }

        @Nullable
        public final String getValidity() {
            return this.validity;
        }

        @Nullable
        public final Integer getValidityDay() {
            return this.validityDay;
        }

        @Nullable
        public final String getValidityExtDesc() {
            return this.validityExtDesc;
        }

        @Nullable
        public final String getVolume() {
            return this.volume;
        }

        @Nullable
        public final String getVolumeUnit() {
            return this.volumeUnit;
        }

        public int hashCode() {
            int iHashCode = Long.hashCode(this.price) * 31;
            String str = this.color;
            int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.image;
            int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
            String str3 = this.cornerMark;
            int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
            String str4 = this.itemId;
            int iHashCode5 = (iHashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
            String str5 = this.itemName;
            int iHashCode6 = (iHashCode5 + (str5 == null ? 0 : str5.hashCode())) * 31;
            String str6 = this.remark;
            int iHashCode7 = (iHashCode6 + (str6 == null ? 0 : str6.hashCode())) * 31;
            Long l5 = this.deductionAmount;
            int iHashCode8 = (iHashCode7 + (l5 == null ? 0 : l5.hashCode())) * 31;
            String str7 = this.description;
            int iHashCode9 = (iHashCode8 + (str7 == null ? 0 : str7.hashCode())) * 31;
            String str8 = this.volume;
            int iHashCode10 = (iHashCode9 + (str8 == null ? 0 : str8.hashCode())) * 31;
            String str9 = this.volumeUnit;
            int iHashCode11 = (iHashCode10 + (str9 == null ? 0 : str9.hashCode())) * 31;
            String str10 = this.validityExtDesc;
            int iHashCode12 = (iHashCode11 + (str10 == null ? 0 : str10.hashCode())) * 31;
            String str11 = this.validity;
            int iHashCode13 = (iHashCode12 + (str11 == null ? 0 : str11.hashCode())) * 31;
            Integer num = this.validityDay;
            int iHashCode14 = (iHashCode13 + (num == null ? 0 : num.hashCode())) * 31;
            Boolean bool = this.isBuyAgain;
            return iHashCode14 + (bool != null ? bool.hashCode() : 0);
        }

        @Nullable
        public final Boolean isBuyAgain() {
            return this.isBuyAgain;
        }

        public final void setBuyAgain(@Nullable Boolean bool) {
            this.isBuyAgain = bool;
        }

        public final void setColor(@Nullable String str) {
            this.color = str;
        }

        public final void setCornerMark(@Nullable String str) {
            this.cornerMark = str;
        }

        public final void setDeductionAmount(@Nullable Long l5) {
            this.deductionAmount = l5;
        }

        public final void setDescription(@Nullable String str) {
            this.description = str;
        }

        public final void setImage(@Nullable String str) {
            this.image = str;
        }

        public final void setItemId(@Nullable String str) {
            this.itemId = str;
        }

        public final void setItemName(@Nullable String str) {
            this.itemName = str;
        }

        public final void setPrice(long j6) {
            this.price = j6;
        }

        public final void setRemark(@Nullable String str) {
            this.remark = str;
        }

        public final void setValidity(@Nullable String str) {
            this.validity = str;
        }

        public final void setValidityDay(@Nullable Integer num) {
            this.validityDay = num;
        }

        public final void setValidityExtDesc(@Nullable String str) {
            this.validityExtDesc = str;
        }

        public final void setVolume(@Nullable String str) {
            this.volume = str;
        }

        public final void setVolumeUnit(@Nullable String str) {
            this.volumeUnit = str;
        }

        @NotNull
        public String toString() {
            long j6 = this.price;
            String str = this.color;
            String str2 = this.image;
            String str3 = this.cornerMark;
            String str4 = this.itemId;
            String str5 = this.itemName;
            String str6 = this.remark;
            Long l5 = this.deductionAmount;
            String str7 = this.description;
            String str8 = this.volume;
            String str9 = this.volumeUnit;
            String str10 = this.validityExtDesc;
            String str11 = this.validity;
            Integer num = this.validityDay;
            Boolean bool = this.isBuyAgain;
            StringBuilder sb2 = new StringBuilder("DataBundleWalletItemChildBean(price=");
            sb2.append(j6);
            sb2.append(", color=");
            sb2.append(str);
            u.x(sb2, ", image=", str2, ", cornerMark=", str3);
            u.x(sb2, ", itemId=", str4, ", itemName=", str5);
            sb2.append(", remark=");
            sb2.append(str6);
            sb2.append(", deductionAmount=");
            sb2.append(l5);
            u.x(sb2, ", description=", str7, ", volume=", str8);
            u.x(sb2, ", volumeUnit=", str9, ", validityExtDesc=", str10);
            sb2.append(", validity=");
            sb2.append(str11);
            sb2.append(", validityDay=");
            sb2.append(num);
            sb2.append(", isBuyAgain=");
            sb2.append(bool);
            sb2.append(")");
            return sb2.toString();
        }

        @Override // com.transsnet.palmpay.teller.bean.BaseDataBundleItemBean, android.os.Parcelable
        public final void writeToParcel(@NotNull Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeLong(this.price);
            dest.writeString(this.color);
            dest.writeString(this.image);
            dest.writeString(this.cornerMark);
            dest.writeString(this.itemId);
            dest.writeString(this.itemName);
            dest.writeString(this.remark);
            Long l5 = this.deductionAmount;
            if (l5 == null) {
                dest.writeInt(0);
            } else {
                q0.t(dest, 1, l5);
            }
            dest.writeString(this.description);
            dest.writeString(this.volume);
            dest.writeString(this.volumeUnit);
            dest.writeString(this.validityExtDesc);
            dest.writeString(this.validity);
            Integer num = this.validityDay;
            if (num == null) {
                dest.writeInt(0);
            } else {
                q0.s(dest, 1, num);
            }
            Boolean bool = this.isBuyAgain;
            if (bool == null) {
                dest.writeInt(0);
            } else {
                q0.r(dest, 1, bool);
            }
        }

        public /* synthetic */ DataBundleWalletItemChildBean(long j6, String str, String str2, String str3, String str4, String str5, String str6, Long l5, String str7, String str8, String str9, String str10, String str11, Integer num, Boolean bool, int i7, DefaultConstructorMarker defaultConstructorMarker) {
            this((i7 & 1) != 0 ? 0L : j6, (i7 & 2) != 0 ? null : str, (i7 & 4) != 0 ? null : str2, (i7 & 8) != 0 ? null : str3, (i7 & 16) != 0 ? null : str4, (i7 & 32) != 0 ? null : str5, (i7 & 64) != 0 ? null : str6, (i7 & 128) != 0 ? null : l5, (i7 & IntBufferBatchMountItem.INSTRUCTION_UPDATE_EVENT_EMITTER) != 0 ? null : str7, (i7 & 512) != 0 ? null : str8, (i7 & 1024) != 0 ? null : str9, (i7 & 2048) != 0 ? null : str10, (i7 & 4096) != 0 ? "" : str11, (i7 & UserMetadata.MAX_INTERNAL_KEY_SIZE) != 0 ? null : num, (i7 & 16384) != 0 ? Boolean.FALSE : bool);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public DataBundleWalletItemChildBean(long j6, @Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable String str4, @Nullable String str5, @Nullable String str6, @Nullable Long l5, @Nullable String str7, @Nullable String str8, @Nullable String str9, @Nullable String str10, @Nullable String str11, @Nullable Integer num, @Nullable Boolean bool) {
            super(null, 1, 0 == true ? 1 : 0);
            this.price = j6;
            this.color = str;
            this.image = str2;
            this.cornerMark = str3;
            this.itemId = str4;
            this.itemName = str5;
            this.remark = str6;
            this.deductionAmount = l5;
            this.description = str7;
            this.volume = str8;
            this.volumeUnit = str9;
            this.validityExtDesc = str10;
            this.validity = str11;
            this.validityDay = num;
            this.isBuyAgain = bool;
        }
    }

    public DataBundleListByCategoryIdResp(@Nullable ArrayList<DataBundleWalletCategoryBean> arrayList) {
        this.data = arrayList;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ DataBundleListByCategoryIdResp copy$default(DataBundleListByCategoryIdResp dataBundleListByCategoryIdResp, ArrayList arrayList, int i7, Object obj) {
        if ((i7 & 1) != 0) {
            arrayList = dataBundleListByCategoryIdResp.data;
        }
        return dataBundleListByCategoryIdResp.copy(arrayList);
    }

    @Nullable
    public final ArrayList<DataBundleWalletCategoryBean> component1() {
        return this.data;
    }

    @NotNull
    public final DataBundleListByCategoryIdResp copy(@Nullable ArrayList<DataBundleWalletCategoryBean> data) {
        return new DataBundleListByCategoryIdResp(data);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof DataBundleListByCategoryIdResp) && Intrinsics.c(this.data, ((DataBundleListByCategoryIdResp) other).data);
    }

    @Nullable
    public final ArrayList<DataBundleWalletCategoryBean> getData() {
        return this.data;
    }

    public int hashCode() {
        ArrayList<DataBundleWalletCategoryBean> arrayList = this.data;
        if (arrayList == null) {
            return 0;
        }
        return arrayList.hashCode();
    }

    public final void setData(@Nullable ArrayList<DataBundleWalletCategoryBean> arrayList) {
        this.data = arrayList;
    }

    @Override // com.transsnet.palmpay.core.bean.CommonResult
    @NotNull
    public String toString() {
        return "DataBundleListByCategoryIdResp(data=" + this.data + ")";
    }

    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u001b\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001BS\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\u001a\u0010\b\u001a\u0016\u0012\u0004\u0012\u00020\n\u0018\u00010\tj\n\u0012\u0004\u0012\u00020\n\u0018\u0001`\u000b¢\u0006\u0004\b\f\u0010\rJ\u000b\u0010\u001f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010 \u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010!\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0002\u0010\u0015J\u000b\u0010\"\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u001d\u0010#\u001a\u0016\u0012\u0004\u0012\u00020\n\u0018\u00010\tj\n\u0012\u0004\u0012\u00020\n\u0018\u0001`\u000bHÆ\u0003J\\\u0010$\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00032\u001c\b\u0002\u0010\b\u001a\u0016\u0012\u0004\u0012\u00020\n\u0018\u00010\tj\n\u0012\u0004\u0012\u00020\n\u0018\u0001`\u000bHÆ\u0001¢\u0006\u0002\u0010%J\u0013\u0010&\u001a\u00020'2\b\u0010(\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010)\u001a\u00020\u0006HÖ\u0001J\t\u0010*\u001a\u00020\u0003HÖ\u0001R\u001c\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u000f\"\u0004\b\u0013\u0010\u0011R\u001e\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u0086\u000e¢\u0006\u0010\n\u0002\u0010\u0018\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u000f\"\u0004\b\u001a\u0010\u0011R.\u0010\b\u001a\u0016\u0012\u0004\u0012\u00020\n\u0018\u00010\tj\n\u0012\u0004\u0012\u00020\n\u0018\u0001`\u000bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001b\u0010\u001c\"\u0004\b\u001d\u0010\u001e¨\u0006+"}, d2 = {"Lcom/transsnet/palmpay/teller/bean/DataBundleListByCategoryIdResp$DataBundleWalletCategoryBean;", "", "billerId", "", "billerName", "bundleCategoryId", "", "bundleCategoryName", "itemList", "Ljava/util/ArrayList;", "Lcom/transsnet/palmpay/teller/bean/DataBundleListByCategoryIdResp$DataBundleWalletItemChildBean;", "Lkotlin/collections/ArrayList;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/util/ArrayList;)V", "getBillerId", "()Ljava/lang/String;", "setBillerId", "(Ljava/lang/String;)V", "getBillerName", "setBillerName", "getBundleCategoryId", "()Ljava/lang/Integer;", "setBundleCategoryId", "(Ljava/lang/Integer;)V", "Ljava/lang/Integer;", "getBundleCategoryName", "setBundleCategoryName", "getItemList", "()Ljava/util/ArrayList;", "setItemList", "(Ljava/util/ArrayList;)V", "component1", "component2", "component3", "component4", "component5", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/util/ArrayList;)Lcom/transsnet/palmpay/teller/bean/DataBundleListByCategoryIdResp$DataBundleWalletCategoryBean;", "equals", "", "other", "hashCode", "toString", "module_biller_export_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class DataBundleWalletCategoryBean {

        @Nullable
        private String billerId;

        @Nullable
        private String billerName;

        @Nullable
        private Integer bundleCategoryId;

        @Nullable
        private String bundleCategoryName;

        @Nullable
        private ArrayList<DataBundleWalletItemChildBean> itemList;

        public DataBundleWalletCategoryBean(@Nullable String str, @Nullable String str2, @Nullable Integer num, @Nullable String str3, @Nullable ArrayList<DataBundleWalletItemChildBean> arrayList) {
            this.billerId = str;
            this.billerName = str2;
            this.bundleCategoryId = num;
            this.bundleCategoryName = str3;
            this.itemList = arrayList;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ DataBundleWalletCategoryBean copy$default(DataBundleWalletCategoryBean dataBundleWalletCategoryBean, String str, String str2, Integer num, String str3, ArrayList arrayList, int i7, Object obj) {
            if ((i7 & 1) != 0) {
                str = dataBundleWalletCategoryBean.billerId;
            }
            if ((i7 & 2) != 0) {
                str2 = dataBundleWalletCategoryBean.billerName;
            }
            if ((i7 & 4) != 0) {
                num = dataBundleWalletCategoryBean.bundleCategoryId;
            }
            if ((i7 & 8) != 0) {
                str3 = dataBundleWalletCategoryBean.bundleCategoryName;
            }
            if ((i7 & 16) != 0) {
                arrayList = dataBundleWalletCategoryBean.itemList;
            }
            ArrayList arrayList2 = arrayList;
            Integer num2 = num;
            return dataBundleWalletCategoryBean.copy(str, str2, num2, str3, arrayList2);
        }

        @Nullable
        /* JADX INFO: renamed from: component1, reason: from getter */
        public final String getBillerId() {
            return this.billerId;
        }

        @Nullable
        /* JADX INFO: renamed from: component2, reason: from getter */
        public final String getBillerName() {
            return this.billerName;
        }

        @Nullable
        /* JADX INFO: renamed from: component3, reason: from getter */
        public final Integer getBundleCategoryId() {
            return this.bundleCategoryId;
        }

        @Nullable
        /* JADX INFO: renamed from: component4, reason: from getter */
        public final String getBundleCategoryName() {
            return this.bundleCategoryName;
        }

        @Nullable
        public final ArrayList<DataBundleWalletItemChildBean> component5() {
            return this.itemList;
        }

        @NotNull
        public final DataBundleWalletCategoryBean copy(@Nullable String billerId, @Nullable String billerName, @Nullable Integer bundleCategoryId, @Nullable String bundleCategoryName, @Nullable ArrayList<DataBundleWalletItemChildBean> itemList) {
            return new DataBundleWalletCategoryBean(billerId, billerName, bundleCategoryId, bundleCategoryName, itemList);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof DataBundleWalletCategoryBean)) {
                return false;
            }
            DataBundleWalletCategoryBean dataBundleWalletCategoryBean = (DataBundleWalletCategoryBean) other;
            return Intrinsics.c(this.billerId, dataBundleWalletCategoryBean.billerId) && Intrinsics.c(this.billerName, dataBundleWalletCategoryBean.billerName) && Intrinsics.c(this.bundleCategoryId, dataBundleWalletCategoryBean.bundleCategoryId) && Intrinsics.c(this.bundleCategoryName, dataBundleWalletCategoryBean.bundleCategoryName) && Intrinsics.c(this.itemList, dataBundleWalletCategoryBean.itemList);
        }

        @Nullable
        public final String getBillerId() {
            return this.billerId;
        }

        @Nullable
        public final String getBillerName() {
            return this.billerName;
        }

        @Nullable
        public final Integer getBundleCategoryId() {
            return this.bundleCategoryId;
        }

        @Nullable
        public final String getBundleCategoryName() {
            return this.bundleCategoryName;
        }

        @Nullable
        public final ArrayList<DataBundleWalletItemChildBean> getItemList() {
            return this.itemList;
        }

        public int hashCode() {
            String str = this.billerId;
            int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
            String str2 = this.billerName;
            int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
            Integer num = this.bundleCategoryId;
            int iHashCode3 = (iHashCode2 + (num == null ? 0 : num.hashCode())) * 31;
            String str3 = this.bundleCategoryName;
            int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
            ArrayList<DataBundleWalletItemChildBean> arrayList = this.itemList;
            return iHashCode4 + (arrayList != null ? arrayList.hashCode() : 0);
        }

        public final void setBillerId(@Nullable String str) {
            this.billerId = str;
        }

        public final void setBillerName(@Nullable String str) {
            this.billerName = str;
        }

        public final void setBundleCategoryId(@Nullable Integer num) {
            this.bundleCategoryId = num;
        }

        public final void setBundleCategoryName(@Nullable String str) {
            this.bundleCategoryName = str;
        }

        public final void setItemList(@Nullable ArrayList<DataBundleWalletItemChildBean> arrayList) {
            this.itemList = arrayList;
        }

        @NotNull
        public String toString() {
            String str = this.billerId;
            String str2 = this.billerName;
            Integer num = this.bundleCategoryId;
            String str3 = this.bundleCategoryName;
            ArrayList<DataBundleWalletItemChildBean> arrayList = this.itemList;
            StringBuilder sbF = F.f("DataBundleWalletCategoryBean(billerId=", str, ", billerName=", str2, ", bundleCategoryId=");
            sbF.append(num);
            sbF.append(", bundleCategoryName=");
            sbF.append(str3);
            sbF.append(", itemList=");
            sbF.append(arrayList);
            sbF.append(")");
            return sbF.toString();
        }

        public /* synthetic */ DataBundleWalletCategoryBean(String str, String str2, Integer num, String str3, ArrayList arrayList, int i7, DefaultConstructorMarker defaultConstructorMarker) {
            this((i7 & 1) != 0 ? null : str, (i7 & 2) != 0 ? null : str2, (i7 & 4) != 0 ? null : num, (i7 & 8) != 0 ? null : str3, arrayList);
        }
    }
}
