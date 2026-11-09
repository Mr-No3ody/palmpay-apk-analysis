package com.palmpay.lib.apm.launchcounter.util;

import N8.q0;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.camera.video.u;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Member;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;

/* JADX INFO: loaded from: classes3.dex */
public class Reflector {
    public static final String TAG = "Reflector";
    protected Object mCaller;
    protected Constructor mConstructor;
    protected Field mField;
    protected Method mMethod;
    protected Class<?> mType;

    public static class QuietReflector extends Reflector {
        protected Throwable mIgnored;

        public static QuietReflector on(@NonNull String str) {
            return on(str, true, QuietReflector.class.getClassLoader());
        }

        public static QuietReflector with(@Nullable Object obj) {
            return obj == null ? on((Class<?>) null) : on(obj.getClass()).bind(obj);
        }

        @Override // com.palmpay.lib.apm.launchcounter.util.Reflector
        public <R> R call(@Nullable Object... objArr) {
            if (skip()) {
                return null;
            }
            try {
                this.mIgnored = null;
                return (R) super.call(objArr);
            } catch (Throwable th) {
                this.mIgnored = th;
                return null;
            }
        }

        @Override // com.palmpay.lib.apm.launchcounter.util.Reflector
        public <R> R callByCaller(@Nullable Object obj, @Nullable Object... objArr) {
            if (skip()) {
                return null;
            }
            try {
                this.mIgnored = null;
                return (R) super.callByCaller(obj, objArr);
            } catch (Throwable th) {
                this.mIgnored = th;
                return null;
            }
        }

        @Override // com.palmpay.lib.apm.launchcounter.util.Reflector
        public /* bridge */ /* synthetic */ Reflector constructor(@Nullable Class[] clsArr) throws ReflectedException {
            return constructor((Class<?>[]) clsArr);
        }

        @Override // com.palmpay.lib.apm.launchcounter.util.Reflector
        public <R> R get() {
            if (skip()) {
                return null;
            }
            try {
                this.mIgnored = null;
                return (R) super.get();
            } catch (Throwable th) {
                this.mIgnored = th;
                return null;
            }
        }

        public Throwable getIgnored() {
            return this.mIgnored;
        }

        @Override // com.palmpay.lib.apm.launchcounter.util.Reflector
        public /* bridge */ /* synthetic */ Reflector method(@NonNull String str, @Nullable Class[] clsArr) throws ReflectedException {
            return method(str, (Class<?>[]) clsArr);
        }

        @Override // com.palmpay.lib.apm.launchcounter.util.Reflector
        public <R> R newInstance(@Nullable Object... objArr) {
            if (skip()) {
                return null;
            }
            try {
                this.mIgnored = null;
                return (R) super.newInstance(objArr);
            } catch (Throwable th) {
                this.mIgnored = th;
                return null;
            }
        }

        public boolean skip() {
            return skipAlways() || this.mIgnored != null;
        }

        public boolean skipAlways() {
            return this.mType == null;
        }

        public static QuietReflector on(@NonNull String str, boolean z3) {
            return on(str, z3, QuietReflector.class.getClassLoader());
        }

        @Override // com.palmpay.lib.apm.launchcounter.util.Reflector
        public QuietReflector bind(@Nullable Object obj) {
            if (!skipAlways()) {
                try {
                    this.mIgnored = null;
                    super.bind(obj);
                    return this;
                } catch (Throwable th) {
                    this.mIgnored = th;
                }
            }
            return this;
        }

        @Override // com.palmpay.lib.apm.launchcounter.util.Reflector
        public QuietReflector constructor(@Nullable Class<?>... clsArr) {
            if (!skipAlways()) {
                try {
                    this.mIgnored = null;
                    super.constructor(clsArr);
                    return this;
                } catch (Throwable th) {
                    this.mIgnored = th;
                }
            }
            return this;
        }

        @Override // com.palmpay.lib.apm.launchcounter.util.Reflector
        public QuietReflector field(@NonNull String str) {
            if (!skipAlways()) {
                try {
                    this.mIgnored = null;
                    super.field(str);
                    return this;
                } catch (Throwable th) {
                    this.mIgnored = th;
                }
            }
            return this;
        }

