package com.transsnet.palmpay.managemoney.bean.resp;

import com.google.firebase.messaging.Constants;
import com.transsnet.palmpay.core.bean.CommonResult;
import com.transsnet.palmpay.main.export.bean.rsp.SavingProduct;
import com.transsnet.palmpay.managemoney.bean.PayoutOption;
import com.transsnet.palmpay.managemoney.bean.ProductBean;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001:\u0001\bB\u0015\u0012\f\u0010\u0002\u001a\b\u0018\u00010\u0003R\u00020\u0000¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u0002\u001a\b\u0018\u00010\u0003R\u00020\u0000¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\t"}, d2 = {"Lcom/transsnet/palmpay/managemoney/bean/resp/GetIntroductionResp;", "Lcom/transsnet/palmpay/core/bean/CommonResult;", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "Lcom/transsnet/palmpay/managemoney/bean/resp/GetIntroductionResp$Data;", "<init>", "(Lcom/transsnet/palmpay/managemoney/bean/resp/GetIntroductionResp$Data;)V", "getData", "()Lcom/transsnet/palmpay/managemoney/bean/resp/GetIntroductionResp$Data;", "Data", "module_wealth_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class GetIntroductionResp extends CommonResult {

    @Nullable
    private final Data data;

    public GetIntroductionResp(@Nullable Data data) {
        this.data = data;
    }

    @Nullable
    public final Data getData() {
        return this.data;
    }

    @Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0016\b\u0086\u0004\u0018\u00002\u00020\u0001:\u0001+B§\u0001\u0012\u000e\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003\u0012\u0016\u0010\u0005\u001a\u0012\u0012\f\u0012\n0\u0006R\u00060\u0000R\u00020\u0007\u0018\u00010\u0003\u0012\u0016\u0010\b\u001a\u0012\u0012\f\u0012\n0\u0006R\u00060\u0000R\u00020\u0007\u0018\u00010\u0003\u0012\b\b\u0002\u0010\t\u001a\u00020\n\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\f\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f\u0012\u000e\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u0003\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\f\u0012\u001a\u0010\u0011\u001a\u0016\u0012\u0004\u0012\u00020\u0013\u0018\u00010\u0012j\n\u0012\u0004\u0012\u00020\u0013\u0018\u0001`\u0014\u0012\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u0016¢\u0006\u0004\b\u0017\u0010\u0018R\u0019\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR!\u0010\u0005\u001a\u0012\u0012\f\u0012\n0\u0006R\u00060\u0000R\u00020\u0007\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001aR!\u0010\b\u001a\u0012\u0012\f\u0012\n0\u0006R\u00060\u0000R\u00020\u0007\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001aR\u0011\u0010\t\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001eR\u0013\u0010\u000b\u001a\u0004\u0018\u00010\f¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010 R\u0013\u0010\r\u001a\u0004\u0018\u00010\f¢\u0006\b\n\u0000\u001a\u0004\b!\u0010 R\"\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\"\u0010\u001a\"\u0004\b#\u0010$R\u0013\u0010\u0010\u001a\u0004\u0018\u00010\f¢\u0006\b\n\u0000\u001a\u0004\b%\u0010 R%\u0010\u0011\u001a\u0016\u0012\u0004\u0012\u00020\u0013\u0018\u00010\u0012j\n\u0012\u0004\u0012\u00020\u0013\u0018\u0001`\u0014¢\u0006\b\n\u0000\u001a\u0004\b&\u0010'R\u0015\u0010\u0015\u001a\u0004\u0018\u00010\u0016¢\u0006\n\n\u0002\u0010*\u001a\u0004\b(\u0010)¨\u0006,"}, d2 = {"Lcom/transsnet/palmpay/managemoney/bean/resp/GetIntroductionResp$Data;", "", "productList", "", "Lcom/transsnet/palmpay/managemoney/bean/ProductBean;", "topBannerList", "Lcom/transsnet/palmpay/managemoney/bean/resp/GetIntroductionResp$Data$Banner;", "Lcom/transsnet/palmpay/managemoney/bean/resp/GetIntroductionResp;", "bottomBannerList", "allProductStatus", "", "noStockDescPic", "", "productListContent", "exclusiveList", "Lcom/transsnet/palmpay/main/export/bean/rsp/SavingProduct;", "exclusiveListContent", "payoutOptions", "Ljava/util/ArrayList;", "Lcom/transsnet/palmpay/managemoney/bean/PayoutOption;", "Lkotlin/collections/ArrayList;", "fixedSavingShow", "", "<init>", "(Lcom/transsnet/palmpay/managemoney/bean/resp/GetIntroductionResp;Ljava/util/List;Ljava/util/List;Ljava/util/List;ILjava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/util/ArrayList;Ljava/lang/Boolean;)V", "getProductList", "()Ljava/util/List;", "getTopBannerList", "getBottomBannerList", "getAllProductStatus", "()I", "getNoStockDescPic", "()Ljava/lang/String;", "getProductListContent", "getExclusiveList", "setExclusiveList", "(Ljava/util/List;)V", "getExclusiveListContent", "getPayoutOptions", "()Ljava/util/ArrayList;", "getFixedSavingShow", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "Banner", "module_wealth_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public final class Data {
        private final int allProductStatus;

        @Nullable
        private final List<Banner> bottomBannerList;

        @Nullable
        private List<SavingProduct> exclusiveList;

        @Nullable
        private final String exclusiveListContent;

        @Nullable
        private final Boolean fixedSavingShow;

        @Nullable
        private final String noStockDescPic;

        @Nullable
        private final ArrayList<PayoutOption> payoutOptions;

        @Nullable
        private final List<ProductBean> productList;

        @Nullable
        private final String productListContent;

        @Nullable
        private final List<Banner> topBannerList;

        @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0086\u0004\u0018\u00002\u00020\u0001B\u001b\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b¨\u0006\n"}, d2 = {"Lcom/transsnet/palmpay/managemoney/bean/resp/GetIntroductionResp$Data$Banner;", "", "picUrl", "", "jumpUrl", "<init>", "(Lcom/transsnet/palmpay/managemoney/bean/resp/GetIntroductionResp$Data;Ljava/lang/String;Ljava/lang/String;)V", "getPicUrl", "()Ljava/lang/String;", "getJumpUrl", "module_wealth_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public final class Banner {

            @Nullable
            private final String jumpUrl;

            @Nullable
            private final String picUrl;

            public Banner(@Nullable String str, String str2) {
                this.picUrl = str;
                this.jumpUrl = str2;
            }

            @Nullable
            public final String getJumpUrl() {
                return this.jumpUrl;
            }

            @Nullable
            public final String getPicUrl() {
                return this.picUrl;
            }
        }

        public Data(@Nullable List<ProductBean> list, @Nullable List<Banner> list2, List<Banner> list3, @Nullable int i7, @Nullable String str, @Nullable String str2, @Nullable List<SavingProduct> list4, @Nullable String str3, @Nullable ArrayList<PayoutOption> arrayList, Boolean bool) {
            this.productList = list;
            this.topBannerList = list2;
            this.bottomBannerList = list3;
            this.allProductStatus = i7;
            this.noStockDescPic = str;
            this.productListContent = str2;
            this.exclusiveList = list4;
            this.exclusiveListContent = str3;
            this.payoutOptions = arrayList;
            this.fixedSavingShow = bool;
        }

        public final int getAllProductStatus() {
            return this.allProductStatus;
        }

        @Nullable
        public final List<Banner> getBottomBannerList() {
            return this.bottomBannerList;
        }

        @Nullable
        public final List<SavingProduct> getExclusiveList() {
            return this.exclusiveList;
        }

        @Nullable
        public final String getExclusiveListContent() {
            return this.exclusiveListContent;
        }

        @Nullable
        public final Boolean getFixedSavingShow() {
            return this.fixedSavingShow;
        }

        @Nullable
        public final String getNoStockDescPic() {
            return this.noStockDescPic;
        }

        @Nullable
        public final ArrayList<PayoutOption> getPayoutOptions() {
            return this.payoutOptions;
        }

        @Nullable
        public final List<ProductBean> getProductList() {
            return this.productList;
        }

        @Nullable
        public final String getProductListContent() {
            return this.productListContent;
        }

        @Nullable
        public final List<Banner> getTopBannerList() {
            return this.topBannerList;
        }

        public final void setExclusiveList(@Nullable List<SavingProduct> list) {
            this.exclusiveList = list;
        }

        public /* synthetic */ Data(GetIntroductionResp getIntroductionResp, List list, List list2, List list3, int i7, String str, String str2, List list4, String str3, ArrayList arrayList, Boolean bool, int i10, DefaultConstructorMarker defaultConstructorMarker) {
            this(list, list2, list3, (i10 & 8) != 0 ? 4 : i7, str, str2, list4, str3, arrayList, (i10 & 512) != 0 ? Boolean.TRUE : bool);
        }
    }
}
