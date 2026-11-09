package androidx.transition;

import android.graphics.BlendMode;
import android.graphics.RenderNode;

/* JADX INFO: loaded from: classes.dex */
public abstract /* synthetic */ class l0 {
    public static /* bridge */ /* synthetic */ BlendMode f(Object obj) {
        return (BlendMode) obj;
    }

    public static /* synthetic */ RenderNode h() {
        return new RenderNode("OffscreenLayer.main");
    }

    public static /* synthetic */ RenderNode w() {
        return new RenderNode("OffscreenLayer.shadow");
    }
}
