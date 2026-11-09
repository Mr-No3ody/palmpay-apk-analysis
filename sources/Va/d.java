package Va;

import android.media.AudioDeviceCallback;
import android.media.AudioDeviceInfo;
import com.transsnet.palmpay.core.web.PWebActivity;

/* JADX INFO: loaded from: classes3.dex */
public final class d extends AudioDeviceCallback {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ PWebActivity f10234a;

    public d(PWebActivity pWebActivity) {
        this.f10234a = pWebActivity;
    }

    @Override // android.media.AudioDeviceCallback
    public final void onAudioDevicesAdded(AudioDeviceInfo[] audioDeviceInfoArr) {
        PWebActivity pWebActivity = this.f10234a;
        pWebActivity.n(PWebActivity.l(pWebActivity));
    }

    @Override // android.media.AudioDeviceCallback
    public final void onAudioDevicesRemoved(AudioDeviceInfo[] audioDeviceInfoArr) {
        PWebActivity pWebActivity = this.f10234a;
        pWebActivity.n(PWebActivity.l(pWebActivity));
    }
}
