package p002a;

import C0.G;
import C0.T;
import C0.V;
import E.AbstractC0198c;
import G4.j;
import G7.t;
import Pa.r0;
import V0.J;
import Xe.d;
import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.graphics.BitmapFactory;
import android.graphics.Point;
import android.hardware.camera2.CameraCharacteristics;
import android.media.ExifInterface;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.Log;
import android.util.Size;
import android.util.SizeF;
import android.view.Display;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.camera.camera2.internal.compat.quirk.FlashAvailabilityBufferUnderflowQuirk;
import androidx.camera.camera2.internal.compat.workaround.CameraCharacteristicsProvider;
import androidx.concurrent.futures.m;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.F;
import androidx.lifecycle.b0;
import androidx.work.Operation;
import androidx.work.Tracer;
import androidx.work.impl.utils.taskexecutor.SerialExecutor;
import com.adjust.sdk.Constants;
import com.airbnb.lottie.k;
import com.airbnb.lottie.parser.l;
import com.airbnb.lottie.parser.q;
import com.airbnb.lottie.utils.i;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.uimanager.PixelUtil;
import com.facebook.react.uimanager.ViewProps;
import com.google.common.net.HttpHeaders;
import com.google.gson.GsonBuilder;
import com.skydoves.balloon.Balloon;
import com.swmansion.rnscreens.gamma.common.event.NamingAwareEventType;
import com.transsnet.palmpay.core.base.BaseViewModel;
import com.transsnet.palmpay.custom_view.r;
import com.transsnet.palmpay.photograph.crop.PhotoCropActivity;
import java.io.ByteArrayInputStream;
import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import java.io.Serializable;
import java.io.UnsupportedEncodingException;
import java.lang.reflect.Field;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.nio.BufferUnderflowException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.concurrent.ExecutorService;
import kotlin.Pair;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C1858h;
import kotlin.jvm.internal.ClassBasedDeclarationContainer;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KClass;
import kotlinx.serialization.descriptors.SerialDescriptor;
import org.json.JSONException;
import org.json.JSONObject;
import p016b.b$a;
import p073f.c;
import p077f4.e;
import p140j8.f;
import p162kg.U;
import p314uf.b;

