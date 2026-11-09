package p137j3;

import android.util.SparseIntArray;
import com.alibaba.android.arouter.utils.Consts;
import com.google.firebase.crashlytics.internal.metadata.UserMetadata;
import com.microsoft.codepush.react.CodePushConstants;
import java.lang.ref.SoftReference;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.HashSet;
import org.aspectj.lang.Signature;
import org.aspectj.lang.reflect.CodeSignature;
import org.aspectj.lang.reflect.MemberSignature;
import org.aspectj.lang.reflect.MethodSignature;
import org.aspectj.runtime.reflect.d;
import org.aspectj.runtime.reflect.e;
import org.sufficientlysecure.htmltextview.o;
import p181m3.a;
import p262r2.c;

/* JADX INFO: loaded from: classes.dex */
public final class v implements MethodSignature, CodeSignature, MemberSignature, Signature {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static boolean f38257l = true;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f38258a = 1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f38259b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public String f38260c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Object f38261d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Object f38262e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public Object f38263f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public Object f38264g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public Object f38265h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public Object f38266i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public Object f38267j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public Object f38268k;

    public /* synthetic */ v() {
    }

    public static Method a(Class cls, String str, Class[] clsArr, HashSet hashSet) {
        if (cls == null) {
            return null;
        }
        if (!hashSet.contains(cls)) {
            hashSet.add(cls);
            try {
                return cls.getDeclaredMethod(str, clsArr);
            } catch (NoSuchMethodException unused) {
            }
        }
        Method methodA = a(cls.getSuperclass(), str, clsArr, hashSet);
        if (methodA != null) {
            return methodA;
        }
        Class<?>[] interfaces = cls.getInterfaces();
        if (interfaces == null) {
            return null;
        }
        for (Class<?> cls2 : interfaces) {
            Method methodA2 = a(cls2, str, clsArr, hashSet);
            if (methodA2 != null) {
                return methodA2;
            }
        }
        return null;
    }

    public String b(e eVar) {
        String string;
        if (f38257l) {
            d dVar = (d) this.f38263f;
            if (dVar == null) {
                try {
                    d dVar2 = new d();
                    dVar2.f41005a = new SoftReference(new String[3]);
                    this.f38263f = dVar2;
                } catch (Throwable unused) {
                    f38257l = false;
                }
                string = null;
            } else {
                string = dVar.get(eVar.f41013e);
            }
        } else {
            string = null;
        }
        if (string == null) {
            StringBuffer stringBuffer = new StringBuffer();
            int modifiers = getModifiers();
            String strConcat = "";
            if (eVar.f41011c) {
                String string2 = Modifier.toString(modifiers);
                if (string2.length() != 0) {
                    strConcat = string2.concat(" ");
                }
            }
            stringBuffer.append(strConcat);
            if (eVar.f41010b) {
                Class cls = (Class) this.f38268k;
                cls.getClass();
                stringBuffer.append(e.a(cls.getName(), cls, eVar.f41009a));
            }
            if (eVar.f41010b) {
                stringBuffer.append(" ");
            }
            Class cls2 = (Class) this.f38262e;
            cls2.getClass();
            stringBuffer.append(e.a(getDeclaringTypeName(), cls2, eVar.f41012d));
            stringBuffer.append(Consts.DOT);
            String str = this.f38260c;
            str.getClass();
            stringBuffer.append(str);
            Class[] clsArr = (Class[]) this.f38264g;
            if (eVar.f41010b) {
                stringBuffer.append("(");
                for (int i7 = 0; i7 < clsArr.length; i7++) {
                    if (i7 > 0) {
                        stringBuffer.append(", ");
                    }
                    Class cls3 = clsArr[i7];
                    stringBuffer.append(e.a(cls3.getName(), cls3, eVar.f41009a));
                }
                stringBuffer.append(")");
            } else if (clsArr.length == 0) {
                stringBuffer.append("()");
            } else {
                stringBuffer.append("(..)");
            }
            string = stringBuffer.toString();
        }
        if (f38257l) {
            ((d) this.f38263f).set(eVar.f41013e, string);
        }
        return string;
    }

    @Override // org.aspectj.lang.Signature
    public Class getDeclaringType() {
        Class cls = (Class) this.f38262e;
        if (cls != null) {
            return cls;
        }
        throw null;
    }

    @Override // org.aspectj.lang.Signature
    public String getDeclaringTypeName() {
        if (((String) this.f38261d) == null) {
            Class cls = (Class) this.f38262e;
            cls.getClass();
            this.f38261d = cls.getName();
        }
        return (String) this.f38261d;
    }

