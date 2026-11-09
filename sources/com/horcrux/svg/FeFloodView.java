package com.horcrux.svg;

import android.annotation.SuppressLint;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import com.facebook.react.bridge.ColorPropConverter;
import com.facebook.react.bridge.JavaOnlyArray;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.ReadableType;
import com.google.android.flexbox.FlexItem;
import java.util.HashMap;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes3.dex */
@SuppressLint({"ViewConstructor"})
class FeFloodView extends FilterPrimitiveView {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final Pattern f23283e = Pattern.compile("[0-9.-]+");

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public ReadableArray f23284c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public float f23285d;

    @Override // com.horcrux.svg.FilterPrimitiveView
    public final Bitmap b(HashMap map, Bitmap bitmap) {
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(bitmap.getWidth(), bitmap.getHeight(), Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(bitmapCreateBitmap);
        Paint paint = new Paint();
        paint.setFlags(129);
        paint.setStyle(Paint.Style.FILL);
        float f10 = this.f23285d;
        ReadableArray readableArray = this.f23284c;
        if (readableArray.getInt(0) == 0) {
            if (readableArray.size() == 2) {
                int iIntValue = readableArray.getType(1) == ReadableType.Map ? ColorPropConverter.getColor(readableArray.getMap(1), getContext()).intValue() : readableArray.getInt(1);
                paint.setColor((Math.round((iIntValue >>> 24) * f10) << 24) | (iIntValue & FlexItem.MAX_SIZE));
            } else {
                paint.setARGB((int) (readableArray.size() > 4 ? readableArray.getDouble(4) * ((double) f10) * 255.0d : f10 * 255.0f), (int) (readableArray.getDouble(1) * 255.0d), (int) (readableArray.getDouble(2) * 255.0d), (int) (readableArray.getDouble(3) * 255.0d));
            }
        }
        canvas.drawPaint(paint);
        return bitmapCreateBitmap;
    }

    public final void d(ReadableMap readableMap) {
        if (readableMap == null) {
            this.f23284c = null;
            invalidate();
            return;
        }
        int i7 = readableMap.getInt("type");
        if (i7 == 0) {
            ReadableType type = readableMap.getType("payload");
            if (type.equals(ReadableType.Number)) {
                this.f23284c = JavaOnlyArray.of(0, Integer.valueOf(readableMap.getInt("payload")));
            } else if (type.equals(ReadableType.Map)) {
                this.f23284c = JavaOnlyArray.of(0, readableMap.getMap("payload"));
            }
        } else if (i7 == 1) {
            this.f23284c = JavaOnlyArray.of(1, readableMap.getString("brushRef"));
        } else {
            this.f23284c = JavaOnlyArray.of(Integer.valueOf(i7));
        }
        invalidate();
    }
}
