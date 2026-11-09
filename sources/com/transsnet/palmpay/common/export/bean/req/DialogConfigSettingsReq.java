package com.transsnet.palmpay.common.export.bean.req;

import com.facebook.react.fabric.mounting.mountitems.IntBufferBatchMountItem;
import java.util.HashMap;
import kotlin.Metadata;
import kotlin.jvm.JvmField;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001B«\u0001\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\b\u001a\u00020\t\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0003\u0012,\b\u0002\u0010\f\u001a&\u0012\u0004\u0012\u00020\u000e\u0012\u0006\u0012\u0004\u0018\u00010\u0003\u0018\u00010\rj\u0012\u0012\u0004\u0012\u00020\u000e\u0012\u0006\u0012\u0004\u0018\u00010\u0003\u0018\u0001`\u000f\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u0004\n\u0002\u0010\u0014R\u0014\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u0004\n\u0002\u0010\u0014R\u0014\u0010\u0005\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u0004\n\u0002\u0010\u0014R\u0014\u0010\u0006\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u0004\n\u0002\u0010\u0014R\u0014\u0010\u0007\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u0004\n\u0002\u0010\u0014R\u0010\u0010\b\u001a\u00020\t8\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\n\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u0004\n\u0002\u0010\u0014R\u0014\u0010\u000b\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u0004\n\u0002\u0010\u0014R4\u0010\f\u001a&\u0012\u0004\u0012\u00020\u000e\u0012\u0006\u0012\u0004\u0018\u00010\u0003\u0018\u00010\rj\u0012\u0012\u0004\u0012\u00020\u000e\u0012\u0006\u0012\u0004\u0018\u00010\u0003\u0018\u0001`\u000f8\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0010\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u0004\n\u0002\u0010\u0014R\u0014\u0010\u0011\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\u0004\n\u0002\u0010\u0015¨\u0006\u0016"}, d2 = {"Lcom/transsnet/palmpay/common/export/bean/req/DialogConfigSettingsReq;", "", "supportFingerprintPayment", "", "fingerprintPayment", "autoLogout", "darkMode", "loginPassword", "pageSource", "", "autoRenewData", "autoRenewAirtime", "transTypeAutoRenew", "Ljava/util/HashMap;", "", "Lkotlin/collections/HashMap;", "systemNotification", "sceneCode", "<init>", "(Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;ILjava/lang/Boolean;Ljava/lang/Boolean;Ljava/util/HashMap;Ljava/lang/Boolean;Ljava/lang/Integer;)V", "Ljava/lang/Boolean;", "Ljava/lang/Integer;", "module_common_export_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class DialogConfigSettingsReq {

    @JvmField
    @Nullable
    public final Boolean autoLogout;

    @JvmField
    @Nullable
    public final Boolean autoRenewAirtime;

    @JvmField
    @Nullable
    public final Boolean autoRenewData;

    @JvmField
    @Nullable
    public final Boolean darkMode;

    @JvmField
    @Nullable
    public final Boolean fingerprintPayment;

    @JvmField
    @Nullable
    public final Boolean loginPassword;

    @JvmField
    public final int pageSource;

    @JvmField
    @Nullable
    public final Integer sceneCode;

    @JvmField
    @Nullable
    public final Boolean supportFingerprintPayment;

    @JvmField
    @Nullable
    public final Boolean systemNotification;

    @JvmField
    @Nullable
    public final HashMap<String, Boolean> transTypeAutoRenew;

    public DialogConfigSettingsReq() {
        this(null, null, null, null, null, 0, null, null, null, null, null, 2047, null);
    }

    public DialogConfigSettingsReq(@Nullable Boolean bool, @Nullable Boolean bool2, @Nullable Boolean bool3, @Nullable Boolean bool4, @Nullable Boolean bool5, int i7, @Nullable Boolean bool6, @Nullable Boolean bool7, @Nullable HashMap<String, Boolean> map, @Nullable Boolean bool8, @Nullable Integer num) {
        this.supportFingerprintPayment = bool;
        this.fingerprintPayment = bool2;
        this.autoLogout = bool3;
        this.darkMode = bool4;
        this.loginPassword = bool5;
        this.pageSource = i7;
        this.autoRenewData = bool6;
        this.autoRenewAirtime = bool7;
        this.transTypeAutoRenew = map;
        this.systemNotification = bool8;
        this.sceneCode = num;
    }

    public /* synthetic */ DialogConfigSettingsReq(Boolean bool, Boolean bool2, Boolean bool3, Boolean bool4, Boolean bool5, int i7, Boolean bool6, Boolean bool7, HashMap map, Boolean bool8, Integer num, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? Boolean.FALSE : bool, (i10 & 2) != 0 ? Boolean.FALSE : bool2, (i10 & 4) != 0 ? Boolean.FALSE : bool3, (i10 & 8) != 0 ? Boolean.FALSE : bool4, (i10 & 16) != 0 ? Boolean.FALSE : bool5, (i10 & 32) != 0 ? 0 : i7, (i10 & 64) != 0 ? Boolean.FALSE : bool6, (i10 & 128) != 0 ? Boolean.FALSE : bool7, (i10 & IntBufferBatchMountItem.INSTRUCTION_UPDATE_EVENT_EMITTER) != 0 ? null : map, (i10 & 512) != 0 ? Boolean.FALSE : bool8, (i10 & 1024) != 0 ? null : num);
    }
}
