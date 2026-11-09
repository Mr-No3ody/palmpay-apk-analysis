package com.facebook.fresco.urimod;

import T2.a;
import T2.b;
import android.net.Uri;
import com.facebook.common.callercontext.ContextChain;
import com.facebook.drawee.drawable.ScalingUtils$ScaleType;
import com.facebook.fresco.vito.source.UriImageSource;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001:\u0001\rJK\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\b\u0010\b\u001a\u0004\u0018\u00010\u00012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t2\b\b\u0002\u0010\f\u001a\u00020\u000bH&¢\u0006\u0004\b\u000e\u0010\u000fJ#\u0010\u0012\u001a\u0004\u0018\u00010\u00102\u0006\u0010\u0011\u001a\u00020\u00102\b\u0010\b\u001a\u0004\u0018\u00010\u0001H&¢\u0006\u0004\b\u0012\u0010\u0013J\u0017\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0011\u001a\u00020\u0010H&¢\u0006\u0004\b\u0015\u0010\u0016¨\u0006\u0017"}, d2 = {"Lcom/facebook/fresco/urimod/UriModifierInterface;", "", "Lcom/facebook/fresco/vito/source/UriImageSource;", "imageSource", "LT2/a;", "viewport", "Lcom/facebook/drawee/drawable/ScalingUtils$ScaleType;", "scaleType", "callerContext", "Lcom/facebook/common/callercontext/ContextChain;", "contextChain", "", "forLoggingOnly", "LT2/b;", "modifyUri", "(Lcom/facebook/fresco/vito/source/UriImageSource;LT2/a;Lcom/facebook/drawee/drawable/ScalingUtils$ScaleType;Ljava/lang/Object;Lcom/facebook/common/callercontext/ContextChain;Z)LT2/b;", "Landroid/net/Uri;", "uri", "modifyPrefetchUri", "(Landroid/net/Uri;Ljava/lang/Object;)Landroid/net/Uri;", "", "unregisterReverseFallbackUri", "(Landroid/net/Uri;)V", "urimod_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public interface UriModifierInterface {
    @Nullable
    Uri modifyPrefetchUri(@NotNull Uri uri, @Nullable Object callerContext);

    @NotNull
    b modifyUri(@NotNull UriImageSource imageSource, @Nullable a viewport, @Nullable ScalingUtils$ScaleType scaleType, @Nullable Object callerContext, @Nullable ContextChain contextChain, boolean forLoggingOnly);

    void unregisterReverseFallbackUri(@NotNull Uri uri);
}
