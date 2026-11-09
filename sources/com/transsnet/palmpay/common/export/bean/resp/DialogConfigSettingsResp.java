package com.transsnet.palmpay.common.export.bean.resp;

import kotlin.Metadata;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\b\u0018\u0000 \f2\u00020\u0001:\u0001\fB\u0019\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\r"}, d2 = {"Lcom/transsnet/palmpay/common/export/bean/resp/DialogConfigSettingsResp;", "", "style", "", "addition", "", "<init>", "(ILjava/lang/String;)V", "getStyle", "()I", "getAddition", "()Ljava/lang/String;", "Companion", "module_common_export_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class DialogConfigSettingsResp {
    public static final int STYLE_AUTO_LOGOUT = 3;
    public static final int STYLE_AUTO_TOP_UP = 6;
    public static final int STYLE_AUTO_TOP_UP_AIRTIME = 7;
    public static final int STYLE_DARK_MODE = 2;
    public static final int STYLE_ENABLE_NOTIFICATION = 8;
    public static final int STYLE_FINGER_PRINT = 1;
    public static final int STYLE_IOS_FACE_ID = 5;
    public static final int STYLE_KYC_UPGRADE = 11;
    public static final int STYLE_LOGIN_PASSWORD = 4;

    @Nullable
    private final String addition;
    private final int style;

    public DialogConfigSettingsResp(int i7, @Nullable String str) {
        this.style = i7;
        this.addition = str;
    }

    @Nullable
    public final String getAddition() {
        return this.addition;
    }

    public final int getStyle() {
        return this.style;
    }
}
