package com.transsnet.palmpay.credit.bean;

import kotlin.Metadata;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0006\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\t\u001a\u00020\u00052\b\u0010\n\u001a\u0004\u0018\u00010\u0005R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u000b"}, d2 = {"Lcom/transsnet/palmpay/credit/bean/LoanHomeSource;", "", "<init>", "()V", "TRACK_PARAM_KEY", "", "HOME_ICON", "BANNER", "BOTTOM_TAB", "normalize", "raw", "module_flexi_export_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class LoanHomeSource {

    @NotNull
    public static final String BANNER = "banner";

    @NotNull
    public static final String BOTTOM_TAB = "bottom_tab";

    @NotNull
    public static final String HOME_ICON = "home_icon";

    @NotNull
    public static final LoanHomeSource INSTANCE = new LoanHomeSource();

    @NotNull
    public static final String TRACK_PARAM_KEY = "Home_Source";

    private LoanHomeSource() {
    }

    @NotNull
    public final String normalize(@Nullable String raw) {
        String string = raw != null ? StringsKt.V(raw).toString() : null;
        return string == null ? "" : string;
    }
}
