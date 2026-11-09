package com.flexibank.sdk.core.listener;

import android.view.View;
import kotlin.Metadata;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bæ\u0080\u0001\u0018\u00002\u00020\u0001J\"\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00052\b\u0010\u0007\u001a\u0004\u0018\u00010\bH&J\u001a\u0010\t\u001a\u00020\u00032\b\u0010\n\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\f\u001a\u00020\u0005H\u0016¨\u0006\r"}, d2 = {"Lcom/flexibank/sdk/core/listener/FlexiBankOnSendCodeListener;", "", "onSend", "", "type", "", "subId", "extra", "", "onButtonVisibilityChange", "view", "Landroid/view/View;", "visibility", "flexibank-sdk_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public interface FlexiBankOnSendCodeListener {
    void onButtonVisibilityChange(@Nullable View view, int visibility);

    void onSend(int type, int subId, @Nullable String extra);
}
