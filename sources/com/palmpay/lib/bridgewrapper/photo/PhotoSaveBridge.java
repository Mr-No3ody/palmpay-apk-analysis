package com.palmpay.lib.bridgewrapper.photo;

import Ef.a;
import Ff.h;
import Wf.AbstractC0780y;
import Wf.I;
import android.app.Activity;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.net.Uri;
import android.text.TextUtils;
import android.util.Base64;
import androidx.annotation.Keep;
import androidx.appcompat.app.AbstractActivityC0837o;
import androidx.camera.core.impl.utils.executor.g;
import androidx.lifecycle.LifecycleCoroutineScopeImpl;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.V;
import com.didi.drouter.annotation.Service;
import com.luck.picture.lib.config.PictureMimeType;
import com.palmpay.image.callback.IBitmap;
import com.palmpay.image.loader.b;
import com.palmpay.lib.bridge.BaseBridge;
import com.palmpay.lib.bridge.IBridge;
import com.palmpay.lib.bridge.IBridgeCallback;
import com.palmpay.lib.bridge.SyncBridge;
import com.palmpay.lib.bridgewrapper.util.ImageUtil;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;
import kotlin.text.y;
import kotlinx.coroutines.CoroutineScope;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p042cg.e;
import p042cg.f;

/* JADX INFO: loaded from: classes3.dex */
@Service(alias = {"/photo/save"}, function = {IBridge.class})
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\b\u0003\b\u0017\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0002\u0018\u0019B\u0005¢\u0006\u0002\u0010\u0003J\u0014\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007H\u0002J$\u0010\b\u001a\u00020\t2\b\u0010\n\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\f\u001a\u00020\u00072\b\u0010\r\u001a\u0004\u0018\u00010\u000eH\u0016J\u001c\u0010\u000f\u001a\u00020\t2\b\u0010\u0010\u001a\u0004\u0018\u00010\u00022\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012H\u0014J&\u0010\u0013\u001a\u00020\t2\b\u0010\n\u001a\u0004\u0018\u00010\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\u00072\b\u0010\u0014\u001a\u0004\u0018\u00010\u0007H\u0002J\"\u0010\u0015\u001a\u00020\t2\b\u0010\n\u001a\u0004\u0018\u00010\u000b2\u000e\u0010\u0016\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0017H\u0002¨\u0006\u001a"}, d2 = {"Lcom/palmpay/lib/bridgewrapper/photo/PhotoSaveBridge;", "Lcom/palmpay/lib/bridge/SyncBridge;", "Lcom/palmpay/lib/bridgewrapper/photo/PhotoSaveBridge$SaveGalleryParam;", "()V", "base64ToPicture", "Landroid/graphics/Bitmap;", "imgBase64", "", "loadImage", "", "context", "Landroid/content/Context;", "url", "cb", "Lcom/palmpay/lib/bridgewrapper/photo/PhotoSaveBridge$ILoaderImage;", "onHandle", "params", "callback", "Lcom/palmpay/lib/bridge/IBridgeCallback;", "save2Gallery", "name", "savePhotos", "urlsList", "", "ILoaderImage", "SaveGalleryParam", "lib_bridgeWrapper_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
public class PhotoSaveBridge extends SyncBridge<SaveGalleryParam> {

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H&¨\u0006\u0006"}, d2 = {"Lcom/palmpay/lib/bridgewrapper/photo/PhotoSaveBridge$ILoaderImage;", "", "onResult", "", "bitmap", "Landroid/graphics/Bitmap;", "lib_bridgeWrapper_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
    public interface ILoaderImage {
        void onResult(@Nullable Bitmap bitmap);
    }

    @Keep
    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u000e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005¢\u0006\u0002\u0010\u0007J\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\u0011\u0010\u0011\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005HÆ\u0003J%\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u0010\b\u0002\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005HÆ\u0001J\u0013\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0017\u001a\u00020\u0006HÖ\u0001R\"\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000f¨\u0006\u0018"}, d2 = {"Lcom/palmpay/lib/bridgewrapper/photo/PhotoSaveBridge$SaveGalleryParam;", "", "type", "", "images", "", "", "(ILjava/util/List;)V", "getImages", "()Ljava/util/List;", "setImages", "(Ljava/util/List;)V", "getType", "()I", "setType", "(I)V", "component1", "component2", "copy", "equals", "", "other", "hashCode", "toString", "lib_bridgeWrapper_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
    public static final /* data */ class SaveGalleryParam {

        @Nullable
        private List<String> images;
        private int type;

        public SaveGalleryParam(int i7, @Nullable List<String> list) {
            this.type = i7;
            this.images = list;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ SaveGalleryParam copy$default(SaveGalleryParam saveGalleryParam, int i7, List list, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                i7 = saveGalleryParam.type;
            }
            if ((i10 & 2) != 0) {
                list = saveGalleryParam.images;
            }
            return saveGalleryParam.copy(i7, list);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final int getType() {
            return this.type;
        }

        @Nullable
        public final List<String> component2() {
            return this.images;
        }

        @NotNull
        public final SaveGalleryParam copy(int type, @Nullable List<String> images) {
            return new SaveGalleryParam(type, images);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof SaveGalleryParam)) {
                return false;
            }
            SaveGalleryParam saveGalleryParam = (SaveGalleryParam) other;
            return this.type == saveGalleryParam.type && Intrinsics.c(this.images, saveGalleryParam.images);
        }

        @Nullable
        public final List<String> getImages() {
            return this.images;
        }

        public final int getType() {
            return this.type;
        }

        public int hashCode() {
            int iHashCode = Integer.hashCode(this.type) * 31;
            List<String> list = this.images;
            return iHashCode + (list == null ? 0 : list.hashCode());
        }

        public final void setImages(@Nullable List<String> list) {
            this.images = list;
        }

        public final void setType(int i7) {
            this.type = i7;
        }

        @NotNull
        public String toString() {
            return "SaveGalleryParam(type=" + this.type + ", images=" + this.images + ')';
        }
    }

    /* JADX INFO: renamed from: com.palmpay.lib.bridgewrapper.photo.PhotoSaveBridge$save2Gallery$2, reason: invalid class name */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 7, 1}, xi = 48)
    @DebugMetadata(c = "com.palmpay.lib.bridgewrapper.photo.PhotoSaveBridge$save2Gallery$2", f = "PhotoSaveBridge.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class AnonymousClass2 extends h implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ Context $context;
        final /* synthetic */ String $fileName;
        final /* synthetic */ String $url;
        private /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(String str, Context context, String str2, Continuation<? super AnonymousClass2> continuation) {
            super(2, continuation);
            this.$url = str;
            this.$context = context;
            this.$fileName = str2;
        }

        @Override // Ff.a
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            AnonymousClass2 anonymousClass2 = PhotoSaveBridge.this.new AnonymousClass2(this.$url, this.$context, this.$fileName, continuation);
            anonymousClass2.L$0 = obj;
            return anonymousClass2;
        }

        @Override // Ff.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) throws IOException {
            Unit unit;
            a aVar = a.f2423a;
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            g.M(obj);
            Bitmap bitmapBase64ToPicture = PhotoSaveBridge.this.base64ToPicture(this.$url);
            if (bitmapBase64ToPicture != null) {
                Context context = this.$context;
                String str = this.$fileName;
                final PhotoSaveBridge photoSaveBridge = PhotoSaveBridge.this;
                ImageUtil.save2Album$default(ImageUtil.INSTANCE, context, bitmapBase64ToPicture, str, null, 0, new ImageUtil.AlbumListener() { // from class: com.palmpay.lib.bridgewrapper.photo.PhotoSaveBridge$save2Gallery$2$1$1
                    @Override // com.palmpay.lib.bridgewrapper.util.ImageUtil.AlbumListener
                    public void onCompleted(@Nullable String path, @Nullable Uri uri) {
                        Unit unit2;
                        if (uri != null) {
                            photoSaveBridge.handleSuccess();
                            unit2 = Unit.f38893a;
                        } else {
                            unit2 = null;
                        }
                        if (unit2 == null) {
                            BaseBridge.handleFail$default(photoSaveBridge, null, 1, null);
                        }
                    }
                }, 24, null);
                unit = Unit.f38893a;
            } else {
                unit = null;
            }
            if (unit == null) {
                BaseBridge.handleFail$default(PhotoSaveBridge.this, null, 1, null);
            }
            return Unit.f38893a;
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
            return ((AnonymousClass2) create(coroutineScope, continuation)).invokeSuspend(Unit.f38893a);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Bitmap base64ToPicture(String imgBase64) {
        String str;
        if (imgBase64 != null) {
            try {
                List listSplit$default = StringsKt__StringsKt.split$default(imgBase64, new String[]{","}, false, 0, 6, null);
                str = (String) (listSplit$default.size() > 1 ? listSplit$default.get(1) : listSplit$default.get(0));
            } catch (Exception unused) {
            }
        } else {
            str = null;
        }
        if (str != null) {
            byte[] bArrDecode = Base64.decode(str, 0);
            Intrinsics.checkNotNullExpressionValue(bArrDecode, "decode(it, Base64.DEFAULT)");
            return BitmapFactory.decodeByteArray(bArrDecode, 0, bArrDecode.length);
        }
        return null;
    }

    private final void save2Gallery(final Context context, String url, String name) {
        Exception exc;
        AbstractActivityC0837o abstractActivityC0837o;
        if (!TextUtils.isEmpty(url)) {
            final String str = name + '_' + System.currentTimeMillis() + PictureMimeType.JPG;
            if ((url != null && y.m(url, "http", false)) || (url != null && y.m(url, "file://", false))) {
                loadImage(context, url, new ILoaderImage() { // from class: com.palmpay.lib.bridgewrapper.photo.PhotoSaveBridge.save2Gallery.1
                    @Override // com.palmpay.lib.bridgewrapper.photo.PhotoSaveBridge.ILoaderImage
                    public void onResult(@Nullable Bitmap bitmap) throws IOException {
                        if (bitmap == null) {
                            BaseBridge.handleFail$default(PhotoSaveBridge.this, null, 1, null);
                            return;
                        }
                        Context context2 = context;
                        if (context2 != null) {
                            String str2 = str;
                            final PhotoSaveBridge photoSaveBridge = PhotoSaveBridge.this;
                            ImageUtil.save2Album$default(ImageUtil.INSTANCE, context2, bitmap, str2, null, 0, new ImageUtil.AlbumListener() { // from class: com.palmpay.lib.bridgewrapper.photo.PhotoSaveBridge$save2Gallery$1$onResult$1$1
                                @Override // com.palmpay.lib.bridgewrapper.util.ImageUtil.AlbumListener
                                public void onCompleted(@Nullable String path, @Nullable Uri uri) {
                                    Unit unit;
                                    if (uri != null) {
                                        photoSaveBridge.handleSuccess();
                                        unit = Unit.f38893a;
                                    } else {
                                        unit = null;
                                    }
                                    if (unit == null) {
                                        BaseBridge.handleFail$default(photoSaveBridge, null, 1, null);
                                    }
                                }
                            }, 24, null);
                        }
                    }
                });
                return;
            }
            try {
                if (context instanceof AbstractActivityC0837o) {
                    try {
                        abstractActivityC0837o = (AbstractActivityC0837o) context;
                    } catch (Exception e10) {
                        exc = e10;
                        exc.printStackTrace();
                        BaseBridge.handleFail$default(this, null, 1, null);
                    }
                } else {
                    abstractActivityC0837o = null;
                }
                if (abstractActivityC0837o != null) {
                    LifecycleCoroutineScopeImpl lifecycleCoroutineScopeImplF = V.f(abstractActivityC0837o);
                    f fVar = I.f10809a;
                    try {
                        AbstractC0780y.m(lifecycleCoroutineScopeImplF, e.f19009c, null, new AnonymousClass2(url, context, str, null), 2);
                    } catch (Exception e11) {
                        e = e11;
                        exc = e;
                        exc.printStackTrace();
                        BaseBridge.handleFail$default(this, null, 1, null);
                    }
                }
            } catch (Exception e12) {
                e = e12;
            }
        }
    }

    private final void savePhotos(Context context, List<String> urlsList) {
        Unit unit;
        if (urlsList != null) {
            Iterator<String> it = urlsList.iterator();
            while (it.hasNext()) {
                save2Gallery(context, it.next(), "image");
            }
            unit = Unit.f38893a;
        } else {
            unit = null;
        }
        if (unit == null) {
            handleIllegalArgument("images is empty");
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v3, types: [com.palmpay.lib.bridgewrapper.photo.PhotoSaveBridge$loadImage$1] */
    public void loadImage(@Nullable Context context, @NotNull String url, @Nullable final ILoaderImage cb2) {
        Intrinsics.checkNotNullParameter(url, "url");
        b bVar = new b();
        Intrinsics.f(context, "null cannot be cast to non-null type androidx.lifecycle.LifecycleOwner");
        bVar.f23728b = ((LifecycleOwner) context).getLifecycle();
        bVar.f23727a = new IBitmap() { // from class: com.palmpay.lib.bridgewrapper.photo.PhotoSaveBridge.loadImage.1
            @Override // com.palmpay.image.callback.IResult
            public void onFail() {
                ILoaderImage iLoaderImage = cb2;
                if (iLoaderImage != null) {
                    iLoaderImage.onResult(null);
                }
            }

            @Override // com.palmpay.image.callback.IResult
            public void onSuccess(@Nullable Bitmap result) {
                ILoaderImage iLoaderImage = cb2;
                if (iLoaderImage != null) {
                    iLoaderImage.onResult(result);
                }
            }
        };
        bVar.a();
    }

    @Override // com.palmpay.lib.bridge.BaseBridge
    public void onHandle(@Nullable SaveGalleryParam params, @Nullable IBridgeCallback callback) {
        Unit unit;
        Activity activity = getActivity();
        AbstractActivityC0837o abstractActivityC0837o = activity instanceof AbstractActivityC0837o ? (AbstractActivityC0837o) activity : null;
        if (abstractActivityC0837o != null) {
            if (params != null) {
                savePhotos(abstractActivityC0837o, params.getImages());
                unit = Unit.f38893a;
            } else {
                unit = null;
            }
            if (unit == null) {
                BaseBridge.handleIllegalArgument$default(this, null, 1, null);
            }
        }
    }
}
