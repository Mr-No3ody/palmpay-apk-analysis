package com.transsnet.palmpay.teller.bean;

import C0.G;
import androidx.camera.video.u;
import com.google.firebase.messaging.Constants;
import com.transsnet.palmpay.core.bean.CommonResult;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001:\u0002\u0013\u0014B\u0013\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u000b\u0010\t\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0015\u0010\n\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\u000b\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u000eHÖ\u0003J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001R\u001c\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\u0005¨\u0006\u0015"}, d2 = {"Lcom/transsnet/palmpay/teller/bean/CheckTvItemRsp;", "Lcom/transsnet/palmpay/core/bean/CommonResult;", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "Lcom/transsnet/palmpay/teller/bean/CheckTvItemRsp$DataBean;", "<init>", "(Lcom/transsnet/palmpay/teller/bean/CheckTvItemRsp$DataBean;)V", "getData", "()Lcom/transsnet/palmpay/teller/bean/CheckTvItemRsp$DataBean;", "setData", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "DataBean", "Item", "module_biller_export_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final /* data */ class CheckTvItemRsp extends CommonResult {

    @Nullable
    private DataBean data;

    @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\t\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b+\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001Bm\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t\u0012\u0010\b\u0002\u0010\n\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u000b\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000f¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010.\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u0013J\u000b\u0010/\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u00100\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u00101\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u0010\u00102\u001a\u0004\u0018\u00010\tHÆ\u0003¢\u0006\u0002\u0010 J\u0011\u00103\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u000bHÆ\u0003J\u0010\u00104\u001a\u0004\u0018\u00010\tHÆ\u0003¢\u0006\u0002\u0010 J\u000b\u00105\u001a\u0004\u0018\u00010\u000fHÆ\u0003Jt\u00106\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t2\u0010\b\u0002\u0010\n\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u000b2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000fHÆ\u0001¢\u0006\u0002\u00107J\u0013\u00108\u001a\u00020\u00032\b\u00109\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010:\u001a\u00020;HÖ\u0001J\t\u0010<\u001a\u00020\u0005HÖ\u0001R\u001e\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u0010\n\u0002\u0010\u0016\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001aR\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001b\u0010\u0018\"\u0004\b\u001c\u0010\u001aR\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001d\u0010\u0018\"\u0004\b\u001e\u0010\u001aR\u001e\u0010\b\u001a\u0004\u0018\u00010\tX\u0086\u000e¢\u0006\u0010\n\u0002\u0010#\u001a\u0004\b\u001f\u0010 \"\u0004\b!\u0010\"R\"\u0010\n\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u000bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b$\u0010%\"\u0004\b&\u0010'R\u001e\u0010\r\u001a\u0004\u0018\u00010\tX\u0086\u000e¢\u0006\u0010\n\u0002\u0010#\u001a\u0004\b(\u0010 \"\u0004\b)\u0010\"R\u001c\u0010\u000e\u001a\u0004\u0018\u00010\u000fX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b*\u0010+\"\u0004\b,\u0010-¨\u0006="}, d2 = {"Lcom/transsnet/palmpay/teller/bean/CheckTvItemRsp$DataBean;", "", "available", "", "fullName", "", "referenceId", "address", "minAmount", "", "items", "", "Lcom/transsnet/palmpay/teller/bean/CheckTvItemRsp$Item;", "renewalAmount", "item", "Lcom/transsnet/palmpay/teller/bean/TvListByCategoryIdResp$TvItemChildBean;", "<init>", "(Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;Ljava/util/List;Ljava/lang/Long;Lcom/transsnet/palmpay/teller/bean/TvListByCategoryIdResp$TvItemChildBean;)V", "getAvailable", "()Ljava/lang/Boolean;", "setAvailable", "(Ljava/lang/Boolean;)V", "Ljava/lang/Boolean;", "getFullName", "()Ljava/lang/String;", "setFullName", "(Ljava/lang/String;)V", "getReferenceId", "setReferenceId", "getAddress", "setAddress", "getMinAmount", "()Ljava/lang/Long;", "setMinAmount", "(Ljava/lang/Long;)V", "Ljava/lang/Long;", "getItems", "()Ljava/util/List;", "setItems", "(Ljava/util/List;)V", "getRenewalAmount", "setRenewalAmount", "getItem", "()Lcom/transsnet/palmpay/teller/bean/TvListByCategoryIdResp$TvItemChildBean;", "setItem", "(Lcom/transsnet/palmpay/teller/bean/TvListByCategoryIdResp$TvItemChildBean;)V", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "copy", "(Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;Ljava/util/List;Ljava/lang/Long;Lcom/transsnet/palmpay/teller/bean/TvListByCategoryIdResp$TvItemChildBean;)Lcom/transsnet/palmpay/teller/bean/CheckTvItemRsp$DataBean;", "equals", "other", "hashCode", "", "toString", "module_biller_export_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class DataBean {

        @Nullable
        private String address;

        @Nullable
        private Boolean available;

        @Nullable
        private String fullName;

        @Nullable
        private TvListByCategoryIdResp.TvItemChildBean item;

        @Nullable
        private List<Item> items;

        @Nullable
        private Long minAmount;

        @Nullable
        private String referenceId;

        @Nullable
        private Long renewalAmount;

        public DataBean() {
            this(null, null, null, null, null, null, null, null, 255, null);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ DataBean copy$default(DataBean dataBean, Boolean bool, String str, String str2, String str3, Long l5, List list, Long l6, TvListByCategoryIdResp.TvItemChildBean tvItemChildBean, int i7, Object obj) {
            if ((i7 & 1) != 0) {
                bool = dataBean.available;
            }
            if ((i7 & 2) != 0) {
                str = dataBean.fullName;
            }
            if ((i7 & 4) != 0) {
                str2 = dataBean.referenceId;
            }
            if ((i7 & 8) != 0) {
                str3 = dataBean.address;
            }
            if ((i7 & 16) != 0) {
                l5 = dataBean.minAmount;
            }
            if ((i7 & 32) != 0) {
                list = dataBean.items;
            }
            if ((i7 & 64) != 0) {
                l6 = dataBean.renewalAmount;
            }
            if ((i7 & 128) != 0) {
                tvItemChildBean = dataBean.item;
            }
            Long l8 = l6;
            TvListByCategoryIdResp.TvItemChildBean tvItemChildBean2 = tvItemChildBean;
            Long l10 = l5;
            List list2 = list;
            return dataBean.copy(bool, str, str2, str3, l10, list2, l8, tvItemChildBean2);
        }

        @Nullable
        /* JADX INFO: renamed from: component1, reason: from getter */
        public final Boolean getAvailable() {
            return this.available;
        }

        @Nullable
        /* JADX INFO: renamed from: component2, reason: from getter */
        public final String getFullName() {
            return this.fullName;
        }

        @Nullable
        /* JADX INFO: renamed from: component3, reason: from getter */
        public final String getReferenceId() {
            return this.referenceId;
        }

        @Nullable
        /* JADX INFO: renamed from: component4, reason: from getter */
        public final String getAddress() {
            return this.address;
        }

        @Nullable
        /* JADX INFO: renamed from: component5, reason: from getter */
        public final Long getMinAmount() {
            return this.minAmount;
        }

        @Nullable
        public final List<Item> component6() {
            return this.items;
        }

        @Nullable
        /* JADX INFO: renamed from: component7, reason: from getter */
        public final Long getRenewalAmount() {
            return this.renewalAmount;
        }

        @Nullable
        /* JADX INFO: renamed from: component8, reason: from getter */
        public final TvListByCategoryIdResp.TvItemChildBean getItem() {
            return this.item;
        }

        @NotNull
        public final DataBean copy(@Nullable Boolean available, @Nullable String fullName, @Nullable String referenceId, @Nullable String address, @Nullable Long minAmount, @Nullable List<Item> items, @Nullable Long renewalAmount, @Nullable TvListByCategoryIdResp.TvItemChildBean item) {
            return new DataBean(available, fullName, referenceId, address, minAmount, items, renewalAmount, item);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof DataBean)) {
                return false;
            }
            DataBean dataBean = (DataBean) other;
            return Intrinsics.c(this.available, dataBean.available) && Intrinsics.c(this.fullName, dataBean.fullName) && Intrinsics.c(this.referenceId, dataBean.referenceId) && Intrinsics.c(this.address, dataBean.address) && Intrinsics.c(this.minAmount, dataBean.minAmount) && Intrinsics.c(this.items, dataBean.items) && Intrinsics.c(this.renewalAmount, dataBean.renewalAmount) && Intrinsics.c(this.item, dataBean.item);
        }

        @Nullable
        public final String getAddress() {
            return this.address;
        }

        @Nullable
        public final Boolean getAvailable() {
            return this.available;
        }

        @Nullable
        public final String getFullName() {
            return this.fullName;
        }

        @Nullable
        public final TvListByCategoryIdResp.TvItemChildBean getItem() {
            return this.item;
        }

        @Nullable
        public final List<Item> getItems() {
            return this.items;
        }

        @Nullable
        public final Long getMinAmount() {
            return this.minAmount;
        }

        @Nullable
        public final String getReferenceId() {
            return this.referenceId;
        }

        @Nullable
        public final Long getRenewalAmount() {
            return this.renewalAmount;
        }

        public int hashCode() {
            Boolean bool = this.available;
            int iHashCode = (bool == null ? 0 : bool.hashCode()) * 31;
            String str = this.fullName;
            int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.referenceId;
            int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
            String str3 = this.address;
            int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
            Long l5 = this.minAmount;
            int iHashCode5 = (iHashCode4 + (l5 == null ? 0 : l5.hashCode())) * 31;
            List<Item> list = this.items;
            int iHashCode6 = (iHashCode5 + (list == null ? 0 : list.hashCode())) * 31;
            Long l6 = this.renewalAmount;
            int iHashCode7 = (iHashCode6 + (l6 == null ? 0 : l6.hashCode())) * 31;
            TvListByCategoryIdResp.TvItemChildBean tvItemChildBean = this.item;
            return iHashCode7 + (tvItemChildBean != null ? tvItemChildBean.hashCode() : 0);
        }

        public final void setAddress(@Nullable String str) {
            this.address = str;
        }

        public final void setAvailable(@Nullable Boolean bool) {
            this.available = bool;
        }

        public final void setFullName(@Nullable String str) {
            this.fullName = str;
        }

        public final void setItem(@Nullable TvListByCategoryIdResp.TvItemChildBean tvItemChildBean) {
            this.item = tvItemChildBean;
        }

        public final void setItems(@Nullable List<Item> list) {
            this.items = list;
        }

        public final void setMinAmount(@Nullable Long l5) {
            this.minAmount = l5;
        }

        public final void setReferenceId(@Nullable String str) {
            this.referenceId = str;
        }

        public final void setRenewalAmount(@Nullable Long l5) {
            this.renewalAmount = l5;
        }

        @NotNull
        public String toString() {
            Boolean bool = this.available;
            String str = this.fullName;
            String str2 = this.referenceId;
            String str3 = this.address;
            Long l5 = this.minAmount;
            List<Item> list = this.items;
            Long l6 = this.renewalAmount;
            TvListByCategoryIdResp.TvItemChildBean tvItemChildBean = this.item;
            StringBuilder sb2 = new StringBuilder("DataBean(available=");
            sb2.append(bool);
            sb2.append(", fullName=");
            sb2.append(str);
            sb2.append(", referenceId=");
            u.x(sb2, str2, ", address=", str3, ", minAmount=");
            sb2.append(l5);
            sb2.append(", items=");
            sb2.append(list);
            sb2.append(", renewalAmount=");
            sb2.append(l6);
            sb2.append(", item=");
            sb2.append(tvItemChildBean);
            sb2.append(")");
            return sb2.toString();
        }

        public DataBean(@Nullable Boolean bool, @Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable Long l5, @Nullable List<Item> list, @Nullable Long l6, @Nullable TvListByCategoryIdResp.TvItemChildBean tvItemChildBean) {
            this.available = bool;
            this.fullName = str;
            this.referenceId = str2;
            this.address = str3;
            this.minAmount = l5;
            this.items = list;
            this.renewalAmount = l6;
            this.item = tvItemChildBean;
        }

        public /* synthetic */ DataBean(Boolean bool, String str, String str2, String str3, Long l5, List list, Long l6, TvListByCategoryIdResp.TvItemChildBean tvItemChildBean, int i7, DefaultConstructorMarker defaultConstructorMarker) {
            this((i7 & 1) != 0 ? Boolean.FALSE : bool, (i7 & 2) != 0 ? null : str, (i7 & 4) != 0 ? null : str2, (i7 & 8) != 0 ? null : str3, (i7 & 16) != 0 ? 0L : l5, (i7 & 32) != 0 ? null : list, (i7 & 64) != 0 ? 0L : l6, (i7 & 128) != 0 ? null : tvItemChildBean);
        }
    }

    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000b\u0010\r\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u000e\u001a\u0004\u0018\u00010\u0003HÆ\u0003J!\u0010\u000f\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0003HÖ\u0001R\u001c\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\b\"\u0004\b\f\u0010\n¨\u0006\u0016"}, d2 = {"Lcom/transsnet/palmpay/teller/bean/CheckTvItemRsp$Item;", "", "key", "", "value", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "getKey", "()Ljava/lang/String;", "setKey", "(Ljava/lang/String;)V", "getValue", "setValue", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "module_biller_export_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class Item {

        @Nullable
        private String key;

        @Nullable
        private String value;

        public Item(@Nullable String str, @Nullable String str2) {
            this.key = str;
            this.value = str2;
        }

        public static /* synthetic */ Item copy$default(Item item, String str, String str2, int i7, Object obj) {
            if ((i7 & 1) != 0) {
                str = item.key;
            }
            if ((i7 & 2) != 0) {
                str2 = item.value;
            }
            return item.copy(str, str2);
        }

        @Nullable
        /* JADX INFO: renamed from: component1, reason: from getter */
        public final String getKey() {
            return this.key;
        }

        @Nullable
        /* JADX INFO: renamed from: component2, reason: from getter */
        public final String getValue() {
            return this.value;
        }

        @NotNull
        public final Item copy(@Nullable String key, @Nullable String value) {
            return new Item(key, value);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Item)) {
                return false;
            }
            Item item = (Item) other;
            return Intrinsics.c(this.key, item.key) && Intrinsics.c(this.value, item.value);
        }

        @Nullable
        public final String getKey() {
            return this.key;
        }

        @Nullable
        public final String getValue() {
            return this.value;
        }

        public int hashCode() {
            String str = this.key;
            int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
            String str2 = this.value;
            return iHashCode + (str2 != null ? str2.hashCode() : 0);
        }

        public final void setKey(@Nullable String str) {
            this.key = str;
        }

        public final void setValue(@Nullable String str) {
            this.value = str;
        }

        @NotNull
        public String toString() {
            return G.q("Item(key=", this.key, ", value=", this.value, ")");
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public CheckTvItemRsp() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    public static /* synthetic */ CheckTvItemRsp copy$default(CheckTvItemRsp checkTvItemRsp, DataBean dataBean, int i7, Object obj) {
        if ((i7 & 1) != 0) {
            dataBean = checkTvItemRsp.data;
        }
        return checkTvItemRsp.copy(dataBean);
    }

    @Nullable
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final DataBean getData() {
        return this.data;
    }

    @NotNull
    public final CheckTvItemRsp copy(@Nullable DataBean data) {
        return new CheckTvItemRsp(data);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof CheckTvItemRsp) && Intrinsics.c(this.data, ((CheckTvItemRsp) other).data);
    }

    @Nullable
    public final DataBean getData() {
        return this.data;
    }

    public int hashCode() {
        DataBean dataBean = this.data;
        if (dataBean == null) {
            return 0;
        }
        return dataBean.hashCode();
    }

    public final void setData(@Nullable DataBean dataBean) {
        this.data = dataBean;
    }

    @Override // com.transsnet.palmpay.core.bean.CommonResult
    @NotNull
    public String toString() {
        return "CheckTvItemRsp(data=" + this.data + ")";
    }

    public CheckTvItemRsp(@Nullable DataBean dataBean) {
        this.data = dataBean;
    }

    public /* synthetic */ CheckTvItemRsp(DataBean dataBean, int i7, DefaultConstructorMarker defaultConstructorMarker) {
        this((i7 & 1) != 0 ? null : dataBean);
    }
}
