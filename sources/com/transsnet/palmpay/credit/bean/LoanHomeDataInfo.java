package com.transsnet.palmpay.credit.bean;

import Pa.C0525w;
import androidx.camera.core.impl.utils.executor.g;
import com.transsnet.palmpay.credit.bean.resp.mobile_Installment.AboutRepaymentCardData;
import com.transsnet.palmpay.credit.bean.resp.mobile_Installment.CLPhoneInstallmentMainData;
import com.transsnet.palmpay.credit.bean.resp.mobile_Installment.DefaultInfoData;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.JvmField;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.Nullable;
import p355xf.o;
import p355xf.p;
import p355xf.q;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\u0018\u00002\u00020\u0001Be\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\u000e\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007\u0012\b\u0010\t\u001a\u0004\u0018\u00010\n\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\f\u0012\b\u0010\r\u001a\u0004\u0018\u00010\n\u0012\u000e\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u0007\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u0011\u0010\u0012J\u0006\u0010\u0014\u001a\u00020\u0015R\u0012\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\u0004\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0018\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\t\u001a\u0004\u0018\u00010\n8\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u000b\u001a\u0004\u0018\u00010\f8\u0006X\u0087\u0004¢\u0006\u0004\n\u0002\u0010\u0013R\u0012\u0010\r\u001a\u0004\u0018\u00010\n8\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u00078\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0010\u001a\u0004\u0018\u00010\n8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000¨\u0006\u0016"}, d2 = {"Lcom/transsnet/palmpay/credit/bean/LoanHomeDataInfo;", "", "notifyInfo", "Lcom/transsnet/palmpay/credit/bean/NotifyInfo;", "outstandingContentInfo", "Lcom/transsnet/palmpay/credit/bean/OutstandingContentInfo;", "productContentInfo", "", "Lcom/transsnet/palmpay/credit/bean/ProductContentInfo;", "bottomAdvertisementId", "", "allProductNotCredit", "", "topAdvertisementId", "hirePurchaseProductContent", "Lcom/transsnet/palmpay/credit/bean/resp/mobile_Installment/CLPhoneInstallmentMainData;", "appTopMainConfig", "<init>", "(Lcom/transsnet/palmpay/credit/bean/NotifyInfo;Lcom/transsnet/palmpay/credit/bean/OutstandingContentInfo;Ljava/util/List;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;)V", "Ljava/lang/Integer;", "normalizeHirePurchaseAboutRepayment", "", "module_flexi_export_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nLoanHomeDataInfo.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LoanHomeDataInfo.kt\ncom/transsnet/palmpay/credit/bean/LoanHomeDataInfo\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,72:1\n1869#2:73\n1870#2:75\n1#3:74\n*S KotlinDebug\n*F\n+ 1 LoanHomeDataInfo.kt\ncom/transsnet/palmpay/credit/bean/LoanHomeDataInfo\n*L\n37#1:73\n37#1:75\n*E\n"})
public final class LoanHomeDataInfo {

    @JvmField
    @Nullable
    public final Integer allProductNotCredit;

    @JvmField
    @Nullable
    public String appTopMainConfig;

    @JvmField
    @Nullable
    public final String bottomAdvertisementId;

    @JvmField
    @Nullable
    public List<CLPhoneInstallmentMainData> hirePurchaseProductContent;

    @JvmField
    @Nullable
    public final NotifyInfo notifyInfo;

    @JvmField
    @Nullable
    public final OutstandingContentInfo outstandingContentInfo;

    @JvmField
    @Nullable
    public final List<ProductContentInfo> productContentInfo;

    @JvmField
    @Nullable
    public final String topAdvertisementId;

    public LoanHomeDataInfo(@Nullable NotifyInfo notifyInfo, @Nullable OutstandingContentInfo outstandingContentInfo, @Nullable List<ProductContentInfo> list, @Nullable String str, @Nullable Integer num, @Nullable String str2, @Nullable List<CLPhoneInstallmentMainData> list2, @Nullable String str3) {
        this.notifyInfo = notifyInfo;
        this.outstandingContentInfo = outstandingContentInfo;
        this.productContentInfo = list;
        this.bottomAdvertisementId = str;
        this.allProductNotCredit = num;
        this.topAdvertisementId = str2;
        this.hirePurchaseProductContent = list2;
        this.appTopMainConfig = str3;
    }

    public final void normalizeHirePurchaseAboutRepayment() {
        String defaultInfoJson;
        Object objF;
        AboutRepaymentCardData aboutRepaymentData;
        String aboutRepaymentJson;
        Object objF2;
        List<CLPhoneInstallmentMainData> list = this.hirePurchaseProductContent;
        if (list != null) {
            for (CLPhoneInstallmentMainData cLPhoneInstallmentMainData : list) {
                if (cLPhoneInstallmentMainData.getAboutRepaymentData() == null && (aboutRepaymentJson = cLPhoneInstallmentMainData.getAboutRepaymentJson()) != null) {
                    if (StringsKt.F(aboutRepaymentJson)) {
                        aboutRepaymentJson = null;
                    }
                    if (aboutRepaymentJson != null) {
                        try {
                            o oVar = q.f43977a;
                            C0525w.f().getClass();
                            objF2 = (AboutRepaymentCardData) C0525w.d(aboutRepaymentJson, AboutRepaymentCardData.class);
                        } catch (Throwable th) {
                            o oVar2 = q.f43977a;
                            objF2 = g.f(th);
                        }
                        if (objF2 instanceof p) {
                            objF2 = null;
                        }
                        cLPhoneInstallmentMainData.setAboutRepaymentData((AboutRepaymentCardData) objF2);
                    }
                }
                String itemStyle = cLPhoneInstallmentMainData.getItemStyle();
                if (itemStyle != null && !StringsKt.F(itemStyle) && (aboutRepaymentData = cLPhoneInstallmentMainData.getAboutRepaymentData()) != null) {
                    aboutRepaymentData.setItemStyle(cLPhoneInstallmentMainData.getItemStyle());
                }
                if (cLPhoneInstallmentMainData.getDefaultInfoData() == null && (defaultInfoJson = cLPhoneInstallmentMainData.getDefaultInfoJson()) != null) {
                    if (StringsKt.F(defaultInfoJson)) {
                        defaultInfoJson = null;
                    }
                    if (defaultInfoJson != null) {
                        try {
                            o oVar3 = q.f43977a;
                            C0525w.f().getClass();
                            objF = (DefaultInfoData) C0525w.d(defaultInfoJson, DefaultInfoData.class);
                        } catch (Throwable th2) {
                            o oVar4 = q.f43977a;
                            objF = g.f(th2);
                        }
                        cLPhoneInstallmentMainData.setDefaultInfoData((DefaultInfoData) (objF instanceof p ? null : objF));
                    }
                }
            }
        }
    }

    public /* synthetic */ LoanHomeDataInfo(NotifyInfo notifyInfo, OutstandingContentInfo outstandingContentInfo, List list, String str, Integer num, String str2, List list2, String str3, int i7, DefaultConstructorMarker defaultConstructorMarker) {
        this(notifyInfo, outstandingContentInfo, list, str, num, str2, list2, (i7 & 128) != 0 ? null : str3);
    }
}
