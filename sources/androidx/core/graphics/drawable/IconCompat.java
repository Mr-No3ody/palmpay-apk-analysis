package androidx.core.graphics.drawable;

import X.a;
import Z.b;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.Shader;
import android.graphics.drawable.Icon;
import android.net.Uri;
import android.os.Build;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.Log;
import androidx.annotation.RestrictTo;
import androidx.versionedparcelable.CustomVersionedParcelable;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.reflect.InvocationTargetException;
import p192n.c;

/* JADX INFO: loaded from: classes.dex */
public class IconCompat extends CustomVersionedParcelable {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final PorterDuff.Mode f16046k = PorterDuff.Mode.SRC_IN;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f16047a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Object f16048b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public byte[] f16049c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Parcelable f16050d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f16051e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f16052f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public ColorStateList f16053g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public PorterDuff.Mode f16054h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public String f16055i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public String f16056j;

    @Retention(RetentionPolicy.SOURCE)
    @RestrictTo({c.f39800a})
    public @interface IconType {
    }

    @RestrictTo({c.f39800a})
    public IconCompat() {
        this.f16047a = -1;
        this.f16049c = null;
        this.f16050d = null;
        this.f16051e = 0;
        this.f16052f = 0;
        this.f16053g = null;
        this.f16054h = f16046k;
        this.f16055i = null;
    }

