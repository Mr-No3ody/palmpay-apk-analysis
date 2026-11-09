package com.transsnet.palmpay.teller.bean.resp;

import C0.G;
import N8.q0;
import androidx.camera.camera2.internal.F;
import androidx.camera.video.u;
import com.facebook.react.fabric.mounting.mountitems.IntBufferBatchMountItem;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.google.firebase.messaging.Constants;
import com.transsnet.palmpay.core.bean.CommonResult;
import com.transsnet.palmpay.teller.bean.CheckCustomerIdRsp;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001:\u0003\u0012\u0013\u0014B\u0011\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u000b\u0010\b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0015\u0010\t\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0015"}, d2 = {"Lcom/transsnet/palmpay/teller/bean/resp/QueryCustomerIdIsExitResp;", "Lcom/transsnet/palmpay/core/bean/CommonResult;", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "Lcom/transsnet/palmpay/teller/bean/resp/QueryCustomerIdIsExitResp$DataBean;", "<init>", "(Lcom/transsnet/palmpay/teller/bean/resp/QueryCustomerIdIsExitResp$DataBean;)V", "getData", "()Lcom/transsnet/palmpay/teller/bean/resp/QueryCustomerIdIsExitResp$DataBean;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "DataBean", "CustomerInfoBean", "RenewalInfoBean", "module_biller_export_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final /* data */ class QueryCustomerIdIsExitResp extends CommonResult {

    @Nullable
    private final DataBean data;

    @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b.\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001Bg\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\u0010\n\u001a\u0004\u0018\u00010\b\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0005\u0012\u000e\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\r\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u00101\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u0014J\u000b\u00102\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u00103\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u0010\u00104\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0002\u0010\u001fJ\u0010\u00105\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0002\u0010\u001fJ\u0010\u00106\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0002\u0010\u001fJ\u000b\u00107\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u0011\u00108\u001a\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\rHÆ\u0003J\u000b\u00109\u001a\u0004\u0018\u00010\u0010HÆ\u0003J\u0080\u0001\u0010:\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00052\u0010\b\u0002\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\r2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0010HÆ\u0001¢\u0006\u0002\u0010;J\u0013\u0010<\u001a\u00020\u00032\b\u0010=\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010>\u001a\u00020?HÖ\u0001J\t\u0010@\u001a\u00020\u0005HÖ\u0001R\u001e\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u0010\n\u0002\u0010\u0017\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001bR\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001c\u0010\u0019\"\u0004\b\u001d\u0010\u001bR\u001e\u0010\u0007\u001a\u0004\u0018\u00010\bX\u0086\u000e¢\u0006\u0010\n\u0002\u0010\"\u001a\u0004\b\u001e\u0010\u001f\"\u0004\b \u0010!R\u001e\u0010\t\u001a\u0004\u0018\u00010\bX\u0086\u000e¢\u0006\u0010\n\u0002\u0010\"\u001a\u0004\b#\u0010\u001f\"\u0004\b$\u0010!R\u001e\u0010\n\u001a\u0004\u0018\u00010\bX\u0086\u000e¢\u0006\u0010\n\u0002\u0010\"\u001a\u0004\b%\u0010\u001f\"\u0004\b&\u0010!R\u001c\u0010\u000b\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b'\u0010\u0019\"\u0004\b(\u0010\u001bR\"\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\rX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b)\u0010*\"\u0004\b+\u0010,R\u001c\u0010\u000f\u001a\u0004\u0018\u00010\u0010X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b-\u0010.\"\u0004\b/\u00100¨\u0006A"}, d2 = {"Lcom/transsnet/palmpay/teller/bean/resp/QueryCustomerIdIsExitResp$CustomerInfoBean;", "", "available", "", "fullName", "", "address", "renewalAmount", "", "outstanding", "minAmount", "referenceId", "items", "", "Lcom/transsnet/palmpay/teller/bean/CheckCustomerIdRsp$Item;", "renewalInfo", "Lcom/transsnet/palmpay/teller/bean/resp/QueryCustomerIdIsExitResp$RenewalInfoBean;", "<init>", "(Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/String;Ljava/util/List;Lcom/transsnet/palmpay/teller/bean/resp/QueryCustomerIdIsExitResp$RenewalInfoBean;)V", "getAvailable", "()Ljava/lang/Boolean;", "setAvailable", "(Ljava/lang/Boolean;)V", "Ljava/lang/Boolean;", "getFullName", "()Ljava/lang/String;", "setFullName", "(Ljava/lang/String;)V", "getAddress", "setAddress", "getRenewalAmount", "()Ljava/lang/Long;", "setRenewalAmount", "(Ljava/lang/Long;)V", "Ljava/lang/Long;", "getOutstanding", "setOutstanding", "getMinAmount", "setMinAmount", "getReferenceId", "setReferenceId", "getItems", "()Ljava/util/List;", "setItems", "(Ljava/util/List;)V", "getRenewalInfo", "()Lcom/transsnet/palmpay/teller/bean/resp/QueryCustomerIdIsExitResp$RenewalInfoBean;", "setRenewalInfo", "(Lcom/transsnet/palmpay/teller/bean/resp/QueryCustomerIdIsExitResp$RenewalInfoBean;)V", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "(Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/String;Ljava/util/List;Lcom/transsnet/palmpay/teller/bean/resp/QueryCustomerIdIsExitResp$RenewalInfoBean;)Lcom/transsnet/palmpay/teller/bean/resp/QueryCustomerIdIsExitResp$CustomerInfoBean;", "equals", "other", "hashCode", "", "toString", "module_biller_export_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class CustomerInfoBean {

        @Nullable
        private String address;

        @Nullable
        private Boolean available;

        @Nullable
        private String fullName;

        @Nullable
        private List<? extends CheckCustomerIdRsp.Item> items;

        @Nullable
        private Long minAmount;

        @Nullable
        private Long outstanding;

        @Nullable
        private String referenceId;

        @Nullable
        private Long renewalAmount;

        @Nullable
        private RenewalInfoBean renewalInfo;

        public CustomerInfoBean(@Nullable Boolean bool, @Nullable String str, @Nullable String str2, @Nullable Long l5, @Nullable Long l6, @Nullable Long l8, @Nullable String str3, @Nullable List<? extends CheckCustomerIdRsp.Item> list, @Nullable RenewalInfoBean renewalInfoBean) {
            this.available = bool;
            this.fullName = str;
            this.address = str2;
            this.renewalAmount = l5;
            this.outstanding = l6;
            this.minAmount = l8;
            this.referenceId = str3;
            this.items = list;
            this.renewalInfo = renewalInfoBean;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ CustomerInfoBean copy$default(CustomerInfoBean customerInfoBean, Boolean bool, String str, String str2, Long l5, Long l6, Long l8, String str3, List list, RenewalInfoBean renewalInfoBean, int i7, Object obj) {
            if ((i7 & 1) != 0) {
                bool = customerInfoBean.available;
            }
            if ((i7 & 2) != 0) {
                str = customerInfoBean.fullName;
            }
            if ((i7 & 4) != 0) {
                str2 = customerInfoBean.address;
            }
            if ((i7 & 8) != 0) {
                l5 = customerInfoBean.renewalAmount;
            }
            if ((i7 & 16) != 0) {
                l6 = customerInfoBean.outstanding;
            }
            if ((i7 & 32) != 0) {
                l8 = customerInfoBean.minAmount;
            }
            if ((i7 & 64) != 0) {
                str3 = customerInfoBean.referenceId;
            }
            if ((i7 & 128) != 0) {
                list = customerInfoBean.items;
            }
            if ((i7 & IntBufferBatchMountItem.INSTRUCTION_UPDATE_EVENT_EMITTER) != 0) {
                renewalInfoBean = customerInfoBean.renewalInfo;
            }
            List list2 = list;
            RenewalInfoBean renewalInfoBean2 = renewalInfoBean;
            Long l10 = l8;
            String str4 = str3;
            Long l11 = l6;
            String str5 = str2;
            return customerInfoBean.copy(bool, str, str5, l5, l11, l10, str4, list2, renewalInfoBean2);
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
        public final String getAddress() {
            return this.address;
        }

        @Nullable
        /* JADX INFO: renamed from: component4, reason: from getter */
        public final Long getRenewalAmount() {
            return this.renewalAmount;
        }

        @Nullable
        /* JADX INFO: renamed from: component5, reason: from getter */
        public final Long getOutstanding() {
            return this.outstanding;
        }

        @Nullable
        /* JADX INFO: renamed from: component6, reason: from getter */
        public final Long getMinAmount() {
            return this.minAmount;
        }

        @Nullable
        /* JADX INFO: renamed from: component7, reason: from getter */
        public final String getReferenceId() {
            return this.referenceId;
        }

        @Nullable
        public final List<CheckCustomerIdRsp.Item> component8() {
            return this.items;
        }

        @Nullable
        /* JADX INFO: renamed from: component9, reason: from getter */
        public final RenewalInfoBean getRenewalInfo() {
            return this.renewalInfo;
        }

        @NotNull
        public final CustomerInfoBean copy(@Nullable Boolean available, @Nullable String fullName, @Nullable String address, @Nullable Long renewalAmount, @Nullable Long outstanding, @Nullable Long minAmount, @Nullable String referenceId, @Nullable List<? extends CheckCustomerIdRsp.Item> items, @Nullable RenewalInfoBean renewalInfo) {
            return new CustomerInfoBean(available, fullName, address, renewalAmount, outstanding, minAmount, referenceId, items, renewalInfo);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof CustomerInfoBean)) {
                return false;
            }
            CustomerInfoBean customerInfoBean = (CustomerInfoBean) other;
            return Intrinsics.c(this.available, customerInfoBean.available) && Intrinsics.c(this.fullName, customerInfoBean.fullName) && Intrinsics.c(this.address, customerInfoBean.address) && Intrinsics.c(this.renewalAmount, customerInfoBean.renewalAmount) && Intrinsics.c(this.outstanding, customerInfoBean.outstanding) && Intrinsics.c(this.minAmount, customerInfoBean.minAmount) && Intrinsics.c(this.referenceId, customerInfoBean.referenceId) && Intrinsics.c(this.items, customerInfoBean.items) && Intrinsics.c(this.renewalInfo, customerInfoBean.renewalInfo);
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
        public final List<CheckCustomerIdRsp.Item> getItems() {
            return this.items;
        }

        @Nullable
        public final Long getMinAmount() {
            return this.minAmount;
        }

        @Nullable
        public final Long getOutstanding() {
            return this.outstanding;
        }

        @Nullable
        public final String getReferenceId() {
            return this.referenceId;
        }

        @Nullable
        public final Long getRenewalAmount() {
            return this.renewalAmount;
        }

        @Nullable
        public final RenewalInfoBean getRenewalInfo() {
            return this.renewalInfo;
        }

        public int hashCode() {
            Boolean bool = this.available;
            int iHashCode = (bool == null ? 0 : bool.hashCode()) * 31;
            String str = this.fullName;
            int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.address;
            int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
            Long l5 = this.renewalAmount;
            int iHashCode4 = (iHashCode3 + (l5 == null ? 0 : l5.hashCode())) * 31;
            Long l6 = this.outstanding;
            int iHashCode5 = (iHashCode4 + (l6 == null ? 0 : l6.hashCode())) * 31;
            Long l8 = this.minAmount;
            int iHashCode6 = (iHashCode5 + (l8 == null ? 0 : l8.hashCode())) * 31;
            String str3 = this.referenceId;
            int iHashCode7 = (iHashCode6 + (str3 == null ? 0 : str3.hashCode())) * 31;
            List<? extends CheckCustomerIdRsp.Item> list = this.items;
            int iHashCode8 = (iHashCode7 + (list == null ? 0 : list.hashCode())) * 31;
            RenewalInfoBean renewalInfoBean = this.renewalInfo;
            return iHashCode8 + (renewalInfoBean != null ? renewalInfoBean.hashCode() : 0);
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

        public final void setItems(@Nullable List<? extends CheckCustomerIdRsp.Item> list) {
            this.items = list;
        }

        public final void setMinAmount(@Nullable Long l5) {
            this.minAmount = l5;
        }

        public final void setOutstanding(@Nullable Long l5) {
            this.outstanding = l5;
        }

        public final void setReferenceId(@Nullable String str) {
            this.referenceId = str;
        }

        public final void setRenewalAmount(@Nullable Long l5) {
            this.renewalAmount = l5;
        }

        public final void setRenewalInfo(@Nullable RenewalInfoBean renewalInfoBean) {
            this.renewalInfo = renewalInfoBean;
        }

        @NotNull
        public String toString() {
            Boolean bool = this.available;
            String str = this.fullName;
            String str2 = this.address;
            Long l5 = this.renewalAmount;
            Long l6 = this.outstanding;
            Long l8 = this.minAmount;
            String str3 = this.referenceId;
            List<? extends CheckCustomerIdRsp.Item> list = this.items;
            RenewalInfoBean renewalInfoBean = this.renewalInfo;
            StringBuilder sb2 = new StringBuilder("CustomerInfoBean(available=");
            sb2.append(bool);
            sb2.append(", fullName=");
            sb2.append(str);
            sb2.append(", address=");
            sb2.append(str2);
            sb2.append(", renewalAmount=");
            sb2.append(l5);
            sb2.append(", outstanding=");
            q0.w(sb2, l6, ", minAmount=", l8, ", referenceId=");
            sb2.append(str3);
            sb2.append(", items=");
            sb2.append(list);
            sb2.append(", renewalInfo=");
            sb2.append(renewalInfoBean);
            sb2.append(")");
            return sb2.toString();
        }
    }

    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b+\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001BW\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010&\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u0010J\u000b\u0010'\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010(\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u000b\u0010)\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010*\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010+\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010,\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010-\u001a\u0004\u0018\u00010\u0005HÆ\u0003Jn\u0010.\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0005HÆ\u0001¢\u0006\u0002\u0010/J\u0013\u00100\u001a\u00020\u00032\b\u00101\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u00102\u001a\u000203HÖ\u0001J\t\u00104\u001a\u00020\u0005HÖ\u0001R\u001e\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u0010\n\u0002\u0010\u0013\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001bR\u001c\u0010\b\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001c\u0010\u0015\"\u0004\b\u001d\u0010\u0017R\u001c\u0010\t\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001e\u0010\u0015\"\u0004\b\u001f\u0010\u0017R\u001c\u0010\n\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b \u0010\u0015\"\u0004\b!\u0010\u0017R\u001c\u0010\u000b\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\"\u0010\u0015\"\u0004\b#\u0010\u0017R\u001c\u0010\f\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b$\u0010\u0015\"\u0004\b%\u0010\u0017¨\u00065"}, d2 = {"Lcom/transsnet/palmpay/teller/bean/resp/QueryCustomerIdIsExitResp$DataBean;", "", "familyAccountExist", "", "errorInfo", "", "customerInfo", "Lcom/transsnet/palmpay/teller/bean/resp/QueryCustomerIdIsExitResp$CustomerInfoBean;", "customerId", "billerId", "billerName", "billerLogo", "userIdTips", "<init>", "(Ljava/lang/Boolean;Ljava/lang/String;Lcom/transsnet/palmpay/teller/bean/resp/QueryCustomerIdIsExitResp$CustomerInfoBean;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getFamilyAccountExist", "()Ljava/lang/Boolean;", "setFamilyAccountExist", "(Ljava/lang/Boolean;)V", "Ljava/lang/Boolean;", "getErrorInfo", "()Ljava/lang/String;", "setErrorInfo", "(Ljava/lang/String;)V", "getCustomerInfo", "()Lcom/transsnet/palmpay/teller/bean/resp/QueryCustomerIdIsExitResp$CustomerInfoBean;", "setCustomerInfo", "(Lcom/transsnet/palmpay/teller/bean/resp/QueryCustomerIdIsExitResp$CustomerInfoBean;)V", "getCustomerId", "setCustomerId", "getBillerId", "setBillerId", "getBillerName", "setBillerName", "getBillerLogo", "setBillerLogo", "getUserIdTips", "setUserIdTips", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "copy", "(Ljava/lang/Boolean;Ljava/lang/String;Lcom/transsnet/palmpay/teller/bean/resp/QueryCustomerIdIsExitResp$CustomerInfoBean;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/transsnet/palmpay/teller/bean/resp/QueryCustomerIdIsExitResp$DataBean;", "equals", "other", "hashCode", "", "toString", "module_biller_export_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class DataBean {

        @Nullable
        private String billerId;

        @Nullable
        private String billerLogo;

        @Nullable
        private String billerName;

        @Nullable
        private String customerId;

        @Nullable
        private CustomerInfoBean customerInfo;

        @Nullable
        private String errorInfo;

        @Nullable
        private Boolean familyAccountExist;

        @Nullable
        private String userIdTips;

        public DataBean(@Nullable Boolean bool, @Nullable String str, @Nullable CustomerInfoBean customerInfoBean, @Nullable String str2, @Nullable String str3, @Nullable String str4, @Nullable String str5, @Nullable String str6) {
            this.familyAccountExist = bool;
            this.errorInfo = str;
            this.customerInfo = customerInfoBean;
            this.customerId = str2;
            this.billerId = str3;
            this.billerName = str4;
            this.billerLogo = str5;
            this.userIdTips = str6;
        }

        public static /* synthetic */ DataBean copy$default(DataBean dataBean, Boolean bool, String str, CustomerInfoBean customerInfoBean, String str2, String str3, String str4, String str5, String str6, int i7, Object obj) {
            if ((i7 & 1) != 0) {
                bool = dataBean.familyAccountExist;
            }
            if ((i7 & 2) != 0) {
                str = dataBean.errorInfo;
            }
            if ((i7 & 4) != 0) {
                customerInfoBean = dataBean.customerInfo;
            }
            if ((i7 & 8) != 0) {
                str2 = dataBean.customerId;
            }
            if ((i7 & 16) != 0) {
                str3 = dataBean.billerId;
            }
            if ((i7 & 32) != 0) {
                str4 = dataBean.billerName;
            }
            if ((i7 & 64) != 0) {
                str5 = dataBean.billerLogo;
            }
            if ((i7 & 128) != 0) {
                str6 = dataBean.userIdTips;
            }
            String str7 = str5;
            String str8 = str6;
            String str9 = str3;
            String str10 = str4;
            return dataBean.copy(bool, str, customerInfoBean, str2, str9, str10, str7, str8);
        }

        @Nullable
        /* JADX INFO: renamed from: component1, reason: from getter */
        public final Boolean getFamilyAccountExist() {
            return this.familyAccountExist;
        }

        @Nullable
        /* JADX INFO: renamed from: component2, reason: from getter */
        public final String getErrorInfo() {
            return this.errorInfo;
        }

        @Nullable
        /* JADX INFO: renamed from: component3, reason: from getter */
        public final CustomerInfoBean getCustomerInfo() {
            return this.customerInfo;
        }

        @Nullable
        /* JADX INFO: renamed from: component4, reason: from getter */
        public final String getCustomerId() {
            return this.customerId;
        }

        @Nullable
        /* JADX INFO: renamed from: component5, reason: from getter */
        public final String getBillerId() {
            return this.billerId;
        }

        @Nullable
        /* JADX INFO: renamed from: component6, reason: from getter */
        public final String getBillerName() {
            return this.billerName;
        }

        @Nullable
        /* JADX INFO: renamed from: component7, reason: from getter */
        public final String getBillerLogo() {
            return this.billerLogo;
        }

        @Nullable
        /* JADX INFO: renamed from: component8, reason: from getter */
        public final String getUserIdTips() {
            return this.userIdTips;
        }

        @NotNull
        public final DataBean copy(@Nullable Boolean familyAccountExist, @Nullable String errorInfo, @Nullable CustomerInfoBean customerInfo, @Nullable String customerId, @Nullable String billerId, @Nullable String billerName, @Nullable String billerLogo, @Nullable String userIdTips) {
            return new DataBean(familyAccountExist, errorInfo, customerInfo, customerId, billerId, billerName, billerLogo, userIdTips);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof DataBean)) {
                return false;
            }
            DataBean dataBean = (DataBean) other;
            return Intrinsics.c(this.familyAccountExist, dataBean.familyAccountExist) && Intrinsics.c(this.errorInfo, dataBean.errorInfo) && Intrinsics.c(this.customerInfo, dataBean.customerInfo) && Intrinsics.c(this.customerId, dataBean.customerId) && Intrinsics.c(this.billerId, dataBean.billerId) && Intrinsics.c(this.billerName, dataBean.billerName) && Intrinsics.c(this.billerLogo, dataBean.billerLogo) && Intrinsics.c(this.userIdTips, dataBean.userIdTips);
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
        public final String getCustomerId() {
            return this.customerId;
        }

        @Nullable
        public final CustomerInfoBean getCustomerInfo() {
            return this.customerInfo;
        }

        @Nullable
        public final String getErrorInfo() {
            return this.errorInfo;
        }

        @Nullable
        public final Boolean getFamilyAccountExist() {
            return this.familyAccountExist;
        }

        @Nullable
        public final String getUserIdTips() {
            return this.userIdTips;
        }

        public int hashCode() {
            Boolean bool = this.familyAccountExist;
            int iHashCode = (bool == null ? 0 : bool.hashCode()) * 31;
            String str = this.errorInfo;
            int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
            CustomerInfoBean customerInfoBean = this.customerInfo;
            int iHashCode3 = (iHashCode2 + (customerInfoBean == null ? 0 : customerInfoBean.hashCode())) * 31;
            String str2 = this.customerId;
            int iHashCode4 = (iHashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
            String str3 = this.billerId;
            int iHashCode5 = (iHashCode4 + (str3 == null ? 0 : str3.hashCode())) * 31;
            String str4 = this.billerName;
            int iHashCode6 = (iHashCode5 + (str4 == null ? 0 : str4.hashCode())) * 31;
            String str5 = this.billerLogo;
            int iHashCode7 = (iHashCode6 + (str5 == null ? 0 : str5.hashCode())) * 31;
            String str6 = this.userIdTips;
            return iHashCode7 + (str6 != null ? str6.hashCode() : 0);
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

        public final void setCustomerId(@Nullable String str) {
            this.customerId = str;
        }

        public final void setCustomerInfo(@Nullable CustomerInfoBean customerInfoBean) {
            this.customerInfo = customerInfoBean;
        }

        public final void setErrorInfo(@Nullable String str) {
            this.errorInfo = str;
        }

        public final void setFamilyAccountExist(@Nullable Boolean bool) {
            this.familyAccountExist = bool;
        }

        public final void setUserIdTips(@Nullable String str) {
            this.userIdTips = str;
        }

        @NotNull
        public String toString() {
            Boolean bool = this.familyAccountExist;
            String str = this.errorInfo;
            CustomerInfoBean customerInfoBean = this.customerInfo;
            String str2 = this.customerId;
            String str3 = this.billerId;
            String str4 = this.billerName;
            String str5 = this.billerLogo;
            String str6 = this.userIdTips;
            StringBuilder sb2 = new StringBuilder("DataBean(familyAccountExist=");
            sb2.append(bool);
            sb2.append(", errorInfo=");
            sb2.append(str);
            sb2.append(", customerInfo=");
            sb2.append(customerInfoBean);
            sb2.append(", customerId=");
            sb2.append(str2);
            sb2.append(", billerId=");
            u.x(sb2, str3, ", billerName=", str4, ", billerLogo=");
            return G.s(sb2, str5, ", userIdTips=", str6, ")");
        }
    }

    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u001a\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001BC\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\t\u0010\nJ\u000b\u0010\u001a\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001c\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010\u001d\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0002\u0010\u0014J\u0010\u0010\u001e\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0002\u0010\u0014JJ\u0010\u001f\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007HÆ\u0001¢\u0006\u0002\u0010 J\u0013\u0010!\u001a\u00020\"2\b\u0010#\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010$\u001a\u00020%HÖ\u0001J\t\u0010&\u001a\u00020\u0003HÖ\u0001R\u001c\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\f\"\u0004\b\u0010\u0010\u000eR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\f\"\u0004\b\u0012\u0010\u000eR\u001e\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u0086\u000e¢\u0006\u0010\n\u0002\u0010\u0017\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R\u001e\u0010\b\u001a\u0004\u0018\u00010\u0007X\u0086\u000e¢\u0006\u0010\n\u0002\u0010\u0017\u001a\u0004\b\u0018\u0010\u0014\"\u0004\b\u0019\u0010\u0016¨\u0006'"}, d2 = {"Lcom/transsnet/palmpay/teller/bean/resp/QueryCustomerIdIsExitResp$RenewalInfoBean;", "", "dueDate", "", "itemId", "itemName", FirebaseAnalytics.Param.PRICE, "", "renewalAmount", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/Long;)V", "getDueDate", "()Ljava/lang/String;", "setDueDate", "(Ljava/lang/String;)V", "getItemId", "setItemId", "getItemName", "setItemName", "getPrice", "()Ljava/lang/Long;", "setPrice", "(Ljava/lang/Long;)V", "Ljava/lang/Long;", "getRenewalAmount", "setRenewalAmount", "component1", "component2", "component3", "component4", "component5", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/Long;)Lcom/transsnet/palmpay/teller/bean/resp/QueryCustomerIdIsExitResp$RenewalInfoBean;", "equals", "", "other", "hashCode", "", "toString", "module_biller_export_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class RenewalInfoBean {

        @Nullable
        private String dueDate;

        @Nullable
        private String itemId;

        @Nullable
        private String itemName;

        @Nullable
        private Long price;

        @Nullable
        private Long renewalAmount;

        public RenewalInfoBean() {
            this(null, null, null, null, null, 31, null);
        }

        public static /* synthetic */ RenewalInfoBean copy$default(RenewalInfoBean renewalInfoBean, String str, String str2, String str3, Long l5, Long l6, int i7, Object obj) {
            if ((i7 & 1) != 0) {
                str = renewalInfoBean.dueDate;
            }
            if ((i7 & 2) != 0) {
                str2 = renewalInfoBean.itemId;
            }
            if ((i7 & 4) != 0) {
                str3 = renewalInfoBean.itemName;
            }
            if ((i7 & 8) != 0) {
                l5 = renewalInfoBean.price;
            }
            if ((i7 & 16) != 0) {
                l6 = renewalInfoBean.renewalAmount;
            }
            Long l8 = l6;
            String str4 = str3;
            return renewalInfoBean.copy(str, str2, str4, l5, l8);
        }

        @Nullable
        /* JADX INFO: renamed from: component1, reason: from getter */
        public final String getDueDate() {
            return this.dueDate;
        }

        @Nullable
        /* JADX INFO: renamed from: component2, reason: from getter */
        public final String getItemId() {
            return this.itemId;
        }

        @Nullable
        /* JADX INFO: renamed from: component3, reason: from getter */
        public final String getItemName() {
            return this.itemName;
        }

        @Nullable
        /* JADX INFO: renamed from: component4, reason: from getter */
        public final Long getPrice() {
            return this.price;
        }

        @Nullable
        /* JADX INFO: renamed from: component5, reason: from getter */
        public final Long getRenewalAmount() {
            return this.renewalAmount;
        }

        @NotNull
        public final RenewalInfoBean copy(@Nullable String dueDate, @Nullable String itemId, @Nullable String itemName, @Nullable Long price, @Nullable Long renewalAmount) {
            return new RenewalInfoBean(dueDate, itemId, itemName, price, renewalAmount);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof RenewalInfoBean)) {
                return false;
            }
            RenewalInfoBean renewalInfoBean = (RenewalInfoBean) other;
            return Intrinsics.c(this.dueDate, renewalInfoBean.dueDate) && Intrinsics.c(this.itemId, renewalInfoBean.itemId) && Intrinsics.c(this.itemName, renewalInfoBean.itemName) && Intrinsics.c(this.price, renewalInfoBean.price) && Intrinsics.c(this.renewalAmount, renewalInfoBean.renewalAmount);
        }

        @Nullable
        public final String getDueDate() {
            return this.dueDate;
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
        public final Long getPrice() {
            return this.price;
        }

        @Nullable
        public final Long getRenewalAmount() {
            return this.renewalAmount;
        }

        public int hashCode() {
            String str = this.dueDate;
            int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
            String str2 = this.itemId;
            int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
            String str3 = this.itemName;
            int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
            Long l5 = this.price;
            int iHashCode4 = (iHashCode3 + (l5 == null ? 0 : l5.hashCode())) * 31;
            Long l6 = this.renewalAmount;
            return iHashCode4 + (l6 != null ? l6.hashCode() : 0);
        }

        public final void setDueDate(@Nullable String str) {
            this.dueDate = str;
        }

        public final void setItemId(@Nullable String str) {
            this.itemId = str;
        }

        public final void setItemName(@Nullable String str) {
            this.itemName = str;
        }

        public final void setPrice(@Nullable Long l5) {
            this.price = l5;
        }

        public final void setRenewalAmount(@Nullable Long l5) {
            this.renewalAmount = l5;
        }

        @NotNull
        public String toString() {
            String str = this.dueDate;
            String str2 = this.itemId;
            String str3 = this.itemName;
            Long l5 = this.price;
            Long l6 = this.renewalAmount;
            StringBuilder sbF = F.f("RenewalInfoBean(dueDate=", str, ", itemId=", str2, ", itemName=");
            sbF.append(str3);
            sbF.append(", price=");
            sbF.append(l5);
            sbF.append(", renewalAmount=");
            sbF.append(l6);
            sbF.append(")");
            return sbF.toString();
        }

        public RenewalInfoBean(@Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable Long l5, @Nullable Long l6) {
            this.dueDate = str;
            this.itemId = str2;
            this.itemName = str3;
            this.price = l5;
            this.renewalAmount = l6;
        }

        public /* synthetic */ RenewalInfoBean(String str, String str2, String str3, Long l5, Long l6, int i7, DefaultConstructorMarker defaultConstructorMarker) {
            this((i7 & 1) != 0 ? "" : str, (i7 & 2) != 0 ? "" : str2, (i7 & 4) != 0 ? "" : str3, (i7 & 8) != 0 ? 0L : l5, (i7 & 16) != 0 ? 0L : l6);
        }
    }

    public QueryCustomerIdIsExitResp(@Nullable DataBean dataBean) {
        this.data = dataBean;
    }

    public static /* synthetic */ QueryCustomerIdIsExitResp copy$default(QueryCustomerIdIsExitResp queryCustomerIdIsExitResp, DataBean dataBean, int i7, Object obj) {
        if ((i7 & 1) != 0) {
            dataBean = queryCustomerIdIsExitResp.data;
        }
        return queryCustomerIdIsExitResp.copy(dataBean);
    }

    @Nullable
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final DataBean getData() {
        return this.data;
    }

    @NotNull
    public final QueryCustomerIdIsExitResp copy(@Nullable DataBean data) {
        return new QueryCustomerIdIsExitResp(data);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof QueryCustomerIdIsExitResp) && Intrinsics.c(this.data, ((QueryCustomerIdIsExitResp) other).data);
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

    @Override // com.transsnet.palmpay.core.bean.CommonResult
    @NotNull
    public String toString() {
        return "QueryCustomerIdIsExitResp(data=" + this.data + ")";
    }
}
