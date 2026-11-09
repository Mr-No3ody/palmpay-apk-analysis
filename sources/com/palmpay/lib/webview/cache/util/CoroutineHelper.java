package com.palmpay.lib.webview.cache.util;

import Ef.a;
import Ff.h;
import Wf.AbstractC0780y;
import androidx.annotation.Keep;
import androidx.camera.core.impl.utils.executor.g;
import com.google.firebase.messaging.Constants;
import com.google.protobuf.DescriptorProtos;
import com.palmpay.lib.webview.cache.WebCacheConstant;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Job;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p355xf.o;
import p355xf.q;

/* JADX INFO: loaded from: classes3.dex */
@Keep
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\t\n\u0002\u0010\u0003\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J;\u0010\u0004\u001a\u00020\u0005*\u0004\u0018\u00010\u00012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\u001c\u0010\b\u001a\u0018\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\t¢\u0006\u0002\u0010\fJD\u0010\r\u001a\u0002H\u000e\"\u0004\b\u0000\u0010\u000e*\u0004\u0018\u00010\u00012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\u001c\u0010\b\u001a\u0018\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u000e0\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\tH\u0086@¢\u0006\u0002\u0010\u000fJ%\u0010\u0010\u001a\u00020\u000b\"\u0004\b\u0000\u0010\u000e*\b\u0012\u0004\u0012\u0002H\u000e0\n2\u0006\u0010\u0011\u001a\u0002H\u000eH\u0007¢\u0006\u0002\u0010\u0012J \u0010\u0013\u001a\u00020\u000b\"\u0004\b\u0000\u0010\u000e*\b\u0012\u0004\u0012\u0002H\u000e0\n2\u0006\u0010\u0014\u001a\u00020\u0015H\u0007¨\u0006\u0016"}, d2 = {"Lcom/palmpay/lib/webview/cache/util/CoroutineHelper;", "", "<init>", "()V", "launchCoroutine", "Lkotlinx/coroutines/Job;", "scope", "Lkotlinx/coroutines/CoroutineScope;", "block", "Lkotlin/Function1;", "Lkotlin/coroutines/Continuation;", "", "(Ljava/lang/Object;Lkotlinx/coroutines/CoroutineScope;Lkotlin/jvm/functions/Function1;)Lkotlinx/coroutines/Job;", "runOnIo", "T", "(Ljava/lang/Object;Lkotlinx/coroutines/CoroutineScope;Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "onSuccess", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "(Lkotlin/coroutines/Continuation;Ljava/lang/Object;)V", "onFail", "throwable", "", "lib_webview_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nCoroutineHelper.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CoroutineHelper.kt\ncom/palmpay/lib/webview/cache/util/CoroutineHelper\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,53:1\n1#2:54\n*E\n"})
public final class CoroutineHelper {

    @NotNull
    public static final CoroutineHelper INSTANCE = new CoroutineHelper();

    /* JADX INFO: renamed from: com.palmpay.lib.webview.cache.util.CoroutineHelper$launchCoroutine$1, reason: invalid class name */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
    @DebugMetadata(c = "com.palmpay.lib.webview.cache.util.CoroutineHelper$launchCoroutine$1", f = "CoroutineHelper.kt", i = {}, l = {29}, m = "invokeSuspend", n = {}, s = {})
    public static final class AnonymousClass1 extends h implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ Function1<Continuation<? super Unit>, Object> $block;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass1(Function1<? super Continuation<? super Unit>, ? extends Object> function1, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.$block = function1;
        }

        @Override // Ff.a
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass1(this.$block, continuation);
        }

        @Override // Ff.a
        public final Object invokeSuspend(Object obj) {
            a aVar = a.f2423a;
            int i7 = this.label;
            if (i7 == 0) {
                g.M(obj);
                Function1<Continuation<? super Unit>, Object> function1 = this.$block;
                this.label = 1;
                if (function1.invoke(this) == aVar) {
                    return aVar;
                }
            } else {
                if (i7 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                g.M(obj);
            }
            return Unit.f38893a;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.f38893a);
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* JADX INFO: renamed from: com.palmpay.lib.webview.cache.util.CoroutineHelper$runOnIo$2, reason: invalid class name */
    @Metadata(d1 = {"\u0000\b\n\u0002\b\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u0002H\u0001\"\u0004\b\u0000\u0010\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "T", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
    @DebugMetadata(c = "com.palmpay.lib.webview.cache.util.CoroutineHelper$runOnIo$2", f = "CoroutineHelper.kt", i = {}, l = {DescriptorProtos.FileOptions.PHP_GENERIC_SERVICES_FIELD_NUMBER}, m = "invokeSuspend", n = {}, s = {})
    public static final class AnonymousClass2<T> extends h implements Function2<CoroutineScope, Continuation<? super T>, Object> {
        final /* synthetic */ Function1<Continuation<? super T>, Object> $block;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass2(Function1<? super Continuation<? super T>, ? extends Object> function1, Continuation<? super AnonymousClass2> continuation) {
            super(2, continuation);
            this.$block = function1;
        }

        @Override // Ff.a
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass2(this.$block, continuation);
        }

        @Override // Ff.a
        public final Object invokeSuspend(Object obj) {
            a aVar = a.f2423a;
            int i7 = this.label;
            if (i7 != 0) {
                if (i7 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                g.M(obj);
                return obj;
            }
            g.M(obj);
            Function1<Continuation<? super T>, Object> function1 = this.$block;
            this.label = 1;
            Object objInvoke = function1.invoke(this);
            return objInvoke == aVar ? aVar : objInvoke;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super T> continuation) {
            return ((AnonymousClass2) create(coroutineScope, continuation)).invokeSuspend(Unit.f38893a);
        }
    }

    private CoroutineHelper() {
    }

    public static /* synthetic */ Job launchCoroutine$default(CoroutineHelper coroutineHelper, Object obj, CoroutineScope coroutineScope, Function1 function1, int i7, Object obj2) {
        if ((i7 & 1) != 0) {
            coroutineScope = WebCacheConstant.INSTANCE.getApplicationScope$lib_webview_release();
        }
        return coroutineHelper.launchCoroutine(obj, coroutineScope, function1);
    }

    @JvmStatic
    public static final <T> void onFail(@NotNull Continuation<? super T> continuation, @NotNull Throwable throwable) {
        Intrinsics.checkNotNullParameter(continuation, "<this>");
        Intrinsics.checkNotNullParameter(throwable, "throwable");
        o oVar = q.f43977a;
        continuation.resumeWith(g.f(throwable));
    }

    @JvmStatic
    public static final <T> void onSuccess(@NotNull Continuation<? super T> continuation, T t) {
        Intrinsics.checkNotNullParameter(continuation, "<this>");
        o oVar = q.f43977a;
        continuation.resumeWith(t);
    }

    public static /* synthetic */ Object runOnIo$default(CoroutineHelper coroutineHelper, Object obj, CoroutineScope coroutineScope, Function1 function1, Continuation continuation, int i7, Object obj2) {
        if ((i7 & 1) != 0) {
            coroutineScope = null;
        }
        return coroutineHelper.runOnIo(obj, coroutineScope, function1, continuation);
    }

    @NotNull
    public final Job launchCoroutine(@Nullable Object obj, @Nullable CoroutineScope coroutineScope, @NotNull Function1<? super Continuation<? super Unit>, ? extends Object> block) {
        Intrinsics.checkNotNullParameter(block, "block");
        if (coroutineScope == null) {
            coroutineScope = WebCacheConstant.INSTANCE.getApplicationScope$lib_webview_release();
        }
        return AbstractC0780y.m(coroutineScope, null, null, new AnonymousClass1(block, null), 3);
    }

    @Nullable
    public final <T> Object runOnIo(@Nullable Object obj, @Nullable CoroutineScope coroutineScope, @NotNull Function1<? super Continuation<? super T>, ? extends Object> function1, @NotNull Continuation<? super T> continuation) {
        CoroutineContext ioDispatcher$lib_webview_release;
        if (coroutineScope == null || (ioDispatcher$lib_webview_release = coroutineScope.getF17355b().plus(WebCacheConstant.INSTANCE.getIoDispatcher$lib_webview_release())) == null) {
            ioDispatcher$lib_webview_release = WebCacheConstant.INSTANCE.getIoDispatcher$lib_webview_release();
        }
        return AbstractC0780y.s(ioDispatcher$lib_webview_release, new AnonymousClass2(function1, null), continuation);
    }
}
