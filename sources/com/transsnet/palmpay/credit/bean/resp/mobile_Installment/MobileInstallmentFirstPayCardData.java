package com.transsnet.palmpay.credit.bean.resp.mobile_Installment;

import com.palmpay.lib.webview.container.fast.WebViewCache;
import com.transsnet.palmpay.credit.bean.RepaymentPlan;
import java.util.List;
import kotlin.Metadata;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0010\b\n\u0002\b\u001e\n\u0002\u0010\t\n\u0002\b\u001b\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003R\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\u001c\u0010\n\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\u0007\"\u0004\b\f\u0010\tR\u001c\u0010\r\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u0007\"\u0004\b\u000f\u0010\tR\u001e\u0010\u0010\u001a\u0004\u0018\u00010\u0011X\u0086\u000e¢\u0006\u0010\n\u0002\u0010\u0016\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R\u001c\u0010\u0017\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\u0007\"\u0004\b\u0019\u0010\tR\u001c\u0010\u001a\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001b\u0010\u0007\"\u0004\b\u001c\u0010\tR\u001c\u0010\u001d\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001e\u0010\u0007\"\u0004\b\u001f\u0010\tR\u001c\u0010 \u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b!\u0010\u0007\"\u0004\b\"\u0010\tR\u001c\u0010#\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b$\u0010\u0007\"\u0004\b%\u0010\tR\u001c\u0010&\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b'\u0010\u0007\"\u0004\b(\u0010\tR\u001c\u0010)\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b*\u0010\u0007\"\u0004\b+\u0010\tR\u001c\u0010,\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b-\u0010\u0007\"\u0004\b.\u0010\tR\u001e\u0010/\u001a\u0004\u0018\u000100X\u0086\u000e¢\u0006\u0010\n\u0002\u00105\u001a\u0004\b1\u00102\"\u0004\b3\u00104R\u001c\u00106\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b7\u0010\u0007\"\u0004\b8\u0010\tR\u001e\u00109\u001a\u0004\u0018\u000100X\u0086\u000e¢\u0006\u0010\n\u0002\u00105\u001a\u0004\b:\u00102\"\u0004\b;\u00104R\u001c\u0010<\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b=\u0010\u0007\"\u0004\b>\u0010\tR\u001c\u0010?\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b@\u0010\u0007\"\u0004\bA\u0010\tR\u001c\u0010B\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bC\u0010\u0007\"\u0004\bD\u0010\tR\u001e\u0010E\u001a\u0004\u0018\u000100X\u0086\u000e¢\u0006\u0010\n\u0002\u00105\u001a\u0004\bF\u00102\"\u0004\bG\u00104R\u001c\u0010H\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bI\u0010\u0007\"\u0004\bJ\u0010\tR\"\u0010K\u001a\n\u0012\u0004\u0012\u00020M\u0018\u00010LX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bN\u0010O\"\u0004\bP\u0010Q¨\u0006R"}, d2 = {"Lcom/transsnet/palmpay/credit/bean/resp/mobile_Installment/MobileInstallmentFirstPayCardData;", "", "<init>", "()V", "itemStyle", "", "getItemStyle", "()Ljava/lang/String;", "setItemStyle", "(Ljava/lang/String;)V", "loanNo", "getLoanNo", "setLoanNo", "orderNo", "getOrderNo", "setOrderNo", "repaymentStatus", "", "getRepaymentStatus", "()Ljava/lang/Integer;", "setRepaymentStatus", "(Ljava/lang/Integer;)V", "Ljava/lang/Integer;", "titleBrandIocUrl", "getTitleBrandIocUrl", "setTitleBrandIocUrl", "titleBrandIocUrlDark", "getTitleBrandIocUrlDark", "setTitleBrandIocUrlDark", "phoneBrandIocUrl", "getPhoneBrandIocUrl", "setPhoneBrandIocUrl", "phoneBrandIocUrlDark", "getPhoneBrandIocUrlDark", "setPhoneBrandIocUrlDark", "brand", "getBrand", "setBrand", "type", "getType", "setType", WebViewCache.SOURCE_MEMORY_CACHE, "getMemory", "setMemory", "storage", "getStorage", "setStorage", "productAmount", "", "getProductAmount", "()Ljava/lang/Long;", "setProductAmount", "(Ljava/lang/Long;)V", "Ljava/lang/Long;", "downPaymentTitle", "getDownPaymentTitle", "setDownPaymentTitle", "downPaymentAmount", "getDownPaymentAmount", "setDownPaymentAmount", "btnConfirmPay", "getBtnConfirmPay", "setBtnConfirmPay", "btnMsg", "getBtnMsg", "setBtnMsg", "unpaidAmountTitle", "getUnpaidAmountTitle", "setUnpaidAmountTitle", "unpaidAmount", "getUnpaidAmount", "setUnpaidAmount", "loanTermTitle", "getLoanTermTitle", "setLoanTermTitle", "repaymentPlanList", "", "Lcom/transsnet/palmpay/credit/bean/RepaymentPlan;", "getRepaymentPlanList", "()Ljava/util/List;", "setRepaymentPlanList", "(Ljava/util/List;)V", "module_flexi_export_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class MobileInstallmentFirstPayCardData {

    @Nullable
    private String brand;

    @Nullable
    private String btnConfirmPay;

    @Nullable
    private String btnMsg;

    @Nullable
    private Long downPaymentAmount;

    @Nullable
    private String downPaymentTitle;

    @Nullable
    private String itemStyle;

    @Nullable
    private String loanNo;

    @Nullable
    private String loanTermTitle;

    @Nullable
    private String memory;

    @Nullable
    private String orderNo;

    @Nullable
    private String phoneBrandIocUrl;

    @Nullable
    private String phoneBrandIocUrlDark;

    @Nullable
    private Long productAmount;

    @Nullable
    private List<RepaymentPlan> repaymentPlanList;

    @Nullable
    private Integer repaymentStatus;

    @Nullable
    private String storage;

    @Nullable
    private String titleBrandIocUrl;

    @Nullable
    private String titleBrandIocUrlDark;

    @Nullable
    private String type;

    @Nullable
    private Long unpaidAmount;

    @Nullable
    private String unpaidAmountTitle;

    @Nullable
    public final String getBrand() {
        return this.brand;
    }

    @Nullable
    public final String getBtnConfirmPay() {
        return this.btnConfirmPay;
    }

    @Nullable
    public final String getBtnMsg() {
        return this.btnMsg;
    }

    @Nullable
    public final Long getDownPaymentAmount() {
        return this.downPaymentAmount;
    }

    @Nullable
    public final String getDownPaymentTitle() {
        return this.downPaymentTitle;
    }

    @Nullable
    public final String getItemStyle() {
        return this.itemStyle;
    }

    @Nullable
    public final String getLoanNo() {
        return this.loanNo;
    }

    @Nullable
    public final String getLoanTermTitle() {
        return this.loanTermTitle;
    }

    @Nullable
    public final String getMemory() {
        return this.memory;
    }

    @Nullable
    public final String getOrderNo() {
        return this.orderNo;
    }

    @Nullable
    public final String getPhoneBrandIocUrl() {
        return this.phoneBrandIocUrl;
    }

    @Nullable
    public final String getPhoneBrandIocUrlDark() {
        return this.phoneBrandIocUrlDark;
    }

    @Nullable
    public final Long getProductAmount() {
        return this.productAmount;
    }

    @Nullable
    public final List<RepaymentPlan> getRepaymentPlanList() {
        return this.repaymentPlanList;
    }

    @Nullable
    public final Integer getRepaymentStatus() {
        return this.repaymentStatus;
    }

    @Nullable
    public final String getStorage() {
        return this.storage;
    }

    @Nullable
    public final String getTitleBrandIocUrl() {
        return this.titleBrandIocUrl;
    }

    @Nullable
    public final String getTitleBrandIocUrlDark() {
        return this.titleBrandIocUrlDark;
    }

    @Nullable
    public final String getType() {
        return this.type;
    }

    @Nullable
    public final Long getUnpaidAmount() {
        return this.unpaidAmount;
    }

    @Nullable
    public final String getUnpaidAmountTitle() {
        return this.unpaidAmountTitle;
    }

    public final void setBrand(@Nullable String str) {
        this.brand = str;
    }

    public final void setBtnConfirmPay(@Nullable String str) {
        this.btnConfirmPay = str;
    }

    public final void setBtnMsg(@Nullable String str) {
        this.btnMsg = str;
    }

    public final void setDownPaymentAmount(@Nullable Long l5) {
        this.downPaymentAmount = l5;
    }

    public final void setDownPaymentTitle(@Nullable String str) {
        this.downPaymentTitle = str;
    }

    public final void setItemStyle(@Nullable String str) {
        this.itemStyle = str;
    }

    public final void setLoanNo(@Nullable String str) {
        this.loanNo = str;
    }

    public final void setLoanTermTitle(@Nullable String str) {
        this.loanTermTitle = str;
    }

    public final void setMemory(@Nullable String str) {
        this.memory = str;
    }

    public final void setOrderNo(@Nullable String str) {
        this.orderNo = str;
    }

    public final void setPhoneBrandIocUrl(@Nullable String str) {
        this.phoneBrandIocUrl = str;
    }

    public final void setPhoneBrandIocUrlDark(@Nullable String str) {
        this.phoneBrandIocUrlDark = str;
    }

    public final void setProductAmount(@Nullable Long l5) {
        this.productAmount = l5;
    }

    public final void setRepaymentPlanList(@Nullable List<RepaymentPlan> list) {
        this.repaymentPlanList = list;
    }

    public final void setRepaymentStatus(@Nullable Integer num) {
        this.repaymentStatus = num;
    }

    public final void setStorage(@Nullable String str) {
        this.storage = str;
    }

    public final void setTitleBrandIocUrl(@Nullable String str) {
        this.titleBrandIocUrl = str;
    }

    public final void setTitleBrandIocUrlDark(@Nullable String str) {
        this.titleBrandIocUrlDark = str;
    }

    public final void setType(@Nullable String str) {
        this.type = str;
    }

    public final void setUnpaidAmount(@Nullable Long l5) {
        this.unpaidAmount = l5;
    }

    public final void setUnpaidAmountTitle(@Nullable String str) {
        this.unpaidAmountTitle = str;
    }
}