    @Override // org.aspectj.lang.reflect.CodeSignature
    public Class[] getExceptionTypes() {
        Class[] clsArr = (Class[]) this.f38266i;
        if (clsArr != null) {
            return clsArr;
        }
        throw null;
    }

    @Override // org.aspectj.lang.reflect.MethodSignature
    public Method getMethod() {
        if (((Method) this.f38267j) == null) {
            Class cls = (Class) this.f38262e;
            cls.getClass();
            try {
                String str = this.f38260c;
                if (str == null) {
                    throw null;
                }
                this.f38267j = cls.getDeclaredMethod(str, (Class[]) this.f38264g);
            } catch (NoSuchMethodException unused) {
                HashSet hashSet = new HashSet();
                hashSet.add(cls);
                String str2 = this.f38260c;
                str2.getClass();
                this.f38267j = a(cls, str2, (Class[]) this.f38264g, hashSet);
            }
        }
        return (Method) this.f38267j;
    }

    @Override // org.aspectj.lang.Signature
    public int getModifiers() {
        int i7 = this.f38259b;
        if (i7 != -1) {
            return i7;
        }
        throw null;
    }

    @Override // org.aspectj.lang.Signature
    public String getName() {
        String str = this.f38260c;
        if (str != null) {
            return str;
        }
        throw null;
    }

    @Override // org.aspectj.lang.reflect.CodeSignature
    public String[] getParameterNames() {
        String[] strArr = (String[]) this.f38265h;
        if (strArr != null) {
            return strArr;
        }
        throw null;
    }

    @Override // org.aspectj.lang.reflect.CodeSignature
    public Class[] getParameterTypes() {
        Class[] clsArr = (Class[]) this.f38264g;
        if (clsArr != null) {
            return clsArr;
        }
        throw null;
    }

    @Override // org.aspectj.lang.reflect.MethodSignature
    public Class getReturnType() {
        Class cls = (Class) this.f38268k;
        if (cls != null) {
            return cls;
        }
        throw null;
    }

    @Override // org.aspectj.lang.Signature
    public String toLongString() {
        return b(e.f41008h);
    }

    @Override // org.aspectj.lang.Signature
    public String toShortString() {
        return b(e.f41006f);
    }

    @Override // org.aspectj.lang.Signature
    public String toString() {
        switch (this.f38258a) {
            case 1:
                return b(e.f41007g);
            default:
                return super.toString();
        }
    }

    public v(o oVar) {
        a.a();
        this.f38261d = l.a();
        this.f38265h = u.a();
        int i7 = m.f38243a;
        int i10 = i7 * 4194304;
        SparseIntArray sparseIntArray = new SparseIntArray();
        for (int i11 = 131072; i11 <= 4194304; i11 *= 2) {
            sparseIntArray.put(i11, i7);
        }
        this.f38262e = new x(4194304, i10, sparseIntArray, m.f38243a);
        this.f38268k = c.a();
        SparseIntArray sparseIntArray2 = new SparseIntArray();
        sparseIntArray2.put(1024, 5);
        sparseIntArray2.put(2048, 5);
        sparseIntArray2.put(4096, 5);
        sparseIntArray2.put(UserMetadata.MAX_INTERNAL_KEY_SIZE, 5);
        sparseIntArray2.put(16384, 5);
        sparseIntArray2.put(32768, 5);
        sparseIntArray2.put(65536, 5);
        sparseIntArray2.put(131072, 5);
        sparseIntArray2.put(CodePushConstants.DOWNLOAD_BUFFER_SIZE, 2);
        sparseIntArray2.put(524288, 2);
        sparseIntArray2.put(1048576, 2);
        int iMin = (int) Math.min(Runtime.getRuntime().maxMemory(), 2147483647L);
        int i12 = iMin < 16777216 ? 3145728 : iMin < 33554432 ? 6291456 : 12582912;
        int iMin2 = (int) Math.min(Runtime.getRuntime().maxMemory(), 2147483647L);
        this.f38263f = new x(i12, iMin2 < 16777216 ? iMin2 / 2 : (iMin2 / 4) * 3, sparseIntArray2, -1);
        this.f38266i = u.a();
        SparseIntArray sparseIntArray3 = new SparseIntArray();
        sparseIntArray3.put(16384, 5);
        this.f38264g = new x(81920, 1048576, sparseIntArray3, -1);
        this.f38267j = u.a();
        this.f38260c = "legacy";
        this.f38259b = 4194304;
        a.a();
    }
}
