package com.facebook.react.bridge;

import C0.G;
import android.annotation.SuppressLint;
import androidx.camera.camera2.internal.F;
import com.facebook.proguard.annotations.DoNotStripAny;
import com.google.firebase.crashlytics.internal.metadata.UserMetadata;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.jvm.JvmName;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p355xf.C2131j;
import p355xf.EnumC2132k;
import p355xf.l;

/* JADX INFO: loaded from: classes.dex */
@DoNotStripAny
@Metadata(d1 = {"\u0000z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010(\n\u0002\u0010&\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0017\u0018\u0000 A2\u00020\u00012\u00020\u0002:\u0001AB\t\b\u0004¢\u0006\u0004\b\u0003\u0010\u0004J\u0014\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006H\u0082 ¢\u0006\u0002\u0010\tJ\u0014\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u000e0\u0006H\u0082 ¢\u0006\u0002\u0010\u0019J\u0014\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u000e0\u0006H\u0082 ¢\u0006\u0002\u0010\u0019J\u0010\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u0007H\u0016J\u0010\u0010\u001e\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u0007H\u0016J6\u0010\u001f\u001a\u0002H \"\u0006\b\u0000\u0010 \u0018\u00012\u0006\u0010\u001d\u001a\u00020\u00072\b\u0010!\u001a\u0004\u0018\u00010\u000e2\f\u0010\"\u001a\b\u0012\u0004\u0012\u0002H 0#H\u0083\b¢\u0006\u0002\u0010$J\u0010\u0010%\u001a\u00020\u000e2\u0006\u0010\u001d\u001a\u00020\u0007H\u0002J,\u0010%\u001a\u0002H \"\u0006\b\u0000\u0010 \u0018\u00012\u0006\u0010\u001d\u001a\u00020\u00072\f\u0010\"\u001a\b\u0012\u0004\u0012\u0002H 0#H\u0082\b¢\u0006\u0002\u0010&J\u0012\u0010'\u001a\u0004\u0018\u00010\u000e2\u0006\u0010\u001d\u001a\u00020\u0007H\u0002J.\u0010'\u001a\u0004\u0018\u0001H \"\u0006\b\u0000\u0010 \u0018\u00012\u0006\u0010\u001d\u001a\u00020\u00072\f\u0010\"\u001a\b\u0012\u0004\u0012\u0002H 0#H\u0082\b¢\u0006\u0002\u0010&J\u0010\u0010(\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u0007H\u0016J\u0010\u0010)\u001a\u00020*2\u0006\u0010\u001d\u001a\u00020\u0007H\u0016J\u0010\u0010+\u001a\u00020,2\u0006\u0010\u001d\u001a\u00020\u0007H\u0016J\u0010\u0010-\u001a\u00020.2\u0006\u0010\u001d\u001a\u00020\u0007H\u0016J\u0012\u0010/\u001a\u0004\u0018\u00010\u00072\u0006\u0010\u001d\u001a\u00020\u0007H\u0016J\u0012\u00100\u001a\u0004\u0018\u0001012\u0006\u0010\u001d\u001a\u00020\u0007H\u0016J\u0012\u00102\u001a\u0004\u0018\u00010\u00002\u0006\u0010\u001d\u001a\u00020\u0007H\u0016J\u0010\u00103\u001a\u00020\u00142\u0006\u0010\u001d\u001a\u00020\u0007H\u0016J\u0010\u00104\u001a\u0002052\u0006\u0010\u001d\u001a\u00020\u0007H\u0016J\b\u0010;\u001a\u00020<H\u0016J\b\u0010=\u001a\u00020,H\u0016J\u0013\u0010>\u001a\u00020\u001c2\b\u0010?\u001a\u0004\u0018\u00010\u000eH\u0096\u0002J(\u0010@\u001a\"\u0012\u0004\u0012\u00020\u0007\u0012\u0006\u0012\u0004\u0018\u00010\u000e0\rj\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0006\u0012\u0004\u0018\u00010\u000e`\u000fH\u0016R!\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\b\u0010\tR;\u0010\f\u001a\"\u0012\u0004\u0012\u00020\u0007\u0012\u0006\u0012\u0004\u0018\u00010\u000e0\rj\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0006\u0012\u0004\u0018\u00010\u000e`\u000f8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0012\u0010\u000b\u001a\u0004\b\u0010\u0010\u0011R7\u0010\u0013\u001a\u001e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00140\rj\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u0014`\u000f8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0016\u0010\u000b\u001a\u0004\b\u0015\u0010\u0011R&\u00106\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u000e08078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b9\u0010:¨\u0006B"}, d2 = {"Lcom/facebook/react/bridge/ReadableNativeMap;", "Lcom/facebook/react/bridge/NativeMap;", "Lcom/facebook/react/bridge/ReadableMap;", "<init>", "()V", UserMetadata.KEYDATA_FILENAME, "", "", "getKeys", "()[Ljava/lang/String;", "keys$delegate", "Lkotlin/Lazy;", "localMap", "Ljava/util/HashMap;", "", "Lkotlin/collections/HashMap;", "getLocalMap", "()Ljava/util/HashMap;", "localMap$delegate", "localTypeMap", "Lcom/facebook/react/bridge/ReadableType;", "getLocalTypeMap", "localTypeMap$delegate", "importKeys", "importValues", "()[Ljava/lang/Object;", "importTypes", "hasKey", "", "name", "isNull", "checkInstance", "T", "instance", "type", "Ljava/lang/Class;", "(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Class;)Ljava/lang/Object;", "getValue", "(Ljava/lang/String;Ljava/lang/Class;)Ljava/lang/Object;", "getNullableValue", "getBoolean", "getDouble", "", "getInt", "", "getLong", "", "getString", "getArray", "Lcom/facebook/react/bridge/ReadableArray;", "getMap", "getType", "getDynamic", "Lcom/facebook/react/bridge/Dynamic;", "entryIterator", "", "", "getEntryIterator", "()Ljava/util/Iterator;", "keySetIterator", "Lcom/facebook/react/bridge/ReadableMapKeySetIterator;", "hashCode", "equals", "other", "toHashMap", "Companion", "ReactAndroid_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nReadableNativeMap.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ReadableNativeMap.kt\ncom/facebook/react/bridge/ReadableNativeMap\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,186:1\n64#1,3:187\n64#1,3:190\n76#1:193\n64#1,3:194\n76#1:197\n64#1,3:198\n76#1:201\n64#1,3:202\n76#1:205\n64#1,3:206\n81#1,5:209\n64#1,3:214\n81#1,5:217\n64#1,3:222\n81#1,5:225\n64#1,3:230\n1#2:233\n*S KotlinDebug\n*F\n+ 1 ReadableNativeMap.kt\ncom/facebook/react/bridge/ReadableNativeMap\n*L\n76#1:187,3\n85#1:190,3\n89#1:193\n89#1:194,3\n91#1:197\n91#1:198,3\n94#1:201\n94#1:202,3\n96#1:205\n96#1:206,3\n98#1:209,5\n98#1:214,3\n101#1:217,5\n101#1:222,3\n104#1:225,5\n104#1:230,3\n*E\n"})
public class ReadableNativeMap extends NativeMap implements ReadableMap {

