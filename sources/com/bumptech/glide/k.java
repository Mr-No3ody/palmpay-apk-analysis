package com.bumptech.glide;

import android.content.ContentResolver;
import android.content.Context;
import android.content.res.AssetFileDescriptor;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Build;
import android.os.ParcelFileDescriptor;
import com.bumptech.glide.gifdecoder.GifDecoder;
import com.bumptech.glide.load.ResourceDecoder;
import com.bumptech.glide.load.ResourceEncoder;
import com.bumptech.glide.load.engine.bitmap_recycle.BitmapPool;
import com.bumptech.glide.load.model.C;
import com.bumptech.glide.load.model.C1324a;
import com.bumptech.glide.load.model.C1326c;
import com.bumptech.glide.load.model.ModelLoaderFactory;
import com.bumptech.glide.load.model.y;
import com.bumptech.glide.load.model.z;
import com.bumptech.glide.load.resource.bitmap.C1329a;
import com.bumptech.glide.load.resource.bitmap.C1330b;
import com.bumptech.glide.load.resource.bitmap.C1333e;
import com.bumptech.glide.load.resource.bitmap.C1334f;
import com.bumptech.glide.load.resource.bitmap.D;
import com.bumptech.glide.load.resource.bitmap.E;
import com.bumptech.glide.load.resource.bitmap.G;
import com.bumptech.glide.load.resource.bitmap.s;
import com.bumptech.glide.load.resource.transcode.ResourceTranscoder;
import com.bumptech.glide.module.GlideModule;
import java.io.File;
import java.io.InputStream;
import java.net.URL;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public abstract class k {
    public static j a(b bVar, List list, com.bumptech.glide.module.a aVar) {
        ResourceDecoder c1333e;
        ResourceDecoder c1329a;
        BitmapPool bitmapPool = bVar.f20434b;
        f fVar = bVar.f20436d;
        Context applicationContext = fVar.getApplicationContext();
        Oe.a aVar2 = fVar.f20466h;
        j jVar = new j();
        com.bumptech.glide.load.resource.bitmap.l lVar = new com.bumptech.glide.load.resource.bitmap.l();
        F1.c cVar = jVar.f20500g;
        synchronized (cVar) {
            cVar.f2517a.add(lVar);
        }
        int i7 = Build.VERSION.SDK_INT;
        if (i7 >= 27) {
            s sVar = new s();
            F1.c cVar2 = jVar.f20500g;
            synchronized (cVar2) {
                cVar2.f2517a.add(sVar);
            }
        }
        Resources resources = applicationContext.getResources();
        ArrayList arrayListE = jVar.e();
        com.bumptech.glide.load.engine.bitmap_recycle.f fVar2 = bVar.f20437e;
        com.bumptech.glide.load.resource.gif.b bVar2 = new com.bumptech.glide.load.resource.gif.b(applicationContext, arrayListE, bitmapPool, fVar2);
        ResourceDecoder g7 = new G(bitmapPool, new E(2));
        com.bumptech.glide.load.resource.bitmap.o oVar = new com.bumptech.glide.load.resource.bitmap.o(jVar.e(), resources.getDisplayMetrics(), bitmapPool, fVar2);
        if (i7 < 28 || !((Map) aVar2.f6830b).containsKey(c.class)) {
            c1333e = new C1333e(oVar, 0);
            c1329a = new C1329a(2, oVar, fVar2);
        } else {
            c1329a = new C1334f(1);
            c1333e = new C1334f(0);
        }
        if (i7 >= 28) {
            jVar.d("Animation", InputStream.class, Drawable.class, new C1.a(new C1.b(arrayListE, fVar2), 1));
            jVar.d("Animation", ByteBuffer.class, Drawable.class, new C1.a(new C1.b(arrayListE, fVar2), 0));
        }
        ResourceDecoder eVar = new C1.e(applicationContext);
        ResourceEncoder c1330b = new C1330b(fVar2);
        ResourceTranscoder aVar3 = new C4.a(1);
        ResourceTranscoder bVar3 = new E1.b(1);
        ContentResolver contentResolver = applicationContext.getContentResolver();
        jVar.a(ByteBuffer.class, new C1326c(2));
        jVar.a(InputStream.class, new com.bumptech.glide.load.model.s(fVar2));
        jVar.d("Bitmap", ByteBuffer.class, Bitmap.class, c1333e);
        jVar.d("Bitmap", InputStream.class, Bitmap.class, c1329a);
        String str = Build.FINGERPRINT;
        if (!"robolectric".equals(str)) {
            jVar.d("Bitmap", ParcelFileDescriptor.class, Bitmap.class, new C1333e(oVar, 1));
        }
        jVar.d("Bitmap", AssetFileDescriptor.class, Bitmap.class, new G(bitmapPool, new E(0)));
        jVar.d("Bitmap", ParcelFileDescriptor.class, Bitmap.class, g7);
        ModelLoaderFactory modelLoaderFactory = z.f20889b;
        jVar.c(Bitmap.class, Bitmap.class, modelLoaderFactory);
        jVar.d("Bitmap", Bitmap.class, Bitmap.class, new D());
        jVar.b(Bitmap.class, c1330b);
        jVar.d("BitmapDrawable", ByteBuffer.class, BitmapDrawable.class, new C1329a(resources, c1333e));
        jVar.d("BitmapDrawable", InputStream.class, BitmapDrawable.class, new C1329a(resources, c1329a));
        jVar.d("BitmapDrawable", ParcelFileDescriptor.class, BitmapDrawable.class, new C1329a(resources, g7));
        jVar.b(BitmapDrawable.class, new p039cb.c(3, bitmapPool, c1330b));
        jVar.d("Animation", InputStream.class, com.bumptech.glide.load.resource.gif.d.class, new com.bumptech.glide.load.resource.gif.j(arrayListE, bVar2, fVar2));
        jVar.d("Animation", ByteBuffer.class, com.bumptech.glide.load.resource.gif.d.class, bVar2);
        jVar.b(com.bumptech.glide.load.resource.gif.d.class, new org.sufficientlysecure.htmltextview.n(4));
        jVar.c(GifDecoder.class, GifDecoder.class, modelLoaderFactory);
        jVar.d("Bitmap", GifDecoder.class, Bitmap.class, new C1.a(bitmapPool, 2));
        jVar.d("legacy_append", Uri.class, Drawable.class, eVar);
        jVar.d("legacy_append", Uri.class, Bitmap.class, new C1329a(1, eVar, bitmapPool));
        jVar.h(new B1.a());
        jVar.c(File.class, ByteBuffer.class, new z(3));
        jVar.c(File.class, InputStream.class, new com.bumptech.glide.load.model.j(new C1326c(5)));
        jVar.d("legacy_append", File.class, File.class, new C1.f(1));
        jVar.c(File.class, ParcelFileDescriptor.class, new com.bumptech.glide.load.model.j(new C1326c(4)));
        jVar.c(File.class, File.class, modelLoaderFactory);
        jVar.h(new com.bumptech.glide.load.data.j(fVar2));
        if (!"robolectric".equals(str)) {
            jVar.h(new com.bumptech.glide.load.data.l());
        }
        ModelLoaderFactory hVar = new com.bumptech.glide.load.model.h(applicationContext, 2);
        ModelLoaderFactory hVar2 = new com.bumptech.glide.load.model.h(applicationContext, 0);
        ModelLoaderFactory hVar3 = new com.bumptech.glide.load.model.h(applicationContext, 1);
        Class cls = Integer.TYPE;
        jVar.c(cls, InputStream.class, hVar);
        jVar.c(Integer.class, InputStream.class, hVar);
        jVar.c(cls, AssetFileDescriptor.class, hVar2);
        jVar.c(Integer.class, AssetFileDescriptor.class, hVar2);
        jVar.c(cls, Drawable.class, hVar3);
        jVar.c(Integer.class, Drawable.class, hVar3);
        jVar.c(Uri.class, InputStream.class, new com.bumptech.glide.load.model.h(applicationContext, 5));
        jVar.c(Uri.class, AssetFileDescriptor.class, new com.bumptech.glide.load.model.h(applicationContext, 4));
        ModelLoaderFactory yVar = new y(resources, 2);
        ModelLoaderFactory yVar2 = new y(resources, 0);
        ModelLoaderFactory yVar3 = new y(resources, 1);
        jVar.c(Integer.class, Uri.class, yVar);
        jVar.c(cls, Uri.class, yVar);
        jVar.c(Integer.class, AssetFileDescriptor.class, yVar2);
        jVar.c(cls, AssetFileDescriptor.class, yVar2);
        jVar.c(Integer.class, InputStream.class, yVar3);
        jVar.c(cls, InputStream.class, yVar3);
        jVar.c(String.class, InputStream.class, new C1324a());
        jVar.c(Uri.class, InputStream.class, new C1324a());
        jVar.c(String.class, InputStream.class, new z(6));
        jVar.c(String.class, ParcelFileDescriptor.class, new z(5));
        jVar.c(String.class, AssetFileDescriptor.class, new z(4));
        jVar.c(Uri.class, InputStream.class, new C1324a(applicationContext.getAssets(), 1));
        jVar.c(Uri.class, AssetFileDescriptor.class, new C1324a(applicationContext.getAssets(), 0));
        jVar.c(Uri.class, InputStream.class, new p374z1.b(applicationContext, 0));
        jVar.c(Uri.class, InputStream.class, new p374z1.b(applicationContext, 1));
        if (i7 >= 29) {
            jVar.c(Uri.class, InputStream.class, new p374z1.d(applicationContext, InputStream.class));
            jVar.c(Uri.class, ParcelFileDescriptor.class, new p374z1.d(applicationContext, ParcelFileDescriptor.class));
        }
        jVar.c(Uri.class, InputStream.class, new C(contentResolver, 2));
        jVar.c(Uri.class, ParcelFileDescriptor.class, new C(contentResolver, 1));
        jVar.c(Uri.class, AssetFileDescriptor.class, new C(contentResolver, 0));
        jVar.c(Uri.class, InputStream.class, new z(7));
        jVar.c(URL.class, InputStream.class, new p374z1.g());
        jVar.c(Uri.class, File.class, new com.bumptech.glide.load.model.h(applicationContext, 3));
        jVar.c(com.bumptech.glide.load.model.l.class, InputStream.class, new p222oc.d(2));
        jVar.c(byte[].class, ByteBuffer.class, new z(1));
        jVar.c(byte[].class, InputStream.class, new z(2));
        jVar.c(Uri.class, Uri.class, modelLoaderFactory);
        jVar.c(Drawable.class, Drawable.class, modelLoaderFactory);
        jVar.d("legacy_append", Drawable.class, Drawable.class, new C1.f(0));
        jVar.i(Bitmap.class, BitmapDrawable.class, new Sd.b(resources, 3));
        jVar.i(Bitmap.class, byte[].class, aVar3);
        jVar.i(Drawable.class, byte[].class, new top.zibin.luban.io.a(bitmapPool, 5, aVar3, bVar3));
        jVar.i(com.bumptech.glide.load.resource.gif.d.class, byte[].class, bVar3);
        ResourceDecoder g10 = new G(bitmapPool, new E(1));
        jVar.d("legacy_append", ByteBuffer.class, Bitmap.class, g10);
        jVar.d("legacy_append", ByteBuffer.class, BitmapDrawable.class, new C1329a(resources, g10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            GlideModule glideModule = (GlideModule) it.next();
            try {
                glideModule.registerComponents(applicationContext, bVar, jVar);
            } catch (AbstractMethodError e10) {
                throw new IllegalStateException("Attempting to register a Glide v3 module. If you see this, you or one of your dependencies may be including Glide v3 even though you're using Glide v4. You'll need to find and remove (or update) the offending dependency. The v3 module name is: ".concat(glideModule.getClass().getName()), e10);
            }
        }
        if (aVar != null) {
            aVar.registerComponents(applicationContext, bVar, jVar);
        }
        return jVar;
    }
}
