package com.google.firebase.datastorage;

import Ff.h;
import Wf.AbstractC0777v;
import Wf.AbstractC0780y;
import Wf.I;
import Wf.v0;
import android.content.Context;
import android.os.Process;
import androidx.datastore.core.DataStore;
import com.facebook.react.uimanager.ViewProps;
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.C1849p;
import kotlin.collections.G;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC1855e;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.z;
import kotlin.properties.ReadOnlyProperty;
import kotlin.reflect.KProperty;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.X;
import org.jetbrains.annotations.NotNull;
import p015ag.c;
import p042cg.f;
import p135j0.C1767a;
import p164l0.d;
import p178m0.l;
import p178m0.m;
import p193n0.b;
import p193n0.e;
import p193n0.g;
import p193n0.j;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J)\u0010\f\u001a\u00028\u0000\"\u0004\b\u0000\u0010\b2\f\u0010\n\u001a\b\u0012\u0004\u0012\u00028\u00000\t2\u0006\u0010\u000b\u001a\u00028\u0000¢\u0006\u0004\b\f\u0010\rJ!\u0010\u000f\u001a\u00020\u000e\"\u0004\b\u0000\u0010\b2\f\u0010\n\u001a\b\u0012\u0004\u0012\u00028\u00000\t¢\u0006\u0004\b\u000f\u0010\u0010J)\u0010\u0013\u001a\u00020\u0012\"\u0004\b\u0000\u0010\b2\f\u0010\n\u001a\b\u0012\u0004\u0012\u00028\u00000\t2\u0006\u0010\u0011\u001a\u00028\u0000¢\u0006\u0004\b\u0013\u0010\u0014J\u001d\u0010\u0016\u001a\u0012\u0012\b\u0012\u0006\u0012\u0002\b\u00030\t\u0012\u0004\u0012\u00020\u00010\u0015¢\u0006\u0004\b\u0016\u0010\u0017J!\u0010\u001c\u001a\u00020\u00122\u0012\u0010\u001b\u001a\u000e\u0012\u0004\u0012\u00020\u0019\u0012\u0004\u0012\u00020\u001a0\u0018¢\u0006\u0004\b\u001c\u0010\u001dR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u001e\u001a\u0004\b\u001f\u0010 R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010!\u001a\u0004\b\"\u0010#R\u001a\u0010%\u001a\b\u0012\u0004\u0012\u00020\u000e0$8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u0010&R%\u0010,\u001a\b\u0012\u0004\u0012\u00020\u00120'*\u00020\u00028BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b(\u0010)\u001a\u0004\b*\u0010+R\u001a\u0010,\u001a\b\u0012\u0004\u0012\u00020\u00120'8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b,\u0010-¨\u0006."}, d2 = {"Lcom/google/firebase/datastorage/JavaDataStorage;", "", "Landroid/content/Context;", "context", "", "name", "<init>", "(Landroid/content/Context;Ljava/lang/String;)V", "T", "Ln0/e;", "key", "defaultValue", "getSync", "(Ln0/e;Ljava/lang/Object;)Ljava/lang/Object;", "", "contains", "(Ln0/e;)Z", "value", "Ln0/g;", "putSync", "(Ln0/e;Ljava/lang/Object;)Ln0/g;", "", "getAllSync", "()Ljava/util/Map;", "Lkotlin/Function1;", "Ln0/b;", "", ViewProps.TRANSFORM, "editSync", "(Lkotlin/jvm/functions/Function1;)Ln0/g;", "Landroid/content/Context;", "getContext", "()Landroid/content/Context;", "Ljava/lang/String;", "getName", "()Ljava/lang/String;", "Ljava/lang/ThreadLocal;", "editLock", "Ljava/lang/ThreadLocal;", "Landroidx/datastore/core/DataStore;", "dataStore$delegate", "Lkotlin/properties/ReadOnlyProperty;", "getDataStore", "(Landroid/content/Context;)Landroidx/datastore/core/DataStore;", "dataStore", "Landroidx/datastore/core/DataStore;", "com.google.firebase-firebase-common"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class JavaDataStorage {
    static final /* synthetic */ KProperty<Object>[] $$delegatedProperties;

    @NotNull
    private final Context context;

    @NotNull
    private final DataStore<g> dataStore;

    /* JADX INFO: renamed from: dataStore$delegate, reason: from kotlin metadata */
    @NotNull
    private final ReadOnlyProperty dataStore;

    @NotNull
    private final ThreadLocal<Boolean> editLock;

    @NotNull
    private final String name;

    /* JADX INFO: renamed from: com.google.firebase.datastorage.JavaDataStorage$contains$1, reason: invalid class name */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u000b\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.google.firebase.datastorage.JavaDataStorage$contains$1", f = "JavaDataStorage.kt", i = {}, l = {124}, m = "invokeSuspend", n = {}, s = {})
    public static final class AnonymousClass1 extends h implements Function2<CoroutineScope, Continuation<? super Boolean>, Object> {
        final /* synthetic */ e $key;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(e eVar, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.$key = eVar;
        }

        @Override // Ff.a
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return JavaDataStorage.this.new AnonymousClass1(this.$key, continuation);
        }

        @Override // Ff.a
        public final Object invokeSuspend(Object obj) {
            boolean zContainsKey;
            Ef.a aVar = Ef.a.f2423a;
            int i7 = this.label;
            if (i7 == 0) {
                androidx.camera.core.impl.utils.executor.g.M(obj);
                Flow data = JavaDataStorage.this.dataStore.getData();
                this.label = 1;
                obj = X.m(data, this);
                if (obj == aVar) {
                    return aVar;
                }
            } else {
                if (i7 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                androidx.camera.core.impl.utils.executor.g.M(obj);
            }
            g gVar = (g) obj;
            if (gVar != null) {
                e key = this.$key;
                Intrinsics.checkNotNullParameter(key, "key");
                zContainsKey = ((b) gVar).f39807a.containsKey(key);
            } else {
                zContainsKey = false;
            }
            return Boolean.valueOf(zContainsKey);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Boolean> continuation) {
            return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.f38893a);
        }
    }

    /* JADX INFO: renamed from: com.google.firebase.datastorage.JavaDataStorage$editSync$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "Ln0/g;", "<anonymous>", "(Lkotlinx/coroutines/CoroutineScope;)Ln0/g;"}, k = 3, mv = {2, 0, 0})
    @DebugMetadata(c = "com.google.firebase.datastorage.JavaDataStorage$editSync$1", f = "JavaDataStorage.kt", i = {}, l = {220}, m = "invokeSuspend", n = {}, s = {})
    public static final class C13951 extends h implements Function2<CoroutineScope, Continuation<? super g>, Object> {
        final /* synthetic */ Function1<b, Unit> $transform;
        int label;

        /* JADX INFO: renamed from: com.google.firebase.datastorage.JavaDataStorage$editSync$1$1, reason: invalid class name and collision with other inner class name */
        @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Ln0/b;", "it", "", "<anonymous>", "(Ln0/b;)V"}, k = 3, mv = {2, 0, 0})
        @DebugMetadata(c = "com.google.firebase.datastorage.JavaDataStorage$editSync$1$1", f = "JavaDataStorage.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        public static final class C00381 extends h implements Function2<b, Continuation<? super Unit>, Object> {
            final /* synthetic */ Function1<b, Unit> $transform;
            /* synthetic */ Object L$0;
            int label;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public C00381(Function1<? super b, Unit> function1, Continuation<? super C00381> continuation) {
                super(2, continuation);
                this.$transform = function1;
            }

            @Override // Ff.a
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                C00381 c00381 = new C00381(this.$transform, continuation);
                c00381.L$0 = obj;
                return c00381;
            }

            @Override // Ff.a
            public final Object invokeSuspend(Object obj) {
                Ef.a aVar = Ef.a.f2423a;
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                androidx.camera.core.impl.utils.executor.g.M(obj);
                this.$transform.invoke((b) this.L$0);
                return Unit.f38893a;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(b bVar, Continuation<? super Unit> continuation) {
                return ((C00381) create(bVar, continuation)).invokeSuspend(Unit.f38893a);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C13951(Function1<? super b, Unit> function1, Continuation<? super C13951> continuation) {
            super(2, continuation);
            this.$transform = function1;
        }

        @Override // Ff.a
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return JavaDataStorage.this.new C13951(this.$transform, continuation);
        }

        @Override // Ff.a
        public final Object invokeSuspend(Object obj) {
            Ef.a aVar = Ef.a.f2423a;
            int i7 = this.label;
            try {
                if (i7 == 0) {
                    androidx.camera.core.impl.utils.executor.g.M(obj);
                    Object obj2 = JavaDataStorage.this.editLock.get();
                    Boolean bool = Boolean.TRUE;
                    if (Intrinsics.c(obj2, bool)) {
                        throw new IllegalStateException("Don't call JavaDataStorage.edit() from within an existing edit() callback.\nThis causes deadlocks, and is generally indicative of a code smell.\nInstead, either pass around the initial `MutablePreferences` instance, or don't do everything in a single callback. ");
                    }
                    JavaDataStorage.this.editLock.set(bool);
                    DataStore dataStore = JavaDataStorage.this.dataStore;
                    C00381 c00381 = new C00381(this.$transform, null);
                    this.label = 1;
                    obj = dataStore.updateData(new j(c00381, null), this);
                    if (obj == aVar) {
                        return aVar;
                    }
                } else {
                    if (i7 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    androidx.camera.core.impl.utils.executor.g.M(obj);
                }
                g gVar = (g) obj;
                JavaDataStorage.this.editLock.set(Boolean.FALSE);
                return gVar;
            } catch (Throwable th) {
                JavaDataStorage.this.editLock.set(Boolean.FALSE);
                throw th;
            }
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super g> continuation) {
            return ((C13951) create(coroutineScope, continuation)).invokeSuspend(Unit.f38893a);
        }
    }

    /* JADX INFO: renamed from: com.google.firebase.datastorage.JavaDataStorage$getAllSync$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0004\u001a\u0012\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0002\u0012\u0004\u0012\u00020\u00030\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "Ln0/e;", "", "<anonymous>", "(Lkotlinx/coroutines/CoroutineScope;)Ljava/util/Map;"}, k = 3, mv = {2, 0, 0})
    @DebugMetadata(c = "com.google.firebase.datastorage.JavaDataStorage$getAllSync$1", f = "JavaDataStorage.kt", i = {}, l = {170}, m = "invokeSuspend", n = {}, s = {})
    public static final class C13961 extends h implements Function2<CoroutineScope, Continuation<? super Map<e, ? extends Object>>, Object> {
        int label;

        public C13961(Continuation<? super C13961> continuation) {
            super(2, continuation);
        }

        @Override // Ff.a
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return JavaDataStorage.this.new C13961(continuation);
        }

        @Override // Ff.a
        public final Object invokeSuspend(Object obj) {
            Map mapA;
            Ef.a aVar = Ef.a.f2423a;
            int i7 = this.label;
            if (i7 == 0) {
                androidx.camera.core.impl.utils.executor.g.M(obj);
                Flow data = JavaDataStorage.this.dataStore.getData();
                this.label = 1;
                obj = X.m(data, this);
                if (obj == aVar) {
                    return aVar;
                }
            } else {
                if (i7 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                androidx.camera.core.impl.utils.executor.g.M(obj);
            }
            g gVar = (g) obj;
            return (gVar == null || (mapA = gVar.a()) == null) ? G.c() : mapA;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Map<e, ? extends Object>> continuation) {
            return ((C13961) create(coroutineScope, continuation)).invokeSuspend(Unit.f38893a);
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* JADX INFO: renamed from: com.google.firebase.datastorage.JavaDataStorage$getSync$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\b\n\u0002\b\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u0002H\u0001\"\u0004\b\u0000\u0010\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "T", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.google.firebase.datastorage.JavaDataStorage$getSync$1", f = "JavaDataStorage.kt", i = {}, l = {104}, m = "invokeSuspend", n = {}, s = {})
    public static final class C13971<T> extends h implements Function2<CoroutineScope, Continuation<? super T>, Object> {
        final /* synthetic */ T $defaultValue;
        final /* synthetic */ e $key;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C13971(e eVar, T t, Continuation<? super C13971> continuation) {
            super(2, continuation);
            this.$key = eVar;
            this.$defaultValue = t;
        }

        @Override // Ff.a
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return JavaDataStorage.this.new C13971(this.$key, this.$defaultValue, continuation);
        }

        @Override // Ff.a
        public final Object invokeSuspend(Object obj) {
            Ef.a aVar = Ef.a.f2423a;
            int i7 = this.label;
            if (i7 == 0) {
                androidx.camera.core.impl.utils.executor.g.M(obj);
                Flow<T> data = JavaDataStorage.this.dataStore.getData();
                this.label = 1;
                obj = X.m(data, this);
                if (obj == aVar) {
                    return aVar;
                }
            } else {
                if (i7 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                androidx.camera.core.impl.utils.executor.g.M(obj);
            }
            g gVar = (g) obj;
            if (gVar != null) {
                e key = this.$key;
                Intrinsics.checkNotNullParameter(key, "key");
                Object objCopyOf = ((b) gVar).f39807a.get(key);
                if (objCopyOf instanceof byte[]) {
                    byte[] bArr = (byte[]) objCopyOf;
                    objCopyOf = Arrays.copyOf(bArr, bArr.length);
                    Intrinsics.checkNotNullExpressionValue(objCopyOf, "copyOf(this, size)");
                }
                if (objCopyOf != null) {
                    return objCopyOf;
                }
            }
            return this.$defaultValue;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super T> continuation) {
            return ((C13971) create(coroutineScope, continuation)).invokeSuspend(Unit.f38893a);
        }
    }

    /* JADX INFO: renamed from: com.google.firebase.datastorage.JavaDataStorage$putSync$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "Ln0/g;", "<anonymous>", "(Lkotlinx/coroutines/CoroutineScope;)Ln0/g;"}, k = 3, mv = {2, 0, 0})
    @DebugMetadata(c = "com.google.firebase.datastorage.JavaDataStorage$putSync$1", f = "JavaDataStorage.kt", i = {}, l = {145}, m = "invokeSuspend", n = {}, s = {})
    public static final class C13981 extends h implements Function2<CoroutineScope, Continuation<? super g>, Object> {
        final /* synthetic */ e $key;
        final /* synthetic */ T $value;
        int label;

        /* JADX INFO: renamed from: com.google.firebase.datastorage.JavaDataStorage$putSync$1$1, reason: invalid class name and collision with other inner class name */
        @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Ln0/b;", "it", "", "<anonymous>", "(Ln0/b;)V"}, k = 3, mv = {2, 0, 0})
        @DebugMetadata(c = "com.google.firebase.datastorage.JavaDataStorage$putSync$1$1", f = "JavaDataStorage.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        public static final class C00391 extends h implements Function2<b, Continuation<? super Unit>, Object> {
            final /* synthetic */ e $key;
            final /* synthetic */ T $value;
            /* synthetic */ Object L$0;
            int label;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C00391(e eVar, T t, Continuation<? super C00391> continuation) {
                super(2, continuation);
                this.$key = eVar;
                this.$value = t;
            }

            @Override // Ff.a
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                C00391 c00391 = new C00391(this.$key, this.$value, continuation);
                c00391.L$0 = obj;
                return c00391;
            }

            @Override // Ff.a
            public final Object invokeSuspend(Object obj) {
                Ef.a aVar = Ef.a.f2423a;
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                androidx.camera.core.impl.utils.executor.g.M(obj);
                ((b) this.L$0).d(this.$key, this.$value);
                return Unit.f38893a;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(b bVar, Continuation<? super Unit> continuation) {
                return ((C00391) create(bVar, continuation)).invokeSuspend(Unit.f38893a);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C13981(e eVar, T t, Continuation<? super C13981> continuation) {
            super(2, continuation);
            this.$key = eVar;
            this.$value = t;
        }

        @Override // Ff.a
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return JavaDataStorage.this.new C13981(this.$key, this.$value, continuation);
        }

        @Override // Ff.a
        public final Object invokeSuspend(Object obj) {
            Ef.a aVar = Ef.a.f2423a;
            int i7 = this.label;
            if (i7 != 0) {
                if (i7 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                androidx.camera.core.impl.utils.executor.g.M(obj);
                return obj;
            }
            androidx.camera.core.impl.utils.executor.g.M(obj);
            DataStore dataStore = JavaDataStorage.this.dataStore;
            C00391 c00391 = new C00391(this.$key, this.$value, null);
            this.label = 1;
            Object objUpdateData = dataStore.updateData(new j(c00391, null), this);
            return objUpdateData == aVar ? aVar : objUpdateData;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super g> continuation) {
            return ((C13981) create(coroutineScope, continuation)).invokeSuspend(Unit.f38893a);
        }
    }

    static {
        z zVar = new z(AbstractC1855e.NO_RECEIVER, JavaDataStorage.class, "dataStore", "getDataStore(Landroid/content/Context;)Landroidx/datastore/core/DataStore;", 0);
        kotlin.jvm.internal.G.f38952a.getClass();
        $$delegatedProperties = new KProperty[]{zVar};
    }

    public JavaDataStorage(@NotNull Context context, @NotNull String name) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(name, "name");
        this.context = context;
        this.name = name;
        this.editLock = new ThreadLocal<>();
        final int i7 = 0;
        p149k0.a aVar = new p149k0.a(new Function1(this) { // from class: com.google.firebase.datastorage.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ JavaDataStorage f22976b;

            {
                this.f22976b = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                switch (i7) {
                    case 0:
                        return JavaDataStorage.dataStore_delegate$lambda$0(this.f22976b, (C1767a) obj);
                    default:
                        return JavaDataStorage.dataStore_delegate$lambda$1(this.f22976b, (Context) obj);
                }
            }
        });
        final int i10 = 1;
        Function1 produceMigrations = new Function1(this) { // from class: com.google.firebase.datastorage.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ JavaDataStorage f22976b;

            {
                this.f22976b = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                switch (i10) {
                    case 0:
                        return JavaDataStorage.dataStore_delegate$lambda$0(this.f22976b, (C1767a) obj);
                    default:
                        return JavaDataStorage.dataStore_delegate$lambda$1(this.f22976b, (Context) obj);
                }
            }
        };
        f fVar = I.f10809a;
        p042cg.e eVar = p042cg.e.f19009c;
        v0 v0VarC = AbstractC0780y.c();
        eVar.getClass();
        c scope = AbstractC0777v.a(kotlin.coroutines.e.c(eVar, v0VarC));
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(produceMigrations, "produceMigrations");
        Intrinsics.checkNotNullParameter(scope, "scope");
        this.dataStore = new p178m0.a(name, aVar, produceMigrations, scope);
        this.dataStore = getDataStore(context);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final g dataStore_delegate$lambda$0(JavaDataStorage javaDataStorage, C1767a ex) {
        Intrinsics.checkNotNullParameter(ex, "ex");
        kotlin.jvm.internal.G.a(JavaDataStorage.class).getSimpleName();
        String str = javaDataStorage.name;
        Process.myPid();
        return new b(true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List dataStore_delegate$lambda$1(JavaDataStorage javaDataStorage, Context context) {
        Intrinsics.checkNotNullParameter(context, "it");
        String sharedPreferencesName = javaDataStorage.name;
        LinkedHashSet keysToMigrate = m.f39430a;
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(sharedPreferencesName, "sharedPreferencesName");
        Intrinsics.checkNotNullParameter(keysToMigrate, "keysToMigrate");
        return C1849p.c(new p164l0.c(context, sharedPreferencesName, d.f39260a, new l(keysToMigrate, null), new Ma.l(3, (Continuation) null)));
    }

    private final DataStore<g> getDataStore(Context context) {
        return (DataStore) this.dataStore.getValue(context, $$delegatedProperties[0]);
    }

    public final <T> boolean contains(@NotNull e key) {
        Intrinsics.checkNotNullParameter(key, "key");
        return ((Boolean) AbstractC0780y.p(new AnonymousClass1(key, null))).booleanValue();
    }

    @NotNull
    public final g editSync(@NotNull Function1<? super b, Unit> transform) {
        Intrinsics.checkNotNullParameter(transform, "transform");
        return (g) AbstractC0780y.p(new C13951(transform, null));
    }

    @NotNull
    public final Map<e, Object> getAllSync() {
        return (Map) AbstractC0780y.p(new C13961(null));
    }

    @NotNull
    public final Context getContext() {
        return this.context;
    }

    @NotNull
    public final String getName() {
        return this.name;
    }

    public final <T> T getSync(@NotNull e key, T defaultValue) {
        Intrinsics.checkNotNullParameter(key, "key");
        return (T) AbstractC0780y.p(new C13971(key, defaultValue, null));
    }

    @NotNull
    public final <T> g putSync(@NotNull e key, T value) {
        Intrinsics.checkNotNullParameter(key, "key");
        return (g) AbstractC0780y.p(new C13981(key, value, null));
    }
}