    @NotNull
    private static final Companion Companion = new Companion(null);
    private static int jniPassCounter;

    /* JADX INFO: renamed from: keys$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy keys;

    /* JADX INFO: renamed from: localMap$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy localMap;

    /* JADX INFO: renamed from: localTypeMap$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy localTypeMap;

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0004\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R \u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u00058G@BX\u0086\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lcom/facebook/react/bridge/ReadableNativeMap$Companion;", "", "<init>", "()V", "value", "", "jniPassCounter", "getJNIPassCounter", "()I", "ReactAndroid_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @JvmStatic
        @JvmName(name = "getJNIPassCounter")
        public final int getJNIPassCounter() {
            return ReadableNativeMap.jniPassCounter;
        }

        private Companion() {
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[ReadableType.values().length];
            try {
                iArr[ReadableType.Null.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ReadableType.Boolean.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[ReadableType.Number.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[ReadableType.String.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[ReadableType.Map.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[ReadableType.Array.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public ReadableNativeMap() {
        EnumC2132k enumC2132k = EnumC2132k.f43969a;
        final int i7 = 0;
        this.keys = C2131j.a(enumC2132k, new Function0(this) { // from class: com.facebook.react.bridge.c

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ ReadableNativeMap f21706b;

            {
                this.f21706b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i7) {
                    case 0:
                        return ReadableNativeMap.keys_delegate$lambda$1(this.f21706b);
                    case 1:
                        return ReadableNativeMap.localMap_delegate$lambda$2(this.f21706b);
                    default:
                        return ReadableNativeMap.localTypeMap_delegate$lambda$3(this.f21706b);
                }
            }
        });
        final int i10 = 1;
        this.localMap = C2131j.a(enumC2132k, new Function0(this) { // from class: com.facebook.react.bridge.c

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ ReadableNativeMap f21706b;

            {
                this.f21706b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i10) {
                    case 0:
                        return ReadableNativeMap.keys_delegate$lambda$1(this.f21706b);
                    case 1:
                        return ReadableNativeMap.localMap_delegate$lambda$2(this.f21706b);
                    default:
                        return ReadableNativeMap.localTypeMap_delegate$lambda$3(this.f21706b);
                }
            }
        });
        final int i11 = 2;
        this.localTypeMap = C2131j.a(enumC2132k, new Function0(this) { // from class: com.facebook.react.bridge.c

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ ReadableNativeMap f21706b;

            {
                this.f21706b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i11) {
                    case 0:
                        return ReadableNativeMap.keys_delegate$lambda$1(this.f21706b);
                    case 1:
                        return ReadableNativeMap.localMap_delegate$lambda$2(this.f21706b);
                    default:
                        return ReadableNativeMap.localTypeMap_delegate$lambda$3(this.f21706b);
                }
            }
        });
    }

    @SuppressLint({"ReflectionMethodUse"})
    private final <T> T checkInstance(String name, Object instance, Class<T> type) {
        Intrinsics.m();
        throw null;
    }

    @JvmStatic
    @JvmName(name = "getJNIPassCounter")
    public static final int getJNIPassCounter() {
        return Companion.getJNIPassCounter();
    }

    private final String[] getKeys() {
        return (String[]) this.keys.getValue();
    }

    private final HashMap<String, Object> getLocalMap() {
        return (HashMap) this.localMap.getValue();
    }

    private final HashMap<String, ReadableType> getLocalTypeMap() {
        return (HashMap) this.localTypeMap.getValue();
    }

    private final Object getNullableValue(String name) {
        return getLocalMap().get(name);
    }

    private final Object getValue(String name) {
        if (!hasKey(name)) {
            throw new NoSuchKeyException(name);
        }
        Object obj = getLocalMap().get(name);
        p059e1.a.f(obj);
        Intrinsics.checkNotNullExpressionValue(obj, "assertNotNull(...)");
        return obj;
    }

    private final native String[] importKeys();

    private final native Object[] importTypes();

    private final native Object[] importValues();

    /* JADX INFO: Access modifiers changed from: private */
    public static final String[] keys_delegate$lambda$1(ReadableNativeMap readableNativeMap) {
        String[] strArrImportKeys = readableNativeMap.importKeys();
        jniPassCounter++;
        return strArrImportKeys;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final HashMap localMap_delegate$lambda$2(ReadableNativeMap readableNativeMap) {
        int length = readableNativeMap.getKeys().length;
        HashMap map = new HashMap(length);
        Object[] objArrImportValues = readableNativeMap.importValues();
        jniPassCounter++;
        for (int i7 = 0; i7 < length; i7++) {
            map.put(readableNativeMap.getKeys()[i7], objArrImportValues[i7]);
        }
        return map;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final HashMap localTypeMap_delegate$lambda$3(ReadableNativeMap readableNativeMap) {
        int length = readableNativeMap.getKeys().length;
        HashMap map = new HashMap(length);
        Object[] objArrImportTypes = readableNativeMap.importTypes();
        jniPassCounter++;
        for (int i7 = 0; i7 < length; i7++) {
            String str = readableNativeMap.getKeys()[i7];
            Object obj = objArrImportTypes[i7];
            Intrinsics.f(obj, "null cannot be cast to non-null type com.facebook.react.bridge.ReadableType");
            map.put(str, (ReadableType) obj);
        }
        return map;
    }

    public boolean equals(@Nullable Object other) {
        if (other instanceof ReadableNativeMap) {
            return Intrinsics.c(getLocalMap(), ((ReadableNativeMap) other).getLocalMap());
        }
        return false;
    }

    @Override // com.facebook.react.bridge.ReadableMap
    @Nullable
    public ReadableArray getArray(@NotNull String name) {
        Intrinsics.checkNotNullParameter(name, "name");
        Object nullableValue = getNullableValue(name);
        if (nullableValue == null) {
            return null;
        }
        ReadableArray readableArray = (ReadableArray) (nullableValue instanceof ReadableArray ? nullableValue : null);
        if (readableArray != null) {
            return readableArray;
        }
        throw new UnexpectedNativeTypeException(G.q("Value for ", name, " cannot be cast from ", nullableValue.getClass().getSimpleName(), " to ReadableArray"));
    }

    @Override // com.facebook.react.bridge.ReadableMap
    public boolean getBoolean(@NotNull String name) {
        Intrinsics.checkNotNullParameter(name, "name");
        Object value = getValue(name);
        Boolean bool = (Boolean) (!(value instanceof Boolean) ? null : value);
        if (bool != null) {
            return bool.booleanValue();
        }
        String simpleName = value != null ? value.getClass().getSimpleName() : "NULL";
        String simpleName2 = Boolean.TYPE.getSimpleName();
        StringBuilder sbF = F.f("Value for ", name, " cannot be cast from ", simpleName, " to ");
        sbF.append(simpleName2);
        throw new UnexpectedNativeTypeException(sbF.toString());
    }

    @Override // com.facebook.react.bridge.ReadableMap
    public double getDouble(@NotNull String name) {
        Intrinsics.checkNotNullParameter(name, "name");
        Object value = getValue(name);
        Double d2 = (Double) (!(value instanceof Double) ? null : value);
        if (d2 != null) {
            return d2.doubleValue();
        }
        String simpleName = value != null ? value.getClass().getSimpleName() : "NULL";
        String simpleName2 = Double.TYPE.getSimpleName();
        StringBuilder sbF = F.f("Value for ", name, " cannot be cast from ", simpleName, " to ");
        sbF.append(simpleName2);
        throw new UnexpectedNativeTypeException(sbF.toString());
    }

    @Override // com.facebook.react.bridge.ReadableMap
    @NotNull
    public Dynamic getDynamic(@NotNull String name) {
        Intrinsics.checkNotNullParameter(name, "name");
        return DynamicFromMap.INSTANCE.create(this, name);
    }

    @Override // com.facebook.react.bridge.ReadableMap
    @NotNull
    public Iterator<Map.Entry<String, Object>> getEntryIterator() {
        ReadableNativeMap$entryIterator$1$1 readableNativeMap$entryIterator$1$1;
        synchronized (this) {
            String[] keys = getKeys();
            Object[] objArrImportValues = importValues();
            jniPassCounter++;
            readableNativeMap$entryIterator$1$1 = new ReadableNativeMap$entryIterator$1$1(keys, objArrImportValues);
        }
        return readableNativeMap$entryIterator$1$1;
    }

    @Override // com.facebook.react.bridge.ReadableMap
    public int getInt(@NotNull String name) {
        Intrinsics.checkNotNullParameter(name, "name");
        Object value = getValue(name);
        Double d2 = (Double) (!(value instanceof Double) ? null : value);
        if (d2 != null) {
            return (int) d2.doubleValue();
        }
        String simpleName = value != null ? value.getClass().getSimpleName() : "NULL";
        String simpleName2 = Double.TYPE.getSimpleName();
        StringBuilder sbF = F.f("Value for ", name, " cannot be cast from ", simpleName, " to ");
        sbF.append(simpleName2);
        throw new UnexpectedNativeTypeException(sbF.toString());
    }

    @Override // com.facebook.react.bridge.ReadableMap
    public long getLong(@NotNull String name) {
        Intrinsics.checkNotNullParameter(name, "name");
        Object value = getValue(name);
        Long l5 = (Long) (!(value instanceof Long) ? null : value);
        if (l5 != null) {
            return l5.longValue();
        }
        String simpleName = value != null ? value.getClass().getSimpleName() : "NULL";
        String simpleName2 = Long.TYPE.getSimpleName();
        StringBuilder sbF = F.f("Value for ", name, " cannot be cast from ", simpleName, " to ");
        sbF.append(simpleName2);
        throw new UnexpectedNativeTypeException(sbF.toString());
    }

    @Override // com.facebook.react.bridge.ReadableMap
    @Nullable
    public String getString(@NotNull String name) {
        Intrinsics.checkNotNullParameter(name, "name");
        Object nullableValue = getNullableValue(name);
        if (nullableValue == null) {
            return null;
        }
        String str = (String) (nullableValue instanceof String ? nullableValue : null);
        if (str != null) {
            return str;
        }
        throw new UnexpectedNativeTypeException(G.q("Value for ", name, " cannot be cast from ", nullableValue.getClass().getSimpleName(), " to String"));
    }

    @Override // com.facebook.react.bridge.ReadableMap
    @NotNull
    public ReadableType getType(@NotNull String name) {
        Intrinsics.checkNotNullParameter(name, "name");
        ReadableType readableType = getLocalTypeMap().get(name);
        if (readableType != null) {
            return readableType;
        }
        throw new NoSuchKeyException(name);
    }

    @Override // com.facebook.react.bridge.ReadableMap
    public boolean hasKey(@NotNull String name) {
        Intrinsics.checkNotNullParameter(name, "name");
        return getLocalMap().containsKey(name);
    }

    public int hashCode() {
        return getLocalMap().hashCode();
    }

    @Override // com.facebook.react.bridge.ReadableMap
    public boolean isNull(@NotNull String name) {
        Intrinsics.checkNotNullParameter(name, "name");
        if (getLocalMap().containsKey(name)) {
            return getLocalMap().get(name) == null;
        }
        throw new NoSuchKeyException(name);
    }

    @Override // com.facebook.react.bridge.ReadableMap
    @NotNull
    public ReadableMapKeySetIterator keySetIterator() {
        final String[] keys = getKeys();
        return new ReadableMapKeySetIterator() { // from class: com.facebook.react.bridge.ReadableNativeMap.keySetIterator.1
            private int currentIndex;

            public final int getCurrentIndex() {
                return this.currentIndex;
            }

            @Override // com.facebook.react.bridge.ReadableMapKeySetIterator
            public boolean hasNextKey() {
                return this.currentIndex < keys.length;
            }

            @Override // com.facebook.react.bridge.ReadableMapKeySetIterator
            public String nextKey() {
                String[] strArr = keys;
                int i7 = this.currentIndex;
                this.currentIndex = i7 + 1;
                return strArr[i7];
            }

            public final void setCurrentIndex(int i7) {
                this.currentIndex = i7;
            }
        };
    }

    @Override // com.facebook.react.bridge.ReadableMap
    @NotNull
    public HashMap<String, Object> toHashMap() {
        HashMap<String, Object> map = new HashMap<>(getLocalMap());
        for (String str : map.keySet()) {
            Intrinsics.f(str, "null cannot be cast to non-null type kotlin.String");
            String str2 = str;
            switch (WhenMappings.$EnumSwitchMapping$0[getType(str2).ordinal()]) {
                case 1:
                case 2:
                case 3:
                case 4:
                    break;
                case 5:
                    ReadableNativeMap map2 = getMap(str2);
                    p059e1.a.f(map2);
                    map.put(str2, map2.toHashMap());
                    break;
                case 6:
                    ReadableArray array = getArray(str2);
                    p059e1.a.f(array);
                    map.put(str2, array.toArrayList());
                    break;
                default:
                    throw new l();
            }
        }
        return map;
    }

    private final <T> T getNullableValue(String name, Class<T> type) {
        if (getNullableValue(name) == null) {
            return null;
        }
        Intrinsics.m();
        throw null;
    }

    @Override // com.facebook.react.bridge.ReadableMap
    @Nullable
    public ReadableNativeMap getMap(@NotNull String name) {
        Intrinsics.checkNotNullParameter(name, "name");
        Object nullableValue = getNullableValue(name);
        if (nullableValue == null) {
            return null;
        }
        ReadableNativeMap readableNativeMap = (ReadableNativeMap) (nullableValue instanceof ReadableNativeMap ? nullableValue : null);
        if (readableNativeMap != null) {
            return readableNativeMap;
        }
        throw new UnexpectedNativeTypeException(G.q("Value for ", name, " cannot be cast from ", nullableValue.getClass().getSimpleName(), " to ReadableNativeMap"));
    }

    private final <T> T getValue(String name, Class<T> type) {
        getValue(name);
        Intrinsics.m();
        throw null;
    }
}
