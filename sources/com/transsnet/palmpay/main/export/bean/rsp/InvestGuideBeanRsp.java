package com.transsnet.palmpay.main.export.bean.rsp;

import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.JvmField;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001:\u0002\u0010\u0011B\u0007¢\u0006\u0004\b\u0002\u0010\u0003R\u001a\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00058\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u0004\u0018\u00010\b8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0018\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\n8\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0018\u0010\f\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0018\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\u000f\u0018\u00010\n8\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u0012"}, d2 = {"Lcom/transsnet/palmpay/main/export/bean/rsp/InvestGuideBeanRsp;", "", "<init>", "()V", "labelList", "", "Lcom/transsnet/palmpay/main/export/bean/rsp/InvestGuideBeanRsp$LabelList;", "savingRecommendContentInfo", "Lcom/transsnet/palmpay/main/export/bean/rsp/QueryRecommendModuleResp;", "productList", "", "Lcom/transsnet/palmpay/main/export/bean/rsp/ProductData;", "wealthCommentList", "Lcom/transsnet/palmpay/main/export/bean/rsp/InvestGuideBeanRsp$WealthCommentList;", "recommendList", "Lcom/transsnet/palmpay/main/export/bean/rsp/RecommendProduct;", "LabelList", "WealthCommentList", "module_main_export_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class InvestGuideBeanRsp {

    @JvmField
    @Nullable
    public List<LabelList> labelList;

    @JvmField
    @Nullable
    public final List<ProductData> productList;

    @JvmField
    @Nullable
    public final List<RecommendProduct> recommendList;

    @JvmField
    @Nullable
    public QueryRecommendModuleResp savingRecommendContentInfo;

    @JvmField
    @Nullable
    public final List<WealthCommentList> wealthCommentList;

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0004\u001a\u0004\u0018\u00010\u00058\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u0004\u0018\u00010\u00058\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000¨\u0006\b"}, d2 = {"Lcom/transsnet/palmpay/main/export/bean/rsp/InvestGuideBeanRsp$LabelList;", "", "<init>", "()V", "iconUrl", "", "iconDarkModeUrl", "title", "module_main_export_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class LabelList {

        @JvmField
        @Nullable
        public String iconDarkModeUrl;

        @JvmField
        @Nullable
        public String iconUrl;

        @JvmField
        @Nullable
        public String title;
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0004\u001a\u0004\u0018\u00010\u00058\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u0004\u0018\u00010\u00058\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000¨\u0006\b"}, d2 = {"Lcom/transsnet/palmpay/main/export/bean/rsp/InvestGuideBeanRsp$WealthCommentList;", "", "<init>", "()V", "profileUrl", "", "userName", "connect", "module_main_export_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class WealthCommentList {

        @JvmField
        @Nullable
        public String connect;

        @JvmField
        @Nullable
        public String profileUrl;

        @JvmField
        @Nullable
        public String userName;
    }
}
