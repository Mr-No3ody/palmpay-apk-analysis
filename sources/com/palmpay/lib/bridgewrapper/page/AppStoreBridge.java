package com.palmpay.lib.bridgewrapper.page;

import android.app.Activity;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import com.didi.drouter.annotation.Service;
import com.palmpay.lib.bridge.IBridge;
import com.palmpay.lib.bridge.IBridgeCallback;
import com.palmpay.lib.bridge.SyncBridge;
import kotlin.Metadata;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
@Service(alias = {"/page/store"}, function = {IBridge.class})
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0003J\u001c\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u00022\b\u0010\u0007\u001a\u0004\u0018\u00010\bH\u0014¨\u0006\t"}, d2 = {"Lcom/palmpay/lib/bridgewrapper/page/AppStoreBridge;", "Lcom/palmpay/lib/bridge/SyncBridge;", "Ljava/lang/Void;", "()V", "onHandle", "", "params", "callback", "Lcom/palmpay/lib/bridge/IBridgeCallback;", "lib_bridgeWrapper_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
public final class AppStoreBridge extends SyncBridge<Void> {
    @Override // com.palmpay.lib.bridge.BaseBridge
    public void onHandle(@Nullable Void params, @Nullable IBridgeCallback callback) {
        PackageManager packageManager;
        Intent intent = new Intent("android.intent.action.VIEW");
        StringBuilder sb2 = new StringBuilder("market://details?id=");
        Activity activity = getActivity();
        sb2.append(activity != null ? activity.getPackageName() : null);
        intent.setData(Uri.parse(sb2.toString()));
        Activity activity2 = getActivity();
        if (((activity2 == null || (packageManager = activity2.getPackageManager()) == null) ? null : intent.resolveActivity(packageManager)) != null) {
            Activity activity3 = getActivity();
            if (activity3 != null) {
                activity3.startActivity(intent);
                return;
            }
            return;
        }
        StringBuilder sb3 = new StringBuilder("https://play.google.com/store/apps/details?id=");
        Activity activity4 = getActivity();
        sb3.append(activity4 != null ? activity4.getPackageName() : null);
        intent.setData(Uri.parse(sb3.toString()));
        Activity activity5 = getActivity();
        if (activity5 != null) {
            activity5.startActivity(intent);
        }
    }
}
