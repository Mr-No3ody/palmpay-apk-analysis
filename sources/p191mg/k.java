package p191mg;

import C9.N;
import Hb.L;
import Pa.C0525w;
import androidx.camera.video.u;
import com.airbnb.lottie.model.layer.d;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.collections.z;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KClass;
import kotlinx.serialization.SerializationStrategy;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.json.JsonEncoder;
import kotlinx.serialization.json.JsonNamingStrategy;
import p133ig.b;
import p133ig.f;
import p133ig.g;
import p176lg.c;
import p176lg.h;
import p185ma.t;
import p209ng.a;

/* JADX INFO: loaded from: classes4.dex */
public abstract class k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final l f39731a = new l();

    public static final h a(String output, Number value) {
        Intrinsics.checkNotNullParameter(value, "value");
        Intrinsics.checkNotNullParameter(output, "output");
        return new h("Unexpected special floating-point value " + value + ". By default, non-finite floating point values are prohibited because they do not conform JSON specification. It is possible to deserialize them using 'JsonBuilder.allowSpecialFloatingPointValues = true'\nCurrent output: " + ((Object) h(-1, output)));
    }

    public static final h b(CharSequence input, int i7, String message) {
        Intrinsics.checkNotNullParameter(message, "message");
        Intrinsics.checkNotNullParameter(input, "input");
        String message2 = message + "\nJSON input: " + ((Object) h(i7, input));
        Intrinsics.checkNotNullParameter(message2, "message");
        if (i7 >= 0) {
            message2 = d.j("Unexpected JSON token at offset ", i7, ": ", message2);
        }
        Intrinsics.checkNotNullParameter(message2, "message");
        return new h(message2);
    }

    public static final SerialDescriptor c(SerialDescriptor descriptor, a module) {
        Intrinsics.checkNotNullParameter(descriptor, "<this>");
        Intrinsics.checkNotNullParameter(module, "module");
        if (!Intrinsics.c(descriptor.getKind(), f.f37620a)) {
            return descriptor.isInline() ? c(descriptor.getElementDescriptor(0), module) : descriptor;
        }
        Intrinsics.checkNotNullParameter(module, "<this>");
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        KClass kClass = p002a.a.k(descriptor);
        if (kClass == null) {
            return descriptor;
        }
        z typeArgumentsSerializers = z.f38935a;
        module.getClass();
        Intrinsics.checkNotNullParameter(kClass, "kClass");
        Intrinsics.checkNotNullParameter(typeArgumentsSerializers, "typeArgumentsSerializers");
        return descriptor;
    }

    public static final byte d(char c6) {
        if (c6 < '~') {
            return d.f39724b[c6];
        }
        return (byte) 0;
    }

    public static final void e(c json, C4.a sb2, SerializationStrategy serializer, Object obj) {
        Intrinsics.checkNotNullParameter(json, "json");
        Intrinsics.checkNotNullParameter(sb2, "writer");
        Intrinsics.checkNotNullParameter(serializer, "serializer");
        s mode = s.OBJ;
        JsonEncoder[] modeReuseCache = new JsonEncoder[s.f39765i.a()];
        Intrinsics.checkNotNullParameter(sb2, "output");
        Intrinsics.checkNotNullParameter(json, "json");
        Intrinsics.checkNotNullParameter(mode, "mode");
        Intrinsics.checkNotNullParameter(modeReuseCache, "modeReuseCache");
        Intrinsics.checkNotNullParameter(sb2, "sb");
        Intrinsics.checkNotNullParameter(json, "json");
        new p(new N(sb2), json, mode, modeReuseCache).encodeSerializableValue(serializer, obj);
    }

    public static final int f(SerialDescriptor descriptor, c json, String name) {
        Intrinsics.checkNotNullParameter(descriptor, "<this>");
        Intrinsics.checkNotNullParameter(json, "json");
        Intrinsics.checkNotNullParameter(name, "name");
        h hVar = json.f39370a;
        i(descriptor, json);
        int elementIndex = descriptor.getElementIndex(name);
        if (elementIndex != -3 || !json.f39370a.f39382d) {
            return elementIndex;
        }
        Intrinsics.checkNotNullParameter(json, "<this>");
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        Intrinsics.checkNotNullParameter(json, "<this>");
        C0525w c0525w = json.f39372c;
        l key = f39731a;
        L defaultValue = new L(23, descriptor, json);
        c0525w.getClass();
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(defaultValue, "defaultValue");
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        Intrinsics.checkNotNullParameter(key, "key");
        Map map = (Map) ((ConcurrentHashMap) c0525w.f7166b).get(descriptor);
        Object obj = map != null ? map.get(key) : null;
        Object value = obj != null ? obj : null;
        if (value == null) {
            value = defaultValue.invoke();
            Intrinsics.checkNotNullParameter(descriptor, "descriptor");
            Intrinsics.checkNotNullParameter(key, "key");
            Intrinsics.checkNotNullParameter(value, "value");
            ConcurrentHashMap concurrentHashMap = (ConcurrentHashMap) c0525w.f7166b;
            Object concurrentHashMap2 = concurrentHashMap.get(descriptor);
            if (concurrentHashMap2 == null) {
                concurrentHashMap2 = new ConcurrentHashMap(2);
                concurrentHashMap.put(descriptor, concurrentHashMap2);
            }
            ((Map) concurrentHashMap2).put(key, value);
        }
        Integer num = (Integer) ((Map) value).get(name);
        if (num != null) {
            return num.intValue();
        }
        return -3;
    }

    public static final void g(t tVar, String entity) {
        Intrinsics.checkNotNullParameter(tVar, "<this>");
        Intrinsics.checkNotNullParameter(entity, "entity");
        tVar.m(tVar.f39626b - 1, "Trailing comma before the end of JSON ".concat(entity), "Trailing commas are non-complaint JSON and not allowed by default. Use 'allowTrailingCommas = true' in 'Json {}' builder to support them.");
        throw null;
    }

    public static final CharSequence h(int i7, CharSequence charSequence) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        if (charSequence.length() >= 200) {
            if (i7 != -1) {
                int i10 = i7 - 30;
                int i11 = i7 + 30;
                String str = i10 <= 0 ? "" : ".....";
                String str2 = i11 >= charSequence.length() ? "" : ".....";
                StringBuilder sbS = u.s(str);
                if (i10 < 0) {
                    i10 = 0;
                }
                int length = charSequence.length();
                if (i11 > length) {
                    i11 = length;
                }
                sbS.append(charSequence.subSequence(i10, i11).toString());
                sbS.append(str2);
                return sbS.toString();
            }
            int length2 = charSequence.length() - 60;
            if (length2 > 0) {
                return "....." + charSequence.subSequence(length2, charSequence.length()).toString();
            }
        }
        return charSequence;
    }

    public static final JsonNamingStrategy i(SerialDescriptor serialDescriptor, c json) {
        Intrinsics.checkNotNullParameter(serialDescriptor, "<this>");
        Intrinsics.checkNotNullParameter(json, "json");
        if (Intrinsics.c(serialDescriptor.getKind(), p133ig.h.f37622a)) {
            h hVar = json.f39370a;
        }
        return null;
    }

    public static final s j(SerialDescriptor desc, c cVar) {
        Intrinsics.checkNotNullParameter(cVar, "<this>");
        Intrinsics.checkNotNullParameter(desc, "desc");
        g kind = desc.getKind();
        if (kind instanceof b) {
            return s.POLY_OBJ;
        }
        if (Intrinsics.c(kind, p133ig.h.f37623b)) {
            return s.LIST;
        }
        if (!Intrinsics.c(kind, p133ig.h.f37624c)) {
            return s.OBJ;
        }
        SerialDescriptor keyDescriptor = c(desc.getElementDescriptor(0), cVar.f39371b);
        g kind2 = keyDescriptor.getKind();
        if ((kind2 instanceof p133ig.d) || Intrinsics.c(kind2, f.f37621b)) {
            return s.MAP;
        }
        Intrinsics.checkNotNullParameter(keyDescriptor, "keyDescriptor");
        throw new h("Value of type '" + keyDescriptor.getSerialName() + "' can't be used in JSON as a key in the map. It should have either primitive or enum kind, but its kind is '" + keyDescriptor.getKind() + "'.\nUse 'allowStructuredMapKeys = true' in 'Json {}' builder to convert such maps to [key1, value1, key2, value2,...] arrays.");
    }

    public static final void k(t tVar, Number result) {
        Intrinsics.checkNotNullParameter(tVar, "<this>");
        Intrinsics.checkNotNullParameter(result, "result");
        t.n(tVar, "Unexpected special floating-point value " + result + ". By default, non-finite floating point values are prohibited because they do not conform JSON specification", 0, 2);
        throw null;
    }

    public static final String l(byte b7) {
        if (b7 == 1) {
            return "quotation mark '\"'";
        }
        if (b7 == 2) {
            return "string escape sequence '\\'";
        }
        if (b7 == 4) {
            return "comma ','";
        }
        if (b7 == 5) {
            return "colon ':'";
        }
        if (b7 == 6) {
            return "start of the object '{'";
        }
        if (b7 == 7) {
            return "end of the object '}'";
        }
        if (b7 == 8) {
            return "start of the array '['";
        }
        if (b7 == 9) {
            return "end of the array ']'";
        }
        if (b7 == 10) {
            return "end of the input";
        }
        return b7 == 127 ? "invalid token" : "valid token";
    }
}
