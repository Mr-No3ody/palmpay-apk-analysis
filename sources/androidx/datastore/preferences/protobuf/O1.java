package androidx.datastore.preferences.protobuf;

import com.facebook.react.fabric.mounting.mountitems.IntBufferBatchMountItem;
import com.google.android.material.navigation.NavigationBarView;
import com.google.api.Service;
import com.google.protobuf.DescriptorProtos;
import com.luck.picture.lib.config.PictureConfig;
import com.transsnet.palmpay.core.bean.rsp.HomeMenuBean;
import com.transsnet.palmpay.core.config.BillBusinessType;
import com.transsnet.palmpay.core.dialog.ShareDialog;
import java.io.IOException;
import java.lang.reflect.Field;
import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.logging.Logger;
import sun.misc.Unsafe;

/* JADX INFO: loaded from: classes.dex */
public final class O1 implements Schema {

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final int[] f16518p = new int[0];

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final Unsafe f16519q = w2.j();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int[] f16520a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object[] f16521b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f16522c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f16523d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final MessageLite f16524e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final boolean f16525f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final boolean f16526g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final int[] f16527h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final int f16528i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final int f16529j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final NewInstanceSchema f16530k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final ListFieldSchema f16531l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final r2 f16532m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final AbstractC1096f1 f16533n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final MapFieldSchema f16534o;

    public O1(int[] iArr, Object[] objArr, int i7, int i10, MessageLite messageLite, int[] iArr2, int i11, int i12, NewInstanceSchema newInstanceSchema, ListFieldSchema listFieldSchema, r2 r2Var, AbstractC1096f1 abstractC1096f1, MapFieldSchema mapFieldSchema) {
        this.f16520a = iArr;
        this.f16521b = objArr;
        this.f16522c = i7;
        this.f16523d = i10;
        this.f16526g = messageLite instanceof AbstractC1145u1;
        this.f16525f = abstractC1096f1 != null && (messageLite instanceof AbstractC1142t1);
        this.f16527h = iArr2;
        this.f16528i = i11;
        this.f16529j = i12;
        this.f16530k = newInstanceSchema;
        this.f16531l = listFieldSchema;
        this.f16532m = r2Var;
        this.f16533n = abstractC1096f1;
        this.f16524e = messageLite;
        this.f16534o = mapFieldSchema;
    }

    public static Field E(Class cls, String str) {
        try {
            return cls.getDeclaredField(str);
        } catch (NoSuchFieldException unused) {
            Field[] declaredFields = cls.getDeclaredFields();
            for (Field field : declaredFields) {
                if (str.equals(field.getName())) {
                    return field;
                }
            }
            StringBuilder sbQ = N8.q0.q("Field ", str, " for ");
            sbQ.append(cls.getName());
            sbQ.append(" not found. Known fields are ");
            sbQ.append(Arrays.toString(declaredFields));
            throw new RuntimeException(sbQ.toString());
        }
    }

    public static int K(int i7) {
        return (i7 & 267386880) >>> 20;
    }

    public static void N(int i7, Object obj, Writer writer) throws IOException {
        if (obj instanceof String) {
            writer.writeString(i7, (String) obj);
        } else {
            writer.writeBytes(i7, (AbstractC1123n) obj);
        }
    }

    public static void b(Object obj) {
        if (k(obj)) {
            return;
        }
        throw new IllegalArgumentException("Mutating immutable message: " + obj);
    }

    public static int c(byte[] bArr, int i7, int i10, H2 h7, Class cls, C1098g c1098g) throws IOException {
        switch (h7.ordinal()) {
            case 0:
                c1098g.f16618c = Double.valueOf(Double.longBitsToDouble(AbstractC1102h.f(bArr, i7)));
                return i7 + 8;
            case 1:
                c1098g.f16618c = Float.valueOf(Float.intBitsToFloat(AbstractC1102h.e(bArr, i7)));
                return i7 + 4;
            case 2:
            case 3:
                int iO = AbstractC1102h.o(bArr, i7, c1098g);
                c1098g.f16618c = Long.valueOf(c1098g.f16617b);
                return iO;
            case 4:
            case 12:
            case 13:
                int iM = AbstractC1102h.m(bArr, i7, c1098g);
                c1098g.f16618c = Integer.valueOf(c1098g.f16616a);
                return iM;
            case 5:
            case 15:
                c1098g.f16618c = Long.valueOf(AbstractC1102h.f(bArr, i7));
                return i7 + 8;
            case 6:
            case 14:
                c1098g.f16618c = Integer.valueOf(AbstractC1102h.e(bArr, i7));
                return i7 + 4;
            case 7:
                int iO2 = AbstractC1102h.o(bArr, i7, c1098g);
                c1098g.f16618c = Boolean.valueOf(c1098g.f16617b != 0);
                return iO2;
            case 8:
                int iM2 = AbstractC1102h.m(bArr, i7, c1098g);
                int i11 = c1098g.f16616a;
                if (i11 < 0) {
                    throw C1160z1.e();
                }
                if (i11 == 0) {
                    c1098g.f16618c = "";
                    return iM2;
                }
                c1098g.f16618c = z2.f16817a.i(bArr, iM2, i11);
                return iM2 + i11;
            case 9:
            default:
                throw new RuntimeException("unsupported field type.");
            case 10:
                Schema schemaA = C1077a2.f16579c.a(cls);
                Object objNewInstance = schemaA.newInstance();
                int iT = AbstractC1102h.t(objNewInstance, schemaA, bArr, i7, i10, c1098g);
                schemaA.makeImmutable(objNewInstance);
                c1098g.f16618c = objNewInstance;
                return iT;
            case 11:
                return AbstractC1102h.d(bArr, i7, c1098g);
            case 16:
                int iM3 = AbstractC1102h.m(bArr, i7, c1098g);
                c1098g.f16618c = Integer.valueOf(r.b(c1098g.f16616a));
                return iM3;
            case 17:
                int iO3 = AbstractC1102h.o(bArr, i7, c1098g);
                c1098g.f16618c = Long.valueOf(r.c(c1098g.f16617b));
                return iO3;
        }
    }

    public static q2 h(Object obj) {
        AbstractC1145u1 abstractC1145u1 = (AbstractC1145u1) obj;
        q2 q2Var = abstractC1145u1.unknownFields;
        if (q2Var != q2.f16751f) {
            return q2Var;
        }
        q2 q2VarC = q2.c();
        abstractC1145u1.unknownFields = q2VarC;
        return q2VarC;
    }

