package com.facebook.react.modules.systeminfo;

import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.collections.G;
import kotlin.jvm.JvmField;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u001e\u0010\u0004\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u00058\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u0007"}, d2 = {"Lcom/facebook/react/modules/systeminfo/ReactNativeVersion;", "", "<init>", "()V", "VERSION", "", "", "ReactAndroid_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class ReactNativeVersion {

    @NotNull
    public static final ReactNativeVersion INSTANCE = new ReactNativeVersion();

    @JvmField
    @NotNull
    public static final Map<String, Object> VERSION = G.g(new Pair("major", 0), new Pair("minor", 81), new Pair("patch", 5), new Pair("prerelease", null));

    private ReactNativeVersion() {
    }
}
