package com.transsnet.palmpay.core.rnbridge.bridge;

import F6.d;
import N8.q0;
import android.content.Context;
import android.media.AudioDeviceInfo;
import android.media.AudioManager;
import android.os.Build;
import androidx.annotation.Keep;
import androidx.camera.video.u;
import com.appsflyer.AppsFlyerProperties;
import com.didi.drouter.annotation.Service;
import com.luck.picture.lib.config.PictureMimeType;
import com.palmpay.lib.bridge.BaseBridge;
import com.palmpay.lib.bridge.IBridge;
import com.palmpay.lib.bridge.IBridgeCallback;
import com.palmpay.lib.bridge.SyncBridge;
import com.transsnet.palmpay.core.base.BaseApplication;
import java.util.List;
import java.util.Locale;
import java.util.Set;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.collections.C1847n;
import kotlin.collections.G;
import kotlin.collections.N;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
@Service(alias = {"/audioChannel/switch"}, function = {IBridge.class, IBridge.class}, priority = 1)
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\"\n\u0002\u0010\b\n\u0002\b\u0003\b\u0007\u0018\u0000 \u001a2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0002\u001a\u001bB\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u001c\u0010\u0005\u001a\u00020\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\u00022\b\u0010\b\u001a\u0004\u0018\u00010\tH\u0014J\u0012\u0010\n\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\f\u001a\u00020\u000bH\u0002J\n\u0010\r\u001a\u0004\u0018\u00010\u000eH\u0002J\u0010\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u000eH\u0002J\u0010\u0010\u0012\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u000eH\u0002J\u0010\u0010\u0013\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u000eH\u0002J\u0010\u0010\u0014\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u000eH\u0002J \u0010\u0015\u001a\u0004\u0018\u00010\u00162\u0006\u0010\u0011\u001a\u00020\u000e2\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00190\u0018H\u0002¨\u0006\u001c"}, d2 = {"Lcom/transsnet/palmpay/core/rnbridge/bridge/AudioChannelBridge;", "Lcom/palmpay/lib/bridge/SyncBridge;", "Lcom/transsnet/palmpay/core/rnbridge/bridge/AudioChannelBridge$AudioChannelParam;", "<init>", "()V", "onHandle", "", "params", "callback", "Lcom/palmpay/lib/bridge/IBridgeCallback;", "normalizeChannel", "", "raw", "getAudioManager", "Landroid/media/AudioManager;", "switchToSpeaker", "", "audioManager", "switchToReceiver", "switchToWiredHeadset", "switchToBluetooth", "findCommunicationDevice", "Landroid/media/AudioDeviceInfo;", "targetTypes", "", "", "Companion", "AudioChannelParam", "module_common_impl_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nAudioChannelBridge.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AudioChannelBridge.kt\ncom/transsnet/palmpay/core/rnbridge/bridge/AudioChannelBridge\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,204:1\n295#2,2:205\n*S KotlinDebug\n*F\n+ 1 AudioChannelBridge.kt\ncom/transsnet/palmpay/core/rnbridge/bridge/AudioChannelBridge\n*L\n196#1:205,2\n*E\n"})
public final class AudioChannelBridge extends SyncBridge<AudioChannelParam> {

    @NotNull
    public static final String CHANNEL_BLUETOOTH = "bluetooth";

    @NotNull
    public static final String CHANNEL_HEADSET = "headset";

    @NotNull
    public static final String CHANNEL_RECEIVER = "receiver";

    @NotNull
    public static final String CHANNEL_SPEAKER = "speaker";

