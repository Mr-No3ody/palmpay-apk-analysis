package com.transsnet.palmpay.teller.bean.resp;

import N8.q0;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.camera.camera2.internal.F;
import androidx.camera.video.u;
import com.facebook.react.fabric.mounting.mountitems.IntBufferBatchMountItem;
import com.google.firebase.crashlytics.internal.metadata.UserMetadata;
import com.microsoft.codepush.react.CodePushConstants;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b9\n\u0002\u0010\u0002\n\u0002\b\u001c\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0086\b\u0018\u0000 y2\u00020\u0001:\u0001yB\u008f\u0002\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u0016\u0012\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u001c\u0010\u001dB\u0011\b\u0016\u0012\u0006\u0010\u001e\u001a\u00020\u001f¢\u0006\u0004\b\u001c\u0010 J\u0018\u0010X\u001a\u00020Y2\u0006\u0010\u001e\u001a\u00020\u001f2\u0006\u0010Z\u001a\u00020\tH\u0016J\b\u0010[\u001a\u00020\tH\u0016J\u000b\u0010\\\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010]\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010^\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010_\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010`\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010a\u001a\u0004\u0018\u00010\tHÆ\u0003¢\u0006\u0002\u0010.J\u0010\u0010b\u001a\u0004\u0018\u00010\u000bHÆ\u0003¢\u0006\u0002\u00103J\u0010\u0010c\u001a\u0004\u0018\u00010\u000bHÆ\u0003¢\u0006\u0002\u00103J\u0010\u0010d\u001a\u0004\u0018\u00010\u000bHÆ\u0003¢\u0006\u0002\u00103J\u0010\u0010e\u001a\u0004\u0018\u00010\tHÆ\u0003¢\u0006\u0002\u0010.J\u000b\u0010f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010g\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010h\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010i\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010j\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010k\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010l\u001a\u0004\u0018\u00010\u0016HÆ\u0003¢\u0006\u0002\u0010JJ\u000b\u0010m\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010n\u001a\u0004\u0018\u00010\u000bHÆ\u0003¢\u0006\u0002\u00103J\u0010\u0010o\u001a\u0004\u0018\u00010\u000bHÆ\u0003¢\u0006\u0002\u00103J\u000b\u0010p\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010q\u001a\u0004\u0018\u00010\tHÆ\u0003¢\u0006\u0002\u0010.J\u0096\u0002\u0010r\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u00162\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\tHÆ\u0001¢\u0006\u0002\u0010sJ\u0013\u0010t\u001a\u00020\u00162\b\u0010u\u001a\u0004\u0018\u00010vHÖ\u0003J\t\u0010w\u001a\u00020\tHÖ\u0001J\t\u0010x\u001a\u00020\u0003HÖ\u0001R\u001c\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b!\u0010\"\"\u0004\b#\u0010$R\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b%\u0010\"\"\u0004\b&\u0010$R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b'\u0010\"\"\u0004\b(\u0010$R\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b)\u0010\"\"\u0004\b*\u0010$R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b+\u0010\"\"\u0004\b,\u0010$R\u001e\u0010\b\u001a\u0004\u0018\u00010\tX\u0086\u000e¢\u0006\u0010\n\u0002\u00101\u001a\u0004\b-\u0010.\"\u0004\b/\u00100R\u001e\u0010\n\u001a\u0004\u0018\u00010\u000bX\u0086\u000e¢\u0006\u0010\n\u0002\u00106\u001a\u0004\b2\u00103\"\u0004\b4\u00105R\u001e\u0010\f\u001a\u0004\u0018\u00010\u000bX\u0086\u000e¢\u0006\u0010\n\u0002\u00106\u001a\u0004\b7\u00103\"\u0004\b8\u00105R\u001e\u0010\r\u001a\u0004\u0018\u00010\u000bX\u0086\u000e¢\u0006\u0010\n\u0002\u00106\u001a\u0004\b9\u00103\"\u0004\b:\u00105R\u001e\u0010\u000e\u001a\u0004\u0018\u00010\tX\u0086\u000e¢\u0006\u0010\n\u0002\u00101\u001a\u0004\b;\u0010.\"\u0004\b<\u00100R\u001c\u0010\u000f\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b=\u0010\"\"\u0004\b>\u0010$R\u001c\u0010\u0010\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b?\u0010\"\"\u0004\b@\u0010$R\u001c\u0010\u0011\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bA\u0010\"\"\u0004\bB\u0010$R\u001c\u0010\u0012\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bC\u0010\"\"\u0004\bD\u0010$R\u001c\u0010\u0013\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bE\u0010\"\"\u0004\bF\u0010$R\u001c\u0010\u0014\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bG\u0010\"\"\u0004\bH\u0010$R\u001e\u0010\u0015\u001a\u0004\u0018\u00010\u0016X\u0086\u000e¢\u0006\u0010\n\u0002\u0010M\u001a\u0004\bI\u0010J\"\u0004\bK\u0010LR\u001c\u0010\u0017\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bN\u0010\"\"\u0004\bO\u0010$R\u001e\u0010\u0018\u001a\u0004\u0018\u00010\u000bX\u0086\u000e¢\u0006\u0010\n\u0002\u00106\u001a\u0004\bP\u00103\"\u0004\bQ\u00105R\u001e\u0010\u0019\u001a\u0004\u0018\u00010\u000bX\u0086\u000e¢\u0006\u0010\n\u0002\u00106\u001a\u0004\bR\u00103\"\u0004\bS\u00105R\u001c\u0010\u001a\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bT\u0010\"\"\u0004\bU\u0010$R\u001e\u0010\u001b\u001a\u0004\u0018\u00010\tX\u0086\u000e¢\u0006\u0010\n\u0002\u00101\u001a\u0004\bV\u0010.\"\u0004\bW\u00100¨\u0006z"}, d2 = {"Lcom/transsnet/palmpay/teller/bean/resp/BillerHistoryItemBean;", "Landroid/os/Parcelable;", "orderNo", "", "categoryId", "billerName", "paymentItemName", "dataBundleItemName", "orderStatus", "", "businessAmount", "", "payAmount", "createTime", "businessType", "icon", "paymentItemId", "customerDisplayName", "billerId", "customerId", "network", "renewal", "", "pending1mCouponNo", "pending1mTime", "leftTime", "payId", "itemType", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/String;Ljava/lang/Integer;)V", "parcel", "Landroid/os/Parcel;", "(Landroid/os/Parcel;)V", "getOrderNo", "()Ljava/lang/String;", "setOrderNo", "(Ljava/lang/String;)V", "getCategoryId", "setCategoryId", "getBillerName", "setBillerName", "getPaymentItemName", "setPaymentItemName", "getDataBundleItemName", "setDataBundleItemName", "getOrderStatus", "()Ljava/lang/Integer;", "setOrderStatus", "(Ljava/lang/Integer;)V", "Ljava/lang/Integer;", "getBusinessAmount", "()Ljava/lang/Long;", "setBusinessAmount", "(Ljava/lang/Long;)V", "Ljava/lang/Long;", "getPayAmount", "setPayAmount", "getCreateTime", "setCreateTime", "getBusinessType", "setBusinessType", "getIcon", "setIcon", "getPaymentItemId", "setPaymentItemId", "getCustomerDisplayName", "setCustomerDisplayName", "getBillerId", "setBillerId", "getCustomerId", "setCustomerId", "getNetwork", "setNetwork", "getRenewal", "()Ljava/lang/Boolean;", "setRenewal", "(Ljava/lang/Boolean;)V", "Ljava/lang/Boolean;", "getPending1mCouponNo", "setPending1mCouponNo", "getPending1mTime", "setPending1mTime", "getLeftTime", "setLeftTime", "getPayId", "setPayId", "getItemType", "setItemType", "writeToParcel", "", "flags", "describeContents", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "component18", "component19", "component20", "component21", "component22", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/String;Ljava/lang/Integer;)Lcom/transsnet/palmpay/teller/bean/resp/BillerHistoryItemBean;", "equals", "other", "", "hashCode", "toString", "CREATOR", "module_biller_export_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final /* data */ class BillerHistoryItemBean implements Parcelable {

    /* JADX INFO: renamed from: CREATOR, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @Nullable
    private String billerId;

    @Nullable
    private String billerName;

    @Nullable
    private Long businessAmount;

    @Nullable
    private Integer businessType;

    @Nullable
    private String categoryId;

    @Nullable
    private Long createTime;

    @Nullable
    private String customerDisplayName;

    @Nullable
    private String customerId;

    @Nullable
    private String dataBundleItemName;

    @Nullable
    private String icon;

    @Nullable
    private Integer itemType;

    @Nullable
    private Long leftTime;

    @Nullable
    private String network;

    @Nullable
    private String orderNo;

    @Nullable
    private Integer orderStatus;

    @Nullable
    private Long payAmount;

    @Nullable
    private String payId;

    @Nullable
    private String paymentItemId;

    @Nullable
    private String paymentItemName;

    @Nullable
    private String pending1mCouponNo;

    @Nullable
    private Long pending1mTime;

    @Nullable
    private Boolean renewal;

    /* JADX INFO: renamed from: com.transsnet.palmpay.teller.bean.resp.BillerHistoryItemBean$CREATOR, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0007H\u0016J\u001d\u0010\b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH\u0016¢\u0006\u0002\u0010\f¨\u0006\r"}, d2 = {"Lcom/transsnet/palmpay/teller/bean/resp/BillerHistoryItemBean$CREATOR;", "Landroid/os/Parcelable$Creator;", "Lcom/transsnet/palmpay/teller/bean/resp/BillerHistoryItemBean;", "<init>", "()V", "createFromParcel", "parcel", "Landroid/os/Parcel;", "newArray", "", "size", "", "(I)[Lcom/transsnet/palmpay/teller/bean/resp/BillerHistoryItemBean;", "module_biller_export_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion implements Parcelable.Creator<BillerHistoryItemBean> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @NotNull
        public BillerHistoryItemBean createFromParcel(@NotNull Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new BillerHistoryItemBean(parcel);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @NotNull
        public BillerHistoryItemBean[] newArray(int size) {
            return new BillerHistoryItemBean[size];
        }
    }

    public BillerHistoryItemBean() {
        this(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 4194303, null);
    }

    public static /* synthetic */ BillerHistoryItemBean copy$default(BillerHistoryItemBean billerHistoryItemBean, String str, String str2, String str3, String str4, String str5, Integer num, Long l5, Long l6, Long l8, Integer num2, String str6, String str7, String str8, String str9, String str10, String str11, Boolean bool, String str12, Long l10, Long l11, String str13, Integer num3, int i7, Object obj) {
        Integer num4;
        String str14;
        String str15 = (i7 & 1) != 0 ? billerHistoryItemBean.orderNo : str;
        String str16 = (i7 & 2) != 0 ? billerHistoryItemBean.categoryId : str2;
        String str17 = (i7 & 4) != 0 ? billerHistoryItemBean.billerName : str3;
        String str18 = (i7 & 8) != 0 ? billerHistoryItemBean.paymentItemName : str4;
        String str19 = (i7 & 16) != 0 ? billerHistoryItemBean.dataBundleItemName : str5;
        Integer num5 = (i7 & 32) != 0 ? billerHistoryItemBean.orderStatus : num;
        Long l12 = (i7 & 64) != 0 ? billerHistoryItemBean.businessAmount : l5;
        Long l13 = (i7 & 128) != 0 ? billerHistoryItemBean.payAmount : l6;
        Long l14 = (i7 & IntBufferBatchMountItem.INSTRUCTION_UPDATE_EVENT_EMITTER) != 0 ? billerHistoryItemBean.createTime : l8;
        Integer num6 = (i7 & 512) != 0 ? billerHistoryItemBean.businessType : num2;
        String str20 = (i7 & 1024) != 0 ? billerHistoryItemBean.icon : str6;
        String str21 = (i7 & 2048) != 0 ? billerHistoryItemBean.paymentItemId : str7;
        String str22 = (i7 & 4096) != 0 ? billerHistoryItemBean.customerDisplayName : str8;
        String str23 = (i7 & UserMetadata.MAX_INTERNAL_KEY_SIZE) != 0 ? billerHistoryItemBean.billerId : str9;
        String str24 = str15;
        String str25 = (i7 & 16384) != 0 ? billerHistoryItemBean.customerId : str10;
        String str26 = (i7 & 32768) != 0 ? billerHistoryItemBean.network : str11;
        Boolean bool2 = (i7 & 65536) != 0 ? billerHistoryItemBean.renewal : bool;
        String str27 = (i7 & 131072) != 0 ? billerHistoryItemBean.pending1mCouponNo : str12;
        Long l15 = (i7 & CodePushConstants.DOWNLOAD_BUFFER_SIZE) != 0 ? billerHistoryItemBean.pending1mTime : l10;
        Long l16 = (i7 & 524288) != 0 ? billerHistoryItemBean.leftTime : l11;
        String str28 = (i7 & 1048576) != 0 ? billerHistoryItemBean.payId : str13;
        if ((i7 & 2097152) != 0) {
            str14 = str28;
            num4 = billerHistoryItemBean.itemType;
        } else {
            num4 = num3;
            str14 = str28;
        }
        return billerHistoryItemBean.copy(str24, str16, str17, str18, str19, num5, l12, l13, l14, num6, str20, str21, str22, str23, str25, str26, bool2, str27, l15, l16, str14, num4);
    }

    @Nullable
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getOrderNo() {
        return this.orderNo;
    }

    @Nullable
    /* JADX INFO: renamed from: component10, reason: from getter */
    public final Integer getBusinessType() {
        return this.businessType;
    }

    @Nullable
    /* JADX INFO: renamed from: component11, reason: from getter */
    public final String getIcon() {
        return this.icon;
    }

    @Nullable
    /* JADX INFO: renamed from: component12, reason: from getter */
    public final String getPaymentItemId() {
        return this.paymentItemId;
    }

    @Nullable
    /* JADX INFO: renamed from: component13, reason: from getter */
    public final String getCustomerDisplayName() {
        return this.customerDisplayName;
    }

    @Nullable
    /* JADX INFO: renamed from: component14, reason: from getter */
    public final String getBillerId() {
        return this.billerId;
    }

    @Nullable
    /* JADX INFO: renamed from: component15, reason: from getter */
    public final String getCustomerId() {
        return this.customerId;
    }

    @Nullable
    /* JADX INFO: renamed from: component16, reason: from getter */
    public final String getNetwork() {
        return this.network;
    }

    @Nullable
    /* JADX INFO: renamed from: component17, reason: from getter */
    public final Boolean getRenewal() {
        return this.renewal;
    }

    @Nullable
    /* JADX INFO: renamed from: component18, reason: from getter */
    public final String getPending1mCouponNo() {
        return this.pending1mCouponNo;
    }

    @Nullable
    /* JADX INFO: renamed from: component19, reason: from getter */
    public final Long getPending1mTime() {
        return this.pending1mTime;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getCategoryId() {
        return this.categoryId;
    }

    @Nullable
    /* JADX INFO: renamed from: component20, reason: from getter */
    public final Long getLeftTime() {
        return this.leftTime;
    }

    @Nullable
    /* JADX INFO: renamed from: component21, reason: from getter */
    public final String getPayId() {
        return this.payId;
    }

    @Nullable
    /* JADX INFO: renamed from: component22, reason: from getter */
    public final Integer getItemType() {
        return this.itemType;
    }

    @Nullable
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getBillerName() {
        return this.billerName;
    }

    @Nullable
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getPaymentItemName() {
        return this.paymentItemName;
    }

    @Nullable
    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getDataBundleItemName() {
        return this.dataBundleItemName;
    }

    @Nullable
    /* JADX INFO: renamed from: component6, reason: from getter */
    public final Integer getOrderStatus() {
        return this.orderStatus;
    }

    @Nullable
    /* JADX INFO: renamed from: component7, reason: from getter */
    public final Long getBusinessAmount() {
        return this.businessAmount;
    }

    @Nullable
    /* JADX INFO: renamed from: component8, reason: from getter */
    public final Long getPayAmount() {
        return this.payAmount;
    }

    @Nullable
    /* JADX INFO: renamed from: component9, reason: from getter */
    public final Long getCreateTime() {
        return this.createTime;
    }

    @NotNull
    public final BillerHistoryItemBean copy(@Nullable String orderNo, @Nullable String categoryId, @Nullable String billerName, @Nullable String paymentItemName, @Nullable String dataBundleItemName, @Nullable Integer orderStatus, @Nullable Long businessAmount, @Nullable Long payAmount, @Nullable Long createTime, @Nullable Integer businessType, @Nullable String icon, @Nullable String paymentItemId, @Nullable String customerDisplayName, @Nullable String billerId, @Nullable String customerId, @Nullable String network, @Nullable Boolean renewal, @Nullable String pending1mCouponNo, @Nullable Long pending1mTime, @Nullable Long leftTime, @Nullable String payId, @Nullable Integer itemType) {
        return new BillerHistoryItemBean(orderNo, categoryId, billerName, paymentItemName, dataBundleItemName, orderStatus, businessAmount, payAmount, createTime, businessType, icon, paymentItemId, customerDisplayName, billerId, customerId, network, renewal, pending1mCouponNo, pending1mTime, leftTime, payId, itemType);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof BillerHistoryItemBean)) {
            return false;
        }
        BillerHistoryItemBean billerHistoryItemBean = (BillerHistoryItemBean) other;
        return Intrinsics.c(this.orderNo, billerHistoryItemBean.orderNo) && Intrinsics.c(this.categoryId, billerHistoryItemBean.categoryId) && Intrinsics.c(this.billerName, billerHistoryItemBean.billerName) && Intrinsics.c(this.paymentItemName, billerHistoryItemBean.paymentItemName) && Intrinsics.c(this.dataBundleItemName, billerHistoryItemBean.dataBundleItemName) && Intrinsics.c(this.orderStatus, billerHistoryItemBean.orderStatus) && Intrinsics.c(this.businessAmount, billerHistoryItemBean.businessAmount) && Intrinsics.c(this.payAmount, billerHistoryItemBean.payAmount) && Intrinsics.c(this.createTime, billerHistoryItemBean.createTime) && Intrinsics.c(this.businessType, billerHistoryItemBean.businessType) && Intrinsics.c(this.icon, billerHistoryItemBean.icon) && Intrinsics.c(this.paymentItemId, billerHistoryItemBean.paymentItemId) && Intrinsics.c(this.customerDisplayName, billerHistoryItemBean.customerDisplayName) && Intrinsics.c(this.billerId, billerHistoryItemBean.billerId) && Intrinsics.c(this.customerId, billerHistoryItemBean.customerId) && Intrinsics.c(this.network, billerHistoryItemBean.network) && Intrinsics.c(this.renewal, billerHistoryItemBean.renewal) && Intrinsics.c(this.pending1mCouponNo, billerHistoryItemBean.pending1mCouponNo) && Intrinsics.c(this.pending1mTime, billerHistoryItemBean.pending1mTime) && Intrinsics.c(this.leftTime, billerHistoryItemBean.leftTime) && Intrinsics.c(this.payId, billerHistoryItemBean.payId) && Intrinsics.c(this.itemType, billerHistoryItemBean.itemType);
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
    public final Long getBusinessAmount() {
        return this.businessAmount;
    }

    @Nullable
    public final Integer getBusinessType() {
        return this.businessType;
    }

    @Nullable
    public final String getCategoryId() {
        return this.categoryId;
    }

    @Nullable
    public final Long getCreateTime() {
        return this.createTime;
    }

    @Nullable
    public final String getCustomerDisplayName() {
        return this.customerDisplayName;
    }

    @Nullable
    public final String getCustomerId() {
        return this.customerId;
    }

    @Nullable
    public final String getDataBundleItemName() {
        return this.dataBundleItemName;
    }

    @Nullable
    public final String getIcon() {
        return this.icon;
    }

    @Nullable
    public final Integer getItemType() {
        return this.itemType;
    }

    @Nullable
    public final Long getLeftTime() {
        return this.leftTime;
    }

    @Nullable
    public final String getNetwork() {
        return this.network;
    }

    @Nullable
    public final String getOrderNo() {
        return this.orderNo;
    }

    @Nullable
    public final Integer getOrderStatus() {
        return this.orderStatus;
    }

    @Nullable
    public final Long getPayAmount() {
        return this.payAmount;
    }

    @Nullable
    public final String getPayId() {
        return this.payId;
    }

    @Nullable
    public final String getPaymentItemId() {
        return this.paymentItemId;
    }

    @Nullable
    public final String getPaymentItemName() {
        return this.paymentItemName;
    }

    @Nullable
    public final String getPending1mCouponNo() {
        return this.pending1mCouponNo;
    }

    @Nullable
    public final Long getPending1mTime() {
        return this.pending1mTime;
    }

    @Nullable
    public final Boolean getRenewal() {
        return this.renewal;
    }

    public int hashCode() {
        String str = this.orderNo;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.categoryId;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.billerName;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.paymentItemName;
        int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.dataBundleItemName;
        int iHashCode5 = (iHashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
        Integer num = this.orderStatus;
        int iHashCode6 = (iHashCode5 + (num == null ? 0 : num.hashCode())) * 31;
        Long l5 = this.businessAmount;
        int iHashCode7 = (iHashCode6 + (l5 == null ? 0 : l5.hashCode())) * 31;
        Long l6 = this.payAmount;
        int iHashCode8 = (iHashCode7 + (l6 == null ? 0 : l6.hashCode())) * 31;
        Long l8 = this.createTime;
        int iHashCode9 = (iHashCode8 + (l8 == null ? 0 : l8.hashCode())) * 31;
        Integer num2 = this.businessType;
        int iHashCode10 = (iHashCode9 + (num2 == null ? 0 : num2.hashCode())) * 31;
        String str6 = this.icon;
        int iHashCode11 = (iHashCode10 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.paymentItemId;
        int iHashCode12 = (iHashCode11 + (str7 == null ? 0 : str7.hashCode())) * 31;
        String str8 = this.customerDisplayName;
        int iHashCode13 = (iHashCode12 + (str8 == null ? 0 : str8.hashCode())) * 31;
        String str9 = this.billerId;
        int iHashCode14 = (iHashCode13 + (str9 == null ? 0 : str9.hashCode())) * 31;
        String str10 = this.customerId;
        int iHashCode15 = (iHashCode14 + (str10 == null ? 0 : str10.hashCode())) * 31;
        String str11 = this.network;
        int iHashCode16 = (iHashCode15 + (str11 == null ? 0 : str11.hashCode())) * 31;
        Boolean bool = this.renewal;
        int iHashCode17 = (iHashCode16 + (bool == null ? 0 : bool.hashCode())) * 31;
        String str12 = this.pending1mCouponNo;
        int iHashCode18 = (iHashCode17 + (str12 == null ? 0 : str12.hashCode())) * 31;
        Long l10 = this.pending1mTime;
        int iHashCode19 = (iHashCode18 + (l10 == null ? 0 : l10.hashCode())) * 31;
        Long l11 = this.leftTime;
        int iHashCode20 = (iHashCode19 + (l11 == null ? 0 : l11.hashCode())) * 31;
        String str13 = this.payId;
        int iHashCode21 = (iHashCode20 + (str13 == null ? 0 : str13.hashCode())) * 31;
        Integer num3 = this.itemType;
        return iHashCode21 + (num3 != null ? num3.hashCode() : 0);
    }

    public final void setBillerId(@Nullable String str) {
        this.billerId = str;
    }

    public final void setBillerName(@Nullable String str) {
        this.billerName = str;
    }

    public final void setBusinessAmount(@Nullable Long l5) {
        this.businessAmount = l5;
    }

    public final void setBusinessType(@Nullable Integer num) {
        this.businessType = num;
    }

    public final void setCategoryId(@Nullable String str) {
        this.categoryId = str;
    }

    public final void setCreateTime(@Nullable Long l5) {
        this.createTime = l5;
    }

    public final void setCustomerDisplayName(@Nullable String str) {
        this.customerDisplayName = str;
    }

    public final void setCustomerId(@Nullable String str) {
        this.customerId = str;
    }

    public final void setDataBundleItemName(@Nullable String str) {
        this.dataBundleItemName = str;
    }

    public final void setIcon(@Nullable String str) {
        this.icon = str;
    }

    public final void setItemType(@Nullable Integer num) {
        this.itemType = num;
    }

    public final void setLeftTime(@Nullable Long l5) {
        this.leftTime = l5;
    }

    public final void setNetwork(@Nullable String str) {
        this.network = str;
    }

    public final void setOrderNo(@Nullable String str) {
        this.orderNo = str;
    }

    public final void setOrderStatus(@Nullable Integer num) {
        this.orderStatus = num;
    }

    public final void setPayAmount(@Nullable Long l5) {
        this.payAmount = l5;
    }

    public final void setPayId(@Nullable String str) {
        this.payId = str;
    }

    public final void setPaymentItemId(@Nullable String str) {
        this.paymentItemId = str;
    }

    public final void setPaymentItemName(@Nullable String str) {
        this.paymentItemName = str;
    }

    public final void setPending1mCouponNo(@Nullable String str) {
        this.pending1mCouponNo = str;
    }

    public final void setPending1mTime(@Nullable Long l5) {
        this.pending1mTime = l5;
    }

    public final void setRenewal(@Nullable Boolean bool) {
        this.renewal = bool;
    }

    @NotNull
    public String toString() {
        String str = this.orderNo;
        String str2 = this.categoryId;
        String str3 = this.billerName;
        String str4 = this.paymentItemName;
        String str5 = this.dataBundleItemName;
        Integer num = this.orderStatus;
        Long l5 = this.businessAmount;
        Long l6 = this.payAmount;
        Long l8 = this.createTime;
        Integer num2 = this.businessType;
        String str6 = this.icon;
        String str7 = this.paymentItemId;
        String str8 = this.customerDisplayName;
        String str9 = this.billerId;
        String str10 = this.customerId;
        String str11 = this.network;
        Boolean bool = this.renewal;
        String str12 = this.pending1mCouponNo;
        Long l10 = this.pending1mTime;
        Long l11 = this.leftTime;
        String str13 = this.payId;
        Integer num3 = this.itemType;
        StringBuilder sbF = F.f("BillerHistoryItemBean(orderNo=", str, ", categoryId=", str2, ", billerName=");
        u.x(sbF, str3, ", paymentItemName=", str4, ", dataBundleItemName=");
        sbF.append(str5);
        sbF.append(", orderStatus=");
        sbF.append(num);
        sbF.append(", businessAmount=");
        q0.w(sbF, l5, ", payAmount=", l6, ", createTime=");
        sbF.append(l8);
        sbF.append(", businessType=");
        sbF.append(num2);
        sbF.append(", icon=");
        u.x(sbF, str6, ", paymentItemId=", str7, ", customerDisplayName=");
        u.x(sbF, str8, ", billerId=", str9, ", customerId=");
        u.x(sbF, str10, ", network=", str11, ", renewal=");
        sbF.append(bool);
        sbF.append(", pending1mCouponNo=");
        sbF.append(str12);
        sbF.append(", pending1mTime=");
        q0.w(sbF, l10, ", leftTime=", l11, ", payId=");
        sbF.append(str13);
        sbF.append(", itemType=");
        sbF.append(num3);
        sbF.append(")");
        return sbF.toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NotNull Parcel parcel, int flags) {
        Intrinsics.checkNotNullParameter(parcel, "parcel");
        parcel.writeString(this.orderNo);
        parcel.writeString(this.categoryId);
        parcel.writeString(this.billerName);
        parcel.writeString(this.paymentItemName);
        parcel.writeString(this.dataBundleItemName);
        parcel.writeValue(this.orderStatus);
        parcel.writeValue(this.businessAmount);
        parcel.writeValue(this.payAmount);
        parcel.writeValue(this.createTime);
        parcel.writeValue(this.businessType);
        parcel.writeString(this.icon);
        parcel.writeString(this.paymentItemId);
        parcel.writeString(this.customerDisplayName);
        parcel.writeString(this.billerId);
        parcel.writeString(this.customerId);
        parcel.writeString(this.network);
        parcel.writeValue(this.renewal);
        parcel.writeString(this.pending1mCouponNo);
        parcel.writeValue(this.pending1mTime);
        parcel.writeValue(this.leftTime);
        parcel.writeString(this.payId);
        parcel.writeValue(this.itemType);
    }

    public BillerHistoryItemBean(@Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable String str4, @Nullable String str5, @Nullable Integer num, @Nullable Long l5, @Nullable Long l6, @Nullable Long l8, @Nullable Integer num2, @Nullable String str6, @Nullable String str7, @Nullable String str8, @Nullable String str9, @Nullable String str10, @Nullable String str11, @Nullable Boolean bool, @Nullable String str12, @Nullable Long l10, @Nullable Long l11, @Nullable String str13, @Nullable Integer num3) {
        this.orderNo = str;
        this.categoryId = str2;
        this.billerName = str3;
        this.paymentItemName = str4;
        this.dataBundleItemName = str5;
        this.orderStatus = num;
        this.businessAmount = l5;
        this.payAmount = l6;
        this.createTime = l8;
        this.businessType = num2;
        this.icon = str6;
        this.paymentItemId = str7;
        this.customerDisplayName = str8;
        this.billerId = str9;
        this.customerId = str10;
        this.network = str11;
        this.renewal = bool;
        this.pending1mCouponNo = str12;
        this.pending1mTime = l10;
        this.leftTime = l11;
        this.payId = str13;
        this.itemType = num3;
    }

    public /* synthetic */ BillerHistoryItemBean(String str, String str2, String str3, String str4, String str5, Integer num, Long l5, Long l6, Long l8, Integer num2, String str6, String str7, String str8, String str9, String str10, String str11, Boolean bool, String str12, Long l10, Long l11, String str13, Integer num3, int i7, DefaultConstructorMarker defaultConstructorMarker) {
        this((i7 & 1) != 0 ? null : str, (i7 & 2) != 0 ? null : str2, (i7 & 4) != 0 ? null : str3, (i7 & 8) != 0 ? null : str4, (i7 & 16) != 0 ? null : str5, (i7 & 32) != 0 ? 0 : num, (i7 & 64) != 0 ? 0L : l5, (i7 & 128) != 0 ? 0L : l6, (i7 & IntBufferBatchMountItem.INSTRUCTION_UPDATE_EVENT_EMITTER) != 0 ? 0L : l8, (i7 & 512) != 0 ? 0 : num2, (i7 & 1024) != 0 ? null : str6, (i7 & 2048) != 0 ? null : str7, (i7 & 4096) != 0 ? null : str8, (i7 & UserMetadata.MAX_INTERNAL_KEY_SIZE) != 0 ? null : str9, (i7 & 16384) != 0 ? null : str10, (i7 & 32768) != 0 ? null : str11, (i7 & 65536) != 0 ? Boolean.FALSE : bool, (i7 & 131072) != 0 ? null : str12, (i7 & CodePushConstants.DOWNLOAD_BUFFER_SIZE) != 0 ? 0L : l10, (i7 & 524288) != 0 ? 0L : l11, (i7 & 1048576) != 0 ? null : str13, (i7 & 2097152) != 0 ? 0 : num3);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public BillerHistoryItemBean(@NotNull Parcel parcel) {
        Intrinsics.checkNotNullParameter(parcel, "parcel");
        String string = parcel.readString();
        String string2 = parcel.readString();
        String string3 = parcel.readString();
        String string4 = parcel.readString();
        String string5 = parcel.readString();
        Class cls = Integer.TYPE;
        Object value = parcel.readValue(cls.getClassLoader());
        Integer num = value instanceof Integer ? (Integer) value : null;
        Class cls2 = Long.TYPE;
        Object value2 = parcel.readValue(cls2.getClassLoader());
        Long l5 = value2 instanceof Long ? (Long) value2 : null;
        Object value3 = parcel.readValue(cls2.getClassLoader());
        Long l6 = value3 instanceof Long ? (Long) value3 : null;
        Object value4 = parcel.readValue(cls2.getClassLoader());
        Long l8 = value4 instanceof Long ? (Long) value4 : null;
        Object value5 = parcel.readValue(cls.getClassLoader());
        Integer num2 = value5 instanceof Integer ? (Integer) value5 : null;
        String string6 = parcel.readString();
        Long l10 = l5;
        Long l11 = l6;
        Long l12 = l8;
        Integer num3 = num2;
        String string7 = parcel.readString();
        String string8 = parcel.readString();
        String string9 = parcel.readString();
        String string10 = parcel.readString();
        String string11 = parcel.readString();
        Object value6 = parcel.readValue(Boolean.TYPE.getClassLoader());
        Boolean bool = value6 instanceof Boolean ? (Boolean) value6 : null;
        String string12 = parcel.readString();
        Boolean bool2 = bool;
        Object value7 = parcel.readValue(cls2.getClassLoader());
        Long l13 = value7 instanceof Long ? (Long) value7 : null;
        Object value8 = parcel.readValue(cls2.getClassLoader());
        Long l14 = l13;
        Long l15 = value8 instanceof Long ? (Long) value8 : null;
        String string13 = parcel.readString();
        Object value9 = parcel.readValue(cls.getClassLoader());
        this(string, string2, string3, string4, string5, num, l10, l11, l12, num3, string6, string7, string8, string9, string10, string11, bool2, string12, l14, l15, string13, value9 instanceof Integer ? (Integer) value9 : null);
    }
}
