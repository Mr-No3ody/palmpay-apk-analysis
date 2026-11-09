package com.oblador.vectoricons;

import C0.G;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.Typeface;
import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.views.text.ReactFontManager;
import com.luck.picture.lib.config.PictureMimeType;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public class VectorIconsModule extends ReactContextBaseJavaModule {
    public static final String REACT_CLASS = "RNVectorIconsModule";
    private static final Map<String, Typeface> sTypefaceCache = new HashMap();

    public @interface Errors {
    }

    public VectorIconsModule(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
    }

    public String createGlyphImagePath(String str, String str2, Integer num, Integer num2) throws Throwable {
        FileOutputStream fileOutputStream;
        Throwable th;
        ReactApplicationContext reactApplicationContext = getReactApplicationContext();
        String str3 = reactApplicationContext.getCacheDir().getAbsolutePath() + "/";
        float f10 = reactApplicationContext.getResources().getDisplayMetrics().density;
        int i7 = (int) f10;
        String strR = G.r(new StringBuilder("@"), f10 == ((float) i7) ? Integer.toString(i7) : Float.toString(f10), "x");
        int iRound = Math.round(num.intValue() * f10);
        String str4 = str3 + Integer.toString((str + ":" + str2 + ":" + num2).hashCode(), 32) + "_" + Integer.toString(num.intValue()) + strR + PictureMimeType.PNG;
        String strO = G.o("file://", str4);
        File file = new File(str4);
        if (file.exists()) {
            return strO;
        }
        Typeface typeface = ReactFontManager.getInstance().getTypeface(str, 0, reactApplicationContext.getAssets());
        Paint paint = new Paint();
        paint.setTypeface(typeface);
        paint.setColor(num2.intValue());
        paint.setTextSize(iRound);
        paint.setAntiAlias(true);
        paint.getTextBounds(str2, 0, str2.length(), new Rect());
        int i10 = iRound - ((int) paint.getFontMetrics().bottom);
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(iRound, iRound, Bitmap.Config.ARGB_8888);
        new Canvas(bitmapCreateBitmap).drawText(str2, 0, i10, paint);
        try {
            fileOutputStream = new FileOutputStream(file);
            try {
                bitmapCreateBitmap.compress(Bitmap.CompressFormat.PNG, 100, fileOutputStream);
                fileOutputStream.flush();
                fileOutputStream.close();
                return strO;
            } catch (Throwable th2) {
                th = th2;
                if (fileOutputStream != null) {
                    try {
                        fileOutputStream.close();
                    } catch (IOException e10) {
                        e10.printStackTrace();
                    }
                }
                throw th;
            }
        } catch (Throwable th3) {
            fileOutputStream = null;
            th = th3;
        }
    }

    @ReactMethod
    public void getImageForFont(String str, String str2, Integer num, Integer num2, Promise promise) {
        try {
            promise.resolve(createGlyphImagePath(str, str2, num, num2));
        } catch (Throwable th) {
            promise.reject("E_UNKNOWN_ERROR", th);
        }
    }

    @ReactMethod(isBlockingSynchronousMethod = true)
    public String getImageForFontSync(String str, String str2, Integer num, Integer num2) {
        try {
            return createGlyphImagePath(str, str2, num, num2);
        } catch (Throwable unused) {
            return null;
        }
    }

    @Override // com.facebook.react.bridge.NativeModule
    public String getName() {
        return REACT_CLASS;
    }
}
