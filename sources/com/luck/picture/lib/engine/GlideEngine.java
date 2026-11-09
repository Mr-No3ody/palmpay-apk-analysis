package com.luck.picture.lib.engine;

import android.content.Context;
import android.widget.ImageView;
import com.bumptech.glide.b;
import com.bumptech.glide.load.resource.bitmap.C1335g;
import com.bumptech.glide.load.resource.bitmap.z;
import com.bumptech.glide.m;
import com.luck.picture.lib.utils.ActivityCompatHelper;

/* JADX INFO: loaded from: classes3.dex */
public class GlideEngine implements ImageEngine {

    public static final class InstanceHolder {
        static final GlideEngine instance = new GlideEngine(0);

        private InstanceHolder() {
        }
    }

    public /* synthetic */ GlideEngine(int i7) {
        this();
    }

    public static GlideEngine createGlideEngine() {
        return InstanceHolder.instance;
    }

    @Override // com.luck.picture.lib.engine.ImageEngine
    public void loadAlbumCover(Context context, String str, ImageView imageView) {
        if (ActivityCompatHelper.assertValidRequest(context)) {
            ((m) ((m) ((m) b.e(context).b().load(str).w(180, 180)).E()).L(new C1335g(), new z(8))).S(imageView);
        }
    }

    @Override // com.luck.picture.lib.engine.ImageEngine
    public void loadGridImage(Context context, String str, ImageView imageView) {
        if (ActivityCompatHelper.assertValidRequest(context)) {
            ((m) ((m) b.e(context).load(str).w(200, 200)).c()).S(imageView);
        }
    }

    @Override // com.luck.picture.lib.engine.ImageEngine
    public void loadImage(Context context, String str, ImageView imageView) {
        if (ActivityCompatHelper.assertValidRequest(context)) {
            b.e(context).load(str).S(imageView);
        }
    }

    @Override // com.luck.picture.lib.engine.ImageEngine
    public void pauseRequests(Context context) {
        if (ActivityCompatHelper.assertValidRequest(context)) {
            b.e(context).q();
        }
    }

    @Override // com.luck.picture.lib.engine.ImageEngine
    public void resumeRequests(Context context) {
        if (ActivityCompatHelper.assertValidRequest(context)) {
            b.e(context).r();
        }
    }

    private GlideEngine() {
    }

    @Override // com.luck.picture.lib.engine.ImageEngine
    public void loadImage(Context context, ImageView imageView, String str, int i7, int i10) {
        if (ActivityCompatHelper.assertValidRequest(context)) {
            ((m) b.e(context).load(str).w(i7, i10)).S(imageView);
        }
    }
}
