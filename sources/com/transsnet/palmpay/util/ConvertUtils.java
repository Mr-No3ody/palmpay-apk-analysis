package com.transsnet.palmpay.util;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.view.View;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.UnsupportedEncodingException;

/* JADX INFO: loaded from: classes4.dex */
public final class ConvertUtils {
    private static final char[] hexDigits = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};

    private ConvertUtils() {
        throw new UnsupportedOperationException("u can't instantiate me...");
    }

    public static byte[] bitmap2Bytes(Bitmap bitmap, Bitmap.CompressFormat compressFormat) {
        if (bitmap == null) {
            return null;
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        bitmap.compress(compressFormat, 100, byteArrayOutputStream);
        return byteArrayOutputStream.toByteArray();
    }

    public static Drawable bitmap2Drawable(Bitmap bitmap) {
        if (bitmap == null) {
            return null;
        }
        return new BitmapDrawable(Utils.getApp().getResources(), bitmap);
    }

    public static Bitmap bytes2Bitmap(byte[] bArr) {
        if (bArr == null || bArr.length == 0) {
            return null;
        }
        return BitmapFactory.decodeByteArray(bArr, 0, bArr.length);
    }

    public static Drawable bytes2Drawable(byte[] bArr) {
        if (bArr == null) {
            return null;
        }
        return bitmap2Drawable(bytes2Bitmap(bArr));
    }

    public static InputStream bytes2InputStream(byte[] bArr) {
        if (bArr == null || bArr.length <= 0) {
            return null;
        }
        return new ByteArrayInputStream(bArr);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.io.Closeable[]] */
    /* JADX WARN: Type inference failed for: r2v0 */
    /* JADX WARN: Type inference failed for: r2v1 */
    /* JADX WARN: Type inference failed for: r2v2 */
    /* JADX WARN: Type inference failed for: r3v0, types: [int] */
    public static OutputStream bytes2OutputStream(byte[] bArr) throws Throwable {
        ByteArrayOutputStream byteArrayOutputStream;
        ?? r3 = 0;
        if (bArr != null) {
            ?? length = bArr.length;
            try {
                if (length > 0) {
                    try {
                        byteArrayOutputStream = new ByteArrayOutputStream();
                        try {
                            byteArrayOutputStream.write(bArr);
                            CloseUtils.closeIO(byteArrayOutputStream);
                            return byteArrayOutputStream;
                        } catch (IOException e10) {
                            e = e10;
                            e.printStackTrace();
                            CloseUtils.closeIO(byteArrayOutputStream);
                            return null;
                        }
                    } catch (IOException e11) {
                        e = e11;
                        byteArrayOutputStream = null;
                    } catch (Throwable th) {
                        th = th;
                        CloseUtils.closeIO(new Closeable[]{r3});
                        throw th;
                    }
                }
            } catch (Throwable th2) {
                th = th2;
                r3 = length;
            }
        }
        return null;
    }

    public static int dp2px(float f10) {
        return (int) ((f10 * Utils.getApp().getResources().getDisplayMetrics().density) + 0.5f);
    }

    public static Bitmap drawable2Bitmap(Drawable drawable) {
        Bitmap bitmapCreateBitmap;
        if (drawable instanceof BitmapDrawable) {
            BitmapDrawable bitmapDrawable = (BitmapDrawable) drawable;
            if (bitmapDrawable.getBitmap() != null) {
                return bitmapDrawable.getBitmap();
            }
        }
        if (drawable.getIntrinsicWidth() <= 0 || drawable.getIntrinsicHeight() <= 0) {
            bitmapCreateBitmap = Bitmap.createBitmap(1, 1, drawable.getOpacity() != -1 ? Bitmap.Config.ARGB_8888 : Bitmap.Config.RGB_565);
        } else {
            bitmapCreateBitmap = Bitmap.createBitmap(drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight(), drawable.getOpacity() != -1 ? Bitmap.Config.ARGB_8888 : Bitmap.Config.RGB_565);
        }
        Canvas canvas = new Canvas(bitmapCreateBitmap);
        drawable.setBounds(0, 0, canvas.getWidth(), canvas.getHeight());
        drawable.draw(canvas);
        return bitmapCreateBitmap;
    }

    public static byte[] drawable2Bytes(Drawable drawable, Bitmap.CompressFormat compressFormat) {
        if (drawable == null) {
            return null;
        }
        return bitmap2Bytes(drawable2Bitmap(drawable), compressFormat);
    }

    public static ByteArrayOutputStream input2OutputStream(InputStream inputStream) {
        try {
            if (inputStream == null) {
                return null;
            }
            try {
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                byte[] bArr = new byte[1024];
                while (true) {
                    int i7 = inputStream.read(bArr, 0, 1024);
                    if (i7 == -1) {
                        CloseUtils.closeIO(inputStream);
                        return byteArrayOutputStream;
                    }
                    byteArrayOutputStream.write(bArr, 0, i7);
                }
            } catch (IOException e10) {
                e10.printStackTrace();
                CloseUtils.closeIO(inputStream);
                return null;
            }
        } catch (Throwable th) {
            CloseUtils.closeIO(inputStream);
            throw th;
        }
    }

    public static byte[] inputStream2Bytes(InputStream inputStream) {
        if (inputStream == null) {
            return null;
        }
        return input2OutputStream(inputStream).toByteArray();
    }

    public static String inputStream2String(InputStream inputStream, String str) {
        if (inputStream != null && !isSpace(str)) {
            try {
                return new String(inputStream2Bytes(inputStream), str);
            } catch (UnsupportedEncodingException e10) {
                e10.printStackTrace();
            }
        }
        return null;
    }

    private static boolean isSpace(String str) {
        if (str == null) {
            return true;
        }
        int length = str.length();
        for (int i7 = 0; i7 < length; i7++) {
            if (!Character.isWhitespace(str.charAt(i7))) {
                return false;
            }
        }
        return true;
    }

    public static byte[] outputStream2Bytes(OutputStream outputStream) {
        if (outputStream == null) {
            return null;
        }
        return ((ByteArrayOutputStream) outputStream).toByteArray();
    }

    public static String outputStream2String(OutputStream outputStream, String str) {
        if (outputStream != null && !isSpace(str)) {
            try {
                return new String(outputStream2Bytes(outputStream), str);
            } catch (UnsupportedEncodingException e10) {
                e10.printStackTrace();
            }
        }
        return null;
    }

    public static int px2dp(float f10) {
        return (int) ((f10 / Utils.getApp().getResources().getDisplayMetrics().density) + 0.5f);
    }

    public static int px2sp(float f10) {
        return (int) ((f10 / Utils.getApp().getResources().getDisplayMetrics().scaledDensity) + 0.5f);
    }

    public static int sp2px(float f10) {
        return (int) ((f10 * Utils.getApp().getResources().getDisplayMetrics().scaledDensity) + 0.5f);
    }

    public static InputStream string2InputStream(String str, String str2) {
        if (str != null && !isSpace(str2)) {
            try {
                return new ByteArrayInputStream(str.getBytes(str2));
            } catch (UnsupportedEncodingException e10) {
                e10.printStackTrace();
            }
        }
        return null;
    }

    public static OutputStream string2OutputStream(String str, String str2) {
        if (str != null && !isSpace(str2)) {
            try {
                return bytes2OutputStream(str.getBytes(str2));
            } catch (UnsupportedEncodingException e10) {
                e10.printStackTrace();
            }
        }
        return null;
    }

    public static Bitmap view2Bitmap(View view) {
        if (view == null) {
            return null;
        }
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(view.getWidth(), view.getHeight(), Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(bitmapCreateBitmap);
        Drawable background = view.getBackground();
        if (background != null) {
            background.draw(canvas);
        } else {
            canvas.drawColor(-1);
        }
        view.draw(canvas);
        return bitmapCreateBitmap;
    }

    public ByteArrayInputStream output2InputStream(OutputStream outputStream) {
        if (outputStream == null) {
            return null;
        }
        return new ByteArrayInputStream(((ByteArrayOutputStream) outputStream).toByteArray());
    }
}