    public static boolean k(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj instanceof AbstractC1145u1) {
            return ((AbstractC1145u1) obj).h();
        }
        return true;
    }

    /* JADX WARN: Code duplicated, block: B:154:0x030f  */
    /* JADX WARN: Code duplicated, block: B:181:0x039a  */
    public static O1 s(C1085c2 c1085c2, NewInstanceSchema newInstanceSchema, ListFieldSchema listFieldSchema, r2 r2Var, AbstractC1096f1 abstractC1096f1, MapFieldSchema mapFieldSchema) {
        int i7;
        int iCharAt;
        int i10;
        int i11;
        int i12;
        int[] iArr;
        int i13;
        int i14;
        int i15;
        int i16;
        char cCharAt;
        int i17;
        char cCharAt2;
        int i18;
        char cCharAt3;
        int i19;
        char cCharAt4;
        int i20;
        char cCharAt5;
        int i21;
        char cCharAt6;
        int i22;
        char cCharAt7;
        int i23;
        char cCharAt8;
        int i24;
        int i25;
        int i26;
        int i27;
        int iObjectFieldOffset;
        int iObjectFieldOffset2;
        int i28;
        int i29;
        Field fieldE;
        char cCharAt9;
        int i30;
        Field fieldE2;
        Field fieldE3;
        int i31;
        char cCharAt10;
        int i32;
        int i33;
        char cCharAt11;
        int i34;
        char cCharAt12;
        int i35;
        char cCharAt13;
        String str = c1085c2.f16593b;
        int length = str.length();
        int i36 = 55296;
        if (str.charAt(0) >= 55296) {
            int i37 = 1;
            while (true) {
                i7 = i37 + 1;
                if (str.charAt(i37) < 55296) {
                    break;
                }
                i37 = i7;
            }
        } else {
            i7 = 1;
        }
        int i38 = i7 + 1;
        int iCharAt2 = str.charAt(i7);
        if (iCharAt2 >= 55296) {
            int i39 = iCharAt2 & 8191;
            int i40 = 13;
            while (true) {
                i35 = i38 + 1;
                cCharAt13 = str.charAt(i38);
                if (cCharAt13 < 55296) {
                    break;
                }
                i39 |= (cCharAt13 & 8191) << i40;
                i40 += 13;
                i38 = i35;
            }
            iCharAt2 = i39 | (cCharAt13 << i40);
            i38 = i35;
        }
        if (iCharAt2 == 0) {
            i11 = 0;
            i14 = 0;
            iCharAt = 0;
            i10 = 0;
            i13 = 0;
            i15 = 0;
            iArr = f16518p;
            i12 = 0;
        } else {
            int i41 = i38 + 1;
            int iCharAt3 = str.charAt(i38);
            if (iCharAt3 >= 55296) {
                int i42 = iCharAt3 & 8191;
                int i43 = 13;
                while (true) {
                    i23 = i41 + 1;
                    cCharAt8 = str.charAt(i41);
                    if (cCharAt8 < 55296) {
                        break;
                    }
                    i42 |= (cCharAt8 & 8191) << i43;
                    i43 += 13;
                    i41 = i23;
                }
                iCharAt3 = i42 | (cCharAt8 << i43);
                i41 = i23;
            }
            int i44 = i41 + 1;
            int iCharAt4 = str.charAt(i41);
            if (iCharAt4 >= 55296) {
                int i45 = iCharAt4 & 8191;
                int i46 = 13;
                while (true) {
                    i22 = i44 + 1;
                    cCharAt7 = str.charAt(i44);
                    if (cCharAt7 < 55296) {
                        break;
                    }
                    i45 |= (cCharAt7 & 8191) << i46;
                    i46 += 13;
                    i44 = i22;
                }
                iCharAt4 = i45 | (cCharAt7 << i46);
                i44 = i22;
            }
            int i47 = i44 + 1;
            int iCharAt5 = str.charAt(i44);
            if (iCharAt5 >= 55296) {
                int i48 = iCharAt5 & 8191;
                int i49 = 13;
                while (true) {
                    i21 = i47 + 1;
                    cCharAt6 = str.charAt(i47);
                    if (cCharAt6 < 55296) {
                        break;
                    }
                    i48 |= (cCharAt6 & 8191) << i49;
                    i49 += 13;
                    i47 = i21;
                }
                iCharAt5 = i48 | (cCharAt6 << i49);
                i47 = i21;
            }
            int i50 = i47 + 1;
            int iCharAt6 = str.charAt(i47);
            if (iCharAt6 >= 55296) {
                int i51 = iCharAt6 & 8191;
                int i52 = 13;
                while (true) {
                    i20 = i50 + 1;
                    cCharAt5 = str.charAt(i50);
                    if (cCharAt5 < 55296) {
                        break;
                    }
                    i51 |= (cCharAt5 & 8191) << i52;
                    i52 += 13;
                    i50 = i20;
                }
                iCharAt6 = i51 | (cCharAt5 << i52);
                i50 = i20;
            }
            int i53 = i50 + 1;
            iCharAt = str.charAt(i50);
            if (iCharAt >= 55296) {
                int i54 = iCharAt & 8191;
                int i55 = 13;
                while (true) {
                    i19 = i53 + 1;
                    cCharAt4 = str.charAt(i53);
                    if (cCharAt4 < 55296) {
                        break;
                    }
                    i54 |= (cCharAt4 & 8191) << i55;
                    i55 += 13;
                    i53 = i19;
                }
                iCharAt = i54 | (cCharAt4 << i55);
                i53 = i19;
            }
            int i56 = i53 + 1;
            int iCharAt7 = str.charAt(i53);
            if (iCharAt7 >= 55296) {
                int i57 = iCharAt7 & 8191;
                int i58 = 13;
                while (true) {
                    i18 = i56 + 1;
                    cCharAt3 = str.charAt(i56);
                    if (cCharAt3 < 55296) {
                        break;
                    }
                    i57 |= (cCharAt3 & 8191) << i58;
                    i58 += 13;
                    i56 = i18;
                }
                iCharAt7 = i57 | (cCharAt3 << i58);
                i56 = i18;
            }
            int i59 = i56 + 1;
            int iCharAt8 = str.charAt(i56);
            if (iCharAt8 >= 55296) {
                int i60 = iCharAt8 & 8191;
                int i61 = 13;
                while (true) {
                    i17 = i59 + 1;
                    cCharAt2 = str.charAt(i59);
                    if (cCharAt2 < 55296) {
                        break;
                    }
                    i60 |= (cCharAt2 & 8191) << i61;
                    i61 += 13;
                    i59 = i17;
                }
                iCharAt8 = i60 | (cCharAt2 << i61);
                i59 = i17;
            }
            int i62 = i59 + 1;
            int iCharAt9 = str.charAt(i59);
            if (iCharAt9 >= 55296) {
                int i63 = iCharAt9 & 8191;
                int i64 = 13;
                while (true) {
                    i16 = i62 + 1;
                    cCharAt = str.charAt(i62);
                    if (cCharAt < 55296) {
                        break;
                    }
                    i63 |= (cCharAt & 8191) << i64;
                    i64 += 13;
                    i62 = i16;
                }
                iCharAt9 = i63 | (cCharAt << i64);
                i62 = i16;
            }
            int[] iArr2 = new int[iCharAt9 + iCharAt7 + iCharAt8];
            int i65 = (iCharAt3 * 2) + iCharAt4;
            int i66 = iCharAt7;
            i10 = iCharAt5;
            i11 = i66;
            i12 = iCharAt3;
            i38 = i62;
            iArr = iArr2;
            i13 = iCharAt6;
            i14 = i65;
            i15 = iCharAt9;
        }
        Unsafe unsafe = f16519q;
        Class<?> cls = c1085c2.f16592a.getClass();
        int[] iArr3 = new int[iCharAt * 3];
        Object[] objArr = new Object[iCharAt * 2];
        int i67 = i15 + i11;
        int i68 = i67;
        int i69 = i15;
        int i70 = 0;
        int i71 = 0;
        while (i38 < length) {
            int i72 = i38 + 1;
            int iCharAt10 = str.charAt(i38);
            if (iCharAt10 >= i36) {
                int i73 = iCharAt10 & 8191;
                int i74 = i72;
                int i75 = 13;
                while (true) {
                    i34 = i74 + 1;
                    cCharAt12 = str.charAt(i74);
                    i24 = length;
                    if (cCharAt12 < 55296) {
                        break;
                    }
                    i73 |= (cCharAt12 & 8191) << i75;
                    i75 += 13;
                    i74 = i34;
                    length = i24;
                }
                iCharAt10 = i73 | (cCharAt12 << i75);
                i25 = i34;
            } else {
                i24 = length;
                i25 = i72;
            }
            int i76 = i25 + 1;
            int iCharAt11 = str.charAt(i25);
            int i77 = iCharAt10;
            char c6 = 55296;
            if (iCharAt11 >= 55296) {
                int i78 = iCharAt11 & 8191;
                int i79 = 13;
                while (true) {
                    i33 = i76 + 1;
                    cCharAt11 = str.charAt(i76);
                    if (cCharAt11 < c6) {
                        break;
                    }
                    i78 |= (cCharAt11 & 8191) << i79;
                    i79 += 13;
                    i76 = i33;
                    c6 = 55296;
                }
                iCharAt11 = i78 | (cCharAt11 << i79);
                i76 = i33;
            }
            int i80 = iCharAt11 & 255;
            int i81 = i12;
            if ((iCharAt11 & 1024) != 0) {
                iArr[i71] = i70;
                i71++;
            }
            Z1 z3 = Z1.f16570a;
            int[] iArr4 = iArr3;
            Object[] objArr2 = c1085c2.f16594c;
            if (i80 >= 51) {
                int i82 = i76 + 1;
                int iCharAt12 = str.charAt(i76);
                if (iCharAt12 >= 55296) {
                    int i83 = iCharAt12 & 8191;
                    int i84 = i82;
                    int i85 = 13;
                    while (true) {
                        i31 = i84 + 1;
                        cCharAt10 = str.charAt(i84);
                        i32 = i83;
                        if (cCharAt10 < 55296) {
                            break;
                        }
                        i83 = i32 | ((cCharAt10 & 8191) << i85);
                        i85 += 13;
                        i84 = i31;
                    }
                    iCharAt12 = i32 | (cCharAt10 << i85);
                    i30 = i31;
                } else {
                    i30 = i82;
                }
                int i86 = iCharAt12;
                int i87 = i80 - 51;
                int i88 = i30;
                if (i87 == 9 || i87 == 17) {
                    objArr[androidx.camera.video.u.y(i70, 3, 2, 1)] = objArr2[i14];
                    i14++;
                } else if (i87 == 12 && (c1085c2.getSyntax().equals(z3) || (iCharAt11 & 2048) != 0)) {
                    objArr[androidx.camera.video.u.y(i70, 3, 2, 1)] = objArr2[i14];
                    i14++;
                }
                int i89 = i86 * 2;
                Object obj = objArr2[i89];
                if (obj instanceof Field) {
                    fieldE2 = (Field) obj;
                } else {
                    fieldE2 = E(cls, (String) obj);
                    objArr2[i89] = fieldE2;
                }
                int iObjectFieldOffset3 = (int) unsafe.objectFieldOffset(fieldE2);
                int i90 = i89 + 1;
                Object obj2 = objArr2[i90];
                if (obj2 instanceof Field) {
                    fieldE3 = (Field) obj2;
                } else {
                    fieldE3 = E(cls, (String) obj2);
                    objArr2[i90] = fieldE3;
                }
                iObjectFieldOffset2 = (int) unsafe.objectFieldOffset(fieldE3);
                i27 = i14;
                iObjectFieldOffset = iObjectFieldOffset3;
                i28 = i88;
                i29 = 0;
                i26 = i67;
            } else {
                int i91 = i14 + 1;
                Field fieldE4 = E(cls, (String) objArr2[i14]);
                i26 = i67;
                if (i80 == 9 || i80 == 17) {
                    objArr[androidx.camera.video.u.y(i70, 3, 2, 1)] = fieldE4.getType();
                } else {
                    if (i80 == 27 || i80 == 49) {
                        i27 = i14 + 2;
                        objArr[androidx.camera.video.u.y(i70, 3, 2, 1)] = objArr2[i91];
                    } else if (i80 == 12 || i80 == 30 || i80 == 44) {
                        if (c1085c2.getSyntax() == z3 || (iCharAt11 & 2048) != 0) {
                            i27 = i14 + 2;
                            objArr[androidx.camera.video.u.y(i70, 3, 2, 1)] = objArr2[i91];
                        }
                    } else if (i80 == 50) {
                        int i92 = i69 + 1;
                        iArr[i69] = i70;
                        int i93 = (i70 / 3) * 2;
                        int i94 = i14 + 2;
                        objArr[i93] = objArr2[i91];
                        if ((iCharAt11 & 2048) != 0) {
                            objArr[i93 + 1] = objArr2[i94];
                            i27 = i14 + 3;
                        } else {
                            i27 = i94;
                        }
                        i69 = i92;
                    }
                    iObjectFieldOffset = (int) unsafe.objectFieldOffset(fieldE4);
                    if ((iCharAt11 & 4096) != 0 || i80 > 17) {
                        iObjectFieldOffset2 = 1048575;
                        i28 = i76;
                        i29 = 0;
                    } else {
                        int i95 = i76 + 1;
                        int iCharAt13 = str.charAt(i76);
                        if (iCharAt13 >= 55296) {
                            int i96 = iCharAt13 & 8191;
                            int i97 = 13;
                            while (true) {
                                i28 = i95 + 1;
                                cCharAt9 = str.charAt(i95);
                                if (cCharAt9 < 55296) {
                                    break;
                                }
                                i96 |= (cCharAt9 & 8191) << i97;
                                i97 += 13;
                                i95 = i28;
                            }
                            iCharAt13 = i96 | (cCharAt9 << i97);
                        } else {
                            i28 = i95;
                        }
                        int i98 = (iCharAt13 / 32) + (i81 * 2);
                        Object obj3 = objArr2[i98];
                        if (obj3 instanceof Field) {
                            fieldE = (Field) obj3;
                        } else {
                            fieldE = E(cls, (String) obj3);
                            objArr2[i98] = fieldE;
                        }
                        iObjectFieldOffset2 = (int) unsafe.objectFieldOffset(fieldE);
                        i29 = iCharAt13 % 32;
                    }
                    if (i80 >= 18 && i80 <= 49) {
                        iArr[i68] = iObjectFieldOffset;
                        i68++;
                    }
                }
                i27 = i91;
                iObjectFieldOffset = (int) unsafe.objectFieldOffset(fieldE4);
                if ((iCharAt11 & 4096) != 0) {
                    iObjectFieldOffset2 = 1048575;
                    i28 = i76;
                    i29 = 0;
                } else {
                    iObjectFieldOffset2 = 1048575;
                    i28 = i76;
                    i29 = 0;
                }
                if (i80 >= 18) {
                    iArr[i68] = iObjectFieldOffset;
                    i68++;
                }
            }
            int i99 = i70 + 1;
            iArr4[i70] = i77;
            int i100 = i70 + 2;
            String str2 = str;
            iArr4[i99] = ((iCharAt11 & IntBufferBatchMountItem.INSTRUCTION_UPDATE_EVENT_EMITTER) != 0 ? 268435456 : 0) | ((iCharAt11 & 512) != 0 ? 536870912 : 0) | ((iCharAt11 & 2048) != 0 ? Integer.MIN_VALUE : 0) | (i80 << 20) | iObjectFieldOffset;
            i70 += 3;
            iArr4[i100] = (i29 << 20) | iObjectFieldOffset2;
            i14 = i27;
            i12 = i81;
            length = i24;
            iArr3 = iArr4;
            str = str2;
            i67 = i26;
            i38 = i28;
            i36 = 55296;
        }
        return new O1(iArr3, objArr, i10, i13, c1085c2.f16592a, iArr, i15, i67, newInstanceSchema, listFieldSchema, r2Var, abstractC1096f1, mapFieldSchema);
    }

    public static long t(int i7) {
        return i7 & 1048575;
    }

    public static int u(Object obj, long j6) {
        return ((Integer) w2.f16802c.k(obj, j6)).intValue();
    }

    public static long v(Object obj, long j6) {
        return ((Long) w2.f16802c.k(obj, j6)).longValue();
    }

    public final void A(Object obj, long j6, Reader reader, Schema schema, C1092e1 c1092e1) throws IOException {
        reader.readGroupList(this.f16531l.mutableListAt(obj, j6), schema, c1092e1);
    }

    public final void B(Object obj, int i7, Reader reader, Schema schema, C1092e1 c1092e1) throws IOException {
        reader.readMessageList(this.f16531l.mutableListAt(obj, i7 & 1048575), schema, c1092e1);
    }

    public final void C(int i7, Reader reader, Object obj) {
        if ((536870912 & i7) != 0) {
            w2.p(obj, i7 & 1048575, reader.readStringRequireUtf8());
        } else if (this.f16526g) {
            w2.p(obj, i7 & 1048575, reader.readString());
        } else {
            w2.p(obj, i7 & 1048575, reader.readBytes());
        }
    }

    public final void D(int i7, Reader reader, Object obj) throws IOException {
        boolean z3 = (536870912 & i7) != 0;
        ListFieldSchema listFieldSchema = this.f16531l;
        if (z3) {
            reader.readStringListRequireUtf8(listFieldSchema.mutableListAt(obj, i7 & 1048575));
        } else {
            reader.readStringList(listFieldSchema.mutableListAt(obj, i7 & 1048575));
        }
    }

    public final void F(Object obj, int i7) {
        int i10 = this.f16520a[i7 + 2];
        long j6 = 1048575 & i10;
        if (j6 == 1048575) {
            return;
        }
        w2.n(obj, j6, (1 << (i10 >>> 20)) | w2.f16802c.i(obj, j6));
    }

    public final void G(Object obj, int i7, int i10) {
        w2.n(obj, this.f16520a[i10 + 2] & 1048575, i7);
    }

    public final int H(int i7, int i10) {
        int[] iArr = this.f16520a;
        int length = (iArr.length / 3) - 1;
        while (i10 <= length) {
            int i11 = (length + i10) >>> 1;
            int i12 = i11 * 3;
            int i13 = iArr[i12];
            if (i7 == i13) {
                return i12;
            }
            if (i7 < i13) {
                length = i11 - 1;
            } else {
                i10 = i11 + 1;
            }
        }
        return -1;
    }

    public final void I(Object obj, int i7, Object obj2) {
        f16519q.putObject(obj, L(i7) & 1048575, obj2);
        F(obj, i7);
    }

    public final void J(Object obj, int i7, int i10, Object obj2) {
        f16519q.putObject(obj, L(i10) & 1048575, obj2);
        G(obj, i7, i10);
    }

    public final int L(int i7) {
        return this.f16520a[i7 + 1];
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:7:0x002b  */
    public final void M(Object obj, Writer writer) throws IOException {
        Map.Entry entry;
        boolean z3;
        int i7;
        boolean z8;
        O1 o10 = this;
        boolean z10 = o10.f16525f;
        AbstractC1096f1 abstractC1096f1 = o10.f16533n;
        if (z10) {
            ((C1100g1) abstractC1096f1).getClass();
            C1122m1 c1122m1 = ((AbstractC1142t1) obj).extensions;
            if (c1122m1.f16696a.isEmpty()) {
                entry = null;
            } else {
                entry = (Map.Entry) c1122m1.h().next();
            }
        } else {
            entry = null;
        }
        int[] iArr = o10.f16520a;
        int length = iArr.length;
        Unsafe unsafe = f16519q;
        int i10 = 1048575;
        int i11 = 0;
        for (int i12 = 0; i12 < length; i12 += 3) {
            int iL = o10.L(i12);
            int i13 = iArr[i12];
            int iK = K(iL);
            if (iK <= 17) {
                int i14 = iArr[i12 + 2];
                z3 = true;
                int i15 = i14 & 1048575;
                if (i15 != i10) {
                    i11 = i15 == 1048575 ? 0 : unsafe.getInt(obj, i15);
                    i10 = i15;
                }
                i7 = 1 << (i14 >>> 20);
            } else {
                z3 = true;
                i7 = 0;
            }
            if (entry != null) {
                ((C1100g1) abstractC1096f1).getClass();
                androidx.camera.video.u.t(entry.getKey());
                throw null;
            }
            long j6 = iL & 1048575;
            switch (iK) {
                case 0:
                    if (o10.j(obj, i12, i10, i11, i7)) {
                        writer.writeDouble(i13, w2.f16802c.g(obj, j6));
                    }
                    break;
                case 1:
                    if (o10.j(obj, i12, i10, i11, i7)) {
                        writer.writeFloat(i13, w2.f16802c.h(obj, j6));
                    }
                    o10 = this;
                    break;
                case 2:
                    if (o10.j(obj, i12, i10, i11, i7)) {
                        writer.writeInt64(i13, unsafe.getLong(obj, j6));
                    }
                    o10 = this;
                    break;
                case 3:
                    if (o10.j(obj, i12, i10, i11, i7)) {
                        writer.writeUInt64(i13, unsafe.getLong(obj, j6));
                    }
                    o10 = this;
                    break;
                case 4:
                    if (o10.j(obj, i12, i10, i11, i7)) {
                        writer.writeInt32(i13, unsafe.getInt(obj, j6));
                    }
                    o10 = this;
                    break;
                case 5:
                    if (o10.j(obj, i12, i10, i11, i7)) {
                        writer.writeFixed64(i13, unsafe.getLong(obj, j6));
                    }
                    o10 = this;
                    break;
                case 6:
                    if (o10.j(obj, i12, i10, i11, i7)) {
                        writer.writeFixed32(i13, unsafe.getInt(obj, j6));
                    }
                    o10 = this;
                    break;
                case 7:
                    if (o10.j(obj, i12, i10, i11, i7)) {
                        writer.writeBool(i13, w2.f16802c.d(obj, j6));
                    }
                    o10 = this;
                    break;
                case 8:
                    if (o10.j(obj, i12, i10, i11, i7)) {
                        N(i13, unsafe.getObject(obj, j6), writer);
                    }
                    o10 = this;
                    break;
                case 9:
                    if (o10.j(obj, i12, i10, i11, i7)) {
                        writer.writeMessage(i13, unsafe.getObject(obj, j6), o10.g(i12));
                    }
                    break;
                case 10:
                    if (o10.j(obj, i12, i10, i11, i7)) {
                        writer.writeBytes(i13, (AbstractC1123n) unsafe.getObject(obj, j6));
                    }
                    o10 = this;
                    break;
                case 11:
                    if (o10.j(obj, i12, i10, i11, i7)) {
                        writer.writeUInt32(i13, unsafe.getInt(obj, j6));
                    }
                    o10 = this;
                    break;
                case 12:
                    if (o10.j(obj, i12, i10, i11, i7)) {
                        writer.writeEnum(i13, unsafe.getInt(obj, j6));
                    }
                    o10 = this;
                    break;
                case 13:
                    if (o10.j(obj, i12, i10, i11, i7)) {
                        writer.writeSFixed32(i13, unsafe.getInt(obj, j6));
                    }
                    o10 = this;
                    break;
                case 14:
                    if (o10.j(obj, i12, i10, i11, i7)) {
                        writer.writeSFixed64(i13, unsafe.getLong(obj, j6));
                    }
                    o10 = this;
                    break;
                case 15:
                    if (o10.j(obj, i12, i10, i11, i7)) {
                        writer.writeSInt32(i13, unsafe.getInt(obj, j6));
                    }
                    o10 = this;
                    break;
                case 16:
                    if (o10.j(obj, i12, i10, i11, i7)) {
                        writer.writeSInt64(i13, unsafe.getLong(obj, j6));
                    }
                    o10 = this;
                    break;
                case 17:
                    if (o10.j(obj, i12, i10, i11, i7)) {
                        writer.writeGroup(i13, unsafe.getObject(obj, j6), o10.g(i12));
                    }
                    break;
                case 18:
                    int i16 = iArr[i12];
                    List<Double> list = (List) unsafe.getObject(obj, j6);
                    Class cls = AbstractC1089d2.f16600a;
                    if (list == null || list.isEmpty()) {
                        z8 = false;
                    } else {
                        z8 = false;
                        writer.writeDoubleList(i16, list, false);
                    }
                    break;
                case 19:
                    int i17 = iArr[i12];
                    List<Float> list2 = (List) unsafe.getObject(obj, j6);
                    Class cls2 = AbstractC1089d2.f16600a;
                    if (list2 != null && !list2.isEmpty()) {
                        writer.writeFloatList(i17, list2, false);
                    }
                    break;
                case 20:
                    int i18 = iArr[i12];
                    List<Long> list3 = (List) unsafe.getObject(obj, j6);
                    Class cls3 = AbstractC1089d2.f16600a;
                    if (list3 != null && !list3.isEmpty()) {
                        writer.writeInt64List(i18, list3, false);
                    }
                    break;
                case 21:
                    int i19 = iArr[i12];
                    List<Long> list4 = (List) unsafe.getObject(obj, j6);
                    Class cls4 = AbstractC1089d2.f16600a;
                    if (list4 != null && !list4.isEmpty()) {
                        writer.writeUInt64List(i19, list4, false);
                    }
                    break;
                case 22:
                    int i20 = iArr[i12];
                    List<Integer> list5 = (List) unsafe.getObject(obj, j6);
                    Class cls5 = AbstractC1089d2.f16600a;
                    if (list5 != null && !list5.isEmpty()) {
                        writer.writeInt32List(i20, list5, false);
                    }
                    break;
                case 23:
                    int i21 = iArr[i12];
                    List<Long> list6 = (List) unsafe.getObject(obj, j6);
                    Class cls6 = AbstractC1089d2.f16600a;
                    if (list6 != null && !list6.isEmpty()) {
                        writer.writeFixed64List(i21, list6, false);
                    }
                    break;
                case 24:
                    int i22 = iArr[i12];
                    List<Integer> list7 = (List) unsafe.getObject(obj, j6);
                    Class cls7 = AbstractC1089d2.f16600a;
                    if (list7 != null && !list7.isEmpty()) {
                        writer.writeFixed32List(i22, list7, false);
                    }
                    break;
                case Service.MONITORED_RESOURCES_FIELD_NUMBER /* 25 */:
                    int i23 = iArr[i12];
                    List<Boolean> list8 = (List) unsafe.getObject(obj, j6);
                    Class cls8 = AbstractC1089d2.f16600a;
                    if (list8 != null && !list8.isEmpty()) {
                        writer.writeBoolList(i23, list8, false);
                    }
                    break;
                case 26:
                    int i24 = iArr[i12];
                    List<String> list9 = (List) unsafe.getObject(obj, j6);
                    Class cls9 = AbstractC1089d2.f16600a;
                    if (list9 != null && !list9.isEmpty()) {
                        writer.writeStringList(i24, list9);
                    }
                    break;
                case 27:
                    int i25 = iArr[i12];
                    List<?> list10 = (List) unsafe.getObject(obj, j6);
                    Schema schemaG = o10.g(i12);
                    Class cls10 = AbstractC1089d2.f16600a;
                    if (list10 != null && !list10.isEmpty()) {
                        writer.writeMessageList(i25, list10, schemaG);
                    }
                    break;
                case 28:
                    int i26 = iArr[i12];
                    List<AbstractC1123n> list11 = (List) unsafe.getObject(obj, j6);
                    Class cls11 = AbstractC1089d2.f16600a;
                    if (list11 != null && !list11.isEmpty()) {
                        writer.writeBytesList(i26, list11);
                    }
                    break;
                case 29:
                    int i27 = iArr[i12];
                    List<Integer> list12 = (List) unsafe.getObject(obj, j6);
                    Class cls12 = AbstractC1089d2.f16600a;
                    if (list12 != null && !list12.isEmpty()) {
                        writer.writeUInt32List(i27, list12, false);
                    }
                    break;
                case BillBusinessType.BUSINESS_TYPE_COMMERCE_RETAIL_TRADE_PAYMENTS /* 30 */:
                    int i28 = iArr[i12];
                    List<Integer> list13 = (List) unsafe.getObject(obj, j6);
                    Class cls13 = AbstractC1089d2.f16600a;
                    if (list13 != null && !list13.isEmpty()) {
                        writer.writeEnumList(i28, list13, false);
                    }
                    break;
                case 31:
                    int i29 = iArr[i12];
                    List<Integer> list14 = (List) unsafe.getObject(obj, j6);
                    Class cls14 = AbstractC1089d2.f16600a;
                    if (list14 != null && !list14.isEmpty()) {
                        writer.writeSFixed32List(i29, list14, false);
                    }
                    break;
                case 32:
                    int i30 = iArr[i12];
                    List<Long> list15 = (List) unsafe.getObject(obj, j6);
                    Class cls15 = AbstractC1089d2.f16600a;
                    if (list15 != null && !list15.isEmpty()) {
                        writer.writeSFixed64List(i30, list15, false);
                    }
                    break;
                case 33:
                    int i31 = iArr[i12];
                    List<Integer> list16 = (List) unsafe.getObject(obj, j6);
                    Class cls16 = AbstractC1089d2.f16600a;
                    if (list16 != null && !list16.isEmpty()) {
                        writer.writeSInt32List(i31, list16, false);
                    }
                    break;
                case 34:
                    int i32 = iArr[i12];
                    List<Long> list17 = (List) unsafe.getObject(obj, j6);
                    Class cls17 = AbstractC1089d2.f16600a;
                    if (list17 != null && !list17.isEmpty()) {
                        writer.writeSInt64List(i32, list17, false);
                    }
                    break;
                case 35:
                    int i33 = iArr[i12];
                    List<Double> list18 = (List) unsafe.getObject(obj, j6);
                    Class cls18 = AbstractC1089d2.f16600a;
                    if (list18 != null && !list18.isEmpty()) {
                        writer.writeDoubleList(i33, list18, true);
                    }
                    break;
                case 36:
                    int i34 = iArr[i12];
                    List<Float> list19 = (List) unsafe.getObject(obj, j6);
                    Class cls19 = AbstractC1089d2.f16600a;
                    if (list19 != null && !list19.isEmpty()) {
                        writer.writeFloatList(i34, list19, true);
                    }
                    break;
                case 37:
                    int i35 = iArr[i12];
                    List<Long> list20 = (List) unsafe.getObject(obj, j6);
                    Class cls20 = AbstractC1089d2.f16600a;
                    if (list20 != null && !list20.isEmpty()) {
                        writer.writeInt64List(i35, list20, true);
                    }
                    break;
                case BillBusinessType.BUSINESS_TYPE_TRIP /* 38 */:
                    int i36 = iArr[i12];
                    List<Long> list21 = (List) unsafe.getObject(obj, j6);
                    Class cls21 = AbstractC1089d2.f16600a;
                    if (list21 != null && !list21.isEmpty()) {
                        writer.writeUInt64List(i36, list21, true);
                    }
                    break;
                case 39:
                    int i37 = iArr[i12];
                    List<Integer> list22 = (List) unsafe.getObject(obj, j6);
                    Class cls22 = AbstractC1089d2.f16600a;
                    if (list22 != null && !list22.isEmpty()) {
                        writer.writeInt32List(i37, list22, true);
                    }
                    break;
                case 40:
                    int i38 = iArr[i12];
                    List<Long> list23 = (List) unsafe.getObject(obj, j6);
                    Class cls23 = AbstractC1089d2.f16600a;
                    if (list23 != null && !list23.isEmpty()) {
                        writer.writeFixed64List(i38, list23, true);
                    }
                    break;
                case 41:
                    int i39 = iArr[i12];
                    List<Integer> list24 = (List) unsafe.getObject(obj, j6);
                    Class cls24 = AbstractC1089d2.f16600a;
                    if (list24 != null && !list24.isEmpty()) {
                        writer.writeFixed32List(i39, list24, true);
                    }
                    break;
                case DescriptorProtos.FileOptions.PHP_GENERIC_SERVICES_FIELD_NUMBER /* 42 */:
                    int i40 = iArr[i12];
                    List<Boolean> list25 = (List) unsafe.getObject(obj, j6);
                    Class cls25 = AbstractC1089d2.f16600a;
                    if (list25 != null && !list25.isEmpty()) {
                        writer.writeBoolList(i40, list25, true);
                    }
                    break;
                case 43:
                    int i41 = iArr[i12];
                    List<Integer> list26 = (List) unsafe.getObject(obj, j6);
                    Class cls26 = AbstractC1089d2.f16600a;
                    if (list26 != null && !list26.isEmpty()) {
                        writer.writeUInt32List(i41, list26, true);
                    }
                    break;
                case 44:
                    int i42 = iArr[i12];
                    List<Integer> list27 = (List) unsafe.getObject(obj, j6);
                    Class cls27 = AbstractC1089d2.f16600a;
                    if (list27 != null && !list27.isEmpty()) {
                        writer.writeEnumList(i42, list27, true);
                    }
                    break;
                case 45:
                    int i43 = iArr[i12];
                    List<Integer> list28 = (List) unsafe.getObject(obj, j6);
                    Class cls28 = AbstractC1089d2.f16600a;
                    if (list28 != null && !list28.isEmpty()) {
                        writer.writeSFixed32List(i43, list28, true);
                    }
                    break;
                case 46:
                    int i44 = iArr[i12];
                    List<Long> list29 = (List) unsafe.getObject(obj, j6);
                    Class cls29 = AbstractC1089d2.f16600a;
                    if (list29 != null && !list29.isEmpty()) {
                        writer.writeSFixed64List(i44, list29, true);
                    }
                    break;
                case ShareDialog.SHARE_BUSINESS_TYPE_JUNE_INVITE_TASK /* 47 */:
                    int i45 = iArr[i12];
                    List<Integer> list30 = (List) unsafe.getObject(obj, j6);
                    Class cls30 = AbstractC1089d2.f16600a;
                    if (list30 != null && !list30.isEmpty()) {
                        writer.writeSInt32List(i45, list30, true);
                    }
                    break;
                case 48:
                    int i46 = iArr[i12];
                    List<Long> list31 = (List) unsafe.getObject(obj, j6);
                    Class cls31 = AbstractC1089d2.f16600a;
                    if (list31 != null && !list31.isEmpty()) {
                        writer.writeSInt64List(i46, list31, z3);
                    }
                    break;
                case NavigationBarView.ITEM_GRAVITY_TOP_CENTER /* 49 */:
                    int i47 = iArr[i12];
                    List<?> list32 = (List) unsafe.getObject(obj, j6);
                    Schema schemaG2 = o10.g(i12);
                    Class cls32 = AbstractC1089d2.f16600a;
                    if (list32 != null && !list32.isEmpty()) {
                        writer.writeGroupList(i47, list32, schemaG2);
                    }
                    break;
                case 50:
                    Object object = unsafe.getObject(obj, j6);
                    if (object != null) {
                        Object objF = o10.f(i12);
                        MapFieldSchema mapFieldSchema = o10.f16534o;
                        writer.writeMap(i13, mapFieldSchema.forMapMetadata(objF), mapFieldSchema.forMapData(object));
                    }
                    break;
                case 51:
                    if (o10.l(obj, i13, i12)) {
                        writer.writeDouble(i13, ((Double) w2.f16802c.k(obj, j6)).doubleValue());
                    }
                    break;
                case 52:
                    if (o10.l(obj, i13, i12)) {
                        writer.writeFloat(i13, ((Float) w2.f16802c.k(obj, j6)).floatValue());
                    }
                    break;
                case 53:
                    if (o10.l(obj, i13, i12)) {
                        writer.writeInt64(i13, v(obj, j6));
                    }
                    break;
                case 54:
                    if (o10.l(obj, i13, i12)) {
                        writer.writeUInt64(i13, v(obj, j6));
                    }
                    break;
                case 55:
                    if (o10.l(obj, i13, i12)) {
                        writer.writeInt32(i13, u(obj, j6));
                    }
                    break;
                case 56:
                    if (o10.l(obj, i13, i12)) {
                        writer.writeFixed64(i13, v(obj, j6));
                    }
                    break;
                case 57:
                    if (o10.l(obj, i13, i12)) {
                        writer.writeFixed32(i13, u(obj, j6));
                    }
                    break;
                case 58:
                    if (o10.l(obj, i13, i12)) {
                        writer.writeBool(i13, ((Boolean) w2.f16802c.k(obj, j6)).booleanValue());
                    }
                    break;
                case 59:
                    if (o10.l(obj, i13, i12)) {
                        N(i13, unsafe.getObject(obj, j6), writer);
                    }
                    break;
                case PictureConfig.MAX_PAGE_SIZE /* 60 */:
                    if (o10.l(obj, i13, i12)) {
                        writer.writeMessage(i13, unsafe.getObject(obj, j6), o10.g(i12));
                    }
                    break;
                case HomeMenuBean.BOTTOM_TAB_HOME /* 61 */:
                    if (o10.l(obj, i13, i12)) {
                        writer.writeBytes(i13, (AbstractC1123n) unsafe.getObject(obj, j6));
                    }
                    break;
                case HomeMenuBean.BOTTOM_TAB_ME /* 62 */:
                    if (o10.l(obj, i13, i12)) {
                        writer.writeUInt32(i13, u(obj, j6));
                    }
                    break;
                case HomeMenuBean.BOTTOM_TAB_FINANCE /* 63 */:
                    if (o10.l(obj, i13, i12)) {
                        writer.writeEnum(i13, u(obj, j6));
                    }
                    break;
                case 64:
                    if (o10.l(obj, i13, i12)) {
                        writer.writeSFixed32(i13, u(obj, j6));
                    }
                    break;
                case HomeMenuBean.BOTTOM_TAB_INVEST /* 65 */:
                    if (o10.l(obj, i13, i12)) {
                        writer.writeSFixed64(i13, v(obj, j6));
                    }
                    break;
                case HomeMenuBean.BOTTOM_TAB_GIVEAWAY /* 66 */:
                    if (o10.l(obj, i13, i12)) {
                        writer.writeSInt32(i13, u(obj, j6));
                    }
                    break;
                case 67:
                    if (o10.l(obj, i13, i12)) {
                        writer.writeSInt64(i13, v(obj, j6));
                    }
                    break;
                case 68:
                    if (o10.l(obj, i13, i12)) {
                        writer.writeGroup(i13, unsafe.getObject(obj, j6), o10.g(i12));
                    }
                    break;
                default:
                    break;
            }
        }
        if (entry != null) {
            ((C1100g1) abstractC1096f1).getClass();
            androidx.camera.video.u.t(entry.getKey());
            throw null;
        }
        o10.f16532m.getClass();
        ((AbstractC1145u1) obj).unknownFields.f(writer);
    }

    public final boolean a(Object obj, Object obj2, int i7) {
        return i(obj, i7) == i(obj2, i7);
    }

    public final Object d(Object obj, int i7, Object obj2, r2 r2Var, Object obj3) {
        Internal$EnumVerifier internal$EnumVerifierE;
        int i10 = this.f16520a[i7];
        Object objK = w2.f16802c.k(obj, L(i7) & 1048575);
        if (objK == null || (internal$EnumVerifierE = e(i7)) == null) {
            return obj2;
        }
        MapFieldSchema mapFieldSchema = this.f16534o;
        Map<?, ?> mapForMutableMapData = mapFieldSchema.forMutableMapData(objK);
        I1 i1ForMapMetadata = mapFieldSchema.forMapMetadata(f(i7));
        Iterator<Map.Entry<?, ?>> it = mapForMutableMapData.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry<?, ?> next = it.next();
            if (!internal$EnumVerifierE.isInRange(((Integer) next.getValue()).intValue())) {
                if (obj2 == null) {
                    r2Var.getClass();
                    obj2 = r2.a(obj3);
                }
                int iA = J1.a(i1ForMapMetadata, next.getKey(), next.getValue());
                byte[] bArr = new byte[iA];
                Logger logger = AbstractC1146v.f16784b;
                C1140t c1140t = new C1140t(bArr, iA);
                try {
                    Object key = next.getKey();
                    Object value = next.getValue();
                    C1122m1.m(c1140t, i1ForMapMetadata.f16495a, 1, key);
                    C1122m1.m(c1140t, i1ForMapMetadata.f16496b, 2, value);
                    if (c1140t.d0() != 0) {
                        throw new IllegalStateException("Did not write as much data as expected.");
                    }
                    C1120m c1120m = new C1120m(bArr);
                    r2Var.getClass();
                    ((q2) obj2).d((i10 << 3) | 2, c1120m);
                    it.remove();
                } catch (IOException e10) {
                    throw new RuntimeException(e10);
                }
            }
        }
        return obj2;
    }

    public final Internal$EnumVerifier e(int i7) {
        return (Internal$EnumVerifier) this.f16521b[androidx.camera.video.u.y(i7, 3, 2, 1)];
    }

    /* JADX WARN: Code duplicated, block: B:13:0x003d  */
    @Override // androidx.datastore.preferences.protobuf.Schema
    public final boolean equals(Object obj, Object obj2) {
        int[] iArr = this.f16520a;
        int length = iArr.length;
        int i7 = 0;
        while (true) {
            boolean zM = true;
            if (i7 < length) {
                int iL = L(i7);
                long j6 = iL & 1048575;
                switch (K(iL)) {
                    case 0:
                        if (!a(obj, obj2, i7)) {
                            zM = false;
                        } else {
                            v2 v2Var = w2.f16802c;
                            if (Double.doubleToLongBits(v2Var.g(obj, j6)) != Double.doubleToLongBits(v2Var.g(obj2, j6))) {
                                zM = false;
                            }
                        }
                        break;
                    case 1:
                        if (!a(obj, obj2, i7)) {
                            zM = false;
                        } else {
                            v2 v2Var2 = w2.f16802c;
                            if (Float.floatToIntBits(v2Var2.h(obj, j6)) != Float.floatToIntBits(v2Var2.h(obj2, j6))) {
                                zM = false;
                            }
                        }
                        break;
                    case 2:
                        if (!a(obj, obj2, i7)) {
                            zM = false;
                        } else {
                            v2 v2Var3 = w2.f16802c;
                            if (v2Var3.j(obj, j6) != v2Var3.j(obj2, j6)) {
                                zM = false;
                            }
                        }
                        break;
                    case 3:
                        if (!a(obj, obj2, i7)) {
                            zM = false;
                        } else {
                            v2 v2Var4 = w2.f16802c;
                            if (v2Var4.j(obj, j6) != v2Var4.j(obj2, j6)) {
                                zM = false;
                            }
                        }
                        break;
                    case 4:
                        if (!a(obj, obj2, i7)) {
                            zM = false;
                        } else {
                            v2 v2Var5 = w2.f16802c;
                            if (v2Var5.i(obj, j6) != v2Var5.i(obj2, j6)) {
                                zM = false;
                            }
                        }
                        break;
                    case 5:
                        if (!a(obj, obj2, i7)) {
                            zM = false;
                        } else {
                            v2 v2Var6 = w2.f16802c;
                            if (v2Var6.j(obj, j6) != v2Var6.j(obj2, j6)) {
                                zM = false;
                            }
                        }
                        break;
                    case 6:
                        if (!a(obj, obj2, i7)) {
                            zM = false;
                        } else {
                            v2 v2Var7 = w2.f16802c;
                            if (v2Var7.i(obj, j6) != v2Var7.i(obj2, j6)) {
                                zM = false;
                            }
                        }
                        break;
                    case 7:
                        if (!a(obj, obj2, i7)) {
                            zM = false;
                        } else {
                            v2 v2Var8 = w2.f16802c;
                            if (v2Var8.d(obj, j6) != v2Var8.d(obj2, j6)) {
                                zM = false;
                            }
                        }
                        break;
                    case 8:
                        if (!a(obj, obj2, i7)) {
                            zM = false;
                        } else {
                            v2 v2Var9 = w2.f16802c;
                            if (!AbstractC1089d2.m(v2Var9.k(obj, j6), v2Var9.k(obj2, j6))) {
                                zM = false;
                            }
                        }
                        break;
                    case 9:
                        if (!a(obj, obj2, i7)) {
                            zM = false;
                        } else {
                            v2 v2Var10 = w2.f16802c;
                            if (!AbstractC1089d2.m(v2Var10.k(obj, j6), v2Var10.k(obj2, j6))) {
                                zM = false;
                            }
                        }
                        break;
                    case 10:
                        if (!a(obj, obj2, i7)) {
                            zM = false;
                        } else {
                            v2 v2Var11 = w2.f16802c;
                            if (!AbstractC1089d2.m(v2Var11.k(obj, j6), v2Var11.k(obj2, j6))) {
                                zM = false;
                            }
                        }
                        break;
                    case 11:
                        if (!a(obj, obj2, i7)) {
                            zM = false;
                        } else {
                            v2 v2Var12 = w2.f16802c;
                            if (v2Var12.i(obj, j6) != v2Var12.i(obj2, j6)) {
                                zM = false;
                            }
                        }
                        break;
                    case 12:
                        if (!a(obj, obj2, i7)) {
                            zM = false;
                        } else {
                            v2 v2Var13 = w2.f16802c;
                            if (v2Var13.i(obj, j6) != v2Var13.i(obj2, j6)) {
                                zM = false;
                            }
                        }
                        break;
                    case 13:
                        if (!a(obj, obj2, i7)) {
                            zM = false;
                        } else {
                            v2 v2Var14 = w2.f16802c;
                            if (v2Var14.i(obj, j6) != v2Var14.i(obj2, j6)) {
                                zM = false;
                            }
                        }
                        break;
                    case 14:
                        if (!a(obj, obj2, i7)) {
                            zM = false;
                        } else {
                            v2 v2Var15 = w2.f16802c;
                            if (v2Var15.j(obj, j6) != v2Var15.j(obj2, j6)) {
                                zM = false;
                            }
                        }
                        break;
                    case 15:
                        if (!a(obj, obj2, i7)) {
                            zM = false;
                        } else {
                            v2 v2Var16 = w2.f16802c;
                            if (v2Var16.i(obj, j6) != v2Var16.i(obj2, j6)) {
                                zM = false;
                            }
                        }
                        break;
                    case 16:
                        if (!a(obj, obj2, i7)) {
                            zM = false;
                        } else {
                            v2 v2Var17 = w2.f16802c;
                            if (v2Var17.j(obj, j6) != v2Var17.j(obj2, j6)) {
                                zM = false;
                            }
                        }
                        break;
                    case 17:
                        if (!a(obj, obj2, i7)) {
                            zM = false;
                        } else {
                            v2 v2Var18 = w2.f16802c;
                            if (!AbstractC1089d2.m(v2Var18.k(obj, j6), v2Var18.k(obj2, j6))) {
                                zM = false;
                            }
                        }
                        break;
                    case 18:
                    case 19:
                    case 20:
                    case 21:
                    case 22:
                    case 23:
                    case 24:
                    case Service.MONITORED_RESOURCES_FIELD_NUMBER /* 25 */:
                    case 26:
                    case 27:
                    case 28:
                    case 29:
                    case BillBusinessType.BUSINESS_TYPE_COMMERCE_RETAIL_TRADE_PAYMENTS /* 30 */:
                    case 31:
                    case 32:
                    case 33:
                    case 34:
                    case 35:
                    case 36:
                    case 37:
                    case BillBusinessType.BUSINESS_TYPE_TRIP /* 38 */:
                    case 39:
                    case 40:
                    case 41:
                    case DescriptorProtos.FileOptions.PHP_GENERIC_SERVICES_FIELD_NUMBER /* 42 */:
                    case 43:
                    case 44:
                    case 45:
                    case 46:
                    case ShareDialog.SHARE_BUSINESS_TYPE_JUNE_INVITE_TASK /* 47 */:
                    case 48:
                    case NavigationBarView.ITEM_GRAVITY_TOP_CENTER /* 49 */:
                        v2 v2Var19 = w2.f16802c;
                        zM = AbstractC1089d2.m(v2Var19.k(obj, j6), v2Var19.k(obj2, j6));
                        break;
                    case 50:
                        v2 v2Var20 = w2.f16802c;
                        zM = AbstractC1089d2.m(v2Var20.k(obj, j6), v2Var20.k(obj2, j6));
                        break;
                    case 51:
                    case 52:
                    case 53:
                    case 54:
                    case 55:
                    case 56:
                    case 57:
                    case 58:
                    case 59:
                    case PictureConfig.MAX_PAGE_SIZE /* 60 */:
                    case HomeMenuBean.BOTTOM_TAB_HOME /* 61 */:
                    case HomeMenuBean.BOTTOM_TAB_ME /* 62 */:
                    case HomeMenuBean.BOTTOM_TAB_FINANCE /* 63 */:
                    case 64:
                    case HomeMenuBean.BOTTOM_TAB_INVEST /* 65 */:
                    case HomeMenuBean.BOTTOM_TAB_GIVEAWAY /* 66 */:
                    case 67:
                    case 68:
                        long j10 = iArr[i7 + 2] & 1048575;
                        v2 v2Var21 = w2.f16802c;
                        if (v2Var21.i(obj, j10) != v2Var21.i(obj2, j10) || !AbstractC1089d2.m(v2Var21.k(obj, j6), v2Var21.k(obj2, j6))) {
                            zM = false;
                        }
                        break;
                }
                if (zM) {
                    i7 += 3;
                }
            } else {
                this.f16532m.getClass();
                if (((AbstractC1145u1) obj).unknownFields.equals(((AbstractC1145u1) obj2).unknownFields)) {
                    if (!this.f16525f) {
                        return true;
                    }
                    C1100g1 c1100g1 = (C1100g1) this.f16533n;
                    c1100g1.getClass();
                    C1122m1 c1122m1 = ((AbstractC1142t1) obj).extensions;
                    c1100g1.getClass();
                    return c1122m1.equals(((AbstractC1142t1) obj2).extensions);
                }
            }
        }
        return false;
    }

    public final Object f(int i7) {
        return this.f16521b[(i7 / 3) * 2];
    }

    public final Schema g(int i7) {
        int i10 = (i7 / 3) * 2;
        Object[] objArr = this.f16521b;
        Schema schema = (Schema) objArr[i10];
        if (schema != null) {
            return schema;
        }
        Schema schemaA = C1077a2.f16579c.a((Class) objArr[i10 + 1]);
        objArr[i10] = schemaA;
        return schemaA;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:138:0x036e A[PHI: r18
      0x036e: PHI (r18v45 int) = 
      (r18v28 int)
      (r18v29 int)
      (r18v30 int)
      (r18v34 int)
      (r18v36 int)
      (r18v37 int)
      (r18v38 int)
      (r18v42 int)
      (r18v46 int)
     binds: [B:208:0x0520, B:204:0x0504, B:200:0x04e8, B:172:0x0457, B:158:0x03f5, B:154:0x03db, B:150:0x03c1, B:143:0x038b, B:137:0x036c] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // androidx.datastore.preferences.protobuf.Schema
    public final int getSerializedSize(Object obj) {
        int i7;
        int i10;
        int iC;
        int iC2;
        int iE;
        int iC3;
        int iE2;
        int iC4;
        int iC5;
        int iB;
        int iC6;
        int size;
        int i11;
        int iC7;
        int iC8;
        int size2;
        int iC9;
        int iD;
        int iB2;
        int iC10;
        int iC11;
        int iC12;
        int iE3;
        int iC13;
        int iE4;
        int iC14;
        int iD2;
        O1 o10 = this;
        int i12 = 1;
        Unsafe unsafe = f16519q;
        int i13 = 0;
        int i14 = 0;
        int iC15 = 0;
        int i15 = 1048575;
        while (true) {
            int[] iArr = o10.f16520a;
            if (i13 >= iArr.length) {
                o10.f16532m.getClass();
                int iB3 = ((AbstractC1145u1) obj).unknownFields.b() + iC15;
                if (!o10.f16525f) {
                    return iB3;
                }
                ((C1100g1) o10.f16533n).getClass();
                C1093e2 c1093e2 = ((AbstractC1142t1) obj).extensions.f16696a;
                int size3 = c1093e2.f16607a.size();
                int iD3 = 0;
                for (int i16 = 0; i16 < size3; i16++) {
                    Map.Entry entryC = c1093e2.c(i16);
                    iD3 += C1122m1.d((FieldSet$FieldDescriptorLite) entryC.getKey(), entryC.getValue());
                }
                for (Map.Entry entry : c1093e2.d()) {
                    iD3 += C1122m1.d((FieldSet$FieldDescriptorLite) entry.getKey(), entry.getValue());
                }
                return iB3 + iD3;
            }
            int iL = o10.L(i13);
            int iK = K(iL);
            int i17 = iArr[i13];
            int i18 = iArr[i13 + 2];
            int i19 = i18 & 1048575;
            if (iK <= 17) {
                if (i19 != i15) {
                    i14 = i19 == 1048575 ? 0 : unsafe.getInt(obj, i19);
                    i15 = i19;
                }
                i7 = i12 << (i18 >>> 20);
            } else {
                i7 = 0;
            }
            long j6 = iL & 1048575;
            if (iK >= EnumC1125n1.f16702b.f16707a) {
                int i20 = EnumC1125n1.f16703c.f16707a;
            }
            switch (iK) {
                case 0:
                    i10 = i12;
                    if (o10.j(obj, i13, i15, i14, i7)) {
                        iC15 += AbstractC1146v.C(i17) + 8;
                    }
                    break;
                case 1:
                    i10 = i12;
                    if (o10.j(obj, i13, i15, i14, i7)) {
                        iC = AbstractC1146v.C(i17);
                        iC5 = iC + 4;
                        iC15 += iC5;
                    }
                    o10 = this;
                    break;
                case 2:
                    i10 = i12;
                    if (o10.j(obj, i13, i15, i14, i7)) {
                        long j10 = unsafe.getLong(obj, j6);
                        iC2 = AbstractC1146v.C(i17);
                        iE = AbstractC1146v.E(j10);
                        iC15 += iE + iC2;
                    }
                    o10 = this;
                    break;
                case 3:
                    i10 = i12;
                    if (o10.j(obj, i13, i15, i14, i7)) {
                        long j11 = unsafe.getLong(obj, j6);
                        iC2 = AbstractC1146v.C(i17);
                        iE = AbstractC1146v.E(j11);
                        iC15 += iE + iC2;
                    }
                    o10 = this;
                    break;
                case 4:
                    i10 = i12;
                    if (o10.j(obj, i13, i15, i14, i7)) {
                        int i21 = unsafe.getInt(obj, j6);
                        iC3 = AbstractC1146v.C(i17);
                        iE2 = AbstractC1146v.E(i21);
                        iC5 = iE2 + iC3;
                        iC15 += iC5;
                    }
                    o10 = this;
                    break;
                case 5:
                    i10 = i12;
                    if (o10.j(obj, i13, i15, i14, i7)) {
                        iC4 = AbstractC1146v.C(i17);
                        iC5 = iC4 + 8;
                        iC15 += iC5;
                    }
                    o10 = this;
                    break;
                case 6:
                    i10 = i12;
                    if (o10.j(obj, i13, i15, i14, i7)) {
                        iC = AbstractC1146v.C(i17);
                        iC5 = iC + 4;
                        iC15 += iC5;
                    }
                    o10 = this;
                    break;
                case 7:
                    i10 = i12;
                    if (o10.j(obj, i13, i15, i14, i7)) {
                        iC5 = AbstractC1146v.C(i17) + 1;
                        iC15 += iC5;
                    }
                    o10 = this;
                    break;
                case 8:
                    i10 = i12;
                    if (o10.j(obj, i13, i15, i14, i7)) {
                        Object object = unsafe.getObject(obj, j6);
                        iC15 = (object instanceof AbstractC1123n ? AbstractC1146v.x(i17, (AbstractC1123n) object) : AbstractC1146v.B((String) object) + AbstractC1146v.C(i17)) + iC15;
                    }
                    o10 = this;
                    break;
                case 9:
                    i10 = i12;
                    if (o10.j(obj, i13, i15, i14, i7)) {
                        Object object2 = unsafe.getObject(obj, j6);
                        Schema schemaG = o10.g(i13);
                        Class cls = AbstractC1089d2.f16600a;
                        int iC16 = AbstractC1146v.C(i17);
                        int iB4 = ((AbstractC1078b) ((MessageLite) object2)).b(schemaG);
                        iC15 += AbstractC1146v.D(iB4) + iB4 + iC16;
                    }
                    break;
                case 10:
                    i10 = i12;
                    if (o10.j(obj, i13, i15, i14, i7)) {
                        iC5 = AbstractC1146v.x(i17, (AbstractC1123n) unsafe.getObject(obj, j6));
                        iC15 += iC5;
                    }
                    o10 = this;
                    break;
                case 11:
                    i10 = i12;
                    if (o10.j(obj, i13, i15, i14, i7)) {
                        int i22 = unsafe.getInt(obj, j6);
                        iC3 = AbstractC1146v.C(i17);
                        iE2 = AbstractC1146v.D(i22);
                        iC5 = iE2 + iC3;
                        iC15 += iC5;
                    }
                    o10 = this;
                    break;
                case 12:
                    i10 = i12;
                    if (o10.j(obj, i13, i15, i14, i7)) {
                        int i23 = unsafe.getInt(obj, j6);
                        iC3 = AbstractC1146v.C(i17);
                        iE2 = AbstractC1146v.E(i23);
                        iC5 = iE2 + iC3;
                        iC15 += iC5;
                    }
                    o10 = this;
                    break;
                case 13:
                    i10 = i12;
                    if (o10.j(obj, i13, i15, i14, i7)) {
                        iC = AbstractC1146v.C(i17);
                        iC5 = iC + 4;
                        iC15 += iC5;
                    }
                    o10 = this;
                    break;
                case 14:
                    i10 = i12;
                    if (o10.j(obj, i13, i15, i14, i7)) {
                        iC4 = AbstractC1146v.C(i17);
                        iC5 = iC4 + 8;
                        iC15 += iC5;
                    }
                    o10 = this;
                    break;
                case 15:
                    i10 = i12;
                    if (o10.j(obj, i13, i15, i14, i7)) {
                        int i24 = unsafe.getInt(obj, j6);
                        iC3 = AbstractC1146v.C(i17);
                        iE2 = AbstractC1146v.z(i24);
                        iC5 = iE2 + iC3;
                        iC15 += iC5;
                    }
                    o10 = this;
                    break;
                case 16:
                    i10 = i12;
                    if (o10.j(obj, i13, i15, i14, i7)) {
                        long j12 = unsafe.getLong(obj, j6);
                        iC2 = AbstractC1146v.C(i17);
                        iE = AbstractC1146v.A(j12);
                        iC15 += iE + iC2;
                    }
                    o10 = this;
                    break;
                case 17:
                    i10 = i12;
                    if (o10.j(obj, i13, i15, i14, i7)) {
                        iB = ((AbstractC1078b) ((MessageLite) unsafe.getObject(obj, j6))).b(o10.g(i13)) + (AbstractC1146v.C(i17) * 2);
                        iC15 += iB;
                    }
                    break;
                case 18:
                    i10 = i12;
                    iB = AbstractC1089d2.c(i17, (List) unsafe.getObject(obj, j6));
                    iC15 += iB;
                    break;
                case 19:
                    i10 = i12;
                    iB = AbstractC1089d2.b(i17, (List) unsafe.getObject(obj, j6));
                    iC15 += iB;
                    break;
                case 20:
                    i10 = i12;
                    List list = (List) unsafe.getObject(obj, j6);
                    Class cls2 = AbstractC1089d2.f16600a;
                    if (list.size() == 0) {
                        iC6 = 0;
                    } else {
                        iC6 = (AbstractC1146v.C(i17) * list.size()) + AbstractC1089d2.e(list);
                    }
                    iC15 += iC6;
                    break;
                case 21:
                    i10 = i12;
                    List list2 = (List) unsafe.getObject(obj, j6);
                    Class cls3 = AbstractC1089d2.f16600a;
                    size = list2.size();
                    if (size == 0) {
                        iC6 = 0;
                    } else {
                        i11 = AbstractC1089d2.i(list2);
                        iC7 = AbstractC1146v.C(i17);
                        iC6 = (iC7 * size) + i11;
                    }
                    iC15 += iC6;
                    break;
                case 22:
                    i10 = i12;
                    List list3 = (List) unsafe.getObject(obj, j6);
                    Class cls4 = AbstractC1089d2.f16600a;
                    size = list3.size();
                    if (size == 0) {
                        iC6 = 0;
                    } else {
                        i11 = AbstractC1089d2.d(list3);
                        iC7 = AbstractC1146v.C(i17);
                        iC6 = (iC7 * size) + i11;
                    }
                    iC15 += iC6;
                    break;
                case 23:
                    i10 = i12;
                    iB = AbstractC1089d2.c(i17, (List) unsafe.getObject(obj, j6));
                    iC15 += iB;
                    break;
                case 24:
                    i10 = i12;
                    iB = AbstractC1089d2.b(i17, (List) unsafe.getObject(obj, j6));
                    iC15 += iB;
                    break;
                case Service.MONITORED_RESOURCES_FIELD_NUMBER /* 25 */:
                    i10 = i12;
                    List list4 = (List) unsafe.getObject(obj, j6);
                    Class cls5 = AbstractC1089d2.f16600a;
                    int size4 = list4.size();
                    iC15 += size4 == 0 ? 0 : (AbstractC1146v.C(i17) + 1) * size4;
                    break;
                case 26:
                    i10 = i12;
                    List list5 = (List) unsafe.getObject(obj, j6);
                    Class cls6 = AbstractC1089d2.f16600a;
                    int size5 = list5.size();
                    if (size5 == 0) {
                        iC6 = 0;
                    } else {
                        iC6 = AbstractC1146v.C(i17) * size5;
                        if (list5 instanceof LazyStringList) {
                            LazyStringList lazyStringList = (LazyStringList) list5;
                            for (int i25 = 0; i25 < size5; i25++) {
                                Object raw = lazyStringList.getRaw(i25);
                                iC6 = (raw instanceof AbstractC1123n ? AbstractC1146v.y((AbstractC1123n) raw) : AbstractC1146v.B((String) raw)) + iC6;
                            }
                        } else {
                            for (int i26 = 0; i26 < size5; i26++) {
                                Object obj2 = list5.get(i26);
                                iC6 = (obj2 instanceof AbstractC1123n ? AbstractC1146v.y((AbstractC1123n) obj2) : AbstractC1146v.B((String) obj2)) + iC6;
                            }
                        }
                    }
                    iC15 += iC6;
                    break;
                case 27:
                    i10 = i12;
                    List list6 = (List) unsafe.getObject(obj, j6);
                    Schema schemaG2 = o10.g(i13);
                    Class cls7 = AbstractC1089d2.f16600a;
                    int size6 = list6.size();
                    if (size6 == 0) {
                        iC8 = 0;
                    } else {
                        iC8 = AbstractC1146v.C(i17) * size6;
                        for (int i27 = 0; i27 < size6; i27++) {
                            int iB5 = ((AbstractC1078b) ((MessageLite) list6.get(i27))).b(schemaG2);
                            iC8 += AbstractC1146v.D(iB5) + iB5;
                        }
                    }
                    iC15 += iC8;
                    break;
                case 28:
                    i10 = i12;
                    List list7 = (List) unsafe.getObject(obj, j6);
                    Class cls8 = AbstractC1089d2.f16600a;
                    int size7 = list7.size();
                    if (size7 == 0) {
                        iC6 = 0;
                    } else {
                        iC6 = AbstractC1146v.C(i17) * size7;
                        for (int i28 = 0; i28 < list7.size(); i28++) {
                            iC6 += AbstractC1146v.y((AbstractC1123n) list7.get(i28));
                        }
                    }
                    iC15 += iC6;
                    break;
                case 29:
                    i10 = i12;
                    List list8 = (List) unsafe.getObject(obj, j6);
                    Class cls9 = AbstractC1089d2.f16600a;
                    size = list8.size();
                    if (size == 0) {
                        iC6 = 0;
                    } else {
                        i11 = AbstractC1089d2.h(list8);
                        iC7 = AbstractC1146v.C(i17);
                        iC6 = (iC7 * size) + i11;
                    }
                    iC15 += iC6;
                    break;
                case BillBusinessType.BUSINESS_TYPE_COMMERCE_RETAIL_TRADE_PAYMENTS /* 30 */:
                    i10 = i12;
                    List list9 = (List) unsafe.getObject(obj, j6);
                    Class cls10 = AbstractC1089d2.f16600a;
                    size = list9.size();
                    if (size == 0) {
                        iC6 = 0;
                    } else {
                        i11 = AbstractC1089d2.a(list9);
                        iC7 = AbstractC1146v.C(i17);
                        iC6 = (iC7 * size) + i11;
                    }
                    iC15 += iC6;
                    break;
                case 31:
                    i10 = i12;
                    iB = AbstractC1089d2.b(i17, (List) unsafe.getObject(obj, j6));
                    iC15 += iB;
                    break;
                case 32:
                    i10 = i12;
                    iB = AbstractC1089d2.c(i17, (List) unsafe.getObject(obj, j6));
                    iC15 += iB;
                    break;
                case 33:
                    i10 = i12;
                    List list10 = (List) unsafe.getObject(obj, j6);
                    Class cls11 = AbstractC1089d2.f16600a;
                    size = list10.size();
                    if (size == 0) {
                        iC6 = 0;
                    } else {
                        i11 = AbstractC1089d2.f(list10);
                        iC7 = AbstractC1146v.C(i17);
                        iC6 = (iC7 * size) + i11;
                    }
                    iC15 += iC6;
                    break;
                case 34:
                    i10 = i12;
                    List list11 = (List) unsafe.getObject(obj, j6);
                    Class cls12 = AbstractC1089d2.f16600a;
                    size = list11.size();
                    if (size == 0) {
                        iC6 = 0;
                    } else {
                        i11 = AbstractC1089d2.g(list11);
                        iC7 = AbstractC1146v.C(i17);
                        iC6 = (iC7 * size) + i11;
                    }
                    iC15 += iC6;
                    break;
                case 35:
                    i10 = i12;
                    List list12 = (List) unsafe.getObject(obj, j6);
                    Class cls13 = AbstractC1089d2.f16600a;
                    size2 = list12.size() * 8;
                    if (size2 > 0) {
                        iC9 = AbstractC1146v.C(i17);
                        iD = AbstractC1146v.D(size2);
                        iC15 += iD + iC9 + size2;
                    }
                    break;
                case 36:
                    i10 = i12;
                    List list13 = (List) unsafe.getObject(obj, j6);
                    Class cls14 = AbstractC1089d2.f16600a;
                    size2 = list13.size() * 4;
                    if (size2 > 0) {
                        iC9 = AbstractC1146v.C(i17);
                        iD = AbstractC1146v.D(size2);
                        iC15 += iD + iC9 + size2;
                    }
                    break;
                case 37:
                    i10 = i12;
                    size2 = AbstractC1089d2.e((List) unsafe.getObject(obj, j6));
                    if (size2 > 0) {
                        iC9 = AbstractC1146v.C(i17);
                        iD = AbstractC1146v.D(size2);
                        iC15 += iD + iC9 + size2;
                    }
                    break;
                case BillBusinessType.BUSINESS_TYPE_TRIP /* 38 */:
                    i10 = i12;
                    size2 = AbstractC1089d2.i((List) unsafe.getObject(obj, j6));
                    if (size2 > 0) {
                        iC9 = AbstractC1146v.C(i17);
                        iD = AbstractC1146v.D(size2);
                        iC15 += iD + iC9 + size2;
                    }
                    break;
                case 39:
                    i10 = i12;
                    size2 = AbstractC1089d2.d((List) unsafe.getObject(obj, j6));
                    if (size2 > 0) {
                        iC9 = AbstractC1146v.C(i17);
                        iD = AbstractC1146v.D(size2);
                        iC15 += iD + iC9 + size2;
                    }
                    break;
                case 40:
                    i10 = i12;
                    List list14 = (List) unsafe.getObject(obj, j6);
                    Class cls15 = AbstractC1089d2.f16600a;
                    size2 = list14.size() * 8;
                    if (size2 > 0) {
                        iC9 = AbstractC1146v.C(i17);
                        iD = AbstractC1146v.D(size2);
                        iC15 += iD + iC9 + size2;
                    }
                    break;
                case 41:
                    i10 = i12;
                    List list15 = (List) unsafe.getObject(obj, j6);
                    Class cls16 = AbstractC1089d2.f16600a;
                    size2 = list15.size() * 4;
                    if (size2 > 0) {
                        iC9 = AbstractC1146v.C(i17);
                        iD = AbstractC1146v.D(size2);
                        iC15 += iD + iC9 + size2;
                    }
                    break;
                case DescriptorProtos.FileOptions.PHP_GENERIC_SERVICES_FIELD_NUMBER /* 42 */:
                    i10 = i12;
                    List list16 = (List) unsafe.getObject(obj, j6);
                    Class cls17 = AbstractC1089d2.f16600a;
                    size2 = list16.size();
                    if (size2 > 0) {
                        iC9 = AbstractC1146v.C(i17);
                        iD = AbstractC1146v.D(size2);
                        iC15 += iD + iC9 + size2;
                    }
                    break;
                case 43:
                    i10 = i12;
                    size2 = AbstractC1089d2.h((List) unsafe.getObject(obj, j6));
                    if (size2 > 0) {
                        iC9 = AbstractC1146v.C(i17);
                        iD = AbstractC1146v.D(size2);
                        iC15 += iD + iC9 + size2;
                    }
                    break;
                case 44:
                    i10 = i12;
                    size2 = AbstractC1089d2.a((List) unsafe.getObject(obj, j6));
                    if (size2 > 0) {
                        iC9 = AbstractC1146v.C(i17);
                        iD = AbstractC1146v.D(size2);
                        iC15 += iD + iC9 + size2;
                    }
                    break;
                case 45:
                    i10 = i12;
                    List list17 = (List) unsafe.getObject(obj, j6);
                    Class cls18 = AbstractC1089d2.f16600a;
                    size2 = list17.size() * 4;
                    if (size2 > 0) {
                        iC9 = AbstractC1146v.C(i17);
                        iD = AbstractC1146v.D(size2);
                        iC15 += iD + iC9 + size2;
                    }
                    break;
                case 46:
                    i10 = i12;
                    List list18 = (List) unsafe.getObject(obj, j6);
                    Class cls19 = AbstractC1089d2.f16600a;
                    size2 = list18.size() * 8;
                    if (size2 > 0) {
                        iC9 = AbstractC1146v.C(i17);
                        iD = AbstractC1146v.D(size2);
                        iC15 += iD + iC9 + size2;
                    }
                    break;
                case ShareDialog.SHARE_BUSINESS_TYPE_JUNE_INVITE_TASK /* 47 */:
                    i10 = i12;
                    size2 = AbstractC1089d2.f((List) unsafe.getObject(obj, j6));
                    if (size2 > 0) {
                        iC9 = AbstractC1146v.C(i17);
                        iD = AbstractC1146v.D(size2);
                        iC15 += iD + iC9 + size2;
                    }
                    break;
                case 48:
                    i10 = i12;
                    size2 = AbstractC1089d2.g((List) unsafe.getObject(obj, j6));
                    if (size2 > 0) {
                        iC9 = AbstractC1146v.C(i17);
                        iD = AbstractC1146v.D(size2);
                        iC15 += iD + iC9 + size2;
                    }
                    break;
                case NavigationBarView.ITEM_GRAVITY_TOP_CENTER /* 49 */:
                    List list19 = (List) unsafe.getObject(obj, j6);
                    Schema schemaG3 = o10.g(i13);
                    Class cls20 = AbstractC1089d2.f16600a;
                    int size8 = list19.size();
                    if (size8 == 0) {
                        iB2 = 0;
                    } else {
                        int i29 = 0;
                        iB2 = 0;
                        while (i29 < size8) {
                            iB2 += ((AbstractC1078b) ((MessageLite) list19.get(i29))).b(schemaG3) + (AbstractC1146v.C(i17) * 2);
                            i29++;
                            i12 = i12;
                        }
                    }
                    i10 = i12;
                    iC15 += iB2;
                    break;
                case 50:
                    iC15 += o10.f16534o.getSerializedSize(i17, unsafe.getObject(obj, j6), o10.f(i13));
                    i10 = i12;
                    break;
                case 51:
                    if (o10.l(obj, i17, i13)) {
                        iC10 = AbstractC1146v.C(i17);
                        iC14 = iC10 + 8;
                        iC15 += iC14;
                    }
                    i10 = i12;
                    break;
                case 52:
                    if (o10.l(obj, i17, i13)) {
                        iC11 = AbstractC1146v.C(i17);
                        iC14 = iC11 + 4;
                        iC15 += iC14;
                    }
                    i10 = i12;
                    break;
                case 53:
                    if (o10.l(obj, i17, i13)) {
                        long jV = v(obj, j6);
                        iC12 = AbstractC1146v.C(i17);
                        iE3 = AbstractC1146v.E(jV);
                        iD2 = iE3 + iC12;
                        iC15 += iD2;
                    }
                    i10 = i12;
                    break;
                case 54:
                    if (o10.l(obj, i17, i13)) {
                        long jV2 = v(obj, j6);
                        iC12 = AbstractC1146v.C(i17);
                        iE3 = AbstractC1146v.E(jV2);
                        iD2 = iE3 + iC12;
                        iC15 += iD2;
                    }
                    i10 = i12;
                    break;
                case 55:
                    if (o10.l(obj, i17, i13)) {
                        int iU = u(obj, j6);
                        iC13 = AbstractC1146v.C(i17);
                        iE4 = AbstractC1146v.E(iU);
                        iC14 = iE4 + iC13;
                        iC15 += iC14;
                    }
                    i10 = i12;
                    break;
                case 56:
                    if (o10.l(obj, i17, i13)) {
                        iC10 = AbstractC1146v.C(i17);
                        iC14 = iC10 + 8;
                        iC15 += iC14;
                    }
                    i10 = i12;
                    break;
                case 57:
                    if (o10.l(obj, i17, i13)) {
                        iC11 = AbstractC1146v.C(i17);
                        iC14 = iC11 + 4;
                        iC15 += iC14;
                    }
                    i10 = i12;
                    break;
                case 58:
                    if (o10.l(obj, i17, i13)) {
                        iC14 = AbstractC1146v.C(i17) + i12;
                        iC15 += iC14;
                    }
                    i10 = i12;
                    break;
                case 59:
                    if (o10.l(obj, i17, i13)) {
                        Object object3 = unsafe.getObject(obj, j6);
                        iC15 = (object3 instanceof AbstractC1123n ? AbstractC1146v.x(i17, (AbstractC1123n) object3) : AbstractC1146v.B((String) object3) + AbstractC1146v.C(i17)) + iC15;
                    }
                    i10 = i12;
                    break;
                case PictureConfig.MAX_PAGE_SIZE /* 60 */:
                    if (o10.l(obj, i17, i13)) {
                        Object object4 = unsafe.getObject(obj, j6);
                        Schema schemaG4 = o10.g(i13);
                        Class cls21 = AbstractC1089d2.f16600a;
                        int iC17 = AbstractC1146v.C(i17);
                        int iB6 = ((AbstractC1078b) ((MessageLite) object4)).b(schemaG4);
                        iD2 = AbstractC1146v.D(iB6) + iB6 + iC17;
                        iC15 += iD2;
                    }
                    i10 = i12;
                    break;
                case HomeMenuBean.BOTTOM_TAB_HOME /* 61 */:
                    if (o10.l(obj, i17, i13)) {
                        iC14 = AbstractC1146v.x(i17, (AbstractC1123n) unsafe.getObject(obj, j6));
                        iC15 += iC14;
                    }
                    i10 = i12;
                    break;
                case HomeMenuBean.BOTTOM_TAB_ME /* 62 */:
                    if (o10.l(obj, i17, i13)) {
                        int iU2 = u(obj, j6);
                        iC13 = AbstractC1146v.C(i17);
                        iE4 = AbstractC1146v.D(iU2);
                        iC14 = iE4 + iC13;
                        iC15 += iC14;
                    }
                    i10 = i12;
                    break;
                case HomeMenuBean.BOTTOM_TAB_FINANCE /* 63 */:
                    if (o10.l(obj, i17, i13)) {
                        int iU3 = u(obj, j6);
                        iC13 = AbstractC1146v.C(i17);
                        iE4 = AbstractC1146v.E(iU3);
                        iC14 = iE4 + iC13;
                        iC15 += iC14;
                    }
                    i10 = i12;
                    break;
                case 64:
                    if (o10.l(obj, i17, i13)) {
                        iC11 = AbstractC1146v.C(i17);
                        iC14 = iC11 + 4;
                        iC15 += iC14;
                    }
                    i10 = i12;
                    break;
                case HomeMenuBean.BOTTOM_TAB_INVEST /* 65 */:
                    if (o10.l(obj, i17, i13)) {
                        iC10 = AbstractC1146v.C(i17);
                        iC14 = iC10 + 8;
                        iC15 += iC14;
                    }
                    i10 = i12;
                    break;
                case HomeMenuBean.BOTTOM_TAB_GIVEAWAY /* 66 */:
                    if (o10.l(obj, i17, i13)) {
                        int iU4 = u(obj, j6);
                        iC13 = AbstractC1146v.C(i17);
                        iE4 = AbstractC1146v.z(iU4);
                        iC14 = iE4 + iC13;
                        iC15 += iC14;
                    }
                    i10 = i12;
                    break;
                case 67:
                    if (o10.l(obj, i17, i13)) {
                        long jV3 = v(obj, j6);
                        iC12 = AbstractC1146v.C(i17);
                        iE3 = AbstractC1146v.A(jV3);
                        iD2 = iE3 + iC12;
                        iC15 += iD2;
                    }
                    i10 = i12;
                    break;
                case 68:
                    if (o10.l(obj, i17, i13)) {
                        iC14 = ((AbstractC1078b) ((MessageLite) unsafe.getObject(obj, j6))).b(o10.g(i13)) + (AbstractC1146v.C(i17) * 2);
                        iC15 += iC14;
                    }
                    i10 = i12;
                    break;
                default:
                    i10 = i12;
                    break;
            }
            i13 += 3;
            i12 = i10;
        }
    }

    /* JADX WARN: Code duplicated, block: B:42:0x00e1 A[PHI: r3
      0x00e1: PHI (r3v32 int) = (r3v10 int), (r3v33 int) binds: [B:83:0x0216, B:41:0x00df] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // androidx.datastore.preferences.protobuf.Schema
    public final int hashCode(Object obj) {
        int i7;
        int iB;
        int i10;
        int[] iArr = this.f16520a;
        int length = iArr.length;
        int i11 = 0;
        for (int i12 = 0; i12 < length; i12 += 3) {
            int iL = L(i12);
            int i13 = iArr[i12];
            long j6 = 1048575 & iL;
            int i14 = 1237;
            int iHashCode = 37;
            switch (K(iL)) {
                case 0:
                    i7 = i11 * 53;
                    iB = AbstractC1154x1.b(Double.doubleToLongBits(w2.f16802c.g(obj, j6)));
                    i11 = iB + i7;
                    break;
                case 1:
                    i7 = i11 * 53;
                    iB = Float.floatToIntBits(w2.f16802c.h(obj, j6));
                    i11 = iB + i7;
                    break;
                case 2:
                    i7 = i11 * 53;
                    iB = AbstractC1154x1.b(w2.f16802c.j(obj, j6));
                    i11 = iB + i7;
                    break;
                case 3:
                    i7 = i11 * 53;
                    iB = AbstractC1154x1.b(w2.f16802c.j(obj, j6));
                    i11 = iB + i7;
                    break;
                case 4:
                    i7 = i11 * 53;
                    iB = w2.f16802c.i(obj, j6);
                    i11 = iB + i7;
                    break;
                case 5:
                    i7 = i11 * 53;
                    iB = AbstractC1154x1.b(w2.f16802c.j(obj, j6));
                    i11 = iB + i7;
                    break;
                case 6:
                    i7 = i11 * 53;
                    iB = w2.f16802c.i(obj, j6);
                    i11 = iB + i7;
                    break;
                case 7:
                    i10 = i11 * 53;
                    boolean zD = w2.f16802c.d(obj, j6);
                    Charset charset = AbstractC1154x1.f16808a;
                    if (zD) {
                        i14 = 1231;
                    }
                    i11 = i14 + i10;
                    break;
                case 8:
                    i7 = i11 * 53;
                    iB = ((String) w2.f16802c.k(obj, j6)).hashCode();
                    i11 = iB + i7;
                    break;
                case 9:
                    Object objK = w2.f16802c.k(obj, j6);
                    if (objK != null) {
                        iHashCode = objK.hashCode();
                    }
                    i11 = (i11 * 53) + iHashCode;
                    break;
                case 10:
                    i7 = i11 * 53;
                    iB = w2.f16802c.k(obj, j6).hashCode();
                    i11 = iB + i7;
                    break;
                case 11:
                    i7 = i11 * 53;
                    iB = w2.f16802c.i(obj, j6);
                    i11 = iB + i7;
                    break;
                case 12:
                    i7 = i11 * 53;
                    iB = w2.f16802c.i(obj, j6);
                    i11 = iB + i7;
                    break;
                case 13:
                    i7 = i11 * 53;
                    iB = w2.f16802c.i(obj, j6);
                    i11 = iB + i7;
                    break;
                case 14:
                    i7 = i11 * 53;
                    iB = AbstractC1154x1.b(w2.f16802c.j(obj, j6));
                    i11 = iB + i7;
                    break;
                case 15:
                    i7 = i11 * 53;
                    iB = w2.f16802c.i(obj, j6);
                    i11 = iB + i7;
                    break;
                case 16:
                    i7 = i11 * 53;
                    iB = AbstractC1154x1.b(w2.f16802c.j(obj, j6));
                    i11 = iB + i7;
                    break;
                case 17:
                    Object objK2 = w2.f16802c.k(obj, j6);
                    if (objK2 != null) {
                        iHashCode = objK2.hashCode();
                    }
                    i11 = (i11 * 53) + iHashCode;
                    break;
                case 18:
                case 19:
                case 20:
                case 21:
                case 22:
                case 23:
                case 24:
                case Service.MONITORED_RESOURCES_FIELD_NUMBER /* 25 */:
                case 26:
                case 27:
                case 28:
                case 29:
                case BillBusinessType.BUSINESS_TYPE_COMMERCE_RETAIL_TRADE_PAYMENTS /* 30 */:
                case 31:
                case 32:
                case 33:
                case 34:
                case 35:
                case 36:
                case 37:
                case BillBusinessType.BUSINESS_TYPE_TRIP /* 38 */:
                case 39:
                case 40:
                case 41:
                case DescriptorProtos.FileOptions.PHP_GENERIC_SERVICES_FIELD_NUMBER /* 42 */:
                case 43:
                case 44:
                case 45:
                case 46:
                case ShareDialog.SHARE_BUSINESS_TYPE_JUNE_INVITE_TASK /* 47 */:
                case 48:
                case NavigationBarView.ITEM_GRAVITY_TOP_CENTER /* 49 */:
                    i7 = i11 * 53;
                    iB = w2.f16802c.k(obj, j6).hashCode();
                    i11 = iB + i7;
                    break;
                case 50:
                    i7 = i11 * 53;
                    iB = w2.f16802c.k(obj, j6).hashCode();
                    i11 = iB + i7;
                    break;
                case 51:
                    if (l(obj, i13, i12)) {
                        i7 = i11 * 53;
                        iB = AbstractC1154x1.b(Double.doubleToLongBits(((Double) w2.f16802c.k(obj, j6)).doubleValue()));
                        i11 = iB + i7;
                    }
                    break;
                case 52:
                    if (l(obj, i13, i12)) {
                        i7 = i11 * 53;
                        iB = Float.floatToIntBits(((Float) w2.f16802c.k(obj, j6)).floatValue());
                        i11 = iB + i7;
                    }
                    break;
                case 53:
                    if (l(obj, i13, i12)) {
                        i7 = i11 * 53;
                        iB = AbstractC1154x1.b(v(obj, j6));
                        i11 = iB + i7;
                    }
                    break;
                case 54:
                    if (l(obj, i13, i12)) {
                        i7 = i11 * 53;
                        iB = AbstractC1154x1.b(v(obj, j6));
                        i11 = iB + i7;
                    }
                    break;
                case 55:
                    if (l(obj, i13, i12)) {
                        i7 = i11 * 53;
                        iB = u(obj, j6);
                        i11 = iB + i7;
                    }
                    break;
                case 56:
                    if (l(obj, i13, i12)) {
                        i7 = i11 * 53;
                        iB = AbstractC1154x1.b(v(obj, j6));
                        i11 = iB + i7;
                    }
                    break;
                case 57:
                    if (l(obj, i13, i12)) {
                        i7 = i11 * 53;
                        iB = u(obj, j6);
                        i11 = iB + i7;
                    }
                    break;
                case 58:
                    if (l(obj, i13, i12)) {
                        i10 = i11 * 53;
                        boolean zBooleanValue = ((Boolean) w2.f16802c.k(obj, j6)).booleanValue();
                        Charset charset2 = AbstractC1154x1.f16808a;
                        if (zBooleanValue) {
                            i14 = 1231;
                        }
                        i11 = i14 + i10;
                    }
                    break;
                case 59:
                    if (l(obj, i13, i12)) {
                        i7 = i11 * 53;
                        iB = ((String) w2.f16802c.k(obj, j6)).hashCode();
                        i11 = iB + i7;
                    }
                    break;
                case PictureConfig.MAX_PAGE_SIZE /* 60 */:
                    if (l(obj, i13, i12)) {
                        i7 = i11 * 53;
                        iB = w2.f16802c.k(obj, j6).hashCode();
                        i11 = iB + i7;
                    }
                    break;
                case HomeMenuBean.BOTTOM_TAB_HOME /* 61 */:
                    if (l(obj, i13, i12)) {
                        i7 = i11 * 53;
                        iB = w2.f16802c.k(obj, j6).hashCode();
                        i11 = iB + i7;
                    }
                    break;
                case HomeMenuBean.BOTTOM_TAB_ME /* 62 */:
                    if (l(obj, i13, i12)) {
                        i7 = i11 * 53;
                        iB = u(obj, j6);
                        i11 = iB + i7;
                    }
                    break;
                case HomeMenuBean.BOTTOM_TAB_FINANCE /* 63 */:
                    if (l(obj, i13, i12)) {
                        i7 = i11 * 53;
                        iB = u(obj, j6);
                        i11 = iB + i7;
                    }
                    break;
                case 64:
                    if (l(obj, i13, i12)) {
                        i7 = i11 * 53;
                        iB = u(obj, j6);
                        i11 = iB + i7;
                    }
                    break;
                case HomeMenuBean.BOTTOM_TAB_INVEST /* 65 */:
                    if (l(obj, i13, i12)) {
                        i7 = i11 * 53;
                        iB = AbstractC1154x1.b(v(obj, j6));
                        i11 = iB + i7;
                    }
                    break;
                case HomeMenuBean.BOTTOM_TAB_GIVEAWAY /* 66 */:
                    if (l(obj, i13, i12)) {
                        i7 = i11 * 53;
                        iB = u(obj, j6);
                        i11 = iB + i7;
                    }
                    break;
                case 67:
                    if (l(obj, i13, i12)) {
                        i7 = i11 * 53;
                        iB = AbstractC1154x1.b(v(obj, j6));
                        i11 = iB + i7;
                    }
                    break;
                case 68:
                    if (l(obj, i13, i12)) {
                        i7 = i11 * 53;
                        iB = w2.f16802c.k(obj, j6).hashCode();
                        i11 = iB + i7;
                    }
                    break;
            }
        }
        this.f16532m.getClass();
        int iHashCode2 = ((AbstractC1145u1) obj).unknownFields.hashCode() + (i11 * 53);
        if (!this.f16525f) {
            return iHashCode2;
        }
        ((C1100g1) this.f16533n).getClass();
        return ((AbstractC1142t1) obj).extensions.f16696a.hashCode() + (iHashCode2 * 53);
    }

    public final boolean i(Object obj, int i7) {
        int i10 = this.f16520a[i7 + 2];
        long j6 = i10 & 1048575;
        if (j6 == 1048575) {
            int iL = L(i7);
            long j10 = iL & 1048575;
            switch (K(iL)) {
                case 0:
                    if (Double.doubleToRawLongBits(w2.f16802c.g(obj, j10)) == 0) {
                        return false;
                    }
                    break;
                case 1:
                    if (Float.floatToRawIntBits(w2.f16802c.h(obj, j10)) == 0) {
                        return false;
                    }
                    break;
                case 2:
                    if (w2.f16802c.j(obj, j10) == 0) {
                        return false;
                    }
                    break;
                case 3:
                    if (w2.f16802c.j(obj, j10) == 0) {
                        return false;
                    }
                    break;
                case 4:
                    if (w2.f16802c.i(obj, j10) == 0) {
                        return false;
                    }
                    break;
                case 5:
                    if (w2.f16802c.j(obj, j10) == 0) {
                        return false;
                    }
                    break;
                case 6:
                    if (w2.f16802c.i(obj, j10) == 0) {
                        return false;
                    }
                    break;
                case 7:
                    return w2.f16802c.d(obj, j10);
                case 8:
                    Object objK = w2.f16802c.k(obj, j10);
                    if (objK instanceof String) {
                        return !((String) objK).isEmpty();
                    }
                    if (objK instanceof AbstractC1123n) {
                        return !AbstractC1123n.f16699b.equals(objK);
                    }
                    throw new IllegalArgumentException();
                case 9:
                    if (w2.f16802c.k(obj, j10) == null) {
                        return false;
                    }
                    break;
                case 10:
                    return !AbstractC1123n.f16699b.equals(w2.f16802c.k(obj, j10));
                case 11:
                    if (w2.f16802c.i(obj, j10) == 0) {
                        return false;
                    }
                    break;
                case 12:
                    if (w2.f16802c.i(obj, j10) == 0) {
                        return false;
                    }
                    break;
                case 13:
                    if (w2.f16802c.i(obj, j10) == 0) {
                        return false;
                    }
                    break;
                case 14:
                    if (w2.f16802c.j(obj, j10) == 0) {
                        return false;
                    }
                    break;
                case 15:
                    if (w2.f16802c.i(obj, j10) == 0) {
                        return false;
                    }
                    break;
                case 16:
                    if (w2.f16802c.j(obj, j10) == 0) {
                        return false;
                    }
                    break;
                case 17:
                    if (w2.f16802c.k(obj, j10) == null) {
                        return false;
                    }
                    break;
                default:
                    throw new IllegalArgumentException();
            }
        } else {
            if ((w2.f16802c.i(obj, j6) & (1 << (i10 >>> 20))) == 0) {
                return false;
            }
        }
        return true;
    }

    @Override // androidx.datastore.preferences.protobuf.Schema
    public final boolean isInitialized(Object obj) {
        int i7;
        int i10;
        int i11 = 1048575;
        int i12 = 0;
        int i13 = 0;
        while (i13 < this.f16528i) {
            int i14 = this.f16527h[i13];
            int[] iArr = this.f16520a;
            int i15 = iArr[i14];
            int iL = L(i14);
            int i16 = iArr[i14 + 2];
            int i17 = i16 & 1048575;
            int i18 = 1 << (i16 >>> 20);
            if (i17 != i11) {
                if (i17 != 1048575) {
                    i12 = f16519q.getInt(obj, i17);
                }
                i10 = i12;
                i7 = i17;
            } else {
                int i19 = i12;
                i7 = i11;
                i10 = i19;
            }
            if ((268435456 & iL) == 0 || j(obj, i14, i7, i10, i18)) {
                int iK = K(iL);
                if (iK == 9 || iK == 17) {
                    if (j(obj, i14, i7, i10, i18)) {
                        if (!g(i14).isInitialized(w2.f16802c.k(obj, iL & 1048575))) {
                        }
                    } else {
                        continue;
                    }
                    i13++;
                    i11 = i7;
                    i12 = i10;
                } else {
                    if (iK != 27) {
                        if (iK == 60 || iK == 68) {
                            if (l(obj, i15, i14)) {
                                if (!g(i14).isInitialized(w2.f16802c.k(obj, iL & 1048575))) {
                                }
                            } else {
                                continue;
                            }
                            i13++;
                            i11 = i7;
                            i12 = i10;
                        } else if (iK != 49) {
                            if (iK != 50) {
                                continue;
                            } else {
                                Object objK = w2.f16802c.k(obj, iL & 1048575);
                                MapFieldSchema mapFieldSchema = this.f16534o;
                                Map<?, ?> mapForMapData = mapFieldSchema.forMapData(objK);
                                if (!mapForMapData.isEmpty() && mapFieldSchema.forMapMetadata(f(i14)).f16496b.f16493a == I2.MESSAGE) {
                                    Schema schemaA = null;
                                    for (Object obj2 : mapForMapData.values()) {
                                        if (schemaA == null) {
                                            schemaA = C1077a2.f16579c.a(obj2.getClass());
                                        }
                                        if (!schemaA.isInitialized(obj2)) {
                                        }
                                    }
                                }
                            }
                            i13++;
                            i11 = i7;
                            i12 = i10;
                        }
                    }
                    List list = (List) w2.f16802c.k(obj, iL & 1048575);
                    if (list.isEmpty()) {
                        continue;
                    } else {
                        Schema schemaG = g(i14);
                        for (int i20 = 0; i20 < list.size(); i20++) {
                            if (schemaG.isInitialized(list.get(i20))) {
                            }
                        }
                    }
                    i13++;
                    i11 = i7;
                    i12 = i10;
                }
            }
            return false;
        }
        if (this.f16525f) {
            ((C1100g1) this.f16533n).getClass();
            if (!((AbstractC1142t1) obj).extensions.f()) {
                return false;
            }
        }
        return true;
    }

    public final boolean j(Object obj, int i7, int i10, int i11, int i12) {
        if (i10 == 1048575) {
            return i(obj, i7);
        }
        return (i11 & i12) != 0;
    }

    public final boolean l(Object obj, int i7, int i10) {
        return w2.f16802c.i(obj, (long) (this.f16520a[i10 + 2] & 1048575)) == i7;
    }

    /* JADX WARN: Code duplicated, block: B:222:0x0719 A[Catch: all -> 0x0466, TryCatch #3 {all -> 0x0466, blocks: (B:220:0x0714, B:222:0x0719, B:223:0x071e, B:164:0x0457, B:168:0x0469, B:169:0x047a, B:177:0x049f, B:178:0x04a4, B:179:0x04b8, B:180:0x04cc, B:181:0x04e0, B:182:0x04f4, B:183:0x0508, B:184:0x051c, B:185:0x0530, B:186:0x0544, B:187:0x055d, B:188:0x0575, B:189:0x058d, B:190:0x05a5, B:191:0x05bd, B:193:0x05d0, B:196:0x05d7, B:197:0x05dd, B:198:0x05e9, B:199:0x0601, B:200:0x0619, B:201:0x0632, B:202:0x0642, B:203:0x065c, B:204:0x0674, B:205:0x068c, B:206:0x06a4, B:207:0x06bc, B:208:0x06d4, B:209:0x06ee, B:215:0x0707), top: B:245:0x0714 }] */
    /* JADX WARN: Code duplicated, block: B:227:0x0728 A[LOOP:3: B:226:0x0726->B:227:0x0728, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:229:0x073b  */
    /* JADX WARN: Code duplicated, block: B:234:0x0748 A[LOOP:2: B:233:0x0746->B:234:0x0748, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:236:0x0759  */
    /* JADX WARN: Code duplicated, block: B:292:0x0725 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:306:? A[RETURN, SYNTHETIC] */
    public final void m(r2 r2Var, AbstractC1096f1 abstractC1096f1, Object obj, Reader reader, C1092e1 c1092e1) throws Throwable {
        Object obj2;
        Object objD;
        Object obj3;
        Object objD2;
        Reader reader2;
        O1 o10;
        Object objD3;
        Object obj4;
        Object obj5;
        O1 o11 = this;
        Reader reader3 = reader;
        C1092e1 c1092e2 = c1092e1;
        int[] iArr = o11.f16527h;
        int i7 = o11.f16529j;
        int i10 = o11.f16528i;
        Object objA = null;
        while (true) {
            try {
                int fieldNumber = reader3.getFieldNumber();
                int iH = (fieldNumber < o11.f16522c || fieldNumber > o11.f16523d) ? -1 : o11.H(fieldNumber, 0);
                if (iH >= 0) {
                    obj3 = obj;
                    try {
                        int iL = o11.L(iH);
                        try {
                            try {
                                int iK = K(iL);
                                ListFieldSchema listFieldSchema = o11.f16531l;
                                switch (iK) {
                                    case 0:
                                        r2Var = r2Var;
                                        o10 = o11;
                                        reader2 = reader3;
                                        c1092e1 = c1092e2;
                                        try {
                                            obj4 = obj;
                                            try {
                                                w2.f16802c.o(obj4, t(iL), reader2.readDouble());
                                                o10.F(obj4, iH);
                                            } catch (C1157y1 unused) {
                                                obj2 = obj4;
                                                try {
                                                    r2Var.getClass();
                                                    if (objA == null) {
                                                        objA = r2.a(obj2);
                                                    }
                                                    if (!r2.b(0, reader2, objA)) {
                                                        objD3 = objA;
                                                        while (i10 < i7) {
                                                            objD3 = o10.d(obj2, iArr[i10], objD3, r2Var, obj);
                                                            i10++;
                                                            o10 = this;
                                                            r2Var = r2Var;
                                                        }
                                                        if (objD3 != null) {
                                                            r2.c(obj2, objD3);
                                                            return;
                                                        }
                                                        return;
                                                    }
                                                } catch (Throwable th) {
                                                    th = th;
                                                }
                                            }
                                        } catch (C1157y1 unused2) {
                                            obj2 = obj;
                                            r2Var.getClass();
                                            if (objA == null) {
                                                objA = r2.a(obj2);
                                            }
                                            if (!r2.b(0, reader2, objA)) {
                                                objD3 = objA;
                                                while (i10 < i7) {
                                                    objD3 = o10.d(obj2, iArr[i10], objD3, r2Var, obj);
                                                    i10++;
                                                    o10 = this;
                                                    r2Var = r2Var;
                                                }
                                                if (objD3 != null) {
                                                    r2.c(obj2, objD3);
                                                    return;
                                                }
                                                return;
                                            }
                                        }
                                        o11 = this;
                                        reader3 = reader2;
                                        c1092e2 = c1092e1;
                                        break;
                                    case 1:
                                        reader2 = reader3;
                                        c1092e1 = c1092e2;
                                        w2.f16802c.p(obj3, t(iL), reader2.readFloat());
                                        o11.F(obj3, iH);
                                        o11 = this;
                                        reader3 = reader2;
                                        c1092e2 = c1092e1;
                                        break;
                                    case 2:
                                        reader2 = reader3;
                                        c1092e1 = c1092e2;
                                        w2.o(obj3, t(iL), reader2.readInt64());
                                        o11.F(obj3, iH);
                                        o11 = this;
                                        reader3 = reader2;
                                        c1092e2 = c1092e1;
                                        break;
                                    case 3:
                                        reader2 = reader3;
                                        c1092e1 = c1092e2;
                                        w2.o(obj3, t(iL), reader2.readUInt64());
                                        o11.F(obj3, iH);
                                        o11 = this;
                                        reader3 = reader2;
                                        c1092e2 = c1092e1;
                                        break;
                                    case 4:
                                        reader2 = reader3;
                                        c1092e1 = c1092e2;
                                        w2.n(obj3, t(iL), reader2.readInt32());
                                        o11.F(obj3, iH);
                                        o11 = this;
                                        reader3 = reader2;
                                        c1092e2 = c1092e1;
                                        break;
                                    case 5:
                                        reader2 = reader3;
                                        c1092e1 = c1092e2;
                                        w2.o(obj3, t(iL), reader2.readFixed64());
                                        o11.F(obj3, iH);
                                        o11 = this;
                                        reader3 = reader2;
                                        c1092e2 = c1092e1;
                                        break;
                                    case 6:
                                        reader2 = reader3;
                                        c1092e1 = c1092e2;
                                        w2.n(obj3, t(iL), reader2.readFixed32());
                                        o11.F(obj3, iH);
                                        o11 = this;
                                        reader3 = reader2;
                                        c1092e2 = c1092e1;
                                        break;
                                    case 7:
                                        reader2 = reader3;
                                        c1092e1 = c1092e2;
                                        w2.f16802c.m(obj3, t(iL), reader2.readBool());
                                        o11.F(obj3, iH);
                                        o11 = this;
                                        reader3 = reader2;
                                        c1092e2 = c1092e1;
                                        break;
                                    case 8:
                                        O1 o12 = o11;
                                        reader2 = reader3;
                                        c1092e1 = c1092e2;
                                        o12.C(iL, reader2, obj3);
                                        o12.F(obj3, iH);
                                        o11 = this;
                                        reader3 = reader2;
                                        c1092e2 = c1092e1;
                                        break;
                                    case 9:
                                        O1 o13 = o11;
                                        reader2 = reader3;
                                        c1092e1 = c1092e2;
                                        MessageLite messageLite = (MessageLite) o13.q(obj3, iH);
                                        reader2.mergeMessageField(messageLite, o13.g(iH), c1092e1);
                                        o13.I(obj3, iH, messageLite);
                                        o11 = this;
                                        reader3 = reader2;
                                        c1092e2 = c1092e1;
                                        break;
                                    case 10:
                                        reader2 = reader3;
                                        c1092e1 = c1092e2;
                                        w2.p(obj3, t(iL), reader2.readBytes());
                                        o11.F(obj3, iH);
                                        o11 = this;
                                        reader3 = reader2;
                                        c1092e2 = c1092e1;
                                        break;
                                    case 11:
                                        reader2 = reader3;
                                        c1092e1 = c1092e2;
                                        w2.n(obj3, t(iL), reader2.readUInt32());
                                        o11.F(obj3, iH);
                                        o11 = this;
                                        reader3 = reader2;
                                        c1092e2 = c1092e1;
                                        break;
                                    case 12:
                                        O1 o14 = o11;
                                        reader2 = reader3;
                                        c1092e1 = c1092e2;
                                        int i11 = reader2.readEnum();
                                        Internal$EnumVerifier internal$EnumVerifierE = o14.e(iH);
                                        if (internal$EnumVerifierE == null || internal$EnumVerifierE.isInRange(i11)) {
                                            w2.n(obj3, t(iL), i11);
                                            o14.F(obj3, iH);
                                        } else {
                                            objA = AbstractC1089d2.n(obj3, fieldNumber, i11, objA, r2Var);
                                        }
                                        o11 = this;
                                        reader3 = reader2;
                                        c1092e2 = c1092e1;
                                        break;
                                    case 13:
                                        reader2 = reader3;
                                        c1092e1 = c1092e2;
                                        w2.n(obj3, t(iL), reader2.readSFixed32());
                                        o11.F(obj3, iH);
                                        o11 = this;
                                        reader3 = reader2;
                                        c1092e2 = c1092e1;
                                        break;
                                    case 14:
                                        reader2 = reader3;
                                        c1092e1 = c1092e2;
                                        w2.o(obj3, t(iL), reader2.readSFixed64());
                                        o11.F(obj3, iH);
                                        o11 = this;
                                        reader3 = reader2;
                                        c1092e2 = c1092e1;
                                        break;
                                    case 15:
                                        reader2 = reader3;
                                        c1092e1 = c1092e2;
                                        w2.n(obj3, t(iL), reader2.readSInt32());
                                        o11.F(obj3, iH);
                                        o11 = this;
                                        reader3 = reader2;
                                        c1092e2 = c1092e1;
                                        break;
                                    case 16:
                                        reader2 = reader3;
                                        c1092e1 = c1092e2;
                                        w2.o(obj3, t(iL), reader2.readSInt64());
                                        o11.F(obj3, iH);
                                        o11 = this;
                                        reader3 = reader2;
                                        c1092e2 = c1092e1;
                                        break;
                                    case 17:
                                        O1 o15 = o11;
                                        reader2 = reader3;
                                        c1092e1 = c1092e2;
                                        MessageLite messageLite2 = (MessageLite) o15.q(obj3, iH);
                                        reader2.mergeGroupField(messageLite2, o15.g(iH), c1092e1);
                                        o15.I(obj3, iH, messageLite2);
                                        o11 = this;
                                        reader3 = reader2;
                                        c1092e2 = c1092e1;
                                        break;
                                    case 18:
                                        reader2 = reader3;
                                        c1092e1 = c1092e2;
                                        reader2.readDoubleList(listFieldSchema.mutableListAt(obj3, t(iL)));
                                        o11 = this;
                                        reader3 = reader2;
                                        c1092e2 = c1092e1;
                                        break;
                                    case 19:
                                        reader2 = reader3;
                                        c1092e1 = c1092e2;
                                        reader2.readFloatList(listFieldSchema.mutableListAt(obj3, t(iL)));
                                        o11 = this;
                                        reader3 = reader2;
                                        c1092e2 = c1092e1;
                                        break;
                                    case 20:
                                        reader2 = reader3;
                                        c1092e1 = c1092e2;
                                        reader2.readInt64List(listFieldSchema.mutableListAt(obj3, t(iL)));
                                        o11 = this;
                                        reader3 = reader2;
                                        c1092e2 = c1092e1;
                                        break;
                                    case 21:
                                        reader2 = reader3;
                                        c1092e1 = c1092e2;
                                        reader2.readUInt64List(listFieldSchema.mutableListAt(obj3, t(iL)));
                                        o11 = this;
                                        reader3 = reader2;
                                        c1092e2 = c1092e1;
                                        break;
                                    case 22:
                                        reader2 = reader3;
                                        c1092e1 = c1092e2;
                                        reader2.readInt32List(listFieldSchema.mutableListAt(obj3, t(iL)));
                                        o11 = this;
                                        reader3 = reader2;
                                        c1092e2 = c1092e1;
                                        break;
                                    case 23:
                                        reader2 = reader3;
                                        c1092e1 = c1092e2;
                                        reader2.readFixed64List(listFieldSchema.mutableListAt(obj3, t(iL)));
                                        o11 = this;
                                        reader3 = reader2;
                                        c1092e2 = c1092e1;
                                        break;
                                    case 24:
                                        reader2 = reader3;
                                        c1092e1 = c1092e2;
                                        reader2.readFixed32List(listFieldSchema.mutableListAt(obj3, t(iL)));
                                        o11 = this;
                                        reader3 = reader2;
                                        c1092e2 = c1092e1;
                                        break;
                                    case Service.MONITORED_RESOURCES_FIELD_NUMBER /* 25 */:
                                        reader2 = reader3;
                                        c1092e1 = c1092e2;
                                        reader2.readBoolList(listFieldSchema.mutableListAt(obj3, t(iL)));
                                        o11 = this;
                                        reader3 = reader2;
                                        c1092e2 = c1092e1;
                                        break;
                                    case 26:
                                        r2Var = r2Var;
                                        o10 = o11;
                                        reader2 = reader3;
                                        c1092e1 = c1092e2;
                                        obj2 = obj3;
                                        try {
                                            o10.D(iL, reader2, obj2);
                                        } catch (C1157y1 unused3) {
                                            r2Var.getClass();
                                            if (objA == null) {
                                                objA = r2.a(obj2);
                                            }
                                            if (!r2.b(0, reader2, objA)) {
                                                objD3 = objA;
                                                while (i10 < i7) {
                                                    objD3 = o10.d(obj2, iArr[i10], objD3, r2Var, obj);
                                                    i10++;
                                                    o10 = this;
                                                    r2Var = r2Var;
                                                }
                                                if (objD3 != null) {
                                                    r2.c(obj2, objD3);
                                                    return;
                                                }
                                                return;
                                            }
                                        }
                                        o11 = this;
                                        reader3 = reader2;
                                        c1092e2 = c1092e1;
                                        break;
                                    case 27:
                                        r2Var = r2Var;
                                        obj2 = obj3;
                                        try {
                                            o11.B(obj2, iL, reader3, o11.g(iH), c1092e1);
                                            reader2 = reader3;
                                            c1092e1 = c1092e1;
                                        } catch (C1157y1 unused4) {
                                            o10 = o11;
                                            reader2 = reader3;
                                            c1092e1 = c1092e1;
                                            r2Var.getClass();
                                            if (objA == null) {
                                                objA = r2.a(obj2);
                                            }
                                            if (!r2.b(0, reader2, objA)) {
                                                objD3 = objA;
                                                while (i10 < i7) {
                                                    objD3 = o10.d(obj2, iArr[i10], objD3, r2Var, obj);
                                                    i10++;
                                                    o10 = this;
                                                    r2Var = r2Var;
                                                }
                                                if (objD3 != null) {
                                                    r2.c(obj2, objD3);
                                                    return;
                                                }
                                                return;
                                            }
                                        } catch (Throwable th2) {
                                            th = th2;
                                        }
                                        o11 = this;
                                        reader3 = reader2;
                                        c1092e2 = c1092e1;
                                        break;
                                    case 28:
                                        reader2 = reader3;
                                        reader2.readBytesList(listFieldSchema.mutableListAt(obj3, t(iL)));
                                        c1092e1 = c1092e1;
                                        o11 = this;
                                        reader3 = reader2;
                                        c1092e2 = c1092e1;
                                        break;
                                    case 29:
                                        o10 = o11;
                                        reader2 = reader3;
                                        obj2 = obj3;
                                        try {
                                            reader2.readUInt32List(listFieldSchema.mutableListAt(obj2, t(iL)));
                                            c1092e1 = c1092e1;
                                        } catch (C1157y1 unused5) {
                                            c1092e1 = c1092e1;
                                            r2Var.getClass();
                                            if (objA == null) {
                                                objA = r2.a(obj2);
                                            }
                                            if (!r2.b(0, reader2, objA)) {
                                                objD3 = objA;
                                                while (i10 < i7) {
                                                    objD3 = o10.d(obj2, iArr[i10], objD3, r2Var, obj);
                                                    i10++;
                                                    o10 = this;
                                                    r2Var = r2Var;
                                                }
                                                if (objD3 != null) {
                                                    r2.c(obj2, objD3);
                                                    return;
                                                }
                                                return;
                                            }
                                        }
                                        o11 = this;
                                        reader3 = reader2;
                                        c1092e2 = c1092e1;
                                        break;
                                    case BillBusinessType.BUSINESS_TYPE_COMMERCE_RETAIL_TRADE_PAYMENTS /* 30 */:
                                        o10 = o11;
                                        reader2 = reader3;
                                        obj2 = obj3;
                                        obj5 = objA;
                                        try {
                                            List<Integer> listMutableListAt = listFieldSchema.mutableListAt(obj2, t(iL));
                                            reader2.readEnumList(listMutableListAt);
                                            obj4 = obj2;
                                            try {
                                                objA = AbstractC1089d2.j(obj4, fieldNumber, listMutableListAt, o10.e(iH), obj5, r2Var);
                                                c1092e1 = c1092e1;
                                            } catch (C1157y1 unused6) {
                                                objA = obj5;
                                                r2Var = r2Var;
                                                c1092e1 = c1092e1;
                                                obj2 = obj4;
                                                r2Var.getClass();
                                                if (objA == null) {
                                                    objA = r2.a(obj2);
                                                }
                                                if (!r2.b(0, reader2, objA)) {
                                                    objD3 = objA;
                                                    while (i10 < i7) {
                                                        objD3 = o10.d(obj2, iArr[i10], objD3, r2Var, obj);
                                                        i10++;
                                                        o10 = this;
                                                        r2Var = r2Var;
                                                    }
                                                    if (objD3 != null) {
                                                        r2.c(obj2, objD3);
                                                        return;
                                                    }
                                                    return;
                                                }
                                            } catch (Throwable th3) {
                                                th = th3;
                                                obj2 = obj4;
                                                objA = obj5;
                                            }
                                        } catch (C1157y1 unused7) {
                                            objA = obj5;
                                            c1092e1 = c1092e1;
                                            r2Var.getClass();
                                            if (objA == null) {
                                                objA = r2.a(obj2);
                                            }
                                            if (!r2.b(0, reader2, objA)) {
                                                objD3 = objA;
                                                while (i10 < i7) {
                                                    objD3 = o10.d(obj2, iArr[i10], objD3, r2Var, obj);
                                                    i10++;
                                                    o10 = this;
                                                    r2Var = r2Var;
                                                }
                                                if (objD3 != null) {
                                                    r2.c(obj2, objD3);
                                                    return;
                                                }
                                                return;
                                            }
                                        } catch (Throwable th4) {
                                            th = th4;
                                            objA = obj5;
                                        }
                                        o11 = this;
                                        reader3 = reader2;
                                        c1092e2 = c1092e1;
                                        break;
                                    case 31:
                                        reader2 = reader3;
                                        obj5 = objA;
                                        reader2.readSFixed32List(listFieldSchema.mutableListAt(obj3, t(iL)));
                                        c1092e1 = c1092e1;
                                        objA = obj5;
                                        o11 = this;
                                        reader3 = reader2;
                                        c1092e2 = c1092e1;
                                        break;
                                    case 32:
                                        reader2 = reader3;
                                        obj5 = objA;
                                        reader2.readSFixed64List(listFieldSchema.mutableListAt(obj3, t(iL)));
                                        c1092e1 = c1092e1;
                                        objA = obj5;
                                        o11 = this;
                                        reader3 = reader2;
                                        c1092e2 = c1092e1;
                                        break;
                                    case 33:
                                        reader2 = reader3;
                                        obj5 = objA;
                                        reader2.readSInt32List(listFieldSchema.mutableListAt(obj3, t(iL)));
                                        c1092e1 = c1092e1;
                                        objA = obj5;
                                        o11 = this;
                                        reader3 = reader2;
                                        c1092e2 = c1092e1;
                                        break;
                                    case 34:
                                        reader2 = reader3;
                                        obj5 = objA;
                                        reader2.readSInt64List(listFieldSchema.mutableListAt(obj3, t(iL)));
                                        c1092e1 = c1092e1;
                                        objA = obj5;
                                        o11 = this;
                                        reader3 = reader2;
                                        c1092e2 = c1092e1;
                                        break;
                                    case 35:
                                        reader2 = reader3;
                                        obj5 = objA;
                                        reader2.readDoubleList(listFieldSchema.mutableListAt(obj3, t(iL)));
                                        c1092e1 = c1092e1;
                                        objA = obj5;
                                        o11 = this;
                                        reader3 = reader2;
                                        c1092e2 = c1092e1;
                                        break;
                                    case 36:
                                        reader2 = reader3;
                                        obj5 = objA;
                                        reader2.readFloatList(listFieldSchema.mutableListAt(obj3, t(iL)));
                                        c1092e1 = c1092e1;
                                        objA = obj5;
                                        o11 = this;
                                        reader3 = reader2;
                                        c1092e2 = c1092e1;
                                        break;
                                    case 37:
                                        reader2 = reader3;
                                        obj5 = objA;
                                        reader2.readInt64List(listFieldSchema.mutableListAt(obj3, t(iL)));
                                        c1092e1 = c1092e1;
                                        objA = obj5;
                                        o11 = this;
                                        reader3 = reader2;
                                        c1092e2 = c1092e1;
                                        break;
                                    case BillBusinessType.BUSINESS_TYPE_TRIP /* 38 */:
                                        reader2 = reader3;
                                        obj5 = objA;
                                        reader2.readUInt64List(listFieldSchema.mutableListAt(obj3, t(iL)));
                                        c1092e1 = c1092e1;
                                        objA = obj5;
                                        o11 = this;
                                        reader3 = reader2;
                                        c1092e2 = c1092e1;
                                        break;
                                    case 39:
                                        reader2 = reader3;
                                        obj5 = objA;
                                        reader2.readInt32List(listFieldSchema.mutableListAt(obj3, t(iL)));
                                        c1092e1 = c1092e1;
                                        objA = obj5;
                                        o11 = this;
                                        reader3 = reader2;
                                        c1092e2 = c1092e1;
                                        break;
                                    case 40:
                                        reader2 = reader3;
                                        obj5 = objA;
                                        reader2.readFixed64List(listFieldSchema.mutableListAt(obj3, t(iL)));
                                        c1092e1 = c1092e1;
                                        objA = obj5;
                                        o11 = this;
                                        reader3 = reader2;
                                        c1092e2 = c1092e1;
                                        break;
                                    case 41:
                                        reader2 = reader3;
                                        obj5 = objA;
                                        reader2.readFixed32List(listFieldSchema.mutableListAt(obj3, t(iL)));
                                        c1092e1 = c1092e1;
                                        objA = obj5;
                                        o11 = this;
                                        reader3 = reader2;
                                        c1092e2 = c1092e1;
                                        break;
                                    case DescriptorProtos.FileOptions.PHP_GENERIC_SERVICES_FIELD_NUMBER /* 42 */:
                                        reader2 = reader3;
                                        obj5 = objA;
                                        reader2.readBoolList(listFieldSchema.mutableListAt(obj3, t(iL)));
                                        c1092e1 = c1092e1;
                                        objA = obj5;
                                        o11 = this;
                                        reader3 = reader2;
                                        c1092e2 = c1092e1;
                                        break;
                                    case 43:
                                        o10 = o11;
                                        reader2 = reader3;
                                        obj2 = obj3;
                                        obj5 = objA;
                                        try {
                                            reader2.readUInt32List(listFieldSchema.mutableListAt(obj2, t(iL)));
                                            c1092e1 = c1092e1;
                                            objA = obj5;
                                        } catch (C1157y1 unused8) {
                                            objA = obj5;
                                            r2Var.getClass();
                                            if (objA == null) {
                                                objA = r2.a(obj2);
                                            }
                                            if (!r2.b(0, reader2, objA)) {
                                                objD3 = objA;
                                                while (i10 < i7) {
                                                    objD3 = o10.d(obj2, iArr[i10], objD3, r2Var, obj);
                                                    i10++;
                                                    o10 = this;
                                                    r2Var = r2Var;
                                                }
                                                if (objD3 != null) {
                                                    r2.c(obj2, objD3);
                                                    return;
                                                }
                                                return;
                                            }
                                        } catch (Throwable th5) {
                                            th = th5;
                                            objA = obj5;
                                            objD = objA;
                                            while (i10 < i7) {
                                                objD = d(obj2, iArr[i10], objD, r2Var, obj);
                                                i10++;
                                            }
                                            if (objD != null) {
                                                r2Var.getClass();
                                                r2.c(obj2, objD);
                                            }
                                            throw th;
                                        }
                                        o11 = this;
                                        reader3 = reader2;
                                        c1092e2 = c1092e1;
                                        break;
                                    case 44:
                                        o10 = o11;
                                        reader2 = reader3;
                                        obj4 = obj3;
                                        try {
                                            List<Integer> listMutableListAt2 = listFieldSchema.mutableListAt(obj4, t(iL));
                                            reader2.readEnumList(listMutableListAt2);
                                            obj5 = objA;
                                            try {
                                                objA = AbstractC1089d2.j(obj4, fieldNumber, listMutableListAt2, o10.e(iH), obj5, r2Var);
                                                c1092e1 = c1092e1;
                                            } catch (C1157y1 unused9) {
                                                obj2 = obj4;
                                                objA = obj5;
                                                r2Var.getClass();
                                                if (objA == null) {
                                                    objA = r2.a(obj2);
                                                }
                                                if (!r2.b(0, reader2, objA)) {
                                                    objD3 = objA;
                                                    while (i10 < i7) {
                                                        objD3 = o10.d(obj2, iArr[i10], objD3, r2Var, obj);
                                                        i10++;
                                                        o10 = this;
                                                        r2Var = r2Var;
                                                    }
                                                    if (objD3 != null) {
                                                        r2.c(obj2, objD3);
                                                        return;
                                                    }
                                                    return;
                                                }
                                            } catch (Throwable th6) {
                                                th = th6;
                                                obj2 = obj4;
                                                objA = obj5;
                                                objD = objA;
                                                while (i10 < i7) {
                                                    objD = d(obj2, iArr[i10], objD, r2Var, obj);
                                                    i10++;
                                                }
                                                if (objD != null) {
                                                    r2Var.getClass();
                                                    r2.c(obj2, objD);
                                                }
                                                throw th;
                                            }
                                        } catch (C1157y1 unused10) {
                                            r2Var = r2Var;
                                            c1092e1 = c1092e1;
                                            obj2 = obj4;
                                            r2Var.getClass();
                                            if (objA == null) {
                                                objA = r2.a(obj2);
                                            }
                                            if (!r2.b(0, reader2, objA)) {
                                                objD3 = objA;
                                                while (i10 < i7) {
                                                    objD3 = o10.d(obj2, iArr[i10], objD3, r2Var, obj);
                                                    i10++;
                                                    o10 = this;
                                                    r2Var = r2Var;
                                                }
                                                if (objD3 != null) {
                                                    r2.c(obj2, objD3);
                                                    return;
                                                }
                                                return;
                                            }
                                        } catch (Throwable th7) {
                                            th = th7;
                                            obj2 = obj4;
                                        }
                                        o11 = this;
                                        reader3 = reader2;
                                        c1092e2 = c1092e1;
                                        break;
                                    case 45:
                                        reader2 = reader3;
                                        obj4 = obj3;
                                        reader2.readSFixed32List(listFieldSchema.mutableListAt(obj4, t(iL)));
                                        c1092e1 = c1092e1;
                                        o11 = this;
                                        reader3 = reader2;
                                        c1092e2 = c1092e1;
                                        break;
                                    case 46:
                                        reader2 = reader3;
                                        obj4 = obj3;
                                        reader2.readSFixed64List(listFieldSchema.mutableListAt(obj4, t(iL)));
                                        c1092e1 = c1092e1;
                                        o11 = this;
                                        reader3 = reader2;
                                        c1092e2 = c1092e1;
                                        break;
                                    case ShareDialog.SHARE_BUSINESS_TYPE_JUNE_INVITE_TASK /* 47 */:
                                        reader2 = reader3;
                                        obj4 = obj3;
                                        reader2.readSInt32List(listFieldSchema.mutableListAt(obj4, t(iL)));
                                        c1092e1 = c1092e1;
                                        o11 = this;
                                        reader3 = reader2;
                                        c1092e2 = c1092e1;
                                        break;
                                    case 48:
                                        r2Var = r2Var;
                                        o10 = o11;
                                        reader2 = reader3;
                                        obj4 = obj3;
                                        try {
                                            try {
                                                reader2.readSInt64List(listFieldSchema.mutableListAt(obj4, t(iL)));
                                                c1092e1 = c1092e1;
                                            } catch (Throwable th8) {
                                                th = th8;
                                                obj2 = obj4;
                                                objD = objA;
                                                while (i10 < i7) {
                                                    objD = d(obj2, iArr[i10], objD, r2Var, obj);
                                                    i10++;
                                                }
                                                if (objD != null) {
                                                    r2Var.getClass();
                                                    r2.c(obj2, objD);
                                                }
                                                throw th;
                                            }
                                        } catch (C1157y1 unused11) {
                                            c1092e1 = c1092e1;
                                            obj2 = obj4;
                                            r2Var.getClass();
                                            if (objA == null) {
                                                objA = r2.a(obj2);
                                            }
                                            if (!r2.b(0, reader2, objA)) {
                                                objD3 = objA;
                                                while (i10 < i7) {
                                                    objD3 = o10.d(obj2, iArr[i10], objD3, r2Var, obj);
                                                    i10++;
                                                    o10 = this;
                                                    r2Var = r2Var;
                                                }
                                                if (objD3 != null) {
                                                    r2.c(obj2, objD3);
                                                    return;
                                                }
                                                return;
                                            }
                                        }
                                        o11 = this;
                                        reader3 = reader2;
                                        c1092e2 = c1092e1;
                                        break;
                                    case NavigationBarView.ITEM_GRAVITY_TOP_CENTER /* 49 */:
                                        r2Var = r2Var;
                                        try {
                                            obj2 = obj;
                                            try {
                                                o11.A(obj2, t(iL), reader, o11.g(iH), c1092e1);
                                                obj4 = obj2;
                                                reader2 = reader;
                                                c1092e1 = c1092e1;
                                            } catch (C1157y1 unused12) {
                                                c1092e1 = c1092e1;
                                                o10 = o11;
                                                reader2 = reader;
                                                r2Var.getClass();
                                                if (objA == null) {
                                                    objA = r2.a(obj2);
                                                }
                                                if (!r2.b(0, reader2, objA)) {
                                                    objD3 = objA;
                                                    while (i10 < i7) {
                                                        objD3 = o10.d(obj2, iArr[i10], objD3, r2Var, obj);
                                                        i10++;
                                                        o10 = this;
                                                        r2Var = r2Var;
                                                    }
                                                    if (objD3 != null) {
                                                        r2.c(obj2, objD3);
                                                        return;
                                                    }
                                                    return;
                                                }
                                            } catch (Throwable th9) {
                                                th = th9;
                                            }
                                            o11 = this;
                                            reader3 = reader2;
                                            c1092e2 = c1092e1;
                                        } catch (Throwable th10) {
                                            th = th10;
                                            obj4 = obj;
                                            obj2 = obj4;
                                        }
                                        break;
                                    case 50:
                                        r2Var = r2Var;
                                        try {
                                            o11.n(obj3, iH, o11.f(iH), c1092e2, reader);
                                            reader2 = reader;
                                            c1092e1 = c1092e1;
                                        } catch (C1157y1 unused13) {
                                            obj2 = obj;
                                            reader2 = reader;
                                            c1092e1 = c1092e1;
                                            o10 = o11;
                                            r2Var.getClass();
                                            if (objA == null) {
                                                objA = r2.a(obj2);
                                            }
                                            if (!r2.b(0, reader2, objA)) {
                                                objD3 = objA;
                                                while (i10 < i7) {
                                                    objD3 = o10.d(obj2, iArr[i10], objD3, r2Var, obj);
                                                    i10++;
                                                    o10 = this;
                                                    r2Var = r2Var;
                                                }
                                                if (objD3 != null) {
                                                    r2.c(obj2, objD3);
                                                    return;
                                                }
                                                return;
                                            }
                                        }
                                        o11 = this;
                                        reader3 = reader2;
                                        c1092e2 = c1092e1;
                                        break;
                                    case 51:
                                        w2.p(obj3, t(iL), Double.valueOf(reader3.readDouble()));
                                        o11.G(obj3, fieldNumber, iH);
                                        reader2 = reader3;
                                        c1092e1 = c1092e2;
                                        o11 = this;
                                        reader3 = reader2;
                                        c1092e2 = c1092e1;
                                        break;
                                    case 52:
                                        w2.p(obj3, t(iL), Float.valueOf(reader3.readFloat()));
                                        o11.G(obj3, fieldNumber, iH);
                                        reader2 = reader3;
                                        c1092e1 = c1092e2;
                                        o11 = this;
                                        reader3 = reader2;
                                        c1092e2 = c1092e1;
                                        break;
                                    case 53:
                                        w2.p(obj3, t(iL), Long.valueOf(reader3.readInt64()));
                                        o11.G(obj3, fieldNumber, iH);
                                        reader2 = reader3;
                                        c1092e1 = c1092e2;
                                        o11 = this;
                                        reader3 = reader2;
                                        c1092e2 = c1092e1;
                                        break;
                                    case 54:
                                        w2.p(obj3, t(iL), Long.valueOf(reader3.readUInt64()));
                                        o11.G(obj3, fieldNumber, iH);
                                        reader2 = reader3;
                                        c1092e1 = c1092e2;
                                        o11 = this;
                                        reader3 = reader2;
                                        c1092e2 = c1092e1;
                                        break;
                                    case 55:
                                        w2.p(obj3, t(iL), Integer.valueOf(reader3.readInt32()));
                                        o11.G(obj3, fieldNumber, iH);
                                        reader2 = reader3;
                                        c1092e1 = c1092e2;
                                        o11 = this;
                                        reader3 = reader2;
                                        c1092e2 = c1092e1;
                                        break;
                                    case 56:
                                        w2.p(obj3, t(iL), Long.valueOf(reader3.readFixed64()));
                                        o11.G(obj3, fieldNumber, iH);
                                        reader2 = reader3;
                                        c1092e1 = c1092e2;
                                        o11 = this;
                                        reader3 = reader2;
                                        c1092e2 = c1092e1;
                                        break;
                                    case 57:
                                        w2.p(obj3, t(iL), Integer.valueOf(reader3.readFixed32()));
                                        o11.G(obj3, fieldNumber, iH);
                                        reader2 = reader3;
                                        c1092e1 = c1092e2;
                                        o11 = this;
                                        reader3 = reader2;
                                        c1092e2 = c1092e1;
                                        break;
                                    case 58:
                                        w2.p(obj3, t(iL), Boolean.valueOf(reader3.readBool()));
                                        o11.G(obj3, fieldNumber, iH);
                                        reader2 = reader3;
                                        c1092e1 = c1092e2;
                                        o11 = this;
                                        reader3 = reader2;
                                        c1092e2 = c1092e1;
                                        break;
                                    case 59:
                                        o11.C(iL, reader3, obj3);
                                        o11.G(obj3, fieldNumber, iH);
                                        reader2 = reader3;
                                        c1092e1 = c1092e2;
                                        o11 = this;
                                        reader3 = reader2;
                                        c1092e2 = c1092e1;
                                        break;
                                    case PictureConfig.MAX_PAGE_SIZE /* 60 */:
                                        MessageLite messageLite3 = (MessageLite) o11.r(obj3, fieldNumber, iH);
                                        reader3.mergeMessageField(messageLite3, o11.g(iH), c1092e2);
                                        o11.J(obj3, fieldNumber, iH, messageLite3);
                                        reader2 = reader3;
                                        c1092e1 = c1092e2;
                                        o11 = this;
                                        reader3 = reader2;
                                        c1092e2 = c1092e1;
                                        break;
                                    case HomeMenuBean.BOTTOM_TAB_HOME /* 61 */:
                                        w2.p(obj3, t(iL), reader3.readBytes());
                                        o11.G(obj3, fieldNumber, iH);
                                        reader2 = reader3;
                                        c1092e1 = c1092e2;
                                        o11 = this;
                                        reader3 = reader2;
                                        c1092e2 = c1092e1;
                                        break;
                                    case HomeMenuBean.BOTTOM_TAB_ME /* 62 */:
                                        w2.p(obj3, t(iL), Integer.valueOf(reader3.readUInt32()));
                                        o11.G(obj3, fieldNumber, iH);
                                        reader2 = reader3;
                                        c1092e1 = c1092e2;
                                        o11 = this;
                                        reader3 = reader2;
                                        c1092e2 = c1092e1;
                                        break;
                                    case HomeMenuBean.BOTTOM_TAB_FINANCE /* 63 */:
                                        int i12 = reader3.readEnum();
                                        Internal$EnumVerifier internal$EnumVerifierE2 = o11.e(iH);
                                        if (internal$EnumVerifierE2 == null || internal$EnumVerifierE2.isInRange(i12)) {
                                            w2.p(obj3, t(iL), Integer.valueOf(i12));
                                            o11.G(obj3, fieldNumber, iH);
                                        } else {
                                            objA = AbstractC1089d2.n(obj3, fieldNumber, i12, objA, r2Var);
                                        }
                                        reader2 = reader3;
                                        c1092e1 = c1092e2;
                                        o11 = this;
                                        reader3 = reader2;
                                        c1092e2 = c1092e1;
                                        break;
                                    case 64:
                                        w2.p(obj3, t(iL), Integer.valueOf(reader3.readSFixed32()));
                                        o11.G(obj3, fieldNumber, iH);
                                        reader2 = reader3;
                                        c1092e1 = c1092e2;
                                        o11 = this;
                                        reader3 = reader2;
                                        c1092e2 = c1092e1;
                                        break;
                                    case HomeMenuBean.BOTTOM_TAB_INVEST /* 65 */:
                                        w2.p(obj3, t(iL), Long.valueOf(reader3.readSFixed64()));
                                        o11.G(obj3, fieldNumber, iH);
                                        reader2 = reader3;
                                        c1092e1 = c1092e2;
                                        o11 = this;
                                        reader3 = reader2;
                                        c1092e2 = c1092e1;
                                        break;
                                    case HomeMenuBean.BOTTOM_TAB_GIVEAWAY /* 66 */:
                                        w2.p(obj3, t(iL), Integer.valueOf(reader3.readSInt32()));
                                        o11.G(obj3, fieldNumber, iH);
                                        reader2 = reader3;
                                        c1092e1 = c1092e2;
                                        o11 = this;
                                        reader3 = reader2;
                                        c1092e2 = c1092e1;
                                        break;
                                    case 67:
                                        w2.p(obj3, t(iL), Long.valueOf(reader3.readSInt64()));
                                        o11.G(obj3, fieldNumber, iH);
                                        reader2 = reader3;
                                        c1092e1 = c1092e2;
                                        o11 = this;
                                        reader3 = reader2;
                                        c1092e2 = c1092e1;
                                        break;
                                    case 68:
                                        try {
                                            MessageLite messageLite4 = (MessageLite) o11.r(obj3, fieldNumber, iH);
                                            reader3.mergeGroupField(messageLite4, o11.g(iH), c1092e2);
                                            o11.J(obj3, fieldNumber, iH, messageLite4);
                                            reader2 = reader3;
                                            c1092e1 = c1092e2;
                                        } catch (C1157y1 unused14) {
                                            o10 = o11;
                                            reader2 = reader3;
                                            c1092e1 = c1092e2;
                                            obj2 = obj3;
                                            r2Var.getClass();
                                            if (objA == null) {
                                                objA = r2.a(obj2);
                                            }
                                            if (!r2.b(0, reader2, objA)) {
                                                objD3 = objA;
                                                while (i10 < i7) {
                                                    objD3 = o10.d(obj2, iArr[i10], objD3, r2Var, obj);
                                                    i10++;
                                                    o10 = this;
                                                    r2Var = r2Var;
                                                }
                                                if (objD3 != null) {
                                                    r2.c(obj2, objD3);
                                                    return;
                                                }
                                                return;
                                            }
                                        }
                                        o11 = this;
                                        reader3 = reader2;
                                        c1092e2 = c1092e1;
                                        break;
                                    default:
                                        if (objA == null) {
                                            r2Var.getClass();
                                            objA = r2.a(obj3);
                                        }
                                        try {
                                            r2Var.getClass();
                                            if (!r2.b(0, reader3, objA)) {
                                                objD2 = objA;
                                                while (i10 < i7) {
                                                    objD2 = o11.d(obj, iArr[i10], objD2, r2Var, obj);
                                                    obj3 = obj;
                                                    i10++;
                                                }
                                                if (objD2 == null) {
                                                    return;
                                                }
                                                r2.c(obj3, objD2);
                                                return;
                                            }
                                            reader2 = reader3;
                                            c1092e1 = c1092e2;
                                            o11 = this;
                                            reader3 = reader2;
                                            c1092e2 = c1092e1;
                                        } catch (Throwable th11) {
                                            th = th11;
                                            obj2 = obj3;
                                            objD = objA;
                                            while (i10 < i7) {
                                                objD = d(obj2, iArr[i10], objD, r2Var, obj);
                                                i10++;
                                            }
                                            if (objD != null) {
                                                r2Var.getClass();
                                                r2.c(obj2, objD);
                                            }
                                            throw th;
                                        }
                                        break;
                                }
                            } catch (C1157y1 unused15) {
                            }
                        } catch (Throwable th12) {
                            th = th12;
                        }
                    } catch (Throwable th13) {
                        th = th13;
                    }
                } else {
                    if (fieldNumber == Integer.MAX_VALUE) {
                        Object objD4 = objA;
                        while (i10 < i7) {
                            objD4 = o11.d(obj, iArr[i10], objD4, r2Var, obj);
                            i10++;
                        }
                        if (objD4 != null) {
                            r2Var.getClass();
                            r2.c(obj, objD4);
                            return;
                        }
                        return;
                    }
                    Object obj6 = obj;
                    try {
                        if (o11.f16525f) {
                            abstractC1096f1.a(c1092e2, o11.f16524e, fieldNumber);
                        }
                        r2Var.getClass();
                        if (objA == null) {
                            try {
                                objA = r2.a(obj6);
                            } catch (Throwable th14) {
                                th = th14;
                                obj2 = obj6;
                            }
                        }
                        if (!r2.b(0, reader3, objA)) {
                            objD2 = objA;
                            while (i10 < i7) {
                                objD2 = o11.d(obj, iArr[i10], objD2, r2Var, obj);
                                i10++;
                                obj6 = obj;
                            }
                            obj3 = obj6;
                            if (objD2 == null) {
                                return;
                            }
                            r2.c(obj3, objD2);
                            return;
                        }
                    } catch (Throwable th15) {
                        th = th15;
                        obj3 = obj6;
                        obj2 = obj3;
                    }
                }
            } catch (Throwable th16) {
                th = th16;
                obj2 = obj;
            }
            objD = objA;
            while (i10 < i7) {
                objD = d(obj2, iArr[i10], objD, r2Var, obj);
                i10++;
            }
            if (objD != null) {
                r2Var.getClass();
                r2.c(obj2, objD);
            }
            throw th;
        }
    }

    /* JADX WARN: Code duplicated, block: B:25:0x006c  */
    /* JADX WARN: Code duplicated, block: B:27:0x0072  */
    /* JADX WARN: Code duplicated, block: B:43:0x007f A[SYNTHETIC] */
    @Override // androidx.datastore.preferences.protobuf.Schema
    public final void makeImmutable(Object obj) {
        if (k(obj)) {
            if (obj instanceof AbstractC1145u1) {
                AbstractC1145u1 abstractC1145u1 = (AbstractC1145u1) obj;
                abstractC1145u1.m(Integer.MAX_VALUE);
                abstractC1145u1.memoizedHashCode = 0;
                abstractC1145u1.i();
            }
            int[] iArr = this.f16520a;
            int length = iArr.length;
            for (int i7 = 0; i7 < length; i7 += 3) {
                int iL = L(i7);
                long j6 = 1048575 & iL;
                int iK = K(iL);
                if (iK != 9) {
                    if (iK != 60 && iK != 68) {
                        switch (iK) {
                            case 17:
                                if (i(obj, i7)) {
                                    g(i7).makeImmutable(f16519q.getObject(obj, j6));
                                }
                                break;
                            case 18:
                            case 19:
                            case 20:
                            case 21:
                            case 22:
                            case 23:
                            case 24:
                            case Service.MONITORED_RESOURCES_FIELD_NUMBER /* 25 */:
                            case 26:
                            case 27:
                            case 28:
                            case 29:
                            case BillBusinessType.BUSINESS_TYPE_COMMERCE_RETAIL_TRADE_PAYMENTS /* 30 */:
                            case 31:
                            case 32:
                            case 33:
                            case 34:
                            case 35:
                            case 36:
                            case 37:
                            case BillBusinessType.BUSINESS_TYPE_TRIP /* 38 */:
                            case 39:
                            case 40:
                            case 41:
                            case DescriptorProtos.FileOptions.PHP_GENERIC_SERVICES_FIELD_NUMBER /* 42 */:
                            case 43:
                            case 44:
                            case 45:
                            case 46:
                            case ShareDialog.SHARE_BUSINESS_TYPE_JUNE_INVITE_TASK /* 47 */:
                            case 48:
                            case NavigationBarView.ITEM_GRAVITY_TOP_CENTER /* 49 */:
                                this.f16531l.makeImmutableListAt(obj, j6);
                                break;
                            case 50:
                                Unsafe unsafe = f16519q;
                                Object object = unsafe.getObject(obj, j6);
                                if (object != null) {
                                    unsafe.putObject(obj, j6, this.f16534o.toImmutable(object));
                                }
                                break;
                        }
                    } else if (l(obj, iArr[i7], i7)) {
                        g(i7).makeImmutable(f16519q.getObject(obj, j6));
                    }
                } else if (i(obj, i7)) {
                    g(i7).makeImmutable(f16519q.getObject(obj, j6));
                }
            }
            this.f16532m.getClass();
            q2 q2Var = ((AbstractC1145u1) obj).unknownFields;
            if (q2Var.f16756e) {
                q2Var.f16756e = false;
            }
            if (this.f16525f) {
                ((C1100g1) this.f16533n).getClass();
                ((AbstractC1142t1) obj).extensions.i();
            }
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:9:0x0022  */
    @Override // androidx.datastore.preferences.protobuf.Schema
    public final void mergeFrom(Object obj, Object obj2) {
        Object obj3;
        b(obj);
        obj2.getClass();
        int i7 = 0;
        while (true) {
            int[] iArr = this.f16520a;
            if (i7 >= iArr.length) {
                Object obj4 = obj;
                AbstractC1089d2.l(this.f16532m, obj4, obj2);
                if (this.f16525f) {
                    AbstractC1089d2.k(this.f16533n, obj4, obj2);
                    return;
                }
                return;
            }
            int iL = L(i7);
            long j6 = 1048575 & iL;
            int i10 = iArr[i7];
            switch (K(iL)) {
                case 0:
                    if (!i(obj2, i7)) {
                        obj3 = obj;
                    } else {
                        v2 v2Var = w2.f16802c;
                        obj3 = obj;
                        v2Var.o(obj3, j6, v2Var.g(obj2, j6));
                        F(obj3, i7);
                    }
                    break;
                case 1:
                    if (i(obj2, i7)) {
                        v2 v2Var2 = w2.f16802c;
                        v2Var2.p(obj, j6, v2Var2.h(obj2, j6));
                        F(obj, i7);
                    }
                    obj3 = obj;
                    break;
                case 2:
                    if (i(obj2, i7)) {
                        w2.o(obj, j6, w2.f16802c.j(obj2, j6));
                        F(obj, i7);
                    }
                    obj3 = obj;
                    break;
                case 3:
                    if (i(obj2, i7)) {
                        w2.o(obj, j6, w2.f16802c.j(obj2, j6));
                        F(obj, i7);
                    }
                    obj3 = obj;
                    break;
                case 4:
                    if (i(obj2, i7)) {
                        w2.n(obj, j6, w2.f16802c.i(obj2, j6));
                        F(obj, i7);
                    }
                    obj3 = obj;
                    break;
                case 5:
                    if (i(obj2, i7)) {
                        w2.o(obj, j6, w2.f16802c.j(obj2, j6));
                        F(obj, i7);
                    }
                    obj3 = obj;
                    break;
                case 6:
                    if (i(obj2, i7)) {
                        w2.n(obj, j6, w2.f16802c.i(obj2, j6));
                        F(obj, i7);
                    }
                    obj3 = obj;
                    break;
                case 7:
                    if (i(obj2, i7)) {
                        v2 v2Var3 = w2.f16802c;
                        v2Var3.m(obj, j6, v2Var3.d(obj2, j6));
                        F(obj, i7);
                    }
                    obj3 = obj;
                    break;
                case 8:
                    if (i(obj2, i7)) {
                        w2.p(obj, j6, w2.f16802c.k(obj2, j6));
                        F(obj, i7);
                    }
                    obj3 = obj;
                    break;
                case 9:
                    o(obj, obj2, i7);
                    obj3 = obj;
                    break;
                case 10:
                    if (i(obj2, i7)) {
                        w2.p(obj, j6, w2.f16802c.k(obj2, j6));
                        F(obj, i7);
                    }
                    obj3 = obj;
                    break;
                case 11:
                    if (i(obj2, i7)) {
                        w2.n(obj, j6, w2.f16802c.i(obj2, j6));
                        F(obj, i7);
                    }
                    obj3 = obj;
                    break;
                case 12:
                    if (i(obj2, i7)) {
                        w2.n(obj, j6, w2.f16802c.i(obj2, j6));
                        F(obj, i7);
                    }
                    obj3 = obj;
                    break;
                case 13:
                    if (i(obj2, i7)) {
                        w2.n(obj, j6, w2.f16802c.i(obj2, j6));
                        F(obj, i7);
                    }
                    obj3 = obj;
                    break;
                case 14:
                    if (i(obj2, i7)) {
                        w2.o(obj, j6, w2.f16802c.j(obj2, j6));
                        F(obj, i7);
                    }
                    obj3 = obj;
                    break;
                case 15:
                    if (i(obj2, i7)) {
                        w2.n(obj, j6, w2.f16802c.i(obj2, j6));
                        F(obj, i7);
                    }
                    obj3 = obj;
                    break;
                case 16:
                    if (i(obj2, i7)) {
                        w2.o(obj, j6, w2.f16802c.j(obj2, j6));
                        F(obj, i7);
                    }
                    obj3 = obj;
                    break;
                case 17:
                    o(obj, obj2, i7);
                    obj3 = obj;
                    break;
                case 18:
                case 19:
                case 20:
                case 21:
                case 22:
                case 23:
                case 24:
                case Service.MONITORED_RESOURCES_FIELD_NUMBER /* 25 */:
                case 26:
                case 27:
                case 28:
                case 29:
                case BillBusinessType.BUSINESS_TYPE_COMMERCE_RETAIL_TRADE_PAYMENTS /* 30 */:
                case 31:
                case 32:
                case 33:
                case 34:
                case 35:
                case 36:
                case 37:
                case BillBusinessType.BUSINESS_TYPE_TRIP /* 38 */:
                case 39:
                case 40:
                case 41:
                case DescriptorProtos.FileOptions.PHP_GENERIC_SERVICES_FIELD_NUMBER /* 42 */:
                case 43:
                case 44:
                case 45:
                case 46:
                case ShareDialog.SHARE_BUSINESS_TYPE_JUNE_INVITE_TASK /* 47 */:
                case 48:
                case NavigationBarView.ITEM_GRAVITY_TOP_CENTER /* 49 */:
                    this.f16531l.mergeListsAt(obj, obj2, j6);
                    obj3 = obj;
                    break;
                case 50:
                    Class cls = AbstractC1089d2.f16600a;
                    v2 v2Var4 = w2.f16802c;
                    w2.p(obj, j6, this.f16534o.mergeFrom(v2Var4.k(obj, j6), v2Var4.k(obj2, j6)));
                    obj3 = obj;
                    break;
                case 51:
                case 52:
                case 53:
                case 54:
                case 55:
                case 56:
                case 57:
                case 58:
                case 59:
                    if (l(obj2, i10, i7)) {
                        w2.p(obj, j6, w2.f16802c.k(obj2, j6));
                        G(obj, i10, i7);
                    }
                    obj3 = obj;
                    break;
                case PictureConfig.MAX_PAGE_SIZE /* 60 */:
                    p(obj, obj2, i7);
                    obj3 = obj;
                    break;
                case HomeMenuBean.BOTTOM_TAB_HOME /* 61 */:
                case HomeMenuBean.BOTTOM_TAB_ME /* 62 */:
                case HomeMenuBean.BOTTOM_TAB_FINANCE /* 63 */:
                case 64:
                case HomeMenuBean.BOTTOM_TAB_INVEST /* 65 */:
                case HomeMenuBean.BOTTOM_TAB_GIVEAWAY /* 66 */:
                case 67:
                    if (l(obj2, i10, i7)) {
                        w2.p(obj, j6, w2.f16802c.k(obj2, j6));
                        G(obj, i10, i7);
                    }
                    obj3 = obj;
                    break;
                case 68:
                    p(obj, obj2, i7);
                    obj3 = obj;
                    break;
                default:
                    obj3 = obj;
                    break;
            }
            i7 += 3;
            obj = obj3;
        }
    }

    public final void n(Object obj, int i7, Object obj2, C1092e1 c1092e1, Reader reader) throws IOException {
        long jL = L(i7) & 1048575;
        Object objK = w2.f16802c.k(obj, jL);
        MapFieldSchema mapFieldSchema = this.f16534o;
        if (objK == null) {
            objK = mapFieldSchema.newMapField(obj2);
            w2.p(obj, jL, objK);
        } else if (mapFieldSchema.isImmutable(objK)) {
            Object objNewMapField = mapFieldSchema.newMapField(obj2);
            mapFieldSchema.mergeFrom(objNewMapField, objK);
            w2.p(obj, jL, objNewMapField);
            objK = objNewMapField;
        }
        reader.readMap(mapFieldSchema.forMutableMapData(objK), mapFieldSchema.forMapMetadata(obj2), c1092e1);
    }

    @Override // androidx.datastore.preferences.protobuf.Schema
    public final Object newInstance() {
        return this.f16530k.newInstance(this.f16524e);
    }

    public final void o(Object obj, Object obj2, int i7) {
        if (i(obj2, i7)) {
            long jL = L(i7) & 1048575;
            Unsafe unsafe = f16519q;
            Object object = unsafe.getObject(obj2, jL);
            if (object == null) {
                throw new IllegalStateException("Source subfield " + this.f16520a[i7] + " is present but null: " + obj2);
            }
            Schema schemaG = g(i7);
            if (!i(obj, i7)) {
                if (k(object)) {
                    Object objNewInstance = schemaG.newInstance();
                    schemaG.mergeFrom(objNewInstance, object);
                    unsafe.putObject(obj, jL, objNewInstance);
                } else {
                    unsafe.putObject(obj, jL, object);
                }
                F(obj, i7);
                return;
            }
            Object object2 = unsafe.getObject(obj, jL);
            if (!k(object2)) {
                Object objNewInstance2 = schemaG.newInstance();
                schemaG.mergeFrom(objNewInstance2, object2);
                unsafe.putObject(obj, jL, objNewInstance2);
                object2 = objNewInstance2;
            }
            schemaG.mergeFrom(object2, object);
        }
    }

    public final void p(Object obj, Object obj2, int i7) {
        int[] iArr = this.f16520a;
        int i10 = iArr[i7];
        if (l(obj2, i10, i7)) {
            long jL = L(i7) & 1048575;
            Unsafe unsafe = f16519q;
            Object object = unsafe.getObject(obj2, jL);
            if (object == null) {
                throw new IllegalStateException("Source subfield " + iArr[i7] + " is present but null: " + obj2);
            }
            Schema schemaG = g(i7);
            if (!l(obj, i10, i7)) {
                if (k(object)) {
                    Object objNewInstance = schemaG.newInstance();
                    schemaG.mergeFrom(objNewInstance, object);
                    unsafe.putObject(obj, jL, objNewInstance);
                } else {
                    unsafe.putObject(obj, jL, object);
                }
                G(obj, i10, i7);
                return;
            }
            Object object2 = unsafe.getObject(obj, jL);
            if (!k(object2)) {
                Object objNewInstance2 = schemaG.newInstance();
                schemaG.mergeFrom(objNewInstance2, object2);
                unsafe.putObject(obj, jL, objNewInstance2);
                object2 = objNewInstance2;
            }
            schemaG.mergeFrom(object2, object);
        }
    }

    public final Object q(Object obj, int i7) {
        Schema schemaG = g(i7);
        long jL = L(i7) & 1048575;
        if (!i(obj, i7)) {
            return schemaG.newInstance();
        }
        Object object = f16519q.getObject(obj, jL);
        if (k(object)) {
            return object;
        }
        Object objNewInstance = schemaG.newInstance();
        if (object != null) {
            schemaG.mergeFrom(objNewInstance, object);
        }
        return objNewInstance;
    }

    public final Object r(Object obj, int i7, int i10) {
        Schema schemaG = g(i10);
        if (!l(obj, i7, i10)) {
            return schemaG.newInstance();
        }
        Object object = f16519q.getObject(obj, L(i10) & 1048575);
        if (k(object)) {
            return object;
        }
        Object objNewInstance = schemaG.newInstance();
        if (object != null) {
            schemaG.mergeFrom(objNewInstance, object);
        }
        return objNewInstance;
    }

    public final int w(Object obj, byte[] bArr, int i7, int i10, int i11, long j6, C1098g c1098g) throws IOException {
        int iC;
        Unsafe unsafe = f16519q;
        Object objF = f(i11);
        Object object = unsafe.getObject(obj, j6);
        MapFieldSchema mapFieldSchema = this.f16534o;
        if (mapFieldSchema.isImmutable(object)) {
            Object objNewMapField = mapFieldSchema.newMapField(objF);
            mapFieldSchema.mergeFrom(objNewMapField, object);
            unsafe.putObject(obj, j6, objNewMapField);
            object = objNewMapField;
        }
        I1 i1ForMapMetadata = mapFieldSchema.forMapMetadata(objF);
        Map<?, ?> mapForMutableMapData = mapFieldSchema.forMutableMapData(object);
        int iM = AbstractC1102h.m(bArr, i7, c1098g);
        int i12 = c1098g.f16616a;
        if (i12 < 0 || i12 > i10 - iM) {
            throw C1160z1.g();
        }
        int i13 = iM + i12;
        i1ForMapMetadata.getClass();
        AbstractC1145u1 abstractC1145u1 = i1ForMapMetadata.f16497c;
        Object obj2 = "";
        Object obj3 = abstractC1145u1;
        while (iM < i13) {
            int iL = iM + 1;
            int i14 = bArr[iM];
            if (i14 < 0) {
                iL = AbstractC1102h.l(i14, bArr, iL, c1098g);
                i14 = c1098g.f16616a;
            }
            int i15 = i14 >>> 3;
            int i16 = i14 & 7;
            if (i15 != 1) {
                if (i15 == 2) {
                    F2 f10 = i1ForMapMetadata.f16496b;
                    if (i16 == f10.f16494b) {
                        iC = c(bArr, iL, i10, f10, abstractC1145u1.getClass(), c1098g);
                        obj2 = obj2;
                        obj3 = c1098g.f16618c;
                        iM = iC;
                    }
                }
                iM = AbstractC1102h.v(i14, bArr, iL, i10, c1098g);
            } else {
                D2 d2 = i1ForMapMetadata.f16495a;
                if (i16 == d2.f16494b) {
                    iC = c(bArr, iL, i10, d2, null, c1098g);
                    obj2 = c1098g.f16618c;
                    obj3 = obj3;
                    iM = iC;
                } else {
                    iM = AbstractC1102h.v(i14, bArr, iL, i10, c1098g);
                }
            }
        }
        if (iM != i13) {
            throw C1160z1.f();
        }
        mapForMutableMapData.put(obj2, obj3);
        return i13;
    }

    /* JADX WARN: Code duplicated, block: B:16:0x0054  */
    @Override // androidx.datastore.preferences.protobuf.Schema
    public final void writeTo(Object obj, Writer writer) throws IOException {
        Map.Entry entry;
        Iterator it;
        if (writer.fieldOrder() != J2.f16511b) {
            M(obj, writer);
            return;
        }
        this.f16532m.getClass();
        ((AbstractC1145u1) obj).unknownFields.f(writer);
        boolean z3 = this.f16525f;
        AbstractC1096f1 abstractC1096f1 = this.f16533n;
        if (z3) {
            ((C1100g1) abstractC1096f1).getClass();
            C1122m1 c1122m1 = ((AbstractC1142t1) obj).extensions;
            if (c1122m1.f16696a.isEmpty()) {
                entry = null;
            } else {
                C1093e2 c1093e2 = c1122m1.f16696a;
                if (c1093e2.isEmpty()) {
                    it = Collections.emptyIterator();
                } else {
                    if (c1093e2.f16612f == null) {
                        c1093e2.f16612f = new C1101g2(c1093e2);
                    }
                    it = c1093e2.f16612f.iterator();
                }
                entry = (Map.Entry) it.next();
            }
        } else {
            entry = null;
        }
        int[] iArr = this.f16520a;
        for (int length = iArr.length - 3; length >= 0; length -= 3) {
            int iL = L(length);
            int i7 = iArr[length];
            if (entry != null) {
                ((C1100g1) abstractC1096f1).getClass();
                androidx.camera.video.u.t(entry.getKey());
                throw null;
            }
            switch (K(iL)) {
                case 0:
                    if (i(obj, length)) {
                        writer.writeDouble(i7, w2.f16802c.g(obj, iL & 1048575));
                    }
                    break;
                case 1:
                    if (i(obj, length)) {
                        writer.writeFloat(i7, w2.f16802c.h(obj, iL & 1048575));
                    }
                    break;
                case 2:
                    if (i(obj, length)) {
                        writer.writeInt64(i7, w2.f16802c.j(obj, iL & 1048575));
                    }
                    break;
                case 3:
                    if (i(obj, length)) {
                        writer.writeUInt64(i7, w2.f16802c.j(obj, iL & 1048575));
                    }
                    break;
                case 4:
                    if (i(obj, length)) {
                        writer.writeInt32(i7, w2.f16802c.i(obj, iL & 1048575));
                    }
                    break;
                case 5:
                    if (i(obj, length)) {
                        writer.writeFixed64(i7, w2.f16802c.j(obj, iL & 1048575));
                    }
                    break;
                case 6:
                    if (i(obj, length)) {
                        writer.writeFixed32(i7, w2.f16802c.i(obj, iL & 1048575));
                    }
                    break;
                case 7:
                    if (i(obj, length)) {
                        writer.writeBool(i7, w2.f16802c.d(obj, iL & 1048575));
                    }
                    break;
                case 8:
                    if (i(obj, length)) {
                        N(i7, w2.f16802c.k(obj, iL & 1048575), writer);
                    }
                    break;
                case 9:
                    if (i(obj, length)) {
                        writer.writeMessage(i7, w2.f16802c.k(obj, iL & 1048575), g(length));
                    }
                    break;
                case 10:
                    if (i(obj, length)) {
                        writer.writeBytes(i7, (AbstractC1123n) w2.f16802c.k(obj, iL & 1048575));
                    }
                    break;
                case 11:
                    if (i(obj, length)) {
                        writer.writeUInt32(i7, w2.f16802c.i(obj, iL & 1048575));
                    }
                    break;
                case 12:
                    if (i(obj, length)) {
                        writer.writeEnum(i7, w2.f16802c.i(obj, iL & 1048575));
                    }
                    break;
                case 13:
                    if (i(obj, length)) {
                        writer.writeSFixed32(i7, w2.f16802c.i(obj, iL & 1048575));
                    }
                    break;
                case 14:
                    if (i(obj, length)) {
                        writer.writeSFixed64(i7, w2.f16802c.j(obj, iL & 1048575));
                    }
                    break;
                case 15:
                    if (i(obj, length)) {
                        writer.writeSInt32(i7, w2.f16802c.i(obj, iL & 1048575));
                    }
                    break;
                case 16:
                    if (i(obj, length)) {
                        writer.writeSInt64(i7, w2.f16802c.j(obj, iL & 1048575));
                    }
                    break;
                case 17:
                    if (i(obj, length)) {
                        writer.writeGroup(i7, w2.f16802c.k(obj, iL & 1048575), g(length));
                    }
                    break;
                case 18:
                    int i10 = iArr[length];
                    List<Double> list = (List) w2.f16802c.k(obj, iL & 1048575);
                    Class cls = AbstractC1089d2.f16600a;
                    if (list != null && !list.isEmpty()) {
                        writer.writeDoubleList(i10, list, false);
                    }
                    break;
                case 19:
                    int i11 = iArr[length];
                    List<Float> list2 = (List) w2.f16802c.k(obj, iL & 1048575);
                    Class cls2 = AbstractC1089d2.f16600a;
                    if (list2 != null && !list2.isEmpty()) {
                        writer.writeFloatList(i11, list2, false);
                    }
                    break;
                case 20:
                    int i12 = iArr[length];
                    List<Long> list3 = (List) w2.f16802c.k(obj, iL & 1048575);
                    Class cls3 = AbstractC1089d2.f16600a;
                    if (list3 != null && !list3.isEmpty()) {
                        writer.writeInt64List(i12, list3, false);
                    }
                    break;
                case 21:
                    int i13 = iArr[length];
                    List<Long> list4 = (List) w2.f16802c.k(obj, iL & 1048575);
                    Class cls4 = AbstractC1089d2.f16600a;
                    if (list4 != null && !list4.isEmpty()) {
                        writer.writeUInt64List(i13, list4, false);
                    }
                    break;
                case 22:
                    int i14 = iArr[length];
                    List<Integer> list5 = (List) w2.f16802c.k(obj, iL & 1048575);
                    Class cls5 = AbstractC1089d2.f16600a;
                    if (list5 != null && !list5.isEmpty()) {
                        writer.writeInt32List(i14, list5, false);
                    }
                    break;
                case 23:
                    int i15 = iArr[length];
                    List<Long> list6 = (List) w2.f16802c.k(obj, iL & 1048575);
                    Class cls6 = AbstractC1089d2.f16600a;
                    if (list6 != null && !list6.isEmpty()) {
                        writer.writeFixed64List(i15, list6, false);
                    }
                    break;
                case 24:
                    int i16 = iArr[length];
                    List<Integer> list7 = (List) w2.f16802c.k(obj, iL & 1048575);
                    Class cls7 = AbstractC1089d2.f16600a;
                    if (list7 != null && !list7.isEmpty()) {
                        writer.writeFixed32List(i16, list7, false);
                    }
                    break;
                case Service.MONITORED_RESOURCES_FIELD_NUMBER /* 25 */:
                    int i17 = iArr[length];
                    List<Boolean> list8 = (List) w2.f16802c.k(obj, iL & 1048575);
                    Class cls8 = AbstractC1089d2.f16600a;
                    if (list8 != null && !list8.isEmpty()) {
                        writer.writeBoolList(i17, list8, false);
                    }
                    break;
                case 26:
                    int i18 = iArr[length];
                    List<String> list9 = (List) w2.f16802c.k(obj, iL & 1048575);
                    Class cls9 = AbstractC1089d2.f16600a;
                    if (list9 != null && !list9.isEmpty()) {
                        writer.writeStringList(i18, list9);
                    }
                    break;
                case 27:
                    int i19 = iArr[length];
                    List<?> list10 = (List) w2.f16802c.k(obj, iL & 1048575);
                    Schema schemaG = g(length);
                    Class cls10 = AbstractC1089d2.f16600a;
                    if (list10 != null && !list10.isEmpty()) {
                        writer.writeMessageList(i19, list10, schemaG);
                    }
                    break;
                case 28:
                    int i20 = iArr[length];
                    List<AbstractC1123n> list11 = (List) w2.f16802c.k(obj, iL & 1048575);
                    Class cls11 = AbstractC1089d2.f16600a;
                    if (list11 != null && !list11.isEmpty()) {
                        writer.writeBytesList(i20, list11);
                    }
                    break;
                case 29:
                    int i21 = iArr[length];
                    List<Integer> list12 = (List) w2.f16802c.k(obj, iL & 1048575);
                    Class cls12 = AbstractC1089d2.f16600a;
                    if (list12 != null && !list12.isEmpty()) {
                        writer.writeUInt32List(i21, list12, false);
                    }
                    break;
                case BillBusinessType.BUSINESS_TYPE_COMMERCE_RETAIL_TRADE_PAYMENTS /* 30 */:
                    int i22 = iArr[length];
                    List<Integer> list13 = (List) w2.f16802c.k(obj, iL & 1048575);
                    Class cls13 = AbstractC1089d2.f16600a;
                    if (list13 != null && !list13.isEmpty()) {
                        writer.writeEnumList(i22, list13, false);
                    }
                    break;
                case 31:
                    int i23 = iArr[length];
                    List<Integer> list14 = (List) w2.f16802c.k(obj, iL & 1048575);
                    Class cls14 = AbstractC1089d2.f16600a;
                    if (list14 != null && !list14.isEmpty()) {
                        writer.writeSFixed32List(i23, list14, false);
                    }
                    break;
                case 32:
                    int i24 = iArr[length];
                    List<Long> list15 = (List) w2.f16802c.k(obj, iL & 1048575);
                    Class cls15 = AbstractC1089d2.f16600a;
                    if (list15 != null && !list15.isEmpty()) {
                        writer.writeSFixed64List(i24, list15, false);
                    }
                    break;
                case 33:
                    int i25 = iArr[length];
                    List<Integer> list16 = (List) w2.f16802c.k(obj, iL & 1048575);
                    Class cls16 = AbstractC1089d2.f16600a;
                    if (list16 != null && !list16.isEmpty()) {
                        writer.writeSInt32List(i25, list16, false);
                    }
                    break;
                case 34:
                    int i26 = iArr[length];
                    List<Long> list17 = (List) w2.f16802c.k(obj, iL & 1048575);
                    Class cls17 = AbstractC1089d2.f16600a;
                    if (list17 != null && !list17.isEmpty()) {
                        writer.writeSInt64List(i26, list17, false);
                    }
                    break;
                case 35:
                    int i27 = iArr[length];
                    List<Double> list18 = (List) w2.f16802c.k(obj, iL & 1048575);
                    Class cls18 = AbstractC1089d2.f16600a;
                    if (list18 != null && !list18.isEmpty()) {
                        writer.writeDoubleList(i27, list18, true);
                    }
                    break;
                case 36:
                    int i28 = iArr[length];
                    List<Float> list19 = (List) w2.f16802c.k(obj, iL & 1048575);
                    Class cls19 = AbstractC1089d2.f16600a;
                    if (list19 != null && !list19.isEmpty()) {
                        writer.writeFloatList(i28, list19, true);
                    }
                    break;
                case 37:
                    int i29 = iArr[length];
                    List<Long> list20 = (List) w2.f16802c.k(obj, iL & 1048575);
                    Class cls20 = AbstractC1089d2.f16600a;
                    if (list20 != null && !list20.isEmpty()) {
                        writer.writeInt64List(i29, list20, true);
                    }
                    break;
                case BillBusinessType.BUSINESS_TYPE_TRIP /* 38 */:
                    int i30 = iArr[length];
                    List<Long> list21 = (List) w2.f16802c.k(obj, iL & 1048575);
                    Class cls21 = AbstractC1089d2.f16600a;
                    if (list21 != null && !list21.isEmpty()) {
                        writer.writeUInt64List(i30, list21, true);
                    }
                    break;
                case 39:
                    int i31 = iArr[length];
                    List<Integer> list22 = (List) w2.f16802c.k(obj, iL & 1048575);
                    Class cls22 = AbstractC1089d2.f16600a;
                    if (list22 != null && !list22.isEmpty()) {
                        writer.writeInt32List(i31, list22, true);
                    }
                    break;
                case 40:
                    int i32 = iArr[length];
                    List<Long> list23 = (List) w2.f16802c.k(obj, iL & 1048575);
                    Class cls23 = AbstractC1089d2.f16600a;
                    if (list23 != null && !list23.isEmpty()) {
                        writer.writeFixed64List(i32, list23, true);
                    }
                    break;
                case 41:
                    int i33 = iArr[length];
                    List<Integer> list24 = (List) w2.f16802c.k(obj, iL & 1048575);
                    Class cls24 = AbstractC1089d2.f16600a;
                    if (list24 != null && !list24.isEmpty()) {
                        writer.writeFixed32List(i33, list24, true);
                    }
                    break;
                case DescriptorProtos.FileOptions.PHP_GENERIC_SERVICES_FIELD_NUMBER /* 42 */:
                    int i34 = iArr[length];
                    List<Boolean> list25 = (List) w2.f16802c.k(obj, iL & 1048575);
                    Class cls25 = AbstractC1089d2.f16600a;
                    if (list25 != null && !list25.isEmpty()) {
                        writer.writeBoolList(i34, list25, true);
                    }
                    break;
                case 43:
                    int i35 = iArr[length];
                    List<Integer> list26 = (List) w2.f16802c.k(obj, iL & 1048575);
                    Class cls26 = AbstractC1089d2.f16600a;
                    if (list26 != null && !list26.isEmpty()) {
                        writer.writeUInt32List(i35, list26, true);
                    }
                    break;
                case 44:
                    int i36 = iArr[length];
                    List<Integer> list27 = (List) w2.f16802c.k(obj, iL & 1048575);
                    Class cls27 = AbstractC1089d2.f16600a;
                    if (list27 != null && !list27.isEmpty()) {
                        writer.writeEnumList(i36, list27, true);
                    }
                    break;
                case 45:
                    int i37 = iArr[length];
                    List<Integer> list28 = (List) w2.f16802c.k(obj, iL & 1048575);
                    Class cls28 = AbstractC1089d2.f16600a;
                    if (list28 != null && !list28.isEmpty()) {
                        writer.writeSFixed32List(i37, list28, true);
                    }
                    break;
                case 46:
                    int i38 = iArr[length];
                    List<Long> list29 = (List) w2.f16802c.k(obj, iL & 1048575);
                    Class cls29 = AbstractC1089d2.f16600a;
                    if (list29 != null && !list29.isEmpty()) {
                        writer.writeSFixed64List(i38, list29, true);
                    }
                    break;
                case ShareDialog.SHARE_BUSINESS_TYPE_JUNE_INVITE_TASK /* 47 */:
                    int i39 = iArr[length];
                    List<Integer> list30 = (List) w2.f16802c.k(obj, iL & 1048575);
                    Class cls30 = AbstractC1089d2.f16600a;
                    if (list30 != null && !list30.isEmpty()) {
                        writer.writeSInt32List(i39, list30, true);
                    }
                    break;
                case 48:
                    int i40 = iArr[length];
                    List<Long> list31 = (List) w2.f16802c.k(obj, iL & 1048575);
                    Class cls31 = AbstractC1089d2.f16600a;
                    if (list31 != null && !list31.isEmpty()) {
                        writer.writeSInt64List(i40, list31, true);
                    }
                    break;
                case NavigationBarView.ITEM_GRAVITY_TOP_CENTER /* 49 */:
                    int i41 = iArr[length];
                    List<?> list32 = (List) w2.f16802c.k(obj, iL & 1048575);
                    Schema schemaG2 = g(length);
                    Class cls32 = AbstractC1089d2.f16600a;
                    if (list32 != null && !list32.isEmpty()) {
                        writer.writeGroupList(i41, list32, schemaG2);
                    }
                    break;
                case 50:
                    Object objK = w2.f16802c.k(obj, iL & 1048575);
                    if (objK != null) {
                        Object objF = f(length);
                        MapFieldSchema mapFieldSchema = this.f16534o;
                        writer.writeMap(i7, mapFieldSchema.forMapMetadata(objF), mapFieldSchema.forMapData(objK));
                    }
                    break;
                case 51:
                    if (l(obj, i7, length)) {
                        writer.writeDouble(i7, ((Double) w2.f16802c.k(obj, iL & 1048575)).doubleValue());
                    }
                    break;
                case 52:
                    if (l(obj, i7, length)) {
                        writer.writeFloat(i7, ((Float) w2.f16802c.k(obj, iL & 1048575)).floatValue());
                    }
                    break;
                case 53:
                    if (l(obj, i7, length)) {
                        writer.writeInt64(i7, v(obj, iL & 1048575));
                    }
                    break;
                case 54:
                    if (l(obj, i7, length)) {
                        writer.writeUInt64(i7, v(obj, iL & 1048575));
                    }
                    break;
                case 55:
                    if (l(obj, i7, length)) {
                        writer.writeInt32(i7, u(obj, iL & 1048575));
                    }
                    break;
                case 56:
                    if (l(obj, i7, length)) {
                        writer.writeFixed64(i7, v(obj, iL & 1048575));
                    }
                    break;
                case 57:
                    if (l(obj, i7, length)) {
                        writer.writeFixed32(i7, u(obj, iL & 1048575));
                    }
                    break;
                case 58:
                    if (l(obj, i7, length)) {
                        writer.writeBool(i7, ((Boolean) w2.f16802c.k(obj, iL & 1048575)).booleanValue());
                    }
                    break;
                case 59:
                    if (l(obj, i7, length)) {
                        N(i7, w2.f16802c.k(obj, iL & 1048575), writer);
                    }
                    break;
                case PictureConfig.MAX_PAGE_SIZE /* 60 */:
                    if (l(obj, i7, length)) {
                        writer.writeMessage(i7, w2.f16802c.k(obj, iL & 1048575), g(length));
                    }
                    break;
                case HomeMenuBean.BOTTOM_TAB_HOME /* 61 */:
                    if (l(obj, i7, length)) {
                        writer.writeBytes(i7, (AbstractC1123n) w2.f16802c.k(obj, iL & 1048575));
                    }
                    break;
                case HomeMenuBean.BOTTOM_TAB_ME /* 62 */:
                    if (l(obj, i7, length)) {
                        writer.writeUInt32(i7, u(obj, iL & 1048575));
                    }
                    break;
                case HomeMenuBean.BOTTOM_TAB_FINANCE /* 63 */:
                    if (l(obj, i7, length)) {
                        writer.writeEnum(i7, u(obj, iL & 1048575));
                    }
                    break;
                case 64:
                    if (l(obj, i7, length)) {
                        writer.writeSFixed32(i7, u(obj, iL & 1048575));
                    }
                    break;
                case HomeMenuBean.BOTTOM_TAB_INVEST /* 65 */:
                    if (l(obj, i7, length)) {
                        writer.writeSFixed64(i7, v(obj, iL & 1048575));
                    }
                    break;
                case HomeMenuBean.BOTTOM_TAB_GIVEAWAY /* 66 */:
                    if (l(obj, i7, length)) {
                        writer.writeSInt32(i7, u(obj, iL & 1048575));
                    }
                    break;
                case 67:
                    if (l(obj, i7, length)) {
                        writer.writeSInt64(i7, v(obj, iL & 1048575));
                    }
                    break;
                case 68:
                    if (l(obj, i7, length)) {
                        writer.writeGroup(i7, w2.f16802c.k(obj, iL & 1048575), g(length));
                    }
                    break;
            }
        }
        if (entry == null) {
            return;
        }
        ((C1100g1) abstractC1096f1).getClass();
        androidx.camera.video.u.t(entry.getKey());
        throw null;
    }

    /*  JADX ERROR: Type inference failed
        jadx.core.utils.exceptions.JadxOverflowException: Type inference error: updates count limit reached with updateSeq = 14261. Try increasing type updates limit count.
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:79)
        */
    public final int x(java.lang.Object r27, byte[] r28, int r29, int r30, int r31, androidx.datastore.preferences.protobuf.C1098g r32) {
        /*
            Method dump skipped, instruction units count: 1426
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.datastore.preferences.protobuf.O1.x(java.lang.Object, byte[], int, int, int, androidx.datastore.preferences.protobuf.g):int");
    }

    public final int y(Object obj, byte[] bArr, int i7, int i10, int i11, int i12, int i13, int i14, int i15, long j6, int i16, C1098g c1098g) throws IOException {
        Unsafe unsafe = f16519q;
        long j10 = this.f16520a[i16 + 2] & 1048575;
        switch (i15) {
            case 51:
                if (i13 != 1) {
                    return i7;
                }
                unsafe.putObject(obj, j6, Double.valueOf(Double.longBitsToDouble(AbstractC1102h.f(bArr, i7))));
                int i17 = i7 + 8;
                unsafe.putInt(obj, j10, i12);
                return i17;
            case 52:
                if (i13 != 5) {
                    return i7;
                }
                unsafe.putObject(obj, j6, Float.valueOf(Float.intBitsToFloat(AbstractC1102h.e(bArr, i7))));
                int i18 = i7 + 4;
                unsafe.putInt(obj, j10, i12);
                return i18;
            case 53:
            case 54:
                if (i13 != 0) {
                    return i7;
                }
                int iO = AbstractC1102h.o(bArr, i7, c1098g);
                unsafe.putObject(obj, j6, Long.valueOf(c1098g.f16617b));
                unsafe.putInt(obj, j10, i12);
                return iO;
            case 55:
            case HomeMenuBean.BOTTOM_TAB_ME /* 62 */:
                if (i13 != 0) {
                    return i7;
                }
                int iM = AbstractC1102h.m(bArr, i7, c1098g);
                unsafe.putObject(obj, j6, Integer.valueOf(c1098g.f16616a));
                unsafe.putInt(obj, j10, i12);
                return iM;
            case 56:
            case HomeMenuBean.BOTTOM_TAB_INVEST /* 65 */:
                if (i13 != 1) {
                    return i7;
                }
                unsafe.putObject(obj, j6, Long.valueOf(AbstractC1102h.f(bArr, i7)));
                int i19 = i7 + 8;
                unsafe.putInt(obj, j10, i12);
                return i19;
            case 57:
            case 64:
                if (i13 != 5) {
                    return i7;
                }
                unsafe.putObject(obj, j6, Integer.valueOf(AbstractC1102h.e(bArr, i7)));
                int i20 = i7 + 4;
                unsafe.putInt(obj, j10, i12);
                return i20;
            case 58:
                if (i13 != 0) {
                    return i7;
                }
                int iO2 = AbstractC1102h.o(bArr, i7, c1098g);
                unsafe.putObject(obj, j6, Boolean.valueOf(c1098g.f16617b != 0));
                unsafe.putInt(obj, j10, i12);
                return iO2;
            case 59:
                if (i13 != 2) {
                    return i7;
                }
                int iM2 = AbstractC1102h.m(bArr, i7, c1098g);
                int i21 = c1098g.f16616a;
                if (i21 == 0) {
                    unsafe.putObject(obj, j6, "");
                } else {
                    if ((i14 & 536870912) != 0) {
                        if (z2.f16817a.u(bArr, iM2, iM2 + i21) != 0) {
                            throw C1160z1.b();
                        }
                    }
                    unsafe.putObject(obj, j6, new String(bArr, iM2, i21, AbstractC1154x1.f16808a));
                    iM2 += i21;
                }
                unsafe.putInt(obj, j10, i12);
                return iM2;
            case PictureConfig.MAX_PAGE_SIZE /* 60 */:
                if (i13 != 2) {
                    return i7;
                }
                Object objR = r(obj, i12, i16);
                int iT = AbstractC1102h.t(objR, g(i16), bArr, i7, i10, c1098g);
                J(obj, i12, i16, objR);
                return iT;
            case HomeMenuBean.BOTTOM_TAB_HOME /* 61 */:
                if (i13 != 2) {
                    return i7;
                }
                int iD = AbstractC1102h.d(bArr, i7, c1098g);
                unsafe.putObject(obj, j6, c1098g.f16618c);
                unsafe.putInt(obj, j10, i12);
                return iD;
            case HomeMenuBean.BOTTOM_TAB_FINANCE /* 63 */:
                if (i13 != 0) {
                    return i7;
                }
                int iM3 = AbstractC1102h.m(bArr, i7, c1098g);
                int i22 = c1098g.f16616a;
                Internal$EnumVerifier internal$EnumVerifierE = e(i16);
                if (internal$EnumVerifierE != null && !internal$EnumVerifierE.isInRange(i22)) {
                    h(obj).d(i11, Long.valueOf(i22));
                    return iM3;
                }
                unsafe.putObject(obj, j6, Integer.valueOf(i22));
                unsafe.putInt(obj, j10, i12);
                return iM3;
            case HomeMenuBean.BOTTOM_TAB_GIVEAWAY /* 66 */:
                if (i13 != 0) {
                    return i7;
                }
                int iM4 = AbstractC1102h.m(bArr, i7, c1098g);
                unsafe.putObject(obj, j6, Integer.valueOf(r.b(c1098g.f16616a)));
                unsafe.putInt(obj, j10, i12);
                return iM4;
            case 67:
                if (i13 != 0) {
                    return i7;
                }
                int iO3 = AbstractC1102h.o(bArr, i7, c1098g);
                unsafe.putObject(obj, j6, Long.valueOf(r.c(c1098g.f16617b)));
                unsafe.putInt(obj, j10, i12);
                return iO3;
            case 68:
                if (i13 == 3) {
                    Object objR2 = r(obj, i12, i16);
                    int iS = AbstractC1102h.s(objR2, g(i16), bArr, i7, i10, (i11 & (-8)) | 4, c1098g);
                    J(obj, i12, i16, objR2);
                    return iS;
                }
                break;
        }
        return i7;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public final int z(Object obj, byte[] bArr, int i7, int i10, int i11, int i12, int i13, int i14, long j6, int i15, long j10, C1098g c1098g) throws C1160z1 {
        int iN;
        Unsafe unsafe = f16519q;
        Internal$ProtobufList internal$ProtobufListMutableCopyWithCapacity2 = (Internal$ProtobufList) unsafe.getObject(obj, j10);
        if (!internal$ProtobufListMutableCopyWithCapacity2.isModifiable()) {
            int size = internal$ProtobufListMutableCopyWithCapacity2.size();
            internal$ProtobufListMutableCopyWithCapacity2 = internal$ProtobufListMutableCopyWithCapacity2.mutableCopyWithCapacity2(size == 0 ? 10 : size * 2);
            unsafe.putObject(obj, j10, internal$ProtobufListMutableCopyWithCapacity2);
        }
        Internal$ProtobufList internal$ProtobufList = internal$ProtobufListMutableCopyWithCapacity2;
        switch (i15) {
            case 18:
            case 35:
                if (i13 == 2) {
                    Y0 y8 = (Y0) internal$ProtobufList;
                    int iM = AbstractC1102h.m(bArr, i7, c1098g);
                    int i16 = c1098g.f16616a + iM;
                    while (iM < i16) {
                        y8.addDouble(Double.longBitsToDouble(AbstractC1102h.f(bArr, iM)));
                        iM += 8;
                    }
                    if (iM == i16) {
                        return iM;
                    }
                    throw C1160z1.g();
                }
                if (i13 == 1) {
                    Y0 y10 = (Y0) internal$ProtobufList;
                    y10.addDouble(Double.longBitsToDouble(AbstractC1102h.f(bArr, i7)));
                    int i17 = i7 + 8;
                    while (i17 < i10) {
                        int iM2 = AbstractC1102h.m(bArr, i17, c1098g);
                        if (i11 != c1098g.f16616a) {
                            return i17;
                        }
                        y10.addDouble(Double.longBitsToDouble(AbstractC1102h.f(bArr, iM2)));
                        i17 = iM2 + 8;
                    }
                    return i17;
                }
                return i7;
            case 19:
            case 36:
                if (i13 == 2) {
                    AbstractC1128o1 abstractC1128o1 = (AbstractC1128o1) internal$ProtobufList;
                    int iM3 = AbstractC1102h.m(bArr, i7, c1098g);
                    int i18 = c1098g.f16616a + iM3;
                    while (iM3 < i18) {
                        abstractC1128o1.addFloat(Float.intBitsToFloat(AbstractC1102h.e(bArr, iM3)));
                        iM3 += 4;
                    }
                    if (iM3 == i18) {
                        return iM3;
                    }
                    throw C1160z1.g();
                }
                if (i13 == 5) {
                    AbstractC1128o1 abstractC1128o2 = (AbstractC1128o1) internal$ProtobufList;
                    abstractC1128o2.addFloat(Float.intBitsToFloat(AbstractC1102h.e(bArr, i7)));
                    int i19 = i7 + 4;
                    while (i19 < i10) {
                        int iM4 = AbstractC1102h.m(bArr, i19, c1098g);
                        if (i11 != c1098g.f16616a) {
                            return i19;
                        }
                        abstractC1128o2.addFloat(Float.intBitsToFloat(AbstractC1102h.e(bArr, iM4)));
                        i19 = iM4 + 4;
                    }
                    return i19;
                }
                return i7;
            case 20:
            case 21:
            case 37:
            case BillBusinessType.BUSINESS_TYPE_TRIP /* 38 */:
                if (i13 == 2) {
                    G1 g7 = (G1) internal$ProtobufList;
                    int iM5 = AbstractC1102h.m(bArr, i7, c1098g);
                    int i20 = c1098g.f16616a + iM5;
                    while (iM5 < i20) {
                        iM5 = AbstractC1102h.o(bArr, iM5, c1098g);
                        g7.addLong(c1098g.f16617b);
                    }
                    if (iM5 == i20) {
                        return iM5;
                    }
                    throw C1160z1.g();
                }
                if (i13 == 0) {
                    G1 g10 = (G1) internal$ProtobufList;
                    int iO = AbstractC1102h.o(bArr, i7, c1098g);
                    g10.addLong(c1098g.f16617b);
                    while (iO < i10) {
                        int iM6 = AbstractC1102h.m(bArr, iO, c1098g);
                        if (i11 != c1098g.f16616a) {
                            return iO;
                        }
                        iO = AbstractC1102h.o(bArr, iM6, c1098g);
                        g10.addLong(c1098g.f16617b);
                    }
                    return iO;
                }
                return i7;
            case 22:
            case 29:
            case 39:
            case 43:
                if (i13 != 2) {
                    if (i13 == 0) {
                        return AbstractC1102h.n(i11, bArr, i7, i10, internal$ProtobufList, c1098g);
                    }
                    return i7;
                }
                C1148v1 c1148v1 = (C1148v1) internal$ProtobufList;
                int iM7 = AbstractC1102h.m(bArr, i7, c1098g);
                int i21 = c1098g.f16616a + iM7;
                while (iM7 < i21) {
                    iM7 = AbstractC1102h.m(bArr, iM7, c1098g);
                    c1148v1.addInt(c1098g.f16616a);
                }
                if (iM7 == i21) {
                    return iM7;
                }
                throw C1160z1.g();
            case 23:
            case 32:
            case 40:
            case 46:
                if (i13 == 2) {
                    G1 g11 = (G1) internal$ProtobufList;
                    int iM8 = AbstractC1102h.m(bArr, i7, c1098g);
                    int i22 = c1098g.f16616a + iM8;
                    while (iM8 < i22) {
                        g11.addLong(AbstractC1102h.f(bArr, iM8));
                        iM8 += 8;
                    }
                    if (iM8 == i22) {
                        return iM8;
                    }
                    throw C1160z1.g();
                }
                if (i13 == 1) {
                    G1 g12 = (G1) internal$ProtobufList;
                    g12.addLong(AbstractC1102h.f(bArr, i7));
                    int i23 = i7 + 8;
                    while (i23 < i10) {
                        int iM9 = AbstractC1102h.m(bArr, i23, c1098g);
                        if (i11 != c1098g.f16616a) {
                            return i23;
                        }
                        g12.addLong(AbstractC1102h.f(bArr, iM9));
                        i23 = iM9 + 8;
                    }
                    return i23;
                }
                return i7;
            case 24:
            case 31:
            case 41:
            case 45:
                if (i13 == 2) {
                    C1148v1 c1148v2 = (C1148v1) internal$ProtobufList;
                    int iM10 = AbstractC1102h.m(bArr, i7, c1098g);
                    int i24 = c1098g.f16616a + iM10;
                    while (iM10 < i24) {
                        c1148v2.addInt(AbstractC1102h.e(bArr, iM10));
                        iM10 += 4;
                    }
                    if (iM10 == i24) {
                        return iM10;
                    }
                    throw C1160z1.g();
                }
                if (i13 == 5) {
                    C1148v1 c1148v3 = (C1148v1) internal$ProtobufList;
                    c1148v3.addInt(AbstractC1102h.e(bArr, i7));
                    int i25 = i7 + 4;
                    while (i25 < i10) {
                        int iM11 = AbstractC1102h.m(bArr, i25, c1098g);
                        if (i11 != c1098g.f16616a) {
                            return i25;
                        }
                        c1148v3.addInt(AbstractC1102h.e(bArr, iM11));
                        i25 = iM11 + 4;
                    }
                    return i25;
                }
                return i7;
            case Service.MONITORED_RESOURCES_FIELD_NUMBER /* 25 */:
            case DescriptorProtos.FileOptions.PHP_GENERIC_SERVICES_FIELD_NUMBER /* 42 */:
                if (i13 == 2) {
                    AbstractC1106i abstractC1106i = (AbstractC1106i) internal$ProtobufList;
                    int iM12 = AbstractC1102h.m(bArr, i7, c1098g);
                    int i26 = c1098g.f16616a + iM12;
                    while (iM12 < i26) {
                        iM12 = AbstractC1102h.o(bArr, iM12, c1098g);
                        abstractC1106i.addBoolean(c1098g.f16617b != 0);
                    }
                    if (iM12 == i26) {
                        return iM12;
                    }
                    throw C1160z1.g();
                }
                if (i13 == 0) {
                    AbstractC1106i abstractC1106i2 = (AbstractC1106i) internal$ProtobufList;
                    int iO2 = AbstractC1102h.o(bArr, i7, c1098g);
                    abstractC1106i2.addBoolean(c1098g.f16617b != 0);
                    while (iO2 < i10) {
                        int iM13 = AbstractC1102h.m(bArr, iO2, c1098g);
                        if (i11 != c1098g.f16616a) {
                            return iO2;
                        }
                        iO2 = AbstractC1102h.o(bArr, iM13, c1098g);
                        abstractC1106i2.addBoolean(c1098g.f16617b != 0);
                    }
                    return iO2;
                }
                return i7;
            case 26:
                if (i13 == 2) {
                    if ((j6 & 536870912) == 0) {
                        int iM14 = AbstractC1102h.m(bArr, i7, c1098g);
                        int i27 = c1098g.f16616a;
                        if (i27 < 0) {
                            throw C1160z1.e();
                        }
                        if (i27 == 0) {
                            internal$ProtobufList.add("");
                        } else {
                            internal$ProtobufList.add(new String(bArr, iM14, i27, AbstractC1154x1.f16808a));
                            iM14 += i27;
                        }
                        while (iM14 < i10) {
                            int iM15 = AbstractC1102h.m(bArr, iM14, c1098g);
                            if (i11 != c1098g.f16616a) {
                                return iM14;
                            }
                            iM14 = AbstractC1102h.m(bArr, iM15, c1098g);
                            int i28 = c1098g.f16616a;
                            if (i28 < 0) {
                                throw C1160z1.e();
                            }
                            if (i28 == 0) {
                                internal$ProtobufList.add("");
                            } else {
                                internal$ProtobufList.add(new String(bArr, iM14, i28, AbstractC1154x1.f16808a));
                                iM14 += i28;
                            }
                        }
                        return iM14;
                    }
                    int iM16 = AbstractC1102h.m(bArr, i7, c1098g);
                    int i29 = c1098g.f16616a;
                    if (i29 < 0) {
                        throw C1160z1.e();
                    }
                    if (i29 == 0) {
                        internal$ProtobufList.add("");
                    } else {
                        int i30 = iM16 + i29;
                        if (z2.f16817a.u(bArr, iM16, i30) != 0) {
                            throw C1160z1.b();
                        }
                        internal$ProtobufList.add(new String(bArr, iM16, i29, AbstractC1154x1.f16808a));
                        iM16 = i30;
                    }
                    while (iM16 < i10) {
                        int iM17 = AbstractC1102h.m(bArr, iM16, c1098g);
                        if (i11 != c1098g.f16616a) {
                            return iM16;
                        }
                        iM16 = AbstractC1102h.m(bArr, iM17, c1098g);
                        int i31 = c1098g.f16616a;
                        if (i31 < 0) {
                            throw C1160z1.e();
                        }
                        if (i31 == 0) {
                            internal$ProtobufList.add("");
                        } else {
                            int i32 = iM16 + i31;
                            if (z2.f16817a.u(bArr, iM16, i32) != 0) {
                                throw C1160z1.b();
                            }
                            internal$ProtobufList.add(new String(bArr, iM16, i31, AbstractC1154x1.f16808a));
                            iM16 = i32;
                        }
                    }
                    return iM16;
                }
                return i7;
            case 27:
                if (i13 == 2) {
                    return AbstractC1102h.g(g(i14), i11, bArr, i7, i10, internal$ProtobufList, c1098g);
                }
                return i7;
            case 28:
                if (i13 == 2) {
                    int iM18 = AbstractC1102h.m(bArr, i7, c1098g);
                    int i33 = c1098g.f16616a;
                    if (i33 < 0) {
                        throw C1160z1.e();
                    }
                    if (i33 > bArr.length - iM18) {
                        throw C1160z1.g();
                    }
                    if (i33 == 0) {
                        internal$ProtobufList.add(AbstractC1123n.f16699b);
                    } else {
                        internal$ProtobufList.add(AbstractC1123n.c(iM18, i33, bArr));
                        iM18 += i33;
                    }
                    while (iM18 < i10) {
                        int iM19 = AbstractC1102h.m(bArr, iM18, c1098g);
                        if (i11 != c1098g.f16616a) {
                            return iM18;
                        }
                        iM18 = AbstractC1102h.m(bArr, iM19, c1098g);
                        int i34 = c1098g.f16616a;
                        if (i34 < 0) {
                            throw C1160z1.e();
                        }
                        if (i34 > bArr.length - iM18) {
                            throw C1160z1.g();
                        }
                        if (i34 == 0) {
                            internal$ProtobufList.add(AbstractC1123n.f16699b);
                        } else {
                            internal$ProtobufList.add(AbstractC1123n.c(iM18, i34, bArr));
                            iM18 += i34;
                        }
                    }
                    return iM18;
                }
                return i7;
            case BillBusinessType.BUSINESS_TYPE_COMMERCE_RETAIL_TRADE_PAYMENTS /* 30 */:
            case 44:
                if (i13 != 2) {
                    if (i13 == 0) {
                        iN = AbstractC1102h.n(i11, bArr, i7, i10, internal$ProtobufList, c1098g);
                    }
                    return i7;
                }
                C1148v1 c1148v4 = (C1148v1) internal$ProtobufList;
                iN = AbstractC1102h.m(bArr, i7, c1098g);
                int i35 = c1098g.f16616a + iN;
                while (iN < i35) {
                    iN = AbstractC1102h.m(bArr, iN, c1098g);
                    c1148v4.addInt(c1098g.f16616a);
                }
                if (iN != i35) {
                    throw C1160z1.g();
                }
                AbstractC1089d2.j(obj, i12, internal$ProtobufList, e(i14), null, this.f16532m);
                return iN;
            case 33:
            case ShareDialog.SHARE_BUSINESS_TYPE_JUNE_INVITE_TASK /* 47 */:
                if (i13 == 2) {
                    C1148v1 c1148v5 = (C1148v1) internal$ProtobufList;
                    int iM20 = AbstractC1102h.m(bArr, i7, c1098g);
                    int i36 = c1098g.f16616a + iM20;
                    while (iM20 < i36) {
                        iM20 = AbstractC1102h.m(bArr, iM20, c1098g);
                        c1148v5.addInt(r.b(c1098g.f16616a));
                    }
                    if (iM20 == i36) {
                        return iM20;
                    }
                    throw C1160z1.g();
                }
                if (i13 == 0) {
                    C1148v1 c1148v6 = (C1148v1) internal$ProtobufList;
                    int iM21 = AbstractC1102h.m(bArr, i7, c1098g);
                    c1148v6.addInt(r.b(c1098g.f16616a));
                    while (iM21 < i10) {
                        int iM22 = AbstractC1102h.m(bArr, iM21, c1098g);
                        if (i11 != c1098g.f16616a) {
                            return iM21;
                        }
                        iM21 = AbstractC1102h.m(bArr, iM22, c1098g);
                        c1148v6.addInt(r.b(c1098g.f16616a));
                    }
                    return iM21;
                }
                return i7;
            case 34:
            case 48:
                if (i13 == 2) {
                    G1 g13 = (G1) internal$ProtobufList;
                    int iM23 = AbstractC1102h.m(bArr, i7, c1098g);
                    int i37 = c1098g.f16616a + iM23;
                    while (iM23 < i37) {
                        iM23 = AbstractC1102h.o(bArr, iM23, c1098g);
                        g13.addLong(r.c(c1098g.f16617b));
                    }
                    if (iM23 == i37) {
                        return iM23;
                    }
                    throw C1160z1.g();
                }
                if (i13 == 0) {
                    G1 g14 = (G1) internal$ProtobufList;
                    int iO3 = AbstractC1102h.o(bArr, i7, c1098g);
                    g14.addLong(r.c(c1098g.f16617b));
                    while (iO3 < i10) {
                        int iM24 = AbstractC1102h.m(bArr, iO3, c1098g);
                        if (i11 != c1098g.f16616a) {
                            return iO3;
                        }
                        iO3 = AbstractC1102h.o(bArr, iM24, c1098g);
                        g14.addLong(r.c(c1098g.f16617b));
                    }
                    return iO3;
                }
                return i7;
            case NavigationBarView.ITEM_GRAVITY_TOP_CENTER /* 49 */:
                if (i13 == 3) {
                    Schema schemaG = g(i14);
                    int i38 = (i11 & (-8)) | 4;
                    Object objNewInstance = schemaG.newInstance();
                    int iS = AbstractC1102h.s(objNewInstance, schemaG, bArr, i7, i10, i38, c1098g);
                    Schema schema = schemaG;
                    schema.makeImmutable(objNewInstance);
                    c1098g.f16618c = objNewInstance;
                    internal$ProtobufList.add(objNewInstance);
                    while (iS < i10) {
                        int iM25 = AbstractC1102h.m(bArr, iS, c1098g);
                        if (i11 != c1098g.f16616a) {
                            return iS;
                        }
                        Object objNewInstance2 = schema.newInstance();
                        Schema schema2 = schema;
                        iS = AbstractC1102h.s(objNewInstance2, schema2, bArr, iM25, i10, i38, c1098g);
                        schema2.makeImmutable(objNewInstance2);
                        c1098g.f16618c = objNewInstance2;
                        internal$ProtobufList.add(objNewInstance2);
                        schema = schema2;
                    }
                    return iS;
                }
                return i7;
            default:
                return i7;
        }
    }

    @Override // androidx.datastore.preferences.protobuf.Schema
    public final void mergeFrom(Object obj, Reader reader, C1092e1 c1092e1) throws Throwable {
        c1092e1.getClass();
        b(obj);
        m(this.f16532m, this.f16533n, obj, reader, c1092e1);
    }

    @Override // androidx.datastore.preferences.protobuf.Schema
    public final void mergeFrom(Object obj, byte[] bArr, int i7, int i10, C1098g c1098g) {
        x(obj, bArr, i7, i10, 0, c1098g);
    }
}
