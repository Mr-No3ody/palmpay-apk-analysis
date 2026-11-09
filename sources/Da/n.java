package Da;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.BaseActivityEventListener;
import com.facebook.react.bridge.Callback;
import com.facebook.react.bridge.WritableMap;
import com.transsnet.palmpay.core.rnbridge.modules.PPRNBridge;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class n extends BaseActivityEventListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ PPRNBridge f1767a;

    public n(PPRNBridge pPRNBridge) {
        this.f1767a = pPRNBridge;
    }

    @Override // com.facebook.react.bridge.BaseActivityEventListener, com.facebook.react.bridge.ActivityEventListener
    public final void onActivityResult(Activity activity, int i7, int i10, Intent intent) {
        Bundle extras;
        PPRNBridge pPRNBridge = this.f1767a;
        Intrinsics.checkNotNullParameter(activity, "activity");
        F6.d.h("PPRNBridge", 3, "onActivityResult >>> requestCode=" + i7);
        try {
            if (i7 == pPRNBridge.REQUEST_CODE) {
                if (pPRNBridge.mDoneCallback != null) {
                    if (i10 == 0) {
                        Callback callback = pPRNBridge.mCancelCallback;
                        if (callback != null) {
                            callback.invoke(PPRNBridge.DIALOG_ACTION_CANCEL);
                        }
                    } else {
                        WritableMap writableMapCreateMap = Arguments.createMap();
                        Intrinsics.checkNotNullExpressionValue(writableMapCreateMap, "createMap(...)");
                        if (intent != null && (extras = intent.getExtras()) != null) {
                            Object obj = extras.get("result");
                            if (obj instanceof String) {
                                writableMapCreateMap.putString("result", (String) obj);
                            } else if (obj instanceof Long) {
                                writableMapCreateMap.putString("result", String.valueOf(((Number) obj).longValue()));
                            } else if (obj instanceof Integer) {
                                writableMapCreateMap.putString("result", String.valueOf(((Number) obj).intValue()));
                            } else if (obj instanceof Boolean) {
                                writableMapCreateMap.putBoolean("result", ((Boolean) obj).booleanValue());
                            }
                        }
                        Callback callback2 = pPRNBridge.mDoneCallback;
                        if (callback2 != null) {
                            callback2.invoke(writableMapCreateMap);
                        }
                    }
                }
                pPRNBridge.mCancelCallback = null;
                pPRNBridge.mDoneCallback = null;
            }
        } catch (Exception e10) {
            e10.printStackTrace();
        }
    }
}
