package com.transsnet.palmpay.credit.bean;

import kotlin.Metadata;
import kotlin.jvm.JvmField;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\u0018\u00002\u00020\u0001Bg\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\f\u0010\rR\u0014\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u0004\n\u0002\u0010\u000eR\u0012\u0010\u0004\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\u0007\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\b\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u0004\n\u0002\u0010\u000eR\u0016\u0010\t\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u0004\n\u0002\u0010\u000eR\u0016\u0010\n\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u0004\n\u0002\u0010\u000eR\u0016\u0010\u000b\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u0004\n\u0002\u0010\u000e¨\u0006\u000f"}, d2 = {"Lcom/transsnet/palmpay/credit/bean/LoanEnterPreCheckInfo;", "", "alreadyLoan", "", "jumpPath", "", "jumpType", "jumpParams", "newVersionEnabled", "rnEnabled", "rnNewEnabled", "useNewDomain", "<init>", "(Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;)V", "Ljava/lang/Boolean;", "module_flexi_export_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class LoanEnterPreCheckInfo {

    @JvmField
    @Nullable
    public final Boolean alreadyLoan;

    @JvmField
    @Nullable
    public final String jumpParams;

    @JvmField
    @Nullable
    public final String jumpPath;

    @JvmField
    @Nullable
    public final String jumpType;

    @JvmField
    @Nullable
    public Boolean newVersionEnabled;

    @JvmField
    @Nullable
    public Boolean rnEnabled;

    @JvmField
    @Nullable
    public Boolean rnNewEnabled;

    @JvmField
    @Nullable
    public Boolean useNewDomain;

    public LoanEnterPreCheckInfo() {
        this(null, null, null, null, null, null, null, null, 255, null);
    }

    public LoanEnterPreCheckInfo(@Nullable Boolean bool, @Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable Boolean bool2, @Nullable Boolean bool3, @Nullable Boolean bool4, @Nullable Boolean bool5) {
        this.alreadyLoan = bool;
        this.jumpPath = str;
        this.jumpType = str2;
        this.jumpParams = str3;
        this.newVersionEnabled = bool2;
        this.rnEnabled = bool3;
        this.rnNewEnabled = bool4;
        this.useNewDomain = bool5;
    }

    public /* synthetic */ LoanEnterPreCheckInfo(Boolean bool, String str, String str2, String str3, Boolean bool2, Boolean bool3, Boolean bool4, Boolean bool5, int i7, DefaultConstructorMarker defaultConstructorMarker) {
        this((i7 & 1) != 0 ? Boolean.FALSE : bool, (i7 & 2) != 0 ? null : str, (i7 & 4) != 0 ? null : str2, (i7 & 8) != 0 ? null : str3, (i7 & 16) != 0 ? null : bool2, (i7 & 32) != 0 ? null : bool3, (i7 & 64) != 0 ? null : bool4, (i7 & 128) != 0 ? null : bool5);
    }
}
