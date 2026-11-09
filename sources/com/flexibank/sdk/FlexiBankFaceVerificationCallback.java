package com.flexibank.sdk;

import android.app.Activity;
import com.facebook.react.uimanager.ViewProps;
import com.flexibank.sdk.core.util.FlexiBankScanFaceLogicUtil$ScanFaceResultCallBack;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\bæ\u0080\u0001\u0018\u00002\u00020\u0001J<\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\t2\b\u0010\n\u001a\u0004\u0018\u00010\t2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eH&¨\u0006\u000f"}, d2 = {"Lcom/flexibank/sdk/FlexiBankFaceVerificationCallback;", "", ViewProps.START, "", "activity", "Landroid/app/Activity;", "scene", "", "mobileNo", "", "bizId", "faceCompare", "", "callback", "Lcom/flexibank/sdk/core/util/FlexiBankScanFaceLogicUtil$ScanFaceResultCallBack;", "flexibank-sdk_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public interface FlexiBankFaceVerificationCallback {
    void start(@NotNull Activity activity, int scene, @Nullable String mobileNo, @Nullable String bizId, boolean faceCompare, @NotNull FlexiBankScanFaceLogicUtil$ScanFaceResultCallBack callback);
}
