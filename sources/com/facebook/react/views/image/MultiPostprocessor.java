package com.facebook.react.views.image;

import N8.q0;
import android.graphics.Bitmap;
import com.facebook.cache.common.CacheKey;
import com.facebook.common.references.CloseableReference;
import com.facebook.imagepipeline.request.Postprocessor;
import com.google.firebase.messaging.Constants;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.collections.r;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p032c3.b;
import p121i2.c;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u0000 \u00142\u00020\u0001:\u0001\u0014B\u0017\b\u0002\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\n\u0010\u000bJ%\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\f0\u00102\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00010\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0013¨\u0006\u0015"}, d2 = {"Lcom/facebook/react/views/image/MultiPostprocessor;", "Lcom/facebook/imagepipeline/request/Postprocessor;", "", "postprocessors", "<init>", "(Ljava/util/List;)V", "", "getName", "()Ljava/lang/String;", "Lcom/facebook/cache/common/CacheKey;", "getPostprocessorCacheKey", "()Lcom/facebook/cache/common/CacheKey;", "Landroid/graphics/Bitmap;", "sourceBitmap", "Lc3/b;", "bitmapFactory", "Lcom/facebook/common/references/CloseableReference;", "process", "(Landroid/graphics/Bitmap;Lc3/b;)Lcom/facebook/common/references/CloseableReference;", "Ljava/util/List;", "Companion", "ReactAndroid_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nMultiPostprocessor.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MultiPostprocessor.kt\ncom/facebook/react/views/image/MultiPostprocessor\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,62:1\n1563#2:63\n1634#2,3:64\n*S KotlinDebug\n*F\n+ 1 MultiPostprocessor.kt\ncom/facebook/react/views/image/MultiPostprocessor\n*L\n26#1:63\n26#1:64,3\n*E\n"})
public final class MultiPostprocessor implements Postprocessor {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private final List<Postprocessor> postprocessors;

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0007H\u0007¨\u0006\b"}, d2 = {"Lcom/facebook/react/views/image/MultiPostprocessor$Companion;", "", "<init>", "()V", Constants.MessagePayloadKeys.FROM, "Lcom/facebook/imagepipeline/request/Postprocessor;", "postprocessors", "", "ReactAndroid_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @JvmStatic
        @Nullable
        public final Postprocessor from(@NotNull List<? extends Postprocessor> postprocessors) {
            Intrinsics.checkNotNullParameter(postprocessors, "postprocessors");
            int size = postprocessors.size();
            DefaultConstructorMarker defaultConstructorMarker = null;
            if (size != 0) {
                return size != 1 ? new MultiPostprocessor(postprocessors, defaultConstructorMarker) : postprocessors.get(0);
            }
            return null;
        }

        private Companion() {
        }
    }

    public /* synthetic */ MultiPostprocessor(List list, DefaultConstructorMarker defaultConstructorMarker) {
        this(list);
    }

    @JvmStatic
    @Nullable
    public static final Postprocessor from(@NotNull List<? extends Postprocessor> list) {
        return INSTANCE.from(list);
    }

    @Override // com.facebook.imagepipeline.request.Postprocessor
    @NotNull
    public String getName() {
        return q0.k("MultiPostProcessor (", CollectionsKt.J(this.postprocessors, ",", null, null, null, 62), ")");
    }

    @Override // com.facebook.imagepipeline.request.Postprocessor
    @NotNull
    public CacheKey getPostprocessorCacheKey() {
        List<Postprocessor> list = this.postprocessors;
        ArrayList arrayList = new ArrayList(r.l(list, 10));
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(((Postprocessor) it.next()).getPostprocessorCacheKey());
        }
        return new c(arrayList);
    }

    @Override // com.facebook.imagepipeline.request.Postprocessor
    @NotNull
    public CloseableReference process(@NotNull Bitmap sourceBitmap, @NotNull b bitmapFactory) {
        Intrinsics.checkNotNullParameter(sourceBitmap, "sourceBitmap");
        Intrinsics.checkNotNullParameter(bitmapFactory, "bitmapFactory");
        CloseableReference closeableReferenceProcess = null;
        try {
            Iterator<Postprocessor> it = this.postprocessors.iterator();
            CloseableReference closeableReferenceClone = null;
            while (it.hasNext()) {
                closeableReferenceProcess = it.next().process(closeableReferenceClone != null ? (Bitmap) closeableReferenceClone.f() : sourceBitmap, bitmapFactory);
                CloseableReference.d(closeableReferenceClone);
                closeableReferenceClone = closeableReferenceProcess.clone();
            }
            if (closeableReferenceProcess != null) {
                CloseableReference closeableReferenceClone2 = closeableReferenceProcess.clone();
                Intrinsics.checkNotNullExpressionValue(closeableReferenceClone2, "clone(...)");
                closeableReferenceProcess.close();
                return closeableReferenceClone2;
            }
            throw new IllegalStateException(("MultiPostprocessor returned null bitmap - Number of Postprocessors: " + this.postprocessors.size()).toString());
        } catch (Throwable th) {
            CloseableReference.d(null);
            throw th;
        }
    }

    private MultiPostprocessor(List<? extends Postprocessor> list) {
        this.postprocessors = new LinkedList(list);
    }
}