        @Override // com.palmpay.lib.apm.launchcounter.util.Reflector
        public QuietReflector method(@NonNull String str, @Nullable Class<?>... clsArr) {
            if (!skipAlways()) {
                try {
                    this.mIgnored = null;
                    super.method(str, clsArr);
                    return this;
                } catch (Throwable th) {
                    this.mIgnored = th;
                }
            }
            return this;
        }

        @Override // com.palmpay.lib.apm.launchcounter.util.Reflector
        public QuietReflector unbind() {
            super.unbind();
            return this;
        }

        public static QuietReflector on(@NonNull String str, boolean z3, @Nullable ClassLoader classLoader) {
            Class<?> cls = null;
            try {
                Class<?> cls2 = Class.forName(str, z3, classLoader);
                try {
                    return on(cls2, (Throwable) null);
                } catch (Throwable th) {
                    th = th;
                    cls = cls2;
                    return on(cls, th);
                }
            } catch (Throwable th2) {
                th = th2;
            }
        }

        @Override // com.palmpay.lib.apm.launchcounter.util.Reflector
        public QuietReflector set(@Nullable Object obj) {
            if (!skip()) {
                try {
                    this.mIgnored = null;
                    super.set(obj);
                    return this;
                } catch (Throwable th) {
                    this.mIgnored = th;
                }
            }
            return this;
        }

        @Override // com.palmpay.lib.apm.launchcounter.util.Reflector
        public <R> R get(@Nullable Object obj) {
            if (skip()) {
                return null;
            }
            try {
                this.mIgnored = null;
                return (R) super.get(obj);
            } catch (Throwable th) {
                this.mIgnored = th;
                return null;
            }
        }

        public static QuietReflector on(@Nullable Class<?> cls) {
            return on(cls, cls == null ? new ReflectedException("Type was null!") : null);
        }

        private static QuietReflector on(@Nullable Class<?> cls, @Nullable Throwable th) {
            QuietReflector quietReflector = new QuietReflector();
            quietReflector.mType = cls;
            quietReflector.mIgnored = th;
            return quietReflector;
        }

        @Override // com.palmpay.lib.apm.launchcounter.util.Reflector
        public QuietReflector set(@Nullable Object obj, @Nullable Object obj2) {
            if (!skip()) {
                try {
                    this.mIgnored = null;
                    super.set(obj, obj2);
                    return this;
                } catch (Throwable th) {
                    this.mIgnored = th;
                }
            }
            return this;
        }
    }

    public static class ReflectedException extends Exception {
        public ReflectedException(String str) {
            super(str);
        }

        public ReflectedException(String str, Throwable th) {
            super(str, th);
        }
    }

    public static Reflector on(@NonNull String str) throws ReflectedException {
        return on(str, true, Reflector.class.getClassLoader());
    }

    public static Reflector with(@NonNull Object obj) throws ReflectedException {
        return on(obj.getClass()).bind(obj);
    }

    public Reflector bind(@Nullable Object obj) throws ReflectedException {
        this.mCaller = checked(obj);
        return this;
    }

    public <R> R call(@Nullable Object... objArr) throws ReflectedException {
        return (R) callByCaller(this.mCaller, objArr);
    }

    public <R> R callByCaller(@Nullable Object obj, @Nullable Object... objArr) throws ReflectedException {
        check(obj, this.mMethod, "Method");
        try {
            return (R) this.mMethod.invoke(obj, objArr);
        } catch (InvocationTargetException e10) {
            throw new ReflectedException("Oops!", e10.getTargetException());
        } catch (Throwable th) {
            throw new ReflectedException("Oops!", th);
        }
    }

    public void check(@Nullable Object obj, @Nullable Member member, @NonNull String str) throws ReflectedException {
        if (member == null) {
            throw new ReflectedException(q0.j(str, " was null!"));
        }
        if (obj == null && !Modifier.isStatic(member.getModifiers())) {
            throw new ReflectedException("Need a caller!");
        }
        checked(obj);
    }

    public Object checked(@Nullable Object obj) throws ReflectedException {
        if (obj == null || this.mType.isInstance(obj)) {
            return obj;
        }
        StringBuilder sb2 = new StringBuilder("Caller [");
        sb2.append(obj);
        sb2.append("] is not a instance of type [");
        throw new ReflectedException(u.o(sb2, this.mType, "]!"));
    }

