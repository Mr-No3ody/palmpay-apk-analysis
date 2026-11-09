package com.appsflyer.internal;

import com.appsflyer.internal.platform_extension.Plugin;
import com.appsflyer.internal.platform_extension.PluginInfo;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Pair;
import kotlin.collections.G;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
public final class AFi1kSDK implements AFi1lSDK {

    @NotNull
    private PluginInfo getMonetizationNetwork = new PluginInfo(Plugin.NATIVE, "6.18.1", null, 4, null);

    @Override // com.appsflyer.internal.AFi1lSDK
    @NotNull
    public final Map<String, Object> getCurrencyIso4217Code() {
        LinkedHashMap linkedHashMapH = G.h(new Pair("platform", this.getMonetizationNetwork.getPlugin().getPluginName()), new Pair("version", this.getMonetizationNetwork.getVersion()));
        if (!this.getMonetizationNetwork.getAdditionalParams().isEmpty()) {
            linkedHashMapH.put("extras", this.getMonetizationNetwork.getAdditionalParams());
        }
        return linkedHashMapH;
    }

    @Override // com.appsflyer.internal.AFi1lSDK
    public final void getRevenue(@NotNull PluginInfo pluginInfo) {
        Intrinsics.checkNotNullParameter(pluginInfo, "");
        this.getMonetizationNetwork = pluginInfo;
    }
}
