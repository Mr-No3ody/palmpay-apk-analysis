package Pa;

import android.R;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.LinearGradient;
import android.graphics.RadialGradient;
import android.graphics.Shader;
import android.graphics.SweepGradient;
import android.hardware.camera2.CameraCharacteristics;
import android.util.AttributeSet;
import android.util.Range;
import android.util.Rational;
import android.util.Xml;
import android.view.View;
import androidx.appcompat.app.AbstractActivityC0837o;
import androidx.camera.core.ExposureState;
import com.alibaba.android.arouter.core.InterceptorServiceImpl;
import com.alibaba.android.arouter.exception.HandlerException;
import com.alibaba.android.arouter.facade.Postcard;
import com.alibaba.android.arouter.facade.callback.InterceptorCallback;
import com.alibaba.android.arouter.thread.CancelableCountDownLatch;
import com.alibaba.android.arouter.utils.Consts;
import com.facebook.imageutils.JfifUtil;
import com.facebook.react.fabric.mounting.mountitems.IntBufferBatchMountItem;
import com.google.common.base.Ascii;
import com.google.common.primitives.UnsignedBytes;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.descriptors.SerialDescriptor;
import org.aspectj.lang.reflect.SourceLocation;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: renamed from: Pa.b, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C0505b implements ExposureState, InterceptorCallback, SourceLocation {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f7071a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f7072b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Object f7073c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Object f7074d;

    public /* synthetic */ C0505b(byte b7, int i7) {
        this.f7071a = i7;
    }

    public static void b(AbstractActivityC0837o abstractActivityC0837o) {
        View viewFindViewById = abstractActivityC0837o.findViewById(R.id.content);
        C0505b c0505b = new C0505b((byte) 0, 0);
        if (viewFindViewById != null) {
            c0505b.f7073c = viewFindViewById;
            viewFindViewById.getViewTreeObserver().addOnGlobalLayoutListener(new Be.c(c0505b, 2));
            c0505b.f7074d = viewFindViewById.getLayoutParams();
        }
    }

    public static C0505b c(Resources.Theme theme, Resources resources, int i7) throws XmlPullParserException, IOException {
        int next;
        int i10;
        boolean z3;
        float f10;
        float f11;
        Shader.TileMode tileMode;
        Shader radialGradient;
        Shader.TileMode tileMode2;
        Resources.Theme theme2 = theme;
        XmlResourceParser xml = resources.getXml(i7);
        AttributeSet attributeSetAsAttributeSet = Xml.asAttributeSet(xml);
        do {
            next = xml.next();
            if (next == 2) {
                break;
            }
        } while (next != 1);
        if (next != 2) {
            throw new XmlPullParserException("No start tag found");
        }
        String name = xml.getName();
        name.getClass();
        if (!name.equals("gradient")) {
            if (name.equals("selector")) {
                ColorStateList colorStateListB = Y.b.b(resources, xml, attributeSetAsAttributeSet, theme2);
                return new C0505b((Shader) null, colorStateListB, colorStateListB.getDefaultColor());
            }
            throw new XmlPullParserException(xml.getPositionDescription() + ": unsupported complex color tag " + name);
        }
        String name2 = xml.getName();
        if (!name2.equals("gradient")) {
            throw new XmlPullParserException(xml.getPositionDescription() + ": invalid gradient color tag " + name2);
        }
        TypedArray typedArrayH = Y.a.h(resources, theme2, attributeSetAsAttributeSet, W.d.GradientColor);
        float f12 = !(xml.getAttributeValue("http://schemas.android.com/apk/res/android", "startX") != null) ? 0.0f : typedArrayH.getFloat(W.d.GradientColor_android_startX, 0.0f);
        float f13 = xml.getAttributeValue("http://schemas.android.com/apk/res/android", "startY") != null ? typedArrayH.getFloat(W.d.GradientColor_android_startY, 0.0f) : 0.0f;
        float f14 = xml.getAttributeValue("http://schemas.android.com/apk/res/android", "endX") != null ? typedArrayH.getFloat(W.d.GradientColor_android_endX, 0.0f) : 0.0f;
        float f15 = xml.getAttributeValue("http://schemas.android.com/apk/res/android", "endY") != null ? typedArrayH.getFloat(W.d.GradientColor_android_endY, 0.0f) : 0.0f;
        float f16 = xml.getAttributeValue("http://schemas.android.com/apk/res/android", "centerX") != null ? typedArrayH.getFloat(W.d.GradientColor_android_centerX, 0.0f) : 0.0f;
        float f17 = xml.getAttributeValue("http://schemas.android.com/apk/res/android", "centerY") != null ? typedArrayH.getFloat(W.d.GradientColor_android_centerY, 0.0f) : 0.0f;
        int i11 = !(xml.getAttributeValue("http://schemas.android.com/apk/res/android", "type") != null) ? 0 : typedArrayH.getInt(W.d.GradientColor_android_type, 0);
        int color = xml.getAttributeValue("http://schemas.android.com/apk/res/android", "startColor") != null ? typedArrayH.getColor(W.d.GradientColor_android_startColor, 0) : 0;
        if (xml.getAttributeValue("http://schemas.android.com/apk/res/android", "centerColor") != null) {
            z3 = true;
            i10 = 1;
        } else {
            i10 = 1;
            z3 = false;
        }
        int color2 = xml.getAttributeValue("http://schemas.android.com/apk/res/android", "centerColor") != null ? typedArrayH.getColor(W.d.GradientColor_android_centerColor, 0) : 0;
        int color3 = xml.getAttributeValue("http://schemas.android.com/apk/res/android", "endColor") != null ? typedArrayH.getColor(W.d.GradientColor_android_endColor, 0) : 0;
        int i12 = xml.getAttributeValue("http://schemas.android.com/apk/res/android", "tileMode") != null ? typedArrayH.getInt(W.d.GradientColor_android_tileMode, 0) : 0;
        float f18 = f12;
        float f19 = xml.getAttributeValue("http://schemas.android.com/apk/res/android", "gradientRadius") != null ? typedArrayH.getFloat(W.d.GradientColor_android_gradientRadius, 0.0f) : 0.0f;
        typedArrayH.recycle();
        int depth = xml.getDepth() + 1;
        ArrayList arrayList = new ArrayList(20);
        ArrayList arrayList2 = new ArrayList(20);
        while (true) {
            int next2 = xml.next();
            f10 = f19;
            if (next2 == i10) {
                f11 = f13;
                break;
            }
            int depth2 = xml.getDepth();
            f11 = f13;
            if (depth2 < depth && next2 == 3) {
                break;
            }
            if (next2 == 2) {
                if (depth2 > depth) {
                    theme2 = theme;
                } else if (xml.getName().equals("item")) {
                    TypedArray typedArrayH2 = Y.a.h(resources, theme2, attributeSetAsAttributeSet, W.d.GradientColorItem);
                    boolean zHasValue = typedArrayH2.hasValue(W.d.GradientColorItem_android_color);
                    boolean zHasValue2 = typedArrayH2.hasValue(W.d.GradientColorItem_android_offset);
                    if (!zHasValue || !zHasValue2) {
                        throw new XmlPullParserException(xml.getPositionDescription() + ": <item> tag requires a 'color' attribute and a 'offset' attribute!");
                    }
                    int color4 = typedArrayH2.getColor(W.d.GradientColorItem_android_color, 0);
                    float f20 = typedArrayH2.getFloat(W.d.GradientColorItem_android_offset, 0.0f);
                    typedArrayH2.recycle();
                    arrayList2.add(Integer.valueOf(color4));
                    arrayList.add(Float.valueOf(f20));
                    theme2 = theme;
                } else {
                    continue;
                }
            }
            f19 = f10;
            f13 = f11;
            i10 = 1;
        }
        p279s5.d dVar = arrayList2.size() > 0 ? new p279s5.d(arrayList2, arrayList) : null;
        if (dVar == null) {
            dVar = z3 ? new p279s5.d(color, color2, color3) : new p279s5.d(color, color3);
        }
        if (i11 != 1) {
            if (i11 != 2) {
                if (i12 != 1) {
                    tileMode2 = i12 != 2 ? Shader.TileMode.CLAMP : Shader.TileMode.MIRROR;
                } else {
                    tileMode2 = Shader.TileMode.REPEAT;
                }
                radialGradient = new LinearGradient(f18, f11, f14, f15, (int[]) dVar.f42025b, (float[]) dVar.f42026c, tileMode2);
            } else {
                radialGradient = new SweepGradient(f16, f17, (int[]) dVar.f42025b, (float[]) dVar.f42026c);
            }
        } else {
            if (f10 <= 0.0f) {
                throw new XmlPullParserException("<gradient> tag requires 'gradientRadius' attribute with radial type");
            }
            if (i12 != 1) {
                tileMode = i12 != 2 ? Shader.TileMode.CLAMP : Shader.TileMode.MIRROR;
            } else {
                tileMode = Shader.TileMode.REPEAT;
            }
            radialGradient = new RadialGradient(f16, f17, f10, (int[]) dVar.f42025b, (float[]) dVar.f42026c, tileMode);
        }
        return new C0505b(radialGradient, (ColorStateList) null, 0);
    }

    public static void d(C0505b c0505b, Ug.a aVar) {
        int length = ((int[]) c0505b.f7074d).length;
        int i7 = 0;
        for (int i10 = 0; i10 < length; i10++) {
            ((int[]) c0505b.f7074d)[i10] = i7;
            Ug.d.f(c0505b.f7072b, (int[]) c0505b.f7073c, i7, aVar);
            i7 += 1080;
        }
    }

    public static int l(String str) {
        int length = str.length();
        int i7 = 0;
        int i10 = 0;
        while (i7 < length) {
            int i11 = i7 + 1;
            char cCharAt = str.charAt(i7);
            if (cCharAt < 128) {
                i10++;
            } else if (cCharAt < 2048) {
                i10 += 2;
            } else if (cCharAt < 55296 || cCharAt > 57343) {
                i10 += 3;
            } else {
                i7 += 2;
                i10 += 4;
            }
            i7 = i11;
        }
        return i10;
    }

    public void a(Object obj) {
        int i7 = this.f7072b;
        if (i7 == 4) {
            Object[] objArr = new Object[5];
            ((Object[]) this.f7074d)[4] = objArr;
            this.f7074d = objArr;
            i7 = 0;
        }
        ((Object[]) this.f7074d)[i7] = obj;
        this.f7072b = i7 + 1;
    }

    public synchronized String e(int i7, int i10, byte[] bArr) {
        char[] cArr;
        int i11;
        int i12;
        try {
            cArr = (char[]) this.f7073c;
            if (cArr == null) {
                cArr = i10 <= 256 ? new char[IntBufferBatchMountItem.INSTRUCTION_UPDATE_EVENT_EMITTER] : new char[2048];
                this.f7073c = cArr;
            } else if (cArr.length < i10) {
                cArr = new char[2048];
                this.f7073c = cArr;
            }
            int i13 = i10 + i7;
            i11 = 0;
            while (i7 < i13) {
                int i14 = i7 + 1;
                byte b7 = bArr[i7];
                if (b7 > 0) {
                    cArr[i11] = (char) b7;
                    i11++;
                    i7 = i14;
                } else {
                    if (b7 < -32) {
                        i7 += 2;
                        byte b10 = bArr[i14];
                        if (b7 < -62 || b10 > -65) {
                            throw new IllegalArgumentException("Invalid String");
                        }
                        i12 = i11 + 1;
                        cArr[i11] = (char) ((b10 & 63) | ((b7 & Ascii.US) << 6));
                    } else {
                        if (b7 >= -16) {
                            byte b11 = bArr[i14];
                            int i15 = i7 + 3;
                            byte b12 = bArr[i7 + 2];
                            i7 += 4;
                            byte b13 = bArr[i15];
                            if (b11 <= -65) {
                                if ((((b11 + 112) + (b7 << Ascii.FS)) >> 30) == 0 && b12 <= -65 && b13 <= -65) {
                                    int i16 = ((b11 & 63) << 12) | ((b7 & 7) << 18) | ((b12 & 63) << 6) | (b13 & 63);
                                    int i17 = i11 + 1;
                                    cArr[i11] = (char) ((i16 >>> 10) + 55232);
                                    i11 += 2;
                                    cArr[i17] = (char) ((i16 & 1023) + 56320);
                                }
                            }
                            throw new IllegalArgumentException("Invalid String");
                        }
                        int i18 = i7 + 2;
                        byte b14 = bArr[i14];
                        i7 += 3;
                        byte b15 = bArr[i18];
                        if ((b7 == -32 && b14 < -96) || ((b7 == -19 && b14 >= -96) || b14 > -65 || b15 > -65)) {
                            throw new IllegalArgumentException("Invalid String");
                        }
                        i12 = i11 + 1;
                        cArr[i11] = (char) (((b14 & 63) << 6) | ((b7 & Ascii.SI) << 12) | (b15 & 63));
                    }
                    i11 = i12;
                }
            }
            if (i7 > i13) {
                throw new IllegalArgumentException("Invalid String");
            }
        } catch (Throwable th) {
            throw th;
        }
        return new String(cArr, 0, i11);
    }

    public long f(int i7, int i10) {
        long jH = 0;
        if (i10 <= 0) {
            return 0L;
        }
        int i11 = i10 >> 3;
        int i12 = i10 & 7;
        int i13 = 0;
        int i14 = i7;
        for (int i15 = 0; i15 < i11; i15++) {
            jH ^= h(i14);
            i14 += 8;
        }
        int i16 = i12 << 3;
        while (i13 < i16) {
            jH ^= (((long) ((byte[]) this.f7074d)[i14]) & 255) << i13;
            i13 += 8;
            i14++;
        }
        int i17 = (i7 & 7) << 3;
        return (jH >>> (64 - i17)) | (jH << i17);
    }

    public int g() {
        byte[] bArr = (byte[]) this.f7074d;
        int i7 = this.f7072b;
        int i10 = i7 + 1;
        this.f7072b = i10;
        int i11 = bArr[i7] & UnsignedBytes.MAX_VALUE;
        int i12 = i7 + 2;
        this.f7072b = i12;
        int i13 = ((bArr[i10] & UnsignedBytes.MAX_VALUE) << 8) | i11;
        int i14 = i7 + 3;
        this.f7072b = i14;
        int i15 = i13 | ((bArr[i12] & UnsignedBytes.MAX_VALUE) << 16);
        this.f7072b = i7 + 4;
        return (bArr[i14] << Ascii.CAN) | i15;
    }

    @Override // org.aspectj.lang.reflect.SourceLocation
    public int getColumn() {
        return -1;
    }

    @Override // androidx.camera.core.ExposureState
    public int getExposureCompensationIndex() {
        int i7;
        synchronized (this.f7073c) {
            i7 = this.f7072b;
        }
        return i7;
    }

    @Override // androidx.camera.core.ExposureState
    public Range getExposureCompensationRange() {
        return (Range) ((androidx.camera.camera2.internal.compat.l) this.f7074d).a(CameraCharacteristics.CONTROL_AE_COMPENSATION_RANGE);
    }

    @Override // androidx.camera.core.ExposureState
    public Rational getExposureCompensationStep() {
        return !isExposureCompensationSupported() ? Rational.ZERO : (Rational) ((androidx.camera.camera2.internal.compat.l) this.f7074d).a(CameraCharacteristics.CONTROL_AE_COMPENSATION_STEP);
    }

    @Override // org.aspectj.lang.reflect.SourceLocation
    public String getFileName() {
        return (String) this.f7074d;
    }

    @Override // org.aspectj.lang.reflect.SourceLocation
    public int getLine() {
        return this.f7072b;
    }

    @Override // org.aspectj.lang.reflect.SourceLocation
    public Class getWithinType() {
        return (Class) this.f7073c;
    }

    public long h(int i7) {
        byte[] bArr = (byte[]) this.f7074d;
        int i10 = i7 + 6;
        return (((long) bArr[i7]) & 255) | ((((long) bArr[i7 + 1]) & 255) << 8) | ((((long) bArr[i7 + 2]) & 255) << 16) | ((((long) bArr[i7 + 3]) & 255) << 24) | ((((long) bArr[i7 + 4]) & 255) << 32) | ((((long) bArr[i7 + 5]) & 255) << 40) | ((((long) bArr[i10]) & 255) << 48) | (((long) bArr[i7 + 7]) << 56);
    }

    public String i() {
        StringBuilder sb2 = new StringBuilder("$");
        int i7 = this.f7072b + 1;
        for (int i10 = 0; i10 < i7; i10++) {
            Object obj = ((Object[]) this.f7073c)[i10];
            if (obj instanceof SerialDescriptor) {
                SerialDescriptor serialDescriptor = (SerialDescriptor) obj;
                if (!Intrinsics.c(serialDescriptor.getKind(), p133ig.h.f37623b)) {
                    int i11 = ((int[]) this.f7074d)[i10];
                    if (i11 >= 0) {
                        sb2.append(Consts.DOT);
                        sb2.append(serialDescriptor.getElementName(i11));
                    }
                } else if (((int[]) this.f7074d)[i10] != -1) {
                    sb2.append("[");
                    sb2.append(((int[]) this.f7074d)[i10]);
                    sb2.append("]");
                }
            } else if (obj != p191mg.l.f39732a) {
                sb2.append("['");
                sb2.append(obj);
                sb2.append("']");
            }
        }
        String string = sb2.toString();
        Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
        return string;
    }

    @Override // androidx.camera.core.ExposureState
    public boolean isExposureCompensationSupported() {
        Range range = (Range) ((androidx.camera.camera2.internal.compat.l) this.f7074d).a(CameraCharacteristics.CONTROL_AE_COMPENSATION_RANGE);
        return (range == null || ((Integer) range.getLower()).intValue() == 0 || ((Integer) range.getUpper()).intValue() == 0) ? false : true;
    }

    public short j() {
        byte[] bArr = (byte[]) this.f7074d;
        int i7 = this.f7072b;
        int i10 = i7 + 1;
        this.f7072b = i10;
        int i11 = bArr[i7] & UnsignedBytes.MAX_VALUE;
        this.f7072b = i7 + 2;
        return (short) ((bArr[i10] << 8) | i11);
    }

    public String k(int i7) {
        String strE;
        if (i7 < 0) {
            return null;
        }
        if (i7 == 0) {
            return "";
        }
        if (i7 > 2048) {
            strE = new String((byte[]) this.f7074d, this.f7072b, i7, StandardCharsets.UTF_8);
        } else {
            strE = e(this.f7072b, i7, (byte[]) this.f7074d);
        }
        this.f7072b += i7;
        return strE;
    }

    public boolean m() {
        ColorStateList colorStateList;
        return ((Shader) this.f7073c) == null && (colorStateList = (ColorStateList) this.f7074d) != null && colorStateList.isStateful();
    }

    public void n(byte b7) {
        byte[] bArr = (byte[]) this.f7074d;
        int i7 = this.f7072b;
        this.f7072b = i7 + 1;
        bArr[i7] = b7;
    }

    public void o(byte[] bArr) {
        int length = bArr.length;
        if (length > 0) {
            System.arraycopy(bArr, 0, (byte[]) this.f7074d, this.f7072b, length);
            this.f7072b += length;
        }
    }

    @Override // com.alibaba.android.arouter.facade.callback.InterceptorCallback
    public void onContinue(Postcard postcard) {
        CancelableCountDownLatch cancelableCountDownLatch = (CancelableCountDownLatch) this.f7073c;
        cancelableCountDownLatch.countDown();
        InterceptorServiceImpl._execute(this.f7072b + 1, cancelableCountDownLatch, postcard);
    }

    @Override // com.alibaba.android.arouter.facade.callback.InterceptorCallback
    public void onInterrupt(Throwable th) {
        if (th == null) {
            th = new HandlerException("No message.");
        }
        ((Postcard) this.f7074d).setTag(th);
        ((CancelableCountDownLatch) this.f7073c).cancel();
    }

    public void p(int i7) {
        byte[] bArr = (byte[]) this.f7074d;
        int i10 = this.f7072b;
        int i11 = i10 + 1;
        this.f7072b = i11;
        bArr[i10] = (byte) i7;
        int i12 = i10 + 2;
        this.f7072b = i12;
        bArr[i11] = (byte) (i7 >> 8);
        int i13 = i10 + 3;
        this.f7072b = i13;
        bArr[i12] = (byte) (i7 >> 16);
        this.f7072b = i10 + 4;
        bArr[i13] = (byte) (i7 >> 24);
    }

    public void q(int i7, int i10) {
        byte[] bArr = (byte[]) this.f7074d;
        bArr[i7] = (byte) i10;
        bArr[i7 + 1] = (byte) (i10 >> 8);
        bArr[i7 + 2] = (byte) (i10 >> 16);
        bArr[i7 + 3] = (byte) (i10 >> 24);
    }

    public void r(int i7, long j6) {
        byte[] bArr = (byte[]) this.f7074d;
        bArr[i7] = (byte) j6;
        bArr[i7 + 1] = (byte) (j6 >> 8);
        bArr[i7 + 2] = (byte) (j6 >> 16);
        bArr[i7 + 3] = (byte) (j6 >> 24);
        bArr[i7 + 4] = (byte) (j6 >> 32);
        bArr[i7 + 5] = (byte) (j6 >> 40);
        bArr[i7 + 6] = (byte) (j6 >> 48);
        bArr[i7 + 7] = (byte) (j6 >> 56);
    }

    public void s(String str) {
        if (str == null || str.isEmpty()) {
            return;
        }
        byte[] bArr = (byte[]) this.f7074d;
        int i7 = this.f7072b;
        int length = str.length();
        int i10 = 0;
        while (i10 < length) {
            int i11 = i10 + 1;
            char cCharAt = str.charAt(i10);
            if (cCharAt < 128) {
                bArr[i7] = (byte) cCharAt;
                i7++;
            } else if (cCharAt < 2048) {
                int i12 = i7 + 1;
                bArr[i7] = (byte) ((cCharAt >>> 6) | JfifUtil.MARKER_SOFn);
                i7 += 2;
                bArr[i12] = (byte) ((cCharAt & '?') | 128);
            } else if (cCharAt < 55296 || cCharAt > 57343) {
                bArr[i7] = (byte) ((cCharAt >>> '\f') | 224);
                int i13 = i7 + 2;
                bArr[i7 + 1] = (byte) (((cCharAt >>> 6) & 63) | 128);
                i7 += 3;
                bArr[i13] = (byte) ((cCharAt & '?') | 128);
            } else {
                i10 += 2;
                int iCharAt = ((cCharAt << '\n') + str.charAt(i11)) - 56613888;
                bArr[i7] = (byte) ((iCharAt >>> 18) | 240);
                bArr[i7 + 1] = (byte) (((iCharAt >>> 12) & 63) | 128);
                int i14 = i7 + 3;
                bArr[i7 + 2] = (byte) (((iCharAt >>> 6) & 63) | 128);
                i7 += 4;
                bArr[i14] = (byte) ((iCharAt & 63) | 128);
            }
            i10 = i11;
        }
        this.f7072b = i7;
    }

    public String toString() {
        switch (this.f7071a) {
            case 8:
                return i();
            case 9:
                StringBuffer stringBuffer = new StringBuffer();
                stringBuffer.append((String) this.f7074d);
                stringBuffer.append(":");
                stringBuffer.append(this.f7072b);
                return stringBuffer.toString();
            default:
                return super.toString();
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C0505b(int i7) {
        this(new byte[i7], 0);
        this.f7071a = 7;
    }

    public C0505b(byte[] bArr, int i7) {
        this.f7071a = 7;
        this.f7073c = null;
        this.f7074d = bArr;
        this.f7072b = i7;
    }

    public C0505b() {
        this.f7071a = 10;
        Object[] objArr = new Object[5];
        this.f7073c = objArr;
        this.f7074d = objArr;
    }

    public C0505b(androidx.camera.camera2.internal.compat.l lVar) {
        this.f7071a = 3;
        this.f7073c = new Object();
        this.f7074d = lVar;
        this.f7072b = 0;
    }

    public C0505b(Shader shader, ColorStateList colorStateList, int i7) {
        this.f7071a = 2;
        this.f7073c = shader;
        this.f7074d = colorStateList;
        this.f7072b = i7;
    }

    public C0505b(int i7, CancelableCountDownLatch cancelableCountDownLatch, Postcard postcard) {
        this.f7071a = 5;
        this.f7073c = cancelableCountDownLatch;
        this.f7072b = i7;
        this.f7074d = postcard;
    }

    public C0505b(com.bumptech.glide.load.engine.l lVar) {
        this.f7071a = 6;
        this.f7074d = K1.a.a(150, new C0525w(this, 18));
        this.f7073c = lVar;
    }
}