    public Reflector constructor(@Nullable Class<?>... clsArr) throws ReflectedException {
        try {
            Constructor<?> declaredConstructor = this.mType.getDeclaredConstructor(clsArr);
            this.mConstructor = declaredConstructor;
            declaredConstructor.setAccessible(true);
            this.mField = null;
            this.mMethod = null;
            return this;
        } catch (Throwable th) {
            throw new ReflectedException("Oops!", th);
        }
    }

    public Reflector field(@NonNull String str) throws ReflectedException {
        try {
            Field fieldFindField = findField(str);
            this.mField = fieldFindField;
            fieldFindField.setAccessible(true);
            this.mConstructor = null;
            this.mMethod = null;
            return this;
        } catch (Throwable th) {
            throw new ReflectedException("Oops!", th);
        }
    }

    public Field findField(@NonNull String str) throws NoSuchFieldException {
        try {
            return this.mType.getField(str);
        } catch (NoSuchFieldException e10) {
            for (Class<?> superclass = this.mType; superclass != null; superclass = superclass.getSuperclass()) {
                try {
                    return superclass.getDeclaredField(str);
                } catch (NoSuchFieldException unused) {
                }
            }
            throw e10;
        }
    }

    public Method findMethod(@NonNull String str, @Nullable Class<?>... clsArr) throws NoSuchMethodException {
        try {
            return this.mType.getMethod(str, clsArr);
        } catch (NoSuchMethodException e10) {
            for (Class<?> superclass = this.mType; superclass != null; superclass = superclass.getSuperclass()) {
                try {
                    return superclass.getDeclaredMethod(str, clsArr);
                } catch (NoSuchMethodException unused) {
                }
            }
            throw e10;
        }
    }

    public <R> R get() throws ReflectedException {
        return (R) get(this.mCaller);
    }

    public Reflector method(@NonNull String str, @Nullable Class<?>... clsArr) throws ReflectedException {
        try {
            Method methodFindMethod = findMethod(str, clsArr);
            this.mMethod = methodFindMethod;
            methodFindMethod.setAccessible(true);
            this.mConstructor = null;
            this.mField = null;
            return this;
        } catch (NoSuchMethodException e10) {
            throw new ReflectedException("Oops!", e10);
        }
    }

    public <R> R newInstance(@Nullable Object... objArr) throws ReflectedException {
        Constructor constructor = this.mConstructor;
        if (constructor == null) {
            throw new ReflectedException("Constructor was null!");
        }
        try {
            return (R) constructor.newInstance(objArr);
        } catch (InvocationTargetException e10) {
            throw new ReflectedException("Oops!", e10.getTargetException());
        } catch (Throwable th) {
            throw new ReflectedException("Oops!", th);
        }
    }

    public Reflector set(@Nullable Object obj) throws ReflectedException {
        return set(this.mCaller, obj);
    }

    public Reflector unbind() {
        this.mCaller = null;
        return this;
    }

    public static Reflector on(@NonNull String str, boolean z3) throws ReflectedException {
        return on(str, z3, Reflector.class.getClassLoader());
    }

    public <R> R get(@Nullable Object obj) throws ReflectedException {
        check(obj, this.mField, "Field");
        try {
            return (R) this.mField.get(obj);
        } catch (Throwable th) {
            throw new ReflectedException("Oops!", th);
        }
    }

    public Reflector set(@Nullable Object obj, @Nullable Object obj2) throws ReflectedException {
        check(obj, this.mField, "Field");
        try {
            this.mField.set(obj, obj2);
            return this;
        } catch (Throwable th) {
            throw new ReflectedException("Oops!", th);
        }
    }

    public static Reflector on(@NonNull String str, boolean z3, @Nullable ClassLoader classLoader) throws ReflectedException {
        try {
            return on(Class.forName(str, z3, classLoader));
        } catch (Throwable th) {
            throw new ReflectedException("Oops!", th);
        }
    }

    public static Reflector on(@NonNull Class<?> cls) {
        Reflector reflector = new Reflector();
        reflector.mType = cls;
        return reflector;
    }
}
