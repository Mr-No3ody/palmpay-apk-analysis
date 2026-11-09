package com.transsnet.palmpay.send_money.bean;

import android.bluetooth.BluetoothDevice;
import android.bluetooth.le.ScanRecord;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0016\u0018\u00002\u00020\u0001B9\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\f\u0010\rR\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0004\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R\u001a\u0010\u0006\u001a\u00020\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0016\"\u0004\b\u0017\u0010\u0018R\u001c\u0010\b\u001a\u0004\u0018\u00010\tX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001cR\u001c\u0010\n\u001a\u0004\u0018\u00010\u000bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001d\u0010\u001e\"\u0004\b\u001f\u0010 ¨\u0006!"}, d2 = {"Lcom/transsnet/palmpay/send_money/bean/BleDevice;", "", "device", "Landroid/bluetooth/BluetoothDevice;", "rssi", "", "isConnectable", "", "scanRecord", "Landroid/bluetooth/le/ScanRecord;", "phone", "", "<init>", "(Landroid/bluetooth/BluetoothDevice;IZLandroid/bluetooth/le/ScanRecord;Ljava/lang/String;)V", "getDevice", "()Landroid/bluetooth/BluetoothDevice;", "setDevice", "(Landroid/bluetooth/BluetoothDevice;)V", "getRssi", "()I", "setRssi", "(I)V", "()Z", "setConnectable", "(Z)V", "getScanRecord", "()Landroid/bluetooth/le/ScanRecord;", "setScanRecord", "(Landroid/bluetooth/le/ScanRecord;)V", "getPhone", "()Ljava/lang/String;", "setPhone", "(Ljava/lang/String;)V", "module_money_transfer_export_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class BleDevice {

    @NotNull
    private BluetoothDevice device;
    private boolean isConnectable;

    @Nullable
    private String phone;
    private int rssi;

    @Nullable
    private ScanRecord scanRecord;

    public BleDevice(@NotNull BluetoothDevice device, int i7, boolean z3, @Nullable ScanRecord scanRecord, @Nullable String str) {
        Intrinsics.checkNotNullParameter(device, "device");
        this.device = device;
        this.rssi = i7;
        this.isConnectable = z3;
        this.scanRecord = scanRecord;
        this.phone = str;
    }

    @NotNull
    public final BluetoothDevice getDevice() {
        return this.device;
    }

    @Nullable
    public final String getPhone() {
        return this.phone;
    }

    public final int getRssi() {
        return this.rssi;
    }

    @Nullable
    public final ScanRecord getScanRecord() {
        return this.scanRecord;
    }

    /* JADX INFO: renamed from: isConnectable, reason: from getter */
    public final boolean getIsConnectable() {
        return this.isConnectable;
    }

    public final void setConnectable(boolean z3) {
        this.isConnectable = z3;
    }

    public final void setDevice(@NotNull BluetoothDevice bluetoothDevice) {
        Intrinsics.checkNotNullParameter(bluetoothDevice, "<set-?>");
        this.device = bluetoothDevice;
    }

    public final void setPhone(@Nullable String str) {
        this.phone = str;
    }

    public final void setRssi(int i7) {
        this.rssi = i7;
    }

    public final void setScanRecord(@Nullable ScanRecord scanRecord) {
        this.scanRecord = scanRecord;
    }

    public /* synthetic */ BleDevice(BluetoothDevice bluetoothDevice, int i7, boolean z3, ScanRecord scanRecord, String str, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(bluetoothDevice, i7, (i10 & 4) != 0 ? true : z3, (i10 & 8) != 0 ? null : scanRecord, (i10 & 16) != 0 ? null : str);
    }
}
