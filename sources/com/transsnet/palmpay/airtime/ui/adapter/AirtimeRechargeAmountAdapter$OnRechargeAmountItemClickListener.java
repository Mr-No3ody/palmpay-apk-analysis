package com.transsnet.palmpay.airtime.ui.adapter;

import com.facebook.react.uimanager.ViewProps;
import com.transsnet.palmpay.airtime.bean.AirtimeItemsBean;
import com.transsnet.palmpay.airtime.bean.AirtimeSpecialRechargeItem;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\"\n\u0000\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bf\u0018\u00002\u00020\u0001J\u001f\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H&¢\u0006\u0004\b\u0007\u0010\bJ\u001f\u0010\n\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\tH&¢\u0006\u0004\b\n\u0010\u000bJ\u001f\u0010\f\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\tH&¢\u0006\u0004\b\f\u0010\u000bJ\u001f\u0010\r\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\tH&¢\u0006\u0004\b\r\u0010\u000b¨\u0006\u000e"}, d2 = {"com/transsnet/palmpay/airtime/ui/adapter/AirtimeRechargeAmountAdapter$OnRechargeAmountItemClickListener", "", "", ViewProps.POSITION, "Lcom/transsnet/palmpay/airtime/bean/AirtimeItemsBean;", "item", "", "onNormalItemClick", "(ILcom/transsnet/palmpay/airtime/bean/AirtimeItemsBean;)V", "Lcom/transsnet/palmpay/airtime/bean/AirtimeSpecialRechargeItem;", "onAutoRenewItemClick", "(ILcom/transsnet/palmpay/airtime/bean/AirtimeSpecialRechargeItem;)V", "onCustomPackageItemClick", "onCustomJumpItemClick", "module_biller_impl_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public interface AirtimeRechargeAmountAdapter$OnRechargeAmountItemClickListener {
    void onAutoRenewItemClick(int position, @NotNull AirtimeSpecialRechargeItem item);

    void onCustomJumpItemClick(int position, @NotNull AirtimeSpecialRechargeItem item);

    void onCustomPackageItemClick(int position, @NotNull AirtimeSpecialRechargeItem item);

    void onNormalItemClick(int position, @NotNull AirtimeItemsBean item);
}