    @Keep
    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u000b\u0010\b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0015\u0010\t\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\r\u001a\u00020\u000eHÖ\u0001J\t\u0010\u000f\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0010"}, d2 = {"Lcom/transsnet/palmpay/core/rnbridge/bridge/AudioChannelBridge$AudioChannelParam;", "", AppsFlyerProperties.CHANNEL, "", "<init>", "(Ljava/lang/String;)V", "getChannel", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "module_common_impl_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class AudioChannelParam {

        @Nullable
        private final String channel;

        public AudioChannelParam(@Nullable String str) {
            this.channel = str;
        }

        public static /* synthetic */ AudioChannelParam copy$default(AudioChannelParam audioChannelParam, String str, int i7, Object obj) {
            if ((i7 & 1) != 0) {
                str = audioChannelParam.channel;
            }
            return audioChannelParam.copy(str);
        }

        @Nullable
        /* JADX INFO: renamed from: component1, reason: from getter */
        public final String getChannel() {
            return this.channel;
        }

        @NotNull
        public final AudioChannelParam copy(@Nullable String channel) {
            return new AudioChannelParam(channel);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof AudioChannelParam) && Intrinsics.c(this.channel, ((AudioChannelParam) other).channel);
        }

        @Nullable
        public final String getChannel() {
            return this.channel;
        }

        public int hashCode() {
            String str = this.channel;
            if (str == null) {
                return 0;
            }
            return str.hashCode();
        }

