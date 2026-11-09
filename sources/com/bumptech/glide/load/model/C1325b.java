package com.bumptech.glide.load.model;

import android.content.Context;
import android.content.res.AssetManager;
import android.content.res.Resources;
import android.net.Uri;
import android.util.Log;
import com.bumptech.glide.load.Key;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;

/* JADX INFO: renamed from: com.bumptech.glide.load.model.b, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1325b implements ModelLoader {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f20822a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f20823b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f20824c;

    public /* synthetic */ C1325b(int i7, Object obj, Object obj2) {
        this.f20822a = i7;
        this.f20824c = obj;
        this.f20823b = obj2;
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [com.bumptech.glide.load.model.DirectResourceLoader$ResourceOpener, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r9v2, types: [com.bumptech.glide.load.model.AssetUriLoader$AssetFetcherFactory, java.lang.Object] */
    @Override // com.bumptech.glide.load.model.ModelLoader
    public final t buildLoadData(Object obj, int i7, int i10, com.bumptech.glide.load.h hVar) {
        t tVarBuildLoadData;
        Uri uri;
        switch (this.f20822a) {
            case 0:
                Uri uri2 = (Uri) obj;
                return new t(new I1.d(uri2), this.f20823b.buildFetcher((AssetManager) this.f20824c, uri2.toString().substring(22)));
            case 1:
                Integer num = (Integer) obj;
                Resources.Theme theme = (Resources.Theme) hVar.a(C1.e.f1138b);
                return new t(new I1.d(num), new i(theme, theme != null ? theme.getResources() : ((Context) this.f20824c).getResources(), this.f20823b, num.intValue()));
            case 2:
                ArrayList arrayList = (ArrayList) this.f20824c;
                int size = arrayList.size();
                ArrayList arrayList2 = new ArrayList(size);
                Key key = null;
                for (int i11 = 0; i11 < size; i11++) {
                    ModelLoader modelLoader = (ModelLoader) arrayList.get(i11);
                    if (modelLoader.handles(obj) && (tVarBuildLoadData = modelLoader.buildLoadData(obj, i7, i10, hVar)) != null) {
                        arrayList2.add(tVarBuildLoadData.f20869c);
                        key = tVarBuildLoadData.f20867a;
                    }
                }
                if (arrayList2.isEmpty() || key == null) {
                    return null;
                }
                return new t(key, new v(arrayList2, (top.zibin.luban.io.a) this.f20823b));
            case 3:
                Integer num2 = (Integer) obj;
                Resources resources = (Resources) this.f20823b;
                try {
                    uri = Uri.parse("android.resource://" + resources.getResourcePackageName(num2.intValue()) + '/' + resources.getResourceTypeName(num2.intValue()) + '/' + resources.getResourceEntryName(num2.intValue()));
                    break;
                } catch (Resources.NotFoundException unused) {
                    uri = null;
                }
                if (uri == null) {
                    return null;
                }
                return ((ModelLoader) this.f20824c).buildLoadData(uri, i7, i10, hVar);
            default:
                Uri uri3 = (Uri) obj;
                List<String> pathSegments = uri3.getPathSegments();
                int size2 = pathSegments.size();
                ModelLoader modelLoader2 = (ModelLoader) this.f20823b;
                t tVarBuildLoadData2 = null;
                if (size2 == 1) {
                    try {
                        int i12 = Integer.parseInt(uri3.getPathSegments().get(0));
                        if (i12 != 0) {
                            tVarBuildLoadData2 = modelLoader2.buildLoadData(Integer.valueOf(i12), i7, i10, hVar);
                        } else if (Log.isLoggable("ResourceUriLoader", 5)) {
                            uri3.toString();
                        }
                        return tVarBuildLoadData2;
                    } catch (NumberFormatException unused2) {
                        if (!Log.isLoggable("ResourceUriLoader", 5)) {
                            return tVarBuildLoadData2;
                        }
                        Objects.toString(uri3);
                        return tVarBuildLoadData2;
                    }
                }
                if (pathSegments.size() != 2) {
                    if (!Log.isLoggable("ResourceUriLoader", 5)) {
                        return null;
                    }
                    uri3.toString();
                    return null;
                }
                List<String> pathSegments2 = uri3.getPathSegments();
                String str = pathSegments2.get(0);
                String str2 = pathSegments2.get(1);
                Context context = (Context) this.f20824c;
                int identifier = context.getResources().getIdentifier(str2, str, context.getPackageName());
                if (identifier != 0) {
                    return modelLoader2.buildLoadData(Integer.valueOf(identifier), i7, i10, hVar);
                }
                if (!Log.isLoggable("ResourceUriLoader", 5)) {
                    return null;
                }
                uri3.toString();
                return null;
        }
    }

    @Override // com.bumptech.glide.load.model.ModelLoader
    public final boolean handles(Object obj) {
        switch (this.f20822a) {
            case 0:
                Uri uri = (Uri) obj;
                return "file".equals(uri.getScheme()) && !uri.getPathSegments().isEmpty() && "android_asset".equals(uri.getPathSegments().get(0));
            case 1:
                return true;
            case 2:
                Iterator it = ((ArrayList) this.f20824c).iterator();
                while (it.hasNext()) {
                    if (((ModelLoader) it.next()).handles(obj)) {
                        return true;
                    }
                }
                return false;
            case 3:
                return true;
            default:
                Uri uri2 = (Uri) obj;
                return "android.resource".equals(uri2.getScheme()) && ((Context) this.f20824c).getPackageName().equals(uri2.getAuthority());
        }
    }

    public String toString() {
        switch (this.f20822a) {
            case 2:
                return "MultiModelLoader{modelLoaders=" + Arrays.toString(((ArrayList) this.f20824c).toArray()) + '}';
            default:
                return super.toString();
        }
    }

    public C1325b(Resources resources, ModelLoader modelLoader) {
        this.f20822a = 3;
        this.f20823b = resources;
        this.f20824c = modelLoader;
    }

    public C1325b(Context context, DirectResourceLoader$ResourceOpener directResourceLoader$ResourceOpener) {
        this.f20822a = 1;
        this.f20824c = context.getApplicationContext();
        this.f20823b = directResourceLoader$ResourceOpener;
    }

    public C1325b(Context context, ModelLoader modelLoader) {
        this.f20822a = 4;
        this.f20824c = context.getApplicationContext();
        this.f20823b = modelLoader;
    }
}