/* JADX INFO: loaded from: classes.dex */
public abstract class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int f11812a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static String f11813b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final p342wf.a f11814c = new p342wf.a();

    public a(j jVar) {
    }

    public static Class A(Object obj) {
        Class cls;
        Type[] actualTypeArguments;
        if (obj == null) {
            return null;
        }
        Class<?> superclass = obj.getClass();
        while (true) {
            if (superclass == null || superclass == Object.class) {
                cls = null;
                break;
            }
            Type genericSuperclass = superclass.getGenericSuperclass();
            if ((genericSuperclass instanceof ParameterizedType) && (actualTypeArguments = ((ParameterizedType) genericSuperclass).getActualTypeArguments()) != null && actualTypeArguments.length > 0) {
                Type type = actualTypeArguments[0];
                if (type instanceof Class) {
                    cls = (Class) type;
                    break;
                }
            }
            superclass = superclass.getSuperclass();
        }
        if (cls == null || !BaseViewModel.class.isAssignableFrom(cls)) {
            return null;
        }
        return cls;
    }

    public static /* synthetic */ void B(View view, Balloon balloon) {
        Intrinsics.checkNotNullParameter(view, "<this>");
        Intrinsics.checkNotNullParameter(balloon, "balloon");
        view.post(new t(balloon, view, 0));
    }

    public static /* synthetic */ void C(View view, Balloon balloon) {
        Intrinsics.checkNotNullParameter(view, "<this>");
        Intrinsics.checkNotNullParameter(balloon, "balloon");
        view.post(new t(balloon, view, 1));
    }

    public static TextView a(View view) {
        if (view instanceof TextView) {
            return (TextView) view;
        }
        if (view instanceof ViewGroup) {
            return a(((ViewGroup) view).getChildAt(0));
        }
        return null;
    }

    public static void b(String str, p373z.a aVar, b$a b_a, Class cls) {
        d dVar;
        String string;
        int i7 = 2;
        int i10 = 4;
        b bVar = new b(cls, G.r(new StringBuilder(), f11813b, str));
        Field[] declaredFields = aVar.getClass().getDeclaredFields();
        int length = declaredFields.length;
        int i11 = 0;
        while (true) {
            dVar = bVar.t;
            if (i11 >= length) {
                break;
            }
            Field field = declaredFields[i11];
            field.setAccessible(true);
            p029c.a aVar2 = (p029c.a) field.getAnnotation(p029c.a.class);
            if (aVar2 != null) {
                String strKey = aVar2.key();
                try {
                    Object obj = field.get(aVar);
                    string = obj != null ? obj.toString() : null;
                } catch (IllegalAccessException e10) {
                    e10.printStackTrace();
                }
                if (!TextUtils.isEmpty(strKey) && string != null) {
                    dVar.j(strKey);
                    dVar.e(string, strKey);
                }
            }
            i11++;
        }
        int i12 = bVar.f11191f;
        if (i12 == 2 && ((p029c.b) aVar.getClass().getAnnotation(p029c.b.class)) == null && !"{}".equals(new GsonBuilder().addSerializationExclusionStrategy(new e(i10)).disableHtmlEscaping().create().toJson(aVar))) {
            String json = new GsonBuilder().addSerializationExclusionStrategy(new e(i10)).disableHtmlEscaping().create().toJson(aVar.encrypt());
            StringBuilder sb2 = new StringBuilder();
            sb2.append(org.chromium.support_lib_boundary.util.b.a());
            sb2.append("1.0.21");
            sb2.append("Bearer " + c.a().f36334b);
            sb2.append(json);
            String strEncrypt = c.a().f36339g == null ? "" : c.a().f36339g.encrypt(sb2.toString());
            dVar.j("Signature");
            dVar.e(strEncrypt, "Signature");
        }
        G8.a.i(new GsonBuilder().addSerializationExclusionStrategy(new e(i10)).disableHtmlEscaping().create().toJson(aVar), "i");
        String json2 = new GsonBuilder().addSerializationExclusionStrategy(new e(i10)).disableHtmlEscaping().create().toJson(aVar.encrypt());
        if (!"{}".equals(json2)) {
            G8.a.i("", "i");
            G8.a.i("", "i");
            G8.a.i("", "i");
            G8.a.i("=========================REQUEST================================", "i");
            G8.a.i(json2, "i");
            G8.a.i("=========================REQUEST================================", "i");
            if (!J3.a.a(i12)) {
                throw new IllegalArgumentException("Request body only supports these handle methods: POST/PUT/PATCH/DELETE.");
            }
            if (json2 == null || TextUtils.isEmpty("application/json")) {
                throw new NullPointerException("The requestBody and contentType must be can't be null");
            }
            try {
                bVar.f11198w = new ByteArrayInputStream(json2.getBytes(bVar.d()));
                String str2 = "application/json; charset=" + bVar.d();
                dVar.j(HttpHeaders.CONTENT_TYPE);
                dVar.e(str2, HttpHeaders.CONTENT_TYPE);
            } catch (UnsupportedEncodingException unused) {
                bVar.f11198w = new ByteArrayInputStream(json2.getBytes());
                dVar.j(HttpHeaders.CONTENT_TYPE);
                dVar.e("application/json", HttpHeaders.CONTENT_TYPE);
            }
        }
        ExecutorService executorService = p314uf.a.f42993a;
        p314uf.e eVar = new p314uf.e(new androidx.camera.core.impl.utils.executor.b(bVar, i7), new p1.c(b_a, 11));
        bVar.f11185A = eVar;
        p314uf.a.f42993a.execute(eVar);
    }

    public static boolean c(Collection collection) {
        return collection == null || collection.size() == 0;
    }

    public static String d(int i7) {
        String[] strArr = new String[i7];
        Arrays.fill(strArr, "?");
        return G.r(new StringBuilder("key IN ("), TextUtils.join(", ", strArr), ")");
    }

    public static final Bundle e(Pair... pairArr) {
        Bundle bundle = new Bundle(pairArr.length);
        for (Pair pair : pairArr) {
            String str = (String) pair.f38891a;
            Object obj = pair.f38892b;
            if (obj == null) {
                bundle.putString(str, null);
            } else if (obj instanceof Boolean) {
                bundle.putBoolean(str, ((Boolean) obj).booleanValue());
            } else if (obj instanceof Byte) {
                bundle.putByte(str, ((Number) obj).byteValue());
            } else if (obj instanceof Character) {
                bundle.putChar(str, ((Character) obj).charValue());
            } else if (obj instanceof Double) {
                bundle.putDouble(str, ((Number) obj).doubleValue());
            } else if (obj instanceof Float) {
                bundle.putFloat(str, ((Number) obj).floatValue());
            } else if (obj instanceof Integer) {
                bundle.putInt(str, ((Number) obj).intValue());
            } else if (obj instanceof Long) {
                bundle.putLong(str, ((Number) obj).longValue());
            } else if (obj instanceof Short) {
                bundle.putShort(str, ((Number) obj).shortValue());
            } else if (obj instanceof Bundle) {
                bundle.putBundle(str, (Bundle) obj);
            } else if (obj instanceof CharSequence) {
                bundle.putCharSequence(str, (CharSequence) obj);
            } else if (obj instanceof Parcelable) {
                bundle.putParcelable(str, (Parcelable) obj);
            } else if (obj instanceof boolean[]) {
                bundle.putBooleanArray(str, (boolean[]) obj);
            } else if (obj instanceof byte[]) {
                bundle.putByteArray(str, (byte[]) obj);
            } else if (obj instanceof char[]) {
                bundle.putCharArray(str, (char[]) obj);
            } else if (obj instanceof double[]) {
                bundle.putDoubleArray(str, (double[]) obj);
            } else if (obj instanceof float[]) {
                bundle.putFloatArray(str, (float[]) obj);
            } else if (obj instanceof int[]) {
                bundle.putIntArray(str, (int[]) obj);
            } else if (obj instanceof long[]) {
                bundle.putLongArray(str, (long[]) obj);
            } else if (obj instanceof short[]) {
                bundle.putShortArray(str, (short[]) obj);
            } else if (obj instanceof Object[]) {
                Class<?> componentType = obj.getClass().getComponentType();
                Intrinsics.e(componentType);
                if (Parcelable.class.isAssignableFrom(componentType)) {
                    bundle.putParcelableArray(str, (Parcelable[]) obj);
                } else if (String.class.isAssignableFrom(componentType)) {
                    bundle.putStringArray(str, (String[]) obj);
                } else if (CharSequence.class.isAssignableFrom(componentType)) {
                    bundle.putCharSequenceArray(str, (CharSequence[]) obj);
                } else {
                    if (!Serializable.class.isAssignableFrom(componentType)) {
                        throw new IllegalArgumentException("Illegal value array type " + componentType.getCanonicalName() + " for key \"" + str + '\"');
                    }
                    bundle.putSerializable(str, (Serializable) obj);
                }
            } else if (obj instanceof Serializable) {
                bundle.putSerializable(str, (Serializable) obj);
            } else if (obj instanceof IBinder) {
                bundle.putBinder(str, (IBinder) obj);
            } else if (obj instanceof Size) {
                androidx.core.os.c.a(bundle, str, (Size) obj);
            } else {
                if (!(obj instanceof SizeF)) {
                    throw new IllegalArgumentException("Illegal value type " + obj.getClass().getCanonicalName() + " for key \"" + str + '\"');
                }
                androidx.core.os.c.b(bundle, str, (SizeF) obj);
            }
        }
        return bundle;
    }

    public static int f(PhotoCropActivity photoCropActivity, Uri uri) throws Throwable {
        BitmapFactory.Options options = new BitmapFactory.Options();
        int i7 = 1;
        options.inJustDecodeBounds = true;
        InputStream inputStream = null;
        try {
            InputStream inputStreamOpenInputStream = photoCropActivity.getContentResolver().openInputStream(uri);
            try {
                BitmapFactory.decodeStream(inputStreamOpenInputStream, null, options);
                g(inputStreamOpenInputStream);
                int iO = o(photoCropActivity);
                while (true) {
                    if (options.outHeight / i7 <= iO && options.outWidth / i7 <= iO) {
                        return i7;
                    }
                    i7 <<= 1;
                }
            } catch (Throwable th) {
                th = th;
                inputStream = inputStreamOpenInputStream;
                g(inputStream);
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }

    public static void g(Closeable closeable) {
        if (closeable == null) {
            return;
        }
        try {
            closeable.close();
        } catch (Exception unused) {
        }
    }

    public static final b0 h(Fragment fragment, C1858h viewModelClass, Function0 storeProducer, Function0 extrasProducer, Function0 function0) {
        Intrinsics.checkNotNullParameter(fragment, "<this>");
        Intrinsics.checkNotNullParameter(viewModelClass, "viewModelClass");
        Intrinsics.checkNotNullParameter(storeProducer, "storeProducer");
        Intrinsics.checkNotNullParameter(extrasProducer, "extrasProducer");
        return new b0(viewModelClass, storeProducer, function0, extrasProducer);
    }

    public static void i(JSONObject jSONObject, JSONObject jSONObject2) throws JSONException {
        Iterator<String> itKeys = jSONObject2.keys();
        while (itKeys.hasNext()) {
            String next = itKeys.next();
            JSONObject jSONObjectOptJSONObject = jSONObject2.optJSONObject(next);
            JSONObject jSONObjectOptJSONObject2 = jSONObject.optJSONObject(next);
            if (jSONObjectOptJSONObject == null || jSONObjectOptJSONObject2 == null) {
                jSONObject.put(next, jSONObject2.get(next));
            } else {
                i(jSONObjectOptJSONObject2, jSONObjectOptJSONObject);
                jSONObject.put(next, jSONObjectOptJSONObject2);
            }
        }
    }

    public static final WritableMap j(p140j8.a insets) {
        Intrinsics.checkNotNullParameter(insets, "insets");
        WritableMap writableMapCreateMap = Arguments.createMap();
        Intrinsics.checkNotNullExpressionValue(writableMapCreateMap, "createMap(...)");
        writableMapCreateMap.putDouble(ViewProps.TOP, PixelUtil.toDIPFromPixel(insets.f38332a));
        writableMapCreateMap.putDouble(ViewProps.RIGHT, PixelUtil.toDIPFromPixel(insets.f38333b));
        writableMapCreateMap.putDouble(ViewProps.BOTTOM, PixelUtil.toDIPFromPixel(insets.f38334c));
        writableMapCreateMap.putDouble(ViewProps.LEFT, PixelUtil.toDIPFromPixel(insets.f38335d));
        return writableMapCreateMap;
    }

    public static final KClass k(SerialDescriptor serialDescriptor) {
        Intrinsics.checkNotNullParameter(serialDescriptor, "<this>");
        if (serialDescriptor instanceof U) {
            return k(((U) serialDescriptor).f38816a);
        }
        return null;
    }

    public static int l(PhotoCropActivity photoCropActivity, Uri uri) throws IOException {
        InputStream inputStreamOpenInputStream = null;
        try {
            inputStreamOpenInputStream = photoCropActivity.getContentResolver().openInputStream(uri);
            if (inputStreamOpenInputStream != null) {
                int attributeInt = new ExifInterface(inputStreamOpenInputStream).getAttributeInt("Orientation", 0);
                if (attributeInt == 3) {
                    inputStreamOpenInputStream.close();
                    return 180;
                }
                if (attributeInt == 6) {
                    inputStreamOpenInputStream.close();
                    return 90;
                }
                if (attributeInt != 8) {
                    inputStreamOpenInputStream.close();
                    return 0;
                }
                inputStreamOpenInputStream.close();
                return 270;
            }
            if (inputStreamOpenInputStream != null) {
                inputStreamOpenInputStream.close();
                return 0;
            }
        } catch (Throwable th) {
            try {
                Log.e("a", "getExifRotation: ", th);
            } finally {
                if (inputStreamOpenInputStream != null) {
                    inputStreamOpenInputStream.close();
                }
            }
        }
        return 0;
    }

    public static final Class m(KClass kClass) {
        Intrinsics.checkNotNullParameter(kClass, "<this>");
        Class<?> jClass = ((ClassBasedDeclarationContainer) kClass).getJClass();
        Intrinsics.f(jClass, "null cannot be cast to non-null type java.lang.Class<T of kotlin.jvm.JvmClassMappingKt.<get-java>>");
        return jClass;
    }

    public static final Class n(KClass kClass) {
        Intrinsics.checkNotNullParameter(kClass, "<this>");
        Class<?> jClass = ((ClassBasedDeclarationContainer) kClass).getJClass();
        if (!jClass.isPrimitive()) {
            return jClass;
        }
        String name = jClass.getName();
        switch (name.hashCode()) {
            case -1325958191:
                return !name.equals("double") ? jClass : Double.class;
            case 104431:
                return !name.equals("int") ? jClass : Integer.class;
            case 3039496:
                return !name.equals("byte") ? jClass : Byte.class;
            case 3052374:
                return !name.equals("char") ? jClass : Character.class;
            case 3327612:
                return !name.equals(Constants.LONG) ? jClass : Long.class;
            case 3625364:
                return !name.equals("void") ? jClass : Void.class;
            case 64711720:
                return !name.equals("boolean") ? jClass : Boolean.class;
            case 97526364:
                return !name.equals("float") ? jClass : Float.class;
            case 109413500:
                return !name.equals("short") ? jClass : Short.class;
            default:
                return jClass;
        }
    }

    public static int o(Context context) {
        Display defaultDisplay = ((WindowManager) context.getSystemService("window")).getDefaultDisplay();
        Point point = new Point();
        defaultDisplay.getSize(point);
        int i7 = point.x;
        return (int) Math.sqrt(Math.pow(point.y, 2.0d) + Math.pow(i7, 2.0d));
    }

    public static boolean p(CameraCharacteristicsProvider cameraCharacteristicsProvider) {
        Boolean bool;
        try {
            bool = (Boolean) cameraCharacteristicsProvider.get(CameraCharacteristics.FLASH_INFO_AVAILABLE);
        } catch (BufferUnderflowException e10) {
            if (androidx.camera.camera2.internal.compat.quirk.a.f13477a.b(FlashAvailabilityBufferUnderflowQuirk.class) != null) {
                String.format("Device is known to throw an exception while checking flash availability. Flash is not available. [Manufacturer: %s, Model: %s, API Level: %d].", Build.MANUFACTURER, Build.MODEL, Integer.valueOf(Build.VERSION.SDK_INT));
                f.G("FlashAvailability");
            } else {
                f.h("FlashAvailability", String.format("Exception thrown while checking for flash availability on device not known to throw exceptions during this check. Please file an issue at https://issuetracker.google.com/issues/new?component=618491&template=1257717 with this error message [Manufacturer: %s, Model: %s, API Level: %d].\nFlash is not available.", Build.MANUFACTURER, Build.MODEL, Integer.valueOf(Build.VERSION.SDK_INT)), e10);
            }
            bool = Boolean.FALSE;
        }
        if (bool == null) {
            f.G("FlashAvailability");
        }
        if (bool != null) {
            return bool.booleanValue();
        }
        return false;
    }

    public static final p1.d q(Tracer tracer, String label, SerialExecutor executor, Function0 block) {
        Intrinsics.checkNotNullParameter(tracer, "tracer");
        Intrinsics.checkNotNullParameter(label, "label");
        Intrinsics.checkNotNullParameter(executor, "executor");
        Intrinsics.checkNotNullParameter(block, "block");
        F f10 = new F(Operation.f18344g0);
        m mVarY = AbstractC0198c.y(new J(executor, tracer, label, block, f10, 0));
        Intrinsics.checkNotNullExpressionValue(mVarY, "getFuture { completer ->…}\n            }\n        }");
        return new p1.d(f10, mVarY);
    }

    public static void r(String str, ImageView imageView) {
        r0.j1(imageView, str, G1.d.O(r.cv_bank_account));
    }

    public static final Pair s(NamingAwareEventType event) {
        Intrinsics.checkNotNullParameter(event, "event");
        return new Pair(event.getEventName(), kotlin.collections.G.e(new Pair("registrationName", event.getEventRegistrationName())));
    }

    public static boolean t(String str, String str2, SQLiteDatabase sQLiteDatabase) throws JSONException {
        String string;
        Cursor cursorQuery = sQLiteDatabase.query("catalystLocalStorage", new String[]{"value"}, "key=?", new String[]{str}, null, null, null);
        try {
            if (cursorQuery.moveToFirst()) {
                string = cursorQuery.getString(0);
                cursorQuery.close();
            } else {
                cursorQuery.close();
                string = null;
            }
            if (string != null) {
                JSONObject jSONObject = new JSONObject(string);
                i(jSONObject, new JSONObject(str2));
                str2 = jSONObject.toString();
            }
            ContentValues contentValues = new ContentValues();
            contentValues.put("key", str);
            contentValues.put("value", str2);
            return -1 != sQLiteDatabase.insertWithOnConflict("catalystLocalStorage", null, contentValues, 5);
        } catch (Throwable th) {
            cursorQuery.close();
            throw th;
        }
    }

    public static final C0.U u(Function1 optionsBuilder) {
        Intrinsics.checkNotNullParameter(optionsBuilder, "optionsBuilder");
        V v3 = new V();
        optionsBuilder.invoke(v3);
        boolean z3 = v3.f993b;
        T t = v3.f992a;
        t.f974a = z3;
        t.f975b = v3.f994c;
        int i7 = v3.f995d;
        boolean z8 = v3.f996e;
        t.f976c = i7;
        t.f977d = false;
        t.f978e = z8;
        return new C0.U(t.f974a, t.f975b, t.f976c, t.f977d, t.f978e, t.f979f, t.f980g, t.f981h, t.f982i);
    }

    public static com.airbnb.lottie.model.animatable.a v(com.airbnb.lottie.parser.moshi.b bVar, k kVar) {
        return new com.airbnb.lottie.model.animatable.a(q.a(bVar, kVar, 1.0f, com.airbnb.lottie.parser.f.f20140b, false), 0);
    }

    public static com.airbnb.lottie.model.animatable.b w(com.airbnb.lottie.parser.moshi.a aVar, k kVar, boolean z3) {
        return new com.airbnb.lottie.model.animatable.b(q.a(aVar, kVar, z3 ? i.c() : 1.0f, com.airbnb.lottie.parser.f.f20141c, false), 5);
    }

    public static com.airbnb.lottie.model.animatable.a x(com.airbnb.lottie.parser.moshi.b bVar, k kVar, int i7) {
        l lVar = new l();
        lVar.f20160a = i7;
        ArrayList arrayListA = q.a(bVar, kVar, 1.0f, lVar, false);
        for (int i10 = 0; i10 < arrayListA.size(); i10++) {
            p243q1.a aVar = (p243q1.a) arrayListA.get(i10);
            com.airbnb.lottie.model.content.b bVar2 = (com.airbnb.lottie.model.content.b) aVar.f41421b;
            com.airbnb.lottie.model.content.b bVar3 = (com.airbnb.lottie.model.content.b) aVar.f41422c;
            if (bVar2 != null && bVar3 != null) {
                float[] fArr = bVar2.f19922a;
                int length = fArr.length;
                float[] fArr2 = bVar3.f19922a;
                if (length != fArr2.length) {
                    int length2 = fArr.length + fArr2.length;
                    float[] fArr3 = new float[length2];
                    System.arraycopy(fArr, 0, fArr3, 0, fArr.length);
                    System.arraycopy(fArr2, 0, fArr3, fArr.length, fArr2.length);
                    Arrays.sort(fArr3);
                    float f10 = Float.NaN;
                    int i11 = 0;
                    for (int i12 = 0; i12 < length2; i12++) {
                        float f11 = fArr3[i12];
                        if (f11 != f10) {
                            fArr3[i11] = f11;
                            i11++;
                            f10 = fArr3[i12];
                        }
                    }
                    float[] fArrCopyOfRange = Arrays.copyOfRange(fArr3, 0, i11);
                    aVar = new p243q1.a(bVar2.b(fArrCopyOfRange), bVar3.b(fArrCopyOfRange));
                }
            }
            arrayListA.set(i10, aVar);
        }
        return new com.airbnb.lottie.model.animatable.a(arrayListA, 1);
    }

    public static com.airbnb.lottie.model.animatable.a y(com.airbnb.lottie.parser.moshi.a aVar, k kVar) {
        return new com.airbnb.lottie.model.animatable.a(q.a(aVar, kVar, 1.0f, com.airbnb.lottie.parser.f.f20142d, false), 2);
    }

    public static com.airbnb.lottie.model.animatable.a z(com.airbnb.lottie.parser.moshi.b bVar, k kVar) {
        return new com.airbnb.lottie.model.animatable.a(q.a(bVar, kVar, i.c(), com.airbnb.lottie.parser.f.f20144f, true), 3);
    }
}
