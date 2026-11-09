package com.transsnet.palmpay.core.bean;

import com.transsnet.palmpay.custom_view.input.InputMobileImpl;
import com.transsnet.palmpay.util.TimeUtils;
import java.text.SimpleDateFormat;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.jvm.JvmField;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\f\u0018\u00002\u00020\u0001BK\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\b\u001a\u00020\u0003\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\n\u0010\u000bJ\n\u0010\f\u001a\u0004\u0018\u00010\u0005H\u0016J\n\u0010\r\u001a\u0004\u0018\u00010\u0005H\u0016J\n\u0010\u000e\u001a\u0004\u0018\u00010\u0005H\u0016J\n\u0010\u000f\u001a\u0004\u0018\u00010\u0005H\u0016J\n\u0010\u0010\u001a\u0004\u0018\u00010\u0005H\u0016R\u0012\u0010\u0002\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0004\u001a\u0004\u0018\u00010\u00058\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u0004\u0018\u00010\u00058\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0012\u0010\b\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\t\u001a\u0004\u0018\u00010\u00058\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000¨\u0006\u0011"}, d2 = {"Lcom/transsnet/palmpay/core/bean/TopUpRecordItem;", "Lcom/transsnet/palmpay/custom_view/input/InputMobileImpl;", "id", "", "shortCustomerId", "", "customerName", "remark", "updateTime", "billerIcon", "<init>", "(JLjava/lang/String;Ljava/lang/String;Ljava/lang/String;JLjava/lang/String;)V", "getIcon", "getTag", "getPhoneNumber", "getTime", "getPhoneName", "lib_core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class TopUpRecordItem implements InputMobileImpl {

    @JvmField
    @Nullable
    public String billerIcon;

    @JvmField
    @Nullable
    public String customerName;

    @JvmField
    public long id;

    @JvmField
    @Nullable
    public String remark;

    @JvmField
    @Nullable
    public String shortCustomerId;

    @JvmField
    public long updateTime;

    public TopUpRecordItem() {
        this(0L, null, null, null, 0L, null, 63, null);
    }

    @Override // com.transsnet.palmpay.custom_view.input.InputMobileImpl
    @Nullable
    /* JADX INFO: renamed from: getIcon, reason: from getter */
    public String getBillerIcon() {
        return this.billerIcon;
    }

    @Override // com.transsnet.palmpay.custom_view.input.InputMobileImpl
    @Nullable
    /* JADX INFO: renamed from: getPhoneName, reason: from getter */
    public String getCustomerName() {
        return this.customerName;
    }

    @Override // com.transsnet.palmpay.custom_view.input.InputMobileImpl
    @Nullable
    /* JADX INFO: renamed from: getPhoneNumber, reason: from getter */
    public String getShortCustomerId() {
        return this.shortCustomerId;
    }

    @Override // com.transsnet.palmpay.custom_view.input.InputMobileImpl
    @Nullable
    /* JADX INFO: renamed from: getTag, reason: from getter */
    public String getRemark() {
        return this.remark;
    }

    @Override // com.transsnet.palmpay.custom_view.input.InputMobileImpl
    @Nullable
    public String getTime() {
        return TimeUtils.millis2String(this.updateTime, new SimpleDateFormat("MMM d, h:mm a", Locale.ENGLISH));
    }

    public TopUpRecordItem(long j6, @Nullable String str, @Nullable String str2, @Nullable String str3, long j10, @Nullable String str4) {
        this.id = j6;
        this.shortCustomerId = str;
        this.customerName = str2;
        this.remark = str3;
        this.updateTime = j10;
        this.billerIcon = str4;
    }

    public /* synthetic */ TopUpRecordItem(long j6, String str, String str2, String str3, long j10, String str4, int i7, DefaultConstructorMarker defaultConstructorMarker) {
        this((i7 & 1) != 0 ? 0L : j6, (i7 & 2) != 0 ? null : str, (i7 & 4) != 0 ? null : str2, (i7 & 8) != 0 ? null : str3, (i7 & 16) != 0 ? 0L : j10, (i7 & 32) != 0 ? null : str4);
    }
}
