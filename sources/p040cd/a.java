package p040cd;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.util.Log;
import com.google.zxing.BarcodeFormat;
import com.google.zxing.BinaryBitmap;
import com.google.zxing.DecodeHintType;
import com.google.zxing.MultiFormatReader;
import com.google.zxing.RGBLuminanceSource;
import com.google.zxing.common.GlobalHistogramBinarizer;
import com.google.zxing.common.HybridBinarizer;
import java.util.ArrayList;
import java.util.EnumMap;

/* JADX INFO: loaded from: classes4.dex */
public abstract class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final EnumMap f18903a;

    static {
        EnumMap enumMap = new EnumMap(DecodeHintType.class);
        f18903a = enumMap;
        ArrayList arrayList = new ArrayList();
        arrayList.add(BarcodeFormat.QR_CODE);
        enumMap.put(DecodeHintType.TRY_HARDER, Boolean.TRUE);
        enumMap.put(DecodeHintType.POSSIBLE_FORMATS, arrayList);
        enumMap.put(DecodeHintType.CHARACTER_SET, "utf-8");
    }

    public static String a(String str) {
        Bitmap bitmapDecodeFile;
        RGBLuminanceSource rGBLuminanceSource = null;
        try {
            BitmapFactory.Options options = new BitmapFactory.Options();
            int i7 = 1;
            options.inJustDecodeBounds = true;
            BitmapFactory.decodeFile(str, options);
            int i10 = options.outHeight / 400;
            if (i10 > 0) {
                i7 = i10;
            }
            options.inSampleSize = i7;
            options.inJustDecodeBounds = false;
            bitmapDecodeFile = BitmapFactory.decodeFile(str, options);
        } catch (Exception unused) {
            bitmapDecodeFile = null;
        }
        EnumMap enumMap = f18903a;
        try {
            int width = bitmapDecodeFile.getWidth();
            int height = bitmapDecodeFile.getHeight();
            int[] iArr = new int[width * height];
            bitmapDecodeFile.getPixels(iArr, 0, width, 0, 0, width, height);
            RGBLuminanceSource rGBLuminanceSource2 = new RGBLuminanceSource(width, height, iArr);
            try {
                return new MultiFormatReader().decode(new BinaryBitmap(new HybridBinarizer(rGBLuminanceSource2)), enumMap).getText();
            } catch (Exception e10) {
                e = e10;
                rGBLuminanceSource = rGBLuminanceSource2;
                Log.e("QRCodeDecoder", e.getMessage());
                if (rGBLuminanceSource != null) {
                    try {
                        return new MultiFormatReader().decode(new BinaryBitmap(new GlobalHistogramBinarizer(rGBLuminanceSource)), enumMap).getText();
                    } catch (Exception unused2) {
                        Log.e("QRCodeDecoder", e.getMessage());
                        return "";
                    }
                }
                return "";
            }
        } catch (Exception e11) {
            e = e11;
        }
    }
}
