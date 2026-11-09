package p179m1;

import N8.q0;
import android.content.Context;
import android.net.Uri;
import android.widget.ImageView;
import com.airbnb.lottie.H;
import com.airbnb.lottie.I;
import com.airbnb.lottie.J;
import com.airbnb.lottie.LottieAnimationView;
import com.airbnb.lottie.LottieProperty;
import com.airbnb.lottie.y;
import com.alibaba.android.arouter.utils.Consts;
import com.facebook.react.bridge.ColorPropConverter;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.ReadableType;
import com.facebook.react.uimanager.ViewProps;
import com.facebook.react.util.RNLog;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.lang.ref.WeakReference;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.ListIterator;
import java.util.regex.Pattern;
import java.util.zip.ZipInputStream;
import kotlin.collections.CollectionsKt;
import kotlin.collections.z;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Regex;
import p212o1.e;
import p243q1.c;
import p355xf.o;
import p355xf.p;
import p355xf.q;

/* JADX INFO: loaded from: classes.dex */
public final class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final WeakReference f39441a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f39442b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public String f39443c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public ImageView.ScaleType f39444d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public String f39445e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public Boolean f39446f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public Boolean f39447g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public ReadableArray f39448h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public ReadableArray f39449i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public H f39450j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public Integer f39451k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public String f39452l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public String f39453m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public String f39454n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public Float f39455o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public Boolean f39456p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public Boolean f39457q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public Float f39458r;

    public g(LottieAnimationView view) {
        Intrinsics.checkNotNullParameter(view, "view");
        this.f39441a = new WeakReference(view);
        view.setFontAssetDelegate(new f(view));
    }

    public final void a() {
        int iIntValue;
        Collection collectionU;
        Object objF;
        LottieAnimationView lottieAnimationView = (LottieAnimationView) this.f39441a.get();
        if (lottieAnimationView == null) {
            return;
        }
        ReadableArray readableArray = this.f39449i;
        if (readableArray != null && readableArray.size() > 0) {
            J j6 = new J(lottieAnimationView);
            int size = readableArray.size();
            for (int i7 = 0; i7 < size; i7++) {
                ReadableMap map = readableArray.getMap(i7);
                if (map != null) {
                    j6.f19571a.put(map.getString("find"), map.getString("replace"));
                    LottieAnimationView lottieAnimationView2 = j6.f19572b;
                    if (lottieAnimationView2 != null) {
                        lottieAnimationView2.invalidate();
                    }
                }
            }
            lottieAnimationView.setTextDelegate(j6);
        }
        String str = this.f39452l;
        if (str != null) {
            lottieAnimationView.f(new ByteArrayInputStream(str.getBytes()), String.valueOf(str.hashCode()));
            this.f39452l = null;
        }
        String str2 = this.f39453m;
        if (str2 != null) {
            File file = new File(str2);
            if (file.exists()) {
                lottieAnimationView.f(new FileInputStream(file), String.valueOf(str2.hashCode()));
            } else {
                lottieAnimationView.h(str2, String.valueOf(str2.hashCode()));
            }
            this.f39453m = null;
        }
        String str3 = this.f39454n;
        if (str3 != null) {
            File file2 = new File(str3);
            if (file2.exists()) {
                lottieAnimationView.g(new ZipInputStream(new FileInputStream(file2)), String.valueOf(str3.hashCode()));
                this.f39454n = null;
                return;
            }
            try {
                o oVar = q.f43977a;
                objF = Uri.parse(str3).getScheme();
            } catch (Throwable th) {
                o oVar2 = q.f43977a;
                objF = androidx.camera.core.impl.utils.executor.g.f(th);
            }
            if (objF instanceof p) {
                objF = null;
            }
            String str4 = (String) objF;
            if (str4 != null) {
                if (str4.equals("file")) {
                    String path = Uri.parse(str3).getPath();
                    if (path != null) {
                        lottieAnimationView.g(new ZipInputStream(new FileInputStream(new File(path))), String.valueOf(str3.hashCode()));
                    }
                } else {
                    lottieAnimationView.setAnimationFromUrl(str3);
                }
                this.f39454n = null;
                return;
            }
            int identifier = lottieAnimationView.getResources().getIdentifier(str3, "raw", lottieAnimationView.getContext().getPackageName());
            if (identifier == 0) {
                RNLog.e("Animation for " + str3 + " was not found in raw resources");
                return;
            }
            lottieAnimationView.setAnimation(identifier);
            this.f39442b = false;
            this.f39454n = null;
        }
        if (this.f39442b) {
            lottieAnimationView.setAnimation(this.f39443c);
            this.f39442b = false;
        }
        Float f10 = this.f39455o;
        if (f10 != null) {
            lottieAnimationView.setProgress(f10.floatValue());
            this.f39455o = null;
        }
        Boolean bool = this.f39456p;
        if (bool != null) {
            lottieAnimationView.setRepeatCount(bool.booleanValue() ? -1 : 0);
            this.f39456p = null;
        }
        Boolean bool2 = this.f39457q;
        y yVar = lottieAnimationView.f19579e;
        if (bool2 != null && bool2.booleanValue() && !yVar.j()) {
            lottieAnimationView.e();
        }
        Float f11 = this.f39458r;
        if (f11 != null) {
            lottieAnimationView.setSpeed(f11.floatValue());
            this.f39458r = null;
        }
        ImageView.ScaleType scaleType = this.f39444d;
        if (scaleType != null) {
            lottieAnimationView.setScaleType(scaleType);
            this.f39444d = null;
        }
        H h7 = this.f39450j;
        if (h7 != null) {
            lottieAnimationView.setRenderMode(h7);
            this.f39450j = null;
        }
        Integer num = this.f39451k;
        if (num != null) {
            lottieAnimationView.setLayerType(num.intValue(), null);
        }
        String str5 = this.f39445e;
        if (str5 != null) {
            lottieAnimationView.setImageAssetsFolder(str5);
            this.f39445e = null;
        }
        Boolean bool3 = this.f39446f;
        if (bool3 != null) {
            lottieAnimationView.c(bool3.booleanValue());
            this.f39446f = null;
        }
        Boolean bool4 = this.f39447g;
        if (bool4 != null) {
            lottieAnimationView.setSafeMode(bool4.booleanValue());
            this.f39447g = null;
        }
        ReadableArray readableArray2 = this.f39448h;
        if (readableArray2 == null || readableArray2.size() <= 0) {
            return;
        }
        int size2 = readableArray2.size();
        for (int i10 = 0; i10 < size2; i10++) {
            ReadableMap map2 = readableArray2.getMap(i10);
            if (map2 != null) {
                if (map2.getType(ViewProps.COLOR) == ReadableType.Map) {
                    ReadableMap map3 = map2.getMap(ViewProps.COLOR);
                    Context context = lottieAnimationView.getContext();
                    Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
                    Integer color = ColorPropConverter.getColor(map3, context);
                    iIntValue = color != null ? color.intValue() : 0;
                } else {
                    iIntValue = map2.getInt(ViewProps.COLOR);
                }
                String strJ = q0.j(map2.getString("keypath"), ".**");
                String strQuote = Pattern.quote(Consts.DOT);
                Intrinsics.checkNotNullExpressionValue(strQuote, "quote(...)");
                List listC = new Regex(strQuote).c(strJ);
                if (listC.isEmpty()) {
                    collectionU = z.f38935a;
                    break;
                }
                ListIterator listIterator = listC.listIterator(listC.size());
                while (true) {
                    if (listIterator.hasPrevious()) {
                        if (((String) listIterator.previous()).length() != 0) {
                            collectionU = CollectionsKt.U(listC, listIterator.nextIndex() + 1);
                            break;
                        }
                    } else {
                        collectionU = z.f38935a;
                        break;
                    }
                }
                String[] strArr = (String[]) collectionU.toArray(new String[0]);
                yVar.a(new e((String[]) Arrays.copyOf(strArr, strArr.length)), LottieProperty.f19602I, new c(new I(iIntValue)));
            }
        }
    }
}
