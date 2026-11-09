package com.transsnet.palmpay.main.export.bean.rsp;

import com.facebook.react.fabric.mounting.mountitems.IntBufferBatchMountItem;
import kotlin.Metadata;
import kotlin.jvm.JvmField;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\u0018\u00002\u00020\u0001Bk\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\n\u001a\u00020\u000b\u0012\b\b\u0002\u0010\f\u001a\u00020\r\u0012\b\b\u0002\u0010\u000e\u001a\u00020\u000b¢\u0006\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0005\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0012\u0010\u0007\u001a\u00020\b8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\t\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0012\u0010\n\u001a\u00020\u000b8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0012\u0010\f\u001a\u00020\r8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0012\u0010\u000e\u001a\u00020\u000b8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000¨\u0006\u0011"}, d2 = {"Lcom/transsnet/palmpay/main/export/bean/rsp/MinorAccountBean;", "", "teenMemberId", "", "teenMemberFullName", "teenMemberHeadPoint", "authType", "authStatus", "", "teenPhone", "applyTime", "", "showSwitch", "", "expireTime", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;JZJ)V", "module_main_export_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class MinorAccountBean {

    @JvmField
    public long applyTime;

    @JvmField
    public int authStatus;

    @JvmField
    @Nullable
    public String authType;

    @JvmField
    public long expireTime;

    @JvmField
    public boolean showSwitch;

    @JvmField
    @Nullable
    public String teenMemberFullName;

    @JvmField
    @Nullable
    public String teenMemberHeadPoint;

    @JvmField
    @Nullable
    public String teenMemberId;

    @JvmField
    @Nullable
    public String teenPhone;

    public MinorAccountBean() {
        this(null, null, null, null, 0, null, 0L, false, 0L, 511, null);
    }

    public MinorAccountBean(@Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable String str4, int i7, @Nullable String str5, long j6, boolean z3, long j10) {
        this.teenMemberId = str;
        this.teenMemberFullName = str2;
        this.teenMemberHeadPoint = str3;
        this.authType = str4;
        this.authStatus = i7;
        this.teenPhone = str5;
        this.applyTime = j6;
        this.showSwitch = z3;
        this.expireTime = j10;
    }

    public /* synthetic */ MinorAccountBean(String str, String str2, String str3, String str4, int i7, String str5, long j6, boolean z3, long j10, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? "" : str, (i10 & 2) != 0 ? "" : str2, (i10 & 4) != 0 ? "" : str3, (i10 & 8) != 0 ? "" : str4, (i10 & 16) != 0 ? 0 : i7, (i10 & 32) == 0 ? str5 : "", (i10 & 64) != 0 ? 0L : j6, (i10 & 128) == 0 ? z3 : false, (i10 & IntBufferBatchMountItem.INSTRUCTION_UPDATE_EVENT_EMITTER) != 0 ? 0L : j10);
    }
}
