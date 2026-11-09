package com.transsnet.palmpay.core.rnbridge.bridge;

import F6.d;
import android.content.Context;
import android.media.AudioDeviceInfo;
import android.media.AudioManager;
import android.os.Build;
import com.didi.drouter.annotation.Service;
import com.luck.picture.lib.config.PictureMimeType;
import com.palmpay.lib.bridge.BaseBridge;
import com.palmpay.lib.bridge.IBridge;
import com.palmpay.lib.bridge.IBridgeCallback;
import com.palmpay.lib.bridge.SyncBridge;
import com.transsnet.palmpay.core.base.BaseApplication;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.collections.CollectionsKt;
import kotlin.collections.G;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
@Service(alias = {"/audioChannel/current"}, function = {IBridge.class, IBridge.class}, priority = 1)
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010 \n\u0000\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u001c\u0010\u0005\u001a\u00020\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\u00022\b\u0010\b\u001a\u0004\u0018\u00010\tH\u0014J\n\u0010\n\u001a\u0004\u0018\u00010\u000bH\u0002J\u0010\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000bH\u0002J\u0010\u0010\u000f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000bH\u0002J\u0016\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\r0\u00112\u0006\u0010\u000e\u001a\u00020\u000bH\u0002¨\u0006\u0012"}, d2 = {"Lcom/transsnet/palmpay/core/rnbridge/bridge/AudioChannelQueryBridge;", "Lcom/palmpay/lib/bridge/SyncBridge;", "Ljava/lang/Void;", "<init>", "()V", "onHandle", "", "params", "callback", "Lcom/palmpay/lib/bridge/IBridgeCallback;", "getAudioManager", "Landroid/media/AudioManager;", "resolveCurrentChannel", "", "audioManager", "inferCurrentChannelByFlags", "resolveAvailableChannels", "", "module_common_impl_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nAudioChannelQueryBridge.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AudioChannelQueryBridge.kt\ncom/transsnet/palmpay/core/rnbridge/bridge/AudioChannelQueryBridge\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,117:1\n1869#2,2:118\n*S KotlinDebug\n*F\n+ 1 AudioChannelQueryBridge.kt\ncom/transsnet/palmpay/core/rnbridge/bridge/AudioChannelQueryBridge\n*L\n94#1:118,2\n*E\n"})
public final class AudioChannelQueryBridge extends SyncBridge<Void> {
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

    private final String inferCurrentChannelByFlags(AudioManager audioManager) {
        if (audioManager.isBluetoothScoOn()) {
            return AudioChannelBridge.CHANNEL_BLUETOOTH;
        }
        if (audioManager.isWiredHeadsetOn()) {
            return AudioChannelBridge.CHANNEL_HEADSET;
        }
        return audioManager.isSpeakerphoneOn() ? AudioChannelBridge.CHANNEL_SPEAKER : AudioChannelBridge.CHANNEL_RECEIVER;
    }

    private final List<String> resolveAvailableChannels(AudioManager audioManager) {
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        linkedHashSet.add(AudioChannelBridge.CHANNEL_SPEAKER);
        linkedHashSet.add(AudioChannelBridge.CHANNEL_RECEIVER);
        if (Build.VERSION.SDK_INT < 31) {
            if (audioManager.isWiredHeadsetOn()) {
                linkedHashSet.add(AudioChannelBridge.CHANNEL_HEADSET);
            }
            if (audioManager.isBluetoothScoOn()) {
                linkedHashSet.add(AudioChannelBridge.CHANNEL_BLUETOOTH);
            }
            return CollectionsKt.Y(linkedHashSet);
        }
        List availableCommunicationDevices = audioManager.getAvailableCommunicationDevices();
        Intrinsics.checkNotNullExpressionValue(availableCommunicationDevices, "getAvailableCommunicationDevices(...)");
        Iterator it = availableCommunicationDevices.iterator();
        while (it.hasNext()) {
            int type = ((AudioDeviceInfo) it.next()).getType();
            if (type == 1) {
                linkedHashSet.add(AudioChannelBridge.CHANNEL_RECEIVER);
            } else if (type != 2) {
                if (type != 3 && type != 4) {
                    if (type == 7 || type == 8) {
                        linkedHashSet.add(AudioChannelBridge.CHANNEL_BLUETOOTH);
                    } else if (type != 22) {
                    }
                }
                linkedHashSet.add(AudioChannelBridge.CHANNEL_HEADSET);
            } else {
                linkedHashSet.add(AudioChannelBridge.CHANNEL_SPEAKER);
            }
        }
        return CollectionsKt.Y(linkedHashSet);
    }

    private final String resolveCurrentChannel(AudioManager audioManager) {
        if (Build.VERSION.SDK_INT < 31) {
            return inferCurrentChannelByFlags(audioManager);
        }
        AudioDeviceInfo communicationDevice = audioManager.getCommunicationDevice();
        Integer numValueOf = communicationDevice != null ? Integer.valueOf(communicationDevice.getType()) : null;
        if (numValueOf != null && numValueOf.intValue() == 2) {
            return AudioChannelBridge.CHANNEL_SPEAKER;
        }
        if (numValueOf != null && numValueOf.intValue() == 1) {
            return AudioChannelBridge.CHANNEL_RECEIVER;
        }
        if (numValueOf != null && numValueOf.intValue() == 3) {
            return AudioChannelBridge.CHANNEL_HEADSET;
        }
        if (numValueOf != null && numValueOf.intValue() == 4) {
            return AudioChannelBridge.CHANNEL_HEADSET;
        }
        if (numValueOf != null && numValueOf.intValue() == 22) {
            return AudioChannelBridge.CHANNEL_HEADSET;
        }
        if (numValueOf != null && numValueOf.intValue() == 7) {
            return AudioChannelBridge.CHANNEL_BLUETOOTH;
        }
        return (numValueOf != null && numValueOf.intValue() == 8) ? AudioChannelBridge.CHANNEL_BLUETOOTH : inferCurrentChannelByFlags(audioManager);
    }

    @Override // com.palmpay.lib.bridge.BaseBridge
    public void onHandle(@Nullable Void params, @Nullable IBridgeCallback callback) {
        AudioManager audioManager = getAudioManager();
        if (audioManager == null) {
            handleReject("audio manager is null");
            return;
        }
        try {
            String strResolveCurrentChannel = resolveCurrentChannel(audioManager);
            List<String> listResolveAvailableChannels = resolveAvailableChannels(audioManager);
            d.h("AudioChannelQueryBridge", 3, strResolveCurrentChannel + " " + listResolveAvailableChannels);
            BaseBridge.handleSuccess$default(this, G.g(new Pair("currentChannel", strResolveCurrentChannel), new Pair("availableChannels", listResolveAvailableChannels)), null, 2, null);
        } catch (Exception e10) {
            d.c("AudioChannelQueryBridge", "query channel error", e10);
            String message = e10.getMessage();
            if (message == null) {
                message = "query channel exception";
            }
            handleReject(message);
        }
    }
}
