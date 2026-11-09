package p249q7;

import android.content.ClipboardManager;
import com.facebook.react.modules.core.DeviceEventManagerModule;
import com.reactnativecommunity.clipboard.ClipboardModule;

/* JADX INFO: loaded from: classes3.dex */
public final class a implements ClipboardManager.OnPrimaryClipChangedListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ClipboardModule f41461a;

    public a(ClipboardModule clipboardModule) {
        this.f41461a = clipboardModule;
    }

    @Override // android.content.ClipboardManager.OnPrimaryClipChangedListener
    public final void onPrimaryClipChanged() {
        ((DeviceEventManagerModule.RCTDeviceEventEmitter) this.f41461a.reactContext.getJSModule(DeviceEventManagerModule.RCTDeviceEventEmitter.class)).emit(ClipboardModule.CLIPBOARD_TEXT_CHANGED, null);
    }
}