    public static Bitmap a(Bitmap bitmap, boolean z3) {
        int iMin = (int) (Math.min(bitmap.getWidth(), bitmap.getHeight()) * 0.6666667f);
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(iMin, iMin, Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(bitmapCreateBitmap);
        Paint paint = new Paint(3);
        float f10 = iMin;
        float f11 = 0.5f * f10;
        float f12 = 0.9166667f * f11;
        if (z3) {
            float f13 = 0.010416667f * f10;
            paint.setColor(0);
            paint.setShadowLayer(f13, 0.0f, f10 * 0.020833334f, 1023410176);
            canvas.drawCircle(f11, f11, f12, paint);
            paint.setShadowLayer(f13, 0.0f, 0.0f, 503316480);
            canvas.drawCircle(f11, f11, f12, paint);
            paint.clearShadowLayer();
        }
        paint.setColor(-16777216);
        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
        BitmapShader bitmapShader = new BitmapShader(bitmap, tileMode, tileMode);
        Matrix matrix = new Matrix();
        matrix.setTranslate((-(bitmap.getWidth() - iMin)) / 2.0f, (-(bitmap.getHeight() - iMin)) / 2.0f);
        bitmapShader.setLocalMatrix(matrix);
        paint.setShader(bitmapShader);
        canvas.drawCircle(f11, f11, f12, paint);
        canvas.setBitmap(null);
        return bitmapCreateBitmap;
    }

    public static IconCompat b(Resources resources, String str, int i7) {
        str.getClass();
        if (i7 == 0) {
            throw new IllegalArgumentException("Drawable resource ID must not be 0");
        }
        IconCompat iconCompat = new IconCompat(2);
        iconCompat.f16051e = i7;
        if (resources != null) {
            try {
                iconCompat.f16048b = resources.getResourceName(i7);
            } catch (Resources.NotFoundException unused) {
                throw new IllegalArgumentException("Icon resource cannot be found");
            }
        } else {
            iconCompat.f16048b = str;
        }
        iconCompat.f16056j = str;
        return iconCompat;
    }

    public final int c() {
        int i7 = this.f16047a;
        if (i7 != -1) {
            if (i7 == 2) {
                return this.f16051e;
            }
            throw new IllegalStateException("called getResId() on " + this);
        }
        int i10 = Build.VERSION.SDK_INT;
        Object obj = this.f16048b;
        if (i10 >= 28) {
            return a.f(obj);
        }
        try {
            return ((Integer) obj.getClass().getMethod("getResId", new Class[0]).invoke(obj, new Object[0])).intValue();
        } catch (IllegalAccessException e10) {
            Log.e("IconCompat", "Unable to get icon resource", e10);
            return 0;
        } catch (NoSuchMethodException e11) {
            Log.e("IconCompat", "Unable to get icon resource", e11);
            return 0;
        } catch (InvocationTargetException e12) {
            Log.e("IconCompat", "Unable to get icon resource", e12);
            return 0;
        }
    }

    public final String d() {
        int i7 = this.f16047a;
        if (i7 != -1) {
            if (i7 == 2) {
                String str = this.f16056j;
                return (str == null || TextUtils.isEmpty(str)) ? ((String) this.f16048b).split(":", -1)[0] : this.f16056j;
            }
            throw new IllegalStateException("called getResPackage() on " + this);
        }
        int i10 = Build.VERSION.SDK_INT;
        Object obj = this.f16048b;
        if (i10 >= 28) {
            return a.g(obj);
        }
        try {
            return (String) obj.getClass().getMethod("getResPackage", new Class[0]).invoke(obj, new Object[0]);
        } catch (IllegalAccessException e10) {
            Log.e("IconCompat", "Unable to get icon package", e10);
            return null;
        } catch (NoSuchMethodException e11) {
            Log.e("IconCompat", "Unable to get icon package", e11);
            return null;
        } catch (InvocationTargetException e12) {
            Log.e("IconCompat", "Unable to get icon package", e12);
            return null;
        }
    }

    public final int e() {
        int i7 = this.f16047a;
        if (i7 != -1) {
            return i7;
        }
        int i10 = Build.VERSION.SDK_INT;
        Object obj = this.f16048b;
        if (i10 >= 28) {
            return a.n(obj);
        }
        try {
            return ((Integer) obj.getClass().getMethod("getType", new Class[0]).invoke(obj, new Object[0])).intValue();
        } catch (IllegalAccessException e10) {
            Log.e("IconCompat", "Unable to get icon type " + obj, e10);
            return -1;
        } catch (NoSuchMethodException e11) {
            Log.e("IconCompat", "Unable to get icon type " + obj, e11);
            return -1;
        } catch (InvocationTargetException e12) {
            Log.e("IconCompat", "Unable to get icon type " + obj, e12);
            return -1;
        }
    }

    public final Uri f() {
        int i7 = this.f16047a;
        if (i7 != -1) {
            if (i7 == 4 || i7 == 6) {
                return Uri.parse((String) this.f16048b);
            }
            throw new IllegalStateException("called getUri() on " + this);
        }
        int i10 = Build.VERSION.SDK_INT;
        Object obj = this.f16048b;
        if (i10 >= 28) {
            return a.o(obj);
        }
        try {
            return (Uri) obj.getClass().getMethod("getUri", new Class[0]).invoke(obj, new Object[0]);
        } catch (IllegalAccessException e10) {
            Log.e("IconCompat", "Unable to get icon uri", e10);
            return null;
        } catch (NoSuchMethodException e11) {
            Log.e("IconCompat", "Unable to get icon uri", e11);
            return null;
        } catch (InvocationTargetException e12) {
            Log.e("IconCompat", "Unable to get icon uri", e12);
            return null;
        }
    }

    public final Icon g(Context context) {
        Icon iconCreateWithBitmap;
        InputStream inputStreamOpenInputStream;
        int i7 = Build.VERSION.SDK_INT;
        switch (this.f16047a) {
            case -1:
                return (Icon) this.f16048b;
            case 0:
            default:
                throw new IllegalArgumentException("Unknown type");
            case 1:
                iconCreateWithBitmap = Icon.createWithBitmap((Bitmap) this.f16048b);
                break;
            case 2:
                iconCreateWithBitmap = Icon.createWithResource(d(), this.f16051e);
                break;
            case 3:
                iconCreateWithBitmap = Icon.createWithData((byte[]) this.f16048b, this.f16051e, this.f16052f);
                break;
            case 4:
                iconCreateWithBitmap = Icon.createWithContentUri((String) this.f16048b);
                break;
            case 5:
                iconCreateWithBitmap = i7 < 26 ? Icon.createWithBitmap(a((Bitmap) this.f16048b, false)) : Z.a.a((Bitmap) this.f16048b);
                break;
            case 6:
                if (i7 >= 30) {
                    iconCreateWithBitmap = b.b(f());
                } else {
                    if (context == null) {
                        throw new IllegalArgumentException("Context is required to resolve the file uri of the icon: " + f());
                    }
                    Uri uriF = f();
                    String scheme = uriF.getScheme();
                    if (FirebaseAnalytics.Param.CONTENT.equals(scheme) || "file".equals(scheme)) {
                        try {
                            inputStreamOpenInputStream = context.getContentResolver().openInputStream(uriF);
                        } catch (Exception unused) {
                            uriF.toString();
                            inputStreamOpenInputStream = null;
                        }
                    } else {
                        try {
                            inputStreamOpenInputStream = new FileInputStream(new File((String) this.f16048b));
                        } catch (FileNotFoundException unused2) {
                            uriF.toString();
                            inputStreamOpenInputStream = null;
                        }
                    }
                    if (inputStreamOpenInputStream == null) {
                        throw new IllegalStateException("Cannot load adaptive icon from uri: " + f());
                    }
                    if (i7 < 26) {
                        iconCreateWithBitmap = Icon.createWithBitmap(a(BitmapFactory.decodeStream(inputStreamOpenInputStream), false));
                    } else {
                        iconCreateWithBitmap = Z.a.a(BitmapFactory.decodeStream(inputStreamOpenInputStream));
                    }
                }
                break;
        }
        ColorStateList colorStateList = this.f16053g;
        if (colorStateList != null) {
            iconCreateWithBitmap.setTintList(colorStateList);
        }
        PorterDuff.Mode mode = this.f16054h;
        if (mode != f16046k) {
            iconCreateWithBitmap.setTintMode(mode);
        }
        return iconCreateWithBitmap;
    }

    public final String toString() {
        String str;
        if (this.f16047a == -1) {
            return String.valueOf(this.f16048b);
        }
        StringBuilder sb2 = new StringBuilder("Icon(typ=");
        switch (this.f16047a) {
            case 1:
                str = "BITMAP";
                break;
            case 2:
                str = "RESOURCE";
                break;
            case 3:
                str = "DATA";
                break;
            case 4:
                str = "URI";
                break;
            case 5:
                str = "BITMAP_MASKABLE";
                break;
            case 6:
                str = "URI_MASKABLE";
                break;
            default:
                str = p381za.c.UNKNOWN_PROCESS_NAME;
                break;
        }
        sb2.append(str);
        switch (this.f16047a) {
            case 1:
            case 5:
                sb2.append(" size=");
                sb2.append(((Bitmap) this.f16048b).getWidth());
                sb2.append("x");
                sb2.append(((Bitmap) this.f16048b).getHeight());
                break;
            case 2:
                sb2.append(" pkg=");
                sb2.append(this.f16056j);
                sb2.append(" id=");
                sb2.append(String.format("0x%08x", Integer.valueOf(c())));
                break;
            case 3:
                sb2.append(" len=");
                sb2.append(this.f16051e);
                if (this.f16052f != 0) {
                    sb2.append(" off=");
                    sb2.append(this.f16052f);
                }
                break;
            case 4:
            case 6:
                sb2.append(" uri=");
                sb2.append(this.f16048b);
                break;
        }
        if (this.f16053g != null) {
            sb2.append(" tint=");
            sb2.append(this.f16053g);
        }
        if (this.f16054h != f16046k) {
            sb2.append(" mode=");
            sb2.append(this.f16054h);
        }
        sb2.append(")");
        return sb2.toString();
    }

    public IconCompat(int i7) {
        this.f16049c = null;
        this.f16050d = null;
        this.f16051e = 0;
        this.f16052f = 0;
        this.f16053g = null;
        this.f16054h = f16046k;
        this.f16055i = null;
        this.f16047a = i7;
    }
}