        @NotNull
        public String toString() {
            return q0.k("AudioChannelParam(channel=", this.channel, ")");
        }
    }

    private final AudioDeviceInfo findCommunicationDevice(AudioManager audioManager, Set<Integer> targetTypes) {
        Object obj = null;
        if (Build.VERSION.SDK_INT < 31) {
            return null;
        }
        List availableCommunicationDevices = audioManager.getAvailableCommunicationDevices();
        Intrinsics.checkNotNullExpressionValue(availableCommunicationDevices, "getAvailableCommunicationDevices(...)");
        for (Object obj2 : availableCommunicationDevices) {
            if (targetTypes.contains(Integer.valueOf(((AudioDeviceInfo) obj2).getType()))) {
                obj = obj2;
                break;
            }
        }
        return (AudioDeviceInfo) obj;
    }

    private final AudioManager getAudioManager() {
        Context activity = getActivity();
        if (activity == null) {
            activity = BaseApplication.getContext();
        }
        Object systemService = activity.getSystemService(PictureMimeType.MIME_TYPE_PREFIX_AUDIO);
        if (systemService instanceof AudioManager) {
            return (AudioManager) systemService;
        }
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:26:0x004e A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:36:0x0068 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:40:0x0072 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:46:0x0082 A[RETURN] */
    private final String normalizeChannel(String raw) {
        switch (raw) {
            case "speaker":
            case "loudspeaker":
                return CHANNEL_SPEAKER;
            case "wiredheadset":
                return CHANNEL_HEADSET;
            case "receiver":
                return CHANNEL_RECEIVER;
            case "earphone":
                return CHANNEL_HEADSET;
            case "earpiece":
                return CHANNEL_RECEIVER;
            case "bluetooth_sco":
            case "bt":
                return CHANNEL_BLUETOOTH;
            case "wired":
            case "headset":
                return CHANNEL_HEADSET;
            case "speakerphone":
                return CHANNEL_SPEAKER;
            case "wired_headset":
                return CHANNEL_HEADSET;
            case "bluetooth":
                return CHANNEL_BLUETOOTH;
            default:
                return null;
        }
    }

    private final boolean switchToBluetooth(AudioManager audioManager) {
        if (Build.VERSION.SDK_INT < 31) {
            audioManager.setSpeakerphoneOn(false);
            audioManager.startBluetoothSco();
            audioManager.setBluetoothScoOn(true);
            return true;
        }
        Integer[] elements = {7, 8};
        Intrinsics.checkNotNullParameter(elements, "elements");
        AudioDeviceInfo audioDeviceInfoFindCommunicationDevice = findCommunicationDevice(audioManager, C1847n.A(elements));
        if (audioDeviceInfoFindCommunicationDevice != null) {
            return audioManager.setCommunicationDevice(audioDeviceInfoFindCommunicationDevice);
        }
        return false;
    }

    private final boolean switchToReceiver(AudioManager audioManager) {
        if (Build.VERSION.SDK_INT < 31) {
            audioManager.stopBluetoothSco();
            audioManager.setBluetoothScoOn(false);
            audioManager.setSpeakerphoneOn(false);
            return true;
        }
        AudioDeviceInfo audioDeviceInfoFindCommunicationDevice = findCommunicationDevice(audioManager, N.b(1));
        if (audioDeviceInfoFindCommunicationDevice != null) {
            return audioManager.setCommunicationDevice(audioDeviceInfoFindCommunicationDevice);
        }
        audioManager.clearCommunicationDevice();
        return true;
    }

    private final boolean switchToSpeaker(AudioManager audioManager) {
        AudioDeviceInfo audioDeviceInfoFindCommunicationDevice;
        if (Build.VERSION.SDK_INT >= 31 && (audioDeviceInfoFindCommunicationDevice = findCommunicationDevice(audioManager, N.b(2))) != null) {
            return audioManager.setCommunicationDevice(audioDeviceInfoFindCommunicationDevice);
        }
        audioManager.stopBluetoothSco();
        audioManager.setBluetoothScoOn(false);
        audioManager.setSpeakerphoneOn(true);
        return true;
    }

    private final boolean switchToWiredHeadset(AudioManager audioManager) {
        if (Build.VERSION.SDK_INT >= 31) {
            Integer[] elements = {3, 4, 22};
            Intrinsics.checkNotNullParameter(elements, "elements");
            AudioDeviceInfo audioDeviceInfoFindCommunicationDevice = findCommunicationDevice(audioManager, C1847n.A(elements));
            if (audioDeviceInfoFindCommunicationDevice != null) {
                return audioManager.setCommunicationDevice(audioDeviceInfoFindCommunicationDevice);
            }
        } else if (audioManager.isWiredHeadsetOn()) {
            audioManager.stopBluetoothSco();
            audioManager.setBluetoothScoOn(false);
            audioManager.setSpeakerphoneOn(false);
            return true;
        }
        return false;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // com.palmpay.lib.bridge.BaseBridge
    public void onHandle(@Nullable AudioChannelParam params, @Nullable IBridgeCallback callback) {
        String strQ;
        boolean zSwitchToReceiver;
        String channel;
        String string;
        if (params == null || (channel = params.getChannel()) == null || (string = StringsKt.V(channel).toString()) == null) {
            strQ = null;
        } else {
            Locale locale = Locale.ROOT;
            strQ = u.q(locale, "ROOT", string, locale, "toLowerCase(...)");
        }
        if (strQ == null || strQ.length() == 0) {
            handleReject("channel is empty");
            return;
        }
        String strNormalizeChannel = normalizeChannel(strQ);
        if (strNormalizeChannel == null) {
            handleReject("unsupported channel: ".concat(strQ));
            return;
        }
        AudioManager audioManager = getAudioManager();
        if (audioManager == null) {
            handleReject("audio manager is null");
            return;
        }
        try {
            switch (strNormalizeChannel.hashCode()) {
                case -2008522753:
                    zSwitchToReceiver = !strNormalizeChannel.equals(CHANNEL_SPEAKER) ? false : switchToSpeaker(audioManager);
                    break;
                case -808719889:
                    if (strNormalizeChannel.equals(CHANNEL_RECEIVER)) {
                        zSwitchToReceiver = switchToReceiver(audioManager);
                    }
                    break;
                case 795320962:
                    if (strNormalizeChannel.equals(CHANNEL_HEADSET)) {
                        zSwitchToReceiver = switchToWiredHeadset(audioManager);
                    }
                    break;
                case 1968882350:
                    if (strNormalizeChannel.equals(CHANNEL_BLUETOOTH)) {
                        zSwitchToReceiver = switchToBluetooth(audioManager);
                    }
                    break;
                default:
                    break;
            }
            if (zSwitchToReceiver) {
                BaseBridge.handleSuccess$default(this, G.g(new Pair("success", Boolean.TRUE), new Pair(AppsFlyerProperties.CHANNEL, strNormalizeChannel)), null, 2, null);
            } else {
                handleReject("switch channel failed: ".concat(strNormalizeChannel));
            }
        } catch (Exception e10) {
            d.c("AudioChannelBridge", "switch channel error", e10);
            String message = e10.getMessage();
            if (message == null) {
                message = "switch channel exception";
            }
            handleReject(message);
        }
    }
}
