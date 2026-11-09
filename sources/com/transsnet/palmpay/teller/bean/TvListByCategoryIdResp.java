package com.transsnet.palmpay.teller.bean;

import C0.G;
import N8.q0;
import androidx.camera.camera2.internal.F;
import androidx.camera.video.u;
import com.facebook.react.fabric.mounting.mountitems.IntBufferBatchMountItem;
import com.facebook.react.uimanager.ViewProps;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.google.firebase.crashlytics.internal.metadata.UserMetadata;
import com.google.firebase.messaging.Constants;
import com.microsoft.codepush.react.CodePushConstants;
import com.transsnet.palmpay.core.bean.CommonResult;
import java.util.ArrayList;
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001:\u0002\u0015\u0016B#\u0012\u001a\u0010\u0002\u001a\u0016\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003j\n\u0012\u0004\u0012\u00020\u0004\u0018\u0001`\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u001d\u0010\u000b\u001a\u0016\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003j\n\u0012\u0004\u0012\u00020\u0004\u0018\u0001`\u0005HÆ\u0003J'\u0010\f\u001a\u00020\u00002\u001c\b\u0002\u0010\u0002\u001a\u0016\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003j\n\u0012\u0004\u0012\u00020\u0004\u0018\u0001`\u0005HÆ\u0001J\u0013\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010HÖ\u0003J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001R.\u0010\u0002\u001a\u0016\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003j\n\u0012\u0004\u0012\u00020\u0004\u0018\u0001`\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u0007¨\u0006\u0017"}, d2 = {"Lcom/transsnet/palmpay/teller/bean/TvListByCategoryIdResp;", "Lcom/transsnet/palmpay/core/bean/CommonResult;", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "Ljava/util/ArrayList;", "Lcom/transsnet/palmpay/teller/bean/TvListByCategoryIdResp$TvCategoryBean;", "Lkotlin/collections/ArrayList;", "<init>", "(Ljava/util/ArrayList;)V", "getData", "()Ljava/util/ArrayList;", "setData", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "TvCategoryBean", "TvItemChildBean", "module_biller_export_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final /* data */ class TvListByCategoryIdResp extends CommonResult {

    @Nullable
    private ArrayList<TvCategoryBean> data;

    public TvListByCategoryIdResp(@Nullable ArrayList<TvCategoryBean> arrayList) {
        this.data = arrayList;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ TvListByCategoryIdResp copy$default(TvListByCategoryIdResp tvListByCategoryIdResp, ArrayList arrayList, int i7, Object obj) {
        if ((i7 & 1) != 0) {
            arrayList = tvListByCategoryIdResp.data;
        }
        return tvListByCategoryIdResp.copy(arrayList);
    }

    @Nullable
    public final ArrayList<TvCategoryBean> component1() {
        return this.data;
    }

    @NotNull
    public final TvListByCategoryIdResp copy(@Nullable ArrayList<TvCategoryBean> data) {
        return new TvListByCategoryIdResp(data);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof TvListByCategoryIdResp) && Intrinsics.c(this.data, ((TvListByCategoryIdResp) other).data);
    }

    @Nullable
    public final ArrayList<TvCategoryBean> getData() {
        return this.data;
    }

    public int hashCode() {
        ArrayList<TvCategoryBean> arrayList = this.data;
        if (arrayList == null) {
            return 0;
        }
        return arrayList.hashCode();
    }

    public final void setData(@Nullable ArrayList<TvCategoryBean> arrayList) {
        this.data = arrayList;
    }

    @Override // com.transsnet.palmpay.core.bean.CommonResult
    @NotNull
    public String toString() {
        return "TvListByCategoryIdResp(data=" + this.data + ")";
    }

    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u001b\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001BS\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\u001a\u0010\b\u001a\u0016\u0012\u0004\u0012\u00020\n\u0018\u00010\tj\n\u0012\u0004\u0012\u00020\n\u0018\u0001`\u000b¢\u0006\u0004\b\f\u0010\rJ\u000b\u0010\u001f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010 \u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010!\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0002\u0010\u0015J\u000b\u0010\"\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u001d\u0010#\u001a\u0016\u0012\u0004\u0012\u00020\n\u0018\u00010\tj\n\u0012\u0004\u0012\u00020\n\u0018\u0001`\u000bHÆ\u0003J\\\u0010$\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00032\u001c\b\u0002\u0010\b\u001a\u0016\u0012\u0004\u0012\u00020\n\u0018\u00010\tj\n\u0012\u0004\u0012\u00020\n\u0018\u0001`\u000bHÆ\u0001¢\u0006\u0002\u0010%J\u0013\u0010&\u001a\u00020'2\b\u0010(\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010)\u001a\u00020\u0006HÖ\u0001J\t\u0010*\u001a\u00020\u0003HÖ\u0001R\u001c\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u000f\"\u0004\b\u0013\u0010\u0011R\u001e\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u0086\u000e¢\u0006\u0010\n\u0002\u0010\u0018\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u000f\"\u0004\b\u001a\u0010\u0011R.\u0010\b\u001a\u0016\u0012\u0004\u0012\u00020\n\u0018\u00010\tj\n\u0012\u0004\u0012\u00020\n\u0018\u0001`\u000bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001b\u0010\u001c\"\u0004\b\u001d\u0010\u001e¨\u0006+"}, d2 = {"Lcom/transsnet/palmpay/teller/bean/TvListByCategoryIdResp$TvCategoryBean;", "", "billerId", "", "billerName", "businessCategoryId", "", "businessCategoryName", "itemList", "Ljava/util/ArrayList;", "Lcom/transsnet/palmpay/teller/bean/TvListByCategoryIdResp$TvItemChildBean;", "Lkotlin/collections/ArrayList;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/util/ArrayList;)V", "getBillerId", "()Ljava/lang/String;", "setBillerId", "(Ljava/lang/String;)V", "getBillerName", "setBillerName", "getBusinessCategoryId", "()Ljava/lang/Integer;", "setBusinessCategoryId", "(Ljava/lang/Integer;)V", "Ljava/lang/Integer;", "getBusinessCategoryName", "setBusinessCategoryName", "getItemList", "()Ljava/util/ArrayList;", "setItemList", "(Ljava/util/ArrayList;)V", "component1", "component2", "component3", "component4", "component5", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/util/ArrayList;)Lcom/transsnet/palmpay/teller/bean/TvListByCategoryIdResp$TvCategoryBean;", "equals", "", "other", "hashCode", "toString", "module_biller_export_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class TvCategoryBean {

        @Nullable
        private String billerId;

        @Nullable
        private String billerName;

        @Nullable
        private Integer businessCategoryId;

        @Nullable
        private String businessCategoryName;

        @Nullable
        private ArrayList<TvItemChildBean> itemList;

        public TvCategoryBean(@Nullable String str, @Nullable String str2, @Nullable Integer num, @Nullable String str3, @Nullable ArrayList<TvItemChildBean> arrayList) {
            this.billerId = str;
            this.billerName = str2;
            this.businessCategoryId = num;
            this.businessCategoryName = str3;
            this.itemList = arrayList;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ TvCategoryBean copy$default(TvCategoryBean tvCategoryBean, String str, String str2, Integer num, String str3, ArrayList arrayList, int i7, Object obj) {
            if ((i7 & 1) != 0) {
                str = tvCategoryBean.billerId;
            }
            if ((i7 & 2) != 0) {
                str2 = tvCategoryBean.billerName;
            }
            if ((i7 & 4) != 0) {
                num = tvCategoryBean.businessCategoryId;
            }
            if ((i7 & 8) != 0) {
                str3 = tvCategoryBean.businessCategoryName;
            }
            if ((i7 & 16) != 0) {
                arrayList = tvCategoryBean.itemList;
            }
            ArrayList arrayList2 = arrayList;
            Integer num2 = num;
            return tvCategoryBean.copy(str, str2, num2, str3, arrayList2);
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
        public final Integer getBusinessCategoryId() {
            return this.businessCategoryId;
        }

        @Nullable
        /* JADX INFO: renamed from: component4, reason: from getter */
        public final String getBusinessCategoryName() {
            return this.businessCategoryName;
        }

        @Nullable
        public final ArrayList<TvItemChildBean> component5() {
            return this.itemList;
        }

        @NotNull
        public final TvCategoryBean copy(@Nullable String billerId, @Nullable String billerName, @Nullable Integer businessCategoryId, @Nullable String businessCategoryName, @Nullable ArrayList<TvItemChildBean> itemList) {
            return new TvCategoryBean(billerId, billerName, businessCategoryId, businessCategoryName, itemList);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof TvCategoryBean)) {
                return false;
            }
            TvCategoryBean tvCategoryBean = (TvCategoryBean) other;
            return Intrinsics.c(this.billerId, tvCategoryBean.billerId) && Intrinsics.c(this.billerName, tvCategoryBean.billerName) && Intrinsics.c(this.businessCategoryId, tvCategoryBean.businessCategoryId) && Intrinsics.c(this.businessCategoryName, tvCategoryBean.businessCategoryName) && Intrinsics.c(this.itemList, tvCategoryBean.itemList);
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
        public final Integer getBusinessCategoryId() {
            return this.businessCategoryId;
        }

        @Nullable
        public final String getBusinessCategoryName() {
            return this.businessCategoryName;
        }

        @Nullable
        public final ArrayList<TvItemChildBean> getItemList() {
            return this.itemList;
        }

        public int hashCode() {
            String str = this.billerId;
            int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
            String str2 = this.billerName;
            int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
            Integer num = this.businessCategoryId;
            int iHashCode3 = (iHashCode2 + (num == null ? 0 : num.hashCode())) * 31;
            String str3 = this.businessCategoryName;
            int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
            ArrayList<TvItemChildBean> arrayList = this.itemList;
            return iHashCode4 + (arrayList != null ? arrayList.hashCode() : 0);
        }

        public final void setBillerId(@Nullable String str) {
            this.billerId = str;
        }

        public final void setBillerName(@Nullable String str) {
            this.billerName = str;
        }

        public final void setBusinessCategoryId(@Nullable Integer num) {
            this.businessCategoryId = num;
        }

        public final void setBusinessCategoryName(@Nullable String str) {
            this.businessCategoryName = str;
        }

        public final void setItemList(@Nullable ArrayList<TvItemChildBean> arrayList) {
            this.itemList = arrayList;
        }

        @NotNull
        public String toString() {
            String str = this.billerId;
            String str2 = this.billerName;
            Integer num = this.businessCategoryId;
            String str3 = this.businessCategoryName;
            ArrayList<TvItemChildBean> arrayList = this.itemList;
            StringBuilder sbF = F.f("TvCategoryBean(billerId=", str, ", billerName=", str2, ", businessCategoryId=");
            sbF.append(num);
            sbF.append(", businessCategoryName=");
            sbF.append(str3);
            sbF.append(", itemList=");
            sbF.append(arrayList);
            sbF.append(")");
            return sbF.toString();
        }

        public /* synthetic */ TvCategoryBean(String str, String str2, Integer num, String str3, ArrayList arrayList, int i7, DefaultConstructorMarker defaultConstructorMarker) {
            this((i7 & 1) != 0 ? null : str, (i7 & 2) != 0 ? null : str2, (i7 & 4) != 0 ? null : num, (i7 & 8) != 0 ? null : str3, arrayList);
        }
    }

    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0016\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000b\n\u0002\bH\n\u0002\u0010\b\n\u0002\b\u001a\b\u0086\b\u0018\u00002\u00020\u0001B\u008d\u0002\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\r\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\r\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u001c\u0010\u001dJ\u0013\u0010S\u001a\u00020\r2\b\u0010T\u001a\u0004\u0018\u00010\u0001H\u0096\u0002J\b\u0010U\u001a\u00020VH\u0016J\u000b\u0010W\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010X\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010Y\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010Z\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010[\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\\\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u0010\u0010]\u001a\u0004\u0018\u00010\u000bHÆ\u0003¢\u0006\u0002\u0010/J\u0010\u0010^\u001a\u0004\u0018\u00010\rHÆ\u0003¢\u0006\u0002\u00103J\u0010\u0010_\u001a\u0004\u0018\u00010\rHÆ\u0003¢\u0006\u0002\u00103J\u000b\u0010`\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u0010\u0010a\u001a\u0004\u0018\u00010\u000bHÆ\u0003¢\u0006\u0002\u0010/J\u0010\u0010b\u001a\u0004\u0018\u00010\u000bHÆ\u0003¢\u0006\u0002\u0010/J\u000b\u0010c\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010d\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010e\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010f\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010g\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010h\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010i\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010j\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010k\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010l\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u0096\u0002\u0010m\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\r2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\r2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u0005HÆ\u0001¢\u0006\u0002\u0010nJ\t\u0010o\u001a\u00020\u0005HÖ\u0001R\u001c\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001e\u0010\u001f\"\u0004\b \u0010!R\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\"\u0010#\"\u0004\b$\u0010%R\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b&\u0010#\"\u0004\b'\u0010%R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b(\u0010#\"\u0004\b)\u0010%R\u001c\u0010\b\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b*\u0010#\"\u0004\b+\u0010%R\u001c\u0010\t\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b,\u0010#\"\u0004\b-\u0010%R\u001e\u0010\n\u001a\u0004\u0018\u00010\u000bX\u0086\u000e¢\u0006\u0010\n\u0002\u00102\u001a\u0004\b.\u0010/\"\u0004\b0\u00101R\u001e\u0010\f\u001a\u0004\u0018\u00010\rX\u0086\u000e¢\u0006\u0010\n\u0002\u00106\u001a\u0004\b\f\u00103\"\u0004\b4\u00105R\u001e\u0010\u000e\u001a\u0004\u0018\u00010\rX\u0086\u000e¢\u0006\u0010\n\u0002\u00106\u001a\u0004\b7\u00103\"\u0004\b8\u00105R\u001c\u0010\u000f\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b9\u0010#\"\u0004\b:\u0010%R\u001e\u0010\u0010\u001a\u0004\u0018\u00010\u000bX\u0086\u000e¢\u0006\u0010\n\u0002\u00102\u001a\u0004\b;\u0010/\"\u0004\b<\u00101R\u001e\u0010\u0011\u001a\u0004\u0018\u00010\u000bX\u0086\u000e¢\u0006\u0010\n\u0002\u00102\u001a\u0004\b=\u0010/\"\u0004\b>\u00101R\u001c\u0010\u0012\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b?\u0010#\"\u0004\b@\u0010%R\u001c\u0010\u0013\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bA\u0010#\"\u0004\bB\u0010%R\u001c\u0010\u0014\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bC\u0010#\"\u0004\bD\u0010%R\u001c\u0010\u0015\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bE\u0010#\"\u0004\bF\u0010%R\u001c\u0010\u0016\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bG\u0010#\"\u0004\bH\u0010%R\u001c\u0010\u0017\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bI\u0010#\"\u0004\bJ\u0010%R\u001c\u0010\u0018\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bK\u0010#\"\u0004\bL\u0010%R\u001c\u0010\u0019\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bM\u0010#\"\u0004\bN\u0010%R\u001c\u0010\u001a\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bO\u0010#\"\u0004\bP\u0010%R\u001c\u0010\u001b\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bQ\u0010#\"\u0004\bR\u0010%¨\u0006p"}, d2 = {"Lcom/transsnet/palmpay/teller/bean/TvListByCategoryIdResp$TvItemChildBean;", "", "customerAmounts", "", "description", "", "itemCategory", "itemId", "itemName", "itemNameSuffix", FirebaseAnalytics.Param.PRICE, "", "isAmountFixed", "", "suspend", "validityExtDesc", "maxAmount", "minAmount", "viewDoc", "viewPic", "remark", ViewProps.COLOR, "image", "fontColor", ViewProps.BACKGROUND_COLOR, "volume", "volumeUnit", "validity", "<init>", "([JLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getCustomerAmounts", "()[J", "setCustomerAmounts", "([J)V", "getDescription", "()Ljava/lang/String;", "setDescription", "(Ljava/lang/String;)V", "getItemCategory", "setItemCategory", "getItemId", "setItemId", "getItemName", "setItemName", "getItemNameSuffix", "setItemNameSuffix", "getPrice", "()Ljava/lang/Long;", "setPrice", "(Ljava/lang/Long;)V", "Ljava/lang/Long;", "()Ljava/lang/Boolean;", "setAmountFixed", "(Ljava/lang/Boolean;)V", "Ljava/lang/Boolean;", "getSuspend", "setSuspend", "getValidityExtDesc", "setValidityExtDesc", "getMaxAmount", "setMaxAmount", "getMinAmount", "setMinAmount", "getViewDoc", "setViewDoc", "getViewPic", "setViewPic", "getRemark", "setRemark", "getColor", "setColor", "getImage", "setImage", "getFontColor", "setFontColor", "getBackgroundColor", "setBackgroundColor", "getVolume", "setVolume", "getVolumeUnit", "setVolumeUnit", "getValidity", "setValidity", "equals", "other", "hashCode", "", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "component18", "component19", "component20", "component21", "component22", "copy", "([JLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/transsnet/palmpay/teller/bean/TvListByCategoryIdResp$TvItemChildBean;", "toString", "module_biller_export_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class TvItemChildBean {

        @Nullable
        private String backgroundColor;

        @Nullable
        private String color;

        @Nullable
        private long[] customerAmounts;

        @Nullable
        private String description;

        @Nullable
        private String fontColor;

        @Nullable
        private String image;

        @Nullable
        private Boolean isAmountFixed;

        @Nullable
        private String itemCategory;

        @Nullable
        private String itemId;

        @Nullable
        private String itemName;

        @Nullable
        private String itemNameSuffix;

        @Nullable
        private Long maxAmount;

        @Nullable
        private Long minAmount;

        @Nullable
        private Long price;

        @Nullable
        private String remark;

        @Nullable
        private Boolean suspend;

        @Nullable
        private String validity;

        @Nullable
        private String validityExtDesc;

        @Nullable
        private String viewDoc;

        @Nullable
        private String viewPic;

        @Nullable
        private String volume;

        @Nullable
        private String volumeUnit;

        public TvItemChildBean(@Nullable long[] jArr, @Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable String str4, @Nullable String str5, @Nullable Long l5, @Nullable Boolean bool, @Nullable Boolean bool2, @Nullable String str6, @Nullable Long l6, @Nullable Long l8, @Nullable String str7, @Nullable String str8, @Nullable String str9, @Nullable String str10, @Nullable String str11, @Nullable String str12, @Nullable String str13, @Nullable String str14, @Nullable String str15, @Nullable String str16) {
            this.customerAmounts = jArr;
            this.description = str;
            this.itemCategory = str2;
            this.itemId = str3;
            this.itemName = str4;
            this.itemNameSuffix = str5;
            this.price = l5;
            this.isAmountFixed = bool;
            this.suspend = bool2;
            this.validityExtDesc = str6;
            this.maxAmount = l6;
            this.minAmount = l8;
            this.viewDoc = str7;
            this.viewPic = str8;
            this.remark = str9;
            this.color = str10;
            this.image = str11;
            this.fontColor = str12;
            this.backgroundColor = str13;
            this.volume = str14;
            this.volumeUnit = str15;
            this.validity = str16;
        }

        public static /* synthetic */ TvItemChildBean copy$default(TvItemChildBean tvItemChildBean, long[] jArr, String str, String str2, String str3, String str4, String str5, Long l5, Boolean bool, Boolean bool2, String str6, Long l6, Long l8, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14, String str15, String str16, int i7, Object obj) {
            String str17;
            String str18;
            long[] jArr2 = (i7 & 1) != 0 ? tvItemChildBean.customerAmounts : jArr;
            String str19 = (i7 & 2) != 0 ? tvItemChildBean.description : str;
            String str20 = (i7 & 4) != 0 ? tvItemChildBean.itemCategory : str2;
            String str21 = (i7 & 8) != 0 ? tvItemChildBean.itemId : str3;
            String str22 = (i7 & 16) != 0 ? tvItemChildBean.itemName : str4;
            String str23 = (i7 & 32) != 0 ? tvItemChildBean.itemNameSuffix : str5;
            Long l10 = (i7 & 64) != 0 ? tvItemChildBean.price : l5;
            Boolean bool3 = (i7 & 128) != 0 ? tvItemChildBean.isAmountFixed : bool;
            Boolean bool4 = (i7 & IntBufferBatchMountItem.INSTRUCTION_UPDATE_EVENT_EMITTER) != 0 ? tvItemChildBean.suspend : bool2;
            String str24 = (i7 & 512) != 0 ? tvItemChildBean.validityExtDesc : str6;
            Long l11 = (i7 & 1024) != 0 ? tvItemChildBean.maxAmount : l6;
            Long l12 = (i7 & 2048) != 0 ? tvItemChildBean.minAmount : l8;
            String str25 = (i7 & 4096) != 0 ? tvItemChildBean.viewDoc : str7;
            String str26 = (i7 & UserMetadata.MAX_INTERNAL_KEY_SIZE) != 0 ? tvItemChildBean.viewPic : str8;
            long[] jArr3 = jArr2;
            String str27 = (i7 & 16384) != 0 ? tvItemChildBean.remark : str9;
            String str28 = (i7 & 32768) != 0 ? tvItemChildBean.color : str10;
            String str29 = (i7 & 65536) != 0 ? tvItemChildBean.image : str11;
            String str30 = (i7 & 131072) != 0 ? tvItemChildBean.fontColor : str12;
            String str31 = (i7 & CodePushConstants.DOWNLOAD_BUFFER_SIZE) != 0 ? tvItemChildBean.backgroundColor : str13;
            String str32 = (i7 & 524288) != 0 ? tvItemChildBean.volume : str14;
            String str33 = (i7 & 1048576) != 0 ? tvItemChildBean.volumeUnit : str15;
            if ((i7 & 2097152) != 0) {
                str18 = str33;
                str17 = tvItemChildBean.validity;
            } else {
                str17 = str16;
                str18 = str33;
            }
            return tvItemChildBean.copy(jArr3, str19, str20, str21, str22, str23, l10, bool3, bool4, str24, l11, l12, str25, str26, str27, str28, str29, str30, str31, str32, str18, str17);
        }

        @Nullable
        /* JADX INFO: renamed from: component1, reason: from getter */
        public final long[] getCustomerAmounts() {
            return this.customerAmounts;
        }

        @Nullable
        /* JADX INFO: renamed from: component10, reason: from getter */
        public final String getValidityExtDesc() {
            return this.validityExtDesc;
        }

        @Nullable
        /* JADX INFO: renamed from: component11, reason: from getter */
        public final Long getMaxAmount() {
            return this.maxAmount;
        }

        @Nullable
        /* JADX INFO: renamed from: component12, reason: from getter */
        public final Long getMinAmount() {
            return this.minAmount;
        }

        @Nullable
        /* JADX INFO: renamed from: component13, reason: from getter */
        public final String getViewDoc() {
            return this.viewDoc;
        }

        @Nullable
        /* JADX INFO: renamed from: component14, reason: from getter */
        public final String getViewPic() {
            return this.viewPic;
        }

        @Nullable
        /* JADX INFO: renamed from: component15, reason: from getter */
        public final String getRemark() {
            return this.remark;
        }

        @Nullable
        /* JADX INFO: renamed from: component16, reason: from getter */
        public final String getColor() {
            return this.color;
        }

        @Nullable
        /* JADX INFO: renamed from: component17, reason: from getter */
        public final String getImage() {
            return this.image;
        }

        @Nullable
        /* JADX INFO: renamed from: component18, reason: from getter */
        public final String getFontColor() {
            return this.fontColor;
        }

        @Nullable
        /* JADX INFO: renamed from: component19, reason: from getter */
        public final String getBackgroundColor() {
            return this.backgroundColor;
        }

        @Nullable
        /* JADX INFO: renamed from: component2, reason: from getter */
        public final String getDescription() {
            return this.description;
        }

        @Nullable
        /* JADX INFO: renamed from: component20, reason: from getter */
        public final String getVolume() {
            return this.volume;
        }

        @Nullable
        /* JADX INFO: renamed from: component21, reason: from getter */
        public final String getVolumeUnit() {
            return this.volumeUnit;
        }

        @Nullable
        /* JADX INFO: renamed from: component22, reason: from getter */
        public final String getValidity() {
            return this.validity;
        }

        @Nullable
        /* JADX INFO: renamed from: component3, reason: from getter */
        public final String getItemCategory() {
            return this.itemCategory;
        }

        @Nullable
        /* JADX INFO: renamed from: component4, reason: from getter */
        public final String getItemId() {
            return this.itemId;
        }

        @Nullable
        /* JADX INFO: renamed from: component5, reason: from getter */
        public final String getItemName() {
            return this.itemName;
        }

        @Nullable
        /* JADX INFO: renamed from: component6, reason: from getter */
        public final String getItemNameSuffix() {
            return this.itemNameSuffix;
        }

        @Nullable
        /* JADX INFO: renamed from: component7, reason: from getter */
        public final Long getPrice() {
            return this.price;
        }

        @Nullable
        /* JADX INFO: renamed from: component8, reason: from getter */
        public final Boolean getIsAmountFixed() {
            return this.isAmountFixed;
        }

        @Nullable
        /* JADX INFO: renamed from: component9, reason: from getter */
        public final Boolean getSuspend() {
            return this.suspend;
        }

        @NotNull
        public final TvItemChildBean copy(@Nullable long[] customerAmounts, @Nullable String description, @Nullable String itemCategory, @Nullable String itemId, @Nullable String itemName, @Nullable String itemNameSuffix, @Nullable Long price, @Nullable Boolean isAmountFixed, @Nullable Boolean suspend, @Nullable String validityExtDesc, @Nullable Long maxAmount, @Nullable Long minAmount, @Nullable String viewDoc, @Nullable String viewPic, @Nullable String remark, @Nullable String color, @Nullable String image, @Nullable String fontColor, @Nullable String backgroundColor, @Nullable String volume, @Nullable String volumeUnit, @Nullable String validity) {
            return new TvItemChildBean(customerAmounts, description, itemCategory, itemId, itemName, itemNameSuffix, price, isAmountFixed, suspend, validityExtDesc, maxAmount, minAmount, viewDoc, viewPic, remark, color, image, fontColor, backgroundColor, volume, volumeUnit, validity);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!TvItemChildBean.class.equals(other != null ? other.getClass() : null)) {
                return false;
            }
            Intrinsics.f(other, "null cannot be cast to non-null type com.transsnet.palmpay.teller.bean.TvListByCategoryIdResp.TvItemChildBean");
            TvItemChildBean tvItemChildBean = (TvItemChildBean) other;
            long[] jArr = this.customerAmounts;
            if (jArr != null) {
                long[] jArr2 = tvItemChildBean.customerAmounts;
                if (jArr2 == null || !Arrays.equals(jArr, jArr2)) {
                    return false;
                }
            } else if (tvItemChildBean.customerAmounts != null) {
                return false;
            }
            return Intrinsics.c(this.description, tvItemChildBean.description) && Intrinsics.c(this.itemCategory, tvItemChildBean.itemCategory) && Intrinsics.c(this.itemId, tvItemChildBean.itemId) && Intrinsics.c(this.itemName, tvItemChildBean.itemName) && Intrinsics.c(this.itemNameSuffix, tvItemChildBean.itemNameSuffix) && Intrinsics.c(this.price, tvItemChildBean.price) && Intrinsics.c(this.isAmountFixed, tvItemChildBean.isAmountFixed) && Intrinsics.c(this.suspend, tvItemChildBean.suspend) && Intrinsics.c(this.validityExtDesc, tvItemChildBean.validityExtDesc) && Intrinsics.c(this.maxAmount, tvItemChildBean.maxAmount) && Intrinsics.c(this.minAmount, tvItemChildBean.minAmount) && Intrinsics.c(this.viewDoc, tvItemChildBean.viewDoc) && Intrinsics.c(this.viewPic, tvItemChildBean.viewPic) && Intrinsics.c(this.remark, tvItemChildBean.remark) && Intrinsics.c(this.color, tvItemChildBean.color) && Intrinsics.c(this.image, tvItemChildBean.image) && Intrinsics.c(this.fontColor, tvItemChildBean.fontColor) && Intrinsics.c(this.backgroundColor, tvItemChildBean.backgroundColor) && Intrinsics.c(this.volume, tvItemChildBean.volume) && Intrinsics.c(this.volumeUnit, tvItemChildBean.volumeUnit) && Intrinsics.c(this.validity, tvItemChildBean.validity);
        }

        @Nullable
        public final String getBackgroundColor() {
            return this.backgroundColor;
        }

        @Nullable
        public final String getColor() {
            return this.color;
        }

        @Nullable
        public final long[] getCustomerAmounts() {
            return this.customerAmounts;
        }

        @Nullable
        public final String getDescription() {
            return this.description;
        }

        @Nullable
        public final String getFontColor() {
            return this.fontColor;
        }

        @Nullable
        public final String getImage() {
            return this.image;
        }

        @Nullable
        public final String getItemCategory() {
            return this.itemCategory;
        }

        @Nullable
        public final String getItemId() {
            return this.itemId;
        }

        @Nullable
        public final String getItemName() {
            return this.itemName;
        }

        @Nullable
        public final String getItemNameSuffix() {
            return this.itemNameSuffix;
        }

        @Nullable
        public final Long getMaxAmount() {
            return this.maxAmount;
        }

        @Nullable
        public final Long getMinAmount() {
            return this.minAmount;
        }

        @Nullable
        public final Long getPrice() {
            return this.price;
        }

        @Nullable
        public final String getRemark() {
            return this.remark;
        }

        @Nullable
        public final Boolean getSuspend() {
            return this.suspend;
        }

        @Nullable
        public final String getValidity() {
            return this.validity;
        }

        @Nullable
        public final String getValidityExtDesc() {
            return this.validityExtDesc;
        }

        @Nullable
        public final String getViewDoc() {
            return this.viewDoc;
        }

        @Nullable
        public final String getViewPic() {
            return this.viewPic;
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
            long[] jArr = this.customerAmounts;
            int iHashCode = (jArr != null ? Arrays.hashCode(jArr) : 0) * 31;
            String str = this.description;
            int iHashCode2 = (iHashCode + (str != null ? str.hashCode() : 0)) * 31;
            String str2 = this.itemCategory;
            int iHashCode3 = (iHashCode2 + (str2 != null ? str2.hashCode() : 0)) * 31;
            String str3 = this.itemId;
            int iHashCode4 = (iHashCode3 + (str3 != null ? str3.hashCode() : 0)) * 31;
            String str4 = this.itemName;
            int iHashCode5 = (iHashCode4 + (str4 != null ? str4.hashCode() : 0)) * 31;
            String str5 = this.itemNameSuffix;
            int iHashCode6 = (iHashCode5 + (str5 != null ? str5.hashCode() : 0)) * 31;
            Long l5 = this.price;
            int iHashCode7 = (iHashCode6 + (l5 != null ? l5.hashCode() : 0)) * 31;
            Boolean bool = this.isAmountFixed;
            int iHashCode8 = (iHashCode7 + (bool != null ? bool.hashCode() : 0)) * 31;
            Boolean bool2 = this.suspend;
            int iHashCode9 = (iHashCode8 + (bool2 != null ? bool2.hashCode() : 0)) * 31;
            String str6 = this.validityExtDesc;
            int iHashCode10 = (iHashCode9 + (str6 != null ? str6.hashCode() : 0)) * 31;
            Long l6 = this.maxAmount;
            int iHashCode11 = (iHashCode10 + (l6 != null ? l6.hashCode() : 0)) * 31;
            Long l8 = this.minAmount;
            int iHashCode12 = (iHashCode11 + (l8 != null ? l8.hashCode() : 0)) * 31;
            String str7 = this.viewDoc;
            int iHashCode13 = (iHashCode12 + (str7 != null ? str7.hashCode() : 0)) * 31;
            String str8 = this.viewPic;
            int iHashCode14 = (iHashCode13 + (str8 != null ? str8.hashCode() : 0)) * 31;
            String str9 = this.remark;
            int iHashCode15 = (iHashCode14 + (str9 != null ? str9.hashCode() : 0)) * 31;
            String str10 = this.color;
            int iHashCode16 = (iHashCode15 + (str10 != null ? str10.hashCode() : 0)) * 31;
            String str11 = this.image;
            int iHashCode17 = (iHashCode16 + (str11 != null ? str11.hashCode() : 0)) * 31;
            String str12 = this.fontColor;
            int iHashCode18 = (iHashCode17 + (str12 != null ? str12.hashCode() : 0)) * 31;
            String str13 = this.backgroundColor;
            int iHashCode19 = (iHashCode18 + (str13 != null ? str13.hashCode() : 0)) * 31;
            String str14 = this.volume;
            int iHashCode20 = (iHashCode19 + (str14 != null ? str14.hashCode() : 0)) * 31;
            String str15 = this.volumeUnit;
            int iHashCode21 = (iHashCode20 + (str15 != null ? str15.hashCode() : 0)) * 31;
            String str16 = this.validity;
            return iHashCode21 + (str16 != null ? str16.hashCode() : 0);
        }

        @Nullable
        public final Boolean isAmountFixed() {
            return this.isAmountFixed;
        }

        public final void setAmountFixed(@Nullable Boolean bool) {
            this.isAmountFixed = bool;
        }

        public final void setBackgroundColor(@Nullable String str) {
            this.backgroundColor = str;
        }

        public final void setColor(@Nullable String str) {
            this.color = str;
        }

        public final void setCustomerAmounts(@Nullable long[] jArr) {
            this.customerAmounts = jArr;
        }

        public final void setDescription(@Nullable String str) {
            this.description = str;
        }

        public final void setFontColor(@Nullable String str) {
            this.fontColor = str;
        }

        public final void setImage(@Nullable String str) {
            this.image = str;
        }

        public final void setItemCategory(@Nullable String str) {
            this.itemCategory = str;
        }

        public final void setItemId(@Nullable String str) {
            this.itemId = str;
        }

        public final void setItemName(@Nullable String str) {
            this.itemName = str;
        }

        public final void setItemNameSuffix(@Nullable String str) {
            this.itemNameSuffix = str;
        }

        public final void setMaxAmount(@Nullable Long l5) {
            this.maxAmount = l5;
        }

        public final void setMinAmount(@Nullable Long l5) {
            this.minAmount = l5;
        }

        public final void setPrice(@Nullable Long l5) {
            this.price = l5;
        }

        public final void setRemark(@Nullable String str) {
            this.remark = str;
        }

        public final void setSuspend(@Nullable Boolean bool) {
            this.suspend = bool;
        }

        public final void setValidity(@Nullable String str) {
            this.validity = str;
        }

        public final void setValidityExtDesc(@Nullable String str) {
            this.validityExtDesc = str;
        }

        public final void setViewDoc(@Nullable String str) {
            this.viewDoc = str;
        }

        public final void setViewPic(@Nullable String str) {
            this.viewPic = str;
        }

        public final void setVolume(@Nullable String str) {
            this.volume = str;
        }

        public final void setVolumeUnit(@Nullable String str) {
            this.volumeUnit = str;
        }

        @NotNull
        public String toString() {
            String string = Arrays.toString(this.customerAmounts);
            String str = this.description;
            String str2 = this.itemCategory;
            String str3 = this.itemId;
            String str4 = this.itemName;
            String str5 = this.itemNameSuffix;
            Long l5 = this.price;
            Boolean bool = this.isAmountFixed;
            Boolean bool2 = this.suspend;
            String str6 = this.validityExtDesc;
            Long l6 = this.maxAmount;
            Long l8 = this.minAmount;
            String str7 = this.viewDoc;
            String str8 = this.viewPic;
            String str9 = this.remark;
            String str10 = this.color;
            String str11 = this.image;
            String str12 = this.fontColor;
            String str13 = this.backgroundColor;
            String str14 = this.volume;
            String str15 = this.volumeUnit;
            String str16 = this.validity;
            StringBuilder sbF = F.f("TvItemChildBean(customerAmounts=", string, ", description=", str, ", itemCategory=");
            u.x(sbF, str2, ", itemId=", str3, ", itemName=");
            u.x(sbF, str4, ", itemNameSuffix=", str5, ", price=");
            sbF.append(l5);
            sbF.append(", isAmountFixed=");
            sbF.append(bool);
            sbF.append(", suspend=");
            sbF.append(bool2);
            sbF.append(", validityExtDesc=");
            sbF.append(str6);
            sbF.append(", maxAmount=");
            q0.w(sbF, l6, ", minAmount=", l8, ", viewDoc=");
            u.x(sbF, str7, ", viewPic=", str8, ", remark=");
            u.x(sbF, str9, ", color=", str10, ", image=");
            u.x(sbF, str11, ", fontColor=", str12, ", backgroundColor=");
            u.x(sbF, str13, ", volume=", str14, ", volumeUnit=");
            return G.s(sbF, str15, ", validity=", str16, ")");
        }

        public /* synthetic */ TvItemChildBean(long[] jArr, String str, String str2, String str3, String str4, String str5, Long l5, Boolean bool, Boolean bool2, String str6, Long l6, Long l8, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14, String str15, String str16, int i7, DefaultConstructorMarker defaultConstructorMarker) {
            this(jArr, (i7 & 2) != 0 ? null : str, (i7 & 4) != 0 ? null : str2, (i7 & 8) != 0 ? null : str3, (i7 & 16) != 0 ? null : str4, (i7 & 32) != 0 ? null : str5, (i7 & 64) != 0 ? 0L : l5, (i7 & 128) != 0 ? Boolean.FALSE : bool, (i7 & IntBufferBatchMountItem.INSTRUCTION_UPDATE_EVENT_EMITTER) != 0 ? Boolean.FALSE : bool2, (i7 & 512) != 0 ? null : str6, (i7 & 1024) != 0 ? Long.MAX_VALUE : l6, (i7 & 2048) != 0 ? 0L : l8, (i7 & 4096) != 0 ? null : str7, (i7 & UserMetadata.MAX_INTERNAL_KEY_SIZE) != 0 ? null : str8, (i7 & 16384) != 0 ? null : str9, (i7 & 32768) != 0 ? null : str10, (i7 & 65536) != 0 ? null : str11, (i7 & 131072) != 0 ? null : str12, (i7 & CodePushConstants.DOWNLOAD_BUFFER_SIZE) != 0 ? null : str13, (i7 & 524288) != 0 ? null : str14, (i7 & 1048576) == 0 ? str15 : null, (i7 & 2097152) != 0 ? "" : str16);
        }
    }
}
