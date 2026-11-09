package com.transsnet.palmpay.send_money.utils;

import com.transsnet.palmpay.send_money.bean.BleDevice;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\bf\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\u0007\u001a\u00020\u0004H&¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"com/transsnet/palmpay/send_money/utils/BleScanHelper$OnScanListener", "", "Lcom/transsnet/palmpay/send_money/bean/BleDevice;", "device", "", "onNext", "(Lcom/transsnet/palmpay/send_money/bean/BleDevice;)V", "onFinish", "()V", "module_money_transfer_export_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public interface BleScanHelper$OnScanListener {
    void onFinish();

    void onNext(@NotNull BleDevice device);
}
